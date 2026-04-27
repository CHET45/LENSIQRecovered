package p000;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class ff2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final ph2 f36346a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC7776j8 f36347b;

    /* JADX INFO: renamed from: ff2$a */
    public static final class C5762a extends AtomicInteger implements ch2, lf4 {
        private static final long serialVersionUID = 4109457741734051389L;

        /* JADX INFO: renamed from: a */
        public final ch2 f36348a;

        /* JADX INFO: renamed from: b */
        public final InterfaceC7776j8 f36349b;

        /* JADX INFO: renamed from: c */
        public lf4 f36350c;

        public C5762a(ch2 actual, InterfaceC7776j8 onFinally) {
            this.f36348a = actual;
            this.f36349b = onFinally;
        }

        /* JADX INFO: renamed from: a */
        public void m10858a() {
            if (compareAndSet(0, 1)) {
                try {
                    this.f36349b.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f36350c.dispose();
            m10858a();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f36350c.isDisposed();
        }

        @Override // p000.ch2, p000.k9a
        public void onComplete() {
            this.f36348a.onComplete();
            m10858a();
        }

        @Override // p000.ch2
        public void onError(Throwable t) {
            this.f36348a.onError(t);
            m10858a();
        }

        @Override // p000.ch2
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f36350c, d)) {
                this.f36350c = d;
                this.f36348a.onSubscribe(this);
            }
        }
    }

    public ff2(ph2 source, InterfaceC7776j8 onFinally) {
        this.f36346a = source;
        this.f36347b = onFinally;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f36346a.subscribe(new C5762a(observer, this.f36347b));
    }
}
