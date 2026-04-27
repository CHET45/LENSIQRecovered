package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class he6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: he6$a */
    public static final class C6818a<T> implements kj6<T>, bod<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f43248a;

        /* JADX INFO: renamed from: b */
        public fdg f43249b;

        public C6818a(ycg<? super T> downstream) {
            this.f43248a = downstream;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f43249b.cancel();
        }

        @Override // p000.zif
        public void clear() {
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.zif
        public boolean offer(T e) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f43248a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f43248a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f43249b, s)) {
                this.f43249b = s;
                this.f43248a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return null;
        }

        @Override // p000.fdg
        public void request(long n) {
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return mode & 2;
        }

        @Override // p000.zif
        public boolean offer(T v1, T v2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public he6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(final ycg<? super T> t) {
        this.f49321b.subscribe((kj6) new C6818a(t));
    }
}
