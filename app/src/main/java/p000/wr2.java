package p000;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class wr2 implements jo5<Integer> {

    /* JADX INFO: renamed from: wr2$a */
    public static final class C14754a {

        /* JADX INFO: renamed from: a */
        public static final wr2 f95183a = new wr2();

        private C14754a() {
        }
    }

    public static wr2 create() {
        return C14754a.f95183a;
    }

    public static int minimumMtu() {
        return ur2.m23513l();
    }

    @Override // p000.hid
    public Integer get() {
        return Integer.valueOf(minimumMtu());
    }
}
