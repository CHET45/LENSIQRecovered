package p000;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class ul6<T> extends AbstractC7714j1<T, l86<T>> {

    /* JADX INFO: renamed from: C */
    public final int f88317C;

    /* JADX INFO: renamed from: F */
    public final boolean f88318F;

    /* JADX INFO: renamed from: c */
    public final long f88319c;

    /* JADX INFO: renamed from: d */
    public final long f88320d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f88321e;

    /* JADX INFO: renamed from: f */
    public final woe f88322f;

    /* JADX INFO: renamed from: m */
    public final long f88323m;

    /* JADX INFO: renamed from: ul6$a */
    public static abstract class AbstractC13579a<T> extends AtomicInteger implements kj6<T>, fdg {
        private static final long serialVersionUID = 5724293814035355511L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f88324C;

        /* JADX INFO: renamed from: F */
        public Throwable f88325F;

        /* JADX INFO: renamed from: H */
        public fdg f88326H;

        /* JADX INFO: renamed from: M */
        public volatile boolean f88328M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f88330a;

        /* JADX INFO: renamed from: c */
        public final long f88332c;

        /* JADX INFO: renamed from: d */
        public final TimeUnit f88333d;

        /* JADX INFO: renamed from: e */
        public final int f88334e;

        /* JADX INFO: renamed from: m */
        public long f88336m;

        /* JADX INFO: renamed from: b */
        public final tif<Object> f88331b = new t1b();

        /* JADX INFO: renamed from: f */
        public final AtomicLong f88335f = new AtomicLong();

        /* JADX INFO: renamed from: L */
        public final AtomicBoolean f88327L = new AtomicBoolean();

        /* JADX INFO: renamed from: N */
        public final AtomicInteger f88329N = new AtomicInteger(1);

        public AbstractC13579a(ycg<? super l86<T>> downstream, long timespan, TimeUnit unit, int bufferSize) {
            this.f88330a = downstream;
            this.f88332c = timespan;
            this.f88333d = unit;
            this.f88334e = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo23411a();

        /* JADX INFO: renamed from: b */
        public abstract void mo23412b();

        /* JADX INFO: renamed from: c */
        public abstract void mo23413c();

        @Override // p000.fdg
        public final void cancel() {
            if (this.f88327L.compareAndSet(false, true)) {
                m23414d();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m23414d() {
            if (this.f88329N.decrementAndGet() == 0) {
                mo23411a();
                this.f88326H.cancel();
                this.f88328M = true;
                mo23413c();
            }
        }

        @Override // p000.ycg
        public final void onComplete() {
            this.f88324C = true;
            mo23413c();
        }

        @Override // p000.ycg
        public final void onError(Throwable t) {
            this.f88325F = t;
            this.f88324C = true;
            mo23413c();
        }

        @Override // p000.ycg
        public final void onNext(T t) {
            this.f88331b.offer(t);
            mo23413c();
        }

        @Override // p000.kj6, p000.ycg
        public final void onSubscribe(fdg s) {
            if (ldg.validate(this.f88326H, s)) {
                this.f88326H = s;
                this.f88330a.onSubscribe(this);
                mo23412b();
            }
        }

        @Override // p000.fdg
        public final void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f88335f, n);
            }
        }
    }

    /* JADX INFO: renamed from: ul6$b */
    public static final class RunnableC13580b<T> extends AbstractC13579a<T> implements Runnable {
        private static final long serialVersionUID = -6130475889925953722L;

        /* JADX INFO: renamed from: M1 */
        public long f88337M1;

        /* JADX INFO: renamed from: Q */
        public final woe f88338Q;

        /* JADX INFO: renamed from: V1 */
        public nsh<T> f88339V1;

        /* JADX INFO: renamed from: X */
        public final boolean f88340X;

        /* JADX INFO: renamed from: Y */
        public final long f88341Y;

        /* JADX INFO: renamed from: Z */
        public final woe.AbstractC14729c f88342Z;

        /* JADX INFO: renamed from: Z1 */
        public final a0f f88343Z1;

        /* JADX INFO: renamed from: ul6$b$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final RunnableC13580b<?> f88344a;

            /* JADX INFO: renamed from: b */
            public final long f88345b;

            public a(RunnableC13580b<?> parent, long index) {
                this.f88344a = parent;
                this.f88345b = index;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f88344a.m23415e(this);
            }
        }

        public RunnableC13580b(ycg<? super l86<T>> actual, long timespan, TimeUnit unit, woe scheduler, int bufferSize, long maxSize, boolean restartTimerOnMaxSize) {
            super(actual, timespan, unit, bufferSize);
            this.f88338Q = scheduler;
            this.f88341Y = maxSize;
            this.f88340X = restartTimerOnMaxSize;
            if (restartTimerOnMaxSize) {
                this.f88342Z = scheduler.createWorker();
            } else {
                this.f88342Z = null;
            }
            this.f88343Z1 = new a0f();
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: a */
        public void mo23411a() {
            this.f88343Z1.dispose();
            woe.AbstractC14729c abstractC14729c = this.f88342Z;
            if (abstractC14729c != null) {
                abstractC14729c.dispose();
            }
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: b */
        public void mo23412b() {
            if (this.f88327L.get()) {
                return;
            }
            if (this.f88335f.get() == 0) {
                this.f88326H.cancel();
                this.f88330a.onError(new bwa(ul6.m23410b(this.f88336m)));
                mo23411a();
                this.f88328M = true;
                return;
            }
            this.f88336m = 1L;
            this.f88329N.getAndIncrement();
            this.f88339V1 = nsh.create(this.f88334e, this);
            sl6 sl6Var = new sl6(this.f88339V1);
            this.f88330a.onNext(sl6Var);
            a aVar = new a(this, 1L);
            if (this.f88340X) {
                a0f a0fVar = this.f88343Z1;
                woe.AbstractC14729c abstractC14729c = this.f88342Z;
                long j = this.f88332c;
                a0fVar.replace(abstractC14729c.schedulePeriodically(aVar, j, j, this.f88333d));
            } else {
                a0f a0fVar2 = this.f88343Z1;
                woe woeVar = this.f88338Q;
                long j2 = this.f88332c;
                a0fVar2.replace(woeVar.schedulePeriodicallyDirect(aVar, j2, j2, this.f88333d));
            }
            if (sl6Var.m22090b()) {
                this.f88339V1.onComplete();
            }
            this.f88326H.request(Long.MAX_VALUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: c */
        public void mo23413c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f88331b;
            ycg<? super l86<T>> ycgVar = this.f88330a;
            nsh<T> nshVarM23416f = this.f88339V1;
            int iAddAndGet = 1;
            while (true) {
                if (this.f88328M) {
                    tifVar.clear();
                    nshVarM23416f = 0;
                    this.f88339V1 = null;
                } else {
                    boolean z = this.f88324C;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f88325F;
                        if (th != null) {
                            if (nshVarM23416f != 0) {
                                nshVarM23416f.onError(th);
                            }
                            ycgVar.onError(th);
                        } else {
                            if (nshVarM23416f != 0) {
                                nshVarM23416f.onComplete();
                            }
                            ycgVar.onComplete();
                        }
                        mo23411a();
                        this.f88328M = true;
                    } else if (!z2) {
                        if (objPoll instanceof a) {
                            if (((a) objPoll).f88345b == this.f88336m || !this.f88340X) {
                                this.f88337M1 = 0L;
                                nshVarM23416f = m23416f(nshVarM23416f);
                            }
                        } else if (nshVarM23416f != 0) {
                            nshVarM23416f.onNext(objPoll);
                            long j = this.f88337M1 + 1;
                            if (j == this.f88341Y) {
                                this.f88337M1 = 0L;
                                nshVarM23416f = m23416f(nshVarM23416f);
                            } else {
                                this.f88337M1 = j;
                            }
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m23415e(a sender) {
            this.f88331b.offer(sender);
            mo23413c();
        }

        /* JADX INFO: renamed from: f */
        public nsh<T> m23416f(nsh<T> window) {
            if (window != null) {
                window.onComplete();
                window = null;
            }
            if (this.f88327L.get()) {
                mo23411a();
            } else {
                long j = this.f88336m;
                if (this.f88335f.get() == j) {
                    this.f88326H.cancel();
                    mo23411a();
                    this.f88328M = true;
                    this.f88330a.onError(new bwa(ul6.m23410b(j)));
                } else {
                    long j2 = j + 1;
                    this.f88336m = j2;
                    this.f88329N.getAndIncrement();
                    window = nsh.create(this.f88334e, this);
                    this.f88339V1 = window;
                    sl6 sl6Var = new sl6(window);
                    this.f88330a.onNext(sl6Var);
                    if (this.f88340X) {
                        a0f a0fVar = this.f88343Z1;
                        woe.AbstractC14729c abstractC14729c = this.f88342Z;
                        a aVar = new a(this, j2);
                        long j3 = this.f88332c;
                        a0fVar.update(abstractC14729c.schedulePeriodically(aVar, j3, j3, this.f88333d));
                    }
                    if (sl6Var.m22090b()) {
                        window.onComplete();
                    }
                }
            }
            return window;
        }

        @Override // java.lang.Runnable
        public void run() {
            m23414d();
        }
    }

    /* JADX INFO: renamed from: ul6$c */
    public static final class RunnableC13581c<T> extends AbstractC13579a<T> implements Runnable {

        /* JADX INFO: renamed from: M1 */
        public static final Object f88346M1 = new Object();
        private static final long serialVersionUID = 1155822639622580836L;

        /* JADX INFO: renamed from: Q */
        public final woe f88347Q;

        /* JADX INFO: renamed from: X */
        public nsh<T> f88348X;

        /* JADX INFO: renamed from: Y */
        public final a0f f88349Y;

        /* JADX INFO: renamed from: Z */
        public final Runnable f88350Z;

        /* JADX INFO: renamed from: ul6$c$a */
        public final class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC13581c.this.m23414d();
            }
        }

        public RunnableC13581c(ycg<? super l86<T>> actual, long timespan, TimeUnit unit, woe scheduler, int bufferSize) {
            super(actual, timespan, unit, bufferSize);
            this.f88347Q = scheduler;
            this.f88349Y = new a0f();
            this.f88350Z = new a();
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: a */
        public void mo23411a() {
            this.f88349Y.dispose();
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: b */
        public void mo23412b() {
            if (this.f88327L.get()) {
                return;
            }
            if (this.f88335f.get() == 0) {
                this.f88326H.cancel();
                this.f88330a.onError(new bwa(ul6.m23410b(this.f88336m)));
                mo23411a();
                this.f88328M = true;
                return;
            }
            this.f88329N.getAndIncrement();
            this.f88348X = nsh.create(this.f88334e, this.f88350Z);
            this.f88336m = 1L;
            sl6 sl6Var = new sl6(this.f88348X);
            this.f88330a.onNext(sl6Var);
            a0f a0fVar = this.f88349Y;
            woe woeVar = this.f88347Q;
            long j = this.f88332c;
            a0fVar.replace(woeVar.schedulePeriodicallyDirect(this, j, j, this.f88333d));
            if (sl6Var.m22090b()) {
                this.f88348X.onComplete();
            }
            this.f88326H.request(Long.MAX_VALUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v12, types: [nsh] */
        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: c */
        public void mo23413c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f88331b;
            ycg<? super l86<T>> ycgVar = this.f88330a;
            nsh nshVar = (nsh<T>) this.f88348X;
            int iAddAndGet = 1;
            while (true) {
                if (this.f88328M) {
                    tifVar.clear();
                    this.f88348X = null;
                    nshVar = (nsh<T>) null;
                } else {
                    boolean z = this.f88324C;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f88325F;
                        if (th != null) {
                            if (nshVar != null) {
                                nshVar.onError(th);
                            }
                            ycgVar.onError(th);
                        } else {
                            if (nshVar != null) {
                                nshVar.onComplete();
                            }
                            ycgVar.onComplete();
                        }
                        mo23411a();
                        this.f88328M = true;
                    } else if (!z2) {
                        if (objPoll == f88346M1) {
                            if (nshVar != null) {
                                nshVar.onComplete();
                                this.f88348X = null;
                                nshVar = (nsh<T>) null;
                            }
                            if (this.f88327L.get()) {
                                this.f88349Y.dispose();
                            } else {
                                long j = this.f88335f.get();
                                long j2 = this.f88336m;
                                if (j == j2) {
                                    this.f88326H.cancel();
                                    mo23411a();
                                    this.f88328M = true;
                                    ycgVar.onError(new bwa(ul6.m23410b(this.f88336m)));
                                } else {
                                    this.f88336m = j2 + 1;
                                    this.f88329N.getAndIncrement();
                                    nshVar = (nsh<T>) nsh.create(this.f88334e, this.f88350Z);
                                    this.f88348X = nshVar;
                                    sl6 sl6Var = new sl6(nshVar);
                                    ycgVar.onNext(sl6Var);
                                    if (sl6Var.m22090b()) {
                                        nshVar.onComplete();
                                    }
                                }
                            }
                        } else if (nshVar != null) {
                            nshVar.onNext(objPoll);
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f88331b.offer(f88346M1);
            mo23413c();
        }
    }

    /* JADX INFO: renamed from: ul6$d */
    public static final class RunnableC13582d<T> extends AbstractC13579a<T> implements Runnable {
        private static final long serialVersionUID = -7852870764194095894L;

        /* JADX INFO: renamed from: Q */
        public final long f88354Q;

        /* JADX INFO: renamed from: X */
        public final woe.AbstractC14729c f88355X;

        /* JADX INFO: renamed from: Y */
        public final List<nsh<T>> f88356Y;

        /* JADX INFO: renamed from: Z */
        public static final Object f88353Z = new Object();

        /* JADX INFO: renamed from: M1 */
        public static final Object f88352M1 = new Object();

        /* JADX INFO: renamed from: ul6$d$a */
        public static final class a implements Runnable {

            /* JADX INFO: renamed from: a */
            public final RunnableC13582d<?> f88357a;

            /* JADX INFO: renamed from: b */
            public final boolean f88358b;

            public a(RunnableC13582d<?> parent, boolean isOpen) {
                this.f88357a = parent;
                this.f88358b = isOpen;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f88357a.m23417e(this.f88358b);
            }
        }

        public RunnableC13582d(ycg<? super l86<T>> actual, long timespan, long timeskip, TimeUnit unit, woe.AbstractC14729c worker, int bufferSize) {
            super(actual, timespan, unit, bufferSize);
            this.f88354Q = timeskip;
            this.f88355X = worker;
            this.f88356Y = new LinkedList();
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: a */
        public void mo23411a() {
            this.f88355X.dispose();
        }

        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: b */
        public void mo23412b() {
            if (this.f88327L.get()) {
                return;
            }
            if (this.f88335f.get() == 0) {
                this.f88326H.cancel();
                this.f88330a.onError(new bwa(ul6.m23410b(this.f88336m)));
                mo23411a();
                this.f88328M = true;
                return;
            }
            this.f88336m = 1L;
            this.f88329N.getAndIncrement();
            nsh<T> nshVarCreate = nsh.create(this.f88334e, this);
            this.f88356Y.add(nshVarCreate);
            sl6 sl6Var = new sl6(nshVarCreate);
            this.f88330a.onNext(sl6Var);
            this.f88355X.schedule(new a(this, false), this.f88332c, this.f88333d);
            woe.AbstractC14729c abstractC14729c = this.f88355X;
            a aVar = new a(this, true);
            long j = this.f88354Q;
            abstractC14729c.schedulePeriodically(aVar, j, j, this.f88333d);
            if (sl6Var.m22090b()) {
                nshVarCreate.onComplete();
                this.f88356Y.remove(nshVarCreate);
            }
            this.f88326H.request(Long.MAX_VALUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p000.ul6.AbstractC13579a
        /* JADX INFO: renamed from: c */
        public void mo23413c() {
            if (getAndIncrement() != 0) {
                return;
            }
            tif<Object> tifVar = this.f88331b;
            ycg<? super l86<T>> ycgVar = this.f88330a;
            List<nsh<T>> list = this.f88356Y;
            int iAddAndGet = 1;
            while (true) {
                if (this.f88328M) {
                    tifVar.clear();
                    list.clear();
                } else {
                    boolean z = this.f88324C;
                    Object objPoll = tifVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        Throwable th = this.f88325F;
                        if (th != null) {
                            Iterator<nsh<T>> it = list.iterator();
                            while (it.hasNext()) {
                                it.next().onError(th);
                            }
                            ycgVar.onError(th);
                        } else {
                            Iterator<nsh<T>> it2 = list.iterator();
                            while (it2.hasNext()) {
                                it2.next().onComplete();
                            }
                            ycgVar.onComplete();
                        }
                        mo23411a();
                        this.f88328M = true;
                    } else if (!z2) {
                        if (objPoll == f88353Z) {
                            if (!this.f88327L.get()) {
                                long j = this.f88336m;
                                if (this.f88335f.get() != j) {
                                    this.f88336m = j + 1;
                                    this.f88329N.getAndIncrement();
                                    nsh<T> nshVarCreate = nsh.create(this.f88334e, this);
                                    list.add(nshVarCreate);
                                    sl6 sl6Var = new sl6(nshVarCreate);
                                    ycgVar.onNext(sl6Var);
                                    this.f88355X.schedule(new a(this, false), this.f88332c, this.f88333d);
                                    if (sl6Var.m22090b()) {
                                        nshVarCreate.onComplete();
                                    }
                                } else {
                                    this.f88326H.cancel();
                                    bwa bwaVar = new bwa(ul6.m23410b(j));
                                    Iterator<nsh<T>> it3 = list.iterator();
                                    while (it3.hasNext()) {
                                        it3.next().onError(bwaVar);
                                    }
                                    ycgVar.onError(bwaVar);
                                    mo23411a();
                                    this.f88328M = true;
                                }
                            }
                        } else if (objPoll != f88352M1) {
                            Iterator<nsh<T>> it4 = list.iterator();
                            while (it4.hasNext()) {
                                it4.next().onNext(objPoll);
                            }
                        } else if (!list.isEmpty()) {
                            list.remove(0).onComplete();
                        }
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX INFO: renamed from: e */
        public void m23417e(boolean isOpen) {
            this.f88331b.offer(isOpen ? f88353Z : f88352M1);
            mo23413c();
        }

        @Override // java.lang.Runnable
        public void run() {
            m23414d();
        }
    }

    public ul6(l86<T> source, long timespan, long timeskip, TimeUnit unit, woe scheduler, long maxSize, int bufferSize, boolean restartTimerOnMaxSize) {
        super(source);
        this.f88319c = timespan;
        this.f88320d = timeskip;
        this.f88321e = unit;
        this.f88322f = scheduler;
        this.f88323m = maxSize;
        this.f88317C = bufferSize;
        this.f88318F = restartTimerOnMaxSize;
    }

    /* JADX INFO: renamed from: b */
    public static String m23410b(long index) {
        return "Unable to emit the next window (#" + index + ") due to lack of requests. Please make sure the downstream is ready to consume windows.";
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super l86<T>> downstream) {
        if (this.f88319c != this.f88320d) {
            this.f49321b.subscribe((kj6) new RunnableC13582d(downstream, this.f88319c, this.f88320d, this.f88321e, this.f88322f.createWorker(), this.f88317C));
        } else if (this.f88323m == Long.MAX_VALUE) {
            this.f49321b.subscribe((kj6) new RunnableC13581c(downstream, this.f88319c, this.f88321e, this.f88322f, this.f88317C));
        } else {
            this.f49321b.subscribe((kj6) new RunnableC13580b(downstream, this.f88319c, this.f88321e, this.f88322f, this.f88317C, this.f88323m, this.f88318F));
        }
    }
}
