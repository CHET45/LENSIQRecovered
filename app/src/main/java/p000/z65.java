package p000;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd
@xqe
public final class z65 implements go5<u65> {

    /* JADX INFO: renamed from: z65$a */
    public static final class C16016a {

        /* JADX INFO: renamed from: a */
        public static final z65 f104280a = new z65();

        private C16016a() {
        }
    }

    public static z65 create() {
        return C16016a.f104280a;
    }

    public static u65 storeConfig() {
        return (u65) u7d.checkNotNullFromProvides(v65.m23806f());
    }

    @Override // p000.gid
    public u65 get() {
        return storeConfig();
    }
}
