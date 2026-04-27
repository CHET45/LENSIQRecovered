package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class plb<T, U extends Collection<? super T>, Open, Close> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: b */
    public final nfg<U> f71331b;

    /* JADX INFO: renamed from: c */
    public final wub<? extends Open> f71332c;

    /* JADX INFO: renamed from: d */
    public final sy6<? super Open, ? extends wub<? extends Close>> f71333d;

    /* JADX INFO: renamed from: plb$a */
    public static final class C11017a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements pxb<T>, lf4 {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f71334C;

        /* JADX INFO: renamed from: H */
        public volatile boolean f71336H;

        /* JADX INFO: renamed from: L */
        public long f71337L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super C> f71339a;

        /* JADX INFO: renamed from: b */
        public final nfg<C> f71340b;

        /* JADX INFO: renamed from: c */
        public final wub<? extends Open> f71341c;

        /* JADX INFO: renamed from: d */
        public final sy6<? super Open, ? extends wub<? extends Close>> f71342d;

        /* JADX INFO: renamed from: F */
        public final qzf<C> f71335F = new qzf<>(vkb.bufferSize());

        /* JADX INFO: renamed from: e */
        public final mm2 f71343e = new mm2();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<lf4> f71344f = new AtomicReference<>();

        /* JADX INFO: renamed from: M */
        public Map<Long, C> f71338M = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final bc0 f71345m = new bc0();

        /* JADX INFO: renamed from: plb$a$a */
        public static final class a<Open> extends AtomicReference<lf4> implements pxb<Open>, lf4 {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: a */
            public final C11017a<?, ?, Open, ?> f71346a;

            public a(C11017a<?, ?, Open, ?> parent) {
                this.f71346a = parent;
            }

            @Override // p000.lf4
            public void dispose() {
                zf4.dispose(this);
            }

            @Override // p000.lf4
            public boolean isDisposed() {
                return get() == zf4.DISPOSED;
            }

            @Override // p000.pxb
            public void onComplete() {
                lazySet(zf4.DISPOSED);
                this.f71346a.m19612e(this);
            }

            @Override // p000.pxb
            public void onError(Throwable t) {
                lazySet(zf4.DISPOSED);
                this.f71346a.m19608a(this, t);
            }

            @Override // p000.pxb
            public void onNext(Open t) {
                this.f71346a.m19611d(t);
            }

            @Override // p000.pxb
            public void onSubscribe(lf4 d) {
                zf4.setOnce(this, d);
            }
        }

        public C11017a(pxb<? super C> actual, wub<? extends Open> bufferOpen, sy6<? super Open, ? extends wub<? extends Close>> bufferClose, nfg<C> bufferSupplier) {
            this.f71339a = actual;
            this.f71340b = bufferSupplier;
            this.f71341c = bufferOpen;
            this.f71342d = bufferClose;
        }

        /* JADX INFO: renamed from: a */
        public void m19608a(lf4 observer, Throwable ex) {
            zf4.dispose(this.f71344f);
            this.f71343e.delete(observer);
            onError(ex);
        }

        /* JADX INFO: renamed from: b */
        public void m19609b(C11018b<T, C> closer, long idx) {
            boolean z;
            this.f71343e.delete(closer);
            if (this.f71343e.size() == 0) {
                zf4.dispose(this.f71344f);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f71338M;
                    if (map == null) {
                        return;
                    }
                    this.f71335F.offer(map.remove(Long.valueOf(idx)));
                    if (z) {
                        this.f71334C = true;
                    }
                    m19610c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m19610c() {
            if (getAndIncrement() != 0) {
                return;
            }
            pxb<? super C> pxbVar = this.f71339a;
            qzf<C> qzfVar = this.f71335F;
            int iAddAndGet = 1;
            while (!this.f71336H) {
                boolean z = this.f71334C;
                if (z && this.f71345m.get() != null) {
                    qzfVar.clear();
                    this.f71345m.tryTerminateConsumer(pxbVar);
                    return;
                }
                C cPoll = qzfVar.poll();
                boolean z2 = cPoll == null;
                if (z && z2) {
                    pxbVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    pxbVar.onNext(cPoll);
                }
            }
            qzfVar.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m19611d(Open open) {
            try {
                C c = this.f71340b.get();
                Objects.requireNonNull(c, "The bufferSupplier returned a null Collection");
                C c2 = c;
                wub<? extends Close> wubVarApply = this.f71342d.apply(open);
                Objects.requireNonNull(wubVarApply, "The bufferClose returned a null ObservableSource");
                wub<? extends Close> wubVar = wubVarApply;
                long j = this.f71337L;
                this.f71337L = 1 + j;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f71338M;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j), c2);
                        C11018b c11018b = new C11018b(this, j);
                        this.f71343e.add(c11018b);
                        wubVar.subscribe(c11018b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                zf4.dispose(this.f71344f);
                onError(th2);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (zf4.dispose(this.f71344f)) {
                this.f71336H = true;
                this.f71343e.dispose();
                synchronized (this) {
                    this.f71338M = null;
                }
                if (getAndIncrement() != 0) {
                    this.f71335F.clear();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m19612e(a<Open> os) {
            this.f71343e.delete(os);
            if (this.f71343e.size() == 0) {
                zf4.dispose(this.f71344f);
                this.f71334C = true;
                m19610c();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return zf4.isDisposed(this.f71344f.get());
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f71343e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f71338M;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f71335F.offer(it.next());
                    }
                    this.f71338M = null;
                    this.f71334C = true;
                    m19610c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f71345m.tryAddThrowableOrReport(t)) {
                this.f71343e.dispose();
                synchronized (this) {
                    this.f71338M = null;
                }
                this.f71334C = true;
                m19610c();
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f71338M;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this.f71344f, d)) {
                a aVar = new a(this);
                this.f71343e.add(aVar);
                this.f71341c.subscribe(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: plb$b */
    public static final class C11018b<T, C extends Collection<? super T>> extends AtomicReference<lf4> implements pxb<Object>, lf4 {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: a */
        public final C11017a<T, C, ?, ?> f71347a;

        /* JADX INFO: renamed from: b */
        public final long f71348b;

        public C11018b(C11017a<T, C, ?, ?> parent, long index) {
            this.f71347a = parent;
            this.f71348b = index;
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return get() == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                lazySet(zf4Var);
                this.f71347a.m19609b(this, this.f71348b);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var == zf4Var) {
                ofe.onError(t);
            } else {
                lazySet(zf4Var);
                this.f71347a.m19608a(this, t);
            }
        }

        @Override // p000.pxb
        public void onNext(Object t) {
            lf4 lf4Var = get();
            zf4 zf4Var = zf4.DISPOSED;
            if (lf4Var != zf4Var) {
                lazySet(zf4Var);
                lf4Var.dispose();
                this.f71347a.m19609b(this, this.f71348b);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    public plb(wub<T> source, wub<? extends Open> bufferOpen, sy6<? super Open, ? extends wub<? extends Close>> bufferClose, nfg<U> bufferSupplier) {
        super(source);
        this.f71332c = bufferOpen;
        this.f71333d = bufferClose;
        this.f71331b = bufferSupplier;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        C11017a c11017a = new C11017a(t, this.f71332c, this.f71333d, this.f71331b);
        t.onSubscribe(c11017a);
        this.f63101a.subscribe(c11017a);
    }
}
