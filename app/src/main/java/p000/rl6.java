package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class rl6<T, B> extends AbstractC8162k1<T, m86<T>> {

    /* JADX INFO: renamed from: c */
    public final Callable<? extends zjd<B>> f78615c;

    /* JADX INFO: renamed from: d */
    public final int f78616d;

    /* JADX INFO: renamed from: rl6$a */
    public static final class C12143a<T, B> extends mg4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC12144b<T, B> f78617b;

        /* JADX INFO: renamed from: c */
        public boolean f78618c;

        public C12143a(RunnableC12144b<T, B> runnableC12144b) {
            this.f78617b = runnableC12144b;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f78618c) {
                return;
            }
            this.f78618c = true;
            this.f78617b.m21421c();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f78618c) {
                pfe.onError(th);
            } else {
                this.f78618c = true;
                this.f78617b.m21422d(th);
            }
        }

        @Override // p000.ycg
        public void onNext(B b) {
            if (this.f78618c) {
                return;
            }
            this.f78618c = true;
            dispose();
            this.f78617b.m21423e(this);
        }
    }

    /* JADX INFO: renamed from: rl6$b */
    public static final class RunnableC12144b<T, B> extends AtomicInteger implements lj6<T>, fdg, Runnable {

        /* JADX INFO: renamed from: Q */
        public static final C12143a<Object, Object> f78619Q = new C12143a<>(null);

        /* JADX INFO: renamed from: X */
        public static final Object f78620X = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: C */
        public final Callable<? extends zjd<B>> f78621C;

        /* JADX INFO: renamed from: H */
        public fdg f78623H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f78624L;

        /* JADX INFO: renamed from: M */
        public msh<T> f78625M;

        /* JADX INFO: renamed from: N */
        public long f78626N;

        /* JADX INFO: renamed from: a */
        public final ycg<? super m86<T>> f78627a;

        /* JADX INFO: renamed from: b */
        public final int f78628b;

        /* JADX INFO: renamed from: c */
        public final AtomicReference<C12143a<T, B>> f78629c = new AtomicReference<>();

        /* JADX INFO: renamed from: d */
        public final AtomicInteger f78630d = new AtomicInteger(1);

        /* JADX INFO: renamed from: e */
        public final s1b<Object> f78631e = new s1b<>();

        /* JADX INFO: renamed from: f */
        public final cc0 f78632f = new cc0();

        /* JADX INFO: renamed from: m */
        public final AtomicBoolean f78633m = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicLong f78622F = new AtomicLong();

        public RunnableC12144b(ycg<? super m86<T>> ycgVar, int i, Callable<? extends zjd<B>> callable) {
            this.f78627a = ycgVar;
            this.f78628b = i;
            this.f78621C = callable;
        }

        /* JADX INFO: renamed from: a */
        public void m21419a() {
            AtomicReference<C12143a<T, B>> atomicReference = this.f78629c;
            C12143a<Object, Object> c12143a = f78619Q;
            C12143a<T, B> andSet = atomicReference.getAndSet((C12143a<T, B>) c12143a);
            if (andSet == null || andSet == c12143a) {
                return;
            }
            andSet.dispose();
        }

        /* JADX INFO: renamed from: b */
        public void m21420b() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super m86<T>> ycgVar = this.f78627a;
            s1b<Object> s1bVar = this.f78631e;
            cc0 cc0Var = this.f78632f;
            long j = this.f78626N;
            int iAddAndGet = 1;
            while (this.f78630d.get() != 0) {
                msh<T> mshVar = this.f78625M;
                boolean z = this.f78624L;
                if (z && cc0Var.get() != null) {
                    s1bVar.clear();
                    Throwable thTerminate = cc0Var.terminate();
                    if (mshVar != null) {
                        this.f78625M = null;
                        mshVar.onError(thTerminate);
                    }
                    ycgVar.onError(thTerminate);
                    return;
                }
                Object objPoll = s1bVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = cc0Var.terminate();
                    if (thTerminate2 == null) {
                        if (mshVar != null) {
                            this.f78625M = null;
                            mshVar.onComplete();
                        }
                        ycgVar.onComplete();
                        return;
                    }
                    if (mshVar != null) {
                        this.f78625M = null;
                        mshVar.onError(thTerminate2);
                    }
                    ycgVar.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    this.f78626N = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f78620X) {
                    mshVar.onNext((T) objPoll);
                } else {
                    if (mshVar != null) {
                        this.f78625M = null;
                        mshVar.onComplete();
                    }
                    if (!this.f78633m.get()) {
                        if (j != this.f78622F.get()) {
                            msh<T> mshVarCreate = msh.create(this.f78628b, this);
                            this.f78625M = mshVarCreate;
                            this.f78630d.getAndIncrement();
                            try {
                                zjd zjdVar = (zjd) xjb.requireNonNull(this.f78621C.call(), "The other Callable returned a null Publisher");
                                C12143a c12143a = new C12143a(this);
                                if (v7b.m23844a(this.f78629c, null, c12143a)) {
                                    zjdVar.subscribe(c12143a);
                                    j++;
                                    ycgVar.onNext(mshVarCreate);
                                }
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                cc0Var.addThrowable(th);
                                this.f78624L = true;
                            }
                        } else {
                            this.f78623H.cancel();
                            m21419a();
                            cc0Var.addThrowable(new cwa("Could not deliver a window due to lack of requests"));
                            this.f78624L = true;
                        }
                    }
                }
            }
            s1bVar.clear();
            this.f78625M = null;
        }

        /* JADX INFO: renamed from: c */
        public void m21421c() {
            this.f78623H.cancel();
            this.f78624L = true;
            m21420b();
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f78633m.compareAndSet(false, true)) {
                m21419a();
                if (this.f78630d.decrementAndGet() == 0) {
                    this.f78623H.cancel();
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m21422d(Throwable th) {
            this.f78623H.cancel();
            if (!this.f78632f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f78624L = true;
                m21420b();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m21423e(C12143a<T, B> c12143a) {
            v7b.m23844a(this.f78629c, c12143a, null);
            this.f78631e.offer(f78620X);
            m21420b();
        }

        @Override // p000.ycg
        public void onComplete() {
            m21419a();
            this.f78624L = true;
            m21420b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            m21419a();
            if (!this.f78632f.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f78624L = true;
                m21420b();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f78631e.offer(t);
            m21420b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f78623H, fdgVar)) {
                this.f78623H = fdgVar;
                this.f78627a.onSubscribe(this);
                this.f78631e.offer(f78620X);
                m21420b();
                fdgVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f78622F, j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f78630d.decrementAndGet() == 0) {
                this.f78623H.cancel();
            }
        }
    }

    public rl6(m86<T> m86Var, Callable<? extends zjd<B>> callable, int i) {
        super(m86Var);
        this.f78615c = callable;
        this.f78616d = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super m86<T>> ycgVar) {
        this.f52360b.subscribe((lj6) new RunnableC12144b(ycgVar, this.f78616d, this.f78615c));
    }
}
