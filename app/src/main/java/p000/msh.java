package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class msh<T> extends rg6<T> {

    /* JADX INFO: renamed from: C */
    public volatile boolean f61975C;

    /* JADX INFO: renamed from: F */
    public final AtomicBoolean f61976F;

    /* JADX INFO: renamed from: H */
    public final sv0<T> f61977H;

    /* JADX INFO: renamed from: L */
    public final AtomicLong f61978L;

    /* JADX INFO: renamed from: M */
    public boolean f61979M;

    /* JADX INFO: renamed from: b */
    public final rzf<T> f61980b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Runnable> f61981c;

    /* JADX INFO: renamed from: d */
    public final boolean f61982d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f61983e;

    /* JADX INFO: renamed from: f */
    public Throwable f61984f;

    /* JADX INFO: renamed from: m */
    public final AtomicReference<ycg<? super T>> f61985m;

    /* JADX INFO: renamed from: msh$a */
    public final class C9505a extends sv0<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        public C9505a() {
        }

        @Override // p000.fdg
        public void cancel() {
            if (msh.this.f61975C) {
                return;
            }
            msh.this.f61975C = true;
            msh.this.m17542c();
            msh.this.f61985m.lazySet(null);
            if (msh.this.f61977H.getAndIncrement() == 0) {
                msh.this.f61985m.lazySet(null);
                msh mshVar = msh.this;
                if (mshVar.f61979M) {
                    return;
                }
                mshVar.f61980b.clear();
            }
        }

        @Override // p000.ajf
        public void clear() {
            msh.this.f61980b.clear();
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return msh.this.f61980b.isEmpty();
        }

        @Override // p000.ajf
        @cib
        public T poll() {
            return msh.this.f61980b.poll();
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(msh.this.f61978L, j);
                msh.this.m17543d();
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            msh.this.f61979M = true;
            return 2;
        }
    }

    public msh(int i) {
        this(i, null, true);
    }

    @bfb
    @by1
    public static <T> msh<T> create() {
        return new msh<>(m86.bufferSize());
    }

    /* JADX INFO: renamed from: b */
    public boolean m17541b(boolean z, boolean z2, boolean z3, ycg<? super T> ycgVar, rzf<T> rzfVar) {
        if (this.f61975C) {
            rzfVar.clear();
            this.f61985m.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.f61984f != null) {
            rzfVar.clear();
            this.f61985m.lazySet(null);
            ycgVar.onError(this.f61984f);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.f61984f;
        this.f61985m.lazySet(null);
        if (th != null) {
            ycgVar.onError(th);
        } else {
            ycgVar.onComplete();
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public void m17542c() {
        Runnable andSet = this.f61981c.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m17543d() {
        if (this.f61977H.getAndIncrement() != 0) {
            return;
        }
        ycg<? super T> ycgVar = this.f61985m.get();
        int iAddAndGet = 1;
        while (ycgVar == null) {
            iAddAndGet = this.f61977H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                ycgVar = this.f61985m.get();
            }
        }
        if (this.f61979M) {
            m17544e(ycgVar);
        } else {
            m17545f(ycgVar);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m17544e(ycg<? super T> ycgVar) {
        rzf<T> rzfVar = this.f61980b;
        boolean z = this.f61982d;
        int iAddAndGet = 1;
        while (!this.f61975C) {
            boolean z2 = this.f61983e;
            if (!z && z2 && this.f61984f != null) {
                rzfVar.clear();
                this.f61985m.lazySet(null);
                ycgVar.onError(this.f61984f);
                return;
            }
            ycgVar.onNext(null);
            if (z2) {
                this.f61985m.lazySet(null);
                Throwable th = this.f61984f;
                if (th != null) {
                    ycgVar.onError(th);
                    return;
                } else {
                    ycgVar.onComplete();
                    return;
                }
            }
            iAddAndGet = this.f61977H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
        this.f61985m.lazySet(null);
    }

    /* JADX INFO: renamed from: f */
    public void m17545f(ycg<? super T> ycgVar) {
        long j;
        rzf<T> rzfVar = this.f61980b;
        boolean z = true;
        boolean z2 = !this.f61982d;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.f61978L.get();
            long j3 = 0;
            while (true) {
                if (j2 == j3) {
                    j = j3;
                    break;
                }
                boolean z3 = this.f61983e;
                T tPoll = rzfVar.poll();
                boolean z4 = tPoll == null ? z : false;
                j = j3;
                if (m17541b(z2, z3, z4, ycgVar, rzfVar)) {
                    return;
                }
                if (z4) {
                    break;
                }
                ycgVar.onNext(tPoll);
                j3 = 1 + j;
                z = true;
            }
            if (j2 == j3 && m17541b(z2, this.f61983e, rzfVar.isEmpty(), ycgVar, rzfVar)) {
                return;
            }
            if (j != 0 && j2 != Long.MAX_VALUE) {
                this.f61978L.addAndGet(-j);
            }
            iAddAndGet = this.f61977H.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                z = true;
            }
        }
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        if (this.f61983e) {
            return this.f61984f;
        }
        return null;
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return this.f61983e && this.f61984f == null;
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f61985m.get() != null;
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return this.f61983e && this.f61984f != null;
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f61983e || this.f61975C) {
            return;
        }
        this.f61983e = true;
        m17542c();
        m17543d();
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61983e || this.f61975C) {
            pfe.onError(th);
            return;
        }
        this.f61984f = th;
        this.f61983e = true;
        m17542c();
        m17543d();
    }

    @Override // p000.ycg
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f61983e || this.f61975C) {
            return;
        }
        this.f61980b.offer(t);
        m17543d();
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (this.f61983e || this.f61975C) {
            fdgVar.cancel();
        } else {
            fdgVar.request(Long.MAX_VALUE);
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (this.f61976F.get() || !this.f61976F.compareAndSet(false, true)) {
            x05.error(new IllegalStateException("This processor allows only a single Subscriber"), ycgVar);
            return;
        }
        ycgVar.onSubscribe(this.f61977H);
        this.f61985m.set(ycgVar);
        if (this.f61975C) {
            this.f61985m.lazySet(null);
        } else {
            m17543d();
        }
    }

    public msh(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    @bfb
    @by1
    public static <T> msh<T> create(int i) {
        return new msh<>(i);
    }

    public msh(int i, Runnable runnable, boolean z) {
        this.f61980b = new rzf<>(xjb.verifyPositive(i, "capacityHint"));
        this.f61981c = new AtomicReference<>(runnable);
        this.f61982d = z;
        this.f61985m = new AtomicReference<>();
        this.f61976F = new AtomicBoolean();
        this.f61977H = new C9505a();
        this.f61978L = new AtomicLong();
    }

    @bfb
    @by1
    public static <T> msh<T> create(boolean z) {
        return new msh<>(m86.bufferSize(), null, z);
    }

    @bfb
    @by1
    public static <T> msh<T> create(int i, Runnable runnable) {
        xjb.requireNonNull(runnable, "onTerminate");
        return new msh<>(i, runnable);
    }

    @bfb
    @by1
    public static <T> msh<T> create(int i, Runnable runnable, boolean z) {
        xjb.requireNonNull(runnable, "onTerminate");
        return new msh<>(i, runnable, z);
    }
}
