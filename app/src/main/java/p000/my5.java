package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class my5 {

    /* JADX INFO: renamed from: a */
    @gib
    public final String f62780a;

    /* JADX INFO: renamed from: b */
    @gib
    public final String f62781b;

    public my5(@gib String str, @gib String str2) {
        this.f62780a = str;
        this.f62781b = str2;
    }

    public static /* synthetic */ my5 copy$default(my5 my5Var, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = my5Var.f62780a;
        }
        if ((i & 2) != 0) {
            str2 = my5Var.f62781b;
        }
        return my5Var.copy(str, str2);
    }

    @gib
    public final String component1() {
        return this.f62780a;
    }

    @gib
    public final String component2() {
        return this.f62781b;
    }

    @yfb
    public final my5 copy(@gib String str, @gib String str2) {
        return new my5(str, str2);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my5)) {
            return false;
        }
        my5 my5Var = (my5) obj;
        return md8.areEqual(this.f62780a, my5Var.f62780a) && md8.areEqual(this.f62781b, my5Var.f62781b);
    }

    @gib
    public final String getAuthToken() {
        return this.f62781b;
    }

    @gib
    public final String getFid() {
        return this.f62780a;
    }

    public int hashCode() {
        String str = this.f62780a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f62781b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f62780a + ", authToken=" + this.f62781b + ')';
    }
}
