package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class nmb<T, U> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends U>> f64996b;

    /* JADX INFO: renamed from: c */
    public final int f64997c;

    /* JADX INFO: renamed from: d */
    public final e55 f64998d;

    /* JADX INFO: renamed from: e */
    public final woe f64999e;

    /* JADX INFO: renamed from: nmb$a */
    public static final class RunnableC9942a<T, R> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = -6951100001833242599L;

        /* JADX INFO: renamed from: C */
        public zif<T> f65000C;

        /* JADX INFO: renamed from: F */
        public lf4 f65001F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f65002H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f65003L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f65004M;

        /* JADX INFO: renamed from: N */
        public int f65005N;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f65006a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f65007b;

        /* JADX INFO: renamed from: c */
        public final int f65008c;

        /* JADX INFO: renamed from: d */
        public final bc0 f65009d = new bc0();

        /* JADX INFO: renamed from: e */
        public final a<R> f65010e;

        /* JADX INFO: renamed from: f */
        public final boolean f65011f;

        /* JADX INFO: renamed from: m */
        public final woe.AbstractC14729c f65012m;

        /* JADX INFO: renamed from: nmb$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements pxb<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* JADX INFO: renamed from: a */
            public final pxb<? super R> f65013a;

            /* JADX INFO: renamed from: b */
            public final RunnableC9942a<?, R> f65014b;

            public a(pxb<? super R> actual, RunnableC9942a<?, R> parent) {
                this.f65013a = actual;
                this.f65014b = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m18004a() {
                zf4.dispose(this);
            }

            @Override // p000.pxb
            public void onComplete() {
                RunnableC9942a<?, R> runnableC9942a = this.f65014b;
                runnableC9942a.f65002H = false;
                runnableC9942a.m18003a();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                RunnableC9942a<?, R> runnableC9942a = this.f65014b;
                if (runnableC9942a.f65009d.tryAddThrowableOrReport(e)) {
                    if (!runnableC9942a.f65011f) {
                        runnableC9942a.f65001F.dispose();
                    }
                    runnableC9942a.f65002H = false;
                    runnableC9942a.m18003a();
                }
            }

            @Override // p000.pxb
            public void onNext(R value) {
                this.f65013a.onNext(value);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public RunnableC9942a(pxb<? super R> actual, sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize, boolean tillTheEnd, woe.AbstractC14729c worker) {
            this.f65006a = actual;
            this.f65007b = mapper;
            this.f65008c = bufferSize;
            this.f65011f = tillTheEnd;
            this.f65010e = new a<>(actual, this);
            this.f65012m = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m18003a() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f65012m.schedule(this);
        }

        @Override // p000.lf4
        public void dispose() {
            this.f65004M = true;
            this.f65001F.dispose();
            this.f65010e.m18004a();
            this.f65012m.dispose();
            this.f65009d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f65004M;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f65003L = true;
            m18003a();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f65009d.tryAddThrowableOrReport(e)) {
                this.f65003L = true;
                m18003a();
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            if (this.f65005N == 0) {
                this.f65000C.offer(value);
            }
            m18003a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f65001F, d)) {
                this.f65001F = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f65005N = iRequestFusion;
                        this.f65000C = tmdVar;
                        this.f65003L = true;
                        this.f65006a.onSubscribe(this);
                        m18003a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f65005N = iRequestFusion;
                        this.f65000C = tmdVar;
                        this.f65006a.onSubscribe(this);
                        return;
                    }
                }
                this.f65000C = new qzf(this.f65008c);
                this.f65006a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            pxb<? super R> pxbVar = this.f65006a;
            zif<T> zifVar = this.f65000C;
            bc0 bc0Var = this.f65009d;
            while (true) {
                if (!this.f65002H) {
                    if (this.f65004M) {
                        zifVar.clear();
                        return;
                    }
                    if (!this.f65011f && bc0Var.get() != null) {
                        zifVar.clear();
                        this.f65004M = true;
                        bc0Var.tryTerminateConsumer(pxbVar);
                        this.f65012m.dispose();
                        return;
                    }
                    boolean z = this.f65003L;
                    try {
                        T tPoll = zifVar.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f65004M = true;
                            bc0Var.tryTerminateConsumer(pxbVar);
                            this.f65012m.dispose();
                            return;
                        }
                        if (!z2) {
                            try {
                                wub<? extends R> wubVarApply = this.f65007b.apply(tPoll);
                                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                                wub<? extends R> wubVar = wubVarApply;
                                if (wubVar instanceof nfg) {
                                    try {
                                        InterfaceC0000a interfaceC0000a = (Object) ((nfg) wubVar).get();
                                        if (interfaceC0000a != null && !this.f65004M) {
                                            pxbVar.onNext(interfaceC0000a);
                                        }
                                    } catch (Throwable th) {
                                        o75.throwIfFatal(th);
                                        bc0Var.tryAddThrowableOrReport(th);
                                    }
                                } else {
                                    this.f65002H = true;
                                    wubVar.subscribe(this.f65010e);
                                }
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                this.f65004M = true;
                                this.f65001F.dispose();
                                zifVar.clear();
                                bc0Var.tryAddThrowableOrReport(th2);
                                bc0Var.tryTerminateConsumer(pxbVar);
                                this.f65012m.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        this.f65004M = true;
                        this.f65001F.dispose();
                        bc0Var.tryAddThrowableOrReport(th3);
                        bc0Var.tryTerminateConsumer(pxbVar);
                        this.f65012m.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: nmb$b */
    public static final class RunnableC9943b<T, U> extends AtomicInteger implements pxb<T>, lf4, Runnable {
        private static final long serialVersionUID = 8828587559905699186L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f65015C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f65016F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f65017H;

        /* JADX INFO: renamed from: L */
        public int f65018L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f65019a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends U>> f65020b;

        /* JADX INFO: renamed from: c */
        public final a<U> f65021c;

        /* JADX INFO: renamed from: d */
        public final int f65022d;

        /* JADX INFO: renamed from: e */
        public final woe.AbstractC14729c f65023e;

        /* JADX INFO: renamed from: f */
        public zif<T> f65024f;

        /* JADX INFO: renamed from: m */
        public lf4 f65025m;

        /* JADX INFO: renamed from: nmb$b$a */
        public static final class a<U> extends AtomicReference<lf4> implements pxb<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* JADX INFO: renamed from: a */
            public final pxb<? super U> f65026a;

            /* JADX INFO: renamed from: b */
            public final RunnableC9943b<?, ?> f65027b;

            public a(pxb<? super U> actual, RunnableC9943b<?, ?> parent) {
                this.f65026a = actual;
                this.f65027b = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m18007a() {
                zf4.dispose(this);
            }

            @Override // p000.pxb
            public void onComplete() {
                this.f65027b.m18006b();
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                this.f65027b.dispose();
                this.f65026a.onError(t);
            }

            @Override // p000.pxb
            public void onNext(U t) {
                this.f65026a.onNext(t);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public RunnableC9943b(pxb<? super U> actual, sy6<? super T, ? extends wub<? extends U>> mapper, int bufferSize, woe.AbstractC14729c worker) {
            this.f65019a = actual;
            this.f65020b = mapper;
            this.f65022d = bufferSize;
            this.f65021c = new a<>(actual, this);
            this.f65023e = worker;
        }

        /* JADX INFO: renamed from: a */
        public void m18005a() {
            if (getAndIncrement() != 0) {
                return;
            }
            this.f65023e.schedule(this);
        }

        /* JADX INFO: renamed from: b */
        public void m18006b() {
            this.f65015C = false;
            m18005a();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f65016F = true;
            this.f65021c.m18007a();
            this.f65025m.dispose();
            this.f65023e.dispose();
            if (getAndIncrement() == 0) {
                this.f65024f.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f65016F;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f65017H) {
                return;
            }
            this.f65017H = true;
            m18005a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f65017H) {
                ofe.onError(t);
                return;
            }
            this.f65017H = true;
            dispose();
            this.f65019a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f65017H) {
                return;
            }
            if (this.f65018L == 0) {
                this.f65024f.offer(t);
            }
            m18005a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f65025m, d)) {
                this.f65025m = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f65018L = iRequestFusion;
                        this.f65024f = tmdVar;
                        this.f65017H = true;
                        this.f65019a.onSubscribe(this);
                        m18005a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f65018L = iRequestFusion;
                        this.f65024f = tmdVar;
                        this.f65019a.onSubscribe(this);
                        return;
                    }
                }
                this.f65024f = new qzf(this.f65022d);
                this.f65019a.onSubscribe(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f65016F) {
                if (!this.f65015C) {
                    boolean z = this.f65017H;
                    try {
                        T tPoll = this.f65024f.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f65016F = true;
                            this.f65019a.onComplete();
                            this.f65023e.dispose();
                            return;
                        } else if (!z2) {
                            try {
                                wub<? extends U> wubVarApply = this.f65020b.apply(tPoll);
                                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                                wub<? extends U> wubVar = wubVarApply;
                                this.f65015C = true;
                                wubVar.subscribe(this.f65021c);
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                dispose();
                                this.f65024f.clear();
                                this.f65019a.onError(th);
                                this.f65023e.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        dispose();
                        this.f65024f.clear();
                        this.f65019a.onError(th2);
                        this.f65023e.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f65024f.clear();
        }
    }

    public nmb(wub<T> source, sy6<? super T, ? extends wub<? extends U>> mapper, int bufferSize, e55 delayErrors, woe scheduler) {
        super(source);
        this.f64996b = mapper;
        this.f64998d = delayErrors;
        this.f64997c = Math.max(8, bufferSize);
        this.f64999e = scheduler;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> observer) {
        if (this.f64998d == e55.IMMEDIATE) {
            this.f63101a.subscribe(new RunnableC9943b(new m1f(observer), this.f64996b, this.f64997c, this.f64999e.createWorker()));
        } else {
            this.f63101a.subscribe(new RunnableC9942a(observer, this.f64996b, this.f64997c, this.f64998d == e55.END, this.f64999e.createWorker()));
        }
    }
}
