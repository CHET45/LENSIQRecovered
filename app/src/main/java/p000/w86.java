package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class w86<T> extends kjf<Boolean> implements u07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f93605a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f93606b;

    /* JADX INFO: renamed from: w86$a */
    public static final class C14476a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f93607a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f93608b;

        /* JADX INFO: renamed from: c */
        public fdg f93609c;

        /* JADX INFO: renamed from: d */
        public boolean f93610d;

        public C14476a(hnf<? super Boolean> actual, n8d<? super T> predicate) {
            this.f93607a = actual;
            this.f93608b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f93609c.cancel();
            this.f93609c = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f93609c == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f93610d) {
                return;
            }
            this.f93610d = true;
            this.f93609c = ldg.CANCELLED;
            this.f93607a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f93610d) {
                ofe.onError(t);
                return;
            }
            this.f93610d = true;
            this.f93609c = ldg.CANCELLED;
            this.f93607a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f93610d) {
                return;
            }
            try {
                if (this.f93608b.test(t)) {
                    this.f93610d = true;
                    this.f93609c.cancel();
                    this.f93609c = ldg.CANCELLED;
                    this.f93607a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f93609c.cancel();
                this.f93609c = ldg.CANCELLED;
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f93609c, s)) {
                this.f93609c = s;
                this.f93607a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public w86(l86<T> source, n8d<? super T> predicate) {
        this.f93605a = source;
        this.f93606b = predicate;
    }

    @Override // p000.u07
    public l86<Boolean> fuseToFlowable() {
        return ofe.onAssembly(new u86(this.f93605a, this.f93606b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        this.f93605a.subscribe((kj6) new C14476a(observer, this.f93606b));
    }
}
