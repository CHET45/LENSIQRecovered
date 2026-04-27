package p000;

import p000.dc6;

/* JADX INFO: loaded from: classes7.dex */
public final class ec6<T> extends r4a<T> {

    /* JADX INFO: renamed from: a */
    public final zjd<T> f32612a;

    /* JADX INFO: renamed from: b */
    public final long f32613b;

    public ec6(zjd<T> source, long index) {
        this.f32612a = source;
        this.f32613b = index;
    }

    @Override // p000.r4a
    public void subscribeActual(k9a<? super T> observer) {
        this.f32612a.subscribe(new dc6.C4733a(observer, this.f32613b));
    }
}
