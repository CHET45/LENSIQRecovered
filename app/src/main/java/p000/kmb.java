package p000;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class kmb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends R>> f54726b;

    /* JADX INFO: renamed from: c */
    public final e55 f54727c;

    /* JADX INFO: renamed from: d */
    public final int f54728d;

    /* JADX INFO: renamed from: e */
    public final int f54729e;

    /* JADX INFO: renamed from: kmb$a */
    public static final class C8455a<T, R> extends AtomicInteger implements pxb<T>, lf4, e38<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* JADX INFO: renamed from: C */
        public zif<T> f54730C;

        /* JADX INFO: renamed from: F */
        public lf4 f54731F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f54732H;

        /* JADX INFO: renamed from: L */
        public int f54733L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f54734M;

        /* JADX INFO: renamed from: N */
        public c38<R> f54735N;

        /* JADX INFO: renamed from: Q */
        public int f54736Q;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f54737a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f54738b;

        /* JADX INFO: renamed from: c */
        public final int f54739c;

        /* JADX INFO: renamed from: d */
        public final int f54740d;

        /* JADX INFO: renamed from: e */
        public final e55 f54741e;

        /* JADX INFO: renamed from: f */
        public final bc0 f54742f = new bc0();

        /* JADX INFO: renamed from: m */
        public final ArrayDeque<c38<R>> f54743m = new ArrayDeque<>();

        public C8455a(pxb<? super R> actual, sy6<? super T, ? extends wub<? extends R>> mapper, int maxConcurrency, int prefetch, e55 errorMode) {
            this.f54737a = actual;
            this.f54738b = mapper;
            this.f54739c = maxConcurrency;
            this.f54740d = prefetch;
            this.f54741e = errorMode;
        }

        /* JADX INFO: renamed from: a */
        public void m14824a() {
            c38<R> c38Var = this.f54735N;
            if (c38Var != null) {
                c38Var.dispose();
            }
            while (true) {
                c38<R> c38VarPoll = this.f54743m.poll();
                if (c38VarPoll == null) {
                    return;
                } else {
                    c38VarPoll.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14825b() {
            if (getAndIncrement() == 0) {
                do {
                    this.f54730C.clear();
                    m14824a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f54734M) {
                return;
            }
            this.f54734M = true;
            this.f54731F.dispose();
            this.f54742f.tryTerminateAndReport();
            m14825b();
        }

        @Override // p000.e38
        public void drain() {
            R rPoll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            zif<T> zifVar = this.f54730C;
            ArrayDeque<c38<R>> arrayDeque = this.f54743m;
            pxb<? super R> pxbVar = this.f54737a;
            e55 e55Var = this.f54741e;
            int iAddAndGet = 1;
            while (true) {
                int i = this.f54736Q;
                while (i != this.f54739c) {
                    if (this.f54734M) {
                        zifVar.clear();
                        m14824a();
                        return;
                    }
                    if (e55Var == e55.IMMEDIATE && this.f54742f.get() != null) {
                        zifVar.clear();
                        m14824a();
                        this.f54742f.tryTerminateConsumer(this.f54737a);
                        return;
                    }
                    try {
                        T tPoll = zifVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        wub<? extends R> wubVarApply = this.f54738b.apply(tPoll);
                        Objects.requireNonNull(wubVarApply, "The mapper returned a null ObservableSource");
                        wub<? extends R> wubVar = wubVarApply;
                        c38<R> c38Var = new c38<>(this, this.f54740d);
                        arrayDeque.offer(c38Var);
                        wubVar.subscribe(c38Var);
                        i++;
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f54731F.dispose();
                        zifVar.clear();
                        m14824a();
                        this.f54742f.tryAddThrowableOrReport(th);
                        this.f54742f.tryTerminateConsumer(this.f54737a);
                        return;
                    }
                }
                this.f54736Q = i;
                if (this.f54734M) {
                    zifVar.clear();
                    m14824a();
                    return;
                }
                if (e55Var == e55.IMMEDIATE && this.f54742f.get() != null) {
                    zifVar.clear();
                    m14824a();
                    this.f54742f.tryTerminateConsumer(this.f54737a);
                    return;
                }
                c38<R> c38Var2 = this.f54735N;
                if (c38Var2 == null) {
                    if (e55Var == e55.BOUNDARY && this.f54742f.get() != null) {
                        zifVar.clear();
                        m14824a();
                        this.f54742f.tryTerminateConsumer(pxbVar);
                        return;
                    }
                    boolean z2 = this.f54732H;
                    c38<R> c38VarPoll = arrayDeque.poll();
                    boolean z3 = c38VarPoll == null;
                    if (z2 && z3) {
                        if (this.f54742f.get() == null) {
                            pxbVar.onComplete();
                            return;
                        }
                        zifVar.clear();
                        m14824a();
                        this.f54742f.tryTerminateConsumer(pxbVar);
                        return;
                    }
                    if (!z3) {
                        this.f54735N = c38VarPoll;
                    }
                    c38Var2 = c38VarPoll;
                }
                if (c38Var2 != null) {
                    zif<R> zifVarQueue = c38Var2.queue();
                    while (!this.f54734M) {
                        boolean zIsDone = c38Var2.isDone();
                        if (e55Var == e55.IMMEDIATE && this.f54742f.get() != null) {
                            zifVar.clear();
                            m14824a();
                            this.f54742f.tryTerminateConsumer(pxbVar);
                            return;
                        }
                        try {
                            rPoll = zifVarQueue.poll();
                            z = rPoll == null;
                        } catch (Throwable th2) {
                            o75.throwIfFatal(th2);
                            this.f54742f.tryAddThrowableOrReport(th2);
                            this.f54735N = null;
                            this.f54736Q--;
                        }
                        if (zIsDone && z) {
                            this.f54735N = null;
                            this.f54736Q--;
                        } else if (!z) {
                            pxbVar.onNext(rPoll);
                        }
                    }
                    zifVar.clear();
                    m14824a();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.e38
        public void innerComplete(c38<R> inner) {
            inner.setDone();
            drain();
        }

        @Override // p000.e38
        public void innerError(c38<R> inner, Throwable e) {
            if (this.f54742f.tryAddThrowableOrReport(e)) {
                if (this.f54741e == e55.IMMEDIATE) {
                    this.f54731F.dispose();
                }
                inner.setDone();
                drain();
            }
        }

        @Override // p000.e38
        public void innerNext(c38<R> inner, R value) {
            inner.queue().offer(value);
            drain();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f54734M;
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f54732H = true;
            drain();
        }

        @Override // p000.pxb
        public void onError(Throwable e) {
            if (this.f54742f.tryAddThrowableOrReport(e)) {
                this.f54732H = true;
                drain();
            }
        }

        @Override // p000.pxb
        public void onNext(T value) {
            if (this.f54733L == 0) {
                this.f54730C.offer(value);
            }
            drain();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f54731F, d)) {
                this.f54731F = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f54733L = iRequestFusion;
                        this.f54730C = tmdVar;
                        this.f54732H = true;
                        this.f54737a.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f54733L = iRequestFusion;
                        this.f54730C = tmdVar;
                        this.f54737a.onSubscribe(this);
                        return;
                    }
                }
                this.f54730C = new qzf(this.f54740d);
                this.f54737a.onSubscribe(this);
            }
        }
    }

    public kmb(wub<T> source, sy6<? super T, ? extends wub<? extends R>> mapper, e55 errorMode, int maxConcurrency, int prefetch) {
        super(source);
        this.f54726b = mapper;
        this.f54727c = errorMode;
        this.f54728d = maxConcurrency;
        this.f54729e = prefetch;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        this.f63101a.subscribe(new C8455a(observer, this.f54726b, this.f54728d, this.f54729e, this.f54727c));
    }
}
