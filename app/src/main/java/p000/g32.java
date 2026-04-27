package p000;

import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class g32 implements jo5<woe> {

    /* JADX INFO: renamed from: g32$a */
    public static final class C6094a {

        /* JADX INFO: renamed from: a */
        public static final g32 f38313a = new g32();

        private C6094a() {
        }
    }

    public static g32 create() {
        return C6094a.f38313a;
    }

    public static woe provideComputationScheduler() {
        return (woe) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m99k());
    }

    @Override // p000.hid
    public woe get() {
        return provideComputationScheduler();
    }
}
