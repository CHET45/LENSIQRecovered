package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class zxc {

    /* JADX INFO: renamed from: c */
    public static final int f106348c = 0;

    /* JADX INFO: renamed from: a */
    @gib
    public final qxc f106349a;

    /* JADX INFO: renamed from: b */
    @gib
    public final mxc f106350b;

    public /* synthetic */ zxc(int i, jt3 jt3Var) {
        this(i);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zxc)) {
            return false;
        }
        zxc zxcVar = (zxc) obj;
        return md8.areEqual(this.f106350b, zxcVar.f106350b) && md8.areEqual(this.f106349a, zxcVar.f106349a);
    }

    @gib
    public final mxc getParagraphStyle() {
        return this.f106350b;
    }

    @gib
    public final qxc getSpanStyle() {
        return this.f106349a;
    }

    public int hashCode() {
        qxc qxcVar = this.f106349a;
        int iHashCode = (qxcVar != null ? qxcVar.hashCode() : 0) * 31;
        mxc mxcVar = this.f106350b;
        return iHashCode + (mxcVar != null ? mxcVar.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f106349a + ", paragraphSyle=" + this.f106350b + ')';
    }

    public zxc(@gib qxc qxcVar, @gib mxc mxcVar) {
        this.f106349a = qxcVar;
        this.f106350b = mxcVar;
    }

    public /* synthetic */ zxc(boolean z, int i, jt3 jt3Var) {
        this((i & 1) != 0 ? false : z);
    }

    public zxc(boolean z) {
        this((qxc) null, new mxc(z));
    }

    private zxc(int i) {
        this((qxc) null, new mxc(i, (jt3) null));
    }
}
