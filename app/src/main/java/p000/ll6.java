package p000;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes7.dex */
public final class ll6<T> extends AbstractC8162k1<T, m86<T>> {

    /* JADX INFO: renamed from: c */
    public final long f58107c;

    /* JADX INFO: renamed from: d */
    public final long f58108d;

    /* JADX INFO: renamed from: e */
    public final int f58109e;

    /* JADX INFO: renamed from: ll6$a */
    public static final class RunnableC8883a<T> extends AtomicInteger implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super m86<T>> f58110a;

        /* JADX INFO: renamed from: b */
        public final long f58111b;

        /* JADX INFO: renamed from: c */
        public final AtomicBoolean f58112c;

        /* JADX INFO: renamed from: d */
        public final int f58113d;

        /* JADX INFO: renamed from: e */
        public long f58114e;

        /* JADX INFO: renamed from: f */
        public fdg f58115f;

        /* JADX INFO: renamed from: m */
        public msh<T> f58116m;

        public RunnableC8883a(ycg<? super m86<T>> ycgVar, long j, int i) {
            super(1);
            this.f58110a = ycgVar;
            this.f58111b = j;
            this.f58112c = new AtomicBoolean();
            this.f58113d = i;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f58112c.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            msh<T> mshVar = this.f58116m;
            if (mshVar != null) {
                this.f58116m = null;
                mshVar.onComplete();
            }
            this.f58110a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            msh<T> mshVar = this.f58116m;
            if (mshVar != null) {
                this.f58116m = null;
                mshVar.onError(th);
            }
            this.f58110a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f58114e;
            msh<T> mshVarCreate = this.f58116m;
            if (j == 0) {
                getAndIncrement();
                mshVarCreate = msh.create(this.f58113d, this);
                this.f58116m = mshVarCreate;
                this.f58110a.onNext(mshVarCreate);
            }
            long j2 = j + 1;
            mshVarCreate.onNext(t);
            if (j2 != this.f58111b) {
                this.f58114e = j2;
                return;
            }
            this.f58114e = 0L;
            this.f58116m = null;
            mshVarCreate.onComplete();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f58115f, fdgVar)) {
                this.f58115f = fdgVar;
                this.f58110a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                this.f58115f.request(so0.multiplyCap(this.f58111b, j));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f58115f.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: ll6$b */
    public static final class RunnableC8884b<T> extends AtomicInteger implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;

        /* JADX INFO: renamed from: C */
        public final AtomicLong f58117C;

        /* JADX INFO: renamed from: F */
        public final AtomicInteger f58118F;

        /* JADX INFO: renamed from: H */
        public final int f58119H;

        /* JADX INFO: renamed from: L */
        public long f58120L;

        /* JADX INFO: renamed from: M */
        public long f58121M;

        /* JADX INFO: renamed from: N */
        public fdg f58122N;

        /* JADX INFO: renamed from: Q */
        public volatile boolean f58123Q;

        /* JADX INFO: renamed from: X */
        public Throwable f58124X;

        /* JADX INFO: renamed from: Y */
        public volatile boolean f58125Y;

        /* JADX INFO: renamed from: a */
        public final ycg<? super m86<T>> f58126a;

        /* JADX INFO: renamed from: b */
        public final rzf<msh<T>> f58127b;

        /* JADX INFO: renamed from: c */
        public final long f58128c;

        /* JADX INFO: renamed from: d */
        public final long f58129d;

        /* JADX INFO: renamed from: e */
        public final ArrayDeque<msh<T>> f58130e;

        /* JADX INFO: renamed from: f */
        public final AtomicBoolean f58131f;

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f58132m;

        public RunnableC8884b(ycg<? super m86<T>> ycgVar, long j, long j2, int i) {
            super(1);
            this.f58126a = ycgVar;
            this.f58128c = j;
            this.f58129d = j2;
            this.f58127b = new rzf<>(i);
            this.f58130e = new ArrayDeque<>();
            this.f58131f = new AtomicBoolean();
            this.f58132m = new AtomicBoolean();
            this.f58117C = new AtomicLong();
            this.f58118F = new AtomicInteger();
            this.f58119H = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m16222a(boolean z, boolean z2, ycg<?> ycgVar, rzf<?> rzfVar) {
            if (this.f58125Y) {
                rzfVar.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f58124X;
            if (th != null) {
                rzfVar.clear();
                ycgVar.onError(th);
                return true;
            }
            if (!z2) {
                return false;
            }
            ycgVar.onComplete();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m16223b() {
            if (this.f58118F.getAndIncrement() != 0) {
                return;
            }
            ycg<? super m86<T>> ycgVar = this.f58126a;
            rzf<msh<T>> rzfVar = this.f58127b;
            int iAddAndGet = 1;
            do {
                long j = this.f58117C.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.f58123Q;
                    msh<T> mshVarPoll = rzfVar.poll();
                    boolean z2 = mshVarPoll == null;
                    if (m16222a(z, z2, ycgVar, rzfVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    ycgVar.onNext(mshVarPoll);
                    j2++;
                }
                if (j2 == j && m16222a(this.f58123Q, rzfVar.isEmpty(), ycgVar, rzfVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.f58117C.addAndGet(-j2);
                }
                iAddAndGet = this.f58118F.addAndGet(-iAddAndGet);
            } while (iAddAndGet != 0);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f58125Y = true;
            if (this.f58131f.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f58123Q) {
                return;
            }
            Iterator<msh<T>> it = this.f58130e.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.f58130e.clear();
            this.f58123Q = true;
            m16223b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f58123Q) {
                pfe.onError(th);
                return;
            }
            Iterator<msh<T>> it = this.f58130e.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.f58130e.clear();
            this.f58124X = th;
            this.f58123Q = true;
            m16223b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f58123Q) {
                return;
            }
            long j = this.f58120L;
            if (j == 0 && !this.f58125Y) {
                getAndIncrement();
                msh<T> mshVarCreate = msh.create(this.f58119H, this);
                this.f58130e.offer(mshVarCreate);
                this.f58127b.offer(mshVarCreate);
                m16223b();
            }
            long j2 = j + 1;
            Iterator<msh<T>> it = this.f58130e.iterator();
            while (it.hasNext()) {
                it.next().onNext(t);
            }
            long j3 = this.f58121M + 1;
            if (j3 == this.f58128c) {
                this.f58121M = j3 - this.f58129d;
                msh<T> mshVarPoll = this.f58130e.poll();
                if (mshVarPoll != null) {
                    mshVarPoll.onComplete();
                }
            } else {
                this.f58121M = j3;
            }
            if (j2 == this.f58129d) {
                this.f58120L = 0L;
            } else {
                this.f58120L = j2;
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f58122N, fdgVar)) {
                this.f58122N = fdgVar;
                this.f58126a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f58117C, j);
                if (this.f58132m.get() || !this.f58132m.compareAndSet(false, true)) {
                    this.f58122N.request(so0.multiplyCap(this.f58129d, j));
                } else {
                    this.f58122N.request(so0.addCap(this.f58128c, so0.multiplyCap(this.f58129d, j - 1)));
                }
                m16223b();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f58122N.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: ll6$c */
    public static final class RunnableC8885c<T> extends AtomicInteger implements lj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;

        /* JADX INFO: renamed from: C */
        public fdg f58133C;

        /* JADX INFO: renamed from: F */
        public msh<T> f58134F;

        /* JADX INFO: renamed from: a */
        public final ycg<? super m86<T>> f58135a;

        /* JADX INFO: renamed from: b */
        public final long f58136b;

        /* JADX INFO: renamed from: c */
        public final long f58137c;

        /* JADX INFO: renamed from: d */
        public final AtomicBoolean f58138d;

        /* JADX INFO: renamed from: e */
        public final AtomicBoolean f58139e;

        /* JADX INFO: renamed from: f */
        public final int f58140f;

        /* JADX INFO: renamed from: m */
        public long f58141m;

        public RunnableC8885c(ycg<? super m86<T>> ycgVar, long j, long j2, int i) {
            super(1);
            this.f58135a = ycgVar;
            this.f58136b = j;
            this.f58137c = j2;
            this.f58138d = new AtomicBoolean();
            this.f58139e = new AtomicBoolean();
            this.f58140f = i;
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f58138d.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            msh<T> mshVar = this.f58134F;
            if (mshVar != null) {
                this.f58134F = null;
                mshVar.onComplete();
            }
            this.f58135a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            msh<T> mshVar = this.f58134F;
            if (mshVar != null) {
                this.f58134F = null;
                mshVar.onError(th);
            }
            this.f58135a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            long j = this.f58141m;
            msh<T> mshVarCreate = this.f58134F;
            if (j == 0) {
                getAndIncrement();
                mshVarCreate = msh.create(this.f58140f, this);
                this.f58134F = mshVarCreate;
                this.f58135a.onNext(mshVarCreate);
            }
            long j2 = j + 1;
            if (mshVarCreate != null) {
                mshVarCreate.onNext(t);
            }
            if (j2 == this.f58136b) {
                this.f58134F = null;
                mshVarCreate.onComplete();
            }
            if (j2 == this.f58137c) {
                this.f58141m = 0L;
            } else {
                this.f58141m = j2;
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f58133C, fdgVar)) {
                this.f58133C = fdgVar;
                this.f58135a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                if (this.f58139e.get() || !this.f58139e.compareAndSet(false, true)) {
                    this.f58133C.request(so0.multiplyCap(this.f58137c, j));
                } else {
                    this.f58133C.request(so0.addCap(so0.multiplyCap(this.f58136b, j), so0.multiplyCap(this.f58137c - this.f58136b, j - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.f58133C.cancel();
            }
        }
    }

    public ll6(m86<T> m86Var, long j, long j2, int i) {
        super(m86Var);
        this.f58107c = j;
        this.f58108d = j2;
        this.f58109e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super m86<T>> ycgVar) {
        long j = this.f58108d;
        long j2 = this.f58107c;
        if (j == j2) {
            this.f52360b.subscribe((lj6) new RunnableC8883a(ycgVar, this.f58107c, this.f58109e));
        } else if (j > j2) {
            this.f52360b.subscribe((lj6) new RunnableC8885c(ycgVar, this.f58107c, this.f58108d, this.f58109e));
        } else {
            this.f52360b.subscribe((lj6) new RunnableC8884b(ycgVar, this.f58107c, this.f58108d, this.f58109e));
        }
    }
}
