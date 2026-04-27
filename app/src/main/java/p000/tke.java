package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public class tke implements Executor {

    /* JADX INFO: renamed from: a */
    public final Executor f85138a;

    /* JADX INFO: renamed from: tke$a */
    public static class RunnableC13085a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final Runnable f85139a;

        public RunnableC13085a(Runnable runnable) {
            this.f85139a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f85139a.run();
            } catch (Exception e) {
                tj9.m22696e("Executor", "Background execution failure.", e);
            }
        }
    }

    public tke(Executor executor) {
        this.f85138a = executor;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f85138a.execute(new RunnableC13085a(runnable));
    }
}
