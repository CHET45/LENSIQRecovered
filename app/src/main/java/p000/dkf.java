package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dkf<T, U> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f29888a;

    /* JADX INFO: renamed from: b */
    public final xub<U> f29889b;

    /* JADX INFO: renamed from: dkf$a */
    public static final class C4832a<T, U> extends AtomicReference<mf4> implements oxb<U>, mf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f29890a;

        /* JADX INFO: renamed from: b */
        public final pof<T> f29891b;

        /* JADX INFO: renamed from: c */
        public boolean f29892c;

        public C4832a(inf<? super T> infVar, pof<T> pofVar) {
            this.f29890a = infVar;
            this.f29891b = pofVar;
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
            if (this.f29892c) {
                return;
            }
            this.f29892c = true;
            this.f29891b.subscribe(new g8e(this, this.f29890a));
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f29892c) {
                pfe.onError(th);
            } else {
                this.f29892c = true;
                this.f29890a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(U u) {
            get().dispose();
            onComplete();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.set(this, mf4Var)) {
                this.f29890a.onSubscribe(this);
            }
        }
    }

    public dkf(pof<T> pofVar, xub<U> xubVar) {
        this.f29888a = pofVar;
        this.f29889b = xubVar;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f29889b.subscribe(new C4832a(infVar, this.f29888a));
    }
}
