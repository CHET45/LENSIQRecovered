package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class xpf {

    /* JADX INFO: renamed from: c */
    public static final xpf f98880c = new xpf(-1, -1);

    /* JADX INFO: renamed from: d */
    public static final xpf f98881d = new xpf(0, 0);

    /* JADX INFO: renamed from: a */
    public final int f98882a;

    /* JADX INFO: renamed from: b */
    public final int f98883b;

    public xpf(int i, int i2) {
        v80.checkArgument((i == -1 || i >= 0) && (i2 == -1 || i2 >= 0));
        this.f98882a = i;
        this.f98883b = i2;
    }

    public boolean equals(@hib Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xpf)) {
            return false;
        }
        xpf xpfVar = (xpf) obj;
        return this.f98882a == xpfVar.f98882a && this.f98883b == xpfVar.f98883b;
    }

    public int getHeight() {
        return this.f98883b;
    }

    public int getWidth() {
        return this.f98882a;
    }

    public int hashCode() {
        int i = this.f98883b;
        int i2 = this.f98882a;
        return i ^ ((i2 >>> 16) | (i2 << 16));
    }

    public String toString() {
        return this.f98882a + "x" + this.f98883b;
    }
}
