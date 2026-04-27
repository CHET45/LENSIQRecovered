package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class gc6<T> extends kjf<T> implements u07<T> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f39344a;

    /* JADX INFO: renamed from: b */
    public final long f39345b;

    /* JADX INFO: renamed from: c */
    public final T f39346c;

    /* JADX INFO: renamed from: gc6$a */
    public static final class C6212a<T> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f39347a;

        /* JADX INFO: renamed from: b */
        public final long f39348b;

        /* JADX INFO: renamed from: c */
        public final T f39349c;

        /* JADX INFO: renamed from: d */
        public fdg f39350d;

        /* JADX INFO: renamed from: e */
        public long f39351e;

        /* JADX INFO: renamed from: f */
        public boolean f39352f;

        public C6212a(hnf<? super T> actual, long index, T defaultValue) {
            this.f39347a = actual;
            this.f39348b = index;
            this.f39349c = defaultValue;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f39350d.cancel();
            this.f39350d = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f39350d == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f39350d = ldg.CANCELLED;
            if (this.f39352f) {
                return;
            }
            this.f39352f = true;
            T t = this.f39349c;
            if (t != null) {
                this.f39347a.onSuccess(t);
            } else {
                this.f39347a.onError(new NoSuchElementException());
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f39352f) {
                ofe.onError(t);
                return;
            }
            this.f39352f = true;
            this.f39350d = ldg.CANCELLED;
            this.f39347a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f39352f) {
                return;
            }
            long j = this.f39351e;
            if (j != this.f39348b) {
                this.f39351e = j + 1;
                return;
            }
            this.f39352f = true;
            this.f39350d.cancel();
            this.f39350d = ldg.CANCELLED;
            this.f39347a.onSuccess(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f39350d, s)) {
                this.f39350d = s;
                this.f39347a.onSubscribe(this);
                s.request(this.f39348b + 1);
            }
        }
    }

    public gc6(l86<T> source, long index, T defaultValue) {
        this.f39344a = source;
        this.f39345b = index;
        this.f39346c = defaultValue;
    }

    @Override // p000.u07
    public l86<T> fuseToFlowable() {
        return ofe.onAssembly(new bc6(this.f39344a, this.f39345b, this.f39346c, true));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f39344a.subscribe((kj6) new C6212a(observer, this.f39345b, this.f39346c));
    }
}
