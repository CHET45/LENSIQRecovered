package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class fe6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: fe6$a */
    public static final class C5750a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f36281a;

        /* JADX INFO: renamed from: b */
        public fdg f36282b;

        public C5750a(ycg<? super T> downstream) {
            this.f36281a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f36282b.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f36281a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f36281a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f36281a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f36282b, s)) {
                this.f36282b = s;
                this.f36281a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f36282b.request(n);
        }
    }

    public fe6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C5750a(s));
    }
}
