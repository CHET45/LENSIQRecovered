package p000;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class pva {
    private pva() {
    }

    public static boolean matches(@hib String str, @efb String str2) {
        if (str == null) {
            return false;
        }
        return mimeTypeAgainstFilter(str.split(pj4.f71071b), str2.split(pj4.f71071b));
    }

    @efb
    public static String[] matchesMany(@hib String[] strArr, @efb String str) {
        if (strArr == null) {
            return new String[0];
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(pj4.f71071b);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split(pj4.f71071b), strArrSplit)) {
                arrayList.add(str2);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static boolean mimeTypeAgainstFilter(@efb String[] strArr, @efb String[] strArr2) {
        if (strArr2.length != 2) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Must be type/subtype.");
        }
        if (strArr2[0].isEmpty() || strArr2[1].isEmpty()) {
            throw new IllegalArgumentException("Ill-formatted MIME type filter. Type or subtype empty.");
        }
        if (strArr.length != 2) {
            return false;
        }
        if ("*".equals(strArr2[0]) || strArr2[0].equals(strArr[0])) {
            return "*".equals(strArr2[1]) || strArr2[1].equals(strArr[1]);
        }
        return false;
    }

    @hib
    public static String matches(@hib String str, @efb String[] strArr) {
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(pj4.f71071b);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(strArrSplit, str2.split(pj4.f71071b))) {
                return str2;
            }
        }
        return null;
    }

    @hib
    public static String matches(@hib String[] strArr, @efb String str) {
        if (strArr == null) {
            return null;
        }
        String[] strArrSplit = str.split(pj4.f71071b);
        for (String str2 : strArr) {
            if (mimeTypeAgainstFilter(str2.split(pj4.f71071b), strArrSplit)) {
                return str2;
            }
        }
        return null;
    }
}
