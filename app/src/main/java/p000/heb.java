package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.C0737d;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import p000.jvd;
import p000.ssf;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 2 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 8 NodeChain.kt\nandroidx/compose/ui/node/NodeChain\n+ 9 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 11 Size.kt\nandroidx/compose/ui/geometry/Size\n*L\n1#1,1484:1\n104#1,5:1485\n109#1,4:1533\n104#1,9:1537\n115#1:1548\n104#1,13:1549\n117#1:1605\n109#1,10:1606\n115#1:1691\n104#1,13:1692\n117#1:1748\n109#1,10:1749\n115#1:1769\n104#1,13:1770\n117#1:1826\n109#1,10:1827\n432#2,6:1490\n442#2,2:1497\n444#2,8:1502\n452#2,9:1513\n461#2,8:1525\n432#2,6:1562\n442#2,2:1569\n444#2,8:1574\n452#2,9:1585\n461#2,8:1597\n432#2,6:1623\n442#2,2:1630\n444#2,8:1635\n452#2,9:1646\n461#2,8:1658\n432#2,6:1705\n442#2,2:1712\n444#2,8:1717\n452#2,9:1728\n461#2,8:1740\n432#2,6:1783\n442#2,2:1790\n444#2,8:1795\n452#2,9:1806\n461#2,8:1818\n220#2:1904\n221#2,8:1912\n233#2:1922\n204#2:1923\n205#2,6:1931\n234#2:1937\n432#2,6:1938\n442#2,2:1945\n444#2,8:1950\n452#2,9:1961\n461#2,8:1973\n235#2:1981\n212#2,3:1982\n264#3:1496\n264#3:1568\n264#3:1621\n264#3:1629\n264#3:1711\n264#3:1789\n264#3:1944\n245#4,3:1499\n248#4,3:1522\n245#4,3:1571\n248#4,3:1594\n245#4,3:1632\n248#4,3:1655\n245#4,3:1714\n248#4,3:1737\n245#4,3:1792\n248#4,3:1815\n245#4,3:1947\n248#4,3:1970\n1208#5:1510\n1187#5,2:1511\n1208#5:1582\n1187#5,2:1583\n1208#5:1643\n1187#5,2:1644\n1208#5:1725\n1187#5,2:1726\n1208#5:1803\n1187#5,2:1804\n1208#5:1958\n1187#5,2:1959\n1#6:1546\n78#7:1547\n86#7:1616\n86#7:1620\n86#7:1622\n88#7:1683\n88#7:1690\n78#7:1767\n88#7:1768\n76#7:1860\n76#7:1903\n82#7:1920\n82#7:1921\n751#8,3:1617\n754#8,3:1666\n42#9,7:1669\n42#9,7:1676\n96#9,7:1760\n96#9,7:1837\n66#9,9:1844\n42#9,7:1853\n42#9,7:1861\n42#9,7:1868\n42#9,7:1875\n42#9,7:1882\n42#9,7:1889\n42#9,7:1896\n42#9,7:1905\n42#9,7:1924\n602#10,6:1684\n609#10:1759\n66#11,5:1985\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n115#1:1485,5\n115#1:1533,4\n125#1:1537,9\n234#1:1548\n234#1:1549,13\n234#1:1605\n234#1:1606,10\n313#1:1691\n313#1:1692,13\n313#1:1748\n313#1:1749,10\n459#1:1769\n459#1:1770,13\n459#1:1826\n459#1:1827,10\n116#1:1490,6\n116#1:1497,2\n116#1:1502,8\n116#1:1513,9\n116#1:1525,8\n234#1:1562,6\n234#1:1569,2\n234#1:1574,8\n234#1:1585,9\n234#1:1597,8\n258#1:1623,6\n258#1:1630,2\n258#1:1635,8\n258#1:1646,9\n258#1:1658,8\n313#1:1705,6\n313#1:1712,2\n313#1:1717,8\n313#1:1728,9\n313#1:1740,8\n459#1:1783,6\n459#1:1790,2\n459#1:1795,8\n459#1:1806,9\n459#1:1818,8\n1192#1:1904\n1192#1:1912,8\n1230#1:1922\n1230#1:1923\n1230#1:1931,6\n1230#1:1937\n1230#1:1938,6\n1230#1:1945,2\n1230#1:1950,8\n1230#1:1961,9\n1230#1:1973,8\n1230#1:1981\n1230#1:1982,3\n116#1:1496\n234#1:1568\n257#1:1621\n258#1:1629\n313#1:1711\n459#1:1789\n1230#1:1944\n116#1:1499,3\n116#1:1522,3\n234#1:1571,3\n234#1:1594,3\n258#1:1632,3\n258#1:1655,3\n313#1:1714,3\n313#1:1737,3\n459#1:1792,3\n459#1:1815,3\n1230#1:1947,3\n1230#1:1970,3\n116#1:1510\n116#1:1511,2\n234#1:1582\n234#1:1583,2\n258#1:1643\n258#1:1644,2\n313#1:1725\n313#1:1726,2\n459#1:1803\n459#1:1804,2\n1230#1:1958\n1230#1:1959,2\n234#1:1547\n250#1:1616\n257#1:1620\n258#1:1622\n311#1:1683\n313#1:1690\n445#1:1767\n459#1:1768\n746#1:1860\n1192#1:1903\n1224#1:1920\n1230#1:1921\n256#1:1617,3\n256#1:1666,3\n275#1:1669,7\n282#1:1676,7\n355#1:1760,7\n484#1:1837,7\n531#1:1844,9\n552#1:1853,7\n816#1:1861,7\n824#1:1868,7\n831#1:1875,7\n933#1:1882,7\n934#1:1889,7\n992#1:1896,7\n1192#1:1905,7\n1230#1:1924,7\n312#1:1684,6\n312#1:1759\n1274#1:1985,5\n*E\n"})
@e0g(parameters = 1)
public abstract class heb extends km9 implements rba, mv8, aac {

    /* JADX INFO: renamed from: u2 */
    public static final int f43262u2 = 0;

    /* JADX INFO: renamed from: v2 */
    @yfb
    public static final String f43263v2 = "LayoutCoordinate operations are only valid when isAttached is true";

    /* JADX INFO: renamed from: w2 */
    @yfb
    public static final String f43264w2 = "Asking for measurement result of unmeasured layout modifier";

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final lw8 f43268M1;

    /* JADX INFO: renamed from: V1 */
    public boolean f43269V1;

    /* JADX INFO: renamed from: Z1 */
    public boolean f43270Z1;

    /* JADX INFO: renamed from: a2 */
    @gib
    public heb f43271a2;

    /* JADX INFO: renamed from: b2 */
    @gib
    public heb f43272b2;

    /* JADX INFO: renamed from: c2 */
    public boolean f43273c2;

    /* JADX INFO: renamed from: d2 */
    public boolean f43274d2;

    /* JADX INFO: renamed from: e2 */
    @gib
    public qy6<? super InterfaceC0736c, bth> f43275e2;

    /* JADX INFO: renamed from: i2 */
    @gib
    public vba f43279i2;

    /* JADX INFO: renamed from: j2 */
    @gib
    public Map<AbstractC9938nm, Integer> f43280j2;

    /* JADX INFO: renamed from: l2 */
    public float f43282l2;

    /* JADX INFO: renamed from: m2 */
    @gib
    public q6b f43283m2;

    /* JADX INFO: renamed from: n2 */
    @gib
    public zu8 f43284n2;

    /* JADX INFO: renamed from: q2 */
    public boolean f43287q2;

    /* JADX INFO: renamed from: r2 */
    @gib
    public y9c f43288r2;

    /* JADX INFO: renamed from: s2 */
    @gib
    public u97 f43289s2;

    /* JADX INFO: renamed from: t2 */
    @yfb
    public static final C6823e f43261t2 = new C6823e(null);

    /* JADX INFO: renamed from: x2 */
    @yfb
    public static final qy6<heb, bth> f43265x2 = C6822d.f43291a;

    /* JADX INFO: renamed from: y2 */
    @yfb
    public static final qy6<heb, bth> f43266y2 = C6821c.f43290a;

    /* JADX INFO: renamed from: z2 */
    @yfb
    public static final C0737d f43267z2 = new C0737d();

    /* JADX INFO: renamed from: A2 */
    @yfb
    public static final zu8 f43257A2 = new zu8();

    /* JADX INFO: renamed from: B2 */
    @yfb
    public static final float[] f43258B2 = x3a.m33183constructorimpl$default(null, 1, null);

    /* JADX INFO: renamed from: C2 */
    @yfb
    public static final InterfaceC6824f f43259C2 = new C6819a();

    /* JADX INFO: renamed from: D2 */
    @yfb
    public static final InterfaceC6824f f43260D2 = new C6820b();

    /* JADX INFO: renamed from: f2 */
    @yfb
    public c64 f43276f2 = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: g2 */
    @yfb
    public ov8 f43277g2 = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: h2 */
    public float f43278h2 = 0.8f;

    /* JADX INFO: renamed from: k2 */
    public long f43281k2 = a78.f545b.m27211getZeronOccac();

    /* JADX INFO: renamed from: o2 */
    @yfb
    public final gz6<vq1, u97, bth> f43285o2 = new C6825g();

    /* JADX INFO: renamed from: p2 */
    @yfb
    public final ny6<bth> f43286p2 = new C6828j();

    /* JADX INFO: renamed from: heb$a */
    @dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 6 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,1484:1\n82#2:1485\n82#2:1486\n432#3,6:1487\n442#3,2:1494\n444#3,8:1499\n452#3,9:1510\n461#3,8:1522\n264#4:1493\n245#5,3:1496\n248#5,3:1519\n1208#6:1507\n1187#6,2:1508\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$PointerInputSource$1\n*L\n1367#1:1485\n1370#1:1486\n1370#1:1487,6\n1370#1:1494,2\n1370#1:1499,8\n1370#1:1510,9\n1370#1:1522,8\n1370#1:1493\n1370#1:1496,3\n1370#1:1519,3\n1370#1:1507\n1370#1:1508,2\n*E\n"})
    public static final class C6819a implements InterfaceC6824f {
        @Override // p000.heb.InterfaceC6824f
        /* JADX INFO: renamed from: childHitTest-YqVAtuI, reason: not valid java name */
        public void mo30048childHitTestYqVAtuI(@yfb lw8 lw8Var, long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
            lw8Var.m30905hitTestM_7yMNQ$ui_release(j, ck7Var, z, z2);
        }

        @Override // p000.heb.InterfaceC6824f
        /* JADX INFO: renamed from: entityType-OLwlOKw, reason: not valid java name */
        public int mo30049entityTypeOLwlOKw() {
            return keb.m30687constructorimpl(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        @Override // p000.heb.InterfaceC6824f
        public boolean interceptOutOfBoundsChildEvents(@yfb InterfaceC0701e.d dVar) {
            int iM30687constructorimpl = keb.m30687constructorimpl(16);
            f7b f7bVar = null;
            while (dVar != 0) {
                if (dVar instanceof p2d) {
                    if (((p2d) dVar).interceptOutOfBoundsChildEvents()) {
                        return true;
                    }
                } else if ((dVar.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVar instanceof d44)) {
                    InterfaceC0701e.d delegate$ui_release = ((d44) dVar).getDelegate$ui_release();
                    int i = 0;
                    dVar = dVar;
                    while (delegate$ui_release != null) {
                        if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                            i++;
                            if (i == 1) {
                                dVar = delegate$ui_release;
                            } else {
                                if (f7bVar == null) {
                                    f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                }
                                if (dVar != 0) {
                                    f7bVar.add(dVar);
                                    dVar = 0;
                                }
                                f7bVar.add(delegate$ui_release);
                            }
                        }
                        delegate$ui_release = delegate$ui_release.getChild$ui_release();
                        dVar = dVar;
                    }
                    if (i == 1) {
                    }
                }
                dVar = w34.pop(f7bVar);
            }
            return false;
        }

        @Override // p000.heb.InterfaceC6824f
        public boolean shouldHitTestChildren(@yfb lw8 lw8Var) {
            return true;
        }
    }

    /* JADX INFO: renamed from: heb$b */
    @dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1484:1\n80#2:1485\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$Companion$SemanticsSource$1\n*L\n1392#1:1485\n*E\n"})
    public static final class C6820b implements InterfaceC6824f {
        @Override // p000.heb.InterfaceC6824f
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        public void mo30048childHitTestYqVAtuI(@yfb lw8 lw8Var, long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
            lw8Var.m30906hitTestSemanticsM_7yMNQ$ui_release(j, ck7Var, z, z2);
        }

        @Override // p000.heb.InterfaceC6824f
        /* JADX INFO: renamed from: entityType-OLwlOKw */
        public int mo30049entityTypeOLwlOKw() {
            return keb.m30687constructorimpl(8);
        }

        @Override // p000.heb.InterfaceC6824f
        public boolean interceptOutOfBoundsChildEvents(@yfb InterfaceC0701e.d dVar) {
            return false;
        }

        @Override // p000.heb.InterfaceC6824f
        public boolean shouldHitTestChildren(@yfb lw8 lw8Var) {
            nxe collapsedSemantics$ui_release = lw8Var.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isClearingSemantics()) {
                z = true;
            }
            return !z;
        }
    }

    /* JADX INFO: renamed from: heb$c */
    public static final class C6821c extends tt8 implements qy6<heb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6821c f43290a = new C6821c();

        public C6821c() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(heb hebVar) {
            invoke2(hebVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb heb hebVar) {
            y9c layer = hebVar.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    }

    /* JADX INFO: renamed from: heb$d */
    public static final class C6822d extends tt8 implements qy6<heb, bth> {

        /* JADX INFO: renamed from: a */
        public static final C6822d f43291a = new C6822d();

        public C6822d() {
            super(1);
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(heb hebVar) {
            invoke2(hebVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb heb hebVar) {
            if (hebVar.isValidOwnerScope()) {
                zu8 zu8Var = hebVar.f43284n2;
                if (zu8Var == null) {
                    heb.m12335r(hebVar, false, 1, null);
                    return;
                }
                heb.f43257A2.copyFrom(zu8Var);
                heb.m12335r(hebVar, false, 1, null);
                if (heb.f43257A2.hasSameValuesAs(zu8Var)) {
                    return;
                }
                lw8 layoutNode = hebVar.getLayoutNode();
                qw8 layoutDelegate$ui_release = layoutNode.getLayoutDelegate$ui_release();
                if (layoutDelegate$ui_release.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
                    if (layoutDelegate$ui_release.getCoordinatesAccessedDuringModifierPlacement() || layoutDelegate$ui_release.getCoordinatesAccessedDuringPlacement()) {
                        lw8.requestRelayout$ui_release$default(layoutNode, false, 1, null);
                    }
                    layoutDelegate$ui_release.getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
                }
                z9c owner$ui_release = layoutNode.getOwner$ui_release();
                if (owner$ui_release != null) {
                    owner$ui_release.requestOnPositionedCallback(layoutNode);
                }
            }
        }
    }

    /* JADX INFO: renamed from: heb$e */
    public static final class C6823e {
        public /* synthetic */ C6823e(jt3 jt3Var) {
            this();
        }

        @yfb
        public final InterfaceC6824f getPointerInputSource() {
            return heb.f43259C2;
        }

        @yfb
        public final InterfaceC6824f getSemanticsSource() {
            return heb.f43260D2;
        }

        private C6823e() {
        }
    }

    /* JADX INFO: renamed from: heb$f */
    public interface InterfaceC6824f {
        /* JADX INFO: renamed from: childHitTest-YqVAtuI */
        void mo30048childHitTestYqVAtuI(@yfb lw8 lw8Var, long j, @yfb ck7 ck7Var, boolean z, boolean z2);

        /* JADX INFO: renamed from: entityType-OLwlOKw */
        int mo30049entityTypeOLwlOKw();

        boolean interceptOutOfBoundsChildEvents(@yfb InterfaceC0701e.d dVar);

        boolean shouldHitTestChildren(@yfb lw8 lw8Var);
    }

    /* JADX INFO: renamed from: heb$g */
    public static final class C6825g extends tt8 implements gz6<vq1, u97, bth> {

        /* JADX INFO: renamed from: heb$g$a */
        public static final class a extends tt8 implements ny6<bth> {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ heb f43293a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ vq1 f43294b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ u97 f43295c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(heb hebVar, vq1 vq1Var, u97 u97Var) {
                super(0);
                this.f43293a = hebVar;
                this.f43294b = vq1Var;
                this.f43295c = u97Var;
            }

            @Override // p000.ny6
            public /* bridge */ /* synthetic */ bth invoke() {
                invoke2();
                return bth.f14751a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                this.f43293a.drawContainedDrawModifiers(this.f43294b, this.f43295c);
            }
        }

        public C6825g() {
            super(2);
        }

        @Override // p000.gz6
        public /* bridge */ /* synthetic */ bth invoke(vq1 vq1Var, u97 u97Var) {
            invoke2(vq1Var, u97Var);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb vq1 vq1Var, @gib u97 u97Var) {
            if (!heb.this.getLayoutNode().isPlaced()) {
                heb.this.f43287q2 = true;
            } else {
                heb.this.getSnapshotObserver().observeReads$ui_release(heb.this, heb.f43266y2, new a(heb.this, vq1Var, u97Var));
                heb.this.f43287q2 = false;
            }
        }
    }

    /* JADX INFO: renamed from: heb$h */
    @dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1484:1\n76#2:1485\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hit$1\n*L\n675#1:1485\n*E\n"})
    public static final class C6826h extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e.d f43297b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC6824f f43298c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f43299d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ck7 f43300e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f43301f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f43302m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6826h(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2) {
            super(0);
            this.f43297b = dVar;
            this.f43298c = interfaceC6824f;
            this.f43299d = j;
            this.f43300e = ck7Var;
            this.f43301f = z;
            this.f43302m = z2;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            heb.this.m30019hit1hIXUjU(ieb.m30212nextUntilhw7D004(this.f43297b, this.f43298c.mo30049entityTypeOLwlOKw(), keb.m30687constructorimpl(2)), this.f43298c, this.f43299d, this.f43300e, this.f43301f, this.f43302m);
        }
    }

    /* JADX INFO: renamed from: heb$i */
    @dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1484:1\n76#2:1485\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$hitNear$1\n*L\n702#1:1485\n*E\n"})
    public static final class C6827i extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ float f43303C;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e.d f43305b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC6824f f43306c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f43307d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ck7 f43308e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f43309f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f43310m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6827i(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2, float f) {
            super(0);
            this.f43305b = dVar;
            this.f43306c = interfaceC6824f;
            this.f43307d = j;
            this.f43308e = ck7Var;
            this.f43309f = z;
            this.f43310m = z2;
            this.f43303C = f;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            heb.this.m30020hitNearJHbHoSQ(ieb.m30212nextUntilhw7D004(this.f43305b, this.f43306c.mo30049entityTypeOLwlOKw(), keb.m30687constructorimpl(2)), this.f43306c, this.f43307d, this.f43308e, this.f43309f, this.f43310m, this.f43303C);
        }
    }

    /* JADX INFO: renamed from: heb$j */
    public static final class C6828j extends tt8 implements ny6<bth> {
        public C6828j() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            heb wrappedBy$ui_release = heb.this.getWrappedBy$ui_release();
            if (wrappedBy$ui_release != null) {
                wrappedBy$ui_release.invalidateLayer();
            }
        }
    }

    /* JADX INFO: renamed from: heb$k */
    @dwf({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,1484:1\n76#2:1485\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator$speculativeHit$1\n*L\n736#1:1485\n*E\n"})
    public static final class C6829k extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ float f43312C;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC0701e.d f43314b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC6824f f43315c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ long f43316d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ck7 f43317e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ boolean f43318f;

        /* JADX INFO: renamed from: m */
        public final /* synthetic */ boolean f43319m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C6829k(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2, float f) {
            super(0);
            this.f43314b = dVar;
            this.f43315c = interfaceC6824f;
            this.f43316d = j;
            this.f43317e = ck7Var;
            this.f43318f = z;
            this.f43319m = z2;
            this.f43312C = f;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            heb.this.m30023speculativeHitJHbHoSQ(ieb.m30212nextUntilhw7D004(this.f43314b, this.f43315c.mo30049entityTypeOLwlOKw(), keb.m30687constructorimpl(2)), this.f43315c, this.f43316d, this.f43317e, this.f43318f, this.f43319m, this.f43312C);
        }
    }

    /* JADX INFO: renamed from: heb$l */
    public static final class C6830l extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ qy6<InterfaceC0736c, bth> f43320a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C6830l(qy6<? super InterfaceC0736c, bth> qy6Var) {
            super(0);
            this.f43320a = qy6Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f43320a.invoke(heb.f43267z2);
            heb.f43267z2.updateOutline$ui_release();
        }
    }

    public heb(@yfb lw8 lw8Var) {
        this.f43268M1 = lw8Var;
    }

    private final void ancestorToLocal(heb hebVar, q6b q6bVar, boolean z) {
        if (hebVar == this) {
            return;
        }
        heb hebVar2 = this.f43272b2;
        if (hebVar2 != null) {
            hebVar2.ancestorToLocal(hebVar, q6bVar, z);
        }
        fromParentRect(q6bVar, z);
    }

    /* JADX INFO: renamed from: ancestorToLocal-S_NoaFU, reason: not valid java name */
    private final long m30016ancestorToLocalS_NoaFU(heb hebVar, long j, boolean z) {
        if (hebVar == this) {
            return j;
        }
        heb hebVar2 = this.f43272b2;
        return (hebVar2 == null || md8.areEqual(hebVar, hebVar2)) ? m30027fromParentPosition8S9VItk(j, z) : m30027fromParentPosition8S9VItk(hebVar2.m30016ancestorToLocalS_NoaFU(hebVar, j, z), z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void drawContainedDrawModifiers(vq1 vq1Var, u97 u97Var) {
        InterfaceC0701e.d dVarM30032headH91voCI = m30032headH91voCI(keb.m30687constructorimpl(4));
        if (dVarM30032headH91voCI == null) {
            performDraw(vq1Var, u97Var);
        } else {
            getLayoutNode().getMDrawScope$ui_release().m31266draweZhPAX0$ui_release(vq1Var, s78.m32288toSizeozmzZPI(mo30031getSizeYbymL2g()), this, dVarM30032headH91voCI, u97Var);
        }
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m30017fromParentPosition8S9VItk$default(heb hebVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return hebVar.m30027fromParentPosition8S9VItk(j, z);
    }

    private final void fromParentRect(q6b q6bVar, boolean z) {
        float fM27201getXimpl = a78.m27201getXimpl(mo30030getPositionnOccac());
        q6bVar.setLeft(q6bVar.getLeft() - fM27201getXimpl);
        q6bVar.setRight(q6bVar.getRight() - fM27201getXimpl);
        float fM27202getYimpl = a78.m27202getYimpl(mo30030getPositionnOccac());
        q6bVar.setTop(q6bVar.getTop() - fM27202getYimpl);
        q6bVar.setBottom(q6bVar.getBottom() - fM27202getYimpl);
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.mapBounds(q6bVar, true);
            if (this.f43274d2 && z) {
                q6bVar.intersect(0.0f, 0.0f, r78.m32087getWidthimpl(mo30031getSizeYbymL2g()), r78.m32086getHeightimpl(mo30031getSizeYbymL2g()));
                q6bVar.isEmpty();
            }
        }
    }

    private static /* synthetic */ void getDrawBlock$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bac getSnapshotObserver() {
        return pw8.requireOwner(getLayoutNode()).getSnapshotObserver();
    }

    /* JADX INFO: renamed from: hasNode-H91voCI, reason: not valid java name */
    private final boolean m30018hasNodeH91voCI(int i) {
        InterfaceC0701e.d dVarHeadNode = headNode(leb.m30864getIncludeSelfInTraversalH91voCI(i));
        return dVarHeadNode != null && w34.m32850has64DMado(dVarHeadNode, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC0701e.d headNode(boolean z) {
        InterfaceC0701e.d tail;
        if (getLayoutNode().getOuterCoordinator$ui_release() == this) {
            return getLayoutNode().getNodes$ui_release().getHead$ui_release();
        }
        if (z) {
            heb hebVar = this.f43272b2;
            if (hebVar != null && (tail = hebVar.getTail()) != null) {
                return tail.getChild$ui_release();
            }
        } else {
            heb hebVar2 = this.f43272b2;
            if (hebVar2 != null) {
                return hebVar2.getTail();
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hit-1hIXUjU, reason: not valid java name */
    public final void m30019hit1hIXUjU(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2) {
        if (dVar == null) {
            mo27948hitTestChildYqVAtuI(interfaceC6824f, j, ck7Var, z, z2);
        } else {
            ck7Var.hit(dVar, z2, new C6826h(dVar, interfaceC6824f, j, ck7Var, z, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: hitNear-JHbHoSQ, reason: not valid java name */
    public final void m30020hitNearJHbHoSQ(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2, float f) {
        if (dVar == null) {
            mo27948hitTestChildYqVAtuI(interfaceC6824f, j, ck7Var, z, z2);
        } else {
            ck7Var.hitInMinimumTouchTarget(dVar, f, z2, new C6827i(dVar, interfaceC6824f, j, ck7Var, z, z2, f));
        }
    }

    /* JADX INFO: renamed from: offsetFromEdge-MK-Hz9U, reason: not valid java name */
    private final long m30021offsetFromEdgeMKHz9U(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fMax = Math.max(0.0f, fM30429getXimpl < 0.0f ? -fM30429getXimpl : fM30429getXimpl - getMeasuredWidth());
        float fM30430getYimpl = izb.m30430getYimpl(j);
        return mzb.Offset(fMax, Math.max(0.0f, fM30430getYimpl < 0.0f ? -fM30430getYimpl : fM30430getYimpl - getMeasuredHeight()));
    }

    /* JADX INFO: renamed from: placeSelf-MLgxB_4, reason: not valid java name */
    private final void m30022placeSelfMLgxB_4(long j, float f, qy6<? super InterfaceC0736c, bth> qy6Var, u97 u97Var) {
        if (u97Var != null) {
            if (!(qy6Var == null)) {
                g28.throwIllegalArgumentException("both ways to create layers shouldn't be used together");
            }
            if (this.f43289s2 != u97Var) {
                this.f43289s2 = null;
                updateLayerBlock$default(this, null, false, 2, null);
                this.f43289s2 = u97Var;
            }
            if (this.f43288r2 == null) {
                y9c y9cVarCreateLayer = pw8.requireOwner(getLayoutNode()).createLayer(this.f43285o2, this.f43286p2, u97Var);
                y9cVarCreateLayer.mo27757resizeozmzZPI(m1208b());
                y9cVarCreateLayer.mo27756movegyyYBs(j);
                this.f43288r2 = y9cVarCreateLayer;
                getLayoutNode().setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.f43286p2.invoke();
            }
        } else {
            if (this.f43289s2 != null) {
                this.f43289s2 = null;
                updateLayerBlock$default(this, null, false, 2, null);
            }
            updateLayerBlock$default(this, qy6Var, false, 2, null);
        }
        if (!a78.m27200equalsimpl0(mo30030getPositionnOccac(), j)) {
            m30042setPositiongyyYBs(j);
            getLayoutNode().getLayoutDelegate$ui_release().getMeasurePassDelegate$ui_release().notifyChildrenUsingCoordinatesWhilePlacing();
            y9c y9cVar = this.f43288r2;
            if (y9cVar != null) {
                y9cVar.mo27756movegyyYBs(j);
            } else {
                heb hebVar = this.f43272b2;
                if (hebVar != null) {
                    hebVar.invalidateLayer();
                }
            }
            m14822h(this);
            z9c owner$ui_release = getLayoutNode().getOwner$ui_release();
            if (owner$ui_release != null) {
                owner$ui_release.onLayoutChange(getLayoutNode());
            }
        }
        this.f43282l2 = f;
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m12335r(heb hebVar, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i & 1) != 0) {
            z = true;
        }
        hebVar.updateLayerParameters(z);
    }

    public static /* synthetic */ void rectInParent$ui_release$default(heb hebVar, q6b q6bVar, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        hebVar.rectInParent$ui_release(q6bVar, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: speculativeHit-JHbHoSQ, reason: not valid java name */
    public final void m30023speculativeHitJHbHoSQ(InterfaceC0701e.d dVar, InterfaceC6824f interfaceC6824f, long j, ck7 ck7Var, boolean z, boolean z2, float f) {
        if (dVar == null) {
            mo27948hitTestChildYqVAtuI(interfaceC6824f, j, ck7Var, z, z2);
        } else if (interfaceC6824f.interceptOutOfBoundsChildEvents(dVar)) {
            ck7Var.speculativeHit(dVar, f, z2, new C6829k(dVar, interfaceC6824f, j, ck7Var, z, z2, f));
        } else {
            m30023speculativeHitJHbHoSQ(ieb.m30212nextUntilhw7D004(dVar, interfaceC6824f.mo30049entityTypeOLwlOKw(), keb.m30687constructorimpl(2)), interfaceC6824f, j, ck7Var, z, z2, f);
        }
    }

    private final heb toCoordinator(mv8 mv8Var) {
        heb coordinator;
        nm9 nm9Var = mv8Var instanceof nm9 ? (nm9) mv8Var : null;
        if (nm9Var != null && (coordinator = nm9Var.getCoordinator()) != null) {
            return coordinator;
        }
        md8.checkNotNull(mv8Var, "null cannot be cast to non-null type androidx.compose.ui.node.NodeCoordinator");
        return (heb) mv8Var;
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk$default, reason: not valid java name */
    public static /* synthetic */ long m30024toParentPosition8S9VItk$default(heb hebVar, long j, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        return hebVar.m30043toParentPosition8S9VItk(j, z);
    }

    /* JADX INFO: renamed from: transformFromAncestor-EL8BTi8, reason: not valid java name */
    private final void m30025transformFromAncestorEL8BTi8(heb hebVar, float[] fArr) {
        if (md8.areEqual(hebVar, this)) {
            return;
        }
        heb hebVar2 = this.f43272b2;
        md8.checkNotNull(hebVar2);
        hebVar2.m30025transformFromAncestorEL8BTi8(hebVar, fArr);
        if (!a78.m27200equalsimpl0(mo30030getPositionnOccac(), a78.f545b.m27211getZeronOccac())) {
            float[] fArr2 = f43258B2;
            x3a.m33192resetimpl(fArr2);
            x3a.m33203translateimpl$default(fArr2, -a78.m27201getXimpl(mo30030getPositionnOccac()), -a78.m27202getYimpl(mo30030getPositionnOccac()), 0.0f, 4, null);
            x3a.m33200timesAssign58bKbWc(fArr, fArr2);
        }
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.mo27753inverseTransform58bKbWc(fArr);
        }
    }

    /* JADX INFO: renamed from: transformToAncestor-EL8BTi8, reason: not valid java name */
    private final void m30026transformToAncestorEL8BTi8(heb hebVar, float[] fArr) {
        heb hebVar2 = this;
        while (!md8.areEqual(hebVar2, hebVar)) {
            y9c y9cVar = hebVar2.f43288r2;
            if (y9cVar != null) {
                y9cVar.mo27758transform58bKbWc(fArr);
            }
            if (!a78.m27200equalsimpl0(hebVar2.mo30030getPositionnOccac(), a78.f545b.m27211getZeronOccac())) {
                float[] fArr2 = f43258B2;
                x3a.m33192resetimpl(fArr2);
                x3a.m33203translateimpl$default(fArr2, a78.m27201getXimpl(r1), a78.m27202getYimpl(r1), 0.0f, 4, null);
                x3a.m33200timesAssign58bKbWc(fArr, fArr2);
            }
            hebVar2 = hebVar2.f43272b2;
            md8.checkNotNull(hebVar2);
        }
    }

    public static /* synthetic */ void updateLayerBlock$default(heb hebVar, qy6 qy6Var, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        hebVar.updateLayerBlock(qy6Var, z);
    }

    private final void updateLayerParameters(boolean z) {
        z9c owner$ui_release;
        if (this.f43289s2 != null) {
            return;
        }
        y9c y9cVar = this.f43288r2;
        if (y9cVar == null) {
            if (this.f43275e2 == null) {
                return;
            }
            g28.throwIllegalStateException("null layer with a non-null layerBlock");
            return;
        }
        qy6<? super InterfaceC0736c, bth> qy6Var = this.f43275e2;
        if (qy6Var == null) {
            g28.throwIllegalStateExceptionForNullCheck("updateLayerParameters requires a non-null layerBlock");
            throw new us8();
        }
        C0737d c0737d = f43267z2;
        c0737d.reset();
        c0737d.setGraphicsDensity$ui_release(getLayoutNode().getDensity());
        c0737d.setLayoutDirection$ui_release(getLayoutNode().getLayoutDirection());
        c0737d.m27644setSizeuvyYCjk(s78.m32288toSizeozmzZPI(mo30031getSizeYbymL2g()));
        getSnapshotObserver().observeReads$ui_release(this, f43265x2, new C6830l(qy6Var));
        zu8 zu8Var = this.f43284n2;
        if (zu8Var == null) {
            zu8Var = new zu8();
            this.f43284n2 = zu8Var;
        }
        zu8Var.copyFrom(c0737d);
        y9cVar.updateLayerProperties(c0737d);
        this.f43274d2 = c0737d.getClip();
        this.f43278h2 = c0737d.getAlpha();
        if (!z || (owner$ui_release = getLayoutNode().getOwner$ui_release()) == null) {
            return;
        }
        owner$ui_release.onLayoutChange(getLayoutNode());
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0767t
    /* JADX INFO: renamed from: d */
    public void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
        if (!this.f43269V1) {
            m30022placeSelfMLgxB_4(j, f, qy6Var, null);
            return;
        }
        lm9 lookaheadDelegate = getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        m30022placeSelfMLgxB_4(lookaheadDelegate.mo30030getPositionnOccac(), f, qy6Var, null);
    }

    public final void draw(@yfb vq1 vq1Var, @gib u97 u97Var) {
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.drawLayer(vq1Var, u97Var);
            return;
        }
        float fM27201getXimpl = a78.m27201getXimpl(mo30030getPositionnOccac());
        float fM27202getYimpl = a78.m27202getYimpl(mo30030getPositionnOccac());
        vq1Var.translate(fM27201getXimpl, fM27202getYimpl);
        drawContainedDrawModifiers(vq1Var, u97Var);
        vq1Var.translate(-fM27201getXimpl, -fM27202getYimpl);
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0767t
    /* JADX INFO: renamed from: e */
    public void mo1211e(long j, float f, @yfb u97 u97Var) {
        if (!this.f43269V1) {
            m30022placeSelfMLgxB_4(j, f, null, u97Var);
            return;
        }
        lm9 lookaheadDelegate = getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        m30022placeSelfMLgxB_4(lookaheadDelegate.mo30030getPositionnOccac(), f, null, u97Var);
    }

    public abstract void ensureLookaheadDelegateCreated();

    @yfb
    public final heb findCommonAncestor$ui_release(@yfb heb hebVar) {
        lw8 layoutNode = hebVar.getLayoutNode();
        lw8 layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            InterfaceC0701e.d tail = hebVar.getTail();
            InterfaceC0701e.d tail2 = getTail();
            int iM30687constructorimpl = keb.m30687constructorimpl(2);
            if (!tail2.getNode().isAttached()) {
                g28.throwIllegalStateException("visitLocalAncestors called on an unattached node");
            }
            for (InterfaceC0701e.d parent$ui_release = tail2.getNode().getParent$ui_release(); parent$ui_release != null; parent$ui_release = parent$ui_release.getParent$ui_release()) {
                if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0 && parent$ui_release == tail) {
                    return hebVar;
                }
            }
            return this;
        }
        while (layoutNode.getDepth$ui_release() > layoutNode2.getDepth$ui_release()) {
            layoutNode = layoutNode.getParent$ui_release();
            md8.checkNotNull(layoutNode);
        }
        while (layoutNode2.getDepth$ui_release() > layoutNode.getDepth$ui_release()) {
            layoutNode2 = layoutNode2.getParent$ui_release();
            md8.checkNotNull(layoutNode2);
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.getParent$ui_release();
            layoutNode2 = layoutNode2.getParent$ui_release();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        return layoutNode2 == getLayoutNode() ? this : layoutNode == hebVar.getLayoutNode() ? hebVar : layoutNode.getInnerCoordinator$ui_release();
    }

    /* JADX INFO: renamed from: fromParentPosition-8S9VItk, reason: not valid java name */
    public long m30027fromParentPosition8S9VItk(long j, boolean z) {
        if (z || !isPlacedUnderMotionFrameOfReference()) {
            j = b78.m27956minusNvtHpc(j, mo30030getPositionnOccac());
        }
        y9c y9cVar = this.f43288r2;
        return y9cVar != null ? y9cVar.mo27755mapOffset8S9VItk(j, true) : j;
    }

    @Override // p000.km9
    @yfb
    public InterfaceC12654sm getAlignmentLinesOwner() {
        return getLayoutNode().getLayoutDelegate$ui_release().getAlignmentLinesOwner$ui_release();
    }

    @Override // p000.km9
    @gib
    public km9 getChild() {
        return this.f43271a2;
    }

    @Override // p000.km9
    @yfb
    public mv8 getCoordinates() {
        return this;
    }

    @Override // p000.c64
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // p000.dp6
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    public final boolean getForceMeasureWithLookaheadConstraints$ui_release() {
        return this.f43270Z1;
    }

    public final boolean getForcePlaceWithLookaheadOffset$ui_release() {
        return this.f43269V1;
    }

    @Override // p000.km9
    public boolean getHasMeasureResult() {
        return this.f43279i2 != null;
    }

    @Override // p000.mv8
    public boolean getIntroducesMotionFrameOfReference() {
        return isPlacedUnderMotionFrameOfReference();
    }

    public final boolean getLastLayerDrawingWasSkipped$ui_release() {
        return this.f43287q2;
    }

    /* JADX INFO: renamed from: getLastMeasurementConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m30028getLastMeasurementConstraintsmsEJaDk$ui_release() {
        return m1209c();
    }

    @gib
    public final y9c getLayer() {
        return this.f43288r2;
    }

    @Override // p000.gd8
    @yfb
    public ov8 getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // p000.km9, p000.xba
    @yfb
    public lw8 getLayoutNode() {
        return this.f43268M1;
    }

    @gib
    public abstract lm9 getLookaheadDelegate();

    @Override // p000.km9
    @yfb
    public vba getMeasureResult$ui_release() {
        vba vbaVar = this.f43279i2;
        if (vbaVar != null) {
            return vbaVar;
        }
        throw new IllegalStateException(f43264w2);
    }

    /* JADX INFO: renamed from: getMinimumTouchTargetSize-NH-jbRc, reason: not valid java name */
    public final long m30029getMinimumTouchTargetSizeNHjbRc() {
        return this.f43276f2.mo27174toSizeXkaWNTQ(getLayoutNode().getViewConfiguration().mo30909getMinimumTouchTargetSizeMYxV2XQ());
    }

    @Override // p000.km9
    @gib
    public km9 getParent() {
        return this.f43272b2;
    }

    @Override // p000.mv8
    @gib
    public final mv8 getParentCoordinates() {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        onCoordinatesUsed$ui_release();
        return this.f43272b2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // p000.aca, p000.ed8
    @gib
    public Object getParentData() {
        if (!getLayoutNode().getNodes$ui_release().m28910hasH91voCI$ui_release(keb.m30687constructorimpl(64))) {
            return null;
        }
        getTail();
        jvd.C8121h c8121h = new jvd.C8121h();
        for (InterfaceC0701e.d tail$ui_release = getLayoutNode().getNodes$ui_release().getTail$ui_release(); tail$ui_release != null; tail$ui_release = tail$ui_release.getParent$ui_release()) {
            if ((keb.m30687constructorimpl(64) & tail$ui_release.getKindSet$ui_release()) != 0) {
                int iM30687constructorimpl = keb.m30687constructorimpl(64);
                f7b f7bVar = null;
                InterfaceC0701e.d dVarPop = tail$ui_release;
                while (dVarPop != 0) {
                    if (dVarPop instanceof bhc) {
                        c8121h.f52110a = ((bhc) dVarPop).modifyParentData(getLayoutNode().getDensity(), c8121h.f52110a);
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
        return c8121h.f52110a;
    }

    @Override // p000.mv8
    @gib
    public final mv8 getParentLayoutCoordinates() {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        onCoordinatesUsed$ui_release();
        return getLayoutNode().getOuterCoordinator$ui_release().f43272b2;
    }

    @Override // p000.km9
    /* JADX INFO: renamed from: getPosition-nOcc-ac, reason: not valid java name */
    public long mo30030getPositionnOccac() {
        return this.f43281k2;
    }

    @Override // p000.mv8
    @yfb
    public Set<AbstractC9938nm> getProvidedAlignmentLines() {
        LinkedHashSet linkedHashSet = null;
        for (heb hebVar = this; hebVar != null; hebVar = hebVar.f43271a2) {
            vba vbaVar = hebVar.f43279i2;
            Map<AbstractC9938nm, Integer> alignmentLines = vbaVar != null ? vbaVar.getAlignmentLines() : null;
            if (alignmentLines != null && (!alignmentLines.isEmpty())) {
                if (linkedHashSet == null) {
                    linkedHashSet = new LinkedHashSet();
                }
                linkedHashSet.addAll(alignmentLines.keySet());
            }
        }
        return linkedHashSet == null ? w6f.emptySet() : linkedHashSet;
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long mo30031getSizeYbymL2g() {
        return m1208b();
    }

    @yfb
    public abstract InterfaceC0701e.d getTail();

    @gib
    public final heb getWrapped$ui_release() {
        return this.f43271a2;
    }

    @gib
    public final heb getWrappedBy$ui_release() {
        return this.f43272b2;
    }

    public final float getZIndex() {
        return this.f43282l2;
    }

    @gib
    /* JADX INFO: renamed from: head-H91voCI, reason: not valid java name */
    public final InterfaceC0701e.d m30032headH91voCI(int i) {
        boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(i);
        InterfaceC0701e.d tail = getTail();
        if (!zM30864getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return null;
        }
        for (InterfaceC0701e.d dVarHeadNode = headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & i) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
            if ((dVarHeadNode.getKindSet$ui_release() & i) != 0) {
                return dVarHeadNode;
            }
            if (dVarHeadNode == tail) {
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: hitTest-YqVAtuI, reason: not valid java name */
    public final void m30033hitTestYqVAtuI(@yfb InterfaceC6824f interfaceC6824f, long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
        InterfaceC0701e.d dVarM30032headH91voCI = m30032headH91voCI(interfaceC6824f.mo30049entityTypeOLwlOKw());
        if (!m12345t(j)) {
            if (z) {
                float fM12337j = m12337j(j, m30029getMinimumTouchTargetSizeNHjbRc());
                if (Float.isInfinite(fM12337j) || Float.isNaN(fM12337j) || !ck7Var.isHitInMinimumTouchTargetBetter(fM12337j, false)) {
                    return;
                }
                m30020hitNearJHbHoSQ(dVarM30032headH91voCI, interfaceC6824f, j, ck7Var, z, false, fM12337j);
                return;
            }
            return;
        }
        if (dVarM30032headH91voCI == null) {
            mo27948hitTestChildYqVAtuI(interfaceC6824f, j, ck7Var, z, z2);
            return;
        }
        if (m12341n(j)) {
            m30019hit1hIXUjU(dVarM30032headH91voCI, interfaceC6824f, j, ck7Var, z, z2);
            return;
        }
        float fM12337j2 = !z ? Float.POSITIVE_INFINITY : m12337j(j, m30029getMinimumTouchTargetSizeNHjbRc());
        if (!Float.isInfinite(fM12337j2) && !Float.isNaN(fM12337j2)) {
            if (ck7Var.isHitInMinimumTouchTargetBetter(fM12337j2, z2)) {
                m30020hitNearJHbHoSQ(dVarM30032headH91voCI, interfaceC6824f, j, ck7Var, z, z2, fM12337j2);
                return;
            }
        }
        m30023speculativeHitJHbHoSQ(dVarM30032headH91voCI, interfaceC6824f, j, ck7Var, z, z2, fM12337j2);
    }

    /* JADX INFO: renamed from: hitTestChild-YqVAtuI */
    public void mo27948hitTestChildYqVAtuI(@yfb InterfaceC6824f interfaceC6824f, long j, @yfb ck7 ck7Var, boolean z, boolean z2) {
        heb hebVar = this.f43271a2;
        if (hebVar != null) {
            hebVar.m30033hitTestYqVAtuI(interfaceC6824f, m30017fromParentPosition8S9VItk$default(hebVar, j, false, 2, null), ck7Var, z, z2);
        }
    }

    /* JADX INFO: renamed from: i */
    public final long m12336i(long j) {
        return eqf.Size(Math.max(0.0f, (wpf.m33069getWidthimpl(j) - getMeasuredWidth()) / 2.0f), Math.max(0.0f, (wpf.m33066getHeightimpl(j) - getMeasuredHeight()) / 2.0f));
    }

    public void invalidateLayer() {
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.invalidate();
            return;
        }
        heb hebVar = this.f43272b2;
        if (hebVar != null) {
            hebVar.invalidateLayer();
        }
    }

    @Override // p000.mv8
    public boolean isAttached() {
        return getTail().isAttached();
    }

    public final boolean isTransparent() {
        if (this.f43288r2 != null && this.f43278h2 <= 0.0f) {
            return true;
        }
        heb hebVar = this.f43272b2;
        if (hebVar != null) {
            return hebVar.isTransparent();
        }
        return false;
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return (this.f43288r2 == null || this.f43273c2 || !getLayoutNode().isAttached()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public final float m12337j(long j, long j2) {
        if (getMeasuredWidth() >= wpf.m33069getWidthimpl(j2) && getMeasuredHeight() >= wpf.m33066getHeightimpl(j2)) {
            return Float.POSITIVE_INFINITY;
        }
        long jM12336i = m12336i(j2);
        float fM33069getWidthimpl = wpf.m33069getWidthimpl(jM12336i);
        float fM33066getHeightimpl = wpf.m33066getHeightimpl(jM12336i);
        long jM30021offsetFromEdgeMKHz9U = m30021offsetFromEdgeMKHz9U(j);
        if ((fM33069getWidthimpl > 0.0f || fM33066getHeightimpl > 0.0f) && izb.m30429getXimpl(jM30021offsetFromEdgeMKHz9U) <= fM33069getWidthimpl && izb.m30430getYimpl(jM30021offsetFromEdgeMKHz9U) <= fM33066getHeightimpl) {
            return izb.m30428getDistanceSquaredimpl(jM30021offsetFromEdgeMKHz9U);
        }
        return Float.POSITIVE_INFINITY;
    }

    /* JADX INFO: renamed from: k */
    public final void m12338k(@yfb vq1 vq1Var, @yfb icc iccVar) {
        vq1Var.drawRect(new rud(0.5f, 0.5f, r78.m32087getWidthimpl(m1208b()) - 0.5f, r78.m32086getHeightimpl(m1208b()) - 0.5f), iccVar);
    }

    @gib
    /* JADX INFO: renamed from: l */
    public final qy6<InterfaceC0736c, bth> m12339l() {
        return this.f43275e2;
    }

    @Override // p000.mv8
    @yfb
    public rud localBoundingBoxOf(@yfb mv8 mv8Var, boolean z) {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        if (!mv8Var.isAttached()) {
            g28.throwIllegalStateException("LayoutCoordinates " + mv8Var + " is not attached!");
        }
        heb coordinator = toCoordinator(mv8Var);
        coordinator.onCoordinatesUsed$ui_release();
        heb hebVarFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        q6b q6bVarM12340m = m12340m();
        q6bVarM12340m.setLeft(0.0f);
        q6bVarM12340m.setTop(0.0f);
        q6bVarM12340m.setRight(r78.m32087getWidthimpl(mv8Var.mo30031getSizeYbymL2g()));
        q6bVarM12340m.setBottom(r78.m32086getHeightimpl(mv8Var.mo30031getSizeYbymL2g()));
        while (coordinator != hebVarFindCommonAncestor$ui_release) {
            rectInParent$ui_release$default(coordinator, q6bVarM12340m, z, false, 4, null);
            if (q6bVarM12340m.isEmpty()) {
                return rud.f79687e.getZero();
            }
            coordinator = coordinator.f43272b2;
            md8.checkNotNull(coordinator);
        }
        ancestorToLocal(hebVarFindCommonAncestor$ui_release, q6bVarM12340m, z);
        return r6b.toRect(q6bVarM12340m);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localPositionOf-R5De75A, reason: not valid java name */
    public long mo30034localPositionOfR5De75A(@yfb mv8 mv8Var, long j) {
        return mo30035localPositionOfS_NoaFU(mv8Var, j, true);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU, reason: not valid java name */
    public long mo30035localPositionOfS_NoaFU(@yfb mv8 mv8Var, long j, boolean z) {
        if (mv8Var instanceof nm9) {
            ((nm9) mv8Var).getCoordinator().onCoordinatesUsed$ui_release();
            return izb.m30438unaryMinusF1C5BW0(mv8Var.mo30035localPositionOfS_NoaFU(this, izb.m30438unaryMinusF1C5BW0(j), z));
        }
        heb coordinator = toCoordinator(mv8Var);
        coordinator.onCoordinatesUsed$ui_release();
        heb hebVarFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        while (coordinator != hebVarFindCommonAncestor$ui_release) {
            j = coordinator.m30043toParentPosition8S9VItk(j, z);
            coordinator = coordinator.f43272b2;
            md8.checkNotNull(coordinator);
        }
        return m30016ancestorToLocalS_NoaFU(hebVarFindCommonAncestor$ui_release, j, z);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U, reason: not valid java name */
    public long mo30036localToRootMKHz9U(long j) {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        onCoordinatesUsed$ui_release();
        long jM30024toParentPosition8S9VItk$default = j;
        for (heb hebVar = this; hebVar != null; hebVar = hebVar.f43272b2) {
            jM30024toParentPosition8S9VItk$default = m30024toParentPosition8S9VItk$default(hebVar, jM30024toParentPosition8S9VItk$default, false, 2, null);
        }
        return jM30024toParentPosition8S9VItk$default;
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U, reason: not valid java name */
    public long mo30037localToScreenMKHz9U(long j) {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        return pw8.requireOwner(getLayoutNode()).mo27743localToScreenMKHz9U(mo30036localToRootMKHz9U(j));
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U, reason: not valid java name */
    public long mo30038localToWindowMKHz9U(long j) {
        return pw8.requireOwner(getLayoutNode()).mo27740calculatePositionInWindowMKHz9U(mo30036localToRootMKHz9U(j));
    }

    @yfb
    /* JADX INFO: renamed from: m */
    public final q6b m12340m() {
        q6b q6bVar = this.f43283m2;
        if (q6bVar != null) {
            return q6bVar;
        }
        q6b q6bVar2 = new q6b(0.0f, 0.0f, 0.0f, 0.0f);
        this.f43283m2 = q6bVar2;
        return q6bVar2;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m12341n(long j) {
        float fM30429getXimpl = izb.m30429getXimpl(j);
        float fM30430getYimpl = izb.m30430getYimpl(j);
        return fM30429getXimpl >= 0.0f && fM30430getYimpl >= 0.0f && fM30429getXimpl < ((float) getMeasuredWidth()) && fM30430getYimpl < ((float) getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX INFO: renamed from: o */
    public void m12342o(int i, int i2) {
        heb hebVar;
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.mo27757resizeozmzZPI(s78.IntSize(i, i2));
        } else if (getLayoutNode().isPlaced() && (hebVar = this.f43272b2) != null) {
            hebVar.invalidateLayer();
        }
        m1212f(s78.IntSize(i, i2));
        if (this.f43275e2 != null) {
            updateLayerParameters(false);
        }
        int iM30687constructorimpl = keb.m30687constructorimpl(4);
        boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(iM30687constructorimpl);
        InterfaceC0701e.d tail = getTail();
        if (zM30864getIncludeSelfInTraversalH91voCI || (tail = tail.getParent$ui_release()) != null) {
            for (InterfaceC0701e.d dVarHeadNode = headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
                if ((dVarHeadNode.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                    InterfaceC0701e.d dVarPop = dVarHeadNode;
                    f7b f7bVar = null;
                    while (dVarPop != 0) {
                        if (dVarPop instanceof fp4) {
                            ((fp4) dVarPop).onMeasureResultChanged();
                        } else if ((dVarPop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (dVarPop instanceof d44)) {
                            InterfaceC0701e.d delegate$ui_release = ((d44) dVarPop).getDelegate$ui_release();
                            int i3 = 0;
                            dVarPop = dVarPop;
                            while (delegate$ui_release != null) {
                                if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                    i3++;
                                    if (i3 == 1) {
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
                            if (i3 == 1) {
                            }
                        }
                        dVarPop = w34.pop(f7bVar);
                    }
                }
                if (dVarHeadNode == tail) {
                    break;
                }
            }
        }
        z9c owner$ui_release = getLayoutNode().getOwner$ui_release();
        if (owner$ui_release != null) {
            owner$ui_release.onLayoutChange(getLayoutNode());
        }
    }

    public final void onCoordinatesUsed$ui_release() {
        getLayoutNode().getLayoutDelegate$ui_release().onCoordinatesUsed();
    }

    public void onLayoutModifierNodeChanged() {
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.invalidate();
        }
    }

    public final void onLayoutNodeAttach() {
        updateLayerBlock(this.f43275e2, true);
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            y9cVar.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void onMeasured() {
        InterfaceC0701e.d parent$ui_release;
        if (m30018hasNodeH91voCI(keb.m30687constructorimpl(128))) {
            ssf.C12771a c12771a = ssf.f82790e;
            ssf currentThreadSnapshot = c12771a.getCurrentThreadSnapshot();
            qy6<Object, bth> readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
            ssf ssfVarMakeCurrentNonObservable = c12771a.makeCurrentNonObservable(currentThreadSnapshot);
            try {
                int iM30687constructorimpl = keb.m30687constructorimpl(128);
                boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(iM30687constructorimpl);
                if (!zM30864getIncludeSelfInTraversalH91voCI) {
                    parent$ui_release = getTail().getParent$ui_release();
                    if (parent$ui_release == null) {
                    }
                    bth bthVar = bth.f14751a;
                    c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                }
                parent$ui_release = getTail();
                for (InterfaceC0701e.d dVarHeadNode = headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
                    if ((dVarHeadNode.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        f7b f7bVar = null;
                        InterfaceC0701e.d dVarPop = dVarHeadNode;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof iv8) {
                                ((iv8) dVarPop).mo27780onRemeasuredozmzZPI(m1208b());
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
                    if (dVarHeadNode == parent$ui_release) {
                        break;
                    }
                }
                bth bthVar2 = bth.f14751a;
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
            } catch (Throwable th) {
                c12771a.restoreNonObservable(currentThreadSnapshot, ssfVarMakeCurrentNonObservable, readObserver);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void onPlaced() {
        int iM30687constructorimpl = keb.m30687constructorimpl(128);
        boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(iM30687constructorimpl);
        InterfaceC0701e.d tail = getTail();
        if (!zM30864getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (InterfaceC0701e.d dVarHeadNode = headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
            if ((dVarHeadNode.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                InterfaceC0701e.d dVarPop = dVarHeadNode;
                f7b f7bVar = null;
                while (dVarPop != 0) {
                    if (dVarPop instanceof iv8) {
                        ((iv8) dVarPop).onPlaced(this);
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

    public final void onRelease() {
        this.f43273c2 = true;
        this.f43286p2.invoke();
        releaseLayer();
    }

    /* JADX INFO: renamed from: p */
    public abstract void mo2871p(@gib lm9 lm9Var);

    public void performDraw(@yfb vq1 vq1Var, @gib u97 u97Var) {
        heb hebVar = this.f43271a2;
        if (hebVar != null) {
            hebVar.draw(vq1Var, u97Var);
        }
    }

    @yfb
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final AbstractC0767t m30039performingMeasureK40F9xA(long j, @yfb ny6<? extends AbstractC0767t> ny6Var) {
        m1213g(j);
        return ny6Var.invoke();
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset-MLgxB_4, reason: not valid java name */
    public final void m30040placeSelfApparentToRealOffsetMLgxB_4(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var, @gib u97 u97Var) {
        m30022placeSelfMLgxB_4(a78.m27205plusqkQi6aY(j, m1207a()), f, qy6Var, u97Var);
    }

    /* JADX INFO: renamed from: q */
    public final void m12343q(float f) {
        this.f43282l2 = f;
    }

    public final void rectInParent$ui_release(@yfb q6b q6bVar, boolean z, boolean z2) {
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            if (this.f43274d2) {
                if (z2) {
                    long jM30029getMinimumTouchTargetSizeNHjbRc = m30029getMinimumTouchTargetSizeNHjbRc();
                    float fM33069getWidthimpl = wpf.m33069getWidthimpl(jM30029getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    float fM33066getHeightimpl = wpf.m33066getHeightimpl(jM30029getMinimumTouchTargetSizeNHjbRc) / 2.0f;
                    q6bVar.intersect(-fM33069getWidthimpl, -fM33066getHeightimpl, r78.m32087getWidthimpl(mo30031getSizeYbymL2g()) + fM33069getWidthimpl, r78.m32086getHeightimpl(mo30031getSizeYbymL2g()) + fM33066getHeightimpl);
                } else if (z) {
                    q6bVar.intersect(0.0f, 0.0f, r78.m32087getWidthimpl(mo30031getSizeYbymL2g()), r78.m32086getHeightimpl(mo30031getSizeYbymL2g()));
                }
                if (q6bVar.isEmpty()) {
                    return;
                }
            }
            y9cVar.mapBounds(q6bVar, false);
        }
        float fM27201getXimpl = a78.m27201getXimpl(mo30030getPositionnOccac());
        q6bVar.setLeft(q6bVar.getLeft() + fM27201getXimpl);
        q6bVar.setRight(q6bVar.getRight() + fM27201getXimpl);
        float fM27202getYimpl = a78.m27202getYimpl(mo30030getPositionnOccac());
        q6bVar.setTop(q6bVar.getTop() + fM27202getYimpl);
        q6bVar.setBottom(q6bVar.getBottom() + fM27202getYimpl);
    }

    public final void releaseLayer() {
        if (this.f43288r2 != null) {
            if (this.f43289s2 != null) {
                this.f43289s2 = null;
            }
            updateLayerBlock$default(this, null, false, 2, null);
            lw8.requestRelayout$ui_release$default(getLayoutNode(), false, 1, null);
        }
    }

    @Override // p000.km9
    public void replace$ui_release() {
        u97 u97Var = this.f43289s2;
        if (u97Var != null) {
            mo1211e(mo30030getPositionnOccac(), this.f43282l2, u97Var);
        } else {
            mo1210d(mo30030getPositionnOccac(), this.f43282l2, this.f43275e2);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12344s(@yfb vq1 vq1Var, @yfb qy6<? super vq1, bth> qy6Var) {
        float fM27201getXimpl = a78.m27201getXimpl(mo30030getPositionnOccac());
        float fM27202getYimpl = a78.m27202getYimpl(mo30030getPositionnOccac());
        vq1Var.translate(fM27201getXimpl, fM27202getYimpl);
        qy6Var.invoke(vq1Var);
        vq1Var.translate(-fM27201getXimpl, -fM27202getYimpl);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U, reason: not valid java name */
    public long mo30041screenToLocalMKHz9U(long j) {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        return mo30034localPositionOfR5De75A(nv8.findRootCoordinates(this), pw8.requireOwner(getLayoutNode()).mo27745screenToLocalMKHz9U(j));
    }

    public final void setForceMeasureWithLookaheadConstraints$ui_release(boolean z) {
        this.f43270Z1 = z;
    }

    public final void setForcePlaceWithLookaheadOffset$ui_release(boolean z) {
        this.f43269V1 = z;
    }

    public void setMeasureResult$ui_release(@yfb vba vbaVar) {
        vba vbaVar2 = this.f43279i2;
        if (vbaVar != vbaVar2) {
            this.f43279i2 = vbaVar;
            if (vbaVar2 == null || vbaVar.getWidth() != vbaVar2.getWidth() || vbaVar.getHeight() != vbaVar2.getHeight()) {
                m12342o(vbaVar.getWidth(), vbaVar.getHeight());
            }
            Map<AbstractC9938nm, Integer> map = this.f43280j2;
            if (((map == null || map.isEmpty()) && vbaVar.getAlignmentLines().isEmpty()) || md8.areEqual(vbaVar.getAlignmentLines(), this.f43280j2)) {
                return;
            }
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.f43280j2;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f43280j2 = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(vbaVar.getAlignmentLines());
        }
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m30042setPositiongyyYBs(long j) {
        this.f43281k2 = j;
    }

    public final void setWrapped$ui_release(@gib heb hebVar) {
        this.f43271a2 = hebVar;
    }

    public final void setWrappedBy$ui_release(@gib heb hebVar) {
        this.f43272b2 = hebVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    public final boolean shouldSharePointerInputWithSiblings() {
        InterfaceC0701e.d dVarHeadNode = headNode(leb.m30864getIncludeSelfInTraversalH91voCI(keb.m30687constructorimpl(16)));
        if (dVarHeadNode != null && dVarHeadNode.isAttached()) {
            int iM30687constructorimpl = keb.m30687constructorimpl(16);
            if (!dVarHeadNode.getNode().isAttached()) {
                g28.throwIllegalStateException("visitLocalDescendants called on an unattached node");
            }
            InterfaceC0701e.d node = dVarHeadNode.getNode();
            if ((node.getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                while (node != null) {
                    if ((node.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        InterfaceC0701e.d dVarPop = node;
                        f7b f7bVar = null;
                        while (dVarPop != 0) {
                            if (dVarPop instanceof p2d) {
                                if (((p2d) dVarPop).sharePointerInputWithSiblings()) {
                                    return true;
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
                    node = node.getChild$ui_release();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m12345t(long j) {
        if (!mzb.m31098isFinitek4lQ0M(j)) {
            return false;
        }
        y9c y9cVar = this.f43288r2;
        return y9cVar == null || !this.f43274d2 || y9cVar.mo27754isInLayerk4lQ0M(j);
    }

    /* JADX INFO: renamed from: toParentPosition-8S9VItk, reason: not valid java name */
    public long m30043toParentPosition8S9VItk(long j, boolean z) {
        y9c y9cVar = this.f43288r2;
        if (y9cVar != null) {
            j = y9cVar.mo27755mapOffset8S9VItk(j, false);
        }
        return (z || !isPlacedUnderMotionFrameOfReference()) ? b78.m27958plusNvtHpc(j, mo30030getPositionnOccac()) : j;
    }

    @yfb
    public final rud touchBoundsInRoot() {
        if (!isAttached()) {
            return rud.f79687e.getZero();
        }
        mv8 mv8VarFindRootCoordinates = nv8.findRootCoordinates(this);
        q6b q6bVarM12340m = m12340m();
        long jM12336i = m12336i(m30029getMinimumTouchTargetSizeNHjbRc());
        q6bVarM12340m.setLeft(-wpf.m33069getWidthimpl(jM12336i));
        q6bVarM12340m.setTop(-wpf.m33066getHeightimpl(jM12336i));
        q6bVarM12340m.setRight(getMeasuredWidth() + wpf.m33069getWidthimpl(jM12336i));
        q6bVarM12340m.setBottom(getMeasuredHeight() + wpf.m33066getHeightimpl(jM12336i));
        heb hebVar = this;
        while (hebVar != mv8VarFindRootCoordinates) {
            hebVar.rectInParent$ui_release(q6bVarM12340m, false, true);
            if (q6bVarM12340m.isEmpty()) {
                return rud.f79687e.getZero();
            }
            hebVar = hebVar.f43272b2;
            md8.checkNotNull(hebVar);
        }
        return r6b.toRect(q6bVarM12340m);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: transformFrom-EL8BTi8, reason: not valid java name */
    public void mo30044transformFromEL8BTi8(@yfb mv8 mv8Var, @yfb float[] fArr) {
        heb coordinator = toCoordinator(mv8Var);
        coordinator.onCoordinatesUsed$ui_release();
        heb hebVarFindCommonAncestor$ui_release = findCommonAncestor$ui_release(coordinator);
        x3a.m33192resetimpl(fArr);
        coordinator.m30026transformToAncestorEL8BTi8(hebVarFindCommonAncestor$ui_release, fArr);
        m30025transformFromAncestorEL8BTi8(hebVarFindCommonAncestor$ui_release, fArr);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: transformToScreen-58bKbWc, reason: not valid java name */
    public void mo30045transformToScreen58bKbWc(@yfb float[] fArr) {
        z9c z9cVarRequireOwner = pw8.requireOwner(getLayoutNode());
        m30026transformToAncestorEL8BTi8(toCoordinator(nv8.findRootCoordinates(this)), fArr);
        z9cVarRequireOwner.mo27742localToScreen58bKbWc(fArr);
    }

    public final void updateLayerBlock(@gib qy6<? super InterfaceC0736c, bth> qy6Var, boolean z) {
        z9c owner$ui_release;
        if (!(qy6Var == null || this.f43289s2 == null)) {
            g28.throwIllegalArgumentException("layerBlock can't be provided when explicitLayer is provided");
        }
        lw8 layoutNode = getLayoutNode();
        boolean z2 = (!z && this.f43275e2 == qy6Var && md8.areEqual(this.f43276f2, layoutNode.getDensity()) && this.f43277g2 == layoutNode.getLayoutDirection()) ? false : true;
        this.f43276f2 = layoutNode.getDensity();
        this.f43277g2 = layoutNode.getLayoutDirection();
        if (!layoutNode.isAttached() || qy6Var == null) {
            this.f43275e2 = null;
            y9c y9cVar = this.f43288r2;
            if (y9cVar != null) {
                y9cVar.destroy();
                layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
                this.f43286p2.invoke();
                if (isAttached() && (owner$ui_release = layoutNode.getOwner$ui_release()) != null) {
                    owner$ui_release.onLayoutChange(layoutNode);
                }
            }
            this.f43288r2 = null;
            this.f43287q2 = false;
            return;
        }
        this.f43275e2 = qy6Var;
        if (this.f43288r2 != null) {
            if (z2) {
                m12335r(this, false, 1, null);
                return;
            }
            return;
        }
        y9c y9cVarCreateLayer$default = z9c.createLayer$default(pw8.requireOwner(layoutNode), this.f43285o2, this.f43286p2, null, 4, null);
        y9cVarCreateLayer$default.mo27757resizeozmzZPI(m1208b());
        y9cVarCreateLayer$default.mo27756movegyyYBs(mo30030getPositionnOccac());
        this.f43288r2 = y9cVarCreateLayer$default;
        m12335r(this, false, 1, null);
        layoutNode.setInnerLayerCoordinatorIsDirty$ui_release(true);
        this.f43286p2.invoke();
    }

    public final void visitNodes(int i, boolean z, @yfb qy6<? super InterfaceC0701e.d, bth> qy6Var) {
        InterfaceC0701e.d tail = getTail();
        if (!z && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (InterfaceC0701e.d dVarHeadNode = headNode(z); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & i) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
            if ((dVarHeadNode.getKindSet$ui_release() & i) != 0) {
                qy6Var.invoke(dVarHeadNode);
            }
            if (dVarHeadNode == tail) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: visitNodes-aLcG6gQ, reason: not valid java name */
    public final /* synthetic */ <T> void m30046visitNodesaLcG6gQ(int i, qy6<? super T, bth> qy6Var) {
        boolean zM30864getIncludeSelfInTraversalH91voCI = leb.m30864getIncludeSelfInTraversalH91voCI(i);
        InterfaceC0701e.d tail = getTail();
        if (!zM30864getIncludeSelfInTraversalH91voCI && (tail = tail.getParent$ui_release()) == null) {
            return;
        }
        for (InterfaceC0701e.d dVarHeadNode = headNode(zM30864getIncludeSelfInTraversalH91voCI); dVarHeadNode != null && (dVarHeadNode.getAggregateChildKindSet$ui_release() & i) != 0; dVarHeadNode = dVarHeadNode.getChild$ui_release()) {
            if ((dVarHeadNode.getKindSet$ui_release() & i) != 0) {
                for (InterfaceC0701e.d dVarPop = dVarHeadNode; dVarPop != null; dVarPop = w34.pop(null)) {
                    md8.reifiedOperationMarker(3, "T");
                    qy6Var.invoke(dVarPop);
                }
            }
            if (dVarHeadNode == tail) {
                return;
            }
        }
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U, reason: not valid java name */
    public long mo30047windowToLocalMKHz9U(long j) {
        if (!isAttached()) {
            g28.throwIllegalStateException(f43263v2);
        }
        mv8 mv8VarFindRootCoordinates = nv8.findRootCoordinates(this);
        return mo30034localPositionOfR5De75A(mv8VarFindRootCoordinates, izb.m30433minusMKHz9U(pw8.requireOwner(getLayoutNode()).mo27739calculateLocalPositionMKHz9U(j), nv8.positionInRoot(mv8VarFindRootCoordinates)));
    }
}
