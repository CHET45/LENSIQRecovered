package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public abstract class qsh extends l55 {

    /* JADX INFO: renamed from: b */
    public static final int f75554b = 32;

    /* JADX INFO: renamed from: a */
    public static int m20649a(CharSequence seq, int index, int end) {
        v7d.checkNotNull(seq);
        if (index >= end) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i = index + 1;
        char cCharAt = seq.charAt(index);
        if (cCharAt < 55296 || cCharAt > 57343) {
            return cCharAt;
        }
        if (cCharAt > 56319) {
            throw new IllegalArgumentException("Unexpected low surrogate character '" + cCharAt + "' with value " + ((int) cCharAt) + " at index " + index + " in '" + ((Object) seq) + "'");
        }
        if (i == end) {
            return -cCharAt;
        }
        char cCharAt2 = seq.charAt(i);
        if (Character.isLowSurrogate(cCharAt2)) {
            return Character.toCodePoint(cCharAt, cCharAt2);
        }
        throw new IllegalArgumentException("Expected low surrogate but got char '" + cCharAt2 + "' with value " + ((int) cCharAt2) + " at index " + i + " in '" + ((Object) seq) + "'");
    }

    private static char[] growBuffer(char[] dest, int index, int size) {
        if (size < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr = new char[size];
        if (index > 0) {
            System.arraycopy(dest, 0, cArr, 0, index);
        }
        return cArr;
    }

    @wx1
    /* JADX INFO: renamed from: b */
    public abstract char[] mo16625b(int cp);

    /* JADX INFO: renamed from: c */
    public final String m20650c(String s, int index) {
        int length = s.length();
        char[] cArrM22888a = twc.m22888a();
        int i = 0;
        int length2 = 0;
        while (index < length) {
            int iM20649a = m20649a(s, index, length);
            if (iM20649a < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] cArrMo16625b = mo16625b(iM20649a);
            int i2 = (Character.isSupplementaryCodePoint(iM20649a) ? 2 : 1) + index;
            if (cArrMo16625b != null) {
                int i3 = index - i;
                int i4 = length2 + i3;
                int length3 = cArrMo16625b.length + i4;
                if (cArrM22888a.length < length3) {
                    cArrM22888a = growBuffer(cArrM22888a, length2, length3 + (length - index) + 32);
                }
                if (i3 > 0) {
                    s.getChars(i, index, cArrM22888a, length2);
                    length2 = i4;
                }
                if (cArrMo16625b.length > 0) {
                    System.arraycopy(cArrMo16625b, 0, cArrM22888a, length2, cArrMo16625b.length);
                    length2 += cArrMo16625b.length;
                }
                i = i2;
            }
            index = mo18043d(s, i2, length);
        }
        int i5 = length - i;
        if (i5 > 0) {
            int i6 = i5 + length2;
            if (cArrM22888a.length < i6) {
                cArrM22888a = growBuffer(cArrM22888a, length2, i6);
            }
            s.getChars(i, length, cArrM22888a, length2);
            length2 = i6;
        }
        return new String(cArrM22888a, 0, length2);
    }

    /* JADX INFO: renamed from: d */
    public int mo18043d(CharSequence csq, int start, int end) {
        while (start < end) {
            int iM20649a = m20649a(csq, start, end);
            if (iM20649a < 0 || mo16625b(iM20649a) != null) {
                break;
            }
            start += Character.isSupplementaryCodePoint(iM20649a) ? 2 : 1;
        }
        return start;
    }

    @Override // p000.l55
    public String escape(String string) {
        v7d.checkNotNull(string);
        int length = string.length();
        int iMo18043d = mo18043d(string, 0, length);
        return iMo18043d == length ? string : m20650c(string, iMo18043d);
    }
}
