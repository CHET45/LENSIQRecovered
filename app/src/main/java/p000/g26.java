package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class g26 implements ww2 {

    /* JADX INFO: renamed from: c */
    public static final int f38294c = 0;

    /* JADX INFO: renamed from: b */
    public final float f38295b;

    public g26(float f) {
        this.f38295b = f;
    }

    public static /* synthetic */ g26 copy$default(g26 g26Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = g26Var.f38295b;
        }
        return g26Var.copy(f);
    }

    public final float component1() {
        return this.f38295b;
    }

    @Override // p000.ww2
    /* JADX INFO: renamed from: computeScaleFactor-H7hwNQA, reason: not valid java name */
    public long mo29683computeScaleFactorH7hwNQA(long j, long j2) {
        float f = this.f38295b;
        return qme.ScaleFactor(f, f);
    }

    @yfb
    public final g26 copy(float f) {
        return new g26(f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g26) && Float.compare(this.f38295b, ((g26) obj).f38295b) == 0;
    }

    public final float getValue() {
        return this.f38295b;
    }

    public int hashCode() {
        return Float.hashCode(this.f38295b);
    }

    @yfb
    public String toString() {
        return "FixedScale(value=" + this.f38295b + ')';
    }
}
