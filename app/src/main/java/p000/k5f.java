package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.annotations.concurrent.Background"})
public final class k5f implements ho5<j5f> {

    /* JADX INFO: renamed from: a */
    public final gid<lw5> f52609a;

    /* JADX INFO: renamed from: b */
    public final gid<uy5> f52610b;

    /* JADX INFO: renamed from: c */
    public final gid<f6f> f52611c;

    /* JADX INFO: renamed from: d */
    public final gid<x55> f52612d;

    /* JADX INFO: renamed from: e */
    public final gid<e13> f52613e;

    public k5f(gid<lw5> gidVar, gid<uy5> gidVar2, gid<f6f> gidVar3, gid<x55> gidVar4, gid<e13> gidVar5) {
        this.f52609a = gidVar;
        this.f52610b = gidVar2;
        this.f52611c = gidVar3;
        this.f52612d = gidVar4;
        this.f52613e = gidVar5;
    }

    public static k5f create(gid<lw5> gidVar, gid<uy5> gidVar2, gid<f6f> gidVar3, gid<x55> gidVar4, gid<e13> gidVar5) {
        return new k5f(gidVar, gidVar2, gidVar3, gidVar4, gidVar5);
    }

    public static j5f newInstance(lw5 lw5Var, uy5 uy5Var, f6f f6fVar, x55 x55Var, e13 e13Var) {
        return new j5f(lw5Var, uy5Var, f6fVar, x55Var, e13Var);
    }

    @Override // p000.gid
    public j5f get() {
        return newInstance(this.f52609a.get(), this.f52610b.get(), this.f52611c.get(), this.f52612d.get(), this.f52613e.get());
    }
}
