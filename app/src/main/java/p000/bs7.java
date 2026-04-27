package p000;

/* JADX INFO: loaded from: classes8.dex */
public class bs7 extends tde {

    /* JADX INFO: renamed from: a */
    public final Class<?> f14649a;

    public bs7(Class<?> cls) {
        this.f14649a = cls;
    }

    @Override // p000.tde, p000.g74
    public j74 getDescription() {
        return j74.createSuiteDescription(this.f14649a);
    }

    @Override // p000.tde
    public void run(bde bdeVar) {
        bdeVar.fireTestIgnored(getDescription());
    }
}
