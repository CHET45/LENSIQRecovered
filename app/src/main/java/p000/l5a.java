package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class l5a<T> extends kjf<Long> implements zg7<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f56202a;

    /* JADX INFO: renamed from: l5a$a */
    public static final class C8617a implements k9a<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Long> f56203a;

        /* JADX INFO: renamed from: b */
        public lf4 f56204b;

        public C8617a(hnf<? super Long> downstream) {
            this.f56203a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f56204b.dispose();
            this.f56204b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f56204b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f56204b = zf4.DISPOSED;
            this.f56203a.onSuccess(0L);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f56204b = zf4.DISPOSED;
            this.f56203a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f56204b, d)) {
                this.f56204b = d;
                this.f56203a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(Object value) {
            this.f56204b = zf4.DISPOSED;
            this.f56203a.onSuccess(1L);
        }
    }

    public l5a(z9a<T> source) {
        this.f56202a = source;
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f56202a;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Long> observer) {
        this.f56202a.subscribe(new C8617a(observer));
    }
}
