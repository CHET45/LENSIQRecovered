package p000;

import android.os.Trace;
import android.view.View;
import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0756i;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import androidx.compose.p002ui.viewinterop.AndroidViewHolder;
import java.util.Comparator;
import java.util.List;
import p000.a77;
import p000.jvd;
import p000.qw8;
import p000.z9c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVectorWithMutationTracking.kt\nandroidx/compose/ui/node/MutableVectorWithMutationTracking\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 6 AndroidTrace.android.kt\nandroidx/compose/ui/util/AndroidTrace_androidKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 9 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 10 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 11 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 12 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 13 NodeKind.kt\nandroidx/compose/ui/node/NodeKind\n+ 14 NodeKind.kt\nandroidx/compose/ui/node/NodeKindKt\n+ 15 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,1554:1\n1323#1,7:1561\n1323#1,7:1673\n1148#1,2:1690\n1150#1,2:1704\n203#1:1707\n1311#1,7:2072\n203#1:2247\n203#1:2259\n203#1:2271\n1323#1,7:2290\n1208#2:1555\n1187#2,2:1556\n1208#2:1558\n1187#2,2:1559\n1208#2:1568\n1187#2,2:1569\n1208#2:1762\n1187#2,2:1763\n1208#2:1836\n1187#2,2:1837\n1208#2:1910\n1187#2,2:1911\n1208#2:2033\n1187#2,2:2034\n1208#2:2115\n1187#2,2:2116\n1208#2:2200\n1187#2,2:2201\n48#3:1571\n48#3:1627\n48#3:1661\n48#3:1692\n460#4,7:1572\n146#4:1579\n467#4,4:1580\n460#4,11:1584\n476#4,11:1595\n460#4,11:1628\n460#4,11:1662\n460#4,11:1693\n146#4:1706\n460#4,11:1708\n460#4,11:2154\n460#4,11:2248\n460#4,11:2260\n460#4,11:2272\n42#5,7:1606\n42#5,7:1613\n96#5,7:1620\n42#5,7:1644\n42#5,7:1651\n66#5,9:1680\n66#5,9:1949\n96#5,7:1958\n96#5,7:1965\n42#5,7:1973\n96#5,7:2283\n26#6,3:1639\n30#6:1643\n80#7:1642\n80#7:1659\n92#7:1660\n80#7:1689\n82#7:1722\n78#7:1727\n82#7:1801\n105#7:1875\n92#7:1972\n94#7,3:1980\n98#7:1984\n94#7:1989\n96#7,3:1991\n90#7:1997\n90#7:2017\n76#7:2079\n76#7:2099\n88#7:2165\n78#7:2234\n76#7:2235\n76#7:2239\n76#7:2241\n78#7:2242\n1#8:1658\n720#9,3:1719\n723#9,3:1724\n697#9,8:1728\n720#9,3:1736\n705#9,2:1739\n698#9:1741\n699#9,11:1785\n723#9,3:1796\n710#9:1799\n700#9:1800\n697#9,8:1802\n720#9,3:1810\n705#9,2:1813\n698#9:1815\n699#9,11:1859\n723#9,3:1870\n710#9:1873\n700#9:1874\n697#9,8:1876\n720#9,3:1884\n705#9,2:1887\n698#9:1889\n699#9,11:1933\n723#9,3:1944\n710#9:1947\n700#9:1948\n720#9,3:1986\n723#9,3:1994\n697#9,8:1998\n720#9,3:2006\n705#9,2:2009\n698#9:2011\n699#9,11:2056\n723#9,3:2067\n710#9:2070\n700#9:2071\n697#9,8:2080\n720#9,3:2088\n705#9,2:2091\n698#9:2093\n699#9,11:2138\n723#9,3:2149\n710#9:2152\n700#9:2153\n720#9,3:2236\n723#9,3:2244\n264#10:1723\n264#10:1748\n264#10:1822\n264#10:1896\n264#10:1990\n264#10:2019\n264#10:2101\n264#10:2186\n264#10:2240\n264#10:2243\n432#11,6:1742\n442#11,2:1749\n444#11,8:1754\n452#11,9:1765\n461#11,8:1777\n432#11,6:1816\n442#11,2:1823\n444#11,8:1828\n452#11,9:1839\n461#11,8:1851\n432#11,6:1890\n442#11,2:1897\n444#11,8:1902\n452#11,9:1913\n461#11,8:1925\n432#11,5:2012\n437#11:2018\n442#11,2:2020\n444#11,8:2025\n452#11,9:2036\n461#11,8:2048\n432#11,5:2094\n437#11:2100\n442#11,2:2102\n444#11,8:2107\n452#11,9:2118\n461#11,8:2130\n432#11,6:2180\n442#11,2:2187\n444#11,8:2192\n452#11,9:2203\n461#11,8:2215\n245#12,3:1751\n248#12,3:1774\n245#12,3:1825\n248#12,3:1848\n245#12,3:1899\n248#12,3:1922\n245#12,3:2022\n248#12,3:2045\n245#12,3:2104\n248#12,3:2127\n245#12,3:2189\n248#12,3:2212\n51#13:1983\n56#14:1985\n115#15:2166\n104#15,13:2167\n117#15:2223\n109#15,10:2224\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n*L\n120#1:1561,7\n509#1:1673,7\n542#1:1690,2\n542#1:1704,2\n611#1:1707\n1191#1:2072,7\n1359#1:2247\n1381#1:2259\n1393#1:2271\n1439#1:2290,7\n134#1:1555\n134#1:1556,2\n557#1:1558\n557#1:1559,2\n146#1:1568\n146#1:1569,2\n726#1:1762\n726#1:1763,2\n739#1:1836\n739#1:1837,2\n751#1:1910\n751#1:1911,2\n1175#1:2033\n1175#1:2034,2\n1273#1:2115\n1273#1:2116,2\n1302#1:2200\n1302#1:2201,2\n150#1:1571\n376#1:1627\n499#1:1661\n543#1:1692\n150#1:1572,7\n152#1:1579\n150#1:1580,4\n203#1:1584,11\n205#1:1595,11\n376#1:1628,11\n499#1:1662,11\n543#1:1693,11\n573#1:1706\n611#1:1708,11\n1277#1:2154,11\n1359#1:2248,11\n1381#1:2260,11\n1393#1:2272,11\n290#1:1606,7\n295#1:1613,7\n336#1:1620,7\n453#1:1644,7\n456#1:1651,7\n525#1:1680,9\n883#1:1949,9\n913#1:1958,7\n916#1:1965,7\n1101#1:1973,7\n1408#1:2283,7\n425#1:1639,3\n425#1:1643\n426#1:1642\n478#1:1659\n491#1:1660\n538#1:1689\n705#1:1722\n726#1:1727\n739#1:1801\n751#1:1875\n930#1:1972\n1138#1:1980,3\n1138#1:1984\n1140#1:1989\n1140#1:1991,3\n1175#1:1997\n1176#1:2017\n1273#1:2079\n1274#1:2099\n1302#1:2165\n1332#1:2234\n1332#1:2235\n1334#1:2239\n1335#1:2241\n1339#1:2242\n704#1:1719,3\n704#1:1724,3\n726#1:1728,8\n726#1:1736,3\n726#1:1739,2\n726#1:1741\n726#1:1785,11\n726#1:1796,3\n726#1:1799\n726#1:1800\n739#1:1802,8\n739#1:1810,3\n739#1:1813,2\n739#1:1815\n739#1:1859,11\n739#1:1870,3\n739#1:1873\n739#1:1874\n751#1:1876,8\n751#1:1884,3\n751#1:1887,2\n751#1:1889\n751#1:1933,11\n751#1:1944,3\n751#1:1947\n751#1:1948\n1139#1:1986,3\n1139#1:1994,3\n1175#1:1998,8\n1175#1:2006,3\n1175#1:2009,2\n1175#1:2011\n1175#1:2056,11\n1175#1:2067,3\n1175#1:2070\n1175#1:2071\n1273#1:2080,8\n1273#1:2088,3\n1273#1:2091,2\n1273#1:2093\n1273#1:2138,11\n1273#1:2149,3\n1273#1:2152\n1273#1:2153\n1333#1:2236,3\n1333#1:2244,3\n705#1:1723\n726#1:1748\n739#1:1822\n751#1:1896\n1140#1:1990\n1175#1:2019\n1273#1:2101\n1302#1:2186\n1334#1:2240\n1339#1:2243\n726#1:1742,6\n726#1:1749,2\n726#1:1754,8\n726#1:1765,9\n726#1:1777,8\n739#1:1816,6\n739#1:1823,2\n739#1:1828,8\n739#1:1839,9\n739#1:1851,8\n751#1:1890,6\n751#1:1897,2\n751#1:1902,8\n751#1:1913,9\n751#1:1925,8\n1175#1:2012,5\n1175#1:2018\n1175#1:2020,2\n1175#1:2025,8\n1175#1:2036,9\n1175#1:2048,8\n1273#1:2094,5\n1273#1:2100\n1273#1:2102,2\n1273#1:2107,8\n1273#1:2118,9\n1273#1:2130,8\n1302#1:2180,6\n1302#1:2187,2\n1302#1:2192,8\n1302#1:2203,9\n1302#1:2215,8\n726#1:1751,3\n726#1:1774,3\n739#1:1825,3\n739#1:1848,3\n751#1:1899,3\n751#1:1922,3\n1175#1:2022,3\n1175#1:2045,3\n1273#1:2104,3\n1273#1:2127,3\n1302#1:2189,3\n1302#1:2212,3\n1138#1:1983\n1138#1:1985\n1302#1:2166\n1302#1:2167,13\n1302#1:2223\n1302#1:2224,10\n*E\n"})
@e0g(parameters = 0)
public final class lw8 implements pl2, byd, aac, xv8, xl2, jc8, z9c.InterfaceC16043b {

    /* JADX INFO: renamed from: u2 */
    public static final int f59009u2 = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: C */
    @gib
    public f7b<lw8> f59013C;

    /* JADX INFO: renamed from: F */
    public boolean f59014F;

    /* JADX INFO: renamed from: H */
    @gib
    public lw8 f59015H;

    /* JADX INFO: renamed from: L */
    @gib
    public z9c f59016L;

    /* JADX INFO: renamed from: M */
    @gib
    public AndroidViewHolder f59017M;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public uba f59018M1;

    /* JADX INFO: renamed from: N */
    public int f59019N;

    /* JADX INFO: renamed from: Q */
    public boolean f59020Q;

    /* JADX INFO: renamed from: V1 */
    @gib
    public qd8 f59021V1;

    /* JADX INFO: renamed from: X */
    @gib
    public nxe f59022X;

    /* JADX INFO: renamed from: Y */
    @yfb
    public final f7b<lw8> f59023Y;

    /* JADX INFO: renamed from: Z */
    public boolean f59024Z;

    /* JADX INFO: renamed from: Z1 */
    @yfb
    public c64 f59025Z1;

    /* JADX INFO: renamed from: a */
    public final boolean f59026a;

    /* JADX INFO: renamed from: a2 */
    @yfb
    public ov8 f59027a2;

    /* JADX INFO: renamed from: b */
    public int f59028b;

    /* JADX INFO: renamed from: b2 */
    @yfb
    public u8i f59029b2;

    /* JADX INFO: renamed from: c */
    public int f59030c;

    /* JADX INFO: renamed from: c2 */
    @yfb
    public qn2 f59031c2;

    /* JADX INFO: renamed from: d */
    public boolean f59032d;

    /* JADX INFO: renamed from: d2 */
    @yfb
    public EnumC9005g f59033d2;

    /* JADX INFO: renamed from: e */
    @gib
    public lw8 f59034e;

    /* JADX INFO: renamed from: e2 */
    @yfb
    public EnumC9005g f59035e2;

    /* JADX INFO: renamed from: f */
    public int f59036f;

    /* JADX INFO: renamed from: f2 */
    public boolean f59037f2;

    /* JADX INFO: renamed from: g2 */
    @yfb
    public final feb f59038g2;

    /* JADX INFO: renamed from: h2 */
    @yfb
    public final qw8 f59039h2;

    /* JADX INFO: renamed from: i2 */
    @gib
    public C0756i f59040i2;

    /* JADX INFO: renamed from: j2 */
    @gib
    public heb f59041j2;

    /* JADX INFO: renamed from: k2 */
    public boolean f59042k2;

    /* JADX INFO: renamed from: l2 */
    @yfb
    public InterfaceC0701e f59043l2;

    /* JADX INFO: renamed from: m */
    @yfb
    public final h7b<lw8> f59044m;

    /* JADX INFO: renamed from: m2 */
    @gib
    public InterfaceC0701e f59045m2;

    /* JADX INFO: renamed from: n2 */
    @gib
    public qy6<? super z9c, bth> f59046n2;

    /* JADX INFO: renamed from: o2 */
    @gib
    public qy6<? super z9c, bth> f59047o2;

    /* JADX INFO: renamed from: p2 */
    public boolean f59048p2;

    /* JADX INFO: renamed from: q2 */
    public boolean f59049q2;

    /* JADX INFO: renamed from: r2 */
    @yfb
    public static final C9002d f59006r2 = new C9002d(null);

    /* JADX INFO: renamed from: s2 */
    public static final int f59007s2 = 8;

    /* JADX INFO: renamed from: t2 */
    @yfb
    public static final AbstractC9004f f59008t2 = new C9001c();

    /* JADX INFO: renamed from: v2 */
    @yfb
    public static final ny6<lw8> f59010v2 = C8999a.f59050a;

    /* JADX INFO: renamed from: w2 */
    @yfb
    public static final u8i f59011w2 = new C9000b();

    /* JADX INFO: renamed from: x2 */
    @yfb
    public static final Comparator<lw8> f59012x2 = new Comparator() { // from class: kw8
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return lw8.ZComparator$lambda$42((lw8) obj, (lw8) obj2);
        }
    };

    /* JADX INFO: renamed from: lw8$a */
    public static final class C8999a extends tt8 implements ny6<lw8> {

        /* JADX INFO: renamed from: a */
        public static final C8999a f59050a = new C8999a();

        public C8999a() {
            super(0);
        }

        @Override // p000.ny6
        @yfb
        public final lw8 invoke() {
            return new lw8(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    /* JADX INFO: renamed from: lw8$b */
    public static final class C9000b implements u8i {
        @Override // p000.u8i
        public long getDoubleTapMinTimeMillis() {
            return 40L;
        }

        @Override // p000.u8i
        public long getDoubleTapTimeoutMillis() {
            return 300L;
        }

        @Override // p000.u8i
        public long getLongPressTimeoutMillis() {
            return 400L;
        }

        @Override // p000.u8i
        /* JADX INFO: renamed from: getMinimumTouchTargetSize-MYxV2XQ, reason: not valid java name */
        public long mo30909getMinimumTouchTargetSizeMYxV2XQ() {
            return pn4.f71480b.m31825getZeroMYxV2XQ();
        }

        @Override // p000.u8i
        public float getTouchSlop() {
            return 16.0f;
        }
    }

    /* JADX INFO: renamed from: lw8$c */
    public static final class C9001c extends AbstractC9004f {
        public C9001c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // p000.uba
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ vba mo27228measure3p2s80s(InterfaceC0761n interfaceC0761n, List list, long j) {
            return (vba) m30910measure3p2s80s(interfaceC0761n, (List<? extends rba>) list, j);
        }

        @yfb
        /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
        public Void m30910measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb List<? extends rba> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: renamed from: lw8$d */
    public static final class C9002d {
        public /* synthetic */ C9002d(jt3 jt3Var) {
            this();
        }

        public static /* synthetic */ void getNotPlacedPlaceOrder$ui_release$annotations() {
        }

        @yfb
        public final ny6<lw8> getConstructor$ui_release() {
            return lw8.f59010v2;
        }

        @yfb
        public final u8i getDummyViewConfiguration$ui_release() {
            return lw8.f59011w2;
        }

        @yfb
        public final Comparator<lw8> getZComparator$ui_release() {
            return lw8.f59012x2;
        }

        private C9002d() {
        }
    }

    /* JADX INFO: renamed from: lw8$e */
    public enum EnumC9003e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    /* JADX INFO: renamed from: lw8$f */
    @e0g(parameters = 1)
    public static abstract class AbstractC9004f implements uba {

        /* JADX INFO: renamed from: b */
        public static final int f59057b = 0;

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f59058a;

        public AbstractC9004f(@yfb String str) {
            this.f59058a = str;
        }

        @Override // p000.uba
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(gd8 gd8Var, List list, int i) {
            return ((Number) m30911maxIntrinsicHeight(gd8Var, (List<? extends ed8>) list, i)).intValue();
        }

        @Override // p000.uba
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(gd8 gd8Var, List list, int i) {
            return ((Number) m30912maxIntrinsicWidth(gd8Var, (List<? extends ed8>) list, i)).intValue();
        }

        @Override // p000.uba
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(gd8 gd8Var, List list, int i) {
            return ((Number) m30913minIntrinsicHeight(gd8Var, (List<? extends ed8>) list, i)).intValue();
        }

        @Override // p000.uba
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(gd8 gd8Var, List list, int i) {
            return ((Number) m30914minIntrinsicWidth(gd8Var, (List<? extends ed8>) list, i)).intValue();
        }

        @yfb
        /* JADX INFO: renamed from: maxIntrinsicHeight, reason: collision with other method in class */
        public Void m30911maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            throw new IllegalStateException(this.f59058a.toString());
        }

        @yfb
        /* JADX INFO: renamed from: maxIntrinsicWidth, reason: collision with other method in class */
        public Void m30912maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            throw new IllegalStateException(this.f59058a.toString());
        }

        @yfb
        /* JADX INFO: renamed from: minIntrinsicHeight, reason: collision with other method in class */
        public Void m30913minIntrinsicHeight(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            throw new IllegalStateException(this.f59058a.toString());
        }

        @yfb
        /* JADX INFO: renamed from: minIntrinsicWidth, reason: collision with other method in class */
        public Void m30914minIntrinsicWidth(@yfb gd8 gd8Var, @yfb List<? extends ed8> list, int i) {
            throw new IllegalStateException(this.f59058a.toString());
        }
    }

    /* JADX INFO: renamed from: lw8$g */
    public enum EnumC9005g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    /* JADX INFO: renamed from: lw8$h */
    public /* synthetic */ class C9006h {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f59063a;

        static {
            int[] iArr = new int[EnumC9003e.values().length];
            try {
                iArr[EnumC9003e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f59063a = iArr;
        }
    }

    /* JADX INFO: renamed from: lw8$i */
    public static final class C9007i extends tt8 implements ny6<bth> {
        public C9007i() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            lw8.this.getLayoutDelegate$ui_release().markChildrenDirty();
        }
    }

    /* JADX INFO: renamed from: lw8$j */
    @dwf({"SMAP\nLayoutNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 4 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 7 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1554:1\n80#2:1555\n736#3,18:1556\n754#3,3:1618\n432#4,5:1574\n437#4:1580\n442#4,2:1582\n444#4,8:1587\n452#4,9:1598\n461#4,8:1610\n1#5:1579\n264#6:1581\n245#7,3:1584\n248#7,3:1607\n1208#8:1595\n1187#8,2:1596\n*S KotlinDebug\n*F\n+ 1 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode$collapsedSemantics$1$1\n*L\n432#1:1555\n432#1:1556,18\n432#1:1618,3\n432#1:1574,5\n432#1:1580\n432#1:1582,2\n432#1:1587,8\n432#1:1598,9\n432#1:1610,8\n432#1:1581\n432#1:1584,3\n432#1:1607,3\n432#1:1595\n432#1:1596,2\n*E\n"})
    public static final class C9008j extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ jvd.C8121h<nxe> f59066b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C9008j(jvd.C8121h<nxe> c8121h) {
            super(0);
            this.f59066b = c8121h;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, nxe] */
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            feb nodes$ui_release = lw8.this.getNodes$ui_release();
            int iM30687constructorimpl = keb.m30687constructorimpl(8);
            jvd.C8121h<nxe> c8121h = this.f59066b;
            if ((nodes$ui_release.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
                for (InterfaceC0701e.d tail$ui_release = nodes$ui_release.getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
                    if ((tail$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = tail$ui_release;
                        f7b f7bVar = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof rxe) {
                                rxe rxeVar = (rxe) dVarPop;
                                if (rxeVar.getShouldClearDescendantSemantics()) {
                                    ?? nxeVar = new nxe();
                                    c8121h.f52110a = nxeVar;
                                    nxeVar.setClearingSemantics(true);
                                }
                                if (rxeVar.getShouldMergeDescendantSemantics()) {
                                    c8121h.f52110a.setMergingSemanticsOfDescendants(true);
                                }
                                rxeVar.applySemantics(c8121h.f52110a);
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar == null) {
                                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != 0) {
                                                f7bVar.add(dVarPop);
                                                dVarPop = 0;
                                            }
                                            f7bVar.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    dVarPop = dVarPop;
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar);
                        }
                    }
                }
            }
        }
    }

    public lw8() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int ZComparator$lambda$42(lw8 lw8Var, lw8 lw8Var2) {
        return lw8Var.getZIndex() == lw8Var2.getZIndex() ? md8.compare(lw8Var.getPlaceOrder$ui_release(), lw8Var2.getPlaceOrder$ui_release()) : Float.compare(lw8Var.getZIndex(), lw8Var2.getZIndex());
    }

    private final void applyModifier(InterfaceC0701e interfaceC0701e) {
        this.f59043l2 = interfaceC0701e;
        this.f59038g2.updateFrom$ui_release(interfaceC0701e);
        this.f59039h2.updateParentData();
        if (this.f59034e == null && this.f59038g2.m28910hasH91voCI$ui_release(keb.m30687constructorimpl(512))) {
            setLookaheadRoot(this);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m16425b(lw8 lw8Var, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return lw8Var.debugTreeToString(i);
    }

    private final void clearSubtreePlacementIntrinsicsUsage() {
        this.f59035e2 = this.f59033d2;
        this.f59033d2 = EnumC9005g.NotUsed;
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                if (lw8Var.f59033d2 == EnumC9005g.InLayoutBlock) {
                    lw8Var.clearSubtreePlacementIntrinsicsUsage();
                }
                i++;
            } while (i < size);
        }
    }

    private final String debugTreeToString(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(a77.C0077a.f542d);
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i3 = 0;
            do {
                sb.append(content[i3].debugTreeToString(i + 1));
                i3++;
            } while (i3 < size);
        }
        String string = sb.toString();
        if (i != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    @q64(message = "Temporary API to support ConstraintLayout prototyping.")
    public static /* synthetic */ void getCanMultiMeasure$ui_release$annotations() {
    }

    @ug5
    public static /* synthetic */ void getCompositeKeyHash$annotations() {
    }

    private final heb getInnerLayerCoordinator() {
        if (this.f59042k2) {
            heb innerCoordinator$ui_release = getInnerCoordinator$ui_release();
            heb wrappedBy$ui_release = getOuterCoordinator$ui_release().getWrappedBy$ui_release();
            this.f59041j2 = null;
            while (true) {
                if (md8.areEqual(innerCoordinator$ui_release, wrappedBy$ui_release)) {
                    break;
                }
                if ((innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getLayer() : null) != null) {
                    this.f59041j2 = innerCoordinator$ui_release;
                    break;
                }
                innerCoordinator$ui_release = innerCoordinator$ui_release != null ? innerCoordinator$ui_release.getWrappedBy$ui_release() : null;
            }
        }
        heb hebVar = this.f59041j2;
        if (hebVar == null || hebVar.getLayer() != null) {
            return hebVar;
        }
        g28.throwIllegalStateExceptionForNullCheck("layer was not set");
        throw new us8();
    }

    private final qd8 getOrCreateIntrinsicsPolicy() {
        qd8 qd8Var = this.f59021V1;
        if (qd8Var != null) {
            return qd8Var;
        }
        qd8 qd8Var2 = new qd8(this, getMeasurePolicy());
        this.f59021V1 = qd8Var2;
        return qd8Var2;
    }

    private final float getZIndex() {
        return getMeasurePassDelegate$ui_release().getZIndex$ui_release();
    }

    @yjd
    public static /* synthetic */ void getZSortedChildren$annotations() {
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release$default, reason: not valid java name */
    public static /* synthetic */ void m30901hitTestM_7yMNQ$ui_release$default(lw8 lw8Var, long j, ck7 ck7Var, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        boolean z3 = z;
        if ((i & 8) != 0) {
            z2 = true;
        }
        lw8Var.m30905hitTestM_7yMNQ$ui_release(j, ck7Var, z3, z2);
    }

    private final void invalidateFocusOnAttach() {
        if (this.f59038g2.has$ui_release(keb.m30687constructorimpl(1024) | keb.m30687constructorimpl(2048) | keb.m30687constructorimpl(4096))) {
            for (InterfaceC0701e.d head$ui_release = this.f59038g2.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if (((keb.m30687constructorimpl(1024) & head$ui_release.getKindSet$ui_release()) != 0) | ((keb.m30687constructorimpl(2048) & head$ui_release.getKindSet$ui_release()) != 0) | ((keb.m30687constructorimpl(4096) & head$ui_release.getKindSet$ui_release()) != 0)) {
                    leb.autoInvalidateInsertedNode(head$ui_release);
                }
            }
        }
    }

    public static /* synthetic */ void invalidateSubtree$default(lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        lw8Var.invalidateSubtree(z);
    }

    private final void invalidateUnfoldedVirtualChildren() {
        lw8 lw8Var;
        if (this.f59036f > 0) {
            this.f59014F = true;
        }
        if (!this.f59026a || (lw8Var = this.f59015H) == null) {
            return;
        }
        lw8Var.invalidateUnfoldedVirtualChildren();
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m30903lookaheadRemeasure_Sx5XlM$ui_release$default(lw8 lw8Var, ku2 ku2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ku2Var = lw8Var.f59039h2.m32040getLastLookaheadConstraintsDWUhwKw();
        }
        return lw8Var.m30907lookaheadRemeasure_Sx5XlM$ui_release(ku2Var);
    }

    private final void onChildRemoved(lw8 lw8Var) {
        if (lw8Var.f59039h2.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            this.f59039h2.setChildrenAccessingCoordinatesDuringPlacement(r0.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.f59016L != null) {
            lw8Var.detach$ui_release();
        }
        lw8Var.f59015H = null;
        lw8Var.getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
        if (lw8Var.f59026a) {
            this.f59036f--;
            f7b<lw8> vector = lw8Var.f59044m.getVector();
            int size = vector.getSize();
            if (size > 0) {
                lw8[] content = vector.getContent();
                int i = 0;
                do {
                    content[i].getOuterCoordinator$ui_release().setWrappedBy$ui_release(null);
                    i++;
                } while (i < size);
            }
        }
        invalidateUnfoldedVirtualChildren();
        onZSortedChildrenInvalidated$ui_release();
    }

    private final void onDensityOrLayoutDirectionChanged() {
        invalidateMeasurements$ui_release();
        lw8 parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateLayers$ui_release();
    }

    private final void recreateUnfoldedChildrenIfDirty() {
        if (this.f59014F) {
            int i = 0;
            this.f59014F = false;
            f7b<lw8> f7bVar = this.f59013C;
            if (f7bVar == null) {
                f7bVar = new f7b<>(new lw8[16], 0);
                this.f59013C = f7bVar;
            }
            f7bVar.clear();
            f7b<lw8> vector = this.f59044m.getVector();
            int size = vector.getSize();
            if (size > 0) {
                lw8[] content = vector.getContent();
                do {
                    lw8 lw8Var = content[i];
                    if (lw8Var.f59026a) {
                        f7bVar.addAll(f7bVar.getSize(), lw8Var.get_children$ui_release());
                    } else {
                        f7bVar.add(lw8Var);
                    }
                    i++;
                } while (i < size);
            }
            this.f59039h2.markChildrenDirty();
        }
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release$default, reason: not valid java name */
    public static /* synthetic */ boolean m30904remeasure_Sx5XlM$ui_release$default(lw8 lw8Var, ku2 ku2Var, int i, Object obj) {
        if ((i & 1) != 0) {
            ku2Var = lw8Var.f59039h2.m32039getLastConstraintsDWUhwKw();
        }
        return lw8Var.m30908remeasure_Sx5XlM$ui_release(ku2Var);
    }

    public static /* synthetic */ void requestLookaheadRelayout$ui_release$default(lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lw8Var.requestLookaheadRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestLookaheadRemeasure$ui_release$default(lw8 lw8Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        lw8Var.requestLookaheadRemeasure$ui_release(z, z2, z3);
    }

    public static /* synthetic */ void requestRelayout$ui_release$default(lw8 lw8Var, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        lw8Var.requestRelayout$ui_release(z);
    }

    public static /* synthetic */ void requestRemeasure$ui_release$default(lw8 lw8Var, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        lw8Var.requestRemeasure$ui_release(z, z2, z3);
    }

    private final void resetModifierState() {
        this.f59038g2.resetState$ui_release();
    }

    private final void setLookaheadRoot(lw8 lw8Var) {
        if (md8.areEqual(lw8Var, this.f59034e)) {
            return;
        }
        this.f59034e = lw8Var;
        if (lw8Var != null) {
            this.f59039h2.ensureLookaheadDelegateCreated$ui_release();
            heb wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
            for (heb outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !md8.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
                outerCoordinator$ui_release.ensureLookaheadDelegateCreated();
            }
        }
        invalidateMeasurements$ui_release();
    }

    private final boolean shouldInvalidateParentLayer() {
        if (this.f59038g2.m28910hasH91voCI$ui_release(keb.m30687constructorimpl(4)) && !this.f59038g2.m28910hasH91voCI$ui_release(keb.m30687constructorimpl(2))) {
            return true;
        }
        for (InterfaceC0701e.d head$ui_release = this.f59038g2.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((keb.m30687constructorimpl(2) & head$ui_release.getKindSet$ui_release()) != 0 && w34.m32852requireCoordinator64DMado(head$ui_release, keb.m30687constructorimpl(2)).getLayer() != null) {
                return false;
            }
            if ((keb.m30687constructorimpl(4) & head$ui_release.getKindSet$ui_release()) != 0) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attach$ui_release(@p000.yfb p000.z9c r7) {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lw8.attach$ui_release(z9c):void");
    }

    public final void clearSubtreeIntrinsicsUsage$ui_release() {
        this.f59035e2 = this.f59033d2;
        this.f59033d2 = EnumC9005g.NotUsed;
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                if (lw8Var.f59033d2 != EnumC9005g.NotUsed) {
                    lw8Var.clearSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void detach$ui_release() {
        z9c z9cVar = this.f59016L;
        if (z9cVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            lw8 parent$ui_release = getParent$ui_release();
            sb.append(parent$ui_release != null ? m16425b(parent$ui_release, 0, 1, null) : null);
            g28.throwIllegalStateExceptionForNullCheck(sb.toString());
            throw new us8();
        }
        lw8 parent$ui_release2 = getParent$ui_release();
        if (parent$ui_release2 != null) {
            parent$ui_release2.invalidateLayer$ui_release();
            parent$ui_release2.invalidateMeasurements$ui_release();
            qw8.C11724b measurePassDelegate$ui_release = getMeasurePassDelegate$ui_release();
            EnumC9005g enumC9005g = EnumC9005g.NotUsed;
            measurePassDelegate$ui_release.setMeasuredByParent$ui_release(enumC9005g);
            qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(enumC9005g);
            }
        }
        this.f59039h2.resetAlignmentLines();
        qy6<? super z9c, bth> qy6Var = this.f59047o2;
        if (qy6Var != null) {
            qy6Var.invoke(z9cVar);
        }
        if (this.f59038g2.m28910hasH91voCI$ui_release(keb.m30687constructorimpl(8))) {
            invalidateSemantics$ui_release();
        }
        this.f59038g2.runDetachLifecycle$ui_release();
        this.f59020Q = true;
        f7b<lw8> vector = this.f59044m.getVector();
        int size = vector.getSize();
        if (size > 0) {
            lw8[] content = vector.getContent();
            int i = 0;
            do {
                content[i].detach$ui_release();
                i++;
            } while (i < size);
        }
        this.f59020Q = false;
        this.f59038g2.markAsDetached$ui_release();
        z9cVar.onDetach(this);
        this.f59016L = null;
        setLookaheadRoot(null);
        this.f59019N = 0;
        getMeasurePassDelegate$ui_release().onNodeDetached();
        qw8.C11723a lookaheadPassDelegate$ui_release2 = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release2 != null) {
            lookaheadPassDelegate$ui_release2.onNodeDetached();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void dispatchOnPositionedCallbacks$ui_release() {
        if (getLayoutState$ui_release() != EnumC9003e.Idle || getLayoutPending$ui_release() || getMeasurePending$ui_release() || isDeactivated() || !isPlaced()) {
            return;
        }
        feb febVar = this.f59038g2;
        int iM30687constructorimpl = keb.m30687constructorimpl(256);
        if ((febVar.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
            for (InterfaceC0701e.d head$ui_release = febVar.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = head$ui_release;
                    f7b f7bVar = null;
                    while (dVarPop != 0) {
                        if (dVarPop instanceof o77) {
                            o77 o77Var = (o77) dVarPop;
                            o77Var.onGloballyPositioned(w34.m32852requireCoordinator64DMado(o77Var, keb.m30687constructorimpl(256)));
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                            int i = 0;
                            dVarPop = dVarPop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dVarPop = delegate$ui_release;
                                    } else {
                                        if (f7bVar == null) {
                                            f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                        }
                                        if (dVarPop != 0) {
                                            f7bVar.add(dVarPop);
                                            dVarPop = 0;
                                        }
                                        f7bVar.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                dVarPop = dVarPop;
                            }
                            if (i == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void draw$ui_release(@yfb vq1 vq1Var, @gib u97 u97Var) {
        getOuterCoordinator$ui_release().draw(vq1Var, u97Var);
    }

    public final void forEachChild(@yfb qy6<? super lw8, bth> qy6Var) {
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                qy6Var.invoke(content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachChildIndexed(@yfb gz6<? super Integer, ? super lw8, bth> gz6Var) {
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                gz6Var.invoke(Integer.valueOf(i), content[i]);
                i++;
            } while (i < size);
        }
    }

    public final void forEachCoordinator$ui_release(@yfb qy6<? super fw8, bth> qy6Var) {
        heb outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        heb innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            md8.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            fw8 fw8Var = (fw8) outerCoordinator$ui_release;
            qy6Var.invoke(fw8Var);
            outerCoordinator$ui_release = fw8Var.getWrapped$ui_release();
        }
    }

    public final void forEachCoordinatorIncludingInner$ui_release(@yfb qy6<? super heb, bth> qy6Var) {
        heb wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (heb outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !md8.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            qy6Var.invoke(outerCoordinator$ui_release);
        }
    }

    @Override // p000.byd
    public void forceRemeasure() {
        if (this.f59034e != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 5, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 5, null);
        }
        ku2 ku2VarM32039getLastConstraintsDWUhwKw = this.f59039h2.m32039getLastConstraintsDWUhwKw();
        if (ku2VarM32039getLastConstraintsDWUhwKw != null) {
            z9c z9cVar = this.f59016L;
            if (z9cVar != null) {
                z9cVar.mo27744measureAndLayout0kLqBqw(this, ku2VarM32039getLastConstraintsDWUhwKw.m30769unboximpl());
                return;
            }
            return;
        }
        z9c z9cVar2 = this.f59016L;
        if (z9cVar2 != null) {
            z9c.measureAndLayout$default(z9cVar2, false, 1, null);
        }
    }

    public final boolean getAlignmentLinesRequired$ui_release() {
        AbstractC12150rm alignmentLines;
        qw8 qw8Var = this.f59039h2;
        if (qw8Var.getAlignmentLinesOwner$ui_release().getAlignmentLines().getRequired$ui_release()) {
            return true;
        }
        InterfaceC12654sm lookaheadAlignmentLinesOwner$ui_release = qw8Var.getLookaheadAlignmentLinesOwner$ui_release();
        return (lookaheadAlignmentLinesOwner$ui_release == null || (alignmentLines = lookaheadAlignmentLinesOwner$ui_release.getAlignmentLines()) == null || !alignmentLines.getRequired$ui_release()) ? false : true;
    }

    public final boolean getApplyingModifierOnAttach$ui_release() {
        return this.f59045m2 != null;
    }

    public final boolean getCanMultiMeasure$ui_release() {
        return this.f59037f2;
    }

    @yfb
    public final List<rba> getChildLookaheadMeasurables$ui_release() {
        qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        md8.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.getChildDelegates$ui_release();
    }

    @yfb
    public final List<rba> getChildMeasurables$ui_release() {
        return getMeasurePassDelegate$ui_release().getChildDelegates$ui_release();
    }

    @yfb
    public final List<lw8> getChildren$ui_release() {
        return get_children$ui_release().asMutableList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, nxe] */
    @gib
    public final nxe getCollapsedSemantics$ui_release() {
        Trace.beginSection("collapseSemantics");
        try {
            if (this.f59038g2.m28910hasH91voCI$ui_release(keb.m30687constructorimpl(8)) && this.f59022X == null) {
                jvd.C8121h c8121h = new jvd.C8121h();
                c8121h.f52110a = new nxe();
                pw8.requireOwner(this).getSnapshotObserver().observeSemanticsReads$ui_release(this, new C9008j(c8121h));
                T t = c8121h.f52110a;
                this.f59022X = (nxe) t;
                return (nxe) t;
            }
            return this.f59022X;
        } finally {
            Trace.endSection();
        }
    }

    @Override // p000.xl2
    @ug5
    public int getCompositeKeyHash() {
        return this.f59030c;
    }

    @Override // p000.xl2
    @yfb
    public qn2 getCompositionLocalMap() {
        return this.f59031c2;
    }

    @Override // p000.xv8
    @yfb
    public mv8 getCoordinates() {
        return getInnerCoordinator$ui_release();
    }

    @Override // p000.xv8, p000.xl2
    @yfb
    public c64 getDensity() {
        return this.f59025Z1;
    }

    public final int getDepth$ui_release() {
        return this.f59019N;
    }

    @yfb
    public final List<lw8> getFoldedChildren$ui_release() {
        return this.f59044m.asList();
    }

    public final boolean getHasFixedInnerContentConstraints$ui_release() {
        long jM30028getLastMeasurementConstraintsmsEJaDk$ui_release = getInnerCoordinator$ui_release().m30028getLastMeasurementConstraintsmsEJaDk$ui_release();
        return ku2.m30761getHasFixedWidthimpl(jM30028getLastMeasurementConstraintsmsEJaDk$ui_release) && ku2.m30760getHasFixedHeightimpl(jM30028getLastMeasurementConstraintsmsEJaDk$ui_release);
    }

    @Override // p000.xv8
    public int getHeight() {
        return this.f59039h2.getHeight$ui_release();
    }

    @yfb
    public final heb getInnerCoordinator$ui_release() {
        return this.f59038g2.getInnerCoordinator$ui_release();
    }

    public final boolean getInnerLayerCoordinatorIsDirty$ui_release() {
        return this.f59042k2;
    }

    @Override // p000.jc8
    @gib
    @ia8
    public View getInteropView() {
        AndroidViewHolder androidViewHolder = this.f59017M;
        if (androidViewHolder != null) {
            return androidViewHolder.getInteropView();
        }
        return null;
    }

    @gib
    public final AndroidViewHolder getInteropViewFactoryHolder$ui_release() {
        return this.f59017M;
    }

    @yfb
    public final EnumC9005g getIntrinsicsUsageByParent$ui_release() {
        return this.f59033d2;
    }

    @yfb
    public final qw8 getLayoutDelegate$ui_release() {
        return this.f59039h2;
    }

    @Override // p000.xv8, p000.xl2
    @yfb
    public ov8 getLayoutDirection() {
        return this.f59027a2;
    }

    public final boolean getLayoutPending$ui_release() {
        return this.f59039h2.getLayoutPending$ui_release();
    }

    @yfb
    public final EnumC9003e getLayoutState$ui_release() {
        return this.f59039h2.getLayoutState$ui_release();
    }

    public final boolean getLookaheadLayoutPending$ui_release() {
        return this.f59039h2.getLookaheadLayoutPending$ui_release();
    }

    public final boolean getLookaheadMeasurePending$ui_release() {
        return this.f59039h2.getLookaheadMeasurePending$ui_release();
    }

    @gib
    public final qw8.C11723a getLookaheadPassDelegate$ui_release() {
        return this.f59039h2.getLookaheadPassDelegate$ui_release();
    }

    @gib
    public final lw8 getLookaheadRoot$ui_release() {
        return this.f59034e;
    }

    @yfb
    public final nw8 getMDrawScope$ui_release() {
        return pw8.requireOwner(this).getSharedDrawScope();
    }

    @yfb
    public final qw8.C11724b getMeasurePassDelegate$ui_release() {
        return this.f59039h2.getMeasurePassDelegate$ui_release();
    }

    public final boolean getMeasurePending$ui_release() {
        return this.f59039h2.getMeasurePending$ui_release();
    }

    @Override // p000.xl2
    @yfb
    public uba getMeasurePolicy() {
        return this.f59018M1;
    }

    @yfb
    public final EnumC9005g getMeasuredByParent$ui_release() {
        return getMeasurePassDelegate$ui_release().getMeasuredByParent$ui_release();
    }

    @yfb
    public final EnumC9005g getMeasuredByParentInLookahead$ui_release() {
        EnumC9005g measuredByParent$ui_release;
        qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        return (lookaheadPassDelegate$ui_release == null || (measuredByParent$ui_release = lookaheadPassDelegate$ui_release.getMeasuredByParent$ui_release()) == null) ? EnumC9005g.NotUsed : measuredByParent$ui_release;
    }

    @Override // p000.xl2
    @yfb
    public InterfaceC0701e getModifier() {
        return this.f59043l2;
    }

    @Override // p000.xv8
    @yfb
    public List<dxa> getModifierInfo() {
        return this.f59038g2.getModifierInfo();
    }

    public final boolean getNeedsOnPositionedDispatch$ui_release() {
        return this.f59048p2;
    }

    @yfb
    public final feb getNodes$ui_release() {
        return this.f59038g2;
    }

    @gib
    public final qy6<z9c, bth> getOnAttach$ui_release() {
        return this.f59046n2;
    }

    @gib
    public final qy6<z9c, bth> getOnDetach$ui_release() {
        return this.f59047o2;
    }

    @yfb
    public final heb getOuterCoordinator$ui_release() {
        return this.f59038g2.getOuterCoordinator$ui_release();
    }

    @gib
    public final z9c getOwner$ui_release() {
        return this.f59016L;
    }

    @gib
    public final lw8 getParent$ui_release() {
        lw8 lw8Var = this.f59015H;
        while (lw8Var != null && lw8Var.f59026a) {
            lw8Var = lw8Var.f59015H;
        }
        return lw8Var;
    }

    @Override // p000.xv8
    @gib
    public xv8 getParentInfo() {
        return getParent$ui_release();
    }

    public final int getPlaceOrder$ui_release() {
        return getMeasurePassDelegate$ui_release().getPlaceOrder$ui_release();
    }

    @Override // p000.xv8
    public int getSemanticsId() {
        return this.f59028b;
    }

    @gib
    public final C0756i getSubcompositionsState$ui_release() {
        return this.f59040i2;
    }

    @Override // p000.xv8, p000.xl2
    @yfb
    public u8i getViewConfiguration() {
        return this.f59029b2;
    }

    @Override // p000.xv8
    public int getWidth() {
        return this.f59039h2.getWidth$ui_release();
    }

    @yfb
    public final f7b<lw8> getZSortedChildren() {
        if (this.f59024Z) {
            this.f59023Y.clear();
            f7b<lw8> f7bVar = this.f59023Y;
            f7bVar.addAll(f7bVar.getSize(), get_children$ui_release());
            this.f59023Y.sortWith(f59012x2);
            this.f59024Z = false;
        }
        return this.f59023Y;
    }

    @yfb
    public final f7b<lw8> get_children$ui_release() {
        updateChildrenIfDirty$ui_release();
        if (this.f59036f == 0) {
            return this.f59044m.getVector();
        }
        f7b<lw8> f7bVar = this.f59013C;
        md8.checkNotNull(f7bVar);
        return f7bVar;
    }

    /* JADX INFO: renamed from: hitTest-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m30905hitTestM_7yMNQ$ui_release(long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
        getOuterCoordinator$ui_release().m30033hitTestYqVAtuI(heb.f43261t2.getPointerInputSource(), heb.m30017fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j, false, 2, null), ck7Var, z, z2);
    }

    /* JADX INFO: renamed from: hitTestSemantics-M_7yMNQ$ui_release, reason: not valid java name */
    public final void m30906hitTestSemanticsM_7yMNQ$ui_release(long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
        getOuterCoordinator$ui_release().m30033hitTestYqVAtuI(heb.f43261t2.getSemanticsSource(), heb.m30017fromParentPosition8S9VItk$default(getOuterCoordinator$ui_release(), j, false, 2, null), ck7Var, true, z2);
    }

    public final void ignoreRemeasureRequests$ui_release(@yfb ny6<bth> ny6Var) {
        this.f59020Q = true;
        ny6Var.invoke();
        this.f59020Q = false;
    }

    public final void insertAt$ui_release(int i, @yfb lw8 lw8Var) {
        if (!(lw8Var.f59015H == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot insert ");
            sb.append(lw8Var);
            sb.append(" because it already has a parent. This tree: ");
            sb.append(m16425b(this, 0, 1, null));
            sb.append(" Other tree: ");
            lw8 lw8Var2 = lw8Var.f59015H;
            sb.append(lw8Var2 != null ? m16425b(lw8Var2, 0, 1, null) : null);
            g28.throwIllegalStateException(sb.toString());
        }
        if (!(lw8Var.f59016L == null)) {
            g28.throwIllegalStateException("Cannot insert " + lw8Var + " because it already has an owner. This tree: " + m16425b(this, 0, 1, null) + " Other tree: " + m16425b(lw8Var, 0, 1, null));
        }
        lw8Var.f59015H = this;
        this.f59044m.add(i, lw8Var);
        onZSortedChildrenInvalidated$ui_release();
        if (lw8Var.f59026a) {
            this.f59036f++;
        }
        invalidateUnfoldedVirtualChildren();
        z9c z9cVar = this.f59016L;
        if (z9cVar != null) {
            lw8Var.attach$ui_release(z9cVar);
        }
        if (lw8Var.f59039h2.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            qw8 qw8Var = this.f59039h2;
            qw8Var.setChildrenAccessingCoordinatesDuringPlacement(qw8Var.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
    }

    public final void invalidateLayer$ui_release() {
        heb innerLayerCoordinator = getInnerLayerCoordinator();
        if (innerLayerCoordinator != null) {
            innerLayerCoordinator.invalidateLayer();
            return;
        }
        lw8 parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
    }

    public final void invalidateLayers$ui_release() {
        heb outerCoordinator$ui_release = getOuterCoordinator$ui_release();
        heb innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        while (outerCoordinator$ui_release != innerCoordinator$ui_release) {
            md8.checkNotNull(outerCoordinator$ui_release, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            fw8 fw8Var = (fw8) outerCoordinator$ui_release;
            y9c layer = fw8Var.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            outerCoordinator$ui_release = fw8Var.getWrapped$ui_release();
        }
        y9c layer2 = getInnerCoordinator$ui_release().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void invalidateMeasurements$ui_release() {
        if (this.f59034e != null) {
            requestLookaheadRemeasure$ui_release$default(this, false, false, false, 7, null);
        } else {
            requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        }
    }

    public final void invalidateOnPositioned$ui_release() {
        if (getLayoutPending$ui_release() || getMeasurePending$ui_release() || this.f59048p2) {
            return;
        }
        pw8.requireOwner(this).requestOnPositionedCallback(this);
    }

    public final void invalidateParentData$ui_release() {
        this.f59039h2.invalidateParentData();
    }

    public final void invalidateSemantics$ui_release() {
        this.f59022X = null;
        pw8.requireOwner(this).onSemanticsChange();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final void invalidateSubtree(boolean z) {
        lw8 parent$ui_release;
        if (z && (parent$ui_release = getParent$ui_release()) != null) {
            parent$ui_release.invalidateLayer$ui_release();
        }
        invalidateSemantics$ui_release();
        requestRemeasure$ui_release$default(this, false, false, false, 7, null);
        feb febVar = this.f59038g2;
        int iM30687constructorimpl = keb.m30687constructorimpl(2);
        if ((febVar.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
            for (InterfaceC0701e.d head$ui_release = febVar.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = head$ui_release;
                    f7b f7bVar = null;
                    while (dVarPop != 0) {
                        if (dVarPop instanceof ew8) {
                            y9c layer = w34.m32852requireCoordinator64DMado((ew8) dVarPop, keb.m30687constructorimpl(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                            int i = 0;
                            dVarPop = dVarPop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dVarPop = delegate$ui_release;
                                    } else {
                                        if (f7bVar == null) {
                                            f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                        }
                                        if (dVarPop != 0) {
                                            f7bVar.add(dVarPop);
                                            dVarPop = 0;
                                        }
                                        f7bVar.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                dVarPop = dVarPop;
                            }
                            if (i == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                    break;
                }
            }
        }
        f7b<lw8> f7bVar2 = get_children$ui_release();
        int size = f7bVar2.getSize();
        if (size > 0) {
            lw8[] content = f7bVar2.getContent();
            int i2 = 0;
            do {
                content[i2].invalidateSubtree(false);
                i2++;
            } while (i2 < size);
        }
    }

    @Override // p000.xv8
    public boolean isAttached() {
        return this.f59016L != null;
    }

    @Override // p000.xv8
    public boolean isDeactivated() {
        return this.f59049q2;
    }

    @Override // p000.xv8
    public boolean isPlaced() {
        return getMeasurePassDelegate$ui_release().isPlaced();
    }

    public final boolean isPlacedByParent() {
        return getMeasurePassDelegate$ui_release().isPlacedByParent();
    }

    @gib
    public final Boolean isPlacedInLookahead() {
        qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        if (lookaheadPassDelegate$ui_release != null) {
            return Boolean.valueOf(lookaheadPassDelegate$ui_release.isPlaced());
        }
        return null;
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    public final boolean isVirtualLookaheadRoot$ui_release() {
        return this.f59032d;
    }

    /* JADX INFO: renamed from: lookaheadRemeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m30907lookaheadRemeasure_Sx5XlM$ui_release(@gib ku2 ku2Var) {
        if (ku2Var == null || this.f59034e == null) {
            return false;
        }
        qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        md8.checkNotNull(lookaheadPassDelegate$ui_release);
        return lookaheadPassDelegate$ui_release.m32044remeasureBRTryo0(ku2Var.m30769unboximpl());
    }

    public final void lookaheadReplace$ui_release() {
        if (this.f59033d2 == EnumC9005g.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
        md8.checkNotNull(lookaheadPassDelegate$ui_release);
        lookaheadPassDelegate$ui_release.replace();
    }

    public final void markLayoutPending$ui_release() {
        this.f59039h2.markLayoutPending$ui_release();
    }

    public final void markLookaheadLayoutPending$ui_release() {
        this.f59039h2.markLookaheadLayoutPending$ui_release();
    }

    public final void markLookaheadMeasurePending$ui_release() {
        this.f59039h2.markLookaheadMeasurePending$ui_release();
    }

    public final void markMeasurePending$ui_release() {
        this.f59039h2.markMeasurePending$ui_release();
    }

    public final int maxIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicHeight(i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxIntrinsicWidth(i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicHeight(i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().maxLookaheadIntrinsicWidth(i);
    }

    public final int minIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicHeight(i);
    }

    public final int minIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minIntrinsicWidth(i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicHeight(i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getOrCreateIntrinsicsPolicy().minLookaheadIntrinsicWidth(i);
    }

    public final void move$ui_release(int i, int i2, int i3) {
        if (i == i2) {
            return;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            this.f59044m.add(i > i2 ? i2 + i4 : (i2 + i3) - 2, this.f59044m.removeAt(i > i2 ? i + i4 : i));
        }
        onZSortedChildrenInvalidated$ui_release();
        invalidateUnfoldedVirtualChildren();
        invalidateMeasurements$ui_release();
    }

    @Override // p000.pl2
    public void onDeactivate() {
        AndroidViewHolder androidViewHolder = this.f59017M;
        if (androidViewHolder != null) {
            androidViewHolder.onDeactivate();
        }
        C0756i c0756i = this.f59040i2;
        if (c0756i != null) {
            c0756i.onDeactivate();
        }
        this.f59049q2 = true;
        resetModifierState();
        if (isAttached()) {
            invalidateSemantics$ui_release();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // p000.z9c.InterfaceC16043b
    public void onLayoutComplete() {
        heb innerCoordinator$ui_release = getInnerCoordinator$ui_release();
        int iM30687constructorimpl = keb.m30687constructorimpl(128);
        boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(iM30687constructorimpl);
        InterfaceC0701e.d tail = innerCoordinator$ui_release.getTail();
        if (!zM30864getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (InterfaceC0701e.d dVarHeadNode = innerCoordinator$ui_release.headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
            if ((dVarHeadNode.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                InterfaceC0701e.d dVarPop = dVarHeadNode;
                f7b f7bVar = null;
                while (dVarPop != 0) {
                    if (dVarPop instanceof iv8) {
                        ((iv8) dVarPop).onPlaced(getInnerCoordinator$ui_release());
                    } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                        InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                        int i = 0;
                        dVarPop = dVarPop;
                        while (delegate$ui_release != null) {
                            if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                i++;
                                if (i == 1) {
                                    dVarPop = delegate$ui_release;
                                } else {
                                    if (f7bVar == null) {
                                        f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                    }
                                    if (dVarPop != 0) {
                                        f7bVar.add(dVarPop);
                                        dVarPop = 0;
                                    }
                                    f7bVar.add(delegate$ui_release);
                                }
                            }
                            delegate$ui_release = delegate$ui_release.getChild$ui_release();
                            dVarPop = dVarPop;
                        }
                        if (i == 1) {
                        }
                    }
                    dVarPop = w34.pop(f7bVar);
                }
            }
            if (dVarHeadNode == tail) {
                return;
            }
        }
    }

    @Override // p000.pl2
    public void onRelease() {
        AndroidViewHolder androidViewHolder = this.f59017M;
        if (androidViewHolder != null) {
            androidViewHolder.onRelease();
        }
        C0756i c0756i = this.f59040i2;
        if (c0756i != null) {
            c0756i.onRelease();
        }
        heb wrapped$ui_release = getInnerCoordinator$ui_release().getWrapped$ui_release();
        for (heb outerCoordinator$ui_release = getOuterCoordinator$ui_release(); !md8.areEqual(outerCoordinator$ui_release, wrapped$ui_release) && outerCoordinator$ui_release != null; outerCoordinator$ui_release = outerCoordinator$ui_release.getWrapped$ui_release()) {
            outerCoordinator$ui_release.onRelease();
        }
    }

    @Override // p000.pl2
    public void onReuse() {
        if (!isAttached()) {
            g28.throwIllegalArgumentException("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.f59017M;
        if (androidViewHolder != null) {
            androidViewHolder.onReuse();
        }
        C0756i c0756i = this.f59040i2;
        if (c0756i != null) {
            c0756i.onReuse();
        }
        if (isDeactivated()) {
            this.f59049q2 = false;
            invalidateSemantics$ui_release();
        } else {
            resetModifierState();
        }
        setSemanticsId(qxe.generateSemanticsId());
        this.f59038g2.markAsAttached();
        this.f59038g2.runAttachLifecycle();
        rescheduleRemeasureOrRelayout$ui_release(this);
    }

    public final void onZSortedChildrenInvalidated$ui_release() {
        if (!this.f59026a) {
            this.f59024Z = true;
            return;
        }
        lw8 parent$ui_release = getParent$ui_release();
        if (parent$ui_release != null) {
            parent$ui_release.onZSortedChildrenInvalidated$ui_release();
        }
    }

    public final void place$ui_release(int i, int i2) {
        AbstractC0767t.a placementScope;
        heb innerCoordinator$ui_release;
        if (this.f59033d2 == EnumC9005g.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        lw8 parent$ui_release = getParent$ui_release();
        if (parent$ui_release == null || (innerCoordinator$ui_release = parent$ui_release.getInnerCoordinator$ui_release()) == null || (placementScope = innerCoordinator$ui_release.getPlacementScope()) == null) {
            placementScope = pw8.requireOwner(this).getPlacementScope();
        }
        AbstractC0767t.a.placeRelative$default(placementScope, getMeasurePassDelegate$ui_release(), i, i2, 0.0f, 4, null);
    }

    /* JADX INFO: renamed from: remeasure-_Sx5XlM$ui_release, reason: not valid java name */
    public final boolean m30908remeasure_Sx5XlM$ui_release(@gib ku2 ku2Var) {
        if (ku2Var == null) {
            return false;
        }
        if (this.f59033d2 == EnumC9005g.NotUsed) {
            clearSubtreeIntrinsicsUsage$ui_release();
        }
        return getMeasurePassDelegate$ui_release().m32048remeasureBRTryo0(ku2Var.m30769unboximpl());
    }

    public final void removeAll$ui_release() {
        int size = this.f59044m.getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this.f59044m.clear();
                return;
            }
            onChildRemoved(this.f59044m.get(size));
        }
    }

    public final void removeAt$ui_release(int i, int i2) {
        if (!(i2 >= 0)) {
            g28.throwIllegalArgumentException("count (" + i2 + ") must be greater than 0");
        }
        int i3 = (i2 + i) - 1;
        if (i > i3) {
            return;
        }
        while (true) {
            onChildRemoved(this.f59044m.get(i3));
            this.f59044m.removeAt(i3);
            if (i3 == i) {
                return;
            } else {
                i3--;
            }
        }
    }

    public final void replace$ui_release() {
        if (this.f59033d2 == EnumC9005g.NotUsed) {
            clearSubtreePlacementIntrinsicsUsage();
        }
        getMeasurePassDelegate$ui_release().replace();
    }

    public final void requestLookaheadRelayout$ui_release(boolean z) {
        z9c z9cVar;
        if (this.f59026a || (z9cVar = this.f59016L) == null) {
            return;
        }
        z9cVar.onRequestRelayout(this, true, z);
    }

    public final void requestLookaheadRemeasure$ui_release(boolean z, boolean z2, boolean z3) {
        if (!(this.f59034e != null)) {
            g28.throwIllegalStateException("Lookahead measure cannot be requested on a node that is not a part of theLookaheadScope");
        }
        z9c z9cVar = this.f59016L;
        if (z9cVar == null || this.f59020Q || this.f59026a) {
            return;
        }
        z9cVar.onRequestMeasure(this, true, z, z2);
        if (z3) {
            qw8.C11723a lookaheadPassDelegate$ui_release = getLookaheadPassDelegate$ui_release();
            md8.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.invalidateIntrinsicsParent(z);
        }
    }

    public final void requestRelayout$ui_release(boolean z) {
        z9c z9cVar;
        if (this.f59026a || (z9cVar = this.f59016L) == null) {
            return;
        }
        z9c.onRequestRelayout$default(z9cVar, this, false, z, 2, null);
    }

    public final void requestRemeasure$ui_release(boolean z, boolean z2, boolean z3) {
        z9c z9cVar;
        if (this.f59020Q || this.f59026a || (z9cVar = this.f59016L) == null) {
            return;
        }
        z9c.onRequestMeasure$default(z9cVar, this, false, z, z2, 2, null);
        if (z3) {
            getMeasurePassDelegate$ui_release().invalidateIntrinsicsParent(z);
        }
    }

    public final void rescheduleRemeasureOrRelayout$ui_release(@yfb lw8 lw8Var) {
        if (C9006h.f59063a[lw8Var.getLayoutState$ui_release().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + lw8Var.getLayoutState$ui_release());
        }
        if (lw8Var.getLookaheadMeasurePending$ui_release()) {
            requestLookaheadRemeasure$ui_release$default(lw8Var, true, false, false, 6, null);
            return;
        }
        if (lw8Var.getLookaheadLayoutPending$ui_release()) {
            lw8Var.requestLookaheadRelayout$ui_release(true);
        }
        if (lw8Var.getMeasurePending$ui_release()) {
            requestRemeasure$ui_release$default(lw8Var, true, false, false, 6, null);
        } else if (lw8Var.getLayoutPending$ui_release()) {
            lw8Var.requestRelayout$ui_release(true);
        }
    }

    public final void resetSubtreeIntrinsicsUsage$ui_release() {
        f7b<lw8> f7bVar = get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                EnumC9005g enumC9005g = lw8Var.f59035e2;
                lw8Var.f59033d2 = enumC9005g;
                if (enumC9005g != EnumC9005g.NotUsed) {
                    lw8Var.resetSubtreeIntrinsicsUsage$ui_release();
                }
                i++;
            } while (i < size);
        }
    }

    public final void setCanMultiMeasure$ui_release(boolean z) {
        this.f59037f2 = z;
    }

    @Override // p000.xl2
    @ug5
    public void setCompositeKeyHash(int i) {
        this.f59030c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // p000.xl2
    public void setCompositionLocalMap(@yfb qn2 qn2Var) {
        this.f59031c2 = qn2Var;
        setDensity((c64) qn2Var.get(sn2.getLocalDensity()));
        setLayoutDirection((ov8) qn2Var.get(sn2.getLocalLayoutDirection()));
        setViewConfiguration((u8i) qn2Var.get(sn2.getLocalViewConfiguration()));
        feb febVar = this.f59038g2;
        int iM30687constructorimpl = keb.m30687constructorimpl(32768);
        if ((febVar.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
            for (InterfaceC0701e.d head$ui_release = febVar.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = head$ui_release;
                    f7b f7bVar = null;
                    while (dVarPop != 0) {
                        if (dVarPop instanceof mn2) {
                            InterfaceC0701e.d node = ((mn2) dVarPop).getNode();
                            if (node.isAttached()) {
                                leb.autoInvalidateUpdatedNode(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui_release(true);
                            }
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                            int i = 0;
                            dVarPop = dVarPop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dVarPop = delegate$ui_release;
                                    } else {
                                        if (f7bVar == null) {
                                            f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                        }
                                        if (dVarPop != 0) {
                                            f7bVar.add(dVarPop);
                                            dVarPop = 0;
                                        }
                                        f7bVar.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                dVarPop = dVarPop;
                            }
                            if (i == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    @Override // p000.xl2
    public void setDensity(@yfb c64 c64Var) {
        if (md8.areEqual(this.f59025Z1, c64Var)) {
            return;
        }
        this.f59025Z1 = c64Var;
        onDensityOrLayoutDirectionChanged();
        for (InterfaceC0701e.d head$ui_release = this.f59038g2.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
            if ((keb.m30687constructorimpl(16) & head$ui_release.getKindSet$ui_release()) != 0) {
                ((p2d) head$ui_release).onDensityChange();
            } else if (head$ui_release instanceof rl1) {
                ((rl1) head$ui_release).invalidateDrawCache();
            }
        }
    }

    public final void setDepth$ui_release(int i) {
        this.f59019N = i;
    }

    public final void setInnerLayerCoordinatorIsDirty$ui_release(boolean z) {
        this.f59042k2 = z;
    }

    public final void setInteropViewFactoryHolder$ui_release(@gib AndroidViewHolder androidViewHolder) {
        this.f59017M = androidViewHolder;
    }

    public final void setIntrinsicsUsageByParent$ui_release(@yfb EnumC9005g enumC9005g) {
        this.f59033d2 = enumC9005g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // p000.xl2
    public void setLayoutDirection(@yfb ov8 ov8Var) {
        if (this.f59027a2 != ov8Var) {
            this.f59027a2 = ov8Var;
            onDensityOrLayoutDirectionChanged();
            feb febVar = this.f59038g2;
            int iM30687constructorimpl = keb.m30687constructorimpl(4);
            if ((febVar.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
                for (InterfaceC0701e.d head$ui_release = febVar.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                    if ((head$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = head$ui_release;
                        f7b f7bVar = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof fp4) {
                                fp4 fp4Var = (fp4) dVarPop;
                                if (fp4Var instanceof rl1) {
                                    ((rl1) fp4Var).invalidateDrawCache();
                                }
                            } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                                int i = 0;
                                dVarPop = dVarPop;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        if (i == 1) {
                                            dVarPop = delegate$ui_release;
                                        } else {
                                            if (f7bVar == null) {
                                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (dVarPop != 0) {
                                                f7bVar.add(dVarPop);
                                                dVarPop = 0;
                                            }
                                            f7bVar.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    dVarPop = dVarPop;
                                }
                                if (i == 1) {
                                }
                            }
                            dVarPop = w34.pop(f7bVar);
                        }
                    }
                    if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // p000.xl2
    public void setMeasurePolicy(@yfb uba ubaVar) {
        if (md8.areEqual(this.f59018M1, ubaVar)) {
            return;
        }
        this.f59018M1 = ubaVar;
        qd8 qd8Var = this.f59021V1;
        if (qd8Var != null) {
            qd8Var.updateFrom(getMeasurePolicy());
        }
        invalidateMeasurements$ui_release();
    }

    @Override // p000.xl2
    public void setModifier(@yfb InterfaceC0701e interfaceC0701e) {
        if (!(!this.f59026a || getModifier() == InterfaceC0701e.f5158d1)) {
            g28.throwIllegalArgumentException("Modifiers are not supported on virtual LayoutNodes");
        }
        if (isDeactivated()) {
            g28.throwIllegalArgumentException("modifier is updated when deactivated");
        }
        if (isAttached()) {
            applyModifier(interfaceC0701e);
        } else {
            this.f59045m2 = interfaceC0701e;
        }
    }

    public final void setNeedsOnPositionedDispatch$ui_release(boolean z) {
        this.f59048p2 = z;
    }

    public final void setOnAttach$ui_release(@gib qy6<? super z9c, bth> qy6Var) {
        this.f59046n2 = qy6Var;
    }

    public final void setOnDetach$ui_release(@gib qy6<? super z9c, bth> qy6Var) {
        this.f59047o2 = qy6Var;
    }

    public void setSemanticsId(int i) {
        this.f59028b = i;
    }

    public final void setSubcompositionsState$ui_release(@gib C0756i c0756i) {
        this.f59040i2 = c0756i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // p000.xl2
    public void setViewConfiguration(@yfb u8i u8iVar) {
        if (md8.areEqual(this.f59029b2, u8iVar)) {
            return;
        }
        this.f59029b2 = u8iVar;
        feb febVar = this.f59038g2;
        int iM30687constructorimpl = keb.m30687constructorimpl(16);
        if ((febVar.getAggregateChildKindSet() & iM30687constructorimpl) != 0) {
            for (InterfaceC0701e.d head$ui_release = febVar.getHead$ui_release(); head$ui_release != null; head$ui_release = head$ui_release.getChild$ui_release()) {
                if ((head$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = head$ui_release;
                    f7b f7bVar = null;
                    while (dVarPop != 0) {
                        if (dVarPop instanceof p2d) {
                            ((p2d) dVarPop).onViewConfigurationChange();
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                            int i = 0;
                            dVarPop = dVarPop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i++;
                                    if (i == 1) {
                                        dVarPop = delegate$ui_release;
                                    } else {
                                        if (f7bVar == null) {
                                            f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                        }
                                        if (dVarPop != 0) {
                                            f7bVar.add(dVarPop);
                                            dVarPop = 0;
                                        }
                                        f7bVar.add(delegate$ui_release);
                                    }
                                }
                                delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                dVarPop = dVarPop;
                            }
                            if (i == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
                if ((head$ui_release.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) == 0) {
                    return;
                }
            }
        }
    }

    public final void setVirtualLookaheadRoot$ui_release(boolean z) {
        this.f59032d = z;
    }

    @yfb
    public String toString() {
        return en8.simpleIdentityToString(this, null) + " children: " + getChildren$ui_release().size() + " measurePolicy: " + getMeasurePolicy();
    }

    public final void updateChildrenIfDirty$ui_release() {
        if (this.f59036f > 0) {
            recreateUnfoldedChildrenIfDirty();
        }
    }

    public lw8(boolean z, int i) {
        this.f59026a = z;
        this.f59028b = i;
        this.f59044m = new h7b<>(new f7b(new lw8[16], 0), new C9007i());
        this.f59023Y = new f7b<>(new lw8[16], 0);
        this.f59024Z = true;
        this.f59018M1 = f59008t2;
        this.f59025Z1 = pw8.f72267b;
        this.f59027a2 = ov8.Ltr;
        this.f59029b2 = f59011w2;
        this.f59031c2 = qn2.f74992q.getEmpty();
        EnumC9005g enumC9005g = EnumC9005g.NotUsed;
        this.f59033d2 = enumC9005g;
        this.f59035e2 = enumC9005g;
        this.f59038g2 = new feb(this);
        this.f59039h2 = new qw8(this);
        this.f59042k2 = true;
        this.f59043l2 = InterfaceC0701e.f5158d1;
    }

    public /* synthetic */ lw8(boolean z, int i, int i2, jt3 jt3Var) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? qxe.generateSemanticsId() : i);
    }
}
