package com.watchfun.transcommon.manager;

import android.media.AudioRecord;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import p000.igg;
import p000.ryg;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class AudioRecorder {
    private static final int AUDIO_CHANNEL = 16;
    private static final int AUDIO_ENCODING = 2;
    private static final int AUDIO_INPUT = 1;
    private static final int AUDIO_SAMPLE_RATE = 44100;
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
        void recordOfByte(byte[] bArr, int i, int i2);
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

    private byte[] normalizeAndConvertBuffer(float[] fArr) {
        if (fArr == null || fArr.length == 0) {
            return new byte[0];
        }
        int length = fArr.length;
        float[] fArr2 = new float[length];
        System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            float fAbs = Math.abs(fArr2[i]);
            if (fAbs > f) {
                f = fAbs;
            }
        }
        if (f > 1.0f) {
            float f2 = 1.0f / f;
            for (int i2 = 0; i2 < length; i2++) {
                fArr2[i2] = fArr2[i2] * f2;
            }
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(length * 4);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        byteBufferAllocate.asFloatBuffer().put(fArr2);
        return byteBufferAllocate.array();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: readAudioData, reason: merged with bridge method [inline-methods] */
    public void lambda$startRecord$0(RecordStreamListener recordStreamListener) {
        int i = this.bufferSizeInBytes;
        byte[] bArr = new byte[i];
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            try {
                if (-3 != this.audioRecord.read(bArr, 0, this.bufferSizeInBytes) && recordStreamListener != null) {
                    recordStreamListener.recordOfByte(bArr, 0, i);
                }
            } catch (Exception unused) {
                yi9.m26092e("AudioRecorder", "audioRecord.read error");
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
    public void createAudio(int i, int i2, int i3, int i4) {
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i2, i3, i3);
        this.audioRecord = new AudioRecord(i, i2, i3, i4, this.bufferSizeInBytes);
    }

    @igg({"MissingPermission"})
    public void createDefaultAudio() {
        yi9.m26090d("AudioRecorder", "bufferSizeInBytes = " + this.bufferSizeInBytes);
        this.audioRecord = new AudioRecord(1, 44100, 16, 2, this.bufferSizeInBytes);
        this.status = Status.STATUS_READY;
    }

    public int getPcmFilesCount() {
        return this.filesName.size();
    }

    public Status getStatus() {
        return this.status;
    }

    public void pauseRecord() {
        yi9.m26090d("AudioRecorder", "===pauseRecord===");
        if (this.status != Status.STATUS_START) {
            throw new IllegalStateException("没有在录音");
        }
        this.audioRecord.stop();
        this.status = Status.STATUS_PAUSE;
    }

    public void release() {
        yi9.m26090d("AudioRecorder", "===release===");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    public void startRecord(final RecordStreamListener recordStreamListener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                yi9.m26092e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            yi9.m26092e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (status == Status.STATUS_START) {
            yi9.m26092e("AudioRecorder", "正在录音");
            return;
        }
        yi9.m26090d("AudioRecorder", "===startRecord===" + this.audioRecord.getState());
        try {
            this.audioRecord.startRecording();
            ryg.postOnBackgroundThread(new Runnable() { // from class: mf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60870a.lambda$startRecord$0(recordStreamListener);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void stopRecord() {
        yi9.m26090d("AudioRecorder", "===stopRecord===");
        Status status = this.status;
        if (status == Status.STATUS_NO_READY || status == Status.STATUS_READY) {
            yi9.m26092e("AudioRecorder", "录音尚未开始");
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
    public void lambda$startRecord$1(String str, RecordStreamListener recordStreamListener) {
        FileOutputStream fileOutputStream;
        int i = this.bufferSizeInBytes;
        byte[] bArr = new byte[i];
        if (TextUtils.isEmpty(str)) {
            fileOutputStream = null;
        } else {
            try {
                fileOutputStream = new FileOutputStream(new File(str), true);
            } catch (FileNotFoundException e) {
                yi9.m26092e("AudioRecorder", e.getMessage());
                fileOutputStream = null;
            } catch (IllegalStateException e2) {
                yi9.m26092e("AudioRecorder", e2.getMessage());
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
                    if (recordStreamListener != null) {
                        recordStreamListener.recordOfByte(bArr, 0, i);
                    }
                }
            } catch (Exception unused) {
                yi9.m26092e("AudioRecorder", "audioRecord.read error");
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e3) {
                yi9.m26092e("AudioRecorder", e3.getMessage());
            }
        }
    }

    public void startRecord(final String str, final RecordStreamListener recordStreamListener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                yi9.m26092e("AudioRecorder", "录音器未初始化");
                createDefaultAudio();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            yi9.m26092e("AudioRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
            return;
        }
        if (status == Status.STATUS_START) {
            yi9.m26092e("AudioRecorder", "正在录音");
            return;
        }
        yi9.m26090d("AudioRecorder", "===startRecord===" + this.audioRecord.getState());
        try {
            this.audioRecord.startRecording();
            ryg.postOnBackgroundThread(new Runnable() { // from class: qf0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74269a.lambda$startRecord$1(str, recordStreamListener);
                }
            });
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
