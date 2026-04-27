package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class je6<T> extends xd2 implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f50382a;

    /* JADX INFO: renamed from: je6$a */
    public static final class C7878a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f50383a;

        /* JADX INFO: renamed from: b */
        public fdg f50384b;

        public C7878a(ch2 downstream) {
            this.f50383a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f50384b.cancel();
            this.f50384b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f50384b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f50384b = ldg.CANCELLED;
            this.f50383a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f50384b = ldg.CANCELLED;
            this.f50383a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f50384b, s)) {
                this.f50384b = s;
                this.f50383a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public je6(l86<T> source) {
        this.f50382a = source;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new he6(this.f50382a));
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 t) {
        this.f50382a.subscribe((kj6) new C7878a(t));
    }
}
