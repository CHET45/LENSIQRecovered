package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zub<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f106125b;

    /* JADX INFO: renamed from: zub$a */
    public static final class C16258a<T> extends AtomicReference<mf4> implements oxb<T>, mf4 {
        private static final long serialVersionUID = 8094547886072529208L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f106126a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<mf4> f106127b = new AtomicReference<>();

        public C16258a(oxb<? super T> oxbVar) {
            this.f106126a = oxbVar;
        }

        /* JADX INFO: renamed from: a */
        public void m27097a(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f106127b);
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f106126a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f106126a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f106126a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f106127b, mf4Var);
        }
    }

    /* JADX INFO: renamed from: zub$b */
    public final class RunnableC16259b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final C16258a<T> f106128a;

        public RunnableC16259b(C16258a<T> c16258a) {
            this.f106128a = c16258a;
        }

        @Override // java.lang.Runnable
        public void run() {
            zub.this.f66354a.subscribe(this.f106128a);
        }
    }

    public zub(xub<T> xubVar, voe voeVar) {
        super(xubVar);
        this.f106125b = voeVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        C16258a c16258a = new C16258a(oxbVar);
        oxbVar.onSubscribe(c16258a);
        c16258a.m27097a(this.f106125b.scheduleDirect(new RunnableC16259b(c16258a)));
    }
}
