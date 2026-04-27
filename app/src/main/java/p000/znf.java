package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class znf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f105562a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends pof<? extends T>> f105563b;

    /* JADX INFO: renamed from: znf$a */
    public static final class C16197a<T> extends AtomicReference<mf4> implements inf<T>, mf4 {
        private static final long serialVersionUID = -5314538511045349925L;

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f105564a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Throwable, ? extends pof<? extends T>> f105565b;

        public C16197a(inf<? super T> infVar, py6<? super Throwable, ? extends pof<? extends T>> py6Var) {
            this.f105564a = infVar;
            this.f105565b = py6Var;
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
            try {
                ((pof) xjb.requireNonNull(this.f105565b.apply(th), "The nextFunction returned a null SingleSource.")).subscribe(new g8e(this, this.f105564a));
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f105564a.onError(new pm2(th, th2));
            }
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this, mf4Var)) {
                this.f105564a.onSubscribe(this);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f105564a.onSuccess(t);
        }
    }

    public znf(pof<? extends T> pofVar, py6<? super Throwable, ? extends pof<? extends T>> py6Var) {
        this.f105562a = pofVar;
        this.f105563b = py6Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f105562a.subscribe(new C16197a(infVar, this.f105563b));
    }
}
