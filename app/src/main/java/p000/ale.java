package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ale<T> implements lj6<T>, fdg {

    /* JADX INFO: renamed from: a */
    public final ycg<? super T> f2004a;

    /* JADX INFO: renamed from: b */
    public fdg f2005b;

    /* JADX INFO: renamed from: c */
    public boolean f2006c;

    public ale(ycg<? super T> ycgVar) {
        this.f2004a = ycgVar;
    }

    /* JADX INFO: renamed from: a */
    public void m884a() {
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f2004a.onSubscribe(x05.INSTANCE);
            try {
                this.f2004a.onError(nullPointerException);
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
    public void m885b() {
        this.f2006c = true;
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f2004a.onSubscribe(x05.INSTANCE);
            try {
                this.f2004a.onError(nullPointerException);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(new pm2(nullPointerException, th));
            }
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            pfe.onError(new pm2(nullPointerException, th2));
        }
    }

    @Override // p000.fdg
    public void cancel() {
        try {
            this.f2005b.cancel();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onComplete() {
        if (this.f2006c) {
            return;
        }
        this.f2006c = true;
        if (this.f2005b == null) {
            m884a();
            return;
        }
        try {
            this.f2004a.onComplete();
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            pfe.onError(th);
        }
    }

    @Override // p000.ycg
    public void onError(Throwable th) {
        if (this.f2006c) {
            pfe.onError(th);
            return;
        }
        this.f2006c = true;
        if (this.f2005b != null) {
            if (th == null) {
                th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
            }
            try {
                this.f2004a.onError(th);
                return;
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                pfe.onError(new pm2(th, th2));
                return;
            }
        }
        NullPointerException nullPointerException = new NullPointerException("Subscription not set!");
        try {
            this.f2004a.onSubscribe(x05.INSTANCE);
            try {
                this.f2004a.onError(new pm2(th, nullPointerException));
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                pfe.onError(new pm2(th, nullPointerException, th3));
            }
        } catch (Throwable th4) {
            n75.throwIfFatal(th4);
            pfe.onError(new pm2(th, nullPointerException, th4));
        }
    }

    @Override // p000.ycg
    public void onNext(T t) {
        if (this.f2006c) {
            return;
        }
        if (this.f2005b == null) {
            m885b();
            return;
        }
        if (t == null) {
            NullPointerException nullPointerException = new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
            try {
                this.f2005b.cancel();
                onError(nullPointerException);
                return;
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                onError(new pm2(nullPointerException, th));
                return;
            }
        }
        try {
            this.f2004a.onNext(t);
        } catch (Throwable th2) {
            n75.throwIfFatal(th2);
            try {
                this.f2005b.cancel();
                onError(th2);
            } catch (Throwable th3) {
                n75.throwIfFatal(th3);
                onError(new pm2(th2, th3));
            }
        }
    }

    @Override // p000.lj6, p000.ycg
    public void onSubscribe(fdg fdgVar) {
        if (mdg.validate(this.f2005b, fdgVar)) {
            this.f2005b = fdgVar;
            try {
                this.f2004a.onSubscribe(this);
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                this.f2006c = true;
                try {
                    fdgVar.cancel();
                    pfe.onError(th);
                } catch (Throwable th2) {
                    n75.throwIfFatal(th2);
                    pfe.onError(new pm2(th, th2));
                }
            }
        }
    }

    @Override // p000.fdg
    public void request(long j) {
        try {
            this.f2005b.request(j);
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            try {
                this.f2005b.cancel();
                pfe.onError(th);
            } catch (Throwable th2) {
                n75.throwIfFatal(th2);
                pfe.onError(new pm2(th, th2));
            }
        }
    }
}
