package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class j96<T, U extends Collection<? super T>> extends AbstractC7714j1<T, U> {

    /* JADX INFO: renamed from: C */
    public final int f49968C;

    /* JADX INFO: renamed from: F */
    public final boolean f49969F;

    /* JADX INFO: renamed from: c */
    public final long f49970c;

    /* JADX INFO: renamed from: d */
    public final long f49971d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f49972e;

    /* JADX INFO: renamed from: f */
    public final woe f49973f;

    /* JADX INFO: renamed from: m */
    public final nfg<U> f49974m;

    /* JADX INFO: renamed from: j96$a */
    public static final class RunnableC7813a<T, U extends Collection<? super T>> extends bnd<T, U, U> implements fdg, Runnable, lf4 {

        /* JADX INFO: renamed from: G2 */
        public final nfg<U> f49975G2;

        /* JADX INFO: renamed from: H2 */
        public final long f49976H2;

        /* JADX INFO: renamed from: I2 */
        public final TimeUnit f49977I2;

        /* JADX INFO: renamed from: J2 */
        public final int f49978J2;

        /* JADX INFO: renamed from: K2 */
        public final boolean f49979K2;

        /* JADX INFO: renamed from: L2 */
        public final woe.AbstractC14729c f49980L2;

        /* JADX INFO: renamed from: M2 */
        public U f49981M2;

        /* JADX INFO: renamed from: N2 */
        public lf4 f49982N2;

        /* JADX INFO: renamed from: O2 */
        public fdg f49983O2;

        /* JADX INFO: renamed from: P2 */
        public long f49984P2;

        /* JADX INFO: renamed from: Q2 */
        public long f49985Q2;

        public RunnableC7813a(ycg<? super U> actual, nfg<U> bufferSupplier, long timespan, TimeUnit unit, int maxSize, boolean restartOnMaxSize, woe.AbstractC14729c w) {
            super(actual, new t1b());
            this.f49975G2 = bufferSupplier;
            this.f49976H2 = timespan;
            this.f49977I2 = unit;
            this.f49978J2 = maxSize;
            this.f49979K2 = restartOnMaxSize;
            this.f49980L2 = w;
        }

        @Override // p000.bnd, p000.vmd
        public /* bridge */ /* synthetic */ boolean accept(ycg a, Object v) {
            return accept((ycg<? super Collection>) a, (Collection) v);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f14220D2) {
                return;
            }
            this.f14220D2 = true;
            dispose();
        }

        @Override // p000.lf4
        public void dispose() {
            synchronized (this) {
                this.f49981M2 = null;
            }
            this.f49983O2.cancel();
            this.f49980L2.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f49980L2.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f49981M2;
                this.f49981M2 = null;
            }
            if (u != null) {
                this.f14219C2.offer(u);
                this.f14221E2 = true;
                if (enter()) {
                    xmd.drainMaxLoop(this.f14219C2, this.f14218B2, false, this, this);
                }
                this.f49980L2.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            synchronized (this) {
                this.f49981M2 = null;
            }
            this.f14218B2.onError(t);
            this.f49980L2.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f49981M2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.f49978J2) {
                        return;
                    }
                    this.f49981M2 = null;
                    this.f49984P2++;
                    if (this.f49979K2) {
                        this.f49982N2.dispose();
                    }
                    m3259b(u, false, this);
                    try {
                        U u2 = this.f49975G2.get();
                        Objects.requireNonNull(u2, "The supplied buffer is null");
                        U u3 = u2;
                        synchronized (this) {
                            this.f49981M2 = u3;
                            this.f49985Q2++;
                        }
                        if (this.f49979K2) {
                            woe.AbstractC14729c abstractC14729c = this.f49980L2;
                            long j = this.f49976H2;
                            this.f49982N2 = abstractC14729c.schedulePeriodically(this, j, j, this.f49977I2);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        cancel();
                        this.f14218B2.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f49983O2, s)) {
                this.f49983O2 = s;
                try {
                    U u = this.f49975G2.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    this.f49981M2 = u;
                    this.f14218B2.onSubscribe(this);
                    woe.AbstractC14729c abstractC14729c = this.f49980L2;
                    long j = this.f49976H2;
                    this.f49982N2 = abstractC14729c.schedulePeriodically(this, j, j, this.f49977I2);
                    s.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f49980L2.dispose();
                    s.cancel();
                    w05.error(th, this.f14218B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            requested(n);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = this.f49975G2.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    U u3 = this.f49981M2;
                    if (u3 != null && this.f49984P2 == this.f49985Q2) {
                        this.f49981M2 = u2;
                        m3259b(u3, false, this);
                    }
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                cancel();
                this.f14218B2.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(ycg<? super U> a, U v) {
            a.onNext(v);
            return true;
        }
    }

    /* JADX INFO: renamed from: j96$b */
    public static final class RunnableC7814b<T, U extends Collection<? super T>> extends bnd<T, U, U> implements fdg, Runnable, lf4 {

        /* JADX INFO: renamed from: G2 */
        public final nfg<U> f49986G2;

        /* JADX INFO: renamed from: H2 */
        public final long f49987H2;

        /* JADX INFO: renamed from: I2 */
        public final TimeUnit f49988I2;

        /* JADX INFO: renamed from: J2 */
        public final woe f49989J2;

        /* JADX INFO: renamed from: K2 */
        public fdg f49990K2;

        /* JADX INFO: renamed from: L2 */
        public U f49991L2;

        /* JADX INFO: renamed from: M2 */
        public final AtomicReference<lf4> f49992M2;

        public RunnableC7814b(ycg<? super U> actual, nfg<U> bufferSupplier, long timespan, TimeUnit unit, woe scheduler) {
            super(actual, new t1b());
            this.f49992M2 = new AtomicReference<>();
            this.f49986G2 = bufferSupplier;
            this.f49987H2 = timespan;
            this.f49988I2 = unit;
            this.f49989J2 = scheduler;
        }

        @Override // p000.bnd, p000.vmd
        public /* bridge */ /* synthetic */ boolean accept(ycg a, Object v) {
            return accept((ycg<? super Collection>) a, (Collection) v);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f14220D2 = true;
            this.f49990K2.cancel();
            zf4.dispose(this.f49992M2);
        }

        @Override // p000.lf4
        public void dispose() {
            cancel();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f49992M2.get() == zf4.DISPOSED;
        }

        @Override // p000.ycg
        public void onComplete() {
            zf4.dispose(this.f49992M2);
            synchronized (this) {
                try {
                    U u = this.f49991L2;
                    if (u == null) {
                        return;
                    }
                    this.f49991L2 = null;
                    this.f14219C2.offer(u);
                    this.f14221E2 = true;
                    if (enter()) {
                        xmd.drainMaxLoop(this.f14219C2, this.f14218B2, false, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            zf4.dispose(this.f49992M2);
            synchronized (this) {
                this.f49991L2 = null;
            }
            this.f14218B2.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f49991L2;
                    if (u != null) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f49990K2, s)) {
                this.f49990K2 = s;
                try {
                    U u = this.f49986G2.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    this.f49991L2 = u;
                    this.f14218B2.onSubscribe(this);
                    if (this.f14220D2) {
                        return;
                    }
                    s.request(Long.MAX_VALUE);
                    woe woeVar = this.f49989J2;
                    long j = this.f49987H2;
                    lf4 lf4VarSchedulePeriodicallyDirect = woeVar.schedulePeriodicallyDirect(this, j, j, this.f49988I2);
                    if (v7b.m23844a(this.f49992M2, null, lf4VarSchedulePeriodicallyDirect)) {
                        return;
                    }
                    lf4VarSchedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    cancel();
                    w05.error(th, this.f14218B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            requested(n);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = this.f49986G2.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        U u3 = this.f49991L2;
                        if (u3 == null) {
                            return;
                        }
                        this.f49991L2 = u2;
                        m3258a(u3, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                cancel();
                this.f14218B2.onError(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            this.f14218B2.onNext((Object) u);
            return true;
        }
    }

    /* JADX INFO: renamed from: j96$c */
    public static final class RunnableC7815c<T, U extends Collection<? super T>> extends bnd<T, U, U> implements fdg, Runnable {

        /* JADX INFO: renamed from: G2 */
        public final nfg<U> f49993G2;

        /* JADX INFO: renamed from: H2 */
        public final long f49994H2;

        /* JADX INFO: renamed from: I2 */
        public final long f49995I2;

        /* JADX INFO: renamed from: J2 */
        public final TimeUnit f49996J2;

        /* JADX INFO: renamed from: K2 */
        public final woe.AbstractC14729c f49997K2;

        /* JADX INFO: renamed from: L2 */
        public final List<U> f49998L2;

        /* JADX INFO: renamed from: M2 */
        public fdg f49999M2;

        /* JADX INFO: renamed from: j96$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f50000a;

            public a(U buffer) {
                this.f50000a = buffer;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC7815c.this) {
                    RunnableC7815c.this.f49998L2.remove(this.f50000a);
                }
                RunnableC7815c runnableC7815c = RunnableC7815c.this;
                runnableC7815c.m3259b(this.f50000a, false, runnableC7815c.f49997K2);
            }
        }

        public RunnableC7815c(ycg<? super U> actual, nfg<U> bufferSupplier, long timespan, long timeskip, TimeUnit unit, woe.AbstractC14729c w) {
            super(actual, new t1b());
            this.f49993G2 = bufferSupplier;
            this.f49994H2 = timespan;
            this.f49995I2 = timeskip;
            this.f49996J2 = unit;
            this.f49997K2 = w;
            this.f49998L2 = new LinkedList();
        }

        @Override // p000.bnd, p000.vmd
        public /* bridge */ /* synthetic */ boolean accept(ycg a2, Object v) {
            return accept((ycg<? super Collection>) a2, (Collection) v);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f14220D2 = true;
            this.f49999M2.cancel();
            this.f49997K2.dispose();
            m13908d();
        }

        /* JADX INFO: renamed from: d */
        public void m13908d() {
            synchronized (this) {
                this.f49998L2.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f49998L2);
                this.f49998L2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f14219C2.offer((U) ((Collection) it.next()));
            }
            this.f14221E2 = true;
            if (enter()) {
                xmd.drainMaxLoop(this.f14219C2, this.f14218B2, false, this.f49997K2, this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f14221E2 = true;
            this.f49997K2.dispose();
            m13908d();
            this.f14218B2.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f49998L2.iterator();
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
            if (ldg.validate(this.f49999M2, s)) {
                this.f49999M2 = s;
                try {
                    U u = this.f49993G2.get();
                    Objects.requireNonNull(u, "The supplied buffer is null");
                    U u2 = u;
                    this.f49998L2.add(u2);
                    this.f14218B2.onSubscribe(this);
                    s.request(Long.MAX_VALUE);
                    woe.AbstractC14729c abstractC14729c = this.f49997K2;
                    long j = this.f49995I2;
                    abstractC14729c.schedulePeriodically(this, j, j, this.f49996J2);
                    this.f49997K2.schedule(new a(u2), this.f49994H2, this.f49996J2);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    this.f49997K2.dispose();
                    s.cancel();
                    w05.error(th, this.f14218B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            requested(n);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f14220D2) {
                return;
            }
            try {
                U u = this.f49993G2.get();
                Objects.requireNonNull(u, "The supplied buffer is null");
                U u2 = u;
                synchronized (this) {
                    try {
                        if (this.f14220D2) {
                            return;
                        }
                        this.f49998L2.add(u2);
                        this.f49997K2.schedule(new a(u2), this.f49994H2, this.f49996J2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                cancel();
                this.f14218B2.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(ycg<? super U> a2, U v) {
            a2.onNext(v);
            return true;
        }
    }

    public j96(l86<T> source, long timespan, long timeskip, TimeUnit unit, woe scheduler, nfg<U> bufferSupplier, int maxSize, boolean restartTimerOnMaxSize) {
        super(source);
        this.f49970c = timespan;
        this.f49971d = timeskip;
        this.f49972e = unit;
        this.f49973f = scheduler;
        this.f49974m = bufferSupplier;
        this.f49968C = maxSize;
        this.f49969F = restartTimerOnMaxSize;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super U> s) {
        if (this.f49970c == this.f49971d && this.f49968C == Integer.MAX_VALUE) {
            this.f49321b.subscribe((kj6) new RunnableC7814b(new u1f(s), this.f49974m, this.f49970c, this.f49972e, this.f49973f));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = this.f49973f.createWorker();
        if (this.f49970c == this.f49971d) {
            this.f49321b.subscribe((kj6) new RunnableC7813a(new u1f(s), this.f49974m, this.f49970c, this.f49972e, this.f49968C, this.f49969F, abstractC14729cCreateWorker));
        } else {
            this.f49321b.subscribe((kj6) new RunnableC7815c(new u1f(s), this.f49974m, this.f49970c, this.f49971d, this.f49972e, abstractC14729cCreateWorker));
        }
    }
}
