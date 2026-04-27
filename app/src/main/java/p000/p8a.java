package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class p8a<T> extends xd2 implements w07<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f69995a;

    /* JADX INFO: renamed from: p8a$a */
    public static final class C10839a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f69996a;

        /* JADX INFO: renamed from: b */
        public lf4 f69997b;

        public C10839a(ch2 downstream) {
            this.f69996a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f69997b.dispose();
            this.f69997b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f69997b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f69997b = zf4.DISPOSED;
            this.f69996a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f69997b = zf4.DISPOSED;
            this.f69996a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f69997b, d)) {
                this.f69997b = d;
                this.f69996a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f69997b = zf4.DISPOSED;
            this.f69996a.onComplete();
        }
    }

    public p8a(z9a<T> source) {
        this.f69995a = source;
    }

    @Override // p000.w07
    public r4a<T> fuseToMaybe() {
        return ofe.onAssembly(new n8a(this.f69995a));
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f69995a.subscribe(new C10839a(observer));
    }
}
