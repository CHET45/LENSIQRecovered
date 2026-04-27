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
public final class ulb<T, U extends Collection<? super T>> extends AbstractC9666n3<T, U> {

    /* JADX INFO: renamed from: C */
    public final boolean f88364C;

    /* JADX INFO: renamed from: b */
    public final long f88365b;

    /* JADX INFO: renamed from: c */
    public final long f88366c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f88367d;

    /* JADX INFO: renamed from: e */
    public final woe f88368e;

    /* JADX INFO: renamed from: f */
    public final nfg<U> f88369f;

    /* JADX INFO: renamed from: m */
    public final int f88370m;

    /* JADX INFO: renamed from: ulb$a */
    public static final class RunnableC13585a<T, U extends Collection<? super T>> extends zmd<T, U, U> implements Runnable, lf4 {

        /* JADX INFO: renamed from: A2 */
        public long f88371A2;

        /* JADX INFO: renamed from: q2 */
        public final nfg<U> f88372q2;

        /* JADX INFO: renamed from: r2 */
        public final long f88373r2;

        /* JADX INFO: renamed from: s2 */
        public final TimeUnit f88374s2;

        /* JADX INFO: renamed from: t2 */
        public final int f88375t2;

        /* JADX INFO: renamed from: u2 */
        public final boolean f88376u2;

        /* JADX INFO: renamed from: v2 */
        public final woe.AbstractC14729c f88377v2;

        /* JADX INFO: renamed from: w2 */
        public U f88378w2;

        /* JADX INFO: renamed from: x2 */
        public lf4 f88379x2;

        /* JADX INFO: renamed from: y2 */
        public lf4 f88380y2;

        /* JADX INFO: renamed from: z2 */
        public long f88381z2;

        public RunnableC13585a(pxb<? super U> actual, nfg<U> bufferSupplier, long timespan, TimeUnit unit, int maxSize, boolean restartOnMaxSize, woe.AbstractC14729c w) {
            super(actual, new t1b());
            this.f88372q2 = bufferSupplier;
            this.f88373r2 = timespan;
            this.f88374s2 = unit;
            this.f88375t2 = maxSize;
            this.f88376u2 = restartOnMaxSize;
            this.f88377v2 = w;
        }

        @Override // p000.zmd, p000.nsb
        public /* bridge */ /* synthetic */ void accept(pxb a, Object v) {
            accept((pxb<? super Collection>) a, (Collection) v);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f105483n2) {
                return;
            }
            this.f105483n2 = true;
            this.f88380y2.dispose();
            this.f88377v2.dispose();
            synchronized (this) {
                this.f88378w2 = null;
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105483n2;
        }

        @Override // p000.pxb
        public void onComplete() {
            U u;
            this.f88377v2.dispose();
            synchronized (this) {
                u = this.f88378w2;
                this.f88378w2 = null;
            }
            if (u != null) {
                this.f105482m2.offer(u);
                this.f105484o2 = true;
                if (enter()) {
                    xmd.drainLoop(this.f105482m2, this.f105481l2, false, this, this);
                }
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            synchronized (this) {
                this.f88378w2 = null;
            }
            this.f105481l2.onError(t);
            this.f88377v2.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f88378w2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.f88375t2) {
                        return;
                    }
                    this.f88378w2 = null;
                    this.f88381z2++;
                    if (this.f88376u2) {
                        this.f88379x2.dispose();
                    }
                    m26901b(u, false, this);
                    try {
                        U u2 = this.f88372q2.get();
                        Objects.requireNonNull(u2, "The buffer supplied is null");
                        U u3 = u2;
                        synchronized (this) {
                            this.f88378w2 = u3;
                            this.f88371A2++;
                        }
                        if (this.f88376u2) {
                            woe.AbstractC14729c abstractC14729c = this.f88377v2;
                            long j = this.f88373r2;
                            this.f88379x2 = abstractC14729c.schedulePeriodically(this, j, j, this.f88374s2);
                        }
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f105481l2.onError(th);
                        dispose();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f88380y2, d)) {
                this.f88380y2 = d;
                try {
                    U u = this.f88372q2.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.f88378w2 = u;
                    this.f105481l2.onSubscribe(this);
                    woe.AbstractC14729c abstractC14729c = this.f88377v2;
                    long j = this.f88373r2;
                    this.f88379x2 = abstractC14729c.schedulePeriodically(this, j, j, this.f88374s2);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    d.dispose();
                    b05.error(th, this.f105481l2);
                    this.f88377v2.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = this.f88372q2.get();
                Objects.requireNonNull(u, "The bufferSupplier returned a null buffer");
                U u2 = u;
                synchronized (this) {
                    U u3 = this.f88378w2;
                    if (u3 != null && this.f88381z2 == this.f88371A2) {
                        this.f88378w2 = u2;
                        m26901b(u3, false, this);
                    }
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                dispose();
                this.f105481l2.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(pxb<? super U> a, U v) {
            a.onNext(v);
        }
    }

    /* JADX INFO: renamed from: ulb$b */
    public static final class RunnableC13586b<T, U extends Collection<? super T>> extends zmd<T, U, U> implements Runnable, lf4 {

        /* JADX INFO: renamed from: q2 */
        public final nfg<U> f88382q2;

        /* JADX INFO: renamed from: r2 */
        public final long f88383r2;

        /* JADX INFO: renamed from: s2 */
        public final TimeUnit f88384s2;

        /* JADX INFO: renamed from: t2 */
        public final woe f88385t2;

        /* JADX INFO: renamed from: u2 */
        public lf4 f88386u2;

        /* JADX INFO: renamed from: v2 */
        public U f88387v2;

        /* JADX INFO: renamed from: w2 */
        public final AtomicReference<lf4> f88388w2;

        public RunnableC13586b(pxb<? super U> actual, nfg<U> bufferSupplier, long timespan, TimeUnit unit, woe scheduler) {
            super(actual, new t1b());
            this.f88388w2 = new AtomicReference<>();
            this.f88382q2 = bufferSupplier;
            this.f88383r2 = timespan;
            this.f88384s2 = unit;
            this.f88385t2 = scheduler;
        }

        @Override // p000.zmd, p000.nsb
        public /* bridge */ /* synthetic */ void accept(pxb a, Object v) {
            accept((pxb<? super Collection>) a, (Collection) v);
        }

        @Override // p000.lf4
        public void dispose() {
            zf4.dispose(this.f88388w2);
            this.f88386u2.dispose();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f88388w2.get() == zf4.DISPOSED;
        }

        @Override // p000.pxb
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f88387v2;
                this.f88387v2 = null;
            }
            if (u != null) {
                this.f105482m2.offer(u);
                this.f105484o2 = true;
                if (enter()) {
                    xmd.drainLoop(this.f105482m2, this.f105481l2, false, null, this);
                }
            }
            zf4.dispose(this.f88388w2);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            synchronized (this) {
                this.f88387v2 = null;
            }
            this.f105481l2.onError(t);
            zf4.dispose(this.f88388w2);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f88387v2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f88386u2, d)) {
                this.f88386u2 = d;
                try {
                    U u = this.f88382q2.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    this.f88387v2 = u;
                    this.f105481l2.onSubscribe(this);
                    if (zf4.isDisposed(this.f88388w2.get())) {
                        return;
                    }
                    woe woeVar = this.f88385t2;
                    long j = this.f88383r2;
                    zf4.set(this.f88388w2, woeVar.schedulePeriodicallyDirect(this, j, j, this.f88384s2));
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    dispose();
                    b05.error(th, this.f105481l2);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = this.f88382q2.get();
                Objects.requireNonNull(u2, "The bufferSupplier returned a null buffer");
                U u3 = u2;
                synchronized (this) {
                    try {
                        u = this.f88387v2;
                        if (u != null) {
                            this.f88387v2 = u3;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (u == null) {
                    zf4.dispose(this.f88388w2);
                } else {
                    m26900a(u, false, this);
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f105481l2.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(pxb<? super U> pxbVar, U u) {
            this.f105481l2.onNext((Object) u);
        }
    }

    /* JADX INFO: renamed from: ulb$c */
    public static final class RunnableC13587c<T, U extends Collection<? super T>> extends zmd<T, U, U> implements Runnable, lf4 {

        /* JADX INFO: renamed from: q2 */
        public final nfg<U> f88389q2;

        /* JADX INFO: renamed from: r2 */
        public final long f88390r2;

        /* JADX INFO: renamed from: s2 */
        public final long f88391s2;

        /* JADX INFO: renamed from: t2 */
        public final TimeUnit f88392t2;

        /* JADX INFO: renamed from: u2 */
        public final woe.AbstractC14729c f88393u2;

        /* JADX INFO: renamed from: v2 */
        public final List<U> f88394v2;

        /* JADX INFO: renamed from: w2 */
        public lf4 f88395w2;

        /* JADX INFO: renamed from: ulb$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f88396a;

            public a(U b) {
                this.f88396a = b;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC13587c.this) {
                    RunnableC13587c.this.f88394v2.remove(this.f88396a);
                }
                RunnableC13587c runnableC13587c = RunnableC13587c.this;
                runnableC13587c.m26901b(this.f88396a, false, runnableC13587c.f88393u2);
            }
        }

        /* JADX INFO: renamed from: ulb$c$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f88398a;

            public b(U buffer) {
                this.f88398a = buffer;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC13587c.this) {
                    RunnableC13587c.this.f88394v2.remove(this.f88398a);
                }
                RunnableC13587c runnableC13587c = RunnableC13587c.this;
                runnableC13587c.m26901b(this.f88398a, false, runnableC13587c.f88393u2);
            }
        }

        public RunnableC13587c(pxb<? super U> actual, nfg<U> bufferSupplier, long timespan, long timeskip, TimeUnit unit, woe.AbstractC14729c w) {
            super(actual, new t1b());
            this.f88389q2 = bufferSupplier;
            this.f88390r2 = timespan;
            this.f88391s2 = timeskip;
            this.f88392t2 = unit;
            this.f88393u2 = w;
            this.f88394v2 = new LinkedList();
        }

        @Override // p000.zmd, p000.nsb
        public /* bridge */ /* synthetic */ void accept(pxb a2, Object v) {
            accept((pxb<? super Collection>) a2, (Collection) v);
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f105483n2) {
                return;
            }
            this.f105483n2 = true;
            m23421e();
            this.f88395w2.dispose();
            this.f88393u2.dispose();
        }

        /* JADX INFO: renamed from: e */
        public void m23421e() {
            synchronized (this) {
                this.f88394v2.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f105483n2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.pxb
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f88394v2);
                this.f88394v2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f105482m2.offer((U) ((Collection) it.next()));
            }
            this.f105484o2 = true;
            if (enter()) {
                xmd.drainLoop(this.f105482m2, this.f105481l2, false, this.f88393u2, this);
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f105484o2 = true;
            m23421e();
            this.f105481l2.onError(t);
            this.f88393u2.dispose();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f88394v2.iterator();
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
            if (zf4.validate(this.f88395w2, d)) {
                this.f88395w2 = d;
                try {
                    U u = this.f88389q2.get();
                    Objects.requireNonNull(u, "The buffer supplied is null");
                    U u2 = u;
                    this.f88394v2.add(u2);
                    this.f105481l2.onSubscribe(this);
                    woe.AbstractC14729c abstractC14729c = this.f88393u2;
                    long j = this.f88391s2;
                    abstractC14729c.schedulePeriodically(this, j, j, this.f88392t2);
                    this.f88393u2.schedule(new b(u2), this.f88390r2, this.f88392t2);
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    d.dispose();
                    b05.error(th, this.f105481l2);
                    this.f88393u2.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f105483n2) {
                return;
            }
            try {
                U u = this.f88389q2.get();
                Objects.requireNonNull(u, "The bufferSupplier returned a null buffer");
                U u2 = u;
                synchronized (this) {
                    try {
                        if (this.f105483n2) {
                            return;
                        }
                        this.f88394v2.add(u2);
                        this.f88393u2.schedule(new a(u2), this.f88390r2, this.f88392t2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                this.f105481l2.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(pxb<? super U> a2, U v) {
            a2.onNext(v);
        }
    }

    public ulb(wub<T> source, long timespan, long timeskip, TimeUnit unit, woe scheduler, nfg<U> bufferSupplier, int maxSize, boolean restartTimerOnMaxSize) {
        super(source);
        this.f88365b = timespan;
        this.f88366c = timeskip;
        this.f88367d = unit;
        this.f88368e = scheduler;
        this.f88369f = bufferSupplier;
        this.f88370m = maxSize;
        this.f88364C = restartTimerOnMaxSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super U> t) {
        if (this.f88365b == this.f88366c && this.f88370m == Integer.MAX_VALUE) {
            this.f63101a.subscribe(new RunnableC13586b(new m1f(t), this.f88369f, this.f88365b, this.f88367d, this.f88368e));
            return;
        }
        woe.AbstractC14729c abstractC14729cCreateWorker = this.f88368e.createWorker();
        if (this.f88365b == this.f88366c) {
            this.f63101a.subscribe(new RunnableC13585a(new m1f(t), this.f88369f, this.f88365b, this.f88367d, this.f88370m, this.f88364C, abstractC14729cCreateWorker));
        } else {
            this.f63101a.subscribe(new RunnableC13587c(new m1f(t), this.f88369f, this.f88365b, this.f88366c, this.f88367d, abstractC14729cCreateWorker));
        }
    }
}
