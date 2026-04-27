package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bec<T, R> extends fec<R> {

    /* JADX INFO: renamed from: a */
    public final fec<T> f13553a;

    /* JADX INFO: renamed from: b */
    public final py6<? super T, ? extends zjd<? extends R>> f13554b;

    /* JADX INFO: renamed from: c */
    public final boolean f13555c;

    /* JADX INFO: renamed from: d */
    public final int f13556d;

    /* JADX INFO: renamed from: e */
    public final int f13557e;

    public bec(fec<T> fecVar, py6<? super T, ? extends zjd<? extends R>> py6Var, boolean z, int i, int i2) {
        this.f13553a = fecVar;
        this.f13554b = py6Var;
        this.f13555c = z;
        this.f13556d = i;
        this.f13557e = i2;
    }

    @Override // p000.fec
    public int parallelism() {
        return this.f13553a.parallelism();
    }

    @Override // p000.fec
    public void subscribe(ycg<? super R>[] ycgVarArr) {
        if (m10853a(ycgVarArr)) {
            int length = ycgVarArr.length;
            ycg<? super T>[] ycgVarArr2 = new ycg[length];
            for (int i = 0; i < length; i++) {
                ycgVarArr2[i] = qc6.subscribe(ycgVarArr[i], this.f13554b, this.f13555c, this.f13556d, this.f13557e);
            }
            this.f13553a.subscribe(ycgVarArr2);
        }
    }
}
