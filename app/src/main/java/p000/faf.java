package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.annotations.concurrent.Background"})
public final class faf implements ho5<eaf> {

    /* JADX INFO: renamed from: a */
    public final gid<f6f> f35942a;

    /* JADX INFO: renamed from: b */
    public final gid<l5f> f35943b;

    /* JADX INFO: renamed from: c */
    public final gid<i5f> f35944c;

    /* JADX INFO: renamed from: d */
    public final gid<r0h> f35945d;

    /* JADX INFO: renamed from: e */
    public final gid<ai3<a5f>> f35946e;

    /* JADX INFO: renamed from: f */
    public final gid<scd> f35947f;

    /* JADX INFO: renamed from: g */
    public final gid<e13> f35948g;

    public faf(gid<f6f> gidVar, gid<l5f> gidVar2, gid<i5f> gidVar3, gid<r0h> gidVar4, gid<ai3<a5f>> gidVar5, gid<scd> gidVar6, gid<e13> gidVar7) {
        this.f35942a = gidVar;
        this.f35943b = gidVar2;
        this.f35944c = gidVar3;
        this.f35945d = gidVar4;
        this.f35946e = gidVar5;
        this.f35947f = gidVar6;
        this.f35948g = gidVar7;
    }

    public static faf create(gid<f6f> gidVar, gid<l5f> gidVar2, gid<i5f> gidVar3, gid<r0h> gidVar4, gid<ai3<a5f>> gidVar5, gid<scd> gidVar6, gid<e13> gidVar7) {
        return new faf(gidVar, gidVar2, gidVar3, gidVar4, gidVar5, gidVar6, gidVar7);
    }

    public static eaf newInstance(f6f f6fVar, l5f l5fVar, i5f i5fVar, r0h r0hVar, ai3<a5f> ai3Var, scd scdVar, e13 e13Var) {
        return new eaf(f6fVar, l5fVar, i5fVar, r0hVar, ai3Var, scdVar, e13Var);
    }

    @Override // p000.gid
    public eaf get() {
        return newInstance(this.f35942a.get(), this.f35943b.get(), this.f35944c.get(), this.f35945d.get(), this.f35946e.get(), this.f35947f.get(), this.f35948g.get());
    }
}
