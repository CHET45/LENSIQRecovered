package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class va6<T> extends AbstractC7714j1<T, Long> {

    /* JADX INFO: renamed from: va6$a */
    public static final class C13962a extends j34<Long> implements kj6<Object> {
        private static final long serialVersionUID = 4973004223787171406L;

        /* JADX INFO: renamed from: L */
        public fdg f90463L;

        /* JADX INFO: renamed from: M */
        public long f90464M;

        public C13962a(ycg<? super Long> downstream) {
            super(downstream);
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f90463L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            complete(Long.valueOf(this.f90464M));
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            this.f90464M++;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f90463L, s)) {
                this.f90463L = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public va6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Long> s) {
        this.f49321b.subscribe((kj6) new C13962a(s));
    }
}
