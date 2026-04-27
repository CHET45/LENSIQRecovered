package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class je2 extends yd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<? extends qh2> f50363a;

    /* JADX INFO: renamed from: b */
    public final int f50364b;

    /* JADX INFO: renamed from: je2$a */
    public static final class C7877a extends AtomicInteger implements lj6<qh2>, mf4 {
        private static final long serialVersionUID = 9032184911934499404L;

        /* JADX INFO: renamed from: C */
        public ajf<qh2> f50365C;

        /* JADX INFO: renamed from: F */
        public fdg f50366F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f50367H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f50368L;

        /* JADX INFO: renamed from: a */
        public final dh2 f50369a;

        /* JADX INFO: renamed from: b */
        public final int f50370b;

        /* JADX INFO: renamed from: c */
        public final int f50371c;

        /* JADX INFO: renamed from: d */
        public final a f50372d = new a(this);

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f50373e = new AtomicBoolean();

        /* JADX INFO: renamed from: f */
        public int f50374f;

        /* JADX INFO: renamed from: m */
        public int f50375m;

        /* JADX INFO: renamed from: je2$a$a */
        public static final class a extends AtomicReference<mf4> implements dh2 {
            private static final long serialVersionUID = -5454794857847146511L;

            /* JADX INFO: renamed from: a */
            public final C7877a f50376a;

            public a(C7877a c7877a) {
                this.f50376a = c7877a;
            }

            @Override // p000.dh2
            public void onComplete() {
                this.f50376a.m14068b();
            }

            @Override // p000.dh2
            public void onError(Throwable th) {
                this.f50376a.m14069c(th);
            }

            @Override // p000.dh2
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }
        }

        public C7877a(dh2 dh2Var, int i) {
            this.f50369a = dh2Var;
            this.f50370b = i;
            this.f50371c = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m14067a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!isDisposed()) {
                if (!this.f50368L) {
                    boolean z = this.f50367H;
                    try {
                        qh2 qh2VarPoll = this.f50365C.poll();
                        boolean z2 = qh2VarPoll == null;
                        if (z && z2) {
                            if (this.f50373e.compareAndSet(false, true)) {
                                this.f50369a.onComplete();
                                return;
                            }
                            return;
                        } else if (!z2) {
                            this.f50368L = true;
                            qh2VarPoll.subscribe(this.f50372d);
                            m14070d();
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        m14069c(th);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14068b() {
            this.f50368L = false;
            m14067a();
        }

        /* JADX INFO: renamed from: c */
        public void m14069c(Throwable th) {
            if (!this.f50373e.compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                this.f50366F.cancel();
                this.f50369a.onError(th);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m14070d() {
            if (this.f50374f != 1) {
                int i = this.f50375m + 1;
                if (i != this.f50371c) {
                    this.f50375m = i;
                } else {
                    this.f50375m = 0;
                    this.f50366F.request(i);
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f50366F.cancel();
            ag4.dispose(this.f50372d);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f50372d.get());
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f50367H = true;
            m14067a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f50373e.compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f50372d);
                this.f50369a.onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f50366F, fdgVar)) {
                this.f50366F = fdgVar;
                int i = this.f50370b;
                long j = i == Integer.MAX_VALUE ? Long.MAX_VALUE : i;
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f50374f = iRequestFusion;
                        this.f50365C = codVar;
                        this.f50367H = true;
                        this.f50369a.onSubscribe(this);
                        m14067a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f50374f = iRequestFusion;
                        this.f50365C = codVar;
                        this.f50369a.onSubscribe(this);
                        fdgVar.request(j);
                        return;
                    }
                }
                if (this.f50370b == Integer.MAX_VALUE) {
                    this.f50365C = new rzf(m86.bufferSize());
                } else {
                    this.f50365C = new pzf(this.f50370b);
                }
                this.f50369a.onSubscribe(this);
                fdgVar.request(j);
            }
        }

        @Override // p000.ycg
        public void onNext(qh2 qh2Var) {
            if (this.f50374f != 0 || this.f50365C.offer(qh2Var)) {
                m14067a();
            } else {
                onError(new cwa());
            }
        }
    }

    public je2(zjd<? extends qh2> zjdVar, int i) {
        this.f50363a = zjdVar;
        this.f50364b = i;
    }

    @Override // p000.yd2
    public void subscribeActual(dh2 dh2Var) {
        this.f50363a.subscribe(new C7877a(dh2Var, this.f50364b));
    }
}
