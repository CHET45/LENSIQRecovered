package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class p32 implements jo5<hf8> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f69520a;

    /* JADX INFO: renamed from: b */
    public final hid<if8> f69521b;

    /* JADX INFO: renamed from: c */
    public final hid<kf8> f69522c;

    public p32(hid<Integer> hidVar, hid<if8> hidVar2, hid<kf8> hidVar3) {
        this.f69520a = hidVar;
        this.f69521b = hidVar2;
        this.f69522c = hidVar3;
    }

    public static p32 create(hid<Integer> hidVar, hid<if8> hidVar2, hid<kf8> hidVar3) {
        return new p32(hidVar, hidVar2, hidVar3);
    }

    public static hf8 provideIsConnectableChecker(int i, hid<if8> hidVar, hid<kf8> hidVar2) {
        return (hf8) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m108t(i, hidVar, hidVar2));
    }

    @Override // p000.hid
    public hf8 get() {
        return provideIsConnectableChecker(this.f69520a.get().intValue(), this.f69521b, this.f69522c);
    }
}
