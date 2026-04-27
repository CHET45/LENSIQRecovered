package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class tv9 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f86098a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final f78 f86099b;

    public tv9(@yfb String str, @yfb f78 f78Var) {
        md8.checkNotNullParameter(str, "value");
        md8.checkNotNullParameter(f78Var, "range");
        this.f86098a = str;
        this.f86099b = f78Var;
    }

    public static /* synthetic */ tv9 copy$default(tv9 tv9Var, String str, f78 f78Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tv9Var.f86098a;
        }
        if ((i & 2) != 0) {
            f78Var = tv9Var.f86099b;
        }
        return tv9Var.copy(str, f78Var);
    }

    @yfb
    public final String component1() {
        return this.f86098a;
    }

    @yfb
    public final f78 component2() {
        return this.f86099b;
    }

    @yfb
    public final tv9 copy(@yfb String str, @yfb f78 f78Var) {
        md8.checkNotNullParameter(str, "value");
        md8.checkNotNullParameter(f78Var, "range");
        return new tv9(str, f78Var);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tv9)) {
            return false;
        }
        tv9 tv9Var = (tv9) obj;
        return md8.areEqual(this.f86098a, tv9Var.f86098a) && md8.areEqual(this.f86099b, tv9Var.f86099b);
    }

    @yfb
    public final f78 getRange() {
        return this.f86099b;
    }

    @yfb
    public final String getValue() {
        return this.f86098a;
    }

    public int hashCode() {
        return (this.f86098a.hashCode() * 31) + this.f86099b.hashCode();
    }

    @yfb
    public String toString() {
        return "MatchGroup(value=" + this.f86098a + ", range=" + this.f86099b + ')';
    }
}
