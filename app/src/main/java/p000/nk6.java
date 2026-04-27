package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class nk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f64803c;

    /* JADX INFO: renamed from: nk6$a */
    public static final class C9913a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f64804a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f64805b;

        /* JADX INFO: renamed from: c */
        public fdg f64806c;

        /* JADX INFO: renamed from: d */
        public boolean f64807d;

        public C9913a(ycg<? super T> ycgVar, m8d<? super T> m8dVar) {
            this.f64804a = ycgVar;
            this.f64805b = m8dVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f64806c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f64807d) {
                return;
            }
            this.f64807d = true;
            this.f64804a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f64807d) {
                pfe.onError(th);
            } else {
                this.f64807d = true;
                this.f64804a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f64807d) {
                return;
            }
            try {
                if (this.f64805b.test(t)) {
                    this.f64804a.onNext(t);
                    return;
                }
                this.f64807d = true;
                this.f64806c.cancel();
                this.f64804a.onComplete();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f64806c.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f64806c, fdgVar)) {
                this.f64806c = fdgVar;
                this.f64804a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f64806c.request(j);
        }
    }

    public nk6(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f64803c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C9913a(ycgVar, this.f64803c));
    }
}
