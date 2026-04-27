package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class qmb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final qh2 f74922b;

    /* JADX INFO: renamed from: qmb$a */
    public static final class C11556a<T> extends AtomicReference<mf4> implements oxb<T>, dh2, mf4 {
        private static final long serialVersionUID = -1953724749712440952L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f74923a;

        /* JADX INFO: renamed from: b */
        public qh2 f74924b;

        /* JADX INFO: renamed from: c */
        public boolean f74925c;

        public C11556a(oxb<? super T> oxbVar, qh2 qh2Var) {
            this.f74923a = oxbVar;
            this.f74924b = qh2Var;
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
            if (this.f74925c) {
                this.f74923a.onComplete();
                return;
            }
            this.f74925c = true;
            ag4.replace(this, null);
            qh2 qh2Var = this.f74924b;
            this.f74924b = null;
            qh2Var.subscribe(this);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f74923a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f74923a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (!ag4.setOnce(this, mf4Var) || this.f74925c) {
                return;
            }
            this.f74923a.onSubscribe(this);
        }
    }

    public qmb(Observable<T> observable, qh2 qh2Var) {
        super(observable);
        this.f74922b = qh2Var;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C11556a(oxbVar, this.f74922b));
    }
}
