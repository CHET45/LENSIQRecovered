package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.sessions.LocalOverrideSettingsProvider", "com.google.firebase.sessions.RemoteSettingsProvider"})
public final class g6f implements ho5<f6f> {

    /* JADX INFO: renamed from: a */
    public final gid<p7f> f38901a;

    /* JADX INFO: renamed from: b */
    public final gid<p7f> f38902b;

    public g6f(gid<p7f> gidVar, gid<p7f> gidVar2) {
        this.f38901a = gidVar;
        this.f38902b = gidVar2;
    }

    public static g6f create(gid<p7f> gidVar, gid<p7f> gidVar2) {
        return new g6f(gidVar, gidVar2);
    }

    public static f6f newInstance(p7f p7fVar, p7f p7fVar2) {
        return new f6f(p7fVar, p7fVar2);
    }

    @Override // p000.gid
    public f6f get() {
        return newInstance(this.f38901a.get(), this.f38902b.get());
    }
}
