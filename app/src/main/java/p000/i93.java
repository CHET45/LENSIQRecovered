package p000;

/* JADX INFO: loaded from: classes7.dex */
public class i93 {

    /* JADX INFO: renamed from: a */
    public String f46093a;

    /* JADX INFO: renamed from: b */
    public String f46094b;

    /* JADX INFO: renamed from: a */
    public void m12872a(@efb String str, @efb String str2) {
        this.f46093a = str;
        this.f46094b = str2;
    }

    @efb
    public String key() {
        return this.f46093a;
    }

    @efb
    public i93 mutate() {
        i93 i93Var = new i93();
        i93Var.m12872a(this.f46093a, this.f46094b);
        return i93Var;
    }

    public String toString() {
        return "CssProperty{key='" + this.f46093a + "', value='" + this.f46094b + "'}";
    }

    @efb
    public String value() {
        return this.f46094b;
    }
}
