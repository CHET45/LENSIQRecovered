package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"javax.inject.Named"})
@xqe("javax.inject.Singleton")
@se3
public final class x65 implements go5<String> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f96861a;

    public x65(gid<Context> gidVar) {
        this.f96861a = gidVar;
    }

    public static x65 create(gid<Context> gidVar) {
        return new x65(gidVar);
    }

    public static String packageName(Context context) {
        return (String) u7d.checkNotNullFromProvides(v65.m23804d(context));
    }

    @Override // p000.gid
    public String get() {
        return packageName(this.f96861a.get());
    }
}
