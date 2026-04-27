package p000;

import p000.fa6;

/* JADX INFO: loaded from: classes7.dex */
public final class ga6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f39125b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f39126c;

    /* JADX INFO: renamed from: d */
    public final e55 f39127d;

    /* JADX INFO: renamed from: e */
    public final int f39128e;

    public ga6(zjd<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, e55 errorMode, int prefetch) {
        this.f39125b = source;
        this.f39126c = mapper;
        this.f39127d = errorMode;
        this.f39128e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f39125b.subscribe(new fa6.C5703a(s, this.f39126c, this.f39128e, this.f39127d));
    }
}
