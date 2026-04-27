package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class b8a<T> extends r4a<T> implements xg7 {

    /* JADX INFO: renamed from: a */
    public final ph2 f12967a;

    /* JADX INFO: renamed from: b8a$a */
    public static final class C1778a<T> implements ch2, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f12968a;

        /* JADX INFO: renamed from: b */
        public lf4 f12969b;

        public C1778a(k9a<? super T> downstream) {
            this.f12968a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f12969b.dispose();
            this.f12969b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f12969b.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f12969b = zf4.DISPOSED;
            this.f12968a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f12969b = zf4.DISPOSED;
            this.f12968a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f12969b, d)) {
                this.f12969b = d;
                this.f12968a.onSubscribe(this);
            }
        }
    }

    public b8a(ph2 source) {
        this.f12967a = source;
    }

    @Override // p000.xg7
    public ph2 source() {
        return this.f12967a;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f12967a.subscribe(new C1778a(observer));
    }
}
