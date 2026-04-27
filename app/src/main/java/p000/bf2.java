package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bf2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f13599a;

    /* JADX INFO: renamed from: bf2$a */
    public static final class C1873a implements ch2, lf4 {

        /* JADX INFO: renamed from: a */
        public ch2 f13600a;

        /* JADX INFO: renamed from: b */
        public lf4 f13601b;

        public C1873a(ch2 downstream) {
            this.f13600a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f13600a = null;
            this.f13601b.dispose();
            this.f13601b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f13601b.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f13601b = zf4.DISPOSED;
            ch2 ch2Var = this.f13600a;
            if (ch2Var != null) {
                this.f13600a = null;
                ch2Var.onComplete();
            }
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f13601b = zf4.DISPOSED;
            ch2 ch2Var = this.f13600a;
            if (ch2Var != null) {
                this.f13600a = null;
                ch2Var.onError(e);
            }
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f13601b, d)) {
                this.f13601b = d;
                this.f13600a.onSubscribe(this);
            }
        }
    }

    public bf2(ph2 source) {
        this.f13599a = source;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f13599a.subscribe(new C1873a(observer));
    }
}
