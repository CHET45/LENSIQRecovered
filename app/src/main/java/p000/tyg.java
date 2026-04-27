package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nThread.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Thread.kt\nkotlin/concurrent/ThreadsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,61:1\n1#2:62\n*E\n"})
@xn8(name = "ThreadsKt")
public final class tyg {

    /* JADX INFO: renamed from: tyg$a */
    public static final class C13290a extends Thread {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ny6<bth> f86351a;

        public C13290a(ny6<bth> ny6Var) {
            this.f86351a = ny6Var;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            this.f86351a.invoke();
        }
    }

    @t28
    private static final <T> T getOrSet(ThreadLocal<T> threadLocal, ny6<? extends T> ny6Var) {
        md8.checkNotNullParameter(threadLocal, "<this>");
        md8.checkNotNullParameter(ny6Var, "default");
        T t = threadLocal.get();
        if (t != null) {
            return t;
        }
        T tInvoke = ny6Var.invoke();
        threadLocal.set(tInvoke);
        return tInvoke;
    }

    @yfb
    public static final Thread thread(boolean z, boolean z2, @gib ClassLoader classLoader, @gib String str, int i, @yfb ny6<bth> ny6Var) {
        md8.checkNotNullParameter(ny6Var, "block");
        C13290a c13290a = new C13290a(ny6Var);
        if (z2) {
            c13290a.setDaemon(true);
        }
        if (i > 0) {
            c13290a.setPriority(i);
        }
        if (str != null) {
            c13290a.setName(str);
        }
        if (classLoader != null) {
            c13290a.setContextClassLoader(classLoader);
        }
        if (z) {
            c13290a.start();
        }
        return c13290a;
    }

    public static /* synthetic */ Thread thread$default(boolean z, boolean z2, ClassLoader classLoader, String str, int i, ny6 ny6Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        boolean z3 = z;
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        boolean z4 = z2;
        ClassLoader classLoader2 = (i2 & 4) != 0 ? null : classLoader;
        String str2 = (i2 & 8) != 0 ? null : str;
        if ((i2 & 16) != 0) {
            i = -1;
        }
        return thread(z3, z4, classLoader2, str2, i, ny6Var);
    }
}
