package com.watchfun.translatewebsocket;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.text.TextUtils;
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
import p000.omg;

/* JADX INFO: loaded from: classes7.dex */
public class AudioNewRecorder {
    private static final int AUDIO_CHANNEL = 16;
    private static final int AUDIO_ENCODING = 2;
    private static final int AUDIO_INPUT = 1;
    private static final int AUDIO_INPUT_VOICE_COMMUNICATION = 7;
    private static final int AUDIO_SAMPLE_RATE = 44100;
    private static Context context;
    private final String TAG;
    private AcousticEchoCanceler aec;
    private AudioManager audioManager;
    private AudioRecord audioRecord;
    private int bufferSizeInBytes;
    private final List<String> filesName;
    private boolean isEarsMic;
    private Status status;
    private boolean useExternalControl;

    public static class AudioRecorderHolder {
        private static final AudioNewRecorder instance = new AudioNewRecorder();

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

    public static AudioNewRecorder getInstance() {
        return AudioRecorderHolder.instance;
    }

    public static void init(Context context2) {
        context = context2.getApplicationContext();
    }

    @omg(16)
    private void initAcousticEchoCanceler() {
        AudioRecord audioRecord;
        try {
            releaseAcousticEchoCanceler();
            boolean zIsAvailable = AcousticEchoCanceler.isAvailable();
            C2473f.m4167d("AudioNewRecorder", "AEC available: " + zIsAvailable);
            if (zIsAvailable && (audioRecord = this.audioRecord) != null && audioRecord.getState() == 1) {
                int audioSessionId = this.audioRecord.getAudioSessionId();
                C2473f.m4167d("AudioNewRecorder", "AudioSessionId: " + audioSessionId);
                if (audioSessionId <= 0 || audioSessionId == -1) {
                    C2473f.m4168e("AudioNewRecorder", "Invalid audioSessionId: " + audioSessionId);
                } else {
                    this.aec = AcousticEchoCanceler.create(audioSessionId);
                    StringBuilder sb = new StringBuilder();
                    sb.append("AEC created: ");
                    sb.append(this.aec != null);
                    C2473f.m4167d("AudioNewRecorder", sb.toString());
                    AcousticEchoCanceler acousticEchoCanceler = this.aec;
                    if (acousticEchoCanceler != null) {
                        C2473f.m4167d("AudioNewRecorder", "AEC enabled result: " + acousticEchoCanceler.setEnabled(true));
                        C2473f.m4167d("AudioNewRecorder", "AEC isEnabled: " + this.aec.getEnabled());
                        C2473f.m4167d("AudioNewRecorder", "AEC ID: " + this.aec.getId());
                    }
                }
            } else {
                AudioRecord audioRecord2 = this.audioRecord;
                if (audioRecord2 == null) {
                    C2473f.m4168e("AudioNewRecorder", "AudioRecord is null");
                } else if (audioRecord2.getState() != 1) {
                    C2473f.m4168e("AudioNewRecorder", "AudioRecord not initialized, state: " + this.audioRecord.getState());
                }
            }
        } catch (Exception e) {
            C2473f.m4168e("AudioNewRecorder", "Failed to initialize AEC", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$0(RecordStreamListener recordStreamListener) {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2473f.m4168e("AudioNewRecorder", "线程中断", e);
        }
        readAudioData(recordStreamListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startRecord$1(String str, RecordStreamListener recordStreamListener) {
        try {
            Thread.sleep(50L);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            C2473f.m4168e("AudioNewRecorder", "线程中断", e);
        }
        readAudioData(str, recordStreamListener);
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

    private void readAudioData(RecordStreamListener recordStreamListener) {
        byte[] bArr = new byte[this.bufferSizeInBytes];
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            try {
                int i = this.audioRecord.read(bArr, 0, this.bufferSizeInBytes);
                if (i != -3 && i != -2 && recordStreamListener != null) {
                    recordStreamListener.recordOfByte(bArr, 0, i);
                }
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "audioRecord.read error", e);
                return;
            }
        }
    }

    private void releaseAcousticEchoCanceler() {
        try {
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler != null) {
                acousticEchoCanceler.setEnabled(false);
                this.aec.release();
                this.aec = null;
                C2473f.m4167d("AudioNewRecorder", "AEC released");
            }
        } catch (Exception e) {
            C2473f.m4168e("AudioNewRecorder", "Failed to release AEC", e);
        }
    }

    public void cancel() {
        this.filesName.clear();
        stopRecord();
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            try {
                audioManager.setBluetoothScoOn(false);
                this.audioManager.stopBluetoothSco();
                this.audioManager.setMode(0);
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "清理音频设置失败", e);
            }
        }
        releaseAcousticEchoCanceler();
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (Exception e2) {
                C2473f.m4168e("AudioNewRecorder", "释放AudioRecord失败", e2);
            }
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    @igg({"MissingPermission"})
    public void createAudio(int i, int i2, int i3, int i4) {
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(i2, i3, i4);
        this.audioRecord = new AudioRecord(i, i2, i3, i4, this.bufferSizeInBytes);
        this.status = Status.STATUS_READY;
        initAcousticEchoCanceler();
    }

    @igg({"MissingPermission"})
    public void createDefaultAudio() {
        if (context == null) {
            throw new IllegalStateException("AudioRecorder must be initialized with context first");
        }
        releaseAcousticEchoCanceler();
        this.bufferSizeInBytes = AudioRecord.getMinBufferSize(44100, 16, 2);
        C2473f.m4167d("AudioNewRecorder", "bufferSizeInBytes = " + this.bufferSizeInBytes);
        this.audioManager = (AudioManager) context.getSystemService("audio");
        if (!this.useExternalControl) {
            C2473f.m4167d("AudioNewRecorder", "自动检测: 使用设备麦克风");
            this.audioRecord = new AudioRecord(1, 44100, 16, 2, this.bufferSizeInBytes);
        } else if (this.isEarsMic) {
            C2473f.m4167d("AudioNewRecorder", "外部控制模式: 使用耳机麦克风录音");
            this.audioManager.setMode(3);
            this.audioManager.startBluetoothSco();
            this.audioManager.setBluetoothScoOn(true);
            this.audioRecord = new AudioRecord(7, 44100, 16, 2, this.bufferSizeInBytes);
        } else {
            C2473f.m4167d("AudioNewRecorder", "外部控制模式: 使用设备麦克风录音");
            this.audioManager.setBluetoothScoOn(false);
            this.audioManager.stopBluetoothSco();
            this.audioManager.setMode(0);
            this.audioRecord = new AudioRecord(1, 44100, 16, 2, this.bufferSizeInBytes);
        }
        this.status = Status.STATUS_READY;
        initAcousticEchoCanceler();
    }

    public int getAudioSessionId() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            return audioRecord.getAudioSessionId();
        }
        return -1;
    }

    public int getPcmFilesCount() {
        return this.filesName.size();
    }

    public Status getStatus() {
        return this.status;
    }

    @omg(16)
    public boolean isAECEnabled() {
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        return acousticEchoCanceler != null && acousticEchoCanceler.getEnabled();
    }

    public void onAudioRouteChanged() {
        C2473f.m4167d("AudioNewRecorder", "Audio route changed, reinitializing AEC if needed");
        if (this.audioRecord == null || this.status != Status.STATUS_START) {
            return;
        }
        reinitializeAEC();
    }

    public void pauseRecord() {
        C2473f.m4167d("AudioNewRecorder", "===pauseRecord===");
        if (this.status != Status.STATUS_START) {
            throw new IllegalStateException("没有在录音");
        }
        this.audioRecord.stop();
        this.status = Status.STATUS_PAUSE;
    }

    public void reinitializeAEC() {
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord == null || audioRecord.getState() != 1) {
            C2473f.m4176w("AudioNewRecorder", "Cannot reinitialize AEC, AudioRecord not ready");
        } else {
            initAcousticEchoCanceler();
        }
    }

    public void release() {
        C2473f.m4167d("AudioNewRecorder", "===release===");
        stopRecord();
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            try {
                audioManager.setBluetoothScoOn(false);
                this.audioManager.stopBluetoothSco();
                this.audioManager.setMode(0);
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "清理音频设置失败", e);
            }
        }
        releaseAcousticEchoCanceler();
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.release();
            } catch (Exception e2) {
                C2473f.m4168e("AudioNewRecorder", "释放AudioRecord失败", e2);
            }
            this.audioRecord = null;
        }
        this.status = Status.STATUS_NO_READY;
    }

    @omg(16)
    public boolean setAECEnabled(boolean z) {
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            try {
                boolean z2 = acousticEchoCanceler.setEnabled(z) == 0;
                C2473f.m4167d("AudioNewRecorder", "Set AEC enabled to " + z + ", result: " + z2);
                return z2;
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "Failed to set AEC enabled state", e);
            }
        } else {
            C2473f.m4176w("AudioNewRecorder", "AEC is null, cannot set enabled state");
        }
        return false;
    }

    public void setIsHeadset(boolean z) {
        this.isEarsMic = z;
        this.useExternalControl = true;
        StringBuilder sb = new StringBuilder();
        sb.append("设置录音模式: ");
        sb.append(z ? "耳机麦克风" : "设备麦克风");
        C2473f.m4167d("AudioNewRecorder", sb.toString());
        if (this.status == Status.STATUS_START && this.audioRecord != null) {
            C2473f.m4167d("AudioNewRecorder", "正在录音，重新初始化录音对象");
            stopRecord();
            createDefaultAudio();
        } else if (this.audioRecord != null) {
            release();
            createDefaultAudio();
        }
    }

    public void startRecord(final RecordStreamListener recordStreamListener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioNewRecorder", "录音器未初始化");
                createDefaultAudio();
            }
            Status status = this.status;
            if (status == Status.STATUS_NO_READY) {
                C2473f.m4168e("AudioNewRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
                return;
            }
            if (status == Status.STATUS_START) {
                C2473f.m4168e("AudioNewRecorder", "正在录音");
                return;
            }
            C2473f.m4167d("AudioNewRecorder", "===startRecord===" + this.audioRecord.getState());
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler == null || !acousticEchoCanceler.getEnabled()) {
                initAcousticEchoCanceler();
            }
            try {
                this.audioRecord.startRecording();
                C2478k.getCachedPool().execute(new Runnable() { // from class: ne0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64086a.lambda$startRecord$0(recordStreamListener);
                    }
                });
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "开始录音失败", e);
            }
        } catch (Exception e2) {
            C2473f.m4168e("AudioNewRecorder", "创建录音对象失败", e2);
        }
    }

    public void stopRecord() {
        C2473f.m4167d("AudioNewRecorder", "===stopRecord===");
        Status status = this.status;
        if (status == Status.STATUS_NO_READY || status == Status.STATUS_READY) {
            C2473f.m4173i("AudioNewRecorder", "录音尚未开始");
            return;
        }
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            try {
                audioRecord.stop();
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "停止录音失败", e);
            }
        }
        this.status = Status.STATUS_STOP;
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            try {
                audioManager.setBluetoothScoOn(false);
                this.audioManager.stopBluetoothSco();
                this.audioManager.setMode(0);
            } catch (Exception e2) {
                C2473f.m4168e("AudioNewRecorder", "清理音频设置失败", e2);
            }
        }
    }

    private AudioNewRecorder() {
        this.TAG = "AudioNewRecorder";
        this.bufferSizeInBytes = 1024;
        this.status = Status.STATUS_NO_READY;
        this.filesName = new ArrayList();
        this.isEarsMic = false;
        this.useExternalControl = false;
    }

    private void readAudioData(String str, RecordStreamListener recordStreamListener) {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[this.bufferSizeInBytes];
        if (TextUtils.isEmpty(str)) {
            fileOutputStream = null;
        } else {
            try {
                fileOutputStream = new FileOutputStream(new File(str), true);
            } catch (FileNotFoundException e) {
                C2473f.m4168e("AudioNewRecorder", e.getMessage());
                fileOutputStream = null;
            } catch (IllegalStateException e2) {
                C2473f.m4168e("AudioNewRecorder", e2.getMessage());
                throw new IllegalStateException(e2.getMessage());
            }
        }
        this.status = Status.STATUS_START;
        while (this.status == Status.STATUS_START) {
            try {
                int i = this.audioRecord.read(bArr, 0, this.bufferSizeInBytes, 0);
                if (i != -3 && i != -2) {
                    if (fileOutputStream != null) {
                        fileOutputStream.write(bArr, 0, i);
                    }
                    if (recordStreamListener != null) {
                        recordStreamListener.recordOfByte(bArr, 0, i);
                    }
                }
            } catch (Exception e3) {
                C2473f.m4168e("AudioNewRecorder", "audioRecord.read error", e3);
            }
        }
        if (fileOutputStream != null) {
            try {
                fileOutputStream.close();
            } catch (IOException e4) {
                C2473f.m4168e("AudioNewRecorder", "关闭文件输出流失败", e4);
            }
        }
    }

    public void startRecord(final String str, final RecordStreamListener recordStreamListener) {
        try {
            AudioRecord audioRecord = this.audioRecord;
            if (audioRecord == null || audioRecord.getState() == 0) {
                C2473f.m4168e("AudioNewRecorder", "录音器未初始化");
                createDefaultAudio();
            }
            Status status = this.status;
            if (status == Status.STATUS_NO_READY) {
                C2473f.m4168e("AudioNewRecorder", "录音尚未初始化,请检查是否禁止了录音权限~");
                return;
            }
            if (status == Status.STATUS_START) {
                C2473f.m4168e("ltttt", "正在录音");
                return;
            }
            C2473f.m4167d("AudioNewRecorder", "===startRecord===" + this.audioRecord.getState());
            AcousticEchoCanceler acousticEchoCanceler = this.aec;
            if (acousticEchoCanceler == null || !acousticEchoCanceler.getEnabled()) {
                initAcousticEchoCanceler();
            }
            try {
                this.audioRecord.startRecording();
                C2478k.getCachedPool().execute(new Runnable() { // from class: me0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60727a.lambda$startRecord$1(str, recordStreamListener);
                    }
                });
            } catch (Exception e) {
                C2473f.m4168e("AudioNewRecorder", "开始录音失败", e);
            }
        } catch (Exception e2) {
            C2473f.m4168e("AudioNewRecorder", "创建录音对象失败", e2);
        }
    }
}
