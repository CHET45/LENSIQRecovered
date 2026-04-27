package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class alf<T> extends ljf<T> {

    /* JADX INFO: renamed from: a */
    public final pof<T> f2007a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super mf4> f2008b;

    /* JADX INFO: renamed from: alf$a */
    public static final class C0317a<T> implements inf<T> {

        /* JADX INFO: renamed from: a */
        public final inf<? super T> f2009a;

        /* JADX INFO: renamed from: b */
        public final tu2<? super mf4> f2010b;

        /* JADX INFO: renamed from: c */
        public boolean f2011c;

        public C0317a(inf<? super T> infVar, tu2<? super mf4> tu2Var) {
            this.f2009a = infVar;
            this.f2010b = tu2Var;
        }

        @Override // p000.inf
        public void onError(Throwable th) {
            if (this.f2011c) {
                pfe.onError(th);
            } else {
                this.f2009a.onError(th);
            }
        }

        @Override // p000.inf
        public void onSubscribe(mf4 mf4Var) {
            try {
                this.f2010b.accept(mf4Var);
                this.f2009a.onSubscribe(mf4Var);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f2011c = true;
                mf4Var.dispose();
                c05.error(th, this.f2009a);
            }
        }

        @Override // p000.inf
        public void onSuccess(T t) {
            if (this.f2011c) {
                return;
            }
            this.f2009a.onSuccess(t);
        }
    }

    public alf(pof<T> pofVar, tu2<? super mf4> tu2Var) {
        this.f2007a = pofVar;
        this.f2008b = tu2Var;
    }

    @Override // p000.ljf
    public void subscribeActual(inf<? super T> infVar) {
        this.f2007a.subscribe(new C0317a(infVar, this.f2008b));
    }
}
