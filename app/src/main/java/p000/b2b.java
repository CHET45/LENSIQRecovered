package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class b2b implements jo5<a2b> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f12462a;

    /* JADX INFO: renamed from: b */
    public final hid<Integer> f12463b;

    public b2b(hid<gfe> hidVar, hid<Integer> hidVar2) {
        this.f12462a = hidVar;
        this.f12463b = hidVar2;
    }

    public static b2b create(hid<gfe> hidVar, hid<Integer> hidVar2) {
        return new b2b(hidVar, hidVar2);
    }

    public static a2b newInstance(gfe gfeVar, int i) {
        return new a2b(gfeVar, i);
    }

    @Override // p000.hid
    public a2b get() {
        return newInstance(this.f12462a.get(), this.f12463b.get().intValue());
    }
}
