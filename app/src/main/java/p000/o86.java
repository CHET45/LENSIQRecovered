package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class o86<T> extends AbstractC7714j1<T, Boolean> {

    /* JADX INFO: renamed from: c */
    public final n8d<? super T> f66650c;

    /* JADX INFO: renamed from: o86$a */
    public static final class C10221a<T> extends j34<Boolean> implements kj6<T> {
        private static final long serialVersionUID = -3521127104134758517L;

        /* JADX INFO: renamed from: L */
        public final n8d<? super T> f66651L;

        /* JADX INFO: renamed from: M */
        public fdg f66652M;

        /* JADX INFO: renamed from: N */
        public boolean f66653N;

        public C10221a(ycg<? super Boolean> actual, n8d<? super T> predicate) {
            super(actual);
            this.f66651L = predicate;
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f66652M.cancel();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f66653N) {
                return;
            }
            this.f66653N = true;
            complete(Boolean.TRUE);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f66653N) {
                ofe.onError(t);
            } else {
                this.f66653N = true;
                this.f49483a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f66653N) {
                return;
            }
            try {
                if (this.f66651L.test(t)) {
                    return;
                }
                this.f66653N = true;
                this.f66652M.cancel();
                complete(Boolean.FALSE);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f66652M.cancel();
                onError(th);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f66652M, s)) {
                this.f66652M = s;
                this.f49483a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }
    }

    public o86(l86<T> source, n8d<? super T> predicate) {
        super(source);
        this.f66650c = predicate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super Boolean> s) {
        this.f49321b.subscribe((kj6) new C10221a(s, this.f66650c));
    }
}
