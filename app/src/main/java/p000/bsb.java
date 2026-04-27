package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bsb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super Throwable, ? extends T> f14660b;

    /* JADX INFO: renamed from: bsb$a */
    public static final class C2033a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f14661a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Throwable, ? extends T> f14662b;

        /* JADX INFO: renamed from: c */
        public lf4 f14663c;

        public C2033a(pxb<? super T> actual, sy6<? super Throwable, ? extends T> valueSupplier) {
            this.f14661a = actual;
            this.f14662b = valueSupplier;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f14663c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f14663c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f14661a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            try {
                T tApply = this.f14662b.apply(t);
                if (tApply != null) {
                    this.f14661a.onNext(tApply);
                    this.f14661a.onComplete();
                } else {
                    NullPointerException nullPointerException = new NullPointerException("The supplied value is null");
                    nullPointerException.initCause(t);
                    this.f14661a.onError(nullPointerException);
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f14661a.onError(new qm2(t, th));
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f14661a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f14663c, d)) {
                this.f14663c = d;
                this.f14661a.onSubscribe(this);
            }
        }
    }

    public bsb(wub<T> source, sy6<? super Throwable, ? extends T> valueSupplier) {
        super(source);
        this.f14660b = valueSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> t) {
        this.f63101a.subscribe(new C2033a(t, this.f14660b));
    }
}
