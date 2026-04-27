package p000;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ux4
public abstract class uv1 extends l55 {

    /* JADX INFO: renamed from: b */
    public static final int f89193b = 2;

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
    /* JADX INFO: renamed from: a */
    public abstract char[] mo16624a(char c);

    /* JADX INFO: renamed from: b */
    public final String m23590b(String s, int index) {
        int length = s.length();
        char[] cArrM22888a = twc.m22888a();
        int length2 = cArrM22888a.length;
        int i = 0;
        int i2 = 0;
        while (index < length) {
            char[] cArrMo16624a = mo16624a(s.charAt(index));
            if (cArrMo16624a != null) {
                int length3 = cArrMo16624a.length;
                int i3 = index - i;
                int i4 = i2 + i3;
                int i5 = i4 + length3;
                if (length2 < i5) {
                    length2 = ((length - index) * 2) + i5;
                    cArrM22888a = growBuffer(cArrM22888a, i2, length2);
                }
                if (i3 > 0) {
                    s.getChars(i, index, cArrM22888a, i2);
                    i2 = i4;
                }
                if (length3 > 0) {
                    System.arraycopy(cArrMo16624a, 0, cArrM22888a, i2, length3);
                    i2 += length3;
                }
                i = index + 1;
            }
            index++;
        }
        int i6 = length - i;
        if (i6 > 0) {
            int i7 = i6 + i2;
            if (length2 < i7) {
                cArrM22888a = growBuffer(cArrM22888a, i2, i7);
            }
            s.getChars(i, length, cArrM22888a, i2);
            i2 = i7;
        }
        return new String(cArrM22888a, 0, i2);
    }

    @Override // p000.l55
    public String escape(String string) {
        v7d.checkNotNull(string);
        int length = string.length();
        for (int i = 0; i < length; i++) {
            if (mo16624a(string.charAt(i)) != null) {
                return m23590b(string, i);
            }
        }
        return string;
    }
}
