package p000;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes7.dex */
public final class bba<T> extends kjf<T> implements zg7<T> {

    /* JADX INFO: renamed from: a */
    public final z9a<T> f13245a;

    /* JADX INFO: renamed from: b */
    public final T f13246b;

    /* JADX INFO: renamed from: bba$a */
    public static final class C1822a<T> implements k9a<T>, lf4 {

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f13247a;

        /* JADX INFO: renamed from: b */
        public final T f13248b;

        /* JADX INFO: renamed from: c */
        public lf4 f13249c;

        public C1822a(hnf<? super T> actual, T defaultValue) {
            this.f13247a = actual;
            this.f13248b = defaultValue;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f13249c.dispose();
            this.f13249c = zf4.DISPOSED;
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f13249c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f13249c = zf4.DISPOSED;
            T t = this.f13248b;
            if (t != null) {
                this.f13247a.onSuccess(t);
            } else {
                this.f13247a.onError(new NoSuchElementException("The MaybeSource is empty"));
            }
        }

        @Override // p000.k9a
        public void onError(Throwable e) {
            this.f13249c = zf4.DISPOSED;
            this.f13247a.onError(e);
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f13249c, d)) {
                this.f13249c = d;
                this.f13247a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T value) {
            this.f13249c = zf4.DISPOSED;
            this.f13247a.onSuccess(value);
        }
    }

    public bba(z9a<T> source, T defaultValue) {
        this.f13245a = source;
        this.f13246b = defaultValue;
    }

    @Override // p000.zg7
    public z9a<T> source() {
        return this.f13245a;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f13245a.subscribe(new C1822a(observer, this.f13246b));
    }
}
