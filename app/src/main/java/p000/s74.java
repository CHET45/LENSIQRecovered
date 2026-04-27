package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class s74 implements jo5<r74> {

    /* JADX INFO: renamed from: a */
    public final hid<bs2> f80867a;

    /* JADX INFO: renamed from: b */
    public final hid<m6c> f80868b;

    public s74(hid<bs2> hidVar, hid<m6c> hidVar2) {
        this.f80867a = hidVar;
        this.f80868b = hidVar2;
    }

    public static s74 create(hid<bs2> hidVar, hid<m6c> hidVar2) {
        return new s74(hidVar, hidVar2);
    }

    public static r74 newInstance(bs2 bs2Var, m6c m6cVar) {
        return new r74(bs2Var, m6cVar);
    }

    @Override // p000.hid
    public r74 get() {
        return newInstance(this.f80867a.get(), this.f80868b.get());
    }
}
