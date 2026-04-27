package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.Monotonic"})
@xqe
@se3
public final class spe implements go5<nqi> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f82540a;

    /* JADX INFO: renamed from: b */
    public final gid<t65> f82541b;

    /* JADX INFO: renamed from: c */
    public final gid<yoe> f82542c;

    /* JADX INFO: renamed from: d */
    public final gid<g52> f82543d;

    public spe(gid<Context> gidVar, gid<t65> gidVar2, gid<yoe> gidVar3, gid<g52> gidVar4) {
        this.f82540a = gidVar;
        this.f82541b = gidVar2;
        this.f82542c = gidVar3;
        this.f82543d = gidVar4;
    }

    public static spe create(gid<Context> gidVar, gid<t65> gidVar2, gid<yoe> gidVar3, gid<g52> gidVar4) {
        return new spe(gidVar, gidVar2, gidVar3, gidVar4);
    }

    public static nqi workScheduler(Context context, t65 t65Var, yoe yoeVar, g52 g52Var) {
        return (nqi) u7d.checkNotNullFromProvides(rpe.m21474b(context, t65Var, yoeVar, g52Var));
    }

    @Override // p000.gid
    public nqi get() {
        return workScheduler(this.f82540a.get(), this.f82541b.get(), this.f82542c.get(), this.f82543d.get());
    }
}
