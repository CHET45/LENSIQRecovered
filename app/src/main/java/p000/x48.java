package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class x48 {

    /* JADX INFO: renamed from: e */
    public static final int f96687e = 0;

    /* JADX INFO: renamed from: a */
    public final int f96688a;

    /* JADX INFO: renamed from: b */
    public final int f96689b;

    /* JADX INFO: renamed from: c */
    public final int f96690c;

    /* JADX INFO: renamed from: d */
    public final int f96691d;

    public x48(int i, int i2, int i3, int i4) {
        this.f96688a = i;
        this.f96689b = i2;
        this.f96690c = i3;
        this.f96691d = i4;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x48)) {
            return false;
        }
        x48 x48Var = (x48) obj;
        return this.f96688a == x48Var.f96688a && this.f96689b == x48Var.f96689b && this.f96690c == x48Var.f96690c && this.f96691d == x48Var.f96691d;
    }

    public final int getBottom() {
        return this.f96691d;
    }

    public final int getLeft() {
        return this.f96688a;
    }

    public final int getRight() {
        return this.f96690c;
    }

    public final int getTop() {
        return this.f96689b;
    }

    public int hashCode() {
        return (((((this.f96688a * 31) + this.f96689b) * 31) + this.f96690c) * 31) + this.f96691d;
    }

    @yfb
    public String toString() {
        return "InsetsValues(left=" + this.f96688a + ", top=" + this.f96689b + ", right=" + this.f96690c + ", bottom=" + this.f96691d + ')';
    }
}
