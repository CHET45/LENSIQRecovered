package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@ukd
@xqe
@se3
public final class iz3 implements go5<hz3> {

    /* JADX INFO: renamed from: a */
    public final gid<Executor> f48929a;

    /* JADX INFO: renamed from: b */
    public final gid<un0> f48930b;

    /* JADX INFO: renamed from: c */
    public final gid<nqi> f48931c;

    /* JADX INFO: renamed from: d */
    public final gid<t65> f48932d;

    /* JADX INFO: renamed from: e */
    public final gid<vhg> f48933e;

    public iz3(gid<Executor> gidVar, gid<un0> gidVar2, gid<nqi> gidVar3, gid<t65> gidVar4, gid<vhg> gidVar5) {
        this.f48929a = gidVar;
        this.f48930b = gidVar2;
        this.f48931c = gidVar3;
        this.f48932d = gidVar4;
        this.f48933e = gidVar5;
    }

    public static iz3 create(gid<Executor> gidVar, gid<un0> gidVar2, gid<nqi> gidVar3, gid<t65> gidVar4, gid<vhg> gidVar5) {
        return new iz3(gidVar, gidVar2, gidVar3, gidVar4, gidVar5);
    }

    public static hz3 newInstance(Executor executor, un0 un0Var, nqi nqiVar, t65 t65Var, vhg vhgVar) {
        return new hz3(executor, un0Var, nqiVar, t65Var, vhgVar);
    }

    @Override // p000.gid
    public hz3 get() {
        return newInstance(this.f48929a.get(), this.f48930b.get(), this.f48931c.get(), this.f48932d.get(), this.f48933e.get());
    }
}
