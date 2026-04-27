package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mkf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f61265a;

    /* JADX INFO: renamed from: mkf$a */
    public static final class C9388a<T> implements hnf<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public hnf<? super T> f61266a;

        /* JADX INFO: renamed from: b */
        public lf4 f61267b;

        public C9388a(hnf<? super T> downstream) {
            this.f61266a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f61266a = null;
            this.f61267b.dispose();
            this.f61267b = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f61267b.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f61267b = zf4.DISPOSED;
            hnf<? super T> hnfVar = this.f61266a;
            if (hnfVar != null) {
                this.f61266a = null;
                hnfVar.onError(e);
            }
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f61267b, d)) {
                this.f61267b = d;
                this.f61266a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f61267b = zf4.DISPOSED;
            hnf<? super T> hnfVar = this.f61266a;
            if (hnfVar != null) {
                this.f61266a = null;
                hnfVar.onSuccess(value);
            }
        }
    }

    public mkf(oof<T> source) {
        this.f61265a = source;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f61265a.subscribe(new C9388a(observer));
    }
}
