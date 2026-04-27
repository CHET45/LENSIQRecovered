package p000;

import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class gpb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends Iterable<? extends R>> f40712b;

    /* JADX INFO: renamed from: gpb$a */
    public static final class C6458a<T, R> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f40713a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends Iterable<? extends R>> f40714b;

        /* JADX INFO: renamed from: c */
        public mf4 f40715c;

        public C6458a(oxb<? super R> oxbVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
            this.f40713a = oxbVar;
            this.f40714b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f40715c.dispose();
            this.f40715c = ag4.DISPOSED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f40715c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            mf4 mf4Var = this.f40715c;
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var) {
                return;
            }
            this.f40715c = ag4Var;
            this.f40713a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            mf4 mf4Var = this.f40715c;
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var) {
                pfe.onError(th);
            } else {
                this.f40715c = ag4Var;
                this.f40713a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f40715c == ag4.DISPOSED) {
                return;
            }
            try {
                Iterator<? extends R> it = this.f40714b.apply(t).iterator();
                oxb<? super R> oxbVar = this.f40713a;
                while (it.hasNext()) {
                    try {
                        try {
                            oxbVar.onNext((Object) xjb.requireNonNull(it.next(), "The iterator returned a null value"));
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f40715c.dispose();
                            onError(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        this.f40715c.dispose();
                        onError(th2);
                        return;
                    }
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                this.f40715c.dispose();
                onError(th3);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f40715c, mf4Var)) {
                this.f40715c = mf4Var;
                this.f40713a.onSubscribe(this);
            }
        }
    }

    public gpb(xub<T> xubVar, py6<? super T, ? extends Iterable<? extends R>> py6Var) {
        super(xubVar);
        this.f40712b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f66354a.subscribe(new C6458a(oxbVar, this.f40712b));
    }
}
