package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fqb<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AbstractC9666n3<TLeft, R> {

    /* JADX INFO: renamed from: b */
    public final wub<? extends TRight> f37467b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super TLeft, ? extends wub<TLeftEnd>> f37468c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super TRight, ? extends wub<TRightEnd>> f37469d;

    /* JADX INFO: renamed from: e */
    public final i11<? super TLeft, ? super vkb<TRight>, ? extends R> f37470e;

    /* JADX INFO: renamed from: fqb$a */
    public static final class C5930a<TLeft, TRight, TLeftEnd, TRightEnd, R> extends AtomicInteger implements lf4, InterfaceC5931b {

        /* JADX INFO: renamed from: Q */
        public static final Integer f37471Q = 1;

        /* JADX INFO: renamed from: X */
        public static final Integer f37472X = 2;

        /* JADX INFO: renamed from: Y */
        public static final Integer f37473Y = 3;

        /* JADX INFO: renamed from: Z */
        public static final Integer f37474Z = 4;
        private static final long serialVersionUID = -6071216598687999801L;

        /* JADX INFO: renamed from: C */
        public final sy6<? super TRight, ? extends wub<TRightEnd>> f37475C;

        /* JADX INFO: renamed from: F */
        public final i11<? super TLeft, ? super vkb<TRight>, ? extends R> f37476F;

        /* JADX INFO: renamed from: L */
        public int f37478L;

        /* JADX INFO: renamed from: M */
        public int f37479M;

        /* JADX INFO: renamed from: N */
        public volatile boolean f37480N;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f37481a;

        /* JADX INFO: renamed from: m */
        public final sy6<? super TLeft, ? extends wub<TLeftEnd>> f37487m;

        /* JADX INFO: renamed from: c */
        public final mm2 f37483c = new mm2();

        /* JADX INFO: renamed from: b */
        public final qzf<Object> f37482b = new qzf<>(vkb.bufferSize());

        /* JADX INFO: renamed from: d */
        public final Map<Integer, osh<TRight>> f37484d = new LinkedHashMap();

        /* JADX INFO: renamed from: e */
        public final Map<Integer, TRight> f37485e = new LinkedHashMap();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<Throwable> f37486f = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicInteger f37477H = new AtomicInteger(2);

        public C5930a(pxb<? super R> actual, sy6<? super TLeft, ? extends wub<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, i11<? super TLeft, ? super vkb<TRight>, ? extends R> resultSelector) {
            this.f37481a = actual;
            this.f37487m = leftEnd;
            this.f37475C = rightEnd;
            this.f37476F = resultSelector;
        }

        /* JADX INFO: renamed from: a */
        public void m11098a() {
            this.f37483c.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m11099b() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<?> qzfVar = this.f37482b;
            pxb<? super R> pxbVar = this.f37481a;
            int iAddAndGet = 1;
            while (!this.f37480N) {
                if (this.f37486f.get() != null) {
                    qzfVar.clear();
                    m11098a();
                    m11100c(pxbVar);
                    return;
                }
                boolean z = this.f37477H.get() == 0;
                Integer num = (Integer) qzfVar.poll();
                boolean z2 = num == null;
                if (z && z2) {
                    Iterator<osh<TRight>> it = this.f37484d.values().iterator();
                    while (it.hasNext()) {
                        it.next().onComplete();
                    }
                    this.f37484d.clear();
                    this.f37485e.clear();
                    this.f37483c.dispose();
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
                    if (num == f37471Q) {
                        osh oshVarCreate = osh.create();
                        int i = this.f37478L;
                        this.f37478L = i + 1;
                        this.f37484d.put(Integer.valueOf(i), (osh<TRight>) oshVarCreate);
                        try {
                            wub wubVarApply = this.f37487m.apply(objPoll);
                            Objects.requireNonNull(wubVarApply, "The leftEnd returned a null ObservableSource");
                            wub wubVar = wubVarApply;
                            C5932c c5932c = new C5932c(this, true, i);
                            this.f37483c.add(c5932c);
                            wubVar.subscribe(c5932c);
                            if (this.f37486f.get() != null) {
                                qzfVar.clear();
                                m11098a();
                                m11100c(pxbVar);
                                return;
                            }
                            try {
                                R rApply = this.f37476F.apply(objPoll, oshVarCreate);
                                Objects.requireNonNull(rApply, "The resultSelector returned a null value");
                                pxbVar.onNext(rApply);
                                Iterator<TRight> it2 = this.f37485e.values().iterator();
                                while (it2.hasNext()) {
                                    oshVarCreate.onNext(it2.next());
                                }
                            } catch (Throwable th) {
                                m11101d(th, pxbVar, qzfVar);
                                return;
                            }
                        } catch (Throwable th2) {
                            m11101d(th2, pxbVar, qzfVar);
                            return;
                        }
                    } else if (num == f37472X) {
                        int i2 = this.f37479M;
                        this.f37479M = i2 + 1;
                        this.f37485e.put(Integer.valueOf(i2), (TRight) objPoll);
                        try {
                            wub wubVarApply2 = this.f37475C.apply(objPoll);
                            Objects.requireNonNull(wubVarApply2, "The rightEnd returned a null ObservableSource");
                            wub wubVar2 = wubVarApply2;
                            C5932c c5932c2 = new C5932c(this, false, i2);
                            this.f37483c.add(c5932c2);
                            wubVar2.subscribe(c5932c2);
                            if (this.f37486f.get() != null) {
                                qzfVar.clear();
                                m11098a();
                                m11100c(pxbVar);
                                return;
                            } else {
                                Iterator<osh<TRight>> it3 = this.f37484d.values().iterator();
                                while (it3.hasNext()) {
                                    it3.next().onNext(objPoll);
                                }
                            }
                        } catch (Throwable th3) {
                            m11101d(th3, pxbVar, qzfVar);
                            return;
                        }
                    } else if (num == f37473Y) {
                        C5932c c5932c3 = (C5932c) objPoll;
                        osh<TRight> oshVarRemove = this.f37484d.remove(Integer.valueOf(c5932c3.f37490c));
                        this.f37483c.remove(c5932c3);
                        if (oshVarRemove != null) {
                            oshVarRemove.onComplete();
                        }
                    } else {
                        C5932c c5932c4 = (C5932c) objPoll;
                        this.f37485e.remove(Integer.valueOf(c5932c4.f37490c));
                        this.f37483c.remove(c5932c4);
                    }
                }
            }
            qzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m11100c(pxb<?> a) {
            Throwable thTerminate = k75.terminate(this.f37486f);
            Iterator<osh<TRight>> it = this.f37484d.values().iterator();
            while (it.hasNext()) {
                it.next().onError(thTerminate);
            }
            this.f37484d.clear();
            this.f37485e.clear();
            a.onError(thTerminate);
        }

        /* JADX INFO: renamed from: d */
        public void m11101d(Throwable exc, pxb<?> a, qzf<?> q) {
            o75.throwIfFatal(exc);
            k75.addThrowable(this.f37486f, exc);
            q.clear();
            m11098a();
            m11100c(a);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f37480N) {
                return;
            }
            this.f37480N = true;
            m11098a();
            if (getAndIncrement() == 0) {
                this.f37482b.clear();
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerClose(boolean isLeft, C5932c index) {
            synchronized (this) {
                try {
                    this.f37482b.offer(isLeft ? f37473Y : f37474Z, index);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m11099b();
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerCloseError(Throwable ex) {
            if (k75.addThrowable(this.f37486f, ex)) {
                m11099b();
            } else {
                ofe.onError(ex);
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerComplete(C5933d sender) {
            this.f37483c.delete(sender);
            this.f37477H.decrementAndGet();
            m11099b();
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerError(Throwable ex) {
            if (!k75.addThrowable(this.f37486f, ex)) {
                ofe.onError(ex);
            } else {
                this.f37477H.decrementAndGet();
                m11099b();
            }
        }

        @Override // p000.fqb.InterfaceC5931b
        public void innerValue(boolean isLeft, Object o) {
            synchronized (this) {
                try {
                    this.f37482b.offer(isLeft ? f37471Q : f37472X, o);
                } catch (Throwable th) {
                    throw th;
                }
            }
            m11099b();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f37480N;
        }
    }

    /* JADX INFO: renamed from: fqb$b */
    public interface InterfaceC5931b {
        void innerClose(boolean isLeft, C5932c index);

        void innerCloseError(Throwable ex);

        void innerComplete(C5933d sender);

        void innerError(Throwable ex);

        void innerValue(boolean isLeft, Object o);
    }

    /* JADX INFO: renamed from: fqb$c */
    public static final class C5932c extends AtomicReference<lf4> implements pxb<Object>, lf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC5931b f37488a;

        /* JADX INFO: renamed from: b */
        public final boolean f37489b;

        /* JADX INFO: renamed from: c */
        public final int f37490c;

        public C5932c(InterfaceC5931b parent, boolean isLeft, int index) {
            this.f37488a = parent;
            this.f37489b = isLeft;
            this.f37490c = index;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f37488a.innerClose(this.f37489b, this);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f37488a.innerCloseError(t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            if (zf4.dispose(this)) {
                this.f37488a.innerClose(this.f37489b, this);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    /* JADX INFO: renamed from: fqb$d */
    public static final class C5933d extends AtomicReference<lf4> implements pxb<Object>, lf4 {
        private static final long serialVersionUID = 1883890389173668373L;

        /* JADX INFO: renamed from: a */
        public final InterfaceC5931b f37491a;

        /* JADX INFO: renamed from: b */
        public final boolean f37492b;

        public C5933d(InterfaceC5931b parent, boolean isLeft) {
            this.f37491a = parent;
            this.f37492b = isLeft;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f37491a.innerComplete(this);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f37491a.innerError(t);
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            this.f37491a.innerValue(this.f37492b, t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public fqb(wub<TLeft> source, wub<? extends TRight> other, sy6<? super TLeft, ? extends wub<TLeftEnd>> leftEnd, sy6<? super TRight, ? extends wub<TRightEnd>> rightEnd, i11<? super TLeft, ? super vkb<TRight>, ? extends R> resultSelector) {
        super(source);
        this.f37467b = other;
        this.f37468c = leftEnd;
        this.f37469d = rightEnd;
        this.f37470e = resultSelector;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> pxbVar) {
        C5930a c5930a = new C5930a(pxbVar, this.f37468c, this.f37469d, this.f37470e);
        pxbVar.onSubscribe(c5930a);
        C5933d c5933d = new C5933d(c5930a, true);
        c5930a.f37483c.add(c5933d);
        C5933d c5933d2 = new C5933d(c5930a, false);
        c5930a.f37483c.add(c5933d2);
        this.f63101a.subscribe(c5933d);
        this.f37467b.subscribe(c5933d2);
    }
}
