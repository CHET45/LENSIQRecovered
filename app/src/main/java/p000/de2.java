package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class de2<R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final qh2 f29466a;

    /* JADX INFO: renamed from: b */
    public final xub<? extends R> f29467b;

    /* JADX INFO: renamed from: de2$a */
    public static final class C4764a<R> extends AtomicReference<mf4> implements oxb<R>, dh2, mf4 {
        private static final long serialVersionUID = -8948264376121066672L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f29468a;

        /* JADX INFO: renamed from: b */
        public xub<? extends R> f29469b;

        public C4764a(oxb<? super R> oxbVar, xub<? extends R> xubVar) {
            this.f29469b = xubVar;
            this.f29468a = oxbVar;
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
            xub<? extends R> xubVar = this.f29469b;
            if (xubVar == null) {
                this.f29468a.onComplete();
            } else {
                this.f29469b = null;
                xubVar.subscribe(this);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f29468a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(R r) {
            this.f29468a.onNext(r);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }
    }

    public de2(qh2 qh2Var, xub<? extends R> xubVar) {
        this.f29466a = qh2Var;
        this.f29467b = xubVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        C4764a c4764a = new C4764a(oxbVar, this.f29467b);
        oxbVar.onSubscribe(c4764a);
        this.f29466a.subscribe(c4764a);
    }
}
