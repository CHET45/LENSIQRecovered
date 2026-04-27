package p000;

import p000.npb;

/* JADX INFO: loaded from: classes7.dex */
public final class ei2<T> extends vkb<T> {

    /* JADX INFO: renamed from: a */
    public final ph2 f33063a;

    public ei2(ph2 source) {
        this.f33063a = source;
    }

    @Override // p000.vkb
    public void subscribeActual(pxb<? super T> observer) {
        this.f33063a.subscribe(new npb.C9967a(observer));
    }
}
