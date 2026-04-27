package p000;

/* JADX INFO: loaded from: classes.dex */
public final class cwc implements aac {

    /* JADX INFO: renamed from: a */
    @yfb
    public final vba f27949a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final km9 f27950b;

    public cwc(@yfb vba vbaVar, @yfb km9 km9Var) {
        this.f27949a = vbaVar;
        this.f27950b = km9Var;
    }

    public static /* synthetic */ cwc copy$default(cwc cwcVar, vba vbaVar, km9 km9Var, int i, Object obj) {
        if ((i & 1) != 0) {
            vbaVar = cwcVar.f27949a;
        }
        if ((i & 2) != 0) {
            km9Var = cwcVar.f27950b;
        }
        return cwcVar.copy(vbaVar, km9Var);
    }

    @yfb
    public final vba component1() {
        return this.f27949a;
    }

    @yfb
    public final km9 component2() {
        return this.f27950b;
    }

    @yfb
    public final cwc copy(@yfb vba vbaVar, @yfb km9 km9Var) {
        return new cwc(vbaVar, km9Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cwc)) {
            return false;
        }
        cwc cwcVar = (cwc) obj;
        return md8.areEqual(this.f27949a, cwcVar.f27949a) && md8.areEqual(this.f27950b, cwcVar.f27950b);
    }

    @yfb
    public final km9 getPlaceable() {
        return this.f27950b;
    }

    @yfb
    public final vba getResult() {
        return this.f27949a;
    }

    public int hashCode() {
        return (this.f27949a.hashCode() * 31) + this.f27950b.hashCode();
    }

    @Override // p000.aac
    public boolean isValidOwnerScope() {
        return this.f27950b.getCoordinates().isAttached();
    }

    @yfb
    public String toString() {
        return "PlaceableResult(result=" + this.f27949a + ", placeable=" + this.f27950b + ')';
    }
}
