package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class ea6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final m86<T> f32319b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends aaa<? extends R>> f32320c;

    /* JADX INFO: renamed from: d */
    public final f55 f32321d;

    /* JADX INFO: renamed from: e */
    public final int f32322e;

    /* JADX INFO: renamed from: ea6$a */
    public static final class C5212a<T, R> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: M1 */
        public static final int f32323M1 = 2;

        /* JADX INFO: renamed from: Y */
        public static final int f32324Y = 0;

        /* JADX INFO: renamed from: Z */
        public static final int f32325Z = 1;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: C */
        public final f55 f32326C;

        /* JADX INFO: renamed from: F */
        public fdg f32327F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f32328H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f32329L;

        /* JADX INFO: renamed from: M */
        public long f32330M;

        /* JADX INFO: renamed from: N */
        public int f32331N;

        /* JADX INFO: renamed from: Q */
        public R f32332Q;

        /* JADX INFO: renamed from: X */
        public volatile int f32333X;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f32334a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends aaa<? extends R>> f32335b;

        /* JADX INFO: renamed from: c */
        public final int f32336c;

        /* JADX INFO: renamed from: d */
        public final AtomicLong f32337d = new AtomicLong();

        /* JADX INFO: renamed from: e */
        public final cc0 f32338e = new cc0();

        /* JADX INFO: renamed from: f */
        public final a<R> f32339f = new a<>(this);

        /* JADX INFO: renamed from: m */
        public final uif<T> f32340m;

        /* JADX INFO: renamed from: ea6$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements l9a<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C5212a<?, R> f32341a;

            public a(C5212a<?, R> c5212a) {
                this.f32341a = c5212a;
            }

            /* JADX INFO: renamed from: a */
            public void m9824a() {
                ag4.dispose(this);
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f32341a.m9821b();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f32341a.m9822c(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(R r) {
                this.f32341a.m9823d(r);
            }
        }

        public C5212a(ycg<? super R> ycgVar, py6<? super T, ? extends aaa<? extends R>> py6Var, int i, f55 f55Var) {
            this.f32334a = ycgVar;
            this.f32335b = py6Var;
            this.f32336c = i;
            this.f32326C = f55Var;
            this.f32340m = new pzf(i);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
        
            r2.clear();
            r15.f32332Q = null;
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
        public void m9820a() {
            /*
                r15 = this;
                int r0 = r15.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                ycg<? super R> r0 = r15.f32334a
                f55 r1 = r15.f32326C
                uif<T> r2 = r15.f32340m
                cc0 r3 = r15.f32338e
                java.util.concurrent.atomic.AtomicLong r4 = r15.f32337d
                int r5 = r15.f32336c
                int r6 = r5 >> 1
                int r5 = r5 - r6
                r6 = 1
                r7 = r6
            L18:
                boolean r8 = r15.f32329L
                r9 = 0
                if (r8 == 0) goto L24
                r2.clear()
                r15.f32332Q = r9
                goto Lc0
            L24:
                int r8 = r15.f32333X
                java.lang.Object r10 = r3.get()
                if (r10 == 0) goto L43
                f55 r10 = p000.f55.IMMEDIATE
                if (r1 == r10) goto L36
                f55 r10 = p000.f55.BOUNDARY
                if (r1 != r10) goto L43
                if (r8 != 0) goto L43
            L36:
                r2.clear()
                r15.f32332Q = r9
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            L43:
                r10 = 0
                if (r8 != 0) goto La3
                boolean r8 = r15.f32328H
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
                int r8 = r15.f32331N
                int r8 = r8 + r6
                if (r8 != r5) goto L74
                r15.f32331N = r10
                fdg r8 = r15.f32327F
                long r10 = (long) r5
                r8.request(r10)
                goto L76
            L74:
                r15.f32331N = r8
            L76:
                py6<? super T, ? extends aaa<? extends R>> r8 = r15.f32335b     // Catch: java.lang.Throwable -> L8c
                java.lang.Object r8 = r8.apply(r9)     // Catch: java.lang.Throwable -> L8c
                java.lang.String r9 = "The mapper returned a null MaybeSource"
                java.lang.Object r8 = p000.xjb.requireNonNull(r8, r9)     // Catch: java.lang.Throwable -> L8c
                aaa r8 = (p000.aaa) r8     // Catch: java.lang.Throwable -> L8c
                r15.f32333X = r6
                ea6$a$a<R> r9 = r15.f32339f
                r8.subscribe(r9)
                goto Lc0
            L8c:
                r1 = move-exception
                p000.n75.throwIfFatal(r1)
                fdg r4 = r15.f32327F
                r4.cancel()
                r2.clear()
                r3.addThrowable(r1)
                java.lang.Throwable r1 = r3.terminate()
                r0.onError(r1)
                return
            La3:
                r11 = 2
                if (r8 != r11) goto Lc0
                long r11 = r15.f32330M
                long r13 = r4.get()
                int r8 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r8 == 0) goto Lc0
                R r8 = r15.f32332Q
                r15.f32332Q = r9
                r0.onNext(r8)
                r8 = 1
                long r11 = r11 + r8
                r15.f32330M = r11
                r15.f32333X = r10
                goto L18
            Lc0:
                int r7 = -r7
                int r7 = r15.addAndGet(r7)
                if (r7 != 0) goto L18
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.ea6.C5212a.m9820a():void");
        }

        /* JADX INFO: renamed from: b */
        public void m9821b() {
            this.f32333X = 0;
            m9820a();
        }

        /* JADX INFO: renamed from: c */
        public void m9822c(Throwable th) {
            if (!this.f32338e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f32326C != f55.END) {
                this.f32327F.cancel();
            }
            this.f32333X = 0;
            m9820a();
        }

        @Override // p000.fdg
        public void cancel() {
            this.f32329L = true;
            this.f32327F.cancel();
            this.f32339f.m9824a();
            if (getAndIncrement() == 0) {
                this.f32340m.clear();
                this.f32332Q = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m9823d(R r) {
            this.f32332Q = r;
            this.f32333X = 2;
            m9820a();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f32328H = true;
            m9820a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f32338e.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (this.f32326C == f55.IMMEDIATE) {
                this.f32339f.m9824a();
            }
            this.f32328H = true;
            m9820a();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f32340m.offer(t)) {
                m9820a();
            } else {
                this.f32327F.cancel();
                onError(new cwa("queue full?!"));
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f32327F, fdgVar)) {
                this.f32327F = fdgVar;
                this.f32334a.onSubscribe(this);
                fdgVar.request(this.f32336c);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f32337d, j);
            m9820a();
        }
    }

    public ea6(m86<T> m86Var, py6<? super T, ? extends aaa<? extends R>> py6Var, f55 f55Var, int i) {
        this.f32319b = m86Var;
        this.f32320c = py6Var;
        this.f32321d = f55Var;
        this.f32322e = i;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f32319b.subscribe((lj6) new C5212a(ycgVar, this.f32320c, this.f32322e, this.f32321d));
    }
}
