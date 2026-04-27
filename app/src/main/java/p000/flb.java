package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class flb<T> extends kjf<Boolean> implements y07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f37049a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f37050b;

    /* JADX INFO: renamed from: flb$a */
    public static final class C5878a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f37051a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f37052b;

        /* JADX INFO: renamed from: c */
        public lf4 f37053c;

        /* JADX INFO: renamed from: d */
        public boolean f37054d;

        public C5878a(hnf<? super Boolean> actual, n8d<? super T> predicate) {
            this.f37051a = actual;
            this.f37052b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f37053c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f37053c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f37054d) {
                return;
            }
            this.f37054d = true;
            this.f37051a.onSuccess(Boolean.FALSE);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f37054d) {
                ofe.onError(t);
            } else {
                this.f37054d = true;
                this.f37051a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f37054d) {
                return;
            }
            try {
                if (this.f37052b.test(t)) {
                    this.f37054d = true;
                    this.f37053c.dispose();
                    this.f37051a.onSuccess(Boolean.TRUE);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f37053c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f37053c, d)) {
                this.f37053c = d;
                this.f37051a.onSubscribe(this);
            }
        }
    }

    public flb(wub<T> source, n8d<? super T> predicate) {
        this.f37049a = source;
        this.f37050b = predicate;
    }

    @Override // p000.y07
    public vkb<Boolean> fuseToObservable() {
        return ofe.onAssembly(new dlb(this.f37049a, this.f37050b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> t) {
        this.f37049a.subscribe(new C5878a(t, this.f37050b));
    }
}
