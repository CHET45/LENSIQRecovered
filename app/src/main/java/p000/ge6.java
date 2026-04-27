package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ge6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: ge6$a */
    public static final class C6272a<T> implements lj6<T>, cod<T> {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f39610a;

        /* JADX INFO: renamed from: b */
        public fdg f39611b;

        public C6272a(ycg<? super T> ycgVar) {
            this.f39610a = ycgVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f39611b.cancel();
        }

        @Override // p000.ajf
        public void clear() {
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return true;
        }

        @Override // p000.ajf
        public boolean offer(T t) {
            throw new UnsupportedOperationException("Should not be called!");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f39610a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f39610a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f39611b, fdgVar)) {
                this.f39611b = fdgVar;
                this.f39610a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() {
            return null;
        }

        @Override // p000.fdg
        public void request(long j) {
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return i & 2;
        }

        @Override // p000.ajf
        public boolean offer(T t, T t2) {
            throw new UnsupportedOperationException("Should not be called!");
        }
    }

    public ge6(m86<T> m86Var) {
        super(m86Var);
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C6272a(ycgVar));
    }
}
