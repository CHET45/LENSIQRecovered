package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class okf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f67920a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super T> f67921b;

    /* JADX INFO: renamed from: okf$a */
    public static final class C10402a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f67922a;

        /* JADX INFO: renamed from: b */
        public final uu2<? super T> f67923b;

        /* JADX INFO: renamed from: c */
        public lf4 f67924c;

        public C10402a(hnf<? super T> actual, uu2<? super T> onAfterSuccess) {
            this.f67922a = actual;
            this.f67923b = onAfterSuccess;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f67924c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f67924c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f67922a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f67924c, d)) {
                this.f67924c = d;
                this.f67922a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f67922a.onSuccess(t);
            try {
                this.f67923b.accept(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
        }
    }

    public okf(oof<T> source, uu2<? super T> onAfterSuccess) {
        this.f67920a = source;
        this.f67921b = onAfterSuccess;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f67920a.subscribe(new C10402a(observer, this.f67921b));
    }
}
