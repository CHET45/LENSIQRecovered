package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zhg {
    @la8
    public static /* synthetic */ void SynchronizedObject$annotations() {
    }

    @la8
    public static final <T> T synchronizedImpl(@yfb Object obj, @yfb ny6<? extends T> ny6Var) {
        T tInvoke;
        synchronized (obj) {
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
