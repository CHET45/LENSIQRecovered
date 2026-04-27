package com.eyevue.glassapp.utils;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class AudioTrackUtils {
    private static AudioTrackUtils instance;
    private AudioTrack audioTrack;
    private int filePosition;
    private boolean isPlayFileing;
    private OnPcmFilePlayListener mOnFilePlayListener;
    private OnPcmDataPlayListener mOnPcmDataPlayListener;
    private long totalBytes;
    private final String TAG = AudioTrackUtils.class.getName();
    int sampleRate = 24000;
    int channelConfig = 4;
    int audioFormat = 2;
    private ExecutorService mThreadTool = Executors.newSingleThreadExecutor();
    private String lastPlayedFilePath = "";
    private volatile boolean isPlaying = false;
    private Handler handler = new Handler(Looper.getMainLooper());
    private Runnable mRunnable = new Runnable() { // from class: com.eyevue.glassapp.utils.AudioTrackUtils.1
        @Override // java.lang.Runnable
        public void run() {
            if (AudioTrackUtils.this.audioTrack != null) {
                AudioTrackUtils audioTrackUtils = AudioTrackUtils.this;
                if (audioTrackUtils.getUnplayedBytes(audioTrackUtils.audioTrack) > 0) {
                    AudioTrackUtils.this.handler.postDelayed(this, 100L);
                    return;
                }
                if (AudioTrackUtils.this.mOnPcmDataPlayListener != null) {
                    AudioTrackUtils.this.mOnPcmDataPlayListener.onPlayEnd();
                }
                AudioTrackUtils.this.totalBytes = 0L;
            }
        }
    };
    int bufferSize = AudioTrack.getMinBufferSize(this.sampleRate, this.channelConfig, this.audioFormat);

    public interface OnPcmDataPlayListener {
        void onPlayEnd();
    }

    public interface OnPcmFilePlayListener {
        void onPlayEnd(String msgId);
    }

    private AudioTrackUtils() {
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
        this.audioTrack = new AudioTrack.Builder().setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).setAudioFormat(new AudioFormat.Builder().setEncoding(this.audioFormat).setSampleRate(this.sampleRate).setChannelMask(this.channelConfig).build()).setBufferSizeInBytes(this.bufferSize * 2).setPerformanceMode(1).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$0(byte[] bArr) {
        if (this.audioTrack.getPlayState() != 3) {
            this.audioTrack.play();
        }
        this.audioTrack.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$play$1(String str, String str2) {
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
                        onPcmFilePlayListener.onPlayEnd(str2);
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

    public int getUnplayedBytes(AudioTrack audioTrack) {
        if (audioTrack.getPlayState() != 3) {
            return 0;
        }
        int i = (audioTrack.getAudioFormat() == 2 ? 16 : 8) / 8;
        return (int) ((((long) (((int) this.totalBytes) / i)) - ((long) audioTrack.getPlaybackHeadPosition())) * ((long) i));
    }

    public boolean isPlayFileing() {
        return this.isPlayFileing;
    }

    public void pause() {
        ExecutorService executorService = this.mThreadTool;
        if (executorService != null) {
            executorService.shutdownNow();
        }
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
            this.audioTrack.flush();
        }
        this.isPlayFileing = false;
        this.mThreadTool = Executors.newSingleThreadExecutor();
    }

    public void play(final byte[] audioData) {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            initAudioTrack();
            return;
        }
        if (audioTrack.getState() != 1) {
            Log.e(this.TAG, "不能播放，当前播放器未处于初始化状态..");
            return;
        }
        if (!this.mThreadTool.isShutdown()) {
            this.totalBytes += (long) audioData.length;
            this.mThreadTool.execute(new Runnable() { // from class: mh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f60991a.lambda$play$0(audioData);
                }
            });
        }
        this.handler.removeCallbacks(this.mRunnable);
        this.handler.postDelayed(this.mRunnable, 1000L);
    }

    public void release() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
        this.handler.removeCallbacks(this.mRunnable);
    }

    public void setmOnFilePlayListener(OnPcmFilePlayListener mOnFilePlayListener) {
        this.mOnFilePlayListener = mOnFilePlayListener;
    }

    public void setmOnPcmDataPlayListener(OnPcmDataPlayListener mOnPcmDataPlayListener) {
        this.mOnPcmDataPlayListener = mOnPcmDataPlayListener;
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
        this.totalBytes = 0L;
        this.handler.removeCallbacks(this.mRunnable);
        this.mThreadTool = Executors.newSingleThreadExecutor();
    }

    public void stopPlayFile() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.stop();
        }
        this.mThreadTool.shutdown();
        try {
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

    public void play(final String pcmFilePath, final String msgId) {
        if (!this.lastPlayedFilePath.equals(pcmFilePath)) {
            stopPlayFile();
        }
        this.lastPlayedFilePath = pcmFilePath;
        this.isPlayFileing = true;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack == null) {
            initAudioTrack();
        } else if (audioTrack.getState() != 1) {
            Log.e(this.TAG, "不能播放，当前播放器未处于初始化状态..");
        } else {
            this.mThreadTool.execute(new Runnable() { // from class: oh0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67625a.lambda$play$1(pcmFilePath, msgId);
                }
            });
        }
    }
}
