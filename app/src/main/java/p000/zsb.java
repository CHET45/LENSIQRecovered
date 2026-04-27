package p000;

import io.reactivex.Observable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class zsb<T> extends Observable<T> {

    /* JADX INFO: renamed from: a */
    public final pr2<T> f105961a;

    /* JADX INFO: renamed from: b */
    public final int f105962b;

    /* JADX INFO: renamed from: c */
    public final long f105963c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f105964d;

    /* JADX INFO: renamed from: e */
    public final voe f105965e;

    /* JADX INFO: renamed from: f */
    public RunnableC16242a f105966f;

    /* JADX INFO: renamed from: zsb$a */
    public static final class RunnableC16242a extends AtomicReference<mf4> implements Runnable, tu2<mf4> {
        private static final long serialVersionUID = -4552101107598366241L;

        /* JADX INFO: renamed from: a */
        public final zsb<?> f105967a;

        /* JADX INFO: renamed from: b */
        public mf4 f105968b;

        /* JADX INFO: renamed from: c */
        public long f105969c;

        /* JADX INFO: renamed from: d */
        public boolean f105970d;

        /* JADX INFO: renamed from: e */
        public boolean f105971e;

        public RunnableC16242a(zsb<?> zsbVar) {
            this.f105967a = zsbVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f105967a.m27073e(this);
        }

        @Override // p000.tu2
        public void accept(mf4 mf4Var) throws Exception {
            ag4.replace(this, mf4Var);
            synchronized (this.f105967a) {
                try {
                    if (this.f105971e) {
                        ((m5e) this.f105967a.f105961a).resetIf(mf4Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: zsb$b */
    public static final class C16243b<T> extends AtomicBoolean implements oxb<T>, mf4 {
        private static final long serialVersionUID = -7419642935409022375L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f105972a;

        /* JADX INFO: renamed from: b */
        public final zsb<T> f105973b;

        /* JADX INFO: renamed from: c */
        public final RunnableC16242a f105974c;

        /* JADX INFO: renamed from: d */
        public mf4 f105975d;

        public C16243b(oxb<? super T> oxbVar, zsb<T> zsbVar, RunnableC16242a runnableC16242a) {
            this.f105972a = oxbVar;
            this.f105973b = zsbVar;
            this.f105974c = runnableC16242a;
        }

        @Override // p000.mf4
        public void dispose() {
            this.f105975d.dispose();
            if (compareAndSet(false, true)) {
                this.f105973b.m27069a(this.f105974c);
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f105975d.isDisposed();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (compareAndSet(false, true)) {
                this.f105973b.m27072d(this.f105974c);
                this.f105972a.onComplete();
            }
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!compareAndSet(false, true)) {
                pfe.onError(th);
            } else {
                this.f105973b.m27072d(this.f105974c);
                this.f105972a.onError(th);
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f105972a.onNext(t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f105975d, mf4Var)) {
                this.f105975d = mf4Var;
                this.f105972a.onSubscribe(this);
            }
        }
    }

    public zsb(pr2<T> pr2Var) {
        this(pr2Var, 1, 0L, TimeUnit.NANOSECONDS, null);
    }

    /* JADX INFO: renamed from: a */
    public void m27069a(RunnableC16242a runnableC16242a) {
        synchronized (this) {
            try {
                RunnableC16242a runnableC16242a2 = this.f105966f;
                if (runnableC16242a2 != null && runnableC16242a2 == runnableC16242a) {
                    long j = runnableC16242a.f105969c - 1;
                    runnableC16242a.f105969c = j;
                    if (j == 0 && runnableC16242a.f105970d) {
                        if (this.f105963c == 0) {
                            m27073e(runnableC16242a);
                            return;
                        }
                        b0f b0fVar = new b0f();
                        runnableC16242a.f105968b = b0fVar;
                        b0fVar.replace(this.f105965e.scheduleDirect(runnableC16242a, this.f105963c, this.f105964d));
                    }
                }
            } finally {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m27070b(RunnableC16242a runnableC16242a) {
        mf4 mf4Var = runnableC16242a.f105968b;
        if (mf4Var != null) {
            mf4Var.dispose();
            runnableC16242a.f105968b = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m27071c(RunnableC16242a runnableC16242a) {
        pr2<T> pr2Var = this.f105961a;
        if (pr2Var instanceof mf4) {
            ((mf4) pr2Var).dispose();
        } else if (pr2Var instanceof m5e) {
            ((m5e) pr2Var).resetIf(runnableC16242a.get());
        }
    }

    /* JADX INFO: renamed from: d */
    public void m27072d(RunnableC16242a runnableC16242a) {
        synchronized (this) {
            try {
                if (this.f105961a instanceof ksb) {
                    RunnableC16242a runnableC16242a2 = this.f105966f;
                    if (runnableC16242a2 != null && runnableC16242a2 == runnableC16242a) {
                        this.f105966f = null;
                        m27070b(runnableC16242a);
                    }
                    long j = runnableC16242a.f105969c - 1;
                    runnableC16242a.f105969c = j;
                    if (j == 0) {
                        m27071c(runnableC16242a);
                    }
                } else {
                    RunnableC16242a runnableC16242a3 = this.f105966f;
                    if (runnableC16242a3 != null && runnableC16242a3 == runnableC16242a) {
                        m27070b(runnableC16242a);
                        long j2 = runnableC16242a.f105969c - 1;
                        runnableC16242a.f105969c = j2;
                        if (j2 == 0) {
                            this.f105966f = null;
                            m27071c(runnableC16242a);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m27073e(RunnableC16242a runnableC16242a) {
        synchronized (this) {
            try {
                if (runnableC16242a.f105969c == 0 && runnableC16242a == this.f105966f) {
                    this.f105966f = null;
                    mf4 mf4Var = runnableC16242a.get();
                    ag4.dispose(runnableC16242a);
                    pr2<T> pr2Var = this.f105961a;
                    if (pr2Var instanceof mf4) {
                        ((mf4) pr2Var).dispose();
                    } else if (pr2Var instanceof m5e) {
                        if (mf4Var == null) {
                            runnableC16242a.f105971e = true;
                        } else {
                            ((m5e) pr2Var).resetIf(mf4Var);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        RunnableC16242a runnableC16242a;
        boolean z;
        mf4 mf4Var;
        synchronized (this) {
            try {
                runnableC16242a = this.f105966f;
                if (runnableC16242a == null) {
                    runnableC16242a = new RunnableC16242a(this);
                    this.f105966f = runnableC16242a;
                }
                long j = runnableC16242a.f105969c;
                if (j == 0 && (mf4Var = runnableC16242a.f105968b) != null) {
                    mf4Var.dispose();
                }
                long j2 = j + 1;
                runnableC16242a.f105969c = j2;
                if (runnableC16242a.f105970d || j2 != this.f105962b) {
                    z = false;
                } else {
                    z = true;
                    runnableC16242a.f105970d = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f105961a.subscribe(new C16243b(oxbVar, this, runnableC16242a));
        if (z) {
            this.f105961a.connect(runnableC16242a);
        }
    }

    public zsb(pr2<T> pr2Var, int i, long j, TimeUnit timeUnit, voe voeVar) {
        this.f105961a = pr2Var;
        this.f105962b = i;
        this.f105963c = j;
        this.f105964d = timeUnit;
        this.f105965e = voeVar;
    }
}
