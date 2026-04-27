package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class z16 implements vli {

    /* JADX INFO: renamed from: b */
    public final int f103655b;

    /* JADX INFO: renamed from: c */
    public final int f103656c;

    /* JADX INFO: renamed from: d */
    public final int f103657d;

    /* JADX INFO: renamed from: e */
    public final int f103658e;

    public z16(int i, int i2, int i3, int i4) {
        this.f103655b = i;
        this.f103656c = i2;
        this.f103657d = i3;
        this.f103658e = i4;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z16)) {
            return false;
        }
        z16 z16Var = (z16) obj;
        return this.f103655b == z16Var.f103655b && this.f103656c == z16Var.f103656c && this.f103657d == z16Var.f103657d && this.f103658e == z16Var.f103658e;
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return this.f103658e;
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return this.f103655b;
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return this.f103657d;
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return this.f103656c;
    }

    public int hashCode() {
        return (((((this.f103655b * 31) + this.f103656c) * 31) + this.f103657d) * 31) + this.f103658e;
    }

    @yfb
    public String toString() {
        return "Insets(left=" + this.f103655b + ", top=" + this.f103656c + ", right=" + this.f103657d + ", bottom=" + this.f103658e + ')';
    }
}
