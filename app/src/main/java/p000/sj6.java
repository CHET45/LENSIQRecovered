package p000;

import p000.rj6;

/* JADX INFO: loaded from: classes7.dex */
public final class sj6<T> extends xd2 {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f81961a;

    /* JADX INFO: renamed from: b */
    public final sy6<? super T, ? extends ph2> f81962b;

    /* JADX INFO: renamed from: c */
    public final boolean f81963c;

    public sj6(zjd<T> source, sy6<? super T, ? extends ph2> mapper, boolean delayErrors) {
        this.f81961a = source;
        this.f81962b = mapper;
        this.f81963c = delayErrors;
    }

    @Override // p000.xd2
    public void subscribeActual(ch2 observer) {
        this.f81961a.subscribe(new rj6.C12118a(observer, this.f81962b, this.f81963c));
    }
}
