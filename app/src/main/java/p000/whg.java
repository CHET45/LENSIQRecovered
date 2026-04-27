package p000;

/* JADX INFO: loaded from: classes.dex */
public final class whg {
    @yfb
    public static final cig createSynchronizedObject() {
        return new cig();
    }

    @yjd
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <R> R m32993synchronized(@yfb cig cigVar, @yfb ny6<? extends R> ny6Var) {
        R rInvoke;
        synchronized (cigVar) {
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
