package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ble<T> implements kj6<T>, fdg {

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f14067a;

    /* JADX INFO: renamed from: b */
    public fdg f14068b;

    /* JADX INFO: renamed from: c */
    public boolean f14069c;

    public ble(@cfb ycg<? super T> downstream) {
        this.f14067a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public void m3238a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f14067a.onSubscribe(w05.INSTANCE);
            try {
                this.f14067a.onError(nullPointerException);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            ofe.onError(new qm2(nullPointerException, th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m3239b() {
        this.f14069c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f14067a.onSubscribe(w05.INSTANCE);
            try {
                this.f14067a.onError(nullPointerException);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            ofe.onError(new qm2(nullPointerException, th2));
        }
    }

    @Override // p000.fdg
    public void cancel() {
        try {
            this.f14068b.cancel();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f14069c) {
            return;
        }
        this.f14069c = true;
        if (this.f14068b == null) {
            m3238a();
            return;
        }
        try {
            this.f14067a.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onError(@cfb Throwable t) {
        if (this.f14069c) {
            ofe.onError(t);
            return;
        }
        this.f14069c = true;
        if (this.f14068b != null) {
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            try {
                this.f14067a.onError(t);
                return;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(t, th));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f14067a.onSubscribe(w05.INSTANCE);
            try {
                this.f14067a.onError(new qm2(t, nullPointerException));
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(new qm2(t, nullPointerException, th2));
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            ofe.onError(new qm2(t, nullPointerException, th3));
        }
    }

    @Override // p000.ycg
    public void onNext(@cfb T t) {
        if (this.f14069c) {
            return;
        }
        if (this.f14068b == null) {
            m3239b();
            return;
        }
        if (t == null) {
            NullPointerException nullPointerExceptionCreateNullPointerException = k75.createNullPointerException("onNext called with a null Throwable.");
            try {
                this.f14068b.cancel();
                onError(nullPointerExceptionCreateNullPointerException);
                return;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(new qm2(nullPointerExceptionCreateNullPointerException, th));
                return;
            }
        }
        try {
            this.f14067a.onNext(t);
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            try {
                this.f14068b.cancel();
                onError(th2);
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                onError(new qm2(th2, th3));
            }
        }
    }

    @Override // p000.kj6, p000.ycg
    public void onSubscribe(@cfb fdg s) {
        if (ldg.validate(this.f14068b, s)) {
            this.f14068b = s;
            try {
                this.f14067a.onSubscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f14069c = true;
                try {
                    s.cancel();
                    ofe.onError(th);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    ofe.onError(new qm2(th, th2));
                }
            }
        }
    }

    @Override // p000.fdg
    public void request(long n) {
        try {
            this.f14068b.request(n);
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            try {
                this.f14068b.cancel();
                ofe.onError(th);
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(new qm2(th, th2));
            }
        }
    }
}
