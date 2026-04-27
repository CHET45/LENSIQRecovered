package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ukf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f88239a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f88240b;

    /* JADX INFO: renamed from: ukf$a */
    public static final class C13567a<T> extends AtomicReference<InterfaceC7776j8> implements hnf<T>, lf4 {
        private static final long serialVersionUID = -8583764624474935784L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f88241a;

        /* JADX INFO: renamed from: b */
        public lf4 f88242b;

        public C13567a(hnf<? super T> actual, InterfaceC7776j8 onDispose) {
            this.f88241a = actual;
            lazySet(onDispose);
        }

        @Override // p000.lf4
        public void dispose() {
            InterfaceC7776j8 andSet = getAndSet(null);
            if (andSet != null) {
                try {
                    andSet.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
                this.f88242b.dispose();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f88242b.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable e) {
            this.f88241a.onError(e);
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f88242b, d)) {
                this.f88242b = d;
                this.f88241a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T value) {
            this.f88241a.onSuccess(value);
        }
    }

    public ukf(oof<T> source, InterfaceC7776j8 onDispose) {
        this.f88239a = source;
        this.f88240b = onDispose;
    }

    @Override // p000.kjf
    public void subscribeActual(final hnf<? super T> observer) {
        this.f88239a.subscribe(new C13567a(observer, this.f88240b));
    }
}
