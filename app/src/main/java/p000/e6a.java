package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class e6a<T> extends AbstractC15397y2<T, T> {

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f31902b;

    /* JADX INFO: renamed from: e6a$a */
    public static final class C5137a<T> extends AtomicInteger implements k9a<T>, lf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final k9a<? super T> f31903a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f31904b;

        /* JADX INFO: renamed from: c */
        public lf4 f31905c;

        public C5137a(k9a<? super T> actual, InterfaceC7776j8 onFinally) {
            this.f31903a = actual;
            this.f31904b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m9721a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f31904b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f31905c.dispose();
            m9721a();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f31905c.isDisposed();
        }

        @Override // p000.k9a
        public void onComplete() {
            this.f31903a.onComplete();
            m9721a();
        }

        @Override // p000.k9a
        public void onError(Throwable t) {
            this.f31903a.onError(t);
            m9721a();
        }

        @Override // p000.k9a
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f31905c, d)) {
                this.f31905c = d;
                this.f31903a.onSubscribe(this);
            }
        }

        @Override // p000.k9a
        public void onSuccess(T t) {
            this.f31903a.onSuccess(t);
            m9721a();
        }
    }

    public e6a(z9a<T> source, InterfaceC7776j8 onFinally) {
        super(source);
        this.f31902b = onFinally;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f100099a.subscribe(new C5137a(observer, this.f31902b));
    }
}
