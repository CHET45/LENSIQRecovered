package p000;

import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import p000.lw8;
import p000.qw8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,266:1\n306#2,2:267\n203#3:269\n460#4,11:270\n460#4,11:281\n222#4,11:294\n184#5,2:292\n186#5,2:305\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n128#1:267,2\n130#1:269\n130#1:270,11\n194#1:281,11\n230#1:294,11\n227#1:292,2\n227#1:305,2\n*E\n"})
@e0g(parameters = 1)
public final class b38 extends heb {

    /* JADX INFO: renamed from: G2 */
    @yfb
    public static final C1718a f12526G2 = new C1718a(null);

    /* JADX INFO: renamed from: H2 */
    public static final int f12527H2 = 0;

    /* JADX INFO: renamed from: I2 */
    @yfb
    public static final icc f12528I2;

    /* JADX INFO: renamed from: E2 */
    @yfb
    public final ylg f12529E2;

    /* JADX INFO: renamed from: F2 */
    @gib
    public lm9 f12530F2;

    /* JADX INFO: renamed from: b38$a */
    public static final class C1718a {
        public /* synthetic */ C1718a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final icc getInnerBoundsPaint() {
            return b38.f12528I2;
        }

        private C1718a() {
        }
    }

    /* JADX INFO: renamed from: b38$b */
    @dwf({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,266:1\n451#2,2:267\n453#2:281\n203#3:269\n460#4,11:270\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n76#1:267,2\n76#1:281\n78#1:269\n78#1:270,11\n*E\n"})
    public final class C1719b extends lm9 {
        public C1719b() {
            super(b38.this);
        }

        @Override // p000.km9
        public int calculateAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
            Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(abstractC9938nm);
            int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
            m16230i().put(abstractC9938nm, Integer.valueOf(iIntValue));
            return iIntValue;
        }

        @Override // p000.lm9
        /* JADX INFO: renamed from: j */
        public void mo2872j() {
            qw8.C11723a lookaheadPassDelegate$ui_release = getLayoutNode().getLookaheadPassDelegate$ui_release();
            md8.checkNotNull(lookaheadPassDelegate$ui_release);
            lookaheadPassDelegate$ui_release.onNodePlaced$ui_release();
        }

        @Override // p000.lm9, p000.ed8
        public int maxIntrinsicHeight(int i) {
            return getLayoutNode().maxLookaheadIntrinsicHeight(i);
        }

        @Override // p000.lm9, p000.ed8
        public int maxIntrinsicWidth(int i) {
            return getLayoutNode().maxLookaheadIntrinsicWidth(i);
        }

        @Override // p000.rba
        @yfb
        /* JADX INFO: renamed from: measure-BRTryo0 */
        public AbstractC0767t mo27949measureBRTryo0(long j) {
            m1213g(j);
            f7b<lw8> f7bVar = getLayoutNode().get_children$ui_release();
            int size = f7bVar.getSize();
            if (size > 0) {
                lw8[] content = f7bVar.getContent();
                int i = 0;
                do {
                    qw8.C11723a lookaheadPassDelegate$ui_release = content[i].getLookaheadPassDelegate$ui_release();
                    md8.checkNotNull(lookaheadPassDelegate$ui_release);
                    lookaheadPassDelegate$ui_release.setMeasuredByParent$ui_release(lw8.EnumC9005g.NotUsed);
                    i++;
                } while (i < size);
            }
            set_measureResult(getLayoutNode().getMeasurePolicy().mo27228measure3p2s80s(this, getLayoutNode().getChildLookaheadMeasurables$ui_release(), j));
            return this;
        }

        @Override // p000.lm9, p000.ed8
        public int minIntrinsicHeight(int i) {
            return getLayoutNode().minLookaheadIntrinsicHeight(i);
        }

        @Override // p000.lm9, p000.ed8
        public int minIntrinsicWidth(int i) {
            return getLayoutNode().minLookaheadIntrinsicWidth(i);
        }
    }

    static {
        icc iccVarPaint = C14793wt.Paint();
        iccVarPaint.mo30199setColor8_81llA(w82.f93556b.m32985getRed0d7_KjU());
        iccVarPaint.setStrokeWidth(1.0f);
        iccVarPaint.mo30203setStylek9PVt8s(rcc.f77828b.m32115getStrokeTiuSbCo());
        f12528I2 = iccVarPaint;
    }

    public b38(@yfb lw8 lw8Var) {
        super(lw8Var);
        this.f12529E2 = new ylg();
        getTail().updateCoordinator$ui_release(this);
        this.f12530F2 = lw8Var.getLookaheadRoot$ui_release() != null ? new C1719b() : null;
    }

    public static /* synthetic */ void getTail$annotations() {
    }

    private final void onAfterPlaceAt() {
        if (isShallowPlacing$ui_release()) {
            return;
        }
        onPlaced();
        getLayoutNode().getMeasurePassDelegate$ui_release().onNodePlaced$ui_release();
    }

    @Override // p000.km9
    public int calculateAlignmentLine(@yfb AbstractC9938nm abstractC9938nm) {
        lm9 lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.calculateAlignmentLine(abstractC9938nm);
        }
        Integer num = getAlignmentLinesOwner().calculateAlignmentLines().get(abstractC9938nm);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
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
            mo2871p(new C1719b());
        }
    }

    @Override // p000.heb
    @gib
    public lm9 getLookaheadDelegate() {
        return this.f12530F2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    @Override // p000.heb
    /* JADX INFO: renamed from: hitTestChild-YqVAtuI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void mo27948hitTestChildYqVAtuI(@p000.yfb p000.heb.InterfaceC6824f r16, long r17, @p000.yfb p000.ck7 r19, boolean r20, boolean r21) {
        /*
            r15 = this;
            r0 = r15
            r8 = r17
            lw8 r1 = r15.getLayoutNode()
            r10 = r16
            boolean r1 = r10.shouldHitTestChildren(r1)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L33
            boolean r1 = r15.m12345t(r8)
            if (r1 == 0) goto L1b
            r11 = r21
        L19:
            r3 = r2
            goto L35
        L1b:
            if (r20 == 0) goto L33
            long r4 = r15.m30029getMinimumTouchTargetSizeNHjbRc()
            float r1 = r15.m12337j(r8, r4)
            boolean r4 = java.lang.Float.isInfinite(r1)
            if (r4 != 0) goto L33
            boolean r1 = java.lang.Float.isNaN(r1)
            if (r1 != 0) goto L33
            r11 = r3
            goto L19
        L33:
            r11 = r21
        L35:
            if (r3 == 0) goto L82
            int r12 = p000.ck7.access$getHitDepth$p(r19)
            lw8 r1 = r15.getLayoutNode()
            f7b r1 = r1.getZSortedChildren()
            int r3 = r1.getSize()
            if (r3 <= 0) goto L77
            int r3 = r3 - r2
            java.lang.Object[] r13 = r1.getContent()
            r14 = r3
        L4f:
            r1 = r13[r14]
            r2 = r1
            lw8 r2 = (p000.lw8) r2
            boolean r1 = r2.isPlaced()
            if (r1 == 0) goto L7a
            r1 = r16
            r3 = r17
            r5 = r19
            r6 = r20
            r7 = r11
            r1.mo30048childHitTestYqVAtuI(r2, r3, r5, r6, r7)
            boolean r1 = r19.hasHit()
            if (r1 != 0) goto L6d
            goto L7a
        L6d:
            boolean r1 = r19.getShouldSharePointerInputWithSibling()
            if (r1 == 0) goto L77
            r19.acceptHits()
            goto L7a
        L77:
            r1 = r19
            goto L7f
        L7a:
            int r14 = r14 + (-1)
            if (r14 >= 0) goto L4f
            goto L77
        L7f:
            p000.ck7.access$setHitDepth$p(r1, r12)
        L82:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.b38.mo27948hitTestChildYqVAtuI(heb$f, long, ck7, boolean, boolean):void");
    }

    @Override // p000.ed8
    public int maxIntrinsicHeight(int i) {
        return getLayoutNode().maxIntrinsicHeight(i);
    }

    @Override // p000.ed8
    public int maxIntrinsicWidth(int i) {
        return getLayoutNode().maxIntrinsicWidth(i);
    }

    @Override // p000.rba
    @yfb
    /* JADX INFO: renamed from: measure-BRTryo0, reason: not valid java name */
    public AbstractC0767t mo27949measureBRTryo0(long j) {
        if (getForceMeasureWithLookaheadConstraints$ui_release()) {
            lm9 lookaheadDelegate = getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
            j = lookaheadDelegate.m30869getConstraintsmsEJaDk$ui_release();
        }
        m1213g(j);
        f7b<lw8> f7bVar = getLayoutNode().get_children$ui_release();
        int size = f7bVar.getSize();
        if (size > 0) {
            lw8[] content = f7bVar.getContent();
            int i = 0;
            do {
                content[i].getMeasurePassDelegate$ui_release().setMeasuredByParent$ui_release(lw8.EnumC9005g.NotUsed);
                i++;
            } while (i < size);
        }
        setMeasureResult$ui_release(getLayoutNode().getMeasurePolicy().mo27228measure3p2s80s(this, getLayoutNode().getChildMeasurables$ui_release(), j));
        onMeasured();
        return this;
    }

    @Override // p000.ed8
    public int minIntrinsicHeight(int i) {
        return getLayoutNode().minIntrinsicHeight(i);
    }

    @Override // p000.ed8
    public int minIntrinsicWidth(int i) {
        return getLayoutNode().minIntrinsicWidth(i);
    }

    @Override // p000.heb
    /* JADX INFO: renamed from: p */
    public void mo2871p(@gib lm9 lm9Var) {
        this.f12530F2 = lm9Var;
    }

    @Override // p000.heb
    public void performDraw(@yfb vq1 vq1Var, @gib u97 u97Var) {
        z9c z9cVarRequireOwner = pw8.requireOwner(getLayoutNode());
        f7b<lw8> zSortedChildren = getLayoutNode().getZSortedChildren();
        int size = zSortedChildren.getSize();
        if (size > 0) {
            lw8[] content = zSortedChildren.getContent();
            int i = 0;
            do {
                lw8 lw8Var = content[i];
                if (lw8Var.isPlaced()) {
                    lw8Var.draw$ui_release(vq1Var, u97Var);
                }
                i++;
            } while (i < size);
        }
        if (z9cVarRequireOwner.getShowLayoutBounds()) {
            m12338k(vq1Var, f12528I2);
        }
    }

    @Override // p000.heb
    @yfb
    public ylg getTail() {
        return this.f12529E2;
    }
}
