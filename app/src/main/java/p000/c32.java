package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class c32 implements jo5<woe> {

    /* JADX INFO: renamed from: c32$a */
    public static final class C2175a {

        /* JADX INFO: renamed from: a */
        public static final c32 f15633a = new c32();

        private C2175a() {
        }
    }

    public static c32 create() {
        return C2175a.f15633a;
    }

    public static woe provideBluetoothCallbacksScheduler() {
        return (woe) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m95g());
    }

    @Override // p000.hid
    public woe get() {
        return provideBluetoothCallbacksScheduler();
    }
}
