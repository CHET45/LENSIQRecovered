package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
public class io9<T> {

    /* JADX INFO: renamed from: a */
    public float f47776a;

    /* JADX INFO: renamed from: b */
    public float f47777b;

    /* JADX INFO: renamed from: c */
    public T f47778c;

    /* JADX INFO: renamed from: d */
    public T f47779d;

    /* JADX INFO: renamed from: e */
    public float f47780e;

    /* JADX INFO: renamed from: f */
    public float f47781f;

    /* JADX INFO: renamed from: g */
    public float f47782g;

    public float getEndFrame() {
        return this.f47777b;
    }

    public T getEndValue() {
        return this.f47779d;
    }

    public float getInterpolatedKeyframeProgress() {
        return this.f47781f;
    }

    public float getLinearKeyframeProgress() {
        return this.f47780e;
    }

    public float getOverallProgress() {
        return this.f47782g;
    }

    public float getStartFrame() {
        return this.f47776a;
    }

    public T getStartValue() {
        return this.f47778c;
    }

    @p7e({p7e.EnumC10826a.f69934a})
    public io9<T> set(float f, float f2, T t, T t2, float f3, float f4, float f5) {
        this.f47776a = f;
        this.f47777b = f2;
        this.f47778c = t;
        this.f47779d = t2;
        this.f47780e = f3;
        this.f47781f = f4;
        this.f47782g = f5;
        return this;
    }
}
