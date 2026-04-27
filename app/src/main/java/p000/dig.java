package p000;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nSynchronizedObject.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n+ 2 SynchronizedObject.jvm.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObject_jvmKt\n*L\n1#1,57:1\n23#2:58\n*S KotlinDebug\n*F\n+ 1 SynchronizedObject.kt\nandroidx/lifecycle/viewmodel/internal/SynchronizedObjectKt\n*L\n37#1:58\n*E\n"})
public final class dig {
    /* JADX INFO: renamed from: synchronized, reason: not valid java name */
    public static final <T> T m28646synchronized(@yfb big bigVar, @yfb ny6<? extends T> ny6Var) {
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
