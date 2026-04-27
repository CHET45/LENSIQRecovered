package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ti6<T> extends r4a<T> implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f84961a;

    /* JADX INFO: renamed from: ti6$a */
    public static final class C13059a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f84962a;

        /* JADX INFO: renamed from: b */
        public fdg f84963b;

        /* JADX INFO: renamed from: c */
        public boolean f84964c;

        /* JADX INFO: renamed from: d */
        public T f84965d;

        public C13059a(k9a<? super T> downstream) {
            this.f84962a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f84963b.cancel();
            this.f84963b = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f84963b == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f84964c) {
                return;
            }
            this.f84964c = true;
            this.f84963b = ldg.CANCELLED;
            T t = this.f84965d;
            this.f84965d = null;
            if (t == null) {
                this.f84962a.onComplete();
            } else {
                this.f84962a.onSuccess(t);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f84964c) {
                ofe.onError(t);
                return;
            }
            this.f84964c = true;
            this.f84963b = ldg.CANCELLED;
            this.f84962a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f84964c) {
                return;
            }
            if (this.f84965d == null) {
                this.f84965d = t;
                return;
            }
            this.f84964c = true;
            this.f84963b.cancel();
            this.f84963b = ldg.CANCELLED;
            this.f84962a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f84963b, s)) {
                this.f84963b = s;
                this.f84962a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public ti6(l86<T> source) {
        this.f84961a = source;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new ri6(this.f84961a, null, false));
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f84961a.subscribe((kj6) new C13059a(observer));
    }
}
