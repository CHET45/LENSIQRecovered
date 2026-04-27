package p000;

import p000.l4i;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nVelocityTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,734:1\n42#2,7:735\n*S KotlinDebug\n*F\n+ 1 VelocityTracker.kt\nandroidx/compose/ui/input/pointer/util/VelocityTracker\n*L\n105#1:735,7\n*E\n"})
@e0g(parameters = 0)
public final class m4i {

    /* JADX INFO: renamed from: f */
    public static final int f59894f = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final l4i.EnumC8613a f59895a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final l4i f59896b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final l4i f59897c;

    /* JADX INFO: renamed from: d */
    public long f59898d;

    /* JADX INFO: renamed from: e */
    public long f59899e;

    public m4i() {
        l4i.EnumC8613a enumC8613a = p4i.getVelocityTrackerStrategyUseImpulse() ? l4i.EnumC8613a.Impulse : l4i.EnumC8613a.Lsq2;
        this.f59895a = enumC8613a;
        this.f59896b = new l4i(false, enumC8613a, 1, null);
        this.f59897c = new l4i(false, enumC8613a, 1, null);
        this.f59898d = izb.f49009b.m30445getZeroF1C5BW0();
    }

    private static /* synthetic */ void getStrategy$annotations() {
    }

    /* JADX INFO: renamed from: addPosition-Uv8p0NA, reason: not valid java name */
    public final void m30944addPositionUv8p0NA(long j, long j2) {
        this.f59896b.addDataPoint(j, izb.m30429getXimpl(j2));
        this.f59897c.addDataPoint(j, izb.m30430getYimpl(j2));
    }

    /* JADX INFO: renamed from: calculateVelocity-9UxMQ8M, reason: not valid java name */
    public final long m30945calculateVelocity9UxMQ8M() {
        return m30946calculateVelocityAH228Gc(j4i.Velocity(Float.MAX_VALUE, Float.MAX_VALUE));
    }

    /* JADX INFO: renamed from: calculateVelocity-AH228Gc, reason: not valid java name */
    public final long m30946calculateVelocityAH228Gc(long j) {
        if (!(i4i.m30157getXimpl(j) > 0.0f && i4i.m30158getYimpl(j) > 0.0f)) {
            g28.throwIllegalStateException("maximumVelocity should be a positive value. You specified=" + ((Object) i4i.m30164toStringimpl(j)));
        }
        return j4i.Velocity(this.f59896b.calculateVelocity(i4i.m30157getXimpl(j)), this.f59897c.calculateVelocity(i4i.m30158getYimpl(j)));
    }

    /* JADX INFO: renamed from: getCurrentPointerPositionAccumulator-F1C5BW0$ui_release, reason: not valid java name */
    public final long m30947getCurrentPointerPositionAccumulatorF1C5BW0$ui_release() {
        return this.f59898d;
    }

    public final long getLastMoveEventTimeStamp$ui_release() {
        return this.f59899e;
    }

    public final void resetTracking() {
        this.f59896b.resetTracking();
        this.f59897c.resetTracking();
        this.f59899e = 0L;
    }

    /* JADX INFO: renamed from: setCurrentPointerPositionAccumulator-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m30948setCurrentPointerPositionAccumulatork4lQ0M$ui_release(long j) {
        this.f59898d = j;
    }

    public final void setLastMoveEventTimeStamp$ui_release(long j) {
        this.f59899e = j;
    }
}
