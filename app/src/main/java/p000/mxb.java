package p000;

import io.reactivex.Observable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes7.dex */
public final class mxb<T, U, V> extends Observable<V> {

    /* JADX INFO: renamed from: a */
    public final Observable<? extends T> f62701a;

    /* JADX INFO: renamed from: b */
    public final Iterable<U> f62702b;

    /* JADX INFO: renamed from: c */
    public final j11<? super T, ? super U, ? extends V> f62703c;

    /* JADX INFO: renamed from: mxb$a */
    public static final class C9604a<T, U, V> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super V> f62704a;

        /* JADX INFO: renamed from: b */
        public final Iterator<U> f62705b;

        /* JADX INFO: renamed from: c */
        public final j11<? super T, ? super U, ? extends V> f62706c;

        /* JADX INFO: renamed from: d */
        public mf4 f62707d;

        /* JADX INFO: renamed from: e */
        public boolean f62708e;

        public C9604a(oxb<? super V> oxbVar, Iterator<U> it, j11<? super T, ? super U, ? extends V> j11Var) {
            this.f62704a = oxbVar;
            this.f62705b = it;
            this.f62706c = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m17662a(Throwable th) {
            this.f62708e = true;
            this.f62707d.dispose();
            this.f62704a.onError(th);
        }

        @Override // p000.mf4
        public void dispose() {
            this.f62707d.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f62707d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f62708e) {
                return;
            }
            this.f62708e = true;
            this.f62704a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f62708e) {
                pfe.onError(th);
            } else {
                this.f62708e = true;
                this.f62704a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f62708e) {
                return;
            }
            try {
                try {
                    this.f62704a.onNext(xjb.requireNonNull(this.f62706c.apply(t, xjb.requireNonNull(this.f62705b.next(), "The iterator returned a null value")), "The zipper function returned a null value"));
                    try {
                        if (this.f62705b.hasNext()) {
                            return;
                        }
                        this.f62708e = true;
                        this.f62707d.dispose();
                        this.f62704a.onComplete();
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        m17662a(th);
                    }
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    m17662a(th2);
                }
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                m17662a(th3);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f62707d, mf4Var)) {
                this.f62707d = mf4Var;
                this.f62704a.onSubscribe(this);
            }
        }
    }

    public mxb(Observable<? extends T> observable, Iterable<U> iterable, j11<? super T, ? super U, ? extends V> j11Var) {
        this.f62701a = observable;
        this.f62702b = iterable;
        this.f62703c = j11Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super V> oxbVar) {
        try {
            Iterator it = (Iterator) xjb.requireNonNull(this.f62702b.iterator(), "The iterator returned by other is null");
            try {
                if (it.hasNext()) {
                    this.f62701a.subscribe(new C9604a(oxbVar, it, this.f62703c));
                } else {
                    c05.complete(oxbVar);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                c05.error(th, oxbVar);
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            c05.error(th2, oxbVar);
        }
    }
}
