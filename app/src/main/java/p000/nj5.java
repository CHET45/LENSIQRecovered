package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class nj5 implements fpg {

    /* JADX INFO: renamed from: nj5$a */
    public class C9904a extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f3g f64749a;

        public C9904a(f3g f3gVar) throws Throwable {
            this.f64749a = f3gVar;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            nj5.this.before();
            try {
                this.f64749a.evaluate();
            } finally {
                nj5.this.after();
            }
        }
    }

    private f3g statement(f3g f3gVar) {
        return new C9904a(f3gVar);
    }

    public void after() {
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        return statement(f3gVar);
    }

    public void before() throws Throwable {
    }
}
