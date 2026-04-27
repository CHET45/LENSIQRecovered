package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t86<T> extends AbstractC8162k1<T, Boolean> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f83963c;

    /* JADX INFO: renamed from: t86$a */
    public static final class C12948a<T> extends k34<Boolean> implements lj6<T> {
        private static final long serialVersionUID = -2311252482644620661L;

        /* JADX INFO: renamed from: L */
        public final m8d<? super T> f83964L;

        /* JADX INFO: renamed from: M */
        public fdg f83965M;

        /* JADX INFO: renamed from: N */
        public boolean f83966N;

        public C12948a(ycg<? super Boolean> ycgVar, m8d<? super T> m8dVar) {
            super(ycgVar);
            this.f83964L = m8dVar;
        }

        @Override // p000.k34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f83965M.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f83966N) {
                return;
            }
            this.f83966N = true;
            complete(Boolean.FALSE);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f83966N) {
                pfe.onError(th);
            } else {
                this.f83966N = true;
                this.f52502a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f83966N) {
                return;
            }
            try {
                if (this.f83964L.test(t)) {
                    this.f83966N = true;
                    this.f83965M.cancel();
                    complete(Boolean.TRUE);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f83965M.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f83965M, fdgVar)) {
                this.f83965M = fdgVar;
                this.f52502a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public t86(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f83963c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super Boolean> ycgVar) {
        this.f52360b.subscribe((lj6) new C12948a(ycgVar, this.f83963c));
    }
}
