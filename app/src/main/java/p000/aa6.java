package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class aa6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f814c;

    /* JADX INFO: renamed from: d */
    public final int f815d;

    /* JADX INFO: renamed from: e */
    public final int f816e;

    /* JADX INFO: renamed from: f */
    public final f55 f817f;

    /* JADX INFO: renamed from: aa6$a */
    public static final class C0119a<T, R> extends AtomicInteger implements lj6<T>, fdg, j38<R> {
        private static final long serialVersionUID = -4255299542215038287L;

        /* JADX INFO: renamed from: C */
        public final rzf<h38<R>> f818C;

        /* JADX INFO: renamed from: F */
        public fdg f819F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f820H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f821L;

        /* JADX INFO: renamed from: M */
        public volatile h38<R> f822M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f823a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends R>> f824b;

        /* JADX INFO: renamed from: c */
        public final int f825c;

        /* JADX INFO: renamed from: d */
        public final int f826d;

        /* JADX INFO: renamed from: e */
        public final f55 f827e;

        /* JADX INFO: renamed from: f */
        public final cc0 f828f = new cc0();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f829m = new AtomicLong();

        public C0119a(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, int i2, f55 f55Var) {
            this.f823a = ycgVar;
            this.f824b = py6Var;
            this.f825c = i;
            this.f826d = i2;
            this.f827e = f55Var;
            this.f818C = new rzf<>(Math.min(i2, i));
        }

        /* JADX INFO: renamed from: a */
        public void m258a() {
            h38<R> h38Var = this.f822M;
            this.f822M = null;
            if (h38Var != null) {
                h38Var.cancel();
            }
            while (true) {
                h38<R> h38VarPoll = this.f818C.poll();
                if (h38VarPoll == null) {
                    return;
                } else {
                    h38VarPoll.cancel();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m259b() {
            if (getAndIncrement() == 0) {
                do {
                    m258a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f820H) {
                return;
            }
            this.f820H = true;
            this.f819F.cancel();
            m259b();
        }

        @Override // p000.j38
        public void drain() {
            h38<R> h38VarPoll;
            int i;
            boolean z;
            long j;
            long j2;
            ajf<R> ajfVarQueue;
            if (getAndIncrement() != 0) {
                return;
            }
            h38<R> h38Var = this.f822M;
            ycg<? super R> ycgVar = this.f823a;
            f55 f55Var = this.f827e;
            int iAddAndGet = 1;
            while (true) {
                long j3 = this.f829m.get();
                if (h38Var != null) {
                    h38VarPoll = h38Var;
                } else {
                    if (f55Var != f55.END && this.f828f.get() != null) {
                        m258a();
                        ycgVar.onError(this.f828f.terminate());
                        return;
                    }
                    boolean z2 = this.f821L;
                    h38VarPoll = this.f818C.poll();
                    if (z2 && h38VarPoll == null) {
                        Throwable thTerminate = this.f828f.terminate();
                        if (thTerminate != null) {
                            ycgVar.onError(thTerminate);
                            return;
                        } else {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                    if (h38VarPoll != null) {
                        this.f822M = h38VarPoll;
                    }
                }
                if (h38VarPoll == null || (ajfVarQueue = h38VarPoll.queue()) == null) {
                    i = iAddAndGet;
                    z = false;
                    j = 0;
                    j2 = 0;
                } else {
                    j2 = 0;
                    while (true) {
                        i = iAddAndGet;
                        if (j2 == j3) {
                            break;
                        }
                        if (this.f820H) {
                            m258a();
                            return;
                        }
                        if (f55Var == f55.IMMEDIATE && this.f828f.get() != null) {
                            this.f822M = null;
                            h38VarPoll.cancel();
                            m258a();
                            ycgVar.onError(this.f828f.terminate());
                            return;
                        }
                        boolean zIsDone = h38VarPoll.isDone();
                        try {
                            R rPoll = ajfVarQueue.poll();
                            boolean z3 = rPoll == null;
                            if (zIsDone && z3) {
                                this.f822M = null;
                                this.f819F.request(1L);
                                h38VarPoll = null;
                                z = true;
                                break;
                            }
                            if (z3) {
                                break;
                            }
                            ycgVar.onNext(rPoll);
                            j2++;
                            h38VarPoll.requestOne();
                            iAddAndGet = i;
                        } catch (Throwable th) {
                            n75.throwIfFatal(th);
                            this.f822M = null;
                            h38VarPoll.cancel();
                            m258a();
                            ycgVar.onError(th);
                            return;
                        }
                    }
                    z = false;
                    if (j2 == j3) {
                        if (this.f820H) {
                            m258a();
                            return;
                        }
                        if (f55Var == f55.IMMEDIATE && this.f828f.get() != null) {
                            this.f822M = null;
                            h38VarPoll.cancel();
                            m258a();
                            ycgVar.onError(this.f828f.terminate());
                            return;
                        }
                        boolean zIsDone2 = h38VarPoll.isDone();
                        boolean zIsEmpty = ajfVarQueue.isEmpty();
                        if (zIsDone2 && zIsEmpty) {
                            this.f822M = null;
                            this.f819F.request(1L);
                            h38VarPoll = null;
                            z = true;
                        }
                    }
                    j = 0;
                }
                if (j2 != j && j3 != Long.MAX_VALUE) {
                    this.f829m.addAndGet(-j2);
                }
                if (z) {
                    h38Var = h38VarPoll;
                    iAddAndGet = i;
                } else {
                    iAddAndGet = addAndGet(-i);
                    if (iAddAndGet == 0) {
                        return;
                    } else {
                        h38Var = h38VarPoll;
                    }
                }
            }
        }

        @Override // p000.j38
        public void innerComplete(h38<R> h38Var) {
            h38Var.setDone();
            drain();
        }

        @Override // p000.j38
        public void innerError(h38<R> h38Var, Throwable th) {
            if (!this.f828f.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            h38Var.setDone();
            if (this.f827e != f55.END) {
                this.f819F.cancel();
            }
            drain();
        }

        @Override // p000.j38
        public void innerNext(h38<R> h38Var, R r) {
            if (h38Var.queue().offer(r)) {
                drain();
            } else {
                h38Var.cancel();
                innerError(h38Var, new cwa());
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f821L = true;
            drain();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f828f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f821L = true;
                drain();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f824b.apply(t), "The mapper returned a null Publisher");
                h38<R> h38Var = new h38<>(this, this.f826d);
                if (this.f820H) {
                    return;
                }
                this.f818C.offer(h38Var);
                zjdVar.subscribe(h38Var);
                if (this.f820H) {
                    h38Var.cancel();
                    m259b();
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f819F.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f819F, fdgVar)) {
                this.f819F = fdgVar;
                this.f823a.onSubscribe(this);
                int i = this.f825c;
                fdgVar.request(i == Integer.MAX_VALUE ? Long.MAX_VALUE : i);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f829m, j);
                drain();
            }
        }
    }

    public aa6(m86<T> m86Var, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, int i2, f55 f55Var) {
        super(m86Var);
        this.f814c = py6Var;
        this.f815d = i;
        this.f816e = i2;
        this.f817f = f55Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f52360b.subscribe((lj6) new C0119a(ycgVar, this.f814c, this.f815d, this.f816e, this.f817f));
    }
}
