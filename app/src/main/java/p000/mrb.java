package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class mrb<T> extends AbstractC9666n3<T, jgb<T>> {

    /* JADX INFO: renamed from: mrb$a */
    public static final class C9488a<T> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super jgb<T>> f61838a;

        /* JADX INFO: renamed from: b */
        public lf4 f61839b;

        public C9488a(pxb<? super jgb<T>> downstream) {
            this.f61838a = downstream;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f61839b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f61839b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f61838a.onNext(jgb.createOnComplete());
            this.f61838a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f61838a.onNext(jgb.createOnError(t));
            this.f61838a.onComplete();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f61838a.onNext(jgb.createOnNext(t));
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f61839b, d)) {
                this.f61839b = d;
                this.f61838a.onSubscribe(this);
            }
        }
    }

    public mrb(wub<T> source) {
        super(source);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super jgb<T>> t) {
        this.f63101a.subscribe(new C9488a(t));
    }
}
