package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class i96<T, U extends Collection<? super T>> extends AbstractC8162k1<T, U> {

    /* JADX INFO: renamed from: C */
    public final int f46099C;

    /* JADX INFO: renamed from: F */
    public final boolean f46100F;

    /* JADX INFO: renamed from: c */
    public final long f46101c;

    /* JADX INFO: renamed from: d */
    public final long f46102d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f46103e;

    /* JADX INFO: renamed from: f */
    public final voe f46104f;

    /* JADX INFO: renamed from: m */
    public final Callable<U> f46105m;

    /* JADX INFO: renamed from: i96$a */
    public static final class RunnableC7193a<T, U extends Collection<? super T>> extends cnd<T, U, U> implements fdg, Runnable, mf4 {

        /* JADX INFO: renamed from: G2 */
        public final Callable<U> f46106G2;

        /* JADX INFO: renamed from: H2 */
        public final long f46107H2;

        /* JADX INFO: renamed from: I2 */
        public final TimeUnit f46108I2;

        /* JADX INFO: renamed from: J2 */
        public final int f46109J2;

        /* JADX INFO: renamed from: K2 */
        public final boolean f46110K2;

        /* JADX INFO: renamed from: L2 */
        public final voe.AbstractC14185c f46111L2;

        /* JADX INFO: renamed from: M2 */
        public U f46112M2;

        /* JADX INFO: renamed from: N2 */
        public mf4 f46113N2;

        /* JADX INFO: renamed from: O2 */
        public fdg f46114O2;

        /* JADX INFO: renamed from: P2 */
        public long f46115P2;

        /* JADX INFO: renamed from: Q2 */
        public long f46116Q2;

        public RunnableC7193a(ycg<? super U> ycgVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, voe.AbstractC14185c abstractC14185c) {
            super(ycgVar, new s1b());
            this.f46106G2 = callable;
            this.f46107H2 = j;
            this.f46108I2 = timeUnit;
            this.f46109J2 = i;
            this.f46110K2 = z;
            this.f46111L2 = abstractC14185c;
        }

        @Override // p000.cnd, p000.wmd
        public /* bridge */ /* synthetic */ boolean accept(ycg ycgVar, Object obj) {
            return accept((ycg<? super Collection>) ycgVar, (Collection) obj);
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f17085D2) {
                return;
            }
            this.f17085D2 = true;
            dispose();
        }

        @Override // p000.mf4
        public void dispose() {
            synchronized (this) {
                this.f46112M2 = null;
            }
            this.f46114O2.cancel();
            this.f46111L2.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f46111L2.isDisposed();
        }

        @Override // p000.ycg
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f46112M2;
                this.f46112M2 = null;
            }
            if (u != null) {
                this.f17084C2.offer(u);
                this.f17086E2 = true;
                if (enter()) {
                    ymd.drainMaxLoop(this.f17084C2, this.f17083B2, false, this, this);
                }
                this.f46111L2.dispose();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            synchronized (this) {
                this.f46112M2 = null;
            }
            this.f17083B2.onError(th);
            this.f46111L2.dispose();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f46112M2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.f46109J2) {
                        return;
                    }
                    this.f46112M2 = null;
                    this.f46115P2++;
                    if (this.f46110K2) {
                        this.f46113N2.dispose();
                    }
                    m4091b(u, false, this);
                    try {
                        U u2 = (U) xjb.requireNonNull(this.f46106G2.call(), "The supplied buffer is null");
                        synchronized (this) {
                            this.f46112M2 = u2;
                            this.f46116Q2++;
                        }
                        if (this.f46110K2) {
                            voe.AbstractC14185c abstractC14185c = this.f46111L2;
                            long j = this.f46107H2;
                            this.f46113N2 = abstractC14185c.schedulePeriodically(this, j, j, this.f46108I2);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        cancel();
                        this.f17083B2.onError(th);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f46114O2, fdgVar)) {
                this.f46114O2 = fdgVar;
                try {
                    this.f46112M2 = (U) xjb.requireNonNull(this.f46106G2.call(), "The supplied buffer is null");
                    this.f17083B2.onSubscribe(this);
                    voe.AbstractC14185c abstractC14185c = this.f46111L2;
                    long j = this.f46107H2;
                    this.f46113N2 = abstractC14185c.schedulePeriodically(this, j, j, this.f46108I2);
                    fdgVar.request(Long.MAX_VALUE);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f46111L2.dispose();
                    fdgVar.cancel();
                    x05.error(th, this.f17083B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) xjb.requireNonNull(this.f46106G2.call(), "The supplied buffer is null");
                synchronized (this) {
                    U u2 = this.f46112M2;
                    if (u2 != null && this.f46115P2 == this.f46116Q2) {
                        this.f46112M2 = u;
                        m4091b(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                cancel();
                this.f17083B2.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            ycgVar.onNext(u);
            return true;
        }
    }

    /* JADX INFO: renamed from: i96$b */
    public static final class RunnableC7194b<T, U extends Collection<? super T>> extends cnd<T, U, U> implements fdg, Runnable, mf4 {

        /* JADX INFO: renamed from: G2 */
        public final Callable<U> f46117G2;

        /* JADX INFO: renamed from: H2 */
        public final long f46118H2;

        /* JADX INFO: renamed from: I2 */
        public final TimeUnit f46119I2;

        /* JADX INFO: renamed from: J2 */
        public final voe f46120J2;

        /* JADX INFO: renamed from: K2 */
        public fdg f46121K2;

        /* JADX INFO: renamed from: L2 */
        public U f46122L2;

        /* JADX INFO: renamed from: M2 */
        public final AtomicReference<mf4> f46123M2;

        public RunnableC7194b(ycg<? super U> ycgVar, Callable<U> callable, long j, TimeUnit timeUnit, voe voeVar) {
            super(ycgVar, new s1b());
            this.f46123M2 = new AtomicReference<>();
            this.f46117G2 = callable;
            this.f46118H2 = j;
            this.f46119I2 = timeUnit;
            this.f46120J2 = voeVar;
        }

        @Override // p000.cnd, p000.wmd
        public /* bridge */ /* synthetic */ boolean accept(ycg ycgVar, Object obj) {
            return accept((ycg<? super Collection>) ycgVar, (Collection) obj);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f17085D2 = true;
            this.f46121K2.cancel();
            ag4.dispose(this.f46123M2);
        }

        @Override // p000.mf4
        public void dispose() {
            cancel();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f46123M2.get() == ag4.DISPOSED;
        }

        @Override // p000.ycg
        public void onComplete() {
            ag4.dispose(this.f46123M2);
            synchronized (this) {
                try {
                    U u = this.f46122L2;
                    if (u == null) {
                        return;
                    }
                    this.f46122L2 = null;
                    this.f17084C2.offer(u);
                    this.f17086E2 = true;
                    if (enter()) {
                        ymd.drainMaxLoop(this.f17084C2, this.f17083B2, false, null, this);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            ag4.dispose(this.f46123M2);
            synchronized (this) {
                this.f46122L2 = null;
            }
            this.f17083B2.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f46122L2;
                    if (u != null) {
                        u.add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f46121K2, fdgVar)) {
                this.f46121K2 = fdgVar;
                try {
                    this.f46122L2 = (U) xjb.requireNonNull(this.f46117G2.call(), "The supplied buffer is null");
                    this.f17083B2.onSubscribe(this);
                    if (this.f17085D2) {
                        return;
                    }
                    fdgVar.request(Long.MAX_VALUE);
                    voe voeVar = this.f46120J2;
                    long j = this.f46118H2;
                    mf4 mf4VarSchedulePeriodicallyDirect = voeVar.schedulePeriodicallyDirect(this, j, j, this.f46119I2);
                    if (v7b.m23844a(this.f46123M2, null, mf4VarSchedulePeriodicallyDirect)) {
                        return;
                    }
                    mf4VarSchedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    cancel();
                    x05.error(th, this.f17083B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) xjb.requireNonNull(this.f46117G2.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        U u2 = this.f46122L2;
                        if (u2 == null) {
                            return;
                        }
                        this.f46122L2 = u;
                        m4090a(u2, false, this);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                cancel();
                this.f17083B2.onError(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            this.f17083B2.onNext((Object) u);
            return true;
        }
    }

    /* JADX INFO: renamed from: i96$c */
    public static final class RunnableC7195c<T, U extends Collection<? super T>> extends cnd<T, U, U> implements fdg, Runnable {

        /* JADX INFO: renamed from: G2 */
        public final Callable<U> f46124G2;

        /* JADX INFO: renamed from: H2 */
        public final long f46125H2;

        /* JADX INFO: renamed from: I2 */
        public final long f46126I2;

        /* JADX INFO: renamed from: J2 */
        public final TimeUnit f46127J2;

        /* JADX INFO: renamed from: K2 */
        public final voe.AbstractC14185c f46128K2;

        /* JADX INFO: renamed from: L2 */
        public final List<U> f46129L2;

        /* JADX INFO: renamed from: M2 */
        public fdg f46130M2;

        /* JADX INFO: renamed from: i96$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f46131a;

            public a(U u) {
                this.f46131a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC7195c.this) {
                    RunnableC7195c.this.f46129L2.remove(this.f46131a);
                }
                RunnableC7195c runnableC7195c = RunnableC7195c.this;
                runnableC7195c.m4091b(this.f46131a, false, runnableC7195c.f46128K2);
            }
        }

        public RunnableC7195c(ycg<? super U> ycgVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            super(ycgVar, new s1b());
            this.f46124G2 = callable;
            this.f46125H2 = j;
            this.f46126I2 = j2;
            this.f46127J2 = timeUnit;
            this.f46128K2 = abstractC14185c;
            this.f46129L2 = new LinkedList();
        }

        @Override // p000.cnd, p000.wmd
        public /* bridge */ /* synthetic */ boolean accept(ycg ycgVar, Object obj) {
            return accept((ycg<? super Collection>) ycgVar, (Collection) obj);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f17085D2 = true;
            this.f46130M2.cancel();
            this.f46128K2.dispose();
            m12875d();
        }

        /* JADX INFO: renamed from: d */
        public void m12875d() {
            synchronized (this) {
                this.f46129L2.clear();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f46129L2);
                this.f46129L2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f17084C2.offer((U) ((Collection) it.next()));
            }
            this.f17086E2 = true;
            if (enter()) {
                ymd.drainMaxLoop(this.f17084C2, this.f17083B2, false, this.f46128K2, this);
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f17086E2 = true;
            this.f46128K2.dispose();
            m12875d();
            this.f17083B2.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f46129L2.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f46130M2, fdgVar)) {
                this.f46130M2 = fdgVar;
                try {
                    Collection collection = (Collection) xjb.requireNonNull(this.f46124G2.call(), "The supplied buffer is null");
                    this.f46129L2.add((U) collection);
                    this.f17083B2.onSubscribe(this);
                    fdgVar.request(Long.MAX_VALUE);
                    voe.AbstractC14185c abstractC14185c = this.f46128K2;
                    long j = this.f46126I2;
                    abstractC14185c.schedulePeriodically(this, j, j, this.f46127J2);
                    this.f46128K2.schedule(new a(collection), this.f46125H2, this.f46127J2);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    this.f46128K2.dispose();
                    fdgVar.cancel();
                    x05.error(th, this.f17083B2);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            requested(j);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f17085D2) {
                return;
            }
            try {
                Collection collection = (Collection) xjb.requireNonNull(this.f46124G2.call(), "The supplied buffer is null");
                synchronized (this) {
                    try {
                        if (this.f17085D2) {
                            return;
                        }
                        this.f46129L2.add((U) collection);
                        this.f46128K2.schedule(new a(collection), this.f46125H2, this.f46127J2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                cancel();
                this.f17083B2.onError(th2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean accept(ycg<? super U> ycgVar, U u) {
            ycgVar.onNext(u);
            return true;
        }
    }

    public i96(m86<T> m86Var, long j, long j2, TimeUnit timeUnit, voe voeVar, Callable<U> callable, int i, boolean z) {
        super(m86Var);
        this.f46101c = j;
        this.f46102d = j2;
        this.f46103e = timeUnit;
        this.f46104f = voeVar;
        this.f46105m = callable;
        this.f46099C = i;
        this.f46100F = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        if (this.f46101c == this.f46102d && this.f46099C == Integer.MAX_VALUE) {
            this.f52360b.subscribe((lj6) new RunnableC7194b(new t1f(ycgVar), this.f46105m, this.f46101c, this.f46103e, this.f46104f));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = this.f46104f.createWorker();
        if (this.f46101c == this.f46102d) {
            this.f52360b.subscribe((lj6) new RunnableC7193a(new t1f(ycgVar), this.f46105m, this.f46101c, this.f46103e, this.f46099C, this.f46100F, abstractC14185cCreateWorker));
        } else {
            this.f52360b.subscribe((lj6) new RunnableC7195c(new t1f(ycgVar), this.f46105m, this.f46101c, this.f46102d, this.f46103e, abstractC14185cCreateWorker));
        }
    }
}
