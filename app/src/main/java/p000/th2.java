package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class th2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final qh2 f84667a;

    /* JADX INFO: renamed from: b */
    public final voe f84668b;

    /* JADX INFO: renamed from: th2$a */
    public static final class RunnableC13024a extends AtomicReference<mf4> implements dh2, mf4, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: a */
        public final dh2 f84669a;

        /* JADX INFO: renamed from: b */
        public final b0f f84670b = new b0f();

        /* JADX INFO: renamed from: c */
        public final qh2 f84671c;

        public RunnableC13024a(dh2 dh2Var, qh2 qh2Var) {
            this.f84669a = dh2Var;
            this.f84671c = qh2Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f84670b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f84669a.onComplete();
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f84669a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f84671c.subscribe(this);
        }
    }

    public th2(qh2 qh2Var, voe voeVar) {
        this.f84667a = qh2Var;
        this.f84668b = voeVar;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        RunnableC13024a runnableC13024a = new RunnableC13024a(dh2Var, this.f84667a);
        dh2Var.onSubscribe(runnableC13024a);
        runnableC13024a.f84670b.replace(this.f84668b.scheduleDirect(runnableC13024a));
    }
}
