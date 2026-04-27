package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class k0g implements a23 {

    /* JADX INFO: renamed from: a */
    @gib
    public final a23 f52355a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final StackTraceElement f52356b;

    public k0g(@gib a23 a23Var, @yfb StackTraceElement stackTraceElement) {
        this.f52355a = a23Var;
        this.f52356b = stackTraceElement;
    }

    @Override // p000.a23
    @gib
    public a23 getCallerFrame() {
        return this.f52355a;
    }

    @Override // p000.a23
    @yfb
    public StackTraceElement getStackTraceElement() {
        return this.f52356b;
    }
}
