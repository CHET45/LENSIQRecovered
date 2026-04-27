package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class as2 implements jo5<y1h> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f11713a;

    /* JADX INFO: renamed from: b */
    public final hid<w1h> f11714b;

    public as2(hid<woe> hidVar, hid<w1h> hidVar2) {
        this.f11713a = hidVar;
        this.f11714b = hidVar2;
    }

    public static as2 create(hid<woe> hidVar, hid<w1h> hidVar2) {
        return new as2(hidVar, hidVar2);
    }

    public static y1h providesOperationTimeoutConf(woe woeVar, w1h w1hVar) {
        return (y1h) s7d.checkNotNullFromProvides(ur2.m23517p(woeVar, w1hVar));
    }

    @Override // p000.hid
    public y1h get() {
        return providesOperationTimeoutConf(this.f11713a.get(), this.f11714b.get());
    }
}
