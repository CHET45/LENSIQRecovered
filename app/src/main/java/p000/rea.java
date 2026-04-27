package p000;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C1213a;
import androidx.media3.exoplayer.InterfaceC1254q;
import androidx.media3.exoplayer.InterfaceC1255s;
import androidx.media3.exoplayer.video.PlaceholderSurface;
import com.arthenica.ffmpegkit.StreamInformation;
import com.google.android.gms.common.Scopes;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.PriorityQueue;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.Videoio;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.bzc;
import p000.dda;
import p000.nea;
import p000.q1h;
import p000.t6i;
import p000.una;
import p000.v7i;
import p000.x7i;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class rea extends sda implements t6i.InterfaceC12941c {

    /* JADX INFO: renamed from: A4 */
    public static final String f78013A4 = "crop-left";

    /* JADX INFO: renamed from: B4 */
    public static final String f78014B4 = "crop-right";

    /* JADX INFO: renamed from: C4 */
    public static final String f78015C4 = "crop-bottom";

    /* JADX INFO: renamed from: D4 */
    public static final String f78016D4 = "crop-top";

    /* JADX INFO: renamed from: E4 */
    public static final int[] f78017E4 = {1920, Videoio.CAP_OPENNI2, 1440, 1280, 960, 854, Imgcodecs.IMWRITE_JPEGXL_QUALITY, Videoio.CAP_PROP_XI_BUFFER_POLICY, Videoio.CAP_PROP_XI_CC_MATRIX_01};

    /* JADX INFO: renamed from: F4 */
    public static final float f78018F4 = 1.5f;

    /* JADX INFO: renamed from: G4 */
    public static final long f78019G4 = Long.MAX_VALUE;

    /* JADX INFO: renamed from: H4 */
    public static final int f78020H4 = 2097152;

    /* JADX INFO: renamed from: I4 */
    public static final long f78021I4 = -30000;

    /* JADX INFO: renamed from: J4 */
    public static final long f78022J4 = -500000;

    /* JADX INFO: renamed from: K4 */
    public static final long f78023K4 = 100000;

    /* JADX INFO: renamed from: L4 */
    public static final int f78024L4 = 0;

    /* JADX INFO: renamed from: M4 */
    public static boolean f78025M4 = false;

    /* JADX INFO: renamed from: N4 */
    public static boolean f78026N4 = false;

    /* JADX INFO: renamed from: z4 */
    public static final String f78027z4 = "MediaCodecVideoRenderer";

    /* JADX INFO: renamed from: G3 */
    public final Context f78028G3;

    /* JADX INFO: renamed from: H3 */
    public final boolean f78029H3;

    /* JADX INFO: renamed from: I3 */
    public final v7i.C13929a f78030I3;

    /* JADX INFO: renamed from: J3 */
    public final int f78031J3;

    /* JADX INFO: renamed from: K3 */
    public final boolean f78032K3;

    /* JADX INFO: renamed from: L3 */
    public final t6i f78033L3;

    /* JADX INFO: renamed from: M3 */
    public final t6i.C12940b f78034M3;

    /* JADX INFO: renamed from: N3 */
    @hib
    public final qm0 f78035N3;

    /* JADX INFO: renamed from: O3 */
    public final long f78036O3;

    /* JADX INFO: renamed from: P3 */
    @hib
    public final u6i f78037P3;

    /* JADX INFO: renamed from: Q3 */
    public final PriorityQueue<Long> f78038Q3;

    /* JADX INFO: renamed from: R3 */
    public final boolean f78039R3;

    /* JADX INFO: renamed from: S3 */
    public C12041e f78040S3;

    /* JADX INFO: renamed from: T3 */
    public boolean f78041T3;

    /* JADX INFO: renamed from: U3 */
    public boolean f78042U3;

    /* JADX INFO: renamed from: V3 */
    public x7i f78043V3;

    /* JADX INFO: renamed from: W3 */
    public boolean f78044W3;

    /* JADX INFO: renamed from: X3 */
    public int f78045X3;

    /* JADX INFO: renamed from: Y3 */
    public List<ix4> f78046Y3;

    /* JADX INFO: renamed from: Z3 */
    @hib
    public Surface f78047Z3;

    /* JADX INFO: renamed from: a4 */
    @hib
    public PlaceholderSurface f78048a4;

    /* JADX INFO: renamed from: b4 */
    public xpf f78049b4;

    /* JADX INFO: renamed from: c4 */
    public boolean f78050c4;

    /* JADX INFO: renamed from: d4 */
    public int f78051d4;

    /* JADX INFO: renamed from: e4 */
    public int f78052e4;

    /* JADX INFO: renamed from: f4 */
    public long f78053f4;

    /* JADX INFO: renamed from: g4 */
    public int f78054g4;

    /* JADX INFO: renamed from: h4 */
    public int f78055h4;

    /* JADX INFO: renamed from: i4 */
    public int f78056i4;

    /* JADX INFO: renamed from: j4 */
    @hib
    public hse f78057j4;

    /* JADX INFO: renamed from: k4 */
    public boolean f78058k4;

    /* JADX INFO: renamed from: l4 */
    public long f78059l4;

    /* JADX INFO: renamed from: m4 */
    public int f78060m4;

    /* JADX INFO: renamed from: n4 */
    public long f78061n4;

    /* JADX INFO: renamed from: o4 */
    public a8i f78062o4;

    /* JADX INFO: renamed from: p4 */
    @hib
    public a8i f78063p4;

    /* JADX INFO: renamed from: q4 */
    public int f78064q4;

    /* JADX INFO: renamed from: r4 */
    public boolean f78065r4;

    /* JADX INFO: renamed from: s4 */
    public int f78066s4;

    /* JADX INFO: renamed from: t4 */
    @hib
    public C12042f f78067t4;

    /* JADX INFO: renamed from: u4 */
    @hib
    public o6i f78068u4;

    /* JADX INFO: renamed from: v4 */
    public long f78069v4;

    /* JADX INFO: renamed from: w4 */
    public long f78070w4;

    /* JADX INFO: renamed from: x4 */
    public boolean f78071x4;

    /* JADX INFO: renamed from: y4 */
    public int f78072y4;

    /* JADX INFO: renamed from: rea$a */
    public class C12037a implements x7i.InterfaceC14974c {
        public C12037a() {
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onError(x7i.C14976e c14976e) {
            rea reaVar = rea.this;
            reaVar.m21855o0(reaVar.m1747a(c14976e, c14976e.f97123a, 7001));
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onFirstFrameRendered() {
            if (rea.this.f78047Z3 != null) {
                rea.this.notifyRenderedFirstFrame();
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onFrameAvailableForRendering() {
            InterfaceC1254q.c cVarM21847T = rea.this.m21847T();
            if (cVarM21847T != null) {
                cVarM21847T.onWakeup();
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onFrameDropped() {
            if (rea.this.f78047Z3 != null) {
                rea.this.m21224g1(0, 1);
            }
        }

        @Override // p000.x7i.InterfaceC14974c
        public void onVideoSizeChanged(a8i a8iVar) {
        }
    }

    /* JADX INFO: renamed from: rea$b */
    public class C12038b implements x7i.InterfaceC14975d {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ dda f78074a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f78075b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f78076c;

        public C12038b(dda ddaVar, int i, long j) {
            this.f78074a = ddaVar;
            this.f78075b = i;
            this.f78076c = j;
        }

        @Override // p000.x7i.InterfaceC14975d
        public void render(long j) {
            rea.this.renderOutputBuffer(this.f78074a, this.f78075b, this.f78076c, j);
        }

        @Override // p000.x7i.InterfaceC14975d
        public void skip() {
            rea.this.m21223f1(this.f78074a, this.f78075b, this.f78076c);
        }
    }

    /* JADX INFO: renamed from: rea$c */
    @c5e(26)
    public static final class C12039c {
        private C12039c() {
        }

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

    /* JADX INFO: renamed from: rea$d */
    public static final class C12040d {

        /* JADX INFO: renamed from: a */
        public final Context f78078a;

        /* JADX INFO: renamed from: b */
        public boolean f78079b;

        /* JADX INFO: renamed from: d */
        public dda.InterfaceC4752b f78081d;

        /* JADX INFO: renamed from: e */
        public long f78082e;

        /* JADX INFO: renamed from: f */
        public boolean f78083f;

        /* JADX INFO: renamed from: g */
        @hib
        public Handler f78084g;

        /* JADX INFO: renamed from: h */
        @hib
        public v7i f78085h;

        /* JADX INFO: renamed from: i */
        public int f78086i;

        /* JADX INFO: renamed from: k */
        @hib
        public x7i f78088k;

        /* JADX INFO: renamed from: l */
        public boolean f78089l;

        /* JADX INFO: renamed from: n */
        public boolean f78091n;

        /* JADX INFO: renamed from: c */
        public zda f78080c = zda.f104850a;

        /* JADX INFO: renamed from: j */
        public float f78087j = 30.0f;

        /* JADX INFO: renamed from: m */
        public long f78090m = -9223372036854775807L;

        public C12040d(Context context) {
            this.f78078a = context;
            this.f78081d = dda.InterfaceC4752b.getDefault(context);
        }

        public rea build() {
            v80.checkState(!this.f78079b);
            Handler handler = this.f78084g;
            v80.checkState((handler == null && this.f78085h == null) || !(handler == null || this.f78085h == null));
            this.f78079b = true;
            return new rea(this);
        }

        @c5e(34)
        @op1
        public C12040d experimentalSetEnableMediaCodecBufferDecodeOnlyFlag(boolean z) {
            this.f78091n = z;
            return this;
        }

        @op1
        public C12040d experimentalSetLateThresholdToDropDecoderInputUs(long j) {
            this.f78090m = j;
            return this;
        }

        @op1
        public C12040d experimentalSetParseAv1SampleDependencies(boolean z) {
            this.f78089l = z;
            return this;
        }

        @op1
        public C12040d setAllowedJoiningTimeMs(long j) {
            this.f78082e = j;
            return this;
        }

        @op1
        public C12040d setAssumedMinimumCodecOperatingRate(float f) {
            this.f78087j = f;
            return this;
        }

        @op1
        public C12040d setCodecAdapterFactory(dda.InterfaceC4752b interfaceC4752b) {
            this.f78081d = interfaceC4752b;
            return this;
        }

        @op1
        public C12040d setEnableDecoderFallback(boolean z) {
            this.f78083f = z;
            return this;
        }

        @op1
        public C12040d setEventHandler(@hib Handler handler) {
            this.f78084g = handler;
            return this;
        }

        @op1
        public C12040d setEventListener(@hib v7i v7iVar) {
            this.f78085h = v7iVar;
            return this;
        }

        @op1
        public C12040d setMaxDroppedFramesToNotify(int i) {
            this.f78086i = i;
            return this;
        }

        @op1
        public C12040d setMediaCodecSelector(zda zdaVar) {
            this.f78080c = zdaVar;
            return this;
        }

        @op1
        public C12040d setVideoSink(@hib x7i x7iVar) {
            this.f78088k = x7iVar;
            return this;
        }
    }

    /* JADX INFO: renamed from: rea$e */
    public static final class C12041e {

        /* JADX INFO: renamed from: a */
        public final int f78092a;

        /* JADX INFO: renamed from: b */
        public final int f78093b;

        /* JADX INFO: renamed from: c */
        public final int f78094c;

        public C12041e(int i, int i2, int i3) {
            this.f78092a = i;
            this.f78093b = i2;
            this.f78094c = i3;
        }
    }

    /* JADX INFO: renamed from: rea$f */
    @c5e(23)
    public final class C12042f implements dda.InterfaceC4754d, Handler.Callback {

        /* JADX INFO: renamed from: c */
        public static final int f78095c = 0;

        /* JADX INFO: renamed from: a */
        public final Handler f78096a;

        public C12042f(dda ddaVar) {
            Handler handlerCreateHandlerForCurrentLooper = t0i.createHandlerForCurrentLooper(this);
            this.f78096a = handlerCreateHandlerForCurrentLooper;
            ddaVar.setOnFrameRenderedListener(this, handlerCreateHandlerForCurrentLooper);
        }

        private void handleFrameRendered(long j) {
            rea reaVar = rea.this;
            if (this != reaVar.f78067t4 || reaVar.m21838E() == null) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                rea.this.onProcessedTunneledEndOfStream();
                return;
            }
            try {
                rea.this.m21212V0(j);
            } catch (aa5 e) {
                rea.this.m21855o0(e);
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            handleFrameRendered(t0i.toLong(message.arg1, message.arg2));
            return true;
        }

        @Override // p000.dda.InterfaceC4754d
        public void onFrameRendered(dda ddaVar, long j, long j2) {
            if (Build.VERSION.SDK_INT >= 30) {
                handleFrameRendered(j);
            } else {
                this.f78096a.sendMessageAtFrontOfQueue(Message.obtain(this.f78096a, 0, (int) (j >> 32), (int) j));
            }
        }
    }

    @Deprecated
    public rea(Context context, zda zdaVar) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar));
    }

    /* JADX INFO: renamed from: R0 */
    public static int m21197R0(lda ldaVar, C1213a c1213a) {
        if (c1213a.f8292p == -1) {
            return getCodecMaxInputSize(ldaVar, c1213a);
        }
        int size = c1213a.f8294r.size();
        int length = 0;
        for (int i = 0; i < size; i++) {
            length += c1213a.f8294r.get(i).length;
        }
        return c1213a.f8292p + length;
    }

    @g5e({"videoSink"})
    private void configureVideoSink() {
        this.f78043V3.setListener(new C12037a(), xya.directExecutor());
        o6i o6iVar = this.f78068u4;
        if (o6iVar != null) {
            this.f78043V3.setVideoFrameMetadataListener(o6iVar);
        }
        if (this.f78047Z3 != null && !this.f78049b4.equals(xpf.f98880c)) {
            this.f78043V3.setOutputSurfaceInfo(this.f78047Z3, this.f78049b4);
        }
        this.f78043V3.setChangeFrameRateStrategy(this.f78052e4);
        this.f78043V3.setPlaybackSpeed(m21846S());
        List<ix4> list = this.f78046Y3;
        if (list != null) {
            this.f78043V3.setVideoEffects(list);
        }
    }

    private static boolean deviceNeedsNoPostProcessWorkaround() {
        return "NVIDIA".equals(Build.MANUFACTURER);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static boolean evaluateDeviceNeedsSetOutputSurfaceWorkaround() {
        String str;
        byte b = 26;
        int i = Build.VERSION.SDK_INT;
        if (i <= 28) {
            String str2 = Build.DEVICE;
            str2.hashCode();
            switch (str2) {
            }
            return true;
        }
        if (i <= 27 && "HWEML".equals(Build.DEVICE)) {
            return true;
        }
        str = Build.MODEL;
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
                    String str3 = Build.DEVICE;
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getCodecMaxInputSize(p000.lda r11, androidx.media3.common.C1213a r12) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rea.getCodecMaxInputSize(lda, androidx.media3.common.a):int");
    }

    @hib
    private static Point getCodecMaxSize(lda ldaVar, C1213a c1213a) {
        int i = c1213a.f8299w;
        int i2 = c1213a.f8298v;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : f78017E4) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            int i6 = z ? i5 : i4;
            if (!z) {
                i4 = i5;
            }
            Point pointAlignVideoSizeV21 = ldaVar.alignVideoSizeV21(i6, i4);
            float f2 = c1213a.f8302z;
            if (pointAlignVideoSizeV21 != null && ldaVar.isVideoSizeAndRateSupportedV21(pointAlignVideoSizeV21.x, pointAlignVideoSizeV21.y, f2)) {
                return pointAlignVideoSizeV21;
            }
        }
        return null;
    }

    private static List<lda> getDecoderInfos(Context context, zda zdaVar, C1213a c1213a, boolean z, boolean z2) throws nea.C9821c {
        String str = c1213a.f8291o;
        if (str == null) {
            return kx7.m15110of();
        }
        if ("video/dolby-vision".equals(str) && !C12039c.doesDisplaySupportDolbyVision(context)) {
            List<lda> alternativeDecoderInfos = nea.getAlternativeDecoderInfos(zdaVar, c1213a, z, z2);
            if (!alternativeDecoderInfos.isEmpty()) {
                return alternativeDecoderInfos;
            }
        }
        return nea.getDecoderInfosSoftMatch(zdaVar, c1213a, z, z2);
    }

    private static int getMaxSampleSize(int i, int i2) {
        return (i * 3) / (i2 * 2);
    }

    @hib
    private Surface getSurfaceForCodec(lda ldaVar) {
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            return x7iVar.getInputSurface();
        }
        Surface surface = this.f78047Z3;
        if (surface != null) {
            return surface;
        }
        if (m21221d1(ldaVar)) {
            return null;
        }
        v80.checkState(m21222e1(ldaVar));
        PlaceholderSurface placeholderSurface = this.f78048a4;
        if (placeholderSurface != null && placeholderSurface.f9228a != ldaVar.f57258g) {
            releasePlaceholderSurface();
        }
        if (this.f78048a4 == null) {
            this.f78048a4 = PlaceholderSurface.newInstance(this.f78028G3, ldaVar.f57258g);
        }
        return this.f78048a4;
    }

    private boolean hasSurfaceForCodec(lda ldaVar) {
        Surface surface;
        return this.f78043V3 != null || ((surface = this.f78047Z3) != null && surface.isValid()) || m21221d1(ldaVar) || m21222e1(ldaVar);
    }

    private boolean isBufferBeforeStartTime(rl3 rl3Var) {
        return rl3Var.f78610f < m1753g();
    }

    private boolean isBufferProbablyLastSample(rl3 rl3Var) {
        if (hasReadStreamToEnd() || rl3Var.isLastSample() || this.f78070w4 == -9223372036854775807L) {
            return true;
        }
        return this.f78070w4 - (rl3Var.f78610f - m21844Q()) <= 100000;
    }

    private void maybeNotifyDroppedFrames() {
        if (this.f78054g4 > 0) {
            long jElapsedRealtime = m1749c().elapsedRealtime();
            this.f78030I3.droppedFrames(this.f78054g4, jElapsedRealtime - this.f78053f4);
            this.f78054g4 = 0;
            this.f78053f4 = jElapsedRealtime;
        }
    }

    private void maybeNotifyRenderedFirstFrame() {
        if (!this.f78033L3.onFrameReleasedIsFirstFrame() || this.f78047Z3 == null) {
            return;
        }
        notifyRenderedFirstFrame();
    }

    private void maybeNotifyVideoFrameProcessingOffset() {
        int i = this.f78060m4;
        if (i != 0) {
            this.f78030I3.reportVideoFrameProcessingOffset(this.f78059l4, i);
            this.f78059l4 = 0L;
            this.f78060m4 = 0;
        }
    }

    private void maybeNotifyVideoSizeChanged(a8i a8iVar) {
        if (a8iVar.equals(a8i.f643h) || a8iVar.equals(this.f78063p4)) {
            return;
        }
        this.f78063p4 = a8iVar;
        this.f78030I3.videoSizeChanged(a8iVar);
    }

    private void maybeRenotifyRenderedFirstFrame() {
        Surface surface = this.f78047Z3;
        if (surface == null || !this.f78050c4) {
            return;
        }
        this.f78030I3.renderedFirstFrame(surface);
    }

    private void maybeRenotifyVideoSizeChanged() {
        a8i a8iVar = this.f78063p4;
        if (a8iVar != null) {
            this.f78030I3.videoSizeChanged(a8iVar);
        }
    }

    private void maybeSetKeyAllowFrameDrop(MediaFormat mediaFormat) {
        if (this.f78043V3 == null || t0i.isFrameDropAllowedOnSurfaceInput(this.f78028G3)) {
            return;
        }
        mediaFormat.setInteger("allow-frame-drop", 0);
    }

    private void maybeSetupTunnelingForFirstFrame() {
        if (this.f78065r4) {
            int i = Build.VERSION.SDK_INT;
            dda ddaVarM21838E = m21838E();
            if (ddaVarM21838E == null) {
                return;
            }
            this.f78067t4 = new C12042f(ddaVarM21838E);
            if (i >= 33) {
                Bundle bundle = new Bundle();
                bundle.putInt("tunnel-peek", 1);
                ddaVarM21838E.setParameters(bundle);
            }
        }
    }

    private void notifyFrameMetadataListener(long j, long j2, C1213a c1213a) {
        o6i o6iVar = this.f78068u4;
        if (o6iVar != null) {
            o6iVar.onVideoFrameAboutToBeRendered(j, j2, c1213a, m21842L());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @g5e({"displaySurface"})
    public void notifyRenderedFirstFrame() {
        this.f78030I3.renderedFirstFrame(this.f78047Z3);
        this.f78050c4 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onProcessedTunneledEndOfStream() {
        m21854n0();
    }

    private void releaseFrame(dda ddaVar, int i, long j, C1213a c1213a) {
        long releaseTimeNs = this.f78034M3.getReleaseTimeNs();
        long earlyUs = this.f78034M3.getEarlyUs();
        if (m21220c1() && releaseTimeNs == this.f78061n4) {
            m21223f1(ddaVar, i, j);
        } else {
            notifyFrameMetadataListener(j, releaseTimeNs, c1213a);
            m21214X0(ddaVar, i, j, releaseTimeNs);
        }
        m21226h1(earlyUs);
        this.f78061n4 = releaseTimeNs;
    }

    private void releasePlaceholderSurface() {
        PlaceholderSurface placeholderSurface = this.f78048a4;
        if (placeholderSurface != null) {
            placeholderSurface.release();
            this.f78048a4 = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void renderOutputBuffer(dda ddaVar, int i, long j, long j2) {
        m21214X0(ddaVar, i, j, j2);
    }

    @c5e(29)
    private static void setHdr10PlusInfoV29(dda ddaVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        ddaVar.setParameters(bundle);
    }

    private void setOutput(@hib Object obj) throws aa5 {
        Surface surface = obj instanceof Surface ? (Surface) obj : null;
        if (this.f78047Z3 == surface) {
            if (surface != null) {
                maybeRenotifyVideoSizeChanged();
                maybeRenotifyRenderedFirstFrame();
                return;
            }
            return;
        }
        this.f78047Z3 = surface;
        if (this.f78043V3 == null) {
            this.f78033L3.setOutputSurface(surface);
        }
        this.f78050c4 = false;
        int state = getState();
        dda ddaVarM21838E = m21838E();
        if (ddaVarM21838E != null && this.f78043V3 == null) {
            lda ldaVar = (lda) v80.checkNotNull(m21839G());
            if (!hasSurfaceForCodec(ldaVar) || this.f78041T3) {
                m21852j0();
                m21851Y();
            } else {
                setOutputSurface(ddaVarM21838E, getSurfaceForCodec(ldaVar));
            }
        }
        if (surface != null) {
            maybeRenotifyVideoSizeChanged();
        } else {
            this.f78063p4 = null;
            x7i x7iVar = this.f78043V3;
            if (x7iVar != null) {
                x7iVar.clearOutputSurfaceInfo();
            }
        }
        if (state == 2) {
            x7i x7iVar2 = this.f78043V3;
            if (x7iVar2 != null) {
                x7iVar2.join(true);
            } else {
                this.f78033L3.join(true);
            }
        }
        maybeSetupTunnelingForFirstFrame();
    }

    private void setOutputSurface(dda ddaVar, @hib Surface surface) {
        int i = Build.VERSION.SDK_INT;
        if (surface != null) {
            m21215Y0(ddaVar, surface);
        } else {
            if (i < 35) {
                throw new IllegalStateException();
            }
            m21204M0(ddaVar);
        }
    }

    public static int supportsFormat(Context context, zda zdaVar, C1213a c1213a) throws nea.C9821c {
        return supportsFormatInternal(context, zdaVar, c1213a);
    }

    private static int supportsFormatInternal(Context context, zda zdaVar, C1213a c1213a) throws nea.C9821c {
        boolean z;
        int i = 0;
        if (!rva.isVideo(c1213a.f8291o)) {
            return InterfaceC1255s.create(0);
        }
        boolean z2 = c1213a.f8295s != null;
        List<lda> decoderInfos = getDecoderInfos(context, zdaVar, c1213a, z2, false);
        if (z2 && decoderInfos.isEmpty()) {
            decoderInfos = getDecoderInfos(context, zdaVar, c1213a, false, false);
        }
        if (decoderInfos.isEmpty()) {
            return InterfaceC1255s.create(1);
        }
        if (!sda.m21836x0(c1213a)) {
            return InterfaceC1255s.create(2);
        }
        lda ldaVar = decoderInfos.get(0);
        boolean zIsFormatSupported = ldaVar.isFormatSupported(c1213a);
        if (zIsFormatSupported) {
            z = true;
        } else {
            for (int i2 = 1; i2 < decoderInfos.size(); i2++) {
                lda ldaVar2 = decoderInfos.get(i2);
                if (ldaVar2.isFormatSupported(c1213a)) {
                    z = false;
                    zIsFormatSupported = true;
                    ldaVar = ldaVar2;
                    break;
                }
            }
            z = true;
        }
        int i3 = zIsFormatSupported ? 4 : 3;
        int i4 = ldaVar.isSeamlessAdaptationSupported(c1213a) ? 16 : 8;
        int i5 = ldaVar.f57259h ? 64 : 0;
        int i6 = z ? 128 : 0;
        if ("video/dolby-vision".equals(c1213a.f8291o) && !C12039c.doesDisplaySupportDolbyVision(context)) {
            i6 = 256;
        }
        if (zIsFormatSupported) {
            List<lda> decoderInfos2 = getDecoderInfos(context, zdaVar, c1213a, z2, true);
            if (!decoderInfos2.isEmpty()) {
                lda ldaVar3 = nea.getDecoderInfosSortedByFormatSupport(decoderInfos2, c1213a).get(0);
                if (ldaVar3.isFormatSupported(c1213a) && ldaVar3.isSeamlessAdaptationSupported(c1213a)) {
                    i = 32;
                }
            }
        }
        return InterfaceC1255s.create(i3, i4, i, i5, i6);
    }

    private void updateCodecImportance() {
        dda ddaVarM21838E = m21838E();
        if (ddaVarM21838E != null && Build.VERSION.SDK_INT >= 35) {
            Bundle bundle = new Bundle();
            bundle.putInt("importance", Math.max(0, -this.f78064q4));
            ddaVarM21838E.setParameters(bundle);
        }
    }

    private void updateDroppedBufferCountersWithInputBuffers(long j) {
        int i = 0;
        while (true) {
            Long lPeek = this.f78038Q3.peek();
            if (lPeek == null || lPeek.longValue() >= j) {
                break;
            }
            i++;
            this.f78038Q3.poll();
        }
        m21224g1(i, 0);
    }

    private void updatePeriodDurationUs(una.C13612b c13612b) {
        q1h q1hVarM1758l = m1758l();
        if (q1hVarM1758l.isEmpty()) {
            this.f78070w4 = -9223372036854775807L;
        } else {
            this.f78070w4 = q1hVarM1758l.getPeriodByUid(((una.C13612b) v80.checkNotNull(c13612b)).f88603a, new q1h.C11270b()).getDurationUs();
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: B */
    public vl3 mo10820B(lda ldaVar, C1213a c1213a, C1213a c1213a2) {
        vl3 vl3VarCanReuseCodec = ldaVar.canReuseCodec(c1213a, c1213a2);
        int i = vl3VarCanReuseCodec.f91581e;
        C12041e c12041e = (C12041e) v80.checkNotNull(this.f78040S3);
        if (c1213a2.f8298v > c12041e.f78092a || c1213a2.f8299w > c12041e.f78093b) {
            i |= 256;
        }
        if (m21197R0(ldaVar, c1213a2) > c12041e.f78094c) {
            i |= 64;
        }
        int i2 = i;
        return new vl3(ldaVar.f57252a, c1213a, c1213a2, i2 != 0 ? 0 : vl3VarCanReuseCodec.f91580d, i2);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: C */
    public jda mo21198C(Throwable th, @hib lda ldaVar) {
        return new qea(th, ldaVar, this.f78047Z3);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: F */
    public int mo21199F(rl3 rl3Var) {
        hse hseVar;
        if (Build.VERSION.SDK_INT >= 34) {
            return ((this.f78039R3 || (((hseVar = this.f78057j4) != null && hseVar.f44744h) || this.f78065r4)) && isBufferBeforeStartTime(rl3Var) && !isBufferProbablyLastSample(rl3Var)) ? 32 : 0;
        }
        return 0;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: I */
    public boolean mo21200I() {
        return false;
    }

    /* JADX INFO: renamed from: J0 */
    public void m21201J0(x7i x7iVar, int i, C1213a c1213a, int i2) {
        List<ix4> listM15110of = this.f78046Y3;
        if (listM15110of == null) {
            listM15110of = kx7.m15110of();
        }
        x7iVar.onInputStreamChanged(i, c1213a, m21845R(), i2, listM15110of);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: K */
    public float mo10824K(float f, C1213a c1213a, C1213a[] c1213aArr) {
        lda ldaVarM21839G;
        float fMax = -1.0f;
        for (C1213a c1213a2 : c1213aArr) {
            float f2 = c1213a2.f8302z;
            if (f2 != -1.0f) {
                fMax = Math.max(fMax, f2);
            }
        }
        float f3 = fMax == -1.0f ? -1.0f : fMax * f;
        if (this.f78057j4 == null || (ldaVarM21839G = m21839G()) == null) {
            return f3;
        }
        float maxSupportedFrameRate = ldaVarM21839G.getMaxSupportedFrameRate(c1213a.f8298v, c1213a.f8299w);
        return f3 != -1.0f ? Math.max(f3, maxSupportedFrameRate) : maxSupportedFrameRate;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m21202K0(String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (rea.class) {
            try {
                if (!f78025M4) {
                    f78026N4 = evaluateDeviceNeedsSetOutputSurfaceWorkaround();
                    f78025M4 = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f78026N4;
    }

    /* JADX INFO: renamed from: L0 */
    public bzc m21203L0(Context context, t6i t6iVar) {
        return new bzc.C2122b(context, t6iVar).setEnablePlaylistMode(true).setClock(m1749c()).build();
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: M */
    public List<lda> mo10825M(zda zdaVar, C1213a c1213a, boolean z) throws nea.C9821c {
        return nea.getDecoderInfosSortedByFormatSupport(getDecoderInfos(this.f78028G3, zdaVar, c1213a, z, this.f78065r4), c1213a);
    }

    @c5e(35)
    /* JADX INFO: renamed from: M0 */
    public void m21204M0(dda ddaVar) {
        ddaVar.detachOutputSurface();
    }

    /* JADX INFO: renamed from: N0 */
    public void m21205N0(dda ddaVar, int i, long j) {
        x5h.beginSection("dropVideoBuffer");
        ddaVar.releaseOutputBuffer(i, false);
        x5h.endSection();
        m21224g1(0, 1);
    }

    /* JADX INFO: renamed from: O0 */
    public void m21206O0() {
        this.f78033L3.m22408a();
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: P */
    public dda.C4751a mo10827P(lda ldaVar, C1213a c1213a, @hib MediaCrypto mediaCrypto, float f) {
        String str = ldaVar.f57254c;
        C12041e c12041eM21208Q0 = m21208Q0(ldaVar, c1213a, m1756j());
        this.f78040S3 = c12041eM21208Q0;
        MediaFormat mediaFormatM21209S0 = m21209S0(c1213a, str, c12041eM21208Q0, f, this.f78032K3, this.f78065r4 ? this.f78066s4 : 0);
        Surface surfaceForCodec = getSurfaceForCodec(ldaVar);
        maybeSetKeyAllowFrameDrop(mediaFormatM21209S0);
        return dda.C4751a.createForVideoDecoding(ldaVar, mediaFormatM21209S0, c1213a, surfaceForCodec, mediaCrypto);
    }

    /* JADX INFO: renamed from: P0 */
    public long m21207P0() {
        return -this.f78069v4;
    }

    /* JADX INFO: renamed from: Q0 */
    public C12041e m21208Q0(lda ldaVar, C1213a c1213a, C1213a[] c1213aArr) {
        int codecMaxInputSize;
        int iMax = c1213a.f8298v;
        int iMax2 = c1213a.f8299w;
        int iM21197R0 = m21197R0(ldaVar, c1213a);
        if (c1213aArr.length == 1) {
            if (iM21197R0 != -1 && (codecMaxInputSize = getCodecMaxInputSize(ldaVar, c1213a)) != -1) {
                iM21197R0 = Math.min((int) (iM21197R0 * 1.5f), codecMaxInputSize);
            }
            return new C12041e(iMax, iMax2, iM21197R0);
        }
        int length = c1213aArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            C1213a c1213aBuild = c1213aArr[i];
            if (c1213a.f8264E != null && c1213aBuild.f8264E == null) {
                c1213aBuild = c1213aBuild.buildUpon().setColorInfo(c1213a.f8264E).build();
            }
            if (ldaVar.canReuseCodec(c1213a, c1213aBuild).f91580d != 0) {
                int i2 = c1213aBuild.f8298v;
                z |= i2 == -1 || c1213aBuild.f8299w == -1;
                iMax = Math.max(iMax, i2);
                iMax2 = Math.max(iMax2, c1213aBuild.f8299w);
                iM21197R0 = Math.max(iM21197R0, m21197R0(ldaVar, c1213aBuild));
            }
        }
        if (z) {
            xh9.m25148w("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            Point codecMaxSize = getCodecMaxSize(ldaVar, c1213a);
            if (codecMaxSize != null) {
                iMax = Math.max(iMax, codecMaxSize.x);
                iMax2 = Math.max(iMax2, codecMaxSize.y);
                iM21197R0 = Math.max(iM21197R0, getCodecMaxInputSize(ldaVar, c1213a.buildUpon().setWidth(iMax).setHeight(iMax2).build()));
                xh9.m25148w("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new C12041e(iMax, iMax2, iM21197R0);
    }

    @igg({"InlinedApi"})
    /* JADX INFO: renamed from: S0 */
    public MediaFormat m21209S0(C1213a c1213a, String str, C12041e c12041e, float f, boolean z, int i) {
        Pair<Integer, Integer> codecProfileAndLevel;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger(StreamInformation.KEY_WIDTH, c1213a.f8298v);
        mediaFormat.setInteger(StreamInformation.KEY_HEIGHT, c1213a.f8299w);
        jfa.setCsdBuffers(mediaFormat, c1213a.f8294r);
        jfa.maybeSetFloat(mediaFormat, "frame-rate", c1213a.f8302z);
        jfa.maybeSetInteger(mediaFormat, "rotation-degrees", c1213a.f8260A);
        jfa.maybeSetColorInfo(mediaFormat, c1213a.f8264E);
        if ("video/dolby-vision".equals(c1213a.f8291o) && (codecProfileAndLevel = nea.getCodecProfileAndLevel(c1213a)) != null) {
            jfa.maybeSetInteger(mediaFormat, Scopes.PROFILE, ((Integer) codecProfileAndLevel.first).intValue());
        }
        mediaFormat.setInteger("max-width", c12041e.f78092a);
        mediaFormat.setInteger("max-height", c12041e.f78093b);
        jfa.maybeSetInteger(mediaFormat, "max-input-size", c12041e.f78094c);
        int i2 = Build.VERSION.SDK_INT;
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", true);
            mediaFormat.setInteger("audio-session-id", i);
        }
        if (i2 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.f78064q4));
        }
        return mediaFormat;
    }

    @hib
    /* JADX INFO: renamed from: T0 */
    public Surface m21210T0() {
        return this.f78047Z3;
    }

    @Override // p000.sda
    @omg(29)
    /* JADX INFO: renamed from: U */
    public void mo10828U(rl3 rl3Var) throws aa5 {
        if (this.f78042U3) {
            ByteBuffer byteBuffer = (ByteBuffer) v80.checkNotNull(rl3Var.f78611m);
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
                        setHdr10PlusInfoV29((dda) v80.checkNotNull(m21838E()), bArr);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: U0 */
    public boolean m21211U0(long j, boolean z) throws aa5 {
        int iM1772z = m1772z(j);
        if (iM1772z == 0) {
            return false;
        }
        if (z) {
            ol3 ol3Var = this.f81430g3;
            int i = ol3Var.f68019d + iM1772z;
            ol3Var.f68019d = i;
            ol3Var.f68021f += this.f78056i4;
            ol3Var.f68019d = i + this.f78038Q3.size();
        } else {
            this.f81430g3.f68025j++;
            m21224g1(iM1772z + this.f78038Q3.size(), this.f78056i4);
        }
        m21837D();
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.flush(false);
        }
        return true;
    }

    /* JADX INFO: renamed from: V0 */
    public void m21212V0(long j) throws aa5 {
        m21859z0(j);
        maybeNotifyVideoSizeChanged(this.f78062o4);
        this.f81430g3.f68020e++;
        maybeNotifyRenderedFirstFrame();
        onProcessedOutputBuffer(j);
    }

    @Deprecated
    /* JADX INFO: renamed from: W0 */
    public void m21213W0(dda ddaVar, int i, long j) {
        x5h.beginSection("releaseOutputBuffer");
        ddaVar.releaseOutputBuffer(i, true);
        x5h.endSection();
        this.f81430g3.f68020e++;
        this.f78055h4 = 0;
        if (this.f78043V3 == null) {
            maybeNotifyVideoSizeChanged(this.f78062o4);
            maybeNotifyRenderedFirstFrame();
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m21214X0(dda ddaVar, int i, long j, long j2) {
        x5h.beginSection("releaseOutputBuffer");
        ddaVar.releaseOutputBuffer(i, j2);
        x5h.endSection();
        this.f81430g3.f68020e++;
        this.f78055h4 = 0;
        if (this.f78043V3 == null) {
            maybeNotifyVideoSizeChanged(this.f78062o4);
            maybeNotifyRenderedFirstFrame();
        }
    }

    @c5e(23)
    /* JADX INFO: renamed from: Y0 */
    public void m21215Y0(dda ddaVar, Surface surface) {
        ddaVar.setOutputSurface(surface);
    }

    @Override // p000.sda
    @un1
    /* JADX INFO: renamed from: Z */
    public boolean mo21216Z(C1213a c1213a) throws aa5 {
        x7i x7iVar = this.f78043V3;
        if (x7iVar == null || x7iVar.isInitialized()) {
            return true;
        }
        try {
            return this.f78043V3.initialize(c1213a);
        } catch (x7i.C14976e e) {
            throw m1747a(e, c1213a, 7000);
        }
    }

    /* JADX INFO: renamed from: Z0 */
    public boolean m21217Z0(long j, long j2, boolean z) {
        return j < f78022J4 && !z;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: a0 */
    public void mo10829a0(Exception exc) {
        xh9.m25145e("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f78030I3.videoCodecError(exc);
    }

    /* JADX INFO: renamed from: a1 */
    public boolean m21218a1(long j, long j2, boolean z) {
        return j < f78021I4 && !z;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: b0 */
    public void mo10830b0(String str, dda.C4751a c4751a, long j, long j2) {
        this.f78030I3.decoderInitialized(str, j, j2);
        this.f78041T3 = m21202K0(str);
        this.f78042U3 = ((lda) v80.checkNotNull(m21839G())).isHdr10PlusOutOfBandMetadataSupported();
        maybeSetupTunnelingForFirstFrame();
    }

    /* JADX INFO: renamed from: b1 */
    public boolean m21219b1(long j, long j2) {
        return j < f78021I4 && j2 > 100000;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: c0 */
    public void mo10831c0(String str) {
        this.f78030I3.decoderReleased(str);
    }

    /* JADX INFO: renamed from: c1 */
    public boolean m21220c1() {
        return true;
    }

    @Override // p000.sda
    @hib
    /* JADX INFO: renamed from: d0 */
    public vl3 mo10832d0(oq6 oq6Var) throws aa5 {
        vl3 vl3VarMo10832d0 = super.mo10832d0(oq6Var);
        this.f78030I3.inputFormatChanged((C1213a) v80.checkNotNull(oq6Var.f68294b), vl3VarMo10832d0);
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null) {
            u6iVar.reset();
        }
        return vl3VarMo10832d0;
    }

    /* JADX INFO: renamed from: d1 */
    public boolean m21221d1(lda ldaVar) {
        return Build.VERSION.SDK_INT >= 35 && ldaVar.f57262k;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: e0 */
    public void mo10833e0(C1213a c1213a, @hib MediaFormat mediaFormat) {
        int integer;
        int i;
        dda ddaVarM21838E = m21838E();
        if (ddaVarM21838E != null) {
            ddaVarM21838E.setVideoScalingMode(this.f78051d4);
        }
        if (this.f78065r4) {
            i = c1213a.f8298v;
            integer = c1213a.f8299w;
        } else {
            v80.checkNotNull(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            int integer2 = z ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger(StreamInformation.KEY_WIDTH);
            integer = z ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger(StreamInformation.KEY_HEIGHT);
            i = integer2;
        }
        float f = c1213a.f8261B;
        int i2 = c1213a.f8260A;
        if (i2 == 90 || i2 == 270) {
            f = 1.0f / f;
            int i3 = integer;
            integer = i;
            i = i3;
        }
        this.f78062o4 = new a8i(i, integer, f);
        x7i x7iVar = this.f78043V3;
        if (x7iVar == null || !this.f78071x4) {
            this.f78033L3.setFrameRate(c1213a.f8302z);
        } else {
            m21201J0(x7iVar, 1, c1213a.buildUpon().setWidth(i).setHeight(integer).setPixelWidthHeightRatio(f).build(), this.f78045X3);
            this.f78045X3 = 2;
        }
        this.f78071x4 = false;
    }

    /* JADX INFO: renamed from: e1 */
    public boolean m21222e1(lda ldaVar) {
        return (this.f78065r4 || m21202K0(ldaVar.f57252a) || (ldaVar.f57258g && !PlaceholderSurface.isSecureSupported(this.f78028G3))) ? false : true;
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public void enableMayRenderStartOfStream() {
        x7i x7iVar = this.f78043V3;
        if (x7iVar == null) {
            this.f78033L3.allowReleaseFirstFrameBeforeStarted();
            return;
        }
        int i = this.f78045X3;
        if (i == 0 || i == 1) {
            this.f78045X3 = 0;
        } else {
            x7iVar.allowReleaseFirstFrameBeforeStarted();
        }
    }

    /* JADX INFO: renamed from: f1 */
    public void m21223f1(dda ddaVar, int i, long j) {
        x5h.beginSection("skipVideoBuffer");
        ddaVar.releaseOutputBuffer(i, false);
        x5h.endSection();
        this.f81430g3.f68021f++;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: g0 */
    public void mo10835g0() {
        super.mo10835g0();
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.signalEndOfCurrentInputStream();
            if (this.f78069v4 == -9223372036854775807L) {
                this.f78069v4 = m21845R();
            }
            this.f78043V3.setBufferTimestampAdjustmentUs(m21207P0());
        } else {
            this.f78033L3.onStreamChanged(2);
        }
        this.f78071x4 = true;
        maybeSetupTunnelingForFirstFrame();
    }

    /* JADX INFO: renamed from: g1 */
    public void m21224g1(int i, int i2) {
        ol3 ol3Var = this.f81430g3;
        ol3Var.f68023h += i;
        int i3 = i + i2;
        ol3Var.f68022g += i3;
        this.f78054g4 += i3;
        int i4 = this.f78055h4 + i3;
        this.f78055h4 = i4;
        ol3Var.f68024i = Math.max(i4, ol3Var.f68024i);
        int i5 = this.f78031J3;
        if (i5 <= 0 || this.f78054g4 < i5) {
            return;
        }
        maybeNotifyDroppedFrames();
    }

    @Override // androidx.media3.exoplayer.InterfaceC1254q
    public String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // p000.sda
    @un1
    /* JADX INFO: renamed from: h0 */
    public void mo21225h0(rl3 rl3Var) throws aa5 {
        ByteBuffer byteBuffer;
        if (this.f78035N3 != null && ((lda) v80.checkNotNull(m21839G())).f57253b.equals("video/av01") && (byteBuffer = rl3Var.f78608d) != null) {
            this.f78035N3.queueInputBuffer(byteBuffer);
        }
        this.f78072y4 = 0;
        int iMo21199F = mo21199F(rl3Var);
        if ((Build.VERSION.SDK_INT < 34 || (iMo21199F & 32) == 0) && !this.f78065r4) {
            this.f78056i4++;
        }
    }

    /* JADX INFO: renamed from: h1 */
    public void m21226h1(long j) {
        this.f81430g3.addVideoFrameProcessingOffset(j);
        this.f78059l4 += j;
        this.f78060m4++;
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c, androidx.media3.exoplayer.C1253p.b
    public void handleMessage(int i, @hib Object obj) throws aa5 {
        if (i == 1) {
            setOutput(obj);
        }
        if (i == 7) {
            o6i o6iVar = (o6i) v80.checkNotNull(obj);
            this.f78068u4 = o6iVar;
            x7i x7iVar = this.f78043V3;
            if (x7iVar != null) {
                x7iVar.setVideoFrameMetadataListener(o6iVar);
                return;
            }
            return;
        }
        if (i == 10) {
            int iIntValue = ((Integer) v80.checkNotNull(obj)).intValue();
            if (this.f78066s4 != iIntValue) {
                this.f78066s4 = iIntValue;
                if (this.f78065r4) {
                    m21852j0();
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            this.f78051d4 = ((Integer) v80.checkNotNull(obj)).intValue();
            dda ddaVarM21838E = m21838E();
            if (ddaVarM21838E != null) {
                ddaVarM21838E.setVideoScalingMode(this.f78051d4);
                return;
            }
            return;
        }
        if (i == 5) {
            int iIntValue2 = ((Integer) v80.checkNotNull(obj)).intValue();
            this.f78052e4 = iIntValue2;
            x7i x7iVar2 = this.f78043V3;
            if (x7iVar2 != null) {
                x7iVar2.setChangeFrameRateStrategy(iIntValue2);
                return;
            } else {
                this.f78033L3.setChangeFrameRateStrategy(iIntValue2);
                return;
            }
        }
        if (i == 13) {
            setVideoEffects((List) v80.checkNotNull(obj));
            return;
        }
        if (i == 14) {
            xpf xpfVar = (xpf) v80.checkNotNull(obj);
            if (xpfVar.getWidth() == 0 || xpfVar.getHeight() == 0) {
                return;
            }
            this.f78049b4 = xpfVar;
            x7i x7iVar3 = this.f78043V3;
            if (x7iVar3 != null) {
                x7iVar3.setOutputSurfaceInfo((Surface) v80.checkStateNotNull(this.f78047Z3), xpfVar);
                return;
            }
            return;
        }
        switch (i) {
            case 16:
                this.f78064q4 = ((Integer) v80.checkNotNull(obj)).intValue();
                updateCodecImportance();
                break;
            case 17:
                Surface surface = this.f78047Z3;
                setOutput(null);
                ((rea) v80.checkNotNull(obj)).handleMessage(1, surface);
                break;
            case 18:
                hse hseVar = this.f78057j4;
                boolean z = hseVar != null && hseVar.f44740d;
                hse hseVar2 = (hse) obj;
                this.f78057j4 = hseVar2;
                if (z != (hseVar2 != null && hseVar2.f44740d)) {
                    m21858y0();
                }
                break;
            default:
                super.handleMessage(i, obj);
                break;
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: i0 */
    public boolean mo10836i0(long j, long j2, @hib dda ddaVar, @hib ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C1213a c1213a) throws aa5 {
        v80.checkNotNull(ddaVar);
        long jM21844Q = j3 - m21844Q();
        updateDroppedBufferCountersWithInputBuffers(j3);
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            if (!z || z2) {
                return x7iVar.handleInputFrame(j3, new C12038b(ddaVar, i, jM21844Q));
            }
            m21223f1(ddaVar, i, jM21844Q);
            return true;
        }
        int frameReleaseAction = this.f78033L3.getFrameReleaseAction(j3, j, j2, m21845R(), z, z2, this.f78034M3);
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null && frameReleaseAction != 5 && frameReleaseAction != 4) {
            u6iVar.onVideoFrameProcessed(j3, this.f78034M3.getEarlyUs());
        }
        if (frameReleaseAction == 0) {
            long jNanoTime = m1749c().nanoTime();
            notifyFrameMetadataListener(jM21844Q, jNanoTime, c1213a);
            renderOutputBuffer(ddaVar, i, jM21844Q, jNanoTime);
            m21226h1(this.f78034M3.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 1) {
            releaseFrame((dda) v80.checkStateNotNull(ddaVar), i, jM21844Q, c1213a);
            return true;
        }
        if (frameReleaseAction == 2) {
            m21205N0(ddaVar, i, jM21844Q);
            m21226h1(this.f78034M3.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 3) {
            m21223f1(ddaVar, i, jM21844Q);
            m21226h1(this.f78034M3.getEarlyUs());
            return true;
        }
        if (frameReleaseAction == 4 || frameReleaseAction == 5) {
            return false;
        }
        throw new IllegalStateException(String.valueOf(frameReleaseAction));
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    public boolean isEnded() {
        x7i x7iVar;
        return super.isEnded() && ((x7iVar = this.f78043V3) == null || x7iVar.isEnded());
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    public boolean isReady() {
        boolean zIsReady = super.isReady();
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            return x7iVar.isReady(zIsReady);
        }
        if (zIsReady && (m21838E() == null || this.f78065r4)) {
            return true;
        }
        return this.f78033L3.isReady(zIsReady);
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: k0 */
    public void mo10837k0() {
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.signalEndOfCurrentInputStream();
        }
    }

    @Override // p000.sda
    @un1
    /* JADX INFO: renamed from: l0 */
    public void mo21227l0() {
        super.mo21227l0();
        this.f78038Q3.clear();
        this.f78056i4 = 0;
        this.f78072y4 = 0;
        this.f78058k4 = false;
        qm0 qm0Var = this.f78035N3;
        if (qm0Var != null) {
            qm0Var.reset();
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: n */
    public void mo1760n() {
        this.f78063p4 = null;
        this.f78070w4 = -9223372036854775807L;
        maybeSetupTunnelingForFirstFrame();
        this.f78050c4 = false;
        this.f78067t4 = null;
        this.f78058k4 = true;
        try {
            super.mo1760n();
        } finally {
            this.f78030I3.disabled(this.f81430g3);
            this.f78030I3.videoSizeChanged(a8i.f643h);
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: o */
    public void mo1761o(boolean z, boolean z2) throws aa5 {
        super.mo1761o(z, z2);
        boolean z3 = m1750d().f80390b;
        v80.checkState((z3 && this.f78066s4 == 0) ? false : true);
        if (this.f78065r4 != z3) {
            this.f78065r4 = z3;
            m21852j0();
        }
        this.f78030I3.enabled(this.f81430g3);
        if (!this.f78044W3) {
            if (this.f78046Y3 != null && this.f78043V3 == null) {
                bzc bzcVarM21203L0 = m21203L0(this.f78028G3, this.f78033L3);
                bzcVarM21203L0.setTotalVideoInputCount(1);
                this.f78043V3 = bzcVarM21203L0.getSink(0);
            }
            this.f78044W3 = true;
        }
        if (this.f78043V3 == null) {
            this.f78033L3.setClock(m1749c());
            this.f78033L3.onStreamChanged(!z2 ? 1 : 0);
        } else {
            configureVideoSink();
            this.f78045X3 = !z2 ? 1 : 0;
            experimentalEnableProcessedStreamChangedAtStart();
        }
    }

    @Override // p000.sda
    @un1
    public void onProcessedOutputBuffer(long j) {
        super.onProcessedOutputBuffer(j);
        if (this.f78065r4) {
            return;
        }
        this.f78056i4--;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: p */
    public void mo1762p() {
        super.mo1762p();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    @Override // p000.sda
    /* JADX INFO: renamed from: p0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean mo21228p0(p000.rl3 r9) {
        /*
            r8 = this;
            boolean r0 = r8.isBufferProbablyLastSample(r9)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = r8.isBufferBeforeStartTime(r9)
            u6i r2 = r8.f78037P3
            r3 = 1
            if (r2 == 0) goto L28
            long r4 = r9.f78610f
            long r4 = r2.predictEarlyUs(r4)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 == 0) goto L28
            long r6 = r8.f78036O3
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L28
            r2 = r3
            goto L29
        L28:
            r2 = r1
        L29:
            if (r0 != 0) goto L2e
            if (r2 != 0) goto L2e
            return r1
        L2e:
            boolean r2 = r9.hasSupplementalData()
            if (r2 == 0) goto L35
            return r1
        L35:
            boolean r2 = r9.notDependedOn()
            if (r2 == 0) goto L40
            r9.clear()
        L3e:
            r1 = r3
            goto La2
        L40:
            qm0 r2 = r8.f78035N3
            if (r2 == 0) goto La2
            lda r2 = r8.m21839G()
            java.lang.Object r2 = p000.v80.checkNotNull(r2)
            lda r2 = (p000.lda) r2
            java.lang.String r2 = r2.f57253b
            java.lang.String r4 = "video/av01"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto La2
            java.nio.ByteBuffer r2 = r9.f78608d
            if (r2 == 0) goto La2
            if (r0 != 0) goto L65
            int r4 = r8.f78072y4
            if (r4 > 0) goto L63
            goto L65
        L63:
            r4 = r1
            goto L66
        L65:
            r4 = r3
        L66:
            java.nio.ByteBuffer r2 = r2.asReadOnlyBuffer()
            r2.flip()
            qm0 r5 = r8.f78035N3
            int r4 = r5.sampleLimitAfterSkippingNonReferenceFrame(r2, r4)
            if (r4 != 0) goto L79
            r9.clear()
            goto L3e
        L79:
            int r5 = r2.limit()
            if (r4 == r5) goto La2
            rea$e r5 = r8.f78040S3
            java.lang.Object r5 = p000.v80.checkNotNull(r5)
            rea$e r5 = (p000.rea.C12041e) r5
            int r5 = r5.f78094c
            int r5 = r5 + r4
            int r2 = r2.capacity()
            if (r5 >= r2) goto La2
            boolean r2 = r9.isEncrypted()
            if (r2 != 0) goto La2
            java.nio.ByteBuffer r1 = r9.f78608d
            java.lang.Object r1 = p000.v80.checkNotNull(r1)
            java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
            r1.position(r4)
            goto L3e
        La2:
            if (r1 == 0) goto Lbe
            if (r0 == 0) goto Lae
            ol3 r9 = r8.f81430g3
            int r0 = r9.f68019d
            int r0 = r0 + r3
            r9.f68019d = r0
            goto Lbe
        Lae:
            java.util.PriorityQueue<java.lang.Long> r0 = r8.f78038Q3
            long r4 = r9.f78610f
            java.lang.Long r9 = java.lang.Long.valueOf(r4)
            r0.add(r9)
            int r9 = r8.f78072y4
            int r9 = r9 + r3
            r8.f78072y4 = r9
        Lbe:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.rea.mo21228p0(rl3):boolean");
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: q */
    public void mo1763q(long j, boolean z) throws aa5 {
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null && !z) {
            x7iVar.flush(true);
        }
        super.mo1763q(j, z);
        if (this.f78043V3 == null) {
            this.f78033L3.reset();
        }
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null) {
            u6iVar.reset();
        }
        if (z) {
            x7i x7iVar2 = this.f78043V3;
            if (x7iVar2 != null) {
                x7iVar2.join(false);
            } else {
                this.f78033L3.join(false);
            }
        }
        maybeSetupTunnelingForFirstFrame();
        this.f78055h4 = 0;
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: q0 */
    public final boolean mo21229q0() {
        C1213a c1213aM21840H = m21840H();
        hse hseVar = this.f78057j4;
        return hseVar == null ? super.mo21229q0() : !hseVar.f44742f || this.f78058k4 || this.f78065r4 || (c1213aM21840H != null && c1213aM21840H.f8293q > 0) || m21848V() || m21843O() != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: r */
    public void mo1764r() {
        super.mo1764r();
        x7i x7iVar = this.f78043V3;
        if (x7iVar == null || !this.f78029H3) {
            return;
        }
        x7iVar.release();
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: r0 */
    public boolean mo21230r0(lda ldaVar) {
        return hasSurfaceForCodec(ldaVar);
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    @un1
    public void render(long j, long j2) throws aa5 {
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            try {
                x7iVar.render(j, j2);
            } catch (x7i.C14976e e) {
                throw m1747a(e, e.f97123a, 7001);
            }
        }
        super.render(j, j2);
    }

    @Override // p000.sda, androidx.media3.exoplayer.InterfaceC1254q
    public void setPlaybackSpeed(float f, float f2) throws aa5 {
        super.setPlaybackSpeed(f, f2);
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.setPlaybackSpeed(f);
        } else {
            this.f78033L3.setPlaybackSpeed(f);
        }
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null) {
            u6iVar.setPlaybackSpeed(f);
        }
    }

    public void setVideoEffects(List<ix4> list) {
        if (list.equals(r6i.f77158h)) {
            x7i x7iVar = this.f78043V3;
            if (x7iVar == null || !x7iVar.isInitialized()) {
                return;
            }
            this.f78043V3.redraw();
            return;
        }
        this.f78046Y3 = list;
        x7i x7iVar2 = this.f78043V3;
        if (x7iVar2 != null) {
            x7iVar2.setVideoEffects(list);
        }
    }

    @Override // p000.t6i.InterfaceC12941c
    public boolean shouldDropFrame(long j, long j2, boolean z) {
        return m21218a1(j, j2, z);
    }

    @Override // p000.t6i.InterfaceC12941c
    public boolean shouldForceReleaseFrame(long j, long j2) {
        return m21219b1(j, j2);
    }

    @Override // p000.t6i.InterfaceC12941c
    public boolean shouldIgnoreFrame(long j, long j2, long j3, boolean z, boolean z2) throws aa5 {
        if (this.f78043V3 != null && this.f78029H3) {
            j2 -= m21207P0();
        }
        return m21217Z0(j, j3, z) && m21211U0(j2, z2);
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: t */
    public void mo1766t() {
        try {
            super.mo1766t();
        } finally {
            this.f78044W3 = false;
            this.f78069v4 = -9223372036854775807L;
            releasePlaceholderSurface();
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: t0 */
    public final boolean mo21231t0() {
        lda ldaVarM21839G = m21839G();
        if (this.f78043V3 == null || ldaVarM21839G == null || !(ldaVarM21839G.f57252a.equals("c2.mtk.avc.decoder") || ldaVarM21839G.f57252a.equals("c2.mtk.hevc.decoder"))) {
            return super.mo21231t0();
        }
        return true;
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: u */
    public void mo1767u() {
        super.mo1767u();
        this.f78054g4 = 0;
        this.f78053f4 = m1749c().elapsedRealtime();
        this.f78059l4 = 0L;
        this.f78060m4 = 0;
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.startRendering();
        } else {
            this.f78033L3.onStarted();
        }
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: v */
    public void mo1768v() {
        maybeNotifyDroppedFrames();
        maybeNotifyVideoFrameProcessingOffset();
        x7i x7iVar = this.f78043V3;
        if (x7iVar != null) {
            x7iVar.stopRendering();
        } else {
            this.f78033L3.onStopped();
        }
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null) {
            u6iVar.reset();
        }
        super.mo1768v();
    }

    @Override // p000.sda, androidx.media3.exoplayer.AbstractC1224c
    /* JADX INFO: renamed from: w */
    public void mo1769w(C1213a[] c1213aArr, long j, long j2, una.C13612b c13612b) throws aa5 {
        super.mo1769w(c1213aArr, j, j2, c13612b);
        updatePeriodDurationUs(c13612b);
        u6i u6iVar = this.f78037P3;
        if (u6iVar != null) {
            u6iVar.reset();
        }
    }

    @Override // p000.sda
    /* JADX INFO: renamed from: w0 */
    public int mo10839w0(zda zdaVar, C1213a c1213a) throws nea.C9821c {
        return supportsFormatInternal(this.f78028G3, zdaVar, c1213a);
    }

    @Deprecated
    public rea(Context context, zda zdaVar, long j) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setAllowedJoiningTimeMs(j));
    }

    @Deprecated
    public rea(Context context, zda zdaVar, long j, @hib Handler handler, @hib v7i v7iVar, int i) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setAllowedJoiningTimeMs(j).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public rea(Context context, zda zdaVar, long j, boolean z, @hib Handler handler, @hib v7i v7iVar, int i) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public rea(Context context, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, long j, boolean z, @hib Handler handler, @hib v7i v7iVar, int i) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setCodecAdapterFactory(interfaceC4752b).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(i));
    }

    @Deprecated
    public rea(Context context, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, long j, boolean z, @hib Handler handler, @hib v7i v7iVar, int i, float f) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setCodecAdapterFactory(interfaceC4752b).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(i).setAssumedMinimumCodecOperatingRate(f));
    }

    @Deprecated
    public rea(Context context, dda.InterfaceC4752b interfaceC4752b, zda zdaVar, long j, boolean z, @hib Handler handler, @hib v7i v7iVar, int i, float f, @hib x7i x7iVar) {
        this(new C12040d(context).setMediaCodecSelector(zdaVar).setCodecAdapterFactory(interfaceC4752b).setAllowedJoiningTimeMs(j).setEnableDecoderFallback(z).setEventHandler(handler).setEventListener(v7iVar).setMaxDroppedFramesToNotify(i).setAssumedMinimumCodecOperatingRate(f).setVideoSink(x7iVar));
    }

    public rea(C12040d c12040d) {
        super(2, c12040d.f78081d, c12040d.f78080c, c12040d.f78083f, c12040d.f78087j);
        Context applicationContext = c12040d.f78078a.getApplicationContext();
        this.f78028G3 = applicationContext;
        this.f78031J3 = c12040d.f78086i;
        this.f78043V3 = c12040d.f78088k;
        this.f78030I3 = new v7i.C13929a(c12040d.f78084g, c12040d.f78085h);
        this.f78029H3 = this.f78043V3 == null;
        this.f78033L3 = new t6i(applicationContext, this, c12040d.f78082e);
        this.f78034M3 = new t6i.C12940b();
        this.f78032K3 = deviceNeedsNoPostProcessWorkaround();
        this.f78049b4 = xpf.f98880c;
        this.f78051d4 = 1;
        this.f78052e4 = 0;
        this.f78062o4 = a8i.f643h;
        this.f78066s4 = 0;
        this.f78063p4 = null;
        this.f78064q4 = -1000;
        this.f78069v4 = -9223372036854775807L;
        this.f78070w4 = -9223372036854775807L;
        this.f78035N3 = c12040d.f78089l ? new qm0() : null;
        this.f78038Q3 = new PriorityQueue<>();
        if (c12040d.f78090m != -9223372036854775807L) {
            this.f78036O3 = -c12040d.f78090m;
            this.f78037P3 = new u6i(1.0f);
        } else {
            this.f78036O3 = -9223372036854775807L;
            this.f78037P3 = null;
        }
        this.f78039R3 = c12040d.f78091n;
        this.f78057j4 = null;
    }
}
