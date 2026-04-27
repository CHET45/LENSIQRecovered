package p000;

import p000.zj6;

/* JADX INFO: loaded from: classes7.dex */
public final class ik6<T> extends m86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f47234b;

    /* JADX INFO: renamed from: c */
    public final long f47235c;

    public ik6(zjd<T> zjdVar, long j) {
        this.f47234b = zjdVar;
        this.f47235c = j;
    }

    @Override // p000.m86
    public void subscribeActual(ycg<? super T> ycgVar) {
        this.f47234b.subscribe(new zj6.C16160a(ycgVar, this.f47235c));
    }
}
