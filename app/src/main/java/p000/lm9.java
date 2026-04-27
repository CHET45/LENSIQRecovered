package p000;

import androidx.compose.p002ui.graphics.InterfaceC0736c;
import androidx.compose.p002ui.layout.AbstractC0767t;
import java.util.LinkedHashMap;
import java.util.Map;
import p000.qw8;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,491:1\n1#2:492\n*E\n"})
@e0g(parameters = 1)
public abstract class lm9 extends km9 implements rba {

    /* JADX INFO: renamed from: d2 */
    public static final int f58241d2 = 0;

    /* JADX INFO: renamed from: M1 */
    @yfb
    public final heb f58242M1;

    /* JADX INFO: renamed from: Z1 */
    @gib
    public Map<AbstractC9938nm, Integer> f58244Z1;

    /* JADX INFO: renamed from: b2 */
    @gib
    public vba f58246b2;

    /* JADX INFO: renamed from: V1 */
    public long f58243V1 = a78.f545b.m27211getZeronOccac();

    /* JADX INFO: renamed from: a2 */
    @yfb
    public final nm9 f58245a2 = new nm9(this);

    /* JADX INFO: renamed from: c2 */
    @yfb
    public final Map<AbstractC9938nm, Integer> f58247c2 = new LinkedHashMap();

    public lm9(@yfb heb hebVar) {
        this.f58242M1 = hebVar;
    }

    /* JADX INFO: renamed from: placeSelf--gyyYBs, reason: not valid java name */
    private final void m30868placeSelfgyyYBs(long j) {
        if (!a78.m27200equalsimpl0(mo30030getPositionnOccac(), j)) {
            m30874setPositiongyyYBs(j);
            qw8.C11723a lookaheadPassDelegate$ui_release = getLayoutNode().getLayoutDelegate$ui_release().getLookaheadPassDelegate$ui_release();
            if (lookaheadPassDelegate$ui_release != null) {
                lookaheadPassDelegate$ui_release.notifyChildrenUsingLookaheadCoordinatesWhilePlacing();
            }
            m14822h(this.f58242M1);
        }
        if (isPlacingForAlignment$ui_release()) {
            return;
        }
        captureRulers$ui_release(getMeasureResult$ui_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void set_measureResult(vba vbaVar) {
        bth bthVar;
        Map<AbstractC9938nm, Integer> map;
        if (vbaVar != null) {
            m1212f(s78.IntSize(vbaVar.getWidth(), vbaVar.getHeight()));
            bthVar = bth.f14751a;
        } else {
            bthVar = null;
        }
        if (bthVar == null) {
            m1212f(r78.f77324b.m32092getZeroYbymL2g());
        }
        if (!md8.areEqual(this.f58246b2, vbaVar) && vbaVar != null && ((((map = this.f58244Z1) != null && !map.isEmpty()) || !vbaVar.getAlignmentLines().isEmpty()) && !md8.areEqual(vbaVar.getAlignmentLines(), this.f58244Z1))) {
            getAlignmentLinesOwner().getAlignmentLines().onAlignmentsChanged();
            Map linkedHashMap = this.f58244Z1;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap();
                this.f58244Z1 = linkedHashMap;
            }
            linkedHashMap.clear();
            linkedHashMap.putAll(vbaVar.getAlignmentLines());
        }
        this.f58246b2 = vbaVar;
    }

    @Override // androidx.compose.p002ui.layout.AbstractC0767t
    /* JADX INFO: renamed from: d */
    public final void mo1210d(long j, float f, @gib qy6<? super InterfaceC0736c, bth> qy6Var) {
        m30868placeSelfgyyYBs(j);
        if (isShallowPlacing$ui_release()) {
            return;
        }
        mo2872j();
    }

    @Override // p000.km9
    @yfb
    public InterfaceC12654sm getAlignmentLinesOwner() {
        InterfaceC12654sm lookaheadAlignmentLinesOwner$ui_release = this.f58242M1.getLayoutNode().getLayoutDelegate$ui_release().getLookaheadAlignmentLinesOwner$ui_release();
        md8.checkNotNull(lookaheadAlignmentLinesOwner$ui_release);
        return lookaheadAlignmentLinesOwner$ui_release;
    }

    public final int getCachedAlignmentLine$ui_release(@yfb AbstractC9938nm abstractC9938nm) {
        Integer num = this.f58247c2.get(abstractC9938nm);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // p000.km9
    @gib
    public km9 getChild() {
        heb wrapped$ui_release = this.f58242M1.getWrapped$ui_release();
        if (wrapped$ui_release != null) {
            return wrapped$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    /* JADX INFO: renamed from: getConstraints-msEJaDk$ui_release, reason: not valid java name */
    public final long m30869getConstraintsmsEJaDk$ui_release() {
        return m1209c();
    }

    @Override // p000.km9
    @yfb
    public mv8 getCoordinates() {
        return this.f58245a2;
    }

    @yfb
    public final heb getCoordinator() {
        return this.f58242M1;
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f58242M1.getDensity();
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f58242M1.getFontScale();
    }

    @Override // p000.km9
    public boolean getHasMeasureResult() {
        return this.f58246b2 != null;
    }

    @Override // p000.gd8
    @yfb
    public ov8 getLayoutDirection() {
        return this.f58242M1.getLayoutDirection();
    }

    @Override // p000.km9, p000.xba
    @yfb
    public lw8 getLayoutNode() {
        return this.f58242M1.getLayoutNode();
    }

    @yfb
    public final nm9 getLookaheadLayoutCoordinates() {
        return this.f58245a2;
    }

    @Override // p000.km9
    @yfb
    public vba getMeasureResult$ui_release() {
        vba vbaVar = this.f58246b2;
        if (vbaVar != null) {
            return vbaVar;
        }
        throw new IllegalStateException("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // p000.km9
    @gib
    public km9 getParent() {
        heb wrappedBy$ui_release = this.f58242M1.getWrappedBy$ui_release();
        if (wrappedBy$ui_release != null) {
            return wrappedBy$ui_release.getLookaheadDelegate();
        }
        return null;
    }

    @Override // p000.aca, p000.ed8
    @gib
    public Object getParentData() {
        return this.f58242M1.getParentData();
    }

    @Override // p000.km9
    /* JADX INFO: renamed from: getPosition-nOcc-ac */
    public long mo30030getPositionnOccac() {
        return this.f58243V1;
    }

    /* JADX INFO: renamed from: getSize-YbymL2g$ui_release, reason: not valid java name */
    public final long m30870getSizeYbymL2g$ui_release() {
        return s78.IntSize(getWidth(), getHeight());
    }

    @yfb
    /* JADX INFO: renamed from: i */
    public final Map<AbstractC9938nm, Integer> m16230i() {
        return this.f58247c2;
    }

    @Override // p000.km9, p000.gd8
    public boolean isLookingAhead() {
        return true;
    }

    /* JADX INFO: renamed from: j */
    public void mo2872j() {
        getMeasureResult$ui_release().placeChildren();
    }

    public int maxIntrinsicHeight(int i) {
        heb wrapped$ui_release = this.f58242M1.getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        lm9 lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicHeight(i);
    }

    public int maxIntrinsicWidth(int i) {
        heb wrapped$ui_release = this.f58242M1.getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        lm9 lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.maxIntrinsicWidth(i);
    }

    public int minIntrinsicHeight(int i) {
        heb wrapped$ui_release = this.f58242M1.getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        lm9 lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicHeight(i);
    }

    public int minIntrinsicWidth(int i) {
        heb wrapped$ui_release = this.f58242M1.getWrapped$ui_release();
        md8.checkNotNull(wrapped$ui_release);
        lm9 lookaheadDelegate = wrapped$ui_release.getLookaheadDelegate();
        md8.checkNotNull(lookaheadDelegate);
        return lookaheadDelegate.minIntrinsicWidth(i);
    }

    @yfb
    /* JADX INFO: renamed from: performingMeasure-K40F9xA, reason: not valid java name */
    public final AbstractC0767t m30871performingMeasureK40F9xA(long j, @yfb ny6<? extends vba> ny6Var) {
        m1213g(j);
        set_measureResult(ny6Var.invoke());
        return this;
    }

    /* JADX INFO: renamed from: placeSelfApparentToRealOffset--gyyYBs$ui_release, reason: not valid java name */
    public final void m30872placeSelfApparentToRealOffsetgyyYBs$ui_release(long j) {
        m30868placeSelfgyyYBs(a78.m27205plusqkQi6aY(j, m1207a()));
    }

    /* JADX INFO: renamed from: positionIn-iSbpLlY$ui_release, reason: not valid java name */
    public final long m30873positionIniSbpLlY$ui_release(@yfb lm9 lm9Var, boolean z) {
        long jM27211getZeronOccac = a78.f545b.m27211getZeronOccac();
        lm9 lookaheadDelegate = this;
        while (!md8.areEqual(lookaheadDelegate, lm9Var)) {
            if (!lookaheadDelegate.isPlacedUnderMotionFrameOfReference() || !z) {
                jM27211getZeronOccac = a78.m27205plusqkQi6aY(jM27211getZeronOccac, lookaheadDelegate.mo30030getPositionnOccac());
            }
            heb wrappedBy$ui_release = lookaheadDelegate.f58242M1.getWrappedBy$ui_release();
            md8.checkNotNull(wrappedBy$ui_release);
            lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate();
            md8.checkNotNull(lookaheadDelegate);
        }
        return jM27211getZeronOccac;
    }

    @Override // p000.km9
    public void replace$ui_release() {
        mo1210d(mo30030getPositionnOccac(), 0.0f, null);
    }

    /* JADX INFO: renamed from: setPosition--gyyYBs, reason: not valid java name */
    public void m30874setPositiongyyYBs(long j) {
        this.f58243V1 = j;
    }
}
