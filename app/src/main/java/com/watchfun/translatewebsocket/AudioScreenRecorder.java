package com.watchfun.translatewebsocket;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;
import android.os.Build;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p000.xg0;
import p000.yg0;

/* JADX INFO: loaded from: classes7.dex */
public class AudioScreenRecorder {
    private static final int AUDIO_CHANNEL = 16;
    private static final int AUDIO_ENCODING = 2;
    private static final int AUDIO_SAMPLE_RATE = 44100;
    private final String TAG;
    private AudioRecord audioRecord;
    private int bufferSizeInBytes;
    private final List<String> filesName;
    private MediaProjection mediaProjection;
    private Status status;

    public static class AudioRecorderHolder {
        private static final AudioScreenRecorder instance = new AudioScreenRecorder();

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
        STATUS_STOP
    }

    public static AudioScreenRecorder getInstance() {
        return AudioRecorderHolder.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$0(RecordStreamListener recordStreamListener) {
        byte[] bArr = new byte[this.bufferSizeInBytes];
        while (this.status == Status.STATUS_START) {
            int i = this.audioRecord.read(bArr, 0, this.bufferSizeInBytes);
            if (i > 0 && recordStreamListener != null) {
                recordStreamListener.recordOfByte(bArr, 0, i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$1(String str, RecordStreamListener recordStreamListener) {
        try {
            try {
                fileOutputStream = TextUtils.isEmpty(str) ? null : new FileOutputStream(new File(str));
                byte[] bArr = new byte[this.bufferSizeInBytes];
                while (this.status == Status.STATUS_START) {
                    int i = this.audioRecord.read(bArr, 0, this.bufferSizeInBytes);
                    if (i > 0) {
                        if (fileOutputStream != null) {
                            fileOutputStream.write(bArr, 0, i);
                        }
                        if (recordStreamListener != null) {
                            recordStreamListener.recordOfByte(bArr, 0, i);
                        }
                    }
                }
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        C2473f.m4168e("AudioScreenRecorder", "关闭文件流出错", e);
                    }
                }
            } catch (Exception e2) {
                C2473f.m4168e("AudioScreenRecorder", "录音过程中出错", e2);
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        C2473f.m4168e("AudioScreenRecorder", "关闭文件流出错", e3);
                    }
                }
            }
        } catch (Throwable th) {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e4) {
                    C2473f.m4168e("AudioScreenRecorder", "关闭文件流出错", e4);
                }
            }
            throw th;
        }
    }

    public void cancel() {
        this.filesName.clear();
        release();
    }

    public void createAudioRecorder() {
        AudioPlaybackCaptureConfiguration audioPlaybackCaptureConfigurationBuild;
        if (this.mediaProjection == null) {
            C2473f.m4168e("AudioScreenRecorder", "MediaProjection未初始化");
            this.status = Status.STATUS_NO_READY;
            return;
        }
        C2473f.m4167d("AudioScreenRecorder", "MediaProjection初始化");
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(44100, 16, 2);
        if (Build.VERSION.SDK_INT >= 29) {
            yg0.m25895a();
            audioPlaybackCaptureConfigurationBuild = xg0.m25119a(this.mediaProjection).addMatchingUsage(1).addMatchingUsage(14).addMatchingUsage(0).build();
        } else {
            audioPlaybackCaptureConfigurationBuild = null;
        }
        try {
            AudioRecord audioRecordBuild = new AudioRecord.Builder().setAudioPlaybackCaptureConfig(audioPlaybackCaptureConfigurationBuild).setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(44100).setChannelMask(16).build()).setBufferSizeInBytes(this.bufferSizeInBytes).build();
            this.audioRecord = audioRecordBuild;
            if (audioRecordBuild.getState() != 1) {
                throw new IllegalStateException("音频录制器初始化失败");
            }
            this.status = Status.STATUS_READY;
            C2473f.m4168e("AudioScreenRecorder", "status=" + this.status);
        } catch (Exception e) {
            C2473f.m4168e("AudioScreenRecorder", "创建AudioRecord失败", e);
            this.status = Status.STATUS_NO_READY;
        }
    }

    public Status getStatus() {
        return this.status;
    }

    public void release() {
        stopRecord();
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    public void setMediaProjection(MediaProjection mediaProjection) {
        this.mediaProjection = mediaProjection;
    }

    public void startRecord(final RecordStreamListener recordStreamListener) {
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            C2473f.m4168e("AudioScreenRecorder", "录音尚未初始化");
            return;
        }
        Status status2 = Status.STATUS_START;
        if (status == status2) {
            C2473f.m4168e("AudioScreenRecorder", "正在录音中");
            return;
        }
        try {
            if (status == Status.STATUS_STOP) {
                C2473f.m4173i("AudioScreenRecorder", "startRecord status =" + this.status);
                createAudioRecorder();
            }
            this.audioRecord.startRecording();
            this.status = status2;
            C2478k.getCachedPool().execute(new Runnable() { // from class: ah0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f1600a.lambda$startRecord$0(recordStreamListener);
                }
            });
        } catch (Exception e) {
            C2473f.m4168e("AudioScreenRecorder", "启动录音失败", e);
        }
    }

    public void stopRecord() {
        if (this.status != Status.STATUS_START) {
            C2473f.m4173i("AudioScreenRecorder", "没有正在进行的录音");
            return;
        }
        this.status = Status.STATUS_STOP;
        try {
            this.audioRecord.stop();
        } catch (Exception e) {
            C2473f.m4168e("AudioScreenRecorder", "停止录音失败", e);
        }
    }

    private AudioScreenRecorder() {
        this.TAG = "AudioScreenRecorder";
        this.status = Status.STATUS_NO_READY;
        this.filesName = new ArrayList();
    }

    public void startRecord(final String str, final RecordStreamListener recordStreamListener) {
        Status status = this.status;
        if (status == Status.STATUS_NO_READY) {
            C2473f.m4168e("AudioScreenRecorder", "录音尚未初始化");
            return;
        }
        Status status2 = Status.STATUS_START;
        if (status == status2) {
            C2473f.m4168e("AudioScreenRecorder", "正在录音中");
            return;
        }
        try {
            this.audioRecord.startRecording();
            this.status = status2;
            C2478k.getCachedPool().execute(new Runnable() { // from class: zg0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105033a.lambda$startRecord$1(str, recordStreamListener);
                }
            });
        } catch (Exception e) {
            C2473f.m4168e("AudioScreenRecorder", "启动录音失败", e);
        }
    }
}
