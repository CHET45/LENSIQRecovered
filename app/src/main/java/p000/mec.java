package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class mec<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final fec<? extends T> f60767b;

    /* JADX INFO: renamed from: c */
    public final int f60768c;

    /* JADX INFO: renamed from: d */
    public final boolean f60769d;

    /* JADX INFO: renamed from: mec$a */
    public static final class C9335a<T> extends AtomicReference<fdg> implements lj6<T> {
        private static final long serialVersionUID = 8410034718427740355L;

        /* JADX INFO: renamed from: a */
        public final AbstractC9337c<T> f60770a;

        /* JADX INFO: renamed from: b */
        public final int f60771b;

        /* JADX INFO: renamed from: c */
        public final int f60772c;

        /* JADX INFO: renamed from: d */
        public long f60773d;

        /* JADX INFO: renamed from: e */
        public volatile uif<T> f60774e;

        public C9335a(AbstractC9337c<T> abstractC9337c, int i) {
            this.f60770a = abstractC9337c;
            this.f60771b = i;
            this.f60772c = i - (i >> 2);
        }

        /* JADX INFO: renamed from: a */
        public uif<T> m17276a() {
            uif<T> uifVar = this.f60774e;
            if (uifVar != null) {
                return uifVar;
            }
            pzf pzfVar = new pzf(this.f60771b);
            this.f60774e = pzfVar;
            return pzfVar;
        }

        public boolean cancel() {
            return mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f60770a.onComplete();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f60770a.onError(th);
        }

        @Override // p000.ycg
        public void onNext(T t) {
            this.f60770a.onNext(this, t);
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this, fdgVar, this.f60771b);
        }

        public void request(long j) {
            long j2 = this.f60773d + j;
            if (j2 < this.f60772c) {
                this.f60773d = j2;
            } else {
                this.f60773d = 0L;
                get().request(j2);
            }
        }

        public void requestOne() {
            long j = this.f60773d + 1;
            if (j != this.f60772c) {
                this.f60773d = j;
            } else {
                this.f60773d = 0L;
                get().request(j);
            }
        }
    }

    /* JADX INFO: renamed from: mec$b */
    public static final class C9336b<T> extends AbstractC9337c<T> {
        private static final long serialVersionUID = 6312374661811000451L;

        public C9336b(ycg<? super T> ycgVar, int i, int i2) {
            super(ycgVar, i, i2);
        }

        @Override // p000.mec.AbstractC9337c
        /* JADX INFO: renamed from: c */
        public void mo17277c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m17278d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
        
            if (r12 == false) goto L85;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
        
            if (r15 == false) goto L86;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0061, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:33:0x0064, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
        
            if (r15 == false) goto L87;
         */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m17278d() {
            /*
                Method dump skipped, instruction units count: 208
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mec.C9336b.m17278d():void");
        }

        @Override // p000.mec.AbstractC9337c
        public void onComplete() {
            this.f60780f.decrementAndGet();
            mo17277c();
        }

        @Override // p000.mec.AbstractC9337c
        public void onError(Throwable th) {
            if (this.f60777c.compareAndSet(null, th)) {
                m17279a();
                mo17277c();
            } else if (th != this.f60777c.get()) {
                pfe.onError(th);
            }
        }

        @Override // p000.mec.AbstractC9337c
        public void onNext(C9335a<T> c9335a, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f60778d.get() != 0) {
                    this.f60775a.onNext(t);
                    if (this.f60778d.get() != Long.MAX_VALUE) {
                        this.f60778d.decrementAndGet();
                    }
                    c9335a.request(1L);
                } else if (!c9335a.m17276a().offer(t)) {
                    m17279a();
                    cwa cwaVar = new cwa("Queue full?!");
                    if (this.f60777c.compareAndSet(null, cwaVar)) {
                        this.f60775a.onError(cwaVar);
                        return;
                    } else {
                        pfe.onError(cwaVar);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else if (!c9335a.m17276a().offer(t)) {
                m17279a();
                onError(new cwa("Queue full?!"));
                return;
            } else if (getAndIncrement() != 0) {
                return;
            }
            m17278d();
        }
    }

    /* JADX INFO: renamed from: mec$c */
    public static abstract class AbstractC9337c<T> extends AtomicInteger implements fdg {
        private static final long serialVersionUID = 3100232009247827843L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f60775a;

        /* JADX INFO: renamed from: b */
        public final C9335a<T>[] f60776b;

        /* JADX INFO: renamed from: e */
        public volatile boolean f60779e;

        /* JADX INFO: renamed from: c */
        public final cc0 f60777c = new cc0();

        /* JADX INFO: renamed from: d */
        public final AtomicLong f60778d = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f60780f = new AtomicInteger();

        public AbstractC9337c(ycg<? super T> ycgVar, int i, int i2) {
            this.f60775a = ycgVar;
            C9335a<T>[] c9335aArr = new C9335a[i];
            for (int i3 = 0; i3 < i; i3++) {
                c9335aArr[i3] = new C9335a<>(this, i2);
            }
            this.f60776b = c9335aArr;
            this.f60780f.lazySet(i);
        }

        /* JADX INFO: renamed from: a */
        public void m17279a() {
            for (C9335a<T> c9335a : this.f60776b) {
                c9335a.cancel();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17280b() {
            for (C9335a<T> c9335a : this.f60776b) {
                c9335a.f60774e = null;
            }
        }

        /* JADX INFO: renamed from: c */
        public abstract void mo17277c();

        @Override // p000.fdg
        public void cancel() {
            if (this.f60779e) {
                return;
            }
            this.f60779e = true;
            m17279a();
            if (getAndIncrement() == 0) {
                m17280b();
            }
        }

        public abstract void onComplete();

        public abstract void onError(Throwable th);

        public abstract void onNext(C9335a<T> c9335a, T t);

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f60778d, j);
                mo17277c();
            }
        }
    }

    /* JADX INFO: renamed from: mec$d */
    public static final class C9338d<T> extends AbstractC9337c<T> {
        private static final long serialVersionUID = -5737965195918321883L;

        public C9338d(ycg<? super T> ycgVar, int i, int i2) {
            super(ycgVar, i, i2);
        }

        @Override // p000.mec.AbstractC9337c
        /* JADX INFO: renamed from: c */
        public void mo17277c() {
            if (getAndIncrement() != 0) {
                return;
            }
            m17281d();
        }

        /* JADX WARN: Code restructure failed: missing block: B:25:0x004b, code lost:
        
            if (r12 == false) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x004d, code lost:
        
            if (r15 == false) goto L81;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0057, code lost:
        
            if (r18.f60777c.get() == null) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x0059, code lost:
        
            r3.onError(r18.f60777c.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x0063, code lost:
        
            r3.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0066, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
        
            if (r15 == false) goto L82;
         */
        /* JADX WARN: Code restructure failed: missing block: B:91:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m17281d() {
            /*
                Method dump skipped, instruction units count: 213
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mec.C9338d.m17281d():void");
        }

        @Override // p000.mec.AbstractC9337c
        public void onComplete() {
            this.f60780f.decrementAndGet();
            mo17277c();
        }

        @Override // p000.mec.AbstractC9337c
        public void onError(Throwable th) {
            this.f60777c.addThrowable(th);
            this.f60780f.decrementAndGet();
            mo17277c();
        }

        @Override // p000.mec.AbstractC9337c
        public void onNext(C9335a<T> c9335a, T t) {
            if (get() == 0 && compareAndSet(0, 1)) {
                if (this.f60778d.get() != 0) {
                    this.f60775a.onNext(t);
                    if (this.f60778d.get() != Long.MAX_VALUE) {
                        this.f60778d.decrementAndGet();
                    }
                    c9335a.request(1L);
                } else if (!c9335a.m17276a().offer(t)) {
                    c9335a.cancel();
                    this.f60777c.addThrowable(new cwa("Queue full?!"));
                    this.f60780f.decrementAndGet();
                    m17281d();
                    return;
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                if (!c9335a.m17276a().offer(t) && c9335a.cancel()) {
                    this.f60777c.addThrowable(new cwa("Queue full?!"));
                    this.f60780f.decrementAndGet();
                }
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17281d();
        }
    }

    public mec(fec<? extends T> fecVar, int i, boolean z) {
        this.f60767b = fecVar;
        this.f60768c = i;
        this.f60769d = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        AbstractC9337c c9338d = this.f60769d ? new C9338d(ycgVar, this.f60767b.parallelism(), this.f60768c) : new C9336b(ycgVar, this.f60767b.parallelism(), this.f60768c);
        ycgVar.onSubscribe(c9338d);
        this.f60767b.subscribe(c9338d.f60776b);
    }
}
