package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class o1f<T> extends qg6<T> {

    /* JADX INFO: renamed from: b */
    public final qg6<T> f66248b;

    /* JADX INFO: renamed from: c */
    public boolean f66249c;

    /* JADX INFO: renamed from: d */
    public h40<Object> f66250d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f66251e;

    public o1f(final qg6<T> actual) {
        this.f66248b = actual;
    }

    /* JADX INFO: renamed from: b */
    public void m18257b() {
        h40<Object> h40Var;
        while (true) {
            synchronized (this) {
                try {
                    h40Var = this.f66250d;
                    if (h40Var == null) {
                        this.f66249c = false;
                        return;
                    }
                    this.f66250d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h40Var.accept(this.f66248b);
        }
    }

    @Override // p000.qg6
    @dib
    public Throwable getThrowable() {
        return this.f66248b.getThrowable();
    }

    @Override // p000.qg6
    public boolean hasComplete() {
        return this.f66248b.hasComplete();
    }

    @Override // p000.qg6
    public boolean hasSubscribers() {
        return this.f66248b.hasSubscribers();
    }

    @Override // p000.qg6
    public boolean hasThrowable() {
        return this.f66248b.hasThrowable();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f66251e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f66251e) {
                    return;
                }
                this.f66251e = true;
                if (!this.f66249c) {
                    this.f66249c = true;
                    this.f66248b.onComplete();
                    return;
                }
                h40<Object> h40Var = this.f66250d;
                if (h40Var == null) {
                    h40Var = new h40<>(4);
                    this.f66250d = h40Var;
                }
                h40Var.add(fhb.complete());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable t) {
        if (this.f66251e) {
            ofe.onError(t);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f66251e) {
                    this.f66251e = true;
                    if (this.f66249c) {
                        h40<Object> h40Var = this.f66250d;
                        if (h40Var == null) {
                            h40Var = new h40<>(4);
                            this.f66250d = h40Var;
                        }
                        h40Var.setFirst(fhb.error(t));
                        return;
                    }
                    this.f66249c = true;
                    z = false;
                }
                if (z) {
                    ofe.onError(t);
                } else {
                    this.f66248b.onError(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f66251e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f66251e) {
                    return;
                }
                if (!this.f66249c) {
                    this.f66249c = true;
                    this.f66248b.onNext(t);
                    m18257b();
                } else {
                    h40<Object> h40Var = this.f66250d;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f66250d = h40Var;
                    }
                    h40Var.add(fhb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg s) {
        boolean z = true;
        if (!this.f66251e) {
            synchronized (this) {
                try {
                    if (!this.f66251e) {
                        if (this.f66249c) {
                            h40<Object> h40Var = this.f66250d;
                            if (h40Var == null) {
                                h40Var = new h40<>(4);
                                this.f66250d = h40Var;
                            }
                            h40Var.add(fhb.subscription(s));
                            return;
                        }
                        this.f66249c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            s.cancel();
        } else {
            this.f66248b.onSubscribe(s);
            m18257b();
        }
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f66248b.subscribe(s);
    }
}
