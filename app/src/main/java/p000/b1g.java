package p000;

/* JADX INFO: loaded from: classes7.dex */
public class b1g extends a1g {
    @t28
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    private static final <R> R m27943synchronized(Object obj, ny6<? extends R> ny6Var) {
        R rInvoke;
        md8.checkNotNullParameter(obj, "lock");
        md8.checkNotNullParameter(ny6Var, "block");
        synchronized (obj) {
            try {
                rInvoke = ny6Var.invoke();
                o28.finallyStart(1);
            } catch (Throwable th) {
                o28.finallyStart(1);
                o28.finallyEnd(1);
                throw th;
            }
        }
        o28.finallyEnd(1);
        return rInvoke;
    }
}
