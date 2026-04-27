package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gh6<T, R> extends ljf<R> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f39818a;

    /* JADX INFO: renamed from: b */
    public final R f39819b;

    /* JADX INFO: renamed from: c */
    public final j11<R, ? super T, R> f39820c;

    /* JADX INFO: renamed from: gh6$a */
    public static final class C6314a<T, R> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super R> f39821a;

        /* JADX INFO: renamed from: b */
        public final j11<R, ? super T, R> f39822b;

        /* JADX INFO: renamed from: c */
        public R f39823c;

        /* JADX INFO: renamed from: d */
        public fdg f39824d;

        public C6314a(inf<? super R> infVar, j11<R, ? super T, R> j11Var, R r) {
            this.f39821a = infVar;
            this.f39823c = r;
            this.f39822b = j11Var;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f39824d.cancel();
            this.f39824d = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f39824d == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            R r = this.f39823c;
            if (r != null) {
                this.f39823c = null;
                this.f39824d = mdg.CANCELLED;
                this.f39821a.onSuccess(r);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f39823c == null) {
                pfe.onError(th);
                return;
            }
            this.f39823c = null;
            this.f39824d = mdg.CANCELLED;
            this.f39821a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            R r = this.f39823c;
            if (r != null) {
                try {
                    this.f39823c = (R) xjb.requireNonNull(this.f39822b.apply(r, t), "The reducer returned a null value");
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f39824d.cancel();
                    onError(th);
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f39824d, fdgVar)) {
                this.f39824d = fdgVar;
                this.f39821a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public gh6(zjd<T> zjdVar, R r, j11<R, ? super T, R> j11Var) {
        this.f39818a = zjdVar;
        this.f39819b = r;
        this.f39820c = j11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super R> infVar) {
        this.f39818a.subscribe(new C6314a(infVar, this.f39820c, this.f39819b));
    }
}
