package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes5.dex */
@gd7(emulated = true)
@qx4
public final class co1 {
    private co1() {
    }

    @jd7
    @yg8
    public static <T> l90<T> asAsyncCallable(final Callable<T> callable, final bb9 listeningExecutorService) {
        v7d.checkNotNull(callable);
        v7d.checkNotNull(listeningExecutorService);
        return new l90() { // from class: zn1
            @Override // p000.l90
            public final ja9 call() {
                return listeningExecutorService.submit(callable);
            }
        };
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: e */
    public static Runnable m4101e(final Runnable task, final lfg<String> nameSupplier) {
        v7d.checkNotNull(nameSupplier);
        v7d.checkNotNull(task);
        return new Runnable() { // from class: bo1
            @Override // java.lang.Runnable
            public final void run() {
                co1.lambda$threadRenaming$3(nameSupplier, task);
            }
        };
    }

    @jd7
    @yg8
    /* JADX INFO: renamed from: f */
    public static <T> Callable<T> m4102f(final Callable<T> callable, final lfg<String> nameSupplier) {
        v7d.checkNotNull(nameSupplier);
        v7d.checkNotNull(callable);
        return new Callable() { // from class: yn1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return co1.lambda$threadRenaming$2(nameSupplier, callable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$returning$0(Object obj) throws Exception {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object lambda$threadRenaming$2(lfg lfgVar, Callable callable) throws Exception {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) lfgVar.get(), threadCurrentThread);
        try {
            return callable.call();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$threadRenaming$3(lfg lfgVar, Runnable runnable) {
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        boolean zTrySetName = trySetName((String) lfgVar.get(), threadCurrentThread);
        try {
            runnable.run();
        } finally {
            if (zTrySetName) {
                trySetName(name, threadCurrentThread);
            }
        }
    }

    public static <T> Callable<T> returning(@agc final T value) {
        return new Callable() { // from class: ao1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return co1.lambda$returning$0(value);
            }
        };
    }

    @jd7
    @yg8
    private static boolean trySetName(String threadName, Thread currentThread) {
        try {
            currentThread.setName(threadName);
            return true;
        } catch (SecurityException unused) {
            return false;
        }
    }
}
