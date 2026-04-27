package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class e6f implements ho5<d6f> {

    /* JADX INFO: renamed from: a */
    public final gid<daf> f31949a;

    public e6f(gid<daf> gidVar) {
        this.f31949a = gidVar;
    }

    public static e6f create(gid<daf> gidVar) {
        return new e6f(gidVar);
    }

    public static d6f newInstance(daf dafVar) {
        return new d6f(dafVar);
    }

    @Override // p000.gid
    public d6f get() {
        return newInstance(this.f31949a.get());
    }
}
