package p000;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import p000.a32;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class cs2 implements bs2, qs2 {

    /* JADX INFO: renamed from: a */
    public final String f27183a;

    /* JADX INFO: renamed from: b */
    public final he4 f27184b;

    /* JADX INFO: renamed from: c */
    public fg4<c51> f27185c;

    /* JADX INFO: renamed from: e */
    public final Future<?> f27187e;

    /* JADX INFO: renamed from: d */
    public final i6c f27186d = new i6c();

    /* JADX INFO: renamed from: f */
    public volatile boolean f27188f = true;

    /* JADX INFO: renamed from: m */
    public c51 f27189m = null;

    /* JADX INFO: renamed from: cs2$a */
    public class RunnableC4473a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ woe f27190a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ String f27191b;

        public RunnableC4473a(woe woeVar, String str) {
            this.f27190a = woeVar;
            this.f27191b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (cs2.this.f27188f) {
                try {
                    do5<?> do5VarTake = cs2.this.f27186d.take();
                    z5c<?> z5cVar = do5VarTake.f30252b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    pj9.logOperationStarted(z5cVar);
                    pj9.logOperationRunning(z5cVar);
                    aod aodVar = new aod();
                    do5VarTake.run(aodVar, this.f27190a);
                    aodVar.awaitRelease();
                    pj9.logOperationFinished(z5cVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e) {
                    synchronized (cs2.this) {
                        try {
                            if (!cs2.this.f27188f) {
                                cs2.this.m8670a();
                                kfe.m14728v("Terminated (%s)", pj9.commonMacMessage(this.f27191b));
                            }
                            kfe.m14725e(e, "Error while processing connection operation queue", new Object[0]);
                        } finally {
                        }
                    }
                }
            }
            cs2.this.m8670a();
            kfe.m14728v("Terminated (%s)", pj9.commonMacMessage(this.f27191b));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: cs2$b */
    public class C4474b<T> implements csb<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z5c f27193a;

        /* JADX INFO: renamed from: cs2$b$a */
        public class a implements bq1 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ do5 f27195a;

            public a(do5 do5Var) {
                this.f27195a = do5Var;
            }

            @Override // p000.bq1
            public void cancel() {
                if (cs2.this.f27186d.remove(this.f27195a)) {
                    pj9.logOperationRemoved(C4474b.this.f27193a);
                }
            }
        }

        public C4474b(z5c z5cVar) {
            this.f27193a = z5cVar;
        }

        @Override // p000.csb
        public void subscribe(lob<T> lobVar) {
            do5 do5Var = new do5(this.f27193a, lobVar);
            lobVar.setCancellable(new a(do5Var));
            pj9.logOperationQueued(this.f27193a);
            cs2.this.f27186d.add(do5Var);
        }
    }

    /* JADX INFO: renamed from: cs2$c */
    public class C4475c extends fg4<c51> {
        public C4475c() {
        }

        @Override // p000.pxb
        public void onComplete() {
        }

        @Override // p000.pxb
        public void onError(Throwable th) {
        }

        @Override // p000.pxb
        public void onNext(c51 c51Var) {
            cs2.this.terminate(c51Var);
        }
    }

    @b28
    public cs2(@w8b(x84.f97163a) String str, he4 he4Var, @w8b(a32.C0033f.f246b) ExecutorService executorService, @w8b(a32.C0034g.f249c) woe woeVar) {
        this.f27183a = str;
        this.f27184b = he4Var;
        this.f27187e = executorService.submit(new RunnableC4473a(woeVar, str));
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m8670a() {
        while (!this.f27186d.isEmpty()) {
            this.f27186d.takeNow().f30253c.tryOnError(this.f27189m);
        }
    }

    @Override // p000.qs2
    public void onConnectionSubscribed() {
        this.f27185c = (fg4) this.f27184b.asValueOnlyObservable().subscribeWith(new C4475c());
    }

    @Override // p000.qs2
    public void onConnectionUnsubscribed() {
        this.f27185c.dispose();
        this.f27185c = null;
        terminate(new b51(this.f27183a, -1));
    }

    @Override // p000.g42
    @p7e({p7e.EnumC10826a.f69935b})
    public synchronized <T> vkb<T> queue(z5c<T> z5cVar) {
        if (this.f27188f) {
            return vkb.create(new C4474b(z5cVar));
        }
        return vkb.error(this.f27189m);
    }

    @Override // p000.bs2
    public synchronized void terminate(c51 c51Var) {
        if (this.f27189m != null) {
            return;
        }
        kfe.m14723d(c51Var, "Connection operations queue to be terminated (%s)", pj9.commonMacMessage(this.f27183a));
        this.f27188f = false;
        this.f27189m = c51Var;
        this.f27187e.cancel(true);
    }
}
