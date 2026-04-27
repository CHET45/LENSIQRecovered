package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ml6<T> extends AbstractC7714j1<T, l86<T>> {

    /* JADX INFO: renamed from: c */
    public final long f61366c;

    /* JADX INFO: renamed from: d */
    public final long f61367d;

    /* JADX INFO: renamed from: e */
    public final int f61368e;

    /* JADX INFO: renamed from: ml6$a */
    public static final class RunnableC9400a<T> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f61369a;

        /* JADX INFO: renamed from: b */
        public final long f61370b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f61371c;

        /* JADX INFO: renamed from: d */
        public final int f61372d;

        /* JADX INFO: renamed from: e */
        public long f61373e;

        /* JADX INFO: renamed from: f */
        public fdg f61374f;

        /* JADX INFO: renamed from: m */
        public nsh<T> f61375m;

        public RunnableC9400a(ycg<? super l86<T>> actual, long size, int bufferSize) {
            super(1);
            this.f61369a = actual;
            this.f61370b = size;
            this.f61371c = new AtomicBoolean();
            this.f61372d = bufferSize;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f61371c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            nsh<T> nshVar = this.f61375m;
            if (nshVar != null) {
                this.f61375m = null;
                nshVar.onComplete();
            }
            this.f61369a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            nsh<T> nshVar = this.f61375m;
            if (nshVar != null) {
                this.f61375m = null;
                nshVar.onError(t);
            }
            this.f61369a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            sl6 sl6Var;
            long j = this.f61373e;
            nsh<T> nshVarCreate = this.f61375m;
            if (j == 0) {
                getAndIncrement();
                nshVarCreate = nsh.create(this.f61372d, this);
                this.f61375m = nshVarCreate;
                sl6Var = new sl6(nshVarCreate);
                this.f61369a.onNext(sl6Var);
            } else {
                sl6Var = null;
            }
            long j2 = j + 1;
            nshVarCreate.onNext(t);
            if (j2 == this.f61370b) {
                this.f61373e = 0L;
                this.f61375m = null;
                nshVarCreate.onComplete();
            } else {
                this.f61373e = j2;
            }
            if (sl6Var == null || !sl6Var.m22090b()) {
                return;
            }
            sl6Var.f82170b.onComplete();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f61374f, s)) {
                this.f61374f = s;
                this.f61369a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                this.f61374f.request(ro0.multiplyCap(this.f61370b, n));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f61374f.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: ml6$b */
    public static final class RunnableC9401b<T> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f61376C;

        /* JADX INFO: renamed from: F */
        public final AtomicInteger f61377F;

        /* JADX INFO: renamed from: H */
        public final int f61378H;

        /* JADX INFO: renamed from: L */
        public long f61379L;

        /* JADX INFO: renamed from: M */
        public long f61380M;

        /* JADX INFO: renamed from: N */
        public fdg f61381N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f61382Q;

        /* JADX INFO: renamed from: X */
        public Throwable f61383X;

        /* JADX INFO: renamed from: Y */
        public volatile boolean f61384Y;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f61385a;

        /* JADX INFO: renamed from: b */
        public final qzf<nsh<T>> f61386b;

        /* JADX INFO: renamed from: c */
        public final long f61387c;

        /* JADX INFO: renamed from: d */
        public final long f61388d;

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<nsh<T>> f61389e;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f61390f;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f61391m;

        public RunnableC9401b(ycg<? super l86<T>> actual, long size, long skip, int bufferSize) {
            super(1);
            this.f61385a = actual;
            this.f61387c = size;
            this.f61388d = skip;
            this.f61386b = new qzf<>(bufferSize);
            this.f61389e = new ArrayDeque<>();
            this.f61390f = new AtomicBoolean();
            this.f61391m = new AtomicBoolean();
            this.f61376C = new AtomicLong();
            this.f61377F = new AtomicInteger();
            this.f61378H = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public boolean m17379a(boolean d, boolean empty, ycg<?> a, qzf<?> q) {
            if (!d) {
                return false;
            }
            Throwable th = this.f61383X;
            if (th != null) {
                q.clear();
                a.onError(th);
                return true;
            }
            if (!empty) {
                return false;
            }
            a.onComplete();
            return true;
        }

        /* JADX WARN: Code restructure failed: missing block: B:54:0x000f, code lost:
        
            continue;
         */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m17380b() {
            /*
                r15 = this;
                java.util.concurrent.atomic.AtomicInteger r0 = r15.f61377F
                int r0 = r0.getAndIncrement()
                if (r0 == 0) goto L9
                return
            L9:
                ycg<? super l86<T>> r0 = r15.f61385a
                qzf<nsh<T>> r1 = r15.f61386b
                r2 = 1
                r3 = r2
            Lf:
                boolean r4 = r15.f61384Y
                if (r4 == 0) goto L1f
            L13:
                java.lang.Object r4 = r1.poll()
                nsh r4 = (p000.nsh) r4
                if (r4 == 0) goto L84
                r4.onComplete()
                goto L13
            L1f:
                java.util.concurrent.atomic.AtomicLong r4 = r15.f61376C
                long r4 = r4.get()
                r6 = 0
                r8 = r6
            L28:
                int r10 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r10 == 0) goto L5d
                boolean r11 = r15.f61382Q
                java.lang.Object r12 = r1.poll()
                nsh r12 = (p000.nsh) r12
                if (r12 != 0) goto L38
                r13 = r2
                goto L39
            L38:
                r13 = 0
            L39:
                boolean r14 = r15.f61384Y
                if (r14 == 0) goto L3e
                goto Lf
            L3e:
                boolean r11 = r15.m17379a(r11, r13, r0, r1)
                if (r11 == 0) goto L45
                return
            L45:
                if (r13 == 0) goto L48
                goto L5d
            L48:
                sl6 r10 = new sl6
                r10.<init>(r12)
                r0.onNext(r10)
                boolean r10 = r10.m22090b()
                if (r10 == 0) goto L59
                r12.onComplete()
            L59:
                r10 = 1
                long r8 = r8 + r10
                goto L28
            L5d:
                if (r10 != 0) goto L71
                boolean r10 = r15.f61384Y
                if (r10 == 0) goto L64
                goto Lf
            L64:
                boolean r10 = r15.f61382Q
                boolean r11 = r1.isEmpty()
                boolean r10 = r15.m17379a(r10, r11, r0, r1)
                if (r10 == 0) goto L71
                return
            L71:
                int r6 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r6 == 0) goto L84
                r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r4 == 0) goto L84
                java.util.concurrent.atomic.AtomicLong r4 = r15.f61376C
                long r5 = -r8
                r4.addAndGet(r5)
            L84:
                java.util.concurrent.atomic.AtomicInteger r4 = r15.f61377F
                int r3 = -r3
                int r3 = r4.addAndGet(r3)
                if (r3 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ml6.RunnableC9401b.m17380b():void");
        }

        @Override // p000.fdg
        public void cancel() {
            this.f61384Y = true;
            if (this.f61390f.compareAndSet(false, true)) {
                run();
            }
            m17380b();
        }

        @Override // p000.ycg
        public void onComplete() {
            Iterator<nsh<T>> it = this.f61389e.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f61389e.clear();
            this.f61382Q = true;
            m17380b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            Iterator<nsh<T>> it = this.f61389e.iterator();
            while (it.hasNext()) {
                it.next().onError(t);
            }
            this.f61389e.clear();
            this.f61383X = t;
            this.f61382Q = true;
            m17380b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            nsh<T> nshVarCreate;
            long j = this.f61379L;
            if (j != 0 || this.f61384Y) {
                nshVarCreate = null;
            } else {
                getAndIncrement();
                nshVarCreate = nsh.create(this.f61378H, this);
                this.f61389e.offer(nshVarCreate);
            }
            long j2 = j + 1;
            Iterator<nsh<T>> it = this.f61389e.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            if (nshVarCreate != null) {
                this.f61386b.offer(nshVarCreate);
                m17380b();
            }
            long j3 = this.f61380M + 1;
            if (j3 == this.f61387c) {
                this.f61380M = j3 - this.f61388d;
                nsh<T> nshVarPoll = this.f61389e.poll();
                if (nshVarPoll != null) {
                    nshVarPoll.onComplete();
                }
            } else {
                this.f61380M = j3;
            }
            if (j2 == this.f61388d) {
                this.f61379L = 0L;
            } else {
                this.f61379L = j2;
            }
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f61381N, s)) {
                this.f61381N = s;
                this.f61385a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f61376C, n);
                if (this.f61391m.get() || !this.f61391m.compareAndSet(false, true)) {
                    this.f61381N.request(ro0.multiplyCap(this.f61388d, n));
                } else {
                    this.f61381N.request(ro0.addCap(this.f61387c, ro0.multiplyCap(this.f61388d, n - 1)));
                }
                m17380b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f61381N.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: ml6$c */
    public static final class RunnableC9402c<T> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;

        /* JADX INFO: renamed from: C */
        public fdg f61392C;

        /* JADX INFO: renamed from: F */
        public nsh<T> f61393F;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f61394a;

        /* JADX INFO: renamed from: b */
        public final long f61395b;

        /* JADX INFO: renamed from: c */
        public final long f61396c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f61397d;

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f61398e;

        /* JADX INFO: renamed from: f */
        public final int f61399f;

        /* JADX INFO: renamed from: m */
        public long f61400m;

        public RunnableC9402c(ycg<? super l86<T>> actual, long size, long skip, int bufferSize) {
            super(1);
            this.f61394a = actual;
            this.f61395b = size;
            this.f61396c = skip;
            this.f61397d = new AtomicBoolean();
            this.f61398e = new AtomicBoolean();
            this.f61399f = bufferSize;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f61397d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            nsh<T> nshVar = this.f61393F;
            if (nshVar != null) {
                this.f61393F = null;
                nshVar.onComplete();
            }
            this.f61394a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            nsh<T> nshVar = this.f61393F;
            if (nshVar != null) {
                this.f61393F = null;
                nshVar.onError(t);
            }
            this.f61394a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            sl6 sl6Var;
            long j = this.f61400m;
            nsh<T> nshVarCreate = this.f61393F;
            if (j == 0) {
                getAndIncrement();
                nshVarCreate = nsh.create(this.f61399f, this);
                this.f61393F = nshVarCreate;
                sl6Var = new sl6(nshVarCreate);
                this.f61394a.onNext(sl6Var);
            } else {
                sl6Var = null;
            }
            long j2 = j + 1;
            if (nshVarCreate != null) {
                nshVarCreate.onNext(t);
            }
            if (j2 == this.f61395b) {
                this.f61393F = null;
                nshVarCreate.onComplete();
            }
            if (j2 == this.f61396c) {
                this.f61400m = 0L;
            } else {
                this.f61400m = j2;
            }
            if (sl6Var == null || !sl6Var.m22090b()) {
                return;
            }
            sl6Var.f82170b.onComplete();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f61392C, s)) {
                this.f61392C = s;
                this.f61394a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                if (this.f61398e.get() || !this.f61398e.compareAndSet(false, true)) {
                    this.f61392C.request(ro0.multiplyCap(this.f61396c, n));
                } else {
                    this.f61392C.request(ro0.addCap(ro0.multiplyCap(this.f61395b, n), ro0.multiplyCap(this.f61396c - this.f61395b, n - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f61392C.cancel();
            }
        }
    }

    public ml6(l86<T> source, long size, long skip, int bufferSize) {
        super(source);
        this.f61366c = size;
        this.f61367d = skip;
        this.f61368e = bufferSize;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super l86<T>> s) {
        long j = this.f61367d;
        long j2 = this.f61366c;
        if (j == j2) {
            this.f49321b.subscribe((kj6) new RunnableC9400a(s, this.f61366c, this.f61368e));
        } else if (j > j2) {
            this.f49321b.subscribe((kj6) new RunnableC9402c(s, this.f61366c, this.f61367d, this.f61368e));
        } else {
            this.f49321b.subscribe((kj6) new RunnableC9401b(s, this.f61366c, this.f61367d, this.f61368e));
        }
    }
}
