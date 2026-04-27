package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class vj8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final gb3 f91370a;

    public vj8(@yfb gb3 gb3Var) {
        md8.checkNotNullParameter(gb3Var, "customAudience");
        this.f91370a = gb3Var;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof vj8) {
            return md8.areEqual(this.f91370a, ((vj8) obj).f91370a);
        }
        return false;
    }

    @yfb
    public final gb3 getCustomAudience() {
        return this.f91370a;
    }

    public int hashCode() {
        return this.f91370a.hashCode();
    }

    @yfb
    public String toString() {
        return "JoinCustomAudience: customAudience=" + this.f91370a;
    }
}
