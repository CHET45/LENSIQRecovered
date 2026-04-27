package p000;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ol6<T, B> extends AbstractC7714j1<T, l86<T>> {

    /* JADX INFO: renamed from: c */
    public final zjd<B> f68031c;

    /* JADX INFO: renamed from: d */
    public final int f68032d;

    /* JADX INFO: renamed from: ol6$a */
    public static final class C10451a<T, B> extends ng4<B> {

        /* JADX INFO: renamed from: b */
        public final RunnableC10452b<T, B> f68033b;

        /* JADX INFO: renamed from: c */
        public boolean f68034c;

        public C10451a(RunnableC10452b<T, B> parent) {
            this.f68033b = parent;
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f68034c) {
                return;
            }
            this.f68034c = true;
            this.f68033b.m18764b();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            if (this.f68034c) {
                ofe.onError(t);
            } else {
                this.f68034c = true;
                this.f68033b.m18765c(t);
            }
        }

        @Override // p000.ycg
        public void onNext(B t) {
            if (this.f68034c) {
                return;
            }
            this.f68033b.m18766d();
        }
    }

    /* JADX INFO: renamed from: ol6$b */
    public static final class RunnableC10452b<T, B> extends AtomicInteger implements kj6<T>, fdg, Runnable {

        /* JADX INFO: renamed from: N */
        public static final Object f68035N = new Object();
        private static final long serialVersionUID = 2233020065421370272L;

        /* JADX INFO: renamed from: H */
        public volatile boolean f68038H;

        /* JADX INFO: renamed from: L */
        public nsh<T> f68039L;

        /* JADX INFO: renamed from: M */
        public long f68040M;

        /* JADX INFO: renamed from: a */
        public final ycg<? super l86<T>> f68041a;

        /* JADX INFO: renamed from: b */
        public final int f68042b;

        /* JADX INFO: renamed from: c */
        public final C10451a<T, B> f68043c = new C10451a<>(this);

        /* JADX INFO: renamed from: d */
        public final AtomicReference<fdg> f68044d = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final AtomicInteger f68045e = new AtomicInteger(1);

        /* JADX INFO: renamed from: f */
        public final t1b<Object> f68046f = new t1b<>();

        /* JADX INFO: renamed from: m */
        public final bc0 f68047m = new bc0();

        /* JADX INFO: renamed from: C */
        public final AtomicBoolean f68036C = new AtomicBoolean();

        /* JADX INFO: renamed from: F */
        public final AtomicLong f68037F = new AtomicLong();

        public RunnableC10452b(ycg<? super l86<T>> downstream, int capacityHint) {
            this.f68041a = downstream;
            this.f68042b = capacityHint;
        }

        /* JADX INFO: renamed from: a */
        public void m18763a() {
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super l86<T>> ycgVar = this.f68041a;
            t1b<Object> t1bVar = this.f68046f;
            bc0 bc0Var = this.f68047m;
            long j = this.f68040M;
            int iAddAndGet = 1;
            while (this.f68045e.get() != 0) {
                nsh<T> nshVar = this.f68039L;
                boolean z = this.f68038H;
                if (z && bc0Var.get() != null) {
                    t1bVar.clear();
                    Throwable thTerminate = bc0Var.terminate();
                    if (nshVar != null) {
                        this.f68039L = null;
                        nshVar.onError(thTerminate);
                    }
                    ycgVar.onError(thTerminate);
                    return;
                }
                Object objPoll = t1bVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    Throwable thTerminate2 = bc0Var.terminate();
                    if (thTerminate2 == null) {
                        if (nshVar != null) {
                            this.f68039L = null;
                            nshVar.onComplete();
                        }
                        ycgVar.onComplete();
                        return;
                    }
                    if (nshVar != null) {
                        this.f68039L = null;
                        nshVar.onError(thTerminate2);
                    }
                    ycgVar.onError(thTerminate2);
                    return;
                }
                if (z2) {
                    this.f68040M = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else if (objPoll != f68035N) {
                    nshVar.onNext((T) objPoll);
                } else {
                    if (nshVar != null) {
                        this.f68039L = null;
                        nshVar.onComplete();
                    }
                    if (!this.f68036C.get()) {
                        nsh<T> nshVarCreate = nsh.create(this.f68042b, this);
                        this.f68039L = nshVarCreate;
                        this.f68045e.getAndIncrement();
                        if (j != this.f68037F.get()) {
                            j++;
                            sl6 sl6Var = new sl6(nshVarCreate);
                            ycgVar.onNext(sl6Var);
                            if (sl6Var.m22090b()) {
                                nshVarCreate.onComplete();
                            }
                        } else {
                            ldg.cancel(this.f68044d);
                            this.f68043c.dispose();
                            bc0Var.tryAddThrowableOrReport(new bwa("Could not deliver a window due to lack of requests"));
                            this.f68038H = true;
                        }
                    }
                }
            }
            t1bVar.clear();
            this.f68039L = null;
        }

        /* JADX INFO: renamed from: b */
        public void m18764b() {
            ldg.cancel(this.f68044d);
            this.f68038H = true;
            m18763a();
        }

        /* JADX INFO: renamed from: c */
        public void m18765c(Throwable e) {
            ldg.cancel(this.f68044d);
            if (this.f68047m.tryAddThrowableOrReport(e)) {
                this.f68038H = true;
                m18763a();
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f68036C.compareAndSet(false, true)) {
                this.f68043c.dispose();
                if (this.f68045e.decrementAndGet() == 0) {
                    ldg.cancel(this.f68044d);
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void m18766d() {
            this.f68046f.offer(f68035N);
            m18763a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f68043c.dispose();
            this.f68038H = true;
            m18763a();
        }

        @Override // p000.ycg
        public void onError(Throwable e) {
            this.f68043c.dispose();
            if (this.f68047m.tryAddThrowableOrReport(e)) {
                this.f68038H = true;
                m18763a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f68046f.offer(t);
            m18763a();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this.f68044d, s, Long.MAX_VALUE);
        }

        @Override // p000.fdg
        public void request(long n) {
            ro0.add(this.f68037F, n);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f68045e.decrementAndGet() == 0) {
                ldg.cancel(this.f68044d);
            }
        }
    }

    public ol6(l86<T> source, zjd<B> other, int capacityHint) {
        super(source);
        this.f68031c = other;
        this.f68032d = capacityHint;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super l86<T>> subscriber) {
        RunnableC10452b runnableC10452b = new RunnableC10452b(subscriber, this.f68032d);
        subscriber.onSubscribe(runnableC10452b);
        runnableC10452b.m18766d();
        this.f68031c.subscribe(runnableC10452b.f68043c);
        this.f49321b.subscribe((kj6) runnableC10452b);
    }
}
