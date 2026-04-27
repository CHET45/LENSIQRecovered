package p000;

import java.util.Set;
import p000.izb;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLookaheadLayoutCoordinates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,187:1\n1#2:188\n42#3,7:189\n42#3,7:196\n175#4:203\n175#4:204\n*S KotlinDebug\n*F\n+ 1 LookaheadLayoutCoordinates.kt\nandroidx/compose/ui/layout/LookaheadLayoutCoordinates\n*L\n44#1:189,7\n51#1:196,7\n113#1:203\n129#1:204\n*E\n"})
@e0g(parameters = 1)
public final class nm9 implements mv8 {

    /* JADX INFO: renamed from: b */
    public static final int f64993b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lm9 f64994a;

    public nm9(@yfb lm9 lm9Var) {
        this.f64994a = lm9Var;
    }

    /* JADX INFO: renamed from: getLookaheadOffset-F1C5BW0, reason: not valid java name */
    private final long m31159getLookaheadOffsetF1C5BW0() {
        lm9 rootLookaheadDelegate = om9.getRootLookaheadDelegate(this.f64994a);
        mv8 coordinates = rootLookaheadDelegate.getCoordinates();
        izb.C7673a c7673a = izb.f49009b;
        return izb.m30433minusMKHz9U(mo30034localPositionOfR5De75A(coordinates, c7673a.m30445getZeroF1C5BW0()), getCoordinator().mo30034localPositionOfR5De75A(rootLookaheadDelegate.getCoordinator(), c7673a.m30445getZeroF1C5BW0()));
    }

    @Override // p000.mv8
    public int get(@yfb AbstractC9938nm abstractC9938nm) {
        return this.f64994a.get(abstractC9938nm);
    }

    @yfb
    public final heb getCoordinator() {
        return this.f64994a.getCoordinator();
    }

    @Override // p000.mv8
    public boolean getIntroducesMotionFrameOfReference() {
        return this.f64994a.isPlacedUnderMotionFrameOfReference();
    }

    @yfb
    public final lm9 getLookaheadDelegate() {
        return this.f64994a;
    }

    @Override // p000.mv8
    @gib
    public mv8 getParentCoordinates() {
        lm9 lookaheadDelegate;
        if (!isAttached()) {
            g28.throwIllegalStateException(heb.f43263v2);
        }
        heb wrappedBy$ui_release = getCoordinator().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // p000.mv8
    @gib
    public mv8 getParentLayoutCoordinates() {
        lm9 lookaheadDelegate;
        if (!isAttached()) {
            g28.throwIllegalStateException(heb.f43263v2);
        }
        heb wrappedBy$ui_release = getCoordinator().getLayoutNode().getOuterCoordinator$ui_release().getWrappedBy$ui_release();
        if (wrappedBy$ui_release == null || (lookaheadDelegate = wrappedBy$ui_release.getLookaheadDelegate()) == null) {
            return null;
        }
        return lookaheadDelegate.getCoordinates();
    }

    @Override // p000.mv8
    @yfb
    public Set<AbstractC9938nm> getProvidedAlignmentLines() {
        return getCoordinator().getProvidedAlignmentLines();
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: getSize-YbymL2g */
    public long mo30031getSizeYbymL2g() {
        lm9 lm9Var = this.f64994a;
        return s78.IntSize(lm9Var.getWidth(), lm9Var.getHeight());
    }

    @Override // p000.mv8
    public boolean isAttached() {
        return getCoordinator().isAttached();
    }

    @Override // p000.mv8
    @yfb
    public rud localBoundingBoxOf(@yfb mv8 mv8Var, boolean z) {
        return getCoordinator().localBoundingBoxOf(mv8Var, z);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localPositionOf-R5De75A */
    public long mo30034localPositionOfR5De75A(@yfb mv8 mv8Var, long j) {
        return mo30035localPositionOfS_NoaFU(mv8Var, j, true);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localPositionOf-S_NoaFU */
    public long mo30035localPositionOfS_NoaFU(@yfb mv8 mv8Var, long j, boolean z) {
        if (!(mv8Var instanceof nm9)) {
            lm9 rootLookaheadDelegate = om9.getRootLookaheadDelegate(this.f64994a);
            return izb.m30434plusMKHz9U(mo30035localPositionOfS_NoaFU(rootLookaheadDelegate.getLookaheadLayoutCoordinates(), j, z), rootLookaheadDelegate.getCoordinator().getCoordinates().mo30035localPositionOfS_NoaFU(mv8Var, izb.f49009b.m30445getZeroF1C5BW0(), z));
        }
        lm9 lm9Var = ((nm9) mv8Var).f64994a;
        lm9Var.getCoordinator().onCoordinatesUsed$ui_release();
        lm9 lookaheadDelegate = getCoordinator().findCommonAncestor$ui_release(lm9Var.getCoordinator()).getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            long jM27204minusqkQi6aY = a78.m27204minusqkQi6aY(a78.m27205plusqkQi6aY(lm9Var.m30873positionIniSbpLlY$ui_release(lookaheadDelegate, !z), b78.m27960roundk4lQ0M(j)), this.f64994a.m30873positionIniSbpLlY$ui_release(lookaheadDelegate, !z));
            return mzb.Offset(a78.m27201getXimpl(jM27204minusqkQi6aY), a78.m27202getYimpl(jM27204minusqkQi6aY));
        }
        lm9 rootLookaheadDelegate2 = om9.getRootLookaheadDelegate(lm9Var);
        long jM27205plusqkQi6aY = a78.m27205plusqkQi6aY(a78.m27205plusqkQi6aY(lm9Var.m30873positionIniSbpLlY$ui_release(rootLookaheadDelegate2, !z), rootLookaheadDelegate2.mo30030getPositionnOccac()), b78.m27960roundk4lQ0M(j));
        lm9 rootLookaheadDelegate3 = om9.getRootLookaheadDelegate(this.f64994a);
        long jM27204minusqkQi6aY2 = a78.m27204minusqkQi6aY(jM27205plusqkQi6aY, a78.m27205plusqkQi6aY(this.f64994a.m30873positionIniSbpLlY$ui_release(rootLookaheadDelegate3, !z), rootLookaheadDelegate3.mo30030getPositionnOccac()));
        long jOffset = mzb.Offset(a78.m27201getXimpl(jM27204minusqkQi6aY2), a78.m27202getYimpl(jM27204minusqkQi6aY2));
        heb wrappedBy$ui_release = rootLookaheadDelegate3.getCoordinator().getWrappedBy$ui_release();
        md8.checkNotNull(wrappedBy$ui_release);
        heb wrappedBy$ui_release2 = rootLookaheadDelegate2.getCoordinator().getWrappedBy$ui_release();
        md8.checkNotNull(wrappedBy$ui_release2);
        return wrappedBy$ui_release.mo30035localPositionOfS_NoaFU(wrappedBy$ui_release2, jOffset, z);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToRoot-MK-Hz9U */
    public long mo30036localToRootMKHz9U(long j) {
        return getCoordinator().mo30036localToRootMKHz9U(izb.m30434plusMKHz9U(j, m31159getLookaheadOffsetF1C5BW0()));
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToScreen-MK-Hz9U */
    public long mo30037localToScreenMKHz9U(long j) {
        return getCoordinator().mo30037localToScreenMKHz9U(izb.m30434plusMKHz9U(j, m31159getLookaheadOffsetF1C5BW0()));
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: localToWindow-MK-Hz9U */
    public long mo30038localToWindowMKHz9U(long j) {
        return getCoordinator().mo30038localToWindowMKHz9U(izb.m30434plusMKHz9U(j, m31159getLookaheadOffsetF1C5BW0()));
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: screenToLocal-MK-Hz9U */
    public long mo30041screenToLocalMKHz9U(long j) {
        return izb.m30434plusMKHz9U(getCoordinator().mo30041screenToLocalMKHz9U(j), m31159getLookaheadOffsetF1C5BW0());
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: transformFrom-EL8BTi8 */
    public void mo30044transformFromEL8BTi8(@yfb mv8 mv8Var, @yfb float[] fArr) {
        getCoordinator().mo30044transformFromEL8BTi8(mv8Var, fArr);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: transformToScreen-58bKbWc */
    public void mo30045transformToScreen58bKbWc(@yfb float[] fArr) {
        getCoordinator().mo30045transformToScreen58bKbWc(fArr);
    }

    @Override // p000.mv8
    /* JADX INFO: renamed from: windowToLocal-MK-Hz9U */
    public long mo30047windowToLocalMKHz9U(long j) {
        return izb.m30434plusMKHz9U(getCoordinator().mo30047windowToLocalMKHz9U(j), m31159getLookaheadOffsetF1C5BW0());
    }
}
