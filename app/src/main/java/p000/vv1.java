package p000;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public final class vv1 {

    /* JADX INFO: renamed from: b */
    public int f92332b = -1;

    /* JADX INFO: renamed from: a */
    public final Map<Character, String> f92331a = new HashMap();

    /* JADX INFO: renamed from: vv1$a */
    public static class C14269a extends uv1 {

        /* JADX INFO: renamed from: c */
        public final char[][] f92333c;

        /* JADX INFO: renamed from: d */
        public final int f92334d;

        public C14269a(char[][] replacements) {
            this.f92333c = replacements;
            this.f92334d = replacements.length;
        }

        @Override // p000.uv1
        @wx1
        /* JADX INFO: renamed from: a */
        public char[] mo16624a(char c) {
            if (c < this.f92334d) {
                return this.f92333c[c];
            }
            return null;
        }

        @Override // p000.uv1, p000.l55
        public String escape(String s) {
            int length = s.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = s.charAt(i);
                char[][] cArr = this.f92333c;
                if (cCharAt < cArr.length && cArr[cCharAt] != null) {
                    return m23590b(s, i);
                }
            }
            return s;
        }
    }

    @op1
    public vv1 addEscape(char c, String r) {
        this.f92331a.put(Character.valueOf(c), (String) v7d.checkNotNull(r));
        if (c > this.f92332b) {
            this.f92332b = c;
        }
        return this;
    }

    @op1
    public vv1 addEscapes(char[] cs, String r) {
        v7d.checkNotNull(r);
        for (char c : cs) {
            addEscape(c, r);
        }
        return this;
    }

    public char[][] toArray() {
        char[][] cArr = new char[this.f92332b + 1][];
        for (Map.Entry<Character, String> entry : this.f92331a.entrySet()) {
            cArr[entry.getKey().charValue()] = entry.getValue().toCharArray();
        }
        return cArr;
    }

    public l55 toEscaper() {
        return new C14269a(toArray());
    }
}
