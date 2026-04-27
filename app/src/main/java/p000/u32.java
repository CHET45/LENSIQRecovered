package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class u32 implements jo5<String[][]> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f86706a;

    /* JADX INFO: renamed from: b */
    public final hid<Integer> f86707b;

    public u32(hid<Integer> hidVar, hid<Integer> hidVar2) {
        this.f86706a = hidVar;
        this.f86707b = hidVar2;
    }

    public static u32 create(hid<Integer> hidVar, hid<Integer> hidVar2) {
        return new u32(hidVar, hidVar2);
    }

    public static String[][] provideRecommendedConnectRuntimePermissionNames(int i, int i2) {
        return (String[][]) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m113y(i, i2));
    }

    @Override // p000.hid
    public String[][] get() {
        return provideRecommendedConnectRuntimePermissionNames(this.f86706a.get().intValue(), this.f86707b.get().intValue());
    }
}
