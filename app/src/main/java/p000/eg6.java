package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class eg6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: eg6$a */
    public static final class C5295a<T> extends AbstractC15905z<T, T> {
        private static final long serialVersionUID = 163080509307634843L;

        public C5295a(ycg<? super T> downstream) {
            super(downstream);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.AbstractC15905z, p000.ycg
        public void onNext(T t) {
            this.f103579m.lazySet((R) t);
            m26430b();
        }
    }

    public eg6(l86<T> source) {
        super(source);
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new C5295a(s));
    }
}
