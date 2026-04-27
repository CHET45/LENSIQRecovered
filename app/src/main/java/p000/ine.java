package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class ine implements jo5<hne> {

    /* JADX INFO: renamed from: a */
    public final hid<fne> f47629a;

    /* JADX INFO: renamed from: b */
    public final hid<woe> f47630b;

    public ine(hid<fne> hidVar, hid<woe> hidVar2) {
        this.f47629a = hidVar;
        this.f47630b = hidVar2;
    }

    public static ine create(hid<fne> hidVar, hid<woe> hidVar2) {
        return new ine(hidVar, hidVar2);
    }

    public static hne newInstance(fne fneVar, woe woeVar) {
        return new hne(fneVar, woeVar);
    }

    @Override // p000.hid
    public hne get() {
        return newInstance(this.f47629a.get(), this.f47630b.get());
    }
}
