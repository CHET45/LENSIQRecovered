package p000;

/* JADX INFO: loaded from: classes3.dex */
public class rhg {

    /* JADX INFO: renamed from: a */
    public final C12096a[] f78328a;

    /* JADX INFO: renamed from: b */
    public final int f78329b;

    /* JADX INFO: renamed from: rhg$a */
    public static class C12096a {

        /* JADX INFO: renamed from: a */
        public final String f78330a;

        /* JADX INFO: renamed from: b */
        public final char[] f78331b;

        /* JADX INFO: renamed from: c */
        public final int f78332c;

        public C12096a(String str, int i) {
            this.f78330a = str;
            this.f78331b = str.toCharArray();
            this.f78332c = i;
        }
    }

    public rhg(int i) {
        this.f78329b = i - 1;
        this.f78328a = new C12096a[i];
        addSymbol("$ref", 0, 4, 1185263);
        addSymbol(fh8.f36584c, 0, 5, 62680954);
    }

    public static int hash(char[] cArr, int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        while (i3 < i2) {
            i4 = (i4 * 31) + cArr[i];
            i3++;
            i++;
        }
        return i4;
    }

    private static String subString(String str, int i, int i2) {
        char[] cArr = new char[i2];
        str.getChars(i, i2 + i, cArr, 0);
        return new String(cArr);
    }

    public String addSymbol(char[] cArr, int i, int i2, int i3) {
        int i4 = this.f78329b & i3;
        C12096a c12096a = this.f78328a[i4];
        if (c12096a == null) {
            String strIntern = new String(cArr, i, i2).intern();
            this.f78328a[i4] = new C12096a(strIntern, i3);
            return strIntern;
        }
        if (i3 == c12096a.f78332c && i2 == c12096a.f78331b.length) {
            for (int i5 = 0; i5 < i2; i5++) {
                if (cArr[i + i5] == c12096a.f78331b[i5]) {
                }
            }
            return c12096a.f78330a;
        }
        return new String(cArr, i, i2);
    }

    public String addSymbol(String str, int i, int i2, int i3) {
        int i4 = this.f78329b & i3;
        C12096a c12096a = this.f78328a[i4];
        if (c12096a != null) {
            if (i3 == c12096a.f78332c && i2 == c12096a.f78331b.length && str.regionMatches(i, c12096a.f78330a, 0, i2)) {
                return c12096a.f78330a;
            }
            return subString(str, i, i2);
        }
        if (i2 != str.length()) {
            str = subString(str, i, i2);
        }
        String strIntern = str.intern();
        this.f78328a[i4] = new C12096a(strIntern, i3);
        return strIntern;
    }
}
