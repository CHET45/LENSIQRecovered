package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class sne implements jo5<rne> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f82389a;

    public sne(hid<woe> hidVar) {
        this.f82389a = hidVar;
    }

    public static sne create(hid<woe> hidVar) {
        return new sne(hidVar);
    }

    public static rne newInstance(woe woeVar) {
        return new rne(woeVar);
    }

    @Override // p000.hid
    public rne get() {
        return newInstance(this.f82389a.get());
    }
}
