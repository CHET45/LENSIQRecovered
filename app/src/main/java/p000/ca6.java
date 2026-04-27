package p000;

import p000.ba6;

/* JADX INFO: loaded from: classes7.dex */
public final class ca6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f16102b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends zjd<? extends R>> f16103c;

    /* JADX INFO: renamed from: d */
    public final int f16104d;

    /* JADX INFO: renamed from: e */
    public final int f16105e;

    /* JADX INFO: renamed from: f */
    public final e55 f16106f;

    public ca6(zjd<T> source, sy6<? super T, ? extends zjd<? extends R>> mapper, int maxConcurrency, int prefetch, e55 errorMode) {
        this.f16102b = source;
        this.f16103c = mapper;
        this.f16104d = maxConcurrency;
        this.f16105e = prefetch;
        this.f16106f = errorMode;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f16102b.subscribe(new ba6.C1804a(s, this.f16103c, this.f16104d, this.f16105e, this.f16106f));
    }
}
