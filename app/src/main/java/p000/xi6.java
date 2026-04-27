package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xi6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f98065c;

    /* JADX INFO: renamed from: xi6$a */
    public static final class C15140a<T> implements lj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f98066a;

        /* JADX INFO: renamed from: b */
        public long f98067b;

        /* JADX INFO: renamed from: c */
        public fdg f98068c;

        public C15140a(ycg<? super T> ycgVar, long j) {
            this.f98066a = ycgVar;
            this.f98067b = j;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f98068c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f98066a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f98066a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f98067b;
            if (j != 0) {
                this.f98067b = j - 1;
            } else {
                this.f98066a.onNext(t);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f98068c, fdgVar)) {
                long j = this.f98067b;
                this.f98068c = fdgVar;
                this.f98066a.onSubscribe(this);
                fdgVar.request(j);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f98068c.request(j);
        }
    }

    public xi6(m86<T> m86Var, long j) {
        super(m86Var);
        this.f98065c = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f52360b.subscribe((lj6) new C15140a(ycgVar, this.f98065c));
    }
}
