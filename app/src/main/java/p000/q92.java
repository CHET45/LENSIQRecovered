package p000;

/* JADX INFO: loaded from: classes.dex */
public final class q92 extends occ {

    /* JADX INFO: renamed from: g */
    public final long f73674g;

    /* JADX INFO: renamed from: h */
    public float f73675h;

    /* JADX INFO: renamed from: i */
    @gib
    public b92 f73676i;

    /* JADX INFO: renamed from: j */
    public final long f73677j;

    public /* synthetic */ q92(long j, jt3 jt3Var) {
        this(j);
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: a */
    public boolean mo3755a(float f) {
        this.f73675h = f;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: b */
    public boolean mo3756b(@gib b92 b92Var) {
        this.f73676i = b92Var;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: d */
    public void mo3757d(@yfb ip4 ip4Var) {
        ip4.m30248drawRectnJ9OG0$default(ip4Var, this.f73674g, 0L, 0L, this.f73675h, null, this.f73676i, 0, 86, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q92) && w82.m32952equalsimpl0(this.f73674g, ((q92) obj).f73674g);
    }

    /* JADX INFO: renamed from: getColor-0d7_KjU, reason: not valid java name */
    public final long m31935getColor0d7_KjU() {
        return this.f73674g;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc */
    public long mo28196getIntrinsicSizeNHjbRc() {
        return this.f73677j;
    }

    public int hashCode() {
        return w82.m32958hashCodeimpl(this.f73674g);
    }

    @yfb
    public String toString() {
        return "ColorPainter(color=" + ((Object) w82.m32959toStringimpl(this.f73674g)) + ')';
    }

    private q92(long j) {
        this.f73674g = j;
        this.f73675h = 1.0f;
        this.f73677j = wpf.f95046b.m33077getUnspecifiedNHjbRc();
    }
}
