package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class m5f implements ho5<l5f> {

    /* JADX INFO: renamed from: a */
    public final gid<r0h> f59945a;

    /* JADX INFO: renamed from: b */
    public final gid<n1i> f59946b;

    public m5f(gid<r0h> gidVar, gid<n1i> gidVar2) {
        this.f59945a = gidVar;
        this.f59946b = gidVar2;
    }

    public static m5f create(gid<r0h> gidVar, gid<n1i> gidVar2) {
        return new m5f(gidVar, gidVar2);
    }

    public static l5f newInstance(r0h r0hVar, n1i n1iVar) {
        return new l5f(r0hVar, n1iVar);
    }

    @Override // p000.gid
    public l5f get() {
        return newInstance(this.f59945a.get(), this.f59946b.get());
    }
}
