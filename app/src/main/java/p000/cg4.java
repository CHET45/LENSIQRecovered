package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class cg4<T> implements oxb<T>, mf4 {

    /* JADX INFO: renamed from: a */
    public final oxb<? super T> f16461a;

    /* JADX INFO: renamed from: b */
    public final tu2<? super mf4> f16462b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7178i8 f16463c;

    /* JADX INFO: renamed from: d */
    public mf4 f16464d;

    public cg4(oxb<? super T> oxbVar, tu2<? super mf4> tu2Var, InterfaceC7178i8 interfaceC7178i8) {
        this.f16461a = oxbVar;
        this.f16462b = tu2Var;
        this.f16463c = interfaceC7178i8;
    }

    @Override // p000.mf4
    public void dispose() {
        mf4 mf4Var = this.f16464d;
        ag4 ag4Var = ag4.DISPOSED;
        if (mf4Var != ag4Var) {
            this.f16464d = ag4Var;
            try {
                this.f16463c.run();
            } catch (Throwable th) {
                n75.throwIfFatal(th);
                pfe.onError(th);
            }
            mf4Var.dispose();
        }
    }

    @Override // p000.mf4
    public boolean isDisposed() {
        return this.f16464d.isDisposed();
    }

    @Override // p000.oxb
    public void onComplete() {
        mf4 mf4Var = this.f16464d;
        ag4 ag4Var = ag4.DISPOSED;
        if (mf4Var != ag4Var) {
            this.f16464d = ag4Var;
            this.f16461a.onComplete();
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        mf4 mf4Var = this.f16464d;
        ag4 ag4Var = ag4.DISPOSED;
        if (mf4Var == ag4Var) {
            pfe.onError(th);
        } else {
            this.f16464d = ag4Var;
            this.f16461a.onError(th);
        }
    }

    @Override // p000.oxb
    public void onNext(T t) {
        this.f16461a.onNext(t);
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        try {
            this.f16462b.accept(mf4Var);
            if (ag4.validate(this.f16464d, mf4Var)) {
                this.f16464d = mf4Var;
                this.f16461a.onSubscribe(this);
            }
        } catch (Throwable th) {
            n75.throwIfFatal(th);
            mf4Var.dispose();
            this.f16464d = ag4.DISPOSED;
            c05.error(th, this.f16461a);
        }
    }
}
