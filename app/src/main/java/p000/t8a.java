package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t8a<T> extends kjf<Boolean> implements zg7<T>, w07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f83977a;

    /* JADX INFO: renamed from: t8a$a */
    public static final class C12949a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f83978a;

        /* JADX INFO: renamed from: b */
        public lf4 f83979b;

        public C12949a(hnf<? super Boolean> downstream) {
            this.f83978a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f83979b.dispose();
            this.f83979b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f83979b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f83979b = zf4.DISPOSED;
            this.f83978a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f83979b = zf4.DISPOSED;
            this.f83978a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f83979b, d)) {
                this.f83979b = d;
                this.f83978a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f83979b = zf4.DISPOSED;
            this.f83978a.onSuccess(Boolean.FALSE);
        }
    }

    public t8a(z9a<T> source) {
        this.f83977a = source;
    }

    @Override // p000.w07
    public r4a<Boolean> fuseToMaybe() {
        return ofe.onAssembly(new r8a(this.f83977a));
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f83977a;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        this.f83977a.subscribe(new C12949a(observer));
    }
}
