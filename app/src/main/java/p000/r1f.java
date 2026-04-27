package p000;

import p000.g40;

/* JADX INFO: loaded from: classes7.dex */
public final class r1f<T> extends mcg<T> implements g40.InterfaceC6115a<Object> {

    /* JADX INFO: renamed from: a */
    public final mcg<T> f76784a;

    /* JADX INFO: renamed from: b */
    public boolean f76785b;

    /* JADX INFO: renamed from: c */
    public g40<Object> f76786c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f76787d;

    public r1f(mcg<T> mcgVar) {
        this.f76784a = mcgVar;
    }

    /* JADX INFO: renamed from: a */
    public void m20761a() {
        g40<Object> g40Var;
        while (true) {
            synchronized (this) {
                try {
                    g40Var = this.f76786c;
                    if (g40Var == null) {
                        this.f76785b = false;
                        return;
                    }
                    this.f76786c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            g40Var.forEachWhile(this);
        }
    }

    @Override // p000.mcg
    @cib
    public Throwable getThrowable() {
        return this.f76784a.getThrowable();
    }

    @Override // p000.mcg
    public boolean hasComplete() {
        return this.f76784a.hasComplete();
    }

    @Override // p000.mcg
    public boolean hasObservers() {
        return this.f76784a.hasObservers();
    }

    @Override // p000.mcg
    public boolean hasThrowable() {
        return this.f76784a.hasThrowable();
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f76787d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f76787d) {
                    return;
                }
                this.f76787d = true;
                if (!this.f76785b) {
                    this.f76785b = true;
                    this.f76784a.onComplete();
                    return;
                }
                g40<Object> g40Var = this.f76786c;
                if (g40Var == null) {
                    g40Var = new g40<>(4);
                    this.f76786c = g40Var;
                }
                g40Var.add(ehb.complete());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        if (this.f76787d) {
            pfe.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f76787d) {
                    this.f76787d = true;
                    if (this.f76785b) {
                        g40<Object> g40Var = this.f76786c;
                        if (g40Var == null) {
                            g40Var = new g40<>(4);
                            this.f76786c = g40Var;
                        }
                        g40Var.setFirst(ehb.error(th));
                        return;
                    }
                    this.f76785b = true;
                    z = false;
                }
                if (z) {
                    pfe.onError(th);
                } else {
                    this.f76784a.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        if (this.f76787d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f76787d) {
                    return;
                }
                if (!this.f76785b) {
                    this.f76785b = true;
                    this.f76784a.onNext(t);
                    m20761a();
                } else {
                    g40<Object> g40Var = this.f76786c;
                    if (g40Var == null) {
                        g40Var = new g40<>(4);
                        this.f76786c = g40Var;
                    }
                    g40Var.add(ehb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        boolean z = true;
        if (!this.f76787d) {
            synchronized (this) {
                try {
                    if (!this.f76787d) {
                        if (this.f76785b) {
                            g40<Object> g40Var = this.f76786c;
                            if (g40Var == null) {
                                g40Var = new g40<>(4);
                                this.f76786c = g40Var;
                            }
                            g40Var.add(ehb.disposable(mf4Var));
                            return;
                        }
                        this.f76785b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            mf4Var.dispose();
        } else {
            this.f76784a.onSubscribe(mf4Var);
            m20761a();
        }
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(oxb<? super T> oxbVar) {
        this.f76784a.subscribe(oxbVar);
    }

    @Override // p000.g40.InterfaceC6115a, p000.m8d
    public boolean test(Object obj) {
        return ehb.acceptFull(obj, this.f76784a);
    }
}
