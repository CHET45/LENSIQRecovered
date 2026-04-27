package p000;

import p000.xj6;

/* JADX INFO: loaded from: classes7.dex */
public final class yj6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f101792b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f101793c;

    /* JADX INFO: renamed from: d */
    public final boolean f101794d;

    public yj6(zjd<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayErrors) {
        this.f101792b = source;
        this.f101793c = mapper;
        this.f101794d = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f101792b.subscribe(new xj6.C15152a(s, this.f101793c, this.f101794d));
    }
}
