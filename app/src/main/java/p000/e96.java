package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class e96<T, U extends Collection<? super T>, Open, Close> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: c */
    public final nfg<U> f32191c;

    /* JADX INFO: renamed from: d */
    public final zjd<? extends Open> f32192d;

    /* JADX INFO: renamed from: e */
    public final sy6<? super Open, ? extends zjd<? extends Close>> f32193e;

    /* JADX INFO: renamed from: e96$a */
    public static final class C5198a<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = -8466418554264089604L;

        /* JADX INFO: renamed from: F */
        public volatile boolean f32195F;

        /* JADX INFO: renamed from: L */
        public volatile boolean f32197L;

        /* JADX INFO: renamed from: M */
        public long f32198M;

        /* JADX INFO: renamed from: Q */
        public long f32200Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super C> f32201a;

        /* JADX INFO: renamed from: b */
        public final nfg<C> f32202b;

        /* JADX INFO: renamed from: c */
        public final zjd<? extends Open> f32203c;

        /* JADX INFO: renamed from: d */
        public final sy6<? super Open, ? extends zjd<? extends Close>> f32204d;

        /* JADX INFO: renamed from: H */
        public final qzf<C> f32196H = new qzf<>(l86.bufferSize());

        /* JADX INFO: renamed from: e */
        public final mm2 f32205e = new mm2();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f32206f = new AtomicLong();

        /* JADX INFO: renamed from: m */
        public final AtomicReference<fdg> f32207m = new AtomicReference<>();

        /* JADX INFO: renamed from: N */
        public Map<Long, C> f32199N = new LinkedHashMap();

        /* JADX INFO: renamed from: C */
        public final bc0 f32194C = new bc0();

        /* JADX INFO: renamed from: e96$a$a */
        public static final class a<Open> extends AtomicReference<fdg> implements kj6<Open>, lf4 {
            private static final long serialVersionUID = -8498650778633225126L;

            /* JADX INFO: renamed from: a */
            public final C5198a<?, ?, Open, ?> f32208a;

            public a(C5198a<?, ?, Open, ?> parent) {
                this.f32208a = parent;
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
                lazySet(ldg.CANCELLED);
                this.f32208a.m9812e(this);
            }

            @Override // p000.ycg
            public void onError(Throwable t) {
                lazySet(ldg.CANCELLED);
                this.f32208a.m9808a(this, t);
            }

            @Override // p000.ycg
            public void onNext(Open t) {
                this.f32208a.m9811d(t);
            }

            @Override // p000.kj6, p000.ycg
            public void onSubscribe(fdg s) {
                ldg.setOnce(this, s, Long.MAX_VALUE);
            }
        }

        public C5198a(ycg<? super C> actual, zjd<? extends Open> bufferOpen, sy6<? super Open, ? extends zjd<? extends Close>> bufferClose, nfg<C> bufferSupplier) {
            this.f32201a = actual;
            this.f32202b = bufferSupplier;
            this.f32203c = bufferOpen;
            this.f32204d = bufferClose;
        }

        /* JADX INFO: renamed from: a */
        public void m9808a(lf4 subscriber, Throwable ex) {
            ldg.cancel(this.f32207m);
            this.f32205e.delete(subscriber);
            onError(ex);
        }

        /* JADX INFO: renamed from: b */
        public void m9809b(C5199b<T, C> closer, long idx) {
            boolean z;
            this.f32205e.delete(closer);
            if (this.f32205e.size() == 0) {
                ldg.cancel(this.f32207m);
                z = true;
            } else {
                z = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f32199N;
                    if (map == null) {
                        return;
                    }
                    this.f32196H.offer(map.remove(Long.valueOf(idx)));
                    if (z) {
                        this.f32195F = true;
                    }
                    m9810c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public void m9810c() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j = this.f32200Q;
            ycg<? super C> ycgVar = this.f32201a;
            qzf<C> qzfVar = this.f32196H;
            int iAddAndGet = 1;
            do {
                long j2 = this.f32206f.get();
                while (j != j2) {
                    if (this.f32197L) {
                        qzfVar.clear();
                        return;
                    }
                    boolean z = this.f32195F;
                    if (z && this.f32194C.get() != null) {
                        qzfVar.clear();
                        this.f32194C.tryTerminateConsumer(ycgVar);
                        return;
                    }
                    C cPoll = qzfVar.poll();
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
                    if (this.f32197L) {
                        qzfVar.clear();
                        return;
                    }
                    if (this.f32195F) {
                        if (this.f32194C.get() != null) {
                            qzfVar.clear();
                            this.f32194C.tryTerminateConsumer(ycgVar);
                            return;
                        } else if (qzfVar.isEmpty()) {
                            ycgVar.onComplete();
                            return;
                        }
                    }
                }
                this.f32200Q = j;
                iAddAndGet = addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            if (ldg.cancel(this.f32207m)) {
                this.f32197L = true;
                this.f32205e.dispose();
                synchronized (this) {
                    this.f32199N = null;
                }
                if (getAndIncrement() != 0) {
                    this.f32196H.clear();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9811d(Open open) {
            try {
                C c = this.f32202b.get();
                Objects.requireNonNull(c, "The bufferSupplier returned a null Collection");
                C c2 = c;
                zjd<? extends Close> zjdVarApply = this.f32204d.apply(open);
                Objects.requireNonNull(zjdVarApply, "The bufferClose returned a null Publisher");
                zjd<? extends Close> zjdVar = zjdVarApply;
                long j = this.f32198M;
                this.f32198M = 1 + j;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.f32199N;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j), c2);
                        C5199b c5199b = new C5199b(this, j);
                        this.f32205e.add(c5199b);
                        zjdVar.subscribe(c5199b);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ldg.cancel(this.f32207m);
                onError(th2);
            }
        }

        /* JADX INFO: renamed from: e */
        public void m9812e(a<Open> os) {
            this.f32205e.delete(os);
            if (this.f32205e.size() == 0) {
                ldg.cancel(this.f32207m);
                this.f32195F = true;
                m9810c();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f32205e.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f32199N;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.f32196H.offer(it.next());
                    }
                    this.f32199N = null;
                    this.f32195F = true;
                    m9810c();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f32194C.tryAddThrowableOrReport(t)) {
                this.f32205e.dispose();
                synchronized (this) {
                    this.f32199N = null;
                }
                this.f32195F = true;
                m9810c();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.f32199N;
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

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.setOnce(this.f32207m, s)) {
                a aVar = new a(this);
                this.f32205e.add(aVar);
                this.f32203c.subscribe(aVar);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f32206f, n);
            m9810c();
        }
    }

    /* JADX INFO: renamed from: e96$b */
    public static final class C5199b<T, C extends Collection<? super T>> extends AtomicReference<fdg> implements kj6<Object>, lf4 {
        private static final long serialVersionUID = -8498650778633225126L;

        /* JADX INFO: renamed from: a */
        public final C5198a<T, C, ?, ?> f32209a;

        /* JADX INFO: renamed from: b */
        public final long f32210b;

        public C5199b(C5198a<T, C, ?, ?> parent, long index) {
            this.f32209a = parent;
            this.f32210b = index;
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
            fdg fdgVar = get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                lazySet(ldgVar);
                this.f32209a.m9809b(this, this.f32210b);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            fdg fdgVar = get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar == ldgVar) {
                ofe.onError(t);
            } else {
                lazySet(ldgVar);
                this.f32209a.m9808a(this, t);
            }
        }

        @Override // p000.ycg
        public void onNext(Object t) {
            fdg fdgVar = get();
            ldg ldgVar = ldg.CANCELLED;
            if (fdgVar != ldgVar) {
                lazySet(ldgVar);
                fdgVar.cancel();
                this.f32209a.m9809b(this, this.f32210b);
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, Long.MAX_VALUE);
        }
    }

    public e96(l86<T> source, zjd<? extends Open> bufferOpen, sy6<? super Open, ? extends zjd<? extends Close>> bufferClose, nfg<U> bufferSupplier) {
        super(source);
        this.f32192d = bufferOpen;
        this.f32193e = bufferClose;
        this.f32191c = bufferSupplier;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        C5198a c5198a = new C5198a(s, this.f32192d, this.f32193e, this.f32191c);
        s.onSubscribe(c5198a);
        this.f49321b.subscribe((kj6) c5198a);
    }
}
