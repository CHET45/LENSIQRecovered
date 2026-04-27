package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class ru0 {

    /* JADX INFO: renamed from: e */
    public static final int f79572e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f79573f = 1;

    /* JADX INFO: renamed from: g */
    public static final int f79574g = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: a */
    public final String f79575a;

    /* JADX INFO: renamed from: b */
    public final String f79576b;

    /* JADX INFO: renamed from: c */
    public final int f79577c;

    /* JADX INFO: renamed from: d */
    public final int f79578d;

    public ru0(String str) {
        this(str, str, Integer.MIN_VALUE, 1);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ru0)) {
            return false;
        }
        ru0 ru0Var = (ru0) obj;
        return this.f79577c == ru0Var.f79577c && this.f79578d == ru0Var.f79578d && okb.equal(this.f79575a, ru0Var.f79575a) && okb.equal(this.f79576b, ru0Var.f79576b);
    }

    public int hashCode() {
        return okb.hashCode(this.f79575a, this.f79576b, Integer.valueOf(this.f79577c), Integer.valueOf(this.f79578d));
    }

    public ru0(String str, String str2, int i, int i2) {
        this.f79575a = str;
        this.f79576b = str2;
        this.f79577c = i;
        this.f79578d = i2;
    }
}
