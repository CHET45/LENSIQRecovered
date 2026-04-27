package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rlf<T> extends yd2 {

    /* JADX INFO: renamed from: a */
    public final pof<T> f78650a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends qh2> f78651b;

    /* JADX INFO: renamed from: rlf$a */
    public static final class C12149a<T> extends AtomicReference<mf4> implements inf<T>, dh2, mf4 {
        private static final long serialVersionUID = -2177128922851101253L;

        /* JADX INFO: renamed from: a */
        public final dh2 f78652a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends qh2> f78653b;

        public C12149a(dh2 dh2Var, py6<? super T, ? extends qh2> py6Var) {
            this.f78652a = dh2Var;
            this.f78653b = py6Var;
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
            this.f78652a.onComplete();
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f78652a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            ag4.replace(this, mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                qh2 qh2Var = (qh2) xjb.requireNonNull(this.f78653b.apply(t), "The mapper returned a null CompletableSource");
                if (isDisposed()) {
                    return;
                }
                qh2Var.subscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(th);
            }
        }
    }

    public rlf(pof<T> pofVar, py6<? super T, ? extends qh2> py6Var) {
        this.f78650a = pofVar;
        this.f78651b = py6Var;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        C12149a c12149a = new C12149a(dh2Var, this.f78651b);
        dh2Var.onSubscribe(c12149a);
        this.f78650a.subscribe(c12149a);
    }
}
