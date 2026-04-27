package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class u86<T> extends AbstractC7714j1<T, Boolean> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f87042c;

    /* JADX INFO: renamed from: u86$a */
    public static final class C13400a<T> extends j34<Boolean> implements kj6<T> {
        private static final long serialVersionUID = -2311252482644620661L;

        /* JADX INFO: renamed from: L */
        public final n8d<? super T> f87043L;

        /* JADX INFO: renamed from: M */
        public fdg f87044M;

        /* JADX INFO: renamed from: N */
        public boolean f87045N;

        public C13400a(ycg<? super Boolean> actual, n8d<? super T> predicate) {
            super(actual);
            this.f87043L = predicate;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f87044M.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f87045N) {
                return;
            }
            this.f87045N = true;
            complete(Boolean.FALSE);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f87045N) {
                ofe.onError(t);
            } else {
                this.f87045N = true;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f87045N) {
                return;
            }
            try {
                if (this.f87043L.test(t)) {
                    this.f87045N = true;
                    this.f87044M.cancel();
                    complete(Boolean.TRUE);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f87044M.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f87044M, s)) {
                this.f87044M = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public u86(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f87042c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Boolean> s) {
        this.f49321b.subscribe((kj6) new C13400a(s, this.f87042c));
    }
}
