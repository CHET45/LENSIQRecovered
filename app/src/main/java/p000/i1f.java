package p000;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.nio.charset.Charset;
import p000.l74;

/* JADX INFO: loaded from: classes3.dex */
public final class i1f extends Writer {

    /* JADX INFO: renamed from: L */
    public static final byte[] f45439L;

    /* JADX INFO: renamed from: M */
    public static final byte[] f45440M;

    /* JADX INFO: renamed from: Q */
    public static final char[] f45442Q;

    /* JADX INFO: renamed from: a */
    public char[] f45446a;

    /* JADX INFO: renamed from: b */
    public int f45447b;

    /* JADX INFO: renamed from: c */
    public int f45448c;

    /* JADX INFO: renamed from: d */
    public final Writer f45449d;

    /* JADX INFO: renamed from: e */
    public static final ThreadLocal<char[]> f45443e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f */
    public static final int[] f45444f = {9, 99, 999, 9999, l74.EnumC8658d.f56431d2, 999999, 9999999, 99999999, 999999999, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: m */
    public static final char[] f45445m = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82029s, 'b', sjc.f82021k, 'd', 'e', 'f', 'g', sjc.f82017g, 'i', 'j', 'k', sjc.f82015e, sjc.f82013c, 'n', 'o', 'p', sjc.f82025o, 'r', sjc.f82023m, sjc.f82027q, C4584d2.f28247p, sjc.f82019i, 'w', 'x', 'y', sjc.f82011a};

    /* JADX INFO: renamed from: C */
    public static final char[] f45436C = {'0', '0', '0', '0', '0', '0', '0', '0', '0', '0', '1', '1', '1', '1', '1', '1', '1', '1', '1', '1', '2', '2', '2', '2', '2', '2', '2', '2', '2', '2', '3', '3', '3', '3', '3', '3', '3', '3', '3', '3', '4', '4', '4', '4', '4', '4', '4', '4', '4', '4', '5', '5', '5', '5', '5', '5', '5', '5', '5', '5', '6', '6', '6', '6', '6', '6', '6', '6', '6', '6', '7', '7', '7', '7', '7', '7', '7', '7', '7', '7', '8', '8', '8', '8', '8', '8', '8', '8', '8', '8', '9', '9', '9', '9', '9', '9', '9', '9', '9', '9'};

    /* JADX INFO: renamed from: F */
    public static final char[] f45437F = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

    /* JADX INFO: renamed from: H */
    public static final char[] f45438H = {'0', '0', '0', '1', '0', '2', '0', '3', '0', '4', '0', '5', '0', '6', '0', '7', '0', '8', '0', '9', '0', sjc.f82030t, '0', 'B', '0', sjc.f82022l, '0', 'D', '0', 'E', '0', 'F', '1', '0', '1', '1', '1', '2', '1', '3', '1', '4', '1', '5', '1', '6', '1', '7', '1', '8', '1', '9', '1', sjc.f82030t, '1', 'B', '1', sjc.f82022l, '1', 'D', '1', 'E', '1', 'F', '2', '0', '2', '1', '2', '2', '2', '3', '2', '4', '2', '5', '2', '6', '2', '7', '2', '8', '2', '9', '2', sjc.f82030t, '2', 'B', '2', sjc.f82022l, '2', 'D', '2', 'E', '2', 'F'};

    /* JADX INFO: renamed from: N */
    public static final char[] f45441N = new char[93];

    static {
        byte[] bArr = new byte[161];
        f45439L = bArr;
        byte[] bArr2 = new byte[161];
        f45440M = bArr2;
        bArr[0] = 4;
        bArr[1] = 4;
        bArr[2] = 4;
        bArr[3] = 4;
        bArr[4] = 4;
        bArr[5] = 4;
        bArr[6] = 4;
        bArr[7] = 4;
        bArr[8] = 1;
        bArr[9] = 1;
        bArr[10] = 1;
        bArr[11] = 4;
        bArr[12] = 1;
        bArr[13] = 1;
        bArr[34] = 1;
        bArr[92] = 1;
        bArr2[0] = 4;
        bArr2[1] = 4;
        bArr2[2] = 4;
        bArr2[3] = 4;
        bArr2[4] = 4;
        bArr2[5] = 4;
        bArr2[6] = 4;
        bArr2[7] = 4;
        bArr2[8] = 1;
        bArr2[9] = 1;
        bArr2[10] = 1;
        bArr2[11] = 4;
        bArr2[12] = 1;
        bArr2[13] = 1;
        bArr2[92] = 1;
        bArr2[39] = 1;
        for (int i = 14; i <= 31; i++) {
            f45439L[i] = 4;
            f45440M[i] = 4;
        }
        for (int i2 = 127; i2 < 160; i2++) {
            f45439L[i2] = 4;
            f45440M[i2] = 4;
        }
        char[] cArr = f45441N;
        cArr[0] = '0';
        cArr[1] = '1';
        cArr[2] = '2';
        cArr[3] = '3';
        cArr[4] = '4';
        cArr[5] = '5';
        cArr[6] = '6';
        cArr[7] = '7';
        cArr[8] = 'b';
        cArr[9] = sjc.f82027q;
        cArr[10] = 'n';
        cArr[11] = sjc.f82019i;
        cArr[12] = 'f';
        cArr[13] = 'r';
        cArr[34] = '\"';
        cArr[39] = '\'';
        cArr[47] = '/';
        cArr[92] = '\\';
        f45442Q = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', sjc.f82030t, 'B', sjc.f82022l, 'D', 'E', 'F'};
    }

    public i1f() {
        this((Writer) null);
    }

    /* JADX INFO: renamed from: b */
    public static void m12715b(long j, int i, char[] cArr) {
        char c;
        if (j < 0) {
            j = -j;
            c = '-';
        } else {
            c = 0;
        }
        while (j > 2147483647L) {
            long j2 = j / 100;
            int i2 = (int) (j - (((j2 << 6) + (j2 << 5)) + (j2 << 2)));
            cArr[i - 1] = f45437F[i2];
            i -= 2;
            cArr[i] = f45436C[i2];
            j = j2;
        }
        int i3 = (int) j;
        while (i3 >= 65536) {
            int i4 = i3 / 100;
            int i5 = i3 - (((i4 << 6) + (i4 << 5)) + (i4 << 2));
            cArr[i - 1] = f45437F[i5];
            i -= 2;
            cArr[i] = f45436C[i5];
            i3 = i4;
        }
        while (true) {
            int i6 = (52429 * i3) >>> 19;
            int i7 = i - 1;
            cArr[i7] = f45445m[i3 - ((i6 << 3) + (i6 << 1))];
            if (i6 == 0) {
                break;
            }
            i3 = i6;
            i = i7;
        }
        if (c != 0) {
            cArr[i - 2] = c;
        }
    }

    private void writeKeyWithDoubleQuoteIfHasSpecial(String str) {
        int length = str.length();
        boolean z = true;
        int i = this.f45447b + length + 1;
        if (i > this.f45446a.length) {
            if (this.f45449d != null) {
                if (length == 0) {
                    write(34);
                    write(34);
                    write(58);
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    char cCharAt = str.charAt(i2);
                    byte[] bArr = f45439L;
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    write(34);
                }
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    byte[] bArr2 = f45439L;
                    if (cCharAt2 >= bArr2.length || bArr2[cCharAt2] == 0) {
                        write(cCharAt2);
                    } else {
                        write(92);
                        write(f45441N[cCharAt2]);
                    }
                }
                if (z) {
                    write(34);
                }
                write(58);
                return;
            }
            m12716a(i);
        }
        if (length == 0) {
            int i4 = this.f45447b;
            if (i4 + 3 > this.f45446a.length) {
                m12716a(i4 + 3);
            }
            char[] cArr = this.f45446a;
            int i5 = this.f45447b;
            int i6 = i5 + 1;
            this.f45447b = i6;
            cArr[i5] = '\"';
            int i7 = i5 + 2;
            this.f45447b = i7;
            cArr[i6] = '\"';
            this.f45447b = i5 + 3;
            cArr[i7] = ':';
            return;
        }
        int i8 = this.f45447b;
        int i9 = i8 + length;
        str.getChars(0, length, this.f45446a, i8);
        this.f45447b = i;
        int i10 = i8;
        boolean z2 = false;
        while (i10 < i9) {
            char[] cArr2 = this.f45446a;
            char c = cArr2[i10];
            byte[] bArr3 = f45439L;
            if (c < bArr3.length && bArr3[c] != 0) {
                if (z2) {
                    i++;
                    if (i > cArr2.length) {
                        m12716a(i);
                    }
                    this.f45447b = i;
                    char[] cArr3 = this.f45446a;
                    int i11 = i10 + 1;
                    System.arraycopy(cArr3, i11, cArr3, i10 + 2, i9 - i10);
                    char[] cArr4 = this.f45446a;
                    cArr4[i10] = '\\';
                    cArr4[i11] = f45441N[c];
                    i9++;
                    i10 = i11;
                } else {
                    i += 3;
                    if (i > cArr2.length) {
                        m12716a(i);
                    }
                    this.f45447b = i;
                    char[] cArr5 = this.f45446a;
                    int i12 = i10 + 1;
                    System.arraycopy(cArr5, i12, cArr5, i10 + 3, (i9 - i10) - 1);
                    char[] cArr6 = this.f45446a;
                    System.arraycopy(cArr6, 0, cArr6, 1, i10);
                    char[] cArr7 = this.f45446a;
                    cArr7[i8] = '\"';
                    cArr7[i12] = '\\';
                    i10 += 2;
                    cArr7[i10] = f45441N[c];
                    i9 += 2;
                    cArr7[this.f45447b - 2] = '\"';
                    z2 = true;
                }
            }
            i10++;
        }
        this.f45446a[this.f45447b - 1] = ':';
    }

    private void writeKeyWithSingleQuoteIfHasSpecial(String str) {
        int length = str.length();
        boolean z = true;
        int i = this.f45447b + length + 1;
        if (i > this.f45446a.length) {
            if (this.f45449d != null) {
                if (length == 0) {
                    write(39);
                    write(39);
                    write(58);
                    return;
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        z = false;
                        break;
                    }
                    char cCharAt = str.charAt(i2);
                    byte[] bArr = f45440M;
                    if (cCharAt < bArr.length && bArr[cCharAt] != 0) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (z) {
                    write(39);
                }
                for (int i3 = 0; i3 < length; i3++) {
                    char cCharAt2 = str.charAt(i3);
                    byte[] bArr2 = f45440M;
                    if (cCharAt2 >= bArr2.length || bArr2[cCharAt2] == 0) {
                        write(cCharAt2);
                    } else {
                        write(92);
                        write(f45441N[cCharAt2]);
                    }
                }
                if (z) {
                    write(39);
                }
                write(58);
                return;
            }
            m12716a(i);
        }
        if (length == 0) {
            int i4 = this.f45447b;
            if (i4 + 3 > this.f45446a.length) {
                m12716a(i4 + 3);
            }
            char[] cArr = this.f45446a;
            int i5 = this.f45447b;
            int i6 = i5 + 1;
            this.f45447b = i6;
            cArr[i5] = '\'';
            int i7 = i5 + 2;
            this.f45447b = i7;
            cArr[i6] = '\'';
            this.f45447b = i5 + 3;
            cArr[i7] = ':';
            return;
        }
        int i8 = this.f45447b;
        int i9 = i8 + length;
        str.getChars(0, length, this.f45446a, i8);
        this.f45447b = i;
        int i10 = i8;
        boolean z2 = false;
        while (i10 < i9) {
            char[] cArr2 = this.f45446a;
            char c = cArr2[i10];
            byte[] bArr3 = f45440M;
            if (c < bArr3.length && bArr3[c] != 0) {
                if (z2) {
                    i++;
                    if (i > cArr2.length) {
                        m12716a(i);
                    }
                    this.f45447b = i;
                    char[] cArr3 = this.f45446a;
                    int i11 = i10 + 1;
                    System.arraycopy(cArr3, i11, cArr3, i10 + 2, i9 - i10);
                    char[] cArr4 = this.f45446a;
                    cArr4[i10] = '\\';
                    cArr4[i11] = f45441N[c];
                    i9++;
                    i10 = i11;
                } else {
                    i += 3;
                    if (i > cArr2.length) {
                        m12716a(i);
                    }
                    this.f45447b = i;
                    char[] cArr5 = this.f45446a;
                    int i12 = i10 + 1;
                    System.arraycopy(cArr5, i12, cArr5, i10 + 3, (i9 - i10) - 1);
                    char[] cArr6 = this.f45446a;
                    System.arraycopy(cArr6, 0, cArr6, 1, i10);
                    char[] cArr7 = this.f45446a;
                    cArr7[i8] = '\'';
                    cArr7[i12] = '\\';
                    i10 += 2;
                    cArr7[i10] = f45441N[c];
                    i9 += 2;
                    cArr7[this.f45447b - 2] = '\'';
                    z2 = true;
                }
            }
            i10++;
        }
        this.f45446a[i - 1] = ':';
    }

    /* JADX INFO: renamed from: a */
    public void m12716a(int i) {
        char[] cArr = this.f45446a;
        int length = ((cArr.length * 3) / 2) + 1;
        if (length >= i) {
            i = length;
        }
        char[] cArr2 = new char[i];
        System.arraycopy(cArr, 0, cArr2, 0, this.f45447b);
        this.f45446a = cArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x023c A[PHI: r5 r11
  0x023c: PHI (r5v26 int) = (r5v20 int), (r5v27 int) binds: [B:148:0x0286, B:114:0x023a] A[DONT_GENERATE, DONT_INLINE]
  0x023c: PHI (r11v13 int) = (r11v8 int), (r11v14 int) binds: [B:148:0x0286, B:114:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0240 A[PHI: r5 r7 r11
  0x0240: PHI (r5v23 int) = (r5v20 int), (r5v22 int), (r5v27 int) binds: [B:148:0x0286, B:126:0x0251, B:114:0x023a] A[DONT_GENERATE, DONT_INLINE]
  0x0240: PHI (r7v18 int) = (r7v2 int), (r7v16 int), (r7v2 int) binds: [B:148:0x0286, B:126:0x0251, B:114:0x023a] A[DONT_GENERATE, DONT_INLINE]
  0x0240: PHI (r11v10 int) = (r11v8 int), (r11v9 int), (r11v14 int) binds: [B:148:0x0286, B:126:0x0251, B:114:0x023a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX INFO: renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m12717c(java.lang.String r19, char r20, boolean r21) {
        /*
            Method dump skipped, instruction units count: 1023
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.i1f.m12717c(java.lang.String, char, boolean):void");
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (this.f45449d != null && this.f45447b > 0) {
            flush();
        }
        char[] cArr = this.f45446a;
        if (cArr.length <= 8192) {
            f45443e.set(cArr);
        }
        this.f45446a = null;
    }

    public void config(a2f a2fVar, boolean z) {
        if (z) {
            this.f45448c = a2fVar.f216a | this.f45448c;
        } else {
            this.f45448c = (~a2fVar.f216a) & this.f45448c;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m12718d(String str) {
        int i = 0;
        if (str == null) {
            int i2 = this.f45447b + 4;
            if (i2 > this.f45446a.length) {
                m12716a(i2);
            }
            "null".getChars(0, 4, this.f45446a, this.f45447b);
            this.f45447b = i2;
            return;
        }
        int length = str.length();
        int i3 = this.f45447b + length + 2;
        if (i3 > this.f45446a.length) {
            if (this.f45449d != null) {
                write(39);
                while (i < str.length()) {
                    char cCharAt = str.charAt(i);
                    if (cCharAt <= '\r' || cCharAt == '\\' || cCharAt == '\'' || (cCharAt == '/' && (this.f45448c & a2f.WriteSlashAsSpecial.f216a) != 0)) {
                        write(92);
                        write(f45441N[cCharAt]);
                    } else {
                        write(cCharAt);
                    }
                    i++;
                }
                write(39);
                return;
            }
            m12716a(i3);
        }
        int i4 = this.f45447b;
        int i5 = i4 + 1;
        int i6 = i5 + length;
        char[] cArr = this.f45446a;
        cArr[i4] = '\'';
        str.getChars(0, length, cArr, i5);
        this.f45447b = i3;
        int i7 = -1;
        char c = 0;
        for (int i8 = i5; i8 < i6; i8++) {
            char c2 = this.f45446a[i8];
            if (c2 <= '\r' || c2 == '\\' || c2 == '\'' || (c2 == '/' && (this.f45448c & a2f.WriteSlashAsSpecial.f216a) != 0)) {
                i++;
                i7 = i8;
                c = c2;
            }
        }
        int i9 = i3 + i;
        if (i9 > this.f45446a.length) {
            m12716a(i9);
        }
        this.f45447b = i9;
        if (i == 1) {
            char[] cArr2 = this.f45446a;
            int i10 = i7 + 1;
            System.arraycopy(cArr2, i10, cArr2, i7 + 2, (i6 - i7) - 1);
            char[] cArr3 = this.f45446a;
            cArr3[i7] = '\\';
            cArr3[i10] = f45441N[c];
        } else if (i > 1) {
            char[] cArr4 = this.f45446a;
            int i11 = i7 + 1;
            System.arraycopy(cArr4, i11, cArr4, i7 + 2, (i6 - i7) - 1);
            char[] cArr5 = this.f45446a;
            cArr5[i7] = '\\';
            cArr5[i11] = f45441N[c];
            int i12 = i6 + 1;
            for (int i13 = i7 - 1; i13 >= i5; i13--) {
                char[] cArr6 = this.f45446a;
                char c3 = cArr6[i13];
                if (c3 <= '\r' || c3 == '\\' || c3 == '\'' || (c3 == '/' && (this.f45448c & a2f.WriteSlashAsSpecial.f216a) != 0)) {
                    int i14 = i13 + 1;
                    System.arraycopy(cArr6, i14, cArr6, i13 + 2, (i12 - i13) - 1);
                    char[] cArr7 = this.f45446a;
                    cArr7[i13] = '\\';
                    cArr7[i14] = f45441N[c3];
                    i12++;
                }
            }
        }
        this.f45446a[this.f45447b - 1] = '\'';
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        Writer writer = this.f45449d;
        if (writer == null) {
            return;
        }
        try {
            writer.write(this.f45446a, 0, this.f45447b);
            this.f45449d.flush();
            this.f45447b = 0;
        } catch (IOException e) {
            throw new jh8(e.getMessage(), e);
        }
    }

    public boolean isEnabled(a2f a2fVar) {
        return (a2fVar.f216a & this.f45448c) != 0;
    }

    public byte[] toBytes(String str) {
        if (this.f45449d != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        if (str == null) {
            str = "UTF-8";
        }
        try {
            return new String(this.f45446a, 0, this.f45447b).getBytes(str);
        } catch (UnsupportedEncodingException e) {
            throw new jh8("toBytes error", e);
        }
    }

    public String toString() {
        return new String(this.f45446a, 0, this.f45447b);
    }

    @Override // java.io.Writer
    public void write(int i) {
        int i2 = 1;
        int i3 = this.f45447b + 1;
        if (i3 <= this.f45446a.length) {
            i2 = i3;
        } else if (this.f45449d == null) {
            m12716a(i3);
            i2 = i3;
        } else {
            flush();
        }
        this.f45446a[this.f45447b] = (char) i;
        this.f45447b = i2;
    }

    public void writeByteArray(byte[] bArr) {
        int length = bArr.length;
        boolean z = (this.f45448c & a2f.UseSingleQuotes.f216a) != 0;
        char c = z ? '\'' : '\"';
        if (length == 0) {
            write(z ? "''" : "\"\"");
            return;
        }
        char[] cArr = lh8.f57589B;
        int i = (length / 3) * 3;
        int i2 = length - 1;
        int i3 = this.f45447b;
        int i4 = (((i2 / 3) + 1) << 2) + i3;
        int i5 = i4 + 2;
        if (i5 > this.f45446a.length) {
            if (this.f45449d != null) {
                write(c);
                int i6 = 0;
                while (i6 < i) {
                    int i7 = i6 + 2;
                    int i8 = ((bArr[i6 + 1] & 255) << 8) | ((bArr[i6] & 255) << 16);
                    i6 += 3;
                    int i9 = i8 | (bArr[i7] & 255);
                    write(cArr[(i9 >>> 18) & 63]);
                    write(cArr[(i9 >>> 12) & 63]);
                    write(cArr[(i9 >>> 6) & 63]);
                    write(cArr[i9 & 63]);
                }
                int i10 = length - i;
                if (i10 > 0) {
                    int i11 = ((bArr[i] & 255) << 10) | (i10 == 2 ? (bArr[i2] & 255) << 2 : 0);
                    write(cArr[i11 >> 12]);
                    write(cArr[(i11 >>> 6) & 63]);
                    write(i10 == 2 ? cArr[i11 & 63] : '=');
                    write(61);
                }
                write(c);
                return;
            }
            m12716a(i5);
        }
        this.f45447b = i5;
        int i12 = i3 + 1;
        this.f45446a[i3] = c;
        int i13 = 0;
        while (i13 < i) {
            int i14 = i13 + 2;
            int i15 = ((bArr[i13 + 1] & 255) << 8) | ((bArr[i13] & 255) << 16);
            i13 += 3;
            int i16 = i15 | (bArr[i14] & 255);
            char[] cArr2 = this.f45446a;
            cArr2[i12] = cArr[(i16 >>> 18) & 63];
            cArr2[i12 + 1] = cArr[(i16 >>> 12) & 63];
            int i17 = i12 + 3;
            cArr2[i12 + 2] = cArr[(i16 >>> 6) & 63];
            i12 += 4;
            cArr2[i17] = cArr[i16 & 63];
        }
        int i18 = length - i;
        if (i18 > 0) {
            int i19 = ((bArr[i] & 255) << 10) | (i18 == 2 ? (bArr[i2] & 255) << 2 : 0);
            char[] cArr3 = this.f45446a;
            cArr3[i4 - 3] = cArr[i19 >> 12];
            cArr3[i4 - 2] = cArr[(i19 >>> 6) & 63];
            cArr3[i4 - 1] = i18 == 2 ? cArr[i19 & 63] : '=';
            cArr3[i4] = '=';
        }
        this.f45446a[i4 + 1] = c;
    }

    public void writeFieldName(String str, boolean z) {
        int i = this.f45448c;
        if ((a2f.UseSingleQuotes.f216a & i) == 0) {
            if ((i & a2f.QuoteFieldNames.f216a) != 0) {
                m12717c(str, ':', z);
                return;
            } else {
                writeKeyWithDoubleQuoteIfHasSpecial(str);
                return;
            }
        }
        if ((a2f.QuoteFieldNames.f216a & i) == 0) {
            writeKeyWithSingleQuoteIfHasSpecial(str);
        } else {
            m12718d(str);
            write(58);
        }
    }

    public void writeInt(int i) {
        if (i == Integer.MIN_VALUE) {
            write("-2147483648");
            return;
        }
        int i2 = 0;
        while ((i < 0 ? -i : i) > f45444f[i2]) {
            i2++;
        }
        int i3 = i2 + 1;
        if (i < 0) {
            i3 = i2 + 2;
        }
        int i4 = this.f45447b + i3;
        if (i4 > this.f45446a.length) {
            if (this.f45449d != null) {
                char[] cArr = new char[i3];
                m12715b(i, i3, cArr);
                write(cArr, 0, i3);
                return;
            }
            m12716a(i4);
        }
        m12715b(i, i4, this.f45446a);
        this.f45447b = i4;
    }

    public void writeLong(long j) {
        if (j == Long.MIN_VALUE) {
            write("-9223372036854775808");
            return;
        }
        long j2 = j < 0 ? -j : j;
        int i = 1;
        long j3 = 10;
        while (true) {
            if (i >= 19) {
                i = 0;
                break;
            } else {
                if (j2 < j3) {
                    break;
                }
                j3 *= 10;
                i++;
            }
        }
        int i2 = i != 0 ? i : 19;
        if (j < 0) {
            i2++;
        }
        int i3 = this.f45447b + i2;
        if (i3 > this.f45446a.length) {
            if (this.f45449d != null) {
                char[] cArr = new char[i2];
                m12715b(j, i2, cArr);
                write(cArr, 0, i2);
                return;
            }
            m12716a(i3);
        }
        m12715b(j, i3, this.f45446a);
        this.f45447b = i3;
    }

    public void writeNull() {
        write("null");
    }

    public void writeString(String str) {
        if ((this.f45448c & a2f.UseSingleQuotes.f216a) != 0) {
            m12718d(str);
        } else {
            m12717c(str, (char) 0, true);
        }
    }

    public void writeTo(Writer writer) throws IOException {
        if (this.f45449d != null) {
            throw new UnsupportedOperationException("writer not null");
        }
        writer.write(this.f45446a, 0, this.f45447b);
    }

    public i1f(Writer writer) {
        this.f45449d = writer;
        this.f45448c = fh8.f36587f;
        ThreadLocal<char[]> threadLocal = f45443e;
        this.f45446a = threadLocal.get();
        if (threadLocal != null) {
            threadLocal.set(null);
        }
        if (this.f45446a == null) {
            this.f45446a = new char[1024];
        }
    }

    public void writeTo(OutputStream outputStream, String str) throws IOException {
        writeTo(outputStream, Charset.forName(str));
    }

    public void writeTo(OutputStream outputStream, Charset charset) throws IOException {
        if (this.f45449d == null) {
            outputStream.write(new String(this.f45446a, 0, this.f45447b).getBytes(charset.name()));
            return;
        }
        throw new UnsupportedOperationException("writer not null");
    }

    @Override // java.io.Writer, java.lang.Appendable
    public i1f append(CharSequence charSequence) {
        String string = charSequence == null ? "null" : charSequence.toString();
        write(string, 0, string.length());
        return this;
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        int i3;
        if (i < 0 || i > cArr.length || i2 < 0 || (i3 = i + i2) > cArr.length || i3 < 0) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return;
        }
        int i4 = this.f45447b + i2;
        if (i4 > this.f45446a.length) {
            if (this.f45449d == null) {
                m12716a(i4);
            } else {
                do {
                    char[] cArr2 = this.f45446a;
                    int length = cArr2.length;
                    int i5 = this.f45447b;
                    int i6 = length - i5;
                    System.arraycopy(cArr, i, cArr2, i5, i6);
                    this.f45447b = this.f45446a.length;
                    flush();
                    i2 -= i6;
                    i += i6;
                } while (i2 > this.f45446a.length);
                i4 = i2;
            }
        }
        System.arraycopy(cArr, i, this.f45446a, this.f45447b, i2);
        this.f45447b = i4;
    }

    public i1f(a2f... a2fVarArr) {
        this(null, 0, a2fVarArr);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public i1f append(CharSequence charSequence, int i, int i2) {
        if (charSequence == null) {
            charSequence = "null";
        }
        String string = charSequence.subSequence(i, i2).toString();
        write(string, 0, string.length());
        return this;
    }

    public i1f(Writer writer, int i, a2f[] a2fVarArr) {
        this.f45449d = writer;
        ThreadLocal<char[]> threadLocal = f45443e;
        char[] cArr = threadLocal.get();
        this.f45446a = cArr;
        if (cArr != null) {
            threadLocal.set(null);
        }
        if (this.f45446a == null) {
            this.f45446a = new char[1024];
        }
        for (a2f a2fVar : a2fVarArr) {
            i |= a2fVar.f216a;
        }
        this.f45448c = i;
    }

    @Override // java.io.Writer, java.lang.Appendable
    public i1f append(char c) {
        write(c);
        return this;
    }

    public i1f(int i) {
        this(null, i);
    }

    public i1f(Writer writer, int i) {
        this.f45449d = writer;
        if (i > 0) {
            this.f45446a = new char[i];
            return;
        }
        throw new IllegalArgumentException("Negative initial size: " + i);
    }

    @Override // java.io.Writer
    public void write(String str, int i, int i2) {
        int i3;
        int i4 = this.f45447b + i2;
        if (i4 > this.f45446a.length) {
            if (this.f45449d == null) {
                m12716a(i4);
            } else {
                while (true) {
                    char[] cArr = this.f45446a;
                    int length = cArr.length;
                    int i5 = this.f45447b;
                    int i6 = length - i5;
                    i3 = i + i6;
                    str.getChars(i, i3, cArr, i5);
                    this.f45447b = this.f45446a.length;
                    flush();
                    i2 -= i6;
                    if (i2 <= this.f45446a.length) {
                        break;
                    } else {
                        i = i3;
                    }
                }
                i4 = i2;
                i = i3;
            }
        }
        str.getChars(i, i2 + i, this.f45446a, this.f45447b);
        this.f45447b = i4;
    }

    @Override // java.io.Writer
    public void write(String str) {
        if (str == null) {
            writeNull();
        } else {
            write(str, 0, str.length());
        }
    }

    public void write(boolean z) {
        write(z ? "true" : "false");
    }
}
