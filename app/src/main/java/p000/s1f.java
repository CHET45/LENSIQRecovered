package p000;

import p000.h40;

/* JADX INFO: loaded from: classes7.dex */
public final class s1f<T> extends ncg<T> implements h40.InterfaceC6699a<Object> {

    /* JADX INFO: renamed from: a */
    public final ncg<T> f80391a;

    /* JADX INFO: renamed from: b */
    public boolean f80392b;

    /* JADX INFO: renamed from: c */
    public h40<Object> f80393c;

    /* JADX INFO: renamed from: d */
    public volatile boolean f80394d;

    public s1f(final ncg<T> actual) {
        this.f80391a = actual;
    }

    public void emitLoop() {
        h40<Object> h40Var;
        while (true) {
            synchronized (this) {
                try {
                    h40Var = this.f80393c;
                    if (h40Var == null) {
                        this.f80392b = false;
                        return;
                    }
                    this.f80393c = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            h40Var.forEachWhile(this);
        }
    }

    @Override // p000.ncg
    @dib
    public Throwable getThrowable() {
        return this.f80391a.getThrowable();
    }

    @Override // p000.ncg
    public boolean hasComplete() {
        return this.f80391a.hasComplete();
    }

    @Override // p000.ncg
    public boolean hasObservers() {
        return this.f80391a.hasObservers();
    }

    @Override // p000.ncg
    public boolean hasThrowable() {
        return this.f80391a.hasThrowable();
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f80394d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f80394d) {
                    return;
                }
                this.f80394d = true;
                if (!this.f80392b) {
                    this.f80392b = true;
                    this.f80391a.onComplete();
                    return;
                }
                h40<Object> h40Var = this.f80393c;
                if (h40Var == null) {
                    h40Var = new h40<>(4);
                    this.f80393c = h40Var;
                }
                h40Var.add(fhb.complete());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        if (this.f80394d) {
            ofe.onError(t);
            return;
        }
        synchronized (this) {
            try {
                boolean z = true;
                if (!this.f80394d) {
                    this.f80394d = true;
                    if (this.f80392b) {
                        h40<Object> h40Var = this.f80393c;
                        if (h40Var == null) {
                            h40Var = new h40<>(4);
                            this.f80393c = h40Var;
                        }
                        h40Var.setFirst(fhb.error(t));
                        return;
                    }
                    this.f80392b = true;
                    z = false;
                }
                if (z) {
                    ofe.onError(t);
                } else {
                    this.f80391a.onError(t);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        if (this.f80394d) {
            return;
        }
        synchronized (this) {
            try {
                if (this.f80394d) {
                    return;
                }
                if (!this.f80392b) {
                    this.f80392b = true;
                    this.f80391a.onNext(t);
                    emitLoop();
                } else {
                    h40<Object> h40Var = this.f80393c;
                    if (h40Var == null) {
                        h40Var = new h40<>(4);
                        this.f80393c = h40Var;
                    }
                    h40Var.add(fhb.next(t));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        boolean z = true;
        if (!this.f80394d) {
            synchronized (this) {
                try {
                    if (!this.f80394d) {
                        if (this.f80392b) {
                            h40<Object> h40Var = this.f80393c;
                            if (h40Var == null) {
                                h40Var = new h40<>(4);
                                this.f80393c = h40Var;
                            }
                            h40Var.add(fhb.disposable(d));
                            return;
                        }
                        this.f80392b = true;
                        z = false;
                    }
                } finally {
                }
            }
        }
        if (z) {
            d.dispose();
        } else {
            this.f80391a.onSubscribe(d);
            emitLoop();
        }
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f80391a.subscribe(observer);
    }

    @Override // p000.h40.InterfaceC6699a, p000.n8d
    public boolean test(Object o) {
        return fhb.acceptFull(o, this.f80391a);
    }
}
