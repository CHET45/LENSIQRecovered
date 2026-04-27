package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ld6<T> extends l86<T> implements xg7 {

    /* JADX INFO: renamed from: b */
    public final ph2 f57241b;

    /* JADX INFO: renamed from: ld6$a */
    public static final class C8775a<T> extends AbstractC2144c1<T> implements ch2 {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f57242a;

        /* JADX INFO: renamed from: b */
        public lf4 f57243b;

        public C8775a(ycg<? super T> downstream) {
            this.f57242a = downstream;
        }

        @Override // p000.AbstractC2144c1, p000.fdg
        public void cancel() {
            this.f57243b.dispose();
            this.f57243b = zf4.DISPOSED;
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f57243b = zf4.DISPOSED;
            this.f57242a.onComplete();
        }

        @Override // p000.ch2
        public void onError(Throwable e) {
            this.f57243b = zf4.DISPOSED;
            this.f57242a.onError(e);
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f57243b, d)) {
                this.f57243b = d;
                this.f57242a.onSubscribe(this);
            }
        }
    }

    public ld6(ph2 source) {
        this.f57241b = source;
    }

    @Override // p000.xg7
    public ph2 source() {
        return this.f57241b;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> observer) {
        this.f57241b.subscribe(new C8775a(observer));
    }
}
