package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class n86<T> extends AbstractC8162k1<T, Boolean> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f63483c;

    /* JADX INFO: renamed from: n86$a */
    public static final class C9726a<T> extends k34<Boolean> implements lj6<T> {
        private static final long serialVersionUID = -3521127104134758517L;

        /* JADX INFO: renamed from: L */
        public final m8d<? super T> f63484L;

        /* JADX INFO: renamed from: M */
        public fdg f63485M;

        /* JADX INFO: renamed from: N */
        public boolean f63486N;

        public C9726a(ycg<? super Boolean> ycgVar, m8d<? super T> m8dVar) {
            super(ycgVar);
            this.f63484L = m8dVar;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f63485M.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f63486N) {
                return;
            }
            this.f63486N = true;
            complete(Boolean.TRUE);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f63486N) {
                pfe.onError(th);
            } else {
                this.f63486N = true;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f63486N) {
                return;
            }
            try {
                if (this.f63484L.test(t)) {
                    return;
                }
                this.f63486N = true;
                this.f63485M.cancel();
                complete(Boolean.FALSE);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f63485M.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f63485M, fdgVar)) {
                this.f63485M = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public n86(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f63483c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Boolean> ycgVar) {
        this.f52360b.subscribe((lj6) new C9726a(ycgVar, this.f63483c));
    }
}
