package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class gmb<T, U> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends U>> f40200b;

    /* JADX INFO: renamed from: c */
    public final int f40201c;

    /* JADX INFO: renamed from: d */
    public final e55 f40202d;

    /* JADX INFO: renamed from: gmb$a */
    public static final class C6381a<T, R> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = -6951100001833242599L;

        /* JADX INFO: renamed from: C */
        public lf4 f40203C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f40204F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f40205H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f40206L;

        /* JADX INFO: renamed from: M */
        public int f40207M;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f40208a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f40209b;

        /* JADX INFO: renamed from: c */
        public final int f40210c;

        /* JADX INFO: renamed from: d */
        public final bc0 f40211d = new bc0();

        /* JADX INFO: renamed from: e */
        public final a<R> f40212e;

        /* JADX INFO: renamed from: f */
        public final boolean f40213f;

        /* JADX INFO: renamed from: m */
        public zif<T> f40214m;

        /* JADX INFO: renamed from: gmb$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements pxb<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* JADX INFO: renamed from: a */
            public final pxb<? super R> f40215a;

            /* JADX INFO: renamed from: b */
            public final C6381a<?, R> f40216b;

            public a(pxb<? super R> actual, C6381a<?, R> parent) {
                this.f40215a = actual;
                this.f40216b = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m11779a() {
                zf4.dispose(this);
            }

            @Override // p000.pxb
            public void onComplete() {
                C6381a<?, R> c6381a = this.f40216b;
                c6381a.f40204F = false;
                c6381a.m11778a();
            }

            @Override // p000.pxb
            public void onError(Throwable e) {
                C6381a<?, R> c6381a = this.f40216b;
                if (c6381a.f40211d.tryAddThrowableOrReport(e)) {
                    if (!c6381a.f40213f) {
                        c6381a.f40203C.dispose();
                    }
                    c6381a.f40204F = false;
                    c6381a.m11778a();
                }
            }

            @Override // p000.pxb
            public void onNext(R value) {
                this.f40215a.onNext(value);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public C6381a(pxb<? super R> actual, sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize, boolean tillTheEnd) {
            this.f40208a = actual;
            this.f40209b = mapper;
            this.f40210c = bufferSize;
            this.f40213f = tillTheEnd;
            this.f40212e = new a<>(actual, this);
        }

        /* JADX INFO: renamed from: a */
        public void m11778a() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super R> pxbVar = this.f40208a;
            zif<T> zifVar = this.f40214m;
            bc0 bc0Var = this.f40211d;
            while (true) {
                if (!this.f40204F) {
                    if (this.f40206L) {
                        zifVar.clear();
                        return;
                    }
                    if (!this.f40213f && bc0Var.get() != null) {
                        zifVar.clear();
                        this.f40206L = true;
                        bc0Var.tryTerminateConsumer(pxbVar);
                        return;
                    }
                    boolean z = this.f40205H;
                    try {
                        T tPoll = zifVar.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f40206L = true;
                            bc0Var.tryTerminateConsumer(pxbVar);
                            return;
                        }
                        if (!z2) {
                            try {
                                wub<? extends R> wubVarApply = this.f40209b.apply(tPoll);
                                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                                wub<? extends R> wubVar = wubVarApply;
                                if (wubVar instanceof nfg) {
                                    try {
                                        InterfaceC0000a interfaceC0000a = (Object) ((nfg) wubVar).get();
                                        if (interfaceC0000a != null && !this.f40206L) {
                                            pxbVar.onNext(interfaceC0000a);
                                        }
                                    } catch (Throwable th) {
                                        o75.throwIfFatal(th);
                                        bc0Var.tryAddThrowableOrReport(th);
                                    }
                                } else {
                                    this.f40204F = true;
                                    wubVar.subscribe(this.f40212e);
                                }
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                this.f40206L = true;
                                this.f40203C.dispose();
                                zifVar.clear();
                                bc0Var.tryAddThrowableOrReport(th2);
                                bc0Var.tryTerminateConsumer(pxbVar);
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        this.f40206L = true;
                        this.f40203C.dispose();
                        bc0Var.tryAddThrowableOrReport(th3);
                        bc0Var.tryTerminateConsumer(pxbVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // p000.lf4
        public void dispose() {
            this.f40206L = true;
            this.f40203C.dispose();
            this.f40212e.m11779a();
            this.f40211d.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f40206L;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f40205H = true;
            m11778a();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f40211d.tryAddThrowableOrReport(e)) {
                this.f40205H = true;
                m11778a();
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            if (this.f40207M == 0) {
                this.f40214m.offer(value);
            }
            m11778a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f40203C, d)) {
                this.f40203C = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f40207M = iRequestFusion;
                        this.f40214m = tmdVar;
                        this.f40205H = true;
                        this.f40208a.onSubscribe(this);
                        m11778a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f40207M = iRequestFusion;
                        this.f40214m = tmdVar;
                        this.f40208a.onSubscribe(this);
                        return;
                    }
                }
                this.f40214m = new qzf(this.f40210c);
                this.f40208a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: gmb$b */
    public static final class C6382b<T, U> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = 8828587559905699186L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f40217C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f40218F;

        /* JADX INFO: renamed from: H */
        public int f40219H;

        /* JADX INFO: renamed from: a */
        public final pxb<? super U> f40220a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends U>> f40221b;

        /* JADX INFO: renamed from: c */
        public final a<U> f40222c;

        /* JADX INFO: renamed from: d */
        public final int f40223d;

        /* JADX INFO: renamed from: e */
        public zif<T> f40224e;

        /* JADX INFO: renamed from: f */
        public lf4 f40225f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f40226m;

        /* JADX INFO: renamed from: gmb$b$a */
        public static final class a<U> extends AtomicReference<lf4> implements pxb<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* JADX INFO: renamed from: a */
            public final pxb<? super U> f40227a;

            /* JADX INFO: renamed from: b */
            public final C6382b<?, ?> f40228b;

            public a(pxb<? super U> actual, C6382b<?, ?> parent) {
                this.f40227a = actual;
                this.f40228b = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m11782a() {
                zf4.dispose(this);
            }

            @Override // p000.pxb
            public void onComplete() {
                this.f40228b.m11781b();
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                this.f40228b.dispose();
                this.f40227a.onError(t);
            }

            @Override // p000.pxb
            public void onNext(U t) {
                this.f40227a.onNext(t);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }
        }

        public C6382b(pxb<? super U> actual, sy6<? super T, ? extends wub<? extends U>> mapper, int bufferSize) {
            this.f40220a = actual;
            this.f40221b = mapper;
            this.f40223d = bufferSize;
            this.f40222c = new a<>(actual, this);
        }

        /* JADX INFO: renamed from: a */
        public void m11780a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f40217C) {
                if (!this.f40226m) {
                    boolean z = this.f40218F;
                    try {
                        T tPoll = this.f40224e.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f40217C = true;
                            this.f40220a.onComplete();
                            return;
                        }
                        if (!z2) {
                            try {
                                wub<? extends U> wubVarApply = this.f40221b.apply(tPoll);
                                Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                                wub<? extends U> wubVar = wubVarApply;
                                this.f40226m = true;
                                wubVar.subscribe(this.f40222c);
                            } catch (Throwable th) {
                                o75.throwIfFatal(th);
                                dispose();
                                this.f40224e.clear();
                                this.f40220a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        o75.throwIfFatal(th2);
                        dispose();
                        this.f40224e.clear();
                        this.f40220a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f40224e.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m11781b() {
            this.f40226m = false;
            m11780a();
        }

        @Override // p000.lf4
        public void dispose() {
            this.f40217C = true;
            this.f40222c.m11782a();
            this.f40225f.dispose();
            if (getAndIncrement() == 0) {
                this.f40224e.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f40217C;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f40218F) {
                return;
            }
            this.f40218F = true;
            m11780a();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f40218F) {
                ofe.onError(t);
                return;
            }
            this.f40218F = true;
            dispose();
            this.f40220a.onError(t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f40218F) {
                return;
            }
            if (this.f40219H == 0) {
                this.f40224e.offer(t);
            }
            m11780a();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f40225f, d)) {
                this.f40225f = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f40219H = iRequestFusion;
                        this.f40224e = tmdVar;
                        this.f40218F = true;
                        this.f40220a.onSubscribe(this);
                        m11780a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f40219H = iRequestFusion;
                        this.f40224e = tmdVar;
                        this.f40220a.onSubscribe(this);
                        return;
                    }
                }
                this.f40224e = new qzf(this.f40223d);
                this.f40220a.onSubscribe(this);
            }
        }
    }

    public gmb(wub<T> source, sy6<? super T, ? extends wub<? extends U>> mapper, int bufferSize, e55 delayErrors) {
        super(source);
        this.f40200b = mapper;
        this.f40202d = delayErrors;
        this.f40201c = Math.max(8, bufferSize);
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> observer) {
        if (vtb.tryScalarXMapSubscribe(this.f63101a, observer, this.f40200b)) {
            return;
        }
        if (this.f40202d == e55.IMMEDIATE) {
            this.f63101a.subscribe(new C6382b(new m1f(observer), this.f40200b, this.f40201c));
        } else {
            this.f63101a.subscribe(new C6381a(observer, this.f40200b, this.f40201c, this.f40202d == e55.END));
        }
    }
}
