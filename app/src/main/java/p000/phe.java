package p000;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic", "javax.inject.Named"})
@xqe("javax.inject.Singleton")
@se3
public final class phe implements go5<ohe> {

    /* JADX INFO: renamed from: a */
    public final gid<g52> f70833a;

    /* JADX INFO: renamed from: b */
    public final gid<g52> f70834b;

    /* JADX INFO: renamed from: c */
    public final gid<u65> f70835c;

    /* JADX INFO: renamed from: d */
    public final gid<fqe> f70836d;

    /* JADX INFO: renamed from: e */
    public final gid<String> f70837e;

    public phe(gid<g52> gidVar, gid<g52> gidVar2, gid<u65> gidVar3, gid<fqe> gidVar4, gid<String> gidVar5) {
        this.f70833a = gidVar;
        this.f70834b = gidVar2;
        this.f70835c = gidVar3;
        this.f70836d = gidVar4;
        this.f70837e = gidVar5;
    }

    public static phe create(gid<g52> gidVar, gid<g52> gidVar2, gid<u65> gidVar3, gid<fqe> gidVar4, gid<String> gidVar5) {
        return new phe(gidVar, gidVar2, gidVar3, gidVar4, gidVar5);
    }

    public static ohe newInstance(g52 g52Var, g52 g52Var2, Object obj, Object obj2, gid<String> gidVar) {
        return new ohe(g52Var, g52Var2, (u65) obj, (fqe) obj2, gidVar);
    }

    @Override // p000.gid
    public ohe get() {
        return newInstance(this.f70833a.get(), this.f70834b.get(), this.f70835c.get(), this.f70836d.get(), this.f70837e);
    }
}
