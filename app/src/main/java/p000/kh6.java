package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class kh6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final nr2<T> f54127b;

    /* JADX INFO: renamed from: c */
    public final int f54128c;

    /* JADX INFO: renamed from: d */
    public final long f54129d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f54130e;

    /* JADX INFO: renamed from: f */
    public final voe f54131f;

    /* JADX INFO: renamed from: m */
    public RunnableC8366a f54132m;

    /* JADX INFO: renamed from: kh6$a */
    public static final class RunnableC8366a extends AtomicReference<mf4> implements Runnable, tu2<mf4> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: a */
        public final kh6<?> f54133a;

        /* JADX INFO: renamed from: b */
        public mf4 f54134b;

        /* JADX INFO: renamed from: c */
        public long f54135c;

        /* JADX INFO: renamed from: d */
        public boolean f54136d;

        /* JADX INFO: renamed from: e */
        public boolean f54137e;

        public RunnableC8366a(kh6<?> kh6Var) {
            this.f54133a = kh6Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f54133a.m14745f(this);
        }

        @Override // p000.tu2
        public void accept(mf4 mf4Var) throws Exception {
            ag4.replace(this, mf4Var);
            synchronized (this.f54133a) {
                try {
                    if (this.f54137e) {
                        ((m5e) this.f54133a.f54127b).resetIf(mf4Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: kh6$b */
    public static final class C8367b<T> extends AtomicBoolean implements lj6<T>, fdg {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f54138a;

        /* JADX INFO: renamed from: b */
        public final kh6<T> f54139b;

        /* JADX INFO: renamed from: c */
        public final RunnableC8366a f54140c;

        /* JADX INFO: renamed from: d */
        public fdg f54141d;

        public C8367b(ycg<? super T> ycgVar, kh6<T> kh6Var, RunnableC8366a runnableC8366a) {
            this.f54138a = ycgVar;
            this.f54139b = kh6Var;
            this.f54140c = runnableC8366a;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f54141d.cancel();
            if (compareAndSet(false, true)) {
                this.f54139b.m14741b(this.f54140c);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f54139b.m14744e(this.f54140c);
                this.f54138a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                this.f54139b.m14744e(this.f54140c);
                this.f54138a.onError(th);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f54138a.onNext(t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f54141d, fdgVar)) {
                this.f54141d = fdgVar;
                this.f54138a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            this.f54141d.request(j);
        }
    }

    public kh6(nr2<T> nr2Var) {
        this(nr2Var, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* JADX INFO: renamed from: b */
    public void m14741b(RunnableC8366a runnableC8366a) {
        synchronized (this) {
            try {
                RunnableC8366a runnableC8366a2 = this.f54132m;
                if (runnableC8366a2 != null && runnableC8366a2 == runnableC8366a) {
                    long j = runnableC8366a.f54135c - 1;
                    runnableC8366a.f54135c = j;
                    if (j == 0 && runnableC8366a.f54136d) {
                        if (this.f54129d == 0) {
                            m14745f(runnableC8366a);
                            return;
                        }
                        b0f b0fVar = new b0f();
                        runnableC8366a.f54134b = b0fVar;
                        b0fVar.replace(this.f54131f.scheduleDirect(runnableC8366a, this.f54129d, this.f54130e));
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m14742c(RunnableC8366a runnableC8366a) {
        mf4 mf4Var = runnableC8366a.f54134b;
        if (mf4Var != null) {
            mf4Var.dispose();
            runnableC8366a.f54134b = null;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m14743d(RunnableC8366a runnableC8366a) {
        nr2<T> nr2Var = this.f54127b;
        if (nr2Var instanceof mf4) {
            ((mf4) nr2Var).dispose();
        } else if (nr2Var instanceof m5e) {
            ((m5e) nr2Var).resetIf(runnableC8366a.get());
        }
    }

    /* JADX INFO: renamed from: e */
    public void m14744e(RunnableC8366a runnableC8366a) {
        synchronized (this) {
            try {
                if (this.f54127b instanceof vg6) {
                    RunnableC8366a runnableC8366a2 = this.f54132m;
                    if (runnableC8366a2 != null && runnableC8366a2 == runnableC8366a) {
                        this.f54132m = null;
                        m14742c(runnableC8366a);
                    }
                    long j = runnableC8366a.f54135c - 1;
                    runnableC8366a.f54135c = j;
                    if (j == 0) {
                        m14743d(runnableC8366a);
                    }
                } else {
                    RunnableC8366a runnableC8366a3 = this.f54132m;
                    if (runnableC8366a3 != null && runnableC8366a3 == runnableC8366a) {
                        m14742c(runnableC8366a);
                        long j2 = runnableC8366a.f54135c - 1;
                        runnableC8366a.f54135c = j2;
                        if (j2 == 0) {
                            this.f54132m = null;
                            m14743d(runnableC8366a);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public void m14745f(RunnableC8366a runnableC8366a) {
        synchronized (this) {
            try {
                if (runnableC8366a.f54135c == 0 && runnableC8366a == this.f54132m) {
                    this.f54132m = null;
                    mf4 mf4Var = runnableC8366a.get();
                    ag4.dispose(runnableC8366a);
                    nr2<T> nr2Var = this.f54127b;
                    if (nr2Var instanceof mf4) {
                        ((mf4) nr2Var).dispose();
                    } else if (nr2Var instanceof m5e) {
                        if (mf4Var == null) {
                            runnableC8366a.f54137e = true;
                        } else {
                            ((m5e) nr2Var).resetIf(mf4Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        RunnableC8366a runnableC8366a;
        boolean z;
        mf4 mf4Var;
        synchronized (this) {
            try {
                runnableC8366a = this.f54132m;
                if (runnableC8366a == null) {
                    runnableC8366a = new RunnableC8366a(this);
                    this.f54132m = runnableC8366a;
                }
                long j = runnableC8366a.f54135c;
                if (j == 0 && (mf4Var = runnableC8366a.f54134b) != null) {
                    mf4Var.dispose();
                }
                long j2 = j + 1;
                runnableC8366a.f54135c = j2;
                if (runnableC8366a.f54136d || j2 != this.f54128c) {
                    z = false;
                } else {
                    z = true;
                    runnableC8366a.f54136d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f54127b.subscribe((lj6) new C8367b(ycgVar, this, runnableC8366a));
        if (z) {
            this.f54127b.connect(runnableC8366a);
        }
    }

    public kh6(nr2<T> nr2Var, int i, long j, TimeUnit timeUnit, voe voeVar) {
        this.f54127b = nr2Var;
        this.f54128c = i;
        this.f54129d = j;
        this.f54130e = timeUnit;
        this.f54131f = voeVar;
    }
}
