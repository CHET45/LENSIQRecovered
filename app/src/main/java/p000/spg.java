package p000;

/* JADX INFO: loaded from: classes8.dex */
@Deprecated
public class spg implements wua {

    /* JADX INFO: renamed from: spg$a */
    public class C12741a extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ow6 f82565a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ f3g f82566b;

        public C12741a(ow6 ow6Var, f3g f3gVar) throws Throwable {
            this.f82565a = ow6Var;
            this.f82566b = f3gVar;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            spg.this.starting(this.f82565a);
            try {
                try {
                    try {
                        this.f82566b.evaluate();
                        spg.this.succeeded(this.f82565a);
                        spg.this.finished(this.f82565a);
                    } catch (g90 e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    spg.this.failed(th, this.f82565a);
                    throw th;
                }
            } catch (Throwable th2) {
                spg.this.finished(this.f82565a);
                throw th2;
            }
        }
    }

    @Override // p000.wua
    public f3g apply(f3g f3gVar, ow6 ow6Var, Object obj) {
        return new C12741a(ow6Var, f3gVar);
    }

    public void failed(Throwable th, ow6 ow6Var) {
    }

    public void finished(ow6 ow6Var) {
    }

    public void starting(ow6 ow6Var) {
    }

    public void succeeded(ow6 ow6Var) {
    }
}
