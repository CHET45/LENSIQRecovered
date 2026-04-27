package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public abstract class n50 extends uv1 {

    /* JADX INFO: renamed from: c */
    public final char[][] f63311c;

    /* JADX INFO: renamed from: d */
    public final int f63312d;

    /* JADX INFO: renamed from: e */
    public final char f63313e;

    /* JADX INFO: renamed from: f */
    public final char f63314f;

    public n50(Map<Character, String> replacementMap, char safeMin, char safeMax) {
        this(o50.create(replacementMap), safeMin, safeMax);
    }

    @Override // p000.uv1
    @wx1
    /* JADX INFO: renamed from: a */
    public final char[] mo16624a(char c) {
        char[] cArr;
        if (c < this.f63312d && (cArr = this.f63311c[c]) != null) {
            return cArr;
        }
        if (c < this.f63313e || c > this.f63314f) {
            return mo16627c(c);
        }
        return null;
    }

    @wx1
    /* JADX INFO: renamed from: c */
    public abstract char[] mo16627c(char c);

    @Override // p000.uv1, p000.l55
    public final String escape(String s) {
        v7d.checkNotNull(s);
        for (int i = 0; i < s.length(); i++) {
            char cCharAt = s.charAt(i);
            if ((cCharAt < this.f63312d && this.f63311c[cCharAt] != null) || cCharAt > this.f63314f || cCharAt < this.f63313e) {
                return m23590b(s, i);
            }
        }
        return s;
    }

    public n50(o50 escaperMap, char safeMin, char safeMax) {
        v7d.checkNotNull(escaperMap);
        char[][] cArrM18355b = escaperMap.m18355b();
        this.f63311c = cArrM18355b;
        this.f63312d = cArrM18355b.length;
        if (safeMax < safeMin) {
            safeMax = 0;
            safeMin = 65535;
        }
        this.f63313e = safeMin;
        this.f63314f = safeMax;
    }
}
