package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vaa<T> extends l86<T> implements zg7<T> {

    /* JADX INFO: renamed from: b */
    public final z9a<T> f90469b;

    /* JADX INFO: renamed from: vaa$a */
    public static final class C13965a<T> extends j34<T> implements k9a<T> {
        private static final long serialVersionUID = 7603343402964826922L;

        /* JADX INFO: renamed from: L */
        public lf4 f90470L;

        public C13965a(ycg<? super T> downstream) {
            super(downstream);
        }

        @Override // p000.j34, p000.fdg
        public void cancel() {
            super.cancel();
            this.f90470L.dispose();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f49483a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f49483a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f90470L, d)) {
                this.f90470L = d;
                this.f49483a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            complete(value);
        }
    }

    public vaa(z9a<T> source) {
        this.f90469b = source;
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f90469b;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f90469b.subscribe(new C13965a(s));
    }
}
