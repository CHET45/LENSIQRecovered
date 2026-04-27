package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class clb<T> extends AbstractC10162o3<T, Boolean> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f16893b;

    /* JADX INFO: renamed from: clb$a */
    public static final class C2377a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super Boolean> f16894a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f16895b;

        /* JADX INFO: renamed from: c */
        public mf4 f16896c;

        /* JADX INFO: renamed from: d */
        public boolean f16897d;

        public C2377a(oxb<? super Boolean> oxbVar, m8d<? super T> m8dVar) {
            this.f16894a = oxbVar;
            this.f16895b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f16896c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f16896c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f16897d) {
                return;
            }
            this.f16897d = true;
            this.f16894a.onNext(Boolean.FALSE);
            this.f16894a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f16897d) {
                pfe.onError(th);
            } else {
                this.f16897d = true;
                this.f16894a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f16897d) {
                return;
            }
            try {
                if (this.f16895b.test(t)) {
                    this.f16897d = true;
                    this.f16896c.dispose();
                    this.f16894a.onNext(Boolean.TRUE);
                    this.f16894a.onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f16896c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f16896c, mf4Var)) {
                this.f16896c = mf4Var;
                this.f16894a.onSubscribe(this);
            }
        }
    }

    public clb(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f16893b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Boolean> oxbVar) {
        this.f66354a.subscribe(new C2377a(oxbVar, this.f16893b));
    }
}
