package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class c94 implements jo5<y1h> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f16006a;

    public c94(hid<woe> hidVar) {
        this.f16006a = hidVar;
    }

    public static c94 create(hid<woe> hidVar) {
        return new c94(hidVar);
    }

    public static y1h providesDisconnectTimeoutConf(woe woeVar) {
        return (y1h) s7d.checkNotNullFromProvides(x84.m25039g(woeVar));
    }

    @Override // p000.hid
    public y1h get() {
        return providesDisconnectTimeoutConf(this.f16006a.get());
    }
}
