package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class pm0 {

    /* JADX INFO: renamed from: c */
    public static final int f71363c = 0;

    /* JADX INFO: renamed from: a */
    public final int f71364a;

    /* JADX INFO: renamed from: b */
    public final float f71365b;

    public pm0(int i, float f) {
        this.f71364a = i;
        this.f71365b = f;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || pm0.class != obj.getClass()) {
            return false;
        }
        pm0 pm0Var = (pm0) obj;
        return this.f71364a == pm0Var.f71364a && Float.compare(pm0Var.f71365b, this.f71365b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f71364a) * 31) + Float.floatToIntBits(this.f71365b);
    }
}
