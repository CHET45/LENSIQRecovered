package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class vr2 implements jo5<Integer> {

    /* JADX INFO: renamed from: vr2$a */
    public static final class C14225a {

        /* JADX INFO: renamed from: a */
        public static final vr2 f92043a = new vr2();

        private C14225a() {
        }
    }

    public static vr2 create() {
        return C14225a.f92043a;
    }

    public static int gattWriteMtuOverhead() {
        return ur2.m23512k();
    }

    @Override // p000.hid
    public Integer get() {
        return Integer.valueOf(gattWriteMtuOverhead());
    }
}
