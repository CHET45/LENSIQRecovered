package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class o39 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final C5297eh f66415a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f66416b;

    public o39(@yfb C5297eh c5297eh, @yfb String str) {
        md8.checkNotNullParameter(c5297eh, "buyer");
        md8.checkNotNullParameter(str, "name");
        this.f66415a = c5297eh;
        this.f66416b = str;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o39)) {
            return false;
        }
        o39 o39Var = (o39) obj;
        return md8.areEqual(this.f66415a, o39Var.f66415a) && md8.areEqual(this.f66416b, o39Var.f66416b);
    }

    @yfb
    public final C5297eh getBuyer() {
        return this.f66415a;
    }

    @yfb
    public final String getName() {
        return this.f66416b;
    }

    public int hashCode() {
        return (this.f66415a.hashCode() * 31) + this.f66416b.hashCode();
    }

    @yfb
    public String toString() {
        return "LeaveCustomAudience: buyer=" + this.f66415a + ", name=" + this.f66416b;
    }
}
