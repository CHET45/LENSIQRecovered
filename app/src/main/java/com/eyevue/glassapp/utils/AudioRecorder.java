package com.eyevue.glassapp.utils;

import android.media.AudioRecord;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class AudioRecorder {
    private static final int AUDIO_CHANNEL = 16;
    private static final int AUDIO_ENCODING = 2;
    private static final int AUDIO_INPUT = 1;
    private static final int AUDIO_SAMPLE_RATE = 16000;
    private final String TAG;
    private AudioRecord audioRecord;
    private int bufferSizeInBytes;
    private final List<String> filesName;
    private Status status;

    public static class AudioRecorderHolder {
        private static final AudioRecorder instance = new AudioRecorder();

        private AudioRecorderHolder() {
        }
    }

    public interface RecordStreamListener {
        void recordOfByte(byte[] data, int begin, int end);
    }

    public enum Status {
        STATUS_NO_READY,
        STATUS_READY,
        STATUS_START,
        STATUS_PAUSE,
        STATUS_STOP
    }

    public static AudioRecorder getInstance() {
        return AudioRecorderHolder.instance;
    }

    private byte[] normalizeAndConvertBuffer(float[] buffer) {
        if (buffer == null || buffer.length == 0) {
            return new byte[0];
        }
        int length = buffer.length;
        float[] fArr = new float[length];
        System.arraycopy(buffer, 0, fArr, 0, buffer.length);
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float fAbs = Math.abs(fArr[i]);
            if (fAbs > f) {
                f = fAbs;
            }
        }
        if (f > 1.0f) {
            float f2 = 1.0f / f;
            for (int i2 = 0; i2 < length; i2++) {
                fArr[i2] = fArr[i2] * f2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length * 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asFloatBuffer().put(fArr);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$0(RecordStreamListener listener) {
        int i = this.bufferSizeInBytes;
        byte[] bArr = new byte[i];
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            try {
                if (-3 != this.audioRecord.read(bArr, 0, this.bufferSizeInBytes) && listener != null) {
                    listener.recordOfByte(bArr, 0, i);
                }
            } catch (Exception unused) {
                C2473f.m4168e("AudioRecorder", "audioRecord.read error");
            }
        }
    }

    public void cancel() {
        this.filesName.clear();
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    @igg({"MissingPermission"})
    public void createAudio(int audioSource, int sampleRateInHz, int channelConfig, int audioFormat) {
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(sampleRateInHz, channelConfig, channelConfig);
        this.audioRecord = new AudioRecord(audioSource, sampleRateInHz, channelConfig, audioFormat, this.bufferSizeInBytes);
    }

    @igg({"MissingPermission"})
    public void createDefaultAudio() {
        C2473f.m4167d("AudioRecorder", "bufferSizeInBytes = " + this.bufferSizeInBytes);
        this.audioRecord = new AudioRecord(1, 16000, 16, 2, this.bufferSizeInBytes);
        this.status = Status.STATUS_READY;
    }

    public int getPcmFilesCount() {
        return this.filesName.size();
    }

    public Status getStatus() {
        return this.status;
    }

    public void pauseRecord() {
        C2473f.m4167d("AudioRecorder", "===pauseRecord===");
        if (this.status != Status.STATUS_START) {
            throw new IllegalStateException("没有在录音");
        }
        this.audioRecord.stop();
        this.status = Status.STATUS_PAUSE;
    }

    public void release() {
        C2473f.m4167d("AudioRecorder", "===release===");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    public void startRecord(final RecordStreamListener listener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (status == Status.STATUS_START) {
            C2473f.m4168e("AudioRecorder", "正在录音");
            return;
        }
        C2473f.m4167d("AudioRecorder", "===startRecord===" + this.audioRecord.getState());
        try {
            this.audioRecord.startRecording();
            C2478k.getCachedPool().execute(new Runnable() { // from class: of0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67481a.lambda$startRecord$0(listener);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void stopRecord() {
        Log.i("AudioRecorder", "===stopRecord===");
        Status status = this.status;
        if (status == Status.STATUS_NO_READY || status == Status.STATUS_READY) {
            Log.i("AudioRecorder", "录音尚未开始");
            return;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.status = Status.STATUS_STOP;
    }

    private AudioRecorder() {
        this.TAG = "AudioRecorder";
        this.bufferSizeInBytes = 1024;
        this.status = Status.STATUS_NO_READY;
        this.filesName = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$1(String voicePath, RecordStreamListener listener) {
        FileOutputStream fileOutputStream;
        int i = this.bufferSizeInBytes;
        byte[] bArr = new byte[i];
        if (TextUtils.isEmpty(voicePath)) {
            fileOutputStream = null;
        } else {
            try {
                fileOutputStream = new FileOutputStream(new File(voicePath), true);
            } catch (FileNotFoundException e) {
                C2473f.m4168e("AudioRecorder", e.getMessage());
                fileOutputStream = null;
            } catch (IllegalStateException e2) {
                C2473f.m4168e("AudioRecorder", e2.getMessage());
                throw new IllegalStateException(e2.getMessage());
            }
        }
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            try {
                if (-3 != this.audioRecord.read(bArr, 0, this.bufferSizeInBytes, 0)) {
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArr);
                    }
                    if (listener != null) {
                        listener.recordOfByte(bArr, 0, i);
                    }
                }
            } catch (Exception unused) {
                C2473f.m4168e("AudioRecorder", "audioRecord.read error");
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                C2473f.m4168e("AudioRecorder", e3.getMessage());
            }
        }
    }

    public void startRecord(final String voicePath, final RecordStreamListener listener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            C2473f.m4168e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (status == Status.STATUS_START) {
            C2473f.m4168e("ltttt", "正在录音");
            return;
        }
        C2473f.m4167d("AudioRecorder", "===startRecord===" + this.audioRecord.getState());
        try {
            this.audioRecord.startRecording();
            C2478k.getCachedPool().execute(new Runnable() { // from class: sf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81640a.lambda$startRecord$1(voicePath, listener);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
