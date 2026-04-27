package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.annotations.concurrent.Background"})
public final class f7f implements ho5<e7f> {

    /* JADX INFO: renamed from: a */
    public final gid<e13> f35656a;

    /* JADX INFO: renamed from: b */
    public final gid<r0h> f35657b;

    /* JADX INFO: renamed from: c */
    public final gid<ai3<y4f>> f35658c;

    public f7f(gid<e13> gidVar, gid<r0h> gidVar2, gid<ai3<y4f>> gidVar3) {
        this.f35656a = gidVar;
        this.f35657b = gidVar2;
        this.f35658c = gidVar3;
    }

    public static f7f create(gid<e13> gidVar, gid<r0h> gidVar2, gid<ai3<y4f>> gidVar3) {
        return new f7f(gidVar, gidVar2, gidVar3);
    }

    public static e7f newInstance(e13 e13Var, r0h r0hVar, ai3<y4f> ai3Var) {
        return new e7f(e13Var, r0hVar, ai3Var);
    }

    @Override // p000.gid
    public e7f get() {
        return newInstance(this.f35656a.get(), this.f35657b.get(), this.f35658c.get());
    }
}
