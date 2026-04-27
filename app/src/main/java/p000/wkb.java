package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wkb<T> extends AbstractC10162o3<T, Boolean> {

    /* JADX INFO: renamed from: b */
    public final m8d<? super T> f94514b;

    /* JADX INFO: renamed from: wkb$a */
    public static final class C14661a<T> implements oxb<T>, mf4 {

        /* JADX INFO: renamed from: a */
        public final oxb<? super Boolean> f94515a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f94516b;

        /* JADX INFO: renamed from: c */
        public mf4 f94517c;

        /* JADX INFO: renamed from: d */
        public boolean f94518d;

        public C14661a(oxb<? super Boolean> oxbVar, m8d<? super T> m8dVar) {
            this.f94515a = oxbVar;
            this.f94516b = m8dVar;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f94517c.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f94517c.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f94518d) {
                return;
            }
            this.f94518d = true;
            this.f94515a.onNext(Boolean.TRUE);
            this.f94515a.onComplete();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f94518d) {
                pfe.onError(th);
            } else {
                this.f94518d = true;
                this.f94515a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f94518d) {
                return;
            }
            try {
                if (this.f94516b.test(t)) {
                    return;
                }
                this.f94518d = true;
                this.f94517c.dispose();
                this.f94515a.onNext(Boolean.FALSE);
                this.f94515a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f94517c.dispose();
                onError(th);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f94517c, mf4Var)) {
                this.f94517c = mf4Var;
                this.f94515a.onSubscribe(this);
            }
        }
    }

    public wkb(xub<T> xubVar, m8d<? super T> m8dVar) {
        super(xubVar);
        this.f94514b = m8dVar;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super Boolean> oxbVar) {
        this.f66354a.subscribe(new C14661a(oxbVar, this.f94514b));
    }
}
