package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ok6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f67896c;

    /* JADX INFO: renamed from: ok6$a */
    public static final class C10398a<T> implements kj6<T>, fdg {

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f67897a;

        /* JADX INFO: renamed from: b */
        public final n8d<? super T> f67898b;

        /* JADX INFO: renamed from: c */
        public fdg f67899c;

        /* JADX INFO: renamed from: d */
        public boolean f67900d;

        public C10398a(ycg<? super T> actual, n8d<? super T> predicate) {
            this.f67897a = actual;
            this.f67898b = predicate;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f67899c.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f67900d) {
                return;
            }
            this.f67900d = true;
            this.f67897a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f67900d) {
                ofe.onError(t);
            } else {
                this.f67900d = true;
                this.f67897a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f67900d) {
                return;
            }
            try {
                if (this.f67898b.test(t)) {
                    this.f67897a.onNext(t);
                    return;
                }
                this.f67900d = true;
                this.f67899c.cancel();
                this.f67897a.onComplete();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f67899c.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f67899c, s)) {
                this.f67899c = s;
                this.f67897a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f67899c.request(n);
        }
    }

    public ok6(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f67896c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C10398a(s, this.f67896c));
    }
}
