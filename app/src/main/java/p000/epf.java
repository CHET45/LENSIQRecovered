package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class epf<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final oof<? extends T> f33817a;

    /* JADX INFO: renamed from: epf$a */
    public static final class C5435a<T> extends d34<T> implements hnf<T> {
        private static final long serialVersionUID = 3786543492451018833L;

        /* JADX INFO: renamed from: C */
        public lf4 f33818C;

        public C5435a(pxb<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.d34, p000.lf4
        public void dispose() {
            super.dispose();
            this.f33818C.dispose();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            error(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f33818C, d)) {
                this.f33818C = d;
                this.f28317a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            complete(value);
        }
    }

    public epf(oof<? extends T> source) {
        this.f33817a = source;
    }

    public static <T> hnf<T> create(pxb<? super T> downstream) {
        return new C5435a(downstream);
    }

    @Override // p000.vkb
    public void subscribeActual(final pxb<? super T> observer) {
        this.f33817a.subscribe(create(observer));
    }
}
