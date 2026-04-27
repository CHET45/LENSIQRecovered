package p000;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class sk6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final long f82106c;

    /* JADX INFO: renamed from: d */
    public final TimeUnit f82107d;

    /* JADX INFO: renamed from: e */
    public final woe f82108e;

    /* JADX INFO: renamed from: f */
    public final boolean f82109f;

    /* JADX INFO: renamed from: sk6$a */
    public static final class RunnableC12635a<T> extends AtomicInteger implements kj6<T>, fdg, Runnable {
        private static final long serialVersionUID = -8296689127439125014L;

        /* JADX INFO: renamed from: C */
        public fdg f82110C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f82111F;

        /* JADX INFO: renamed from: H */
        public Throwable f82112H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f82113L;

        /* JADX INFO: renamed from: M */
        public volatile boolean f82114M;

        /* JADX INFO: renamed from: N */
        public long f82115N;

        /* JADX INFO: renamed from: Q */
        public boolean f82116Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f82117a;

        /* JADX INFO: renamed from: b */
        public final long f82118b;

        /* JADX INFO: renamed from: c */
        public final TimeUnit f82119c;

        /* JADX INFO: renamed from: d */
        public final woe.AbstractC14729c f82120d;

        /* JADX INFO: renamed from: e */
        public final boolean f82121e;

        /* JADX INFO: renamed from: f */
        public final AtomicReference<T> f82122f = new AtomicReference<>();

        /* JADX INFO: renamed from: m */
        public final AtomicLong f82123m = new AtomicLong();

        public RunnableC12635a(ycg<? super T> downstream, long timeout, TimeUnit unit, woe.AbstractC14729c worker, boolean emitLast) {
            this.f82117a = downstream;
            this.f82118b = timeout;
            this.f82119c = unit;
            this.f82120d = worker;
            this.f82121e = emitLast;
        }

        /* JADX INFO: renamed from: a */
        public void m22077a() {
            if (getAndIncrement() != 0) {
                return;
            }
            AtomicReference<T> atomicReference = this.f82122f;
            AtomicLong atomicLong = this.f82123m;
            ycg<? super T> ycgVar = this.f82117a;
            int iAddAndGet = 1;
            while (!this.f82113L) {
                boolean z = this.f82111F;
                if (z && this.f82112H != null) {
                    atomicReference.lazySet(null);
                    ycgVar.onError(this.f82112H);
                    this.f82120d.dispose();
                    return;
                }
                boolean z2 = atomicReference.get() == null;
                if (z) {
                    if (z2 || !this.f82121e) {
                        atomicReference.lazySet(null);
                        ycgVar.onComplete();
                    } else {
                        T andSet = atomicReference.getAndSet(null);
                        long j = this.f82115N;
                        if (j != atomicLong.get()) {
                            this.f82115N = j + 1;
                            ycgVar.onNext(andSet);
                            ycgVar.onComplete();
                        } else {
                            ycgVar.onError(new bwa("Could not emit final value due to lack of requests"));
                        }
                    }
                    this.f82120d.dispose();
                    return;
                }
                if (z2) {
                    if (this.f82114M) {
                        this.f82116Q = false;
                        this.f82114M = false;
                    }
                } else if (!this.f82116Q || this.f82114M) {
                    T andSet2 = atomicReference.getAndSet(null);
                    long j2 = this.f82115N;
                    if (j2 == atomicLong.get()) {
                        this.f82110C.cancel();
                        ycgVar.onError(new bwa("Could not emit value due to lack of requests"));
                        this.f82120d.dispose();
                        return;
                    } else {
                        ycgVar.onNext(andSet2);
                        this.f82115N = j2 + 1;
                        this.f82114M = false;
                        this.f82116Q = true;
                        this.f82120d.schedule(this, this.f82118b, this.f82119c);
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            atomicReference.lazySet(null);
        }

        @Override // p000.fdg
        public void cancel() {
            this.f82113L = true;
            this.f82110C.cancel();
            this.f82120d.dispose();
            if (getAndIncrement() == 0) {
                this.f82122f.lazySet(null);
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f82111F = true;
            m22077a();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f82112H = t;
            this.f82111F = true;
            m22077a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f82122f.set(t);
            m22077a();
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            if (ldg.validate(this.f82110C, s)) {
                this.f82110C = s;
                this.f82117a.onSubscribe(this);
                s.request(Long.MAX_VALUE);
            }
        }

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f82123m, n);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f82114M = true;
            m22077a();
        }
    }

    public sk6(l86<T> source, long timeout, TimeUnit unit, woe scheduler, boolean emitLast) {
        super(source);
        this.f82106c = timeout;
        this.f82107d = unit;
        this.f82108e = scheduler;
        this.f82109f = emitLast;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f49321b.subscribe((kj6) new RunnableC12635a(s, this.f82106c, this.f82107d, this.f82108e.createWorker(), this.f82109f));
    }
}
