package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class m1f<T> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: m */
    public static final int f59645m = 4;

    /* JADX INFO: renamed from: a */
    public final pxb<? super T> f59646a;

    /* JADX INFO: renamed from: b */
    public final boolean f59647b;

    /* JADX INFO: renamed from: c */
    public lf4 f59648c;

    /* JADX INFO: renamed from: d */
    public boolean f59649d;

    /* JADX INFO: renamed from: e */
    public h40<Object> f59650e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f59651f;

    public m1f(@cfb pxb<? super T> downstream) {
        this(downstream, false);
    }

    /* JADX INFO: renamed from: a */
    public void m16547a() {
        h40<Object> h40Var;
        do {
            synchronized (this) {
                try {
                    h40Var = this.f59650e;
                    if (h40Var == null) {
                        this.f59649d = false;
                        return;
                    }
                    this.f59650e = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!h40Var.accept(this.f59646a));
    }

    @Override // p000.lf4
    public void dispose() {
        this.f59651f = true;
        this.f59648c.dispose();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f59648c.isDisposed();
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f59651f) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f59651f) {
                    return;
                }
                if (!this.f59649d) {
                    this.f59651f = true;
                    this.f59649d = true;
                    this.f59646a.onComplete();
                } else {
                    h40<Object> h40Var = this.f59650e;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f59650e = h40Var;
                    }
                    h40Var.add(fhb.complete());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onError(@cfb Throwable t) {
        if (this.f59651f) {
            ofe.onError(t);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f59651f) {
                    if (this.f59649d) {
                        this.f59651f = true;
                        h40<Object> h40Var = this.f59650e;
                        if (h40Var == null) {
                            h40Var = new h40<>(4);
                            this.f59650e = h40Var;
                        }
                        Object objError = fhb.error(t);
                        if (this.f59647b) {
                            h40Var.add(objError);
                        } else {
                            h40Var.setFirst(objError);
                        }
                        return;
                    }
                    this.f59651f = true;
                    this.f59649d = true;
                    z = false;
                }
                if (z) {
                    ofe.onError(t);
                } else {
                    this.f59646a.onError(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onNext(@cfb T t) {
        if (this.f59651f) {
            return;
        }
        if (t == null) {
            this.f59648c.dispose();
            onError(k75.createNullPointerException("onNext called with a null value."));
            return;
        }
        synchronized (this) {
            try {
                if (this.f59651f) {
                    return;
                }
                if (!this.f59649d) {
                    this.f59649d = true;
                    this.f59646a.onNext(t);
                    m16547a();
                } else {
                    h40<Object> h40Var = this.f59650e;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f59650e = h40Var;
                    }
                    h40Var.add(fhb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onSubscribe(@cfb lf4 d) {
        if (zf4.validate(this.f59648c, d)) {
            this.f59648c = d;
            this.f59646a.onSubscribe(this);
        }
    }

    public m1f(@cfb pxb<? super T> actual, boolean delayError) {
        this.f59646a = actual;
        this.f59647b = delayError;
    }
}
