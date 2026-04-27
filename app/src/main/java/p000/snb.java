package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class snb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: snb$a */
    public static final class C12704a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public pxb<? super T> f82377a;

        /* JADX INFO: renamed from: b */
        public lf4 f82378b;

        public C12704a(pxb<? super T> downstream) {
            this.f82377a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            lf4 lf4Var = this.f82378b;
            this.f82378b = xz4.INSTANCE;
            this.f82377a = xz4.asObserver();
            lf4Var.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f82378b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            pxb<? super T> pxbVar = this.f82377a;
            this.f82378b = xz4.INSTANCE;
            this.f82377a = xz4.asObserver();
            pxbVar.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            pxb<? super T> pxbVar = this.f82377a;
            this.f82378b = xz4.INSTANCE;
            this.f82377a = xz4.asObserver();
            pxbVar.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f82377a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f82378b, d)) {
                this.f82378b = d;
                this.f82377a.onSubscribe(this);
            }
        }
    }

    public snb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C12704a(observer));
    }
}
