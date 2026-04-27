package p000;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.watchfun.transcommon.manager.trans.MediaNewButtonReceiver;
import p000.a77;

/* JADX INFO: loaded from: classes7.dex */
public class vja {

    /* JADX INFO: renamed from: l */
    public static final int f91371l = 0;

    /* JADX INFO: renamed from: m */
    public static final int f91372m = 1;

    /* JADX INFO: renamed from: n */
    public static final int f91373n = 2;

    /* JADX INFO: renamed from: o */
    public static final int f91374o = 3;

    /* JADX INFO: renamed from: p */
    public static final int f91375p = 4;

    /* JADX INFO: renamed from: q */
    public static final String f91376q = "MediaPlayerHelper";

    /* JADX INFO: renamed from: r */
    public static final int f91377r = 5000;

    /* JADX INFO: renamed from: s */
    public static volatile vja f91378s;

    /* JADX INFO: renamed from: h */
    public MediaPlayer f91386h;

    /* JADX INFO: renamed from: a */
    @hib
    public InterfaceC14121g f91379a = null;

    /* JADX INFO: renamed from: b */
    @hib
    public InterfaceC14119e f91380b = null;

    /* JADX INFO: renamed from: c */
    @hib
    public Handler f91381c = null;

    /* JADX INFO: renamed from: d */
    public boolean f91382d = false;

    /* JADX INFO: renamed from: e */
    public int f91383e = 1;

    /* JADX INFO: renamed from: f */
    public boolean f91384f = false;

    /* JADX INFO: renamed from: g */
    public int f91385g = 0;

    /* JADX INFO: renamed from: i */
    public float f91387i = 1.0f;

    /* JADX INFO: renamed from: j */
    public String f91388j = "";

    /* JADX INFO: renamed from: k */
    public Runnable f91389k = new RunnableC14118d();

    /* JADX INFO: renamed from: vja$a */
    public class C14115a implements MediaPlayer.OnPreparedListener {
        public C14115a() {
        }

        @Override // android.media.MediaPlayer.OnPreparedListener
        public void onPrepared(MediaPlayer mediaPlayer) {
            if (vja.this.f91381c == null) {
                vja.this.f91381c = new Handler(Looper.getMainLooper());
            }
            vja.this.f91381c.removeCallbacks(vja.this.f91389k);
            InterfaceC14119e interfaceC14119e = vja.this.f91380b;
            if (interfaceC14119e != null) {
                interfaceC14119e.onState(0);
            }
            vja.this.f91384f = false;
        }
    }

    /* JADX INFO: renamed from: vja$b */
    public class C14116b implements MediaPlayer.OnCompletionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f91391a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f91392b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MediaNewButtonReceiver.IKeyDownListener f91393c;

        public C14116b(String str, Context context, MediaNewButtonReceiver.IKeyDownListener iKeyDownListener) {
            this.f91391a = str;
            this.f91392b = context;
            this.f91393c = iKeyDownListener;
        }

        @Override // android.media.MediaPlayer.OnCompletionListener
        public void onCompletion(MediaPlayer mediaPlayer) {
            vja vjaVar = vja.this;
            vjaVar.f91382d = false;
            vjaVar.f91386h.reset();
            if (vja.this.f91381c != null) {
                vja.this.f91381c.removeCallbacks(vja.this.f91389k);
            }
            InterfaceC14119e interfaceC14119e = vja.this.f91380b;
            if (interfaceC14119e != null) {
                interfaceC14119e.onState(4);
            }
            vja.this.f91384f = true;
            vja.this.setAudioSeek(0);
            vja.this.setUpMediaPlayer(this.f91391a, this.f91392b, this.f91393c);
        }
    }

    /* JADX INFO: renamed from: vja$c */
    public class C14117c implements MediaPlayer.OnSeekCompleteListener {
        public C14117c() {
        }

        @Override // android.media.MediaPlayer.OnSeekCompleteListener
        public void onSeekComplete(MediaPlayer mediaPlayer) {
        }
    }

    /* JADX INFO: renamed from: vja$d */
    public class RunnableC14118d implements Runnable {
        public RunnableC14118d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (vja.this.f91386h == null || vja.this.f91386h.isPlaying()) {
                vja vjaVar = vja.this;
                vjaVar.setAudioSeek(vjaVar.f91386h != null ? vja.this.f91386h.getCurrentPosition() : 0);
                vja.this.nextProgress(1000L);
            }
        }
    }

    /* JADX INFO: renamed from: vja$e */
    public interface InterfaceC14119e {
        void onState(int i);
    }

    /* JADX INFO: renamed from: vja$f */
    public interface InterfaceC14120f {
        void onState(boolean z);
    }

    /* JADX INFO: renamed from: vja$g */
    public interface InterfaceC14121g {
        void onSeek(int i, float f, boolean z, boolean z2);
    }

    private vja() {
    }

    public static vja getInstance() {
        if (f91378s == null) {
            synchronized (vja.class) {
                try {
                    if (f91378s == null) {
                        f91378s = new vja();
                        return f91378s;
                    }
                } finally {
                }
            }
        }
        return f91378s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void nextProgress(long j) {
        nextProgress(j, 1000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAudioSeek(int i) {
        this.f91385g = i;
        StringBuilder sb = new StringBuilder();
        sb.append("initMediaPlayListener in seek ---> value: ");
        sb.append(i);
        InterfaceC14121g interfaceC14121g = this.f91379a;
        if (interfaceC14121g != null) {
            interfaceC14121g.onSeek(i, i / this.f91383e, true, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUpMediaPlayer(String str, Context context, MediaNewButtonReceiver.IKeyDownListener iKeyDownListener) {
        if (this.f91386h == null) {
            return;
        }
        this.f91388j = str;
        try {
            this.f91386h.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
            this.f91386h.setDataSource(this.f91388j);
            this.f91386h.setOnPreparedListener(new C14115a());
            this.f91386h.prepare();
            this.f91383e = this.f91386h.getDuration() > 0 ? this.f91386h.getDuration() : 1;
            this.f91386h.setOnCompletionListener(new C14116b(str, context, iKeyDownListener));
            this.f91386h.setOnSeekCompleteListener(new C14117c());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int getAudioSeek() {
        return this.f91385g;
    }

    public float getSeekPercent() {
        return this.f91385g / this.f91383e;
    }

    public void initMediaPayer(String str, float f, Context context, MediaNewButtonReceiver.IKeyDownListener iKeyDownListener) {
        if (this.f91386h == null || str == null || str.isEmpty() || !str.equals(this.f91388j)) {
            this.f91387i = f;
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f91386h = mediaPlayer;
            mediaPlayer.reset();
            setUpMediaPlayer(str, context, iKeyDownListener);
        }
    }

    public void play(@hib InterfaceC14120f interfaceC14120f) {
        if (this.f91382d) {
            return;
        }
        playOrPause(interfaceC14120f);
    }

    public boolean playOrPause(@hib InterfaceC14120f interfaceC14120f) {
        if (this.f91386h == null) {
            return false;
        }
        if (this.f91382d) {
            Handler handler = this.f91381c;
            if (handler != null) {
                handler.removeCallbacks(this.f91389k);
            }
            if (this.f91386h.isPlaying()) {
                this.f91386h.pause();
                InterfaceC14119e interfaceC14119e = this.f91380b;
                if (interfaceC14119e != null) {
                    interfaceC14119e.onState(2);
                }
            } else {
                this.f91382d = this.f91386h.isPlaying();
            }
        } else {
            kfa.audioStopMusic(C9389ml.getInstance().getAppContext());
            if (this.f91386h.isPlaying()) {
                this.f91382d = this.f91386h.isPlaying();
            } else {
                if (this.f91384f) {
                    this.f91384f = false;
                    setAudioSeek(0);
                    this.f91386h.seekTo(getAudioSeek());
                }
                MediaPlayer mediaPlayer = this.f91386h;
                if (mediaPlayer != null) {
                    mediaPlayer.setPlaybackParams(mediaPlayer.getPlaybackParams().setSpeed(this.f91387i));
                }
                InterfaceC14119e interfaceC14119e2 = this.f91380b;
                if (interfaceC14119e2 != null) {
                    interfaceC14119e2.onState(getAudioSeek() == 0 ? 1 : 3);
                }
            }
            nextProgress(10L);
        }
        this.f91382d = !this.f91382d;
        Log.e(f91376q, "playOrPause.isPlaying: " + this.f91382d + a77.C0077a.f542d);
        if (interfaceC14120f != null) {
            interfaceC14120f.onState(this.f91382d);
        }
        return true;
    }

    public void release() {
        Handler handler = this.f91381c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f91381c = null;
        }
        this.f91382d = false;
        MediaPlayer mediaPlayer = this.f91386h;
        if (mediaPlayer != null) {
            mediaPlayer.pause();
            this.f91386h.release();
            this.f91386h = null;
        }
        setAudioSeek(0);
    }

    public boolean seekTo(boolean z) {
        if (this.f91386h == null) {
            return false;
        }
        if (this.f91382d) {
            kfa.audioStopMusic(C9389ml.getInstance().getAppContext());
        }
        if (z) {
            setAudioSeek(Math.max(getAudioSeek() - 5000, 0));
        } else {
            setAudioSeek(Math.min(getAudioSeek() + 5000, this.f91383e - 10));
        }
        this.f91386h.seekTo(getAudioSeek());
        nextProgress(10L);
        Log.e(f91376q, "seekTo.mAudioSeek: " + getAudioSeek() + " / currentPosition: " + this.f91386h.getCurrentPosition());
        return true;
    }

    public void setPlayCallback(@hib InterfaceC14119e interfaceC14119e) {
        this.f91380b = interfaceC14119e;
    }

    public void setSeekCallback(@hib InterfaceC14121g interfaceC14121g) {
        this.f91379a = interfaceC14121g;
    }

    public void setSpeed(float f) {
        MediaPlayer mediaPlayer;
        MediaPlayer mediaPlayer2;
        this.f91387i = f;
        boolean z = this.f91382d;
        if (z && (mediaPlayer2 = this.f91386h) != null) {
            mediaPlayer2.pause();
        }
        MediaPlayer mediaPlayer3 = this.f91386h;
        if (mediaPlayer3 != null) {
            mediaPlayer3.setPlaybackParams(mediaPlayer3.getPlaybackParams().setSpeed(f));
        }
        if (z || (mediaPlayer = this.f91386h) == null) {
            return;
        }
        mediaPlayer.pause();
    }

    private void nextProgress(long j, long j2) {
        Handler handler = this.f91381c;
        if (handler != null) {
            handler.removeCallbacks(this.f91389k);
            this.f91381c.postDelayed(this.f91389k, j);
        }
    }

    public boolean seekTo(float f) {
        if (this.f91386h == null || f > 1.0f) {
            return false;
        }
        if (this.f91382d) {
            kfa.audioStopMusic(C9389ml.getInstance().getAppContext());
        }
        if (this.f91386h != null) {
            setAudioSeek((int) (this.f91383e * f));
            this.f91386h.seekTo(getAudioSeek());
        }
        nextProgress(10L);
        StringBuilder sb = new StringBuilder();
        sb.append("seekTo.mAudioSeek: ");
        sb.append(getAudioSeek());
        sb.append(" / currentPosition: ");
        MediaPlayer mediaPlayer = this.f91386h;
        sb.append(mediaPlayer != null ? mediaPlayer.getCurrentPosition() : 0);
        sb.append(" / duration: ");
        MediaPlayer mediaPlayer2 = this.f91386h;
        sb.append(mediaPlayer2 != null ? mediaPlayer2.getDuration() : 0);
        Log.e(f91376q, sb.toString());
        return true;
    }
}
