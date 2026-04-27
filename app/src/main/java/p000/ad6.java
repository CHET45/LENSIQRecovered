package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ad6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends pof<? extends R>> f1118c;

    /* JADX INFO: renamed from: d */
    public final boolean f1119d;

    /* JADX INFO: renamed from: e */
    public final int f1120e;

    /* JADX INFO: renamed from: ad6$a */
    public static final class C0177a<T, R> extends AtomicInteger implements lj6<T>, fdg {
        private static final long serialVersionUID = 8600231336733376951L;

        /* JADX INFO: renamed from: C */
        public final py6<? super T, ? extends pof<? extends R>> f1121C;

        /* JADX INFO: renamed from: H */
        public fdg f1123H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f1124L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f1125a;

        /* JADX INFO: renamed from: b */
        public final boolean f1126b;

        /* JADX INFO: renamed from: c */
        public final int f1127c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f1128d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final nm2 f1129e = new nm2();

        /* JADX INFO: renamed from: m */
        public final cc0 f1131m = new cc0();

        /* JADX INFO: renamed from: f */
        public final AtomicInteger f1130f = new AtomicInteger(1);

        /* JADX INFO: renamed from: F */
        public final AtomicReference<rzf<R>> f1122F = new AtomicReference<>();

        /* JADX INFO: renamed from: ad6$a$a */
        public final class a extends AtomicReference<mf4> implements inf<R>, mf4 {
            private static final long serialVersionUID = -502562646270949838L;

            public a() {
            }

            @Override // p000.mf4
            public void dispose() {
                ag4.dispose(this);
            }

            @Override // p000.mf4
            public boolean isDisposed() {
                return ag4.isDisposed(get());
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                C0177a.this.m427e(this, th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                C0177a.this.m428f(this, r);
            }
        }

        public C0177a(ycg<? super R> ycgVar, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z, int i) {
            this.f1125a = ycgVar;
            this.f1121C = py6Var;
            this.f1126b = z;
            this.f1127c = i;
        }

        /* JADX INFO: renamed from: a */
        public void m423a() {
            rzf<R> rzfVar = this.f1122F.get();
            if (rzfVar != null) {
                rzfVar.clear();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m424b() {
            if (getAndIncrement() == 0) {
                m425c();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:37:0x0077, code lost:
        
            if (r10 != r6) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x007b, code lost:
        
            if (r17.f1124L == false) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x007d, code lost:
        
            m423a();
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0080, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0083, code lost:
        
            if (r17.f1126b != false) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x008d, code lost:
        
            if (r17.f1131m.get() == null) goto L48;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x008f, code lost:
        
            r2 = r17.f1131m.terminate();
            m423a();
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:47:0x009b, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:0x00a0, code lost:
        
            if (r2.get() != 0) goto L51;
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:0x00a2, code lost:
        
            r6 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:0x00a4, code lost:
        
            r6 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:52:0x00a5, code lost:
        
            r7 = r3.get();
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x00ab, code lost:
        
            if (r7 == null) goto L56;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00b1, code lost:
        
            if (r7.isEmpty() == false) goto L57;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00b3, code lost:
        
            r13 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00b4, code lost:
        
            if (r6 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:58:0x00b6, code lost:
        
            if (r13 == false) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b8, code lost:
        
            r2 = r17.f1131m.terminate();
         */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x00be, code lost:
        
            if (r2 == null) goto L62;
         */
        /* JADX WARN: Code restructure failed: missing block: B:61:0x00c0, code lost:
        
            r1.onError(r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:62:0x00c4, code lost:
        
            r1.onComplete();
         */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00ca, code lost:
        
            if (r10 == 0) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cc, code lost:
        
            p000.so0.produced(r17.f1128d, r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
        
            if (r17.f1127c == Integer.MAX_VALUE) goto L69;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
        
            r17.f1123H.request(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x00dd, code lost:
        
            r5 = addAndGet(-r5);
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m425c() {
            /*
                Method dump skipped, instruction units count: 229
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ad6.C0177a.m425c():void");
        }

        @Override // p000.fdg
        public void cancel() {
            this.f1124L = true;
            this.f1123H.cancel();
            this.f1129e.dispose();
        }

        /* JADX INFO: renamed from: d */
        public rzf<R> m426d() {
            rzf<R> rzfVar;
            do {
                rzf<R> rzfVar2 = this.f1122F.get();
                if (rzfVar2 != null) {
                    return rzfVar2;
                }
                rzfVar = new rzf<>(m86.bufferSize());
            } while (!v7b.m23844a(this.f1122F, null, rzfVar));
            return rzfVar;
        }

        /* JADX INFO: renamed from: e */
        public void m427e(C0177a<T, R>.a aVar, Throwable th) {
            this.f1129e.delete(aVar);
            if (!this.f1131m.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f1126b) {
                this.f1123H.cancel();
                this.f1129e.dispose();
            } else if (this.f1127c != Integer.MAX_VALUE) {
                this.f1123H.request(1L);
            }
            this.f1130f.decrementAndGet();
            m424b();
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x007a  */
        /* JADX INFO: renamed from: f */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m428f(p000.ad6.C0177a<T, R>.a r5, R r6) {
            /*
                r4 = this;
                nm2 r0 = r4.f1129e
                r0.delete(r5)
                int r5 = r4.get()
                if (r5 != 0) goto L7a
                r5 = 0
                r0 = 1
                boolean r1 = r4.compareAndSet(r5, r0)
                if (r1 == 0) goto L7a
                java.util.concurrent.atomic.AtomicInteger r1 = r4.f1130f
                int r1 = r1.decrementAndGet()
                if (r1 != 0) goto L1c
                r5 = r0
            L1c:
                java.util.concurrent.atomic.AtomicLong r0 = r4.f1128d
                long r0 = r0.get()
                r2 = 0
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 == 0) goto L67
                ycg<? super R> r0 = r4.f1125a
                r0.onNext(r6)
                java.util.concurrent.atomic.AtomicReference<rzf<R>> r6 = r4.f1122F
                java.lang.Object r6 = r6.get()
                rzf r6 = (p000.rzf) r6
                if (r5 == 0) goto L53
                if (r6 == 0) goto L3f
                boolean r5 = r6.isEmpty()
                if (r5 == 0) goto L53
            L3f:
                cc0 r5 = r4.f1131m
                java.lang.Throwable r5 = r5.terminate()
                if (r5 == 0) goto L4d
                ycg<? super R> r6 = r4.f1125a
                r6.onError(r5)
                goto L52
            L4d:
                ycg<? super R> r5 = r4.f1125a
                r5.onComplete()
            L52:
                return
            L53:
                java.util.concurrent.atomic.AtomicLong r5 = r4.f1128d
                r0 = 1
                p000.so0.produced(r5, r0)
                int r5 = r4.f1127c
                r6 = 2147483647(0x7fffffff, float:NaN)
                if (r5 == r6) goto L70
                fdg r5 = r4.f1123H
                r5.request(r0)
                goto L70
            L67:
                rzf r5 = r4.m426d()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L77
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
            L70:
                int r5 = r4.decrementAndGet()
                if (r5 != 0) goto L8f
                return
            L77:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L77
                throw r6
            L7a:
                rzf r5 = r4.m426d()
                monitor-enter(r5)
                r5.offer(r6)     // Catch: java.lang.Throwable -> L93
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
                java.util.concurrent.atomic.AtomicInteger r5 = r4.f1130f
                r5.decrementAndGet()
                int r5 = r4.getAndIncrement()
                if (r5 == 0) goto L8f
                return
            L8f:
                r4.m425c()
                return
            L93:
                r6 = move-exception
                monitor-exit(r5)     // Catch: java.lang.Throwable -> L93
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ad6.C0177a.m428f(ad6$a$a, java.lang.Object):void");
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f1130f.decrementAndGet();
            m424b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            this.f1130f.decrementAndGet();
            if (!this.f1131m.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f1126b) {
                this.f1129e.dispose();
            }
            m424b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            try {
                pof pofVar = (pof) xjb.requireNonNull(this.f1121C.apply(t), "The mapper returned a null SingleSource");
                this.f1130f.getAndIncrement();
                a aVar = new a();
                if (this.f1124L || !this.f1129e.add(aVar)) {
                    return;
                }
                pofVar.subscribe(aVar);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f1123H.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f1123H, fdgVar)) {
                this.f1123H = fdgVar;
                this.f1125a.onSubscribe(this);
                int i = this.f1127c;
                if (i == Integer.MAX_VALUE) {
                    fdgVar.request(Long.MAX_VALUE);
                } else {
                    fdgVar.request(i);
                }
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f1128d, j);
                m424b();
            }
        }
    }

    public ad6(m86<T> m86Var, py6<? super T, ? extends pof<? extends R>> py6Var, boolean z, int i) {
        super(m86Var);
        this.f1118c = py6Var;
        this.f1119d = z;
        this.f1120e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f52360b.subscribe((lj6) new C0177a(ycgVar, this.f1118c, this.f1119d, this.f1120e));
    }
}
