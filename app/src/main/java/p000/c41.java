package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nBitmapPainter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,159:1\n26#2:160\n26#2:161\n*S KotlinDebug\n*F\n+ 1 BitmapPainter.kt\nandroidx/compose/ui/graphics/painter/BitmapPainter\n*L\n98#1:160\n99#1:161\n*E\n"})
public final class c41 extends occ {

    /* JADX INFO: renamed from: g */
    @yfb
    public final rs7 f15746g;

    /* JADX INFO: renamed from: h */
    public final long f15747h;

    /* JADX INFO: renamed from: i */
    public final long f15748i;

    /* JADX INFO: renamed from: j */
    public int f15749j;

    /* JADX INFO: renamed from: k */
    public final long f15750k;

    /* JADX INFO: renamed from: l */
    public float f15751l;

    /* JADX INFO: renamed from: m */
    @gib
    public b92 f15752m;

    public /* synthetic */ c41(rs7 rs7Var, long j, long j2, jt3 jt3Var) {
        this(rs7Var, j, j2);
    }

    /* JADX INFO: renamed from: validateSize-N5eqBDc, reason: not valid java name */
    private final long m28194validateSizeN5eqBDc(long j, long j2) {
        if (a78.m27201getXimpl(j) < 0 || a78.m27202getYimpl(j) < 0 || r78.m32087getWidthimpl(j2) < 0 || r78.m32086getHeightimpl(j2) < 0 || r78.m32087getWidthimpl(j2) > this.f15746g.getWidth() || r78.m32086getHeightimpl(j2) > this.f15746g.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return j2;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: a */
    public boolean mo3755a(float f) {
        this.f15751l = f;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: b */
    public boolean mo3756b(@gib b92 b92Var) {
        this.f15752m = b92Var;
        return true;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: d */
    public void mo3757d(@yfb ip4 ip4Var) {
        ip4.m30237drawImageAZ2fEMs$default(ip4Var, this.f15746g, this.f15747h, this.f15748i, 0L, s78.IntSize(Math.round(wpf.m33069getWidthimpl(ip4Var.mo30273getSizeNHjbRc())), Math.round(wpf.m33066getHeightimpl(ip4Var.mo30273getSizeNHjbRc()))), this.f15751l, null, this.f15752m, 0, this.f15749j, 328, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c41)) {
            return false;
        }
        c41 c41Var = (c41) obj;
        return md8.areEqual(this.f15746g, c41Var.f15746g) && a78.m27200equalsimpl0(this.f15747h, c41Var.f15747h) && r78.m32085equalsimpl0(this.f15748i, c41Var.f15748i) && xu5.m33291equalsimpl0(this.f15749j, c41Var.f15749j);
    }

    /* JADX INFO: renamed from: getFilterQuality-f-v9h1I$ui_graphics_release, reason: not valid java name */
    public final int m28195getFilterQualityfv9h1I$ui_graphics_release() {
        return this.f15749j;
    }

    @Override // p000.occ
    /* JADX INFO: renamed from: getIntrinsicSize-NH-jbRc, reason: not valid java name */
    public long mo28196getIntrinsicSizeNHjbRc() {
        return s78.m32288toSizeozmzZPI(this.f15750k);
    }

    public int hashCode() {
        return (((((this.f15746g.hashCode() * 31) + a78.m27203hashCodeimpl(this.f15747h)) * 31) + r78.m32088hashCodeimpl(this.f15748i)) * 31) + xu5.m33292hashCodeimpl(this.f15749j);
    }

    /* JADX INFO: renamed from: setFilterQuality-vDHp3xo$ui_graphics_release, reason: not valid java name */
    public final void m28197setFilterQualityvDHp3xo$ui_graphics_release(int i) {
        this.f15749j = i;
    }

    @yfb
    public String toString() {
        return "BitmapPainter(image=" + this.f15746g + ", srcOffset=" + ((Object) a78.m27208toStringimpl(this.f15747h)) + ", srcSize=" + ((Object) r78.m32090toStringimpl(this.f15748i)) + ", filterQuality=" + ((Object) xu5.m33293toStringimpl(this.f15749j)) + ')';
    }

    public /* synthetic */ c41(rs7 rs7Var, long j, long j2, int i, jt3 jt3Var) {
        this(rs7Var, (i & 2) != 0 ? a78.f545b.m27211getZeronOccac() : j, (i & 4) != 0 ? s78.IntSize(rs7Var.getWidth(), rs7Var.getHeight()) : j2, null);
    }

    private c41(rs7 rs7Var, long j, long j2) {
        this.f15746g = rs7Var;
        this.f15747h = j;
        this.f15748i = j2;
        this.f15749j = xu5.f99348b.m33296getLowfv9h1I();
        this.f15750k = m28194validateSizeN5eqBDc(j, j2);
        this.f15751l = 1.0f;
    }
}
