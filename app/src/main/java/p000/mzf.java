package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class mzf<T> implements fw5<T> {

    /* JADX INFO: renamed from: d */
    public static final int f62871d = 0;

    /* JADX INFO: renamed from: a */
    public final float f62872a;

    /* JADX INFO: renamed from: b */
    public final float f62873b;

    /* JADX INFO: renamed from: c */
    @gib
    public final T f62874c;

    public mzf() {
        this(0.0f, 0.0f, null, 7, null);
    }

    public boolean equals(@gib Object obj) {
        if (!(obj instanceof mzf)) {
            return false;
        }
        mzf mzfVar = (mzf) obj;
        return mzfVar.f62872a == this.f62872a && mzfVar.f62873b == this.f62873b && md8.areEqual(mzfVar.f62874c, this.f62874c);
    }

    public final float getDampingRatio() {
        return this.f62872a;
    }

    public final float getStiffness() {
        return this.f62873b;
    }

    @gib
    public final T getVisibilityThreshold() {
        return this.f62874c;
    }

    public int hashCode() {
        T t = this.f62874c;
        return ((((t != null ? t.hashCode() : 0) * 31) + Float.hashCode(this.f62872a)) * 31) + Float.hashCode(this.f62873b);
    }

    public mzf(float f, float f2, @gib T t) {
        this.f62872a = f;
        this.f62873b = f2;
        this.f62874c = t;
    }

    @Override // p000.fw5, p000.InterfaceC11178py
    @yfb
    public <V extends AbstractC16313zy> g4i<V> vectorize(@yfb alh<T, V> alhVar) {
        return new g4i<>(this.f62872a, this.f62873b, C11760qy.convert(alhVar, this.f62874c));
    }

    public /* synthetic */ mzf(float f, float f2, Object obj, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? 1.0f : f, (i & 2) != 0 ? 1500.0f : f2, (i & 4) != 0 ? null : obj);
    }
}
