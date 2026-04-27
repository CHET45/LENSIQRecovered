package p000;

import p000.ih3;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class dcd implements ih3.InterfaceC7283a {

    /* JADX INFO: renamed from: a */
    public final ih3.InterfaceC7283a f29352a;

    /* JADX INFO: renamed from: b */
    public final jcd f29353b;

    /* JADX INFO: renamed from: c */
    public final int f29354c;

    public dcd(ih3.InterfaceC7283a interfaceC7283a, jcd jcdVar, int i) {
        this.f29352a = interfaceC7283a;
        this.f29353b = jcdVar;
        this.f29354c = i;
    }

    @Override // p000.ih3.InterfaceC7283a
    public ccd createDataSource() {
        return new ccd(this.f29352a.createDataSource(), this.f29353b, this.f29354c);
    }
}
