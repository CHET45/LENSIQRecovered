package p000;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d99 {

    /* JADX INFO: renamed from: c */
    public static final String f28832c = "   ";

    /* JADX INFO: renamed from: d */
    public static final String f28833d = "";

    /* JADX INFO: renamed from: a */
    public final d99 f28834a;

    /* JADX INFO: renamed from: b */
    public final String f28835b;

    public d99(d99 d99Var) {
        this.f28834a = d99Var;
        if (d99Var == null) {
            this.f28835b = "";
            return;
        }
        this.f28835b = d99Var.f28835b + f28832c;
    }

    public String getIndent() {
        return this.f28835b;
    }

    public d99 getParent() {
        return this.f28834a;
    }
}
