package com.eyevue.glassapp.view.translate.simultaneous;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.FileObserver;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.common.C2531R;
import com.watchfun.base.BaseApplication;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.ReentrantLock;
import p000.pj4;

/* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a */
/* JADX INFO: loaded from: classes4.dex */
public class C2957a {

    /* JADX INFO: renamed from: m */
    public static final String f19278m = "AudioPlayerManager";

    /* JADX INFO: renamed from: n */
    public static final ReentrantLock f19279n = new ReentrantLock();

    /* JADX INFO: renamed from: o */
    public static C2957a f19280o;

    /* JADX INFO: renamed from: a */
    public int f19281a;

    /* JADX INFO: renamed from: b */
    public MediaPlayer f19282b;

    /* JADX INFO: renamed from: c */
    public e f19283c;

    /* JADX INFO: renamed from: d */
    public d f19284d;

    /* JADX INFO: renamed from: e */
    public int f19285e;

    /* JADX INFO: renamed from: f */
    public AudioManager f19286f;

    /* JADX INFO: renamed from: h */
    public AudioManager.OnAudioFocusChangeListener f19288h;

    /* JADX INFO: renamed from: g */
    public String f19287g = "";

    /* JADX INFO: renamed from: i */
    public volatile boolean f19289i = false;

    /* JADX INFO: renamed from: j */
    public volatile boolean f19290j = false;

    /* JADX INFO: renamed from: k */
    public final Handler f19291k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: l */
    public final Runnable f19292l = new c();

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a$a */
    public class a implements MediaPlayer.OnSeekCompleteListener {
        public a() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mp) {
            C2957a.this.requestAudioFocus();
            if (!C2957a.this.f19289i && C2957a.this.isMediaPlayerValid(mp) && !mp.isPlaying()) {
                mp.start();
            }
            C2957a.this.f19291k.postDelayed(C2957a.this.f19292l, 200L);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a$b */
    public class b implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f19294a;

        public b(final int val$resId) {
            this.f19294a = val$resId;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mp) {
            if (this.f19294a == C2531R.raw.ai_thinking_music) {
                C2957a c2957a = C2957a.this;
                c2957a.playRaw(c2957a.f19281a);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a$c */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C2957a.this.f19282b != null) {
                C2957a c2957a = C2957a.this;
                c2957a.f19285e = c2957a.f19282b.getCurrentPosition();
            }
            C2957a.this.f19291k.postDelayed(C2957a.this.f19292l, 200L);
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a$d */
    public static class d extends FileObserver {

        /* JADX INFO: renamed from: a */
        public volatile boolean f19297a;

        public d(String path) {
            super(path, 2);
            this.f19297a = false;
        }

        public boolean isFileUpdated() {
            boolean z = this.f19297a;
            this.f19297a = false;
            return z;
        }

        @Override // android.os.FileObserver
        public void onEvent(int event, String path) {
            if (event == 2) {
                this.f19297a = true;
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.view.translate.simultaneous.a$e */
    public interface e {
        void onAudioPlaybackCompleted();
    }

    private C2957a() {
        initAudioFocusListener();
    }

    public static C2957a getInstance() {
        if (f19280o == null) {
            synchronized (C2957a.class) {
                try {
                    if (f19280o == null) {
                        f19280o = new C2957a();
                    }
                } finally {
                }
            }
        }
        return f19280o;
    }

    private void initAudioFocusListener() {
        this.f19288h = new AudioManager.OnAudioFocusChangeListener() { // from class: te0
            @Override // android.media.AudioManager.OnAudioFocusChangeListener
            public final void onAudioFocusChange(int i) {
                this.f84374a.lambda$initAudioFocusListener$0(i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isMediaPlayerValid(MediaPlayer mp) {
        if (mp != null && !this.f19289i) {
            try {
                mp.getCurrentPosition();
                return true;
            } catch (IllegalStateException e2) {
                StringBuilder sb = new StringBuilder();
                sb.append("MediaPlayer状态非法：");
                sb.append(e2.getMessage());
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initAudioFocusListener$0(int i) {
        try {
            if (i == -3) {
                ReentrantLock reentrantLock = f19279n;
                reentrantLock.lock();
                try {
                    if (isMediaPlayerValid(this.f19282b) && !this.f19289i && this.f19282b.isPlaying()) {
                        this.f19282b.setVolume(0.2f, 0.2f);
                    }
                    reentrantLock.unlock();
                    return;
                } finally {
                }
            }
            if (i == -2) {
                ReentrantLock reentrantLock2 = f19279n;
                reentrantLock2.lock();
                try {
                    if (isMediaPlayerValid(this.f19282b) && !this.f19289i && this.f19282b.isPlaying()) {
                        this.f19282b.pause();
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
            ReentrantLock reentrantLock3 = f19279n;
            reentrantLock3.lock();
            try {
                if (isMediaPlayerValid(this.f19282b) && !this.f19289i && this.f19282b.isPlaying()) {
                    this.f19282b.setVolume(1.0f, 1.0f);
                }
                reentrantLock3.unlock();
                return;
            } finally {
            }
        } catch (IllegalStateException e2) {
            Log.e(f19278m, "音频焦点变化处理异常", e2);
        }
        Log.e(f19278m, "音频焦点变化处理异常", e2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$notifyPlaybackCompleted$6() {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            e eVar = this.f19283c;
            if (eVar != null) {
                eVar.onAudioPlaybackCompleted();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$playAudioFile$1(MediaPlayer mediaPlayer, int i, int i2) {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            Log.e(f19278m, "MediaPlayer初始化错误: what=" + i + ", extra=" + i2);
            this.f19290j = false;
            resetMediaPlayer();
            notifyPlaybackCompleted();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$2(MediaPlayer mediaPlayer, int i) {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            if (mediaPlayer != null) {
                try {
                    if (this.f19282b == mediaPlayer && !this.f19289i && this.f19290j) {
                        C2473f.m4168e("playAudioFile", "onPrepared: 开始配置播放参数 type=" + i);
                        this.f19290j = false;
                        setupAudioPlayMode(i);
                        int i2 = this.f19285e;
                        if (i2 <= 0 || i2 >= mediaPlayer.getDuration()) {
                            requestAudioFocus();
                            if (!this.f19289i && isMediaPlayerValid(mediaPlayer) && !mediaPlayer.isPlaying()) {
                                mediaPlayer.start();
                            }
                            this.f19291k.postDelayed(this.f19292l, 200L);
                        } else {
                            mediaPlayer.seekTo(this.f19285e);
                            mediaPlayer.setOnSeekCompleteListener(new a());
                        }
                        reentrantLock.unlock();
                        return;
                    }
                } catch (IllegalStateException e2) {
                    Log.e(f19278m, "onPrepared执行异常", e2);
                    this.f19290j = false;
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                    f19279n.unlock();
                    return;
                }
            }
            C2473f.m4168e("playAudioFile", "onPrepared: MediaPlayer已失效，跳过播放");
            this.f19290j = false;
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$3(final int i, final MediaPlayer mediaPlayer) {
        this.f19291k.post(new Runnable() { // from class: ze0
            @Override // java.lang.Runnable
            public final void run() {
                this.f104872a.lambda$playAudioFile$2(mediaPlayer, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$4(MediaPlayer mediaPlayer, AudioManager audioManager, File file, int i) {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            try {
                d dVar = this.f19284d;
                if (dVar == null || !dVar.isFileUpdated()) {
                    this.f19285e = 0;
                    this.f19291k.removeCallbacks(this.f19292l);
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                } else {
                    this.f19285e = isMediaPlayerValid(mediaPlayer) ? mediaPlayer.getDuration() : 0;
                    playAudioFile(audioManager, file, i);
                }
                reentrantLock.unlock();
            } catch (IllegalStateException e2) {
                this.f19291k.removeCallbacks(this.f19292l);
                Log.e(f19278m, "播放完成处理异常", e2);
                resetMediaPlayer();
                notifyPlaybackCompleted();
                f19279n.unlock();
            }
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAudioFile$5(final AudioManager audioManager, final File file, final int i, final MediaPlayer mediaPlayer) {
        this.f19291k.post(new Runnable() { // from class: ve0
            @Override // java.lang.Runnable
            public final void run() {
                this.f90758a.lambda$playAudioFile$4(mediaPlayer, audioManager, file, i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playRaw$7(MediaPlayer mediaPlayer) {
        this.f19282b.start();
    }

    private void notifyPlaybackCompleted() {
        this.f19291k.post(new Runnable() { // from class: re0
            @Override // java.lang.Runnable
            public final void run() {
                this.f77973a.lambda$notifyPlaybackCompleted$6();
            }
        });
    }

    private void releaseAudioFocus() {
        AudioManager audioManager = this.f19286f;
        if (audioManager != null) {
            try {
                audioManager.abandonAudioFocus(this.f19288h);
            } catch (IllegalStateException e2) {
                Log.e(f19278m, "释放音频焦点异常", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void requestAudioFocus() {
        AudioManager audioManager = this.f19286f;
        if (audioManager == null || audioManager.requestAudioFocus(this.f19288h, 3, 1) == 1) {
            return;
        }
        Log.w(f19278m, "音频焦点请求失败，可能影响播放体验");
    }

    private void resetMediaPlayer() {
        f19279n.lock();
        try {
            C2473f.m4168e("playAudioFile", "resetMediaPlayer 执行");
            this.f19289i = true;
            this.f19290j = false;
            MediaPlayer mediaPlayer = this.f19282b;
            if (mediaPlayer != null) {
                try {
                    try {
                        mediaPlayer.setOnPreparedListener(null);
                        this.f19282b.setOnCompletionListener(null);
                        this.f19282b.setOnErrorListener(null);
                        this.f19282b.setOnSeekCompleteListener(null);
                        if (isMediaPlayerValid(this.f19282b)) {
                            if (this.f19282b.isPlaying()) {
                                this.f19282b.stop();
                            }
                            this.f19282b.reset();
                            this.f19282b.release();
                        }
                    } catch (IllegalStateException e2) {
                        Log.e(f19278m, "重置MediaPlayer异常", e2);
                    }
                    this.f19282b = null;
                } catch (Throwable th) {
                    this.f19282b = null;
                    throw th;
                }
            }
            this.f19282b = new MediaPlayer();
            this.f19289i = false;
        } finally {
            f19279n.unlock();
        }
    }

    private void setupAudioPlayMode(int type) {
        AudioManager audioManager = this.f19286f;
        if (audioManager == null) {
            return;
        }
        try {
            if (type != 1 && type == 2) {
                audioManager.setMode(3);
                this.f19286f.setSpeakerphoneOn(true);
            } else {
                audioManager.setMode(0);
                this.f19286f.setSpeakerphoneOn(false);
            }
        } catch (IllegalStateException e2) {
            e = e2;
            Log.e(f19278m, "设置音频模式异常", e);
        } catch (SecurityException e3) {
            e = e3;
            Log.e(f19278m, "设置音频模式异常", e);
        }
    }

    private void stopAudioInternal() {
        try {
            if (this.f19282b == null || this.f19289i || !isMediaPlayerValid(this.f19282b) || !this.f19282b.isPlaying()) {
                return;
            }
            this.f19282b.stop();
        } catch (IllegalStateException e2) {
            Log.e(f19278m, "内部停止音频异常", e2);
        }
    }

    private void stopFileObserver() {
        C2473f.m4168e("playAudioFile", "stopFileObserver 执行");
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            d dVar = this.f19284d;
            if (dVar != null) {
                dVar.stopWatching();
                this.f19284d = null;
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    public void audioStopMusic(Context context) {
        AudioManager audioManager;
        if (context == null || (audioManager = (AudioManager) context.getSystemService("audio")) == null || audioManager.requestAudioFocus(this.f19288h, 3, 1) == 1) {
            return;
        }
        Log.w(f19278m, "音频焦点抢占失败，第三方音乐可能未停止");
    }

    public void destroy() {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            stopAudio();
            this.f19283c = null;
            this.f19286f = null;
            this.f19288h = null;
            this.f19289i = true;
            this.f19290j = false;
            f19280o = null;
            this.f19291k.removeCallbacksAndMessages(null);
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    public int getDurtion() {
        MediaPlayer mediaPlayer = this.f19282b;
        if (mediaPlayer != null) {
            return mediaPlayer.getDuration();
        }
        return 0;
    }

    public boolean isPlaying() {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        boolean z = false;
        try {
            try {
                if (this.f19282b != null && !this.f19289i && !this.f19290j) {
                    if (isMediaPlayerValid(this.f19282b)) {
                        if (this.f19282b.isPlaying()) {
                            z = true;
                        }
                    }
                    reentrantLock.unlock();
                    return z;
                }
                reentrantLock.unlock();
                return false;
            } catch (IllegalStateException e2) {
                Log.e(f19278m, "isPlaying()异常", e2);
                f19279n.unlock();
                return false;
            }
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    public void pause() {
        MediaPlayer mediaPlayer = this.f19282b;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            this.f19282b.pause();
        }
        this.f19291k.removeCallbacks(this.f19292l);
    }

    public void playAudioFile(final AudioManager audioManager, final File file, final int type) {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            stopAudioInternal();
            if (file != null && file.exists() && file.length() != 0) {
                C2473f.m4168e("playAudioFile", "isPlaying()-----------------------------------------" + isPlaying());
                this.f19286f = audioManager;
                String absolutePath = file.getAbsolutePath();
                StringBuilder sb = new StringBuilder();
                sb.append("playAudioFile type =");
                sb.append(type);
                sb.append("::::");
                sb.append(absolutePath);
                sb.append(":::");
                sb.append(this.f19287g);
                if (!this.f19287g.equals(absolutePath)) {
                    this.f19285e = 0;
                }
                this.f19287g = absolutePath;
                stopFileObserver();
                d dVar = new d(absolutePath);
                this.f19284d = dVar;
                dVar.startWatching();
                resetMediaPlayer();
                this.f19290j = true;
                this.f19282b.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: bf0
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                        return this.f13597a.lambda$playAudioFile$1(mediaPlayer, i, i2);
                    }
                });
                this.f19282b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: df0
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        this.f29547a.lambda$playAudioFile$3(type, mediaPlayer);
                    }
                });
                this.f19282b.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ef0
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        this.f32785a.lambda$playAudioFile$5(audioManager, file, type, mediaPlayer);
                    }
                });
                try {
                    this.f19282b.setDataSource(absolutePath);
                    this.f19282b.setAudioStreamType(type == 2 ? 0 : 3);
                    this.f19282b.prepareAsync();
                    C2473f.m4168e("playAudioFile", "prepareAsync已调用，等待onPrepared回调");
                } catch (IOException e2) {
                    Log.e(f19278m, "setDataSource或prepareAsync失败", e2);
                    this.f19290j = false;
                    resetMediaPlayer();
                    notifyPlaybackCompleted();
                }
                f19279n.unlock();
                return;
            }
            C2473f.m4168e("playAudioFile", "文件无效或为空！");
            notifyPlaybackCompleted();
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    public void playRaw(int resId) {
        try {
            this.f19281a = resId;
            MediaPlayer mediaPlayer = this.f19282b;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                this.f19282b.reset();
            } else {
                this.f19282b = new MediaPlayer();
            }
            this.f19282b.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f19282b.setDataSource(BaseApplication.getInstance(), Uri.parse("android.resource://" + BaseApplication.getInstance().getPackageName() + pj4.f71071b + resId));
            this.f19282b.prepareAsync();
            this.f19282b.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: xe0
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    this.f97575a.lambda$playRaw$7(mediaPlayer2);
                }
            });
            this.f19282b.setOnCompletionListener(new b(resId));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public void seek(int curPosition) {
        MediaPlayer mediaPlayer = this.f19282b;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(curPosition);
        }
    }

    public void setAudioPlayerListener(e listener) {
        ReentrantLock reentrantLock = f19279n;
        reentrantLock.lock();
        try {
            this.f19283c = listener;
            reentrantLock.unlock();
        } catch (Throwable th) {
            f19279n.unlock();
            throw th;
        }
    }

    public void stopAudio() {
        f19279n.lock();
        try {
            this.f19285e = 0;
            this.f19291k.removeCallbacks(this.f19292l);
            this.f19289i = true;
            this.f19290j = false;
            MediaPlayer mediaPlayer = this.f19282b;
            if (mediaPlayer != null) {
                try {
                    try {
                        mediaPlayer.setOnPreparedListener(null);
                        this.f19282b.setOnCompletionListener(null);
                        this.f19282b.setOnErrorListener(null);
                        this.f19282b.setOnSeekCompleteListener(null);
                        if (isMediaPlayerValid(this.f19282b) && this.f19282b.isPlaying()) {
                            this.f19282b.stop();
                        }
                        this.f19282b.release();
                    } catch (IllegalStateException e2) {
                        Log.e(f19278m, "停止MediaPlayer异常", e2);
                    }
                    this.f19282b = null;
                } catch (Throwable th) {
                    this.f19282b = null;
                    throw th;
                }
            }
            stopFileObserver();
            releaseAudioFocus();
            this.f19287g = "";
        } finally {
            f19279n.unlock();
        }
    }
}
