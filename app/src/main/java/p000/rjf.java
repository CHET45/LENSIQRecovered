package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rjf<T> extends ljf<Boolean> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f78479a;

    /* JADX INFO: renamed from: b */
    public final Object f78480b;

    /* JADX INFO: renamed from: c */
    public final m11<Object, Object> f78481c;

    /* JADX INFO: renamed from: rjf$a */
    public final class C12119a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super Boolean> f78482a;

        public C12119a(inf<? super Boolean> infVar) {
            this.f78482a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            this.f78482a.onError(th);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f78482a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            try {
                rjf rjfVar = rjf.this;
                this.f78482a.onSuccess(Boolean.valueOf(rjfVar.f78481c.test(t, rjfVar.f78480b)));
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f78482a.onError(th);
            }
        }
    }

    public rjf(pof<T> pofVar, Object obj, m11<Object, Object> m11Var) {
        this.f78479a = pofVar;
        this.f78480b = obj;
        this.f78481c = m11Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super Boolean> infVar) {
        this.f78479a.subscribe(new C12119a(infVar));
    }
}
