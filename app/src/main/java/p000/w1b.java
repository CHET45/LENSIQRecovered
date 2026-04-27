package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class w1b implements jo5<v1b> {

    /* JADX INFO: renamed from: a */
    public final hid<uee> f93080a;

    /* JADX INFO: renamed from: b */
    public final hid<Integer> f93081b;

    public w1b(hid<uee> hidVar, hid<Integer> hidVar2) {
        this.f93080a = hidVar;
        this.f93081b = hidVar2;
    }

    public static w1b create(hid<uee> hidVar, hid<Integer> hidVar2) {
        return new w1b(hidVar, hidVar2);
    }

    public static v1b newInstance(uee ueeVar, int i) {
        return new v1b(ueeVar, i);
    }

    @Override // p000.hid
    public v1b get() {
        return newInstance(this.f93080a.get(), this.f93081b.get().intValue());
    }
}
