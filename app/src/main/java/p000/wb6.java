package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wb6<T> extends AbstractC8162k1<T, T> {

    /* JADX INFO: renamed from: c */
    public final tu2<? super T> f93877c;

    /* JADX INFO: renamed from: d */
    public final tu2<? super Throwable> f93878d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7178i8 f93879e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7178i8 f93880f;

    /* JADX INFO: renamed from: wb6$a */
    public static final class C14543a<T> extends kv0<T, T> {

        /* JADX INFO: renamed from: C */
        public final InterfaceC7178i8 f93881C;

        /* JADX INFO: renamed from: F */
        public final InterfaceC7178i8 f93882F;

        /* JADX INFO: renamed from: f */
        public final tu2<? super T> f93883f;

        /* JADX INFO: renamed from: m */
        public final tu2<? super Throwable> f93884m;

        public C14543a(cq2<? super T> cq2Var, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
            super(cq2Var);
            this.f93883f = tu2Var;
            this.f93884m = tu2Var2;
            this.f93881C = interfaceC7178i8;
            this.f93882F = interfaceC7178i82;
        }

        @Override // p000.kv0, p000.ycg
        public void onComplete() {
            if (this.f55429d) {
                return;
            }
            try {
                this.f93881C.run();
                this.f55429d = true;
                this.f55426a.onComplete();
                try {
                    this.f93882F.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            } catch (Throwable th2) {
                m15012c(th2);
            }
        }

        @Override // p000.kv0, p000.ycg
        public void onError(Throwable th) {
            if (this.f55429d) {
                pfe.onError(th);
                return;
            }
            this.f55429d = true;
            try {
                this.f93884m.accept(th);
                this.f55426a.onError(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f55426a.onError(new pm2(th, th2));
            }
            try {
                this.f93882F.run();
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f55429d) {
                return;
            }
            if (this.f55430e != 0) {
                this.f55426a.onNext(null);
                return;
            }
            try {
                this.f93883f.accept(t);
                this.f55426a.onNext((Object) t);
            } catch (Throwable th) {
                m15012c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            pm2 pm2Var;
            try {
                T tPoll = this.f55428c.poll();
                if (tPoll != null) {
                    try {
                        this.f93883f.accept(tPoll);
                        this.f93882F.run();
                    } catch (Throwable th) {
                        try {
                            n75.throwIfFatal(th);
                            try {
                                this.f93884m.accept(th);
                                throw j75.throwIfThrowable(th);
                            } finally {
                            }
                        } catch (Throwable th2) {
                            this.f93882F.run();
                            throw th2;
                        }
                    }
                } else if (this.f55430e == 1) {
                    this.f93881C.run();
                    this.f93882F.run();
                }
                return tPoll;
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                try {
                    this.f93884m.accept(th3);
                    throw j75.throwIfThrowable(th3);
                } finally {
                }
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m15013d(i);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.cq2
        public boolean tryOnNext(T t) {
            if (this.f55429d) {
                return false;
            }
            try {
                this.f93883f.accept(t);
                return this.f55426a.tryOnNext((Object) t);
            } catch (Throwable th) {
                m15012c(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: wb6$b */
    public static final class C14544b<T> extends ov0<T, T> {

        /* JADX INFO: renamed from: C */
        public final InterfaceC7178i8 f93885C;

        /* JADX INFO: renamed from: F */
        public final InterfaceC7178i8 f93886F;

        /* JADX INFO: renamed from: f */
        public final tu2<? super T> f93887f;

        /* JADX INFO: renamed from: m */
        public final tu2<? super Throwable> f93888m;

        public C14544b(ycg<? super T> ycgVar, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
            super(ycgVar);
            this.f93887f = tu2Var;
            this.f93888m = tu2Var2;
            this.f93885C = interfaceC7178i8;
            this.f93886F = interfaceC7178i82;
        }

        @Override // p000.ov0, p000.ycg
        public void onComplete() {
            if (this.f68848d) {
                return;
            }
            try {
                this.f93885C.run();
                this.f68848d = true;
                this.f68845a.onComplete();
                try {
                    this.f93886F.run();
                } catch (Throwable th) {
                    n75.throwIfFatal(th);
                    pfe.onError(th);
                }
            } catch (Throwable th2) {
                m19035c(th2);
            }
        }

        @Override // p000.ov0, p000.ycg
        public void onError(Throwable th) {
            if (this.f68848d) {
                pfe.onError(th);
                return;
            }
            this.f68848d = true;
            try {
                this.f93888m.accept(th);
                this.f68845a.onError(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                this.f68845a.onError(new pm2(th, th2));
            }
            try {
                this.f93886F.run();
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(th3);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f68848d) {
                return;
            }
            if (this.f68849e != 0) {
                this.f68845a.onNext(null);
                return;
            }
            try {
                this.f93887f.accept(t);
                this.f68845a.onNext((Object) t);
            } catch (Throwable th) {
                m19035c(th);
            }
        }

        @Override // p000.ajf
        @cib
        public T poll() throws Exception {
            pm2 pm2Var;
            try {
                T tPoll = this.f68847c.poll();
                if (tPoll != null) {
                    try {
                        this.f93887f.accept(tPoll);
                        this.f93886F.run();
                    } catch (Throwable th) {
                        try {
                            n75.throwIfFatal(th);
                            try {
                                this.f93888m.accept(th);
                                throw j75.throwIfThrowable(th);
                            } finally {
                            }
                        } catch (Throwable th2) {
                            this.f93886F.run();
                            throw th2;
                        }
                    }
                } else if (this.f68849e == 1) {
                    this.f93885C.run();
                    this.f93886F.run();
                }
                return tPoll;
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                try {
                    this.f93888m.accept(th3);
                    throw j75.throwIfThrowable(th3);
                } finally {
                }
            }
        }

        @Override // p000.wnd
        public int requestFusion(int i) {
            return m19036d(i);
        }
    }

    public wb6(m86<T> m86Var, tu2<? super T> tu2Var, tu2<? super Throwable> tu2Var2, InterfaceC7178i8 interfaceC7178i8, InterfaceC7178i8 interfaceC7178i82) {
        super(m86Var);
        this.f93877c = tu2Var;
        this.f93878d = tu2Var2;
        this.f93879e = interfaceC7178i8;
        this.f93880f = interfaceC7178i82;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        if (ycgVar instanceof cq2) {
            this.f52360b.subscribe((lj6) new C14543a((cq2) ycgVar, this.f93877c, this.f93878d, this.f93879e, this.f93880f));
        } else {
            this.f52360b.subscribe((lj6) new C14544b(ycgVar, this.f93877c, this.f93878d, this.f93879e, this.f93880f));
        }
    }
}
