package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class xb8 implements jo5<wb8> {

    /* JADX INFO: renamed from: a */
    public final hid<dfe> f97431a;

    public xb8(hid<dfe> hidVar) {
        this.f97431a = hidVar;
    }

    public static xb8 create(hid<dfe> hidVar) {
        return new xb8(hidVar);
    }

    public static wb8 newInstance(dfe dfeVar) {
        return new wb8(dfeVar);
    }

    @Override // p000.hid
    public wb8 get() {
        return newInstance(this.f97431a.get());
    }
}
