package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class lh6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final mr2<T> f57573b;

    /* JADX INFO: renamed from: c */
    public final int f57574c;

    /* JADX INFO: renamed from: d */
    public final long f57575d;

    /* JADX INFO: renamed from: e */
    public final TimeUnit f57576e;

    /* JADX INFO: renamed from: f */
    public final woe f57577f;

    /* JADX INFO: renamed from: m */
    public RunnableC8816a f57578m;

    /* JADX INFO: renamed from: lh6$a */
    public static final class RunnableC8816a extends AtomicReference<lf4> implements Runnable, uu2<lf4> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: a */
        public final lh6<?> f57579a;

        /* JADX INFO: renamed from: b */
        public lf4 f57580b;

        /* JADX INFO: renamed from: c */
        public long f57581c;

        /* JADX INFO: renamed from: d */
        public boolean f57582d;

        /* JADX INFO: renamed from: e */
        public boolean f57583e;

        public RunnableC8816a(lh6<?> parent) {
            this.f57579a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f57579a.m16135d(this);
        }

        @Override // p000.uu2
        public void accept(lf4 t) {
            zf4.replace(this, t);
            synchronized (this.f57579a) {
                try {
                    if (this.f57583e) {
                        this.f57579a.f57573b.reset();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: lh6$b */
    public static final class C8817b<T> extends AtomicBoolean implements kj6<T>, fdg {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f57584a;

        /* JADX INFO: renamed from: b */
        public final lh6<T> f57585b;

        /* JADX INFO: renamed from: c */
        public final RunnableC8816a f57586c;

        /* JADX INFO: renamed from: d */
        public fdg f57587d;

        public C8817b(ycg<? super T> actual, lh6<T> parent, RunnableC8816a connection) {
            this.f57584a = actual;
            this.f57585b = parent;
            this.f57586c = connection;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f57587d.cancel();
            if (compareAndSet(false, true)) {
                this.f57585b.m16133b(this.f57586c);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f57585b.m16134c(this.f57586c);
                this.f57584a.onComplete();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (!compareAndSet(false, true)) {
                ofe.onError(t);
            } else {
                this.f57585b.m16134c(this.f57586c);
                this.f57584a.onError(t);
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f57584a.onNext(t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f57587d, s)) {
                this.f57587d = s;
                this.f57584a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            this.f57587d.request(n);
        }
    }

    public lh6(mr2<T> source) {
        this(source, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* JADX INFO: renamed from: b */
    public void m16133b(RunnableC8816a rc) {
        synchronized (this) {
            try {
                RunnableC8816a runnableC8816a = this.f57578m;
                if (runnableC8816a != null && runnableC8816a == rc) {
                    long j = rc.f57581c - 1;
                    rc.f57581c = j;
                    if (j == 0 && rc.f57582d) {
                        if (this.f57575d == 0) {
                            m16135d(rc);
                            return;
                        }
                        a0f a0fVar = new a0f();
                        rc.f57580b = a0fVar;
                        a0fVar.replace(this.f57577f.scheduleDirect(rc, this.f57575d, this.f57576e));
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m16134c(RunnableC8816a rc) {
        synchronized (this) {
            try {
                if (this.f57578m == rc) {
                    lf4 lf4Var = rc.f57580b;
                    if (lf4Var != null) {
                        lf4Var.dispose();
                        rc.f57580b = null;
                    }
                    long j = rc.f57581c - 1;
                    rc.f57581c = j;
                    if (j == 0) {
                        this.f57578m = null;
                        this.f57573b.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m16135d(RunnableC8816a rc) {
        synchronized (this) {
            try {
                if (rc.f57581c == 0 && rc == this.f57578m) {
                    this.f57578m = null;
                    lf4 lf4Var = rc.get();
                    zf4.dispose(rc);
                    if (lf4Var == null) {
                        rc.f57583e = true;
                    } else {
                        this.f57573b.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        RunnableC8816a runnableC8816a;
        boolean z;
        lf4 lf4Var;
        synchronized (this) {
            try {
                runnableC8816a = this.f57578m;
                if (runnableC8816a == null) {
                    runnableC8816a = new RunnableC8816a(this);
                    this.f57578m = runnableC8816a;
                }
                long j = runnableC8816a.f57581c;
                if (j == 0 && (lf4Var = runnableC8816a.f57580b) != null) {
                    lf4Var.dispose();
                }
                long j2 = j + 1;
                runnableC8816a.f57581c = j2;
                if (runnableC8816a.f57582d || j2 != this.f57574c) {
                    z = false;
                } else {
                    z = true;
                    runnableC8816a.f57582d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f57573b.subscribe((kj6) new C8817b(s, this, runnableC8816a));
        if (z) {
            this.f57573b.connect(runnableC8816a);
        }
    }

    public lh6(mr2<T> source, int n, long timeout, TimeUnit unit, woe scheduler) {
        this.f57573b = source;
        this.f57574c = n;
        this.f57575d = timeout;
        this.f57576e = unit;
        this.f57577f = scheduler;
    }
}
