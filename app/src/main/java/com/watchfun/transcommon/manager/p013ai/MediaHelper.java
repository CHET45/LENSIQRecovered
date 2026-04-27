package com.watchfun.transcommon.manager.p013ai;

import android.media.AudioManager;
import android.media.MediaRecorder;
import android.os.SystemClock;
import android.util.Log;
import android.view.KeyEvent;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public class MediaHelper {
    private static MediaHelper mInstance;
    private String mFilePath;
    private MediaRecorder mMediaRecorder;
    public MediaStateListener mMediaStateListener;
    private String mPath;

    public interface MediaStateListener {
        void preparedDone();
    }

    public interface OnMediaKeyEvent {
        default void sendPauseKeyEvent(AudioManager audioManager) {
            StringBuilder sb = new StringBuilder();
            sb.append("=====> sendPauseKeyEvent.audioManager:");
            sb.append(audioManager == null);
            Log.e("testtest", sb.toString());
            audioManager.dispatchMediaKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), SystemClock.uptimeMillis(), 0, 127, 0));
        }
    }

    private MediaHelper(String str) {
        this.mPath = str;
    }

    public static MediaHelper getInstance(String str) {
        if (mInstance == null) {
            synchronized (MediaHelper.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new MediaHelper(str);
                    }
                } finally {
                }
            }
        }
        return mInstance;
    }

    public void cancel() {
        release();
        if (this.mFilePath != null) {
            File file = new File(this.mFilePath);
            if (file.exists()) {
                file.delete();
            }
            this.mFilePath = null;
        }
    }

    public String getFilePath() {
        return this.mFilePath;
    }

    public void prepare() {
        try {
            File file = new File(this.mPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(file, System.currentTimeMillis() + ".amr");
            this.mMediaRecorder = new MediaRecorder();
            this.mFilePath = file2.getAbsolutePath();
            this.mMediaRecorder.setOutputFile(new File(file2.getAbsolutePath()));
            this.mMediaRecorder.setAudioSource(1);
            this.mMediaRecorder.setOutputFormat(3);
            this.mMediaRecorder.setAudioEncoder(1);
            this.mMediaRecorder.prepare();
            this.mMediaRecorder.start();
            MediaStateListener mediaStateListener = this.mMediaStateListener;
            if (mediaStateListener != null) {
                mediaStateListener.preparedDone();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e2) {
            e2.printStackTrace();
        }
    }

    public void release() {
        this.mMediaRecorder.stop();
        this.mMediaRecorder.release();
        this.mMediaRecorder = null;
    }

    public void setMediaStateListener(MediaStateListener mediaStateListener) {
        this.mMediaStateListener = mediaStateListener;
    }
}
