package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.annotations.concurrent.Background"})
public final class lz5 implements ho5<dz5> {

    /* JADX INFO: renamed from: a */
    public final gid<lw5> f59325a;

    /* JADX INFO: renamed from: b */
    public final gid<f6f> f59326b;

    /* JADX INFO: renamed from: c */
    public final gid<e13> f59327c;

    /* JADX INFO: renamed from: d */
    public final gid<d6f> f59328d;

    public lz5(gid<lw5> gidVar, gid<f6f> gidVar2, gid<e13> gidVar3, gid<d6f> gidVar4) {
        this.f59325a = gidVar;
        this.f59326b = gidVar2;
        this.f59327c = gidVar3;
        this.f59328d = gidVar4;
    }

    public static lz5 create(gid<lw5> gidVar, gid<f6f> gidVar2, gid<e13> gidVar3, gid<d6f> gidVar4) {
        return new lz5(gidVar, gidVar2, gidVar3, gidVar4);
    }

    public static dz5 newInstance(lw5 lw5Var, f6f f6fVar, e13 e13Var, d6f d6fVar) {
        return new dz5(lw5Var, f6fVar, e13Var, d6fVar);
    }

    @Override // p000.gid
    public dz5 get() {
        return newInstance(this.f59325a.get(), this.f59326b.get(), this.f59327c.get(), this.f59328d.get());
    }
}
