package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class qi3 implements Comparable<qi3> {

    /* JADX INFO: renamed from: c */
    public static final String f74487c = "(default)";

    /* JADX INFO: renamed from: d */
    public static final qi3 f74488d = forDatabase("", "");

    /* JADX INFO: renamed from: a */
    public final String f74489a;

    /* JADX INFO: renamed from: b */
    public final String f74490b;

    private qi3(String str, String str2) {
        this.f74489a = str;
        this.f74490b = str2;
    }

    public static qi3 forDatabase(String str, String str2) {
        return new qi3(str, str2);
    }

    public static qi3 forProject(String str) {
        return forDatabase(str, "(default)");
    }

    public static qi3 fromName(String str) {
        s6e s6eVarFromString = s6e.fromString(str);
        boolean z = false;
        if (s6eVarFromString.length() > 3 && s6eVarFromString.getSegment(0).equals("projects") && s6eVarFromString.getSegment(2).equals("databases")) {
            z = true;
        }
        r80.hardAssert(z, "Tried to parse an invalid resource name: %s", s6eVarFromString);
        return new qi3(s6eVarFromString.getSegment(1), s6eVarFromString.getSegment(3));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qi3.class != obj.getClass()) {
            return false;
        }
        qi3 qi3Var = (qi3) obj;
        return this.f74489a.equals(qi3Var.f74489a) && this.f74490b.equals(qi3Var.f74490b);
    }

    public String getDatabaseId() {
        return this.f74490b;
    }

    public String getProjectId() {
        return this.f74489a;
    }

    public int hashCode() {
        return (this.f74489a.hashCode() * 31) + this.f74490b.hashCode();
    }

    public String toString() {
        return "DatabaseId(" + this.f74489a + ", " + this.f74490b + c0b.f15434d;
    }

    @Override // java.lang.Comparable
    public int compareTo(@efb qi3 qi3Var) {
        int iCompareTo = this.f74489a.compareTo(qi3Var.f74489a);
        return iCompareTo != 0 ? iCompareTo : this.f74490b.compareTo(qi3Var.f74490b);
    }
}
