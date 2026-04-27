package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ypf {

    /* JADX INFO: renamed from: c */
    public static final ypf f102624c = new ypf(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final ypf f102625d = new ypf(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f102626a;

    /* JADX INFO: renamed from: b */
    public final int f102627b;

    public ypf(int i, int i2) {
        u80.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f102626a = i;
        this.f102627b = i2;
    }

    public boolean equals(@hib Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypf)) {
            return false;
        }
        ypf ypfVar = (ypf) obj;
        return this.f102626a == ypfVar.f102626a && this.f102627b == ypfVar.f102627b;
    }

    public int getHeight() {
        return this.f102627b;
    }

    public int getWidth() {
        return this.f102626a;
    }

    public int hashCode() {
        int i = this.f102627b;
        int i2 = this.f102626a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f102626a + "x" + this.f102627b;
    }
}
