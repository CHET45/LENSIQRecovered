package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class om0 {

    /* JADX INFO: renamed from: c */
    public static final int f68108c = 0;

    /* JADX INFO: renamed from: a */
    public final int f68109a;

    /* JADX INFO: renamed from: b */
    public final float f68110b;

    public om0(int i, float f) {
        this.f68109a = i;
        this.f68110b = f;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || om0.class != obj.getClass()) {
            return false;
        }
        om0 om0Var = (om0) obj;
        return this.f68109a == om0Var.f68109a && Float.compare(om0Var.f68110b, this.f68110b) == 0;
    }

    public int hashCode() {
        return ((527 + this.f68109a) * 31) + Float.floatToIntBits(this.f68110b);
    }
}
