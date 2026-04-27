package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class qvb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: qvb$a */
    public static final class C11714a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f75922a;

        /* JADX INFO: renamed from: b */
        public lf4 f75923b;

        /* JADX INFO: renamed from: c */
        public T f75924c;

        public C11714a(pxb<? super T> downstream) {
            this.f75922a = downstream;
        }

        /* JADX INFO: renamed from: a */
        public void m20673a() {
            T t = this.f75924c;
            if (t != null) {
                this.f75924c = null;
                this.f75922a.onNext(t);
            }
            this.f75922a.onComplete();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f75924c = null;
            this.f75923b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f75923b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            m20673a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f75924c = null;
            this.f75922a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f75924c = t;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f75923b, d)) {
                this.f75923b = d;
                this.f75922a.onSubscribe(this);
            }
        }
    }

    public qvb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f63101a.subscribe(new C11714a(observer));
    }
}
