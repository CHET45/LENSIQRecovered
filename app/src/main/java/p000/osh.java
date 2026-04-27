package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class osh<T> extends ncg<T> {

    /* JADX INFO: renamed from: H */
    public boolean f68619H;

    /* JADX INFO: renamed from: a */
    public final qzf<T> f68620a;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Runnable> f68622c;

    /* JADX INFO: renamed from: d */
    public final boolean f68623d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f68624e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f68625f;

    /* JADX INFO: renamed from: m */
    public Throwable f68626m;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<pxb<? super T>> f68621b = new AtomicReference<>();

    /* JADX INFO: renamed from: C */
    public final AtomicBoolean f68617C = new AtomicBoolean();

    /* JADX INFO: renamed from: F */
    public final pv0<T> f68618F = new C10645a();

    /* JADX INFO: renamed from: osh$a */
    public final class C10645a extends pv0<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public C10645a() {
        }

        @Override // p000.zif
        public void clear() {
            osh.this.f68620a.clear();
        }

        @Override // p000.lf4
        public void dispose() {
            if (osh.this.f68624e) {
                return;
            }
            osh.this.f68624e = true;
            osh.this.m18973a();
            osh.this.f68621b.lazySet(null);
            if (osh.this.f68618F.getAndIncrement() == 0) {
                osh.this.f68621b.lazySet(null);
                osh oshVar = osh.this;
                if (oshVar.f68619H) {
                    return;
                }
                oshVar.f68620a.clear();
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return osh.this.f68624e;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return osh.this.f68620a.isEmpty();
        }

        @Override // p000.zif
        @dib
        public T poll() {
            return osh.this.f68620a.poll();
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            osh.this.f68619H = true;
            return 2;
        }
    }

    public osh(int capacityHint, Runnable onTerminate, boolean delayError) {
        this.f68620a = new qzf<>(capacityHint);
        this.f68622c = new AtomicReference<>(onTerminate);
        this.f68623d = delayError;
    }

    @cfb
    @cy1
    public static <T> osh<T> create() {
        return new osh<>(vkb.bufferSize(), null, true);
    }

    /* JADX INFO: renamed from: a */
    public void m18973a() {
        Runnable runnable = this.f68622c.get();
        if (runnable == null || !v7b.m23844a(this.f68622c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    public void m18974b() {
        if (this.f68618F.getAndIncrement() != 0) {
            return;
        }
        pxb<? super T> pxbVar = this.f68621b.get();
        int iAddAndGet = 1;
        while (pxbVar == null) {
            iAddAndGet = this.f68618F.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                pxbVar = this.f68621b.get();
            }
        }
        if (this.f68619H) {
            m18975c(pxbVar);
        } else {
            m18976d(pxbVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18975c(pxb<? super T> a) {
        qzf<T> qzfVar = this.f68620a;
        boolean z = this.f68623d;
        int iAddAndGet = 1;
        while (!this.f68624e) {
            boolean z2 = this.f68625f;
            if (!z && z2 && m18978f(qzfVar, a)) {
                return;
            }
            a.onNext(null);
            if (z2) {
                m18977e(a);
                return;
            } else {
                iAddAndGet = this.f68618F.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f68621b.lazySet(null);
    }

    /* JADX INFO: renamed from: d */
    public void m18976d(pxb<? super T> pxbVar) {
        qzf<T> qzfVar = this.f68620a;
        boolean z = this.f68623d;
        boolean z2 = true;
        int iAddAndGet = 1;
        while (!this.f68624e) {
            boolean z3 = this.f68625f;
            T tPoll = this.f68620a.poll();
            boolean z4 = tPoll == null;
            if (z3) {
                if (!z && z2) {
                    if (m18978f(qzfVar, pxbVar)) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (z4) {
                    m18977e(pxbVar);
                    return;
                }
            }
            if (z4) {
                iAddAndGet = this.f68618F.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                pxbVar.onNext(tPoll);
            }
        }
        this.f68621b.lazySet(null);
        qzfVar.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m18977e(pxb<? super T> a) {
        this.f68621b.lazySet(null);
        Throwable th = this.f68626m;
        if (th != null) {
            a.onError(th);
        } else {
            a.onComplete();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m18978f(final zif<T> q, pxb<? super T> a) {
        Throwable th = this.f68626m;
        if (th == null) {
            return false;
        }
        this.f68621b.lazySet(null);
        q.clear();
        a.onError(th);
        return true;
    }

    @Override // p000.ncg
    @dib
    @cy1
    public Throwable getThrowable() {
        if (this.f68625f) {
            return this.f68626m;
        }
        return null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasComplete() {
        return this.f68625f && this.f68626m == null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasObservers() {
        return this.f68621b.get() != null;
    }

    @Override // p000.ncg
    @cy1
    public boolean hasThrowable() {
        return this.f68625f && this.f68626m != null;
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f68625f || this.f68624e) {
            return;
        }
        this.f68625f = true;
        m18973a();
        m18974b();
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        k75.nullCheck(t, "onError called with a null Throwable.");
        if (this.f68625f || this.f68624e) {
            ofe.onError(t);
            return;
        }
        this.f68626m = t;
        this.f68625f = true;
        m18973a();
        m18974b();
    }

    @Override // p000.pxb
    public void onNext(T t) {
        k75.nullCheck(t, "onNext called with a null value.");
        if (this.f68625f || this.f68624e) {
            return;
        }
        this.f68620a.offer(t);
        m18974b();
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (this.f68625f || this.f68624e) {
            d.dispose();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        if (this.f68617C.get() || !this.f68617C.compareAndSet(false, true)) {
            b05.error(new IllegalStateException("Only a single observer allowed."), observer);
            return;
        }
        observer.onSubscribe(this.f68618F);
        this.f68621b.lazySet(observer);
        if (this.f68624e) {
            this.f68621b.lazySet(null);
        } else {
            m18974b();
        }
    }

    @cfb
    @cy1
    public static <T> osh<T> create(int capacityHint) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        return new osh<>(capacityHint, null, true);
    }

    @cfb
    @cy1
    public static <T> osh<T> create(int capacityHint, @cfb Runnable onTerminate) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        Objects.requireNonNull(onTerminate, "onTerminate");
        return new osh<>(capacityHint, onTerminate, true);
    }

    @cfb
    @cy1
    public static <T> osh<T> create(int capacityHint, @cfb Runnable onTerminate, boolean delayError) {
        yjb.verifyPositive(capacityHint, "capacityHint");
        Objects.requireNonNull(onTerminate, "onTerminate");
        return new osh<>(capacityHint, onTerminate, delayError);
    }

    @cfb
    @cy1
    public static <T> osh<T> create(boolean delayError) {
        return new osh<>(vkb.bufferSize(), null, delayError);
    }
}
