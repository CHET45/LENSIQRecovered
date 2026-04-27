package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ykf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f101932a;

    /* JADX INFO: renamed from: b */
    public final e11<? super T, ? super Throwable> f101933b;

    /* JADX INFO: renamed from: ykf$a */
    public final class C15708a implements hnf<T> {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f101934a;

        public C15708a(hnf<? super T> observer) {
            this.f101934a = observer;
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            try {
                ykf.this.f101933b.accept(null, e);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                e = new qm2(e, th);
            }
            this.f101934a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            this.f101934a.onSubscribe(d);
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            try {
                ykf.this.f101933b.accept(value, null);
                this.f101934a.onSuccess(value);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f101934a.onError(th);
            }
        }
    }

    public ykf(oof<T> source, e11<? super T, ? super Throwable> onEvent) {
        this.f101932a = source;
        this.f101933b = onEvent;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f101932a.subscribe(new C15708a(observer));
    }
}
