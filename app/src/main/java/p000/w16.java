package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nWindowInsets.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WindowInsets.kt\nandroidx/compose/foundation/layout/FixedDpInsets\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,748:1\n1#2:749\n*E\n"})
@vw7
public final class w16 implements vli {

    /* JADX INFO: renamed from: b */
    public final float f93060b;

    /* JADX INFO: renamed from: c */
    public final float f93061c;

    /* JADX INFO: renamed from: d */
    public final float f93062d;

    /* JADX INFO: renamed from: e */
    public final float f93063e;

    public /* synthetic */ w16(float f, float f2, float f3, float f4, jt3 jt3Var) {
        this(f, f2, f3, f4);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w16)) {
            return false;
        }
        w16 w16Var = (w16) obj;
        return kn4.m30710equalsimpl0(this.f93060b, w16Var.f93060b) && kn4.m30710equalsimpl0(this.f93061c, w16Var.f93061c) && kn4.m30710equalsimpl0(this.f93062d, w16Var.f93062d) && kn4.m30710equalsimpl0(this.f93063e, w16Var.f93063e);
    }

    @Override // p000.vli
    public int getBottom(@yfb c64 c64Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f93063e);
    }

    @Override // p000.vli
    public int getLeft(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f93060b);
    }

    @Override // p000.vli
    public int getRight(@yfb c64 c64Var, @yfb ov8 ov8Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f93062d);
    }

    @Override // p000.vli
    public int getTop(@yfb c64 c64Var) {
        return c64Var.mo27167roundToPx0680j_4(this.f93061c);
    }

    public int hashCode() {
        return (((((kn4.m30711hashCodeimpl(this.f93060b) * 31) + kn4.m30711hashCodeimpl(this.f93061c)) * 31) + kn4.m30711hashCodeimpl(this.f93062d)) * 31) + kn4.m30711hashCodeimpl(this.f93063e);
    }

    @yfb
    public String toString() {
        return "Insets(left=" + ((Object) kn4.m30716toStringimpl(this.f93060b)) + ", top=" + ((Object) kn4.m30716toStringimpl(this.f93061c)) + ", right=" + ((Object) kn4.m30716toStringimpl(this.f93062d)) + ", bottom=" + ((Object) kn4.m30716toStringimpl(this.f93063e)) + ')';
    }

    private w16(float f, float f2, float f3, float f4) {
        this.f93060b = f;
        this.f93061c = f2;
        this.f93062d = f3;
        this.f93063e = f4;
    }
}
