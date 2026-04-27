package p000;

/* JADX INFO: loaded from: classes.dex */
public class xk1 extends Exception {

    /* JADX INFO: renamed from: a */
    public final String f98250a;

    /* JADX INFO: renamed from: b */
    public final int f98251b;

    /* JADX INFO: renamed from: c */
    public final String f98252c;

    public xk1(String str, sk1 sk1Var) {
        this.f98250a = str;
        if (sk1Var != null) {
            this.f98252c = sk1Var.m22075c();
            this.f98251b = sk1Var.getLine();
        } else {
            this.f98252c = "unknown";
            this.f98251b = 0;
        }
    }

    public String reason() {
        return this.f98250a + " (" + this.f98252c + " at line " + this.f98251b + c0b.f15434d;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "CLParsingException (" + hashCode() + ") : " + reason();
    }
}
