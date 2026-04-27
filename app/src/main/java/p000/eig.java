package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class eig {
    public static final <T> T synchronizedImpl(@yfb big bigVar, @yfb ny6<? extends T> ny6Var) {
        T tInvoke;
        md8.checkNotNullParameter(bigVar, "lock");
        md8.checkNotNullParameter(ny6Var, "action");
        synchronized (bigVar) {
            try {
                tInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return tInvoke;
    }
}
