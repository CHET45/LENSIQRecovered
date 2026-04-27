package com.watchfun.transcommon.manager.trans;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import p000.yi9;

/* JADX INFO: loaded from: classes6.dex */
public class AudioPlayerManager {
    private static final ReentrantLock LOCK = new ReentrantLock();
    private static final String TAG = "AudioPlayerManager";
    private static AudioPlayerManager sInstance;
    private AudioManager.OnAudioFocusChangeListener mAfChangeListener;
    private AudioManager mAudioManager;
    private AudioPlayerListener mAudioPlayerListener;
    private int mCurPosition;
    private AudioFileObserver mFileObserver;
    private MediaPlayer mMediaPlayer;
    private String mLastFilePath = "";
    private volatile boolean mIsMediaPlayerReleased = false;
    private volatile boolean mIsPreparing = false;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());

    public static class AudioFileObserver extends FileObserver {
        private volatile boolean isUpdated;

        public AudioFileObserver(String str) {
            super(str, 2);
            this.isUpdated = false;
        }

        public boolean isFileUpdated() {
            boolean z = this.isUpdated;
            this.isUpdated = false;
            return z;
        }

        @Override // android.os.FileObserver
        public void onEvent(int i, String str) {
            if (i == 2) {
                this.isUpdated = true;
            }
        }
    }

    public interface AudioPlayerListener {
        void onAudioPlaybackCompleted();
    }

    private AudioPlayerManager() {
        initAudioFocusListener();
    }

    public static AudioPlayerManager getInstance() {
        if (sInstance == null) {
            synchronized (AudioPlayerManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new AudioPlayerManager();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    private void initAudioFocusListener() {
        this.mAfChangeListener = new AudioManager.OnAudioFocusChangeListener() { // from class: cf0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                this.f16398a.lambda$initAudioFocusListener$0(i);
            }
        };
    }

    private boolean isMediaPlayerValid(MediaPlayer mediaPlayer) {
        if (mediaPlayer != null && !this.mIsMediaPlayerReleased) {
            try {
                mediaPlayer.getCurrentPosition();
                return true;
            } catch (IllegalStateException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaPlayer状态非法：");
                sb.append(e.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAudioFocusListener$0(int i) {
        try {
            if (i == -3) {
                ReentrantLock reentrantLock = LOCK;
                reentrantLock.lock();
                try {
                    if (isMediaPlayerValid(this.mMediaPlayer) && !this.mIsMediaPlayerReleased && this.mMediaPlayer.isPlaying()) {
                        this.mMediaPlayer.setVolume(0.2f, 0.2f);
                    }
                    reentrantLock.unlock();
                    return;
                } finally {
                }
            }
            if (i == -2) {
                ReentrantLock reentrantLock2 = LOCK;
                reentrantLock2.lock();
                try {
                    if (isMediaPlayerValid(this.mMediaPlayer) && !this.mIsMediaPlayerReleased && this.mMediaPlayer.isPlaying()) {
                        this.mMediaPlayer.pause();
                    }
                    reentrantLock2.unlock();
                    return;
                } finally {
                }
            }
            if (i == -1) {
                stopAudio();
                return;
            }
            if (i != 1) {
                return;
            }
            ReentrantLock reentrantLock3 = LOCK;
            reentrantLock3.lock();
            try {
                if (isMediaPlayerValid(this.mMediaPlayer) && !this.mIsMediaPlayerReleased && this.mMediaPlayer.isPlaying()) {
                    this.mMediaPlayer.setVolume(1.0f, 1.0f);
                }
                reentrantLock3.unlock();
                return;
            } finally {
            }
        } catch (IllegalStateException e) {
            Log.e("AudioPlayerManager", "音频焦点变化处理异常", e);
        }
        Log.e("AudioPlayerManager", "音频焦点变化处理异常", e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyPlaybackCompleted$6() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            AudioPlayerListener audioPlayerListener = this.mAudioPlayerListener;
            if (audioPlayerListener != null) {
                audioPlayerListener.onAudioPlaybackCompleted();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$playAudioFile$1(MediaPlayer mediaPlayer, int i, int i2) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            Log.e("AudioPlayerManager", "MediaPlayer初始化错误: what=" + i + ", extra=" + i2);
            this.mIsPreparing = false;
            resetMediaPlayer();
            notifyPlaybackCompleted();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$2(MediaPlayer mediaPlayer, int i) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            if (mediaPlayer != null) {
                try {
                    if (this.mMediaPlayer == mediaPlayer && !this.mIsMediaPlayerReleased && this.mIsPreparing) {
                        yi9.m26092e("playAudioFile", "onPrepared: 开始配置播放参数 type=" + i);
                        this.mIsPreparing = false;
                        setupAudioPlayMode(i);
                        int i2 = this.mCurPosition;
                        if (i2 > 0 && i2 < mediaPlayer.getDuration()) {
                            mediaPlayer.seekTo(this.mCurPosition);
                        }
                        requestAudioFocus();
                        if (!this.mIsMediaPlayerReleased && isMediaPlayerValid(mediaPlayer) && !mediaPlayer.isPlaying()) {
                            mediaPlayer.start();
                        }
                        reentrantLock.unlock();
                        return;
                    }
                } catch (IllegalStateException e) {
                    Log.e("AudioPlayerManager", "onPrepared执行异常", e);
                    this.mIsPreparing = false;
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                    LOCK.unlock();
                    return;
                }
            }
            yi9.m26092e("playAudioFile", "onPrepared: MediaPlayer已失效，跳过播放");
            this.mIsPreparing = false;
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$3(final int i, final MediaPlayer mediaPlayer) {
        this.mMainHandler.post(new Runnable() { // from class: we0
            @Override // java.lang.Runnable
            public final void run() {
                this.f94016a.lambda$playAudioFile$2(mediaPlayer, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$4(MediaPlayer mediaPlayer, AudioManager audioManager, File file, int i) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            try {
                AudioFileObserver audioFileObserver = this.mFileObserver;
                if (audioFileObserver == null || !audioFileObserver.isFileUpdated()) {
                    this.mCurPosition = 0;
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                } else {
                    this.mCurPosition = isMediaPlayerValid(mediaPlayer) ? mediaPlayer.getDuration() : 0;
                    playAudioFile(audioManager, file, i);
                }
                reentrantLock.unlock();
            } catch (IllegalStateException e) {
                Log.e("AudioPlayerManager", "播放完成处理异常", e);
                resetMediaPlayer();
                notifyPlaybackCompleted();
                LOCK.unlock();
            }
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$5(final AudioManager audioManager, final File file, final int i, final MediaPlayer mediaPlayer) {
        this.mMainHandler.post(new Runnable() { // from class: af0
            @Override // java.lang.Runnable
            public final void run() {
                this.f1272a.lambda$playAudioFile$4(mediaPlayer, audioManager, file, i);
            }
        });
    }

    private void notifyPlaybackCompleted() {
        this.mMainHandler.post(new Runnable() { // from class: ye0
            @Override // java.lang.Runnable
            public final void run() {
                this.f101276a.lambda$notifyPlaybackCompleted$6();
            }
        });
    }

    private void releaseAudioFocus() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager != null) {
            try {
                audioManager.abandonAudioFocus(this.mAfChangeListener);
            } catch (IllegalStateException e) {
                Log.e("AudioPlayerManager", "释放音频焦点异常", e);
            }
        }
    }

    private void requestAudioFocus() {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null || audioManager.requestAudioFocus(this.mAfChangeListener, 3, 1) == 1) {
            return;
        }
        Log.w("AudioPlayerManager", "音频焦点请求失败，可能影响播放体验");
    }

    private void resetMediaPlayer() {
        LOCK.lock();
        try {
            yi9.m26092e("playAudioFile", "resetMediaPlayer 执行");
            this.mIsMediaPlayerReleased = true;
            this.mIsPreparing = false;
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                try {
                    try {
                        mediaPlayer.setOnPreparedListener(null);
                        this.mMediaPlayer.setOnCompletionListener(null);
                        this.mMediaPlayer.setOnErrorListener(null);
                        this.mMediaPlayer.setOnSeekCompleteListener(null);
                        if (isMediaPlayerValid(this.mMediaPlayer)) {
                            if (this.mMediaPlayer.isPlaying()) {
                                this.mMediaPlayer.stop();
                            }
                            this.mMediaPlayer.reset();
                            this.mMediaPlayer.release();
                        }
                    } catch (IllegalStateException e) {
                        Log.e("AudioPlayerManager", "重置MediaPlayer异常", e);
                    }
                    this.mMediaPlayer = null;
                } catch (Throwable th) {
                    this.mMediaPlayer = null;
                    throw th;
                }
            }
            this.mMediaPlayer = new MediaPlayer();
            this.mIsMediaPlayerReleased = false;
        } finally {
            LOCK.unlock();
        }
    }

    private void setupAudioPlayMode(int i) {
        AudioManager audioManager = this.mAudioManager;
        if (audioManager == null) {
            return;
        }
        try {
            if (i != 1 && i == 2) {
                audioManager.setMode(3);
                this.mAudioManager.setSpeakerphoneOn(true);
            } else {
                audioManager.setMode(0);
                this.mAudioManager.setSpeakerphoneOn(false);
            }
        } catch (IllegalStateException e) {
            e = e;
            Log.e("AudioPlayerManager", "设置音频模式异常", e);
        } catch (SecurityException e2) {
            e = e2;
            Log.e("AudioPlayerManager", "设置音频模式异常", e);
        }
    }

    private void stopAudioInternal() {
        try {
            if (this.mMediaPlayer == null || this.mIsMediaPlayerReleased || !isMediaPlayerValid(this.mMediaPlayer) || !this.mMediaPlayer.isPlaying()) {
                return;
            }
            this.mMediaPlayer.stop();
        } catch (IllegalStateException e) {
            Log.e("AudioPlayerManager", "内部停止音频异常", e);
        }
    }

    private void stopFileObserver() {
        yi9.m26092e("playAudioFile", "stopFileObserver 执行");
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            AudioFileObserver audioFileObserver = this.mFileObserver;
            if (audioFileObserver != null) {
                audioFileObserver.stopWatching();
                this.mFileObserver = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    public void audioStopMusic(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || audioManager.requestAudioFocus(this.mAfChangeListener, 3, 1) == 1) {
            return;
        }
        Log.w("AudioPlayerManager", "音频焦点抢占失败，第三方音乐可能未停止");
    }

    public void destroy() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            stopAudio();
            this.mAudioPlayerListener = null;
            this.mAudioManager = null;
            this.mAfChangeListener = null;
            this.mIsMediaPlayerReleased = true;
            this.mIsPreparing = false;
            sInstance = null;
            this.mMainHandler.removeCallbacksAndMessages(null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    public boolean isPlaying() {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        boolean z = false;
        try {
            try {
                if (this.mMediaPlayer != null && !this.mIsMediaPlayerReleased && !this.mIsPreparing) {
                    if (isMediaPlayerValid(this.mMediaPlayer)) {
                        if (this.mMediaPlayer.isPlaying()) {
                            z = true;
                        }
                    }
                    reentrantLock.unlock();
                    return z;
                }
                reentrantLock.unlock();
                return false;
            } catch (IllegalStateException e) {
                Log.e("AudioPlayerManager", "isPlaying()异常", e);
                LOCK.unlock();
                return false;
            }
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    public void playAudioFile(final AudioManager audioManager, final File file, final int i) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            stopAudioInternal();
            if (file != null && file.exists() && file.length() != 0) {
                yi9.m26092e("playAudioFile", "isPlaying()-----------------------------------------" + isPlaying());
                this.mAudioManager = audioManager;
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append("playAudioFile type =");
                sb.append(i);
                sb.append("::::");
                sb.append(absolutePath);
                sb.append(":::");
                sb.append(this.mLastFilePath);
                if (!this.mLastFilePath.equals(absolutePath)) {
                    this.mCurPosition = 0;
                }
                this.mLastFilePath = absolutePath;
                stopFileObserver();
                AudioFileObserver audioFileObserver = new AudioFileObserver(absolutePath);
                this.mFileObserver = audioFileObserver;
                audioFileObserver.startWatching();
                resetMediaPlayer();
                this.mIsPreparing = true;
                this.mMediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: qe0
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i2, int i3) {
                        return this.f74096a.lambda$playAudioFile$1(mediaPlayer, i2, i3);
                    }
                });
                this.mMediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: se0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        this.f81510a.lambda$playAudioFile$3(i, mediaPlayer);
                    }
                });
                this.mMediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ue0
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        this.f87764a.lambda$playAudioFile$5(audioManager, file, i, mediaPlayer);
                    }
                });
                try {
                    this.mMediaPlayer.setDataSource(absolutePath);
                    this.mMediaPlayer.setAudioStreamType(i == 2 ? 0 : 3);
                    this.mMediaPlayer.prepareAsync();
                    yi9.m26092e("playAudioFile", "prepareAsync已调用，等待onPrepared回调");
                } catch (IOException e) {
                    Log.e("AudioPlayerManager", "setDataSource或prepareAsync失败", e);
                    this.mIsPreparing = false;
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                }
                LOCK.unlock();
                return;
            }
            yi9.m26092e("playAudioFile", "文件无效或为空！");
            notifyPlaybackCompleted();
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    public void setAudioPlayerListener(AudioPlayerListener audioPlayerListener) {
        ReentrantLock reentrantLock = LOCK;
        reentrantLock.lock();
        try {
            this.mAudioPlayerListener = audioPlayerListener;
            reentrantLock.unlock();
        } catch (Throwable th) {
            LOCK.unlock();
            throw th;
        }
    }

    public void stopAudio() {
        LOCK.lock();
        try {
            this.mCurPosition = 0;
            this.mIsMediaPlayerReleased = true;
            this.mIsPreparing = false;
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                try {
                    try {
                        mediaPlayer.setOnPreparedListener(null);
                        this.mMediaPlayer.setOnCompletionListener(null);
                        this.mMediaPlayer.setOnErrorListener(null);
                        this.mMediaPlayer.setOnSeekCompleteListener(null);
                        if (isMediaPlayerValid(this.mMediaPlayer) && this.mMediaPlayer.isPlaying()) {
                            this.mMediaPlayer.stop();
                        }
                        this.mMediaPlayer.release();
                    } catch (IllegalStateException e) {
                        Log.e("AudioPlayerManager", "停止MediaPlayer异常", e);
                    }
                    this.mMediaPlayer = null;
                } catch (Throwable th) {
                    this.mMediaPlayer = null;
                    throw th;
                }
            }
            stopFileObserver();
            releaseAudioFocus();
            this.mLastFilePath = "";
        } finally {
            LOCK.unlock();
        }
    }
}
