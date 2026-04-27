package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ig2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f46747a;

    /* JADX INFO: renamed from: ig2$a */
    public static final class C7268a implements ch2, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f46748a;

        /* JADX INFO: renamed from: b */
        public lf4 f46749b;

        public C7268a(ch2 downstream) {
            this.f46748a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f46749b.dispose();
            this.f46749b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f46749b.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f46748a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f46748a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f46749b, d)) {
                this.f46749b = d;
                this.f46748a.onSubscribe(this);
            }
        }
    }

    public ig2(ph2 source) {
        this.f46747a = source;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f46747a.subscribe(new C7268a(observer));
    }
}
