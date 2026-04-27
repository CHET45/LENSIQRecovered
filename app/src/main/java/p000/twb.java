package p000;

import io.reactivex.Observable;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
public final class twb<T, D> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final Callable<? extends D> f86189a;

    /* JADX INFO: renamed from: b */
    public final py6<? super D, ? extends xub<? extends T>> f86190b;

    /* JADX INFO: renamed from: c */
    public final tu2<? super D> f86191c;

    /* JADX INFO: renamed from: d */
    public final boolean f86192d;

    /* JADX INFO: renamed from: twb$a */
    public static final class C13258a<T, D> extends AtomicBoolean implements oxb<T>, mf4 {
        private static final long serialVersionUID = 5904473792286235046L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f86193a;

        /* JADX INFO: renamed from: b */
        public final D f86194b;

        /* JADX INFO: renamed from: c */
        public final tu2<? super D> f86195c;

        /* JADX INFO: renamed from: d */
        public final boolean f86196d;

        /* JADX INFO: renamed from: e */
        public mf4 f86197e;

        public C13258a(oxb<? super T> oxbVar, D d, tu2<? super D> tu2Var, boolean z) {
            this.f86193a = oxbVar;
            this.f86194b = d;
            this.f86195c = tu2Var;
            this.f86196d = z;
        }

        /* JADX INFO: renamed from: a */
        public void m22887a() {
            if (compareAndSet(false, true)) {
                try {
                    this.f86195c.accept(this.f86194b);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            m22887a();
            this.f86197e.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (!this.f86196d) {
                this.f86193a.onComplete();
                this.f86197e.dispose();
                m22887a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f86195c.accept(this.f86194b);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f86193a.onError(th);
                    return;
                }
            }
            this.f86197e.dispose();
            this.f86193a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f86196d) {
                this.f86193a.onError(th);
                this.f86197e.dispose();
                m22887a();
                return;
            }
            if (compareAndSet(false, true)) {
                try {
                    this.f86195c.accept(this.f86194b);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    th = new pm2(th, th2);
                }
            }
            this.f86197e.dispose();
            this.f86193a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f86193a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f86197e, mf4Var)) {
                this.f86197e = mf4Var;
                this.f86193a.onSubscribe(this);
            }
        }
    }

    public twb(Callable<? extends D> callable, py6<? super D, ? extends xub<? extends T>> py6Var, tu2<? super D> tu2Var, boolean z) {
        this.f86189a = callable;
        this.f86190b = py6Var;
        this.f86191c = tu2Var;
        this.f86192d = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        try {
            D dCall = this.f86189a.call();
            try {
                ((xub) xjb.requireNonNull(this.f86190b.apply(dCall), "The sourceSupplier returned a null ObservableSource")).subscribe(new C13258a(oxbVar, dCall, this.f86191c, this.f86192d));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                try {
                    this.f86191c.accept(dCall);
                    c05.error(th, oxbVar);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    c05.error(new pm2(th, th2), oxbVar);
                }
            }
        } catch (Throwable th3) {
            n75.throwIfFatal(th3);
            c05.error(th3, oxbVar);
        }
    }
}
