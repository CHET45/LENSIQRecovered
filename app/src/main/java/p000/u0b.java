package p000;

import android.content.Context;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.C1226e;
import androidx.media3.exoplayer.ExoPlayer;
import java.util.concurrent.LinkedBlockingQueue;
import p000.gh3;
import p000.hfd;
import p000.izc;
import p000.nfa;
import p000.uc0;

/* JADX INFO: loaded from: classes6.dex */
public class u0b {

    /* JADX INFO: renamed from: l */
    public static final String f86478l = "fgsdgdgMp3PlayerThread";

    /* JADX INFO: renamed from: a */
    public ExoPlayer f86479a;

    /* JADX INFO: renamed from: b */
    public v0b f86480b;

    /* JADX INFO: renamed from: c */
    @igg({"UnsafeOptInUsageError"})
    public hfd.C6836b f86481c;

    /* JADX INFO: renamed from: d */
    public AudioManager f86482d;

    /* JADX INFO: renamed from: i */
    public mp7 f86487i;

    /* JADX INFO: renamed from: j */
    public final Context f86488j;

    /* JADX INFO: renamed from: e */
    public EnumC13307d f86483e = EnumC13307d.SPEAKER;

    /* JADX INFO: renamed from: f */
    public volatile EnumC13308e f86484f = EnumC13308e.IDLE;

    /* JADX INFO: renamed from: g */
    public final LinkedBlockingQueue<byte[]> f86485g = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: h */
    public boolean f86486h = false;

    /* JADX INFO: renamed from: k */
    public Handler f86489k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: u0b$a */
    public class C13304a implements gh3.InterfaceC6313a {
        public C13304a() {
        }

        @Override // p000.gh3.InterfaceC6313a
        @igg({"UnsafeOptInUsageError"})
        public gh3 createDataSource() {
            return u0b.this.f86480b;
        }
    }

    /* JADX INFO: renamed from: u0b$b */
    public class C13305b implements izc.InterfaceC7680g {
        public C13305b() {
        }

        @Override // p000.izc.InterfaceC7680g
        public void onIsPlayingChanged(boolean z) {
            int playbackSuppressionReason;
            ji9.m14108d(u0b.f86478l, " MP3 Player isPlaying changed: " + z);
            if (z && u0b.this.f86484f == EnumC13308e.READY) {
                u0b.this.f86484f = EnumC13308e.PLAYING;
            } else if (!z && u0b.this.f86484f == EnumC13308e.PLAYING) {
                u0b.this.f86484f = EnumC13308e.READY;
            }
            if (u0b.this.f86487i != null) {
                u0b.this.f86487i.onPlayingChanged(z);
            }
            if (!z && (playbackSuppressionReason = u0b.this.f86479a.getPlaybackSuppressionReason()) != 0) {
                ji9.m14108d(u0b.f86478l, " MP3 Player isPlaying playbackSuppressionReason: " + playbackSuppressionReason);
                if (u0b.this.f86487i != null) {
                    u0b.this.f86487i.onPlaybackIsSuppressed();
                }
            }
            u0b.this.notifyStateChanged();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayWhenReadyChanged(boolean z, int i) {
            if (i == 2) {
                ji9.m14109e(u0b.f86478l, "播放被暂停：音频焦点已被其他应用占用");
                if (u0b.this.f86487i != null) {
                    u0b.this.f86487i.onPlaybackAudioFocusLoss();
                }
            }
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlaybackStateChanged(int i) {
            ji9.m14108d(u0b.f86478l, "Playback state changed: " + i);
            if (i == 1) {
                ji9.m14108d(u0b.f86478l, "MP3 Player idle");
                u0b.this.f86484f = EnumC13308e.IDLE;
            } else if (i == 2) {
                ji9.m14108d(u0b.f86478l, "MP3 Player buffering");
                u0b.this.f86484f = EnumC13308e.BUFFERING;
            } else if (i == 3) {
                ji9.m14108d(u0b.f86478l, "MP3 Player ready");
                u0b.this.f86484f = EnumC13308e.READY;
                u0b.this.startPlayback();
            } else if (i == 4) {
                ji9.m14108d(u0b.f86478l, "MP3 Player playback ended");
                if (u0b.this.f86487i != null) {
                    u0b.this.f86487i.audioPlayEnd();
                }
                u0b.this.f86479a.stop();
                u0b.this.f86479a.seekTo(0L);
            }
            u0b.this.notifyStateChanged();
        }

        @Override // p000.izc.InterfaceC7680g
        public void onPlayerError(kyc kycVar) {
            ji9.m14109e(u0b.f86478l, "MP3 Player error: " + kycVar.getMessage() + ", errorCode: " + kycVar.f55703a);
            u0b.this.f86484f = EnumC13308e.ERROR;
            if (kycVar.f55703a == 3003) {
                u0b.this.reseatMediaSource();
            }
            u0b.this.notifyStateChanged();
        }
    }

    /* JADX INFO: renamed from: u0b$c */
    public static /* synthetic */ class C13306c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f86492a;

        static {
            int[] iArr = new int[EnumC13307d.values().length];
            f86492a = iArr;
            try {
                iArr[EnumC13307d.SPEAKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f86492a[EnumC13307d.EARPIECE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: u0b$d */
    public enum EnumC13307d {
        SPEAKER,
        EARPIECE
    }

    /* JADX INFO: renamed from: u0b$e */
    public enum EnumC13308e {
        IDLE,
        INITIALIZING,
        READY,
        PLAYING,
        BUFFERING,
        ERROR,
        SHUTDOWN
    }

    public u0b(Context context) {
        this.f86488j = context.getApplicationContext();
        this.f86482d = (AudioManager) context.getSystemService("audio");
        initializePlayer();
    }

    @igg({"UnsafeOptInUsageError"})
    private void clearAndPrepare() {
        hfd hfdVarCreateMediaSource = this.f86481c.createMediaSource(new nfa.C9851c().setUri(Uri.EMPTY).setMimeType("audio/mpeg").build());
        this.f86479a.clearMediaItems();
        this.f86479a.setMediaSource(hfdVarCreateMediaSource);
        this.f86479a.prepare();
    }

    private uc0 createAudioAttributes(EnumC13307d enumC13307d) {
        uc0.C13483e c13483e = new uc0.C13483e();
        int i = C13306c.f86492a[enumC13307d.ordinal()];
        if (i == 1 || i == 2) {
            c13483e.setUsage(2).setContentType(1);
        }
        return c13483e.build();
    }

    @igg({"UnsafeOptInUsageError"})
    private void initializePlayer() {
        try {
            this.f86484f = EnumC13308e.INITIALIZING;
            this.f86480b = new v0b(this.f86485g);
            this.f86481c = new hfd.C6836b(new C13304a(), new ik5() { // from class: t0b
                @Override // p000.ik5
                public final xj5[] createExtractors() {
                    return u0b.lambda$initializePlayer$0();
                }
            });
            this.f86479a = new ExoPlayer.C1219b(this.f86488j).setLoadControl(new C1226e.b().setBufferDurationsMs(100, 1000, 100, 80).setTargetBufferBytes(-1).setPrioritizeTimeOverSizeThresholds(true).setBackBuffer(0, false).build()).build();
            this.f86479a.setAudioAttributes(createAudioAttributes(this.f86483e), true);
            this.f86479a.setHandleAudioBecomingNoisy(true);
            setVolume(amc.f2090y);
            this.f86479a.addListener(new C13305b());
            this.f86479a.setMediaSource(this.f86481c.createMediaSource(new nfa.C9851c().setUri(Uri.EMPTY).setMimeType("audio/mpeg").build()));
            this.f86479a.prepare();
            ji9.m14110i(f86478l, "MP3 player initialized successfully");
        } catch (Exception e) {
            ji9.m14109e(f86478l, "Failed to initialize MP3 player: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$initializePlayer$0() {
        return new xj5[]{new r0b(1)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyStateChanged() {
        ji9.m14108d(f86478l, "Player state changed to: " + this.f86484f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"UnsafeOptInUsageError"})
    public void reseatMediaSource() {
        hfd hfdVarCreateMediaSource = this.f86481c.createMediaSource(new nfa.C9851c().setUri(Uri.EMPTY).setMimeType("audio/mpeg").build());
        this.f86479a.clearMediaItems();
        this.f86479a.setMediaSource(hfdVarCreateMediaSource);
        this.f86479a.prepare();
    }

    public void addAudioData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return;
        }
        if (this.f86484f == EnumC13308e.PLAYING || this.f86484f == EnumC13308e.READY || this.f86484f == EnumC13308e.BUFFERING) {
            if (!this.f86485g.offer(bArr)) {
                ji9.m14111w(f86478l, "MP3 queue full, data discarded");
                return;
            }
            ji9.m14108d(f86478l, "MP3 data added to queue, size: " + bArr.length + " bytes, queue size: " + this.f86485g.size() + ", state: " + this.f86484f);
        }
    }

    @igg({"UnsafeOptInUsageError"})
    public void clearAudioQueue(boolean z) {
        pausePlayback();
        this.f86485g.clear();
        this.f86486h = false;
        ji9.m14110i(f86478l, "MP3 audio queue cleared, state: " + this.f86484f);
    }

    public EnumC13307d getCurrentAudioMode() {
        return this.f86483e;
    }

    public EnumC13308e getCurrentState() {
        return this.f86484f;
    }

    public int getQueueSize() {
        return this.f86485g.size();
    }

    public boolean isPlayerReady() {
        ExoPlayer exoPlayer = this.f86479a;
        return exoPlayer != null && exoPlayer.getPlayWhenReady();
    }

    public Boolean isSoundPlaying() {
        ExoPlayer exoPlayer = this.f86479a;
        return Boolean.valueOf(exoPlayer != null && exoPlayer.isPlaying());
    }

    public void pausePlayback() {
        ExoPlayer exoPlayer = this.f86479a;
        if (exoPlayer != null) {
            exoPlayer.setPlayWhenReady(false);
            this.f86479a.stop();
            v0b v0bVar = this.f86480b;
            if (v0bVar != null) {
                v0bVar.clearBuffer();
                this.f86480b.markStreamEnded();
            }
            ji9.m14110i(f86478l, "MP3 playback paused, state: " + this.f86484f);
            notifyStateChanged();
        }
    }

    public void resumePlayback() {
        startPlayback();
    }

    public void setAudioPlayerTime(mp7 mp7Var) {
        ji9.m14108d(f86478l, mp7Var + " MP3 Player isPlaying changed:0000 ");
        this.f86487i = mp7Var;
    }

    public void setIsAudioEnd(boolean z) {
        if (this.f86480b != null) {
            this.f86485g.add(C12471s7.generate300msSilentMp3());
            this.f86485g.add(C12471s7.generate300msSilentMp3());
            this.f86480b.markStreamEnded();
        }
        ji9.m14108d(f86478l, "MP3 audio end flag set to: " + z);
    }

    public void setVolume(boolean z) {
        ExoPlayer exoPlayer = this.f86479a;
        if (exoPlayer != null) {
            float f = z ? 0.0f : 1.0f;
            exoPlayer.setVolume(f);
            ji9.m14108d(f86478l, "MP3 volume set to: " + f);
        }
    }

    public void shutdown() {
        this.f86484f = EnumC13308e.SHUTDOWN;
        AudioManager audioManager = this.f86482d;
        if (audioManager != null) {
            try {
                audioManager.setMode(0);
                this.f86482d.setSpeakerphoneOn(true);
            } catch (Exception e) {
                ji9.m14109e(f86478l, "Failed to reset audio mode: " + e.getMessage());
            }
        }
        ExoPlayer exoPlayer = this.f86479a;
        if (exoPlayer != null) {
            exoPlayer.stop();
            this.f86479a.release();
            this.f86479a = null;
        }
        clearAudioQueue(false);
        ji9.m14110i(f86478l, "MP3 player shutdown completed");
    }

    public void startPlayback() {
        if (this.f86479a != null && this.f86484f == EnumC13308e.READY) {
            this.f86479a.setPlayWhenReady(true);
            ji9.m14110i(f86478l, "MP3 playback started, state: " + this.f86484f);
            notifyStateChanged();
            return;
        }
        if (this.f86479a != null && this.f86484f == EnumC13308e.IDLE) {
            reseatMediaSource();
            return;
        }
        if (this.f86479a != null && this.f86484f == EnumC13308e.INITIALIZING) {
            reseatMediaSource();
            return;
        }
        ji9.m14111w(f86478l, "Cannot start playback, current state: " + this.f86484f);
    }

    public void switchToAudioMode(EnumC13307d enumC13307d) {
        if (this.f86482d == null || this.f86479a == null) {
            ji9.m14111w(f86478l, "AudioManager/ExoPlayer not initialized, cannot switch mode");
            return;
        }
        this.f86483e = enumC13307d;
        ji9.m14108d(f86478l, "Switching audio output mode to: " + enumC13307d);
        this.f86479a.setAudioAttributes(createAudioAttributes(enumC13307d), true);
        int i = C13306c.f86492a[enumC13307d.ordinal()];
        if (i == 1) {
            try {
                this.f86482d.setSpeakerphoneOn(true);
                this.f86482d.setMode(3);
            } catch (Exception e) {
                ji9.m14109e(f86478l, "Force speaker error: " + e.getMessage());
            }
        } else if (i == 2) {
            this.f86482d.setSpeakerphoneOn(false);
            this.f86482d.setMode(0);
        }
        ji9.m14110i(f86478l, "Audio output mode switched to: " + enumC13307d + ", speakerphone: " + this.f86482d.isSpeakerphoneOn());
        if (this.f86484f == EnumC13308e.PLAYING) {
            this.f86479a.setPlayWhenReady(true);
        }
    }
}
