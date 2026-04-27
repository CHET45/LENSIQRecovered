package p000;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@xqe
@se3
public final class oxh implements go5<nxh> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f69174a;

    /* JADX INFO: renamed from: b */
    public final gid<un0> f69175b;

    /* JADX INFO: renamed from: c */
    public final gid<t65> f69176c;

    /* JADX INFO: renamed from: d */
    public final gid<nqi> f69177d;

    /* JADX INFO: renamed from: e */
    public final gid<Executor> f69178e;

    /* JADX INFO: renamed from: f */
    public final gid<vhg> f69179f;

    /* JADX INFO: renamed from: g */
    public final gid<g52> f69180g;

    /* JADX INFO: renamed from: h */
    public final gid<g52> f69181h;

    /* JADX INFO: renamed from: i */
    public final gid<b42> f69182i;

    public oxh(gid<Context> gidVar, gid<un0> gidVar2, gid<t65> gidVar3, gid<nqi> gidVar4, gid<Executor> gidVar5, gid<vhg> gidVar6, gid<g52> gidVar7, gid<g52> gidVar8, gid<b42> gidVar9) {
        this.f69174a = gidVar;
        this.f69175b = gidVar2;
        this.f69176c = gidVar3;
        this.f69177d = gidVar4;
        this.f69178e = gidVar5;
        this.f69179f = gidVar6;
        this.f69180g = gidVar7;
        this.f69181h = gidVar8;
        this.f69182i = gidVar9;
    }

    public static oxh create(gid<Context> gidVar, gid<un0> gidVar2, gid<t65> gidVar3, gid<nqi> gidVar4, gid<Executor> gidVar5, gid<vhg> gidVar6, gid<g52> gidVar7, gid<g52> gidVar8, gid<b42> gidVar9) {
        return new oxh(gidVar, gidVar2, gidVar3, gidVar4, gidVar5, gidVar6, gidVar7, gidVar8, gidVar9);
    }

    public static nxh newInstance(Context context, un0 un0Var, t65 t65Var, nqi nqiVar, Executor executor, vhg vhgVar, g52 g52Var, g52 g52Var2, b42 b42Var) {
        return new nxh(context, un0Var, t65Var, nqiVar, executor, vhgVar, g52Var, g52Var2, b42Var);
    }

    @Override // p000.gid
    public nxh get() {
        return newInstance(this.f69174a.get(), this.f69175b.get(), this.f69176c.get(), this.f69177d.get(), this.f69178e.get(), this.f69179f.get(), this.f69180g.get(), this.f69181h.get(), this.f69182i.get());
    }
}
