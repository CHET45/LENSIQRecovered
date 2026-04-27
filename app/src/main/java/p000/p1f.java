package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class p1f<T> extends rg6<T> {

    /* JADX INFO: renamed from: b */
    public final rg6<T> f69452b;

    /* JADX INFO: renamed from: c */
    public boolean f69453c;

    /* JADX INFO: renamed from: d */
    public g40<Object> f69454d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f69455e;

    public p1f(rg6<T> rg6Var) {
        this.f69452b = rg6Var;
    }

    /* JADX INFO: renamed from: b */
    public void m19153b() {
        g40<Object> g40Var;
        while (true) {
            synchronized (this) {
                try {
                    g40Var = this.f69454d;
                    if (g40Var == null) {
                        this.f69453c = false;
                        return;
                    }
                    this.f69454d = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            g40Var.accept(this.f69452b);
        }
    }

    @Override // p000.rg6
    @cib
    public Throwable getThrowable() {
        return this.f69452b.getThrowable();
    }

    @Override // p000.rg6
    public boolean hasComplete() {
        return this.f69452b.hasComplete();
    }

    @Override // p000.rg6
    public boolean hasSubscribers() {
        return this.f69452b.hasSubscribers();
    }

    @Override // p000.rg6
    public boolean hasThrowable() {
        return this.f69452b.hasThrowable();
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f69455e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69455e) {
                    return;
                }
                this.f69455e = true;
                if (!this.f69453c) {
                    this.f69453c = true;
                    this.f69452b.onComplete();
                    return;
                }
                g40<Object> g40Var = this.f69454d;
                if (g40Var == null) {
                    g40Var = new g40<>(4);
                    this.f69454d = g40Var;
                }
                g40Var.add(ehb.complete());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f69455e) {
            pfe.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f69455e) {
                    this.f69455e = true;
                    if (this.f69453c) {
                        g40<Object> g40Var = this.f69454d;
                        if (g40Var == null) {
                            g40Var = new g40<>(4);
                            this.f69454d = g40Var;
                        }
                        g40Var.setFirst(ehb.error(th));
                        return;
                    }
                    this.f69453c = true;
                    z = false;
                }
                if (z) {
                    pfe.onError(th);
                } else {
                    this.f69452b.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f69455e) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f69455e) {
                    return;
                }
                if (!this.f69453c) {
                    this.f69453c = true;
                    this.f69452b.onNext(t);
                    m19153b();
                } else {
                    g40<Object> g40Var = this.f69454d;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f69454d = g40Var;
                    }
                    g40Var.add(ehb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.ycg
    public void onSubscribe(fdg fdgVar) {
        boolean z = true;
        if (!this.f69455e) {
            synchronized (this) {
                try {
                    if (!this.f69455e) {
                        if (this.f69453c) {
                            g40<Object> g40Var = this.f69454d;
                            if (g40Var == null) {
                                g40Var = new g40<>(4);
                                this.f69454d = g40Var;
                            }
                            g40Var.add(ehb.subscription(fdgVar));
                            return;
                        }
                        this.f69453c = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            fdgVar.cancel();
        } else {
            this.f69452b.onSubscribe(fdgVar);
            m19153b();
        }
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f69452b.subscribe(ycgVar);
    }
}
