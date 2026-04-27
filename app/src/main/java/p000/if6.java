package p000;

import p000.cf6;

/* JADX INFO: loaded from: classes7.dex */
public final class if6<T, U> extends m86<U> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f46729b;

    /* JADX INFO: renamed from: c */
    public final py6<? super T, ? extends U> f46730c;

    public if6(zjd<T> zjdVar, py6<? super T, ? extends U> py6Var) {
        this.f46729b = zjdVar;
        this.f46730c = py6Var;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super U> ycgVar) {
        this.f46729b.subscribe(new cf6.C2298b(ycgVar, this.f46730c));
    }
}
