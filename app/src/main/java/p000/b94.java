package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class b94 implements jo5<y1h> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f13014a;

    public b94(hid<woe> hidVar) {
        this.f13014a = hidVar;
    }

    public static b94 create(hid<woe> hidVar) {
        return new b94(hidVar);
    }

    public static y1h providesConnectTimeoutConf(woe woeVar) {
        return (y1h) s7d.checkNotNullFromProvides(x84.m25038f(woeVar));
    }

    @Override // p000.hid
    public y1h get() {
        return providesConnectTimeoutConf(this.f13014a.get());
    }
}
