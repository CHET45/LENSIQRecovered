package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class l32 implements jo5<byte[]> {

    /* JADX INFO: renamed from: l32$a */
    public static final class C8594a {

        /* JADX INFO: renamed from: a */
        public static final l32 f56056a = new l32();

        private C8594a() {
        }
    }

    public static l32 create() {
        return C8594a.f56056a;
    }

    public static byte[] provideEnableIndicationValue() {
        return (byte[]) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m104p());
    }

    @Override // p000.hid
    public byte[] get() {
        return provideEnableIndicationValue();
    }
}
