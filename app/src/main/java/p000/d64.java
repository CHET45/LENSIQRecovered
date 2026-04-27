package p000;

/* JADX INFO: loaded from: classes.dex */
public final class d64 implements c64 {

    /* JADX INFO: renamed from: a */
    public final float f28511a;

    /* JADX INFO: renamed from: b */
    public final float f28512b;

    public d64(float f, float f2) {
        this.f28511a = f;
        this.f28512b = f2;
    }

    public static /* synthetic */ d64 copy$default(d64 d64Var, float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = d64Var.f28511a;
        }
        if ((i & 2) != 0) {
            f2 = d64Var.f28512b;
        }
        return d64Var.copy(f, f2);
    }

    public final float component1() {
        return this.f28511a;
    }

    public final float component2() {
        return this.f28512b;
    }

    @yfb
    public final d64 copy(float f, float f2) {
        return new d64(f, f2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d64)) {
            return false;
        }
        d64 d64Var = (d64) obj;
        return Float.compare(this.f28511a, d64Var.f28511a) == 0 && Float.compare(this.f28512b, d64Var.f28512b) == 0;
    }

    @Override // p000.c64
    public float getDensity() {
        return this.f28511a;
    }

    @Override // p000.dp6
    public float getFontScale() {
        return this.f28512b;
    }

    public int hashCode() {
        return (Float.hashCode(this.f28511a) * 31) + Float.hashCode(this.f28512b);
    }

    @yfb
    public String toString() {
        return "DensityImpl(density=" + this.f28511a + ", fontScale=" + this.f28512b + ')';
    }
}
