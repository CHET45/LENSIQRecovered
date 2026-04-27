package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ce6<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC8162k1<TLeft, R> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends TRight> f16347c;

    /* JADX INFO: renamed from: d */
    public final py6<? super TLeft, ? extends zjd<TLeftEnd>> f16348d;

    /* JADX INFO: renamed from: e */
    public final py6<? super TRight, ? extends zjd<TRightEnd>> f16349e;

    /* JADX INFO: renamed from: f */
    public final j11<? super TLeft, ? super m86<TRight>, ? extends R> f16350f;

    /* JADX INFO: renamed from: ce6$a */
    public static final class C2290a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements fdg, InterfaceC2291b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final py6<? super TLeft, ? extends zjd<TLeftEnd>> f16355C;

        /* JADX INFO: renamed from: F */
        public final py6<? super TRight, ? extends zjd<TRightEnd>> f16356F;

        /* JADX INFO: renamed from: H */
        public final j11<? super TLeft, ? super m86<TRight>, ? extends R> f16357H;

        /* JADX INFO: renamed from: M */
        public int f16359M;

        /* JADX INFO: renamed from: N */
        public int f16360N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f16361Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f16362a;

        /* JADX INFO: renamed from: X */
        public static final Integer f16352X = 1;

        /* JADX INFO: renamed from: Y */
        public static final Integer f16353Y = 2;

        /* JADX INFO: renamed from: Z */
        public static final Integer f16354Z = 3;

        /* JADX INFO: renamed from: M1 */
        public static final Integer f16351M1 = 4;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f16363b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final nm2 f16365d = new nm2();

        /* JADX INFO: renamed from: c */
        public final rzf<Object> f16364c = new rzf<>(m86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final Map<Integer, msh<TRight>> f16366e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TRight> f16367f = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<Throwable> f16368m = new AtomicReference<>();

        /* JADX INFO: renamed from: L */
        public final AtomicInteger f16358L = new AtomicInteger(2);

        public C2290a(ycg<? super R> ycgVar, py6<? super TLeft, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super TLeft, ? super m86<TRight>, ? extends R> j11Var) {
            this.f16362a = ycgVar;
            this.f16355C = py6Var;
            this.f16356F = py6Var2;
            this.f16357H = j11Var;
        }

        /* JADX INFO: renamed from: a */
        public void m3915a() {
            this.f16365d.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m3916b() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<Object> rzfVar = this.f16364c;
            ycg<? super R> ycgVar = this.f16362a;
            int iAddAndGet = 1;
            while (!this.f16361Q) {
                if (this.f16368m.get() != null) {
                    rzfVar.clear();
                    m3915a();
                    m3917c(ycgVar);
                    return;
                }
                boolean z = this.f16358L.get() == 0;
                Integer num = (Integer) rzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<msh<TRight>> it = this.f16366e.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f16366e.clear();
                    this.f16367f.clear();
                    this.f16365d.dispose();
                    ycgVar.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = rzfVar.poll();
                    if (num == f16352X) {
                        msh mshVarCreate = msh.create();
                        int i = this.f16359M;
                        this.f16359M = i + 1;
                        this.f16366e.put(Integer.valueOf(i), (msh<TRight>) mshVarCreate);
                        try {
                            zjd zjdVar = (zjd) xjb.requireNonNull(this.f16355C.apply(objPoll), "The leftEnd returned a null Publisher");
                            C2292c c2292c = new C2292c(this, true, i);
                            this.f16365d.add(c2292c);
                            zjdVar.subscribe(c2292c);
                            if (this.f16368m.get() != null) {
                                rzfVar.clear();
                                m3915a();
                                m3917c(ycgVar);
                                return;
                            }
                            try {
                                InterfaceC0000a interfaceC0000a = (Object) xjb.requireNonNull(this.f16357H.apply(objPoll, mshVarCreate), "The resultSelector returned a null value");
                                if (this.f16363b.get() == 0) {
                                    m3918d(new cwa("Could not emit value due to lack of requests"), ycgVar, rzfVar);
                                    return;
                                }
                                ycgVar.onNext(interfaceC0000a);
                                so0.produced(this.f16363b, 1L);
                                Iterator<TRight> it2 = this.f16367f.values().iterator();
                                while (it2.hasNext()) {
                                    mshVarCreate.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                m3918d(th, ycgVar, rzfVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            m3918d(th2, ycgVar, rzfVar);
                            return;
                        }
                    } else if (num == f16353Y) {
                        int i2 = this.f16360N;
                        this.f16360N = i2 + 1;
                        this.f16367f.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            zjd zjdVar2 = (zjd) xjb.requireNonNull(this.f16356F.apply(objPoll), "The rightEnd returned a null Publisher");
                            C2292c c2292c2 = new C2292c(this, false, i2);
                            this.f16365d.add(c2292c2);
                            zjdVar2.subscribe(c2292c2);
                            if (this.f16368m.get() != null) {
                                rzfVar.clear();
                                m3915a();
                                m3917c(ycgVar);
                                return;
                            } else {
                                Iterator<msh<TRight>> it3 = this.f16366e.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            m3918d(th3, ycgVar, rzfVar);
                            return;
                        }
                    } else if (num == f16354Z) {
                        C2292c c2292c3 = (C2292c) objPoll;
                        msh<TRight> mshVarRemove = this.f16366e.remove(Integer.valueOf(c2292c3.f16371c));
                        this.f16365d.remove(c2292c3);
                        if (mshVarRemove != null) {
                            mshVarRemove.onComplete();
                        }
                    } else if (num == f16351M1) {
                        C2292c c2292c4 = (C2292c) objPoll;
                        this.f16367f.remove(Integer.valueOf(c2292c4.f16371c));
                        this.f16365d.remove(c2292c4);
                    }
                }
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m3917c(ycg<?> ycgVar) {
            Throwable thTerminate = j75.terminate(this.f16368m);
            Iterator<msh<TRight>> it = this.f16366e.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.f16366e.clear();
            this.f16367f.clear();
            ycgVar.onError(thTerminate);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f16361Q) {
                return;
            }
            this.f16361Q = true;
            m3915a();
            if (getAndIncrement() == 0) {
                this.f16364c.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3918d(Throwable th, ycg<?> ycgVar, ajf<?> ajfVar) {
            n75.throwIfFatal(th);
            j75.addThrowable(this.f16368m, th);
            ajfVar.clear();
            m3915a();
            m3917c(ycgVar);
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerClose(boolean z, C2292c c2292c) {
            synchronized (this) {
                try {
                    this.f16364c.offer(z ? f16354Z : f16351M1, c2292c);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m3916b();
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerCloseError(Throwable th) {
            if (j75.addThrowable(this.f16368m, th)) {
                m3916b();
            } else {
                pfe.onError(th);
            }
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerComplete(C2293d c2293d) {
            this.f16365d.delete(c2293d);
            this.f16358L.decrementAndGet();
            m3916b();
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerError(Throwable th) {
            if (!j75.addThrowable(this.f16368m, th)) {
                pfe.onError(th);
            } else {
                this.f16358L.decrementAndGet();
                m3916b();
            }
        }

        @Override // p000.ce6.InterfaceC2291b
        public void innerValue(boolean z, Object obj) {
            synchronized (this) {
                try {
                    this.f16364c.offer(z ? f16352X : f16353Y, obj);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m3916b();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f16363b, j);
            }
        }
    }

    /* JADX INFO: renamed from: ce6$b */
    public interface InterfaceC2291b {
        void innerClose(boolean z, C2292c c2292c);

        void innerCloseError(Throwable th);

        void innerComplete(C2293d c2293d);

        void innerError(Throwable th);

        void innerValue(boolean z, Object obj);
    }

    /* JADX INFO: renamed from: ce6$c */
    public static final class C2292c extends AtomicReference<fdg> implements lj6<Object>, mf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC2291b f16369a;

        /* JADX INFO: renamed from: b */
        public final boolean f16370b;

        /* JADX INFO: renamed from: c */
        public final int f16371c;

        public C2292c(InterfaceC2291b interfaceC2291b, boolean z, int i) {
            this.f16369a = interfaceC2291b;
            this.f16370b = z;
            this.f16371c = i;
        }

        @Override // p000.mf4
        public void dispose() {
            mdg.cancel(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16369a.innerClose(this.f16370b, this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f16369a.innerCloseError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            if (mdg.cancel(this)) {
                this.f16369a.innerClose(this.f16370b, this);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: ce6$d */
    public static final class C2293d extends AtomicReference<fdg> implements lj6<Object>, mf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC2291b f16372a;

        /* JADX INFO: renamed from: b */
        public final boolean f16373b;

        public C2293d(InterfaceC2291b interfaceC2291b, boolean z) {
            this.f16372a = interfaceC2291b;
            this.f16373b = z;
        }

        @Override // p000.mf4
        public void dispose() {
            mdg.cancel(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == mdg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f16372a.innerComplete(this);
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f16372a.innerError(th);
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            this.f16372a.innerValue(this.f16373b, obj);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public ce6(m86<TLeft> m86Var, zjd<? extends TRight> zjdVar, py6<? super TLeft, ? extends zjd<TLeftEnd>> py6Var, py6<? super TRight, ? extends zjd<TRightEnd>> py6Var2, j11<? super TLeft, ? super m86<TRight>, ? extends R> j11Var) {
        super(m86Var);
        this.f16347c = zjdVar;
        this.f16348d = py6Var;
        this.f16349e = py6Var2;
        this.f16350f = j11Var;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        C2290a c2290a = new C2290a(ycgVar, this.f16348d, this.f16349e, this.f16350f);
        ycgVar.onSubscribe(c2290a);
        C2293d c2293d = new C2293d(c2290a, true);
        c2290a.f16365d.add(c2293d);
        C2293d c2293d2 = new C2293d(c2290a, false);
        c2290a.f16365d.add(c2293d2);
        this.f52360b.subscribe((lj6) c2293d);
        this.f16347c.subscribe(c2293d2);
    }
}
