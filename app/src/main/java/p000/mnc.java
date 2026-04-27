package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mnc implements y03, b58 {

    /* JADX INFO: renamed from: a */
    public final float f61579a;

    public mnc(@y46(from = 0.0d, m25645to = ua2.f87251b) float f) {
        this.f61579a = f;
        if (f < 0.0f || f > 100.0f) {
            throw new IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    private final float component1() {
        return this.f61579a;
    }

    public static /* synthetic */ mnc copy$default(mnc mncVar, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = mncVar.f61579a;
        }
        return mncVar.copy(f);
    }

    @yfb
    public final mnc copy(@y46(from = 0.0d, m25645to = ua2.f87251b) float f) {
        return new mnc(f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mnc) && Float.compare(this.f61579a, ((mnc) obj).f61579a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f61579a);
    }

    @Override // p000.y03
    /* JADX INFO: renamed from: toPx-TmRCtEA */
    public float mo29740toPxTmRCtEA(long j, @yfb c64 c64Var) {
        return wpf.m33068getMinDimensionimpl(j) * (this.f61579a / 100.0f);
    }

    @yfb
    public String toString() {
        return "CornerSize(size = " + this.f61579a + "%)";
    }

    @Override // p000.b58
    @yfb
    public String getValueOverride() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61579a);
        sb.append('%');
        return sb.toString();
    }
}
