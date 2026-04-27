package p000;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.hue;
import p000.r6h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class g4a implements yj5 {

    /* JADX INFO: renamed from: A0 */
    public static final String f38430A0 = "A_OPUS";

    /* JADX INFO: renamed from: A1 */
    public static final int f38431A1 = 131;

    /* JADX INFO: renamed from: A2 */
    public static final int f38432A2 = 21947;

    /* JADX INFO: renamed from: B0 */
    public static final String f38433B0 = "A_AAC";

    /* JADX INFO: renamed from: B1 */
    public static final int f38434B1 = 136;

    /* JADX INFO: renamed from: B2 */
    public static final int f38435B2 = 21948;

    /* JADX INFO: renamed from: C0 */
    public static final String f38436C0 = "A_MPEG/L2";

    /* JADX INFO: renamed from: C1 */
    public static final int f38437C1 = 21930;

    /* JADX INFO: renamed from: C2 */
    public static final int f38438C2 = 21949;

    /* JADX INFO: renamed from: D0 */
    public static final String f38439D0 = "A_MPEG/L3";

    /* JADX INFO: renamed from: D1 */
    public static final int f38440D1 = 2352003;

    /* JADX INFO: renamed from: D2 */
    public static final int f38441D2 = 21968;

    /* JADX INFO: renamed from: E0 */
    public static final String f38442E0 = "A_AC3";

    /* JADX INFO: renamed from: E1 */
    public static final int f38443E1 = 21998;

    /* JADX INFO: renamed from: E2 */
    public static final int f38444E2 = 21969;

    /* JADX INFO: renamed from: F0 */
    public static final String f38445F0 = "A_EAC3";

    /* JADX INFO: renamed from: F1 */
    public static final int f38446F1 = 16868;

    /* JADX INFO: renamed from: F2 */
    public static final int f38447F2 = 21970;

    /* JADX INFO: renamed from: G0 */
    public static final String f38448G0 = "A_TRUEHD";

    /* JADX INFO: renamed from: G1 */
    public static final int f38449G1 = 16871;

    /* JADX INFO: renamed from: G2 */
    public static final int f38450G2 = 21971;

    /* JADX INFO: renamed from: H0 */
    public static final String f38451H0 = "A_DTS";

    /* JADX INFO: renamed from: H1 */
    public static final int f38452H1 = 16877;

    /* JADX INFO: renamed from: H2 */
    public static final int f38453H2 = 21972;

    /* JADX INFO: renamed from: I0 */
    public static final String f38454I0 = "A_DTS/EXPRESS";

    /* JADX INFO: renamed from: I1 */
    public static final int f38455I1 = 21358;

    /* JADX INFO: renamed from: I2 */
    public static final int f38456I2 = 21973;

    /* JADX INFO: renamed from: J0 */
    public static final String f38457J0 = "A_DTS/LOSSLESS";

    /* JADX INFO: renamed from: J1 */
    public static final int f38458J1 = 134;

    /* JADX INFO: renamed from: J2 */
    public static final int f38459J2 = 21974;

    /* JADX INFO: renamed from: K0 */
    public static final String f38460K0 = "A_FLAC";

    /* JADX INFO: renamed from: K1 */
    public static final int f38461K1 = 25506;

    /* JADX INFO: renamed from: K2 */
    public static final int f38462K2 = 21975;

    /* JADX INFO: renamed from: L0 */
    public static final String f38463L0 = "A_MS/ACM";

    /* JADX INFO: renamed from: L1 */
    public static final int f38464L1 = 22186;

    /* JADX INFO: renamed from: L2 */
    public static final int f38465L2 = 21976;

    /* JADX INFO: renamed from: M0 */
    public static final String f38466M0 = "A_PCM/INT/LIT";

    /* JADX INFO: renamed from: M1 */
    public static final int f38467M1 = 22203;

    /* JADX INFO: renamed from: M2 */
    public static final int f38468M2 = 21977;

    /* JADX INFO: renamed from: N0 */
    public static final String f38469N0 = "A_PCM/INT/BIG";

    /* JADX INFO: renamed from: N1 */
    public static final int f38470N1 = 30114;

    /* JADX INFO: renamed from: N2 */
    public static final int f38471N2 = 21978;

    /* JADX INFO: renamed from: O0 */
    public static final String f38472O0 = "A_PCM/FLOAT/IEEE";

    /* JADX INFO: renamed from: O1 */
    public static final int f38473O1 = 224;

    /* JADX INFO: renamed from: O2 */
    public static final int f38474O2 = 4;

    /* JADX INFO: renamed from: P0 */
    public static final String f38475P0 = "S_TEXT/UTF8";

    /* JADX INFO: renamed from: P1 */
    public static final int f38476P1 = 176;

    /* JADX INFO: renamed from: P2 */
    public static final int f38477P2 = 1685480259;

    /* JADX INFO: renamed from: Q0 */
    public static final String f38478Q0 = "S_TEXT/ASS";

    /* JADX INFO: renamed from: Q1 */
    public static final int f38479Q1 = 186;

    /* JADX INFO: renamed from: Q2 */
    public static final int f38480Q2 = 1685485123;

    /* JADX INFO: renamed from: R0 */
    public static final String f38481R0 = "S_TEXT/WEBVTT";

    /* JADX INFO: renamed from: R1 */
    public static final int f38482R1 = 21680;

    /* JADX INFO: renamed from: R2 */
    public static final int f38483R2 = 0;

    /* JADX INFO: renamed from: S0 */
    public static final String f38484S0 = "S_VOBSUB";

    /* JADX INFO: renamed from: S1 */
    public static final int f38485S1 = 21690;

    /* JADX INFO: renamed from: S2 */
    public static final int f38486S2 = 1;

    /* JADX INFO: renamed from: T0 */
    public static final String f38487T0 = "S_HDMV/PGS";

    /* JADX INFO: renamed from: T1 */
    public static final int f38488T1 = 21682;

    /* JADX INFO: renamed from: T2 */
    public static final int f38489T2 = 2;

    /* JADX INFO: renamed from: U0 */
    public static final String f38490U0 = "S_DVBSUB";

    /* JADX INFO: renamed from: U1 */
    public static final int f38491U1 = 225;

    /* JADX INFO: renamed from: U2 */
    public static final int f38492U2 = 3;

    /* JADX INFO: renamed from: V0 */
    public static final int f38493V0 = 8192;

    /* JADX INFO: renamed from: V1 */
    public static final int f38494V1 = 159;

    /* JADX INFO: renamed from: V2 */
    public static final int f38495V2 = 1482049860;

    /* JADX INFO: renamed from: W0 */
    public static final int f38496W0 = 5760;

    /* JADX INFO: renamed from: W1 */
    public static final int f38497W1 = 25188;

    /* JADX INFO: renamed from: W2 */
    public static final int f38498W2 = 859189832;

    /* JADX INFO: renamed from: X0 */
    public static final int f38499X0 = 8;

    /* JADX INFO: renamed from: X1 */
    public static final int f38500X1 = 181;

    /* JADX INFO: renamed from: X2 */
    public static final int f38501X2 = 826496599;

    /* JADX INFO: renamed from: Y0 */
    public static final int f38502Y0 = 2;

    /* JADX INFO: renamed from: Y1 */
    public static final int f38503Y1 = 28032;

    /* JADX INFO: renamed from: Z0 */
    public static final int f38505Z0 = 440786851;

    /* JADX INFO: renamed from: Z1 */
    public static final int f38506Z1 = 25152;

    /* JADX INFO: renamed from: Z2 */
    public static final int f38507Z2 = 19;

    /* JADX INFO: renamed from: a1 */
    public static final int f38508a1 = 17143;

    /* JADX INFO: renamed from: a2 */
    public static final int f38509a2 = 20529;

    /* JADX INFO: renamed from: a3 */
    public static final long f38510a3 = 1000;

    /* JADX INFO: renamed from: b1 */
    public static final int f38511b1 = 17026;

    /* JADX INFO: renamed from: b2 */
    public static final int f38512b2 = 20530;

    /* JADX INFO: renamed from: b3 */
    public static final String f38513b3 = "%02d:%02d:%02d,%03d";

    /* JADX INFO: renamed from: c1 */
    public static final int f38514c1 = 17029;

    /* JADX INFO: renamed from: c2 */
    public static final int f38515c2 = 20532;

    /* JADX INFO: renamed from: d1 */
    public static final int f38517d1 = 408125543;

    /* JADX INFO: renamed from: d2 */
    public static final int f38518d2 = 16980;

    /* JADX INFO: renamed from: e1 */
    public static final int f38520e1 = 357149030;

    /* JADX INFO: renamed from: e2 */
    public static final int f38521e2 = 16981;

    /* JADX INFO: renamed from: e3 */
    public static final int f38522e3 = 21;

    /* JADX INFO: renamed from: f1 */
    public static final int f38524f1 = 290298740;

    /* JADX INFO: renamed from: f2 */
    public static final int f38525f2 = 20533;

    /* JADX INFO: renamed from: f3 */
    public static final long f38526f3 = 10000;

    /* JADX INFO: renamed from: g0 */
    public static final int f38527g0 = 1;

    /* JADX INFO: renamed from: g1 */
    public static final int f38528g1 = 19899;

    /* JADX INFO: renamed from: g2 */
    public static final int f38529g2 = 18401;

    /* JADX INFO: renamed from: g3 */
    public static final String f38530g3 = "%01d:%02d:%02d:%02d";

    /* JADX INFO: renamed from: h0 */
    public static final String f38531h0 = "MatroskaExtractor";

    /* JADX INFO: renamed from: h1 */
    public static final int f38532h1 = 21419;

    /* JADX INFO: renamed from: h2 */
    public static final int f38533h2 = 18402;

    /* JADX INFO: renamed from: i0 */
    public static final int f38535i0 = -1;

    /* JADX INFO: renamed from: i1 */
    public static final int f38536i1 = 21420;

    /* JADX INFO: renamed from: i2 */
    public static final int f38537i2 = 18407;

    /* JADX INFO: renamed from: i3 */
    public static final int f38538i3 = 25;

    /* JADX INFO: renamed from: j0 */
    public static final int f38539j0 = 0;

    /* JADX INFO: renamed from: j1 */
    public static final int f38540j1 = 357149030;

    /* JADX INFO: renamed from: j2 */
    public static final int f38541j2 = 18408;

    /* JADX INFO: renamed from: j3 */
    public static final long f38542j3 = 1000;

    /* JADX INFO: renamed from: k0 */
    public static final int f38543k0 = 1;

    /* JADX INFO: renamed from: k1 */
    public static final int f38544k1 = 2807729;

    /* JADX INFO: renamed from: k2 */
    public static final int f38545k2 = 475249515;

    /* JADX INFO: renamed from: k3 */
    public static final String f38546k3 = "%02d:%02d:%02d.%03d";

    /* JADX INFO: renamed from: l0 */
    public static final int f38547l0 = 2;

    /* JADX INFO: renamed from: l1 */
    public static final int f38548l1 = 17545;

    /* JADX INFO: renamed from: l2 */
    public static final int f38549l2 = 187;

    /* JADX INFO: renamed from: l3 */
    public static final int f38550l3 = 18;

    /* JADX INFO: renamed from: m0 */
    public static final String f38551m0 = "matroska";

    /* JADX INFO: renamed from: m1 */
    public static final int f38552m1 = 524531317;

    /* JADX INFO: renamed from: m2 */
    public static final int f38553m2 = 179;

    /* JADX INFO: renamed from: m3 */
    public static final int f38554m3 = 65534;

    /* JADX INFO: renamed from: n0 */
    public static final String f38555n0 = "webm";

    /* JADX INFO: renamed from: n1 */
    public static final int f38556n1 = 231;

    /* JADX INFO: renamed from: n2 */
    public static final int f38557n2 = 183;

    /* JADX INFO: renamed from: n3 */
    public static final int f38558n3 = 1;

    /* JADX INFO: renamed from: o0 */
    public static final String f38559o0 = "V_VP8";

    /* JADX INFO: renamed from: o1 */
    public static final int f38560o1 = 163;

    /* JADX INFO: renamed from: o2 */
    public static final int f38561o2 = 241;

    /* JADX INFO: renamed from: p0 */
    public static final String f38563p0 = "V_VP9";

    /* JADX INFO: renamed from: p1 */
    public static final int f38564p1 = 160;

    /* JADX INFO: renamed from: p2 */
    public static final int f38565p2 = 2274716;

    /* JADX INFO: renamed from: p3 */
    public static final Map<String, Integer> f38566p3;

    /* JADX INFO: renamed from: q0 */
    public static final String f38567q0 = "V_AV1";

    /* JADX INFO: renamed from: q1 */
    public static final int f38568q1 = 161;

    /* JADX INFO: renamed from: q2 */
    public static final int f38569q2 = 30320;

    /* JADX INFO: renamed from: r0 */
    public static final String f38570r0 = "V_MPEG2";

    /* JADX INFO: renamed from: r1 */
    public static final int f38571r1 = 155;

    /* JADX INFO: renamed from: r2 */
    public static final int f38572r2 = 30321;

    /* JADX INFO: renamed from: s0 */
    public static final String f38573s0 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: s1 */
    public static final int f38574s1 = 30113;

    /* JADX INFO: renamed from: s2 */
    public static final int f38575s2 = 30322;

    /* JADX INFO: renamed from: t0 */
    public static final String f38576t0 = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: t1 */
    public static final int f38577t1 = 166;

    /* JADX INFO: renamed from: t2 */
    public static final int f38578t2 = 30323;

    /* JADX INFO: renamed from: u0 */
    public static final String f38579u0 = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: u1 */
    public static final int f38580u1 = 238;

    /* JADX INFO: renamed from: u2 */
    public static final int f38581u2 = 30324;

    /* JADX INFO: renamed from: v0 */
    public static final String f38582v0 = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: v1 */
    public static final int f38583v1 = 165;

    /* JADX INFO: renamed from: v2 */
    public static final int f38584v2 = 30325;

    /* JADX INFO: renamed from: w0 */
    public static final String f38585w0 = "V_MPEGH/ISO/HEVC";

    /* JADX INFO: renamed from: w1 */
    public static final int f38586w1 = 251;

    /* JADX INFO: renamed from: w2 */
    public static final int f38587w2 = 21432;

    /* JADX INFO: renamed from: x0 */
    public static final String f38588x0 = "V_MS/VFW/FOURCC";

    /* JADX INFO: renamed from: x1 */
    public static final int f38589x1 = 374648427;

    /* JADX INFO: renamed from: x2 */
    public static final int f38590x2 = 21936;

    /* JADX INFO: renamed from: y0 */
    public static final String f38591y0 = "V_THEORA";

    /* JADX INFO: renamed from: y1 */
    public static final int f38592y1 = 174;

    /* JADX INFO: renamed from: y2 */
    public static final int f38593y2 = 21945;

    /* JADX INFO: renamed from: z0 */
    public static final String f38594z0 = "A_VORBIS";

    /* JADX INFO: renamed from: z1 */
    public static final int f38595z1 = 215;

    /* JADX INFO: renamed from: z2 */
    public static final int f38596z2 = 21946;

    /* JADX INFO: renamed from: A */
    public long f38597A;

    /* JADX INFO: renamed from: B */
    public boolean f38598B;

    /* JADX INFO: renamed from: C */
    public long f38599C;

    /* JADX INFO: renamed from: D */
    public long f38600D;

    /* JADX INFO: renamed from: E */
    public long f38601E;

    /* JADX INFO: renamed from: F */
    @hib
    public ok9 f38602F;

    /* JADX INFO: renamed from: G */
    @hib
    public ok9 f38603G;

    /* JADX INFO: renamed from: H */
    public boolean f38604H;

    /* JADX INFO: renamed from: I */
    public boolean f38605I;

    /* JADX INFO: renamed from: J */
    public int f38606J;

    /* JADX INFO: renamed from: K */
    public long f38607K;

    /* JADX INFO: renamed from: L */
    public long f38608L;

    /* JADX INFO: renamed from: M */
    public int f38609M;

    /* JADX INFO: renamed from: N */
    public int f38610N;

    /* JADX INFO: renamed from: O */
    public int[] f38611O;

    /* JADX INFO: renamed from: P */
    public int f38612P;

    /* JADX INFO: renamed from: Q */
    public int f38613Q;

    /* JADX INFO: renamed from: R */
    public int f38614R;

    /* JADX INFO: renamed from: S */
    public int f38615S;

    /* JADX INFO: renamed from: T */
    public boolean f38616T;

    /* JADX INFO: renamed from: U */
    public long f38617U;

    /* JADX INFO: renamed from: V */
    public int f38618V;

    /* JADX INFO: renamed from: W */
    public int f38619W;

    /* JADX INFO: renamed from: X */
    public int f38620X;

    /* JADX INFO: renamed from: Y */
    public boolean f38621Y;

    /* JADX INFO: renamed from: Z */
    public boolean f38622Z;

    /* JADX INFO: renamed from: a0 */
    public boolean f38623a0;

    /* JADX INFO: renamed from: b0 */
    public int f38624b0;

    /* JADX INFO: renamed from: c0 */
    public byte f38625c0;

    /* JADX INFO: renamed from: d */
    public final uv4 f38626d;

    /* JADX INFO: renamed from: d0 */
    public boolean f38627d0;

    /* JADX INFO: renamed from: e */
    public final x2i f38628e;

    /* JADX INFO: renamed from: e0 */
    public ck5 f38629e0;

    /* JADX INFO: renamed from: f */
    public final SparseArray<C6122d> f38630f;

    /* JADX INFO: renamed from: g */
    public final boolean f38631g;

    /* JADX INFO: renamed from: h */
    public final ihc f38632h;

    /* JADX INFO: renamed from: i */
    public final ihc f38633i;

    /* JADX INFO: renamed from: j */
    public final ihc f38634j;

    /* JADX INFO: renamed from: k */
    public final ihc f38635k;

    /* JADX INFO: renamed from: l */
    public final ihc f38636l;

    /* JADX INFO: renamed from: m */
    public final ihc f38637m;

    /* JADX INFO: renamed from: n */
    public final ihc f38638n;

    /* JADX INFO: renamed from: o */
    public final ihc f38639o;

    /* JADX INFO: renamed from: p */
    public final ihc f38640p;

    /* JADX INFO: renamed from: q */
    public final ihc f38641q;

    /* JADX INFO: renamed from: r */
    public ByteBuffer f38642r;

    /* JADX INFO: renamed from: s */
    public long f38643s;

    /* JADX INFO: renamed from: t */
    public long f38644t;

    /* JADX INFO: renamed from: u */
    public long f38645u;

    /* JADX INFO: renamed from: v */
    public long f38646v;

    /* JADX INFO: renamed from: w */
    public long f38647w;

    /* JADX INFO: renamed from: x */
    @hib
    public C6122d f38648x;

    /* JADX INFO: renamed from: y */
    public boolean f38649y;

    /* JADX INFO: renamed from: z */
    public int f38650z;

    /* JADX INFO: renamed from: f0 */
    public static final hk5 f38523f0 = new hk5() { // from class: c4a
        @Override // p000.hk5
        public final yj5[] createExtractors() {
            return g4a.lambda$static$0();
        }
    };

    /* JADX INFO: renamed from: Y2 */
    public static final byte[] f38504Y2 = {49, 10, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, 48, 48, 32, 45, 45, BuiltinOptions.LogicalAndOptions, 32, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: c3 */
    public static final byte[] f38516c3 = x0i.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: d3 */
    public static final byte[] f38519d3 = {BuiltinOptions.FillOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, 103, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FakeQuantOptions, 32, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44};

    /* JADX INFO: renamed from: h3 */
    public static final byte[] f38534h3 = {BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, 10, 10, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 46, 48, 48, 48, 32, 45, 45, BuiltinOptions.LogicalAndOptions, 32, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: o3 */
    public static final UUID f38562o3 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: g4a$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6120b {
    }

    /* JADX INFO: renamed from: g4a$c */
    public final class C6121c implements tv4 {
        private C6121c() {
        }

        @Override // p000.tv4
        public void binaryElement(int i, int i2, zj5 zj5Var) throws IOException {
            g4a.this.m11354e(i, i2, zj5Var);
        }

        @Override // p000.tv4
        public void endMasterElement(int i) throws xhc {
            g4a.this.m11355f(i);
        }

        @Override // p000.tv4
        public void floatElement(int i, double d) throws xhc {
            g4a.this.m11356g(i, d);
        }

        @Override // p000.tv4
        public int getElementType(int i) {
            return g4a.this.m11358i(i);
        }

        @Override // p000.tv4
        public void integerElement(int i, long j) throws xhc {
            g4a.this.m11361l(i, j);
        }

        @Override // p000.tv4
        public boolean isLevel1Element(int i) {
            return g4a.this.m11362m(i);
        }

        @Override // p000.tv4
        public void startMasterElement(int i, long j, long j2) throws xhc {
            g4a.this.m11363n(i, j, j2);
        }

        @Override // p000.tv4
        public void stringElement(int i, String str) throws xhc {
            g4a.this.m11364o(i, str);
        }
    }

    /* JADX INFO: renamed from: g4a$d */
    public static final class C6122d {

        /* JADX INFO: renamed from: Z */
        public static final int f38652Z = 0;

        /* JADX INFO: renamed from: a0 */
        public static final int f38653a0 = 50000;

        /* JADX INFO: renamed from: b0 */
        public static final int f38654b0 = 1000;

        /* JADX INFO: renamed from: c0 */
        public static final int f38655c0 = 200;

        /* JADX INFO: renamed from: N */
        public byte[] f38669N;

        /* JADX INFO: renamed from: T */
        public gjh f38675T;

        /* JADX INFO: renamed from: U */
        public boolean f38676U;

        /* JADX INFO: renamed from: X */
        public r6h f38679X;

        /* JADX INFO: renamed from: Y */
        public int f38680Y;

        /* JADX INFO: renamed from: a */
        public String f38681a;

        /* JADX INFO: renamed from: b */
        public String f38682b;

        /* JADX INFO: renamed from: c */
        public int f38683c;

        /* JADX INFO: renamed from: d */
        public int f38684d;

        /* JADX INFO: renamed from: e */
        public int f38685e;

        /* JADX INFO: renamed from: f */
        public int f38686f;

        /* JADX INFO: renamed from: g */
        public int f38687g;

        /* JADX INFO: renamed from: h */
        public boolean f38688h;

        /* JADX INFO: renamed from: i */
        public byte[] f38689i;

        /* JADX INFO: renamed from: j */
        public r6h.C11906a f38690j;

        /* JADX INFO: renamed from: k */
        public byte[] f38691k;

        /* JADX INFO: renamed from: l */
        public DrmInitData f38692l;

        /* JADX INFO: renamed from: m */
        public int f38693m = -1;

        /* JADX INFO: renamed from: n */
        public int f38694n = -1;

        /* JADX INFO: renamed from: o */
        public int f38695o = -1;

        /* JADX INFO: renamed from: p */
        public int f38696p = -1;

        /* JADX INFO: renamed from: q */
        public int f38697q = 0;

        /* JADX INFO: renamed from: r */
        public int f38698r = -1;

        /* JADX INFO: renamed from: s */
        public float f38699s = 0.0f;

        /* JADX INFO: renamed from: t */
        public float f38700t = 0.0f;

        /* JADX INFO: renamed from: u */
        public float f38701u = 0.0f;

        /* JADX INFO: renamed from: v */
        public byte[] f38702v = null;

        /* JADX INFO: renamed from: w */
        public int f38703w = -1;

        /* JADX INFO: renamed from: x */
        public boolean f38704x = false;

        /* JADX INFO: renamed from: y */
        public int f38705y = -1;

        /* JADX INFO: renamed from: z */
        public int f38706z = -1;

        /* JADX INFO: renamed from: A */
        public int f38656A = -1;

        /* JADX INFO: renamed from: B */
        public int f38657B = 1000;

        /* JADX INFO: renamed from: C */
        public int f38658C = 200;

        /* JADX INFO: renamed from: D */
        public float f38659D = -1.0f;

        /* JADX INFO: renamed from: E */
        public float f38660E = -1.0f;

        /* JADX INFO: renamed from: F */
        public float f38661F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f38662G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f38663H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f38664I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f38665J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f38666K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f38667L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f38668M = -1.0f;

        /* JADX INFO: renamed from: O */
        public int f38670O = 1;

        /* JADX INFO: renamed from: P */
        public int f38671P = -1;

        /* JADX INFO: renamed from: Q */
        public int f38672Q = 8000;

        /* JADX INFO: renamed from: R */
        public long f38673R = 0;

        /* JADX INFO: renamed from: S */
        public long f38674S = 0;

        /* JADX INFO: renamed from: V */
        public boolean f38677V = true;

        /* JADX INFO: renamed from: W */
        public String f38678W = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        @z25({"output"})
        public void assertOutputInitialized() {
            u80.checkNotNull(this.f38679X);
        }

        @z25({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws xhc {
            byte[] bArr = this.f38691k;
            if (bArr != null) {
                return bArr;
            }
            throw xhc.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @hib
        private byte[] getHdrStaticInfo() {
            if (this.f38659D == -1.0f || this.f38660E == -1.0f || this.f38661F == -1.0f || this.f38662G == -1.0f || this.f38663H == -1.0f || this.f38664I == -1.0f || this.f38665J == -1.0f || this.f38666K == -1.0f || this.f38667L == -1.0f || this.f38668M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f38659D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38660E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38661F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38662G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38663H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38664I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38665J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f38666K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f38667L + 0.5f));
            byteBufferOrder.putShort((short) (this.f38668M + 0.5f));
            byteBufferOrder.putShort((short) this.f38657B);
            byteBufferOrder.putShort((short) this.f38658C);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ihc ihcVar) throws xhc {
            try {
                ihcVar.skipBytes(16);
                long littleEndianUnsignedInt = ihcVar.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    yh9.m25919w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] data = ihcVar.getData();
                for (int position = ihcVar.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw xhc.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw xhc.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(ihc ihcVar) throws xhc {
            try {
                int littleEndianUnsignedShort = ihcVar.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                ihcVar.setPosition(24);
                if (ihcVar.readLong() == g4a.f38562o3.getMostSignificantBits()) {
                    if (ihcVar.readLong() == g4a.f38562o3.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw xhc.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws xhc {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw xhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i3 = 0;
                int i4 = 1;
                while (true) {
                    i = bArr[i4];
                    if ((i & 255) != 255) {
                        break;
                    }
                    i3 += 255;
                    i4++;
                }
                int i5 = i4 + 1;
                int i6 = i3 + (i & 255);
                int i7 = 0;
                while (true) {
                    i2 = bArr[i5];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i7 += 255;
                    i5++;
                }
                int i8 = i5 + 1;
                int i9 = i7 + (i2 & 255);
                if (bArr[i8] != 1) {
                    throw xhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw xhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw xhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw xhc.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return "A_OPUS".equals(this.f38682b) ? z : this.f38686f > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0428  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x0441  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x0443  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0450  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x0462  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x056c  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        @p000.z25({"this.output"})
        @p000.g5e({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void initializeOutput(p000.ck5 r20, int r21) throws p000.xhc {
            /*
                Method dump skipped, instruction units count: 1666
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.g4a.C6122d.initializeOutput(ck5, int):void");
        }

        @g5e({"output"})
        public void outputPendingSampleMetadata() {
            gjh gjhVar = this.f38675T;
            if (gjhVar != null) {
                gjhVar.outputPendingSampleMetadata(this.f38679X, this.f38690j);
            }
        }

        public void reset() {
            gjh gjhVar = this.f38675T;
            if (gjhVar != null) {
                gjhVar.reset();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f38566p3 = Collections.unmodifiableMap(map);
    }

    public g4a() {
        this(0);
    }

    @z25({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws xhc {
        if (this.f38602F == null || this.f38603G == null) {
            throw xhc.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    @z25({"currentTrack"})
    private void assertInTrackEntry(int i) throws xhc {
        if (this.f38648x != null) {
            return;
        }
        throw xhc.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @z25({"extractorOutput"})
    private void assertInitialized() {
        u80.checkStateNotNull(this.f38629e0);
    }

    private hue buildSeekMap(@hib ok9 ok9Var, @hib ok9 ok9Var2) {
        int i;
        if (this.f38644t == -1 || this.f38647w == -9223372036854775807L || ok9Var == null || ok9Var.size() == 0 || ok9Var2 == null || ok9Var2.size() != ok9Var.size()) {
            return new hue.C7024b(this.f38647w);
        }
        int size = ok9Var.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = ok9Var.get(i3);
            jArrCopyOf[i3] = this.f38644t + ok9Var2.get(i3);
        }
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            int i4 = i2 + 1;
            iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
            jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
            i2 = i4;
        }
        iArrCopyOf[i] = (int) ((this.f38644t + this.f38643s) - jArrCopyOf[i]);
        long j = this.f38647w - jArrCopyOf3[i];
        jArrCopyOf2[i] = j;
        if (j <= 0) {
            yh9.m25919w("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i);
        }
        return new lz1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @g5e({"#1.output"})
    private void commitSampleToOutput(C6122d c6122d, long j, int i, int i2, int i3) {
        gjh gjhVar = c6122d.f38675T;
        if (gjhVar != null) {
            gjhVar.sampleMetadata(c6122d.f38679X, j, i, i2, i3, c6122d.f38690j);
        } else {
            if ("S_TEXT/UTF8".equals(c6122d.f38682b) || "S_TEXT/ASS".equals(c6122d.f38682b) || "S_TEXT/WEBVTT".equals(c6122d.f38682b)) {
                if (this.f38610N > 1) {
                    yh9.m25919w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f38608L;
                    if (j2 == -9223372036854775807L) {
                        yh9.m25919w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(c6122d.f38682b, j2, this.f38638n.getData());
                        int position = this.f38638n.getPosition();
                        while (true) {
                            if (position >= this.f38638n.limit()) {
                                break;
                            }
                            if (this.f38638n.getData()[position] == 0) {
                                this.f38638n.setLimit(position);
                                break;
                            }
                            position++;
                        }
                        r6h r6hVar = c6122d.f38679X;
                        ihc ihcVar = this.f38638n;
                        r6hVar.sampleData(ihcVar, ihcVar.limit());
                        i2 += this.f38638n.limit();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f38610N > 1) {
                    this.f38641q.reset(0);
                } else {
                    int iLimit = this.f38641q.limit();
                    c6122d.f38679X.sampleData(this.f38641q, iLimit, 2);
                    i2 += iLimit;
                }
            }
            c6122d.f38679X.sampleMetadata(j, i, i2, i3, c6122d.f38690j);
        }
        this.f38605I = true;
    }

    private static int[] ensureArrayCapacity(@hib int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.f38619W;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        u80.checkArgument(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return x0i.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    private static boolean isCodecSupported(String str) {
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ yj5[] lambda$static$0() {
        return new yj5[]{new g4a()};
    }

    private boolean maybeSeekForCues(c5d c5dVar, long j) {
        if (this.f38598B) {
            this.f38600D = j;
            c5dVar.f15813a = this.f38599C;
            this.f38598B = false;
            return true;
        }
        if (this.f38649y) {
            long j2 = this.f38600D;
            if (j2 != -1) {
                c5dVar.f15813a = j2;
                this.f38600D = -1L;
                return true;
            }
        }
        return false;
    }

    private void readScratch(zj5 zj5Var, int i) throws IOException {
        if (this.f38634j.limit() >= i) {
            return;
        }
        if (this.f38634j.capacity() < i) {
            ihc ihcVar = this.f38634j;
            ihcVar.ensureCapacity(Math.max(ihcVar.capacity() * 2, i));
        }
        zj5Var.readFully(this.f38634j.getData(), this.f38634j.limit(), i - this.f38634j.limit());
        this.f38634j.setLimit(i);
    }

    private void resetWriteSampleData() {
        this.f38618V = 0;
        this.f38619W = 0;
        this.f38620X = 0;
        this.f38621Y = false;
        this.f38622Z = false;
        this.f38623a0 = false;
        this.f38624b0 = 0;
        this.f38625c0 = (byte) 0;
        this.f38627d0 = false;
        this.f38637m.reset(0);
    }

    private long scaleTimecodeToUs(long j) throws xhc {
        long j2 = this.f38645u;
        if (j2 != -9223372036854775807L) {
            return x0i.scaleLargeTimestamp(j, j2, 1000L);
        }
        throw xhc.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j, "%01d:%02d:%02d:%02d", 10000L);
                i = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j, "%02d:%02d:%02d.%03d", 1000L);
                i = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j, "%02d:%02d:%02d,%03d", 1000L);
                i = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i, subtitleTimecode.length);
    }

    @g5e({"#2.output"})
    private int writeSampleData(zj5 zj5Var, C6122d c6122d, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(c6122d.f38682b)) {
            writeSubtitleSampleData(zj5Var, f38504Y2, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/ASS".equals(c6122d.f38682b)) {
            writeSubtitleSampleData(zj5Var, f38519d3, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/WEBVTT".equals(c6122d.f38682b)) {
            writeSubtitleSampleData(zj5Var, f38534h3, i);
            return finishWriteSampleData();
        }
        r6h r6hVar = c6122d.f38679X;
        if (!this.f38621Y) {
            if (c6122d.f38688h) {
                this.f38614R &= -1073741825;
                if (!this.f38622Z) {
                    zj5Var.readFully(this.f38634j.getData(), 0, 1);
                    this.f38618V++;
                    if ((this.f38634j.getData()[0] & 128) == 128) {
                        throw xhc.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f38625c0 = this.f38634j.getData()[0];
                    this.f38622Z = true;
                }
                byte b = this.f38625c0;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f38614R |= 1073741824;
                    if (!this.f38627d0) {
                        zj5Var.readFully(this.f38639o.getData(), 0, 8);
                        this.f38618V += 8;
                        this.f38627d0 = true;
                        this.f38634j.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f38634j.setPosition(0);
                        r6hVar.sampleData(this.f38634j, 1, 1);
                        this.f38619W++;
                        this.f38639o.setPosition(0);
                        r6hVar.sampleData(this.f38639o, 8, 1);
                        this.f38619W += 8;
                    }
                    if (z2) {
                        if (!this.f38623a0) {
                            zj5Var.readFully(this.f38634j.getData(), 0, 1);
                            this.f38618V++;
                            this.f38634j.setPosition(0);
                            this.f38624b0 = this.f38634j.readUnsignedByte();
                            this.f38623a0 = true;
                        }
                        int i3 = this.f38624b0 * 4;
                        this.f38634j.reset(i3);
                        zj5Var.readFully(this.f38634j.getData(), 0, i3);
                        this.f38618V += i3;
                        short s = (short) ((this.f38624b0 / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f38642r;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.f38642r = ByteBuffer.allocate(i4);
                        }
                        this.f38642r.position(0);
                        this.f38642r.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.f38624b0;
                            if (i5 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.f38634j.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.f38642r.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.f38642r.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (i - this.f38618V) - i6;
                        if (i2 % 2 == 1) {
                            this.f38642r.putInt(i7);
                        } else {
                            this.f38642r.putShort((short) i7);
                            this.f38642r.putInt(0);
                        }
                        this.f38640p.reset(this.f38642r.array(), i4);
                        r6hVar.sampleData(this.f38640p, i4, 1);
                        this.f38619W += i4;
                    }
                }
            } else {
                byte[] bArr = c6122d.f38689i;
                if (bArr != null) {
                    this.f38637m.reset(bArr, bArr.length);
                }
            }
            if (c6122d.samplesHaveSupplementalData(z)) {
                this.f38614R |= 268435456;
                this.f38641q.reset(0);
                int iLimit = (this.f38637m.limit() + i) - this.f38618V;
                this.f38634j.reset(4);
                this.f38634j.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.f38634j.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.f38634j.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.f38634j.getData()[3] = (byte) (iLimit & 255);
                r6hVar.sampleData(this.f38634j, 4, 2);
                this.f38619W += 4;
            }
            this.f38621Y = true;
        }
        int iLimit2 = i + this.f38637m.limit();
        if (!"V_MPEG4/ISO/AVC".equals(c6122d.f38682b) && !"V_MPEGH/ISO/HEVC".equals(c6122d.f38682b)) {
            if (c6122d.f38675T != null) {
                u80.checkState(this.f38637m.limit() == 0);
                c6122d.f38675T.startSample(zj5Var);
            }
            while (true) {
                int i8 = this.f38618V;
                if (i8 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(zj5Var, r6hVar, iLimit2 - i8);
                this.f38618V += iWriteToOutput;
                this.f38619W += iWriteToOutput;
            }
        } else {
            byte[] data = this.f38633i.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i9 = c6122d.f38680Y;
            int i10 = 4 - i9;
            while (this.f38618V < iLimit2) {
                int i11 = this.f38620X;
                if (i11 == 0) {
                    writeToTarget(zj5Var, data, i10, i9);
                    this.f38618V += i9;
                    this.f38633i.setPosition(0);
                    this.f38620X = this.f38633i.readUnsignedIntToInt();
                    this.f38632h.setPosition(0);
                    r6hVar.sampleData(this.f38632h, 4);
                    this.f38619W += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(zj5Var, r6hVar, i11);
                    this.f38618V += iWriteToOutput2;
                    this.f38619W += iWriteToOutput2;
                    this.f38620X -= iWriteToOutput2;
                }
            }
        }
        if ("A_VORBIS".equals(c6122d.f38682b)) {
            this.f38635k.setPosition(0);
            r6hVar.sampleData(this.f38635k, 4);
            this.f38619W += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(zj5 zj5Var, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f38638n.capacity() < length) {
            this.f38638n.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f38638n.getData(), 0, bArr.length);
        }
        zj5Var.readFully(this.f38638n.getData(), bArr.length, i);
        this.f38638n.setPosition(0);
        this.f38638n.setLimit(length);
    }

    private int writeToOutput(zj5 zj5Var, r6h r6hVar, int i) throws IOException {
        int iBytesLeft = this.f38637m.bytesLeft();
        if (iBytesLeft <= 0) {
            return r6hVar.sampleData((ah3) zj5Var, i, false);
        }
        int iMin = Math.min(i, iBytesLeft);
        r6hVar.sampleData(this.f38637m, iMin);
        return iMin;
    }

    private void writeToTarget(zj5 zj5Var, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.f38637m.bytesLeft());
        zj5Var.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.f38637m.readBytes(bArr, i, iMin);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        throw p000.xhc.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    @p000.un1
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m11354e(int r22, int r23, p000.zj5 r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.g4a.m11354e(int, int, zj5):void");
    }

    @un1
    /* JADX INFO: renamed from: f */
    public void m11355f(int i) throws xhc {
        assertInitialized();
        if (i == 160) {
            if (this.f38606J != 2) {
                return;
            }
            C6122d c6122d = this.f38630f.get(this.f38612P);
            c6122d.assertOutputInitialized();
            if (this.f38617U > 0 && "A_OPUS".equals(c6122d.f38682b)) {
                this.f38641q.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f38617U).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f38610N; i3++) {
                i2 += this.f38611O[i3];
            }
            int i4 = 0;
            while (i4 < this.f38610N) {
                long j = this.f38607K + ((long) ((c6122d.f38685e * i4) / 1000));
                int i5 = this.f38614R;
                if (i4 == 0 && !this.f38616T) {
                    i5 |= 1;
                }
                int i6 = this.f38611O[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(c6122d, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.f38606J = 0;
            return;
        }
        if (i == 174) {
            C6122d c6122d2 = (C6122d) u80.checkStateNotNull(this.f38648x);
            String str = c6122d2.f38682b;
            if (str == null) {
                throw xhc.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                c6122d2.initializeOutput(this.f38629e0, c6122d2.f38683c);
                this.f38630f.put(c6122d2.f38683c, c6122d2);
            }
            this.f38648x = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.f38650z;
            if (i8 != -1) {
                long j2 = this.f38597A;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.f38599C = j2;
                        return;
                    }
                    return;
                }
            }
            throw xhc.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            assertInTrackEntry(i);
            C6122d c6122d3 = this.f38648x;
            if (c6122d3.f38688h) {
                if (c6122d3.f38690j == null) {
                    throw xhc.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                c6122d3.f38692l = new DrmInitData(new DrmInitData.SchemeData(kk1.f54446d2, "video/webm", this.f38648x.f38690j.f77148b));
                return;
            }
            return;
        }
        if (i == 28032) {
            assertInTrackEntry(i);
            C6122d c6122d4 = this.f38648x;
            if (c6122d4.f38688h && c6122d4.f38689i != null) {
                throw xhc.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f38645u == -9223372036854775807L) {
                this.f38645u = 1000000L;
            }
            long j3 = this.f38646v;
            if (j3 != -9223372036854775807L) {
                this.f38647w = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f38630f.size() == 0) {
                throw xhc.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f38629e0.endTracks();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f38649y) {
                this.f38629e0.seekMap(buildSeekMap(this.f38602F, this.f38603G));
                this.f38649y = true;
            }
            this.f38602F = null;
            this.f38603G = null;
        }
    }

    @un1
    /* JADX INFO: renamed from: g */
    public void m11356g(int i, double d) throws xhc {
        if (i == 181) {
            m11357h(i).f38672Q = (int) d;
        }
        if (i == 17545) {
            this.f38646v = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m11357h(i).f38659D = (float) d;
                break;
            case 21970:
                m11357h(i).f38660E = (float) d;
                break;
            case 21971:
                m11357h(i).f38661F = (float) d;
                break;
            case 21972:
                m11357h(i).f38662G = (float) d;
                break;
            case 21973:
                m11357h(i).f38663H = (float) d;
                break;
            case 21974:
                m11357h(i).f38664I = (float) d;
                break;
            case 21975:
                m11357h(i).f38665J = (float) d;
                break;
            case 21976:
                m11357h(i).f38666K = (float) d;
                break;
            case 21977:
                m11357h(i).f38667L = (float) d;
                break;
            case 21978:
                m11357h(i).f38668M = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m11357h(i).f38699s = (float) d;
                        break;
                    case 30324:
                        m11357h(i).f38700t = (float) d;
                        break;
                    case 30325:
                        m11357h(i).f38701u = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h */
    public C6122d m11357h(int i) throws xhc {
        assertInTrackEntry(i);
        return this.f38648x;
    }

    @un1
    /* JADX INFO: renamed from: i */
    public int m11358i(int i) {
        switch (i) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    @Override // p000.yj5
    public final void init(ck5 ck5Var) {
        this.f38629e0 = ck5Var;
    }

    /* JADX INFO: renamed from: j */
    public void m11359j(C6122d c6122d, zj5 zj5Var, int i) throws IOException {
        if (c6122d.f38687g != 1685485123 && c6122d.f38687g != 1685480259) {
            zj5Var.skipFully(i);
            return;
        }
        byte[] bArr = new byte[i];
        c6122d.f38669N = bArr;
        zj5Var.readFully(bArr, 0, i);
    }

    /* JADX INFO: renamed from: k */
    public void m11360k(C6122d c6122d, int i, zj5 zj5Var, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(c6122d.f38682b)) {
            zj5Var.skipFully(i2);
        } else {
            this.f38641q.reset(i2);
            zj5Var.readFully(this.f38641q.getData(), 0, i2);
        }
    }

    @un1
    /* JADX INFO: renamed from: l */
    public void m11361l(int i, long j) throws xhc {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw xhc.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw xhc.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                m11357h(i).f38684d = (int) j;
                return;
            case 136:
                m11357h(i).f38677V = j == 1;
                return;
            case 155:
                this.f38608L = scaleTimecodeToUs(j);
                return;
            case 159:
                m11357h(i).f38670O = (int) j;
                return;
            case 176:
                m11357h(i).f38693m = (int) j;
                return;
            case 179:
                assertInCues(i);
                this.f38602F.add(scaleTimecodeToUs(j));
                return;
            case 186:
                m11357h(i).f38694n = (int) j;
                return;
            case 215:
                m11357h(i).f38683c = (int) j;
                return;
            case 231:
                this.f38601E = scaleTimecodeToUs(j);
                return;
            case 238:
                this.f38615S = (int) j;
                return;
            case 241:
                if (this.f38604H) {
                    return;
                }
                assertInCues(i);
                this.f38603G.add(j);
                this.f38604H = true;
                return;
            case 251:
                this.f38616T = true;
                return;
            case 16871:
                m11357h(i).f38687g = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw xhc.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw xhc.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw xhc.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw xhc.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw xhc.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f38597A = j + this.f38644t;
                return;
            case 21432:
                int i2 = (int) j;
                assertInTrackEntry(i);
                if (i2 == 0) {
                    this.f38648x.f38703w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f38648x.f38703w = 2;
                    return;
                } else if (i2 == 3) {
                    this.f38648x.f38703w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f38648x.f38703w = 3;
                    return;
                }
            case 21680:
                m11357h(i).f38695o = (int) j;
                return;
            case 21682:
                m11357h(i).f38697q = (int) j;
                return;
            case 21690:
                m11357h(i).f38696p = (int) j;
                return;
            case 21930:
                m11357h(i).f38676U = j == 1;
                return;
            case 21998:
                m11357h(i).f38686f = (int) j;
                return;
            case 22186:
                m11357h(i).f38673R = j;
                return;
            case 22203:
                m11357h(i).f38674S = j;
                return;
            case 25188:
                m11357h(i).f38671P = (int) j;
                return;
            case 30114:
                this.f38617U = j;
                return;
            case 30321:
                assertInTrackEntry(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f38648x.f38698r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f38648x.f38698r = 1;
                    return;
                } else if (i3 == 2) {
                    this.f38648x.f38698r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f38648x.f38698r = 3;
                    return;
                }
            case 2352003:
                m11357h(i).f38685e = (int) j;
                return;
            case 2807729:
                this.f38645u = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        assertInTrackEntry(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f38648x.f38656A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f38648x.f38656A = 1;
                            return;
                        }
                    case 21946:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = f92.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.f38648x.f38706z = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        assertInTrackEntry(i);
                        this.f38648x.f38704x = true;
                        int iIsoColorPrimariesToColorSpace = f92.isoColorPrimariesToColorSpace((int) j);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.f38648x.f38705y = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        m11357h(i).f38657B = (int) j;
                        return;
                    case 21949:
                        m11357h(i).f38658C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @un1
    /* JADX INFO: renamed from: m */
    public boolean m11362m(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @un1
    /* JADX INFO: renamed from: n */
    public void m11363n(int i, long j, long j2) throws xhc {
        assertInitialized();
        if (i == 160) {
            this.f38616T = false;
            this.f38617U = 0L;
            return;
        }
        if (i == 174) {
            this.f38648x = new C6122d();
            return;
        }
        if (i == 187) {
            this.f38604H = false;
            return;
        }
        if (i == 19899) {
            this.f38650z = -1;
            this.f38597A = -1L;
            return;
        }
        if (i == 20533) {
            m11357h(i).f38688h = true;
            return;
        }
        if (i == 21968) {
            m11357h(i).f38704x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f38644t;
            if (j3 != -1 && j3 != j) {
                throw xhc.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f38644t = j;
            this.f38643s = j2;
            return;
        }
        if (i == 475249515) {
            this.f38602F = new ok9();
            this.f38603G = new ok9();
        } else if (i == 524531317 && !this.f38649y) {
            if (this.f38631g && this.f38599C != -1) {
                this.f38598B = true;
            } else {
                this.f38629e0.seekMap(new hue.C7024b(this.f38647w));
                this.f38649y = true;
            }
        }
    }

    @un1
    /* JADX INFO: renamed from: o */
    public void m11364o(int i, String str) throws xhc {
        if (i == 134) {
            m11357h(i).f38682b = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                m11357h(i).f38681a = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                m11357h(i).f38678W = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw xhc.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    @Override // p000.yj5
    public final int read(zj5 zj5Var, c5d c5dVar) throws IOException {
        this.f38605I = false;
        boolean z = true;
        while (z && !this.f38605I) {
            z = this.f38626d.read(zj5Var);
            if (z && maybeSeekForCues(c5dVar, zj5Var.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f38630f.size(); i++) {
            C6122d c6122dValueAt = this.f38630f.valueAt(i);
            c6122dValueAt.assertOutputInitialized();
            c6122dValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // p000.yj5
    public final void release() {
    }

    @Override // p000.yj5
    @un1
    public void seek(long j, long j2) {
        this.f38601E = -9223372036854775807L;
        this.f38606J = 0;
        this.f38626d.reset();
        this.f38628e.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.f38630f.size(); i++) {
            this.f38630f.valueAt(i).reset();
        }
    }

    @Override // p000.yj5
    public final boolean sniff(zj5 zj5Var) throws IOException {
        return new juf().sniff(zj5Var);
    }

    public g4a(int i) {
        this(new su3(), i);
    }

    public g4a(uv4 uv4Var, int i) {
        this.f38644t = -1L;
        this.f38645u = -9223372036854775807L;
        this.f38646v = -9223372036854775807L;
        this.f38647w = -9223372036854775807L;
        this.f38599C = -1L;
        this.f38600D = -1L;
        this.f38601E = -9223372036854775807L;
        this.f38626d = uv4Var;
        uv4Var.init(new C6121c());
        this.f38631g = (i & 1) == 0;
        this.f38628e = new x2i();
        this.f38630f = new SparseArray<>();
        this.f38634j = new ihc(4);
        this.f38635k = new ihc(ByteBuffer.allocate(4).putInt(-1).array());
        this.f38636l = new ihc(4);
        this.f38632h = new ihc(o8b.f66670i);
        this.f38633i = new ihc(4);
        this.f38637m = new ihc();
        this.f38638n = new ihc();
        this.f38639o = new ihc(8);
        this.f38640p = new ihc();
        this.f38641q = new ihc();
        this.f38611O = new int[1];
    }
}
