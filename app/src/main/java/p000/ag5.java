package p000;

/* JADX INFO: loaded from: classes8.dex */
public class ag5 implements fpg {

    /* JADX INFO: renamed from: a */
    public final bg5 f1388a = new bg5();

    /* JADX INFO: renamed from: b */
    public String f1389b = "Expected test to throw %s";

    /* JADX INFO: renamed from: ag5$a */
    public class C0217a extends f3g {

        /* JADX INFO: renamed from: a */
        public final f3g f1390a;

        public C0217a(f3g f3gVar) {
            this.f1390a = f3gVar;
        }

        @Override // p000.f3g
        public void evaluate() throws Throwable {
            try {
                this.f1390a.evaluate();
                if (ag5.this.isAnyExceptionExpected()) {
                    ag5.this.failDueToMissingException();
                }
            } catch (Throwable th) {
                ag5.this.handleException(th);
            }
        }
    }

    private ag5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void failDueToMissingException() throws AssertionError {
        q80.fail(missingExceptionMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleException(Throwable th) throws Throwable {
        if (!isAnyExceptionExpected()) {
            throw th;
        }
        q80.assertThat(th, this.f1388a.m3164b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isAnyExceptionExpected() {
        return this.f1388a.m3165c();
    }

    private String missingExceptionMessage() {
        return String.format(this.f1389b, p7g.toString(this.f1388a.m3164b()));
    }

    public static ag5 none() {
        return new ag5();
    }

    @Override // p000.fpg
    public f3g apply(f3g f3gVar, j74 j74Var) {
        return new C0217a(f3gVar);
    }

    public void expect(yv9<?> yv9Var) {
        this.f1388a.m3163a(yv9Var);
    }

    public void expectCause(yv9<? extends Throwable> yv9Var) {
        expect(xyg.hasCause(yv9Var));
    }

    public void expectMessage(String str) {
        expectMessage(l03.containsString(str));
    }

    @Deprecated
    public ag5 handleAssertionErrors() {
        return this;
    }

    @Deprecated
    public ag5 handleAssumptionViolatedExceptions() {
        return this;
    }

    public ag5 reportMissingExceptionWithMessage(String str) {
        this.f1389b = str;
        return this;
    }

    public void expect(Class<? extends Throwable> cls) {
        expect(l03.instanceOf(cls));
    }

    public void expectMessage(yv9<String> yv9Var) {
        expect(zyg.hasMessage(yv9Var));
    }
}
