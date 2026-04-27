package p000;

import p000.woe;

/* JADX INFO: loaded from: classes7.dex */
public final class wrb<T> extends AbstractC9666n3<T, T> {

    /* JADX INFO: renamed from: b */
    public final woe f95207b;

    /* JADX INFO: renamed from: c */
    public final boolean f95208c;

    /* JADX INFO: renamed from: d */
    public final int f95209d;

    /* JADX INFO: renamed from: wrb$a */
    public static final class RunnableC14757a<T> extends pv0<T> implements pxb<T>, Runnable {
        private static final long serialVersionUID = 6576896619930983584L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f95210C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f95211F;

        /* JADX INFO: renamed from: H */
        public int f95212H;

        /* JADX INFO: renamed from: L */
        public boolean f95213L;

        /* JADX INFO: renamed from: a */
        public final pxb<? super T> f95214a;

        /* JADX INFO: renamed from: b */
        public final woe.AbstractC14729c f95215b;

        /* JADX INFO: renamed from: c */
        public final boolean f95216c;

        /* JADX INFO: renamed from: d */
        public final int f95217d;

        /* JADX INFO: renamed from: e */
        public zif<T> f95218e;

        /* JADX INFO: renamed from: f */
        public lf4 f95219f;

        /* JADX INFO: renamed from: m */
        public Throwable f95220m;

        public RunnableC14757a(pxb<? super T> actual, woe.AbstractC14729c worker, boolean delayError, int bufferSize) {
            this.f95214a = actual;
            this.f95215b = worker;
            this.f95216c = delayError;
            this.f95217d = bufferSize;
        }

        /* JADX INFO: renamed from: a */
        public boolean m24757a(boolean d, boolean empty, pxb<? super T> a) {
            if (this.f95211F) {
                this.f95218e.clear();
                return true;
            }
            if (!d) {
                return false;
            }
            Throwable th = this.f95220m;
            if (this.f95216c) {
                if (!empty) {
                    return false;
                }
                this.f95211F = true;
                if (th != null) {
                    a.onError(th);
                } else {
                    a.onComplete();
                }
                this.f95215b.dispose();
                return true;
            }
            if (th != null) {
                this.f95211F = true;
                this.f95218e.clear();
                a.onError(th);
                this.f95215b.dispose();
                return true;
            }
            if (!empty) {
                return false;
            }
            this.f95211F = true;
            a.onComplete();
            this.f95215b.dispose();
            return true;
        }

        /* JADX INFO: renamed from: b */
        public void m24758b() {
            int iAddAndGet = 1;
            while (!this.f95211F) {
                boolean z = this.f95210C;
                Throwable th = this.f95220m;
                if (!this.f95216c && z && th != null) {
                    this.f95211F = true;
                    this.f95214a.onError(this.f95220m);
                    this.f95215b.dispose();
                    return;
                }
                this.f95214a.onNext(null);
                if (z) {
                    this.f95211F = true;
                    Throwable th2 = this.f95220m;
                    if (th2 != null) {
                        this.f95214a.onError(th2);
                    } else {
                        this.f95214a.onComplete();
                    }
                    this.f95215b.dispose();
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
        public void m24759c() {
            /*
                r7 = this;
                zif<T> r0 = r7.f95218e
                pxb<? super T> r1 = r7.f95214a
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f95210C
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.m24757a(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.f95210C
                java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.m24757a(r4, r6, r1)
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
                p000.o75.throwIfFatal(r3)
                r7.f95211F = r2
                lf4 r2 = r7.f95219f
                r2.dispose()
                r0.clear()
                r1.onError(r3)
                woe$c r0 = r7.f95215b
                r0.dispose()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p000.wrb.RunnableC14757a.m24759c():void");
        }

        @Override // p000.zif
        public void clear() {
            this.f95218e.clear();
        }

        /* JADX INFO: renamed from: d */
        public void m24760d() {
            if (getAndIncrement() == 0) {
                this.f95215b.schedule(this);
            }
        }

        @Override // p000.lf4
        public void dispose() {
            if (this.f95211F) {
                return;
            }
            this.f95211F = true;
            this.f95219f.dispose();
            this.f95215b.dispose();
            if (this.f95213L || getAndIncrement() != 0) {
                return;
            }
            this.f95218e.clear();
        }

        @Override // p000.lf4
        public boolean isDisposed() {
            return this.f95211F;
        }

        @Override // p000.zif
        public boolean isEmpty() {
            return this.f95218e.isEmpty();
        }

        @Override // p000.pxb
        public void onComplete() {
            if (this.f95210C) {
                return;
            }
            this.f95210C = true;
            m24760d();
        }

        @Override // p000.pxb
        public void onError(Throwable t) {
            if (this.f95210C) {
                ofe.onError(t);
                return;
            }
            this.f95220m = t;
            this.f95210C = true;
            m24760d();
        }

        @Override // p000.pxb
        public void onNext(T t) {
            if (this.f95210C) {
                return;
            }
            if (this.f95212H != 2) {
                this.f95218e.offer(t);
            }
            m24760d();
        }

        @Override // p000.pxb
        public void onSubscribe(lf4 d) {
            if (zf4.validate(this.f95219f, d)) {
                this.f95219f = d;
                if (d instanceof tmd) {
                    tmd tmdVar = (tmd) d;
                    int iRequestFusion = tmdVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f95212H = iRequestFusion;
                        this.f95218e = tmdVar;
                        this.f95210C = true;
                        this.f95214a.onSubscribe(this);
                        m24760d();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f95212H = iRequestFusion;
                        this.f95218e = tmdVar;
                        this.f95214a.onSubscribe(this);
                        return;
                    }
                }
                this.f95218e = new qzf(this.f95217d);
                this.f95214a.onSubscribe(this);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Throwable {
            return this.f95218e.poll();
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            if ((mode & 2) == 0) {
                return 0;
            }
            this.f95213L = true;
            return 2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f95213L) {
                m24758b();
            } else {
                m24759c();
            }
        }
    }

    public wrb(wub<T> source, woe scheduler, boolean delayError, int bufferSize) {
        super(source);
        this.f95207b = scheduler;
        this.f95208c = delayError;
        this.f95209d = bufferSize;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        woe woeVar = this.f95207b;
        if (woeVar instanceof b8h) {
            this.f63101a.subscribe(observer);
        } else {
            this.f63101a.subscribe(new RunnableC14757a(observer, woeVar.createWorker(), this.f95208c, this.f95209d));
        }
    }
}
