package p000;

/* JADX INFO: renamed from: rh */
/* JADX INFO: loaded from: classes.dex */
@f0g
public final class C12086rh implements vli {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vli f78279b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final vli f78280c;

    public C12086rh(@yfb vli vliVar, @yfb vli vliVar2) {
        this.f78279b = vliVar;
        this.f78280c = vliVar2;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12086rh)) {
            return false;
        }
        C12086rh c12086rh = (C12086rh) obj;
        return md8.areEqual(c12086rh.f78279b, this.f78279b) && md8.areEqual(c12086rh.f78280c, this.f78280c);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return this.f78279b.getBottom(c64Var) + this.f78280c.getBottom(c64Var);
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return this.f78279b.getLeft(c64Var, ov8Var) + this.f78280c.getLeft(c64Var, ov8Var);
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return this.f78279b.getRight(c64Var, ov8Var) + this.f78280c.getRight(c64Var, ov8Var);
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return this.f78279b.getTop(c64Var) + this.f78280c.getTop(c64Var);
    }

    public int hashCode() {
        return this.f78279b.hashCode() + (this.f78280c.hashCode() * 31);
    }

    @yfb
    public String toString() {
        return '(' + this.f78279b + " + " + this.f78280c + ')';
    }
}
