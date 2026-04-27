package p000;

/* JADX INFO: loaded from: classes8.dex */
public final class yu5 extends o3e {

    /* JADX INFO: renamed from: a */
    public final o3e f102987a;

    /* JADX INFO: renamed from: b */
    public final ru5 f102988b;

    public yu5(o3e o3eVar, ru5 ru5Var) {
        this.f102987a = o3eVar;
        this.f102988b = ru5Var;
    }

    @Override // p000.o3e
    public tde getRunner() {
        try {
            tde runner = this.f102987a.getRunner();
            this.f102988b.apply(runner);
            return runner;
        } catch (aeb unused) {
            return new h55(ru5.class, new Exception(String.format("No tests found matching %s from %s", this.f102988b.describe(), this.f102987a.toString())));
        }
    }
}
