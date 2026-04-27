package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ch6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final j11<T, T, T> f16527c;

    /* JADX INFO: renamed from: ch6$a */
    public static final class C2314a<T> extends k34<T> implements lj6<T> {
        private static final long serialVersionUID = -4663883003264602070L;

        /* JADX INFO: renamed from: L */
        public final j11<T, T, T> f16528L;

        /* JADX INFO: renamed from: M */
        public fdg f16529M;

        public C2314a(ycg<? super T> ycgVar, j11<T, T, T> j11Var) {
            super(ycgVar);
            this.f16528L = j11Var;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f16529M.cancel();
            this.f16529M = mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            fdg fdgVar = this.f16529M;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar == mdgVar) {
                return;
            }
            this.f16529M = mdgVar;
            T t = this.f52503b;
            if (t != null) {
                complete(t);
            } else {
                this.f52502a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            fdg fdgVar = this.f16529M;
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar == mdgVar) {
                pfe.onError(th);
            } else {
                this.f16529M = mdgVar;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f16529M == mdg.CANCELLED) {
                return;
            }
            T t2 = this.f52503b;
            if (t2 == null) {
                this.f52503b = t;
                return;
            }
            try {
                this.f52503b = (T) xjb.requireNonNull(this.f16528L.apply(t2, t), "The reducer returned a null value");
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f16529M.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f16529M, fdgVar)) {
                this.f16529M = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public ch6(m86<T> m86Var, j11<T, T, T> j11Var) {
        super(m86Var);
        this.f16527c = j11Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C2314a(ycgVar, this.f16527c));
    }
}
