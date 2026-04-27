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
public final class tlb<T, U extends Collection<? super T>> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: C */
    public final boolean f85233C;

    /* JADX INFO: renamed from: b */
    public final long f85234b;

    /* JADX INFO: renamed from: c */
    public final long f85235c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f85236d;

    /* JADX INFO: renamed from: e */
    public final voe f85237e;

    /* JADX INFO: renamed from: f */
    public final Callable<U> f85238f;

    /* JADX INFO: renamed from: m */
    public final int f85239m;

    /* JADX INFO: renamed from: tlb$a */
    public static final class RunnableC13094a<T, U extends Collection<? super T>> extends and<T, U, U> implements Runnable, mf4 {

        /* JADX INFO: renamed from: A2 */
        public long f85240A2;

        /* JADX INFO: renamed from: q2 */
        public final Callable<U> f85241q2;

        /* JADX INFO: renamed from: r2 */
        public final long f85242r2;

        /* JADX INFO: renamed from: s2 */
        public final TimeUnit f85243s2;

        /* JADX INFO: renamed from: t2 */
        public final int f85244t2;

        /* JADX INFO: renamed from: u2 */
        public final boolean f85245u2;

        /* JADX INFO: renamed from: v2 */
        public final voe.AbstractC14185c f85246v2;

        /* JADX INFO: renamed from: w2 */
        public U f85247w2;

        /* JADX INFO: renamed from: x2 */
        public mf4 f85248x2;

        /* JADX INFO: renamed from: y2 */
        public mf4 f85249y2;

        /* JADX INFO: renamed from: z2 */
        public long f85250z2;

        public RunnableC13094a(oxb<? super U> oxbVar, Callable<U> callable, long j, TimeUnit timeUnit, int i, boolean z, voe.AbstractC14185c abstractC14185c) {
            super(oxbVar, new s1b());
            this.f85241q2 = callable;
            this.f85242r2 = j;
            this.f85243s2 = timeUnit;
            this.f85244t2 = i;
            this.f85245u2 = z;
            this.f85246v2 = abstractC14185c;
        }

        @Override // p000.and, p000.osb
        public /* bridge */ /* synthetic */ void accept(oxb oxbVar, Object obj) {
            accept((oxb<? super Collection>) oxbVar, (Collection) obj);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f2167n2) {
                return;
            }
            this.f2167n2 = true;
            this.f85249y2.dispose();
            this.f85246v2.dispose();
            synchronized (this) {
                this.f85247w2 = null;
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        @Override // p000.oxb
        public void onComplete() {
            U u;
            this.f85246v2.dispose();
            synchronized (this) {
                u = this.f85247w2;
                this.f85247w2 = null;
            }
            if (u != null) {
                this.f2166m2.offer(u);
                this.f2168o2 = true;
                if (enter()) {
                    ymd.drainLoop(this.f2166m2, this.f2165l2, false, this, this);
                }
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            synchronized (this) {
                this.f85247w2 = null;
            }
            this.f2165l2.onError(th);
            this.f85246v2.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f85247w2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                    if (u.size() < this.f85244t2) {
                        return;
                    }
                    this.f85247w2 = null;
                    this.f85250z2++;
                    if (this.f85245u2) {
                        this.f85248x2.dispose();
                    }
                    m935b(u, false, this);
                    try {
                        U u2 = (U) xjb.requireNonNull(this.f85241q2.call(), "The buffer supplied is null");
                        synchronized (this) {
                            this.f85247w2 = u2;
                            this.f85240A2++;
                        }
                        if (this.f85245u2) {
                            voe.AbstractC14185c abstractC14185c = this.f85246v2;
                            long j = this.f85242r2;
                            this.f85248x2 = abstractC14185c.schedulePeriodically(this, j, j, this.f85243s2);
                        }
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f2165l2.onError(th);
                        dispose();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85249y2, mf4Var)) {
                this.f85249y2 = mf4Var;
                try {
                    this.f85247w2 = (U) xjb.requireNonNull(this.f85241q2.call(), "The buffer supplied is null");
                    this.f2165l2.onSubscribe(this);
                    voe.AbstractC14185c abstractC14185c = this.f85246v2;
                    long j = this.f85242r2;
                    this.f85248x2 = abstractC14185c.schedulePeriodically(this, j, j, this.f85243s2);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    mf4Var.dispose();
                    c05.error(th, this.f2165l2);
                    this.f85246v2.dispose();
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                U u = (U) xjb.requireNonNull(this.f85241q2.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    U u2 = this.f85247w2;
                    if (u2 != null && this.f85250z2 == this.f85240A2) {
                        this.f85247w2 = u;
                        m935b(u2, false, this);
                    }
                }
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                dispose();
                this.f2165l2.onError(th);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(oxb<? super U> oxbVar, U u) {
            oxbVar.onNext(u);
        }
    }

    /* JADX INFO: renamed from: tlb$b */
    public static final class RunnableC13095b<T, U extends Collection<? super T>> extends and<T, U, U> implements Runnable, mf4 {

        /* JADX INFO: renamed from: q2 */
        public final Callable<U> f85251q2;

        /* JADX INFO: renamed from: r2 */
        public final long f85252r2;

        /* JADX INFO: renamed from: s2 */
        public final TimeUnit f85253s2;

        /* JADX INFO: renamed from: t2 */
        public final voe f85254t2;

        /* JADX INFO: renamed from: u2 */
        public mf4 f85255u2;

        /* JADX INFO: renamed from: v2 */
        public U f85256v2;

        /* JADX INFO: renamed from: w2 */
        public final AtomicReference<mf4> f85257w2;

        public RunnableC13095b(oxb<? super U> oxbVar, Callable<U> callable, long j, TimeUnit timeUnit, voe voeVar) {
            super(oxbVar, new s1b());
            this.f85257w2 = new AtomicReference<>();
            this.f85251q2 = callable;
            this.f85252r2 = j;
            this.f85253s2 = timeUnit;
            this.f85254t2 = voeVar;
        }

        @Override // p000.and, p000.osb
        public /* bridge */ /* synthetic */ void accept(oxb oxbVar, Object obj) {
            accept((oxb<? super Collection>) oxbVar, (Collection) obj);
        }

        @Override // p000.mf4
        public void dispose() {
            ag4.dispose(this.f85257w2);
            this.f85255u2.dispose();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f85257w2.get() == ag4.DISPOSED;
        }

        @Override // p000.oxb
        public void onComplete() {
            U u;
            synchronized (this) {
                u = this.f85256v2;
                this.f85256v2 = null;
            }
            if (u != null) {
                this.f2166m2.offer(u);
                this.f2168o2 = true;
                if (enter()) {
                    ymd.drainLoop(this.f2166m2, this.f2165l2, false, null, this);
                }
            }
            ag4.dispose(this.f85257w2);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            synchronized (this) {
                this.f85256v2 = null;
            }
            this.f2165l2.onError(th);
            ag4.dispose(this.f85257w2);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    U u = this.f85256v2;
                    if (u == null) {
                        return;
                    }
                    u.add(t);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85255u2, mf4Var)) {
                this.f85255u2 = mf4Var;
                try {
                    this.f85256v2 = (U) xjb.requireNonNull(this.f85251q2.call(), "The buffer supplied is null");
                    this.f2165l2.onSubscribe(this);
                    if (this.f2167n2) {
                        return;
                    }
                    voe voeVar = this.f85254t2;
                    long j = this.f85252r2;
                    mf4 mf4VarSchedulePeriodicallyDirect = voeVar.schedulePeriodicallyDirect(this, j, j, this.f85253s2);
                    if (v7b.m23844a(this.f85257w2, null, mf4VarSchedulePeriodicallyDirect)) {
                        return;
                    }
                    mf4VarSchedulePeriodicallyDirect.dispose();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    dispose();
                    c05.error(th, this.f2165l2);
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            U u;
            try {
                U u2 = (U) xjb.requireNonNull(this.f85251q2.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        u = this.f85256v2;
                        if (u != null) {
                            this.f85256v2 = u2;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (u == null) {
                    ag4.dispose(this.f85257w2);
                } else {
                    m934a(u, false, this);
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f2165l2.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        public void accept(oxb<? super U> oxbVar, U u) {
            this.f2165l2.onNext((Object) u);
        }
    }

    /* JADX INFO: renamed from: tlb$c */
    public static final class RunnableC13096c<T, U extends Collection<? super T>> extends and<T, U, U> implements Runnable, mf4 {

        /* JADX INFO: renamed from: q2 */
        public final Callable<U> f85258q2;

        /* JADX INFO: renamed from: r2 */
        public final long f85259r2;

        /* JADX INFO: renamed from: s2 */
        public final long f85260s2;

        /* JADX INFO: renamed from: t2 */
        public final TimeUnit f85261t2;

        /* JADX INFO: renamed from: u2 */
        public final voe.AbstractC14185c f85262u2;

        /* JADX INFO: renamed from: v2 */
        public final List<U> f85263v2;

        /* JADX INFO: renamed from: w2 */
        public mf4 f85264w2;

        /* JADX INFO: renamed from: tlb$c$a */
        public final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f85265a;

            public a(U u) {
                this.f85265a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC13096c.this) {
                    RunnableC13096c.this.f85263v2.remove(this.f85265a);
                }
                RunnableC13096c runnableC13096c = RunnableC13096c.this;
                runnableC13096c.m935b(this.f85265a, false, runnableC13096c.f85262u2);
            }
        }

        /* JADX INFO: renamed from: tlb$c$b */
        public final class b implements Runnable {

            /* JADX INFO: renamed from: a */
            public final U f85267a;

            public b(U u) {
                this.f85267a = u;
            }

            @Override // java.lang.Runnable
            public void run() {
                synchronized (RunnableC13096c.this) {
                    RunnableC13096c.this.f85263v2.remove(this.f85267a);
                }
                RunnableC13096c runnableC13096c = RunnableC13096c.this;
                runnableC13096c.m935b(this.f85267a, false, runnableC13096c.f85262u2);
            }
        }

        public RunnableC13096c(oxb<? super U> oxbVar, Callable<U> callable, long j, long j2, TimeUnit timeUnit, voe.AbstractC14185c abstractC14185c) {
            super(oxbVar, new s1b());
            this.f85258q2 = callable;
            this.f85259r2 = j;
            this.f85260s2 = j2;
            this.f85261t2 = timeUnit;
            this.f85262u2 = abstractC14185c;
            this.f85263v2 = new LinkedList();
        }

        @Override // p000.and, p000.osb
        public /* bridge */ /* synthetic */ void accept(oxb oxbVar, Object obj) {
            accept((oxb<? super Collection>) oxbVar, (Collection) obj);
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f2167n2) {
                return;
            }
            this.f2167n2 = true;
            m22716e();
            this.f85264w2.dispose();
            this.f85262u2.dispose();
        }

        /* JADX INFO: renamed from: e */
        public void m22716e() {
            synchronized (this) {
                this.f85263v2.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f2167n2;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onComplete() {
            ArrayList arrayList;
            synchronized (this) {
                arrayList = new ArrayList(this.f85263v2);
                this.f85263v2.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f2166m2.offer((U) ((Collection) it.next()));
            }
            this.f2168o2 = true;
            if (enter()) {
                ymd.drainLoop(this.f2166m2, this.f2165l2, false, this.f85262u2, this);
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f2168o2 = true;
            m22716e();
            this.f2165l2.onError(th);
            this.f85262u2.dispose();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            synchronized (this) {
                try {
                    Iterator<U> it = this.f85263v2.iterator();
                    while (it.hasNext()) {
                        it.next().add(t);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f85264w2, mf4Var)) {
                this.f85264w2 = mf4Var;
                try {
                    Collection collection = (Collection) xjb.requireNonNull(this.f85258q2.call(), "The buffer supplied is null");
                    this.f85263v2.add((U) collection);
                    this.f2165l2.onSubscribe(this);
                    voe.AbstractC14185c abstractC14185c = this.f85262u2;
                    long j = this.f85260s2;
                    abstractC14185c.schedulePeriodically(this, j, j, this.f85261t2);
                    this.f85262u2.schedule(new b(collection), this.f85259r2, this.f85261t2);
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    mf4Var.dispose();
                    c05.error(th, this.f2165l2);
                    this.f85262u2.dispose();
                }
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // java.lang.Runnable
        public void run() {
            if (this.f2167n2) {
                return;
            }
            try {
                Collection collection = (Collection) xjb.requireNonNull(this.f85258q2.call(), "The bufferSupplier returned a null buffer");
                synchronized (this) {
                    try {
                        if (this.f2167n2) {
                            return;
                        }
                        this.f85263v2.add((U) collection);
                        this.f85262u2.schedule(new a(collection), this.f85259r2, this.f85261t2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f2165l2.onError(th2);
                dispose();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void accept(oxb<? super U> oxbVar, U u) {
            oxbVar.onNext(u);
        }
    }

    public tlb(xub<T> xubVar, long j, long j2, TimeUnit timeUnit, voe voeVar, Callable<U> callable, int i, boolean z) {
        super(xubVar);
        this.f85234b = j;
        this.f85235c = j2;
        this.f85236d = timeUnit;
        this.f85237e = voeVar;
        this.f85238f = callable;
        this.f85239m = i;
        this.f85233C = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        if (this.f85234b == this.f85235c && this.f85239m == Integer.MAX_VALUE) {
            this.f66354a.subscribe(new RunnableC13095b(new n1f(oxbVar), this.f85238f, this.f85234b, this.f85236d, this.f85237e));
            return;
        }
        voe.AbstractC14185c abstractC14185cCreateWorker = this.f85237e.createWorker();
        if (this.f85234b == this.f85235c) {
            this.f66354a.subscribe(new RunnableC13094a(new n1f(oxbVar), this.f85238f, this.f85234b, this.f85236d, this.f85239m, this.f85233C, abstractC14185cCreateWorker));
        } else {
            this.f66354a.subscribe(new RunnableC13096c(new n1f(oxbVar), this.f85238f, this.f85234b, this.f85235c, this.f85236d, abstractC14185cCreateWorker));
        }
    }
}
