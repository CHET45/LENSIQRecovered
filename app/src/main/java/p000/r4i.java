package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class r4i implements fpg {

    /* JADX INFO: renamed from: r4i$a */
    public class C11890a extends f3g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ f3g f77037a;

        public C11890a(f3g f3gVar) throws Throwable {
            this.f77037a = f3gVar;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            this.f77037a.evaluate();
            r4i.this.mo21016a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo21016a() throws Throwable {
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        return new C11890a(f3gVar);
    }
}
