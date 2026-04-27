package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class wsh implements vli {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vli f95457b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final vli f95458c;

    public wsh(@yfb vli vliVar, @yfb vli vliVar2) {
        this.f95457b = vliVar;
        this.f95458c = vliVar2;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wsh)) {
            return false;
        }
        wsh wshVar = (wsh) obj;
        return md8.areEqual(wshVar.f95457b, this.f95457b) && md8.areEqual(wshVar.f95458c, this.f95458c);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return Math.max(this.f95457b.getBottom(c64Var), this.f95458c.getBottom(c64Var));
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return Math.max(this.f95457b.getLeft(c64Var, ov8Var), this.f95458c.getLeft(c64Var, ov8Var));
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return Math.max(this.f95457b.getRight(c64Var, ov8Var), this.f95458c.getRight(c64Var, ov8Var));
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return Math.max(this.f95457b.getTop(c64Var), this.f95458c.getTop(c64Var));
    }

    public int hashCode() {
        return this.f95457b.hashCode() + (this.f95458c.hashCode() * 31);
    }

    @yfb
    public String toString() {
        return '(' + this.f95457b + " ∪ " + this.f95458c + ')';
    }
}
