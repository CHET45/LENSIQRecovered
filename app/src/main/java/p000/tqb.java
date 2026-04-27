package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p000.fqb;

/* JADX INFO: loaded from: classes7.dex */
public final class tqb<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC9666n3<TLeft, R> {

    /* JADX INFO: renamed from: b */
    public final wub<? extends TRight> f85589b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super TLeft, ? extends wub<TLeftEnd>> f85590c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super TRight, ? extends wub<TRightEnd>> f85591d;

    /* JADX INFO: renamed from: e */
    public final i11<? super TLeft, ? super TRight, ? extends R> f85592e;

    /* JADX INFO: renamed from: tqb$a */
    public static final class C13164a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements lf4, fqb.InterfaceC5931b {

        /* JADX INFO: renamed from: Q */
        public static final Integer f85593Q = 1;

        /* JADX INFO: renamed from: X */
        public static final Integer f85594X = 2;

        /* JADX INFO: renamed from: Y */
        public static final Integer f85595Y = 3;

        /* JADX INFO: renamed from: Z */
        public static final Integer f85596Z = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super TRight, ? extends wub<TRightEnd>> f85597C;

        /* JADX INFO: renamed from: F */
        public final i11<? super TLeft, ? super TRight, ? extends R> f85598F;

        /* JADX INFO: renamed from: L */
        public int f85600L;

        /* JADX INFO: renamed from: M */
        public int f85601M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f85602N;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f85603a;

        /* JADX INFO: renamed from: m */
        public final sy6<? super TLeft, ? extends wub<TLeftEnd>> f85609m;

        /* JADX INFO: renamed from: c */
        public final mm2 f85605c = new mm2();

        /* JADX INFO: renamed from: b */
        public final qzf<Object> f85604b = new qzf<>(vkb.bufferSize());

        /* JADX INFO: renamed from: d */
        public final Map<Integer, TLeft> f85606d = new LinkedHashMap();

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TRight> f85607e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Throwable> f85608f = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicInteger f85599H = new AtomicInteger(2);

        public C13164a(pxb<? super R> actual, sy6<? super TLeft, ? extends wub<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, i11<? super TLeft, ? super TRight, ? extends R> resultSelector) {
            this.f85603a = actual;
            this.f85609m = leftEnd;
            this.f85597C = rightEnd;
            this.f85598F = resultSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m22745a() {
            this.f85605c.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m22746b() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<?> qzfVar = this.f85604b;
            pxb<? super R> pxbVar = this.f85603a;
            int iAddAndGet = 1;
            while (!this.f85602N) {
                if (this.f85608f.get() != null) {
                    qzfVar.clear();
                    m22745a();
                    m22747c(pxbVar);
                    return;
                }
                boolean z = this.f85599H.get() == 0;
                Integer num = (Integer) qzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    this.f85606d.clear();
                    this.f85607e.clear();
                    this.f85605c.dispose();
                    pxbVar.onComplete();
                    return;
                }
                if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    Object objPoll = qzfVar.poll();
                    if (num == f85593Q) {
                        int i = this.f85600L;
                        this.f85600L = i + 1;
                        this.f85606d.put(Integer.valueOf(i), (TLeft) objPoll);
                        try {
                            wub wubVarApply = this.f85609m.apply(objPoll);
                            Objects.requireNonNull(wubVarApply, "The leftEnd returned a null ObservableSource");
                            wub wubVar = wubVarApply;
                            fqb.C5932c c5932c = new fqb.C5932c(this, true, i);
                            this.f85605c.add(c5932c);
                            wubVar.subscribe(c5932c);
                            if (this.f85608f.get() != null) {
                                qzfVar.clear();
                                m22745a();
                                m22747c(pxbVar);
                                return;
                            }
                            Iterator<TRight> it = this.f85607e.values().iterator();
                            while (it.hasNext()) {
                                try {
                                    R rApply = this.f85598F.apply(objPoll, it.next());
                                    Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                    pxbVar.onNext(rApply);
                                } catch (Throwable th) {
                                    m22748d(th, pxbVar, qzfVar);
                                    return;
                                }
                            }
                        } catch (Throwable th2) {
                            m22748d(th2, pxbVar, qzfVar);
                            return;
                        }
                    } else if (num == f85594X) {
                        int i2 = this.f85601M;
                        this.f85601M = i2 + 1;
                        this.f85607e.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            wub wubVarApply2 = this.f85597C.apply(objPoll);
                            Objects.requireNonNull(wubVarApply2, "The rightEnd returned a null ObservableSource");
                            wub wubVar2 = wubVarApply2;
                            fqb.C5932c c5932c2 = new fqb.C5932c(this, false, i2);
                            this.f85605c.add(c5932c2);
                            wubVar2.subscribe(c5932c2);
                            if (this.f85608f.get() != null) {
                                qzfVar.clear();
                                m22745a();
                                m22747c(pxbVar);
                                return;
                            }
                            Iterator<TLeft> it2 = this.f85606d.values().iterator();
                            while (it2.hasNext()) {
                                try {
                                    R rApply2 = this.f85598F.apply(it2.next(), objPoll);
                                    Objects.requireNonNull(rApply2, "The resultSelector returned a null value");
                                    pxbVar.onNext(rApply2);
                                } catch (Throwable th3) {
                                    m22748d(th3, pxbVar, qzfVar);
                                    return;
                                }
                            }
                        } catch (Throwable th4) {
                            m22748d(th4, pxbVar, qzfVar);
                            return;
                        }
                    } else if (num == f85595Y) {
                        fqb.C5932c c5932c3 = (fqb.C5932c) objPoll;
                        this.f85606d.remove(Integer.valueOf(c5932c3.f37490c));
                        this.f85605c.remove(c5932c3);
                    } else {
                        fqb.C5932c c5932c4 = (fqb.C5932c) objPoll;
                        this.f85607e.remove(Integer.valueOf(c5932c4.f37490c));
                        this.f85605c.remove(c5932c4);
                    }
                }
            }
            qzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m22747c(pxb<?> a) {
            Throwable thTerminate = k75.terminate(this.f85608f);
            this.f85606d.clear();
            this.f85607e.clear();
            a.onError(thTerminate);
        }

        /* JADX INFO: renamed from: d */
        public void m22748d(Throwable exc, pxb<?> a, qzf<?> q) {
            o75.throwIfFatal(exc);
            k75.addThrowable(this.f85608f, exc);
            q.clear();
            m22745a();
            m22747c(a);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f85602N) {
                return;
            }
            this.f85602N = true;
            m22745a();
            if (getAndIncrement() == 0) {
                this.f85604b.clear();
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerClose(boolean isLeft, fqb.C5932c index) {
            synchronized (this) {
                try {
                    this.f85604b.offer(isLeft ? f85595Y : f85596Z, index);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m22746b();
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerCloseError(Throwable ex) {
            if (k75.addThrowable(this.f85608f, ex)) {
                m22746b();
            } else {
                ofe.onError(ex);
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerComplete(fqb.C5933d sender) {
            this.f85605c.delete(sender);
            this.f85599H.decrementAndGet();
            m22746b();
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerError(Throwable ex) {
            if (!k75.addThrowable(this.f85608f, ex)) {
                ofe.onError(ex);
            } else {
                this.f85599H.decrementAndGet();
                m22746b();
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                try {
                    this.f85604b.offer(isLeft ? f85593Q : f85594X, o);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m22746b();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f85602N;
        }
    }

    public tqb(wub<TLeft> source, wub<? extends TRight> other, sy6<? super TLeft, ? extends wub<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, i11<? super TLeft, ? super TRight, ? extends R> resultSelector) {
        super(source);
        this.f85589b = other;
        this.f85590c = leftEnd;
        this.f85591d = rightEnd;
        this.f85592e = resultSelector;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> pxbVar) {
        C13164a c13164a = new C13164a(pxbVar, this.f85590c, this.f85591d, this.f85592e);
        pxbVar.onSubscribe(c13164a);
        fqb.C5933d c5933d = new fqb.C5933d(c13164a, true);
        c13164a.f85605c.add(c5933d);
        fqb.C5933d c5933d2 = new fqb.C5933d(c13164a, false);
        c13164a.f85605c.add(c5933d2);
        this.f63101a.subscribe(c5933d);
        this.f85589b.subscribe(c5933d2);
    }
}
