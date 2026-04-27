package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class hqb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: hqb$a */
    public static final class C6972a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f44576a;

        /* JADX INFO: renamed from: b */
        public lf4 f44577b;

        public C6972a(pxb<? super T> downstream) {
            this.f44576a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f44577b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f44577b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f44576a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f44576a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f44576a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f44577b, d)) {
                this.f44577b = d;
                this.f44576a.onSubscribe(this);
            }
        }
    }

    public hqb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> o) {
        this.f63101a.subscribe(new C6972a(o));
    }
}
