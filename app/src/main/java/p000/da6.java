package p000;

import p000.aa6;

/* JADX INFO: loaded from: classes7.dex */
public final class da6<T, R> extends m86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f28908b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends zjd<? extends R>> f28909c;

    /* JADX INFO: renamed from: d */
    public final int f28910d;

    /* JADX INFO: renamed from: e */
    public final int f28911e;

    /* JADX INFO: renamed from: f */
    public final f55 f28912f;

    public da6(zjd<T> zjdVar, py6<? super T, ? extends zjd<? extends R>> py6Var, int i, int i2, f55 f55Var) {
        this.f28908b = zjdVar;
        this.f28909c = py6Var;
        this.f28910d = i;
        this.f28911e = i2;
        this.f28912f = f55Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super R> ycgVar) {
        this.f28908b.subscribe(new aa6.C0119a(ycgVar, this.f28909c, this.f28910d, this.f28911e, this.f28912f));
    }
}
