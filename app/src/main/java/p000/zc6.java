package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class zc6<T, U> extends m86<U> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f104766b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends U>> f104767c;

    /* JADX INFO: renamed from: d */
    public final boolean f104768d;

    /* JADX INFO: renamed from: e */
    public final int f104769e;

    /* JADX INFO: renamed from: f */
    public final int f104770f;

    public zc6(zjd<T> zjdVar, py6<? super T, ? extends zjd<? extends U>> py6Var, boolean z, int i, int i2) {
        this.f104766b = zjdVar;
        this.f104767c = py6Var;
        this.f104768d = z;
        this.f104769e = i;
        this.f104770f = i2;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        if (ei6.tryScalarXMapSubscribe(this.f104766b, ycgVar, this.f104767c)) {
            return;
        }
        this.f104766b.subscribe(qc6.subscribe(ycgVar, this.f104767c, this.f104768d, this.f104769e, this.f104770f));
    }
}
