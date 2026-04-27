package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class xsh extends t48 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vli f99148b;

    public xsh(@yfb vli vliVar) {
        super(null);
        this.f99148b = vliVar;
    }

    @Override // p000.t48
    @yfb
    public vli calculateInsets(@yfb vli vliVar) {
        return goi.union(this.f99148b, vliVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof xsh) {
            return md8.areEqual(((xsh) obj).f99148b, this.f99148b);
        }
        return false;
    }

    public int hashCode() {
        return this.f99148b.hashCode();
    }
}
