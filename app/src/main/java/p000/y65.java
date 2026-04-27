package p000;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd({"javax.inject.Named"})
@xqe
public final class y65 implements go5<Integer> {

    /* JADX INFO: renamed from: y65$a */
    public static final class C15501a {

        /* JADX INFO: renamed from: a */
        public static final y65 f100475a = new y65();

        private C15501a() {
        }
    }

    public static y65 create() {
        return C15501a.f100475a;
    }

    public static int schemaVersion() {
        return v65.m23805e();
    }

    @Override // p000.gid
    public Integer get() {
        return Integer.valueOf(schemaVersion());
    }
}
