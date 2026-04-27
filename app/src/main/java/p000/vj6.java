package p000;

import p000.uj6;

/* JADX INFO: loaded from: classes7.dex */
public final class vj6<T, R> extends l86<R> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f91367b;

    /* JADX INFO: renamed from: c */
    public final sy6<? super T, ? extends z9a<? extends R>> f91368c;

    /* JADX INFO: renamed from: d */
    public final boolean f91369d;

    public vj6(zjd<T> source, sy6<? super T, ? extends z9a<? extends R>> mapper, boolean delayErrors) {
        this.f91367b = source;
        this.f91368c = mapper;
        this.f91369d = delayErrors;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super R> s) {
        this.f91367b.subscribe(new uj6.C13551a(s, this.f91368c, this.f91369d));
    }
}
