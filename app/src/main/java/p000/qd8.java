package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nIntrinsicsPolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,80:1\n81#2:81\n107#2,2:82\n*S KotlinDebug\n*F\n+ 1 IntrinsicsPolicy.kt\nandroidx/compose/ui/node/IntrinsicsPolicy\n*L\n30#1:81\n30#1:82,2\n*E\n"})
@e0g(parameters = 0)
public final class qd8 {

    /* JADX INFO: renamed from: c */
    public static final int f74073c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final lw8 f74074a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f74075b;

    public qd8(@yfb lw8 lw8Var, @yfb uba ubaVar) {
        this.f74074a = lw8Var;
        this.f74075b = xtf.mutableStateOf$default(ubaVar, null, 2, null);
    }

    private final uba getMeasurePolicyState() {
        return (uba) this.f74075b.getValue();
    }

    private final void setMeasurePolicyState(uba ubaVar) {
        this.f74075b.setValue(ubaVar);
    }

    @yfb
    public final lw8 getLayoutNode() {
        return this.f74074a;
    }

    public final int maxIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildMeasurables$ui_release(), i);
    }

    public final int maxIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().maxIntrinsicHeight(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int maxLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().maxIntrinsicWidth(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int minIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildMeasurables$ui_release(), i);
    }

    public final int minIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicHeight(int i) {
        return getMeasurePolicyState().minIntrinsicHeight(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final int minLookaheadIntrinsicWidth(int i) {
        return getMeasurePolicyState().minIntrinsicWidth(this.f74074a.getOuterCoordinator$ui_release(), this.f74074a.getChildLookaheadMeasurables$ui_release(), i);
    }

    public final void updateFrom(@yfb uba ubaVar) {
        setMeasurePolicyState(ubaVar);
    }
}
