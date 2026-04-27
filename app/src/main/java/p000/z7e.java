package p000;

/* JADX INFO: loaded from: classes8.dex */
public class z7e {

    /* JADX INFO: renamed from: z7e$a */
    public static class C16027a extends lmh<ybd> {

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f104335c;

        public C16027a(int i) {
            this.f104335c = i;
        }

        @Override // p000.ixe
        public void describeTo(i74 i74Var) {
            i74Var.appendText("has " + this.f104335c + " failures");
        }

        @Override // p000.lmh
        public boolean matchesSafely(ybd ybdVar) {
            return ybdVar.failureCount() == this.f104335c;
        }
    }

    /* JADX INFO: renamed from: z7e$b */
    public static class C16028b extends wr0<Object> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f104336a;

        public C16028b(String str) {
            this.f104336a = str;
        }

        @Override // p000.ixe
        public void describeTo(i74 i74Var) {
            i74Var.appendText("has single failure containing " + this.f104336a);
        }

        @Override // p000.yv9
        public boolean matches(Object obj) {
            return obj.toString().contains(this.f104336a) && z7e.failureCountIs(1).matches(obj);
        }
    }

    /* JADX INFO: renamed from: z7e$c */
    public static class C16029c extends wr0<ybd> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f104337a;

        public C16029c(String str) {
            this.f104337a = str;
        }

        @Override // p000.ixe
        public void describeTo(i74 i74Var) {
            i74Var.appendText("has failure containing " + this.f104337a);
        }

        @Override // p000.yv9
        public boolean matches(Object obj) {
            return obj.toString().contains(this.f104337a);
        }
    }

    public static yv9<ybd> failureCountIs(int i) {
        return new C16027a(i);
    }

    public static yv9<ybd> hasFailureContaining(String str) {
        return new C16029c(str);
    }

    public static yv9<Object> hasSingleFailureContaining(String str) {
        return new C16028b(str);
    }

    public static yv9<ybd> isSuccessful() {
        return failureCountIs(0);
    }
}
