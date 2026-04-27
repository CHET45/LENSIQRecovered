package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class evb<T, R> extends AbstractC9666n3<T, R> {

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends wub<? extends R>> f34146b;

    /* JADX INFO: renamed from: c */
    public final int f34147c;

    /* JADX INFO: renamed from: d */
    public final boolean f34148d;

    /* JADX INFO: renamed from: evb$a */
    public static final class C5479a<T, R> extends AtomicReference<lf4> implements pxb<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: a */
        public final C5480b<T, R> f34149a;

        /* JADX INFO: renamed from: b */
        public final long f34150b;

        /* JADX INFO: renamed from: c */
        public final int f34151c;

        /* JADX INFO: renamed from: d */
        public volatile zif<R> f34152d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f34153e;

        public C5479a(C5480b<T, R> parent, long index, int bufferSize) {
            this.f34149a = parent;
            this.f34150b = index;
            this.f34151c = bufferSize;
        }

        public void cancel() {
            zf4.dispose(this);
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f34150b == this.f34149a.f34157H) {
                this.f34153e = true;
                this.f34149a.m10244b();
            }
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f34149a.m10245c(this, t);
        }

        @Override // p000.pxb
        public void onNext(R t) {
            if (this.f34150b == this.f34149a.f34157H) {
                if (t != null) {
                    this.f34152d.offer(t);
                }
                this.f34149a.m10244b();
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.setOnce(this, d)) {
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f34152d = tmdVar;
                        this.f34153e = true;
                        this.f34149a.m10244b();
                        return;
                    } else if (iRequestFusion == 2) {
                        this.f34152d = tmdVar;
                        return;
                    }
                }
                this.f34152d = new qzf(this.f34151c);
            }
        }
    }

    /* JADX INFO: renamed from: evb$b */
    public static final class C5480b<T, R> extends AtomicInteger implements pxb<T>, lf4 {

        /* JADX INFO: renamed from: L */
        public static final C5479a<Object, Object> f34154L;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: C */
        public lf4 f34155C;

        /* JADX INFO: renamed from: H */
        public volatile long f34157H;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f34158a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super T, ? extends wub<? extends R>> f34159b;

        /* JADX INFO: renamed from: c */
        public final int f34160c;

        /* JADX INFO: renamed from: d */
        public final boolean f34161d;

        /* JADX INFO: renamed from: f */
        public volatile boolean f34163f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f34164m;

        /* JADX INFO: renamed from: F */
        public final AtomicReference<C5479a<T, R>> f34156F = new AtomicReference<>();

        /* JADX INFO: renamed from: e */
        public final bc0 f34162e = new bc0();

        static {
            C5479a<Object, Object> c5479a = new C5479a<>(null, -1L, 1);
            f34154L = c5479a;
            c5479a.cancel();
        }

        public C5480b(pxb<? super R> actual, sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize, boolean delayErrors) {
            this.f34158a = actual;
            this.f34159b = mapper;
            this.f34160c = bufferSize;
            this.f34161d = delayErrors;
        }

        /* JADX INFO: renamed from: a */
        public void m10243a() {
            C5479a<T, R> andSet = this.f34156F.getAndSet((C5479a<T, R>) f34154L);
            if (andSet != null) {
                andSet.cancel();
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:77:0x00b7 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:80:0x000f A[SYNTHETIC] */
        /* JADX INFO: renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10244b() {
            /*
                r13 = this;
                int r0 = r13.getAndIncrement()
                if (r0 == 0) goto L7
                return
            L7:
                pxb<? super R> r0 = r13.f34158a
                java.util.concurrent.atomic.AtomicReference<evb$a<T, R>> r1 = r13.f34156F
                boolean r2 = r13.f34161d
                r3 = 1
                r4 = r3
            Lf:
                boolean r5 = r13.f34164m
                if (r5 == 0) goto L14
                return
            L14:
                boolean r5 = r13.f34163f
                r6 = 0
                if (r5 == 0) goto L4e
                java.lang.Object r5 = r1.get()
                if (r5 != 0) goto L21
                r5 = r3
                goto L22
            L21:
                r5 = r6
            L22:
                if (r2 == 0) goto L38
                if (r5 == 0) goto L4e
                bc0 r1 = r13.f34162e
                java.lang.Object r1 = r1.get()
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                if (r1 == 0) goto L34
                r0.onError(r1)
                goto L37
            L34:
                r0.onComplete()
            L37:
                return
            L38:
                bc0 r7 = r13.f34162e
                java.lang.Object r7 = r7.get()
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L48
                bc0 r1 = r13.f34162e
                r1.tryTerminateConsumer(r0)
                return
            L48:
                if (r5 == 0) goto L4e
                r0.onComplete()
                return
            L4e:
                java.lang.Object r5 = r1.get()
                evb$a r5 = (p000.evb.C5479a) r5
                if (r5 == 0) goto Lb7
                zif<R> r7 = r5.f34152d
                if (r7 == 0) goto Lb7
                r8 = r6
            L5b:
                boolean r9 = r13.f34164m
                if (r9 == 0) goto L60
                return
            L60:
                java.lang.Object r9 = r1.get()
                if (r5 == r9) goto L68
            L66:
                r8 = r3
                goto Laf
            L68:
                if (r2 != 0) goto L7a
                bc0 r9 = r13.f34162e
                java.lang.Object r9 = r9.get()
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                if (r9 == 0) goto L7a
                bc0 r1 = r13.f34162e
                r1.tryTerminateConsumer(r0)
                return
            L7a:
                boolean r9 = r5.f34153e
                r10 = 0
                java.lang.Object r11 = r7.poll()     // Catch: java.lang.Throwable -> L82
                goto La0
            L82:
                r8 = move-exception
                p000.o75.throwIfFatal(r8)
                bc0 r11 = r13.f34162e
                r11.tryAddThrowableOrReport(r8)
                p000.v7b.m23844a(r1, r5, r10)
                if (r2 != 0) goto L9b
                r13.m10243a()
                lf4 r8 = r13.f34155C
                r8.dispose()
                r13.f34163f = r3
                goto L9e
            L9b:
                r5.cancel()
            L9e:
                r8 = r3
                r11 = r10
            La0:
                if (r11 != 0) goto La4
                r12 = r3
                goto La5
            La4:
                r12 = r6
            La5:
                if (r9 == 0) goto Lad
                if (r12 == 0) goto Lad
                p000.v7b.m23844a(r1, r5, r10)
                goto L66
            Lad:
                if (r12 == 0) goto Lb3
            Laf:
                if (r8 == 0) goto Lb7
                goto Lf
            Lb3:
                r0.onNext(r11)
                goto L5b
            Lb7:
                int r4 = -r4
                int r4 = r13.addAndGet(r4)
                if (r4 != 0) goto Lf
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.evb.C5480b.m10244b():void");
        }

        /* JADX INFO: renamed from: c */
        public void m10245c(C5479a<T, R> inner, Throwable ex) {
            if (inner.f34150b != this.f34157H || !this.f34162e.tryAddThrowable(ex)) {
                ofe.onError(ex);
                return;
            }
            if (!this.f34161d) {
                this.f34155C.dispose();
                this.f34163f = true;
            }
            inner.f34153e = true;
            m10244b();
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f34164m) {
                return;
            }
            this.f34164m = true;
            this.f34155C.dispose();
            m10243a();
            this.f34162e.tryTerminateAndReport();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f34164m;
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f34163f) {
                return;
            }
            this.f34163f = true;
            m10244b();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f34163f || !this.f34162e.tryAddThrowable(t)) {
                ofe.onError(t);
                return;
            }
            if (!this.f34161d) {
                m10243a();
            }
            this.f34163f = true;
            m10244b();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            C5479a<T, R> c5479a;
            long j = this.f34157H + 1;
            this.f34157H = j;
            C5479a<T, R> c5479a2 = this.f34156F.get();
            if (c5479a2 != null) {
                c5479a2.cancel();
            }
            try {
                wub<? extends R> wubVarApply = this.f34159b.apply(t);
                Objects.requireNonNull(wubVarApply, "The ObservableSource returned is null");
                wub<? extends R> wubVar = wubVarApply;
                C5479a c5479a3 = new C5479a(this, j, this.f34160c);
                do {
                    c5479a = this.f34156F.get();
                    if (c5479a == f34154L) {
                        return;
                    }
                } while (!v7b.m23844a(this.f34156F, c5479a, c5479a3));
                wubVar.subscribe(c5479a3);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f34155C.dispose();
                onError(th);
            }
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f34155C, d)) {
                this.f34155C = d;
                this.f34158a.onSubscribe(this);
            }
        }
    }

    public evb(wub<T> source, sy6<? super T, ? extends wub<? extends R>> mapper, int bufferSize, boolean delayErrors) {
        super(source);
        this.f34146b = mapper;
        this.f34147c = bufferSize;
        this.f34148d = delayErrors;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> t) {
        if (vtb.tryScalarXMapSubscribe(this.f63101a, t, this.f34146b)) {
            return;
        }
        this.f63101a.subscribe(new C5480b(t, this.f34146b, this.f34147c, this.f34148d));
    }
}
