package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class iyh {

    /* JADX INFO: renamed from: e */
    public static final String f48915e = "RepresentationID";

    /* JADX INFO: renamed from: f */
    public static final String f48916f = "Number";

    /* JADX INFO: renamed from: g */
    public static final String f48917g = "Bandwidth";

    /* JADX INFO: renamed from: h */
    public static final String f48918h = "Time";

    /* JADX INFO: renamed from: i */
    public static final String f48919i = "$$";

    /* JADX INFO: renamed from: j */
    public static final String f48920j = "%01d";

    /* JADX INFO: renamed from: k */
    public static final int f48921k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f48922l = 2;

    /* JADX INFO: renamed from: m */
    public static final int f48923m = 3;

    /* JADX INFO: renamed from: n */
    public static final int f48924n = 4;

    /* JADX INFO: renamed from: a */
    public final String[] f48925a;

    /* JADX INFO: renamed from: b */
    public final int[] f48926b;

    /* JADX INFO: renamed from: c */
    public final String[] f48927c;

    /* JADX INFO: renamed from: d */
    public final int f48928d;

    private iyh(String[] strArr, int[] iArr, String[] strArr2, int i) {
        this.f48925a = strArr;
        this.f48926b = iArr;
        this.f48927c = strArr2;
        this.f48928d = i;
    }

    public static iyh compile(String str) {
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        return new iyh(strArr, iArr, strArr2, parseTemplate(str, strArr, iArr, strArr2));
    }

    private static int parseTemplate(String str, String[] strArr, int[] iArr, String[] strArr2) {
        String strSubstring;
        strArr[0] = "";
        int length = 0;
        int i = 0;
        while (length < str.length()) {
            int iIndexOf = str.indexOf("$", length);
            if (iIndexOf == -1) {
                strArr[i] = strArr[i] + str.substring(length);
                length = str.length();
            } else if (iIndexOf != length) {
                strArr[i] = strArr[i] + str.substring(length, iIndexOf);
                length = iIndexOf;
            } else if (str.startsWith(f48919i, length)) {
                strArr[i] = strArr[i] + "$";
                length += 2;
            } else {
                int i2 = length + 1;
                int iIndexOf2 = str.indexOf("$", i2);
                String strSubstring2 = str.substring(i2, iIndexOf2);
                if (strSubstring2.equals(f48915e)) {
                    iArr[i] = 1;
                } else {
                    int iIndexOf3 = strSubstring2.indexOf("%0");
                    if (iIndexOf3 != -1) {
                        strSubstring = strSubstring2.substring(iIndexOf3);
                        if (!strSubstring.endsWith("d") && !strSubstring.endsWith("x") && !strSubstring.endsWith("X")) {
                            strSubstring = strSubstring + "d";
                        }
                        strSubstring2 = strSubstring2.substring(0, iIndexOf3);
                    } else {
                        strSubstring = f48920j;
                    }
                    strSubstring2.hashCode();
                    switch (strSubstring2) {
                        case "Number":
                            iArr[i] = 2;
                            break;
                        case "Time":
                            iArr[i] = 4;
                            break;
                        case "Bandwidth":
                            iArr[i] = 3;
                            break;
                        default:
                            throw new IllegalArgumentException("Invalid template: " + str);
                    }
                    strArr2[i] = strSubstring;
                }
                i++;
                strArr[i] = "";
                length = iIndexOf2 + 1;
            }
        }
        return i;
    }

    public String buildUri(String str, long j, int i, long j2) {
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (true) {
            int i3 = this.f48928d;
            if (i2 >= i3) {
                sb.append(this.f48925a[i3]);
                return sb.toString();
            }
            sb.append(this.f48925a[i2]);
            int i4 = this.f48926b[i2];
            if (i4 == 1) {
                sb.append(str);
            } else if (i4 == 2) {
                sb.append(String.format(Locale.US, this.f48927c[i2], Long.valueOf(j)));
            } else if (i4 == 3) {
                sb.append(String.format(Locale.US, this.f48927c[i2], Integer.valueOf(i)));
            } else if (i4 == 4) {
                sb.append(String.format(Locale.US, this.f48927c[i2], Long.valueOf(j2)));
            }
            i2++;
        }
    }
}
