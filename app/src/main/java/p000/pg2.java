package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pg2 extends xd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends ph2> f70676a;

    /* JADX INFO: renamed from: b */
    public final int f70677b;

    /* JADX INFO: renamed from: c */
    public final boolean f70678c;

    /* JADX INFO: renamed from: pg2$a */
    public static final class C10954a extends AtomicInteger implements kj6<ph2>, lf4 {
        private static final long serialVersionUID = -2108443387387077490L;

        /* JADX INFO: renamed from: a */
        public final ch2 f70679a;

        /* JADX INFO: renamed from: b */
        public final int f70680b;

        /* JADX INFO: renamed from: c */
        public final boolean f70681c;

        /* JADX INFO: renamed from: f */
        public fdg f70684f;

        /* JADX INFO: renamed from: e */
        public final mm2 f70683e = new mm2();

        /* JADX INFO: renamed from: d */
        public final bc0 f70682d = new bc0();

        /* JADX INFO: renamed from: pg2$a$a */
        public final class a extends AtomicReference<lf4> implements ch2, lf4 {
            private static final long serialVersionUID = 251330541679988317L;

            public a() {
            }

            @Override // p000.lf4
            public void dispose() {
                zf4.dispose(this);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return zf4.isDisposed(get());
            }

            @Override // p000.ch2, p000.k9a
            public void onComplete() {
                C10954a.this.m19479a(this);
            }

            @Override // p000.ch2
            public void onError(Throwable e) {
                C10954a.this.m19480b(this, e);
            }

            @Override // p000.ch2
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C10954a(ch2 actual, int maxConcurrency, boolean delayErrors) {
            this.f70679a = actual;
            this.f70680b = maxConcurrency;
            this.f70681c = delayErrors;
            lazySet(1);
        }

        /* JADX INFO: renamed from: a */
        public void m19479a(a inner) {
            this.f70683e.delete(inner);
            if (decrementAndGet() == 0) {
                this.f70682d.tryTerminateConsumer(this.f70679a);
            } else if (this.f70680b != Integer.MAX_VALUE) {
                this.f70684f.request(1L);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m19480b(a inner, Throwable t) {
            this.f70683e.delete(inner);
            if (!this.f70681c) {
                this.f70684f.cancel();
                this.f70683e.dispose();
                if (!this.f70682d.tryAddThrowableOrReport(t) || getAndSet(0) <= 0) {
                    return;
                }
                this.f70682d.tryTerminateConsumer(this.f70679a);
                return;
            }
            if (this.f70682d.tryAddThrowableOrReport(t)) {
                if (decrementAndGet() == 0) {
                    this.f70682d.tryTerminateConsumer(this.f70679a);
                } else if (this.f70680b != Integer.MAX_VALUE) {
                    this.f70684f.request(1L);
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f70684f.cancel();
            this.f70683e.dispose();
            this.f70682d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f70683e.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (decrementAndGet() == 0) {
                this.f70682d.tryTerminateConsumer(this.f70679a);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f70681c) {
                if (this.f70682d.tryAddThrowableOrReport(t) && decrementAndGet() == 0) {
                    this.f70682d.tryTerminateConsumer(this.f70679a);
                    return;
                }
                return;
            }
            this.f70683e.dispose();
            if (!this.f70682d.tryAddThrowableOrReport(t) || getAndSet(0) <= 0) {
                return;
            }
            this.f70682d.tryTerminateConsumer(this.f70679a);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f70684f, s)) {
                this.f70684f = s;
                this.f70679a.onSubscribe(this);
                int i = this.f70680b;
                if (i == Integer.MAX_VALUE) {
                    s.request(Long.MAX_VALUE);
                } else {
                    s.request(i);
                }
            }
        }

        @Override // p000.ycg
        public void onNext(ph2 t) {
            getAndIncrement();
            a aVar = new a();
            this.f70683e.add(aVar);
            t.subscribe(aVar);
        }
    }

    public pg2(zjd<? extends ph2> source, int maxConcurrency, boolean delayErrors) {
        this.f70676a = source;
        this.f70677b = maxConcurrency;
        this.f70678c = delayErrors;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f70676a.subscribe(new C10954a(observer, this.f70677b, this.f70678c));
    }
}
