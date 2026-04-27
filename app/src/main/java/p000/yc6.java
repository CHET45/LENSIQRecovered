package p000;

import p000.xc6;

/* JADX INFO: loaded from: classes7.dex */
public final class yc6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f101096b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f101097c;

    /* JADX INFO: renamed from: d */
    public final boolean f101098d;

    /* JADX INFO: renamed from: e */
    public final int f101099e;

    public yc6(zjd<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayError, int maxConcurrency) {
        this.f101096b = source;
        this.f101097c = mapper;
        this.f101098d = delayError;
        this.f101099e = maxConcurrency;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f101096b.subscribe(new xc6.C15030a(s, this.f101097c, this.f101098d, this.f101099e));
    }
}
