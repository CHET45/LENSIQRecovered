package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class sub<T, U> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final xub<U> f82913b;

    /* JADX INFO: renamed from: sub$a */
    public final class C12794a implements oxb<U> {

        /* JADX INFO: renamed from: a */
        public final x50 f82914a;

        /* JADX INFO: renamed from: b */
        public final C12795b<T> f82915b;

        /* JADX INFO: renamed from: c */
        public final n1f<T> f82916c;

        /* JADX INFO: renamed from: d */
        public mf4 f82917d;

        public C12794a(x50 x50Var, C12795b<T> c12795b, n1f<T> n1fVar) {
            this.f82914a = x50Var;
            this.f82915b = c12795b;
            this.f82916c = n1fVar;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f82915b.f82922d = true;
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f82914a.dispose();
            this.f82916c.onError(th);
        }

        @Override // p000.oxb
        public void onNext(U u) {
            this.f82917d.dispose();
            this.f82915b.f82922d = true;
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f82917d, mf4Var)) {
                this.f82917d = mf4Var;
                this.f82914a.setResource(1, mf4Var);
            }
        }
    }

    /* JADX INFO: renamed from: sub$b */
    public static final class C12795b<T> implements oxb<T> {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f82919a;

        /* JADX INFO: renamed from: b */
        public final x50 f82920b;

        /* JADX INFO: renamed from: c */
        public mf4 f82921c;

        /* JADX INFO: renamed from: d */
        public volatile boolean f82922d;

        /* JADX INFO: renamed from: e */
        public boolean f82923e;

        public C12795b(oxb<? super T> oxbVar, x50 x50Var) {
            this.f82919a = oxbVar;
            this.f82920b = x50Var;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f82920b.dispose();
            this.f82919a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f82920b.dispose();
            this.f82919a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f82923e) {
                this.f82919a.onNext(t);
            } else if (this.f82922d) {
                this.f82923e = true;
                this.f82919a.onNext(t);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f82921c, mf4Var)) {
                this.f82921c = mf4Var;
                this.f82920b.setResource(0, mf4Var);
            }
        }
    }

    public sub(xub<T> xubVar, xub<U> xubVar2) {
        super(xubVar);
        this.f82913b = xubVar2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        n1f n1fVar = new n1f(oxbVar);
        x50 x50Var = new x50(2);
        n1fVar.onSubscribe(x50Var);
        C12795b c12795b = new C12795b(n1fVar, x50Var);
        this.f82913b.subscribe(new C12794a(x50Var, c12795b, n1fVar));
        this.f66354a.subscribe(c12795b);
    }
}
