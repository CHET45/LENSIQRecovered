package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class uub<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f89152b;

    /* JADX INFO: renamed from: uub$a */
    public static final class C13714a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f89153a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f89154b;

        /* JADX INFO: renamed from: c */
        public mf4 f89155c;

        /* JADX INFO: renamed from: d */
        public boolean f89156d;

        public C13714a(oxb<? super T> oxbVar, m8d<? super T> m8dVar) {
            this.f89153a = oxbVar;
            this.f89154b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f89155c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f89155c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f89153a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f89153a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f89156d) {
                this.f89153a.onNext(t);
                return;
            }
            try {
                if (this.f89154b.test(t)) {
                    return;
                }
                this.f89156d = true;
                this.f89153a.onNext(t);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f89155c.dispose();
                this.f89153a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f89155c, mf4Var)) {
                this.f89155c = mf4Var;
                this.f89153a.onSubscribe(this);
            }
        }
    }

    public uub(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f89152b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C13714a(oxbVar, this.f89152b));
    }
}
