package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class u1f<T> implements kj6<T>, fdg {

    /* JADX INFO: renamed from: m */
    public static final int f86565m = 4;

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f86566a;

    /* JADX INFO: renamed from: b */
    public final boolean f86567b;

    /* JADX INFO: renamed from: c */
    public fdg f86568c;

    /* JADX INFO: renamed from: d */
    public boolean f86569d;

    /* JADX INFO: renamed from: e */
    public h40<Object> f86570e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f86571f;

    public u1f(ycg<? super T> downstream) {
        this(downstream, false);
    }

    /* JADX INFO: renamed from: a */
    public void m23002a() {
        h40<Object> h40Var;
        do {
            synchronized (this) {
                try {
                    h40Var = this.f86570e;
                    if (h40Var == null) {
                        this.f86569d = false;
                        return;
                    }
                    this.f86570e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!h40Var.accept(this.f86566a));
    }

    @Override // p000.fdg
    public void cancel() {
        this.f86568c.cancel();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f86571f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f86571f) {
                    return;
                }
                if (!this.f86569d) {
                    this.f86571f = true;
                    this.f86569d = true;
                    this.f86566a.onComplete();
                } else {
                    h40<Object> h40Var = this.f86570e;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f86570e = h40Var;
                    }
                    h40Var.add(fhb.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f86571f) {
            ofe.onError(t);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f86571f) {
                    if (this.f86569d) {
                        this.f86571f = true;
                        h40<Object> h40Var = this.f86570e;
                        if (h40Var == null) {
                            h40Var = new h40<>(4);
                            this.f86570e = h40Var;
                        }
                        Object objError = fhb.error(t);
                        if (this.f86567b) {
                            h40Var.add(objError);
                        } else {
                            h40Var.setFirst(objError);
                        }
                        return;
                    }
                    this.f86571f = true;
                    this.f86569d = true;
                    z = false;
                }
                if (z) {
                    ofe.onError(t);
                } else {
                    this.f86566a.onError(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        if (this.f86571f) {
            return;
        }
        if (t == null) {
            this.f86568c.cancel();
            onError(k75.createNullPointerException("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f86571f) {
                    return;
                }
                if (!this.f86569d) {
                    this.f86569d = true;
                    this.f86566a.onNext(t);
                    m23002a();
                } else {
                    h40<Object> h40Var = this.f86570e;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f86570e = h40Var;
                    }
                    h40Var.add(fhb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (ldg.validate(this.f86568c, s)) {
            this.f86568c = s;
            this.f86566a.onSubscribe(this);
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        this.f86568c.request(n);
    }

    public u1f(@cfb ycg<? super T> actual, boolean delayError) {
        this.f86566a = actual;
        this.f86567b = delayError;
    }
}
