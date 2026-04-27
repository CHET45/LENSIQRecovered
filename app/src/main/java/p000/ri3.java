package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class ri3 {

    /* JADX INFO: renamed from: a */
    public final qi3 f78373a;

    /* JADX INFO: renamed from: b */
    public final String f78374b;

    /* JADX INFO: renamed from: c */
    public final String f78375c;

    /* JADX INFO: renamed from: d */
    public final boolean f78376d;

    public ri3(qi3 qi3Var, String str, String str2, boolean z) {
        this.f78373a = qi3Var;
        this.f78374b = str;
        this.f78375c = str2;
        this.f78376d = z;
    }

    public qi3 getDatabaseId() {
        return this.f78373a;
    }

    public String getHost() {
        return this.f78375c;
    }

    public String getPersistenceKey() {
        return this.f78374b;
    }

    public boolean isSslEnabled() {
        return this.f78376d;
    }

    public String toString() {
        return "DatabaseInfo(databaseId:" + this.f78373a + " host:" + this.f78375c + c0b.f15434d;
    }
}
