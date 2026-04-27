package p000;

/* JADX INFO: loaded from: classes4.dex */
@se3
@ukd({"javax.inject.Named"})
@xqe
public final class w65 implements go5<String> {

    /* JADX INFO: renamed from: w65$a */
    public static final class C14436a {

        /* JADX INFO: renamed from: a */
        public static final w65 f93395a = new w65();

        private C14436a() {
        }
    }

    public static w65 create() {
        return C14436a.f93395a;
    }

    public static String dbName() {
        return (String) u7d.checkNotNullFromProvides(v65.m23803b());
    }

    @Override // p000.gid
    public String get() {
        return dbName();
    }
}
