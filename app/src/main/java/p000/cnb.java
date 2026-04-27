package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cnb<T> extends kjf<Long> implements y07<Long> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f17079a;

    /* JADX INFO: renamed from: cnb$a */
    public static final class C2407a implements pxb<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Long> f17080a;

        /* JADX INFO: renamed from: b */
        public lf4 f17081b;

        /* JADX INFO: renamed from: c */
        public long f17082c;

        public C2407a(hnf<? super Long> downstream) {
            this.f17080a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f17081b.dispose();
            this.f17081b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f17081b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f17081b = zf4.DISPOSED;
            this.f17080a.onSuccess(Long.valueOf(this.f17082c));
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f17081b = zf4.DISPOSED;
            this.f17080a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            this.f17082c++;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f17081b, d)) {
                this.f17081b = d;
                this.f17080a.onSubscribe(this);
            }
        }
    }

    public cnb(wub<T> source) {
        this.f17079a = source;
    }

    @Override // p000.y07
    public vkb<Long> fuseToObservable() {
        return ofe.onAssembly(new anb(this.f17079a));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Long> t) {
        this.f17079a.subscribe(new C2407a(t));
    }
}
