package p000;

/* JADX INFO: loaded from: classes5.dex */
@te3
@yqe("javax.inject.Singleton")
@vkd
public final class syd implements ho5<oyd> {

    /* JADX INFO: renamed from: a */
    public final gid<r0h> f83227a;

    /* JADX INFO: renamed from: b */
    public final gid<uy5> f83228b;

    /* JADX INFO: renamed from: c */
    public final gid<k40> f83229c;

    /* JADX INFO: renamed from: d */
    public final gid<r43> f83230d;

    /* JADX INFO: renamed from: e */
    public final gid<c7f> f83231e;

    public syd(gid<r0h> gidVar, gid<uy5> gidVar2, gid<k40> gidVar3, gid<r43> gidVar4, gid<c7f> gidVar5) {
        this.f83227a = gidVar;
        this.f83228b = gidVar2;
        this.f83229c = gidVar3;
        this.f83230d = gidVar4;
        this.f83231e = gidVar5;
    }

    public static syd create(gid<r0h> gidVar, gid<uy5> gidVar2, gid<k40> gidVar3, gid<r43> gidVar4, gid<c7f> gidVar5) {
        return new syd(gidVar, gidVar2, gidVar3, gidVar4, gidVar5);
    }

    public static oyd newInstance(r0h r0hVar, uy5 uy5Var, k40 k40Var, r43 r43Var, c7f c7fVar) {
        return new oyd(r0hVar, uy5Var, k40Var, r43Var, c7fVar);
    }

    @Override // p000.gid
    public oyd get() {
        return newInstance(this.f83227a.get(), this.f83228b.get(), this.f83229c.get(), this.f83230d.get(), this.f83231e.get());
    }
}
