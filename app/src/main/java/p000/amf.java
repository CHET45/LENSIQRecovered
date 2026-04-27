package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class amf<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f2128a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends R>> f2129b;

    /* JADX INFO: renamed from: amf$a */
    public static final class C0335a<T, R> extends AtomicReference<mf4> implements oxb<R>, inf<T>, mf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f2130a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f2131b;

        public C0335a(oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var) {
            this.f2130a = oxbVar;
            this.f2131b = py6Var;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f2130a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f2130a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(R r) {
            this.f2130a.onNext(r);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                ((xub) xjb.requireNonNull(this.f2131b.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f2130a.onError(th);
            }
        }
    }

    public amf(pof<T> pofVar, py6<? super T, ? extends xub<? extends R>> py6Var) {
        this.f2128a = pofVar;
        this.f2129b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        C0335a c0335a = new C0335a(oxbVar, this.f2129b);
        oxbVar.onSubscribe(c0335a);
        this.f2128a.subscribe(c0335a);
    }
}
