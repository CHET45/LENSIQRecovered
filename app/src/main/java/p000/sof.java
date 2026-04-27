package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class sof<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f82465a;

    /* JADX INFO: renamed from: b */
    public final voe f82466b;

    /* JADX INFO: renamed from: sof$a */
    public static final class RunnableC12721a<T> extends AtomicReference<mf4> implements inf<T>, mf4, Runnable {
        private static final long serialVersionUID = 7000911171163930287L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f82467a;

        /* JADX INFO: renamed from: b */
        public final b0f f82468b = new b0f();

        /* JADX INFO: renamed from: c */
        public final pof<? extends T> f82469c;

        public RunnableC12721a(inf<? super T> infVar, pof<? extends T> pofVar) {
            this.f82467a = infVar;
            this.f82469c = pofVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
            this.f82468b.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f82467a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f82467a.onSuccess(t);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f82469c.subscribe(this);
        }
    }

    public sof(pof<? extends T> pofVar, voe voeVar) {
        this.f82465a = pofVar;
        this.f82466b = voeVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        RunnableC12721a runnableC12721a = new RunnableC12721a(infVar, this.f82465a);
        infVar.onSubscribe(runnableC12721a);
        runnableC12721a.f82468b.replace(this.f82466b.scheduleDirect(runnableC12721a));
    }
}
