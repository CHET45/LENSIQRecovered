package p000;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public final class o50 {

    /* JADX INFO: renamed from: b */
    public static final char[][] f66487b = (char[][]) Array.newInstance((Class<?>) Character.TYPE, 0, 0);

    /* JADX INFO: renamed from: a */
    public final char[][] f66488a;

    private o50(char[][] replacementArray) {
        this.f66488a = replacementArray;
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public static char[][] m18354a(Map<Character, String> map) {
        v7d.checkNotNull(map);
        if (map.isEmpty()) {
            return f66487b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1][];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }

    public static o50 create(Map<Character, String> replacements) {
        return new o50(m18354a(replacements));
    }

    /* JADX INFO: renamed from: b */
    public char[][] m18355b() {
        return this.f66488a;
    }
}
