package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class hkf<T, U> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f43943a;

    /* JADX INFO: renamed from: b */
    public final pof<U> f43944b;

    /* JADX INFO: renamed from: hkf$a */
    public static final class C6885a<T, U> extends AtomicReference<mf4> implements inf<U>, mf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f43945a;

        /* JADX INFO: renamed from: b */
        public final pof<T> f43946b;

        public C6885a(inf<? super T> infVar, pof<T> pofVar) {
            this.f43945a = infVar;
            this.f43946b = pofVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f43945a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f43945a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(U u) {
            this.f43946b.subscribe(new g8e(this, this.f43945a));
        }
    }

    public hkf(pof<T> pofVar, pof<U> pofVar2) {
        this.f43943a = pofVar;
        this.f43944b = pofVar2;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f43944b.subscribe(new C6885a(infVar, this.f43943a));
    }
}
