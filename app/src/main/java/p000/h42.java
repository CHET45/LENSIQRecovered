package p000;

import p000.a32;
import p000.p7e;

/* JADX INFO: loaded from: classes6.dex */
public class h42 implements g42 {

    /* JADX INFO: renamed from: a */
    public final i6c f42295a = new i6c();

    /* JADX INFO: renamed from: h42$a */
    public class RunnableC6700a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ woe f42296a;

        public RunnableC6700a(woe woeVar) {
            this.f42296a = woeVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    do5<?> do5VarTake = h42.this.f42295a.take();
                    z5c<?> z5cVar = do5VarTake.f30252b;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    pj9.logOperationStarted(z5cVar);
                    pj9.logOperationRunning(z5cVar);
                    aod aodVar = new aod();
                    do5VarTake.run(aodVar, this.f42296a);
                    aodVar.awaitRelease();
                    pj9.logOperationFinished(z5cVar, jCurrentTimeMillis, System.currentTimeMillis());
                } catch (InterruptedException e) {
                    kfe.m14725e(e, "Error while processing client operation queue", new Object[0]);
                }
            }
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: h42$b */
    public class C6701b<T> implements csb<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ z5c f42298a;

        /* JADX INFO: renamed from: h42$b$a */
        public class a implements InterfaceC7776j8 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ do5 f42300a;

            public a(do5 do5Var) {
                this.f42300a = do5Var;
            }

            @Override // p000.InterfaceC7776j8
            public void run() {
                if (h42.this.f42295a.remove(this.f42300a)) {
                    pj9.logOperationRemoved(C6701b.this.f42298a);
                }
            }
        }

        public C6701b(z5c z5cVar) {
            this.f42298a = z5cVar;
        }

        @Override // p000.csb
        public void subscribe(lob<T> lobVar) {
            do5 do5Var = new do5(this.f42298a, lobVar);
            lobVar.setDisposable(lf4.fromAction(new a(do5Var)));
            pj9.logOperationQueued(this.f42298a);
            h42.this.f42295a.add(do5Var);
        }
    }

    @b28
    public h42(@w8b(a32.C0034g.f249c) woe woeVar) {
        new Thread(new RunnableC6700a(woeVar)).start();
    }

    @Override // p000.g42
    @p7e({p7e.EnumC10826a.f69935b})
    public <T> vkb<T> queue(z5c<T> z5cVar) {
        return vkb.create(new C6701b(z5cVar));
    }
}
