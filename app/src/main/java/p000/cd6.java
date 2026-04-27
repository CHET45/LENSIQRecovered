package p000;

import p000.bd6;

/* JADX INFO: loaded from: classes7.dex */
public final class cd6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f16285b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends oof<? extends R>> f16286c;

    /* JADX INFO: renamed from: d */
    public final boolean f16287d;

    /* JADX INFO: renamed from: e */
    public final int f16288e;

    public cd6(zjd<T> source, sy6<? super T, ? extends oof<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        this.f16285b = source;
        this.f16286c = mapper;
        this.f16287d = delayError;
        this.f16288e = maxConcurrency;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f16285b.subscribe(new bd6.C1841a(s, this.f16286c, this.f16287d, this.f16288e));
    }
}
