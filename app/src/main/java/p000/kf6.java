package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class kf6<T> extends AbstractC7714j1<T, jgb<T>> {

    /* JADX INFO: renamed from: kf6$a */
    public static final class C8348a<T> extends unf<T, jgb<T>> {
        private static final long serialVersionUID = -3740826063558713822L;

        public C8348a(ycg<? super jgb<T>> downstream) {
            super(downstream);
        }

        @Override // p000.unf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo14718b(jgb<T> n) {
            if (n.isOnError()) {
                ofe.onError(n.getError());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            m23463a(jgb.createOnComplete());
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            m23463a(jgb.createOnError(t));
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            this.f88631d++;
            this.f88628a.onNext(jgb.createOnNext(t));
        }
    }

    public kf6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super jgb<T>> s) {
        this.f49321b.subscribe((kj6) new C8348a(s));
    }
}
