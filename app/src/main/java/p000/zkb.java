package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zkb<T> extends kjf<Boolean> implements y07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f105345a;

    /* JADX INFO: renamed from: b */
    public final n8d<? super T> f105346b;

    /* JADX INFO: renamed from: zkb$a */
    public static final class C16167a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super Boolean> f105347a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f105348b;

        /* JADX INFO: renamed from: c */
        public lf4 f105349c;

        /* JADX INFO: renamed from: d */
        public boolean f105350d;

        public C16167a(hnf<? super Boolean> actual, n8d<? super T> predicate) {
            this.f105347a = actual;
            this.f105348b = predicate;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f105349c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105349c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f105350d) {
                return;
            }
            this.f105350d = true;
            this.f105347a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f105350d) {
                ofe.onError(t);
            } else {
                this.f105350d = true;
                this.f105347a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f105350d) {
                return;
            }
            try {
                if (this.f105348b.test(t)) {
                    return;
                }
                this.f105350d = true;
                this.f105349c.dispose();
                this.f105347a.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f105349c.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f105349c, d)) {
                this.f105349c = d;
                this.f105347a.onSubscribe(this);
            }
        }
    }

    public zkb(wub<T> source, n8d<? super T> predicate) {
        this.f105345a = source;
        this.f105346b = predicate;
    }

    @Override // p000.y07
    public vkb<Boolean> fuseToObservable() {
        return ofe.onAssembly(new xkb(this.f105345a, this.f105346b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super Boolean> t) {
        this.f105345a.subscribe(new C16167a(t, this.f105346b));
    }
}
