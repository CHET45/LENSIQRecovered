package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class t1f<T> implements lj6<T>, fdg {

    /* JADX INFO: renamed from: m */
    public static final int f83377m = 4;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f83378a;

    /* JADX INFO: renamed from: b */
    public final boolean f83379b;

    /* JADX INFO: renamed from: c */
    public fdg f83380c;

    /* JADX INFO: renamed from: d */
    public boolean f83381d;

    /* JADX INFO: renamed from: e */
    public g40<Object> f83382e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f83383f;

    public t1f(ycg<? super T> ycgVar) {
        this(ycgVar, false);
    }

    /* JADX INFO: renamed from: a */
    public void m22324a() {
        g40<Object> g40Var;
        do {
            synchronized (this) {
                try {
                    g40Var = this.f83382e;
                    if (g40Var == null) {
                        this.f83381d = false;
                        return;
                    }
                    this.f83382e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!g40Var.accept(this.f83378a));
    }

    @Override // p000.fdg
    public void cancel() {
        this.f83380c.cancel();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f83383f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f83383f) {
                    return;
                }
                if (!this.f83381d) {
                    this.f83383f = true;
                    this.f83381d = true;
                    this.f83378a.onComplete();
                } else {
                    g40<Object> g40Var = this.f83382e;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f83382e = g40Var;
                    }
                    g40Var.add(ehb.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f83383f) {
            pfe.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f83383f) {
                    if (this.f83381d) {
                        this.f83383f = true;
                        g40<Object> g40Var = this.f83382e;
                        if (g40Var == null) {
                            g40Var = new g40<>(4);
                            this.f83382e = g40Var;
                        }
                        Object objError = ehb.error(th);
                        if (this.f83379b) {
                            g40Var.add(objError);
                        } else {
                            g40Var.setFirst(objError);
                        }
                        return;
                    }
                    this.f83383f = true;
                    this.f83381d = true;
                    z = false;
                }
                if (z) {
                    pfe.onError(th);
                } else {
                    this.f83378a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f83383f) {
            return;
        }
        if (t == null) {
            this.f83380c.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f83383f) {
                    return;
                }
                if (!this.f83381d) {
                    this.f83381d = true;
                    this.f83378a.onNext(t);
                    m22324a();
                } else {
                    g40<Object> g40Var = this.f83382e;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f83382e = g40Var;
                    }
                    g40Var.add(ehb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f83380c, fdgVar)) {
            this.f83380c = fdgVar;
            this.f83378a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        this.f83380c.request(j);
    }

    public t1f(ycg<? super T> ycgVar, boolean z) {
        this.f83378a = ycgVar;
        this.f83379b = z;
    }
}
