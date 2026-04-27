package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nTextForegroundStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,149:1\n696#2:150\n*S KotlinDebug\n*F\n+ 1 TextForegroundStyle.kt\nandroidx/compose/ui/text/style/ColorStyle\n*L\n94#1:150\n*E\n"})
public final class ta2 implements btg {

    /* JADX INFO: renamed from: b */
    public final long f84071b;

    public /* synthetic */ ta2(long j, jt3 jt3Var) {
        this(j);
    }

    /* JADX INFO: renamed from: copy-8_81llA$default, reason: not valid java name */
    public static /* synthetic */ ta2 m32391copy8_81llA$default(ta2 ta2Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = ta2Var.f84071b;
        }
        return ta2Var.m32393copy8_81llA(j);
    }

    /* JADX INFO: renamed from: component1-0d7_KjU, reason: not valid java name */
    public final long m32392component10d7_KjU() {
        return this.f84071b;
    }

    @yfb
    /* JADX INFO: renamed from: copy-8_81llA, reason: not valid java name */
    public final ta2 m32393copy8_81llA(long j) {
        return new ta2(j, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ta2) && w82.m32952equalsimpl0(this.f84071b, ((ta2) obj).f84071b);
    }

    @Override // p000.btg
    public float getAlpha() {
        return w82.m32953getAlphaimpl(mo28155getColor0d7_KjU());
    }

    @Override // p000.btg
    @gib
    public he1 getBrush() {
        return null;
    }

    @Override // p000.btg
    /* JADX INFO: renamed from: getColor-0d7_KjU */
    public long mo28155getColor0d7_KjU() {
        return this.f84071b;
    }

    /* JADX INFO: renamed from: getValue-0d7_KjU, reason: not valid java name */
    public final long m32394getValue0d7_KjU() {
        return this.f84071b;
    }

    public int hashCode() {
        return w82.m32958hashCodeimpl(this.f84071b);
    }

    @yfb
    public String toString() {
        return "ColorStyle(value=" + ((Object) w82.m32959toStringimpl(this.f84071b)) + ')';
    }

    private ta2(long j) {
        this.f84071b = j;
        if (j == 16) {
            throw new IllegalArgumentException("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
        }
    }
}
