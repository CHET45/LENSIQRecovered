package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hh9 {
    public final <T> T synchronizedImpl(@yfb ny6<? extends T> ny6Var) {
        T tInvoke;
        md8.checkNotNullParameter(ny6Var, "block");
        synchronized (this) {
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
