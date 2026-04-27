package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nec<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final eec<? extends T> f64159b;

    /* JADX INFO: renamed from: c */
    public final int f64160c;

    /* JADX INFO: renamed from: d */
    public final boolean f64161d;

    /* JADX INFO: renamed from: nec$a */
    public static final class C9832a<T> extends AtomicReference<fdg> implements kj6<T> {
        private static final long serialVersionUID = 8410034718427740355L;

        /* JADX INFO: renamed from: a */
        public final AbstractC9834c<T> f64162a;

        /* JADX INFO: renamed from: b */
        public final int f64163b;

        /* JADX INFO: renamed from: c */
        public final int f64164c;

        /* JADX INFO: renamed from: d */
        public long f64165d;

        /* JADX INFO: renamed from: e */
        public volatile tif<T> f64166e;

        public C9832a(AbstractC9834c<T> parent, int prefetch) {
            this.f64162a = parent;
            this.f64163b = prefetch;
            this.f64164c = prefetch - (prefetch >> 2);
        }

        /* JADX INFO: renamed from: a */
        public tif<T> m17876a() {
            tif<T> tifVar = this.f64166e;
            if (tifVar != null) {
                return tifVar;
            }
            ozf ozfVar = new ozf(this.f64163b);
            this.f64166e = ozfVar;
            return ozfVar;
        }

        public boolean cancel() {
            return ldg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f64162a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable t) {
            this.f64162a.onError(t);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f64162a.onNext(this, t);
        }

        @Override // p000.kj6, p000.ycg
        public void onSubscribe(fdg s) {
            ldg.setOnce(this, s, this.f64163b);
        }

        public void request(long n) {
            long j = this.f64165d + n;
            if (j < this.f64164c) {
                this.f64165d = j;
            } else {
                this.f64165d = 0L;
                get().request(j);
            }
        }

        public void requestOne() {
            long j = this.f64165d + 1;
            if (j != this.f64164c) {
                this.f64165d = j;
            } else {
                this.f64165d = 0L;
                get().request(j);
            }
        }
    }

    /* JADX INFO: renamed from: nec$b */
    public static final class C9833b<T> extends AbstractC9834c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public C9833b(ycg<? super T> actual, int n, int prefetch) {
            super(actual, n, prefetch);
        }

        @Override // p000.nec.AbstractC9834c
        /* JADX INFO: renamed from: c */
        public void mo17877c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m17878d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        
            if (r12 == false) goto L79;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        
            if (r15 == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        
            if (r15 == false) goto L81;
         */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m17878d() {
            /*
                r18 = this;
                r0 = r18
                nec$a<T>[] r1 = r0.f64168b
                int r2 = r1.length
                ycg<? super T> r3 = r0.f64167a
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.f64170d
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L67
                boolean r12 = r0.f64171e
                if (r12 == 0) goto L1d
                r18.m17880b()
                return
            L1d:
                bc0 r12 = r0.f64169c
                java.lang.Object r12 = r12.get()
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                if (r12 == 0) goto L2e
                r18.m17880b()
                r3.onError(r12)
                return
            L2e:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.f64172f
                int r12 = r12.get()
                if (r12 != 0) goto L38
                r12 = 1
                goto L39
            L38:
                r12 = 0
            L39:
                r14 = 0
                r15 = 1
            L3b:
                int r4 = r1.length
                if (r14 >= r4) goto L5d
                r4 = r1[r14]
                tif<T> r13 = r4.f64166e
                if (r13 == 0) goto L5a
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L5a
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L59
                goto L67
            L59:
                r15 = 0
            L5a:
                int r14 = r14 + 1
                goto L3b
            L5d:
                if (r12 == 0) goto L65
                if (r15 == 0) goto L65
                r3.onComplete()
                return
            L65:
                if (r15 == 0) goto L11
            L67:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto Lac
                boolean r4 = r0.f64171e
                if (r4 == 0) goto L73
                r18.m17880b()
                return
            L73:
                bc0 r4 = r0.f64169c
                java.lang.Object r4 = r4.get()
                java.lang.Throwable r4 = (java.lang.Throwable) r4
                if (r4 == 0) goto L84
                r18.m17880b()
                r3.onError(r4)
                return
            L84:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.f64172f
                int r4 = r4.get()
                if (r4 != 0) goto L8e
                r4 = 1
                goto L8f
            L8e:
                r4 = 0
            L8f:
                r6 = 0
            L90:
                if (r6 >= r2) goto La3
                r7 = r1[r6]
                tif<T> r7 = r7.f64166e
                if (r7 == 0) goto La0
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto La0
                r13 = 0
                goto La4
            La0:
                int r6 = r6 + 1
                goto L90
            La3:
                r13 = 1
            La4:
                if (r4 == 0) goto Lac
                if (r13 == 0) goto Lac
                r3.onComplete()
                return
            Lac:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto Lb5
                java.util.concurrent.atomic.AtomicLong r4 = r0.f64170d
                p000.ro0.produced(r4, r10)
            Lb5:
                int r4 = -r5
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.nec.C9833b.m17878d():void");
        }

        @Override // p000.nec.AbstractC9834c
        public void onComplete() {
            this.f64172f.decrementAndGet();
            mo17877c();
        }

        @Override // p000.nec.AbstractC9834c
        public void onError(Throwable e) {
            if (this.f64169c.compareAndSet(null, e)) {
                m17879a();
                mo17877c();
            } else if (e != this.f64169c.get()) {
                ofe.onError(e);
            }
        }

        @Override // p000.nec.AbstractC9834c
        public void onNext(C9832a<T> inner, T value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f64170d.get() != 0) {
                    this.f64167a.onNext(value);
                    if (this.f64170d.get() != Long.MAX_VALUE) {
                        this.f64170d.decrementAndGet();
                    }
                    inner.request(1L);
                } else if (!inner.m17876a().offer(value)) {
                    m17879a();
                    bwa bwaVar = new bwa("Queue full?!");
                    if (this.f64169c.compareAndSet(null, bwaVar)) {
                        this.f64167a.onError(bwaVar);
                        return;
                    } else {
                        ofe.onError(bwaVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!inner.m17876a().offer(value)) {
                m17879a();
                onError(new bwa("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m17878d();
        }
    }

    /* JADX INFO: renamed from: nec$c */
    public static abstract class AbstractC9834c<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 3100232009247827843L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f64167a;

        /* JADX INFO: renamed from: b */
        public final C9832a<T>[] f64168b;

        /* JADX INFO: renamed from: e */
        public volatile boolean f64171e;

        /* JADX INFO: renamed from: c */
        public final bc0 f64169c = new bc0();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f64170d = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f64172f = new AtomicInteger();

        public AbstractC9834c(ycg<? super T> actual, int n, int prefetch) {
            this.f64167a = actual;
            C9832a<T>[] c9832aArr = new C9832a[n];
            for (int i = 0; i < n; i++) {
                c9832aArr[i] = new C9832a<>(this, prefetch);
            }
            this.f64168b = c9832aArr;
            this.f64172f.lazySet(n);
        }

        /* JADX INFO: renamed from: a */
        public void m17879a() {
            for (C9832a<T> c9832a : this.f64168b) {
                c9832a.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17880b() {
            for (C9832a<T> c9832a : this.f64168b) {
                c9832a.f64166e = null;
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo17877c();

        @Override // p000.fdg
        public void cancel() {
            if (this.f64171e) {
                return;
            }
            this.f64171e = true;
            m17879a();
            if (getAndIncrement() == 0) {
                m17880b();
            }
        }

        public abstract void onComplete();

        public abstract void onError(Throwable e);

        public abstract void onNext(C9832a<T> inner, T value);

        @Override // p000.fdg
        public void request(long n) {
            if (ldg.validate(n)) {
                ro0.add(this.f64170d, n);
                mo17877c();
            }
        }
    }

    /* JADX INFO: renamed from: nec$d */
    public static final class C9835d<T> extends AbstractC9834c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public C9835d(ycg<? super T> actual, int n, int prefetch) {
            super(actual, n, prefetch);
        }

        @Override // p000.nec.AbstractC9834c
        /* JADX INFO: renamed from: c */
        public void mo17877c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m17881d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        
            if (r12 == false) goto L68;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        
            if (r15 == false) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
        
            r18.f64169c.tryTerminateConsumer(r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0055, code lost:
        
            if (r15 == false) goto L70;
         */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m17881d() {
            /*
                r18 = this;
                r0 = r18
                nec$a<T>[] r1 = r0.f64168b
                int r2 = r1.length
                ycg<? super T> r3 = r0.f64167a
                r5 = 1
            L8:
                java.util.concurrent.atomic.AtomicLong r6 = r0.f64170d
                long r6 = r6.get()
                r8 = 0
                r10 = r8
            L11:
                int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r12 == 0) goto L57
                boolean r12 = r0.f64171e
                if (r12 == 0) goto L1d
                r18.m17880b()
                return
            L1d:
                java.util.concurrent.atomic.AtomicInteger r12 = r0.f64172f
                int r12 = r12.get()
                if (r12 != 0) goto L27
                r12 = 1
                goto L28
            L27:
                r12 = 0
            L28:
                r14 = 0
                r15 = 1
            L2a:
                if (r14 >= r2) goto L4b
                r4 = r1[r14]
                tif<T> r13 = r4.f64166e
                if (r13 == 0) goto L48
                java.lang.Object r13 = r13.poll()
                if (r13 == 0) goto L48
                r3.onNext(r13)
                r4.requestOne()
                r16 = 1
                long r10 = r10 + r16
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L47
                goto L57
            L47:
                r15 = 0
            L48:
                int r14 = r14 + 1
                goto L2a
            L4b:
                if (r12 == 0) goto L55
                if (r15 == 0) goto L55
                bc0 r1 = r0.f64169c
                r1.tryTerminateConsumer(r3)
                return
            L55:
                if (r15 == 0) goto L11
            L57:
                int r4 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r4 != 0) goto L8d
                boolean r4 = r0.f64171e
                if (r4 == 0) goto L63
                r18.m17880b()
                return
            L63:
                java.util.concurrent.atomic.AtomicInteger r4 = r0.f64172f
                int r4 = r4.get()
                if (r4 != 0) goto L6d
                r4 = 1
                goto L6e
            L6d:
                r4 = 0
            L6e:
                r6 = 0
            L6f:
                if (r6 >= r2) goto L82
                r7 = r1[r6]
                tif<T> r7 = r7.f64166e
                if (r7 == 0) goto L7f
                boolean r7 = r7.isEmpty()
                if (r7 != 0) goto L7f
                r13 = 0
                goto L83
            L7f:
                int r6 = r6 + 1
                goto L6f
            L82:
                r13 = 1
            L83:
                if (r4 == 0) goto L8d
                if (r13 == 0) goto L8d
                bc0 r1 = r0.f64169c
                r1.tryTerminateConsumer(r3)
                return
            L8d:
                int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
                if (r4 == 0) goto L96
                java.util.concurrent.atomic.AtomicLong r4 = r0.f64170d
                p000.ro0.produced(r4, r10)
            L96:
                int r4 = -r5
                int r5 = r0.addAndGet(r4)
                if (r5 != 0) goto L8
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.nec.C9835d.m17881d():void");
        }

        @Override // p000.nec.AbstractC9834c
        public void onComplete() {
            this.f64172f.decrementAndGet();
            mo17877c();
        }

        @Override // p000.nec.AbstractC9834c
        public void onError(Throwable e) {
            if (this.f64169c.tryAddThrowableOrReport(e)) {
                this.f64172f.decrementAndGet();
                mo17877c();
            }
        }

        @Override // p000.nec.AbstractC9834c
        public void onNext(C9832a<T> inner, T value) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f64170d.get() != 0) {
                    this.f64167a.onNext(value);
                    if (this.f64170d.get() != Long.MAX_VALUE) {
                        this.f64170d.decrementAndGet();
                    }
                    inner.request(1L);
                } else if (!inner.m17876a().offer(value)) {
                    inner.cancel();
                    this.f64169c.tryAddThrowableOrReport(new bwa("Queue full?!"));
                    this.f64172f.decrementAndGet();
                    m17881d();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!inner.m17876a().offer(value)) {
                    inner.cancel();
                    this.f64169c.tryAddThrowableOrReport(new bwa("Queue full?!"));
                    this.f64172f.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17881d();
        }
    }

    public nec(eec<? extends T> source, int prefetch, boolean delayErrors) {
        this.f64159b = source;
        this.f64160c = prefetch;
        this.f64161d = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        AbstractC9834c c9835d = this.f64161d ? new C9835d(s, this.f64159b.parallelism(), this.f64160c) : new C9833b(s, this.f64159b.parallelism(), this.f64160c);
        s.onSubscribe(c9835d);
        this.f64159b.subscribe(c9835d.f64168b);
    }
}
