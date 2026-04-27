package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gxb<T, U, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final j11<? super T, ? super U, ? extends R> f41763b;

    /* JADX INFO: renamed from: c */
    public final xub<? extends U> f41764c;

    /* JADX INFO: renamed from: gxb$a */
    public static final class C6640a<T, U, R> extends AtomicReference<U> implements oxb<T>, mf4 {
        private static final long serialVersionUID = -312246233408980075L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f41765a;

        /* JADX INFO: renamed from: b */
        public final j11<? super T, ? super U, ? extends R> f41766b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<mf4> f41767c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicReference<mf4> f41768d = new AtomicReference<>();

        public C6640a(oxb<? super R> oxbVar, j11<? super T, ? super U, ? extends R> j11Var) {
            this.f41765a = oxbVar;
            this.f41766b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f41767c);
            ag4.dispose(this.f41768d);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f41767c.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            ag4.dispose(this.f41768d);
            this.f41765a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            ag4.dispose(this.f41768d);
            this.f41765a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            U u = get();
            if (u != null) {
                try {
                    this.f41765a.onNext(xjb.requireNonNull(this.f41766b.apply(t, u), "The combiner returned a null value"));
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    dispose();
                    this.f41765a.onError(th);
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this.f41767c, mf4Var);
        }

        public void otherError(Throwable th) {
            ag4.dispose(this.f41767c);
            this.f41765a.onError(th);
        }

        public boolean setOther(mf4 mf4Var) {
            return ag4.setOnce(this.f41768d, mf4Var);
        }
    }

    /* JADX INFO: renamed from: gxb$b */
    public final class C6641b implements oxb<U> {

        /* JADX INFO: renamed from: a */
        public final C6640a<T, U, R> f41769a;

        public C6641b(C6640a<T, U, R> c6640a) {
            this.f41769a = c6640a;
        }

        @Override // p000.oxb
        public void onComplete() {
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f41769a.otherError(th);
        }

        @Override // p000.oxb
        public void onNext(U u) {
            this.f41769a.lazySet(u);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            this.f41769a.setOther(mf4Var);
        }
    }

    public gxb(xub<T> xubVar, j11<? super T, ? super U, ? extends R> j11Var, xub<? extends U> xubVar2) {
        super(xubVar);
        this.f41763b = j11Var;
        this.f41764c = xubVar2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        n1f n1fVar = new n1f(oxbVar);
        C6640a c6640a = new C6640a(n1fVar, this.f41763b);
        n1fVar.onSubscribe(c6640a);
        this.f41764c.subscribe(new C6641b(c6640a));
        this.f66354a.subscribe(c6640a);
    }
}
