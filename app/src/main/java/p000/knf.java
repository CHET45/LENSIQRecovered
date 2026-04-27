package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class knf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<? extends T> f54814a;

    /* JADX INFO: renamed from: b */
    public final py6<? super Throwable, ? extends T> f54815b;

    /* JADX INFO: renamed from: c */
    public final T f54816c;

    /* JADX INFO: renamed from: knf$a */
    public final class C8465a implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f54817a;

        public C8465a(inf<? super T> infVar) {
            this.f54817a = infVar;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            T tApply;
            knf knfVar = knf.this;
            py6<? super Throwable, ? extends T> py6Var = knfVar.f54815b;
            if (py6Var != null) {
                try {
                    tApply = py6Var.apply(th);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    this.f54817a.onError(new pm2(th, th2));
                    return;
                }
            } else {
                tApply = knfVar.f54816c;
            }
            if (tApply != null) {
                this.f54817a.onSuccess(tApply);
                return;
            }
            NullPointerException nullPointerException = new NullPointerException("Value supplied was null");
            nullPointerException.initCause(th);
            this.f54817a.onError(nullPointerException);
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            this.f54817a.onSubscribe(mf4Var);
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            this.f54817a.onSuccess(t);
        }
    }

    public knf(pof<? extends T> pofVar, py6<? super Throwable, ? extends T> py6Var, T t) {
        this.f54814a = pofVar;
        this.f54815b = py6Var;
        this.f54816c = t;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f54814a.subscribe(new C8465a(infVar));
    }
}
