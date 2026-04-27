package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class vke<T> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final pxb<? super T> f91528a;

    /* JADX INFO: renamed from: b */
    public lf4 f91529b;

    /* JADX INFO: renamed from: c */
    public boolean f91530c;

    public vke(@cfb pxb<? super T> downstream) {
        this.f91528a = downstream;
    }

    /* JADX INFO: renamed from: a */
    public void m24048a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f91528a.onSubscribe(b05.INSTANCE);
            try {
                this.f91528a.onError(nullPointerException);
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
    public void m24049b() {
        this.f91530c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f91528a.onSubscribe(b05.INSTANCE);
            try {
                this.f91528a.onError(nullPointerException);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            ofe.onError(new qm2(nullPointerException, th2));
        }
    }

    @Override // p000.lf4
    public void dispose() {
        this.f91529b.dispose();
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f91529b.isDisposed();
    }

    @Override // p000.pxb
    public void onComplete() {
        if (this.f91530c) {
            return;
        }
        this.f91530c = true;
        if (this.f91529b == null) {
            m24048a();
            return;
        }
        try {
            this.f91528a.onComplete();
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            ofe.onError(th);
        }
    }

    @Override // p000.pxb
    public void onError(@cfb Throwable t) {
        if (this.f91530c) {
            ofe.onError(t);
            return;
        }
        this.f91530c = true;
        if (this.f91529b != null) {
            if (t == null) {
                t = k75.createNullPointerException("onError called with a null Throwable.");
            }
            try {
                this.f91528a.onError(t);
                return;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(new qm2(t, th));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f91528a.onSubscribe(b05.INSTANCE);
            try {
                this.f91528a.onError(new qm2(t, nullPointerException));
            } catch (Throwable th2) {
                o75.throwIfFatal(th2);
                ofe.onError(new qm2(t, nullPointerException, th2));
            }
        } catch (Throwable th3) {
            o75.throwIfFatal(th3);
            ofe.onError(new qm2(t, nullPointerException, th3));
        }
    }

    @Override // p000.pxb
    public void onNext(@cfb T t) {
        if (this.f91530c) {
            return;
        }
        if (this.f91529b == null) {
            m24049b();
            return;
        }
        if (t == null) {
            NullPointerException nullPointerExceptionCreateNullPointerException = k75.createNullPointerException("onNext called with a null value.");
            try {
                this.f91529b.dispose();
                onError(nullPointerExceptionCreateNullPointerException);
                return;
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                onError(new qm2(nullPointerExceptionCreateNullPointerException, th));
                return;
            }
        }
        try {
            this.f91528a.onNext(t);
        } catch (Throwable th2) {
            o75.throwIfFatal(th2);
            try {
                this.f91529b.dispose();
                onError(th2);
            } catch (Throwable th3) {
                o75.throwIfFatal(th3);
                onError(new qm2(th2, th3));
            }
        }
    }

    @Override // p000.pxb
    public void onSubscribe(@cfb lf4 d) {
        if (zf4.validate(this.f91529b, d)) {
            this.f91529b = d;
            try {
                this.f91528a.onSubscribe(this);
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                this.f91530c = true;
                try {
                    d.dispose();
                    ofe.onError(th);
                } catch (Throwable th2) {
                    o75.throwIfFatal(th2);
                    ofe.onError(new qm2(th, th2));
                }
            }
        }
    }
}
