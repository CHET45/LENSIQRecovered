package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class l8a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: l8a$a */
    public static final class C8713a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f56773a;

        /* JADX INFO: renamed from: b */
        public lf4 f56774b;

        public C8713a(k9a<? super T> downstream) {
            this.f56773a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f56774b.dispose();
            this.f56774b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f56774b.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f56773a.onComplete();
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f56773a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f56774b, d)) {
                this.f56774b = d;
                this.f56773a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f56773a.onSuccess(value);
        }
    }

    public l8a(z9a<T> source) {
        super(source);
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C8713a(observer));
    }
}
