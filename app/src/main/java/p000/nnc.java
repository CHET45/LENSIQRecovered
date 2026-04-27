package p000;

import com.blankj.utilcode.util.C2473f;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@nx4
public final class nnc extends qsh {

    /* JADX INFO: renamed from: e */
    public static final char[] f65083e = {'+'};

    /* JADX INFO: renamed from: f */
    public static final char[] f65084f = "0123456789ABCDEF".toCharArray();

    /* JADX INFO: renamed from: c */
    public final boolean f65085c;

    /* JADX INFO: renamed from: d */
    public final boolean[] f65086d;

    public nnc(String safeChars, boolean plusForSpace) {
        v7d.checkNotNull(safeChars);
        if (safeChars.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String str = safeChars + "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        if (plusForSpace && str.contains(C2473f.f17566z)) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.f65085c = plusForSpace;
        this.f65086d = createSafeOctets(str);
    }

    private static boolean[] createSafeOctets(String safeChars) {
        char[] charArray = safeChars.toCharArray();
        int iMax = -1;
        for (char c : charArray) {
            iMax = Math.max((int) c, iMax);
        }
        boolean[] zArr = new boolean[iMax + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    @Override // p000.qsh
    @wx1
    /* JADX INFO: renamed from: b */
    public char[] mo16625b(int cp) {
        boolean[] zArr = this.f65086d;
        if (cp < zArr.length && zArr[cp]) {
            return null;
        }
        if (cp == 32 && this.f65085c) {
            return f65083e;
        }
        if (cp <= 127) {
            char[] cArr = f65084f;
            return new char[]{'%', cArr[cp >>> 4], cArr[cp & 15]};
        }
        if (cp <= 2047) {
            char[] cArr2 = f65084f;
            return new char[]{'%', cArr2[(cp >>> 10) | 12], cArr2[(cp >>> 6) & 15], '%', cArr2[((cp >>> 4) & 3) | 8], cArr2[cp & 15]};
        }
        if (cp <= 65535) {
            char[] cArr3 = f65084f;
            return new char[]{'%', 'E', cArr3[cp >>> 12], '%', cArr3[((cp >>> 10) & 3) | 8], cArr3[(cp >>> 6) & 15], '%', cArr3[((cp >>> 4) & 3) | 8], cArr3[cp & 15]};
        }
        if (cp <= 1114111) {
            char[] cArr4 = f65084f;
            return new char[]{'%', 'F', cArr4[(cp >>> 18) & 7], '%', cArr4[((cp >>> 16) & 3) | 8], cArr4[(cp >>> 12) & 15], '%', cArr4[((cp >>> 10) & 3) | 8], cArr4[(cp >>> 6) & 15], '%', cArr4[((cp >>> 4) & 3) | 8], cArr4[cp & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + cp);
    }

    @Override // p000.qsh
    /* JADX INFO: renamed from: d */
    public int mo18043d(CharSequence csq, int index, int end) {
        v7d.checkNotNull(csq);
        while (index < end) {
            char cCharAt = csq.charAt(index);
            boolean[] zArr = this.f65086d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                break;
            }
            index++;
        }
        return index;
    }

    @Override // p000.qsh, p000.l55
    public String escape(String s) {
        v7d.checkNotNull(s);
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = s.charAt(i);
            boolean[] zArr = this.f65086d;
            if (cCharAt >= zArr.length || !zArr[cCharAt]) {
                return m20650c(s, i);
            }
        }
        return s;
    }
}
