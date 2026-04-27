package p000;

/* JADX INFO: loaded from: classes7.dex */
public class fd2 extends t80 {

    /* JADX INFO: renamed from: c */
    public static final int f36155c = 20;
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a */
    public String f36156a;

    /* JADX INFO: renamed from: b */
    public String f36157b;

    public fd2(String str, String str2, String str3) {
        super(str);
        this.f36156a = str2;
        this.f36157b = str3;
    }

    public String getActual() {
        return this.f36157b;
    }

    public String getExpected() {
        return this.f36156a;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return new cd2(20, this.f36156a, this.f36157b).compact(super.getMessage());
    }
}
