package com.watchfun.transcommon.manager.p013ai;

import android.media.MediaRecorder;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import p000.igg;

/* JADX INFO: loaded from: classes6.dex */
public class AudioManager {
    private static AudioManager mInstance;
    private boolean isPrepare;
    public AudioStateListener mAudioStateListener;
    private String mCurrentFilePath;
    private String mDir;
    private MediaRecorder mMediaRecorder;

    public interface AudioStateListener {
        void wellPrepared();
    }

    private AudioManager(String str) {
        this.mDir = str;
    }

    private String generateFileName() {
        return getCurrentTime() + ".amr";
    }

    public static String getCurrentTime() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT+08"));
        String str = simpleDateFormat.format(new Date(System.currentTimeMillis()));
        StringBuilder sb = new StringBuilder();
        sb.append("getCurrentTime time:");
        sb.append(str);
        return str;
    }

    public static AudioManager getInstance(String str) {
        if (mInstance == null) {
            synchronized (AudioManager.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new AudioManager(str);
                    }
                } finally {
                }
            }
        }
        return mInstance;
    }

    public void cancel() {
        release();
        if (this.mCurrentFilePath != null) {
            new File(this.mCurrentFilePath).delete();
            this.mCurrentFilePath = null;
        }
    }

    public String getCurrentFilePath() {
        return this.mCurrentFilePath;
    }

    public int getVoiceLevel(int i) {
        if (this.isPrepare) {
            try {
                return ((i * this.mMediaRecorder.getMaxAmplitude()) / 32768) + 1;
            } catch (Exception unused) {
            }
        }
        return 1;
    }

    @igg({"WrongConstant"})
    public void prepareAudio() {
        try {
            this.isPrepare = false;
            File file = new File(this.mDir);
            if (!file.exists()) {
                file.mkdirs();
            }
            this.mCurrentFilePath = new File(file, generateFileName()).getAbsolutePath();
            MediaRecorder mediaRecorder = new MediaRecorder();
            this.mMediaRecorder = mediaRecorder;
            mediaRecorder.setOutputFile(this.mCurrentFilePath);
            this.mMediaRecorder.setAudioSource(1);
            this.mMediaRecorder.setOutputFormat(3);
            this.mMediaRecorder.setAudioEncoder(1);
            this.mMediaRecorder.prepare();
            this.mMediaRecorder.start();
            this.isPrepare = true;
            AudioStateListener audioStateListener = this.mAudioStateListener;
            if (audioStateListener != null) {
                audioStateListener.wellPrepared();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void release() {
        this.mMediaRecorder.reset();
        this.mMediaRecorder = null;
    }

    public void setOnAudioStateListener(AudioStateListener audioStateListener) {
        this.mAudioStateListener = audioStateListener;
    }
}
