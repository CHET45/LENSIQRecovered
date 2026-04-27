package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class yi6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f101697c;

    /* JADX INFO: renamed from: yi6$a */
    public static final class C15681a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f101698a;

        /* JADX INFO: renamed from: b */
        public long f101699b;

        /* JADX INFO: renamed from: c */
        public fdg f101700c;

        public C15681a(ycg<? super T> actual, long n) {
            this.f101698a = actual;
            this.f101699b = n;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f101700c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f101698a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f101698a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f101699b;
            if (j != 0) {
                this.f101699b = j - 1;
            } else {
                this.f101698a.onNext(t);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f101700c, s)) {
                long j = this.f101699b;
                this.f101700c = s;
                this.f101698a.onSubscribe(this);
                s.request(j);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f101700c.request(n);
        }
    }

    public yi6(l86<T> source, long n) {
        super(source);
        this.f101697c = n;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C15681a(s, this.f101697c));
    }
}
