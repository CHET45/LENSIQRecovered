package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.ce6;

/* JADX INFO: loaded from: classes7.dex */
public final class qe6<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC8162k1<TLeft, R> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends TRight> f74204c;

    /* JADX INFO: renamed from: d */
    public final py6<? super TLeft, ? extends zjd<TLeftEnd>> f74205d;

    /* JADX INFO: renamed from: e */
    public final py6<? super TRight, ? extends zjd<TRightEnd>> f74206e;

    /* JADX INFO: renamed from: f */
    public final j11<? super TLeft, ? super TRight, ? extends R> f74207f;

    /* JADX INFO: renamed from: qe6$a */
    public static final class C11455a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements fdg, ce6.InterfaceC2291b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final py6<? super TLeft, ? extends zjd<TLeftEnd>> f74212C;

        /* JADX INFO: renamed from: F */
        public final py6<? super TRight, ? extends zjd<TRightEnd>> f74213F;

        /* JADX INFO: renamed from: H */
        public final j11<? super TLeft, ? super TRight, ? extends R> f74214H;

        /* JADX INFO: renamed from: M */
        public int f74216M;

        /* JADX INFO: renamed from: N */
        public int f74217N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f74218Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f74219a;

        /* JADX INFO: renamed from: X */
        public static final Integer f74209X = 1;

        /* JADX INFO: renamed from: Y */
        public static final Integer f74210Y = 2;

        /* JADX INFO: renamed from: Z */
        public static final Integer f74211Z = 3;

        /* JADX INFO: renamed from: M1 */
        public static final Integer f74208M1 = 4;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f74220b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final nm2 f74222d = new nm2();

        /* JADX INFO: renamed from: c */
        public final rzf<Object> f74221c = new rzf<>(m86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TLeft> f74223e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TRight> f74224f = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<Throwable> f74225m = new AtomicReference<>();

        /* JADX INFO: renamed from: L */
        public final AtomicInteger f74215L = new AtomicInteger(2);

        public C11455a(ycg<? super R> ycgVar, py6<? super TLeft, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super TLeft, ? super TRight, ? extends R> j11Var) {
            this.f74219a = ycgVar;
            this.f74212C = py6Var;
            this.f74213F = py6Var2;
            this.f74214H = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m20287a() {
            this.f74222d.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m20288b() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<Object> rzfVar = this.f74221c;
            ycg<? super R> ycgVar = this.f74219a;
            boolean z = true;
            int iAddAndGet = 1;
            while (!this.f74218Q) {
                if (this.f74225m.get() != null) {
                    rzfVar.clear();
                    m20287a();
                    m20289c(ycgVar);
                    return;
                }
                boolean z2 = this.f74215L.get() == 0 ? z : false;
                Integer num = (Integer) rzfVar.poll();
                boolean z3 = num == null ? z : false;
                if (z2 && z3) {
                    this.f74223e.clear();
                    this.f74224f.clear();
                    this.f74222d.dispose();
                    ycgVar.onComplete();
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = rzfVar.poll();
                    if (num == f74209X) {
                        int i = this.f74216M;
                        this.f74216M = i + 1;
                        this.f74223e.put(Integer.valueOf(i), (TLeft) objPoll);
                        try {
                            zjd zjdVar = (zjd) xjb.requireNonNull(this.f74212C.apply(objPoll), "The leftEnd returned a null Publisher");
                            ce6.C2292c c2292c = new ce6.C2292c(this, z, i);
                            this.f74222d.add(c2292c);
                            zjdVar.subscribe(c2292c);
                            if (this.f74225m.get() != null) {
                                rzfVar.clear();
                                m20287a();
                                m20289c(ycgVar);
                                return;
                            }
                            long j = this.f74220b.get();
                            Iterator<TRight> it = this.f74224f.values().iterator();
                            long j2 = 0;
                            while (it.hasNext()) {
                                try {
                                    InterfaceC0000a interfaceC0000a = (Object) xjb.requireNonNull(this.f74214H.apply(objPoll, it.next()), "The resultSelector returned a null value");
                                    if (j2 == j) {
                                        j75.addThrowable(this.f74225m, new cwa("Could not emit value due to lack of requests"));
                                        rzfVar.clear();
                                        m20287a();
                                        m20289c(ycgVar);
                                        return;
                                    }
                                    ycgVar.onNext(interfaceC0000a);
                                    j2++;
                                } catch (Throwable th) {
                                    m20290d(th, ycgVar, rzfVar);
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                so0.produced(this.f74220b, j2);
                            }
                        } catch (Throwable th2) {
                            m20290d(th2, ycgVar, rzfVar);
                            return;
                        }
                    } else if (num == f74210Y) {
                        int i2 = this.f74217N;
                        this.f74217N = i2 + 1;
                        this.f74224f.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            zjd zjdVar2 = (zjd) xjb.requireNonNull(this.f74213F.apply(objPoll), "The rightEnd returned a null Publisher");
                            ce6.C2292c c2292c2 = new ce6.C2292c(this, false, i2);
                            this.f74222d.add(c2292c2);
                            zjdVar2.subscribe(c2292c2);
                            if (this.f74225m.get() != null) {
                                rzfVar.clear();
                                m20287a();
                                m20289c(ycgVar);
                                return;
                            }
                            long j3 = this.f74220b.get();
                            Iterator<TLeft> it2 = this.f74223e.values().iterator();
                            long j4 = 0;
                            while (it2.hasNext()) {
                                try {
                                    InterfaceC0000a interfaceC0000a2 = (Object) xjb.requireNonNull(this.f74214H.apply(it2.next(), objPoll), "The resultSelector returned a null value");
                                    if (j4 == j3) {
                                        j75.addThrowable(this.f74225m, new cwa("Could not emit value due to lack of requests"));
                                        rzfVar.clear();
                                        m20287a();
                                        m20289c(ycgVar);
                                        return;
                                    }
                                    ycgVar.onNext(interfaceC0000a2);
                                    j4++;
                                } catch (Throwable th3) {
                                    m20290d(th3, ycgVar, rzfVar);
                                    return;
                                }
                            }
                            if (j4 != 0) {
                                so0.produced(this.f74220b, j4);
                            }
                        } catch (Throwable th4) {
                            m20290d(th4, ycgVar, rzfVar);
                            return;
                        }
                    } else if (num == f74211Z) {
                        ce6.C2292c c2292c3 = (ce6.C2292c) objPoll;
                        this.f74223e.remove(Integer.valueOf(c2292c3.f16371c));
                        this.f74222d.remove(c2292c3);
                    } else if (num == f74208M1) {
                        ce6.C2292c c2292c4 = (ce6.C2292c) objPoll;
                        this.f74224f.remove(Integer.valueOf(c2292c4.f16371c));
                        this.f74222d.remove(c2292c4);
                    }
                    z = true;
                }
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m20289c(ycg<?> ycgVar) {
            Throwable thTerminate = j75.terminate(this.f74225m);
            this.f74223e.clear();
            this.f74224f.clear();
            ycgVar.onError(thTerminate);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f74218Q) {
                return;
            }
            this.f74218Q = true;
            m20287a();
            if (getAndIncrement() == 0) {
                this.f74221c.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m20290d(Throwable th, ycg<?> ycgVar, ajf<?> ajfVar) {
            n75.throwIfFatal(th);
            j75.addThrowable(this.f74225m, th);
            ajfVar.clear();
            m20287a();
            m20289c(ycgVar);
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerClose(boolean z, ce6.C2292c c2292c) {
            synchronized (this) {
                try {
                    this.f74221c.offer(z ? f74211Z : f74208M1, c2292c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m20288b();
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerCloseError(Throwable th) {
            if (j75.addThrowable(this.f74225m, th)) {
                m20288b();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerComplete(ce6.C2293d c2293d) {
            this.f74222d.delete(c2293d);
            this.f74215L.decrementAndGet();
            m20288b();
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerError(Throwable th) {
            if (!j75.addThrowable(this.f74225m, th)) {
                pfe.onError(th);
            } else {
                this.f74215L.decrementAndGet();
                m20288b();
            }
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerValue(boolean z, Object obj) {
            synchronized (this) {
                try {
                    this.f74221c.offer(z ? f74209X : f74210Y, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m20288b();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f74220b, j);
            }
        }
    }

    public qe6(m86<TLeft> m86Var, zjd<? extends TRight> zjdVar, py6<? super TLeft, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super TLeft, ? super TRight, ? extends R> j11Var) {
        super(m86Var);
        this.f74204c = zjdVar;
        this.f74205d = py6Var;
        this.f74206e = py6Var2;
        this.f74207f = j11Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        C11455a c11455a = new C11455a(ycgVar, this.f74205d, this.f74206e, this.f74207f);
        ycgVar.onSubscribe(c11455a);
        ce6.C2293d c2293d = new ce6.C2293d(c11455a, true);
        c11455a.f74222d.add(c2293d);
        ce6.C2293d c2293d2 = new ce6.C2293d(c11455a, false);
        c11455a.f74222d.add(c2293d2);
        this.f52360b.subscribe((lj6) c2293d);
        this.f74204c.subscribe(c2293d2);
    }
}
