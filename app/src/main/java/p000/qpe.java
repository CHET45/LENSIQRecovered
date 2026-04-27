package p000;

/* JADX INFO: loaded from: classes4.dex */
@ukd({"com.google.android.datatransport.runtime.time.WallTime"})
@xqe
@se3
public final class qpe implements go5<yoe> {

    /* JADX INFO: renamed from: a */
    public final gid<g52> f75085a;

    public qpe(gid<g52> gidVar) {
        this.f75085a = gidVar;
    }

    public static yoe config(g52 g52Var) {
        return (yoe) u7d.checkNotNullFromProvides(ppe.m19697a(g52Var));
    }

    public static qpe create(gid<g52> gidVar) {
        return new qpe(gidVar);
    }

    @Override // p000.gid
    public yoe get() {
        return config(this.f75085a.get());
    }
}
