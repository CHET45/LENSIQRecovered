package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class g34<T, R> extends e34<R> implements oxb<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* JADX INFO: renamed from: C */
    public mf4 f38315C;

    public g34(oxb<? super R> oxbVar) {
        super(oxbVar);
    }

    @Override // p000.e34, p000.mf4
    public void dispose() {
        super.dispose();
        this.f38315C.dispose();
    }

    @Override // p000.oxb
    public void onComplete() {
        T t = this.f31632b;
        if (t == null) {
            complete();
        } else {
            this.f31632b = null;
            complete(t);
        }
    }

    @Override // p000.oxb
    public void onError(Throwable th) {
        this.f31632b = null;
        error(th);
    }

    @Override // p000.oxb
    public void onSubscribe(mf4 mf4Var) {
        if (ag4.validate(this.f38315C, mf4Var)) {
            this.f38315C = mf4Var;
            this.f31631a.onSubscribe(this);
        }
    }
}
