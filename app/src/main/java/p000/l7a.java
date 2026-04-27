package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class l7a<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final aaa<T> f56696a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends R>> f56697b;

    /* JADX INFO: renamed from: l7a$a */
    public static final class C8705a<T, R> extends AtomicReference<mf4> implements oxb<R>, l9a<T>, mf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f56698a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f56699b;

        public C8705a(oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var) {
            this.f56698a = oxbVar;
            this.f56699b = py6Var;
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
            this.f56698a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f56698a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(R r) {
            this.f56698a.onNext(r);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }

        @Override // p000.l9a
        public void onSuccess(T t) {
            try {
                ((xub) xjb.requireNonNull(this.f56699b.apply(t), "The mapper returned a null Publisher")).subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f56698a.onError(th);
            }
        }
    }

    public l7a(aaa<T> aaaVar, py6<? super T, ? extends xub<? extends R>> py6Var) {
        this.f56696a = aaaVar;
        this.f56697b = py6Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        C8705a c8705a = new C8705a(oxbVar, this.f56697b);
        oxbVar.onSubscribe(c8705a);
        this.f56696a.subscribe(c8705a);
    }
}
