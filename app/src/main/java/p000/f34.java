package p000;

/* JADX INFO: loaded from: classes7.dex */
public abstract class f34<T, R> extends d34<R> implements pxb<T> {
    private static final long serialVersionUID = -266195175408988651L;

    /* JADX INFO: renamed from: C */
    public lf4 f34947C;

    public f34(pxb<? super R> downstream) {
        super(downstream);
    }

    @Override // p000.d34, p000.lf4
    public void dispose() {
        super.dispose();
        this.f34947C.dispose();
    }

    @Override // p000.pxb
    public void onComplete() {
        T t = this.f28318b;
        if (t == null) {
            complete();
        } else {
            this.f28318b = null;
            complete(t);
        }
    }

    @Override // p000.pxb
    public void onError(Throwable t) {
        this.f28318b = null;
        error(t);
    }

    @Override // p000.pxb
    public void onSubscribe(lf4 d) {
        if (zf4.validate(this.f34947C, d)) {
            this.f34947C = d;
            this.f28317a.onSubscribe(this);
        }
    }
}
