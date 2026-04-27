package p000;

import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.DeviceScope")
public final class z84 implements jo5<os2> {

    /* JADX INFO: renamed from: a */
    public final hid<q01<uee.EnumC13520d>> f104369a;

    public z84(hid<q01<uee.EnumC13520d>> hidVar) {
        this.f104369a = hidVar;
    }

    public static z84 create(hid<q01<uee.EnumC13520d>> hidVar) {
        return new z84(hidVar);
    }

    public static os2 provideConnectionStateChangeListener(q01<uee.EnumC13520d> q01Var) {
        return (os2) s7d.checkNotNullFromProvides(x84.m25036d(q01Var));
    }

    @Override // p000.hid
    public os2 get() {
        return provideConnectionStateChangeListener(this.f104369a.get());
    }
}
