package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cvb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final wub<? extends T> f27831b;

    /* JADX INFO: renamed from: cvb$a */
    public static final class C4530a<T> implements pxb<T> {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f27832a;

        /* JADX INFO: renamed from: b */
        public final wub<? extends T> f27833b;

        /* JADX INFO: renamed from: d */
        public boolean f27835d = true;

        /* JADX INFO: renamed from: c */
        public final a0f f27834c = new a0f();

        public C4530a(pxb<? super T> actual, wub<? extends T> other) {
            this.f27832a = actual;
            this.f27833b = other;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (!this.f27835d) {
                this.f27832a.onComplete();
            } else {
                this.f27835d = false;
                this.f27833b.subscribe(this);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f27832a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f27835d) {
                this.f27835d = false;
            }
            this.f27832a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            this.f27834c.update(d);
        }
    }

    public cvb(wub<T> source, wub<? extends T> other) {
        super(source);
        this.f27831b = other;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        C4530a c4530a = new C4530a(t, this.f27831b);
        t.onSubscribe(c4530a.f27834c);
        this.f63101a.subscribe(c4530a);
    }
}
