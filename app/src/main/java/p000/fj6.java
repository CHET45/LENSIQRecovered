package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class fj6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f36847c;

    /* JADX INFO: renamed from: fj6$a */
    public static final class C5851a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f36848a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f36849b;

        /* JADX INFO: renamed from: c */
        public fdg f36850c;

        /* JADX INFO: renamed from: d */
        public boolean f36851d;

        public C5851a(ycg<? super T> ycgVar, m8d<? super T> m8dVar) {
            this.f36848a = ycgVar;
            this.f36849b = m8dVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f36850c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f36848a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f36848a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f36851d) {
                this.f36848a.onNext(t);
                return;
            }
            try {
                if (this.f36849b.test(t)) {
                    this.f36850c.request(1L);
                } else {
                    this.f36851d = true;
                    this.f36848a.onNext(t);
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f36850c.cancel();
                this.f36848a.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f36850c, fdgVar)) {
                this.f36850c = fdgVar;
                this.f36848a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f36850c.request(j);
        }
    }

    public fj6(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f36847c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C5851a(ycgVar, this.f36847c));
    }
}
