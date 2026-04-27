package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class lqb<T> extends xd2 implements y07<T> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f58464a;

    /* JADX INFO: renamed from: lqb$a */
    public static final class C8939a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final ch2 f58465a;

        /* JADX INFO: renamed from: b */
        public lf4 f58466b;

        public C8939a(ch2 t) {
            this.f58465a = t;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f58466b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f58466b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f58465a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f58465a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T v) {
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f58466b = d;
            this.f58465a.onSubscribe(this);
        }
    }

    public lqb(wub<T> source) {
        this.f58464a = source;
    }

    @Override // p000.y07
    public vkb<T> fuseToObservable() {
        return ofe.onAssembly(new jqb(this.f58464a));
    }

    @Override // p000.xd2
    public void subscribeActual(final ch2 t) {
        this.f58464a.subscribe(new C8939a(t));
    }
}
