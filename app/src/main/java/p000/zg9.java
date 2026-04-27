package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class zg9 implements jo5<wg9> {

    /* JADX INFO: renamed from: a */
    public final hid<vkb<Boolean>> f105054a;

    public zg9(hid<vkb<Boolean>> hidVar) {
        this.f105054a = hidVar;
    }

    public static zg9 create(hid<vkb<Boolean>> hidVar) {
        return new zg9(hidVar);
    }

    public static wg9 newInstance(vkb<Boolean> vkbVar) {
        return new wg9(vkbVar);
    }

    @Override // p000.hid
    public wg9 get() {
        return newInstance(this.f105054a.get());
    }
}
