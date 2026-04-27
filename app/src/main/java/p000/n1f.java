package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class n1f<T> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: m */
    public static final int f63015m = 4;

    /* JADX INFO: renamed from: a */
    public final oxb<? super T> f63016a;

    /* JADX INFO: renamed from: b */
    public final boolean f63017b;

    /* JADX INFO: renamed from: c */
    public mf4 f63018c;

    /* JADX INFO: renamed from: d */
    public boolean f63019d;

    /* JADX INFO: renamed from: e */
    public g40<Object> f63020e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f63021f;

    public n1f(@bfb oxb<? super T> oxbVar) {
        this(oxbVar, false);
    }

    /* JADX INFO: renamed from: a */
    public void m17722a() {
        g40<Object> g40Var;
        do {
            synchronized (this) {
                try {
                    g40Var = this.f63020e;
                    if (g40Var == null) {
                        this.f63019d = false;
                        return;
                    }
                    this.f63020e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!g40Var.accept(this.f63016a));
    }

    @Override // p000.mf4
    public void dispose() {
        this.f63018c.dispose();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f63018c.isDisposed();
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f63021f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f63021f) {
                    return;
                }
                if (!this.f63019d) {
                    this.f63021f = true;
                    this.f63019d = true;
                    this.f63016a.onComplete();
                } else {
                    g40<Object> g40Var = this.f63020e;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f63020e = g40Var;
                    }
                    g40Var.add(ehb.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.oxb
    public void onError(@bfb Throwable th) {
        if (this.f63021f) {
            pfe.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f63021f) {
                    if (this.f63019d) {
                        this.f63021f = true;
                        g40<Object> g40Var = this.f63020e;
                        if (g40Var == null) {
                            g40Var = new g40<>(4);
                            this.f63020e = g40Var;
                        }
                        Object objError = ehb.error(th);
                        if (this.f63017b) {
                            g40Var.add(objError);
                        } else {
                            g40Var.setFirst(objError);
                        }
                        return;
                    }
                    this.f63021f = true;
                    this.f63019d = true;
                    z = false;
                }
                if (z) {
                    pfe.onError(th);
                } else {
                    this.f63016a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.oxb
    public void onNext(@bfb T t) {
        if (this.f63021f) {
            return;
        }
        if (t == null) {
            this.f63018c.dispose();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f63021f) {
                    return;
                }
                if (!this.f63019d) {
                    this.f63019d = true;
                    this.f63016a.onNext(t);
                    m17722a();
                } else {
                    g40<Object> g40Var = this.f63020e;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f63020e = g40Var;
                    }
                    g40Var.add(ehb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.oxb
    public void onSubscribe(@bfb mf4 mf4Var) {
        if (ag4.validate(this.f63018c, mf4Var)) {
            this.f63018c = mf4Var;
            this.f63016a.onSubscribe(this);
        }
    }

    public n1f(@bfb oxb<? super T> oxbVar, boolean z) {
        this.f63016a = oxbVar;
        this.f63017b = z;
    }
}
