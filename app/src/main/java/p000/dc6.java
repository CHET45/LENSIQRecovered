package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class dc6<T> extends r4a<T> implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f29276a;

    /* JADX INFO: renamed from: b */
    public final long f29277b;

    /* JADX INFO: renamed from: dc6$a */
    public static final class C4733a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f29278a;

        /* JADX INFO: renamed from: b */
        public final long f29279b;

        /* JADX INFO: renamed from: c */
        public fdg f29280c;

        /* JADX INFO: renamed from: d */
        public long f29281d;

        /* JADX INFO: renamed from: e */
        public boolean f29282e;

        public C4733a(k9a<? super T> actual, long index) {
            this.f29278a = actual;
            this.f29279b = index;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f29280c.cancel();
            this.f29280c = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f29280c == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29280c = ldg.CANCELLED;
            if (this.f29282e) {
                return;
            }
            this.f29282e = true;
            this.f29278a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f29282e) {
                ofe.onError(t);
                return;
            }
            this.f29282e = true;
            this.f29280c = ldg.CANCELLED;
            this.f29278a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f29282e) {
                return;
            }
            long j = this.f29281d;
            if (j != this.f29279b) {
                this.f29281d = j + 1;
                return;
            }
            this.f29282e = true;
            this.f29280c.cancel();
            this.f29280c = ldg.CANCELLED;
            this.f29278a.onSuccess(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f29280c, s)) {
                this.f29280c = s;
                this.f29278a.onSubscribe(this);
                s.request(this.f29279b + 1);
            }
        }
    }

    public dc6(l86<T> source, long index) {
        this.f29276a = source;
        this.f29277b = index;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new bc6(this.f29276a, this.f29277b, null, false));
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f29276a.subscribe((kj6) new C4733a(observer, this.f29277b));
    }
}
