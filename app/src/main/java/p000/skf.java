package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class skf<T> extends kjf<T> {

    /* JADX INFO: renamed from: a */
    public final oof<T> f82133a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f82134b;

    /* JADX INFO: renamed from: skf$a */
    public static final class C12639a<T> extends AtomicInteger implements hnf<T>, lf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final hnf<? super T> f82135a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f82136b;

        /* JADX INFO: renamed from: c */
        public lf4 f82137c;

        public C12639a(hnf<? super T> actual, InterfaceC7776j8 onFinally) {
            this.f82135a = actual;
            this.f82136b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m22085a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f82136b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f82137c.dispose();
            m22085a();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f82137c.isDisposed();
        }

        @Override // p000.hnf
        public void onError(Throwable t) {
            this.f82135a.onError(t);
            m22085a();
        }

        @Override // p000.hnf
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f82137c, d)) {
                this.f82137c = d;
                this.f82135a.onSubscribe(this);
            }
        }

        @Override // p000.hnf
        public void onSuccess(T t) {
            this.f82135a.onSuccess(t);
            m22085a();
        }
    }

    public skf(oof<T> source, InterfaceC7776j8 onFinally) {
        this.f82133a = source;
        this.f82134b = onFinally;
    }

    @Override // p000.kjf
    public void subscribeActual(hnf<? super T> observer) {
        this.f82133a.subscribe(new C12639a(observer, this.f82134b));
    }
}
