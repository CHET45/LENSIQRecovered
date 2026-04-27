package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd({"com.google.firebase.annotations.concurrent.Blocking"})
public final class qyd implements ho5<pyd> {

    /* JADX INFO: renamed from: a */
    public final gid<k40> f76318a;

    /* JADX INFO: renamed from: b */
    public final gid<e13> f76319b;

    public qyd(gid<k40> gidVar, gid<e13> gidVar2) {
        this.f76318a = gidVar;
        this.f76319b = gidVar2;
    }

    public static qyd create(gid<k40> gidVar, gid<e13> gidVar2) {
        return new qyd(gidVar, gidVar2);
    }

    public static pyd newInstance(k40 k40Var, e13 e13Var) {
        return new pyd(k40Var, e13Var);
    }

    @Override // p000.gid
    public pyd get() {
        return newInstance(this.f76318a.get(), this.f76319b.get());
    }
}
