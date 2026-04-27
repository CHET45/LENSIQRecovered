package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class rdc<T, R> extends fec<R> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f77945a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends zjd<? extends R>> f77946b;

    /* JADX INFO: renamed from: c */
    public final int f77947c;

    /* JADX INFO: renamed from: d */
    public final f55 f77948d;

    public rdc(fec<T> fecVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, f55 f55Var) {
        this.f77945a = fecVar;
        this.f77946b = (py6) xjb.requireNonNull(py6Var, "mapper");
        this.f77947c = i;
        this.f77948d = (f55) xjb.requireNonNull(f55Var, "errorMode");
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f77945a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super R>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr2[i] = w96.subscribe(ycgVarArr[i], this.f77946b, this.f77947c, this.f77948d);
            }
            this.f77945a.subscribe(ycgVarArr2);
        }
    }
}
