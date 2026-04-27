package p000;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.video.PlaceholderSurface;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y6i {

    /* JADX INFO: renamed from: r */
    public static final String f100529r = "VideoFrameReleaseHelper";

    /* JADX INFO: renamed from: s */
    public static final long f100530s = 5000000000L;

    /* JADX INFO: renamed from: t */
    public static final float f100531t = 0.02f;

    /* JADX INFO: renamed from: u */
    public static final float f100532u = 1.0f;

    /* JADX INFO: renamed from: v */
    public static final int f100533v = 30;

    /* JADX INFO: renamed from: w */
    public static final long f100534w = 500;

    /* JADX INFO: renamed from: x */
    public static final long f100535x = 20000000;

    /* JADX INFO: renamed from: y */
    public static final long f100536y = 80;

    /* JADX INFO: renamed from: a */
    public final y16 f100537a = new y16();

    /* JADX INFO: renamed from: b */
    @hib
    public final InterfaceC15509b f100538b;

    /* JADX INFO: renamed from: c */
    @hib
    public final ChoreographerFrameCallbackC15512e f100539c;

    /* JADX INFO: renamed from: d */
    public boolean f100540d;

    /* JADX INFO: renamed from: e */
    @hib
    public Surface f100541e;

    /* JADX INFO: renamed from: f */
    public float f100542f;

    /* JADX INFO: renamed from: g */
    public float f100543g;

    /* JADX INFO: renamed from: h */
    public float f100544h;

    /* JADX INFO: renamed from: i */
    public float f100545i;

    /* JADX INFO: renamed from: j */
    public int f100546j;

    /* JADX INFO: renamed from: k */
    public long f100547k;

    /* JADX INFO: renamed from: l */
    public long f100548l;

    /* JADX INFO: renamed from: m */
    public long f100549m;

    /* JADX INFO: renamed from: n */
    public long f100550n;

    /* JADX INFO: renamed from: o */
    public long f100551o;

    /* JADX INFO: renamed from: p */
    public long f100552p;

    /* JADX INFO: renamed from: q */
    public long f100553q;

    /* JADX INFO: renamed from: y6i$a */
    @c5e(30)
    public static final class C15508a {
        private C15508a() {
        }

        @ih4
        public static void setSurfaceFrameRate(Surface surface, float f) {
            try {
                surface.setFrameRate(f, f == 0.0f ? 0 : 1);
            } catch (IllegalStateException e) {
                yh9.m25916e("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
            }
        }
    }

    /* JADX INFO: renamed from: y6i$b */
    public interface InterfaceC15509b {

        /* JADX INFO: renamed from: y6i$b$a */
        public interface a {
            void onDefaultDisplayChanged(@hib Display display);
        }

        void register(a aVar);

        void unregister();
    }

    /* JADX INFO: renamed from: y6i$c */
    public static final class C15510c implements InterfaceC15509b {

        /* JADX INFO: renamed from: a */
        public final WindowManager f100554a;

        private C15510c(WindowManager windowManager) {
            this.f100554a = windowManager;
        }

        @hib
        public static InterfaceC15509b maybeBuildNewInstance(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new C15510c(windowManager);
            }
            return null;
        }

        @Override // p000.y6i.InterfaceC15509b
        public void register(InterfaceC15509b.a aVar) {
            aVar.onDefaultDisplayChanged(this.f100554a.getDefaultDisplay());
        }

        @Override // p000.y6i.InterfaceC15509b
        public void unregister() {
        }
    }

    /* JADX INFO: renamed from: y6i$d */
    @c5e(17)
    public static final class C15511d implements InterfaceC15509b, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: a */
        public final DisplayManager f100555a;

        /* JADX INFO: renamed from: b */
        @hib
        public InterfaceC15509b.a f100556b;

        private C15511d(DisplayManager displayManager) {
            this.f100555a = displayManager;
        }

        private Display getDefaultDisplay() {
            return this.f100555a.getDisplay(0);
        }

        @hib
        public static InterfaceC15509b maybeBuildNewInstance(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new C15511d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i) {
            InterfaceC15509b.a aVar = this.f100556b;
            if (aVar == null || i != 0) {
                return;
            }
            aVar.onDefaultDisplayChanged(getDefaultDisplay());
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i) {
        }

        @Override // p000.y6i.InterfaceC15509b
        public void register(InterfaceC15509b.a aVar) {
            this.f100556b = aVar;
            this.f100555a.registerDisplayListener(this, x0i.createHandlerForCurrentLooper());
            aVar.onDefaultDisplayChanged(getDefaultDisplay());
        }

        @Override // p000.y6i.InterfaceC15509b
        public void unregister() {
            this.f100555a.unregisterDisplayListener(this);
            this.f100556b = null;
        }
    }

    /* JADX INFO: renamed from: y6i$e */
    public static final class ChoreographerFrameCallbackC15512e implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: C */
        public static final int f100557C = 2;

        /* JADX INFO: renamed from: F */
        public static final ChoreographerFrameCallbackC15512e f100558F = new ChoreographerFrameCallbackC15512e();

        /* JADX INFO: renamed from: f */
        public static final int f100559f = 0;

        /* JADX INFO: renamed from: m */
        public static final int f100560m = 1;

        /* JADX INFO: renamed from: a */
        public volatile long f100561a = -9223372036854775807L;

        /* JADX INFO: renamed from: b */
        public final Handler f100562b;

        /* JADX INFO: renamed from: c */
        public final HandlerThread f100563c;

        /* JADX INFO: renamed from: d */
        public Choreographer f100564d;

        /* JADX INFO: renamed from: e */
        public int f100565e;

        private ChoreographerFrameCallbackC15512e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f100563c = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = x0i.createHandler(handlerThread.getLooper(), this);
            this.f100562b = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        private void addObserverInternal() {
            Choreographer choreographer = this.f100564d;
            if (choreographer != null) {
                int i = this.f100565e + 1;
                this.f100565e = i;
                if (i == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        private void createChoreographerInstanceInternal() {
            try {
                this.f100564d = Choreographer.getInstance();
            } catch (RuntimeException e) {
                yh9.m25920w("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e);
            }
        }

        public static ChoreographerFrameCallbackC15512e getInstance() {
            return f100558F;
        }

        private void removeObserverInternal() {
            Choreographer choreographer = this.f100564d;
            if (choreographer != null) {
                int i = this.f100565e - 1;
                this.f100565e = i;
                if (i == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f100561a = -9223372036854775807L;
                }
            }
        }

        public void addObserver() {
            this.f100562b.sendEmptyMessage(1);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            this.f100561a = j;
            ((Choreographer) u80.checkNotNull(this.f100564d)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                createChoreographerInstanceInternal();
                return true;
            }
            if (i == 1) {
                addObserverInternal();
                return true;
            }
            if (i != 2) {
                return false;
            }
            removeObserverInternal();
            return true;
        }

        public void removeObserver() {
            this.f100562b.sendEmptyMessage(2);
        }
    }

    public y6i(@hib Context context) {
        InterfaceC15509b interfaceC15509bMaybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.f100538b = interfaceC15509bMaybeBuildDisplayHelper;
        this.f100539c = interfaceC15509bMaybeBuildDisplayHelper != null ? ChoreographerFrameCallbackC15512e.getInstance() : null;
        this.f100547k = -9223372036854775807L;
        this.f100548l = -9223372036854775807L;
        this.f100542f = -1.0f;
        this.f100545i = 1.0f;
        this.f100546j = 0;
    }

    private static boolean adjustmentAllowed(long j, long j2) {
        return Math.abs(j - j2) <= 20000000;
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (x0i.f95978a < 30 || (surface = this.f100541e) == null || this.f100546j == Integer.MIN_VALUE || this.f100544h == 0.0f) {
            return;
        }
        this.f100544h = 0.0f;
        C15508a.setSurfaceFrameRate(surface, 0.0f);
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
    private static InterfaceC15509b maybeBuildDisplayHelper(@hib Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        InterfaceC15509b interfaceC15509bMaybeBuildNewInstance = x0i.f95978a >= 17 ? C15511d.maybeBuildNewInstance(applicationContext) : null;
        return interfaceC15509bMaybeBuildNewInstance == null ? C15510c.maybeBuildNewInstance(applicationContext) : interfaceC15509bMaybeBuildNewInstance;
    }

    private void resetAdjustment() {
        this.f100549m = 0L;
        this.f100552p = -1L;
        this.f100550n = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(@hib Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.f100547k = refreshRate;
            this.f100548l = (refreshRate * 80) / 100;
        } else {
            yh9.m25919w("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f100547k = -9223372036854775807L;
            this.f100548l = -9223372036854775807L;
        }
    }

    private void updateSurfaceMediaFrameRate() {
        if (x0i.f95978a < 30 || this.f100541e == null) {
            return;
        }
        float frameRate = this.f100537a.isSynced() ? this.f100537a.getFrameRate() : this.f100542f;
        float f = this.f100543g;
        if (frameRate == f) {
            return;
        }
        if (frameRate != -1.0f && f != -1.0f) {
            if (Math.abs(frameRate - this.f100543g) < ((!this.f100537a.isSynced() || this.f100537a.getMatchingFrameDurationSumNs() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (frameRate == -1.0f && this.f100537a.getFramesWithoutSyncCount() < 30) {
            return;
        }
        this.f100543g = frameRate;
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
            int r0 = p000.x0i.f95978a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f100541e
            if (r0 == 0) goto L30
            int r1 = r3.f100546j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f100540d
            if (r1 == 0) goto L21
            float r1 = r3.f100543g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f100545i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f100544h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f100544h = r1
            p000.y6i.C15508a.setSurfaceFrameRate(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.y6i.updateSurfacePlaybackFrameRate(boolean):void");
    }

    public long adjustReleaseTime(long j) {
        long j2;
        if (this.f100552p == -1 || !this.f100537a.isSynced()) {
            j2 = j;
        } else {
            long frameDurationNs = this.f100553q + ((long) ((this.f100537a.getFrameDurationNs() * (this.f100549m - this.f100552p)) / this.f100545i));
            if (adjustmentAllowed(j, frameDurationNs)) {
                j2 = frameDurationNs;
            } else {
                resetAdjustment();
                j2 = j;
            }
        }
        this.f100550n = this.f100549m;
        this.f100551o = j2;
        ChoreographerFrameCallbackC15512e choreographerFrameCallbackC15512e = this.f100539c;
        if (choreographerFrameCallbackC15512e == null || this.f100547k == -9223372036854775807L) {
            return j2;
        }
        long j3 = choreographerFrameCallbackC15512e.f100561a;
        return j3 == -9223372036854775807L ? j2 : closestVsync(j2, j3, this.f100547k) - this.f100548l;
    }

    public void onFormatChanged(float f) {
        this.f100542f = f;
        this.f100537a.reset();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j) {
        long j2 = this.f100550n;
        if (j2 != -1) {
            this.f100552p = j2;
            this.f100553q = this.f100551o;
        }
        this.f100549m++;
        this.f100537a.onNextFrame(j * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f) {
        this.f100545i = f;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onPositionReset() {
        resetAdjustment();
    }

    public void onStarted() {
        this.f100540d = true;
        resetAdjustment();
        if (this.f100538b != null) {
            ((ChoreographerFrameCallbackC15512e) u80.checkNotNull(this.f100539c)).addObserver();
            this.f100538b.register(new InterfaceC15509b.a() { // from class: v6i
                @Override // p000.y6i.InterfaceC15509b.a
                public final void onDefaultDisplayChanged(Display display) {
                    this.f90123a.updateDefaultDisplayRefreshRateParams(display);
                }
            });
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.f100540d = false;
        InterfaceC15509b interfaceC15509b = this.f100538b;
        if (interfaceC15509b != null) {
            interfaceC15509b.unregister();
            ((ChoreographerFrameCallbackC15512e) u80.checkNotNull(this.f100539c)).removeObserver();
        }
        clearSurfaceFrameRate();
    }

    public void onSurfaceChanged(@hib Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.f100541e == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.f100541e = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i) {
        if (this.f100546j == i) {
            return;
        }
        this.f100546j = i;
        updateSurfacePlaybackFrameRate(true);
    }
}
