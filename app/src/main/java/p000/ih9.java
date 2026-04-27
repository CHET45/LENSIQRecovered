package p000;

/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
public final class ih9 {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m30213synchronized(@yfb hh9 hh9Var, @yfb ny6<? extends T> ny6Var) {
        T tInvoke;
        md8.checkNotNullParameter(hh9Var, "<this>");
        md8.checkNotNullParameter(ny6Var, "block");
        synchronized (hh9Var) {
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
