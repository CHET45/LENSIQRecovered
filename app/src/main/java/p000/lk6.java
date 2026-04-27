package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lk6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final m8d<? super T> f57980c;

    /* JADX INFO: renamed from: lk6$a */
    public static final class C8865a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f57981a;

        /* JADX INFO: renamed from: b */
        public final m8d<? super T> f57982b;

        /* JADX INFO: renamed from: c */
        public fdg f57983c;

        /* JADX INFO: renamed from: d */
        public boolean f57984d;

        public C8865a(ycg<? super T> ycgVar, m8d<? super T> m8dVar) {
            this.f57981a = ycgVar;
            this.f57982b = m8dVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f57983c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f57984d) {
                return;
            }
            this.f57984d = true;
            this.f57981a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f57984d) {
                pfe.onError(th);
            } else {
                this.f57984d = true;
                this.f57981a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f57984d) {
                return;
            }
            this.f57981a.onNext(t);
            try {
                if (this.f57982b.test(t)) {
                    this.f57984d = true;
                    this.f57983c.cancel();
                    this.f57981a.onComplete();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f57983c.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f57983c, fdgVar)) {
                this.f57983c = fdgVar;
                this.f57981a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f57983c.request(j);
        }
    }

    public lk6(m86<T> m86Var, m8d<? super T> m8dVar) {
        super(m86Var);
        this.f57980c = m8dVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C8865a(ycgVar, this.f57980c));
    }
}
