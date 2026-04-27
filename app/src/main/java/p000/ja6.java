package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ja6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final m86<T> f50077b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends pof<? extends R>> f50078c;

    /* JADX INFO: renamed from: d */
    public final f55 f50079d;

    /* JADX INFO: renamed from: e */
    public final int f50080e;

    /* JADX INFO: renamed from: ja6$a */
    public static final class C7822a<T, R> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: M1 */
        public static final int f50081M1 = 2;

        /* JADX INFO: renamed from: Y */
        public static final int f50082Y = 0;

        /* JADX INFO: renamed from: Z */
        public static final int f50083Z = 1;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: C */
        public final f55 f50084C;

        /* JADX INFO: renamed from: F */
        public fdg f50085F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f50086H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f50087L;

        /* JADX INFO: renamed from: M */
        public long f50088M;

        /* JADX INFO: renamed from: N */
        public int f50089N;

        /* JADX INFO: renamed from: Q */
        public R f50090Q;

        /* JADX INFO: renamed from: X */
        public volatile int f50091X;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f50092a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends pof<? extends R>> f50093b;

        /* JADX INFO: renamed from: c */
        public final int f50094c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f50095d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final cc0 f50096e = new cc0();

        /* JADX INFO: renamed from: f */
        public final a<R> f50097f = new a<>(this);

        /* JADX INFO: renamed from: m */
        public final uif<T> f50098m;

        /* JADX INFO: renamed from: ja6$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements inf<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C7822a<?, R> f50099a;

            public a(C7822a<?, R> c7822a) {
                this.f50099a = c7822a;
            }

            /* JADX INFO: renamed from: a */
            public void m13914a() {
                ag4.dispose(this);
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f50099a.m13912b(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(R r) {
                this.f50099a.m13913c(r);
            }
        }

        public C7822a(ycg<? super R> ycgVar, py6<? super T, ? extends pof<? extends R>> py6Var, int i, f55 f55Var) {
            this.f50092a = ycgVar;
            this.f50093b = py6Var;
            this.f50094c = i;
            this.f50084C = f55Var;
            this.f50098m = new pzf(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            r2.clear();
            r15.f50090Q = null;
            r0.onError(r3.terminate());
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m13911a() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                ycg<? super R> r0 = r15.f50092a
                f55 r1 = r15.f50084C
                uif<T> r2 = r15.f50098m
                cc0 r3 = r15.f50096e
                java.util.concurrent.atomic.AtomicLong r4 = r15.f50095d
                int r5 = r15.f50094c
                int r6 = r5 >> 1
                int r5 = r5 - r6
                r6 = 1
                r7 = r6
            L18:
                boolean r8 = r15.f50087L
                r9 = 0
                if (r8 == 0) goto L24
                r2.clear()
                r15.f50090Q = r9
                goto Lc0
            L24:
                int r8 = r15.f50091X
                java.lang.Object r10 = r3.get()
                if (r10 == 0) goto L43
                f55 r10 = p000.f55.IMMEDIATE
                if (r1 == r10) goto L36
                f55 r10 = p000.f55.BOUNDARY
                if (r1 != r10) goto L43
                if (r8 != 0) goto L43
            L36:
                r2.clear()
                r15.f50090Q = r9
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L43:
                r10 = 0
                if (r8 != 0) goto La3
                boolean r8 = r15.f50086H
                java.lang.Object r9 = r2.poll()
                if (r9 != 0) goto L50
                r11 = r6
                goto L51
            L50:
                r11 = r10
            L51:
                if (r8 == 0) goto L63
                if (r11 == 0) goto L63
                java.lang.Throwable r1 = r3.terminate()
                if (r1 != 0) goto L5f
                r0.onComplete()
                goto L62
            L5f:
                r0.onError(r1)
            L62:
                return
            L63:
                if (r11 == 0) goto L66
                goto Lc0
            L66:
                int r8 = r15.f50089N
                int r8 = r8 + r6
                if (r8 != r5) goto L74
                r15.f50089N = r10
                fdg r8 = r15.f50085F
                long r10 = (long) r5
                r8.request(r10)
                goto L76
            L74:
                r15.f50089N = r8
            L76:
                py6<? super T, ? extends pof<? extends R>> r8 = r15.f50093b     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r8 = r8.apply(r9)     // Catch: java.lang.Throwable -> L8c
                java.lang.String r9 = "The mapper returned a null SingleSource"
                java.lang.Object r8 = p000.xjb.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L8c
                pof r8 = (p000.pof) r8     // Catch: java.lang.Throwable -> L8c
                r15.f50091X = r6
                ja6$a$a<R> r9 = r15.f50097f
                r8.subscribe(r9)
                goto Lc0
            L8c:
                r1 = move-exception
                p000.n75.throwIfFatal(r1)
                fdg r4 = r15.f50085F
                r4.cancel()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            La3:
                r11 = 2
                if (r8 != r11) goto Lc0
                long r11 = r15.f50088M
                long r13 = r4.get()
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 == 0) goto Lc0
                R r8 = r15.f50090Q
                r15.f50090Q = r9
                r0.onNext(r8)
                r8 = 1
                long r11 = r11 + r8
                r15.f50088M = r11
                r15.f50091X = r10
                goto L18
            Lc0:
                int r7 = -r7
                int r7 = r15.addAndGet(r7)
                if (r7 != 0) goto L18
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ja6.C7822a.m13911a():void");
        }

        /* JADX INFO: renamed from: b */
        public void m13912b(Throwable th) {
            if (!this.f50096e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f50084C != f55.END) {
                this.f50085F.cancel();
            }
            this.f50091X = 0;
            m13911a();
        }

        /* JADX INFO: renamed from: c */
        public void m13913c(R r) {
            this.f50090Q = r;
            this.f50091X = 2;
            m13911a();
        }

        @Override // p000.fdg
        public void cancel() {
            this.f50087L = true;
            this.f50085F.cancel();
            this.f50097f.m13914a();
            if (getAndIncrement() == 0) {
                this.f50098m.clear();
                this.f50090Q = null;
            }
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f50086H = true;
            m13911a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f50096e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f50084C == f55.IMMEDIATE) {
                this.f50097f.m13914a();
            }
            this.f50086H = true;
            m13911a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f50098m.offer(t)) {
                m13911a();
            } else {
                this.f50085F.cancel();
                onError(new cwa("queue full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f50085F, fdgVar)) {
                this.f50085F = fdgVar;
                this.f50092a.onSubscribe(this);
                fdgVar.request(this.f50094c);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f50095d, j);
            m13911a();
        }
    }

    public ja6(m86<T> m86Var, py6<? super T, ? extends pof<? extends R>> py6Var, f55 f55Var, int i) {
        this.f50077b = m86Var;
        this.f50078c = py6Var;
        this.f50079d = f55Var;
        this.f50080e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f50077b.subscribe((lj6) new C7822a(ycgVar, this.f50078c, this.f50080e, this.f50079d));
    }
}
