package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n81#2:2187\n107#2,2:2188\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/MutableTransitionState\n*L\n171#1:2184\n171#1:2185,2\n183#1:2187\n183#1:2188,2\n*E\n"})
@e0g(parameters = 2)
public final class b7b<S> extends nfh<S> {

    /* JADX INFO: renamed from: e */
    public static final int f12905e = 0;

    /* JADX INFO: renamed from: c */
    @yfb
    public final z6b f12906c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final z6b f12907d;

    public b7b(S s) {
        super(null);
        this.f12906c = xtf.mutableStateOf$default(s, null, 2, null);
        this.f12907d = xtf.mutableStateOf$default(s, null, 2, null);
    }

    @Override // p000.nfh
    public S getCurrentState() {
        return (S) this.f12906c.getValue();
    }

    @Override // p000.nfh
    public S getTargetState() {
        return (S) this.f12907d.getValue();
    }

    public final boolean isIdle() {
        return md8.areEqual(getCurrentState(), getTargetState()) && !isRunning$animation_core_release();
    }

    @Override // p000.nfh
    public void setCurrentState$animation_core_release(S s) {
        this.f12906c.setValue(s);
    }

    @Override // p000.nfh
    /* JADX INFO: renamed from: setTargetState, reason: merged with bridge method [inline-methods] */
    public void setTargetState$animation_core_release(S s) {
        this.f12907d.setValue(s);
    }

    @Override // p000.nfh
    public void transitionConfigured$animation_core_release(@yfb yeh<S> yehVar) {
    }

    @Override // p000.nfh
    public void transitionRemoved$animation_core_release() {
    }
}
