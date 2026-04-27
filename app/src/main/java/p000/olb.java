package p000;

import io.reactivex.Observable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class olb<T, U extends Collection<? super T>, Open, Close> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final Callable<U> f68064b;

    /* JADX INFO: renamed from: c */
    public final xub<? extends Open> f68065c;

    /* JADX INFO: renamed from: d */
    public final py6<? super Open, ? extends xub<? extends Close>> f68066d;

    /* JADX INFO: renamed from: olb$a */
    public static final class C10454a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f68067C;

        /* JADX INFO: renamed from: H */
        public volatile boolean f68069H;

        /* JADX INFO: renamed from: L */
        public long f68070L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super C> f68072a;

        /* JADX INFO: renamed from: b */
        public final Callable<C> f68073b;

        /* JADX INFO: renamed from: c */
        public final xub<? extends Open> f68074c;

        /* JADX INFO: renamed from: d */
        public final py6<? super Open, ? extends xub<? extends Close>> f68075d;

        /* JADX INFO: renamed from: F */
        public final rzf<C> f68068F = new rzf<>(Observable.bufferSize());

        /* JADX INFO: renamed from: e */
        public final nm2 f68076e = new nm2();

        /* JADX INFO: renamed from: f */
        public final AtomicReference<mf4> f68077f = new AtomicReference<>();

        /* JADX INFO: renamed from: M */
        public Map<Long, C> f68071M = new LinkedHashMap();

        /* JADX INFO: renamed from: m */
        public final cc0 f68078m = new cc0();

        /* JADX INFO: renamed from: olb$a$a */
        public static final class a<Open> extends AtomicReference<mf4> implements oxb<Open>, mf4 {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: a */
            public final C10454a<?, ?, Open, ?> f68079a;

            public a(C10454a<?, ?, Open, ?> c10454a) {
                this.f68079a = c10454a;
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return get() == ag4.DISPOSED;
            }

            @Override // p000.oxb
            public void onComplete() {
                lazySet(ag4.DISPOSED);
                this.f68079a.m18771e(this);
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                lazySet(ag4.DISPOSED);
                this.f68079a.m18767a(this, th);
            }

            @Override // p000.oxb
            public void onNext(Open open) {
                this.f68079a.m18770d(open);
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }
        }

        public C10454a(oxb<? super C> oxbVar, xub<? extends Open> xubVar, py6<? super Open, ? extends xub<? extends Close>> py6Var, Callable<C> callable) {
            this.f68072a = oxbVar;
            this.f68073b = callable;
            this.f68074c = xubVar;
            this.f68075d = py6Var;
        }

        /* JADX INFO: renamed from: a */
        public void m18767a(mf4 mf4Var, Throwable th) {
            ag4.dispose(this.f68077f);
            this.f68076e.delete(mf4Var);
            onError(th);
        }

        /* JADX INFO: renamed from: b */
        public void m18768b(C10455b<T, C> c10455b, long j) {
            boolean z;
            this.f68076e.delete(c10455b);
            if (this.f68076e.size() == 0) {
                ag4.dispose(this.f68077f);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f68071M;
                    if (map == null) {
                        return;
                    }
                    this.f68068F.offer(map.remove(Long.valueOf(j)));
                    if (z) {
                        this.f68067C = true;
                    }
                    m18769c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m18769c() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super C> oxbVar = this.f68072a;
            rzf<C> rzfVar = this.f68068F;
            int iAddAndGet = 1;
            while (!this.f68069H) {
                boolean z = this.f68067C;
                if (z && this.f68078m.get() != null) {
                    rzfVar.clear();
                    oxbVar.onError(this.f68078m.terminate());
                    return;
                }
                C cPoll = rzfVar.poll();
                boolean z2 = cPoll == null;
                if (z && z2) {
                    oxbVar.onComplete();
                    return;
                } else if (z2) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    oxbVar.onNext(cPoll);
                }
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m18770d(Open open) {
            try {
                Collection collection = (Collection) xjb.requireNonNull(this.f68073b.call(), "The bufferSupplier returned a null Collection");
                xub xubVar = (xub) xjb.requireNonNull(this.f68075d.apply(open), "The bufferClose returned a null ObservableSource");
                long j = this.f68070L;
                this.f68070L = 1 + j;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f68071M;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j), (C) collection);
                        C10455b c10455b = new C10455b(this, j);
                        this.f68076e.add(c10455b);
                        xubVar.subscribe(c10455b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                ag4.dispose(this.f68077f);
                onError(th2);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (ag4.dispose(this.f68077f)) {
                this.f68069H = true;
                this.f68076e.dispose();
                synchronized (this) {
                    this.f68071M = null;
                }
                if (getAndIncrement() != 0) {
                    this.f68068F.clear();
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m18771e(a<Open> aVar) {
            this.f68076e.delete(aVar);
            if (this.f68076e.size() == 0) {
                ag4.dispose(this.f68077f);
                this.f68067C = true;
                m18769c();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return ag4.isDisposed(this.f68077f.get());
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f68076e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f68071M;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f68068F.offer(it.next());
                    }
                    this.f68071M = null;
                    this.f68067C = true;
                    m18769c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f68078m.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            this.f68076e.dispose();
            synchronized (this) {
                this.f68071M = null;
            }
            this.f68067C = true;
            m18769c();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f68071M;
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

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.setOnce(this.f68077f, mf4Var)) {
                a aVar = new a(this);
                this.f68076e.add(aVar);
                this.f68074c.subscribe(aVar);
            }
        }
    }

    /* JADX INFO: renamed from: olb$b */
    public static final class C10455b<T, C extends Collection<? super T>> extends AtomicReference<mf4> implements oxb<Object>, mf4 {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: a */
        public final C10454a<T, C, ?, ?> f68080a;

        /* JADX INFO: renamed from: b */
        public final long f68081b;

        public C10455b(C10454a<T, C, ?, ?> c10454a, long j) {
            this.f68080a = c10454a;
            this.f68081b = j;
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return get() == ag4.DISPOSED;
        }

        @Override // p000.oxb
        public void onComplete() {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var != ag4Var) {
                lazySet(ag4Var);
                this.f68080a.m18768b(this, this.f68081b);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var == ag4Var) {
                pfe.onError(th);
            } else {
                lazySet(ag4Var);
                this.f68080a.m18767a(this, th);
            }
        }

        @Override // p000.oxb
        public void onNext(Object obj) {
            mf4 mf4Var = get();
            ag4 ag4Var = ag4.DISPOSED;
            if (mf4Var != ag4Var) {
                lazySet(ag4Var);
                mf4Var.dispose();
                this.f68080a.m18768b(this, this.f68081b);
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    public olb(xub<T> xubVar, xub<? extends Open> xubVar2, py6<? super Open, ? extends xub<? extends Close>> py6Var, Callable<U> callable) {
        super(xubVar);
        this.f68065c = xubVar2;
        this.f68066d = py6Var;
        this.f68064b = callable;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        C10454a c10454a = new C10454a(oxbVar, this.f68065c, this.f68066d, this.f68064b);
        oxbVar.onSubscribe(c10454a);
        this.f66354a.subscribe(c10454a);
    }
}
