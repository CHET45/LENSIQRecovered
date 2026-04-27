package com.eyevue.glassapp.helper;

import android.content.Context;
import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes4.dex */
public class MusicPlayerManager {
    private static MusicPlayerManager instance;
    private CompletionListener completionListener;
    private String currentMusicId;
    private String currentMusicUrl;
    private int currentSongIndex = 0;
    private MediaPlayer mediaPlayer = new MediaPlayer();
    private boolean isPaused = false;
    private boolean isInitialized = false;

    public interface CompletionListener {
        void onCompletion();
    }

    private MusicPlayerManager(Context context) {
    }

    public static MusicPlayerManager getInstance(Context context) {
        if (instance == null) {
            instance = new MusicPlayerManager(context);
        }
        return instance;
    }

    private void handleMusicCompletion() {
        CompletionListener completionListener = this.completionListener;
        if (completionListener != null) {
            completionListener.onCompletion();
        }
    }

    public int getCurrentDuration() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public String getCurrentMusicUrl() {
        return this.currentMusicUrl;
    }

    public int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public boolean isPaused() {
        return this.isPaused;
    }

    public boolean isPlaying() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        return mediaPlayer != null && mediaPlayer.isPlaying();
    }

    public void isTimerRunning() {
        this.isPaused = true;
    }

    public void pauseMusic(Context context) {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.pause();
        this.isPaused = true;
    }

    public void seekTo(float rate) {
    }

    public void setCompletionListener(CompletionListener listener) {
        this.completionListener = listener;
    }

    public void setSinglePlayerModel() {
        this.mediaPlayer.setLooping(true);
    }

    public void stopMusic() {
        this.mediaPlayer.setOnCompletionListener(null);
        this.mediaPlayer.stop();
        this.mediaPlayer.reset();
        this.currentMusicUrl = null;
        this.isPaused = false;
    }

    public void seekTo(int seek) {
    }
}
