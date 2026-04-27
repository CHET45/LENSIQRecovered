package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xvb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f99472b;

    /* JADX INFO: renamed from: xvb$a */
    public static final class C15315a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f99473a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f99474b;

        /* JADX INFO: renamed from: c */
        public mf4 f99475c;

        /* JADX INFO: renamed from: d */
        public boolean f99476d;

        public C15315a(oxb<? super T> oxbVar, m8d<? super T> m8dVar) {
            this.f99473a = oxbVar;
            this.f99474b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f99475c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f99475c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f99476d) {
                return;
            }
            this.f99476d = true;
            this.f99473a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f99476d) {
                pfe.onError(th);
            } else {
                this.f99476d = true;
                this.f99473a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f99476d) {
                return;
            }
            try {
                if (this.f99474b.test(t)) {
                    this.f99473a.onNext(t);
                    return;
                }
                this.f99476d = true;
                this.f99475c.dispose();
                this.f99473a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f99475c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f99475c, mf4Var)) {
                this.f99475c = mf4Var;
                this.f99473a.onSubscribe(this);
            }
        }
    }

    public xvb(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f99472b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f66354a.subscribe(new C15315a(oxbVar, this.f99472b));
    }
}
