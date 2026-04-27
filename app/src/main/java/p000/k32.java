package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class k32 implements jo5<byte[]> {

    /* JADX INFO: renamed from: k32$a */
    public static final class C8181a {

        /* JADX INFO: renamed from: a */
        public static final k32 f52490a = new k32();

        private C8181a() {
        }
    }

    public static k32 create() {
        return C8181a.f52490a;
    }

    public static byte[] provideDisableNotificationValue() {
        return (byte[]) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m103o());
    }

    @Override // p000.hid
    public byte[] get() {
        return provideDisableNotificationValue();
    }
}
