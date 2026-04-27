package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class c5f implements ho5<b5f> {

    /* JADX INFO: renamed from: a */
    public final gid<l5f> f15814a;

    public c5f(gid<l5f> gidVar) {
        this.f15814a = gidVar;
    }

    public static c5f create(gid<l5f> gidVar) {
        return new c5f(gidVar);
    }

    public static b5f newInstance(l5f l5fVar) {
        return new b5f(l5fVar);
    }

    @Override // p000.gid
    public b5f get() {
        return newInstance(this.f15814a.get());
    }
}
