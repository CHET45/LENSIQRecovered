package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.focus.InterfaceC0720i;
import androidx.compose.p002ui.layout.InterfaceC0761n;
import java.util.HashSet;
import p000.z9c;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 4 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 6 DelegatableNode.kt\nandroidx/compose/ui/node/DelegatableNodeKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 DelegatingNode.kt\nandroidx/compose/ui/node/DelegatingNode\n+ 9 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,452:1\n42#2,7:453\n42#2,7:466\n42#2,7:556\n42#2,7:563\n84#3:460\n80#3:462\n84#3:473\n78#3:475\n76#3:477\n88#3:479\n90#3:481\n82#3:485\n80#3:487\n88#3:489\n84#3:490\n264#4:461\n264#4:463\n264#4:474\n264#4:476\n264#4:478\n264#4:480\n264#4:482\n264#4:486\n264#4:488\n264#4:512\n735#5,2:464\n728#5,2:483\n251#6,5:491\n62#6:496\n63#6,8:498\n432#6,6:506\n442#6,2:513\n444#6,8:518\n452#6,9:529\n461#6,8:541\n72#6,7:549\n1#7:497\n245#8,3:515\n248#8,3:538\n1208#9:526\n1187#9,2:527\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode\n*L\n115#1:453,7\n136#1:466,7\n416#1:556,7\n424#1:563,7\n117#1:460\n127#1:462\n138#1:473\n146#1:475\n154#1:477\n170#1:479\n195#1:481\n208#1:485\n213#1:487\n223#1:489\n259#1:490\n117#1:461\n127#1:463\n138#1:474\n146#1:476\n154#1:478\n170#1:480\n195#1:482\n208#1:486\n213#1:488\n259#1:512\n131#1:464,2\n206#1:483,2\n259#1:491,5\n259#1:496\n259#1:498,8\n259#1:506,6\n259#1:513,2\n259#1:518,8\n259#1:529,9\n259#1:541,8\n259#1:549,7\n259#1:497\n259#1:515,3\n259#1:538,3\n259#1:526\n259#1:527,2\n*E\n"})
@e0g(parameters = 0)
public final class dp0 extends InterfaceC0701e.d implements ew8, fp4, rxe, p2d, mxa, qxa, bhc, iv8, o77, nm6, an6, gn6, aac, of1 {

    /* JADX INFO: renamed from: Z1 */
    public static final int f30298Z1 = 8;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public HashSet<fxa<?>> f30299M1;

    /* JADX INFO: renamed from: V1 */
    @gib
    public mv8 f30300V1;

    /* JADX INFO: renamed from: X */
    @yfb
    public InterfaceC0701e.c f30301X;

    /* JADX INFO: renamed from: Y */
    public boolean f30302Y;

    /* JADX INFO: renamed from: Z */
    @gib
    public cp0 f30303Z;

    /* JADX INFO: renamed from: dp0$a */
    public static final class C4895a extends tt8 implements ny6<bth> {
        public C4895a() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            dp0.this.updateModifierLocalConsumer();
        }
    }

    /* JADX INFO: renamed from: dp0$b */
    @dwf({"SMAP\nBackwardsCompatNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,452:1\n88#2:453\n*S KotlinDebug\n*F\n+ 1 BackwardsCompatNode.kt\nandroidx/compose/ui/node/BackwardsCompatNode$initializeModifier$3\n*L\n187#1:453\n*E\n"})
    public static final class C4896b implements z9c.InterfaceC16043b {
        public C4896b() {
        }

        @Override // p000.z9c.InterfaceC16043b
        public void onLayoutComplete() {
            if (dp0.this.f30300V1 == null) {
                dp0 dp0Var = dp0.this;
                dp0Var.onPlaced(w34.m32852requireCoordinator64DMado(dp0Var, keb.m30687constructorimpl(128)));
            }
        }
    }

    /* JADX INFO: renamed from: dp0$c */
    public static final class C4897c extends tt8 implements ny6<bth> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC0701e.c f30306a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ dp0 f30307b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4897c(InterfaceC0701e.c cVar, dp0 dp0Var) {
            super(0);
            this.f30306a = cVar;
            this.f30307b = dp0Var;
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            ((ap4) this.f30306a).onBuildCache(this.f30307b);
        }
    }

    /* JADX INFO: renamed from: dp0$d */
    public static final class C4898d extends tt8 implements ny6<bth> {
        public C4898d() {
            super(0);
        }

        @Override // p000.ny6
        public /* bridge */ /* synthetic */ bth invoke() {
            invoke2();
            return bth.f14751a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            InterfaceC0701e.c element = dp0.this.getElement();
            md8.checkNotNull(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
            ((gxa) element).onModifierLocalsUpdated(dp0.this);
        }
    }

    public dp0(@yfb InterfaceC0701e.c cVar) {
        setKindSet$ui_release(leb.calculateNodeKindSetFrom(cVar));
        this.f30301X = cVar;
        this.f30302Y = true;
        this.f30299M1 = new HashSet<>();
    }

    private final void initializeModifier(boolean z) {
        if (!isAttached()) {
            g28.throwIllegalStateException("initializeModifier called on unattached node");
        }
        InterfaceC0701e.c cVar = this.f30301X;
        if ((keb.m30687constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (cVar instanceof gxa) {
                sideEffect(new C4895a());
            }
            if (cVar instanceof oxa) {
                updateModifierLocalProvider((oxa) cVar);
            }
        }
        if ((keb.m30687constructorimpl(4) & getKindSet$ui_release()) != 0) {
            if (cVar instanceof ap4) {
                this.f30302Y = true;
            }
            if (!z) {
                hw8.invalidateLayer(this);
            }
        }
        if ((keb.m30687constructorimpl(2) & getKindSet$ui_release()) != 0) {
            if (ep0.isChainUpdate(this)) {
                heb coordinator$ui_release = getCoordinator$ui_release();
                md8.checkNotNull(coordinator$ui_release);
                ((fw8) coordinator$ui_release).setLayoutModifierNode$ui_release(this);
                coordinator$ui_release.onLayoutModifierNodeChanged();
            }
            if (!z) {
                hw8.invalidateLayer(this);
                w34.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
        }
        if (cVar instanceof cyd) {
            ((cyd) cVar).onRemeasurementAvailable(w34.requireLayoutNode(this));
        }
        if ((keb.m30687constructorimpl(128) & getKindSet$ui_release()) != 0) {
            if ((cVar instanceof n4c) && ep0.isChainUpdate(this)) {
                w34.requireLayoutNode(this).invalidateMeasurements$ui_release();
            }
            if (cVar instanceof e4c) {
                this.f30300V1 = null;
                if (ep0.isChainUpdate(this)) {
                    w34.requireOwner(this).registerOnLayoutCompletedListener(new C4896b());
                }
            }
        }
        if ((keb.m30687constructorimpl(256) & getKindSet$ui_release()) != 0 && (cVar instanceof x2c) && ep0.isChainUpdate(this)) {
            w34.requireLayoutNode(this).invalidateMeasurements$ui_release();
        }
        if (cVar instanceof fn6) {
            ((fn6) cVar).getFocusRequester().getFocusRequesterNodes$ui_release().add(this);
        }
        if ((keb.m30687constructorimpl(16) & getKindSet$ui_release()) != 0 && (cVar instanceof o2d)) {
            ((o2d) cVar).getPointerInputFilter().setLayoutCoordinates$ui_release(getCoordinator$ui_release());
        }
        if ((keb.m30687constructorimpl(8) & getKindSet$ui_release()) != 0) {
            w34.requireOwner(this).onSemanticsChange();
        }
    }

    private final void unInitializeModifier() {
        if (!isAttached()) {
            g28.throwIllegalStateException("unInitializeModifier called on unattached node");
        }
        InterfaceC0701e.c cVar = this.f30301X;
        if ((keb.m30687constructorimpl(32) & getKindSet$ui_release()) != 0) {
            if (cVar instanceof oxa) {
                w34.requireOwner(this).getModifierLocalManager().removedProvider(this, ((oxa) cVar).getKey());
            }
            if (cVar instanceof gxa) {
                ((gxa) cVar).onModifierLocalsUpdated(ep0.f33760a);
            }
        }
        if ((keb.m30687constructorimpl(8) & getKindSet$ui_release()) != 0) {
            w34.requireOwner(this).onSemanticsChange();
        }
        if (cVar instanceof fn6) {
            ((fn6) cVar).getFocusRequester().getFocusRequesterNodes$ui_release().remove(this);
        }
    }

    private final void updateDrawCache() {
        InterfaceC0701e.c cVar = this.f30301X;
        if (cVar instanceof ap4) {
            w34.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, ep0.f33761b, new C4897c(cVar, this));
        }
        this.f30302Y = false;
    }

    private final void updateModifierLocalProvider(oxa<?> oxaVar) {
        cp0 cp0Var = this.f30303Z;
        if (cp0Var != null && cp0Var.contains$ui_release(oxaVar.getKey())) {
            cp0Var.setElement(oxaVar);
            w34.requireOwner(this).getModifierLocalManager().updatedProvider(this, oxaVar.getKey());
        } else {
            this.f30303Z = new cp0(oxaVar);
            if (ep0.isChainUpdate(this)) {
                w34.requireOwner(this).getModifierLocalManager().insertedProvider(this, oxaVar.getKey());
            }
        }
    }

    @Override // p000.an6
    public void applyFocusProperties(@yfb InterfaceC0720i interfaceC0720i) {
        InterfaceC0701e.c cVar = this.f30301X;
        if (!(cVar instanceof wm6)) {
            g28.throwIllegalStateException("applyFocusProperties called on wrong node");
        }
        ((wm6) cVar).populateFocusOrder(new vm6(interfaceC0720i));
    }

    @Override // p000.rxe
    public void applySemantics(@yfb eye eyeVar) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        nxe semanticsConfiguration = ((pxe) cVar).getSemanticsConfiguration();
        md8.checkNotNull(eyeVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((nxe) eyeVar).collapsePeer$ui_release(semanticsConfiguration);
    }

    @Override // p000.fp4
    public void draw(@yfb ov2 ov2Var) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ep4 ep4Var = (ep4) cVar;
        if (this.f30302Y && (cVar instanceof ap4)) {
            updateDrawCache();
        }
        ep4Var.draw(ov2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [androidx.compose.ui.e$d] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.compose.ui.e$d] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [f7b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [f7b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // p000.mxa, p000.qxa
    public <T> T getCurrent(@yfb fxa<T> fxaVar) {
        feb nodes$ui_release;
        this.f30299M1.add(fxaVar);
        int iM30687constructorimpl = keb.m30687constructorimpl(32);
        if (!getNode().isAttached()) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        InterfaceC0701e.d parent$ui_release = getNode().getParent$ui_release();
        lw8 lw8VarRequireLayoutNode = w34.requireLayoutNode(this);
        while (lw8VarRequireLayoutNode != null) {
            if ((lw8VarRequireLayoutNode.getNodes$ui_release().getHead$ui_release().getAggregateChildKindSet$ui_release() & iM30687constructorimpl) != 0) {
                while (parent$ui_release != null) {
                    if ((parent$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                        ?? Pop = parent$ui_release;
                        ?? f7bVar = 0;
                        while (Pop != 0) {
                            if (Pop instanceof mxa) {
                                mxa mxaVar = (mxa) Pop;
                                if (mxaVar.getProvidedValues().contains$ui_release(fxaVar)) {
                                    return (T) mxaVar.getProvidedValues().get$ui_release(fxaVar);
                                }
                            } else if ((Pop.getKindSet$ui_release() & iM30687constructorimpl) != 0 && (Pop instanceof d44)) {
                                InterfaceC0701e.d delegate$ui_release = ((d44) Pop).getDelegate$ui_release();
                                int i = 0;
                                Pop = Pop;
                                f7bVar = f7bVar;
                                while (delegate$ui_release != null) {
                                    if ((delegate$ui_release.getKindSet$ui_release() & iM30687constructorimpl) != 0) {
                                        i++;
                                        f7bVar = f7bVar;
                                        if (i == 1) {
                                            Pop = delegate$ui_release;
                                        } else {
                                            if (f7bVar == 0) {
                                                f7bVar = new f7b(new InterfaceC0701e.d[16], 0);
                                            }
                                            if (Pop != 0) {
                                                f7bVar.add(Pop);
                                                Pop = 0;
                                            }
                                            f7bVar.add(delegate$ui_release);
                                        }
                                    }
                                    delegate$ui_release = delegate$ui_release.getChild$ui_release();
                                    Pop = Pop;
                                    f7bVar = f7bVar;
                                }
                                if (i == 1) {
                                }
                            }
                            Pop = w34.pop(f7bVar);
                        }
                    }
                    parent$ui_release = parent$ui_release.getParent$ui_release();
                }
            }
            lw8VarRequireLayoutNode = lw8VarRequireLayoutNode.getParent$ui_release();
            parent$ui_release = (lw8VarRequireLayoutNode == null || (nodes$ui_release = lw8VarRequireLayoutNode.getNodes$ui_release()) == null) ? null : nodes$ui_release.getTail$ui_release();
        }
        return fxaVar.getDefaultFactory$ui_release().invoke();
    }

    @Override // p000.of1
    @yfb
    public c64 getDensity() {
        return w34.requireLayoutNode(this).getDensity();
    }

    @yfb
    public final InterfaceC0701e.c getElement() {
        return this.f30301X;
    }

    @Override // p000.of1
    @yfb
    public ov8 getLayoutDirection() {
        return w34.requireLayoutNode(this).getLayoutDirection();
    }

    @Override // p000.mxa
    @yfb
    public lxa getProvidedValues() {
        cp0 cp0Var = this.f30303Z;
        return cp0Var != null ? cp0Var : nxa.modifierLocalMapOf();
    }

    @yfb
    public final HashSet<fxa<?>> getReadValues() {
        return this.f30299M1;
    }

    @Override // p000.of1
    /* JADX INFO: renamed from: getSize-NH-jbRc, reason: not valid java name */
    public long mo28660getSizeNHjbRc() {
        return s78.m32288toSizeozmzZPI(w34.m32852requireCoordinator64DMado(this, keb.m30687constructorimpl(128)).mo30031getSizeYbymL2g());
    }

    @Override // p000.p2d
    public boolean interceptOutOfBoundsChildEvents() {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((o2d) cVar).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return isAttached();
    }

    @Override // p000.ew8
    public int maxIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((cw8) cVar).maxIntrinsicHeight(gd8Var, ed8Var, i);
    }

    @Override // p000.ew8
    public int maxIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((cw8) cVar).maxIntrinsicWidth(gd8Var, ed8Var, i);
    }

    @Override // p000.ew8
    @yfb
    /* JADX INFO: renamed from: measure-3p2s80s */
    public vba mo27276measure3p2s80s(@yfb InterfaceC0761n interfaceC0761n, @yfb rba rbaVar, long j) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((cw8) cVar).mo27254measure3p2s80s(interfaceC0761n, rbaVar, j);
    }

    @Override // p000.ew8
    public int minIntrinsicHeight(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((cw8) cVar).minIntrinsicHeight(gd8Var, ed8Var, i);
    }

    @Override // p000.ew8
    public int minIntrinsicWidth(@yfb gd8 gd8Var, @yfb ed8 ed8Var, int i) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((cw8) cVar).minIntrinsicWidth(gd8Var, ed8Var, i);
    }

    @Override // p000.bhc
    @gib
    public Object modifyParentData(@yfb c64 c64Var, @gib Object obj) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((ahc) cVar).modifyParentData(c64Var, obj);
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onAttach() {
        initializeModifier(true);
    }

    @Override // p000.p2d
    public void onCancelPointerInput() {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o2d) cVar).getPointerInputFilter().onCancel();
    }

    @Override // androidx.compose.p002ui.InterfaceC0701e.d
    public void onDetach() {
        unInitializeModifier();
    }

    public final void onDrawCacheReadsChanged$ui_release() {
        this.f30302Y = true;
        gp4.invalidateDraw(this);
    }

    @Override // p000.nm6
    public void onFocusEvent(@yfb in6 in6Var) {
        InterfaceC0701e.c cVar = this.f30301X;
        if (!(cVar instanceof mm6)) {
            g28.throwIllegalStateException("onFocusEvent called on wrong node");
        }
        ((mm6) cVar).onFocusEvent(in6Var);
    }

    @Override // p000.o77
    public void onGloballyPositioned(@yfb mv8 mv8Var) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((x2c) cVar).onGloballyPositioned(mv8Var);
    }

    @Override // p000.fp4
    public void onMeasureResultChanged() {
        this.f30302Y = true;
        gp4.invalidateDraw(this);
    }

    @Override // p000.iv8
    public void onPlaced(@yfb mv8 mv8Var) {
        this.f30300V1 = mv8Var;
        InterfaceC0701e.c cVar = this.f30301X;
        if (cVar instanceof e4c) {
            ((e4c) cVar).onPlaced(mv8Var);
        }
    }

    @Override // p000.p2d
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo27219onPointerEventH0pRuoY(@yfb t1d t1dVar, @yfb v1d v1dVar, long j) {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((o2d) cVar).getPointerInputFilter().mo31119onPointerEventH0pRuoY(t1dVar, v1dVar, j);
    }

    @Override // p000.iv8
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI */
    public void mo27780onRemeasuredozmzZPI(long j) {
        InterfaceC0701e.c cVar = this.f30301X;
        if (cVar instanceof n4c) {
            ((n4c) cVar).m31130onRemeasuredozmzZPI(j);
        }
    }

    public final void setElement(@yfb InterfaceC0701e.c cVar) {
        if (isAttached()) {
            unInitializeModifier();
        }
        this.f30301X = cVar;
        setKindSet$ui_release(leb.calculateNodeKindSetFrom(cVar));
        if (isAttached()) {
            initializeModifier(false);
        }
    }

    public final void setReadValues(@yfb HashSet<fxa<?>> hashSet) {
        this.f30299M1 = hashSet;
    }

    @Override // p000.p2d
    public boolean sharePointerInputWithSiblings() {
        InterfaceC0701e.c cVar = this.f30301X;
        md8.checkNotNull(cVar, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((o2d) cVar).getPointerInputFilter().getShareWithSiblings();
    }

    @yfb
    public String toString() {
        return this.f30301X.toString();
    }

    public final void updateModifierLocalConsumer() {
        if (isAttached()) {
            this.f30299M1.clear();
            w34.requireOwner(this).getSnapshotObserver().observeReads$ui_release(this, ep0.f33762c, new C4898d());
        }
    }
}
