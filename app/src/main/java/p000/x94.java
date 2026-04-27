package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class x94 extends RuntimeException {

    /* JADX INFO: renamed from: a */
    @yfb
    public final transient e13 f97243a;

    public x94(@yfb e13 e13Var) {
        this.f97243a = e13Var;
    }

    @Override // java.lang.Throwable
    @yfb
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    @yfb
    public String getLocalizedMessage() {
        return this.f97243a.toString();
    }
}
