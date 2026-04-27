package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.de6;

/* JADX INFO: loaded from: classes7.dex */
public final class re6<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC7714j1<TLeft, R> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends TRight> f77990c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super TLeft, ? extends zjd<TLeftEnd>> f77991d;

    /* JADX INFO: renamed from: e */
    public final sy6<? super TRight, ? extends zjd<TRightEnd>> f77992e;

    /* JADX INFO: renamed from: f */
    public final i11<? super TLeft, ? super TRight, ? extends R> f77993f;

    /* JADX INFO: renamed from: re6$a */
    public static final class C12036a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements fdg, de6.InterfaceC4768b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super TLeft, ? extends zjd<TLeftEnd>> f77998C;

        /* JADX INFO: renamed from: F */
        public final sy6<? super TRight, ? extends zjd<TRightEnd>> f77999F;

        /* JADX INFO: renamed from: H */
        public final i11<? super TLeft, ? super TRight, ? extends R> f78000H;

        /* JADX INFO: renamed from: M */
        public int f78002M;

        /* JADX INFO: renamed from: N */
        public int f78003N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f78004Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f78005a;

        /* JADX INFO: renamed from: X */
        public static final Integer f77995X = 1;

        /* JADX INFO: renamed from: Y */
        public static final Integer f77996Y = 2;

        /* JADX INFO: renamed from: Z */
        public static final Integer f77997Z = 3;

        /* JADX INFO: renamed from: M1 */
        public static final Integer f77994M1 = 4;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f78006b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final mm2 f78008d = new mm2();

        /* JADX INFO: renamed from: c */
        public final qzf<Object> f78007c = new qzf<>(l86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TLeft> f78009e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TRight> f78010f = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<Throwable> f78011m = new AtomicReference<>();

        /* JADX INFO: renamed from: L */
        public final AtomicInteger f78001L = new AtomicInteger(2);

        public C12036a(ycg<? super R> actual, sy6<? super TLeft, ? extends zjd<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, i11<? super TLeft, ? super TRight, ? extends R> resultSelector) {
            this.f78005a = actual;
            this.f77998C = leftEnd;
            this.f77999F = rightEnd;
            this.f78000H = resultSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m21184a() {
            this.f78008d.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m21185b() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<Object> qzfVar = this.f78007c;
            ycg<? super R> ycgVar = this.f78005a;
            boolean z = true;
            int iAddAndGet = 1;
            while (!this.f78004Q) {
                if (this.f78011m.get() != null) {
                    qzfVar.clear();
                    m21184a();
                    m21186c(ycgVar);
                    return;
                }
                boolean z2 = this.f78001L.get() == 0 ? z : false;
                Integer num = (Integer) qzfVar.poll();
                boolean z3 = num == null ? z : false;
                if (z2 && z3) {
                    this.f78009e.clear();
                    this.f78010f.clear();
                    this.f78008d.dispose();
                    ycgVar.onComplete();
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = qzfVar.poll();
                    if (num == f77995X) {
                        int i = this.f78002M;
                        this.f78002M = i + 1;
                        this.f78009e.put(Integer.valueOf(i), (TLeft) objPoll);
                        try {
                            zjd zjdVarApply = this.f77998C.apply(objPoll);
                            Objects.requireNonNull(zjdVarApply, "The leftEnd returned a null Publisher");
                            zjd zjdVar = zjdVarApply;
                            de6.C4769c c4769c = new de6.C4769c(this, z, i);
                            this.f78008d.add(c4769c);
                            zjdVar.subscribe(c4769c);
                            if (this.f78011m.get() != null) {
                                qzfVar.clear();
                                m21184a();
                                m21186c(ycgVar);
                                return;
                            }
                            long j = this.f78006b.get();
                            Iterator<TRight> it = this.f78010f.values().iterator();
                            long j2 = 0;
                            while (it.hasNext()) {
                                try {
                                    R rApply = this.f78000H.apply(objPoll, it.next());
                                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                    if (j2 == j) {
                                        k75.addThrowable(this.f78011m, new bwa("Could not emit value due to lack of requests"));
                                        qzfVar.clear();
                                        m21184a();
                                        m21186c(ycgVar);
                                        return;
                                    }
                                    ycgVar.onNext(rApply);
                                    j2++;
                                } catch (Throwable th) {
                                    m21187d(th, ycgVar, qzfVar);
                                    return;
                                }
                            }
                            if (j2 != 0) {
                                ro0.produced(this.f78006b, j2);
                            }
                        } catch (Throwable th2) {
                            m21187d(th2, ycgVar, qzfVar);
                            return;
                        }
                    } else if (num == f77996Y) {
                        int i2 = this.f78003N;
                        this.f78003N = i2 + 1;
                        this.f78010f.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            zjd zjdVarApply2 = this.f77999F.apply(objPoll);
                            Objects.requireNonNull(zjdVarApply2, "The rightEnd returned a null Publisher");
                            zjd zjdVar2 = zjdVarApply2;
                            de6.C4769c c4769c2 = new de6.C4769c(this, false, i2);
                            this.f78008d.add(c4769c2);
                            zjdVar2.subscribe(c4769c2);
                            if (this.f78011m.get() != null) {
                                qzfVar.clear();
                                m21184a();
                                m21186c(ycgVar);
                                return;
                            }
                            long j3 = this.f78006b.get();
                            Iterator<TLeft> it2 = this.f78009e.values().iterator();
                            long j4 = 0;
                            while (it2.hasNext()) {
                                try {
                                    R rApply2 = this.f78000H.apply(it2.next(), objPoll);
                                    Objects.requireNonNull(rApply2, "The resultSelector returned a null value");
                                    if (j4 == j3) {
                                        k75.addThrowable(this.f78011m, new bwa("Could not emit value due to lack of requests"));
                                        qzfVar.clear();
                                        m21184a();
                                        m21186c(ycgVar);
                                        return;
                                    }
                                    ycgVar.onNext(rApply2);
                                    j4++;
                                } catch (Throwable th3) {
                                    m21187d(th3, ycgVar, qzfVar);
                                    return;
                                }
                            }
                            if (j4 != 0) {
                                ro0.produced(this.f78006b, j4);
                            }
                        } catch (Throwable th4) {
                            m21187d(th4, ycgVar, qzfVar);
                            return;
                        }
                    } else if (num == f77997Z) {
                        de6.C4769c c4769c3 = (de6.C4769c) objPoll;
                        this.f78009e.remove(Integer.valueOf(c4769c3.f29516c));
                        this.f78008d.remove(c4769c3);
                    } else {
                        de6.C4769c c4769c4 = (de6.C4769c) objPoll;
                        this.f78010f.remove(Integer.valueOf(c4769c4.f29516c));
                        this.f78008d.remove(c4769c4);
                    }
                    z = true;
                }
            }
            qzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m21186c(ycg<?> a) {
            Throwable thTerminate = k75.terminate(this.f78011m);
            this.f78009e.clear();
            this.f78010f.clear();
            a.onError(thTerminate);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f78004Q) {
                return;
            }
            this.f78004Q = true;
            m21184a();
            if (getAndIncrement() == 0) {
                this.f78007c.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m21187d(Throwable exc, ycg<?> a, zif<?> q) {
            o75.throwIfFatal(exc);
            k75.addThrowable(this.f78011m, exc);
            q.clear();
            m21184a();
            m21186c(a);
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerClose(boolean isLeft, de6.C4769c index) {
            synchronized (this) {
                try {
                    this.f78007c.offer(isLeft ? f77997Z : f77994M1, index);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m21185b();
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerCloseError(Throwable ex) {
            if (k75.addThrowable(this.f78011m, ex)) {
                m21185b();
            } else {
                ofe.onError(ex);
            }
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerComplete(de6.C4770d sender) {
            this.f78008d.delete(sender);
            this.f78001L.decrementAndGet();
            m21185b();
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerError(Throwable ex) {
            if (!k75.addThrowable(this.f78011m, ex)) {
                ofe.onError(ex);
            } else {
                this.f78001L.decrementAndGet();
                m21185b();
            }
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                try {
                    this.f78007c.offer(isLeft ? f77995X : f77996Y, o);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m21185b();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f78006b, n);
            }
        }
    }

    public re6(l86<TLeft> source, zjd<? extends TRight> other, sy6<? super TLeft, ? extends zjd<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, i11<? super TLeft, ? super TRight, ? extends R> resultSelector) {
        super(source);
        this.f77990c = other;
        this.f77991d = leftEnd;
        this.f77992e = rightEnd;
        this.f77993f = resultSelector;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.l86
    public void subscribeActual(ycg<? super R> ycgVar) {
        C12036a c12036a = new C12036a(ycgVar, this.f77991d, this.f77992e, this.f77993f);
        ycgVar.onSubscribe(c12036a);
        de6.C4770d c4770d = new de6.C4770d(c12036a, true);
        c12036a.f78008d.add(c4770d);
        de6.C4770d c4770d2 = new de6.C4770d(c12036a, false);
        c12036a.f78008d.add(c4770d2);
        this.f49321b.subscribe((kj6) c4770d);
        this.f77990c.subscribe(c4770d2);
    }
}
