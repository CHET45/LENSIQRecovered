package p000;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
public final class fmb<T, U> extends AbstractC10162o3<T, U> {

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends xub<? extends U>> f37107b;

    /* JADX INFO: renamed from: c */
    public final int f37108c;

    /* JADX INFO: renamed from: d */
    public final f55 f37109d;

    /* JADX INFO: renamed from: fmb$a */
    public static final class C5889a<T, R> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = -6951100001833242599L;

        /* JADX INFO: renamed from: C */
        public mf4 f37110C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f37111F;

        /* JADX INFO: renamed from: H */
        public volatile boolean f37112H;

        /* JADX INFO: renamed from: L */
        public volatile boolean f37113L;

        /* JADX INFO: renamed from: M */
        public int f37114M;

        /* JADX INFO: renamed from: a */
        public final oxb<? super R> f37115a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends R>> f37116b;

        /* JADX INFO: renamed from: c */
        public final int f37117c;

        /* JADX INFO: renamed from: d */
        public final cc0 f37118d = new cc0();

        /* JADX INFO: renamed from: e */
        public final a<R> f37119e;

        /* JADX INFO: renamed from: f */
        public final boolean f37120f;

        /* JADX INFO: renamed from: m */
        public ajf<T> f37121m;

        /* JADX INFO: renamed from: fmb$a$a */
        public static final class a<R> extends AtomicReference<mf4> implements oxb<R> {
            private static final long serialVersionUID = 2620149119579502636L;

            /* JADX INFO: renamed from: a */
            public final oxb<? super R> f37122a;

            /* JADX INFO: renamed from: b */
            public final C5889a<?, R> f37123b;

            public a(oxb<? super R> oxbVar, C5889a<?, R> c5889a) {
                this.f37122a = oxbVar;
                this.f37123b = c5889a;
            }

            /* JADX INFO: renamed from: a */
            public void m10989a() {
                ag4.dispose(this);
            }

            @Override // p000.oxb
            public void onComplete() {
                C5889a<?, R> c5889a = this.f37123b;
                c5889a.f37111F = false;
                c5889a.m10988a();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                C5889a<?, R> c5889a = this.f37123b;
                if (!c5889a.f37118d.addThrowable(th)) {
                    pfe.onError(th);
                    return;
                }
                if (!c5889a.f37120f) {
                    c5889a.f37110C.dispose();
                }
                c5889a.f37111F = false;
                c5889a.m10988a();
            }

            @Override // p000.oxb
            public void onNext(R r) {
                this.f37122a.onNext(r);
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }
        }

        public C5889a(oxb<? super R> oxbVar, py6<? super T, ? extends xub<? extends R>> py6Var, int i, boolean z) {
            this.f37115a = oxbVar;
            this.f37116b = py6Var;
            this.f37117c = i;
            this.f37120f = z;
            this.f37119e = new a<>(oxbVar, this);
        }

        /* JADX INFO: renamed from: a */
        public void m10988a() {
            if (getAndIncrement() != 0) {
                return;
            }
            oxb<? super R> oxbVar = this.f37115a;
            ajf<T> ajfVar = this.f37121m;
            cc0 cc0Var = this.f37118d;
            while (true) {
                if (!this.f37111F) {
                    if (this.f37113L) {
                        ajfVar.clear();
                        return;
                    }
                    if (!this.f37120f && cc0Var.get() != null) {
                        ajfVar.clear();
                        this.f37113L = true;
                        oxbVar.onError(cc0Var.terminate());
                        return;
                    }
                    boolean z = this.f37112H;
                    try {
                        T tPoll = ajfVar.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f37113L = true;
                            Throwable thTerminate = cc0Var.terminate();
                            if (thTerminate != null) {
                                oxbVar.onError(thTerminate);
                                return;
                            } else {
                                oxbVar.onComplete();
                                return;
                            }
                        }
                        if (!z2) {
                            try {
                                xub xubVar = (xub) xjb.requireNonNull(this.f37116b.apply(tPoll), "The mapper returned a null ObservableSource");
                                if (xubVar instanceof Callable) {
                                    try {
                                        InterfaceC0000a interfaceC0000a = (Object) ((Callable) xubVar).call();
                                        if (interfaceC0000a != null && !this.f37113L) {
                                            oxbVar.onNext(interfaceC0000a);
                                        }
                                    } catch (Throwable th) {
                                        n75.throwIfFatal(th);
                                        cc0Var.addThrowable(th);
                                    }
                                } else {
                                    this.f37111F = true;
                                    xubVar.subscribe(this.f37119e);
                                }
                            } catch (Throwable th2) {
                                n75.throwIfFatal(th2);
                                this.f37113L = true;
                                this.f37110C.dispose();
                                ajfVar.clear();
                                cc0Var.addThrowable(th2);
                                oxbVar.onError(cc0Var.terminate());
                                return;
                            }
                        }
                    } catch (Throwable th3) {
                        n75.throwIfFatal(th3);
                        this.f37113L = true;
                        this.f37110C.dispose();
                        cc0Var.addThrowable(th3);
                        oxbVar.onError(cc0Var.terminate());
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }

        @Override // p000.mf4
        public void dispose() {
            this.f37113L = true;
            this.f37110C.dispose();
            this.f37119e.m10989a();
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f37113L;
        }

        @Override // p000.oxb
        public void onComplete() {
            this.f37112H = true;
            m10988a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (!this.f37118d.addThrowable(th)) {
                pfe.onError(th);
            } else {
                this.f37112H = true;
                m10988a();
            }
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f37114M == 0) {
                this.f37121m.offer(t);
            }
            m10988a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f37110C, mf4Var)) {
                this.f37110C = mf4Var;
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f37114M = iRequestFusion;
                        this.f37121m = umdVar;
                        this.f37112H = true;
                        this.f37115a.onSubscribe(this);
                        m10988a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f37114M = iRequestFusion;
                        this.f37121m = umdVar;
                        this.f37115a.onSubscribe(this);
                        return;
                    }
                }
                this.f37121m = new rzf(this.f37117c);
                this.f37115a.onSubscribe(this);
            }
        }
    }

    /* JADX INFO: renamed from: fmb$b */
    public static final class C5890b<T, U> extends AtomicInteger implements oxb<T>, mf4 {
        private static final long serialVersionUID = 8828587559905699186L;

        /* JADX INFO: renamed from: C */
        public volatile boolean f37124C;

        /* JADX INFO: renamed from: F */
        public volatile boolean f37125F;

        /* JADX INFO: renamed from: H */
        public int f37126H;

        /* JADX INFO: renamed from: a */
        public final oxb<? super U> f37127a;

        /* JADX INFO: renamed from: b */
        public final py6<? super T, ? extends xub<? extends U>> f37128b;

        /* JADX INFO: renamed from: c */
        public final a<U> f37129c;

        /* JADX INFO: renamed from: d */
        public final int f37130d;

        /* JADX INFO: renamed from: e */
        public ajf<T> f37131e;

        /* JADX INFO: renamed from: f */
        public mf4 f37132f;

        /* JADX INFO: renamed from: m */
        public volatile boolean f37133m;

        /* JADX INFO: renamed from: fmb$b$a */
        public static final class a<U> extends AtomicReference<mf4> implements oxb<U> {
            private static final long serialVersionUID = -7449079488798789337L;

            /* JADX INFO: renamed from: a */
            public final oxb<? super U> f37134a;

            /* JADX INFO: renamed from: b */
            public final C5890b<?, ?> f37135b;

            public a(oxb<? super U> oxbVar, C5890b<?, ?> c5890b) {
                this.f37134a = oxbVar;
                this.f37135b = c5890b;
            }

            /* JADX INFO: renamed from: a */
            public void m10992a() {
                ag4.dispose(this);
            }

            @Override // p000.oxb
            public void onComplete() {
                this.f37135b.m10991b();
            }

            @Override // p000.oxb
            public void onError(Throwable th) {
                this.f37135b.dispose();
                this.f37134a.onError(th);
            }

            @Override // p000.oxb
            public void onNext(U u) {
                this.f37134a.onNext(u);
            }

            @Override // p000.oxb
            public void onSubscribe(mf4 mf4Var) {
                ag4.replace(this, mf4Var);
            }
        }

        public C5890b(oxb<? super U> oxbVar, py6<? super T, ? extends xub<? extends U>> py6Var, int i) {
            this.f37127a = oxbVar;
            this.f37128b = py6Var;
            this.f37130d = i;
            this.f37129c = new a<>(oxbVar, this);
        }

        /* JADX INFO: renamed from: a */
        public void m10990a() {
            if (getAndIncrement() != 0) {
                return;
            }
            while (!this.f37124C) {
                if (!this.f37133m) {
                    boolean z = this.f37125F;
                    try {
                        T tPoll = this.f37131e.poll();
                        boolean z2 = tPoll == null;
                        if (z && z2) {
                            this.f37124C = true;
                            this.f37127a.onComplete();
                            return;
                        } else if (!z2) {
                            try {
                                xub xubVar = (xub) xjb.requireNonNull(this.f37128b.apply(tPoll), "The mapper returned a null ObservableSource");
                                this.f37133m = true;
                                xubVar.subscribe(this.f37129c);
                            } catch (Throwable th) {
                                n75.throwIfFatal(th);
                                dispose();
                                this.f37131e.clear();
                                this.f37127a.onError(th);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        n75.throwIfFatal(th2);
                        dispose();
                        this.f37131e.clear();
                        this.f37127a.onError(th2);
                        return;
                    }
                }
                if (decrementAndGet() == 0) {
                    return;
                }
            }
            this.f37131e.clear();
        }

        /* JADX INFO: renamed from: b */
        public void m10991b() {
            this.f37133m = false;
            m10990a();
        }

        @Override // p000.mf4
        public void dispose() {
            this.f37124C = true;
            this.f37129c.m10992a();
            this.f37132f.dispose();
            if (getAndIncrement() == 0) {
                this.f37131e.clear();
            }
        }

        @Override // p000.mf4
        public boolean isDisposed() {
            return this.f37124C;
        }

        @Override // p000.oxb
        public void onComplete() {
            if (this.f37125F) {
                return;
            }
            this.f37125F = true;
            m10990a();
        }

        @Override // p000.oxb
        public void onError(Throwable th) {
            if (this.f37125F) {
                pfe.onError(th);
                return;
            }
            this.f37125F = true;
            dispose();
            this.f37127a.onError(th);
        }

        @Override // p000.oxb
        public void onNext(T t) {
            if (this.f37125F) {
                return;
            }
            if (this.f37126H == 0) {
                this.f37131e.offer(t);
            }
            m10990a();
        }

        @Override // p000.oxb
        public void onSubscribe(mf4 mf4Var) {
            if (ag4.validate(this.f37132f, mf4Var)) {
                this.f37132f = mf4Var;
                if (mf4Var instanceof umd) {
                    umd umdVar = (umd) mf4Var;
                    int iRequestFusion = umdVar.requestFusion(3);
                    if (iRequestFusion == 1) {
                        this.f37126H = iRequestFusion;
                        this.f37131e = umdVar;
                        this.f37125F = true;
                        this.f37127a.onSubscribe(this);
                        m10990a();
                        return;
                    }
                    if (iRequestFusion == 2) {
                        this.f37126H = iRequestFusion;
                        this.f37131e = umdVar;
                        this.f37127a.onSubscribe(this);
                        return;
                    }
                }
                this.f37131e = new rzf(this.f37130d);
                this.f37127a.onSubscribe(this);
            }
        }
    }

    public fmb(xub<T> xubVar, py6<? super T, ? extends xub<? extends U>> py6Var, int i, f55 f55Var) {
        super(xubVar);
        this.f37107b = py6Var;
        this.f37109d = f55Var;
        this.f37108c = Math.max(8, i);
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super U> oxbVar) {
        if (utb.tryScalarXMapSubscribe(this.f66354a, oxbVar, this.f37107b)) {
            return;
        }
        if (this.f37109d == f55.IMMEDIATE) {
            this.f66354a.subscribe(new C5890b(new n1f(oxbVar), this.f37107b, this.f37108c));
        } else {
            this.f66354a.subscribe(new C5889a(oxbVar, this.f37107b, this.f37108c, this.f37109d == f55.END));
        }
    }
}
