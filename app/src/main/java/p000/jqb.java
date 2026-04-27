package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class jqb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: jqb$a */
    public static final class C8021a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f51482a;

        /* JADX INFO: renamed from: b */
        public lf4 f51483b;

        public C8021a(pxb<? super T> t) {
            this.f51482a = t;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f51483b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f51483b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f51482a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            this.f51482a.onError(e);
        }

        @Override // p000.pxb
        public void onNext(T v) {
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f51483b = d;
            this.f51482a.onSubscribe(this);
        }
    }

    public jqb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(final pxb<? super T> t) {
        this.f63101a.subscribe(new C8021a(t));
    }
}
