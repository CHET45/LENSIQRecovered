package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bg4<T> implements pxb<T>, lf4 {

    /* JADX INFO: renamed from: a */
    public final pxb<? super T> f13671a;

    /* JADX INFO: renamed from: b */
    public final uu2<? super lf4> f13672b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7776j8 f13673c;

    /* JADX INFO: renamed from: d */
    public lf4 f13674d;

    public bg4(pxb<? super T> actual, uu2<? super lf4> onSubscribe, InterfaceC7776j8 onDispose) {
        this.f13671a = actual;
        this.f13672b = onSubscribe;
        this.f13673c = onDispose;
    }

    @Override // p000.lf4
    public void dispose() {
        lf4 lf4Var = this.f13674d;
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var != zf4Var) {
            this.f13674d = zf4Var;
            try {
                this.f13673c.run();
            } catch (Throwable th) {
                o75.throwIfFatal(th);
                ofe.onError(th);
            }
            lf4Var.dispose();
        }
    }

    @Override // p000.lf4
    public boolean isDisposed() {
        return this.f13674d.isDisposed();
    }

    @Override // p000.pxb
    public void onComplete() {
        lf4 lf4Var = this.f13674d;
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var != zf4Var) {
            this.f13674d = zf4Var;
            this.f13671a.onComplete();
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        lf4 lf4Var = this.f13674d;
        zf4 zf4Var = zf4.DISPOSED;
        if (lf4Var == zf4Var) {
            ofe.onError(t);
        } else {
            this.f13674d = zf4Var;
            this.f13671a.onError(t);
        }
    }

    @Override // p000.pxb
    public void onNext(T t) {
        this.f13671a.onNext(t);
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        try {
            this.f13672b.accept(d);
            if (zf4.validate(this.f13674d, d)) {
                this.f13674d = d;
                this.f13671a.onSubscribe(this);
            }
        } catch (Throwable th) {
            o75.throwIfFatal(th);
            d.dispose();
            this.f13674d = zf4.DISPOSED;
            b05.error(th, this.f13671a);
        }
    }
}
