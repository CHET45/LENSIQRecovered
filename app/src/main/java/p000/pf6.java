package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class pf6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final pof<? extends T> f70597c;

    /* JADX INFO: renamed from: pf6$a */
    public static final class C10942a<T> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: X */
        public static final int f70598X = 1;

        /* JADX INFO: renamed from: Y */
        public static final int f70599Y = 2;
        private static final long serialVersionUID = -4592979584110982903L;

        /* JADX INFO: renamed from: C */
        public volatile uif<T> f70600C;

        /* JADX INFO: renamed from: F */
        public T f70601F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f70602H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f70603L;

        /* JADX INFO: renamed from: M */
        public volatile int f70604M;

        /* JADX INFO: renamed from: N */
        public long f70605N;

        /* JADX INFO: renamed from: Q */
        public int f70606Q;

        /* JADX INFO: renamed from: a */
        public final ycg<? super T> f70607a;

        /* JADX INFO: renamed from: b */
        public final AtomicReference<fdg> f70608b = new AtomicReference<>();

        /* JADX INFO: renamed from: c */
        public final a<T> f70609c = new a<>(this);

        /* JADX INFO: renamed from: d */
        public final cc0 f70610d = new cc0();

        /* JADX INFO: renamed from: e */
        public final AtomicLong f70611e = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final int f70612f;

        /* JADX INFO: renamed from: m */
        public final int f70613m;

        /* JADX INFO: renamed from: pf6$a$a */
        public static final class a<T> extends AtomicReference<mf4> implements inf<T> {
            private static final long serialVersionUID = -2935427570954647017L;

            /* JADX INFO: renamed from: a */
            public final C10942a<T> f70614a;

            public a(C10942a<T> c10942a) {
                this.f70614a = c10942a;
            }

            @Override // p000.inf
            public void onError(Throwable th) {
                this.f70614a.m19461d(th);
            }

            @Override // p000.inf
            public void onSubscribe(mf4 mf4Var) {
                ag4.setOnce(this, mf4Var);
            }

            @Override // p000.inf
            public void onSuccess(T t) {
                this.f70614a.m19462e(t);
            }
        }

        public C10942a(ycg<? super T> ycgVar) {
            this.f70607a = ycgVar;
            int iBufferSize = m86.bufferSize();
            this.f70612f = iBufferSize;
            this.f70613m = iBufferSize - (iBufferSize >> 2);
        }

        /* JADX INFO: renamed from: a */
        public void m19458a() {
            if (getAndIncrement() == 0) {
                m19459b();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m19459b() {
            ycg<? super T> ycgVar = this.f70607a;
            long j = this.f70605N;
            int i = this.f70606Q;
            int i2 = this.f70613m;
            int i3 = 1;
            int iAddAndGet = 1;
            while (true) {
                long j2 = this.f70611e.get();
                while (j != j2) {
                    if (this.f70602H) {
                        this.f70601F = null;
                        this.f70600C = null;
                        return;
                    }
                    if (this.f70610d.get() != null) {
                        this.f70601F = null;
                        this.f70600C = null;
                        ycgVar.onError(this.f70610d.terminate());
                        return;
                    }
                    int i4 = this.f70604M;
                    if (i4 == i3) {
                        T t = this.f70601F;
                        this.f70601F = null;
                        this.f70604M = 2;
                        ycgVar.onNext(t);
                        j++;
                    } else {
                        boolean z = this.f70603L;
                        uif<T> uifVar = this.f70600C;
                        InterfaceC0000a interfaceC0000aPoll = uifVar != null ? uifVar.poll() : null;
                        boolean z2 = interfaceC0000aPoll == null;
                        if (z && z2 && i4 == 2) {
                            this.f70600C = null;
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
                                this.f70608b.get().request(i2);
                                i = 0;
                            }
                            i3 = 1;
                        }
                    }
                }
                if (j == j2) {
                    if (this.f70602H) {
                        this.f70601F = null;
                        this.f70600C = null;
                        return;
                    }
                    if (this.f70610d.get() != null) {
                        this.f70601F = null;
                        this.f70600C = null;
                        ycgVar.onError(this.f70610d.terminate());
                        return;
                    }
                    boolean z3 = this.f70603L;
                    uif<T> uifVar2 = this.f70600C;
                    boolean z4 = uifVar2 == null || uifVar2.isEmpty();
                    if (z3 && z4 && this.f70604M == 2) {
                        this.f70600C = null;
                        ycgVar.onComplete();
                        return;
                    }
                }
                this.f70605N = j;
                this.f70606Q = i;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                } else {
                    i3 = 1;
                }
            }
        }

        /* JADX INFO: renamed from: c */
        public uif<T> m19460c() {
            uif<T> uifVar = this.f70600C;
            if (uifVar != null) {
                return uifVar;
            }
            pzf pzfVar = new pzf(m86.bufferSize());
            this.f70600C = pzfVar;
            return pzfVar;
        }

        @Override // p000.fdg
        public void cancel() {
            this.f70602H = true;
            mdg.cancel(this.f70608b);
            ag4.dispose(this.f70609c);
            if (getAndIncrement() == 0) {
                this.f70600C = null;
                this.f70601F = null;
            }
        }

        /* JADX INFO: renamed from: d */
        public void m19461d(Throwable th) {
            if (!this.f70610d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                mdg.cancel(this.f70608b);
                m19458a();
            }
        }

        /* JADX INFO: renamed from: e */
        public void m19462e(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f70605N;
                if (this.f70611e.get() != j) {
                    this.f70605N = j + 1;
                    this.f70607a.onNext(t);
                    this.f70604M = 2;
                } else {
                    this.f70601F = t;
                    this.f70604M = 1;
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            } else {
                this.f70601F = t;
                this.f70604M = 1;
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m19459b();
        }

        @Override // p000.ycg
        public void onComplete() {
            this.f70603L = true;
            m19458a();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (!this.f70610d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                ag4.dispose(this.f70609c);
                m19458a();
            }
        }

        @Override // p000.ycg
        public void onNext(T t) {
            if (compareAndSet(0, 1)) {
                long j = this.f70605N;
                if (this.f70611e.get() != j) {
                    uif<T> uifVar = this.f70600C;
                    if (uifVar == null || uifVar.isEmpty()) {
                        this.f70605N = j + 1;
                        this.f70607a.onNext(t);
                        int i = this.f70606Q + 1;
                        if (i == this.f70613m) {
                            this.f70606Q = 0;
                            this.f70608b.get().request(i);
                        } else {
                            this.f70606Q = i;
                        }
                    } else {
                        uifVar.offer(t);
                    }
                } else {
                    m19460c().offer(t);
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            } else {
                m19460c().offer(t);
                if (getAndIncrement() != 0) {
                    return;
                }
            }
            m19459b();
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            mdg.setOnce(this.f70608b, fdgVar, this.f70612f);
        }

        @Override // p000.fdg
        public void request(long j) {
            so0.add(this.f70611e, j);
            m19458a();
        }
    }

    public pf6(m86<T> m86Var, pof<? extends T> pofVar) {
        super(m86Var);
        this.f70597c = pofVar;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        C10942a c10942a = new C10942a(ycgVar);
        ycgVar.onSubscribe(c10942a);
        this.f52360b.subscribe((lj6) c10942a);
        this.f70597c.subscribe(c10942a.f70609c);
    }
}
