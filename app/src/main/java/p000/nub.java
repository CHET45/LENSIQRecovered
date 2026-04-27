package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nub<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final long f65716b;

    /* JADX INFO: renamed from: nub$a */
    public static final class C10064a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f65717a;

        /* JADX INFO: renamed from: b */
        public long f65718b;

        /* JADX INFO: renamed from: c */
        public lf4 f65719c;

        public C10064a(pxb<? super T> actual, long n) {
            this.f65717a = actual;
            this.f65718b = n;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f65719c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f65719c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f65717a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f65717a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            long j = this.f65718b;
            if (j != 0) {
                this.f65718b = j - 1;
            } else {
                this.f65717a.onNext(t);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f65719c, d)) {
                this.f65719c = d;
                this.f65717a.onSubscribe(this);
            }
        }
    }

    public nub(wub<T> source, long n) {
        super(source);
        this.f65716b = n;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C10064a(observer, this.f65716b));
    }
}
