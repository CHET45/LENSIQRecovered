package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class v32 implements jo5<String[][]> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f89810a;

    /* JADX INFO: renamed from: b */
    public final hid<Integer> f89811b;

    /* JADX INFO: renamed from: c */
    public final hid<Boolean> f89812c;

    public v32(hid<Integer> hidVar, hid<Integer> hidVar2, hid<Boolean> hidVar3) {
        this.f89810a = hidVar;
        this.f89811b = hidVar2;
        this.f89812c = hidVar3;
    }

    public static v32 create(hid<Integer> hidVar, hid<Integer> hidVar2, hid<Boolean> hidVar3) {
        return new v32(hidVar, hidVar2, hidVar3);
    }

    public static String[][] provideRecommendedScanRuntimePermissionNames(int i, int i2, boolean z) {
        return (String[][]) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m114z(i, i2, z));
    }

    @Override // p000.hid
    public String[][] get() {
        return provideRecommendedScanRuntimePermissionNames(this.f89810a.get().intValue(), this.f89811b.get().intValue(), this.f89812c.get().booleanValue());
    }
}
