package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n+ 2 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,490:1\n54#2,7:491\n1#3:498\n*S KotlinDebug\n*F\n+ 1 Animation.kt\nandroidx/compose/animation/core/TargetBasedAnimation\n*L\n270#1:491,7\n*E\n"})
@e0g(parameters = 0)
public final class qmg<T, V extends AbstractC16313zy> implements InterfaceC6643gy<T, V> {

    /* JADX INFO: renamed from: j */
    public static final int f74936j = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final t3i<V> f74937a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final alh<T, V> f74938b;

    /* JADX INFO: renamed from: c */
    public T f74939c;

    /* JADX INFO: renamed from: d */
    public T f74940d;

    /* JADX INFO: renamed from: e */
    @yfb
    public V f74941e;

    /* JADX INFO: renamed from: f */
    @yfb
    public V f74942f;

    /* JADX INFO: renamed from: g */
    @yfb
    public final V f74943g;

    /* JADX INFO: renamed from: h */
    public long f74944h;

    /* JADX INFO: renamed from: i */
    @gib
    public V f74945i;

    public qmg(@yfb t3i<V> t3iVar, @yfb alh<T, V> alhVar, T t, T t2, @gib V v) {
        V v2;
        this.f74937a = t3iVar;
        this.f74938b = alhVar;
        this.f74939c = t2;
        this.f74940d = t;
        this.f74941e = getTypeConverter().getConvertToVector().invoke(t);
        this.f74942f = getTypeConverter().getConvertToVector().invoke(t2);
        this.f74943g = (v == null || (v2 = (V) C1667az.copy(v)) == null) ? (V) C1667az.newInstance(getTypeConverter().getConvertToVector().invoke(t)) : v2;
        this.f74944h = -1L;
    }

    private final V getEndVelocity() {
        V v = this.f74945i;
        if (v != null) {
            return v;
        }
        V v2 = (V) this.f74937a.getEndVelocity(this.f74941e, this.f74942f, this.f74943g);
        this.f74945i = v2;
        return v2;
    }

    @yfb
    public final t3i<V> getAnimationSpec$animation_core_release() {
        return this.f74937a;
    }

    @Override // p000.InterfaceC6643gy
    public long getDurationNanos() {
        if (this.f74944h < 0) {
            this.f74944h = this.f74937a.getDurationNanos(this.f74941e, this.f74942f, this.f74943g);
        }
        return this.f74944h;
    }

    public final T getInitialValue() {
        return this.f74940d;
    }

    public final T getMutableInitialValue$animation_core_release() {
        return this.f74940d;
    }

    public final T getMutableTargetValue$animation_core_release() {
        return this.f74939c;
    }

    @Override // p000.InterfaceC6643gy
    public T getTargetValue() {
        return this.f74939c;
    }

    @Override // p000.InterfaceC6643gy
    @yfb
    public alh<T, V> getTypeConverter() {
        return this.f74938b;
    }

    @Override // p000.InterfaceC6643gy
    public T getValueFromNanos(long j) {
        if (isFinishedFromNanos(j)) {
            return getTargetValue();
        }
        AbstractC16313zy valueFromNanos = this.f74937a.getValueFromNanos(j, this.f74941e, this.f74942f, this.f74943g);
        int size$animation_core_release = valueFromNanos.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            if (Float.isNaN(valueFromNanos.get$animation_core_release(i))) {
                c8d.throwIllegalStateException("AnimationVector cannot contain a NaN. " + valueFromNanos + ". Animation: " + this + ", playTimeNanos: " + j);
            }
        }
        return (T) getTypeConverter().getConvertFromVector().invoke(valueFromNanos);
    }

    @Override // p000.InterfaceC6643gy
    @yfb
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? (V) this.f74937a.getVelocityFromNanos(j, this.f74941e, this.f74942f, this.f74943g) : (V) getEndVelocity();
    }

    @Override // p000.InterfaceC6643gy
    public boolean isInfinite() {
        return this.f74937a.isInfinite();
    }

    public final void setMutableInitialValue$animation_core_release(T t) {
        if (md8.areEqual(t, this.f74940d)) {
            return;
        }
        this.f74940d = t;
        this.f74941e = getTypeConverter().getConvertToVector().invoke(t);
        this.f74945i = null;
        this.f74944h = -1L;
    }

    public final void setMutableTargetValue$animation_core_release(T t) {
        if (md8.areEqual(this.f74939c, t)) {
            return;
        }
        this.f74939c = t;
        this.f74942f = getTypeConverter().getConvertToVector().invoke(t);
        this.f74945i = null;
        this.f74944h = -1L;
    }

    @yfb
    public String toString() {
        return "TargetBasedAnimation: " + getInitialValue() + " -> " + getTargetValue() + ",initial velocity: " + this.f74943g + ", duration: " + C8551ky.getDurationMillis(this) + " ms,animationSpec: " + this.f74937a;
    }

    public /* synthetic */ qmg(t3i t3iVar, alh alhVar, Object obj, Object obj2, AbstractC16313zy abstractC16313zy, int i, jt3 jt3Var) {
        this((t3i<AbstractC16313zy>) t3iVar, (alh<Object, AbstractC16313zy>) alhVar, obj, obj2, (i & 16) != 0 ? null : abstractC16313zy);
    }

    public /* synthetic */ qmg(InterfaceC11178py interfaceC11178py, alh alhVar, Object obj, Object obj2, AbstractC16313zy abstractC16313zy, int i, jt3 jt3Var) {
        this((InterfaceC11178py<Object>) interfaceC11178py, (alh<Object, AbstractC16313zy>) alhVar, obj, obj2, (i & 16) != 0 ? null : abstractC16313zy);
    }

    public qmg(@yfb InterfaceC11178py<T> interfaceC11178py, @yfb alh<T, V> alhVar, T t, T t2, @gib V v) {
        this(interfaceC11178py.vectorize(alhVar), alhVar, t, t2, v);
    }
}
