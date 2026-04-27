package p000;

import io.reactivex.Observable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.eqb;

/* JADX INFO: loaded from: classes7.dex */
public final class sqb<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC10162o3<TLeft, R> {

    /* JADX INFO: renamed from: b */
    public final xub<? extends TRight> f82605b;

    /* JADX INFO: renamed from: c */
    public final py6<? super TLeft, ? extends xub<TLeftEnd>> f82606c;

    /* JADX INFO: renamed from: d */
    public final py6<? super TRight, ? extends xub<TRightEnd>> f82607d;

    /* JADX INFO: renamed from: e */
    public final j11<? super TLeft, ? super TRight, ? extends R> f82608e;

    /* JADX INFO: renamed from: sqb$a */
    public static final class C12747a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements mf4, eqb.InterfaceC5441b {

        /* JADX INFO: renamed from: Q */
        public static final Integer f82609Q = 1;

        /* JADX INFO: renamed from: X */
        public static final Integer f82610X = 2;

        /* JADX INFO: renamed from: Y */
        public static final Integer f82611Y = 3;

        /* JADX INFO: renamed from: Z */
        public static final Integer f82612Z = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final py6<? super TRight, ? extends xub<TRightEnd>> f82613C;

        /* JADX INFO: renamed from: F */
        public final j11<? super TLeft, ? super TRight, ? extends R> f82614F;

        /* JADX INFO: renamed from: L */
        public int f82616L;

        /* JADX INFO: renamed from: M */
        public int f82617M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f82618N;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f82619a;

        /* JADX INFO: renamed from: m */
        public final py6<? super TLeft, ? extends xub<TLeftEnd>> f82625m;

        /* JADX INFO: renamed from: c */
        public final nm2 f82621c = new nm2();

        /* JADX INFO: renamed from: b */
        public final rzf<Object> f82620b = new rzf<>(Observable.bufferSize());

        /* JADX INFO: renamed from: d */
        public final Map<Integer, TLeft> f82622d = new LinkedHashMap();

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TRight> f82623e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Throwable> f82624f = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicInteger f82615H = new AtomicInteger(2);

        public C12747a(oxb<? super R> oxbVar, py6<? super TLeft, ? extends xub<TLeftEnd>> py6Var, py6<? super TRight, ? extends xub<TRightEnd>> py6Var2, j11<? super TLeft, ? super TRight, ? extends R> j11Var) {
            this.f82619a = oxbVar;
            this.f82625m = py6Var;
            this.f82613C = py6Var2;
            this.f82614F = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m22186a() {
            this.f82621c.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m22187b() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<?> rzfVar = this.f82620b;
            oxb<? super R> oxbVar = this.f82619a;
            int iAddAndGet = 1;
            while (!this.f82618N) {
                if (this.f82624f.get() != null) {
                    rzfVar.clear();
                    m22186a();
                    m22188c(oxbVar);
                    return;
                }
                boolean z = this.f82615H.get() == 0;
                Integer num = (Integer) rzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.f82622d.clear();
                    this.f82623e.clear();
                    this.f82621c.dispose();
                    oxbVar.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = rzfVar.poll();
                    if (num == f82609Q) {
                        int i = this.f82616L;
                        this.f82616L = i + 1;
                        this.f82622d.put(Integer.valueOf(i), (TLeft) objPoll);
                        try {
                            xub xubVar = (xub) xjb.requireNonNull(this.f82625m.apply(objPoll), "The leftEnd returned a null ObservableSource");
                            eqb.C5442c c5442c = new eqb.C5442c(this, true, i);
                            this.f82621c.add(c5442c);
                            xubVar.subscribe(c5442c);
                            if (this.f82624f.get() != null) {
                                rzfVar.clear();
                                m22186a();
                                m22188c(oxbVar);
                                return;
                            } else {
                                Iterator<TRight> it = this.f82623e.values().iterator();
                                while (it.hasNext()) {
                                    try {
                                        oxbVar.onNext((Object) xjb.requireNonNull(this.f82614F.apply(objPoll, it.next()), "The resultSelector returned a null value"));
                                    } catch (Throwable th) {
                                        m22189d(th, oxbVar, rzfVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
                            m22189d(th2, oxbVar, rzfVar);
                            return;
                        }
                    } else if (num == f82610X) {
                        int i2 = this.f82617M;
                        this.f82617M = i2 + 1;
                        this.f82623e.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            xub xubVar2 = (xub) xjb.requireNonNull(this.f82613C.apply(objPoll), "The rightEnd returned a null ObservableSource");
                            eqb.C5442c c5442c2 = new eqb.C5442c(this, false, i2);
                            this.f82621c.add(c5442c2);
                            xubVar2.subscribe(c5442c2);
                            if (this.f82624f.get() != null) {
                                rzfVar.clear();
                                m22186a();
                                m22188c(oxbVar);
                                return;
                            } else {
                                Iterator<TLeft> it2 = this.f82622d.values().iterator();
                                while (it2.hasNext()) {
                                    try {
                                        oxbVar.onNext((Object) xjb.requireNonNull(this.f82614F.apply(it2.next(), objPoll), "The resultSelector returned a null value"));
                                    } catch (Throwable th3) {
                                        m22189d(th3, oxbVar, rzfVar);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            m22189d(th4, oxbVar, rzfVar);
                            return;
                        }
                    } else if (num == f82611Y) {
                        eqb.C5442c c5442c3 = (eqb.C5442c) objPoll;
                        this.f82622d.remove(Integer.valueOf(c5442c3.f33865c));
                        this.f82621c.remove(c5442c3);
                    } else {
                        eqb.C5442c c5442c4 = (eqb.C5442c) objPoll;
                        this.f82623e.remove(Integer.valueOf(c5442c4.f33865c));
                        this.f82621c.remove(c5442c4);
                    }
                }
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m22188c(oxb<?> oxbVar) {
            Throwable thTerminate = j75.terminate(this.f82624f);
            this.f82622d.clear();
            this.f82623e.clear();
            oxbVar.onError(thTerminate);
        }

        /* JADX INFO: renamed from: d */
        public void m22189d(Throwable th, oxb<?> oxbVar, rzf<?> rzfVar) {
            n75.throwIfFatal(th);
            j75.addThrowable(this.f82624f, th);
            rzfVar.clear();
            m22186a();
            m22188c(oxbVar);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f82618N) {
                return;
            }
            this.f82618N = true;
            m22186a();
            if (getAndIncrement() == 0) {
                this.f82620b.clear();
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerClose(boolean z, eqb.C5442c c5442c) {
            synchronized (this) {
                try {
                    this.f82620b.offer(z ? f82611Y : f82612Z, c5442c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m22187b();
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerCloseError(Throwable th) {
            if (j75.addThrowable(this.f82624f, th)) {
                m22187b();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerComplete(eqb.C5443d c5443d) {
            this.f82621c.delete(c5443d);
            this.f82615H.decrementAndGet();
            m22187b();
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerError(Throwable th) {
            if (!j75.addThrowable(this.f82624f, th)) {
                pfe.onError(th);
            } else {
                this.f82615H.decrementAndGet();
                m22187b();
            }
        }

        @Override // p000.eqb.InterfaceC5441b
        public void innerValue(boolean z, Object obj) {
            synchronized (this) {
                try {
                    this.f82620b.offer(z ? f82609Q : f82610X, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m22187b();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f82618N;
        }
    }

    public sqb(xub<TLeft> xubVar, xub<? extends TRight> xubVar2, py6<? super TLeft, ? extends xub<TLeftEnd>> py6Var, py6<? super TRight, ? extends xub<TRightEnd>> py6Var2, j11<? super TLeft, ? super TRight, ? extends R> j11Var) {
        super(xubVar);
        this.f82605b = xubVar2;
        this.f82606c = py6Var;
        this.f82607d = py6Var2;
        this.f82608e = j11Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        C12747a c12747a = new C12747a(oxbVar, this.f82606c, this.f82607d, this.f82608e);
        oxbVar.onSubscribe(c12747a);
        eqb.C5443d c5443d = new eqb.C5443d(c12747a, true);
        c12747a.f82621c.add(c5443d);
        eqb.C5443d c5443d2 = new eqb.C5443d(c12747a, false);
        c12747a.f82621c.add(c5443d2);
        this.f66354a.subscribe(c5443d);
        this.f82605b.subscribe(c5443d2);
    }
}
