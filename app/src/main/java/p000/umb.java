package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class umb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final pof<? extends T> f88529b;

    /* JADX INFO: renamed from: umb$a */
    public static final class C13604a<T> extends AtomicReference<mf4> implements oxb<T>, inf<T>, mf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f88530a;

        /* JADX INFO: renamed from: b */
        public pof<? extends T> f88531b;

        /* JADX INFO: renamed from: c */
        public boolean f88532c;

        public C13604a(oxb<? super T> oxbVar, pof<? extends T> pofVar) {
            this.f88530a = oxbVar;
            this.f88531b = pofVar;
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
            this.f88532c = true;
            ag4.replace(this, null);
            pof<? extends T> pofVar = this.f88531b;
            this.f88531b = null;
            pofVar.subscribe(this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f88530a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f88530a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (!ag4.setOnce(this, mf4Var) || this.f88532c) {
                return;
            }
            this.f88530a.onSubscribe(this);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f88530a.onNext(t);
            this.f88530a.onComplete();
        }
    }

    public umb(Observable<T> observable, pof<? extends T> pofVar) {
        super(observable);
        this.f88529b = pofVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C13604a(oxbVar, this.f88529b));
    }
}
