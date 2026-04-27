package p000;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class mmb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final vkb<T> f61496a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends z9a<? extends R>> f61497b;

    /* JADX INFO: renamed from: c */
    public final e55 f61498c;

    /* JADX INFO: renamed from: d */
    public final int f61499d;

    /* JADX INFO: renamed from: mmb$a */
    public static final class C9414a<T, R> extends wo2<T> {

        /* JADX INFO: renamed from: N */
        public static final int f61500N = 0;

        /* JADX INFO: renamed from: Q */
        public static final int f61501Q = 1;

        /* JADX INFO: renamed from: X */
        public static final int f61502X = 2;
        private static final long serialVersionUID = -9140123220065488293L;

        /* JADX INFO: renamed from: C */
        public final pxb<? super R> f61503C;

        /* JADX INFO: renamed from: F */
        public final sy6<? super T, ? extends z9a<? extends R>> f61504F;

        /* JADX INFO: renamed from: H */
        public final a<R> f61505H;

        /* JADX INFO: renamed from: L */
        public R f61506L;

        /* JADX INFO: renamed from: M */
        public volatile int f61507M;

        /* JADX INFO: renamed from: mmb$a$a */
        public static final class a<R> extends AtomicReference<lf4> implements k9a<R> {
            private static final long serialVersionUID = -3051469169682093892L;

            /* JADX INFO: renamed from: a */
            public final C9414a<?, R> f61508a;

            public a(C9414a<?, R> parent) {
                this.f61508a = parent;
            }

            /* JADX INFO: renamed from: a */
            public void m17397a() {
                zf4.dispose(this);
            }

            @Override // p000.k9a
            public void onComplete() {
                this.f61508a.m17394e();
            }

            @Override // p000.k9a
            public void onError(Throwable e) {
                this.f61508a.m17395f(e);
            }

            @Override // p000.k9a
            public void onSubscribe(lf4 d) {
                zf4.replace(this, d);
            }

            @Override // p000.k9a
            public void onSuccess(R t) {
                this.f61508a.m17396g(t);
            }
        }

        public C9414a(pxb<? super R> downstream, sy6<? super T, ? extends z9a<? extends R>> mapper, int prefetch, e55 errorMode) {
            super(prefetch, errorMode);
            this.f61503C = downstream;
            this.f61504F = mapper;
            this.f61505H = new a<>(this);
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: a */
        public void mo17393a() {
            this.f61506L = null;
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: b */
        public void mo13186b() {
            this.f61505H.m17397a();
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
        
            r2.clear();
            r10.f61506L = null;
            r3.tryTerminateConsumer(r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        
            return;
         */
        @Override // p000.wo2
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo13187c() {
            /*
                r10 = this;
                int r0 = r10.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                pxb<? super R> r0 = r10.f61503C
                e55 r1 = r10.f94900c
                zif<T> r2 = r10.f94901d
                bc0 r3 = r10.f94898a
                r4 = 1
                r5 = r4
            L11:
                boolean r6 = r10.f94904m
                r7 = 0
                if (r6 == 0) goto L1d
                r2.clear()
                r10.f61506L = r7
                goto L97
            L1d:
                int r6 = r10.f61507M
                java.lang.Object r8 = r3.get()
                if (r8 == 0) goto L38
                e55 r8 = p000.e55.IMMEDIATE
                if (r1 == r8) goto L2f
                e55 r8 = p000.e55.BOUNDARY
                if (r1 != r8) goto L38
                if (r6 != 0) goto L38
            L2f:
                r2.clear()
                r10.f61506L = r7
                r3.tryTerminateConsumer(r0)
                return
            L38:
                r8 = 0
                if (r6 != 0) goto L89
                boolean r6 = r10.f94903f
                java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L77
                if (r7 != 0) goto L44
                r8 = r4
            L44:
                if (r6 == 0) goto L4c
                if (r8 == 0) goto L4c
                r3.tryTerminateConsumer(r0)
                return
            L4c:
                if (r8 == 0) goto L4f
                goto L97
            L4f:
                sy6<? super T, ? extends z9a<? extends R>> r6 = r10.f61504F     // Catch: java.lang.Throwable -> L64
                java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L64
                java.lang.String r7 = "The mapper returned a null MaybeSource"
                java.util.Objects.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L64
                z9a r6 = (p000.z9a) r6     // Catch: java.lang.Throwable -> L64
                r10.f61507M = r4
                mmb$a$a<R> r7 = r10.f61505H
                r6.subscribe(r7)
                goto L97
            L64:
                r1 = move-exception
                p000.o75.throwIfFatal(r1)
                lf4 r4 = r10.f94902e
                r4.dispose()
                r2.clear()
                r3.tryAddThrowableOrReport(r1)
                r3.tryTerminateConsumer(r0)
                return
            L77:
                r1 = move-exception
                p000.o75.throwIfFatal(r1)
                r10.f94904m = r4
                lf4 r2 = r10.f94902e
                r2.dispose()
                r3.tryAddThrowableOrReport(r1)
                r3.tryTerminateConsumer(r0)
                return
            L89:
                r9 = 2
                if (r6 != r9) goto L97
                R r6 = r10.f61506L
                r10.f61506L = r7
                r0.onNext(r6)
                r10.f61507M = r8
                goto L11
            L97:
                int r5 = -r5
                int r5 = r10.addAndGet(r5)
                if (r5 != 0) goto L11
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.mmb.C9414a.mo13187c():void");
        }

        @Override // p000.wo2
        /* JADX INFO: renamed from: d */
        public void mo13188d() {
            this.f61503C.onSubscribe(this);
        }

        /* JADX INFO: renamed from: e */
        public void m17394e() {
            this.f61507M = 0;
            mo13187c();
        }

        /* JADX INFO: renamed from: f */
        public void m17395f(Throwable ex) {
            if (this.f94898a.tryAddThrowableOrReport(ex)) {
                if (this.f94900c != e55.END) {
                    this.f94902e.dispose();
                }
                this.f61507M = 0;
                mo13187c();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m17396g(R item) {
            this.f61506L = item;
            this.f61507M = 2;
            mo13187c();
        }
    }

    public mmb(vkb<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, e55 errorMode, int prefetch) {
        this.f61496a = source;
        this.f61497b = mapper;
        this.f61498c = errorMode;
        this.f61499d = prefetch;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        if (mme.m17405b(this.f61496a, this.f61497b, observer)) {
            return;
        }
        this.f61496a.subscribe(new C9414a(observer, this.f61497b, this.f61499d, this.f61498c));
    }
}
