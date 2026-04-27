package com.watchfun.transcommon.manager.p013ai;

import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class MediaPlayerManager {
    private static final String TAG = "MediaPlayerManager";
    private Context context;
    private List<File> historyPlayList;
    private AtomicBoolean isPaused;
    private final AtomicBoolean isPlayerPlaying;
    private final AtomicBoolean isPlayingHistory;
    private final AtomicBoolean isPlayingRealTime;
    private MediaPlayer mediaPlayer;
    private int playHistoryIndex;
    private OnPlayListener playListener;
    private final List<byte[]> soundList;
    private int tmpIndex;

    public interface OnPlayListener {
        void onHistoryPlayComplete();

        void onPlayPause();

        void onPlayResume();

        void onRealTimePlayComplete();
    }

    public static class SingletonHolder {
        private static final MediaPlayerManager INSTANCE = new MediaPlayerManager();

        private SingletonHolder() {
        }
    }

    private File createTempFile(byte[] bArr) throws IOException {
        Context context = this.context;
        if (context == null) {
            return null;
        }
        File file = new File(context.getFilesDir(), "tmp" + this.tmpIndex + ".mp3");
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
            this.tmpIndex++;
            return file;
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static MediaPlayerManager getInstance() {
        return SingletonHolder.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPlayErrorOrComlete() {
        if (isPlayingRealTime()) {
            if (!this.soundList.isEmpty()) {
                this.soundList.remove(0);
            }
            if (!this.soundList.isEmpty()) {
                play(this.soundList.get(0));
                return;
            }
            this.isPlayingRealTime.set(false);
            this.isPlayerPlaying.set(false);
            this.isPaused.set(false);
            OnPlayListener onPlayListener = this.playListener;
            if (onPlayListener != null) {
                onPlayListener.onRealTimePlayComplete();
                return;
            }
            return;
        }
        if (isPlayingHistory()) {
            int i = this.playHistoryIndex + 1;
            this.playHistoryIndex = i;
            if (i < this.historyPlayList.size()) {
                play(this.historyPlayList.get(this.playHistoryIndex).getAbsolutePath());
                return;
            }
            this.isPlayingHistory.set(false);
            this.isPlayerPlaying.set(false);
            this.isPaused.set(false);
            OnPlayListener onPlayListener2 = this.playListener;
            if (onPlayListener2 != null) {
                onPlayListener2.onHistoryPlayComplete();
            }
        }
    }

    private void setupListeners() {
        this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.watchfun.transcommon.manager.ai.MediaPlayerManager.1
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(MediaPlayer mediaPlayer) {
                MediaPlayerManager.this.isPlayerPlaying.set(true);
                MediaPlayerManager.this.mediaPlayer.start();
            }
        });
        this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.watchfun.transcommon.manager.ai.MediaPlayerManager.2
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(MediaPlayer mediaPlayer) {
                MediaPlayerManager.this.onPlayErrorOrComlete();
            }
        });
        this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.watchfun.transcommon.manager.ai.MediaPlayerManager.3
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                Log.e("MediaPlayerManager", "MediaPlayer error: what=" + i + ", extra=" + i2);
                MediaPlayerManager.this.onPlayErrorOrComlete();
                return true;
            }
        });
    }

    public void addSound(byte[] bArr) {
        if (isPlayInRealTime()) {
            if (bArr != null) {
                this.soundList.add(bArr);
            }
            if (this.isPlayerPlaying.get()) {
                return;
            }
            play(bArr);
        }
    }

    public String getHistoryPlayFileName() {
        return this.playHistoryIndex < this.historyPlayList.size() ? this.historyPlayList.get(this.playHistoryIndex).getName() : "";
    }

    public MediaPlayer getMediaPlayer() {
        return this.mediaPlayer;
    }

    public void init() {
        this.mediaPlayer = new MediaPlayer();
        setupListeners();
    }

    public boolean isPaused() {
        return this.isPaused.get();
    }

    public boolean isPlayInRealTime() {
        return this.isPlayingRealTime.get();
    }

    public boolean isPlayingHistory() {
        return this.isPlayingHistory.get();
    }

    public boolean isPlayingRealTime() {
        return this.isPlayingRealTime.get();
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || !mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.pause();
        this.isPaused.set(true);
        OnPlayListener onPlayListener = this.playListener;
        if (onPlayListener != null) {
            onPlayListener.onPlayPause();
        }
    }

    public void play(byte[] bArr) {
        try {
            File fileCreateTempFile = createTempFile(bArr);
            if (fileCreateTempFile == null) {
                return;
            }
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(fileCreateTempFile.getAbsolutePath());
            this.mediaPlayer.prepareAsync();
        } catch (Exception e) {
            Log.e("MediaPlayerManager", "Error setting data source or preparing media player", e);
        }
    }

    public void playHistory(File[] fileArr) {
        if (fileArr == null || fileArr.length == 0) {
            return;
        }
        this.historyPlayList.clear();
        this.playHistoryIndex = 0;
        this.historyPlayList.addAll(Arrays.asList(fileArr));
        try {
            stop();
            this.isPlayingHistory.set(true);
            this.isPlayingRealTime.set(false);
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(this.historyPlayList.get(this.playHistoryIndex).getAbsolutePath());
            this.mediaPlayer.prepareAsync();
        } catch (Exception e) {
            Log.e("MediaPlayerManager", "Error setting data source or preparing media player", e);
        }
    }

    public void playRealTime(byte[] bArr) {
        this.isPlayingHistory.set(false);
        this.isPlayingRealTime.set(true);
        play(bArr);
    }

    public void readyToPlayInRealTime() {
        this.isPlayingRealTime.set(true);
        this.isPlayingHistory.set(false);
    }

    public void release() {
        stopAndClearData();
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.release();
                this.mediaPlayer = null;
            } catch (Exception e) {
                Log.e("MediaPlayerManager", "release: " + e);
            }
        }
        this.isPlayingRealTime.set(false);
        this.isPlayingHistory.set(false);
        this.soundList.clear();
        this.historyPlayList.clear();
    }

    public void resume() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer == null || mediaPlayer.isPlaying()) {
            return;
        }
        this.mediaPlayer.start();
        this.isPaused.set(false);
        OnPlayListener onPlayListener = this.playListener;
        if (onPlayListener != null) {
            onPlayListener.onPlayResume();
        }
    }

    public void setContext(Context context) {
        if (context != null) {
            this.context = context.getApplicationContext();
        }
    }

    public void setPlayListener(OnPlayListener onPlayListener) {
        this.playListener = onPlayListener;
    }

    public void setPlayingHistory(boolean z) {
        this.isPlayingHistory.set(z);
    }

    public void stop() {
        if (this.mediaPlayer != null) {
            try {
                this.isPlayerPlaying.set(false);
                this.mediaPlayer.stop();
                this.isPaused.set(false);
            } catch (Exception e) {
                Log.e("MediaPlayerManager", "stop: " + e);
            }
            this.isPlayingRealTime.set(false);
            this.isPlayingHistory.set(false);
            OnPlayListener onPlayListener = this.playListener;
            if (onPlayListener != null) {
                onPlayListener.onRealTimePlayComplete();
                this.playListener.onHistoryPlayComplete();
            }
        }
    }

    public void stopAndClearData() {
        this.soundList.clear();
        this.tmpIndex = 0;
        stop();
    }

    private MediaPlayerManager() {
        this.isPlayingRealTime = new AtomicBoolean(false);
        this.isPlayingHistory = new AtomicBoolean(false);
        this.isPlayerPlaying = new AtomicBoolean(false);
        this.isPaused = new AtomicBoolean(false);
        this.soundList = Collections.synchronizedList(new ArrayList());
        this.tmpIndex = 0;
        this.historyPlayList = new ArrayList();
    }

    public void play(String str) {
        try {
            this.mediaPlayer.reset();
            this.mediaPlayer.setDataSource(str);
            this.mediaPlayer.prepareAsync();
        } catch (Exception e) {
            Log.e("MediaPlayerManager", "Error setting data source or preparing media player", e);
        }
    }
}
