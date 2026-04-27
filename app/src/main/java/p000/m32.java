package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class m32 implements jo5<byte[]> {

    /* JADX INFO: renamed from: m32$a */
    public static final class C9117a {

        /* JADX INFO: renamed from: a */
        public static final m32 f59801a = new m32();

        private C9117a() {
        }
    }

    public static m32 create() {
        return C9117a.f59801a;
    }

    public static byte[] provideEnableNotificationValue() {
        return (byte[]) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m105q());
    }

    @Override // p000.hid
    public byte[] get() {
        return provideEnableNotificationValue();
    }
}
