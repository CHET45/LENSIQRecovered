package p000;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.opencv.videoio.Videoio;
import p000.bmc;

/* JADX INFO: loaded from: classes6.dex */
public class mvi {

    /* JADX INFO: renamed from: H */
    public static final String f62412H = "PcmPlayer";

    /* JADX INFO: renamed from: I */
    public static final int f62413I = 0;

    /* JADX INFO: renamed from: J */
    public static final int f62414J = 1;

    /* JADX INFO: renamed from: K */
    public static final int f62415K = 2;

    /* JADX INFO: renamed from: L */
    public static final int f62416L = 3;

    /* JADX INFO: renamed from: M */
    public static final int f62417M = 4;

    /* JADX INFO: renamed from: N */
    public static final int f62418N = 0;

    /* JADX INFO: renamed from: O */
    public static final int f62419O = 1;

    /* JADX INFO: renamed from: P */
    public static final int f62420P = 2;

    /* JADX INFO: renamed from: Q */
    public static final int f62421Q = 3;

    /* JADX INFO: renamed from: R */
    public static final int f62422R = 4;

    /* JADX INFO: renamed from: S */
    public static final int f62423S = 5;

    /* JADX INFO: renamed from: A */
    public boolean f62424A;

    /* JADX INFO: renamed from: B */
    public boolean f62425B;

    /* JADX INFO: renamed from: C */
    public ReentrantLock f62426C;

    /* JADX INFO: renamed from: D */
    public Condition f62427D;

    /* JADX INFO: renamed from: E */
    public AudioManager.OnAudioFocusChangeListener f62428E;

    /* JADX INFO: renamed from: F */
    public int f62429F;

    /* JADX INFO: renamed from: G */
    public Handler f62430G;

    /* JADX INFO: renamed from: a */
    public AudioTrack f62431a;

    /* JADX INFO: renamed from: b */
    public vui f62432b;

    /* JADX INFO: renamed from: c */
    public Context f62433c;

    /* JADX INFO: renamed from: d */
    public C9558b f62434d;

    /* JADX INFO: renamed from: e */
    public svi f62435e;

    /* JADX INFO: renamed from: f */
    public volatile int f62436f;

    /* JADX INFO: renamed from: g */
    public boolean f62437g;

    /* JADX INFO: renamed from: h */
    public int f62438h;

    /* JADX INFO: renamed from: i */
    public int f62439i;

    /* JADX INFO: renamed from: j */
    public boolean f62440j;

    /* JADX INFO: renamed from: k */
    public boolean f62441k;

    /* JADX INFO: renamed from: l */
    public Object f62442l;

    /* JADX INFO: renamed from: m */
    public Object f62443m;

    /* JADX INFO: renamed from: n */
    public final int f62444n;

    /* JADX INFO: renamed from: o */
    public final int f62445o;

    /* JADX INFO: renamed from: p */
    public final int f62446p;

    /* JADX INFO: renamed from: q */
    public int f62447q;

    /* JADX INFO: renamed from: r */
    public final float f62448r;

    /* JADX INFO: renamed from: s */
    public final float f62449s;

    /* JADX INFO: renamed from: t */
    public final float f62450t;

    /* JADX INFO: renamed from: u */
    public int f62451u;

    /* JADX INFO: renamed from: v */
    public float f62452v;

    /* JADX INFO: renamed from: w */
    public float f62453w;

    /* JADX INFO: renamed from: x */
    public float f62454x;

    /* JADX INFO: renamed from: y */
    public boolean f62455y;

    /* JADX INFO: renamed from: z */
    public AtomicBoolean f62456z;

    /* JADX INFO: renamed from: mvi$a */
    public class C9557a implements svi {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bmc.InterfaceC1949a f62457a;

        public C9557a(mvi mviVar, bmc.InterfaceC1949a interfaceC1949a) {
            this.f62457a = interfaceC1949a;
        }

        @Override // p000.svi
        public void onError(vxf vxfVar) {
            this.f62457a.onError((wxf) vxfVar);
        }

        @Override // p000.svi
        public void onPause() {
            this.f62457a.onPaused();
        }

        @Override // p000.svi
        public void onPercent(int i, int i2, int i3) {
            this.f62457a.onPercent(i, i2, i3);
        }

        @Override // p000.svi
        public void onResume() {
            this.f62457a.onResume();
        }

        @Override // p000.svi
        public void onStop() {
            this.f62457a.onStoped();
        }
    }

    /* JADX INFO: renamed from: mvi$b */
    public class C9558b extends Thread {

        /* JADX INFO: renamed from: a */
        public int f62458a;

        /* JADX INFO: renamed from: mvi$b$a */
        public class a implements AudioTrack.OnPlaybackPositionUpdateListener {
            public a() {
            }

            @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
            public void onMarkerReached(AudioTrack audioTrack) {
                xi9.m25215i("PcmPlayer onMarkerReached");
                mvi.this.f62426C.lock();
                try {
                    mvi.this.f62427D.signalAll();
                } catch (Exception unused) {
                } catch (Throwable th) {
                    mvi.this.f62426C.unlock();
                    throw th;
                }
                mvi.this.f62426C.unlock();
            }

            @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
            public void onPeriodicNotification(AudioTrack audioTrack) {
            }
        }

        private C9558b() {
            this.f62458a = mvi.this.f62438h;
        }

        /* JADX INFO: renamed from: a */
        public int m17628a() {
            return this.f62458a;
        }

        /* JADX WARN: Removed duplicated region for block: B:142:0x0393  */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 1076
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mvi.C9558b.run():void");
        }

        public /* synthetic */ C9558b(mvi mviVar, C9559c c9559c) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public void m17629a(int i) {
            this.f62458a = i;
        }
    }

    /* JADX INFO: renamed from: mvi$c */
    public class C9559c implements AudioManager.OnAudioFocusChangeListener {
        public C9559c() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -3 || i == -1) {
                xi9.m25210d(mvi.f62412H, "pause start");
                if (mvi.this.pause()) {
                    xi9.m25210d(mvi.f62412H, "pause success");
                    mvi.this.f62441k = true;
                    mvi.this.onPause();
                    return;
                }
                return;
            }
            if (i == 1) {
                xi9.m25210d(mvi.f62412H, "resume start");
                if (mvi.this.f62441k) {
                    mvi.this.f62441k = false;
                    if (mvi.this.resume()) {
                        xi9.m25210d(mvi.f62412H, "resume success");
                        mvi.this.onResume();
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: mvi$d */
    public class HandlerC9560d extends Handler {
        public HandlerC9560d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                mvi.this.onError((vxf) message.obj);
                return;
            }
            if (i == 1) {
                mvi.this.onPause();
                return;
            }
            if (i == 2) {
                mvi.this.onResume();
            } else if (i == 3) {
                mvi.this.onPercent(message.arg1, message.arg2);
            } else {
                if (i != 4) {
                    return;
                }
                mvi.this.onStop();
            }
        }
    }

    public mvi(Context context) {
        this.f62431a = null;
        this.f62432b = null;
        this.f62433c = null;
        this.f62434d = null;
        this.f62435e = null;
        this.f62436f = 0;
        this.f62437g = true;
        this.f62438h = 3;
        this.f62440j = false;
        this.f62441k = false;
        this.f62442l = new Object();
        this.f62443m = this;
        this.f62444n = 2;
        this.f62445o = 500;
        this.f62446p = 50;
        this.f62447q = Videoio.CAP_OPENNI2;
        this.f62448r = 1.0f;
        this.f62449s = 0.0f;
        this.f62450t = 0.1f;
        this.f62451u = 16000;
        this.f62452v = 0.0f;
        this.f62453w = 1.0f;
        this.f62454x = 0.1f;
        this.f62455y = false;
        this.f62456z = new AtomicBoolean(true);
        this.f62424A = false;
        this.f62425B = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f62426C = reentrantLock;
        this.f62427D = reentrantLock.newCondition();
        this.f62428E = new C9559c();
        this.f62429F = 0;
        this.f62430G = new HandlerC9560d(Looper.getMainLooper());
        this.f62433c = context;
    }

    private void createAudio() throws Exception {
        xi9.m25210d(f62412H, "createAudio start");
        int rate = this.f62432b.getRate();
        this.f62439i = AudioTrack.getMinBufferSize(rate, 4, 2);
        int i = rate / 1000;
        this.f62447q = i * 100;
        this.f62451u = i * 1000;
        if (this.f62431a != null) {
            release();
        }
        xi9.m25210d(f62412H, "createAudio || mStreamType = " + this.f62438h + ", buffer size: " + this.f62439i);
        this.f62431a = new AudioTrack(this.f62438h, rate, 4, 2, this.f62439i * 2, 1);
        this.f62432b.setAudioTrackBuffSize(this.f62439i * 2);
        int i2 = this.f62439i;
        if (i2 == -2 || i2 == -1) {
            throw new Exception();
        }
        xi9.m25210d(f62412H, "createAudio end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onError(vxf vxfVar) {
        svi sviVar = this.f62435e;
        if (sviVar != null) {
            sviVar.onError(vxfVar);
            this.f62435e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPause() {
        svi sviVar = this.f62435e;
        if (sviVar != null) {
            sviVar.onPause();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPercent(int i, int i2) {
        if (this.f62435e == null || this.f62436f == 4) {
            return;
        }
        this.f62435e.onPercent(i, i2, this.f62429F);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onResume() {
        svi sviVar = this.f62435e;
        if (sviVar != null) {
            sviVar.onResume();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStop() {
        svi sviVar = this.f62435e;
        if (sviVar != null) {
            sviVar.onStop();
            this.f62435e = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void prepAudioPlayer() throws Exception {
        C9558b c9558b = this.f62434d;
        if (this.f62431a == null || !(c9558b == null || c9558b.m17628a() == this.f62438h)) {
            xi9.m25210d(f62412H, "prepAudioPlayer || audiotrack is null or stream type is change.");
            createAudio();
            if (c9558b != null) {
                c9558b.m17629a(this.f62438h);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setState(int i, int i2) {
        boolean z;
        synchronized (this.f62443m) {
            try {
                if (i == this.f62436f) {
                    this.f62436f = i2;
                    z = true;
                } else {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: D */
    public void m17627D(int i) {
        this.f62436f = i;
    }

    public void fading() {
        if (!this.f62425B) {
            this.f62455y = false;
            return;
        }
        synchronized (this.f62443m) {
            try {
                if (Math.abs(this.f62453w - this.f62452v) < 0.1f) {
                    this.f62452v = this.f62453w;
                    this.f62455y = false;
                    xi9.m25209d("fading finish");
                } else {
                    this.f62452v += this.f62454x;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AudioTrack audioTrack = this.f62431a;
        float f = this.f62452v;
        audioTrack.setStereoVolume(f, f);
    }

    public int getState() {
        return this.f62436f;
    }

    public boolean pause() {
        if (this.f62436f == 4 || this.f62436f == 3) {
            return false;
        }
        xi9.m25209d("pause start fade out");
        startFadeOut();
        this.f62436f = 3;
        return true;
    }

    public boolean play(vui vuiVar) {
        boolean z;
        xi9.m25210d(f62412H, "play mPlaytate= " + this.f62436f + ",mAudioFocus= " + this.f62437g);
        synchronized (this.f62443m) {
            try {
                z = false;
                if (this.f62436f == 4 || this.f62436f == 0 || this.f62436f == 3 || this.f62434d == null) {
                    if (this.f62434d == null) {
                        this.f62434d = new C9558b(this, null);
                        this.f62436f = 0;
                    }
                    this.f62432b = vuiVar;
                    this.f62456z.set(false);
                    this.f62434d.start();
                    z = true;
                }
            } finally {
            }
        }
        return z;
    }

    public boolean rePlay(vui vuiVar) {
        m17627D(0);
        return play(vuiVar);
    }

    public boolean reSetStatus() {
        m17627D(0);
        return true;
    }

    public void release() {
        synchronized (this.f62442l) {
            try {
                AudioTrack audioTrack = this.f62431a;
                if (audioTrack != null) {
                    if (audioTrack.getPlayState() == 3) {
                        this.f62431a.stop();
                    }
                    this.f62431a.release();
                    this.f62431a = null;
                }
                xi9.m25210d(f62412H, "mAudioTrack released");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean resume() {
        boolean state = setState(3, 2);
        ly6.Lock(this.f62433c, Boolean.valueOf(this.f62440j), this.f62428E);
        if (state) {
            xi9.m25209d("resume start fade in");
            Message.obtain(this.f62430G, 2).sendToTarget();
            startFadeIn();
        }
        return state;
    }

    public void setAudioFocus(boolean z) {
        xi9.m25210d(f62412H, "setAudioFocus " + z);
        this.f62437g = z;
    }

    public void setListener(bmc.InterfaceC1949a interfaceC1949a) {
        setListener(new C9557a(this, interfaceC1949a));
    }

    public void setSilence() {
        xi9.m25209d("fading set silence");
        synchronized (this.f62443m) {
            try {
                if (Math.abs(0.0f - this.f62453w) < 0.1f) {
                    this.f62452v = 0.0f;
                    this.f62455y = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        AudioTrack audioTrack = this.f62431a;
        float f = this.f62452v;
        audioTrack.setStereoVolume(f, f);
    }

    public void setStreamType(int i) {
        xi9.m25210d(f62412H, "setmStreamType || streamType = " + i);
        this.f62438h = i;
    }

    public void startFadeIn() {
        if (this.f62425B) {
            synchronized (this.f62443m) {
                xi9.m25209d("start fade in");
                this.f62455y = true;
                this.f62453w = 1.0f;
                this.f62454x = 0.1f;
            }
        }
    }

    public void startFadeOut() {
        if (this.f62425B) {
            synchronized (this.f62443m) {
                xi9.m25209d("start fade out");
                this.f62455y = true;
                this.f62453w = 0.0f;
                this.f62454x = -0.1f;
            }
        }
    }

    public boolean stop() {
        if (4 != this.f62436f) {
            xi9.m25209d("stop start fade out");
            startFadeOut();
        }
        synchronized (this.f62443m) {
            this.f62436f = 4;
        }
        return true;
    }

    public mvi(Context context, int i, boolean z, boolean z2, boolean z3) {
        this.f62431a = null;
        this.f62432b = null;
        this.f62433c = null;
        this.f62434d = null;
        this.f62435e = null;
        this.f62436f = 0;
        this.f62437g = true;
        this.f62438h = 3;
        this.f62440j = false;
        this.f62441k = false;
        this.f62442l = new Object();
        this.f62443m = this;
        this.f62444n = 2;
        this.f62445o = 500;
        this.f62446p = 50;
        this.f62447q = Videoio.CAP_OPENNI2;
        this.f62448r = 1.0f;
        this.f62449s = 0.0f;
        this.f62450t = 0.1f;
        this.f62451u = 16000;
        this.f62452v = 0.0f;
        this.f62453w = 1.0f;
        this.f62454x = 0.1f;
        this.f62455y = false;
        this.f62456z = new AtomicBoolean(true);
        this.f62424A = false;
        this.f62425B = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f62426C = reentrantLock;
        this.f62427D = reentrantLock.newCondition();
        this.f62428E = new C9559c();
        this.f62429F = 0;
        this.f62430G = new HandlerC9560d(Looper.getMainLooper());
        this.f62433c = context;
        this.f62438h = i;
        this.f62440j = z;
        this.f62425B = z2;
        this.f62424A = z3;
    }

    public void setListener(svi sviVar) {
        this.f62435e = sviVar;
    }
}
