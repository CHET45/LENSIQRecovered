package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xa6<T> extends kjf<Long> implements u07<Long> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f97351a;

    /* JADX INFO: renamed from: xa6$a */
    public static final class C15013a implements kj6<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Long> f97352a;

        /* JADX INFO: renamed from: b */
        public fdg f97353b;

        /* JADX INFO: renamed from: c */
        public long f97354c;

        public C15013a(hnf<? super Long> downstream) {
            this.f97352a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f97353b.cancel();
            this.f97353b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f97353b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f97353b = ldg.CANCELLED;
            this.f97352a.onSuccess(Long.valueOf(this.f97354c));
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f97353b = ldg.CANCELLED;
            this.f97352a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            this.f97354c++;
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f97353b, s)) {
                this.f97353b = s;
                this.f97352a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public xa6(l86<T> source) {
        this.f97351a = source;
    }

    @Override // p000.u07
    public l86<Long> fuseToFlowable() {
        return ofe.onAssembly(new va6(this.f97351a));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Long> observer) {
        this.f97351a.subscribe((kj6) new C15013a(observer));
    }
}
