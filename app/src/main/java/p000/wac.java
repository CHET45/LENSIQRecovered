package p000;

/* JADX INFO: loaded from: classes.dex */
@f0g
public final class wac extends t48 {

    /* JADX INFO: renamed from: b */
    @yfb
    public final vac f93820b;

    public wac(@yfb vac vacVar) {
        super(null);
        this.f93820b = vacVar;
    }

    @Override // p000.t48
    @yfb
    public vli calculateInsets(@yfb vli vliVar) {
        return goi.add(goi.asInsets(this.f93820b), vliVar);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof wac) {
            return md8.areEqual(((wac) obj).f93820b, this.f93820b);
        }
        return false;
    }

    public int hashCode() {
        return this.f93820b.hashCode();
    }
}
