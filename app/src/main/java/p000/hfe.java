package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class hfe implements jo5<gfe> {

    /* JADX INFO: renamed from: a */
    public final hid<woe> f43395a;

    /* JADX INFO: renamed from: b */
    public final hid<c91> f43396b;

    /* JADX INFO: renamed from: c */
    public final hid<fe4> f43397c;

    /* JADX INFO: renamed from: d */
    public final hid<m9b> f43398d;

    public hfe(hid<woe> hidVar, hid<c91> hidVar2, hid<fe4> hidVar3, hid<m9b> hidVar4) {
        this.f43395a = hidVar;
        this.f43396b = hidVar2;
        this.f43397c = hidVar3;
        this.f43398d = hidVar4;
    }

    public static hfe create(hid<woe> hidVar, hid<c91> hidVar2, hid<fe4> hidVar3, hid<m9b> hidVar4) {
        return new hfe(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static gfe newInstance(woe woeVar, c91 c91Var, Object obj, Object obj2) {
        return new gfe(woeVar, c91Var, (fe4) obj, (m9b) obj2);
    }

    @Override // p000.hid
    public gfe get() {
        return newInstance(this.f43395a.get(), this.f43396b.get(), this.f43397c.get(), this.f43398d.get());
    }
}
