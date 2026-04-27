package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class tx2 implements x4d {

    /* JADX INFO: renamed from: b */
    public static final int f86249b = 0;

    /* JADX INFO: renamed from: a */
    public final long f86250a;

    public /* synthetic */ tx2(long j, jt3 jt3Var) {
        this(j);
    }

    @Override // p000.x4d
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo27992calculatePositionllwVHH4(@yfb l78 l78Var, long j, @yfb ov8 ov8Var, long j2) {
        return b78.IntOffset(ux2.alignPopupAxis(l78Var.getLeft() + a78.m27201getXimpl(this.f86250a), r78.m32087getWidthimpl(j2), r78.m32087getWidthimpl(j), ov8Var == ov8.Ltr), ux2.alignPopupAxis$default(l78Var.getTop() + a78.m27202getYimpl(this.f86250a), r78.m32086getHeightimpl(j2), r78.m32086getHeightimpl(j), false, 8, null));
    }

    private tx2(long j) {
        this.f86250a = j;
    }
}
