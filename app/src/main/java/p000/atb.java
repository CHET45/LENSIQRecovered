package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class atb<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final or2<T> f11840a;

    /* JADX INFO: renamed from: b */
    public final int f11841b;

    /* JADX INFO: renamed from: c */
    public final long f11842c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f11843d;

    /* JADX INFO: renamed from: e */
    public final woe f11844e;

    /* JADX INFO: renamed from: f */
    public RunnableC1606a f11845f;

    /* JADX INFO: renamed from: atb$a */
    public static final class RunnableC1606a extends AtomicReference<lf4> implements Runnable, uu2<lf4> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: a */
        public final atb<?> f11846a;

        /* JADX INFO: renamed from: b */
        public lf4 f11847b;

        /* JADX INFO: renamed from: c */
        public long f11848c;

        /* JADX INFO: renamed from: d */
        public boolean f11849d;

        /* JADX INFO: renamed from: e */
        public boolean f11850e;

        public RunnableC1606a(atb<?> parent) {
            this.f11846a = parent;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f11846a.m2689c(this);
        }

        @Override // p000.uu2
        public void accept(lf4 t) {
            zf4.replace(this, t);
            synchronized (this.f11846a) {
                try {
                    if (this.f11850e) {
                        this.f11846a.f11840a.reset();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: atb$b */
    public static final class C1607b<T> extends AtomicBoolean implements pxb<T>, lf4 {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f11851a;

        /* JADX INFO: renamed from: b */
        public final atb<T> f11852b;

        /* JADX INFO: renamed from: c */
        public final RunnableC1606a f11853c;

        /* JADX INFO: renamed from: d */
        public lf4 f11854d;

        public C1607b(pxb<? super T> downstream, atb<T> parent, RunnableC1606a connection) {
            this.f11851a = downstream;
            this.f11852b = parent;
            this.f11853c = connection;
        }

        @Override // p000.lf4
        public void dispose() {
            this.f11854d.dispose();
            if (compareAndSet(false, true)) {
                this.f11852b.m2687a(this.f11853c);
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f11854d.isDisposed();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f11852b.m2688b(this.f11853c);
                this.f11851a.onComplete();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (!compareAndSet(false, true)) {
                ofe.onError(t);
            } else {
                this.f11852b.m2688b(this.f11853c);
                this.f11851a.onError(t);
            }
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f11851a.onNext(t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f11854d, d)) {
                this.f11854d = d;
                this.f11851a.onSubscribe(this);
            }
        }
    }

    public atb(or2<T> source) {
        this(source, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* JADX INFO: renamed from: a */
    public void m2687a(RunnableC1606a rc) {
        synchronized (this) {
            try {
                RunnableC1606a runnableC1606a = this.f11845f;
                if (runnableC1606a != null && runnableC1606a == rc) {
                    long j = rc.f11848c - 1;
                    rc.f11848c = j;
                    if (j == 0 && rc.f11849d) {
                        if (this.f11842c == 0) {
                            m2689c(rc);
                            return;
                        }
                        a0f a0fVar = new a0f();
                        rc.f11847b = a0fVar;
                        a0fVar.replace(this.f11844e.scheduleDirect(rc, this.f11842c, this.f11843d));
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2688b(RunnableC1606a rc) {
        synchronized (this) {
            try {
                if (this.f11845f == rc) {
                    lf4 lf4Var = rc.f11847b;
                    if (lf4Var != null) {
                        lf4Var.dispose();
                        rc.f11847b = null;
                    }
                    long j = rc.f11848c - 1;
                    rc.f11848c = j;
                    if (j == 0) {
                        this.f11845f = null;
                        this.f11840a.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m2689c(RunnableC1606a rc) {
        synchronized (this) {
            try {
                if (rc.f11848c == 0 && rc == this.f11845f) {
                    this.f11845f = null;
                    lf4 lf4Var = rc.get();
                    zf4.dispose(rc);
                    if (lf4Var == null) {
                        rc.f11850e = true;
                    } else {
                        this.f11840a.reset();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        RunnableC1606a runnableC1606a;
        boolean z;
        lf4 lf4Var;
        synchronized (this) {
            try {
                runnableC1606a = this.f11845f;
                if (runnableC1606a == null) {
                    runnableC1606a = new RunnableC1606a(this);
                    this.f11845f = runnableC1606a;
                }
                long j = runnableC1606a.f11848c;
                if (j == 0 && (lf4Var = runnableC1606a.f11847b) != null) {
                    lf4Var.dispose();
                }
                long j2 = j + 1;
                runnableC1606a.f11848c = j2;
                if (runnableC1606a.f11849d || j2 != this.f11841b) {
                    z = false;
                } else {
                    z = true;
                    runnableC1606a.f11849d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f11840a.subscribe(new C1607b(observer, this, runnableC1606a));
        if (z) {
            this.f11840a.connect(runnableC1606a);
        }
    }

    public atb(or2<T> source, int n, long timeout, TimeUnit unit, woe scheduler) {
        this.f11840a = source;
        this.f11841b = n;
        this.f11842c = timeout;
        this.f11843d = unit;
        this.f11844e = scheduler;
    }
}
