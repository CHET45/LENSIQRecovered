package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class xb6<T> extends AbstractC7714j1<T, T> {

    /* JADX INFO: renamed from: c */
    public final uu2<? super T> f97417c;

    /* JADX INFO: renamed from: d */
    public final uu2<? super Throwable> f97418d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC7776j8 f97419e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7776j8 f97420f;

    /* JADX INFO: renamed from: xb6$a */
    public static final class C15022a<T> extends jv0<T, T> {

        /* JADX INFO: renamed from: C */
        public final InterfaceC7776j8 f97421C;

        /* JADX INFO: renamed from: F */
        public final InterfaceC7776j8 f97422F;

        /* JADX INFO: renamed from: f */
        public final uu2<? super T> f97423f;

        /* JADX INFO: renamed from: m */
        public final uu2<? super Throwable> f97424m;

        public C15022a(bq2<? super T> actual, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
            super(actual);
            this.f97423f = onNext;
            this.f97424m = onError;
            this.f97421C = onComplete;
            this.f97422F = onAfterTerminate;
        }

        @Override // p000.jv0, p000.ycg
        public void onComplete() {
            if (this.f51991d) {
                return;
            }
            try {
                this.f97421C.run();
                this.f51991d = true;
                this.f51988a.onComplete();
                try {
                    this.f97422F.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            } catch (Throwable th2) {
                m14343c(th2);
            }
        }

        @Override // p000.jv0, p000.ycg
        public void onError(Throwable t) {
            if (this.f51991d) {
                ofe.onError(t);
                return;
            }
            this.f51991d = true;
            try {
                this.f97424m.accept(t);
                this.f51988a.onError(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f51988a.onError(new qm2(t, th));
            }
            try {
                this.f97422F.run();
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f51991d) {
                return;
            }
            if (this.f51992e != 0) {
                this.f51988a.onNext(null);
                return;
            }
            try {
                this.f97423f.accept(t);
                this.f51988a.onNext((Object) t);
            } catch (Throwable th) {
                m14343c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Exception {
            qm2 qm2Var;
            try {
                T tPoll = this.f51990c.poll();
                if (tPoll != null) {
                    try {
                        this.f97423f.accept(tPoll);
                        this.f97422F.run();
                    } catch (Throwable th) {
                        try {
                            o75.throwIfFatal(th);
                            try {
                                this.f97424m.accept(th);
                                throw k75.throwIfThrowable(th);
                            } finally {
                            }
                        } catch (Throwable th2) {
                            this.f97422F.run();
                            throw th2;
                        }
                    }
                } else if (this.f51992e == 1) {
                    this.f97421C.run();
                    this.f97422F.run();
                }
                return tPoll;
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                try {
                    this.f97424m.accept(th3);
                    throw k75.throwIfThrowable(th3);
                } finally {
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m14344d(mode);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.bq2
        public boolean tryOnNext(T t) {
            if (this.f51991d) {
                return false;
            }
            try {
                this.f97423f.accept(t);
                return this.f51988a.tryOnNext((Object) t);
            } catch (Throwable th) {
                m14343c(th);
                return false;
            }
        }
    }

    /* JADX INFO: renamed from: xb6$b */
    public static final class C15023b<T> extends nv0<T, T> {

        /* JADX INFO: renamed from: C */
        public final InterfaceC7776j8 f97425C;

        /* JADX INFO: renamed from: F */
        public final InterfaceC7776j8 f97426F;

        /* JADX INFO: renamed from: f */
        public final uu2<? super T> f97427f;

        /* JADX INFO: renamed from: m */
        public final uu2<? super Throwable> f97428m;

        public C15023b(ycg<? super T> actual, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
            super(actual);
            this.f97427f = onNext;
            this.f97428m = onError;
            this.f97425C = onComplete;
            this.f97426F = onAfterTerminate;
        }

        @Override // p000.nv0, p000.ycg
        public void onComplete() {
            if (this.f65774d) {
                return;
            }
            try {
                this.f97425C.run();
                this.f65774d = true;
                this.f65771a.onComplete();
                try {
                    this.f97426F.run();
                } catch (Throwable th) {
                    o75.throwIfFatal(th);
                    ofe.onError(th);
                }
            } catch (Throwable th2) {
                m18144c(th2);
            }
        }

        @Override // p000.nv0, p000.ycg
        public void onError(Throwable t) {
            if (this.f65774d) {
                ofe.onError(t);
                return;
            }
            this.f65774d = true;
            try {
                this.f97428m.accept(t);
                this.f65771a.onError(t);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f65771a.onError(new qm2(t, th));
            }
            try {
                this.f97426F.run();
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(th2);
            }
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // p000.ycg
        public void onNext(T t) {
            if (this.f65774d) {
                return;
            }
            if (this.f65775e != 0) {
                this.f65771a.onNext(null);
                return;
            }
            try {
                this.f97427f.accept(t);
                this.f65771a.onNext((Object) t);
            } catch (Throwable th) {
                m18144c(th);
            }
        }

        @Override // p000.zif
        @dib
        public T poll() throws Exception {
            qm2 qm2Var;
            try {
                T tPoll = this.f65773c.poll();
                if (tPoll != null) {
                    try {
                        this.f97427f.accept(tPoll);
                        this.f97426F.run();
                    } catch (Throwable th) {
                        try {
                            o75.throwIfFatal(th);
                            try {
                                this.f97428m.accept(th);
                                throw k75.throwIfThrowable(th);
                            } finally {
                            }
                        } catch (Throwable th2) {
                            this.f97426F.run();
                            throw th2;
                        }
                    }
                } else if (this.f65775e == 1) {
                    this.f97425C.run();
                    this.f97426F.run();
                }
                return tPoll;
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                try {
                    this.f97428m.accept(th3);
                    throw k75.throwIfThrowable(th3);
                } finally {
                }
            }
        }

        @Override // p000.vnd
        public int requestFusion(int mode) {
            return m18145d(mode);
        }
    }

    public xb6(l86<T> source, uu2<? super T> onNext, uu2<? super Throwable> onError, InterfaceC7776j8 onComplete, InterfaceC7776j8 onAfterTerminate) {
        super(source);
        this.f97417c = onNext;
        this.f97418d = onError;
        this.f97419e = onComplete;
        this.f97420f = onAfterTerminate;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        if (s instanceof bq2) {
            this.f49321b.subscribe((kj6) new C15022a((bq2) s, this.f97417c, this.f97418d, this.f97419e, this.f97420f));
        } else {
            this.f49321b.subscribe((kj6) new C15023b(s, this.f97417c, this.f97418d, this.f97419e, this.f97420f));
        }
    }
}
