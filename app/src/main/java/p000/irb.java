package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class irb<T, R> extends AbstractC10162o3<T, xub<? extends R>> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends R>> f48086b;

    /* JADX INFO: renamed from: c */
    public final py6<? super Throwable, ? extends xub<? extends R>> f48087c;

    /* JADX INFO: renamed from: d */
    public final Callable<? extends xub<? extends R>> f48088d;

    /* JADX INFO: renamed from: irb$a */
    public static final class C7577a<T, R> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super xub<? extends R>> f48089a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f48090b;

        /* JADX INFO: renamed from: c */
        public final py6<? super Throwable, ? extends xub<? extends R>> f48091c;

        /* JADX INFO: renamed from: d */
        public final Callable<? extends xub<? extends R>> f48092d;

        /* JADX INFO: renamed from: e */
        public mf4 f48093e;

        public C7577a(oxb<? super xub<? extends R>> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var, py6<? super Throwable, ? extends xub<? extends R>> py6Var2, Callable<? extends xub<? extends R>> callable) {
            this.f48089a = oxbVar;
            this.f48090b = py6Var;
            this.f48091c = py6Var2;
            this.f48092d = callable;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f48093e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f48093e.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            try {
                this.f48089a.onNext((xub) xjb.requireNonNull(this.f48092d.call(), "The onComplete ObservableSource returned is null"));
                this.f48089a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f48089a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            try {
                this.f48089a.onNext((xub) xjb.requireNonNull(this.f48091c.apply(th), "The onError ObservableSource returned is null"));
                this.f48089a.onComplete();
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f48089a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            try {
                this.f48089a.onNext((xub) xjb.requireNonNull(this.f48090b.apply(t), "The onNext ObservableSource returned is null"));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f48089a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f48093e, mf4Var)) {
                this.f48093e = mf4Var;
                this.f48089a.onSubscribe(this);
            }
        }
    }

    public irb(xub<T> xubVar, py6<? super T, ? extends xub<? extends R>> py6Var, py6<? super Throwable, ? extends xub<? extends R>> py6Var2, Callable<? extends xub<? extends R>> callable) {
        super(xubVar);
        this.f48086b = py6Var;
        this.f48087c = py6Var2;
        this.f48088d = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super xub<? extends R>> oxbVar) {
        this.f66354a.subscribe(new C7577a(oxbVar, this.f48086b, this.f48087c, this.f48088d));
    }
}
