package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class z76 {

    /* JADX INFO: renamed from: b */
    public static final int f104323b = 8;

    /* JADX INFO: renamed from: a */
    public float f104324a;

    public z76(float f) {
        this.f104324a = f;
    }

    public static /* synthetic */ z76 copy$default(z76 z76Var, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            f = z76Var.f104324a;
        }
        return z76Var.copy(f);
    }

    public final float component1() {
        return this.f104324a;
    }

    @yfb
    public final z76 copy(float f) {
        return new z76(f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z76) && Float.compare(this.f104324a, ((z76) obj).f104324a) == 0;
    }

    public final float getFillCrossAxisFraction() {
        return this.f104324a;
    }

    public int hashCode() {
        return Float.hashCode(this.f104324a);
    }

    public final void setFillCrossAxisFraction(float f) {
        this.f104324a = f;
    }

    @yfb
    public String toString() {
        return "FlowLayoutData(fillCrossAxisFraction=" + this.f104324a + ')';
    }
}
