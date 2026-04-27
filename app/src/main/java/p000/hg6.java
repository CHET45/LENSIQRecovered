package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super Throwable> f43413c;

    /* JADX INFO: renamed from: hg6$a */
    public static final class C6841a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f43414a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super Throwable> f43415b;

        /* JADX INFO: renamed from: c */
        public fdg f43416c;

        public C6841a(ycg<? super T> actual, n8d<? super Throwable> predicate) {
            this.f43414a = actual;
            this.f43415b = predicate;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f43416c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f43414a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            try {
                if (this.f43415b.test(e)) {
                    this.f43414a.onComplete();
                } else {
                    this.f43414a.onError(e);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f43414a.onError(new qm2(e, th));
            }
        }

        @Override // p000.ycg
        public void onNext(T value) {
            this.f43414a.onNext(value);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f43416c, s)) {
                this.f43416c = s;
                this.f43414a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f43416c.request(n);
        }
    }

    public hg6(l86<T> source, n8d<? super Throwable> predicate) {
        super(source);
        this.f43413c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> observer) {
        this.f49321b.subscribe((kj6) new C6841a(observer, this.f43413c));
    }
}
