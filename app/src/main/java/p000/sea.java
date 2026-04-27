package p000;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.exoplayer2.video.PlaceholderSurface;
import com.google.android.gms.common.Scopes;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.dv6;
import p000.eda;
import p000.oea;
import p000.s6i;
import p000.w7i;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class sea extends uda {

    /* JADX INFO: renamed from: l4 */
    public static final String f81523l4 = "MediaCodecVideoRenderer";

    /* JADX INFO: renamed from: m4 */
    public static final String f81524m4 = "crop-left";

    /* JADX INFO: renamed from: n4 */
    public static final String f81525n4 = "crop-right";

    /* JADX INFO: renamed from: o4 */
    public static final String f81526o4 = "crop-bottom";

    /* JADX INFO: renamed from: p4 */
    public static final String f81527p4 = "crop-top";

    /* JADX INFO: renamed from: q4 */
    public static final int[] f81528q4 = {1920, Videoio.CAP_OPENNI2, 1440, 1280, 960, 854, Imgcodecs.IMWRITE_JPEGXL_QUALITY, Videoio.CAP_PROP_XI_BUFFER_POLICY, Videoio.CAP_PROP_XI_CC_MATRIX_01};

    /* JADX INFO: renamed from: r4 */
    public static final float f81529r4 = 1.5f;

    /* JADX INFO: renamed from: s4 */
    public static final long f81530s4 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: t4 */
    public static final int f81531t4 = 2097152;

    /* JADX INFO: renamed from: u4 */
    public static boolean f81532u4;

    /* JADX INFO: renamed from: v4 */
    public static boolean f81533v4;

    /* JADX INFO: renamed from: D3 */
    public final Context f81534D3;

    /* JADX INFO: renamed from: E3 */
    public final y6i f81535E3;

    /* JADX INFO: renamed from: F3 */
    public final w7i.C14466a f81536F3;

    /* JADX INFO: renamed from: G3 */
    public final C12544a f81537G3;

    /* JADX INFO: renamed from: H3 */
    public final long f81538H3;

    /* JADX INFO: renamed from: I3 */
    public final int f81539I3;

    /* JADX INFO: renamed from: J3 */
    public final boolean f81540J3;

    /* JADX INFO: renamed from: K3 */
    public C12546c f81541K3;

    /* JADX INFO: renamed from: L3 */
    public boolean f81542L3;

    /* JADX INFO: renamed from: M3 */
    public boolean f81543M3;

    /* JADX INFO: renamed from: N3 */
    @hib
    public Surface f81544N3;

    /* JADX INFO: renamed from: O3 */
    @hib
    public PlaceholderSurface f81545O3;

    /* JADX INFO: renamed from: P3 */
    public boolean f81546P3;

    /* JADX INFO: renamed from: Q3 */
    public int f81547Q3;

    /* JADX INFO: renamed from: R3 */
    public boolean f81548R3;

    /* JADX INFO: renamed from: S3 */
    public boolean f81549S3;

    /* JADX INFO: renamed from: T3 */
    public boolean f81550T3;

    /* JADX INFO: renamed from: U3 */
    public long f81551U3;

    /* JADX INFO: renamed from: V3 */
    public long f81552V3;

    /* JADX INFO: renamed from: W3 */
    public long f81553W3;

    /* JADX INFO: renamed from: X3 */
    public int f81554X3;

    /* JADX INFO: renamed from: Y3 */
    public int f81555Y3;

    /* JADX INFO: renamed from: Z3 */
    public int f81556Z3;

    /* JADX INFO: renamed from: a4 */
    public long f81557a4;

    /* JADX INFO: renamed from: b4 */
    public long f81558b4;

    /* JADX INFO: renamed from: c4 */
    public long f81559c4;

    /* JADX INFO: renamed from: d4 */
    public int f81560d4;

    /* JADX INFO: renamed from: e4 */
    public long f81561e4;

    /* JADX INFO: renamed from: f4 */
    public z7i f81562f4;

    /* JADX INFO: renamed from: g4 */
    @hib
    public z7i f81563g4;

    /* JADX INFO: renamed from: h4 */
    public boolean f81564h4;

    /* JADX INFO: renamed from: i4 */
    public int f81565i4;

    /* JADX INFO: renamed from: j4 */
    @hib
    public C12547d f81566j4;

    /* JADX INFO: renamed from: k4 */
    @hib
    public n6i f81567k4;

    /* JADX INFO: renamed from: sea$a */
    public static final class C12544a {

        /* JADX INFO: renamed from: u */
        public static final long f81568u = 50000;

        /* JADX INFO: renamed from: a */
        public final y6i f81569a;

        /* JADX INFO: renamed from: b */
        public final sea f81570b;

        /* JADX INFO: renamed from: e */
        public Handler f81573e;

        /* JADX INFO: renamed from: f */
        @hib
        public s6i f81574f;

        /* JADX INFO: renamed from: g */
        @hib
        public CopyOnWriteArrayList<gx4> f81575g;

        /* JADX INFO: renamed from: h */
        @hib
        public kq6 f81576h;

        /* JADX INFO: renamed from: i */
        public Pair<Long, kq6> f81577i;

        /* JADX INFO: renamed from: j */
        @hib
        public Pair<Surface, ypf> f81578j;

        /* JADX INFO: renamed from: m */
        public boolean f81581m;

        /* JADX INFO: renamed from: n */
        public boolean f81582n;

        /* JADX INFO: renamed from: o */
        public boolean f81583o;

        /* JADX INFO: renamed from: r */
        public boolean f81586r;

        /* JADX INFO: renamed from: c */
        public final ArrayDeque<Long> f81571c = new ArrayDeque<>();

        /* JADX INFO: renamed from: d */
        public final ArrayDeque<Pair<Long, kq6>> f81572d = new ArrayDeque<>();

        /* JADX INFO: renamed from: k */
        public int f81579k = -1;

        /* JADX INFO: renamed from: l */
        public boolean f81580l = true;

        /* JADX INFO: renamed from: p */
        public long f81584p = -9223372036854775807L;

        /* JADX INFO: renamed from: q */
        public z7i f81585q = z7i.f104340F;

        /* JADX INFO: renamed from: s */
        public long f81587s = -9223372036854775807L;

        /* JADX INFO: renamed from: t */
        public long f81588t = -9223372036854775807L;

        /* JADX INFO: renamed from: sea$a$a */
        public class a implements s6i.InterfaceC12470c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ kq6 f81589a;

            public a(kq6 kq6Var) {
                this.f81589a = kq6Var;
            }

            @Override // p000.s6i.InterfaceC12470c
            public void onEnded() {
                throw new IllegalStateException();
            }

            @Override // p000.s6i.InterfaceC12470c
            public void onError(p6i p6iVar) {
                C12544a.this.f81570b.m23266b0(C12544a.this.f81570b.m3403a(p6iVar, this.f81589a, 7001));
            }

            @Override // p000.s6i.InterfaceC12470c
            public void onOutputFrameAvailableForRendering(long j) {
                if (C12544a.this.f81581m) {
                    u80.checkState(C12544a.this.f81584p != -9223372036854775807L);
                }
                C12544a.this.f81571c.add(Long.valueOf(j));
                if (C12544a.this.f81581m && j >= C12544a.this.f81584p) {
                    C12544a.this.f81582n = true;
                }
                if (C12544a.this.f81586r) {
                    C12544a.this.f81586r = false;
                    C12544a.this.f81587s = j;
                }
            }

            @Override // p000.s6i.InterfaceC12470c
            public void onOutputSizeChanged(int i, int i2) {
                u80.checkStateNotNull(C12544a.this.f81576h);
                C12544a.this.f81585q = new z7i(i, i2, 0, 1.0f);
                C12544a.this.f81586r = true;
            }
        }

        /* JADX INFO: renamed from: sea$a$b */
        public static final class b {

            /* JADX INFO: renamed from: a */
            public static Constructor<?> f81591a;

            /* JADX INFO: renamed from: b */
            public static Method f81592b;

            /* JADX INFO: renamed from: c */
            public static Method f81593c;

            /* JADX INFO: renamed from: d */
            public static Constructor<?> f81594d;

            /* JADX INFO: renamed from: e */
            public static Method f81595e;

            private b() {
            }

            public static gx4 createRotationEffect(float f) throws Exception {
                prepare();
                Object objNewInstance = f81591a.newInstance(null);
                f81592b.invoke(objNewInstance, Float.valueOf(f));
                return (gx4) u80.checkNotNull(f81593c.invoke(objNewInstance, null));
            }

            public static s6i.InterfaceC12468a getFrameProcessorFactory() throws Exception {
                prepare();
                return (s6i.InterfaceC12468a) u80.checkNotNull(f81595e.invoke(f81594d.newInstance(null), null));
            }

            @z25({"scaleAndRotateTransformationBuilderConstructor", "setRotationMethod", "buildScaleAndRotateTransformationMethod", "videoFrameProcessorFactoryBuilderConstructor", "buildVideoFrameProcessorFactoryMethod"})
            private static void prepare() throws Exception {
                if (f81591a == null || f81592b == null || f81593c == null) {
                    Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
                    f81591a = cls.getConstructor(null);
                    f81592b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f81593c = cls.getMethod(ocd.f67208g, null);
                }
                if (f81594d == null || f81595e == null) {
                    Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f81594d = cls2.getConstructor(null);
                    f81595e = cls2.getMethod(ocd.f67208g, null);
                }
            }
        }

        public C12544a(y6i y6iVar, sea seaVar) {
            this.f81569a = y6iVar;
            this.f81570b = seaVar;
        }

        private void releaseProcessedFrameInternal(long j, boolean z) {
            u80.checkStateNotNull(this.f81574f);
            this.f81574f.renderOutputFrame(j);
            this.f81571c.remove();
            this.f81570b.f81558b4 = SystemClock.elapsedRealtime() * 1000;
            if (j != -2) {
                this.f81570b.maybeNotifyRenderedFirstFrame();
            }
            if (z) {
                this.f81583o = true;
            }
        }

        public MediaFormat amendMediaFormatKeys(MediaFormat mediaFormat) {
            if (x0i.f95978a >= 29 && this.f81570b.f81534D3.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
                mediaFormat.setInteger("allow-frame-drop", 0);
            }
            return mediaFormat;
        }

        public void clearOutputSurfaceInfo() {
            ((s6i) u80.checkNotNull(this.f81574f)).setOutputSurfaceInfo(null);
            this.f81578j = null;
        }

        public void flush() {
            u80.checkStateNotNull(this.f81574f);
            this.f81574f.flush();
            this.f81571c.clear();
            this.f81573e.removeCallbacksAndMessages(null);
            if (this.f81581m) {
                this.f81581m = false;
                this.f81582n = false;
                this.f81583o = false;
            }
        }

        public long getCorrectedFramePresentationTimeUs(long j, long j2) {
            u80.checkState(this.f81588t != -9223372036854775807L);
            return (j + j2) - this.f81588t;
        }

        public Surface getInputSurface() {
            return ((s6i) u80.checkNotNull(this.f81574f)).getInputSurface();
        }

        public boolean isEnabled() {
            return this.f81574f != null;
        }

        public boolean isReady() {
            Pair<Surface, ypf> pair = this.f81578j;
            return pair == null || !((ypf) pair.second).equals(ypf.f102624c);
        }

        @op1
        public boolean maybeEnable(kq6 kq6Var, long j) throws ba5 {
            int i;
            u80.checkState(!isEnabled());
            if (!this.f81580l) {
                return false;
            }
            if (this.f81575g == null) {
                this.f81580l = false;
                return false;
            }
            this.f81573e = x0i.createHandlerForCurrentLooper();
            Pair<f92, f92> pairM21902z0 = this.f81570b.m21902z0(kq6Var.f55005d2);
            try {
                if (!sea.codecAppliesRotation() && (i = kq6Var.f54997Z1) != 0) {
                    this.f81575g.add(0, b.createRotationEffect(i));
                }
                s6i.InterfaceC12468a frameProcessorFactory = b.getFrameProcessorFactory();
                Context context = this.f81570b.f81534D3;
                List<gx4> list = (List) u80.checkNotNull(this.f81575g);
                rk3 rk3Var = rk3.f78536a;
                f92 f92Var = (f92) pairM21902z0.first;
                f92 f92Var2 = (f92) pairM21902z0.second;
                Handler handler = this.f81573e;
                Objects.requireNonNull(handler);
                s6i s6iVarCreate = frameProcessorFactory.create(context, list, rk3Var, f92Var, f92Var2, false, new gp2(handler), new a(kq6Var));
                this.f81574f = s6iVarCreate;
                s6iVarCreate.registerInputStream(1);
                this.f81588t = j;
                Pair<Surface, ypf> pair = this.f81578j;
                if (pair != null) {
                    ypf ypfVar = (ypf) pair.second;
                    this.f81574f.setOutputSurfaceInfo(new mgg((Surface) pair.first, ypfVar.getWidth(), ypfVar.getHeight()));
                }
                setInputFormat(kq6Var);
                return true;
            } catch (Exception e) {
                throw this.f81570b.m3403a(e, kq6Var, 7000);
            }
        }

        public boolean maybeRegisterFrame(kq6 kq6Var, long j, boolean z) {
            u80.checkStateNotNull(this.f81574f);
            u80.checkState(this.f81579k != -1);
            if (this.f81574f.getPendingInputFrameCount() >= this.f81579k) {
                return false;
            }
            this.f81574f.registerInputFrame();
            Pair<Long, kq6> pair = this.f81577i;
            if (pair == null) {
                this.f81577i = Pair.create(Long.valueOf(j), kq6Var);
            } else if (!x0i.areEqual(kq6Var, pair.second)) {
                this.f81572d.add(Pair.create(Long.valueOf(j), kq6Var));
            }
            if (z) {
                this.f81581m = true;
                this.f81584p = j;
            }
            return true;
        }

        public void onCodecInitialized(String str) {
            this.f81579k = x0i.getMaxPendingFramesCountForMediaCodecDecoders(this.f81570b.f81534D3, str, false);
        }

        public void releaseProcessedFrames(long j, long j2) {
            u80.checkStateNotNull(this.f81574f);
            while (!this.f81571c.isEmpty()) {
                boolean z = false;
                boolean z2 = this.f81570b.getState() == 2;
                long jLongValue = ((Long) u80.checkNotNull(this.f81571c.peek())).longValue();
                long j3 = jLongValue + this.f81588t;
                long jCalculateEarlyTimeUs = this.f81570b.calculateEarlyTimeUs(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z2);
                if (this.f81582n && this.f81571c.size() == 1) {
                    z = true;
                }
                if (this.f81570b.shouldForceRender(j, jCalculateEarlyTimeUs)) {
                    releaseProcessedFrameInternal(-1L, z);
                    return;
                }
                if (!z2 || j == this.f81570b.f81551U3 || jCalculateEarlyTimeUs > 50000) {
                    return;
                }
                this.f81569a.onNextFrame(j3);
                long jAdjustReleaseTime = this.f81569a.adjustReleaseTime(System.nanoTime() + (jCalculateEarlyTimeUs * 1000));
                if (this.f81570b.m21890K0((jAdjustReleaseTime - System.nanoTime()) / 1000, j2, z)) {
                    releaseProcessedFrameInternal(-2L, z);
                } else {
                    if (!this.f81572d.isEmpty() && j3 > ((Long) this.f81572d.peek().first).longValue()) {
                        this.f81577i = this.f81572d.remove();
                    }
                    this.f81570b.notifyFrameMetadataListener(jLongValue, jAdjustReleaseTime, (kq6) this.f81577i.second);
                    if (this.f81587s >= j3) {
                        this.f81587s = -9223372036854775807L;
                        this.f81570b.maybeNotifyVideoSizeChanged(this.f81585q);
                    }
                    releaseProcessedFrameInternal(jAdjustReleaseTime, z);
                }
            }
        }

        public boolean releasedLastFrame() {
            return this.f81583o;
        }

        public void reset() {
            ((s6i) u80.checkNotNull(this.f81574f)).release();
            this.f81574f = null;
            Handler handler = this.f81573e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<gx4> copyOnWriteArrayList = this.f81575g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.f81571c.clear();
            this.f81580l = true;
        }

        public void setInputFormat(kq6 kq6Var) {
            ((s6i) u80.checkNotNull(this.f81574f)).setInputFrameInfo(new dv6.C4963b(kq6Var.f54996Z, kq6Var.f54990M1).setPixelWidthHeightRatio(kq6Var.f54999a2).build());
            this.f81576h = kq6Var;
            if (this.f81581m) {
                this.f81581m = false;
                this.f81582n = false;
                this.f81583o = false;
            }
        }

        public void setOutputSurfaceInfo(Surface surface, ypf ypfVar) {
            Pair<Surface, ypf> pair = this.f81578j;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((ypf) this.f81578j.second).equals(ypfVar)) {
                return;
            }
            this.f81578j = Pair.create(surface, ypfVar);
            if (isEnabled()) {
                ((s6i) u80.checkNotNull(this.f81574f)).setOutputSurfaceInfo(new mgg(surface, ypfVar.getWidth(), ypfVar.getHeight()));
            }
        }

        public void setVideoEffects(List<gx4> list) {
            CopyOnWriteArrayList<gx4> copyOnWriteArrayList = this.f81575g;
            if (copyOnWriteArrayList == null) {
                this.f81575g = new CopyOnWriteArrayList<>(list);
            } else {
                copyOnWriteArrayList.clear();
                this.f81575g.addAll(list);
            }
        }
    }

    /* JADX INFO: renamed from: sea$b */
    @c5e(26)
    public static final class C12545b {
        private C12545b() {
        }

        @ih4
        public static boolean doesDisplaySupportDolbyVision(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: sea$c */
    public static final class C12546c {

        /* JADX INFO: renamed from: a */
        public final int f81596a;

        /* JADX INFO: renamed from: b */
        public final int f81597b;

        /* JADX INFO: renamed from: c */
        public final int f81598c;

        public C12546c(int i, int i2, int i3) {
            this.f81596a = i;
            this.f81597b = i2;
            this.f81598c = i3;
        }
    }

    /* JADX INFO: renamed from: sea$d */
    @c5e(23)
    public final class C12547d implements eda.InterfaceC5267c, Handler.Callback {

        /* JADX INFO: renamed from: c */
        public static final int f81599c = 0;

        /* JADX INFO: renamed from: a */
        public final Handler f81600a;

        public C12547d(eda edaVar) {
            Handler handlerCreateHandlerForCurrentLooper = x0i.createHandlerForCurrentLooper(this);
            this.f81600a = handlerCreateHandlerForCurrentLooper;
            edaVar.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j) {
            sea seaVar = sea.this;
            if (this != seaVar.f81566j4 || seaVar.m23272y() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                sea.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                sea.this.m21884F0(j);
            } catch (ba5 e) {
                sea.this.m23266b0(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(x0i.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // p000.eda.InterfaceC5267c
        public void onFrameRendered(eda edaVar, long j, long j2) {
            if (x0i.f95978a >= 30) {
                handleFrameRendered(j);
            } else {
                this.f81600a.sendMessageAtFrontOfQueue(Message.obtain(this.f81600a, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    public sea(Context context, yda ydaVar) {
        this(context, ydaVar, 0L);
    }

    /* JADX INFO: renamed from: B0 */
    public static int m21864B0(kda kdaVar, kq6 kq6Var) {
        if (kq6Var.f54991N == -1) {
            return getCodecMaxInputSize(kdaVar, kq6Var);
        }
        int size = kq6Var.f54992Q.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += kq6Var.f54992Q.get(i).length;
        }
        return kq6Var.f54991N + length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long calculateEarlyTimeUs(long j, long j2, long j3, long j4, boolean z) {
        long jM23260H = (long) ((j4 - j) / ((double) m23260H()));
        return z ? jM23260H - (j3 - j2) : jM23260H;
    }

    private void clearRenderedFirstFrame() {
        eda edaVarM23272y;
        this.f81548R3 = false;
        if (x0i.f95978a < 23 || !this.f81564h4 || (edaVarM23272y = m23272y()) == null) {
            return;
        }
        this.f81566j4 = new C12547d(edaVarM23272y);
    }

    private void clearReportedVideoSize() {
        this.f81563g4 = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean codecAppliesRotation() {
        return x0i.f95978a >= 21;
    }

    @c5e(21)
    private static void configureTunnelingV21(MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(x0i.f95980c);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        String str;
        byte b = 26;
        int i = x0i.f95978a;
        if (i <= 28) {
            String str2 = x0i.f95979b;
            str2.hashCode();
            switch (str2) {
            }
            return true;
        }
        if (i <= 27 && "HWEML".equals(x0i.f95979b)) {
            return true;
        }
        str = x0i.f95981d;
        str.hashCode();
        switch (str) {
            case "AFTJMST12":
            case "AFTKMST12":
            case "AFTA":
            case "AFTN":
            case "AFTR":
            case "AFTEU011":
            case "AFTEU014":
            case "AFTSO001":
            case "AFTEUFF014":
                break;
            default:
                if (i <= 26) {
                    String str3 = x0i.f95979b;
                    str3.hashCode();
                    switch (str3.hashCode()) {
                        case -2144781245:
                            b = !str3.equals("GIONEE_SWW1609") ? (byte) -1 : (byte) 0;
                            break;
                        case -2144781185:
                            b = !str3.equals("GIONEE_SWW1627") ? (byte) -1 : (byte) 1;
                            break;
                        case -2144781160:
                            b = !str3.equals("GIONEE_SWW1631") ? (byte) -1 : (byte) 2;
                            break;
                        case -2097309513:
                            b = !str3.equals("K50a40") ? (byte) -1 : (byte) 3;
                            break;
                        case -2022874474:
                            b = !str3.equals("CP8676_I02") ? (byte) -1 : (byte) 4;
                            break;
                        case -1978993182:
                            b = !str3.equals("NX541J") ? (byte) -1 : (byte) 5;
                            break;
                        case -1978990237:
                            b = !str3.equals("NX573J") ? (byte) -1 : (byte) 6;
                            break;
                        case -1936688988:
                            b = !str3.equals("PGN528") ? (byte) -1 : (byte) 7;
                            break;
                        case -1936688066:
                            b = !str3.equals("PGN610") ? (byte) -1 : (byte) 8;
                            break;
                        case -1936688065:
                            b = !str3.equals("PGN611") ? (byte) -1 : (byte) 9;
                            break;
                        case -1931988508:
                            b = !str3.equals("AquaPowerM") ? (byte) -1 : (byte) 10;
                            break;
                        case -1885099851:
                            b = !str3.equals("RAIJIN") ? (byte) -1 : (byte) 11;
                            break;
                        case -1696512866:
                            b = !str3.equals("XT1663") ? (byte) -1 : (byte) 12;
                            break;
                        case -1680025915:
                            b = !str3.equals("ComioS1") ? (byte) -1 : (byte) 13;
                            break;
                        case -1615810839:
                            b = !str3.equals("Phantom6") ? (byte) -1 : (byte) 14;
                            break;
                        case -1600724499:
                            b = !str3.equals("pacificrim") ? (byte) -1 : (byte) 15;
                            break;
                        case -1554255044:
                            b = !str3.equals("vernee_M5") ? (byte) -1 : (byte) 16;
                            break;
                        case -1481772737:
                            b = !str3.equals("panell_dl") ? (byte) -1 : (byte) 17;
                            break;
                        case -1481772730:
                            b = !str3.equals("panell_ds") ? (byte) -1 : (byte) 18;
                            break;
                        case -1481772729:
                            b = !str3.equals("panell_dt") ? (byte) -1 : (byte) 19;
                            break;
                        case -1320080169:
                            b = !str3.equals("GiONEE_GBL7319") ? (byte) -1 : (byte) 20;
                            break;
                        case -1217592143:
                            b = !str3.equals("BRAVIA_ATV2") ? (byte) -1 : (byte) 21;
                            break;
                        case -1180384755:
                            b = !str3.equals("iris60") ? (byte) -1 : (byte) 22;
                            break;
                        case -1139198265:
                            b = !str3.equals("Slate_Pro") ? (byte) -1 : (byte) 23;
                            break;
                        case -1052835013:
                            b = !str3.equals("namath") ? (byte) -1 : (byte) 24;
                            break;
                        case -993250464:
                            b = !str3.equals("A10-70F") ? (byte) -1 : (byte) 25;
                            break;
                        case -993250458:
                            if (!str3.equals("A10-70L")) {
                                b = -1;
                            }
                            break;
                        case -965403638:
                            b = !str3.equals("s905x018") ? (byte) -1 : (byte) 27;
                            break;
                        case -958336948:
                            b = !str3.equals("ELUGA_Ray_X") ? (byte) -1 : (byte) 28;
                            break;
                        case -879245230:
                            b = !str3.equals("tcl_eu") ? (byte) -1 : (byte) 29;
                            break;
                        case -842500323:
                            b = !str3.equals("nicklaus_f") ? (byte) -1 : (byte) 30;
                            break;
                        case -821392978:
                            b = !str3.equals("A7000-a") ? (byte) -1 : (byte) 31;
                            break;
                        case -797483286:
                            b = !str3.equals("SVP-DTV15") ? (byte) -1 : (byte) 32;
                            break;
                        case -794946968:
                            b = !str3.equals("watson") ? (byte) -1 : (byte) 33;
                            break;
                        case -788334647:
                            b = !str3.equals("whyred") ? (byte) -1 : BuiltinOptions.TopKV2Options;
                            break;
                        case -782144577:
                            b = !str3.equals("OnePlus5T") ? (byte) -1 : BuiltinOptions.SplitOptions;
                            break;
                        case -575125681:
                            b = !str3.equals("GiONEE_CBL7513") ? (byte) -1 : (byte) 36;
                            break;
                        case -521118391:
                            b = !str3.equals("GIONEE_GBL7360") ? (byte) -1 : (byte) 37;
                            break;
                        case -430914369:
                            b = !str3.equals("Pixi4-7_3G") ? (byte) -1 : (byte) 38;
                            break;
                        case -290434366:
                            b = !str3.equals("taido_row") ? (byte) -1 : (byte) 39;
                            break;
                        case -282781963:
                            b = !str3.equals("BLACK-1X") ? (byte) -1 : (byte) 40;
                            break;
                        case -277133239:
                            b = !str3.equals("Z12_PRO") ? (byte) -1 : (byte) 41;
                            break;
                        case -173639913:
                            b = !str3.equals("ELUGA_A3_Pro") ? (byte) -1 : (byte) 42;
                            break;
                        case -56598463:
                            b = !str3.equals("woods_fn") ? (byte) -1 : (byte) 43;
                            break;
                        case 2126:
                            b = !str3.equals("C1") ? (byte) -1 : (byte) 44;
                            break;
                        case 2564:
                            b = !str3.equals("Q5") ? (byte) -1 : (byte) 45;
                            break;
                        case 2715:
                            b = !str3.equals("V1") ? (byte) -1 : (byte) 46;
                            break;
                        case 2719:
                            b = !str3.equals("V5") ? (byte) -1 : (byte) 47;
                            break;
                        case 3091:
                            b = !str3.equals("b5") ? (byte) -1 : (byte) 48;
                            break;
                        case 3483:
                            b = !str3.equals("mh") ? (byte) -1 : (byte) 49;
                            break;
                        case 73405:
                            b = !str3.equals("JGZ") ? (byte) -1 : (byte) 50;
                            break;
                        case 75537:
                            b = !str3.equals("M04") ? (byte) -1 : (byte) 51;
                            break;
                        case 75739:
                            b = !str3.equals("M5c") ? (byte) -1 : (byte) 52;
                            break;
                        case 76779:
                            b = !str3.equals("MX6") ? (byte) -1 : (byte) 53;
                            break;
                        case 78669:
                            b = !str3.equals("P85") ? (byte) -1 : (byte) 54;
                            break;
                        case 79305:
                            b = !str3.equals("PLE") ? (byte) -1 : (byte) 55;
                            break;
                        case 80618:
                            b = !str3.equals("QX1") ? (byte) -1 : (byte) 56;
                            break;
                        case 88274:
                            b = !str3.equals("Z80") ? (byte) -1 : BuiltinOptions.ArgMinOptions;
                            break;
                        case 98846:
                            b = !str3.equals("cv1") ? (byte) -1 : BuiltinOptions.FakeQuantOptions;
                            break;
                        case 98848:
                            b = !str3.equals("cv3") ? (byte) -1 : BuiltinOptions.PackOptions;
                            break;
                        case 99329:
                            b = !str3.equals("deb") ? (byte) -1 : BuiltinOptions.LogicalOrOptions;
                            break;
                        case 101481:
                            b = !str3.equals("flo") ? (byte) -1 : (byte) 61;
                            break;
                        case 1513190:
                            b = !str3.equals("1601") ? (byte) -1 : BuiltinOptions.LogicalAndOptions;
                            break;
                        case 1514184:
                            b = !str3.equals("1713") ? (byte) -1 : (byte) 63;
                            break;
                        case 1514185:
                            b = !str3.equals("1714") ? (byte) -1 : (byte) 64;
                            break;
                        case 2133089:
                            b = !str3.equals("F01H") ? (byte) -1 : BuiltinOptions.FloorDivOptions;
                            break;
                        case 2133091:
                            b = !str3.equals("F01J") ? (byte) -1 : BuiltinOptions.SquareOptions;
                            break;
                        case 2133120:
                            b = !str3.equals("F02H") ? (byte) -1 : BuiltinOptions.ZerosLikeOptions;
                            break;
                        case 2133151:
                            b = !str3.equals("F03H") ? (byte) -1 : BuiltinOptions.FillOptions;
                            break;
                        case 2133182:
                            b = !str3.equals("F04H") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceLSTMOptions;
                            break;
                        case 2133184:
                            b = !str3.equals("F04J") ? (byte) -1 : BuiltinOptions.BidirectionalSequenceRNNOptions;
                            break;
                        case 2436959:
                            b = !str3.equals("P681") ? (byte) -1 : BuiltinOptions.UnidirectionalSequenceLSTMOptions;
                            break;
                        case 2463773:
                            b = !str3.equals("Q350") ? (byte) -1 : BuiltinOptions.FloorModOptions;
                            break;
                        case 2464648:
                            b = !str3.equals("Q427") ? (byte) -1 : BuiltinOptions.RangeOptions;
                            break;
                        case 2689555:
                            b = !str3.equals("XE2X") ? (byte) -1 : BuiltinOptions.ResizeNearestNeighborOptions;
                            break;
                        case 3154429:
                            b = !str3.equals("fugu") ? (byte) -1 : (byte) 75;
                            break;
                        case 3284551:
                            b = !str3.equals("kate") ? (byte) -1 : (byte) 76;
                            break;
                        case 3351335:
                            b = !str3.equals("mido") ? (byte) -1 : (byte) 77;
                            break;
                        case 3386211:
                            b = !str3.equals("p212") ? (byte) -1 : BuiltinOptions.AbsOptions;
                            break;
                        case 41325051:
                            b = !str3.equals("MEIZU_M5") ? (byte) -1 : BuiltinOptions.SplitVOptions;
                            break;
                        case 51349633:
                            b = !str3.equals("601LV") ? (byte) -1 : BuiltinOptions.UniqueOptions;
                            break;
                        case 51350594:
                            b = !str3.equals("602LV") ? (byte) -1 : BuiltinOptions.ReverseV2Options;
                            break;
                        case 55178625:
                            b = !str3.equals("Aura_Note_2") ? (byte) -1 : BuiltinOptions.AddNOptions;
                            break;
                        case 61542055:
                            b = !str3.equals("A1601") ? (byte) -1 : (byte) 83;
                            break;
                        case 65355429:
                            b = !str3.equals("E5643") ? (byte) -1 : BuiltinOptions.CosOptions;
                            break;
                        case 66214468:
                            b = !str3.equals("F3111") ? (byte) -1 : BuiltinOptions.WhereOptions;
                            break;
                        case 66214470:
                            b = !str3.equals("F3113") ? (byte) -1 : BuiltinOptions.RankOptions;
                            break;
                        case 66214473:
                            b = !str3.equals("F3116") ? (byte) -1 : BuiltinOptions.ReverseSequenceOptions;
                            break;
                        case 66215429:
                            b = !str3.equals("F3211") ? (byte) -1 : (byte) 88;
                            break;
                        case 66215431:
                            b = !str3.equals("F3213") ? (byte) -1 : BuiltinOptions.QuantizeOptions;
                            break;
                        case 66215433:
                            b = !str3.equals("F3215") ? (byte) -1 : BuiltinOptions.MatrixSetDiagOptions;
                            break;
                        case 66216390:
                            b = !str3.equals("F3311") ? (byte) -1 : BuiltinOptions.HardSwishOptions;
                            break;
                        case 76402249:
                            b = !str3.equals("PRO7S") ? (byte) -1 : BuiltinOptions.IfOptions;
                            break;
                        case 76404105:
                            b = !str3.equals("Q4260") ? (byte) -1 : BuiltinOptions.WhileOptions;
                            break;
                        case 76404911:
                            b = !str3.equals("Q4310") ? (byte) -1 : BuiltinOptions.DepthToSpaceOptions;
                            break;
                        case 80963634:
                            b = !str3.equals("V23GB") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV4Options;
                            break;
                        case 82882791:
                            b = !str3.equals("X3_HK") ? (byte) -1 : BuiltinOptions.NonMaxSuppressionV5Options;
                            break;
                        case 98715550:
                            b = !str3.equals("i9031") ? (byte) -1 : BuiltinOptions.ScatterNdOptions;
                            break;
                        case 101370885:
                            b = !str3.equals("l5460") ? (byte) -1 : BuiltinOptions.SelectV2Options;
                            break;
                        case 102844228:
                            b = !str3.equals("le_x6") ? (byte) -1 : BuiltinOptions.DensifyOptions;
                            break;
                        case 165221241:
                            b = !str3.equals("A2016a40") ? (byte) -1 : (byte) 100;
                            break;
                        case 182191441:
                            b = !str3.equals("CPY83_I00") ? (byte) -1 : BuiltinOptions.BatchMatMulOptions;
                            break;
                        case 245388979:
                            b = !str3.equals("marino_f") ? (byte) -1 : BuiltinOptions.CumsumOptions;
                            break;
                        case 287431619:
                            b = !str3.equals("griffin") ? (byte) -1 : (byte) 103;
                            break;
                        case 307593612:
                            b = !str3.equals("A7010a48") ? (byte) -1 : BuiltinOptions.BroadcastToOptions;
                            break;
                        case 308517133:
                            b = !str3.equals("A7020a48") ? (byte) -1 : BuiltinOptions.Rfft2dOptions;
                            break;
                        case 316215098:
                            b = !str3.equals("TB3-730F") ? (byte) -1 : BuiltinOptions.Conv3DOptions;
                            break;
                        case 316215116:
                            b = !str3.equals("TB3-730X") ? (byte) -1 : BuiltinOptions.HashtableOptions;
                            break;
                        case 316246811:
                            b = !str3.equals("TB3-850F") ? (byte) -1 : BuiltinOptions.HashtableFindOptions;
                            break;
                        case 316246818:
                            b = !str3.equals("TB3-850M") ? (byte) -1 : BuiltinOptions.HashtableImportOptions;
                            break;
                        case 407160593:
                            b = !str3.equals("Pixi5-10_4G") ? (byte) -1 : BuiltinOptions.HashtableSizeOptions;
                            break;
                        case 507412548:
                            b = !str3.equals("QM16XE_U") ? (byte) -1 : BuiltinOptions.VarHandleOptions;
                            break;
                        case 793982701:
                            b = !str3.equals("GIONEE_WBL5708") ? (byte) -1 : BuiltinOptions.ReadVariableOptions;
                            break;
                        case 794038622:
                            b = !str3.equals("GIONEE_WBL7365") ? (byte) -1 : (byte) 113;
                            break;
                        case 794040393:
                            b = !str3.equals("GIONEE_WBL7519") ? (byte) -1 : BuiltinOptions.RandomOptions;
                            break;
                        case 835649806:
                            b = !str3.equals("manning") ? (byte) -1 : BuiltinOptions.BucketizeOptions;
                            break;
                        case 917340916:
                            b = !str3.equals("A7000plus") ? (byte) -1 : BuiltinOptions.GeluOptions;
                            break;
                        case 958008161:
                            b = !str3.equals("j2xlteins") ? (byte) -1 : BuiltinOptions.DynamicUpdateSliceOptions;
                            break;
                        case 1060579533:
                            b = !str3.equals("panell_d") ? (byte) -1 : BuiltinOptions.UnsortedSegmentProdOptions;
                            break;
                        case 1150207623:
                            b = !str3.equals("LS-5017") ? (byte) -1 : BuiltinOptions.UnsortedSegmentMaxOptions;
                            break;
                        case 1176899427:
                            b = !str3.equals("itel_S41") ? (byte) -1 : (byte) 120;
                            break;
                        case 1280332038:
                            b = !str3.equals("hwALE-H") ? (byte) -1 : BuiltinOptions.UnsortedSegmentSumOptions;
                            break;
                        case 1306947716:
                            b = !str3.equals("EverStar_S") ? (byte) -1 : BuiltinOptions.ATan2Options;
                            break;
                        case 1349174697:
                            b = !str3.equals("htc_e56ml_dtul") ? (byte) -1 : BuiltinOptions.SignOptions;
                            break;
                        case 1522194893:
                            b = !str3.equals("woods_f") ? (byte) -1 : BuiltinOptions.BitcastOptions;
                            break;
                        case 1691543273:
                            b = !str3.equals("CPH1609") ? (byte) -1 : BuiltinOptions.BitwiseXorOptions;
                            break;
                        case 1691544261:
                            b = !str3.equals("CPH1715") ? (byte) -1 : BuiltinOptions.RightShiftOptions;
                            break;
                        case 1709443163:
                            b = !str3.equals("iball8735_9806") ? (byte) -1 : (byte) 127;
                            break;
                        case 1865889110:
                            b = !str3.equals("santoni") ? (byte) -1 : (byte) 128;
                            break;
                        case 1906253259:
                            b = !str3.equals("PB2-670M") ? (byte) -1 : (byte) 129;
                            break;
                        case 1977196784:
                            b = !str3.equals("Infinix-X572") ? (byte) -1 : (byte) 130;
                            break;
                        case 2006372676:
                            b = !str3.equals("BRAVIA_ATV3_4K") ? (byte) -1 : (byte) 131;
                            break;
                        case 2019281702:
                            b = !str3.equals("DM-01K") ? (byte) -1 : (byte) 132;
                            break;
                        case 2029784656:
                            b = !str3.equals("HWBLN-H") ? (byte) -1 : (byte) 133;
                            break;
                        case 2030379515:
                            b = !str3.equals("HWCAM-H") ? (byte) -1 : (byte) 134;
                            break;
                        case 2033393791:
                            b = !str3.equals("ASUS_X00AD_2") ? (byte) -1 : (byte) 135;
                            break;
                        case 2047190025:
                            b = !str3.equals("ELUGA_Note") ? (byte) -1 : (byte) 136;
                            break;
                        case 2047252157:
                            b = !str3.equals("ELUGA_Prim") ? (byte) -1 : (byte) 137;
                            break;
                        case 2048319463:
                            b = !str3.equals("HWVNS-H") ? (byte) -1 : (byte) 138;
                            break;
                        case 2048855701:
                            b = !str3.equals("HWWAS-H") ? (byte) -1 : (byte) 139;
                            break;
                        default:
                            b = -1;
                            break;
                    }
                    switch (b) {
                        default:
                            str.hashCode();
                            if (!str.equals("JSN-L21")) {
                            }
                        case 0:
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                        case 50:
                        case 51:
                        case 52:
                        case 53:
                        case 54:
                        case 55:
                        case 56:
                        case 57:
                        case 58:
                        case 59:
                        case 60:
                        case 61:
                        case 62:
                        case 63:
                        case 64:
                        case 65:
                        case 66:
                        case 67:
                        case 68:
                        case 69:
                        case 70:
                        case 71:
                        case 72:
                        case 73:
                        case 74:
                        case 75:
                        case 76:
                        case 77:
                        case 78:
                        case 79:
                        case 80:
                        case 81:
                        case 82:
                        case 83:
                        case 84:
                        case 85:
                        case 86:
                        case 87:
                        case 88:
                        case 89:
                        case 90:
                        case 91:
                        case 92:
                        case 93:
                        case 94:
                        case 95:
                        case 96:
                        case 97:
                        case 98:
                        case 99:
                        case 100:
                        case 101:
                        case 102:
                        case 103:
                        case 104:
                        case 105:
                        case 106:
                        case 107:
                        case 108:
                        case 109:
                        case 110:
                        case 111:
                        case 112:
                        case 113:
                        case 114:
                        case 115:
                        case 116:
                        case 117:
                        case 118:
                        case 119:
                        case 120:
                        case 121:
                        case 122:
                        case 123:
                        case 124:
                        case 125:
                        case 126:
                        case 127:
                        case 128:
                        case 129:
                        case 130:
                        case 131:
                        case 132:
                        case 133:
                        case 134:
                        case 135:
                        case 136:
                        case 137:
                        case 138:
                        case 139:
                            return true;
                    }
                }
                break;
        }
        return true;
    }

    public static int getCodecMaxInputSize(kda kdaVar, kq6 kq6Var) {
        int iIntValue;
        int i = kq6Var.f54996Z;
        int i2 = kq6Var.f54990M1;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        String str = kq6Var.f54989M;
        if ("video/dolby-vision".equals(str)) {
            Pair<Integer, Integer> codecProfileAndLevel = oea.getCodecProfileAndLevel(kq6Var);
            str = (codecProfileAndLevel == null || !((iIntValue = ((Integer) codecProfileAndLevel.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        switch (str) {
            case "video/3gpp":
            case "video/av01":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                return getMaxSampleSize(i * i2, 2);
            case "video/hevc":
                return Math.max(2097152, getMaxSampleSize(i * i2, 2));
            case "video/avc":
                String str2 = x0i.f95981d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(x0i.f95980c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && kdaVar.f53655g)))) {
                    return -1;
                }
                return getMaxSampleSize(x0i.ceilDivide(i, 16) * x0i.ceilDivide(i2, 16) * 256, 2);
            case "video/x-vnd.on2.vp9":
                return getMaxSampleSize(i * i2, 4);
            default:
                return -1;
        }
    }

    @hib
    private static Point getCodecMaxSize(kda kdaVar, kq6 kq6Var) {
        int i = kq6Var.f54990M1;
        int i2 = kq6Var.f54996Z;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f81528q4) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (x0i.f95978a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                Point pointAlignVideoSizeV21 = kdaVar.alignVideoSizeV21(i6, i4);
                if (kdaVar.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, kq6Var.f54993V1)) {
                    return pointAlignVideoSizeV21;
                }
            } else {
                try {
                    int iCeilDivide = x0i.ceilDivide(i4, 16) * 16;
                    int iCeilDivide2 = x0i.ceilDivide(i5, 16) * 16;
                    if (iCeilDivide * iCeilDivide2 <= oea.maxH264DecodableFrameSize()) {
                        int i7 = z ? iCeilDivide2 : iCeilDivide;
                        if (!z) {
                            iCeilDivide = iCeilDivide2;
                        }
                        return new Point(i7, iCeilDivide);
                    }
                } catch (oea.C10346c unused) {
                }
            }
        }
        return null;
    }

    private static List<kda> getDecoderInfos(Context context, yda ydaVar, kq6 kq6Var, boolean z, boolean z2) throws oea.C10346c {
        String str = kq6Var.f54989M;
        if (str == null) {
            return kx7.m15110of();
        }
        if (x0i.f95978a >= 26 && "video/dolby-vision".equals(str) && !C12545b.doesDisplaySupportDolbyVision(context)) {
            List<kda> alternativeDecoderInfos = oea.getAlternativeDecoderInfos(ydaVar, kq6Var, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return oea.getDecoderInfosSoftMatch(ydaVar, kq6Var, z, z2);
    }

    private static int getMaxSampleSize(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    private static boolean isBufferLate(long j) {
        return j < rea.f78021I4;
    }

    private static boolean isBufferVeryLate(long j) {
        return j < rea.f78022J4;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.f81554X3 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f81536F3.droppedFrames(this.f81554X3, jElapsedRealtime - this.f81553W3);
            this.f81554X3 = 0;
            this.f81553W3 = jElapsedRealtime;
        }
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.f81560d4;
        if (i != 0) {
            this.f81536F3.reportVideoFrameProcessingOffset(this.f81559c4, i);
            this.f81559c4 = 0L;
            this.f81560d4 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeNotifyVideoSizeChanged(z7i z7iVar) {
        if (z7iVar.equals(z7i.f104340F) || z7iVar.equals(this.f81563g4)) {
            return;
        }
        this.f81563g4 = z7iVar;
        this.f81536F3.videoSizeChanged(z7iVar);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        if (this.f81546P3) {
            this.f81536F3.renderedFirstFrame(this.f81544N3);
        }
    }

    private void maybeRenotifyVideoSizeChanged() {
        z7i z7iVar = this.f81563g4;
        if (z7iVar != null) {
            this.f81536F3.videoSizeChanged(z7iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyFrameMetadataListener(long j, long j2, kq6 kq6Var) {
        n6i n6iVar = this.f81567k4;
        if (n6iVar != null) {
            n6iVar.onVideoFrameAboutToBeRendered(j, j2, kq6Var, m23258D());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        m23265a0();
    }

    @c5e(17)
    private void releasePlaceholderSurface() {
        Surface surface = this.f81544N3;
        PlaceholderSurface placeholderSurface = this.f81545O3;
        if (surface == placeholderSurface) {
            this.f81544N3 = null;
        }
        placeholderSurface.release();
        this.f81545O3 = null;
    }

    private void renderOutputBufferNow(eda edaVar, kq6 kq6Var, int i, long j, boolean z) {
        long correctedFramePresentationTimeUs = this.f81537G3.isEnabled() ? this.f81537G3.getCorrectedFramePresentationTimeUs(j, m23259G()) * 1000 : System.nanoTime();
        if (z) {
            notifyFrameMetadataListener(j, correctedFramePresentationTimeUs, kq6Var);
        }
        if (x0i.f95978a >= 21) {
            m21886H0(edaVar, i, j, correctedFramePresentationTimeUs);
        } else {
            m21885G0(edaVar, i, j);
        }
    }

    @c5e(29)
    private static void setHdr10PlusInfoV29(eda edaVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        edaVar.setParameters(bundle);
    }

    private void setJoiningDeadlineMs() {
        this.f81552V3 = this.f81538H3 > 0 ? SystemClock.elapsedRealtime() + this.f81538H3 : -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [y6i] */
    /* JADX WARN: Type inference failed for: r0v8, types: [sea$a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [bu0, sea, uda] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.google.android.exoplayer2.video.PlaceholderSurface] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void setOutput(@hib Object obj) throws ba5 {
        ?? NewInstanceV17 = obj instanceof Surface ? (Surface) obj : 0;
        if (NewInstanceV17 == 0) {
            PlaceholderSurface placeholderSurface = this.f81545O3;
            if (placeholderSurface != null) {
                NewInstanceV17 = placeholderSurface;
            } else {
                kda kdaVarM23273z = m23273z();
                if (kdaVarM23273z != null && shouldUsePlaceholderSurface(kdaVarM23273z)) {
                    NewInstanceV17 = PlaceholderSurface.newInstanceV17(this.f81534D3, kdaVarM23273z.f53655g);
                    this.f81545O3 = NewInstanceV17;
                }
            }
        }
        if (this.f81544N3 == NewInstanceV17) {
            if (NewInstanceV17 == 0 || NewInstanceV17 == this.f81545O3) {
                return;
            }
            maybeRenotifyVideoSizeChanged();
            maybeRenotifyRenderedFirstFrame();
            return;
        }
        this.f81544N3 = NewInstanceV17;
        this.f81535E3.onSurfaceChanged(NewInstanceV17);
        this.f81546P3 = false;
        int state = getState();
        eda edaVarM23272y = m23272y();
        if (edaVarM23272y != null && !this.f81537G3.isEnabled()) {
            if (x0i.f95978a < 23 || NewInstanceV17 == 0 || this.f81542L3) {
                m23263W();
                m23262K();
            } else {
                m21888I0(edaVarM23272y, NewInstanceV17);
            }
        }
        if (NewInstanceV17 == 0 || NewInstanceV17 == this.f81545O3) {
            clearReportedVideoSize();
            clearRenderedFirstFrame();
            if (this.f81537G3.isEnabled()) {
                this.f81537G3.clearOutputSurfaceInfo();
                return;
            }
            return;
        }
        maybeRenotifyVideoSizeChanged();
        clearRenderedFirstFrame();
        if (state == 2) {
            setJoiningDeadlineMs();
        }
        if (this.f81537G3.isEnabled()) {
            this.f81537G3.setOutputSurfaceInfo(NewInstanceV17, ypf.f102624c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldForceRender(long j, long j2) {
        boolean z = getState() == 2;
        boolean z2 = this.f81550T3 ? !this.f81548R3 : z || this.f81549S3;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f81558b4;
        if (this.f81552V3 != -9223372036854775807L || j < m23259G()) {
            return false;
        }
        return z2 || (z && m21891L0(j2, jElapsedRealtime));
    }

    private boolean shouldUsePlaceholderSurface(kda kdaVar) {
        return x0i.f95978a >= 23 && !this.f81564h4 && !m21900x0(kdaVar.f53649a) && (!kdaVar.f53655g || PlaceholderSurface.isSecureSupported(this.f81534D3));
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: A */
    public boolean mo21879A() {
        return this.f81564h4 && x0i.f95978a < 23;
    }

    /* JADX INFO: renamed from: A0 */
    public C12546c m21880A0(kda kdaVar, kq6 kq6Var, kq6[] kq6VarArr) {
        int codecMaxInputSize;
        int iMax = kq6Var.f54996Z;
        int iMax2 = kq6Var.f54990M1;
        int iM21864B0 = m21864B0(kdaVar, kq6Var);
        if (kq6VarArr.length == 1) {
            if (iM21864B0 != -1 && (codecMaxInputSize = getCodecMaxInputSize(kdaVar, kq6Var)) != -1) {
                iM21864B0 = Math.min((int) (iM21864B0 * 1.5f), codecMaxInputSize);
            }
            return new C12546c(iMax, iMax2, iM21864B0);
        }
        int length = kq6VarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            kq6 kq6VarBuild = kq6VarArr[i];
            if (kq6Var.f55005d2 != null && kq6VarBuild.f55005d2 == null) {
                kq6VarBuild = kq6VarBuild.buildUpon().setColorInfo(kq6Var.f55005d2).build();
            }
            if (kdaVar.canReuseCodec(kq6Var, kq6VarBuild).f94612d != 0) {
                int i2 = kq6VarBuild.f54996Z;
                z |= i2 == -1 || kq6VarBuild.f54990M1 == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, kq6VarBuild.f54990M1);
                iM21864B0 = Math.max(iM21864B0, m21864B0(kdaVar, kq6VarBuild));
            }
        }
        if (z) {
            yh9.m25919w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(kdaVar, kq6Var);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                iM21864B0 = Math.max(iM21864B0, getCodecMaxInputSize(kdaVar, kq6Var.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                yh9.m25919w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new C12546c(iMax, iMax2, iM21864B0);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: C */
    public float mo11627C(float f, kq6 kq6Var, kq6[] kq6VarArr) {
        float fMax = -1.0f;
        for (kq6 kq6Var2 : kq6VarArr) {
            float f2 = kq6Var2.f54993V1;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @omg(21)
    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: C0 */
    public MediaFormat m21881C0(kq6 kq6Var, String str, C12546c c12546c, float f, boolean z, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(StreamInformation.KEY_WIDTH, kq6Var.f54996Z);
        mediaFormat.setInteger(StreamInformation.KEY_HEIGHT, kq6Var.f54990M1);
        ifa.setCsdBuffers(mediaFormat, kq6Var.f54992Q);
        ifa.maybeSetFloat(mediaFormat, "frame-rate", kq6Var.f54993V1);
        ifa.maybeSetInteger(mediaFormat, "rotation-degrees", kq6Var.f54997Z1);
        ifa.maybeSetColorInfo(mediaFormat, kq6Var.f55005d2);
        if ("video/dolby-vision".equals(kq6Var.f54989M) && (codecProfileAndLevel = oea.getCodecProfileAndLevel(kq6Var)) != null) {
            ifa.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", c12546c.f81596a);
        mediaFormat.setInteger("max-height", c12546c.f81597b);
        ifa.maybeSetInteger(mediaFormat, "max-input-size", c12546c.f81598c);
        if (x0i.f95978a >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            configureTunnelingV21(mediaFormat, i);
        }
        return mediaFormat;
    }

    @hib
    /* JADX INFO: renamed from: D0 */
    public Surface m21882D0() {
        return this.f81544N3;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: E */
    public List<kda> mo11628E(yda ydaVar, kq6 kq6Var, boolean z) throws oea.C10346c {
        return oea.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.f81534D3, ydaVar, kq6Var, z, this.f81564h4), kq6Var);
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m21883E0(long j, boolean z) throws ba5 {
        int iM3422t = m3422t(j);
        if (iM3422t == 0) {
            return false;
        }
        if (z) {
            nl3 nl3Var = this.f87719h3;
            nl3Var.f64831d += iM3422t;
            nl3Var.f64833f += this.f81556Z3;
        } else {
            this.f87719h3.f64837j++;
            m21893N0(iM3422t, this.f81556Z3);
        }
        m23270w();
        if (this.f81537G3.isEnabled()) {
            this.f81537G3.flush();
        }
        return true;
    }

    @Override // p000.uda
    @omg(17)
    /* JADX INFO: renamed from: F */
    public eda.C5265a mo11629F(kda kdaVar, kq6 kq6Var, @hib MediaCrypto mediaCrypto, float f) {
        PlaceholderSurface placeholderSurface = this.f81545O3;
        if (placeholderSurface != null && placeholderSurface.f20632a != kdaVar.f53655g) {
            releasePlaceholderSurface();
        }
        String str = kdaVar.f53651c;
        C12546c c12546cM21880A0 = m21880A0(kdaVar, kq6Var, m3410h());
        this.f81541K3 = c12546cM21880A0;
        MediaFormat mediaFormatM21881C0 = m21881C0(kq6Var, str, c12546cM21880A0, f, this.f81540J3, this.f81564h4 ? this.f81565i4 : 0);
        if (this.f81544N3 == null) {
            if (!shouldUsePlaceholderSurface(kdaVar)) {
                throw new IllegalStateException();
            }
            if (this.f81545O3 == null) {
                this.f81545O3 = PlaceholderSurface.newInstanceV17(this.f81534D3, kdaVar.f53655g);
            }
            this.f81544N3 = this.f81545O3;
        }
        if (this.f81537G3.isEnabled()) {
            mediaFormatM21881C0 = this.f81537G3.amendMediaFormatKeys(mediaFormatM21881C0);
        }
        return eda.C5265a.createForVideoDecoding(kdaVar, mediaFormatM21881C0, kq6Var, this.f81537G3.isEnabled() ? this.f81537G3.getInputSurface() : this.f81544N3, mediaCrypto);
    }

    /* JADX INFO: renamed from: F0 */
    public void m21884F0(long j) throws ba5 {
        m23269i0(j);
        maybeNotifyVideoSizeChanged(this.f81562f4);
        this.f87719h3.f64832e++;
        maybeNotifyRenderedFirstFrame();
        mo21895R(j);
    }

    /* JADX INFO: renamed from: G0 */
    public void m21885G0(eda edaVar, int i, long j) {
        w5h.beginSection("releaseOutputBuffer");
        edaVar.releaseOutputBuffer(i, true);
        w5h.endSection();
        this.f87719h3.f64832e++;
        this.f81555Y3 = 0;
        if (this.f81537G3.isEnabled()) {
            return;
        }
        this.f81558b4 = SystemClock.elapsedRealtime() * 1000;
        maybeNotifyVideoSizeChanged(this.f81562f4);
        maybeNotifyRenderedFirstFrame();
    }

    @c5e(21)
    /* JADX INFO: renamed from: H0 */
    public void m21886H0(eda edaVar, int i, long j, long j2) {
        w5h.beginSection("releaseOutputBuffer");
        edaVar.releaseOutputBuffer(i, j2);
        w5h.endSection();
        this.f87719h3.f64832e++;
        this.f81555Y3 = 0;
        if (this.f81537G3.isEnabled()) {
            return;
        }
        this.f81558b4 = SystemClock.elapsedRealtime() * 1000;
        maybeNotifyVideoSizeChanged(this.f81562f4);
        maybeNotifyRenderedFirstFrame();
    }

    @Override // p000.uda
    @omg(29)
    /* JADX INFO: renamed from: I */
    public void mo21887I(sl3 sl3Var) throws ba5 {
        if (this.f81543M3) {
            ByteBuffer byteBuffer = (ByteBuffer) u80.checkNotNull(sl3Var.f82165m);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4) {
                    if (b3 == 0 || b3 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        setHdr10PlusInfoV29(m23272y(), bArr);
                    }
                }
            }
        }
    }

    @c5e(23)
    /* JADX INFO: renamed from: I0 */
    public void m21888I0(eda edaVar, Surface surface) {
        edaVar.setOutputSurface(surface);
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m21889J0(long j, long j2, boolean z) {
        return isBufferVeryLate(j) && !z;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m21890K0(long j, long j2, boolean z) {
        return isBufferLate(j) && !z;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: L */
    public void mo11630L(Exception exc) {
        yh9.m25916e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f81536F3.videoCodecError(exc);
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m21891L0(long j, long j2) {
        return isBufferLate(j) && j2 > 100000;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: M */
    public void mo11631M(String str, eda.C5265a c5265a, long j, long j2) {
        this.f81536F3.decoderInitialized(str, j, j2);
        this.f81542L3 = m21900x0(str);
        this.f81543M3 = ((kda) u80.checkNotNull(m23273z())).isHdr10PlusOutOfBandMetadataSupported();
        if (x0i.f95978a >= 23 && this.f81564h4) {
            this.f81566j4 = new C12547d((eda) u80.checkNotNull(m23272y()));
        }
        this.f81537G3.onCodecInitialized(str);
    }

    /* JADX INFO: renamed from: M0 */
    public void m21892M0(eda edaVar, int i, long j) {
        w5h.beginSection("skipVideoBuffer");
        edaVar.releaseOutputBuffer(i, false);
        w5h.endSection();
        this.f87719h3.f64833f++;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: N */
    public void mo11632N(String str) {
        this.f81536F3.decoderReleased(str);
    }

    /* JADX INFO: renamed from: N0 */
    public void m21893N0(int i, int i2) {
        nl3 nl3Var = this.f87719h3;
        nl3Var.f64835h += i;
        int i3 = i + i2;
        nl3Var.f64834g += i3;
        this.f81554X3 += i3;
        int i4 = this.f81555Y3 + i3;
        this.f81555Y3 = i4;
        nl3Var.f64836i = Math.max(i4, nl3Var.f64836i);
        int i5 = this.f81539I3;
        if (i5 <= 0 || this.f81554X3 < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    @Override // p000.uda
    @hib
    /* JADX INFO: renamed from: O */
    public wl3 mo11633O(nq6 nq6Var) throws ba5 {
        wl3 wl3VarMo11633O = super.mo11633O(nq6Var);
        this.f81536F3.inputFormatChanged(nq6Var.f65258b, wl3VarMo11633O);
        return wl3VarMo11633O;
    }

    /* JADX INFO: renamed from: O0 */
    public void m21894O0(long j) {
        this.f87719h3.addVideoFrameProcessingOffset(j);
        this.f81559c4 += j;
        this.f81560d4++;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: P */
    public void mo11634P(kq6 kq6Var, @hib MediaFormat mediaFormat) {
        int integer;
        int i;
        eda edaVarM23272y = m23272y();
        if (edaVarM23272y != null) {
            edaVarM23272y.setVideoScalingMode(this.f81547Q3);
        }
        int i2 = 0;
        if (this.f81564h4) {
            i = kq6Var.f54996Z;
            integer = kq6Var.f54990M1;
        } else {
            u80.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(StreamInformation.KEY_WIDTH);
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(StreamInformation.KEY_HEIGHT);
            i = integer2;
        }
        float f = kq6Var.f54999a2;
        if (codecAppliesRotation()) {
            int i3 = kq6Var.f54997Z1;
            if (i3 == 90 || i3 == 270) {
                f = 1.0f / f;
                int i4 = integer;
                integer = i;
                i = i4;
            }
        } else if (!this.f81537G3.isEnabled()) {
            i2 = kq6Var.f54997Z1;
        }
        this.f81562f4 = new z7i(i, integer, i2, f);
        this.f81535E3.onFormatChanged(kq6Var.f54993V1);
        if (this.f81537G3.isEnabled()) {
            this.f81537G3.setInputFormat(kq6Var.buildUpon().setWidth(i).setHeight(integer).setRotationDegrees(i2).setPixelWidthHeightRatio(f).build());
        }
    }

    @Override // p000.uda
    @un1
    /* JADX INFO: renamed from: R */
    public void mo21895R(long j) {
        super.mo21895R(j);
        if (this.f81564h4) {
            return;
        }
        this.f81556Z3--;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: S */
    public void mo11636S() {
        super.mo11636S();
        clearRenderedFirstFrame();
    }

    @Override // p000.uda
    @un1
    /* JADX INFO: renamed from: T */
    public void mo11637T(sl3 sl3Var) throws ba5 {
        boolean z = this.f81564h4;
        if (!z) {
            this.f81556Z3++;
        }
        if (x0i.f95978a >= 23 || !z) {
            return;
        }
        m21884F0(sl3Var.f82164f);
    }

    @Override // p000.uda
    @un1
    /* JADX INFO: renamed from: U */
    public void mo21896U(kq6 kq6Var) throws ba5 {
        if (this.f81537G3.isEnabled()) {
            return;
        }
        this.f81537G3.maybeEnable(kq6Var, m23259G());
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: V */
    public boolean mo11638V(long j, long j2, @hib eda edaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, kq6 kq6Var) throws ba5 {
        u80.checkNotNull(edaVar);
        if (this.f81551U3 == -9223372036854775807L) {
            this.f81551U3 = j;
        }
        if (j3 != this.f81557a4) {
            if (!this.f81537G3.isEnabled()) {
                this.f81535E3.onNextFrame(j3);
            }
            this.f81557a4 = j3;
        }
        long jM23259G = j3 - m23259G();
        if (z && !z2) {
            m21892M0(edaVar, i, jM23259G);
            return true;
        }
        boolean z3 = false;
        boolean z4 = getState() == 2;
        long jCalculateEarlyTimeUs = calculateEarlyTimeUs(j, j2, SystemClock.elapsedRealtime() * 1000, j3, z4);
        if (this.f81544N3 == this.f81545O3) {
            if (!isBufferLate(jCalculateEarlyTimeUs)) {
                return false;
            }
            m21892M0(edaVar, i, jM23259G);
            m21894O0(jCalculateEarlyTimeUs);
            return true;
        }
        if (shouldForceRender(j, jCalculateEarlyTimeUs)) {
            if (!this.f81537G3.isEnabled()) {
                z3 = true;
            } else if (!this.f81537G3.maybeRegisterFrame(kq6Var, jM23259G, z2)) {
                return false;
            }
            renderOutputBufferNow(edaVar, kq6Var, i, jM23259G, z3);
            m21894O0(jCalculateEarlyTimeUs);
            return true;
        }
        if (z4 && j != this.f81551U3) {
            long jNanoTime = System.nanoTime();
            long jAdjustReleaseTime = this.f81535E3.adjustReleaseTime((jCalculateEarlyTimeUs * 1000) + jNanoTime);
            if (!this.f81537G3.isEnabled()) {
                jCalculateEarlyTimeUs = (jAdjustReleaseTime - jNanoTime) / 1000;
            }
            boolean z5 = this.f81552V3 != -9223372036854775807L;
            if (m21889J0(jCalculateEarlyTimeUs, j2, z2) && m21883E0(j, z5)) {
                return false;
            }
            if (m21890K0(jCalculateEarlyTimeUs, j2, z2)) {
                if (z5) {
                    m21892M0(edaVar, i, jM23259G);
                } else {
                    m21901y0(edaVar, i, jM23259G);
                }
                m21894O0(jCalculateEarlyTimeUs);
                return true;
            }
            if (this.f81537G3.isEnabled()) {
                this.f81537G3.releaseProcessedFrames(j, j2);
                if (!this.f81537G3.maybeRegisterFrame(kq6Var, jM23259G, z2)) {
                    return false;
                }
                renderOutputBufferNow(edaVar, kq6Var, i, jM23259G, false);
                return true;
            }
            if (x0i.f95978a >= 21) {
                if (jCalculateEarlyTimeUs < 50000) {
                    if (jAdjustReleaseTime == this.f81561e4) {
                        m21892M0(edaVar, i, jM23259G);
                    } else {
                        notifyFrameMetadataListener(jM23259G, jAdjustReleaseTime, kq6Var);
                        m21886H0(edaVar, i, jM23259G, jAdjustReleaseTime);
                    }
                    m21894O0(jCalculateEarlyTimeUs);
                    this.f81561e4 = jAdjustReleaseTime;
                    return true;
                }
            } else if (jCalculateEarlyTimeUs < 30000) {
                if (jCalculateEarlyTimeUs > 11000) {
                    try {
                        Thread.sleep((jCalculateEarlyTimeUs - 10000) / 1000);
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        return false;
                    }
                }
                notifyFrameMetadataListener(jM23259G, jAdjustReleaseTime, kq6Var);
                m21885G0(edaVar, i, jM23259G);
                m21894O0(jCalculateEarlyTimeUs);
                return true;
            }
        }
        return false;
    }

    @Override // p000.uda
    @un1
    /* JADX INFO: renamed from: Y */
    public void mo21897Y() {
        super.mo21897Y();
        this.f81556Z3 = 0;
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: c0 */
    public boolean mo21898c0(kda kdaVar) {
        return this.f81544N3 != null || shouldUsePlaceholderSurface(kdaVar);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: f0 */
    public int mo11641f0(yda ydaVar, kq6 kq6Var) throws oea.C10346c {
        boolean z;
        int i = 0;
        if (!sva.isVideo(kq6Var.f54989M)) {
            return p1e.create(0);
        }
        boolean z2 = kq6Var.f54994X != null;
        List<kda> decoderInfos = getDecoderInfos(this.f81534D3, ydaVar, kq6Var, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(this.f81534D3, ydaVar, kq6Var, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return p1e.create(1);
        }
        if (!uda.m23256g0(kq6Var)) {
            return p1e.create(2);
        }
        kda kdaVar = decoderInfos.get(0);
        boolean zIsFormatSupported = kdaVar.isFormatSupported(kq6Var);
        if (zIsFormatSupported) {
            z = true;
        } else {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                kda kdaVar2 = decoderInfos.get(i2);
                if (kdaVar2.isFormatSupported(kq6Var)) {
                    z = false;
                    zIsFormatSupported = true;
                    kdaVar = kdaVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = zIsFormatSupported ? 4 : 3;
        int i4 = kdaVar.isSeamlessAdaptationSupported(kq6Var) ? 16 : 8;
        int i5 = kdaVar.f53656h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if (x0i.f95978a >= 26 && "video/dolby-vision".equals(kq6Var.f54989M) && !C12545b.doesDisplaySupportDolbyVision(this.f81534D3)) {
            i6 = 256;
        }
        if (zIsFormatSupported) {
            List<kda> decoderInfos2 = getDecoderInfos(this.f81534D3, ydaVar, kq6Var, z2, true);
            if (!decoderInfos2.isEmpty()) {
                kda kdaVar3 = oea.getDecoderInfosSortedByFormatSupport(decoderInfos2, kq6Var).get(0);
                if (kdaVar3.isFormatSupported(kq6Var) && kdaVar3.isSeamlessAdaptationSupported(kq6Var)) {
                    i = 32;
                }
            }
        }
        return p1e.create(i3, i4, i, i5, i6);
    }

    @Override // p000.n1e, p000.p1e
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p000.bu0, p000.l0d.InterfaceC8571b
    public void handleMessage(int i, @hib Object obj) throws ba5 {
        Surface surface;
        if (i == 1) {
            setOutput(obj);
            return;
        }
        if (i == 7) {
            this.f81567k4 = (n6i) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) obj).intValue();
            if (this.f81565i4 != iIntValue) {
                this.f81565i4 = iIntValue;
                if (this.f81564h4) {
                    m23263W();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.f81547Q3 = ((Integer) obj).intValue();
            eda edaVarM23272y = m23272y();
            if (edaVarM23272y != null) {
                edaVarM23272y.setVideoScalingMode(this.f81547Q3);
                return;
            }
            return;
        }
        if (i == 5) {
            this.f81535E3.setChangeFrameRateStrategy(((Integer) obj).intValue());
            return;
        }
        if (i == 13) {
            this.f81537G3.setVideoEffects((List) u80.checkNotNull(obj));
            return;
        }
        if (i != 14) {
            super.handleMessage(i, obj);
            return;
        }
        ypf ypfVar = (ypf) u80.checkNotNull(obj);
        if (ypfVar.getWidth() == 0 || ypfVar.getHeight() == 0 || (surface = this.f81544N3) == null) {
            return;
        }
        this.f81537G3.setOutputSurfaceInfo(surface, ypfVar);
    }

    @Override // p000.uda, p000.n1e
    public boolean isEnded() {
        boolean zIsEnded = super.isEnded();
        return this.f81537G3.isEnabled() ? zIsEnded & this.f81537G3.releasedLastFrame() : zIsEnded;
    }

    @Override // p000.uda, p000.n1e
    public boolean isReady() {
        PlaceholderSurface placeholderSurface;
        if (super.isReady() && ((!this.f81537G3.isEnabled() || this.f81537G3.isReady()) && (this.f81548R3 || (((placeholderSurface = this.f81545O3) != null && this.f81544N3 == placeholderSurface) || m23272y() == null || this.f81564h4)))) {
            this.f81552V3 = -9223372036854775807L;
            return true;
        }
        if (this.f81552V3 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f81552V3) {
            return true;
        }
        this.f81552V3 = -9223372036854775807L;
        return false;
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: j */
    public void mo3412j() {
        clearReportedVideoSize();
        clearRenderedFirstFrame();
        this.f81546P3 = false;
        this.f81566j4 = null;
        try {
            super.mo3412j();
        } finally {
            this.f81536F3.disabled(this.f87719h3);
            this.f81536F3.videoSizeChanged(z7i.f104340F);
        }
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: k */
    public void mo3413k(boolean z, boolean z2) throws ba5 {
        super.mo3413k(z, z2);
        boolean z3 = m3405c().f76783a;
        u80.checkState((z3 && this.f81565i4 == 0) ? false : true);
        if (this.f81564h4 != z3) {
            this.f81564h4 = z3;
            m23263W();
        }
        this.f81536F3.enabled(this.f87719h3);
        this.f81549S3 = z2;
        this.f81550T3 = false;
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: l */
    public void mo3414l(long j, boolean z) throws ba5 {
        super.mo3414l(j, z);
        if (this.f81537G3.isEnabled()) {
            this.f81537G3.flush();
        }
        clearRenderedFirstFrame();
        this.f81535E3.onPositionReset();
        this.f81557a4 = -9223372036854775807L;
        this.f81551U3 = -9223372036854775807L;
        this.f81555Y3 = 0;
        if (z) {
            setJoiningDeadlineMs();
        } else {
            this.f81552V3 = -9223372036854775807L;
        }
    }

    public void maybeNotifyRenderedFirstFrame() {
        this.f81550T3 = true;
        if (this.f81548R3) {
            return;
        }
        this.f81548R3 = true;
        this.f81536F3.renderedFirstFrame(this.f81544N3);
        this.f81546P3 = true;
    }

    @Override // p000.uda, p000.bu0
    @omg(17)
    /* JADX INFO: renamed from: o */
    public void mo3417o() {
        try {
            super.mo3417o();
        } finally {
            if (this.f81537G3.isEnabled()) {
                this.f81537G3.reset();
            }
            if (this.f81545O3 != null) {
                releasePlaceholderSurface();
            }
        }
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: p */
    public void mo3418p() {
        super.mo3418p();
        this.f81554X3 = 0;
        this.f81553W3 = SystemClock.elapsedRealtime();
        this.f81558b4 = SystemClock.elapsedRealtime() * 1000;
        this.f81559c4 = 0L;
        this.f81560d4 = 0;
        this.f81535E3.onStarted();
    }

    @Override // p000.uda, p000.bu0
    /* JADX INFO: renamed from: q */
    public void mo3419q() {
        this.f81552V3 = -9223372036854775807L;
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        this.f81535E3.onStopped();
        super.mo3419q();
    }

    @Override // p000.uda, p000.n1e
    @un1
    public void render(long j, long j2) throws ba5 {
        super.render(j, j2);
        if (this.f81537G3.isEnabled()) {
            this.f81537G3.releaseProcessedFrames(j, j2);
        }
    }

    @Override // p000.uda, p000.n1e
    public void setPlaybackSpeed(float f, float f2) throws ba5 {
        super.setPlaybackSpeed(f, f2);
        this.f81535E3.onPlaybackSpeed(f);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: u */
    public wl3 mo11645u(kda kdaVar, kq6 kq6Var, kq6 kq6Var2) {
        wl3 wl3VarCanReuseCodec = kdaVar.canReuseCodec(kq6Var, kq6Var2);
        int i = wl3VarCanReuseCodec.f94613e;
        int i2 = kq6Var2.f54996Z;
        C12546c c12546c = this.f81541K3;
        if (i2 > c12546c.f81596a || kq6Var2.f54990M1 > c12546c.f81597b) {
            i |= 256;
        }
        if (m21864B0(kdaVar, kq6Var2) > this.f81541K3.f81598c) {
            i |= 64;
        }
        int i3 = i;
        return new wl3(kdaVar.f53649a, kq6Var, kq6Var2, i3 != 0 ? 0 : wl3VarCanReuseCodec.f94612d, i3);
    }

    @Override // p000.uda
    /* JADX INFO: renamed from: v */
    public ida mo21899v(Throwable th, @hib kda kdaVar) {
        return new pea(th, kdaVar, this.f81544N3);
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m21900x0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (sea.class) {
            try {
                if (!f81532u4) {
                    f81533v4 = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    f81532u4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f81533v4;
    }

    /* JADX INFO: renamed from: y0 */
    public void m21901y0(eda edaVar, int i, long j) {
        w5h.beginSection("dropVideoBuffer");
        edaVar.releaseOutputBuffer(i, false);
        w5h.endSection();
        m21893N0(0, 1);
    }

    /* JADX INFO: renamed from: z0 */
    public Pair<f92, f92> m21902z0(@hib f92 f92Var) {
        if (f92.isTransferHdr(f92Var)) {
            return f92Var.f35739c == 7 ? Pair.create(f92Var, f92Var.buildUpon().setColorTransfer(6).build()) : Pair.create(f92Var, f92Var);
        }
        f92 f92Var2 = f92.f35735f;
        return Pair.create(f92Var2, f92Var2);
    }

    public sea(Context context, yda ydaVar, long j) {
        this(context, ydaVar, j, null, null, 0);
    }

    public sea(Context context, yda ydaVar, long j, @hib Handler handler, @hib w7i w7iVar, int i) {
        this(context, eda.InterfaceC5266b.f32706a, ydaVar, j, false, handler, w7iVar, i, 30.0f);
    }

    public sea(Context context, yda ydaVar, long j, boolean z, @hib Handler handler, @hib w7i w7iVar, int i) {
        this(context, eda.InterfaceC5266b.f32706a, ydaVar, j, z, handler, w7iVar, i, 30.0f);
    }

    public sea(Context context, eda.InterfaceC5266b interfaceC5266b, yda ydaVar, long j, boolean z, @hib Handler handler, @hib w7i w7iVar, int i) {
        this(context, interfaceC5266b, ydaVar, j, z, handler, w7iVar, i, 30.0f);
    }

    public sea(Context context, eda.InterfaceC5266b interfaceC5266b, yda ydaVar, long j, boolean z, @hib Handler handler, @hib w7i w7iVar, int i, float f) {
        super(2, interfaceC5266b, ydaVar, z, f);
        this.f81538H3 = j;
        this.f81539I3 = i;
        Context applicationContext = context.getApplicationContext();
        this.f81534D3 = applicationContext;
        y6i y6iVar = new y6i(applicationContext);
        this.f81535E3 = y6iVar;
        this.f81536F3 = new w7i.C14466a(handler, w7iVar);
        this.f81537G3 = new C12544a(y6iVar, this);
        this.f81540J3 = deviceNeedsNoPostProcessWorkaround();
        this.f81552V3 = -9223372036854775807L;
        this.f81547Q3 = 1;
        this.f81562f4 = z7i.f104340F;
        this.f81565i4 = 0;
        clearReportedVideoSize();
    }
}
