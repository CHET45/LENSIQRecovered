package p000;

/* JADX INFO: loaded from: classes7.dex */
public class cd2 {

    /* JADX INFO: renamed from: f */
    public static final String f16274f = "...";

    /* JADX INFO: renamed from: g */
    public static final String f16275g = "]";

    /* JADX INFO: renamed from: h */
    public static final String f16276h = "[";

    /* JADX INFO: renamed from: a */
    public int f16277a;

    /* JADX INFO: renamed from: b */
    public String f16278b;

    /* JADX INFO: renamed from: c */
    public String f16279c;

    /* JADX INFO: renamed from: d */
    public int f16280d;

    /* JADX INFO: renamed from: e */
    public int f16281e;

    public cd2(int i, String str, String str2) {
        this.f16277a = i;
        this.f16278b = str;
        this.f16279c = str2;
    }

    private boolean areStringsEqual() {
        return this.f16278b.equals(this.f16279c);
    }

    private String compactString(String str) {
        String str2 = "[" + str.substring(this.f16280d, (str.length() - this.f16281e) + 1) + "]";
        if (this.f16280d > 0) {
            str2 = computeCommonPrefix() + str2;
        }
        if (this.f16281e <= 0) {
            return str2;
        }
        return str2 + computeCommonSuffix();
    }

    private String computeCommonPrefix() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f16280d > this.f16277a ? "..." : "");
        sb.append(this.f16278b.substring(Math.max(0, this.f16280d - this.f16277a), this.f16280d));
        return sb.toString();
    }

    private String computeCommonSuffix() {
        int iMin = Math.min((this.f16278b.length() - this.f16281e) + 1 + this.f16277a, this.f16278b.length());
        StringBuilder sb = new StringBuilder();
        String str = this.f16278b;
        sb.append(str.substring((str.length() - this.f16281e) + 1, iMin));
        sb.append((this.f16278b.length() - this.f16281e) + 1 < this.f16278b.length() - this.f16277a ? "..." : "");
        return sb.toString();
    }

    private void findCommonPrefix() {
        this.f16280d = 0;
        int iMin = Math.min(this.f16278b.length(), this.f16279c.length());
        while (true) {
            int i = this.f16280d;
            if (i >= iMin || this.f16278b.charAt(i) != this.f16279c.charAt(this.f16280d)) {
                return;
            } else {
                this.f16280d++;
            }
        }
    }

    private void findCommonSuffix() {
        int length = this.f16278b.length() - 1;
        int length2 = this.f16279c.length() - 1;
        while (true) {
            int i = this.f16280d;
            if (length2 < i || length < i || this.f16278b.charAt(length) != this.f16279c.charAt(length2)) {
                break;
            }
            length2--;
            length--;
        }
        this.f16281e = this.f16278b.length() - length;
    }

    public String compact(String str) {
        if (this.f16278b == null || this.f16279c == null || areStringsEqual()) {
            return p80.format(str, this.f16278b, this.f16279c);
        }
        findCommonPrefix();
        findCommonSuffix();
        return p80.format(str, compactString(this.f16278b), compactString(this.f16279c));
    }
}
