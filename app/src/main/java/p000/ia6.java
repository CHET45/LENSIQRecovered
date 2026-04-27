package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import p000.woe;
import p000.x96;

/* JADX INFO: loaded from: classes7.dex */
public final class ia6<T, R> extends AbstractC7714j1<T, R> {

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f46190c;

    /* JADX INFO: renamed from: d */
    public final int f46191d;

    /* JADX INFO: renamed from: e */
    public final e55 f46192e;

    /* JADX INFO: renamed from: f */
    public final woe f46193f;

    /* JADX INFO: renamed from: ia6$a */
    public static /* synthetic */ class C7207a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f46194a;

        static {
            int[] iArr = new int[e55.values().length];
            f46194a = iArr;
            try {
                iArr[e55.BOUNDARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46194a[e55.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: ia6$b */
    public static abstract class AbstractRunnableC7208b<T, R> extends AtomicInteger implements kj6<T>, x96.InterfaceC15001f<R>, fdg, Runnable {
        private static final long serialVersionUID = -3511336836796789179L;

        /* JADX INFO: renamed from: C */
        public zif<T> f46195C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f46196F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f46197H;

        /* JADX INFO: renamed from: M */
        public volatile boolean f46199M;

        /* JADX INFO: renamed from: N */
        public int f46200N;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends zjd<? extends R>> f46202b;

        /* JADX INFO: renamed from: c */
        public final int f46203c;

        /* JADX INFO: renamed from: d */
        public final int f46204d;

        /* JADX INFO: renamed from: e */
        public final woe.AbstractC14729c f46205e;

        /* JADX INFO: renamed from: f */
        public fdg f46206f;

        /* JADX INFO: renamed from: m */
        public int f46207m;

        /* JADX INFO: renamed from: a */
        public final x96.C15000e<R> f46201a = new x96.C15000e<>(this);

        /* JADX INFO: renamed from: L */
        public final bc0 f46198L = new bc0();

        public AbstractRunnableC7208b(sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, woe.AbstractC14729c worker) {
            this.f46202b = mapper;
            this.f46203c = prefetch;
            this.f46204d = prefetch - (prefetch >> 2);
            this.f46205e = worker;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo12879a();

        /* JADX INFO: renamed from: b */
        public abstract void mo12880b();

        @Override // p000.x96.InterfaceC15001f
        public final void innerComplete() {
            this.f46199M = false;
            mo12879a();
        }

        @Override // p000.ycg
        public final void onComplete() {
            this.f46196F = true;
            mo12879a();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            if (this.f46200N == 2 || this.f46195C.offer(t)) {
                mo12879a();
            } else {
                this.f46206f.cancel();
                onError(new IllegalStateException("Queue full?!"));
            }
        }

        @Override // p000.kj6, p000.ycg
        public final void onSubscribe(fdg s) {
            if (ldg.validate(this.f46206f, s)) {
                this.f46206f = s;
                if (s instanceof bod) {
                    bod bodVar = (bod) s;
                    int iRequestFusion = bodVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f46200N = iRequestFusion;
                        this.f46195C = bodVar;
                        this.f46196F = true;
                        mo12880b();
                        mo12879a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f46200N = iRequestFusion;
                        this.f46195C = bodVar;
                        mo12880b();
                        s.request(this.f46203c);
                        return;
                    }
                }
                this.f46195C = new ozf(this.f46203c);
                mo12880b();
                s.request(this.f46203c);
            }
        }
    }

    /* JADX INFO: renamed from: ia6$c */
    public static final class C7209c<T, R> extends AbstractRunnableC7208b<T, R> {
        private static final long serialVersionUID = -2945777694260521066L;

        /* JADX INFO: renamed from: Q */
        public final ycg<? super R> f46208Q;

        /* JADX INFO: renamed from: X */
        public final boolean f46209X;

        public C7209c(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, boolean veryEnd, woe.AbstractC14729c worker) {
            super(mapper, prefetch, worker);
            this.f46208Q = actual;
            this.f46209X = veryEnd;
        }

        @Override // p000.ia6.AbstractRunnableC7208b
        /* JADX INFO: renamed from: a */
        public void mo12879a() {
            if (getAndIncrement() == 0) {
                this.f46205e.schedule(this);
            }
        }

        @Override // p000.ia6.AbstractRunnableC7208b
        /* JADX INFO: renamed from: b */
        public void mo12880b() {
            this.f46208Q.onSubscribe(this);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f46197H) {
                return;
            }
            this.f46197H = true;
            this.f46201a.cancel();
            this.f46206f.cancel();
            this.f46205e.dispose();
            this.f46198L.tryTerminateAndReport();
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerError(Throwable e) {
            if (this.f46198L.tryAddThrowableOrReport(e)) {
                if (!this.f46209X) {
                    this.f46206f.cancel();
                    this.f46196F = true;
                }
                this.f46199M = false;
                mo12879a();
            }
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerNext(R value) {
            this.f46208Q.onNext(value);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f46198L.tryAddThrowableOrReport(t)) {
                this.f46196F = true;
                mo12879a();
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f46201a.request(n);
        }

        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            while (!this.f46197H) {
                if (!this.f46199M) {
                    boolean z = this.f46196F;
                    if (z && !this.f46209X && this.f46198L.get() != null) {
                        this.f46198L.tryTerminateConsumer(this.f46208Q);
                        this.f46205e.dispose();
                        return;
                    }
                    try {
                        T tPoll = this.f46195C.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f46198L.tryTerminateConsumer(this.f46208Q);
                            this.f46205e.dispose();
                            return;
                        }
                        if (!z2) {
                            try {
                                zjd<? extends R> zjdVarApply = this.f46202b.apply(tPoll);
                                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                                zjd<? extends R> zjdVar = zjdVarApply;
                                if (this.f46200N != 1) {
                                    int i = this.f46207m + 1;
                                    if (i == this.f46204d) {
                                        this.f46207m = 0;
                                        this.f46206f.request(i);
                                    } else {
                                        this.f46207m = i;
                                    }
                                }
                                if (zjdVar instanceof nfg) {
                                    try {
                                        obj = ((nfg) zjdVar).get();
                                    } catch (Throwable th) {
                                        o75.throwIfFatal(th);
                                        this.f46198L.tryAddThrowableOrReport(th);
                                        if (!this.f46209X) {
                                            this.f46206f.cancel();
                                            this.f46198L.tryTerminateConsumer(this.f46208Q);
                                            this.f46205e.dispose();
                                            return;
                                        }
                                        obj = null;
                                    }
                                    if (obj != null && !this.f46197H) {
                                        if (this.f46201a.isUnbounded()) {
                                            this.f46208Q.onNext(obj);
                                        } else {
                                            this.f46199M = true;
                                            this.f46201a.setSubscription(new x96.C15002g(obj, this.f46201a));
                                        }
                                    }
                                } else {
                                    this.f46199M = true;
                                    zjdVar.subscribe(this.f46201a);
                                }
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                this.f46206f.cancel();
                                this.f46198L.tryAddThrowableOrReport(th2);
                                this.f46198L.tryTerminateConsumer(this.f46208Q);
                                this.f46205e.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        this.f46206f.cancel();
                        this.f46198L.tryAddThrowableOrReport(th3);
                        this.f46198L.tryTerminateConsumer(this.f46208Q);
                        this.f46205e.dispose();
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ia6$d */
    public static final class C7210d<T, R> extends AbstractRunnableC7208b<T, R> {
        private static final long serialVersionUID = 7898995095634264146L;

        /* JADX INFO: renamed from: Q */
        public final ycg<? super R> f46210Q;

        /* JADX INFO: renamed from: X */
        public final AtomicInteger f46211X;

        public C7210d(ycg<? super R> actual, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, woe.AbstractC14729c worker) {
            super(mapper, prefetch, worker);
            this.f46210Q = actual;
            this.f46211X = new AtomicInteger();
        }

        @Override // p000.ia6.AbstractRunnableC7208b
        /* JADX INFO: renamed from: a */
        public void mo12879a() {
            if (this.f46211X.getAndIncrement() == 0) {
                this.f46205e.schedule(this);
            }
        }

        @Override // p000.ia6.AbstractRunnableC7208b
        /* JADX INFO: renamed from: b */
        public void mo12880b() {
            this.f46210Q.onSubscribe(this);
        }

        /* JADX INFO: renamed from: c */
        public boolean m12881c() {
            return get() == 0 && compareAndSet(0, 1);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f46197H) {
                return;
            }
            this.f46197H = true;
            this.f46201a.cancel();
            this.f46206f.cancel();
            this.f46205e.dispose();
            this.f46198L.tryTerminateAndReport();
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerError(Throwable e) {
            if (this.f46198L.tryAddThrowableOrReport(e)) {
                this.f46206f.cancel();
                if (getAndIncrement() == 0) {
                    this.f46198L.tryTerminateConsumer(this.f46210Q);
                    this.f46205e.dispose();
                }
            }
        }

        @Override // p000.x96.InterfaceC15001f
        public void innerNext(R value) {
            if (m12881c()) {
                this.f46210Q.onNext(value);
                if (compareAndSet(1, 0)) {
                    return;
                }
                this.f46198L.tryTerminateConsumer(this.f46210Q);
                this.f46205e.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f46198L.tryAddThrowableOrReport(t)) {
                this.f46201a.cancel();
                if (getAndIncrement() == 0) {
                    this.f46198L.tryTerminateConsumer(this.f46210Q);
                    this.f46205e.dispose();
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f46201a.request(n);
        }

        @Override // java.lang.Runnable
        public void run() {
            while (!this.f46197H) {
                if (!this.f46199M) {
                    boolean z = this.f46196F;
                    try {
                        T tPoll = this.f46195C.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f46210Q.onComplete();
                            this.f46205e.dispose();
                            return;
                        }
                        if (!z2) {
                            try {
                                zjd<? extends R> zjdVarApply = this.f46202b.apply(tPoll);
                                Objects.requireNonNull(zjdVarApply, "The mapper returned a null Publisher");
                                zjd<? extends R> zjdVar = zjdVarApply;
                                if (this.f46200N != 1) {
                                    int i = this.f46207m + 1;
                                    if (i == this.f46204d) {
                                        this.f46207m = 0;
                                        this.f46206f.request(i);
                                    } else {
                                        this.f46207m = i;
                                    }
                                }
                                if (zjdVar instanceof nfg) {
                                    try {
                                        Object obj = ((nfg) zjdVar).get();
                                        if (obj != null && !this.f46197H) {
                                            if (!this.f46201a.isUnbounded()) {
                                                this.f46199M = true;
                                                this.f46201a.setSubscription(new x96.C15002g(obj, this.f46201a));
                                            } else if (m12881c()) {
                                                this.f46210Q.onNext(obj);
                                                if (!compareAndSet(1, 0)) {
                                                    this.f46198L.tryTerminateConsumer(this.f46210Q);
                                                    this.f46205e.dispose();
                                                    return;
                                                }
                                            } else {
                                                continue;
                                            }
                                        }
                                    } catch (Throwable th) {
                                        o75.throwIfFatal(th);
                                        this.f46206f.cancel();
                                        this.f46198L.tryAddThrowableOrReport(th);
                                        this.f46198L.tryTerminateConsumer(this.f46210Q);
                                        this.f46205e.dispose();
                                        return;
                                    }
                                } else {
                                    this.f46199M = true;
                                    zjdVar.subscribe(this.f46201a);
                                }
                            } catch (Throwable th2) {
                                o75.throwIfFatal(th2);
                                this.f46206f.cancel();
                                this.f46198L.tryAddThrowableOrReport(th2);
                                this.f46198L.tryTerminateConsumer(this.f46210Q);
                                this.f46205e.dispose();
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        o75.throwIfFatal(th3);
                        this.f46206f.cancel();
                        this.f46198L.tryAddThrowableOrReport(th3);
                        this.f46198L.tryTerminateConsumer(this.f46210Q);
                        this.f46205e.dispose();
                        return;
                    }
                }
                if (this.f46211X.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    public ia6(l86<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int prefetch, e55 errorMode, woe scheduler) {
        super(source);
        this.f46190c = mapper;
        this.f46191d = prefetch;
        this.f46192e = errorMode;
        this.f46193f = scheduler;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        int i = C7207a.f46194a[this.f46192e.ordinal()];
        if (i == 1) {
            this.f49321b.subscribe((kj6) new C7209c(s, this.f46190c, this.f46191d, false, this.f46193f.createWorker()));
        } else if (i != 2) {
            this.f49321b.subscribe((kj6) new C7210d(s, this.f46190c, this.f46191d, this.f46193f.createWorker()));
        } else {
            this.f49321b.subscribe((kj6) new C7209c(s, this.f46190c, this.f46191d, true, this.f46193f.createWorker()));
        }
    }
}
