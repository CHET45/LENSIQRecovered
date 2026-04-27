package p000;

/* JADX INFO: renamed from: xx */
/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class C15339xx implements InterfaceC14819wx {

    /* JADX INFO: renamed from: c */
    public static final int f99603c = 8;

    /* JADX INFO: renamed from: a */
    @yfb
    public yeh<d35> f99604a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final z6b<r78> f99605b = xtf.mutableStateOf$default(r78.m32079boximpl(r78.f77324b.m32092getZeroYbymL2g()), null, 2, null);

    public C15339xx(@yfb yeh<d35> yehVar) {
        this.f99604a = yehVar;
    }

    @yfb
    public final z6b<r78> getTargetSize$animation_release() {
        return this.f99605b;
    }

    @Override // p000.InterfaceC14819wx
    @yfb
    public yeh<d35> getTransition() {
        return this.f99604a;
    }

    public void setTransition(@yfb yeh<d35> yehVar) {
        this.f99604a = yehVar;
    }
}
