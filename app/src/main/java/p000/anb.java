package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class anb<T> extends AbstractC9666n3<T, Long> {

    /* JADX INFO: renamed from: anb$a */
    public static final class C0339a implements pxb<Object>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super Long> f2162a;

        /* JADX INFO: renamed from: b */
        public lf4 f2163b;

        /* JADX INFO: renamed from: c */
        public long f2164c;

        public C0339a(pxb<? super Long> downstream) {
            this.f2162a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f2163b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f2163b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f2162a.onNext(Long.valueOf(this.f2164c));
            this.f2162a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f2162a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            this.f2164c++;
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f2163b, d)) {
                this.f2163b = d;
                this.f2162a.onSubscribe(this);
            }
        }
    }

    public anb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super Long> t) {
        this.f63101a.subscribe(new C0339a(t));
    }
}
