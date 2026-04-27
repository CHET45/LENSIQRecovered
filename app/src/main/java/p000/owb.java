package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class owb<T, U extends Collection<? super T>> extends kjf<U> implements y07<U> {

    /* JADX INFO: renamed from: a */
    public final wub<T> f69057a;

    /* JADX INFO: renamed from: b */
    public final nfg<U> f69058b;

    /* JADX INFO: renamed from: owb$a */
    public static final class C10680a<T, U extends Collection<? super T>> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super U> f69059a;

        /* JADX INFO: renamed from: b */
        public U f69060b;

        /* JADX INFO: renamed from: c */
        public lf4 f69061c;

        public C10680a(hnf<? super U> actual, U collection) {
            this.f69059a = actual;
            this.f69060b = collection;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f69061c.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f69061c.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            U u = this.f69060b;
            this.f69060b = null;
            this.f69059a.onSuccess(u);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f69060b = null;
            this.f69059a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f69060b.add(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f69061c, d)) {
                this.f69061c = d;
                this.f69059a.onSubscribe(this);
            }
        }
    }

    public owb(wub<T> source, final int defaultCapacityHint) {
        this.f69057a = source;
        this.f69058b = r07.createArrayList(defaultCapacityHint);
    }

    @Override // p000.y07
    public vkb<U> fuseToObservable() {
        return ofe.onAssembly(new mwb(this.f69057a, this.f69058b));
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super U> t) {
        try {
            this.f69057a.subscribe(new C10680a(t, (Collection) k75.nullCheck(this.f69058b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, t);
        }
    }

    public owb(wub<T> source, nfg<U> collectionSupplier) {
        this.f69057a = source;
        this.f69058b = collectionSupplier;
    }
}
