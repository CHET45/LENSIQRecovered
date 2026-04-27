package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class nf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final aaa<? extends T> f64240c;

    /* JADX INFO: renamed from: nf6$a */
    public static final class C9841a<T> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: X */
        public static final int f64241X = 1;

        /* JADX INFO: renamed from: Y */
        public static final int f64242Y = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile uif<T> f64243C;

        /* JADX INFO: renamed from: F */
        public T f64244F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f64245H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f64246L;

        /* JADX INFO: renamed from: M */
        public volatile int f64247M;

        /* JADX INFO: renamed from: N */
        public long f64248N;

        /* JADX INFO: renamed from: Q */
        public int f64249Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f64250a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f64251b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f64252c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f64253d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f64254e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final int f64255f;

        /* JADX INFO: renamed from: m */
        public final int f64256m;

        /* JADX INFO: renamed from: nf6$a$a */
        public static final class a<T> extends AtomicReference<mf4> implements l9a<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C9841a<T> f64257a;

            public a(C9841a<T> c9841a) {
                this.f64257a = c9841a;
            }

            @Override // p000.l9a
            public void onComplete() {
                this.f64257a.m17885d();
            }

            @Override // p000.l9a
            public void onError(Throwable th) {
                this.f64257a.m17886e(th);
            }

            @Override // p000.l9a
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.l9a
            public void onSuccess(T t) {
                this.f64257a.m17887f(t);
            }
        }

        public C9841a(ycg<? super T> ycgVar) {
            this.f64250a = ycgVar;
            int iBufferSize = m86.bufferSize();
            this.f64255f = iBufferSize;
            this.f64256m = iBufferSize - (iBufferSize >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m17882a() {
            if (getAndIncrement() == 0) {
                m17883b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m17883b() {
            ycg<? super T> ycgVar = this.f64250a;
            long j = this.f64248N;
            int i = this.f64249Q;
            int i2 = this.f64256m;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f64254e.get();
                while (j != j2) {
                    if (this.f64245H) {
                        this.f64244F = null;
                        this.f64243C = null;
                        return;
                    }
                    if (this.f64253d.get() != null) {
                        this.f64244F = null;
                        this.f64243C = null;
                        ycgVar.onError(this.f64253d.terminate());
                        return;
                    }
                    int i4 = this.f64247M;
                    if (i4 == i3) {
                        T t = this.f64244F;
                        this.f64244F = null;
                        this.f64247M = 2;
                        ycgVar.onNext(t);
                        j++;
                    } else {
                        boolean z = this.f64246L;
                        uif<T> uifVar = this.f64243C;
                        InterfaceC0000a interfaceC0000aPoll = uifVar != null ? uifVar.poll() : null;
                        boolean z2 = interfaceC0000aPoll == null;
                        if (z && z2 && i4 == 2) {
                            this.f64243C = null;
                            ycgVar.onComplete();
                            return;
                        } else {
                            if (z2) {
                                break;
                            }
                            ycgVar.onNext(interfaceC0000aPoll);
                            j++;
                            i++;
                            if (i == i2) {
                                this.f64251b.get().request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f64245H) {
                        this.f64244F = null;
                        this.f64243C = null;
                        return;
                    }
                    if (this.f64253d.get() != null) {
                        this.f64244F = null;
                        this.f64243C = null;
                        ycgVar.onError(this.f64253d.terminate());
                        return;
                    }
                    boolean z3 = this.f64246L;
                    uif<T> uifVar2 = this.f64243C;
                    boolean z4 = uifVar2 == null || uifVar2.isEmpty();
                    if (z3 && z4 && this.f64247M == 2) {
                        this.f64243C = null;
                        ycgVar.onComplete();
                        return;
                    }
                }
                this.f64248N = j;
                this.f64249Q = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public uif<T> m17884c() {
            uif<T> uifVar = this.f64243C;
            if (uifVar != null) {
                return uifVar;
            }
            pzf pzfVar = new pzf(m86.bufferSize());
            this.f64243C = pzfVar;
            return pzfVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f64245H = true;
            mdg.cancel(this.f64251b);
            ag4.dispose(this.f64252c);
            if (getAndIncrement() == 0) {
                this.f64243C = null;
                this.f64244F = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m17885d() {
            this.f64247M = 2;
            m17882a();
        }

        /* JADX INFO: renamed from: e */
        public void m17886e(Throwable th) {
            if (!this.f64253d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                mdg.cancel(this.f64251b);
                m17882a();
            }
        }

        /* JADX INFO: renamed from: f */
        public void m17887f(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f64248N;
                if (this.f64254e.get() != j) {
                    this.f64248N = j + 1;
                    this.f64250a.onNext(t);
                    this.f64247M = 2;
                } else {
                    this.f64244F = t;
                    this.f64247M = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f64244F = t;
                this.f64247M = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17883b();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f64246L = true;
            m17882a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f64253d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f64252c);
                m17882a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f64248N;
                if (this.f64254e.get() != j) {
                    uif<T> uifVar = this.f64243C;
                    if (uifVar == null || uifVar.isEmpty()) {
                        this.f64248N = j + 1;
                        this.f64250a.onNext(t);
                        int i = this.f64249Q + 1;
                        if (i == this.f64256m) {
                            this.f64249Q = 0;
                            this.f64251b.get().request(i);
                        } else {
                            this.f64249Q = i;
                        }
                    } else {
                        uifVar.offer(t);
                    }
                } else {
                    m17884c().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m17884c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m17883b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this.f64251b, fdgVar, this.f64255f);
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f64254e, j);
            m17882a();
        }
    }

    public nf6(m86<T> m86Var, aaa<? extends T> aaaVar) {
        super(m86Var);
        this.f64240c = aaaVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C9841a c9841a = new C9841a(ycgVar);
        ycgVar.onSubscribe(c9841a);
        this.f52360b.subscribe((lj6) c9841a);
        this.f64240c.subscribe(c9841a.f64252c);
    }
}
