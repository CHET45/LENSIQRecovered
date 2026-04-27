package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,486:1\n1#2:487\n80#3:488\n80#3:502\n80#3:513\n33#4,6:489\n33#4,6:507\n460#5,7:495\n467#5,4:503\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode\n*L\n193#1:488\n277#1:502\n392#1:513\n235#1:489,6\n371#1:507,6\n272#1:495,7\n272#1:503,4\n*E\n"})
@e0g(parameters = 0)
public final class txe {

    /* JADX INFO: renamed from: h */
    public static final int f86260h = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC0701e.d f86261a;

    /* JADX INFO: renamed from: b */
    public final boolean f86262b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final lw8 f86263c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final nxe f86264d;

    /* JADX INFO: renamed from: e */
    public boolean f86265e;

    /* JADX INFO: renamed from: f */
    @gib
    public txe f86266f;

    /* JADX INFO: renamed from: g */
    public final int f86267g;

    /* JADX INFO: renamed from: txe$a */
    public static final class C13271a extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ jae f86268a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13271a(jae jaeVar) {
            super(1);
            this.f86268a = jaeVar;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.m28185setRolekuIjeqM(eyeVar, this.f86268a.m30500unboximpl());
        }
    }

    /* JADX INFO: renamed from: txe$b */
    public static final class C13272b extends tt8 implements qy6<eye, bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f86269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13272b(String str) {
            super(1);
            this.f86269a = str;
        }

        @Override // p000.qy6
        public /* bridge */ /* synthetic */ bth invoke(eye eyeVar) {
            invoke2(eyeVar);
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@yfb eye eyeVar) {
            bye.setContentDescription(eyeVar, this.f86269a);
        }
    }

    /* JADX INFO: renamed from: txe$c */
    public static final class C13273c extends InterfaceC0701e.d implements rxe {

        /* JADX INFO: renamed from: X */
        public final /* synthetic */ qy6<eye, bth> f86270X;

        /* JADX WARN: Multi-variable type inference failed */
        public C13273c(qy6<? super eye, bth> qy6Var) {
            this.f86270X = qy6Var;
        }

        @Override // p000.rxe
        public void applySemantics(@yfb eye eyeVar) {
            this.f86270X.invoke(eyeVar);
        }
    }

    /* JADX INFO: renamed from: txe$d */
    public static final class C13274d extends tt8 implements qy6<lw8, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C13274d f86271a = new C13274d();

        public C13274d() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb lw8 lw8Var) {
            nxe collapsedSemantics$ui_release = lw8Var.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: txe$e */
    public static final class C13275e extends tt8 implements qy6<lw8, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C13275e f86272a = new C13275e();

        public C13275e() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb lw8 lw8Var) {
            nxe collapsedSemantics$ui_release = lw8Var.getCollapsedSemantics$ui_release();
            boolean z = false;
            if (collapsedSemantics$ui_release != null && collapsedSemantics$ui_release.isMergingSemanticsOfDescendants()) {
                z = true;
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX INFO: renamed from: txe$f */
    @dwf({"SMAP\nSemanticsNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,486:1\n80#2:487\n*S KotlinDebug\n*F\n+ 1 SemanticsNode.kt\nandroidx/compose/ui/semantics/SemanticsNode$parent$2\n*L\n359#1:487\n*E\n"})
    public static final class C13276f extends tt8 implements qy6<lw8, Boolean> {

        /* JADX INFO: renamed from: a */
        public static final C13276f f86273a = new C13276f();

        public C13276f() {
            super(1);
        }

        @Override // p000.qy6
        @yfb
        public final Boolean invoke(@yfb lw8 lw8Var) {
            return Boolean.valueOf(lw8Var.getNodes$ui_release().m28910hasH91voCI$ui_release(keb.m30687constructorimpl(8)));
        }
    }

    public txe(@yfb InterfaceC0701e.d dVar, boolean z, @yfb lw8 lw8Var, @yfb nxe nxeVar) {
        this.f86261a = dVar;
        this.f86262b = z;
        this.f86263c = lw8Var;
        this.f86264d = nxeVar;
        this.f86267g = lw8Var.getSemanticsId();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ List m22903a(txe txeVar, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        return txeVar.findOneLayerOfMergingSemanticsNodes(list);
    }

    private final void emitFakeNodes(List<txe> list) {
        jae role = vxe.getRole(this);
        if (role != null && this.f86264d.isMergingSemanticsOfDescendants() && !list.isEmpty()) {
            list.add(m32462fakeSemanticsNodeypyhhiA(role, new C13271a(role)));
        }
        nxe nxeVar = this.f86264d;
        zxe zxeVar = zxe.f106362a;
        if (nxeVar.contains(zxeVar.getContentDescription()) && !list.isEmpty() && this.f86264d.isMergingSemanticsOfDescendants()) {
            List list2 = (List) oxe.getOrNull(this.f86264d, zxeVar.getContentDescription());
            String str = list2 != null ? (String) v82.firstOrNull(list2) : null;
            if (str != null) {
                list.add(0, m32462fakeSemanticsNodeypyhhiA(null, new C13272b(str)));
            }
        }
    }

    /* JADX INFO: renamed from: fakeSemanticsNode-ypyhhiA, reason: not valid java name */
    private final txe m32462fakeSemanticsNodeypyhhiA(jae jaeVar, qy6<? super eye, bth> qy6Var) {
        nxe nxeVar = new nxe();
        nxeVar.setMergingSemanticsOfDescendants(false);
        nxeVar.setClearingSemantics(false);
        qy6Var.invoke(nxeVar);
        txe txeVar = new txe(new C13273c(qy6Var), false, new lw8(true, jaeVar != null ? vxe.roleFakeNodeId(this) : vxe.contentDescriptionFakeNodeId(this)), nxeVar);
        txeVar.f86265e = true;
        txeVar.f86266f = this;
        return txeVar;
    }

    private final void fillOneLayerOfSemanticsWrappers(lw8 lw8Var, List<txe> list, boolean z) {
        f7b<lw8> zSortedChildren = lw8Var.getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            lw8[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                lw8 lw8Var2 = content[i];
                if (lw8Var2.isAttached() && (z || !lw8Var2.isDeactivated())) {
                    if (lw8Var2.getNodes$ui_release().m28910hasH91voCI$ui_release(keb.m30687constructorimpl(8))) {
                        list.add(vxe.SemanticsNode(lw8Var2, this.f86262b));
                    } else {
                        fillOneLayerOfSemanticsWrappers(lw8Var2, list, z);
                    }
                }
                i++;
            } while (i < size);
        }
    }

    private final List<txe> findOneLayerOfMergingSemanticsNodes(List<txe> list) {
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            txe txeVar = (txe) listUnmergedChildren$ui_release$default.get(i);
            if (txeVar.isMergingSemanticsOfDescendants()) {
                list.add(txeVar);
            } else if (!txeVar.f86264d.isClearingSemantics()) {
                txeVar.findOneLayerOfMergingSemanticsNodes(list);
            }
        }
        return list;
    }

    public static /* synthetic */ List getChildren$ui_release$default(txe txeVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = !txeVar.f86262b;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        if ((i & 4) != 0) {
            z3 = false;
        }
        return txeVar.getChildren$ui_release(z, z2, z3);
    }

    private final boolean isMergingSemanticsOfDescendants() {
        return this.f86262b && this.f86264d.isMergingSemanticsOfDescendants();
    }

    private final void mergeConfig(nxe nxeVar) {
        if (this.f86264d.isClearingSemantics()) {
            return;
        }
        List listUnmergedChildren$ui_release$default = unmergedChildren$ui_release$default(this, false, false, 3, null);
        int size = listUnmergedChildren$ui_release$default.size();
        for (int i = 0; i < size; i++) {
            txe txeVar = (txe) listUnmergedChildren$ui_release$default.get(i);
            if (!txeVar.isMergingSemanticsOfDescendants()) {
                nxeVar.mergeChild$ui_release(txeVar.f86264d);
                txeVar.mergeConfig(nxeVar);
            }
        }
    }

    public static /* synthetic */ List unmergedChildren$ui_release$default(txe txeVar, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = false;
        }
        return txeVar.unmergedChildren$ui_release(z, z2);
    }

    @yfb
    public final txe copyWithMergingEnabled$ui_release() {
        return new txe(this.f86261a, true, this.f86263c, this.f86264d);
    }

    @gib
    public final heb findCoordinatorToGetBounds$ui_release() {
        if (this.f86265e) {
            txe parent = getParent();
            if (parent != null) {
                return parent.findCoordinatorToGetBounds$ui_release();
            }
            return null;
        }
        v34 outerMergingSemantics = vxe.getOuterMergingSemantics(this.f86263c);
        if (outerMergingSemantics == null) {
            outerMergingSemantics = this.f86261a;
        }
        return w34.m32852requireCoordinator64DMado(outerMergingSemantics, keb.m30687constructorimpl(8));
    }

    public final int getAlignmentLinePosition(@yfb AbstractC9938nm abstractC9938nm) {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            return hebVarFindCoordinatorToGetBounds$ui_release.get(abstractC9938nm);
        }
        return Integer.MIN_VALUE;
    }

    @yfb
    public final rud getBoundsInParent$ui_release() {
        mv8 coordinates;
        txe parent = getParent();
        if (parent == null) {
            return rud.f79687e.getZero();
        }
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null && (coordinates = hebVarFindCoordinatorToGetBounds$ui_release.getCoordinates()) != null) {
                return mv8.localBoundingBoxOf$default(w34.m32852requireCoordinator64DMado(parent.f86261a, keb.m30687constructorimpl(8)), coordinates, false, 2, null);
            }
        }
        return rud.f79687e.getZero();
    }

    @yfb
    public final rud getBoundsInRoot() {
        rud rudVarBoundsInRoot;
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null && (rudVarBoundsInRoot = nv8.boundsInRoot(hebVarFindCoordinatorToGetBounds$ui_release)) != null) {
                return rudVarBoundsInRoot;
            }
        }
        return rud.f79687e.getZero();
    }

    @yfb
    public final rud getBoundsInWindow() {
        rud rudVarBoundsInWindow;
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null && (rudVarBoundsInWindow = nv8.boundsInWindow(hebVarFindCoordinatorToGetBounds$ui_release)) != null) {
                return rudVarBoundsInWindow;
            }
        }
        return rud.f79687e.getZero();
    }

    @yfb
    public final List<txe> getChildren() {
        return getChildren$ui_release$default(this, false, false, false, 7, null);
    }

    @yfb
    public final List<txe> getChildren$ui_release(boolean z, boolean z2, boolean z3) {
        return (z || !this.f86264d.isClearingSemantics()) ? isMergingSemanticsOfDescendants() ? m22903a(this, null, 1, null) : unmergedChildren$ui_release(z2, z3) : l82.emptyList();
    }

    @yfb
    public final nxe getConfig() {
        if (!isMergingSemanticsOfDescendants()) {
            return this.f86264d;
        }
        nxe nxeVarCopy = this.f86264d.copy();
        mergeConfig(nxeVarCopy);
        return nxeVarCopy;
    }

    public final int getId() {
        return this.f86267g;
    }

    @yfb
    public final xv8 getLayoutInfo() {
        return this.f86263c;
    }

    @yfb
    public final lw8 getLayoutNode$ui_release() {
        return this.f86263c;
    }

    public final boolean getMergingEnabled() {
        return this.f86262b;
    }

    @yfb
    public final InterfaceC0701e.d getOuterSemanticsNode$ui_release() {
        return this.f86261a;
    }

    @gib
    public final txe getParent() {
        txe txeVar = this.f86266f;
        if (txeVar != null) {
            return txeVar;
        }
        lw8 lw8VarFindClosestParentNode = this.f86262b ? vxe.findClosestParentNode(this.f86263c, C13275e.f86272a) : null;
        if (lw8VarFindClosestParentNode == null) {
            lw8VarFindClosestParentNode = vxe.findClosestParentNode(this.f86263c, C13276f.f86273a);
        }
        if (lw8VarFindClosestParentNode == null) {
            return null;
        }
        return vxe.SemanticsNode(lw8VarFindClosestParentNode, this.f86262b);
    }

    /* JADX INFO: renamed from: getPositionInRoot-F1C5BW0, reason: not valid java name */
    public final long m32463getPositionInRootF1C5BW0() {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
                return nv8.positionInRoot(hebVarFindCoordinatorToGetBounds$ui_release);
            }
        }
        return izb.f49009b.m30445getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionInWindow-F1C5BW0, reason: not valid java name */
    public final long m32464getPositionInWindowF1C5BW0() {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
                return nv8.positionInWindow(hebVarFindCoordinatorToGetBounds$ui_release);
            }
        }
        return izb.f49009b.m30445getZeroF1C5BW0();
    }

    /* JADX INFO: renamed from: getPositionOnScreen-F1C5BW0, reason: not valid java name */
    public final long m32465getPositionOnScreenF1C5BW0() {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            if (!hebVarFindCoordinatorToGetBounds$ui_release.isAttached()) {
                hebVarFindCoordinatorToGetBounds$ui_release = null;
            }
            if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
                return nv8.positionOnScreen(hebVarFindCoordinatorToGetBounds$ui_release);
            }
        }
        return izb.f49009b.m30445getZeroF1C5BW0();
    }

    @yfb
    public final List<txe> getReplacedChildren$ui_release() {
        return getChildren$ui_release$default(this, false, true, false, 4, null);
    }

    @gib
    public final cbe getRoot() {
        z9c owner$ui_release = this.f86263c.getOwner$ui_release();
        if (owner$ui_release != null) {
            return owner$ui_release.getRootForTest();
        }
        return null;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g, reason: not valid java name */
    public final long m32466getSizeYbymL2g() {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        return hebVarFindCoordinatorToGetBounds$ui_release != null ? hebVarFindCoordinatorToGetBounds$ui_release.mo30031getSizeYbymL2g() : r78.f77324b.m32092getZeroYbymL2g();
    }

    @yfb
    public final rud getTouchBoundsInRoot() {
        v34 outerMergingSemantics;
        if (!this.f86264d.isMergingSemanticsOfDescendants() || (outerMergingSemantics = vxe.getOuterMergingSemantics(this.f86263c)) == null) {
            outerMergingSemantics = this.f86261a;
        }
        return sxe.touchBoundsInRoot(outerMergingSemantics.getNode(), sxe.getUseMinimumTouchTarget(this.f86264d));
    }

    @yfb
    public final nxe getUnmergedConfig$ui_release() {
        return this.f86264d;
    }

    public final boolean isFake$ui_release() {
        return this.f86265e;
    }

    public final boolean isRoot() {
        return getParent() == null;
    }

    public final boolean isTransparent$ui_release() {
        heb hebVarFindCoordinatorToGetBounds$ui_release = findCoordinatorToGetBounds$ui_release();
        if (hebVarFindCoordinatorToGetBounds$ui_release != null) {
            return hebVarFindCoordinatorToGetBounds$ui_release.isTransparent();
        }
        return false;
    }

    public final boolean isUnmergedLeafNode$ui_release() {
        return !this.f86265e && getReplacedChildren$ui_release().isEmpty() && vxe.findClosestParentNode(this.f86263c, C13274d.f86271a) == null;
    }

    public final void setFake$ui_release(boolean z) {
        this.f86265e = z;
    }

    @yfb
    public final List<txe> unmergedChildren$ui_release(boolean z, boolean z2) {
        if (this.f86265e) {
            return l82.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        fillOneLayerOfSemanticsWrappers(this.f86263c, arrayList, z2);
        if (z) {
            emitFakeNodes(arrayList);
        }
        return arrayList;
    }
}
