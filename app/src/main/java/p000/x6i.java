package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x6i {

    /* JADX INFO: renamed from: r */
    public static final String f96902r = "VideoFrameReleaseHelper";

    /* JADX INFO: renamed from: s */
    public static final long f96903s = 5000000000L;

    /* JADX INFO: renamed from: t */
    public static final float f96904t = 0.02f;

    /* JADX INFO: renamed from: u */
    public static final float f96905u = 1.0f;

    /* JADX INFO: renamed from: v */
    public static final int f96906v = 30;

    /* JADX INFO: renamed from: w */
    public static final long f96907w = 500;

    /* JADX INFO: renamed from: x */
    public static final long f96908x = 20000000;

    /* JADX INFO: renamed from: y */
    public static final long f96909y = 80;

    /* JADX INFO: renamed from: a */
    public final x16 f96910a = new x16();

    /* JADX INFO: renamed from: b */
    @hib
    public final C14943b f96911b;

    /* JADX INFO: renamed from: c */
    @hib
    public final ChoreographerFrameCallbackC14944c f96912c;

    /* JADX INFO: renamed from: d */
    public boolean f96913d;

    /* JADX INFO: renamed from: e */
    @hib
    public Surface f96914e;

    /* JADX INFO: renamed from: f */
    public float f96915f;

    /* JADX INFO: renamed from: g */
    public float f96916g;

    /* JADX INFO: renamed from: h */
    public float f96917h;

    /* JADX INFO: renamed from: i */
    public float f96918i;

    /* JADX INFO: renamed from: j */
    public int f96919j;

    /* JADX INFO: renamed from: k */
    public long f96920k;

    /* JADX INFO: renamed from: l */
    public long f96921l;

    /* JADX INFO: renamed from: m */
    public long f96922m;

    /* JADX INFO: renamed from: n */
    public long f96923n;

    /* JADX INFO: renamed from: o */
    public long f96924o;

    /* JADX INFO: renamed from: p */
    public long f96925p;

    /* JADX INFO: renamed from: q */
    public long f96926q;

    /* JADX INFO: renamed from: x6i$a */
    @c5e(30)
    public static final class C14942a {
        private C14942a() {
        }

        public static void setSurfaceFrameRate(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                xh9.m25145e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: renamed from: x6i$b */
    public final class C14943b implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f96927a;

        public C14943b(DisplayManager displayManager) {
            this.f96927a = displayManager;
        }

        private Display getDefaultDisplay() {
            return this.f96927a.getDisplay(0);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            if (i == 0) {
                x6i.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
            }
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        public void register() {
            this.f96927a.registerDisplayListener(this, t0i.createHandlerForCurrentLooper());
            x6i.this.updateDefaultDisplayRefreshRateParams(getDefaultDisplay());
        }

        public void unregister() {
            this.f96927a.unregisterDisplayListener(this);
        }
    }

    /* JADX INFO: renamed from: x6i$c */
    public static final class ChoreographerFrameCallbackC14944c implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: C */
        public static final int f96929C = 3;

        /* JADX INFO: renamed from: F */
        public static final ChoreographerFrameCallbackC14944c f96930F = new ChoreographerFrameCallbackC14944c();

        /* JADX INFO: renamed from: f */
        public static final int f96931f = 1;

        /* JADX INFO: renamed from: m */
        public static final int f96932m = 2;

        /* JADX INFO: renamed from: a */
        public volatile long f96933a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f96934b;

        /* JADX INFO: renamed from: c */
        public final HandlerThread f96935c;

        /* JADX INFO: renamed from: d */
        public Choreographer f96936d;

        /* JADX INFO: renamed from: e */
        public int f96937e;

        private ChoreographerFrameCallbackC14944c() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f96935c = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = t0i.createHandler(handlerThread.getLooper(), this);
            this.f96934b = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(1);
        }

        private void addObserverInternal() {
            Choreographer choreographer = this.f96936d;
            if (choreographer != null) {
                int i = this.f96937e + 1;
                this.f96937e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.f96936d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                xh9.m25149w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public static ChoreographerFrameCallbackC14944c getInstance() {
            return f96930F;
        }

        private void removeObserverInternal() {
            Choreographer choreographer = this.f96936d;
            if (choreographer != null) {
                int i = this.f96937e - 1;
                this.f96937e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f96933a = -9223372036854775807L;
                }
            }
        }

        public void addObserver() {
            this.f96934b.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f96933a = j;
            ((Choreographer) v80.checkNotNull(this.f96936d)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i == 2) {
                addObserverInternal();
                return true;
            }
            if (i != 3) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        public void removeObserver() {
            this.f96934b.sendEmptyMessage(3);
        }
    }

    public x6i(@hib Context context) {
        C14943b c14943bMaybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.f96911b = c14943bMaybeBuildDisplayHelper;
        this.f96912c = c14943bMaybeBuildDisplayHelper != null ? ChoreographerFrameCallbackC14944c.getInstance() : null;
        this.f96920k = -9223372036854775807L;
        this.f96921l = -9223372036854775807L;
        this.f96915f = -1.0f;
        this.f96918i = 1.0f;
        this.f96919j = 0;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Build.VERSION.SDK_INT < 30 || (surface = this.f96914e) == null || this.f96919j == Integer.MIN_VALUE || this.f96917h == 0.0f) {
            return;
        }
        this.f96917h = 0.0f;
        C14942a.setSurfaceFrameRate(surface, 0.0f);
    }

    private static long closestVsync(long j, long j2, long j3) {
        long j4;
        long j5 = j2 + (((j - j2) / j3) * j3);
        if (j <= j5) {
            j4 = j5 - j3;
        } else {
            j5 = j3 + j5;
            j4 = j5;
        }
        return j5 - j < j - j4 ? j5 : j4;
    }

    @hib
    private C14943b maybeBuildDisplayHelper(@hib Context context) {
        DisplayManager displayManager;
        if (context == null || (displayManager = (DisplayManager) context.getSystemService("display")) == null) {
            return null;
        }
        return new C14943b(displayManager);
    }

    private void resetAdjustment() {
        this.f96922m = 0L;
        this.f96925p = -1L;
        this.f96923n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(@hib Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f96920k = refreshRate;
            this.f96921l = (refreshRate * 80) / 100;
        } else {
            xh9.m25148w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f96920k = -9223372036854775807L;
            this.f96921l = -9223372036854775807L;
        }
    }

    private void updateSurfaceMediaFrameRate() {
        if (Build.VERSION.SDK_INT < 30 || this.f96914e == null) {
            return;
        }
        float frameRate = this.f96910a.isSynced() ? this.f96910a.getFrameRate() : this.f96915f;
        float f = this.f96916g;
        if (frameRate == f) {
            return;
        }
        if (frameRate != -1.0f && f != -1.0f) {
            if (Math.abs(frameRate - this.f96916g) < ((!this.f96910a.isSynced() || this.f96910a.getMatchingFrameDurationSumNs() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (frameRate == -1.0f && this.f96910a.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.f96916g = frameRate;
        updateSurfacePlaybackFrameRate(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateSurfacePlaybackFrameRate(boolean r4) {
        /*
            r3 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f96914e
            if (r0 == 0) goto L30
            int r1 = r3.f96919j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f96913d
            if (r1 == 0) goto L21
            float r1 = r3.f96916g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f96918i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f96917h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f96917h = r1
            p000.x6i.C14942a.setSurfaceFrameRate(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.x6i.updateSurfacePlaybackFrameRate(boolean):void");
    }

    public long adjustReleaseTime(long j) {
        long j2;
        if (this.f96925p == -1 || !this.f96910a.isSynced()) {
            j2 = j;
        } else {
            long frameDurationNs = this.f96926q + ((long) ((this.f96910a.getFrameDurationNs() * (this.f96922m - this.f96925p)) / this.f96918i));
            if (adjustmentAllowed(j, frameDurationNs)) {
                j2 = frameDurationNs;
            } else {
                resetAdjustment();
                j2 = j;
            }
        }
        this.f96923n = this.f96922m;
        this.f96924o = j2;
        ChoreographerFrameCallbackC14944c choreographerFrameCallbackC14944c = this.f96912c;
        if (choreographerFrameCallbackC14944c == null || this.f96920k == -9223372036854775807L) {
            return j2;
        }
        long j3 = choreographerFrameCallbackC14944c.f96933a;
        return j3 == -9223372036854775807L ? j2 : closestVsync(j2, j3, this.f96920k) - this.f96921l;
    }

    public void onFormatChanged(float f) {
        this.f96915f = f;
        this.f96910a.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.f96923n;
        if (j2 != -1) {
            this.f96925p = j2;
            this.f96926q = this.f96924o;
        }
        this.f96922m++;
        this.f96910a.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f) {
        this.f96918i = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.f96913d = true;
        resetAdjustment();
        if (this.f96911b != null) {
            ((ChoreographerFrameCallbackC14944c) v80.checkNotNull(this.f96912c)).addObserver();
            this.f96911b.register();
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.f96913d = false;
        C14943b c14943b = this.f96911b;
        if (c14943b != null) {
            c14943b.unregister();
            ((ChoreographerFrameCallbackC14944c) v80.checkNotNull(this.f96912c)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(@hib Surface surface) {
        if (this.f96914e == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.f96914e = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.f96919j == i) {
            return;
        }
        this.f96919j = i;
        updateSurfacePlaybackFrameRate(true);
    }
}
