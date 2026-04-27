package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class q86<T> extends kjf<Boolean> implements u07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f73494a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f73495b;

    /* JADX INFO: renamed from: q86$a */
    public static final class C11352a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f73496a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f73497b;

        /* JADX INFO: renamed from: c */
        public fdg f73498c;

        /* JADX INFO: renamed from: d */
        public boolean f73499d;

        public C11352a(hnf<? super Boolean> actual, n8d<? super T> predicate) {
            this.f73496a = actual;
            this.f73497b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f73498c.cancel();
            this.f73498c = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f73498c == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f73499d) {
                return;
            }
            this.f73499d = true;
            this.f73498c = ldg.CANCELLED;
            this.f73496a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f73499d) {
                ofe.onError(t);
                return;
            }
            this.f73499d = true;
            this.f73498c = ldg.CANCELLED;
            this.f73496a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f73499d) {
                return;
            }
            try {
                if (this.f73497b.test(t)) {
                    return;
                }
                this.f73499d = true;
                this.f73498c.cancel();
                this.f73498c = ldg.CANCELLED;
                this.f73496a.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f73498c.cancel();
                this.f73498c = ldg.CANCELLED;
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f73498c, s)) {
                this.f73498c = s;
                this.f73496a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public q86(l86<T> source, n8d<? super T> predicate) {
        this.f73494a = source;
        this.f73495b = predicate;
    }

    @Override // p000.u07
    public l86<Boolean> fuseToFlowable() {
        return ofe.onAssembly(new o86(this.f73494a, this.f73495b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> observer) {
        this.f73494a.subscribe((kj6) new C11352a(observer, this.f73495b));
    }
}
