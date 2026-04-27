package p000;

import p000.AbstractC16313zy;

/* JADX INFO: renamed from: oy */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n81#2:347\n107#2,2:348\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationScope\n*L\n147#1:344\n147#1:345,2\n181#1:347\n181#1:348,2\n*E\n"})
@e0g(parameters = 0)
public final class C10714oy<T, V extends AbstractC16313zy> {

    /* JADX INFO: renamed from: j */
    public static final int f69183j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final alh<T, V> f69184a;

    /* JADX INFO: renamed from: b */
    public final T f69185b;

    /* JADX INFO: renamed from: c */
    public final long f69186c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final ny6<bth> f69187d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final z6b f69188e;

    /* JADX INFO: renamed from: f */
    @yfb
    public V f69189f;

    /* JADX INFO: renamed from: g */
    public long f69190g;

    /* JADX INFO: renamed from: h */
    public long f69191h = Long.MIN_VALUE;

    /* JADX INFO: renamed from: i */
    @yfb
    public final z6b f69192i;

    public C10714oy(T t, @yfb alh<T, V> alhVar, @yfb V v, long j, T t2, long j2, boolean z, @yfb ny6<bth> ny6Var) {
        this.f69184a = alhVar;
        this.f69185b = t2;
        this.f69186c = j2;
        this.f69187d = ny6Var;
        this.f69188e = xtf.mutableStateOf$default(t, null, 2, null);
        this.f69189f = (V) C1667az.copy(v);
        this.f69190g = j;
        this.f69192i = xtf.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    public final void cancelAnimation() {
        setRunning$animation_core_release(false);
        this.f69187d.invoke();
    }

    public final long getFinishedTimeNanos() {
        return this.f69191h;
    }

    public final long getLastFrameTimeNanos() {
        return this.f69190g;
    }

    public final long getStartTimeNanos() {
        return this.f69186c;
    }

    public final T getTargetValue() {
        return this.f69185b;
    }

    @yfb
    public final alh<T, V> getTypeConverter() {
        return this.f69184a;
    }

    public final T getValue() {
        return this.f69188e.getValue();
    }

    public final T getVelocity() {
        return this.f69184a.getConvertFromVector().invoke(this.f69189f);
    }

    @yfb
    public final V getVelocityVector() {
        return this.f69189f;
    }

    public final boolean isRunning() {
        return ((Boolean) this.f69192i.getValue()).booleanValue();
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.f69191h = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.f69190g = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f69192i.setValue(Boolean.valueOf(z));
    }

    public final void setValue$animation_core_release(T t) {
        this.f69188e.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@yfb V v) {
        this.f69189f = v;
    }

    @yfb
    public final C12364ry<T, V> toAnimationState() {
        return new C12364ry<>(this.f69184a, getValue(), this.f69189f, this.f69190g, this.f69191h, isRunning());
    }
}
