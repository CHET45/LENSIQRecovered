package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mk6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f61245c;

    /* JADX INFO: renamed from: mk6$a */
    public static final class C9380a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f61246a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f61247b;

        /* JADX INFO: renamed from: c */
        public fdg f61248c;

        /* JADX INFO: renamed from: d */
        public boolean f61249d;

        public C9380a(ycg<? super T> actual, n8d<? super T> predicate) {
            this.f61246a = actual;
            this.f61247b = predicate;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f61248c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f61249d) {
                return;
            }
            this.f61249d = true;
            this.f61246a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f61249d) {
                ofe.onError(t);
            } else {
                this.f61249d = true;
                this.f61246a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f61249d) {
                return;
            }
            this.f61246a.onNext(t);
            try {
                if (this.f61247b.test(t)) {
                    this.f61249d = true;
                    this.f61248c.cancel();
                    this.f61246a.onComplete();
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f61248c.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f61248c, s)) {
                this.f61248c = s;
                this.f61246a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f61248c.request(n);
        }
    }

    public mk6(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f61245c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C9380a(s, this.f61245c));
    }
}
