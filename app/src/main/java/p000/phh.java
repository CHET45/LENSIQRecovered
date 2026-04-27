package p000;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@xqe("javax.inject.Singleton")
@se3
public final class phh implements go5<nhh> {

    /* JADX INFO: renamed from: a */
    public final gid<g52> f70841a;

    /* JADX INFO: renamed from: b */
    public final gid<g52> f70842b;

    /* JADX INFO: renamed from: c */
    public final gid<soe> f70843c;

    /* JADX INFO: renamed from: d */
    public final gid<nxh> f70844d;

    /* JADX INFO: renamed from: e */
    public final gid<wpi> f70845e;

    public phh(gid<g52> gidVar, gid<g52> gidVar2, gid<soe> gidVar3, gid<nxh> gidVar4, gid<wpi> gidVar5) {
        this.f70841a = gidVar;
        this.f70842b = gidVar2;
        this.f70843c = gidVar3;
        this.f70844d = gidVar4;
        this.f70845e = gidVar5;
    }

    public static phh create(gid<g52> gidVar, gid<g52> gidVar2, gid<soe> gidVar3, gid<nxh> gidVar4, gid<wpi> gidVar5) {
        return new phh(gidVar, gidVar2, gidVar3, gidVar4, gidVar5);
    }

    public static nhh newInstance(g52 g52Var, g52 g52Var2, soe soeVar, nxh nxhVar, wpi wpiVar) {
        return new nhh(g52Var, g52Var2, soeVar, nxhVar, wpiVar);
    }

    @Override // p000.gid
    public nhh get() {
        return newInstance(this.f70841a.get(), this.f70842b.get(), this.f70843c.get(), this.f70844d.get(), this.f70845e.get());
    }
}
