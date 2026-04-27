package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ig6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final py6<? super Throwable, ? extends zjd<? extends T>> f46773c;

    /* JADX INFO: renamed from: d */
    public final boolean f46774d;

    /* JADX INFO: renamed from: ig6$a */
    public static final class C7273a<T> extends hdg implements lj6<T> {
        private static final long serialVersionUID = 4063763155303814625L;

        /* JADX INFO: renamed from: F */
        public final ycg<? super T> f46775F;

        /* JADX INFO: renamed from: H */
        public final py6<? super Throwable, ? extends zjd<? extends T>> f46776H;

        /* JADX INFO: renamed from: L */
        public final boolean f46777L;

        /* JADX INFO: renamed from: M */
        public boolean f46778M;

        /* JADX INFO: renamed from: N */
        public boolean f46779N;

        /* JADX INFO: renamed from: Q */
        public long f46780Q;

        public C7273a(ycg<? super T> ycgVar, py6<? super Throwable, ? extends zjd<? extends T>> py6Var, boolean z) {
            super(false);
            this.f46775F = ycgVar;
            this.f46776H = py6Var;
            this.f46777L = z;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f46779N) {
                return;
            }
            this.f46779N = true;
            this.f46778M = true;
            this.f46775F.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f46778M) {
                if (this.f46779N) {
                    pfe.onError(th);
                    return;
                } else {
                    this.f46775F.onError(th);
                    return;
                }
            }
            this.f46778M = true;
            if (this.f46777L && !(th instanceof Exception)) {
                this.f46775F.onError(th);
                return;
            }
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f46776H.apply(th), "The nextSupplier returned a null Publisher");
                long j = this.f46780Q;
                if (j != 0) {
                    produced(j);
                }
                zjdVar.subscribe(this);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f46775F.onError(new pm2(th, th2));
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f46779N) {
                return;
            }
            if (!this.f46778M) {
                this.f46780Q++;
            }
            this.f46775F.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            setSubscription(fdgVar);
        }
    }

    public ig6(m86<T> m86Var, py6<? super Throwable, ? extends zjd<? extends T>> py6Var, boolean z) {
        super(m86Var);
        this.f46773c = py6Var;
        this.f46774d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C7273a c7273a = new C7273a(ycgVar, this.f46773c, this.f46774d);
        ycgVar.onSubscribe(c7273a);
        this.f52360b.subscribe((lj6) c7273a);
    }
}
