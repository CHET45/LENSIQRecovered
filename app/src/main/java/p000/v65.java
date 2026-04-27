package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@uxa
public abstract class v65 {
    @nid
    @v8b("SQLITE_DB_NAME")
    /* JADX INFO: renamed from: b */
    public static String m23803b() {
        return fqe.f37510c;
    }

    @nid
    @qpf
    @v8b("PACKAGE_NAME")
    /* JADX INFO: renamed from: d */
    public static String m23804d(Context context) {
        return context.getPackageName();
    }

    @nid
    @v8b("SCHEMA_VERSION")
    /* JADX INFO: renamed from: e */
    public static int m23805e() {
        return fqe.f37503V1;
    }

    @nid
    /* JADX INFO: renamed from: f */
    public static u65 m23806f() {
        return u65.f86875f;
    }

    @y21
    /* JADX INFO: renamed from: a */
    public abstract b42 m23807a(ohe oheVar);

    @y21
    /* JADX INFO: renamed from: c */
    public abstract t65 m23808c(ohe oheVar);

    @y21
    /* JADX INFO: renamed from: g */
    public abstract vhg m23809g(ohe oheVar);
}
