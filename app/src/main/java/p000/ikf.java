package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ikf<T, U> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f47242a;

    /* JADX INFO: renamed from: b */
    public final oof<U> f47243b;

    /* JADX INFO: renamed from: ikf$a */
    public static final class C7326a<T, U> extends AtomicReference<lf4> implements hnf<U>, lf4 {
        private static final long serialVersionUID = -8565274649390031272L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f47244a;

        /* JADX INFO: renamed from: b */
        public final oof<T> f47245b;

        public C7326a(hnf<? super T> actual, oof<T> source) {
            this.f47244a = actual;
            this.f47245b = source;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f47244a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                this.f47244a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(U value) {
            this.f47245b.subscribe(new f8e(this, this.f47244a));
        }
    }

    public ikf(oof<T> source, oof<U> other) {
        this.f47242a = source;
        this.f47243b = other;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f47243b.subscribe(new C7326a(observer, this.f47242a));
    }
}
