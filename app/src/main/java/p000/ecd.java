package p000;

import p000.gh3;

/* JADX INFO: loaded from: classes3.dex */
@ovh
@Deprecated
public final class ecd implements gh3.InterfaceC6313a {

    /* JADX INFO: renamed from: a */
    public final gh3.InterfaceC6313a f32650a;

    /* JADX INFO: renamed from: b */
    public final icd f32651b;

    /* JADX INFO: renamed from: c */
    public final int f32652c;

    public ecd(gh3.InterfaceC6313a interfaceC6313a, icd icdVar, int i) {
        this.f32650a = interfaceC6313a;
        this.f32651b = icdVar;
        this.f32652c = i;
    }

    @Override // p000.gh3.InterfaceC6313a
    public bcd createDataSource() {
        return new bcd(this.f32650a.createDataSource(), this.f32651b, this.f32652c);
    }
}
