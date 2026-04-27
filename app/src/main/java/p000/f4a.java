package p000;

import android.util.Pair;
import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
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
import java.util.Objects;
import java.util.UUID;
import org.tensorflow.lite.schema.BuiltinOptions;
import p000.gue;
import p000.peg;
import p000.q6h;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class f4a implements xj5 {

    /* JADX INFO: renamed from: A0 */
    public static final String f35032A0 = "V_MPEGH/ISO/HEVC";

    /* JADX INFO: renamed from: A1 */
    public static final int f35033A1 = 165;

    /* JADX INFO: renamed from: A2 */
    public static final int f35034A2 = 30325;

    /* JADX INFO: renamed from: B0 */
    public static final String f35035B0 = "V_MS/VFW/FOURCC";

    /* JADX INFO: renamed from: B1 */
    public static final int f35036B1 = 251;

    /* JADX INFO: renamed from: B2 */
    public static final int f35037B2 = 21432;

    /* JADX INFO: renamed from: C0 */
    public static final String f35038C0 = "V_THEORA";

    /* JADX INFO: renamed from: C1 */
    public static final int f35039C1 = 374648427;

    /* JADX INFO: renamed from: C2 */
    public static final int f35040C2 = 21936;

    /* JADX INFO: renamed from: D0 */
    public static final String f35041D0 = "A_VORBIS";

    /* JADX INFO: renamed from: D1 */
    public static final int f35042D1 = 174;

    /* JADX INFO: renamed from: D2 */
    public static final int f35043D2 = 21945;

    /* JADX INFO: renamed from: E0 */
    public static final String f35044E0 = "A_OPUS";

    /* JADX INFO: renamed from: E1 */
    public static final int f35045E1 = 215;

    /* JADX INFO: renamed from: E2 */
    public static final int f35046E2 = 21938;

    /* JADX INFO: renamed from: F0 */
    public static final String f35047F0 = "A_AAC";

    /* JADX INFO: renamed from: F1 */
    public static final int f35048F1 = 131;

    /* JADX INFO: renamed from: F2 */
    public static final int f35049F2 = 21946;

    /* JADX INFO: renamed from: G0 */
    public static final String f35050G0 = "A_MPEG/L2";

    /* JADX INFO: renamed from: G1 */
    public static final int f35051G1 = 136;

    /* JADX INFO: renamed from: G2 */
    public static final int f35052G2 = 21947;

    /* JADX INFO: renamed from: H0 */
    public static final String f35053H0 = "A_MPEG/L3";

    /* JADX INFO: renamed from: H1 */
    public static final int f35054H1 = 21930;

    /* JADX INFO: renamed from: H2 */
    public static final int f35055H2 = 21948;

    /* JADX INFO: renamed from: I0 */
    public static final String f35056I0 = "A_AC3";

    /* JADX INFO: renamed from: I1 */
    public static final int f35057I1 = 2352003;

    /* JADX INFO: renamed from: I2 */
    public static final int f35058I2 = 21949;

    /* JADX INFO: renamed from: J0 */
    public static final String f35059J0 = "A_EAC3";

    /* JADX INFO: renamed from: J1 */
    public static final int f35060J1 = 21998;

    /* JADX INFO: renamed from: J2 */
    public static final int f35061J2 = 21968;

    /* JADX INFO: renamed from: K0 */
    public static final String f35062K0 = "A_TRUEHD";

    /* JADX INFO: renamed from: K1 */
    public static final int f35063K1 = 16868;

    /* JADX INFO: renamed from: K2 */
    public static final int f35064K2 = 21969;

    /* JADX INFO: renamed from: L0 */
    public static final String f35065L0 = "A_DTS";

    /* JADX INFO: renamed from: L1 */
    public static final int f35066L1 = 16871;

    /* JADX INFO: renamed from: L2 */
    public static final int f35067L2 = 21970;

    /* JADX INFO: renamed from: M0 */
    public static final String f35068M0 = "A_DTS/EXPRESS";

    /* JADX INFO: renamed from: M1 */
    public static final int f35069M1 = 16877;

    /* JADX INFO: renamed from: M2 */
    public static final int f35070M2 = 21971;

    /* JADX INFO: renamed from: N0 */
    public static final String f35071N0 = "A_DTS/LOSSLESS";

    /* JADX INFO: renamed from: N1 */
    public static final int f35072N1 = 21358;

    /* JADX INFO: renamed from: N2 */
    public static final int f35073N2 = 21972;

    /* JADX INFO: renamed from: O0 */
    public static final String f35074O0 = "A_FLAC";

    /* JADX INFO: renamed from: O1 */
    public static final int f35075O1 = 134;

    /* JADX INFO: renamed from: O2 */
    public static final int f35076O2 = 21973;

    /* JADX INFO: renamed from: P0 */
    public static final String f35077P0 = "A_MS/ACM";

    /* JADX INFO: renamed from: P1 */
    public static final int f35078P1 = 25506;

    /* JADX INFO: renamed from: P2 */
    public static final int f35079P2 = 21974;

    /* JADX INFO: renamed from: Q0 */
    public static final String f35080Q0 = "A_PCM/INT/LIT";

    /* JADX INFO: renamed from: Q1 */
    public static final int f35081Q1 = 22186;

    /* JADX INFO: renamed from: Q2 */
    public static final int f35082Q2 = 21975;

    /* JADX INFO: renamed from: R0 */
    public static final String f35083R0 = "A_PCM/INT/BIG";

    /* JADX INFO: renamed from: R1 */
    public static final int f35084R1 = 22203;

    /* JADX INFO: renamed from: R2 */
    public static final int f35085R2 = 21976;

    /* JADX INFO: renamed from: S0 */
    public static final String f35086S0 = "A_PCM/FLOAT/IEEE";

    /* JADX INFO: renamed from: S1 */
    public static final int f35087S1 = 30114;

    /* JADX INFO: renamed from: S2 */
    public static final int f35088S2 = 21977;

    /* JADX INFO: renamed from: T0 */
    public static final String f35089T0 = "S_TEXT/UTF8";

    /* JADX INFO: renamed from: T1 */
    public static final int f35090T1 = 224;

    /* JADX INFO: renamed from: T2 */
    public static final int f35091T2 = 21978;

    /* JADX INFO: renamed from: U0 */
    public static final String f35092U0 = "S_TEXT/ASS";

    /* JADX INFO: renamed from: U1 */
    public static final int f35093U1 = 176;

    /* JADX INFO: renamed from: U2 */
    public static final int f35094U2 = 4;

    /* JADX INFO: renamed from: V0 */
    public static final String f35095V0 = "S_TEXT/SSA";

    /* JADX INFO: renamed from: V1 */
    public static final int f35096V1 = 186;

    /* JADX INFO: renamed from: V2 */
    public static final int f35097V2 = 1685480259;

    /* JADX INFO: renamed from: W0 */
    public static final String f35098W0 = "S_TEXT/WEBVTT";

    /* JADX INFO: renamed from: W1 */
    public static final int f35099W1 = 21680;

    /* JADX INFO: renamed from: W2 */
    public static final int f35100W2 = 1685485123;

    /* JADX INFO: renamed from: X0 */
    public static final String f35101X0 = "S_VOBSUB";

    /* JADX INFO: renamed from: X1 */
    public static final int f35102X1 = 21690;

    /* JADX INFO: renamed from: X2 */
    public static final int f35103X2 = 0;

    /* JADX INFO: renamed from: Y0 */
    public static final String f35104Y0 = "S_HDMV/PGS";

    /* JADX INFO: renamed from: Y1 */
    public static final int f35105Y1 = 21682;

    /* JADX INFO: renamed from: Y2 */
    public static final int f35106Y2 = 1;

    /* JADX INFO: renamed from: Z0 */
    public static final String f35107Z0 = "S_DVBSUB";

    /* JADX INFO: renamed from: Z1 */
    public static final int f35108Z1 = 225;

    /* JADX INFO: renamed from: Z2 */
    public static final int f35109Z2 = 2;

    /* JADX INFO: renamed from: a1 */
    public static final int f35110a1 = 8192;

    /* JADX INFO: renamed from: a2 */
    public static final int f35111a2 = 159;

    /* JADX INFO: renamed from: a3 */
    public static final int f35112a3 = 3;

    /* JADX INFO: renamed from: b1 */
    public static final int f35113b1 = 5760;

    /* JADX INFO: renamed from: b2 */
    public static final int f35114b2 = 25188;

    /* JADX INFO: renamed from: b3 */
    public static final int f35115b3 = 1482049860;

    /* JADX INFO: renamed from: c1 */
    public static final int f35116c1 = 8;

    /* JADX INFO: renamed from: c2 */
    public static final int f35117c2 = 181;

    /* JADX INFO: renamed from: c3 */
    public static final int f35118c3 = 859189832;

    /* JADX INFO: renamed from: d1 */
    public static final int f35119d1 = 2;

    /* JADX INFO: renamed from: d2 */
    public static final int f35120d2 = 28032;

    /* JADX INFO: renamed from: d3 */
    public static final int f35121d3 = 826496599;

    /* JADX INFO: renamed from: e1 */
    public static final int f35122e1 = 440786851;

    /* JADX INFO: renamed from: e2 */
    public static final int f35123e2 = 25152;

    /* JADX INFO: renamed from: f1 */
    public static final int f35125f1 = 17143;

    /* JADX INFO: renamed from: f2 */
    public static final int f35126f2 = 20529;

    /* JADX INFO: renamed from: f3 */
    public static final int f35127f3 = 19;

    /* JADX INFO: renamed from: g1 */
    public static final int f35128g1 = 17026;

    /* JADX INFO: renamed from: g2 */
    public static final int f35129g2 = 20530;

    /* JADX INFO: renamed from: g3 */
    public static final long f35130g3 = 1000;

    /* JADX INFO: renamed from: h1 */
    public static final int f35131h1 = 17029;

    /* JADX INFO: renamed from: h2 */
    public static final int f35132h2 = 20532;

    /* JADX INFO: renamed from: h3 */
    public static final String f35133h3 = "%02d:%02d:%02d,%03d";

    /* JADX INFO: renamed from: i0 */
    public static final int f35134i0 = 1;

    /* JADX INFO: renamed from: i1 */
    public static final int f35135i1 = 408125543;

    /* JADX INFO: renamed from: i2 */
    public static final int f35136i2 = 16980;

    /* JADX INFO: renamed from: j0 */
    public static final int f35138j0 = 2;

    /* JADX INFO: renamed from: j1 */
    public static final int f35139j1 = 357149030;

    /* JADX INFO: renamed from: j2 */
    public static final int f35140j2 = 16981;

    /* JADX INFO: renamed from: k1 */
    public static final int f35143k1 = 290298740;

    /* JADX INFO: renamed from: k2 */
    public static final int f35144k2 = 20533;

    /* JADX INFO: renamed from: k3 */
    public static final int f35145k3 = 21;

    /* JADX INFO: renamed from: l0 */
    public static final String f35146l0 = "MatroskaExtractor";

    /* JADX INFO: renamed from: l1 */
    public static final int f35147l1 = 19899;

    /* JADX INFO: renamed from: l2 */
    public static final int f35148l2 = 18401;

    /* JADX INFO: renamed from: l3 */
    public static final long f35149l3 = 10000;

    /* JADX INFO: renamed from: m0 */
    public static final int f35150m0 = -1;

    /* JADX INFO: renamed from: m1 */
    public static final int f35151m1 = 21419;

    /* JADX INFO: renamed from: m2 */
    public static final int f35152m2 = 18402;

    /* JADX INFO: renamed from: m3 */
    public static final String f35153m3 = "%01d:%02d:%02d:%02d";

    /* JADX INFO: renamed from: n0 */
    public static final int f35154n0 = 0;

    /* JADX INFO: renamed from: n1 */
    public static final int f35155n1 = 21420;

    /* JADX INFO: renamed from: n2 */
    public static final int f35156n2 = 18407;

    /* JADX INFO: renamed from: o0 */
    public static final int f35158o0 = 1;

    /* JADX INFO: renamed from: o1 */
    public static final int f35159o1 = 357149030;

    /* JADX INFO: renamed from: o2 */
    public static final int f35160o2 = 18408;

    /* JADX INFO: renamed from: o3 */
    public static final int f35161o3 = 25;

    /* JADX INFO: renamed from: p0 */
    public static final int f35162p0 = 2;

    /* JADX INFO: renamed from: p1 */
    public static final int f35163p1 = 2807729;

    /* JADX INFO: renamed from: p2 */
    public static final int f35164p2 = 475249515;

    /* JADX INFO: renamed from: p3 */
    public static final long f35165p3 = 1000;

    /* JADX INFO: renamed from: q0 */
    public static final String f35166q0 = "matroska";

    /* JADX INFO: renamed from: q1 */
    public static final int f35167q1 = 17545;

    /* JADX INFO: renamed from: q2 */
    public static final int f35168q2 = 187;

    /* JADX INFO: renamed from: q3 */
    public static final String f35169q3 = "%02d:%02d:%02d.%03d";

    /* JADX INFO: renamed from: r0 */
    public static final String f35170r0 = "webm";

    /* JADX INFO: renamed from: r1 */
    public static final int f35171r1 = 524531317;

    /* JADX INFO: renamed from: r2 */
    public static final int f35172r2 = 179;

    /* JADX INFO: renamed from: r3 */
    public static final int f35173r3 = 18;

    /* JADX INFO: renamed from: s0 */
    public static final String f35174s0 = "V_VP8";

    /* JADX INFO: renamed from: s1 */
    public static final int f35175s1 = 231;

    /* JADX INFO: renamed from: s2 */
    public static final int f35176s2 = 183;

    /* JADX INFO: renamed from: s3 */
    public static final int f35177s3 = 65534;

    /* JADX INFO: renamed from: t0 */
    public static final String f35178t0 = "V_VP9";

    /* JADX INFO: renamed from: t1 */
    public static final int f35179t1 = 163;

    /* JADX INFO: renamed from: t2 */
    public static final int f35180t2 = 241;

    /* JADX INFO: renamed from: t3 */
    public static final int f35181t3 = 1;

    /* JADX INFO: renamed from: u0 */
    public static final String f35182u0 = "V_AV1";

    /* JADX INFO: renamed from: u1 */
    public static final int f35183u1 = 160;

    /* JADX INFO: renamed from: u2 */
    public static final int f35184u2 = 2274716;

    /* JADX INFO: renamed from: v0 */
    public static final String f35186v0 = "V_MPEG2";

    /* JADX INFO: renamed from: v1 */
    public static final int f35187v1 = 161;

    /* JADX INFO: renamed from: v2 */
    public static final int f35188v2 = 30320;

    /* JADX INFO: renamed from: v3 */
    public static final Map<String, Integer> f35189v3;

    /* JADX INFO: renamed from: w0 */
    public static final String f35190w0 = "V_MPEG4/ISO/SP";

    /* JADX INFO: renamed from: w1 */
    public static final int f35191w1 = 155;

    /* JADX INFO: renamed from: w2 */
    public static final int f35192w2 = 30321;

    /* JADX INFO: renamed from: x0 */
    public static final String f35193x0 = "V_MPEG4/ISO/ASP";

    /* JADX INFO: renamed from: x1 */
    public static final int f35194x1 = 30113;

    /* JADX INFO: renamed from: x2 */
    public static final int f35195x2 = 30322;

    /* JADX INFO: renamed from: y0 */
    public static final String f35196y0 = "V_MPEG4/ISO/AP";

    /* JADX INFO: renamed from: y1 */
    public static final int f35197y1 = 166;

    /* JADX INFO: renamed from: y2 */
    public static final int f35198y2 = 30323;

    /* JADX INFO: renamed from: z0 */
    public static final String f35199z0 = "V_MPEG4/ISO/AVC";

    /* JADX INFO: renamed from: z1 */
    public static final int f35200z1 = 238;

    /* JADX INFO: renamed from: z2 */
    public static final int f35201z2 = 30324;

    /* JADX INFO: renamed from: A */
    @hib
    public C5592d f35202A;

    /* JADX INFO: renamed from: B */
    public boolean f35203B;

    /* JADX INFO: renamed from: C */
    public int f35204C;

    /* JADX INFO: renamed from: D */
    public long f35205D;

    /* JADX INFO: renamed from: E */
    public boolean f35206E;

    /* JADX INFO: renamed from: F */
    public long f35207F;

    /* JADX INFO: renamed from: G */
    public long f35208G;

    /* JADX INFO: renamed from: H */
    public long f35209H;

    /* JADX INFO: renamed from: I */
    @hib
    public pk9 f35210I;

    /* JADX INFO: renamed from: J */
    @hib
    public pk9 f35211J;

    /* JADX INFO: renamed from: K */
    public boolean f35212K;

    /* JADX INFO: renamed from: L */
    public boolean f35213L;

    /* JADX INFO: renamed from: M */
    public int f35214M;

    /* JADX INFO: renamed from: N */
    public long f35215N;

    /* JADX INFO: renamed from: O */
    public long f35216O;

    /* JADX INFO: renamed from: P */
    public int f35217P;

    /* JADX INFO: renamed from: Q */
    public int f35218Q;

    /* JADX INFO: renamed from: R */
    public int[] f35219R;

    /* JADX INFO: renamed from: S */
    public int f35220S;

    /* JADX INFO: renamed from: T */
    public int f35221T;

    /* JADX INFO: renamed from: U */
    public int f35222U;

    /* JADX INFO: renamed from: V */
    public int f35223V;

    /* JADX INFO: renamed from: W */
    public boolean f35224W;

    /* JADX INFO: renamed from: X */
    public long f35225X;

    /* JADX INFO: renamed from: Y */
    public int f35226Y;

    /* JADX INFO: renamed from: Z */
    public int f35227Z;

    /* JADX INFO: renamed from: a0 */
    public int f35228a0;

    /* JADX INFO: renamed from: b0 */
    public boolean f35229b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f35230c0;

    /* JADX INFO: renamed from: d */
    public final vv4 f35231d;

    /* JADX INFO: renamed from: d0 */
    public boolean f35232d0;

    /* JADX INFO: renamed from: e */
    public final y2i f35233e;

    /* JADX INFO: renamed from: e0 */
    public int f35234e0;

    /* JADX INFO: renamed from: f */
    public final SparseArray<C5592d> f35235f;

    /* JADX INFO: renamed from: f0 */
    public byte f35236f0;

    /* JADX INFO: renamed from: g */
    public final boolean f35237g;

    /* JADX INFO: renamed from: g0 */
    public boolean f35238g0;

    /* JADX INFO: renamed from: h */
    public final boolean f35239h;

    /* JADX INFO: renamed from: h0 */
    public bk5 f35240h0;

    /* JADX INFO: renamed from: i */
    public final peg.InterfaceC10936a f35241i;

    /* JADX INFO: renamed from: j */
    public final jhc f35242j;

    /* JADX INFO: renamed from: k */
    public final jhc f35243k;

    /* JADX INFO: renamed from: l */
    public final jhc f35244l;

    /* JADX INFO: renamed from: m */
    public final jhc f35245m;

    /* JADX INFO: renamed from: n */
    public final jhc f35246n;

    /* JADX INFO: renamed from: o */
    public final jhc f35247o;

    /* JADX INFO: renamed from: p */
    public final jhc f35248p;

    /* JADX INFO: renamed from: q */
    public final jhc f35249q;

    /* JADX INFO: renamed from: r */
    public final jhc f35250r;

    /* JADX INFO: renamed from: s */
    public final jhc f35251s;

    /* JADX INFO: renamed from: t */
    public ByteBuffer f35252t;

    /* JADX INFO: renamed from: u */
    public long f35253u;

    /* JADX INFO: renamed from: v */
    public long f35254v;

    /* JADX INFO: renamed from: w */
    public long f35255w;

    /* JADX INFO: renamed from: x */
    public long f35256x;

    /* JADX INFO: renamed from: y */
    public long f35257y;

    /* JADX INFO: renamed from: z */
    public boolean f35258z;

    /* JADX INFO: renamed from: k0 */
    @Deprecated
    public static final ik5 f35142k0 = new ik5() { // from class: e4a
        @Override // p000.ik5
        public final xj5[] createExtractors() {
            return f4a.lambda$static$1();
        }
    };

    /* JADX INFO: renamed from: e3 */
    public static final byte[] f35124e3 = {49, 10, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, 48, 48, 32, 45, 45, BuiltinOptions.LogicalAndOptions, 32, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: i3 */
    public static final byte[] f35137i3 = t0i.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: j3 */
    public static final byte[] f35141j3 = {BuiltinOptions.FillOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.VarHandleOptions, 103, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.FakeQuantOptions, 32, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 44};

    /* JADX INFO: renamed from: n3 */
    public static final byte[] f35157n3 = {BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.SquareOptions, BuiltinOptions.RankOptions, BuiltinOptions.CosOptions, BuiltinOptions.CosOptions, 10, 10, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 46, 48, 48, 48, 32, 45, 45, BuiltinOptions.LogicalAndOptions, 32, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, BuiltinOptions.FakeQuantOptions, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: u3 */
    public static final UUID f35185u3 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: f4a$b */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC5590b {
    }

    /* JADX INFO: renamed from: f4a$c */
    public final class C5591c implements sv4 {
        private C5591c() {
        }

        @Override // p000.sv4
        public void binaryElement(int i, int i2, ak5 ak5Var) throws IOException {
            f4a.this.m10511f(i, i2, ak5Var);
        }

        @Override // p000.sv4
        public void endMasterElement(int i) throws yhc {
            f4a.this.m10512g(i);
        }

        @Override // p000.sv4
        public void floatElement(int i, double d) throws yhc {
            f4a.this.m10513h(i, d);
        }

        @Override // p000.sv4
        public int getElementType(int i) {
            return f4a.this.m10515j(i);
        }

        @Override // p000.sv4
        public void integerElement(int i, long j) throws yhc {
            f4a.this.m10518m(i, j);
        }

        @Override // p000.sv4
        public boolean isLevel1Element(int i) {
            return f4a.this.m10519n(i);
        }

        @Override // p000.sv4
        public void startMasterElement(int i, long j, long j2) throws yhc {
            f4a.this.m10520o(i, j, j2);
        }

        @Override // p000.sv4
        public void stringElement(int i, String str) throws yhc {
            f4a.this.m10521p(i, str);
        }
    }

    /* JADX INFO: renamed from: f4a$d */
    public static final class C5592d {

        /* JADX INFO: renamed from: b0 */
        public static final int f35260b0 = 0;

        /* JADX INFO: renamed from: c0 */
        public static final int f35261c0 = 50000;

        /* JADX INFO: renamed from: d0 */
        public static final int f35262d0 = 1000;

        /* JADX INFO: renamed from: e0 */
        public static final int f35263e0 = 200;

        /* JADX INFO: renamed from: P */
        public byte[] f35279P;

        /* JADX INFO: renamed from: V */
        public hjh f35285V;

        /* JADX INFO: renamed from: W */
        public boolean f35286W;

        /* JADX INFO: renamed from: Z */
        public q6h f35289Z;

        /* JADX INFO: renamed from: a */
        public boolean f35290a;

        /* JADX INFO: renamed from: a0 */
        public int f35291a0;

        /* JADX INFO: renamed from: b */
        public String f35292b;

        /* JADX INFO: renamed from: c */
        public String f35293c;

        /* JADX INFO: renamed from: d */
        public int f35294d;

        /* JADX INFO: renamed from: e */
        public int f35295e;

        /* JADX INFO: renamed from: f */
        public int f35296f;

        /* JADX INFO: renamed from: g */
        public int f35297g;

        /* JADX INFO: renamed from: h */
        public int f35298h;

        /* JADX INFO: renamed from: i */
        public boolean f35299i;

        /* JADX INFO: renamed from: j */
        public byte[] f35300j;

        /* JADX INFO: renamed from: k */
        public q6h.C11325a f35301k;

        /* JADX INFO: renamed from: l */
        public byte[] f35302l;

        /* JADX INFO: renamed from: m */
        public DrmInitData f35303m;

        /* JADX INFO: renamed from: n */
        public int f35304n = -1;

        /* JADX INFO: renamed from: o */
        public int f35305o = -1;

        /* JADX INFO: renamed from: p */
        public int f35306p = -1;

        /* JADX INFO: renamed from: q */
        public int f35307q = -1;

        /* JADX INFO: renamed from: r */
        public int f35308r = -1;

        /* JADX INFO: renamed from: s */
        public int f35309s = 0;

        /* JADX INFO: renamed from: t */
        public int f35310t = -1;

        /* JADX INFO: renamed from: u */
        public float f35311u = 0.0f;

        /* JADX INFO: renamed from: v */
        public float f35312v = 0.0f;

        /* JADX INFO: renamed from: w */
        public float f35313w = 0.0f;

        /* JADX INFO: renamed from: x */
        public byte[] f35314x = null;

        /* JADX INFO: renamed from: y */
        public int f35315y = -1;

        /* JADX INFO: renamed from: z */
        public boolean f35316z = false;

        /* JADX INFO: renamed from: A */
        public int f35264A = -1;

        /* JADX INFO: renamed from: B */
        public int f35265B = -1;

        /* JADX INFO: renamed from: C */
        public int f35266C = -1;

        /* JADX INFO: renamed from: D */
        public int f35267D = 1000;

        /* JADX INFO: renamed from: E */
        public int f35268E = 200;

        /* JADX INFO: renamed from: F */
        public float f35269F = -1.0f;

        /* JADX INFO: renamed from: G */
        public float f35270G = -1.0f;

        /* JADX INFO: renamed from: H */
        public float f35271H = -1.0f;

        /* JADX INFO: renamed from: I */
        public float f35272I = -1.0f;

        /* JADX INFO: renamed from: J */
        public float f35273J = -1.0f;

        /* JADX INFO: renamed from: K */
        public float f35274K = -1.0f;

        /* JADX INFO: renamed from: L */
        public float f35275L = -1.0f;

        /* JADX INFO: renamed from: M */
        public float f35276M = -1.0f;

        /* JADX INFO: renamed from: N */
        public float f35277N = -1.0f;

        /* JADX INFO: renamed from: O */
        public float f35278O = -1.0f;

        /* JADX INFO: renamed from: Q */
        public int f35280Q = 1;

        /* JADX INFO: renamed from: R */
        public int f35281R = -1;

        /* JADX INFO: renamed from: S */
        public int f35282S = 8000;

        /* JADX INFO: renamed from: T */
        public long f35283T = 0;

        /* JADX INFO: renamed from: U */
        public long f35284U = 0;

        /* JADX INFO: renamed from: X */
        public boolean f35287X = true;

        /* JADX INFO: renamed from: Y */
        public String f35288Y = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        @z25({"output"})
        public void assertOutputInitialized() {
            v80.checkNotNull(this.f35289Z);
        }

        @z25({"codecPrivate"})
        private byte[] getCodecPrivate(String str) throws yhc {
            byte[] bArr = this.f35302l;
            if (bArr != null) {
                return bArr;
            }
            throw yhc.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @hib
        private byte[] getHdrStaticInfo() {
            if (this.f35269F == -1.0f || this.f35270G == -1.0f || this.f35271H == -1.0f || this.f35272I == -1.0f || this.f35273J == -1.0f || this.f35274K == -1.0f || this.f35275L == -1.0f || this.f35276M == -1.0f || this.f35277N == -1.0f || this.f35278O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.f35269F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35270G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35271H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35272I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35273J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35274K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35275L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.f35276M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.f35277N + 0.5f));
            byteBufferOrder.putShort((short) (this.f35278O + 0.5f));
            byteBufferOrder.putShort((short) this.f35267D);
            byteBufferOrder.putShort((short) this.f35268E);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(jhc jhcVar) throws yhc {
            try {
                jhcVar.skipBytes(16);
                long littleEndianUnsignedInt = jhcVar.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    xh9.m25148w("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] data = jhcVar.getData();
                for (int position = jhcVar.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw yhc.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw yhc.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static boolean parseMsAcmCodecPrivate(jhc jhcVar) throws yhc {
            try {
                int littleEndianUnsignedShort = jhcVar.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort != 65534) {
                    return false;
                }
                jhcVar.setPosition(24);
                if (jhcVar.readLong() == f4a.f35185u3.getMostSignificantBits()) {
                    if (jhcVar.readLong() == f4a.f35185u3.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw yhc.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws yhc {
            int i;
            int i2;
            try {
                if (bArr[0] != 2) {
                    throw yhc.createForMalformedContainer("Error parsing vorbis codec private", null);
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
                    throw yhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i6];
                System.arraycopy(bArr, i8, bArr2, 0, i6);
                int i10 = i8 + i6;
                if (bArr[i10] != 3) {
                    throw yhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i11 = i10 + i9;
                if (bArr[i11] != 5) {
                    throw yhc.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i11];
                System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw yhc.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z) {
            return "A_OPUS".equals(this.f35293c) ? z : this.f35297g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:223:0x0461  */
        /* JADX WARN: Removed duplicated region for block: B:228:0x047a  */
        /* JADX WARN: Removed duplicated region for block: B:229:0x047c  */
        /* JADX WARN: Removed duplicated region for block: B:232:0x0489  */
        /* JADX WARN: Removed duplicated region for block: B:233:0x049b  */
        /* JADX WARN: Removed duplicated region for block: B:280:0x056f  */
        /* JADX WARN: Removed duplicated region for block: B:300:0x05c6  */
        /* JADX WARN: Removed duplicated region for block: B:305:0x05e1  */
        /* JADX WARN: Removed duplicated region for block: B:306:0x05e4  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        @p000.z25({"this.output"})
        @p000.g5e({"codecId"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void initializeOutput(p000.bk5 r20, int r21) throws p000.yhc {
            /*
                Method dump skipped, instruction units count: 1774
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.f4a.C5592d.initializeOutput(bk5, int):void");
        }

        @g5e({"output"})
        public void outputPendingSampleMetadata() {
            hjh hjhVar = this.f35285V;
            if (hjhVar != null) {
                hjhVar.outputPendingSampleMetadata(this.f35289Z, this.f35301k);
            }
        }

        public void reset() {
            hjh hjhVar = this.f35285V;
            if (hjhVar != null) {
                hjhVar.reset();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f35189v3 = Collections.unmodifiableMap(map);
    }

    @Deprecated
    public f4a() {
        this(new ru3(), 2, peg.InterfaceC10936a.f70575a);
    }

    @z25({"cueTimesUs", "cueClusterPositions"})
    private void assertInCues(int i) throws yhc {
        if (this.f35210I == null || this.f35211J == null) {
            throw yhc.createForMalformedContainer("Element " + i + " must be in a Cues", null);
        }
    }

    @z25({"currentTrack"})
    private void assertInTrackEntry(int i) throws yhc {
        if (this.f35202A != null) {
            return;
        }
        throw yhc.createForMalformedContainer("Element " + i + " must be in a TrackEntry", null);
    }

    @z25({"extractorOutput"})
    private void assertInitialized() {
        v80.checkStateNotNull(this.f35240h0);
    }

    private gue buildSeekMap(@hib pk9 pk9Var, @hib pk9 pk9Var2) {
        int i;
        if (this.f35254v == -1 || this.f35257y == -9223372036854775807L || pk9Var == null || pk9Var.size() == 0 || pk9Var2 == null || pk9Var2.size() != pk9Var.size()) {
            return new gue.C6549b(this.f35257y);
        }
        int size = pk9Var.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            jArrCopyOf3[i3] = pk9Var.get(i3);
            jArrCopyOf[i3] = this.f35254v + pk9Var2.get(i3);
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
        int i5 = i;
        while (i5 > 0 && jArrCopyOf3[i5] > this.f35257y) {
            i5--;
        }
        iArrCopyOf[i5] = (int) ((this.f35254v + this.f35253u) - jArrCopyOf[i5]);
        jArrCopyOf2[i5] = this.f35257y - jArrCopyOf3[i5];
        if (i5 < i) {
            xh9.m25148w("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration");
            int i6 = i5 + 1;
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i6);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i6);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i6);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i6);
        }
        return new mz1(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    @g5e({"#1.output"})
    private void commitSampleToOutput(C5592d c5592d, long j, int i, int i2, int i3) {
        hjh hjhVar = c5592d.f35285V;
        if (hjhVar != null) {
            hjhVar.sampleMetadata(c5592d.f35289Z, j, i, i2, i3, c5592d.f35301k);
        } else {
            if ("S_TEXT/UTF8".equals(c5592d.f35293c) || "S_TEXT/ASS".equals(c5592d.f35293c) || f35095V0.equals(c5592d.f35293c) || "S_TEXT/WEBVTT".equals(c5592d.f35293c)) {
                if (this.f35218Q > 1) {
                    xh9.m25148w("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.f35216O;
                    if (j2 == -9223372036854775807L) {
                        xh9.m25148w("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        setSubtitleEndTime(c5592d.f35293c, j2, this.f35248p.getData());
                        int position = this.f35248p.getPosition();
                        while (true) {
                            if (position >= this.f35248p.limit()) {
                                break;
                            }
                            if (this.f35248p.getData()[position] == 0) {
                                this.f35248p.setLimit(position);
                                break;
                            }
                            position++;
                        }
                        q6h q6hVar = c5592d.f35289Z;
                        jhc jhcVar = this.f35248p;
                        q6hVar.sampleData(jhcVar, jhcVar.limit());
                        i2 += this.f35248p.limit();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.f35218Q > 1) {
                    this.f35251s.reset(0);
                } else {
                    int iLimit = this.f35251s.limit();
                    c5592d.f35289Z.sampleData(this.f35251s, iLimit, 2);
                    i2 += iLimit;
                }
            }
            c5592d.f35289Z.sampleMetadata(j, i, i2, i3, c5592d.f35301k);
        }
        this.f35213L = true;
    }

    private static int[] ensureArrayCapacity(@hib int[] iArr, int i) {
        return iArr == null ? new int[i] : iArr.length >= i ? iArr : new int[Math.max(iArr.length * 2, i)];
    }

    private int finishWriteSampleData() {
        int i = this.f35227Z;
        resetWriteSampleData();
        return i;
    }

    private static byte[] formatSubtitleTimecode(long j, String str, long j2) {
        v80.checkArgument(j != -9223372036854775807L);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) i) * 3600000000L);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) i2) * 60000000);
        int i3 = (int) (j4 / 1000000);
        return t0i.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
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
            case "S_TEXT/SSA":
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
    public static /* synthetic */ xj5[] lambda$newFactory$0(peg.InterfaceC10936a interfaceC10936a) {
        return new xj5[]{new f4a(interfaceC10936a)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ xj5[] lambda$static$1() {
        return new xj5[]{new f4a(peg.InterfaceC10936a.f70575a, 2)};
    }

    private boolean maybeSeekForCues(d5d d5dVar, long j) {
        if (this.f35206E) {
            this.f35208G = j;
            d5dVar.f28476a = this.f35207F;
            this.f35206E = false;
            return true;
        }
        if (this.f35203B) {
            long j2 = this.f35208G;
            if (j2 != -1) {
                d5dVar.f28476a = j2;
                this.f35208G = -1L;
                return true;
            }
        }
        return false;
    }

    public static ik5 newFactory(final peg.InterfaceC10936a interfaceC10936a) {
        return new ik5() { // from class: d4a
            @Override // p000.ik5
            public final xj5[] createExtractors() {
                return f4a.lambda$newFactory$0(interfaceC10936a);
            }
        };
    }

    private void readScratch(ak5 ak5Var, int i) throws IOException {
        if (this.f35244l.limit() >= i) {
            return;
        }
        if (this.f35244l.capacity() < i) {
            jhc jhcVar = this.f35244l;
            jhcVar.ensureCapacity(Math.max(jhcVar.capacity() * 2, i));
        }
        ak5Var.readFully(this.f35244l.getData(), this.f35244l.limit(), i - this.f35244l.limit());
        this.f35244l.setLimit(i);
    }

    private void resetWriteSampleData() {
        this.f35226Y = 0;
        this.f35227Z = 0;
        this.f35228a0 = 0;
        this.f35229b0 = false;
        this.f35230c0 = false;
        this.f35232d0 = false;
        this.f35234e0 = 0;
        this.f35236f0 = (byte) 0;
        this.f35238g0 = false;
        this.f35247o.reset(0);
    }

    private long scaleTimecodeToUs(long j) throws yhc {
        long j2 = this.f35255w;
        if (j2 != -9223372036854775807L) {
            return t0i.scaleLargeTimestamp(j, j2, 1000L);
        }
        throw yhc.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void setSubtitleEndTime(String str, long j, byte[] bArr) {
        byte[] subtitleTimecode;
        int i;
        str.hashCode();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
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
    private int writeSampleData(ak5 ak5Var, C5592d c5592d, int i, boolean z) throws IOException {
        int i2;
        if ("S_TEXT/UTF8".equals(c5592d.f35293c)) {
            writeSubtitleSampleData(ak5Var, f35124e3, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/ASS".equals(c5592d.f35293c) || f35095V0.equals(c5592d.f35293c)) {
            writeSubtitleSampleData(ak5Var, f35141j3, i);
            return finishWriteSampleData();
        }
        if ("S_TEXT/WEBVTT".equals(c5592d.f35293c)) {
            writeSubtitleSampleData(ak5Var, f35157n3, i);
            return finishWriteSampleData();
        }
        q6h q6hVar = c5592d.f35289Z;
        if (!this.f35229b0) {
            if (c5592d.f35299i) {
                this.f35222U &= -1073741825;
                if (!this.f35230c0) {
                    ak5Var.readFully(this.f35244l.getData(), 0, 1);
                    this.f35226Y++;
                    if ((this.f35244l.getData()[0] & 128) == 128) {
                        throw yhc.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.f35236f0 = this.f35244l.getData()[0];
                    this.f35230c0 = true;
                }
                byte b = this.f35236f0;
                if ((b & 1) == 1) {
                    boolean z2 = (b & 2) == 2;
                    this.f35222U |= 1073741824;
                    if (!this.f35238g0) {
                        ak5Var.readFully(this.f35249q.getData(), 0, 8);
                        this.f35226Y += 8;
                        this.f35238g0 = true;
                        this.f35244l.getData()[0] = (byte) ((z2 ? 128 : 0) | 8);
                        this.f35244l.setPosition(0);
                        q6hVar.sampleData(this.f35244l, 1, 1);
                        this.f35227Z++;
                        this.f35249q.setPosition(0);
                        q6hVar.sampleData(this.f35249q, 8, 1);
                        this.f35227Z += 8;
                    }
                    if (z2) {
                        if (!this.f35232d0) {
                            ak5Var.readFully(this.f35244l.getData(), 0, 1);
                            this.f35226Y++;
                            this.f35244l.setPosition(0);
                            this.f35234e0 = this.f35244l.readUnsignedByte();
                            this.f35232d0 = true;
                        }
                        int i3 = this.f35234e0 * 4;
                        this.f35244l.reset(i3);
                        ak5Var.readFully(this.f35244l.getData(), 0, i3);
                        this.f35226Y += i3;
                        short s = (short) ((this.f35234e0 / 2) + 1);
                        int i4 = (s * 6) + 2;
                        ByteBuffer byteBuffer = this.f35252t;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.f35252t = ByteBuffer.allocate(i4);
                        }
                        this.f35252t.position(0);
                        this.f35252t.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.f35234e0;
                            if (i5 >= i2) {
                                break;
                            }
                            int unsignedIntToInt = this.f35244l.readUnsignedIntToInt();
                            if (i5 % 2 == 0) {
                                this.f35252t.putShort((short) (unsignedIntToInt - i6));
                            } else {
                                this.f35252t.putInt(unsignedIntToInt - i6);
                            }
                            i5++;
                            i6 = unsignedIntToInt;
                        }
                        int i7 = (i - this.f35226Y) - i6;
                        if (i2 % 2 == 1) {
                            this.f35252t.putInt(i7);
                        } else {
                            this.f35252t.putShort((short) i7);
                            this.f35252t.putInt(0);
                        }
                        this.f35250r.reset(this.f35252t.array(), i4);
                        q6hVar.sampleData(this.f35250r, i4, 1);
                        this.f35227Z += i4;
                    }
                }
            } else {
                byte[] bArr = c5592d.f35300j;
                if (bArr != null) {
                    this.f35247o.reset(bArr, bArr.length);
                }
            }
            if (c5592d.samplesHaveSupplementalData(z)) {
                this.f35222U |= 268435456;
                this.f35251s.reset(0);
                int iLimit = (this.f35247o.limit() + i) - this.f35226Y;
                this.f35244l.reset(4);
                this.f35244l.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.f35244l.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.f35244l.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.f35244l.getData()[3] = (byte) (iLimit & 255);
                q6hVar.sampleData(this.f35244l, 4, 2);
                this.f35227Z += 4;
            }
            this.f35229b0 = true;
        }
        int iLimit2 = i + this.f35247o.limit();
        if (!"V_MPEG4/ISO/AVC".equals(c5592d.f35293c) && !"V_MPEGH/ISO/HEVC".equals(c5592d.f35293c)) {
            if (c5592d.f35285V != null) {
                v80.checkState(this.f35247o.limit() == 0);
                c5592d.f35285V.startSample(ak5Var);
            }
            while (true) {
                int i8 = this.f35226Y;
                if (i8 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(ak5Var, q6hVar, iLimit2 - i8);
                this.f35226Y += iWriteToOutput;
                this.f35227Z += iWriteToOutput;
            }
        } else {
            byte[] data = this.f35243k.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i9 = c5592d.f35291a0;
            int i10 = 4 - i9;
            while (this.f35226Y < iLimit2) {
                int i11 = this.f35228a0;
                if (i11 == 0) {
                    writeToTarget(ak5Var, data, i10, i9);
                    this.f35226Y += i9;
                    this.f35243k.setPosition(0);
                    this.f35228a0 = this.f35243k.readUnsignedIntToInt();
                    this.f35242j.setPosition(0);
                    q6hVar.sampleData(this.f35242j, 4);
                    this.f35227Z += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(ak5Var, q6hVar, i11);
                    this.f35226Y += iWriteToOutput2;
                    this.f35227Z += iWriteToOutput2;
                    this.f35228a0 -= iWriteToOutput2;
                }
            }
        }
        if ("A_VORBIS".equals(c5592d.f35293c)) {
            this.f35245m.setPosition(0);
            q6hVar.sampleData(this.f35245m, 4);
            this.f35227Z += 4;
        }
        return finishWriteSampleData();
    }

    private void writeSubtitleSampleData(ak5 ak5Var, byte[] bArr, int i) throws IOException {
        int length = bArr.length + i;
        if (this.f35248p.capacity() < length) {
            this.f35248p.reset(Arrays.copyOf(bArr, length + i));
        } else {
            System.arraycopy(bArr, 0, this.f35248p.getData(), 0, bArr.length);
        }
        ak5Var.readFully(this.f35248p.getData(), bArr.length, i);
        this.f35248p.setPosition(0);
        this.f35248p.setLimit(length);
    }

    private int writeToOutput(ak5 ak5Var, q6h q6hVar, int i) throws IOException {
        int iBytesLeft = this.f35247o.bytesLeft();
        if (iBytesLeft <= 0) {
            return q6hVar.sampleData((bh3) ak5Var, i, false);
        }
        int iMin = Math.min(i, iBytesLeft);
        q6hVar.sampleData(this.f35247o, iMin);
        return iMin;
    }

    private void writeToTarget(ak5 ak5Var, byte[] bArr, int i, int i2) throws IOException {
        int iMin = Math.min(i2, this.f35247o.bytesLeft());
        ak5Var.readFully(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.f35247o.readBytes(bArr, i, iMin);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x0231, code lost:
    
        throw p000.yhc.createForMalformedContainer("EBML lacing sample size out of range.", null);
     */
    @p000.un1
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m10511f(int r22, int r23, p000.ak5 r24) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.f4a.m10511f(int, int, ak5):void");
    }

    @un1
    /* JADX INFO: renamed from: g */
    public void m10512g(int i) throws yhc {
        assertInitialized();
        if (i == 160) {
            if (this.f35214M != 2) {
                return;
            }
            C5592d c5592d = this.f35235f.get(this.f35220S);
            c5592d.assertOutputInitialized();
            if (this.f35225X > 0 && "A_OPUS".equals(c5592d.f35293c)) {
                this.f35251s.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.f35225X).array());
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.f35218Q; i3++) {
                i2 += this.f35219R[i3];
            }
            int i4 = 0;
            while (i4 < this.f35218Q) {
                long j = this.f35215N + ((long) ((c5592d.f35296f * i4) / 1000));
                int i5 = this.f35222U;
                if (i4 == 0 && !this.f35224W) {
                    i5 |= 1;
                }
                int i6 = this.f35219R[i4];
                int i7 = i2 - i6;
                commitSampleToOutput(c5592d, j, i5, i6, i7);
                i4++;
                i2 = i7;
            }
            this.f35214M = 0;
            return;
        }
        if (i == 174) {
            C5592d c5592d2 = (C5592d) v80.checkStateNotNull(this.f35202A);
            String str = c5592d2.f35293c;
            if (str == null) {
                throw yhc.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
            }
            if (isCodecSupported(str)) {
                c5592d2.initializeOutput(this.f35240h0, c5592d2.f35294d);
                this.f35235f.put(c5592d2.f35294d, c5592d2);
            }
            this.f35202A = null;
            return;
        }
        if (i == 19899) {
            int i8 = this.f35204C;
            if (i8 != -1) {
                long j2 = this.f35205D;
                if (j2 != -1) {
                    if (i8 == 475249515) {
                        this.f35207F = j2;
                        return;
                    }
                    return;
                }
            }
            throw yhc.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            assertInTrackEntry(i);
            C5592d c5592d3 = this.f35202A;
            if (c5592d3.f35299i) {
                if (c5592d3.f35301k == null) {
                    throw yhc.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                c5592d3.f35303m = new DrmInitData(new DrmInitData.SchemeData(jk1.f50913k2, "video/webm", this.f35202A.f35301k.f73348b));
                return;
            }
            return;
        }
        if (i == 28032) {
            assertInTrackEntry(i);
            C5592d c5592d4 = this.f35202A;
            if (c5592d4.f35299i && c5592d4.f35300j != null) {
                throw yhc.createForMalformedContainer("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.f35255w == -9223372036854775807L) {
                this.f35255w = 1000000L;
            }
            long j3 = this.f35256x;
            if (j3 != -9223372036854775807L) {
                this.f35257y = scaleTimecodeToUs(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.f35235f.size() == 0) {
                throw yhc.createForMalformedContainer("No valid tracks were found", null);
            }
            this.f35240h0.endTracks();
        } else {
            if (i != 475249515) {
                return;
            }
            if (!this.f35203B) {
                this.f35240h0.seekMap(buildSeekMap(this.f35210I, this.f35211J));
                this.f35203B = true;
            }
            this.f35210I = null;
            this.f35211J = null;
        }
    }

    @un1
    /* JADX INFO: renamed from: h */
    public void m10513h(int i, double d) throws yhc {
        if (i == 181) {
            m10514i(i).f35282S = (int) d;
        }
        if (i == 17545) {
            this.f35256x = (long) d;
            return;
        }
        switch (i) {
            case 21969:
                m10514i(i).f35269F = (float) d;
                break;
            case 21970:
                m10514i(i).f35270G = (float) d;
                break;
            case 21971:
                m10514i(i).f35271H = (float) d;
                break;
            case 21972:
                m10514i(i).f35272I = (float) d;
                break;
            case 21973:
                m10514i(i).f35273J = (float) d;
                break;
            case 21974:
                m10514i(i).f35274K = (float) d;
                break;
            case 21975:
                m10514i(i).f35275L = (float) d;
                break;
            case 21976:
                m10514i(i).f35276M = (float) d;
                break;
            case 21977:
                m10514i(i).f35277N = (float) d;
                break;
            case 21978:
                m10514i(i).f35278O = (float) d;
                break;
            default:
                switch (i) {
                    case 30323:
                        m10514i(i).f35311u = (float) d;
                        break;
                    case 30324:
                        m10514i(i).f35312v = (float) d;
                        break;
                    case 30325:
                        m10514i(i).f35313w = (float) d;
                        break;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public C5592d m10514i(int i) throws yhc {
        assertInTrackEntry(i);
        return this.f35202A;
    }

    @Override // p000.xj5
    public final void init(bk5 bk5Var) {
        if (this.f35239h) {
            bk5Var = new reg(bk5Var, this.f35241i);
        }
        this.f35240h0 = bk5Var;
    }

    @un1
    /* JADX INFO: renamed from: j */
    public int m10515j(int i) {
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
            case f35046E2 /* 21938 */:
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

    /* JADX INFO: renamed from: k */
    public void m10516k(C5592d c5592d, ak5 ak5Var, int i) throws IOException {
        if (c5592d.f35298h != 1685485123 && c5592d.f35298h != 1685480259) {
            ak5Var.skipFully(i);
            return;
        }
        byte[] bArr = new byte[i];
        c5592d.f35279P = bArr;
        ak5Var.readFully(bArr, 0, i);
    }

    /* JADX INFO: renamed from: l */
    public void m10517l(C5592d c5592d, int i, ak5 ak5Var, int i2) throws IOException {
        if (i != 4 || !"V_VP9".equals(c5592d.f35293c)) {
            ak5Var.skipFully(i2);
        } else {
            this.f35251s.reset(i2);
            ak5Var.readFully(this.f35251s.getData(), 0, i2);
        }
    }

    @un1
    /* JADX INFO: renamed from: m */
    public void m10518m(int i, long j) throws yhc {
        if (i == 20529) {
            if (j == 0) {
                return;
            }
            throw yhc.createForMalformedContainer("ContentEncodingOrder " + j + " not supported", null);
        }
        if (i == 20530) {
            if (j == 1) {
                return;
            }
            throw yhc.createForMalformedContainer("ContentEncodingScope " + j + " not supported", null);
        }
        switch (i) {
            case 131:
                m10514i(i).f35295e = (int) j;
                return;
            case 136:
                m10514i(i).f35287X = j == 1;
                return;
            case 155:
                this.f35216O = scaleTimecodeToUs(j);
                return;
            case 159:
                m10514i(i).f35280Q = (int) j;
                return;
            case 176:
                m10514i(i).f35304n = (int) j;
                return;
            case 179:
                assertInCues(i);
                this.f35210I.add(scaleTimecodeToUs(j));
                return;
            case 186:
                m10514i(i).f35305o = (int) j;
                return;
            case 215:
                m10514i(i).f35294d = (int) j;
                return;
            case 231:
                this.f35209H = scaleTimecodeToUs(j);
                return;
            case 238:
                this.f35223V = (int) j;
                return;
            case 241:
                if (this.f35212K) {
                    return;
                }
                assertInCues(i);
                this.f35211J.add(j);
                this.f35212K = true;
                return;
            case 251:
                this.f35224W = true;
                return;
            case 16871:
                m10514i(i).f35298h = (int) j;
                return;
            case 16980:
                if (j == 3) {
                    return;
                }
                throw yhc.createForMalformedContainer("ContentCompAlgo " + j + " not supported", null);
            case 17029:
                if (j < 1 || j > 2) {
                    throw yhc.createForMalformedContainer("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j == 1) {
                    return;
                }
                throw yhc.createForMalformedContainer("EBMLReadVersion " + j + " not supported", null);
            case 18401:
                if (j == 5) {
                    return;
                }
                throw yhc.createForMalformedContainer("ContentEncAlgo " + j + " not supported", null);
            case 18408:
                if (j == 1) {
                    return;
                }
                throw yhc.createForMalformedContainer("AESSettingsCipherMode " + j + " not supported", null);
            case 21420:
                this.f35205D = j + this.f35254v;
                return;
            case 21432:
                int i2 = (int) j;
                assertInTrackEntry(i);
                if (i2 == 0) {
                    this.f35202A.f35315y = 0;
                    return;
                }
                if (i2 == 1) {
                    this.f35202A.f35315y = 2;
                    return;
                } else if (i2 == 3) {
                    this.f35202A.f35315y = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.f35202A.f35315y = 3;
                    return;
                }
            case 21680:
                m10514i(i).f35307q = (int) j;
                return;
            case 21682:
                m10514i(i).f35309s = (int) j;
                return;
            case 21690:
                m10514i(i).f35308r = (int) j;
                return;
            case 21930:
                m10514i(i).f35286W = j == 1;
                return;
            case f35046E2 /* 21938 */:
                assertInTrackEntry(i);
                C5592d c5592d = this.f35202A;
                c5592d.f35316z = true;
                c5592d.f35306p = (int) j;
                return;
            case 21998:
                m10514i(i).f35297g = (int) j;
                return;
            case 22186:
                m10514i(i).f35283T = j;
                return;
            case 22203:
                m10514i(i).f35284U = j;
                return;
            case 25188:
                m10514i(i).f35281R = (int) j;
                return;
            case 30114:
                this.f35225X = j;
                return;
            case 30321:
                assertInTrackEntry(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.f35202A.f35310t = 0;
                    return;
                }
                if (i3 == 1) {
                    this.f35202A.f35310t = 1;
                    return;
                } else if (i3 == 2) {
                    this.f35202A.f35310t = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f35202A.f35310t = 3;
                    return;
                }
            case 2352003:
                m10514i(i).f35296f = (int) j;
                return;
            case 2807729:
                this.f35255w = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        assertInTrackEntry(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.f35202A.f35266C = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.f35202A.f35266C = 1;
                            return;
                        }
                    case 21946:
                        assertInTrackEntry(i);
                        int iIsoTransferCharacteristicsToColorTransfer = e92.isoTransferCharacteristicsToColorTransfer((int) j);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.f35202A.f35265B = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case 21947:
                        assertInTrackEntry(i);
                        this.f35202A.f35316z = true;
                        int iIsoColorPrimariesToColorSpace = e92.isoColorPrimariesToColorSpace((int) j);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.f35202A.f35264A = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case 21948:
                        m10514i(i).f35267D = (int) j;
                        return;
                    case 21949:
                        m10514i(i).f35268E = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    @un1
    /* JADX INFO: renamed from: n */
    public boolean m10519n(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    @un1
    /* JADX INFO: renamed from: o */
    public void m10520o(int i, long j, long j2) throws yhc {
        assertInitialized();
        if (i == 160) {
            this.f35224W = false;
            this.f35225X = 0L;
            return;
        }
        if (i == 174) {
            C5592d c5592d = new C5592d();
            this.f35202A = c5592d;
            c5592d.f35290a = this.f35258z;
            return;
        }
        if (i == 187) {
            this.f35212K = false;
            return;
        }
        if (i == 19899) {
            this.f35204C = -1;
            this.f35205D = -1L;
            return;
        }
        if (i == 20533) {
            m10514i(i).f35299i = true;
            return;
        }
        if (i == 21968) {
            m10514i(i).f35316z = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.f35254v;
            if (j3 != -1 && j3 != j) {
                throw yhc.createForMalformedContainer("Multiple Segment elements not supported", null);
            }
            this.f35254v = j;
            this.f35253u = j2;
            return;
        }
        if (i == 475249515) {
            this.f35210I = new pk9();
            this.f35211J = new pk9();
        } else if (i == 524531317 && !this.f35203B) {
            if (this.f35237g && this.f35207F != -1) {
                this.f35206E = true;
            } else {
                this.f35240h0.seekMap(new gue.C6549b(this.f35257y));
                this.f35203B = true;
            }
        }
    }

    @un1
    /* JADX INFO: renamed from: p */
    public void m10521p(int i, String str) throws yhc {
        if (i == 134) {
            m10514i(i).f35293c = str;
            return;
        }
        if (i != 17026) {
            if (i == 21358) {
                m10514i(i).f35292b = str;
                return;
            } else {
                if (i != 2274716) {
                    return;
                }
                m10514i(i).f35288Y = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f35258z = Objects.equals(str, "webm");
            return;
        }
        throw yhc.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    @Override // p000.xj5
    public final int read(ak5 ak5Var, d5d d5dVar) throws IOException {
        this.f35213L = false;
        boolean z = true;
        while (z && !this.f35213L) {
            z = this.f35231d.read(ak5Var);
            if (z && maybeSeekForCues(d5dVar, ak5Var.getPosition())) {
                return 1;
            }
        }
        if (z) {
            return 0;
        }
        for (int i = 0; i < this.f35235f.size(); i++) {
            C5592d c5592dValueAt = this.f35235f.valueAt(i);
            c5592dValueAt.assertOutputInitialized();
            c5592dValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // p000.xj5
    public final void release() {
    }

    @Override // p000.xj5
    @un1
    public void seek(long j, long j2) {
        this.f35209H = -9223372036854775807L;
        this.f35214M = 0;
        this.f35231d.reset();
        this.f35233e.reset();
        resetWriteSampleData();
        for (int i = 0; i < this.f35235f.size(); i++) {
            this.f35235f.valueAt(i).reset();
        }
    }

    @Override // p000.xj5
    public final boolean sniff(ak5 ak5Var) throws IOException {
        return new luf().sniff(ak5Var);
    }

    @Deprecated
    public f4a(int i) {
        this(new ru3(), i | 2, peg.InterfaceC10936a.f70575a);
    }

    public f4a(peg.InterfaceC10936a interfaceC10936a) {
        this(new ru3(), 0, interfaceC10936a);
    }

    public f4a(peg.InterfaceC10936a interfaceC10936a, int i) {
        this(new ru3(), i, interfaceC10936a);
    }

    public f4a(vv4 vv4Var, int i, peg.InterfaceC10936a interfaceC10936a) {
        this.f35254v = -1L;
        this.f35255w = -9223372036854775807L;
        this.f35256x = -9223372036854775807L;
        this.f35257y = -9223372036854775807L;
        this.f35207F = -1L;
        this.f35208G = -1L;
        this.f35209H = -9223372036854775807L;
        this.f35231d = vv4Var;
        vv4Var.init(new C5591c());
        this.f35241i = interfaceC10936a;
        this.f35237g = (i & 1) == 0;
        this.f35239h = (i & 2) == 0;
        this.f35233e = new y2i();
        this.f35235f = new SparseArray<>();
        this.f35244l = new jhc(4);
        this.f35245m = new jhc(ByteBuffer.allocate(4).putInt(-1).array());
        this.f35246n = new jhc(4);
        this.f35242j = new jhc(n8b.f63496C);
        this.f35243k = new jhc(4);
        this.f35247o = new jhc();
        this.f35248p = new jhc();
        this.f35249q = new jhc(8);
        this.f35250r = new jhc();
        this.f35251s = new jhc();
        this.f35219R = new int[1];
    }
}
