package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.ClientScope")
public final class mb8 implements jo5<lb8> {

    /* JADX INFO: renamed from: a */
    public final hid<nne> f60463a;

    /* JADX INFO: renamed from: b */
    public final hid<hf8> f60464b;

    public mb8(hid<nne> hidVar, hid<hf8> hidVar2) {
        this.f60463a = hidVar;
        this.f60464b = hidVar2;
    }

    public static mb8 create(hid<nne> hidVar, hid<hf8> hidVar2) {
        return new mb8(hidVar, hidVar2);
    }

    public static lb8 newInstance(nne nneVar, hf8 hf8Var) {
        return new lb8(nneVar, hf8Var);
    }

    @Override // p000.hid
    public lb8 get() {
        return newInstance(this.f60463a.get(), this.f60464b.get());
    }
}
