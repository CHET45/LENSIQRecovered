package p000;

import java.util.Collection;

/* JADX INFO: loaded from: classes7.dex */
public final class mwb<T, U extends Collection<? super T>> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final nfg<U> f62564b;

    /* JADX INFO: renamed from: mwb$a */
    public static final class C9573a<T, U extends Collection<? super T>> implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f62565a;

        /* JADX INFO: renamed from: b */
        public lf4 f62566b;

        /* JADX INFO: renamed from: c */
        public U f62567c;

        public C9573a(pxb<? super U> actual, U collection) {
            this.f62565a = actual;
            this.f62567c = collection;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f62566b.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f62566b.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            U u = this.f62567c;
            this.f62567c = null;
            this.f62565a.onNext(u);
            this.f62565a.onComplete();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f62567c = null;
            this.f62565a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f62567c.add(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f62566b, d)) {
                this.f62566b = d;
                this.f62565a.onSubscribe(this);
            }
        }
    }

    public mwb(wub<T> source, nfg<U> collectionSupplier) {
        super(source);
        this.f62564b = collectionSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        try {
            this.f63101a.subscribe(new C9573a(t, (Collection) k75.nullCheck(this.f62564b.get(), "The collectionSupplier returned a null Collection.")));
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            b05.error(th, t);
        }
    }
}
