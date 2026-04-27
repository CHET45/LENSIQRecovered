package p000;

import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.DeviceScope")
public final class a94 implements jo5<q01<uee.EnumC13520d>> {

    /* JADX INFO: renamed from: a94$a */
    public static final class C0105a {

        /* JADX INFO: renamed from: a */
        public static final a94 f714a = new a94();

        private C0105a() {
        }
    }

    public static a94 create() {
        return C0105a.f714a;
    }

    public static q01<uee.EnumC13520d> provideConnectionStateRelay() {
        return (q01) s7d.checkNotNullFromProvides(x84.m25037e());
    }

    @Override // p000.hid
    public q01<uee.EnumC13520d> get() {
        return provideConnectionStateRelay();
    }
}
