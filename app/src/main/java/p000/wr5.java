package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class wr5 extends zs0<wr5> {

    /* JADX INFO: renamed from: b */
    public static final wr5 f95193b = fromSingleSegment(ci4.f16605b);

    /* JADX INFO: renamed from: c */
    public static final wr5 f95194c = new wr5(Collections.emptyList());

    private wr5(List<String> list) {
        super(list);
    }

    public static wr5 fromSegments(List<String> list) {
        return list.isEmpty() ? f95194c : new wr5(list);
    }

    public static wr5 fromServerFormat(String str) {
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        while (i < str.length()) {
            char cCharAt = str.charAt(i);
            if (cCharAt == '\\') {
                i++;
                if (i == str.length()) {
                    throw new IllegalArgumentException("Trailing escape character is not allowed");
                }
                sb.append(str.charAt(i));
            } else if (cCharAt == '.') {
                if (z) {
                    sb.append(cCharAt);
                } else {
                    String string = sb.toString();
                    if (string.isEmpty()) {
                        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
                    }
                    StringBuilder sb2 = new StringBuilder();
                    arrayList.add(string);
                    sb = sb2;
                }
            } else if (cCharAt == '`') {
                z = !z;
            } else {
                sb.append(cCharAt);
            }
            i++;
        }
        String string2 = sb.toString();
        if (!string2.isEmpty()) {
            arrayList.add(string2);
            return new wr5(arrayList);
        }
        throw new IllegalArgumentException("Invalid field path (" + str + "). Paths must not be empty, begin with '.', end with '.', or contain '..'");
    }

    public static wr5 fromSingleSegment(String str) {
        return new wr5(Collections.singletonList(str));
    }

    private static boolean isValidIdentifier(String str) {
        if (str.isEmpty()) {
            return false;
        }
        char cCharAt = str.charAt(0);
        if (cCharAt != '_' && ((cCharAt < 'a' || cCharAt > 'z') && (cCharAt < 'A' || cCharAt > 'Z'))) {
            return false;
        }
        for (int i = 1; i < str.length(); i++) {
            char cCharAt2 = str.charAt(i);
            if (cCharAt2 != '_' && ((cCharAt2 < 'a' || cCharAt2 > 'z') && ((cCharAt2 < 'A' || cCharAt2 > 'Z') && (cCharAt2 < '0' || cCharAt2 > '9')))) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.zs0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public wr5 mo21762a(List<String> list) {
        return new wr5(list);
    }

    @Override // p000.zs0
    public String canonicalString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f105873a.size(); i++) {
            if (i > 0) {
                sb.append(".");
            }
            String strReplace = this.f105873a.get(i).replace(nk1.f64796h, "\\\\").replace("`", "\\`");
            if (!isValidIdentifier(strReplace)) {
                strReplace = '`' + strReplace + '`';
            }
            sb.append(strReplace);
        }
        return sb.toString();
    }

    public boolean isKeyField() {
        return equals(f95193b);
    }
}
