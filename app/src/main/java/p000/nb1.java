package p000;

/* JADX INFO: loaded from: classes.dex */
@vw7
public final class nb1 {

    /* JADX INFO: renamed from: c */
    public static final int f63850c = 0;

    /* JADX INFO: renamed from: a */
    public final float f63851a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final he1 f63852b;

    public /* synthetic */ nb1(float f, he1 he1Var, jt3 jt3Var) {
        this(f, he1Var);
    }

    /* JADX INFO: renamed from: copy-D5KLDUw$default, reason: not valid java name */
    public static /* synthetic */ nb1 m31144copyD5KLDUw$default(nb1 nb1Var, float f, he1 he1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            f = nb1Var.f63851a;
        }
        if ((i & 2) != 0) {
            he1Var = nb1Var.f63852b;
        }
        return nb1Var.m31145copyD5KLDUw(f, he1Var);
    }

    @yfb
    /* JADX INFO: renamed from: copy-D5KLDUw, reason: not valid java name */
    public final nb1 m31145copyD5KLDUw(float f, @yfb he1 he1Var) {
        return new nb1(f, he1Var, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nb1)) {
            return false;
        }
        nb1 nb1Var = (nb1) obj;
        return kn4.m30710equalsimpl0(this.f63851a, nb1Var.f63851a) && md8.areEqual(this.f63852b, nb1Var.f63852b);
    }

    @yfb
    public final he1 getBrush() {
        return this.f63852b;
    }

    /* JADX INFO: renamed from: getWidth-D9Ej5fM, reason: not valid java name */
    public final float m31146getWidthD9Ej5fM() {
        return this.f63851a;
    }

    public int hashCode() {
        return (kn4.m30711hashCodeimpl(this.f63851a) * 31) + this.f63852b.hashCode();
    }

    @yfb
    public String toString() {
        return "BorderStroke(width=" + ((Object) kn4.m30716toStringimpl(this.f63851a)) + ", brush=" + this.f63852b + ')';
    }

    private nb1(float f, he1 he1Var) {
        this.f63851a = f;
        this.f63852b = he1Var;
    }
}
