package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class bkf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f13969a;

    /* JADX INFO: renamed from: b */
    public final qh2 f13970b;

    /* JADX INFO: renamed from: bkf$a */
    public static final class C1931a<T> extends AtomicReference<mf4> implements dh2, mf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f13971a;

        /* JADX INFO: renamed from: b */
        public final pof<T> f13972b;

        public C1931a(inf<? super T> infVar, pof<T> pofVar) {
            this.f13971a = infVar;
            this.f13972b = pofVar;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(get());
        }

        @Override // p000.dh2
        public void onComplete() {
            this.f13972b.subscribe(new g8e(this, this.f13971a));
        }

        @Override // p000.dh2
        public void onError(Throwable th) {
            this.f13971a.onError(th);
        }

        @Override // p000.dh2
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f13971a.onSubscribe(this);
            }
        }
    }

    public bkf(pof<T> pofVar, qh2 qh2Var) {
        this.f13969a = pofVar;
        this.f13970b = qh2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f13970b.subscribe(new C1931a(infVar, this.f13969a));
    }
}
