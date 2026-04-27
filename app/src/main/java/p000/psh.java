package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class psh<T> extends mcg<T> {

    /* JADX INFO: renamed from: C */
    public final AtomicBoolean f71957C;

    /* JADX INFO: renamed from: F */
    public final qv0<T> f71958F;

    /* JADX INFO: renamed from: H */
    public boolean f71959H;

    /* JADX INFO: renamed from: a */
    public final rzf<T> f71960a;

    /* JADX INFO: renamed from: b */
    public final AtomicReference<oxb<? super T>> f71961b;

    /* JADX INFO: renamed from: c */
    public final AtomicReference<Runnable> f71962c;

    /* JADX INFO: renamed from: d */
    public final boolean f71963d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f71964e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f71965f;

    /* JADX INFO: renamed from: m */
    public Throwable f71966m;

    /* JADX INFO: renamed from: psh$a */
    public final class C11113a extends qv0<T> {
        private static final long serialVersionUID = 7926949470189395511L;

        public C11113a() {
        }

        @Override // p000.ajf
        public void clear() {
            psh.this.f71960a.clear();
        }

        @Override // p000.mf4
        public void dispose() {
            if (psh.this.f71964e) {
                return;
            }
            psh.this.f71964e = true;
            psh.this.m19756a();
            psh.this.f71961b.lazySet(null);
            if (psh.this.f71958F.getAndIncrement() == 0) {
                psh.this.f71961b.lazySet(null);
                psh pshVar = psh.this;
                if (pshVar.f71959H) {
                    return;
                }
                pshVar.f71960a.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return psh.this.f71964e;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return psh.this.f71960a.isEmpty();
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            return psh.this.f71960a.poll();
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            psh.this.f71959H = true;
            return 2;
        }
    }

    public psh(int i, boolean z) {
        this.f71960a = new rzf<>(xjb.verifyPositive(i, "capacityHint"));
        this.f71962c = new AtomicReference<>();
        this.f71963d = z;
        this.f71961b = new AtomicReference<>();
        this.f71957C = new AtomicBoolean();
        this.f71958F = new C11113a();
    }

    @bfb
    @by1
    public static <T> psh<T> create() {
        return new psh<>(Observable.bufferSize(), true);
    }

    /* JADX INFO: renamed from: a */
    public void m19756a() {
        Runnable runnable = this.f71962c.get();
        if (runnable == null || !v7b.m23844a(this.f71962c, runnable, null)) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: b */
    public void m19757b() {
        if (this.f71958F.getAndIncrement() != 0) {
            return;
        }
        oxb<? super T> oxbVar = this.f71961b.get();
        int iAddAndGet = 1;
        while (oxbVar == null) {
            iAddAndGet = this.f71958F.addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            } else {
                oxbVar = this.f71961b.get();
            }
        }
        if (this.f71959H) {
            m19758c(oxbVar);
        } else {
            m19759d(oxbVar);
        }
    }

    /* JADX INFO: renamed from: c */
    public void m19758c(oxb<? super T> oxbVar) {
        rzf<T> rzfVar = this.f71960a;
        boolean z = this.f71963d;
        int iAddAndGet = 1;
        while (!this.f71964e) {
            boolean z2 = this.f71965f;
            if (!z && z2 && m19761f(rzfVar, oxbVar)) {
                return;
            }
            oxbVar.onNext(null);
            if (z2) {
                m19760e(oxbVar);
                return;
            } else {
                iAddAndGet = this.f71958F.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
        this.f71961b.lazySet(null);
    }

    /* JADX INFO: renamed from: d */
    public void m19759d(oxb<? super T> oxbVar) {
        rzf<T> rzfVar = this.f71960a;
        boolean z = this.f71963d;
        boolean z2 = true;
        int iAddAndGet = 1;
        while (!this.f71964e) {
            boolean z3 = this.f71965f;
            T tPoll = this.f71960a.poll();
            boolean z4 = tPoll == null;
            if (z3) {
                if (!z && z2) {
                    if (m19761f(rzfVar, oxbVar)) {
                        return;
                    } else {
                        z2 = false;
                    }
                }
                if (z4) {
                    m19760e(oxbVar);
                    return;
                }
            }
            if (z4) {
                iAddAndGet = this.f71958F.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                oxbVar.onNext(tPoll);
            }
        }
        this.f71961b.lazySet(null);
        rzfVar.clear();
    }

    /* JADX INFO: renamed from: e */
    public void m19760e(oxb<? super T> oxbVar) {
        this.f71961b.lazySet(null);
        Throwable th = this.f71966m;
        if (th != null) {
            oxbVar.onError(th);
        } else {
            oxbVar.onComplete();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m19761f(ajf<T> ajfVar, oxb<? super T> oxbVar) {
        Throwable th = this.f71966m;
        if (th == null) {
            return false;
        }
        this.f71961b.lazySet(null);
        ajfVar.clear();
        oxbVar.onError(th);
        return true;
    }

    @Override // p000.mcg
    @cib
    public Throwable getThrowable() {
        if (this.f71965f) {
            return this.f71966m;
        }
        return null;
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return this.f71965f && this.f71966m == null;
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f71961b.get() != null;
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return this.f71965f && this.f71966m != null;
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f71965f || this.f71964e) {
            return;
        }
        this.f71965f = true;
        m19756a();
        m19757b();
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        xjb.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71965f || this.f71964e) {
            pfe.onError(th);
            return;
        }
        this.f71966m = th;
        this.f71965f = true;
        m19756a();
        m19757b();
    }

    @Override // p000.oxb
    public void onNext(T t) {
        xjb.requireNonNull(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f71965f || this.f71964e) {
            return;
        }
        this.f71960a.offer(t);
        m19757b();
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (this.f71965f || this.f71964e) {
            mf4Var.dispose();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        if (this.f71957C.get() || !this.f71957C.compareAndSet(false, true)) {
            c05.error(new IllegalStateException("Only a single observer allowed."), oxbVar);
            return;
        }
        oxbVar.onSubscribe(this.f71958F);
        this.f71961b.lazySet(oxbVar);
        if (this.f71964e) {
            this.f71961b.lazySet(null);
        } else {
            m19757b();
        }
    }

    @bfb
    @by1
    public static <T> psh<T> create(int i) {
        return new psh<>(i, true);
    }

    @bfb
    @by1
    public static <T> psh<T> create(int i, Runnable runnable) {
        return new psh<>(i, runnable, true);
    }

    @bfb
    @by1
    public static <T> psh<T> create(int i, Runnable runnable, boolean z) {
        return new psh<>(i, runnable, z);
    }

    @bfb
    @by1
    public static <T> psh<T> create(boolean z) {
        return new psh<>(Observable.bufferSize(), z);
    }

    public psh(int i, Runnable runnable) {
        this(i, runnable, true);
    }

    public psh(int i, Runnable runnable, boolean z) {
        this.f71960a = new rzf<>(xjb.verifyPositive(i, "capacityHint"));
        this.f71962c = new AtomicReference<>(xjb.requireNonNull(runnable, "onTerminate"));
        this.f71963d = z;
        this.f71961b = new AtomicReference<>();
        this.f71957C = new AtomicBoolean();
        this.f71958F = new C11113a();
    }
}
