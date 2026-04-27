package p000;

import p000.AbstractC16313zy;

/* JADX INFO: renamed from: ry */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimationState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,343:1\n81#2:344\n107#2,2:345\n*S KotlinDebug\n*F\n+ 1 AnimationState.kt\nandroidx/compose/animation/core/AnimationState\n*L\n53#1:344\n53#1:345,2\n*E\n"})
@e0g(parameters = 4)
public final class C12364ry<T, V extends AbstractC16313zy> implements i2g<T> {

    /* JADX INFO: renamed from: m */
    public static final int f80078m = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final alh<T, V> f80079a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b f80080b;

    /* JADX INFO: renamed from: c */
    @yfb
    public V f80081c;

    /* JADX INFO: renamed from: d */
    public long f80082d;

    /* JADX INFO: renamed from: e */
    public long f80083e;

    /* JADX INFO: renamed from: f */
    public boolean f80084f;

    public C12364ry(@yfb alh<T, V> alhVar, T t, @gib V v, long j, long j2, boolean z) {
        V v2;
        this.f80079a = alhVar;
        this.f80080b = xtf.mutableStateOf$default(t, null, 2, null);
        this.f80081c = (v == null || (v2 = (V) C1667az.copy(v)) == null) ? (V) C12827sy.createZeroVectorFrom(alhVar, t) : v2;
        this.f80082d = j;
        this.f80083e = j2;
        this.f80084f = z;
    }

    public final long getFinishedTimeNanos() {
        return this.f80083e;
    }

    public final long getLastFrameTimeNanos() {
        return this.f80082d;
    }

    @yfb
    public final alh<T, V> getTypeConverter() {
        return this.f80079a;
    }

    @Override // p000.i2g
    public T getValue() {
        return this.f80080b.getValue();
    }

    public final T getVelocity() {
        return this.f80079a.getConvertFromVector().invoke(this.f80081c);
    }

    @yfb
    public final V getVelocityVector() {
        return this.f80081c;
    }

    public final boolean isRunning() {
        return this.f80084f;
    }

    public final void setFinishedTimeNanos$animation_core_release(long j) {
        this.f80083e = j;
    }

    public final void setLastFrameTimeNanos$animation_core_release(long j) {
        this.f80082d = j;
    }

    public final void setRunning$animation_core_release(boolean z) {
        this.f80084f = z;
    }

    public void setValue$animation_core_release(T t) {
        this.f80080b.setValue(t);
    }

    public final void setVelocityVector$animation_core_release(@yfb V v) {
        this.f80081c = v;
    }

    @yfb
    public String toString() {
        return "AnimationState(value=" + getValue() + ", velocity=" + getVelocity() + ", isRunning=" + this.f80084f + ", lastFrameTimeNanos=" + this.f80082d + ", finishedTimeNanos=" + this.f80083e + ')';
    }

    public /* synthetic */ C12364ry(alh alhVar, Object obj, AbstractC16313zy abstractC16313zy, long j, long j2, boolean z, int i, jt3 jt3Var) {
        this(alhVar, obj, (i & 4) != 0 ? null : abstractC16313zy, (i & 8) != 0 ? Long.MIN_VALUE : j, (i & 16) != 0 ? Long.MIN_VALUE : j2, (i & 32) != 0 ? false : z);
    }
}
