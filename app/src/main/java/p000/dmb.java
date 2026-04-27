package p000;

import io.reactivex.Observable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class dmb<T, R> extends Observable<R> {

    /* JADX INFO: renamed from: a */
    public final xub<? extends T>[] f30048a;

    /* JADX INFO: renamed from: b */
    public final Iterable<? extends xub<? extends T>> f30049b;

    /* JADX INFO: renamed from: c */
    public final py6<? super Object[], ? extends R> f30050c;

    /* JADX INFO: renamed from: d */
    public final int f30051d;

    /* JADX INFO: renamed from: e */
    public final boolean f30052e;

    /* JADX INFO: renamed from: dmb$a */
    public static final class C4864a<T, R> extends AtomicReference<mf4> implements oxb<T> {
        private static final long serialVersionUID = -4823716997131257941L;

        /* JADX INFO: renamed from: a */
        public final C4865b<T, R> f30053a;

        /* JADX INFO: renamed from: b */
        public final int f30054b;

        public C4864a(C4865b<T, R> c4865b, int i) {
            this.f30053a = c4865b;
            this.f30054b = i;
        }

        public void dispose() {
            ag4.dispose(this);
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f30053a.m9256d(this.f30054b);
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            this.f30053a.m9257e(this.f30054b, th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            this.f30053a.m9258f(this.f30054b, t);
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            ag4.setOnce(this, mf4Var);
        }
    }

    /* JADX INFO: renamed from: dmb$b */
    public static final class C4865b<T, R> extends AtomicInteger implements mf4 {
        private static final long serialVersionUID = 8567835998786448817L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f30055C;

        /* JADX INFO: renamed from: F */
        public final cc0 f30056F = new cc0();

        /* JADX INFO: renamed from: H */
        public int f30057H;

        /* JADX INFO: renamed from: L */
        public int f30058L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f30059a;

        /* JADX INFO: renamed from: b */
        public final py6<? super Object[], ? extends R> f30060b;

        /* JADX INFO: renamed from: c */
        public final C4864a<T, R>[] f30061c;

        /* JADX INFO: renamed from: d */
        public Object[] f30062d;

        /* JADX INFO: renamed from: e */
        public final rzf<Object[]> f30063e;

        /* JADX INFO: renamed from: f */
        public final boolean f30064f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f30065m;

        public C4865b(oxb<? super R> oxbVar, py6<? super Object[], ? extends R> py6Var, int i, int i2, boolean z) {
            this.f30059a = oxbVar;
            this.f30060b = py6Var;
            this.f30064f = z;
            this.f30062d = new Object[i];
            C4864a<T, R>[] c4864aArr = new C4864a[i];
            for (int i3 = 0; i3 < i; i3++) {
                c4864aArr[i3] = new C4864a<>(this, i3);
            }
            this.f30061c = c4864aArr;
            this.f30063e = new rzf<>(i2);
        }

        /* JADX INFO: renamed from: a */
        public void m9253a() {
            for (C4864a<T, R> c4864a : this.f30061c) {
                c4864a.dispose();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m9254b(rzf<?> rzfVar) {
            synchronized (this) {
                this.f30062d = null;
            }
            rzfVar.clear();
        }

        /* JADX INFO: renamed from: c */
        public void m9255c() {
            if (getAndIncrement() != 0) {
                return;
            }
            rzf<Object[]> rzfVar = this.f30063e;
            oxb<? super R> oxbVar = this.f30059a;
            boolean z = this.f30064f;
            int iAddAndGet = 1;
            while (!this.f30065m) {
                if (!z && this.f30056F.get() != null) {
                    m9253a();
                    m9254b(rzfVar);
                    oxbVar.onError(this.f30056F.terminate());
                    return;
                }
                boolean z2 = this.f30055C;
                Object[] objArrPoll = rzfVar.poll();
                boolean z3 = objArrPoll == null;
                if (z2 && z3) {
                    m9254b(rzfVar);
                    Throwable thTerminate = this.f30056F.terminate();
                    if (thTerminate == null) {
                        oxbVar.onComplete();
                        return;
                    } else {
                        oxbVar.onError(thTerminate);
                        return;
                    }
                }
                if (z3) {
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    try {
                        oxbVar.onNext((Object) xjb.requireNonNull(this.f30060b.apply(objArrPoll), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        n75.throwIfFatal(th);
                        this.f30056F.addThrowable(th);
                        m9253a();
                        m9254b(rzfVar);
                        oxbVar.onError(this.f30056F.terminate());
                        return;
                    }
                }
            }
            m9254b(rzfVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        /* JADX INFO: renamed from: d */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9256d(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f30062d     // Catch: java.lang.Throwable -> L7
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
                int r2 = r3.f30058L     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.f30058L = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.f30055C = r1     // Catch: java.lang.Throwable -> L7
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                if (r4 == 0) goto L23
                r3.m9253a()
            L23:
                r3.m9255c()
                return
            L27:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dmb.C4865b.m9256d(int):void");
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f30065m) {
                return;
            }
            this.f30065m = true;
            m9253a();
            if (getAndIncrement() == 0) {
                m9254b(this.f30063e);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:30:0x000e }] */
        /* JADX INFO: renamed from: e */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m9257e(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                cc0 r0 = r2.f30056F
                boolean r0 = r0.addThrowable(r4)
                if (r0 == 0) goto L37
                boolean r4 = r2.f30064f
                r0 = 1
                if (r4 == 0) goto L2e
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f30062d     // Catch: java.lang.Throwable -> L14
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
                int r1 = r2.f30058L     // Catch: java.lang.Throwable -> L14
                int r1 = r1 + r0
                r2.f30058L = r1     // Catch: java.lang.Throwable -> L14
                int r4 = r4.length     // Catch: java.lang.Throwable -> L14
                if (r1 != r4) goto L29
            L27:
                r2.f30055C = r0     // Catch: java.lang.Throwable -> L14
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                r0 = r3
                goto L2e
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                throw r3
            L2e:
                if (r0 == 0) goto L33
                r2.m9253a()
            L33:
                r2.m9255c()
                goto L3a
            L37:
                p000.pfe.onError(r4)
            L3a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.dmb.C4865b.m9257e(int, java.lang.Throwable):void");
        }

        /* JADX INFO: renamed from: f */
        public void m9258f(int i, T t) {
            boolean z;
            synchronized (this) {
                try {
                    Object[] objArr = this.f30062d;
                    if (objArr == null) {
                        return;
                    }
                    Object obj = objArr[i];
                    int i2 = this.f30057H;
                    if (obj == null) {
                        i2++;
                        this.f30057H = i2;
                    }
                    objArr[i] = t;
                    if (i2 == objArr.length) {
                        this.f30063e.offer((Object[]) objArr.clone());
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        m9255c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f30065m;
        }

        public void subscribe(xub<? extends T>[] xubVarArr) {
            C4864a<T, R>[] c4864aArr = this.f30061c;
            int length = c4864aArr.length;
            this.f30059a.onSubscribe(this);
            for (int i = 0; i < length && !this.f30055C && !this.f30065m; i++) {
                xubVarArr[i].subscribe(c4864aArr[i]);
            }
        }
    }

    public dmb(xub<? extends T>[] xubVarArr, Iterable<? extends xub<? extends T>> iterable, py6<? super Object[], ? extends R> py6Var, int i, boolean z) {
        this.f30048a = xubVarArr;
        this.f30049b = iterable;
        this.f30050c = py6Var;
        this.f30051d = i;
        this.f30052e = z;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super R> oxbVar) {
        int length;
        xub<? extends T>[] xubVarArr = this.f30048a;
        if (xubVarArr == null) {
            xubVarArr = new xub[8];
            length = 0;
            for (xub<? extends T> xubVar : this.f30049b) {
                if (length == xubVarArr.length) {
                    xub<? extends T>[] xubVarArr2 = new xub[(length >> 2) + length];
                    System.arraycopy(xubVarArr, 0, xubVarArr2, 0, length);
                    xubVarArr = xubVarArr2;
                }
                xubVarArr[length] = xubVar;
                length++;
            }
        } else {
            length = xubVarArr.length;
        }
        int i = length;
        if (i == 0) {
            c05.complete(oxbVar);
        } else {
            new C4865b(oxbVar, this.f30050c, i, this.f30051d, this.f30052e).subscribe(xubVarArr);
        }
    }
}
