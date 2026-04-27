package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class ha6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f42999b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f43000c;

    /* JADX INFO: renamed from: d */
    public final int f43001d;

    /* JADX INFO: renamed from: e */
    public final f55 f43002e;

    public ha6(zjd<T> zjdVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, f55 f55Var) {
        this.f42999b = zjdVar;
        this.f43000c = py6Var;
        this.f43001d = i;
        this.f43002e = f55Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        if (ei6.tryScalarXMapSubscribe(this.f42999b, ycgVar, this.f43000c)) {
            return;
        }
        this.f42999b.subscribe(w96.subscribe(ycgVar, this.f43000c, this.f43001d, this.f43002e));
    }
}
