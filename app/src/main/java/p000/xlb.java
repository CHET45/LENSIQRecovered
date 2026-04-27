package p000;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes7.dex */
public final class xlb<T, U> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final Callable<? extends U> f98426b;

    /* JADX INFO: renamed from: c */
    public final f11<? super U, ? super T> f98427c;

    /* JADX INFO: renamed from: xlb$a */
    public static final class C15185a<T, U> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f98428a;

        /* JADX INFO: renamed from: b */
        public final f11<? super U, ? super T> f98429b;

        /* JADX INFO: renamed from: c */
        public final U f98430c;

        /* JADX INFO: renamed from: d */
        public mf4 f98431d;

        /* JADX INFO: renamed from: e */
        public boolean f98432e;

        public C15185a(oxb<? super U> oxbVar, U u, f11<? super U, ? super T> f11Var) {
            this.f98428a = oxbVar;
            this.f98429b = f11Var;
            this.f98430c = u;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f98431d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f98431d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f98432e) {
                return;
            }
            this.f98432e = true;
            this.f98428a.onNext(this.f98430c);
            this.f98428a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f98432e) {
                pfe.onError(th);
            } else {
                this.f98432e = true;
                this.f98428a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f98432e) {
                return;
            }
            try {
                this.f98429b.accept(this.f98430c, t);
            } catch (Throwable th) {
                this.f98431d.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f98431d, mf4Var)) {
                this.f98431d = mf4Var;
                this.f98428a.onSubscribe(this);
            }
        }
    }

    public xlb(xub<T> xubVar, Callable<? extends U> callable, f11<? super U, ? super T> f11Var) {
        super(xubVar);
        this.f98426b = callable;
        this.f98427c = f11Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        try {
            this.f66354a.subscribe(new C15185a(oxbVar, xjb.requireNonNull(this.f98426b.call(), "The initialSupplier returned a null value"), this.f98427c));
        } catch (Throwable th) {
            c05.error(th, oxbVar);
        }
    }
}
