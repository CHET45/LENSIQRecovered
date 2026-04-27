package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class i8a<T> extends r4a<T> implements fh7<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f46040a;

    /* JADX INFO: renamed from: i8a$a */
    public static final class C7183a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f46041a;

        /* JADX INFO: renamed from: b */
        public lf4 f46042b;

        public C7183a(k9a<? super T> downstream) {
            this.f46041a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f46042b.dispose();
            this.f46042b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f46042b.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f46042b = zf4.DISPOSED;
            this.f46041a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f46042b, d)) {
                this.f46042b = d;
                this.f46041a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f46042b = zf4.DISPOSED;
            this.f46041a.onSuccess(value);
        }
    }

    public i8a(oof<T> source) {
        this.f46040a = source;
    }

    @Override // p000.fh7
    public oof<T> source() {
        return this.f46040a;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f46040a.subscribe(new C7183a(observer));
    }
}
