package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 3)
public final class uk3<T, V extends AbstractC16313zy> implements InterfaceC6643gy<T, V> {

    /* JADX INFO: renamed from: j */
    public static final int f88197j = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final v3i<V> f88198a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final alh<T, V> f88199b;

    /* JADX INFO: renamed from: c */
    public final T f88200c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final V f88201d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final V f88202e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final V f88203f;

    /* JADX INFO: renamed from: g */
    public final T f88204g;

    /* JADX INFO: renamed from: h */
    public final long f88205h;

    /* JADX INFO: renamed from: i */
    public final boolean f88206i;

    public uk3(@yfb v3i<V> v3iVar, @yfb alh<T, V> alhVar, T t, @yfb V v) {
        this.f88198a = v3iVar;
        this.f88199b = alhVar;
        this.f88200c = t;
        V vInvoke = getTypeConverter().getConvertToVector().invoke(t);
        this.f88201d = vInvoke;
        this.f88202e = (V) C1667az.copy(v);
        this.f88204g = (T) getTypeConverter().getConvertFromVector().invoke(v3iVar.getTargetValue(vInvoke, v));
        this.f88205h = v3iVar.getDurationNanos(vInvoke, v);
        V v2 = (V) C1667az.copy(v3iVar.getVelocityFromNanos(getDurationNanos(), vInvoke, v));
        this.f88203f = v2;
        int size$animation_core_release = v2.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v3 = this.f88203f;
            v3.set$animation_core_release(i, kpd.coerceIn(v3.get$animation_core_release(i), -this.f88198a.getAbsVelocityThreshold(), this.f88198a.getAbsVelocityThreshold()));
        }
    }

    @Override // p000.InterfaceC6643gy
    public long getDurationNanos() {
        return this.f88205h;
    }

    public final T getInitialValue() {
        return this.f88200c;
    }

    @yfb
    public final V getInitialVelocityVector() {
        return this.f88202e;
    }

    @Override // p000.InterfaceC6643gy
    public T getTargetValue() {
        return this.f88204g;
    }

    @Override // p000.InterfaceC6643gy
    @yfb
    public alh<T, V> getTypeConverter() {
        return this.f88199b;
    }

    @Override // p000.InterfaceC6643gy
    public T getValueFromNanos(long j) {
        return !isFinishedFromNanos(j) ? (T) getTypeConverter().getConvertFromVector().invoke(this.f88198a.getValueFromNanos(j, this.f88201d, this.f88202e)) : getTargetValue();
    }

    @Override // p000.InterfaceC6643gy
    @yfb
    public V getVelocityVectorFromNanos(long j) {
        return !isFinishedFromNanos(j) ? (V) this.f88198a.getVelocityFromNanos(j, this.f88201d, this.f88202e) : this.f88203f;
    }

    @Override // p000.InterfaceC6643gy
    public boolean isInfinite() {
        return this.f88206i;
    }

    public uk3(@yfb vk3<T> vk3Var, @yfb alh<T, V> alhVar, T t, @yfb V v) {
        this(vk3Var.vectorize(alhVar), alhVar, t, v);
    }

    public uk3(@yfb vk3<T> vk3Var, @yfb alh<T, V> alhVar, T t, T t2) {
        this(vk3Var.vectorize(alhVar), alhVar, t, alhVar.getConvertToVector().invoke(t2));
    }
}
