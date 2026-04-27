package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f92385b;

    /* JADX INFO: renamed from: vvb$a */
    public static final class C14276a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f92386a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f92387b;

        /* JADX INFO: renamed from: c */
        public mf4 f92388c;

        /* JADX INFO: renamed from: d */
        public boolean f92389d;

        public C14276a(oxb<? super T> oxbVar, m8d<? super T> m8dVar) {
            this.f92386a = oxbVar;
            this.f92387b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f92388c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f92388c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f92389d) {
                return;
            }
            this.f92389d = true;
            this.f92386a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f92389d) {
                pfe.onError(th);
            } else {
                this.f92389d = true;
                this.f92386a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f92389d) {
                return;
            }
            this.f92386a.onNext(t);
            try {
                if (this.f92387b.test(t)) {
                    this.f92389d = true;
                    this.f92388c.dispose();
                    this.f92386a.onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f92388c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f92388c, mf4Var)) {
                this.f92388c = mf4Var;
                this.f92386a.onSubscribe(this);
            }
        }
    }

    public vvb(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f92385b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C14276a(oxbVar, this.f92385b));
    }
}
