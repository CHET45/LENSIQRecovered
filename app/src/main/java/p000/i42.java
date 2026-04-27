package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class i42 implements jo5<h42> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f45712a;

    public i42(hid<woe> hidVar) {
        this.f45712a = hidVar;
    }

    public static i42 create(hid<woe> hidVar) {
        return new i42(hidVar);
    }

    public static h42 newInstance(woe woeVar) {
        return new h42(woeVar);
    }

    @Override // p000.hid
    public h42 get() {
        return newInstance(this.f45712a.get());
    }
}
