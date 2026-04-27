package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class gj6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f39928c;

    /* JADX INFO: renamed from: gj6$a */
    public static final class C6336a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f39929a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f39930b;

        /* JADX INFO: renamed from: c */
        public fdg f39931c;

        /* JADX INFO: renamed from: d */
        public boolean f39932d;

        public C6336a(ycg<? super T> actual, n8d<? super T> predicate) {
            this.f39929a = actual;
            this.f39930b = predicate;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f39931c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f39929a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f39929a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f39932d) {
                this.f39929a.onNext(t);
                return;
            }
            try {
                if (this.f39930b.test(t)) {
                    this.f39931c.request(1L);
                } else {
                    this.f39932d = true;
                    this.f39929a.onNext(t);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f39931c.cancel();
                this.f39929a.onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f39931c, s)) {
                this.f39931c = s;
                this.f39929a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f39931c.request(n);
        }
    }

    public gj6(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f39928c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C6336a(s, this.f39928c));
    }
}
