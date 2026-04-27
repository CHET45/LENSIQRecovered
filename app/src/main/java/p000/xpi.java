package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@ukd
@xqe
@se3
public final class xpi implements go5<wpi> {

    /* JADX INFO: renamed from: a */
    public final gid<Executor> f98888a;

    /* JADX INFO: renamed from: b */
    public final gid<t65> f98889b;

    /* JADX INFO: renamed from: c */
    public final gid<nqi> f98890c;

    /* JADX INFO: renamed from: d */
    public final gid<vhg> f98891d;

    public xpi(gid<Executor> gidVar, gid<t65> gidVar2, gid<nqi> gidVar3, gid<vhg> gidVar4) {
        this.f98888a = gidVar;
        this.f98889b = gidVar2;
        this.f98890c = gidVar3;
        this.f98891d = gidVar4;
    }

    public static xpi create(gid<Executor> gidVar, gid<t65> gidVar2, gid<nqi> gidVar3, gid<vhg> gidVar4) {
        return new xpi(gidVar, gidVar2, gidVar3, gidVar4);
    }

    public static wpi newInstance(Executor executor, t65 t65Var, nqi nqiVar, vhg vhgVar) {
        return new wpi(executor, t65Var, nqiVar, vhgVar);
    }

    @Override // p000.gid
    public wpi get() {
        return newInstance(this.f98888a.get(), this.f98889b.get(), this.f98890c.get(), this.f98891d.get());
    }
}
