package p000;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.WallTime", "com.google.android.datatransport.runtime.time.Monotonic"})
@xqe
@se3
public final class j63 implements go5<i63> {

    /* JADX INFO: renamed from: a */
    public final gid<Context> f49598a;

    /* JADX INFO: renamed from: b */
    public final gid<g52> f49599b;

    /* JADX INFO: renamed from: c */
    public final gid<g52> f49600c;

    public j63(gid<Context> gidVar, gid<g52> gidVar2, gid<g52> gidVar3) {
        this.f49598a = gidVar;
        this.f49599b = gidVar2;
        this.f49600c = gidVar3;
    }

    public static j63 create(gid<Context> gidVar, gid<g52> gidVar2, gid<g52> gidVar3) {
        return new j63(gidVar, gidVar2, gidVar3);
    }

    public static i63 newInstance(Context context, g52 g52Var, g52 g52Var2) {
        return new i63(context, g52Var, g52Var2);
    }

    @Override // p000.gid
    public i63 get() {
        return newInstance(this.f49598a.get(), this.f49599b.get(), this.f49600c.get());
    }
}
