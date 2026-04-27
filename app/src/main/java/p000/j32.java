package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class j32 implements jo5<Integer> {

    /* JADX INFO: renamed from: j32$a */
    public static final class C7728a {

        /* JADX INFO: renamed from: a */
        public static final j32 f49471a = new j32();

        private C7728a() {
        }
    }

    public static j32 create() {
        return C7728a.f49471a;
    }

    public static int provideDeviceSdk() {
        return a32.AbstractC0031d.m102n();
    }

    @Override // p000.hid
    public Integer get() {
        return Integer.valueOf(provideDeviceSdk());
    }
}
