package p000;

import p000.ld6;

/* JADX INFO: loaded from: classes7.dex */
public final class bi2<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final ph2 f13780b;

    public bi2(ph2 source) {
        this.f13780b = source;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f13780b.subscribe(new ld6.C8775a(s));
    }
}
