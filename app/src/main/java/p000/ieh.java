package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class ieh {

    /* JADX INFO: renamed from: c */
    public static final int f46704c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public final C9041lz f46705a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final nzb f46706b;

    public ieh(@yfb C9041lz c9041lz, @yfb nzb nzbVar) {
        this.f46705a = c9041lz;
        this.f46706b = nzbVar;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ieh)) {
            return false;
        }
        ieh iehVar = (ieh) obj;
        return md8.areEqual(this.f46705a, iehVar.f46705a) && md8.areEqual(this.f46706b, iehVar.f46706b);
    }

    @yfb
    public final nzb getOffsetMapping() {
        return this.f46706b;
    }

    @yfb
    public final C9041lz getText() {
        return this.f46705a;
    }

    public int hashCode() {
        return (this.f46705a.hashCode() * 31) + this.f46706b.hashCode();
    }

    @yfb
    public String toString() {
        return "TransformedText(text=" + ((Object) this.f46705a) + ", offsetMapping=" + this.f46706b + ')';
    }
}
