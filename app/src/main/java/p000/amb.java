package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes7.dex */
public final class amb<T, U> extends kjf<U> implements y07<U> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f2077a;

    /* JADX INFO: renamed from: b */
    public final nfg<? extends U> f2078b;

    /* JADX INFO: renamed from: c */
    public final e11<? super U, ? super T> f2079c;

    /* JADX INFO: renamed from: amb$a */
    public static final class C0327a<T, U> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super U> f2080a;

        /* JADX INFO: renamed from: b */
        public final e11<? super U, ? super T> f2081b;

        /* JADX INFO: renamed from: c */
        public final U f2082c;

        /* JADX INFO: renamed from: d */
        public lf4 f2083d;

        /* JADX INFO: renamed from: e */
        public boolean f2084e;

        public C0327a(hnf<? super U> actual, U u, e11<? super U, ? super T> collector) {
            this.f2080a = actual;
            this.f2081b = collector;
            this.f2082c = u;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f2083d.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f2083d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f2084e) {
                return;
            }
            this.f2084e = true;
            this.f2080a.onSuccess(this.f2082c);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f2084e) {
                ofe.onError(t);
            } else {
                this.f2084e = true;
                this.f2080a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f2084e) {
                return;
            }
            try {
                this.f2081b.accept(this.f2082c, t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f2083d.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f2083d, d)) {
                this.f2083d = d;
                this.f2080a.onSubscribe(this);
            }
        }
    }

    public amb(wub<T> source, nfg<? extends U> initialSupplier, e11<? super U, ? super T> collector) {
        this.f2077a = source;
        this.f2078b = initialSupplier;
        this.f2079c = collector;
    }

    @Override // p000.y07
    public vkb<U> fuseToObservable() {
        return ofe.onAssembly(new ylb(this.f2077a, this.f2078b, this.f2079c));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super U> t) {
        try {
            U u = this.f2078b.get();
            Objects.requireNonNull(u, "The initialSupplier returned a null value");
            this.f2077a.subscribe(new C0327a(t, u, this.f2079c));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, t);
        }
    }
}
