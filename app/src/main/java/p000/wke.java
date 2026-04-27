package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class wke<T> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final oxb<? super T> f94547a;

    /* JADX INFO: renamed from: b */
    public mf4 f94548b;

    /* JADX INFO: renamed from: c */
    public boolean f94549c;

    public wke(@bfb oxb<? super T> oxbVar) {
        this.f94547a = oxbVar;
    }

    /* JADX INFO: renamed from: a */
    public void m24635a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f94547a.onSubscribe(c05.INSTANCE);
            try {
                this.f94547a.onError(nullPointerException);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(new pm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(nullPointerException, th2));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24636b() {
        this.f94549c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f94547a.onSubscribe(c05.INSTANCE);
            try {
                this.f94547a.onError(nullPointerException);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(new pm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(nullPointerException, th2));
        }
    }

    @Override // p000.mf4
    public void dispose() {
        this.f94548b.dispose();
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f94548b.isDisposed();
    }

    @Override // p000.oxb
    public void onComplete() {
        if (this.f94549c) {
            return;
        }
        this.f94549c = true;
        if (this.f94548b == null) {
            m24635a();
            return;
        }
        try {
            this.f94547a.onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.oxb
    public void onError(@bfb Throwable th) {
        if (this.f94549c) {
            pfe.onError(th);
            return;
        }
        this.f94549c = true;
        if (this.f94548b != null) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f94547a.onError(th);
                return;
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                pfe.onError(new pm2(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f94547a.onSubscribe(c05.INSTANCE);
            try {
                this.f94547a.onError(new pm2(th, nullPointerException));
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(new pm2(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            n75.throwIfFatal(th4);
            pfe.onError(new pm2(th, nullPointerException, th4));
        }
    }

    @Override // p000.oxb
    public void onNext(@bfb T t) {
        if (this.f94549c) {
            return;
        }
        if (this.f94548b == null) {
            m24636b();
            return;
        }
        if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f94548b.dispose();
                onError(nullPointerException);
                return;
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(new pm2(nullPointerException, th));
                return;
            }
        }
        try {
            this.f94547a.onNext(t);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            try {
                this.f94548b.dispose();
                onError(th2);
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                onError(new pm2(th2, th3));
            }
        }
    }

    @Override // p000.oxb
    public void onSubscribe(@bfb mf4 mf4Var) {
        if (ag4.validate(this.f94548b, mf4Var)) {
            this.f94548b = mf4Var;
            try {
                this.f94547a.onSubscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f94549c = true;
                try {
                    mf4Var.dispose();
                    pfe.onError(th);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    pfe.onError(new pm2(th, th2));
                }
            }
        }
    }
}
