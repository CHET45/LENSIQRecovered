package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,2183:1\n81#2:2184\n107#2,2:2185\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/TransitionState\n*L\n125#1:2184\n125#1:2185,2\n*E\n"})
@e0g(parameters = 2)
public abstract class nfh<S> {

    /* JADX INFO: renamed from: b */
    public static final int f64449b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final z6b f64450a;

    public /* synthetic */ nfh(jt3 jt3Var) {
        this();
    }

    public abstract S getCurrentState();

    public abstract S getTargetState();

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isRunning$animation_core_release() {
        return ((Boolean) this.f64450a.getValue()).booleanValue();
    }

    public abstract void setCurrentState$animation_core_release(S s);

    public final void setRunning$animation_core_release(boolean z) {
        this.f64450a.setValue(Boolean.valueOf(z));
    }

    public abstract void setTargetState$animation_core_release(S s);

    public abstract void transitionConfigured$animation_core_release(@yfb yeh<S> yehVar);

    public abstract void transitionRemoved$animation_core_release();

    private nfh() {
        this.f64450a = xtf.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }
}
