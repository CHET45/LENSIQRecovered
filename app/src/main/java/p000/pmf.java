package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class pmf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f71408a;

    /* JADX INFO: renamed from: pmf$a */
    public static final class C11028a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f71409a;

        /* JADX INFO: renamed from: b */
        public lf4 f71410b;

        public C11028a(hnf<? super T> downstream) {
            this.f71409a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f71410b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f71410b.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f71409a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f71410b, d)) {
                this.f71410b = d;
                this.f71409a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f71409a.onSuccess(value);
        }
    }

    public pmf(oof<? extends T> source) {
        this.f71408a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f71408a.subscribe(new C11028a(observer));
    }
}
