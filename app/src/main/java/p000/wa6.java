package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wa6<T> extends ljf<Long> implements v07<Long> {

    /* JADX INFO: renamed from: a */
    public final m86<T> f93807a;

    /* JADX INFO: renamed from: wa6$a */
    public static final class C14526a implements lj6<Object>, mf4 {

        /* JADX INFO: renamed from: a */
        public final inf<? super Long> f93808a;

        /* JADX INFO: renamed from: b */
        public fdg f93809b;

        /* JADX INFO: renamed from: c */
        public long f93810c;

        public C14526a(inf<? super Long> infVar) {
            this.f93808a = infVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f93809b.cancel();
            this.f93809b = mdg.CANCELLED;
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f93809b == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f93809b = mdg.CANCELLED;
            this.f93808a.onSuccess(Long.valueOf(this.f93810c));
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f93809b = mdg.CANCELLED;
            this.f93808a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            this.f93810c++;
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f93809b, fdgVar)) {
                this.f93809b = fdgVar;
                this.f93808a.onSubscribe(this);
                fdgVar.request(Long.MAX_VALUE);
            }
        }
    }

    public wa6(m86<T> m86Var) {
        this.f93807a = m86Var;
    }

    @Override // p000.v07
    public m86<Long> fuseToFlowable() {
        return pfe.onAssembly(new ua6(this.f93807a));
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Long> infVar) {
        this.f93807a.subscribe((lj6) new C14526a(infVar));
    }
}
