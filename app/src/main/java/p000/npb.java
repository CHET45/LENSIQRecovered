package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class npb<T> extends vkb<T> implements xg7 {

    /* JADX INFO: renamed from: a */
    public final ph2 f65202a;

    /* JADX INFO: renamed from: npb$a */
    public static final class C9967a<T> extends AbstractC2144c1<T> implements ch2 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f65203a;

        /* JADX INFO: renamed from: b */
        public lf4 f65204b;

        public C9967a(pxb<? super T> downstream) {
            this.f65203a = downstream;
        }

        @Override // p000.AbstractC2144c1, p000.lf4
        public void dispose() {
            this.f65204b.dispose();
            this.f65204b = zf4.DISPOSED;
        }

        @Override // p000.AbstractC2144c1, p000.lf4
        public boolean isDisposed() {
            return this.f65204b.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f65204b = zf4.DISPOSED;
            this.f65203a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f65204b = zf4.DISPOSED;
            this.f65203a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f65204b, d)) {
                this.f65204b = d;
                this.f65203a.onSubscribe(this);
            }
        }
    }

    public npb(ph2 source) {
        this.f65202a = source;
    }

    @Override // p000.xg7
    public ph2 source() {
        return this.f65202a;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f65202a.subscribe(new C9967a(observer));
    }
}
