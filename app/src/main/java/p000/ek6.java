package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ek6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: ek6$a */
    public static final class C5353a<T> extends j34<T> implements kj6<T> {
        private static final long serialVersionUID = -5467847744262967226L;

        /* JADX INFO: renamed from: L */
        public fdg f33244L;

        public C5353a(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f33244L.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            T t = this.f49484b;
            if (t != null) {
                complete(t);
            } else {
                this.f49483a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f49484b = null;
            this.f49483a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f49484b = t;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f33244L, s)) {
                this.f33244L = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public ek6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C5353a(s));
    }
}
