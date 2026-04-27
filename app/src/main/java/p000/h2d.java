package p000;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class h2d {

    /* JADX INFO: renamed from: n */
    public static final int f42119n = 0;

    /* JADX INFO: renamed from: a */
    public final long f42120a;

    /* JADX INFO: renamed from: b */
    public final long f42121b;

    /* JADX INFO: renamed from: c */
    public final long f42122c;

    /* JADX INFO: renamed from: d */
    public final boolean f42123d;

    /* JADX INFO: renamed from: e */
    public final float f42124e;

    /* JADX INFO: renamed from: f */
    public final long f42125f;

    /* JADX INFO: renamed from: g */
    public final long f42126g;

    /* JADX INFO: renamed from: h */
    public final boolean f42127h;

    /* JADX INFO: renamed from: i */
    public final int f42128i;

    /* JADX INFO: renamed from: j */
    public final long f42129j;

    /* JADX INFO: renamed from: k */
    @gib
    public List<ak7> f42130k;

    /* JADX INFO: renamed from: l */
    public long f42131l;

    /* JADX INFO: renamed from: m */
    @yfb
    public ou2 f42132m;

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, jt3 jt3Var) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6);
    }

    @q64(message = "use isConsumed and consume() pair of methods instead")
    public static /* synthetic */ void getConsumed$annotations() {
    }

    @ug5
    public static /* synthetic */ void getHistorical$annotations() {
    }

    private static /* synthetic */ void get_historical$annotations() {
    }

    public static /* synthetic */ void isConsumed$annotations() {
    }

    public final void consume() {
        this.f42132m.setDownChange(true);
        this.f42132m.setPositionChange(true);
    }

    @yfb
    @q64(message = "Partial consumption has been deprecated. Use copy() instead without `consumed` parameter to create a shallow copy or a constructor to create a new PointerInputChange", replaceWith = @i2e(expression = "copy(id, currentTime, currentPosition, currentPressed, previousTime, previousPosition, previousPressed, type, scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-0GkPj7c, reason: not valid java name */
    public final h2d m29903copy0GkPj7c(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, @yfb ou2 ou2Var, int i, long j6) {
        h2d h2dVar = new h2d(j, j2, j3, z, this.f42124e, j4, j5, z2, ou2Var.getDownChange() || ou2Var.getPositionChange(), i, getHistorical(), j6, this.f42131l, null);
        this.f42132m = ou2Var;
        return h2dVar;
    }

    @q64(level = u64.f86867c, message = "Use another copy() method with scrollDelta parameter instead", replaceWith = @i2e(expression = "copy(id,currentTime, currentPosition, currentPressed, previousTime,previousPosition, previousPressed, consumed, type, this.scrollDelta)", imports = {}))
    /* JADX INFO: renamed from: copy-Ezr-O64, reason: not valid java name */
    public final /* synthetic */ h2d m29904copyEzrO64(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ou2 ou2Var, int i) {
        h2d h2dVar = new h2d(j, j2, j3, z, this.f42124e, j4, j5, z2, ou2Var.getDownChange() || ou2Var.getPositionChange(), i, getHistorical(), this.f42129j, this.f42131l, null);
        this.f42132m = ou2Var;
        return h2dVar;
    }

    @yfb
    /* JADX INFO: renamed from: copy-JKmWfYY, reason: not valid java name */
    public final h2d m29905copyJKmWfYY(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, long j6) {
        return m29908copywbzehF4(j, j2, j3, z, this.f42124e, j4, j5, z2, i, getHistorical(), j6);
    }

    @ug5
    @yfb
    /* JADX INFO: renamed from: copy-OHpmEuE, reason: not valid java name */
    public final h2d m29906copyOHpmEuE(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, int i, @yfb List<ak7> list, long j6) {
        return m29908copywbzehF4(j, j2, j3, z, this.f42124e, j4, j5, z2, i, list, j6);
    }

    @yfb
    /* JADX INFO: renamed from: copy-Tn9QgHE, reason: not valid java name */
    public final h2d m29907copyTn9QgHE(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, long j6) {
        h2d h2dVar = new h2d(j, j2, j3, z, f, j4, j5, z2, false, i, getHistorical(), j6, this.f42131l, null);
        h2dVar.f42132m = this.f42132m;
        return h2dVar;
    }

    @ug5
    @yfb
    /* JADX INFO: renamed from: copy-wbzehF4, reason: not valid java name */
    public final h2d m29908copywbzehF4(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, @yfb List<ak7> list, long j6) {
        h2d h2dVar = new h2d(j, j2, j3, z, f, j4, j5, z2, false, i, list, j6, this.f42131l, null);
        h2dVar.f42132m = this.f42132m;
        return h2dVar;
    }

    @yfb
    public final ou2 getConsumed() {
        return this.f42132m;
    }

    @ug5
    @yfb
    public final List<ak7> getHistorical() {
        List<ak7> list = this.f42130k;
        return list == null ? l82.emptyList() : list;
    }

    /* JADX INFO: renamed from: getId-J3iCeTQ, reason: not valid java name */
    public final long m29909getIdJ3iCeTQ() {
        return this.f42120a;
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m29910getOriginalEventPositionF1C5BW0$ui_release() {
        return this.f42131l;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m29911getPositionF1C5BW0() {
        return this.f42122c;
    }

    public final boolean getPressed() {
        return this.f42123d;
    }

    public final float getPressure() {
        return this.f42124e;
    }

    /* JADX INFO: renamed from: getPreviousPosition-F1C5BW0, reason: not valid java name */
    public final long m29912getPreviousPositionF1C5BW0() {
        return this.f42126g;
    }

    public final boolean getPreviousPressed() {
        return this.f42127h;
    }

    public final long getPreviousUptimeMillis() {
        return this.f42125f;
    }

    /* JADX INFO: renamed from: getScrollDelta-F1C5BW0, reason: not valid java name */
    public final long m29913getScrollDeltaF1C5BW0() {
        return this.f42129j;
    }

    /* JADX INFO: renamed from: getType-T8wyACA, reason: not valid java name */
    public final int m29914getTypeT8wyACA() {
        return this.f42128i;
    }

    public final long getUptimeMillis() {
        return this.f42121b;
    }

    public final boolean isConsumed() {
        return this.f42132m.getDownChange() || this.f42132m.getPositionChange();
    }

    /* JADX INFO: renamed from: setOriginalEventPosition-k-4lQ0M$ui_release, reason: not valid java name */
    public final void m29915setOriginalEventPositionk4lQ0M$ui_release(long j) {
        this.f42131l = j;
    }

    @yfb
    public String toString() {
        return "PointerInputChange(id=" + ((Object) f2d.m28885toStringimpl(this.f42120a)) + ", uptimeMillis=" + this.f42121b + ", position=" + ((Object) izb.m30437toStringimpl(this.f42122c)) + ", pressed=" + this.f42123d + ", pressure=" + this.f42124e + ", previousUptimeMillis=" + this.f42125f + ", previousPosition=" + ((Object) izb.m30437toStringimpl(this.f42126g)) + ", previousPressed=" + this.f42127h + ", isConsumed=" + isConsumed() + ", type=" + ((Object) z2d.m33471toStringimpl(this.f42128i)) + ", historical=" + getHistorical() + ",scrollDelta=" + ((Object) izb.m30437toStringimpl(this.f42129j)) + ')';
    }

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List list, long j6, long j7, jt3 jt3Var) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, (List<ak7>) list, j6, j7);
    }

    @q64(level = u64.f86867c, message = "Use another constructor with `scrollDelta` and without `ConsumedData` instead", replaceWith = @i2e(expression = "this(id, uptimeMillis, position, pressed, previousUptimeMillis, previousPosition, previousPressed, consumed.downChange || consumed.positionChange, type, Offset.Zero)", imports = {}))
    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ou2 ou2Var, int i, jt3 jt3Var) {
        this(j, j2, j3, z, j4, j5, z2, ou2Var, i);
    }

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, jt3 jt3Var) {
        this(j, j2, j3, z, j4, j5, z2, z3, i, j6);
    }

    private h2d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f42120a = j;
        this.f42121b = j2;
        this.f42122c = j3;
        this.f42123d = z;
        this.f42124e = f;
        this.f42125f = j4;
        this.f42126g = j5;
        this.f42127h = z2;
        this.f42128i = i;
        this.f42129j = j6;
        this.f42131l = izb.f49009b.m30445getZeroF1C5BW0();
        this.f42132m = new ou2(z3, z3);
    }

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, jt3 jt3Var) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, (i2 & 512) != 0 ? z2d.f103875b.m33476getTouchT8wyACA() : i, (i2 & 1024) != 0 ? izb.f49009b.m30445getZeroF1C5BW0() : j6, (jt3) null);
    }

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6, int i2, jt3 jt3Var) {
        this(j, j2, j3, z, j4, j5, z2, z3, (i2 & 256) != 0 ? z2d.f103875b.m33476getTouchT8wyACA() : i, (i2 & 512) != 0 ? izb.f49009b.m30445getZeroF1C5BW0() : j6, (jt3) null);
    }

    private h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, z3, i, j6, (jt3) null);
    }

    public /* synthetic */ h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ou2 ou2Var, int i, int i2, jt3 jt3Var) {
        this(j, j2, j3, z, j4, j5, z2, ou2Var, (i2 & 256) != 0 ? z2d.f103875b.m33476getTouchT8wyACA() : i, (jt3) null);
    }

    private h2d(long j, long j2, long j3, boolean z, long j4, long j5, boolean z2, ou2 ou2Var, int i) {
        this(j, j2, j3, z, 1.0f, j4, j5, z2, ou2Var.getDownChange() || ou2Var.getPositionChange(), i, izb.f49009b.m30445getZeroF1C5BW0(), (jt3) null);
    }

    private h2d(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, List<ak7> list, long j6, long j7) {
        this(j, j2, j3, z, f, j4, j5, z2, z3, i, j6, (jt3) null);
        this.f42130k = list;
        this.f42131l = j7;
    }
}
