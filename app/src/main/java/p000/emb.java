package p000;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class emb<T, R> extends vkb<R> {

    /* JADX INFO: renamed from: a */
    public final wub<? extends T>[] f33499a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends wub<? extends T>> f33500b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super Object[], ? extends R> f33501c;

    /* JADX INFO: renamed from: d */
    public final int f33502d;

    /* JADX INFO: renamed from: e */
    public final boolean f33503e;

    /* JADX INFO: renamed from: emb$a */
    public static final class C5389a<T, R> extends AtomicReference<lf4> implements pxb<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* JADX INFO: renamed from: a */
        public final C5390b<T, R> f33504a;

        /* JADX INFO: renamed from: b */
        public final int f33505b;

        public C5389a(C5390b<T, R> parent, int index) {
            this.f33504a = parent;
            this.f33505b = index;
        }

        public void dispose() {
            zf4.dispose(this);
        }

        @Override // p000.pxb
        public void onComplete() {
            this.f33504a.m10132d(this.f33505b);
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            this.f33504a.m10133e(this.f33505b, t);
        }

        @Override // p000.pxb
        public void onNext(T t) {
            this.f33504a.m10134f(this.f33505b, t);
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            zf4.setOnce(this, d);
        }
    }

    /* JADX INFO: renamed from: emb$b */
    public static final class C5390b<T, R> extends AtomicInteger implements lf4 {
        private static final long serialVersionUID = 8567835998786448817L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f33506C;

        /* JADX INFO: renamed from: F */
        public final bc0 f33507F = new bc0();

        /* JADX INFO: renamed from: H */
        public int f33508H;

        /* JADX INFO: renamed from: L */
        public int f33509L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super R> f33510a;

        /* JADX INFO: renamed from: b */
        public final sy6<? super Object[], ? extends R> f33511b;

        /* JADX INFO: renamed from: c */
        public final C5389a<T, R>[] f33512c;

        /* JADX INFO: renamed from: d */
        public Object[] f33513d;

        /* JADX INFO: renamed from: e */
        public final qzf<Object[]> f33514e;

        /* JADX INFO: renamed from: f */
        public final boolean f33515f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f33516m;

        public C5390b(pxb<? super R> actual, sy6<? super Object[], ? extends R> combiner, int count, int bufferSize, boolean delayError) {
            this.f33510a = actual;
            this.f33511b = combiner;
            this.f33515f = delayError;
            this.f33513d = new Object[count];
            C5389a<T, R>[] c5389aArr = new C5389a[count];
            for (int i = 0; i < count; i++) {
                c5389aArr[i] = new C5389a<>(this, i);
            }
            this.f33512c = c5389aArr;
            this.f33514e = new qzf<>(bufferSize);
        }

        /* JADX INFO: renamed from: a */
        public void m10129a() {
            for (C5389a<T, R> c5389a : this.f33512c) {
                c5389a.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m10130b(qzf<?> q) {
            synchronized (this) {
                this.f33513d = null;
            }
            q.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m10131c() {
            if (getAndIncrement() != 0) {
                return;
            }
            qzf<Object[]> qzfVar = this.f33514e;
            pxb<? super R> pxbVar = this.f33510a;
            boolean z = this.f33515f;
            int iAddAndGet = 1;
            while (!this.f33516m) {
                if (!z && this.f33507F.get() != null) {
                    m10129a();
                    m10130b(qzfVar);
                    this.f33507F.tryTerminateConsumer(pxbVar);
                    return;
                }
                boolean z2 = this.f33506C;
                Object[] objArrPoll = qzfVar.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    m10130b(qzfVar);
                    this.f33507F.tryTerminateConsumer(pxbVar);
                    return;
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        R rApply = this.f33511b.apply(objArrPoll);
                        Objects.requireNonNull(rApply, "The combiner returned a null value");
                        pxbVar.onNext(rApply);
                    } catch (Throwable th) {
                        o75.throwIfFatal(th);
                        this.f33507F.tryAddThrowableOrReport(th);
                        m10129a();
                        m10130b(qzfVar);
                        this.f33507F.tryTerminateConsumer(pxbVar);
                        return;
                    }
                }
            }
            m10130b(qzfVar);
            this.f33507F.tryTerminateAndReport();
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10132d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f33513d     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L27
            L9:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L7
                r1 = 1
                if (r4 != 0) goto L10
                r4 = r1
                goto L11
            L10:
                r4 = 0
            L11:
                if (r4 != 0) goto L1b
                int r2 = r3.f33509L     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.f33509L = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.f33506C = r1     // Catch: java.lang.Throwable -> L7
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                if (r4 == 0) goto L23
                r3.m10129a()
            L23:
                r3.m10131c()
                return
            L27:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.emb.C5390b.m10132d(int):void");
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f33516m) {
                return;
            }
            this.f33516m = true;
            m10129a();
            m10131c();
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:29:0x000e }] */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m10133e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                bc0 r0 = r2.f33507F
                boolean r4 = r0.tryAddThrowableOrReport(r4)
                if (r4 == 0) goto L36
                boolean r4 = r2.f33515f
                r0 = 1
                if (r4 == 0) goto L2e
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f33513d     // Catch: java.lang.Throwable -> L14
                if (r4 != 0) goto L16
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r3 = move-exception
                goto L2c
            L16:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L14
                if (r3 != 0) goto L1c
                r3 = r0
                goto L1d
            L1c:
                r3 = 0
            L1d:
                if (r3 != 0) goto L27
                int r1 = r2.f33509L     // Catch: java.lang.Throwable -> L14
                int r1 = r1 + r0
                r2.f33509L = r1     // Catch: java.lang.Throwable -> L14
                int r4 = r4.length     // Catch: java.lang.Throwable -> L14
                if (r1 != r4) goto L29
            L27:
                r2.f33506C = r0     // Catch: java.lang.Throwable -> L14
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                r0 = r3
                goto L2e
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                throw r3
            L2e:
                if (r0 == 0) goto L33
                r2.m10129a()
            L33:
                r2.m10131c()
            L36:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.emb.C5390b.m10133e(int, java.lang.Throwable):void");
        }

        /* JADX INFO: renamed from: f */
        public void m10134f(int i, T t) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.f33513d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i];
                    int i2 = this.f33508H;
                    if (obj == null) {
                        i2++;
                        this.f33508H = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        this.f33514e.offer((Object[]) objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m10131c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f33516m;
        }

        public void subscribe(wub<? extends T>[] sources) {
            C5389a<T, R>[] c5389aArr = this.f33512c;
            int length = c5389aArr.length;
            this.f33510a.onSubscribe(this);
            for (int i = 0; i < length && !this.f33506C && !this.f33516m; i++) {
                sources[i].subscribe(c5389aArr[i]);
            }
        }
    }

    public emb(wub<? extends T>[] sources, Iterable<? extends wub<? extends T>> sourcesIterable, sy6<? super Object[], ? extends R> combiner, int bufferSize, boolean delayError) {
        this.f33499a = sources;
        this.f33500b = sourcesIterable;
        this.f33501c = combiner;
        this.f33502d = bufferSize;
        this.f33503e = delayError;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super R> observer) {
        int length;
        wub<? extends T>[] wubVarArr = this.f33499a;
        if (wubVarArr == null) {
            wubVarArr = new wub[8];
            try {
                length = 0;
                for (wub<? extends T> wubVar : this.f33500b) {
                    if (length == wubVarArr.length) {
                        wub<? extends T>[] wubVarArr2 = new wub[(length >> 2) + length];
                        System.arraycopy(wubVarArr, 0, wubVarArr2, 0, length);
                        wubVarArr = wubVarArr2;
                    }
                    int i = length + 1;
                    Objects.requireNonNull(wubVar, "The Iterator returned a null ObservableSource");
                    wubVarArr[length] = wubVar;
                    length = i;
                }
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                b05.error(th, observer);
                return;
            }
        } else {
            length = wubVarArr.length;
        }
        int i2 = length;
        if (i2 == 0) {
            b05.complete(observer);
        } else {
            new C5390b(observer, this.f33501c, i2, this.f33502d, this.f33503e).subscribe(wubVarArr);
        }
    }
}
