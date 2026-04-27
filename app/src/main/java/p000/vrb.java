package p000;

import p000.voe;

/* JADX INFO: loaded from: classes7.dex */
public final class vrb<T> extends AbstractC10162o3<T, T> {

    /* JADX INFO: renamed from: b */
    public final voe f92074b;

    /* JADX INFO: renamed from: c */
    public final boolean f92075c;

    /* JADX INFO: renamed from: d */
    public final int f92076d;

    /* JADX INFO: renamed from: vrb$a */
    public static final class RunnableC14231a<T> extends qv0<T> implements oxb<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f92077C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f92078F;

        /* JADX INFO: renamed from: H */
        public int f92079H;

        /* JADX INFO: renamed from: L */
        public boolean f92080L;

        /* JADX INFO: renamed from: a */
        public final oxb<? super T> f92081a;

        /* JADX INFO: renamed from: b */
        public final voe.AbstractC14185c f92082b;

        /* JADX INFO: renamed from: c */
        public final boolean f92083c;

        /* JADX INFO: renamed from: d */
        public final int f92084d;

        /* JADX INFO: renamed from: e */
        public ajf<T> f92085e;

        /* JADX INFO: renamed from: f */
        public mf4 f92086f;

        /* JADX INFO: renamed from: m */
        public Throwable f92087m;

        public RunnableC14231a(oxb<? super T> oxbVar, voe.AbstractC14185c abstractC14185c, boolean z, int i) {
            this.f92081a = oxbVar;
            this.f92082b = abstractC14185c;
            this.f92083c = z;
            this.f92084d = i;
        }

        /* JADX INFO: renamed from: a */
        public boolean m24149a(boolean z, boolean z2, oxb<? super T> oxbVar) {
            if (this.f92078F) {
                this.f92085e.clear();
                return true;
            }
            if (!z) {
                return false;
            }
            Throwable th = this.f92087m;
            if (this.f92083c) {
                if (!z2) {
                    return false;
                }
                this.f92078F = true;
                if (th != null) {
                    oxbVar.onError(th);
                } else {
                    oxbVar.onComplete();
                }
                this.f92082b.dispose();
                return true;
            }
            if (th != null) {
                this.f92078F = true;
                this.f92085e.clear();
                oxbVar.onError(th);
                this.f92082b.dispose();
                return true;
            }
            if (!z2) {
                return false;
            }
            this.f92078F = true;
            oxbVar.onComplete();
            this.f92082b.dispose();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m24150b() {
            int iAddAndGet = 1;
            while (!this.f92078F) {
                boolean z = this.f92077C;
                Throwable th = this.f92087m;
                if (!this.f92083c && z && th != null) {
                    this.f92078F = true;
                    this.f92081a.onError(this.f92087m);
                    this.f92082b.dispose();
                    return;
                }
                this.f92081a.onNext(null);
                if (z) {
                    this.f92078F = true;
                    Throwable th2 = this.f92087m;
                    if (th2 != null) {
                        this.f92081a.onError(th2);
                    } else {
                        this.f92081a.onComplete();
                    }
                    this.f92082b.dispose();
                    return;
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: c */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void m24151c() {
            /*
                r7 = this;
                ajf<T> r0 = r7.f92085e
                oxb<? super T> r1 = r7.f92081a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f92077C
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.m24149a(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.f92077C
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.m24149a(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.onNext(r5)
                goto L13
            L33:
                r3 = move-exception
                p000.n75.throwIfFatal(r3)
                r7.f92078F = r2
                mf4 r2 = r7.f92086f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                voe$c r0 = r7.f92082b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.vrb.RunnableC14231a.m24151c():void");
        }

        @Override // p000.ajf
        public void clear() {
            this.f92085e.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m24152d() {
            if (getAndIncrement() == 0) {
                this.f92082b.schedule(this);
            }
        }

        @Override // p000.mf4
        public void dispose() {
            if (this.f92078F) {
                return;
            }
            this.f92078F = true;
            this.f92086f.dispose();
            this.f92082b.dispose();
            if (this.f92080L || getAndIncrement() != 0) {
                return;
            }
            this.f92085e.clear();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f92078F;
        }

        @Override // p000.ajf
        public boolean isEmpty() {
            return this.f92085e.isEmpty();
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f92077C) {
                return;
            }
            this.f92077C = true;
            m24152d();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f92077C) {
                pfe.onError(th);
                return;
            }
            this.f92087m = th;
            this.f92077C = true;
            m24152d();
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f92077C) {
                return;
            }
            if (this.f92079H != 2) {
                this.f92085e.offer(t);
            }
            m24152d();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f92086f, mf4Var)) {
                this.f92086f = mf4Var;
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f92079H = iRequestFusion;
                        this.f92085e = umdVar;
                        this.f92077C = true;
                        this.f92081a.onSubscribe(this);
                        m24152d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f92079H = iRequestFusion;
                        this.f92085e = umdVar;
                        this.f92081a.onSubscribe(this);
                        return;
                    }
                }
                this.f92085e = new rzf(this.f92084d);
                this.f92081a.onSubscribe(this);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            return this.f92085e.poll();
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            if ((i & 2) == 0) {
                return 0;
            }
            this.f92080L = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f92080L) {
                m24150b();
            } else {
                m24151c();
            }
        }
    }

    public vrb(xub<T> xubVar, voe voeVar, boolean z, int i) {
        super(xubVar);
        this.f92074b = voeVar;
        this.f92075c = z;
        this.f92076d = i;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        voe voeVar = this.f92074b;
        if (voeVar instanceof a8h) {
            this.f66354a.subscribe(oxbVar);
        } else {
            this.f66354a.subscribe(new RunnableC14231a(oxbVar, voeVar.createWorker(), this.f92075c, this.f92076d));
        }
    }
}
