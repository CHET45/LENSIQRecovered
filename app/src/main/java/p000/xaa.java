package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xaa<T> extends vkb<T> implements zg7<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f97358a;

    /* JADX INFO: renamed from: xaa$a */
    public static final class C15014a<T> extends d34<T> implements k9a<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: C */
        public lf4 f97359C;

        public C15014a(pxb<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.d34, p000.lf4
        public void dispose() {
            super.dispose();
            this.f97359C.dispose();
        }

        @Override // p000.k9a
        public void onComplete() {
            complete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            error(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f97359C, d)) {
                this.f97359C = d;
                this.f28317a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            complete(value);
        }
    }

    public xaa(z9a<T> source) {
        this.f97358a = source;
    }

    public static <T> k9a<T> create(pxb<? super T> downstream) {
        return new C15014a(downstream);
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f97358a;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f97358a.subscribe(create(observer));
    }
}
