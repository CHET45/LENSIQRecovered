package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nl6<T, B> extends AbstractC8162k1<T, m86<T>> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f64843c;

    /* JADX INFO: renamed from: d */
    public final int f64844d;

    /* JADX INFO: renamed from: nl6$a */
    public static final class C9917a<T, B> extends mg4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC9918b<T, B> f64845b;

        /* JADX INFO: renamed from: c */
        public boolean f64846c;

        public C9917a(RunnableC9918b<T, B> runnableC9918b) {
            this.f64845b = runnableC9918b;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f64846c) {
                return;
            }
            this.f64846c = true;
            this.f64845b.m17982b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f64846c) {
                pfe.onError(th);
            } else {
                this.f64846c = true;
                this.f64845b.m17983c(th);
            }
        }

        @Override // p000.ycg
        public void onNext(B b) {
            if (this.f64846c) {
                return;
            }
            this.f64845b.m17984d();
        }
    }

    /* JADX INFO: renamed from: nl6$b */
    public static final class RunnableC9918b<T, B> extends AtomicInteger implements lj6<T>, fdg, Runnable {

        /* JADX INFO: renamed from: N */
        public static final Object f64847N = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: H */
        public volatile boolean f64850H;

        /* JADX INFO: renamed from: L */
        public msh<T> f64851L;

        /* JADX INFO: renamed from: M */
        public long f64852M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super m86<T>> f64853a;

        /* JADX INFO: renamed from: b */
        public final int f64854b;

        /* JADX INFO: renamed from: c */
        public final C9917a<T, B> f64855c = new C9917a<>(this);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f64856d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f64857e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final s1b<Object> f64858f = new s1b<>();

        /* JADX INFO: renamed from: m */
        public final cc0 f64859m = new cc0();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f64848C = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicLong f64849F = new AtomicLong();

        public RunnableC9918b(ycg<? super m86<T>> ycgVar, int i) {
            this.f64853a = ycgVar;
            this.f64854b = i;
        }

        /* JADX INFO: renamed from: a */
        public void m17981a() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super m86<T>> ycgVar = this.f64853a;
            s1b<Object> s1bVar = this.f64858f;
            cc0 cc0Var = this.f64859m;
            long j = this.f64852M;
            int iAddAndGet = 1;
            while (this.f64857e.get() != 0) {
                msh<T> mshVar = this.f64851L;
                boolean z = this.f64850H;
                if (z && cc0Var.get() != null) {
                    s1bVar.clear();
                    Throwable thTerminate = cc0Var.terminate();
                    if (mshVar != null) {
                        this.f64851L = null;
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
                            this.f64851L = null;
                            mshVar.onComplete();
                        }
                        ycgVar.onComplete();
                        return;
                    }
                    if (mshVar != null) {
                        this.f64851L = null;
                        mshVar.onError(thTerminate2);
                    }
                    ycgVar.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    this.f64852M = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f64847N) {
                    mshVar.onNext((T) objPoll);
                } else {
                    if (mshVar != null) {
                        this.f64851L = null;
                        mshVar.onComplete();
                    }
                    if (!this.f64848C.get()) {
                        msh<T> mshVarCreate = msh.create(this.f64854b, this);
                        this.f64851L = mshVarCreate;
                        this.f64857e.getAndIncrement();
                        if (j != this.f64849F.get()) {
                            j++;
                            ycgVar.onNext(mshVarCreate);
                        } else {
                            mdg.cancel(this.f64856d);
                            this.f64855c.dispose();
                            cc0Var.addThrowable(new cwa("Could not deliver a window due to lack of requests"));
                            this.f64850H = true;
                        }
                    }
                }
            }
            s1bVar.clear();
            this.f64851L = null;
        }

        /* JADX INFO: renamed from: b */
        public void m17982b() {
            mdg.cancel(this.f64856d);
            this.f64850H = true;
            m17981a();
        }

        /* JADX INFO: renamed from: c */
        public void m17983c(Throwable th) {
            mdg.cancel(this.f64856d);
            if (!this.f64859m.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f64850H = true;
                m17981a();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f64848C.compareAndSet(false, true)) {
                this.f64855c.dispose();
                if (this.f64857e.decrementAndGet() == 0) {
                    mdg.cancel(this.f64856d);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m17984d() {
            this.f64858f.offer(f64847N);
            m17981a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f64855c.dispose();
            this.f64850H = true;
            m17981a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f64855c.dispose();
            if (!this.f64859m.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f64850H = true;
                m17981a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f64858f.offer(t);
            m17981a();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this.f64856d, fdgVar, Long.MAX_VALUE);
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f64849F, j);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f64857e.decrementAndGet() == 0) {
                mdg.cancel(this.f64856d);
            }
        }
    }

    public nl6(m86<T> m86Var, zjd<B> zjdVar, int i) {
        super(m86Var);
        this.f64843c = zjdVar;
        this.f64844d = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super m86<T>> ycgVar) {
        RunnableC9918b runnableC9918b = new RunnableC9918b(ycgVar, this.f64844d);
        ycgVar.onSubscribe(runnableC9918b);
        runnableC9918b.m17984d();
        this.f64843c.subscribe(runnableC9918b.f64855c);
        this.f52360b.subscribe((lj6) runnableC9918b);
    }
}
