package p000;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class oj6<T, R> extends AbstractC8162k1<T, R> {

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f67788c;

    /* JADX INFO: renamed from: d */
    public final int f67789d;

    /* JADX INFO: renamed from: e */
    public final boolean f67790e;

    /* JADX INFO: renamed from: oj6$a */
    public static final class C10392a<T, R> extends AtomicReference<fdg> implements lj6<R> {
        private static final long serialVersionUID = 3837284832786408377L;

        /* JADX INFO: renamed from: a */
        public final C10393b<T, R> f67791a;

        /* JADX INFO: renamed from: b */
        public final long f67792b;

        /* JADX INFO: renamed from: c */
        public final int f67793c;

        /* JADX INFO: renamed from: d */
        public volatile ajf<R> f67794d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f67795e;

        /* JADX INFO: renamed from: f */
        public int f67796f;

        public C10392a(C10393b<T, R> c10393b, long j, int i) {
            this.f67791a = c10393b;
            this.f67792b = j;
            this.f67793c = i;
        }

        public void cancel() {
            mdg.cancel(this);
        }

        @Override // p000.ycg
        public void onComplete() {
            C10393b<T, R> c10393b = this.f67791a;
            if (this.f67792b == c10393b.f67801L) {
                this.f67795e = true;
                c10393b.m18727b();
            }
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            C10393b<T, R> c10393b = this.f67791a;
            if (this.f67792b != c10393b.f67801L || !c10393b.f67807f.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!c10393b.f67805d) {
                c10393b.f67798C.cancel();
                c10393b.f67806e = true;
            }
            this.f67795e = true;
            c10393b.m18727b();
        }

        @Override // p000.ycg
        public void onNext(R r) {
            C10393b<T, R> c10393b = this.f67791a;
            if (this.f67792b == c10393b.f67801L) {
                if (this.f67796f != 0 || this.f67794d.offer(r)) {
                    c10393b.m18727b();
                } else {
                    onError(new cwa("Queue full?!"));
                }
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.setOnce(this, fdgVar)) {
                if (fdgVar instanceof cod) {
                    cod codVar = (cod) fdgVar;
                    int iRequestFusion = codVar.requestFusion(7);
                    if (iRequestFusion == 1) {
                        this.f67796f = iRequestFusion;
                        this.f67794d = codVar;
                        this.f67795e = true;
                        this.f67791a.m18727b();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f67796f = iRequestFusion;
                        this.f67794d = codVar;
                        fdgVar.request(this.f67793c);
                        return;
                    }
                }
                this.f67794d = new pzf(this.f67793c);
                fdgVar.request(this.f67793c);
            }
        }

        public void request(long j) {
            if (this.f67796f != 1) {
                get().request(j);
            }
        }
    }

    /* JADX INFO: renamed from: oj6$b */
    public static final class C10393b<T, R> extends AtomicInteger implements lj6<T>, fdg {

        /* JADX INFO: renamed from: M */
        public static final C10392a<Object, Object> f67797M;
        private static final long serialVersionUID = -3491074160481096299L;

        /* JADX INFO: renamed from: C */
        public fdg f67798C;

        /* JADX INFO: renamed from: L */
        public volatile long f67801L;

        /* JADX INFO: renamed from: a */
        public final ycg<? super R> f67802a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends zjd<? extends R>> f67803b;

        /* JADX INFO: renamed from: c */
        public final int f67804c;

        /* JADX INFO: renamed from: d */
        public final boolean f67805d;

        /* JADX INFO: renamed from: e */
        public volatile boolean f67806e;

        /* JADX INFO: renamed from: m */
        public volatile boolean f67808m;

        /* JADX INFO: renamed from: F */
        public final AtomicReference<C10392a<T, R>> f67799F = new AtomicReference<>();

        /* JADX INFO: renamed from: H */
        public final AtomicLong f67800H = new AtomicLong();

        /* JADX INFO: renamed from: f */
        public final cc0 f67807f = new cc0();

        static {
            C10392a<Object, Object> c10392a = new C10392a<>(null, -1L, 1);
            f67797M = c10392a;
            c10392a.cancel();
        }

        public C10393b(ycg<? super R> ycgVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
            this.f67802a = ycgVar;
            this.f67803b = py6Var;
            this.f67804c = i;
            this.f67805d = z;
        }

        /* JADX INFO: renamed from: a */
        public void m18726a() {
            C10392a<T, R> andSet;
            C10392a<T, R> c10392a = this.f67799F.get();
            C10392a<Object, Object> c10392a2 = f67797M;
            if (c10392a == c10392a2 || (andSet = this.f67799F.getAndSet((C10392a<T, R>) c10392a2)) == c10392a2 || andSet == null) {
                return;
            }
            andSet.cancel();
        }

        /* JADX INFO: renamed from: b */
        public void m18727b() {
            boolean z;
            InterfaceC0000a interfaceC0000aPoll;
            if (getAndIncrement() != 0) {
                return;
            }
            ycg<? super R> ycgVar = this.f67802a;
            int iAddAndGet = 1;
            while (!this.f67808m) {
                if (this.f67806e) {
                    if (this.f67805d) {
                        if (this.f67799F.get() == null) {
                            if (this.f67807f.get() != null) {
                                ycgVar.onError(this.f67807f.terminate());
                                return;
                            } else {
                                ycgVar.onComplete();
                                return;
                            }
                        }
                    } else if (this.f67807f.get() != null) {
                        m18726a();
                        ycgVar.onError(this.f67807f.terminate());
                        return;
                    } else if (this.f67799F.get() == null) {
                        ycgVar.onComplete();
                        return;
                    }
                }
                C10392a<T, R> c10392a = this.f67799F.get();
                ajf<R> ajfVar = c10392a != null ? c10392a.f67794d : null;
                if (ajfVar != null) {
                    if (c10392a.f67795e) {
                        if (this.f67805d) {
                            if (ajfVar.isEmpty()) {
                                v7b.m23844a(this.f67799F, c10392a, null);
                            }
                        } else if (this.f67807f.get() != null) {
                            m18726a();
                            ycgVar.onError(this.f67807f.terminate());
                            return;
                        } else if (ajfVar.isEmpty()) {
                            v7b.m23844a(this.f67799F, c10392a, null);
                        }
                    }
                    long j = this.f67800H.get();
                    long j2 = 0;
                    while (true) {
                        z = false;
                        if (j2 != j) {
                            if (!this.f67808m) {
                                boolean z2 = c10392a.f67795e;
                                try {
                                    interfaceC0000aPoll = ajfVar.poll();
                                } catch (Throwable th) {
                                    n75.throwIfFatal(th);
                                    c10392a.cancel();
                                    this.f67807f.addThrowable(th);
                                    interfaceC0000aPoll = null;
                                    z2 = true;
                                }
                                boolean z3 = interfaceC0000aPoll == null;
                                if (c10392a != this.f67799F.get()) {
                                    break;
                                }
                                if (z2) {
                                    if (!this.f67805d) {
                                        if (this.f67807f.get() == null) {
                                            if (z3) {
                                                v7b.m23844a(this.f67799F, c10392a, null);
                                                break;
                                            }
                                        } else {
                                            ycgVar.onError(this.f67807f.terminate());
                                            return;
                                        }
                                    } else if (z3) {
                                        v7b.m23844a(this.f67799F, c10392a, null);
                                        break;
                                    }
                                }
                                if (z3) {
                                    break;
                                }
                                ycgVar.onNext(interfaceC0000aPoll);
                                j2++;
                            } else {
                                return;
                            }
                        } else {
                            break;
                        }
                    }
                    z = true;
                    if (j2 != 0 && !this.f67808m) {
                        if (j != Long.MAX_VALUE) {
                            this.f67800H.addAndGet(-j2);
                        }
                        c10392a.request(j2);
                    }
                    if (z) {
                        continue;
                    }
                }
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }

        @Override // p000.fdg
        public void cancel() {
            if (this.f67808m) {
                return;
            }
            this.f67808m = true;
            this.f67798C.cancel();
            m18726a();
        }

        @Override // p000.ycg
        public void onComplete() {
            if (this.f67806e) {
                return;
            }
            this.f67806e = true;
            m18727b();
        }

        @Override // p000.ycg
        public void onError(Throwable th) {
            if (this.f67806e || !this.f67807f.addThrowable(th)) {
                pfe.onError(th);
                return;
            }
            if (!this.f67805d) {
                m18726a();
            }
            this.f67806e = true;
            m18727b();
        }

        @Override // p000.ycg
        public void onNext(T t) {
            C10392a<T, R> c10392a;
            if (this.f67806e) {
                return;
            }
            long j = this.f67801L + 1;
            this.f67801L = j;
            C10392a<T, R> c10392a2 = this.f67799F.get();
            if (c10392a2 != null) {
                c10392a2.cancel();
            }
            try {
                zjd zjdVar = (zjd) xjb.requireNonNull(this.f67803b.apply(t), "The publisher returned is null");
                C10392a c10392a3 = new C10392a(this, j, this.f67804c);
                do {
                    c10392a = this.f67799F.get();
                    if (c10392a == f67797M) {
                        return;
                    }
                } while (!v7b.m23844a(this.f67799F, c10392a, c10392a3));
                zjdVar.subscribe(c10392a3);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f67798C.cancel();
                onError(th);
            }
        }

        @Override // p000.lj6, p000.ycg
        public void onSubscribe(fdg fdgVar) {
            if (mdg.validate(this.f67798C, fdgVar)) {
                this.f67798C = fdgVar;
                this.f67802a.onSubscribe(this);
            }
        }

        @Override // p000.fdg
        public void request(long j) {
            if (mdg.validate(j)) {
                so0.add(this.f67800H, j);
                if (this.f67801L == 0) {
                    this.f67798C.request(Long.MAX_VALUE);
                } else {
                    m18727b();
                }
            }
        }
    }

    public oj6(m86<T> m86Var, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, boolean z) {
        super(m86Var);
        this.f67788c = py6Var;
        this.f67789d = i;
        this.f67790e = z;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        if (ei6.tryScalarXMapSubscribe(this.f52360b, ycgVar, this.f67788c)) {
            return;
        }
        this.f52360b.subscribe((lj6) new C10393b(ycgVar, this.f67788c, this.f67789d, this.f67790e));
    }
}
