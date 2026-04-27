package p000;

import p000.AbstractC16313zy;

/* JADX INFO: loaded from: classes.dex */
public final class z3i<V extends AbstractC16313zy> implements v3i<V> {

    /* JADX INFO: renamed from: a */
    @yfb
    public final e46 f104028a;

    /* JADX INFO: renamed from: b */
    public V f104029b;

    /* JADX INFO: renamed from: c */
    public V f104030c;

    /* JADX INFO: renamed from: d */
    public V f104031d;

    /* JADX INFO: renamed from: e */
    public final float f104032e;

    public z3i(@yfb e46 e46Var) {
        this.f104028a = e46Var;
        this.f104032e = e46Var.getAbsVelocityThreshold();
    }

    @Override // p000.v3i
    public float getAbsVelocityThreshold() {
        return this.f104032e;
    }

    @Override // p000.v3i
    public long getDurationNanos(@yfb V v, @yfb V v2) {
        if (this.f104030c == null) {
            this.f104030c = (V) C1667az.newInstance(v);
        }
        V v3 = this.f104030c;
        if (v3 == null) {
            md8.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        long jMax = 0;
        for (int i = 0; i < size$animation_core_release; i++) {
            jMax = Math.max(jMax, this.f104028a.getDurationNanos(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        return jMax;
    }

    @yfb
    public final e46 getFloatDecaySpec() {
        return this.f104028a;
    }

    @Override // p000.v3i
    @yfb
    public V getTargetValue(@yfb V v, @yfb V v2) {
        if (this.f104031d == null) {
            this.f104031d = (V) C1667az.newInstance(v);
        }
        V v3 = this.f104031d;
        if (v3 == null) {
            md8.throwUninitializedPropertyAccessException("targetVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.f104031d;
            if (v4 == null) {
                md8.throwUninitializedPropertyAccessException("targetVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.f104028a.getTargetValue(v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.f104031d;
        if (v5 != null) {
            return v5;
        }
        md8.throwUninitializedPropertyAccessException("targetVector");
        return null;
    }

    @Override // p000.v3i
    @yfb
    public V getValueFromNanos(long j, @yfb V v, @yfb V v2) {
        if (this.f104029b == null) {
            this.f104029b = (V) C1667az.newInstance(v);
        }
        V v3 = this.f104029b;
        if (v3 == null) {
            md8.throwUninitializedPropertyAccessException("valueVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.f104029b;
            if (v4 == null) {
                md8.throwUninitializedPropertyAccessException("valueVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.f104028a.getValueFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.f104029b;
        if (v5 != null) {
            return v5;
        }
        md8.throwUninitializedPropertyAccessException("valueVector");
        return null;
    }

    @Override // p000.v3i
    @yfb
    public V getVelocityFromNanos(long j, @yfb V v, @yfb V v2) {
        if (this.f104030c == null) {
            this.f104030c = (V) C1667az.newInstance(v);
        }
        V v3 = this.f104030c;
        if (v3 == null) {
            md8.throwUninitializedPropertyAccessException("velocityVector");
            v3 = null;
        }
        int size$animation_core_release = v3.getSize$animation_core_release();
        for (int i = 0; i < size$animation_core_release; i++) {
            V v4 = this.f104030c;
            if (v4 == null) {
                md8.throwUninitializedPropertyAccessException("velocityVector");
                v4 = null;
            }
            v4.set$animation_core_release(i, this.f104028a.getVelocityFromNanos(j, v.get$animation_core_release(i), v2.get$animation_core_release(i)));
        }
        V v5 = this.f104030c;
        if (v5 != null) {
            return v5;
        }
        md8.throwUninitializedPropertyAccessException("velocityVector");
        return null;
    }
}
