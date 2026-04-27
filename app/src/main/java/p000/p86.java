package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class p86<T> extends ljf<Boolean> implements v07<Boolean> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f69978a;

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f69979b;

    /* JADX INFO: renamed from: p86$a */
    public static final class C10836a<T> implements lj6<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f69980a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f69981b;

        /* JADX INFO: renamed from: c */
        public fdg f69982c;

        /* JADX INFO: renamed from: d */
        public boolean f69983d;

        public C10836a(inf<? super Boolean> infVar, m8d<? super T> m8dVar) {
            this.f69980a = infVar;
            this.f69981b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f69982c.cancel();
            this.f69982c = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f69982c == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f69983d) {
                return;
            }
            this.f69983d = true;
            this.f69982c = mdg.CANCELLED;
            this.f69980a.onSuccess(Boolean.TRUE);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f69983d) {
                pfe.onError(th);
                return;
            }
            this.f69983d = true;
            this.f69982c = mdg.CANCELLED;
            this.f69980a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f69983d) {
                return;
            }
            try {
                if (this.f69981b.test(t)) {
                    return;
                }
                this.f69983d = true;
                this.f69982c.cancel();
                this.f69982c = mdg.CANCELLED;
                this.f69980a.onSuccess(Boolean.FALSE);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f69982c.cancel();
                this.f69982c = mdg.CANCELLED;
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f69982c, fdgVar)) {
                this.f69982c = fdgVar;
                this.f69980a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public p86(m86<T> m86Var, m8d<? super T> m8dVar) {
        this.f69978a = m86Var;
        this.f69979b = m8dVar;
    }

    @Override // p000.v07
    public m86<Boolean> fuseToFlowable() {
        return pfe.onAssembly(new n86(this.f69978a, this.f69979b));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f69978a.subscribe((lj6) new C10836a(infVar, this.f69979b));
    }
}
