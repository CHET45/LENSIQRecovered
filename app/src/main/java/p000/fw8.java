package p000;

import androidx.compose.p002ui.InterfaceC0701e;
import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import androidx.compose.p002ui.layout.C0751d;
import androidx.compose.p002ui.layout.InterfaceC0749b;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,321:1\n92#2:322\n92#2:324\n264#3:323\n264#3:325\n306#4,2:326\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n78#1:322\n49#1:324\n78#1:323\n49#1:325\n157#1:326,2\n*E\n"})
@e0g(parameters = 1)
public final class fw8 extends heb {

    /* JADX INFO: renamed from: I2 */
    @yfb
    public static final C6001a f37865I2 = new C6001a(null);

    /* JADX INFO: renamed from: J2 */
    public static final int f37866J2 = 0;

    /* JADX INFO: renamed from: K2 */
    @yfb
    public static final icc f37867K2;

    /* JADX INFO: renamed from: E2 */
    @yfb
    public ew8 f37868E2;

    /* JADX INFO: renamed from: F2 */
    @gib
    public ku2 f37869F2;

    /* JADX INFO: renamed from: G2 */
    @gib
    public lm9 f37870G2;

    /* JADX INFO: renamed from: H2 */
    @gib
    public C0751d f37871H2;

    /* JADX INFO: renamed from: fw8$a */
    public static final class C6001a {
        public /* synthetic */ C6001a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final icc getModifierBoundsPaint() {
            return fw8.f37867K2;
        }

        private C6001a() {
        }
    }

    /* JADX INFO: renamed from: fw8$b */
    @dwf({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,321:1\n451#2,3:322\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n91#1:322,3\n*E\n"})
    public final class C6002b extends lm9 {
        public C6002b() {
            super(fw8.this);
        }

        @Override // p000.km9
        public int calculateAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
            int iCalculateAlignmentAndPlaceChildAsNeeded = gw8.calculateAlignmentAndPlaceChildAsNeeded(this, abstractC9938nm);
            m16230i().put(abstractC9938nm, Integer.valueOf(iCalculateAlignmentAndPlaceChildAsNeeded));
            return iCalculateAlignmentAndPlaceChildAsNeeded;
        }

        @Override // p000.lm9, p000.ed8
        public int maxIntrinsicHeight(int i) {
            ew8 layoutModifierNode = fw8.this.getLayoutModifierNode();
            lm9 lookaheadDelegate = fw8.this.getWrappedNonNull().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // p000.lm9, p000.ed8
        public int maxIntrinsicWidth(int i) {
            ew8 layoutModifierNode = fw8.this.getLayoutModifierNode();
            lm9 lookaheadDelegate = fw8.this.getWrappedNonNull().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.maxIntrinsicWidth(this, lookaheadDelegate, i);
        }

        @Override // p000.rba
        @yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public AbstractC0767t mo27949measureBRTryo0(long j) {
            fw8 fw8Var = fw8.this;
            m1213g(j);
            fw8Var.m29675setLookaheadConstraints_Sx5XlM$ui_release(ku2.m30751boximpl(j));
            ew8 layoutModifierNode = fw8Var.getLayoutModifierNode();
            lm9 lookaheadDelegate = fw8Var.getWrappedNonNull().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            set_measureResult(layoutModifierNode.mo27276measure3p2s80s(this, lookaheadDelegate, j));
            return this;
        }

        @Override // p000.lm9, p000.ed8
        public int minIntrinsicHeight(int i) {
            ew8 layoutModifierNode = fw8.this.getLayoutModifierNode();
            lm9 lookaheadDelegate = fw8.this.getWrappedNonNull().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicHeight(this, lookaheadDelegate, i);
        }

        @Override // p000.lm9, p000.ed8
        public int minIntrinsicWidth(int i) {
            ew8 layoutModifierNode = fw8.this.getLayoutModifierNode();
            lm9 lookaheadDelegate = fw8.this.getWrappedNonNull().getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.minIntrinsicWidth(this, lookaheadDelegate, i);
        }
    }

    /* JADX INFO: renamed from: fw8$c */
    public static final class C6003c implements vba {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ vba f37873a;

        /* JADX INFO: renamed from: b */
        public final int f37874b;

        /* JADX INFO: renamed from: c */
        public final int f37875c;

        public C6003c(vba vbaVar, fw8 fw8Var) {
            this.f37873a = vbaVar;
            lm9 lookaheadDelegate = fw8Var.getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            this.f37874b = lookaheadDelegate.getWidth();
            lm9 lookaheadDelegate2 = fw8Var.getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate2);
            this.f37875c = lookaheadDelegate2.getHeight();
        }

        @Override // p000.vba
        @yfb
        public Map<AbstractC9938nm, Integer> getAlignmentLines() {
            return this.f37873a.getAlignmentLines();
        }

        @Override // p000.vba
        public int getHeight() {
            return this.f37875c;
        }

        @Override // p000.vba
        @gib
        public qy6<rce, bth> getRulers() {
            return this.f37873a.getRulers();
        }

        @Override // p000.vba
        public int getWidth() {
            return this.f37874b;
        }

        @Override // p000.vba
        public void placeChildren() {
            this.f37873a.placeChildren();
        }
    }

    static {
        icc iccVarPaint = C14793wt.Paint();
        iccVarPaint.mo30199setColor8_81llA(w82.f93556b.m32978getBlue0d7_KjU());
        iccVarPaint.setStrokeWidth(1.0f);
        iccVarPaint.mo30203setStylek9PVt8s(rcc.f77828b.m32115getStrokeTiuSbCo());
        f37867K2 = iccVarPaint;
    }

    public fw8(@yfb lw8 lw8Var, @yfb ew8 ew8Var) {
        super(lw8Var);
        this.f37868E2 = ew8Var;
        C0751d c0751d = null;
        this.f37870G2 = lw8Var.getLookaheadRoot$ui_release() != null ? new C6002b() : null;
        if ((ew8Var.getNode().getKindSet$ui_release() & keb.m30687constructorimpl(512)) != 0) {
            md8.checkNotNull(ew8Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            c0751d = new C0751d(this, (InterfaceC0749b) ew8Var);
        }
        this.f37871H2 = c0751d;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onAfterPlaceAt() {
        /*
            r7 = this;
            boolean r0 = r7.isShallowPlacing$ui_release()
            if (r0 == 0) goto L7
            return
        L7:
            r7.onPlaced()
            androidx.compose.ui.layout.d r0 = r7.f37871H2
            r1 = 0
            if (r0 == 0) goto L73
            androidx.compose.ui.layout.b r2 = r0.getApproachNode()
            androidx.compose.ui.layout.t$a r3 = r7.getPlacementScope()
            lm9 r4 = r7.getLookaheadDelegate()
            p000.md8.checkNotNull(r4)
            nm9 r4 = r4.getLookaheadLayoutCoordinates()
            boolean r2 = r2.isPlacementApproachInProgress(r3, r4)
            if (r2 != 0) goto L6b
            boolean r0 = r0.getApproachMeasureRequired$ui_release()
            if (r0 != 0) goto L6b
            long r2 = r7.mo30031getSizeYbymL2g()
            lm9 r0 = r7.getLookaheadDelegate()
            r4 = 0
            if (r0 == 0) goto L42
            long r5 = r0.m30870getSizeYbymL2g$ui_release()
            r78 r0 = p000.r78.m32079boximpl(r5)
            goto L43
        L42:
            r0 = r4
        L43:
            boolean r0 = p000.r78.m32084equalsimpl(r2, r0)
            if (r0 == 0) goto L6b
            heb r0 = r7.getWrappedNonNull()
            long r2 = r0.mo30031getSizeYbymL2g()
            heb r0 = r7.getWrappedNonNull()
            lm9 r0 = r0.getLookaheadDelegate()
            if (r0 == 0) goto L63
            long r4 = r0.m30870getSizeYbymL2g$ui_release()
            r78 r4 = p000.r78.m32079boximpl(r4)
        L63:
            boolean r0 = p000.r78.m32084equalsimpl(r2, r4)
            if (r0 == 0) goto L6b
            r0 = 1
            goto L6c
        L6b:
            r0 = r1
        L6c:
            heb r2 = r7.getWrappedNonNull()
            r2.setForcePlaceWithLookaheadOffset$ui_release(r0)
        L73:
            vba r0 = r7.getMeasureResult$ui_release()
            r0.placeChildren()
            heb r0 = r7.getWrappedNonNull()
            r0.setForcePlaceWithLookaheadOffset$ui_release(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fw8.onAfterPlaceAt():void");
    }

    @Override // p000.km9
    public int calculateAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
        lm9 lookaheadDelegate = getLookaheadDelegate();
        return lookaheadDelegate != null ? lookaheadDelegate.getCachedAlignmentLine$ui_release(abstractC9938nm) : gw8.calculateAlignmentAndPlaceChildAsNeeded(this, abstractC9938nm);
    }

    @Override // p000.heb, androidx.compose.p002ui.layout.AbstractC0767t
    /* JADX INFO: renamed from: d */
    public void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
        super.mo1210d(j, f, qy6Var);
        onAfterPlaceAt();
    }

    @Override // p000.heb, androidx.compose.p002ui.layout.AbstractC0767t
    /* JADX INFO: renamed from: e */
    public void mo1211e(long j, float f, @yfb u97 u97Var) {
        super.mo1211e(j, f, u97Var);
        onAfterPlaceAt();
    }

    @Override // p000.heb
    public void ensureLookaheadDelegateCreated() {
        if (getLookaheadDelegate() == null) {
            mo2871p(new C6002b());
        }
    }

    @yfb
    public final ew8 getLayoutModifierNode() {
        return this.f37868E2;
    }

    @gib
    /* JADX INFO: renamed from: getLookaheadConstraints-DWUhwKw$ui_release, reason: not valid java name */
    public final ku2 m29674getLookaheadConstraintsDWUhwKw$ui_release() {
        return this.f37869F2;
    }

    @Override // p000.heb
    @gib
    public lm9 getLookaheadDelegate() {
        return this.f37870G2;
    }

    @Override // p000.heb
    @yfb
    public InterfaceC0701e.d getTail() {
        return this.f37868E2.getNode();
    }

    @yfb
    public final heb getWrappedNonNull() {
        heb wrapped$ui_release = getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        return wrapped$ui_release;
    }

    @Override // p000.ed8
    public int maxIntrinsicHeight(int i) {
        C0751d c0751d = this.f37871H2;
        return c0751d != null ? c0751d.getApproachNode().maxApproachIntrinsicHeight(c0751d, getWrappedNonNull(), i) : this.f37868E2.maxIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // p000.ed8
    public int maxIntrinsicWidth(int i) {
        C0751d c0751d = this.f37871H2;
        return c0751d != null ? c0751d.getApproachNode().maxApproachIntrinsicWidth(c0751d, getWrappedNonNull(), i) : this.f37868E2.maxIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // p000.rba
    @p000.yfb
    /* JADX INFO: renamed from: measure-BRTryo0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public androidx.compose.p002ui.layout.AbstractC0767t mo27949measureBRTryo0(long r7) {
        /*
            r6 = this;
            boolean r0 = r6.getForceMeasureWithLookaheadConstraints$ui_release()
            if (r0 == 0) goto L17
            ku2 r7 = r6.f37869F2
            if (r7 == 0) goto Lf
            long r7 = r7.m30769unboximpl()
            goto L17
        Lf:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "Lookahead constraints cannot be null in approach pass."
            r7.<init>(r8)
            throw r7
        L17:
            p000.heb.m30014access$setMeasurementConstraintsBRTryo0(r6, r7)
            androidx.compose.ui.layout.d r0 = access$getApproachMeasureScope$p(r6)
            if (r0 == 0) goto Lb2
            androidx.compose.ui.layout.b r1 = r0.getApproachNode()
            long r2 = r0.mo27679getLookaheadSizeYbymL2g()
            boolean r2 = r1.mo27275isMeasurementApproachInProgressozmzZPI(r2)
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L3d
            ku2 r2 = r6.m29674getLookaheadConstraintsDWUhwKw$ui_release()
            boolean r2 = p000.ku2.m30755equalsimpl(r7, r2)
            if (r2 != 0) goto L3b
            goto L3d
        L3b:
            r2 = r4
            goto L3e
        L3d:
            r2 = r3
        L3e:
            r0.setApproachMeasureRequired$ui_release(r2)
            boolean r2 = r0.getApproachMeasureRequired$ui_release()
            if (r2 != 0) goto L4e
            heb r2 = r6.getWrappedNonNull()
            r2.setForceMeasureWithLookaheadConstraints$ui_release(r3)
        L4e:
            heb r2 = r6.getWrappedNonNull()
            vba r7 = r1.mo27274approachMeasure3p2s80s(r0, r2, r7)
            heb r8 = r6.getWrappedNonNull()
            r8.setForceMeasureWithLookaheadConstraints$ui_release(r4)
            int r8 = r7.getWidth()
            lm9 r1 = r6.getLookaheadDelegate()
            p000.md8.checkNotNull(r1)
            int r1 = r1.getWidth()
            if (r8 != r1) goto L80
            int r8 = r7.getHeight()
            lm9 r1 = r6.getLookaheadDelegate()
            p000.md8.checkNotNull(r1)
            int r1 = r1.getHeight()
            if (r8 != r1) goto L80
            goto L81
        L80:
            r3 = r4
        L81:
            boolean r8 = r0.getApproachMeasureRequired$ui_release()
            if (r8 != 0) goto Lbe
            heb r8 = r6.getWrappedNonNull()
            long r0 = r8.mo30031getSizeYbymL2g()
            heb r8 = r6.getWrappedNonNull()
            lm9 r8 = r8.getLookaheadDelegate()
            if (r8 == 0) goto La2
            long r4 = r8.m30870getSizeYbymL2g$ui_release()
            r78 r8 = p000.r78.m32079boximpl(r4)
            goto La3
        La2:
            r8 = 0
        La3:
            boolean r8 = p000.r78.m32084equalsimpl(r0, r8)
            if (r8 == 0) goto Lbe
            if (r3 != 0) goto Lbe
            fw8$c r8 = new fw8$c
            r8.<init>(r7, r6)
            r7 = r8
            goto Lbe
        Lb2:
            ew8 r0 = r6.getLayoutModifierNode()
            heb r1 = r6.getWrappedNonNull()
            vba r7 = r0.mo27276measure3p2s80s(r6, r1, r7)
        Lbe:
            r6.setMeasureResult$ui_release(r7)
            r6.onMeasured()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.fw8.mo27949measureBRTryo0(long):androidx.compose.ui.layout.t");
    }

    @Override // p000.ed8
    public int minIntrinsicHeight(int i) {
        C0751d c0751d = this.f37871H2;
        return c0751d != null ? c0751d.getApproachNode().minApproachIntrinsicHeight(c0751d, getWrappedNonNull(), i) : this.f37868E2.minIntrinsicHeight(this, getWrappedNonNull(), i);
    }

    @Override // p000.ed8
    public int minIntrinsicWidth(int i) {
        C0751d c0751d = this.f37871H2;
        return c0751d != null ? c0751d.getApproachNode().minApproachIntrinsicWidth(c0751d, getWrappedNonNull(), i) : this.f37868E2.minIntrinsicWidth(this, getWrappedNonNull(), i);
    }

    @Override // p000.heb
    /* JADX INFO: renamed from: p */
    public void mo2871p(@gib lm9 lm9Var) {
        this.f37870G2 = lm9Var;
    }

    @Override // p000.heb
    public void performDraw(@yfb vq1 vq1Var, @gib u97 u97Var) {
        getWrappedNonNull().draw(vq1Var, u97Var);
        if (pw8.requireOwner(getLayoutNode()).getShowLayoutBounds()) {
            m12338k(vq1Var, f37867K2);
        }
    }

    public final void setLayoutModifierNode$ui_release(@yfb ew8 ew8Var) {
        if (!md8.areEqual(ew8Var, this.f37868E2)) {
            InterfaceC0701e.d node = ew8Var.getNode();
            if ((node.getKindSet$ui_release() & keb.m30687constructorimpl(512)) != 0) {
                md8.checkNotNull(ew8Var, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                InterfaceC0749b interfaceC0749b = (InterfaceC0749b) ew8Var;
                C0751d c0751d = this.f37871H2;
                if (c0751d != null) {
                    c0751d.setApproachNode(interfaceC0749b);
                } else {
                    c0751d = new C0751d(this, interfaceC0749b);
                }
                this.f37871H2 = c0751d;
            } else {
                this.f37871H2 = null;
            }
        }
        this.f37868E2 = ew8Var;
    }

    /* JADX INFO: renamed from: setLookaheadConstraints-_Sx5XlM$ui_release, reason: not valid java name */
    public final void m29675setLookaheadConstraints_Sx5XlM$ui_release(@gib ku2 ku2Var) {
        this.f37869F2 = ku2Var;
    }
}
