package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class de6<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC7714j1<TLeft, R> {

    /* JADX INFO: renamed from: c */
    public final zjd<? extends TRight> f29492c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super TLeft, ? extends zjd<TLeftEnd>> f29493d;

    /* JADX INFO: renamed from: e */
    public final sy6<? super TRight, ? extends zjd<TRightEnd>> f29494e;

    /* JADX INFO: renamed from: f */
    public final i11<? super TLeft, ? super l86<TRight>, ? extends R> f29495f;

    /* JADX INFO: renamed from: de6$a */
    public static final class C4767a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements fdg, InterfaceC4768b {
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super TLeft, ? extends zjd<TLeftEnd>> f29500C;

        /* JADX INFO: renamed from: F */
        public final sy6<? super TRight, ? extends zjd<TRightEnd>> f29501F;

        /* JADX INFO: renamed from: H */
        public final i11<? super TLeft, ? super l86<TRight>, ? extends R> f29502H;

        /* JADX INFO: renamed from: M */
        public int f29504M;

        /* JADX INFO: renamed from: N */
        public int f29505N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f29506Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f29507a;

        /* JADX INFO: renamed from: X */
        public static final Integer f29497X = 1;

        /* JADX INFO: renamed from: Y */
        public static final Integer f29498Y = 2;

        /* JADX INFO: renamed from: Z */
        public static final Integer f29499Z = 3;

        /* JADX INFO: renamed from: M1 */
        public static final Integer f29496M1 = 4;

        /* JADX INFO: renamed from: b */
        public final AtomicLong f29508b = new AtomicLong();

        /* JADX INFO: renamed from: d */
        public final mm2 f29510d = new mm2();

        /* JADX INFO: renamed from: c */
        public final qzf<Object> f29509c = new qzf<>(l86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final Map<Integer, nsh<TRight>> f29511e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final Map<Integer, TRight> f29512f = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<Throwable> f29513m = new AtomicReference<>();

        /* JADX INFO: renamed from: L */
        public final AtomicInteger f29503L = new AtomicInteger(2);

        public C4767a(ycg<? super R> actual, sy6<? super TLeft, ? extends zjd<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, i11<? super TLeft, ? super l86<TRight>, ? extends R> resultSelector) {
            this.f29507a = actual;
            this.f29500C = leftEnd;
            this.f29501F = rightEnd;
            this.f29502H = resultSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m9105a() {
            this.f29510d.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m9106b() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<Object> qzfVar = this.f29509c;
            ycg<? super R> ycgVar = this.f29507a;
            int iAddAndGet = 1;
            while (!this.f29506Q) {
                if (this.f29513m.get() != null) {
                    qzfVar.clear();
                    m9105a();
                    m9107c(ycgVar);
                    return;
                }
                boolean z = this.f29503L.get() == 0;
                Integer num = (Integer) qzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<nsh<TRight>> it = this.f29511e.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f29511e.clear();
                    this.f29512f.clear();
                    this.f29510d.dispose();
                    ycgVar.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = qzfVar.poll();
                    if (num == f29497X) {
                        nsh nshVarCreate = nsh.create();
                        int i = this.f29504M;
                        this.f29504M = i + 1;
                        this.f29511e.put(Integer.valueOf(i), (nsh<TRight>) nshVarCreate);
                        try {
                            zjd zjdVarApply = this.f29500C.apply(objPoll);
                            Objects.requireNonNull(zjdVarApply, "The leftEnd returned a null Publisher");
                            zjd zjdVar = zjdVarApply;
                            C4769c c4769c = new C4769c(this, true, i);
                            this.f29510d.add(c4769c);
                            zjdVar.subscribe(c4769c);
                            if (this.f29513m.get() != null) {
                                qzfVar.clear();
                                m9105a();
                                m9107c(ycgVar);
                                return;
                            }
                            try {
                                R rApply = this.f29502H.apply(objPoll, nshVarCreate);
                                Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                if (this.f29508b.get() == 0) {
                                    m9108d(new bwa("Could not emit value due to lack of requests"), ycgVar, qzfVar);
                                    return;
                                }
                                ycgVar.onNext(rApply);
                                ro0.produced(this.f29508b, 1L);
                                Iterator<TRight> it2 = this.f29512f.values().iterator();
                                while (it2.hasNext()) {
                                    nshVarCreate.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                m9108d(th, ycgVar, qzfVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            m9108d(th2, ycgVar, qzfVar);
                            return;
                        }
                    } else if (num == f29498Y) {
                        int i2 = this.f29505N;
                        this.f29505N = i2 + 1;
                        this.f29512f.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            zjd zjdVarApply2 = this.f29501F.apply(objPoll);
                            Objects.requireNonNull(zjdVarApply2, "The rightEnd returned a null Publisher");
                            zjd zjdVar2 = zjdVarApply2;
                            C4769c c4769c2 = new C4769c(this, false, i2);
                            this.f29510d.add(c4769c2);
                            zjdVar2.subscribe(c4769c2);
                            if (this.f29513m.get() != null) {
                                qzfVar.clear();
                                m9105a();
                                m9107c(ycgVar);
                                return;
                            } else {
                                Iterator<nsh<TRight>> it3 = this.f29511e.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            m9108d(th3, ycgVar, qzfVar);
                            return;
                        }
                    } else if (num == f29499Z) {
                        C4769c c4769c3 = (C4769c) objPoll;
                        nsh<TRight> nshVarRemove = this.f29511e.remove(Integer.valueOf(c4769c3.f29516c));
                        this.f29510d.remove(c4769c3);
                        if (nshVarRemove != null) {
                            nshVarRemove.onComplete();
                        }
                    } else {
                        C4769c c4769c4 = (C4769c) objPoll;
                        this.f29512f.remove(Integer.valueOf(c4769c4.f29516c));
                        this.f29510d.remove(c4769c4);
                    }
                }
            }
            qzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m9107c(ycg<?> a) {
            Throwable thTerminate = k75.terminate(this.f29513m);
            Iterator<nsh<TRight>> it = this.f29511e.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.f29511e.clear();
            this.f29512f.clear();
            a.onError(thTerminate);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f29506Q) {
                return;
            }
            this.f29506Q = true;
            m9105a();
            if (getAndIncrement() == 0) {
                this.f29509c.clear();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9108d(Throwable exc, ycg<?> a, zif<?> q) {
            o75.throwIfFatal(exc);
            k75.addThrowable(this.f29513m, exc);
            q.clear();
            m9105a();
            m9107c(a);
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerClose(boolean isLeft, C4769c index) {
            synchronized (this) {
                try {
                    this.f29509c.offer(isLeft ? f29499Z : f29496M1, index);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m9106b();
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerCloseError(Throwable ex) {
            if (k75.addThrowable(this.f29513m, ex)) {
                m9106b();
            } else {
                ofe.onError(ex);
            }
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerComplete(C4770d sender) {
            this.f29510d.delete(sender);
            this.f29503L.decrementAndGet();
            m9106b();
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerError(Throwable ex) {
            if (!k75.addThrowable(this.f29513m, ex)) {
                ofe.onError(ex);
            } else {
                this.f29503L.decrementAndGet();
                m9106b();
            }
        }

        @Override // p000.de6.InterfaceC4768b
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                try {
                    this.f29509c.offer(isLeft ? f29497X : f29498Y, o);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m9106b();
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f29508b, n);
            }
        }
    }

    /* JADX INFO: renamed from: de6$b */
    public interface InterfaceC4768b {
        void innerClose(boolean isLeft, C4769c index);

        void innerCloseError(Throwable ex);

        void innerComplete(C4770d sender);

        void innerError(Throwable ex);

        void innerValue(boolean isLeft, Object o);
    }

    /* JADX INFO: renamed from: de6$c */
    public static final class C4769c extends AtomicReference<fdg> implements kj6<Object>, lf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC4768b f29514a;

        /* JADX INFO: renamed from: b */
        public final boolean f29515b;

        /* JADX INFO: renamed from: c */
        public final int f29516c;

        public C4769c(InterfaceC4768b parent, boolean isLeft, int index) {
            this.f29514a = parent;
            this.f29515b = isLeft;
            this.f29516c = index;
        }

        @Override // p000.lf4
        public void dispose() {
            ldg.cancel(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29514a.innerClose(this.f29515b, this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f29514a.innerCloseError(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            if (ldg.cancel(this)) {
                this.f29514a.innerClose(this.f29515b, this);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    /* JADX INFO: renamed from: de6$d */
    public static final class C4770d extends AtomicReference<fdg> implements kj6<Object>, lf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC4768b f29517a;

        /* JADX INFO: renamed from: b */
        public final boolean f29518b;

        public C4770d(InterfaceC4768b parent, boolean isLeft) {
            this.f29517a = parent;
            this.f29518b = isLeft;
        }

        @Override // p000.lf4
        public void dispose() {
            ldg.cancel(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == ldg.CANCELLED;
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f29517a.innerComplete(this);
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f29517a.innerError(t);
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            this.f29517a.innerValue(this.f29518b, t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public de6(l86<TLeft> source, zjd<? extends TRight> other, sy6<? super TLeft, ? extends zjd<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends zjd<TRightEnd>> rightEnd, i11<? super TLeft, ? super l86<TRight>, ? extends R> resultSelector) {
        super(source);
        this.f29492c = other;
        this.f29493d = leftEnd;
        this.f29494e = rightEnd;
        this.f29495f = resultSelector;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.l86
    public void subscribeActual(ycg<? super R> ycgVar) {
        C4767a c4767a = new C4767a(ycgVar, this.f29493d, this.f29494e, this.f29495f);
        ycgVar.onSubscribe(c4767a);
        C4770d c4770d = new C4770d(c4767a, true);
        c4767a.f29510d.add(c4770d);
        C4770d c4770d2 = new C4770d(c4767a, false);
        c4767a.f29510d.add(c4770d2);
        this.f49321b.subscribe((kj6) c4770d);
        this.f29492c.subscribe(c4770d2);
    }
}
