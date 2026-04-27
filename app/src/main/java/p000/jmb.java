package p000;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public final class jmb<T, R> extends AbstractC10162o3<T, R> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends R>> f51239b;

    /* JADX INFO: renamed from: c */
    public final f55 f51240c;

    /* JADX INFO: renamed from: d */
    public final int f51241d;

    /* JADX INFO: renamed from: e */
    public final int f51242e;

    /* JADX INFO: renamed from: jmb$a */
    public static final class C7983a<T, R> extends AtomicInteger implements oxb<T>, mf4, f38<R> {
        private static final long serialVersionUID = 8080567949447303262L;

        /* JADX INFO: renamed from: C */
        public ajf<T> f51243C;

        /* JADX INFO: renamed from: F */
        public mf4 f51244F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f51245H;

        /* JADX INFO: renamed from: L */
        public int f51246L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f51247M;

        /* JADX INFO: renamed from: N */
        public d38<R> f51248N;

        /* JADX INFO: renamed from: Q */
        public int f51249Q;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f51250a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f51251b;

        /* JADX INFO: renamed from: c */
        public final int f51252c;

        /* JADX INFO: renamed from: d */
        public final int f51253d;

        /* JADX INFO: renamed from: e */
        public final f55 f51254e;

        /* JADX INFO: renamed from: f */
        public final cc0 f51255f = new cc0();

        /* JADX INFO: renamed from: m */
        public final ArrayDeque<d38<R>> f51256m = new ArrayDeque<>();

        public C7983a(oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var, int i, int i2, f55 f55Var) {
            this.f51250a = oxbVar;
            this.f51251b = py6Var;
            this.f51252c = i;
            this.f51253d = i2;
            this.f51254e = f55Var;
        }

        /* JADX INFO: renamed from: a */
        public void m14181a() {
            d38<R> d38Var = this.f51248N;
            if (d38Var != null) {
                d38Var.dispose();
            }
            while (true) {
                d38<R> d38VarPoll = this.f51256m.poll();
                if (d38VarPoll == null) {
                    return;
                } else {
                    d38VarPoll.dispose();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public void m14182b() {
            if (getAndIncrement() == 0) {
                do {
                    this.f51243C.clear();
                    m14181a();
                } while (decrementAndGet() != 0);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f51247M) {
                return;
            }
            this.f51247M = true;
            this.f51244F.dispose();
            m14182b();
        }

        @Override // p000.f38
        public void drain() {
            R rPoll;
            boolean z;
            if (getAndIncrement() != 0) {
                return;
            }
            ajf<T> ajfVar = this.f51243C;
            ArrayDeque<d38<R>> arrayDeque = this.f51256m;
            oxb<? super R> oxbVar = this.f51250a;
            f55 f55Var = this.f51254e;
            int iAddAndGet = 1;
            while (true) {
                int i = this.f51249Q;
                while (i != this.f51252c) {
                    if (this.f51247M) {
                        ajfVar.clear();
                        m14181a();
                        return;
                    }
                    if (f55Var == f55.IMMEDIATE && this.f51255f.get() != null) {
                        ajfVar.clear();
                        m14181a();
                        oxbVar.onError(this.f51255f.terminate());
                        return;
                    }
                    try {
                        T tPoll = ajfVar.poll();
                        if (tPoll == null) {
                            break;
                        }
                        xub xubVar = (xub) xjb.requireNonNull(this.f51251b.apply(tPoll), "The mapper returned a null ObservableSource");
                        d38<R> d38Var = new d38<>(this, this.f51253d);
                        arrayDeque.offer(d38Var);
                        xubVar.subscribe(d38Var);
                        i++;
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f51244F.dispose();
                        ajfVar.clear();
                        m14181a();
                        this.f51255f.addThrowable(th);
                        oxbVar.onError(this.f51255f.terminate());
                        return;
                    }
                }
                this.f51249Q = i;
                if (this.f51247M) {
                    ajfVar.clear();
                    m14181a();
                    return;
                }
                if (f55Var == f55.IMMEDIATE && this.f51255f.get() != null) {
                    ajfVar.clear();
                    m14181a();
                    oxbVar.onError(this.f51255f.terminate());
                    return;
                }
                d38<R> d38Var2 = this.f51248N;
                if (d38Var2 == null) {
                    if (f55Var == f55.BOUNDARY && this.f51255f.get() != null) {
                        ajfVar.clear();
                        m14181a();
                        oxbVar.onError(this.f51255f.terminate());
                        return;
                    }
                    boolean z2 = this.f51245H;
                    d38<R> d38VarPoll = arrayDeque.poll();
                    boolean z3 = d38VarPoll == null;
                    if (z2 && z3) {
                        if (this.f51255f.get() == null) {
                            oxbVar.onComplete();
                            return;
                        }
                        ajfVar.clear();
                        m14181a();
                        oxbVar.onError(this.f51255f.terminate());
                        return;
                    }
                    if (!z3) {
                        this.f51248N = d38VarPoll;
                    }
                    d38Var2 = d38VarPoll;
                }
                if (d38Var2 != null) {
                    ajf<R> ajfVarQueue = d38Var2.queue();
                    while (!this.f51247M) {
                        boolean zIsDone = d38Var2.isDone();
                        if (f55Var == f55.IMMEDIATE && this.f51255f.get() != null) {
                            ajfVar.clear();
                            m14181a();
                            oxbVar.onError(this.f51255f.terminate());
                            return;
                        }
                        try {
                            rPoll = ajfVarQueue.poll();
                            z = rPoll == null;
                        } catch (Throwable th2) {
                            n75.throwIfFatal(th2);
                            this.f51255f.addThrowable(th2);
                            this.f51248N = null;
                            this.f51249Q--;
                        }
                        if (zIsDone && z) {
                            this.f51248N = null;
                            this.f51249Q--;
                        } else if (!z) {
                            oxbVar.onNext(rPoll);
                        }
                    }
                    ajfVar.clear();
                    m14181a();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.f38
        public void innerComplete(d38<R> d38Var) {
            d38Var.setDone();
            drain();
        }

        @Override // p000.f38
        public void innerError(d38<R> d38Var, Throwable th) {
            if (!this.f51255f.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f51254e == f55.IMMEDIATE) {
                this.f51244F.dispose();
            }
            d38Var.setDone();
            drain();
        }

        @Override // p000.f38
        public void innerNext(d38<R> d38Var, R r) {
            d38Var.queue().offer(r);
            drain();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f51247M;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f51245H = true;
            drain();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f51255f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f51245H = true;
                drain();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f51246L == 0) {
                this.f51243C.offer(t);
            }
            drain();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f51244F, mf4Var)) {
                this.f51244F = mf4Var;
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f51246L = iRequestFusion;
                        this.f51243C = umdVar;
                        this.f51245H = true;
                        this.f51250a.onSubscribe(this);
                        drain();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f51246L = iRequestFusion;
                        this.f51243C = umdVar;
                        this.f51250a.onSubscribe(this);
                        return;
                    }
                }
                this.f51243C = new rzf(this.f51253d);
                this.f51250a.onSubscribe(this);
            }
        }
    }

    public jmb(xub<T> xubVar, py6<? super T, ? extends xub<? extends R>> py6Var, f55 f55Var, int i, int i2) {
        super(xubVar);
        this.f51239b = py6Var;
        this.f51240c = f55Var;
        this.f51241d = i;
        this.f51242e = i2;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        this.f66354a.subscribe(new C7983a(oxbVar, this.f51239b, this.f51241d, this.f51242e, this.f51240c));
    }
}
