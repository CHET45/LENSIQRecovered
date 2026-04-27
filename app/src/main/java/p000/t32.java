package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class t32 implements jo5<ah9> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f83548a;

    /* JADX INFO: renamed from: b */
    public final hid<bh9> f83549b;

    /* JADX INFO: renamed from: c */
    public final hid<dh9> f83550c;

    /* JADX INFO: renamed from: d */
    public final hid<fh9> f83551d;

    public t32(hid<Integer> hidVar, hid<bh9> hidVar2, hid<dh9> hidVar3, hid<fh9> hidVar4) {
        this.f83548a = hidVar;
        this.f83549b = hidVar2;
        this.f83550c = hidVar3;
        this.f83551d = hidVar4;
    }

    public static t32 create(hid<Integer> hidVar, hid<bh9> hidVar2, hid<dh9> hidVar3, hid<fh9> hidVar4) {
        return new t32(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static ah9 provideLocationServicesStatus(int i, hid<bh9> hidVar, hid<dh9> hidVar2, hid<fh9> hidVar3) {
        return (ah9) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m112x(i, hidVar, hidVar2, hidVar3));
    }

    @Override // p000.hid
    public ah9 get() {
        return provideLocationServicesStatus(this.f83548a.get().intValue(), this.f83549b, this.f83550c, this.f83551d);
    }
}
