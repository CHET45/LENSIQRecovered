package p000;

import p000.ak6;

/* JADX INFO: loaded from: classes7.dex */
public final class hk6<T> extends l86<T> {

    /* JADX INFO: renamed from: b */
    public final zjd<T> f43885b;

    /* JADX INFO: renamed from: c */
    public final long f43886c;

    public hk6(zjd<T> source, long limit) {
        this.f43885b = source;
        this.f43886c = limit;
    }

    @Override // p000.l86
    public void subscribeActual(ycg<? super T> s) {
        this.f43885b.subscribe(new ak6.C0297a(s, this.f43886c));
    }
}
