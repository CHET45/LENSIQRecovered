package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class h85 implements vli {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vli f42898b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final vli f42899c;

    public h85(@yfb vli vliVar, @yfb vli vliVar2) {
        this.f42898b = vliVar;
        this.f42899c = vliVar2;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h85)) {
            return false;
        }
        h85 h85Var = (h85) obj;
        return md8.areEqual(h85Var.f42898b, this.f42898b) && md8.areEqual(h85Var.f42899c, this.f42899c);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return kpd.coerceAtLeast(this.f42898b.getBottom(c64Var) - this.f42899c.getBottom(c64Var), 0);
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return kpd.coerceAtLeast(this.f42898b.getLeft(c64Var, ov8Var) - this.f42899c.getLeft(c64Var, ov8Var), 0);
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return kpd.coerceAtLeast(this.f42898b.getRight(c64Var, ov8Var) - this.f42899c.getRight(c64Var, ov8Var), 0);
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return kpd.coerceAtLeast(this.f42898b.getTop(c64Var) - this.f42899c.getTop(c64Var), 0);
    }

    public int hashCode() {
        return (this.f42898b.hashCode() * 31) + this.f42899c.hashCode();
    }

    @yfb
    public String toString() {
        return '(' + this.f42898b + " - " + this.f42899c + ')';
    }
}
