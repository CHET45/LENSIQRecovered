package p000;

import p000.r78;

/* JADX INFO: renamed from: tm */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class C13101tm implements x4d {

    /* JADX INFO: renamed from: c */
    public static final int f85293c = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final InterfaceC9407mm f85294a;

    /* JADX INFO: renamed from: b */
    public final long f85295b;

    public /* synthetic */ C13101tm(InterfaceC9407mm interfaceC9407mm, long j, jt3 jt3Var) {
        this(interfaceC9407mm, j);
    }

    @Override // p000.x4d
    /* JADX INFO: renamed from: calculatePosition-llwVHH4 */
    public long mo27992calculatePositionllwVHH4(@yfb l78 l78Var, long j, @yfb ov8 ov8Var, long j2) {
        InterfaceC9407mm interfaceC9407mm = this.f85294a;
        r78.C11932a c11932a = r78.f77324b;
        long jMo30996alignKFBX0sM = interfaceC9407mm.mo30996alignKFBX0sM(c11932a.m32092getZeroYbymL2g(), l78Var.m30826getSizeYbymL2g(), ov8Var);
        return a78.m27205plusqkQi6aY(a78.m27205plusqkQi6aY(a78.m27205plusqkQi6aY(l78Var.m30828getTopLeftnOccac(), jMo30996alignKFBX0sM), a78.m27209unaryMinusnOccac(this.f85294a.mo30996alignKFBX0sM(c11932a.m32092getZeroYbymL2g(), j2, ov8Var))), b78.IntOffset(a78.m27201getXimpl(this.f85295b) * (ov8Var == ov8.Ltr ? 1 : -1), a78.m27202getYimpl(this.f85295b)));
    }

    @yfb
    public final InterfaceC9407mm getAlignment() {
        return this.f85294a;
    }

    /* JADX INFO: renamed from: getOffset-nOcc-ac, reason: not valid java name */
    public final long m32418getOffsetnOccac() {
        return this.f85295b;
    }

    private C13101tm(InterfaceC9407mm interfaceC9407mm, long j) {
        this.f85294a = interfaceC9407mm;
        this.f85295b = j;
    }
}
