package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class n8a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: n8a$a */
    public static final class C9727a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f63492a;

        /* JADX INFO: renamed from: b */
        public lf4 f63493b;

        public C9727a(k9a<? super T> downstream) {
            this.f63492a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f63493b.dispose();
            this.f63493b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f63493b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f63493b = zf4.DISPOSED;
            this.f63492a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f63493b = zf4.DISPOSED;
            this.f63492a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f63493b, d)) {
                this.f63493b = d;
                this.f63492a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f63493b = zf4.DISPOSED;
            this.f63492a.onComplete();
        }
    }

    public n8a(z9a<T> source) {
        super(source);
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C9727a(observer));
    }
}
