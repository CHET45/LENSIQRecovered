package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public abstract class p50 extends qsh {

    /* JADX INFO: renamed from: c */
    public final char[][] f69697c;

    /* JADX INFO: renamed from: d */
    public final int f69698d;

    /* JADX INFO: renamed from: e */
    public final int f69699e;

    /* JADX INFO: renamed from: f */
    public final int f69700f;

    /* JADX INFO: renamed from: g */
    public final char f69701g;

    /* JADX INFO: renamed from: h */
    public final char f69702h;

    public p50(Map<Character, String> replacementMap, int safeMin, int safeMax, String unsafeReplacement) {
        this(o50.create(replacementMap), safeMin, safeMax, unsafeReplacement);
    }

    @Override // p000.qsh
    @wx1
    /* JADX INFO: renamed from: b */
    public final char[] mo16625b(int cp) {
        char[] cArr;
        if (cp < this.f69698d && (cArr = this.f69697c[cp]) != null) {
            return cArr;
        }
        if (cp < this.f69699e || cp > this.f69700f) {
            return m19271e(cp);
        }
        return null;
    }

    @Override // p000.qsh
    /* JADX INFO: renamed from: d */
    public final int mo18043d(CharSequence csq, int index, int end) {
        while (index < end) {
            char cCharAt = csq.charAt(index);
            if ((cCharAt < this.f69698d && this.f69697c[cCharAt] != null) || cCharAt > this.f69702h || cCharAt < this.f69701g) {
                break;
            }
            index++;
        }
        return index;
    }

    @wx1
    /* JADX INFO: renamed from: e */
    public abstract char[] m19271e(int cp);

    @Override // p000.qsh, p000.l55
    public final String escape(String s) {
        v7d.checkNotNull(s);
        for (int i = 0; i < s.length(); i++) {
            char cCharAt = s.charAt(i);
            if ((cCharAt < this.f69698d && this.f69697c[cCharAt] != null) || cCharAt > this.f69702h || cCharAt < this.f69701g) {
                return m20650c(s, i);
            }
        }
        return s;
    }

    public p50(o50 escaperMap, int safeMin, int safeMax, String unsafeReplacement) {
        v7d.checkNotNull(escaperMap);
        char[][] cArrM18355b = escaperMap.m18355b();
        this.f69697c = cArrM18355b;
        this.f69698d = cArrM18355b.length;
        if (safeMax < safeMin) {
            safeMax = -1;
            safeMin = Integer.MAX_VALUE;
        }
        this.f69699e = safeMin;
        this.f69700f = safeMax;
        if (safeMin >= 55296) {
            this.f69701g = (char) 65535;
            this.f69702h = (char) 0;
        } else {
            this.f69701g = (char) safeMin;
            this.f69702h = (char) Math.min(safeMax, 55295);
        }
    }
}
