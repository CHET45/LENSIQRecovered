package com.watchfun.transcommon.manager;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public class AudioTrackUtils {
    private static AudioTrackUtils instance;
    private AudioTrack audioTrack;
    int bufferSize;
    private boolean canPlay;
    private int filePosition;
    private boolean isPlayFileing;
    private int lastSampleRate;
    private OnPcmFilePlayListener mOnFilePlayListener;
    private final String TAG = "AudioTrackUtils";
    int sampleRate = 16000;
    int channelConfig = 4;
    int audioFormat = 2;
    private ExecutorService mThreadTool = Executors.newSingleThreadExecutor();
    private String lastPlayedFilePath = "";

    public interface OnPcmFilePlayListener {
        void onPlayEnd();
    }

    private AudioTrackUtils() {
        int i = this.sampleRate;
        this.lastSampleRate = i;
        this.canPlay = true;
        this.bufferSize = AudioTrack.getMinBufferSize(i, this.channelConfig, this.audioFormat);
        initAudioTrack();
    }

    public static AudioTrackUtils getInstance() {
        if (instance == null) {
            synchronized (AudioTrackUtils.class) {
                try {
                    if (instance == null) {
                        instance = new AudioTrackUtils();
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private void initAudioTrack() {
        this.audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(this.audioFormat).setSampleRate(this.sampleRate).setChannelMask(this.channelConfig).build()).setBufferSizeInBytes(this.bufferSize * 4).setPerformanceMode(1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$0(byte[] bArr) {
        if (this.audioTrack.getPlayState() != 3) {
            this.audioTrack.play();
        }
        this.audioTrack.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$1(String str) {
        int i;
        this.audioTrack.play();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                fileInputStream.skip(this.filePosition);
                byte[] bArr = new byte[this.bufferSize];
                while (this.isPlayFileing && (i = fileInputStream.read(bArr)) != -1) {
                    this.audioTrack.write(bArr, 0, i);
                    this.filePosition += i;
                }
                if (this.isPlayFileing && !this.mThreadTool.isShutdown()) {
                    OnPcmFilePlayListener onPcmFilePlayListener = this.mOnFilePlayListener;
                    if (onPcmFilePlayListener != null) {
                        onPcmFilePlayListener.onPlayEnd();
                    }
                    this.filePosition = 0;
                    this.isPlayFileing = false;
                }
                fileInputStream.close();
            } finally {
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean isPlayFileing() {
        return this.isPlayFileing;
    }

    public void pause() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
        }
        this.isPlayFileing = false;
    }

    public void play(final byte[] bArr, int i) {
        if (this.canPlay) {
            if (this.lastSampleRate != i) {
                C2473f.m4168e("AudioTrackUtils", "采样率发生变化，重新创建AudioTrack");
                stop();
                release();
                this.sampleRate = i;
                initAudioTrack();
            }
            this.lastSampleRate = i;
            AudioTrack audioTrack = this.audioTrack;
            if (audioTrack == null) {
                initAudioTrack();
            } else if (audioTrack.getState() != 1) {
                Log.e("AudioTrackUtils", "不能播放，当前播放器未处于初始化状态..");
            } else {
                if (this.mThreadTool.isShutdown()) {
                    return;
                }
                this.mThreadTool.execute(new Runnable() { // from class: nh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f64498a.lambda$play$0(bArr);
                    }
                });
            }
        }
    }

    public void release() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    public void setCanPlay(boolean z) {
        this.canPlay = z;
    }

    public void setmOnFilePlayListener(OnPcmFilePlayListener onPcmFilePlayListener) {
        this.mOnFilePlayListener = onPcmFilePlayListener;
    }

    public void stop() {
        ExecutorService executorService = this.mThreadTool;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.audioTrack.flush();
        }
        this.mThreadTool = Executors.newSingleThreadExecutor();
    }

    public void stopAll() {
        stop();
        stopPlayFile();
    }

    public void stopPlayFile() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.audioTrack.flush();
        }
        try {
            this.mThreadTool.shutdown();
            if (!this.mThreadTool.awaitTermination(5L, TimeUnit.SECONDS)) {
                this.mThreadTool.shutdownNow();
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.mThreadTool = Executors.newSingleThreadExecutor();
        this.lastPlayedFilePath = "";
        this.filePosition = 0;
    }

    public void play(final String str, int i) {
        if (!this.lastPlayedFilePath.equals(str)) {
            stopPlayFile();
        }
        this.lastPlayedFilePath = str;
        if (this.lastSampleRate != i) {
            stop();
            release();
            this.sampleRate = i;
            initAudioTrack();
        }
        this.lastSampleRate = i;
        this.isPlayFileing = true;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            initAudioTrack();
        } else if (audioTrack.getState() != 1) {
            Log.e("AudioTrackUtils", "不能播放，当前播放器未处于初始化状态..");
        } else {
            this.mThreadTool.execute(new Runnable() { // from class: lh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f57540a.lambda$play$1(str);
                }
            });
        }
    }
}
