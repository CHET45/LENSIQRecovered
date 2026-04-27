package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class p96<T, U> extends kjf<U> implements u07<U> {

    /* JADX INFO: renamed from: a */
    public final l86<T> f70072a;

    /* JADX INFO: renamed from: b */
    public final nfg<? extends U> f70073b;

    /* JADX INFO: renamed from: c */
    public final e11<? super U, ? super T> f70074c;

    /* JADX INFO: renamed from: p96$a */
    public static final class C10858a<T, U> implements kj6<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super U> f70075a;

        /* JADX INFO: renamed from: b */
        public final e11<? super U, ? super T> f70076b;

        /* JADX INFO: renamed from: c */
        public final U f70077c;

        /* JADX INFO: renamed from: d */
        public fdg f70078d;

        /* JADX INFO: renamed from: e */
        public boolean f70079e;

        public C10858a(hnf<? super U> actual, U u, e11<? super U, ? super T> collector) {
            this.f70075a = actual;
            this.f70076b = collector;
            this.f70077c = u;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f70078d.cancel();
            this.f70078d = ldg.CANCELLED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f70078d == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f70079e) {
                return;
            }
            this.f70079e = true;
            this.f70078d = ldg.CANCELLED;
            this.f70075a.onSuccess(this.f70077c);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f70079e) {
                ofe.onError(t);
                return;
            }
            this.f70079e = true;
            this.f70078d = ldg.CANCELLED;
            this.f70075a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f70079e) {
                return;
            }
            try {
                this.f70076b.accept(this.f70077c, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f70078d.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f70078d, s)) {
                this.f70078d = s;
                this.f70075a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public p96(l86<T> source, nfg<? extends U> initialSupplier, e11<? super U, ? super T> collector) {
        this.f70072a = source;
        this.f70073b = initialSupplier;
        this.f70074c = collector;
    }

    @Override // p000.u07
    public l86<U> fuseToFlowable() {
        return ofe.onAssembly(new n96(this.f70072a, this.f70073b, this.f70074c));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super U> observer) {
        try {
            U u = this.f70073b.get();
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.f70072a.subscribe((kj6) new C10858a(observer, u, this.f70074c));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, observer);
        }
    }
}
