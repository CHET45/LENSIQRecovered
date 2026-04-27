package p000;

import p000.ka6;

/* JADX INFO: loaded from: classes7.dex */
public final class la6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f56967b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f56968c;

    /* JADX INFO: renamed from: d */
    public final e55 f56969d;

    /* JADX INFO: renamed from: e */
    public final int f56970e;

    public la6(zjd<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, e55 errorMode, int prefetch) {
        this.f56967b = source;
        this.f56968c = mapper;
        this.f56969d = errorMode;
        this.f56970e = prefetch;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f56967b.subscribe(new ka6.C8263a(s, this.f56968c, this.f56970e, this.f56969d));
    }
}
