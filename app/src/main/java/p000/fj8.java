package p000;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@qx4
@yg8
public final class fj8 {

    /* JADX INFO: renamed from: fj8$a */
    public static class C5852a<V> extends yr6<V> implements ja9<V> {

        /* JADX INFO: renamed from: e */
        public static final ThreadFactory f36852e;

        /* JADX INFO: renamed from: f */
        public static final Executor f36853f;

        /* JADX INFO: renamed from: a */
        public final Executor f36854a;

        /* JADX INFO: renamed from: b */
        public final l85 f36855b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f36856c;

        /* JADX INFO: renamed from: d */
        public final Future<V> f36857d;

        static {
            ThreadFactory threadFactoryBuild = new txg().setDaemon(true).setNameFormat("ListenableFutureAdapter-thread-%d").build();
            f36852e = threadFactoryBuild;
            f36853f = Executors.newCachedThreadPool(threadFactoryBuild);
        }

        public C5852a(Future<V> delegate) {
            this(delegate, f36853f);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$addListener$0() {
            try {
                vsh.getUninterruptibly(this.f36857d);
            } catch (Error | RuntimeException | ExecutionException unused) {
            }
            this.f36855b.execute();
        }

        @Override // p000.yr6, p000.zs6
        /* JADX INFO: renamed from: a */
        public Future<V> mo8967m() {
            return this.f36857d;
        }

        @Override // p000.ja9
        public void addListener(Runnable listener, Executor exec) {
            this.f36855b.add(listener, exec);
            if (this.f36856c.compareAndSet(false, true)) {
                if (this.f36857d.isDone()) {
                    this.f36855b.execute();
                } else {
                    this.f36854a.execute(new Runnable() { // from class: ej8
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f33201a.lambda$addListener$0();
                        }
                    });
                }
            }
        }

        public C5852a(Future<V> delegate, Executor adapterExecutor) {
            this.f36855b = new l85();
            this.f36856c = new AtomicBoolean(false);
            this.f36857d = (Future) v7d.checkNotNull(delegate);
            this.f36854a = (Executor) v7d.checkNotNull(adapterExecutor);
        }
    }

    private fj8() {
    }

    public static <V> ja9<V> listenInPoolThread(Future<V> future) {
        return future instanceof ja9 ? (ja9) future : new C5852a(future);
    }

    public static <V> ja9<V> listenInPoolThread(Future<V> future, Executor executor) {
        v7d.checkNotNull(executor);
        if (future instanceof ja9) {
            return (ja9) future;
        }
        return new C5852a(future, executor);
    }
}
