package p000;

/* JADX INFO: renamed from: zu */
/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class C16254zu implements jo5<C15808yu> {

    /* JADX INFO: renamed from: a */
    public final hid<Integer> f106088a;

    public C16254zu(hid<Integer> hidVar) {
        this.f106088a = hidVar;
    }

    public static C16254zu create(hid<Integer> hidVar) {
        return new C16254zu(hidVar);
    }

    public static C15808yu newInstance(int i) {
        return new C15808yu(i);
    }

    @Override // p000.hid
    public C15808yu get() {
        return newInstance(this.f106088a.get().intValue());
    }
}
