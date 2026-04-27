package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class d96<T, U extends Collection<? super T>, Open, Close> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: c */
    public final Callable<U> f28799c;

    /* JADX INFO: renamed from: d */
    public final zjd<? extends Open> f28800d;

    /* JADX INFO: renamed from: e */
    public final py6<? super Open, ? extends zjd<? extends Close>> f28801e;

    /* JADX INFO: renamed from: d96$a */
    public static final class C4673a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: F */
        public volatile boolean f28803F;

        /* JADX INFO: renamed from: L */
        public volatile boolean f28805L;

        /* JADX INFO: renamed from: M */
        public long f28806M;

        /* JADX INFO: renamed from: Q */
        public long f28808Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f28809a;

        /* JADX INFO: renamed from: b */
        public final Callable<C> f28810b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends Open> f28811c;

        /* JADX INFO: renamed from: d */
        public final py6<? super Open, ? extends zjd<? extends Close>> f28812d;

        /* JADX INFO: renamed from: H */
        public final rzf<C> f28804H = new rzf<>(m86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final nm2 f28813e = new nm2();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f28814f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<fdg> f28815m = new AtomicReference<>();

        /* JADX INFO: renamed from: N */
        public Map<Long, C> f28807N = new LinkedHashMap();

        /* JADX INFO: renamed from: C */
        public final cc0 f28802C = new cc0();

        /* JADX INFO: renamed from: d96$a$a */
        public static final class a<Open> extends AtomicReference<fdg> implements lj6<Open>, mf4 {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: a */
            public final C4673a<?, ?, Open, ?> f28816a;

            public a(C4673a<?, ?, Open, ?> c4673a) {
                this.f28816a = c4673a;
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
                lazySet(mdg.CANCELLED);
                this.f28816a.m8990e(this);
            }

            @Override // p000.ycg
            public void onError(Throwable th) {
                lazySet(mdg.CANCELLED);
                this.f28816a.m8986a(this, th);
            }

            @Override // p000.ycg
            public void onNext(Open open) {
                this.f28816a.m8989d(open);
            }

            @Override // p000.lj6, p000.ycg
            public void onSubscribe(fdg fdgVar) {
                mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
            }
        }

        public C4673a(ycg<? super C> ycgVar, zjd<? extends Open> zjdVar, py6<? super Open, ? extends zjd<? extends Close>> py6Var, Callable<C> callable) {
            this.f28809a = ycgVar;
            this.f28810b = callable;
            this.f28811c = zjdVar;
            this.f28812d = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m8986a(mf4 mf4Var, Throwable th) {
            mdg.cancel(this.f28815m);
            this.f28813e.delete(mf4Var);
            onError(th);
        }

        /* JADX INFO: renamed from: b */
        public void m8987b(C4674b<T, C> c4674b, long j) {
            boolean z;
            this.f28813e.delete(c4674b);
            if (this.f28813e.size() == 0) {
                mdg.cancel(this.f28815m);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f28807N;
                    if (map == null) {
                        return;
                    }
                    this.f28804H.offer(map.remove(Long.valueOf(j)));
                    if (z) {
                        this.f28803F = true;
                    }
                    m8988c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m8988c() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j = this.f28808Q;
            ycg<? super C> ycgVar = this.f28809a;
            rzf<C> rzfVar = this.f28804H;
            int iAddAndGet = 1;
            do {
                long j2 = this.f28814f.get();
                while (j != j2) {
                    if (this.f28805L) {
                        rzfVar.clear();
                        return;
                    }
                    boolean z = this.f28803F;
                    if (z && this.f28802C.get() != null) {
                        rzfVar.clear();
                        ycgVar.onError(this.f28802C.terminate());
                        return;
                    }
                    C cPoll = rzfVar.poll();
                    boolean z2 = cPoll == null;
                    if (z && z2) {
                        ycgVar.onComplete();
                        return;
                    } else {
                        if (z2) {
                            break;
                        }
                        ycgVar.onNext(cPoll);
                        j++;
                    }
                }
                if (j == j2) {
                    if (this.f28805L) {
                        rzfVar.clear();
                        return;
                    }
                    if (this.f28803F) {
                        if (this.f28802C.get() != null) {
                            rzfVar.clear();
                            ycgVar.onError(this.f28802C.terminate());
                            return;
                        } else if (rzfVar.isEmpty()) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                this.f28808Q = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (mdg.cancel(this.f28815m)) {
                this.f28805L = true;
                this.f28813e.dispose();
                synchronized (this) {
                    this.f28807N = null;
                }
                if (getAndIncrement() != 0) {
                    this.f28804H.clear();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m8989d(Open open) {
            try {
                Collection collection = (Collection) xjb.requireNonNull(this.f28810b.call(), "The bufferSupplier returned a null Collection");
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f28812d.apply(open), "The bufferClose returned a null Publisher");
                long j = this.f28806M;
                this.f28806M = 1 + j;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f28807N;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j), (C) collection);
                        C4674b c4674b = new C4674b(this, j);
                        this.f28813e.add(c4674b);
                        zjdVar.subscribe(c4674b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                mdg.cancel(this.f28815m);
                onError(th2);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m8990e(a<Open> aVar) {
            this.f28813e.delete(aVar);
            if (this.f28813e.size() == 0) {
                mdg.cancel(this.f28815m);
                this.f28803F = true;
                m8988c();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f28813e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f28807N;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f28804H.offer(it.next());
                    }
                    this.f28807N = null;
                    this.f28803F = true;
                    m8988c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f28802C.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f28813e.dispose();
            synchronized (this) {
                this.f28807N = null;
            }
            this.f28803F = true;
            m8988c();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f28807N;
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

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this.f28815m, fdgVar)) {
                a aVar = new a(this);
                this.f28813e.add(aVar);
                this.f28811c.subscribe(aVar);
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f28814f, j);
            m8988c();
        }
    }

    /* JADX INFO: renamed from: d96$b */
    public static final class C4674b<T, C extends Collection<? super T>> extends AtomicReference<fdg> implements lj6<Object>, mf4 {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: a */
        public final C4673a<T, C, ?, ?> f28817a;

        /* JADX INFO: renamed from: b */
        public final long f28818b;

        public C4674b(C4673a<T, C, ?, ?> c4673a, long j) {
            this.f28817a = c4673a;
            this.f28818b = j;
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
            fdg fdgVar = get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                lazySet(mdgVar);
                this.f28817a.m8987b(this, this.f28818b);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            fdg fdgVar = get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar == mdgVar) {
                pfe.onError(th);
            } else {
                lazySet(mdgVar);
                this.f28817a.m8986a(this, th);
            }
        }

        @Override // p000.ycg
        public void onNext(Object obj) {
            fdg fdgVar = get();
            mdg mdgVar = mdg.CANCELLED;
            if (fdgVar != mdgVar) {
                lazySet(mdgVar);
                fdgVar.cancel();
                this.f28817a.m8987b(this, this.f28818b);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, Long.MAX_VALUE);
        }
    }

    public d96(m86<T> m86Var, zjd<? extends Open> zjdVar, py6<? super Open, ? extends zjd<? extends Close>> py6Var, Callable<U> callable) {
        super(m86Var);
        this.f28800d = zjdVar;
        this.f28801e = py6Var;
        this.f28799c = callable;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        C4673a c4673a = new C4673a(ycgVar, this.f28800d, this.f28801e, this.f28799c);
        ycgVar.onSubscribe(c4673a);
        this.f52360b.subscribe((lj6) c4673a);
    }
}
