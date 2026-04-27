package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class lh8 {

    /* JADX INFO: renamed from: A */
    public static final int[] f57588A;

    /* JADX INFO: renamed from: B */
    public static final char[] f57589B;

    /* JADX INFO: renamed from: C */
    public static final int[] f57590C;

    /* JADX INFO: renamed from: D */
    public static final boolean[] f57591D;

    /* JADX INFO: renamed from: E */
    public static final boolean[] f57592E;

    /* JADX INFO: renamed from: s */
    public static final char f57593s = 26;

    /* JADX INFO: renamed from: t */
    public static final int f57594t = -1;

    /* JADX INFO: renamed from: u */
    public static final int f57595u = -2;

    /* JADX INFO: renamed from: v */
    public static final int f57596v = 0;

    /* JADX INFO: renamed from: w */
    public static final int f57597w = 3;

    /* JADX INFO: renamed from: x */
    public static final int f57598x = 4;

    /* JADX INFO: renamed from: y */
    public static boolean f57599y;

    /* JADX INFO: renamed from: z */
    public static final ThreadLocal<char[]> f57600z;

    /* JADX INFO: renamed from: a */
    public int f57601a;

    /* JADX INFO: renamed from: b */
    public int f57602b;

    /* JADX INFO: renamed from: c */
    public int f57603c;

    /* JADX INFO: renamed from: d */
    public char f57604d;

    /* JADX INFO: renamed from: e */
    public int f57605e;

    /* JADX INFO: renamed from: f */
    public int f57606f;

    /* JADX INFO: renamed from: g */
    public char[] f57607g;

    /* JADX INFO: renamed from: h */
    public int f57608h;

    /* JADX INFO: renamed from: i */
    public int f57609i;

    /* JADX INFO: renamed from: j */
    public boolean f57610j;

    /* JADX INFO: renamed from: k */
    public TimeZone f57611k;

    /* JADX INFO: renamed from: l */
    public Locale f57612l;

    /* JADX INFO: renamed from: m */
    public Calendar f57613m;

    /* JADX INFO: renamed from: n */
    public int f57614n;

    /* JADX INFO: renamed from: o */
    public final String f57615o;

    /* JADX INFO: renamed from: p */
    public final int f57616p;

    /* JADX INFO: renamed from: q */
    public String f57617q;

    /* JADX INFO: renamed from: r */
    public boolean f57618r;

    static {
        int i;
        try {
            i = Class.forName("android.os.Build$VERSION").getField("SDK_INT").getInt(null);
        } catch (Exception unused) {
            i = -1;
        }
        char c = 0;
        f57599y = i >= 23;
        f57600z = new ThreadLocal<>();
        f57588A = new int[103];
        for (int i2 = 48; i2 <= 57; i2++) {
            f57588A[i2] = i2 - 48;
        }
        for (int i3 = 97; i3 <= 102; i3++) {
            f57588A[i3] = i3 - 87;
        }
        for (int i4 = 65; i4 <= 70; i4++) {
            f57588A[i4] = i4 - 55;
        }
        char[] charArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f57589B = charArray;
        int[] iArr = new int[256];
        f57590C = iArr;
        Arrays.fill(iArr, -1);
        int length = charArray.length;
        for (int i5 = 0; i5 < length; i5++) {
            f57590C[f57589B[i5]] = i5;
        }
        f57590C[61] = 0;
        f57591D = new boolean[256];
        char c2 = 0;
        while (true) {
            boolean[] zArr = f57591D;
            if (c2 >= zArr.length) {
                break;
            }
            if (c2 >= 'A' && c2 <= 'Z') {
                zArr[c2] = true;
            } else if (c2 >= 'a' && c2 <= 'z') {
                zArr[c2] = true;
            } else if (c2 == '_') {
                zArr[c2] = true;
            }
            c2 = (char) (c2 + 1);
        }
        f57592E = new boolean[256];
        while (true) {
            boolean[] zArr2 = f57592E;
            if (c >= zArr2.length) {
                return;
            }
            if (c >= 'A' && c <= 'Z') {
                zArr2[c] = true;
            } else if (c >= 'a' && c <= 'z') {
                zArr2[c] = true;
            } else if (c == '_') {
                zArr2[c] = true;
            } else if (c >= '0' && c <= '9') {
                zArr2[c] = true;
            }
            c = (char) (c + 1);
        }
    }

    public lh8(String str) {
        this(str, fh8.f36585d);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m16136b(char c, char c2, char c3, char c4, char c5, char c6, int i, int i2) {
        if ((c == '1' || c == '2') && c2 >= '0' && c2 <= '9' && c3 >= '0' && c3 <= '9' && c4 >= '0' && c4 <= '9') {
            if (c5 == '0') {
                if (c6 < '1' || c6 > '9') {
                    return false;
                }
            } else if (c5 != '1' || (c6 != '0' && c6 != '1' && c6 != '2')) {
                return false;
            }
            if (i == 48) {
                return i2 >= 49 && i2 <= 57;
            }
            if (i != 49 && i != 50) {
                return i == 51 && (i2 == 48 || i2 == 49);
            }
            if (i2 >= 48 && i2 <= 57) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m16137c(char c, char c2, char c3, char c4, char c5, char c6) {
        if (c == '0') {
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        } else {
            if (c != '1') {
                if (c == '2' && c2 >= '0' && c2 <= '4') {
                }
                return false;
            }
            if (c2 < '0' || c2 > '9') {
                return false;
            }
        }
        if (c3 < '0' || c3 > '5') {
            if (c3 != '6' || c4 != '0') {
                return false;
            }
        } else if (c4 < '0' || c4 > '9') {
            return false;
        }
        return (c5 < '0' || c5 > '5') ? c5 == '6' && c6 == '0' : c6 >= '0' && c6 <= '9';
    }

    private boolean charArrayCompare(char[] cArr) {
        int length = cArr.length;
        if (this.f57605e + length > this.f57616p) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (cArr[i] != this.f57615o.charAt(this.f57605e + i)) {
                return false;
            }
        }
        return true;
    }

    public static final byte[] decodeFast(char[] cArr, int i, int i2) {
        int i3;
        int i4 = 0;
        if (i2 == 0) {
            return new byte[0];
        }
        int i5 = (i + i2) - 1;
        int i6 = i;
        while (i6 < i5 && f57590C[cArr[i6]] < 0) {
            i6++;
        }
        while (i5 > 0 && f57590C[cArr[i5]] < 0) {
            i5--;
        }
        int i7 = cArr[i5] == '=' ? cArr[i5 + (-1)] == '=' ? 2 : 1 : 0;
        int i8 = (i5 - i6) + 1;
        if (i2 > 76) {
            i3 = (cArr[76] == '\r' ? i8 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i9 = (((i8 - i3) * 6) >> 3) - i7;
        byte[] bArr = new byte[i9];
        int i10 = (i9 / 3) * 3;
        int i11 = 0;
        int i12 = 0;
        while (i11 < i10) {
            int[] iArr = f57590C;
            int i13 = i6 + 4;
            int i14 = iArr[cArr[i6 + 3]] | (iArr[cArr[i6 + 1]] << 12) | (iArr[cArr[i6]] << 18) | (iArr[cArr[i6 + 2]] << 6);
            bArr[i11] = (byte) (i14 >> 16);
            int i15 = i11 + 2;
            bArr[i11 + 1] = (byte) (i14 >> 8);
            i11 += 3;
            bArr[i15] = (byte) i14;
            if (i3 <= 0 || (i12 = i12 + 1) != 19) {
                i6 = i13;
            } else {
                i6 += 6;
                i12 = 0;
            }
        }
        if (i11 < i9) {
            int i16 = 0;
            while (i6 <= i5 - i7) {
                i4 |= f57590C[cArr[i6]] << (18 - (i16 * 6));
                i16++;
                i6++;
            }
            int i17 = 16;
            while (i11 < i9) {
                bArr[i11] = (byte) (i4 >> i17);
                i17 -= 8;
                i11++;
            }
        }
        return bArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String readString(char[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.readString(char[], int):java.lang.String");
    }

    private void scanFalse() {
        if (this.f57615o.startsWith("false", this.f57605e)) {
            int i = this.f57605e + 5;
            this.f57605e = i;
            char cM16138a = m16138a(i);
            this.f57604d = cM16138a;
            if (cM16138a == ' ' || cM16138a == ',' || cM16138a == '}' || cM16138a == ']' || cM16138a == '\n' || cM16138a == '\r' || cM16138a == '\t' || cM16138a == 26 || cM16138a == '\f' || cM16138a == '\b' || cM16138a == ':') {
                this.f57601a = 7;
                return;
            }
        }
        throw new jh8("scan false error");
    }

    private void scanIdent() {
        this.f57609i = this.f57605e - 1;
        this.f57610j = false;
        do {
            this.f57608h++;
            next();
        } while (Character.isLetterOrDigit(this.f57604d));
        String strStringVal = stringVal();
        if (strStringVal.equals("null")) {
            this.f57601a = 8;
            return;
        }
        if (strStringVal.equals("true")) {
            this.f57601a = 6;
            return;
        }
        if (strStringVal.equals("false")) {
            this.f57601a = 7;
            return;
        }
        if (strStringVal.equals("new")) {
            this.f57601a = 9;
            return;
        }
        if (strStringVal.equals("undefined")) {
            this.f57601a = 23;
            return;
        }
        if (strStringVal.equals("Set")) {
            this.f57601a = 21;
        } else if (strStringVal.equals("TreeSet")) {
            this.f57601a = 22;
        } else {
            this.f57601a = 18;
        }
    }

    private void scanNullOrNew() {
        int i;
        if (this.f57615o.startsWith("null", this.f57605e)) {
            this.f57605e += 4;
            i = 8;
        } else if (this.f57615o.startsWith("new", this.f57605e)) {
            this.f57605e += 3;
            i = 9;
        } else {
            i = 0;
        }
        if (i != 0) {
            char cM16138a = m16138a(this.f57605e);
            this.f57604d = cM16138a;
            if (cM16138a == ' ' || cM16138a == ',' || cM16138a == '}' || cM16138a == ']' || cM16138a == '\n' || cM16138a == '\r' || cM16138a == '\t' || cM16138a == 26 || cM16138a == '\f' || cM16138a == '\b') {
                this.f57601a = i;
                return;
            }
        }
        throw new jh8("scan null/new error");
    }

    private void scanTrue() {
        if (this.f57615o.startsWith("true", this.f57605e)) {
            int i = this.f57605e + 4;
            this.f57605e = i;
            char cM16138a = m16138a(i);
            this.f57604d = cM16138a;
            if (cM16138a == ' ' || cM16138a == ',' || cM16138a == '}' || cM16138a == ']' || cM16138a == '\n' || cM16138a == '\r' || cM16138a == '\t' || cM16138a == 26 || cM16138a == '\f' || cM16138a == '\b' || cM16138a == ':') {
                this.f57601a = 6;
                return;
            }
        }
        throw new jh8("scan true error");
    }

    private void setCalendar(char c, char c2, char c3, char c4, char c5, char c6, char c7, char c8) {
        Calendar calendar = Calendar.getInstance(this.f57611k, this.f57612l);
        this.f57613m = calendar;
        calendar.set(1, ((c - '0') * 1000) + ((c2 - '0') * 100) + ((c3 - '0') * 10) + (c4 - '0'));
        this.f57613m.set(2, (((c5 - '0') * 10) + (c6 - '0')) - 1);
        this.f57613m.set(5, ((c7 - '0') * 10) + (c8 - '0'));
    }

    private final String subString(int i, int i2) {
        char[] cArr = this.f57607g;
        if (i2 < cArr.length) {
            this.f57615o.getChars(i, i + i2, cArr, 0);
            return new String(this.f57607g, 0, i2);
        }
        char[] cArr2 = new char[i2];
        this.f57615o.getChars(i, i2 + i, cArr2, 0);
        return new String(cArr2);
    }

    /* JADX INFO: renamed from: a */
    public char m16138a(int i) {
        return i >= this.f57616p ? f57593s : this.f57615o.charAt(i);
    }

    public byte[] bytesValue() {
        return decodeFast(this.f57615o, this.f57609i + 1, this.f57608h);
    }

    public void close() {
        char[] cArr = this.f57607g;
        if (cArr.length <= 8196) {
            f57600z.set(cArr);
        }
        this.f57607g = null;
    }

    public final void config(rp5 rp5Var, boolean z) {
        if (z) {
            this.f57603c |= rp5Var.f78973a;
        } else {
            this.f57603c &= ~rp5Var.f78973a;
        }
        if (rp5Var == rp5.InitStringFieldAsEmpty) {
            this.f57617q = z ? "" : null;
        }
        this.f57618r = (this.f57603c & rp5.DisableCircularReferenceDetect.f78973a) != 0;
    }

    /* JADX INFO: renamed from: d */
    public void m16139d() {
        next();
        char c = this.f57604d;
        if (c == '/') {
            do {
                next();
            } while (this.f57604d != '\n');
            next();
        } else {
            if (c != '*') {
                throw new jh8("invalid comment");
            }
            next();
            while (true) {
                char c2 = this.f57604d;
                if (c2 == 26) {
                    return;
                }
                if (c2 == '*') {
                    next();
                    if (this.f57604d == '/') {
                        next();
                        return;
                    }
                } else {
                    next();
                }
            }
        }
    }

    public final Number decimalValue(boolean z) {
        char cM16138a = m16138a((this.f57609i + this.f57608h) - 1);
        try {
            return cM16138a == 'F' ? Float.valueOf(Float.parseFloat(numberString())) : cM16138a == 'D' ? Double.valueOf(Double.parseDouble(numberString())) : z ? decimalValue() : Double.valueOf(Double.parseDouble(numberString()));
        } catch (NumberFormatException e) {
            throw new jh8(e.getMessage() + ", " + info());
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16140e() {
        while (true) {
            char c = this.f57604d;
            if (c > '/') {
                return;
            }
            if (c == ' ' || c == '\r' || c == '\n' || c == '\t' || c == '\f' || c == '\b') {
                next();
            } else if (c != '/') {
                return;
            } else {
                m16139d();
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final char[] m16141f(int i, int i2) {
        char[] cArr = this.f57607g;
        if (i2 < cArr.length) {
            this.f57615o.getChars(i, i2 + i, cArr, 0);
            return this.f57607g;
        }
        char[] cArr2 = new char[i2];
        this.f57607g = cArr2;
        this.f57615o.getChars(i, i2 + i, cArr2, 0);
        return cArr2;
    }

    public Calendar getCalendar() {
        return this.f57613m;
    }

    public String info() {
        StringBuilder sb = new StringBuilder();
        sb.append("pos ");
        sb.append(this.f57605e);
        sb.append(", json : ");
        sb.append(this.f57615o.length() < 65536 ? this.f57615o : this.f57615o.substring(0, 65536));
        return sb.toString();
    }

    public final int intValue() {
        int i;
        boolean z;
        int i2 = this.f57609i;
        int i3 = this.f57608h + i2;
        int i4 = 0;
        if (m16138a(i2) == '-') {
            i2++;
            i = Integer.MIN_VALUE;
            z = true;
        } else {
            i = -2147483647;
            z = false;
        }
        if (i2 < i3) {
            i4 = -(m16138a(i2) - '0');
            i2++;
        }
        while (i2 < i3) {
            int i5 = i2 + 1;
            char cM16138a = m16138a(i2);
            if (cM16138a == 'L' || cM16138a == 'S' || cM16138a == 'B') {
                i2 = i5;
                break;
            }
            int i6 = cM16138a - '0';
            if (i4 < -214748364) {
                throw new NumberFormatException(numberString());
            }
            int i7 = i4 * 10;
            if (i7 < i + i6) {
                throw new NumberFormatException(numberString());
            }
            i4 = i7 - i6;
            i2 = i5;
        }
        if (!z) {
            return -i4;
        }
        if (i2 > this.f57609i + 1) {
            return i4;
        }
        throw new NumberFormatException(numberString());
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0080 -> B:16:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Number integerValue() throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.integerValue():java.lang.Number");
    }

    public final boolean isBlankInput() {
        int i = 0;
        while (true) {
            char cM16138a = m16138a(i);
            if (cM16138a == 26) {
                return true;
            }
            if (cM16138a > ' ' || !(cM16138a == ' ' || cM16138a == '\n' || cM16138a == '\r' || cM16138a == '\t' || cM16138a == '\f' || cM16138a == '\b')) {
                break;
            }
            i++;
        }
        return false;
    }

    public final boolean isEnabled(rp5 rp5Var) {
        return (rp5Var.f78973a & this.f57603c) != 0;
    }

    public final boolean isRef() {
        return this.f57608h == 4 && this.f57615o.startsWith("$ref", this.f57609i + 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005e -> B:8:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long longValue() throws java.lang.NumberFormatException {
        /*
            r13 = this;
            int r0 = r13.f57609i
            int r1 = r13.f57608h
            int r1 = r1 + r0
            char r2 = r13.m16138a(r0)
            r3 = 45
            r4 = 1
            if (r2 != r3) goto L15
            int r0 = r0 + 1
            r2 = -9223372036854775808
            r5 = r2
            r2 = r4
            goto L1b
        L15:
            r2 = 0
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L1b:
            if (r0 >= r1) goto L29
            int r3 = r0 + 1
            char r0 = r13.m16138a(r0)
            int r0 = r0 + (-48)
            int r0 = -r0
            long r7 = (long) r0
        L27:
            r0 = r3
            goto L2b
        L29:
            r7 = 0
        L2b:
            if (r0 >= r1) goto L75
            int r3 = r0 + 1
            int r9 = r13.f57616p
            if (r0 < r9) goto L36
            r0 = 26
            goto L3c
        L36:
            java.lang.String r9 = r13.f57615o
            char r0 = r9.charAt(r0)
        L3c:
            r9 = 76
            if (r0 == r9) goto L74
            r9 = 83
            if (r0 == r9) goto L74
            r9 = 66
            if (r0 != r9) goto L49
            goto L74
        L49:
            int r0 = r0 + (-48)
            r9 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L6a
            r9 = 10
            long r7 = r7 * r9
            long r9 = (long) r0
            long r11 = r5 + r9
            int r0 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r0 < 0) goto L60
            long r7 = r7 - r9
            goto L27
        L60:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L6a:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L74:
            r0 = r3
        L75:
            if (r2 == 0) goto L87
            int r1 = r13.f57609i
            int r1 = r1 + r4
            if (r0 <= r1) goto L7d
            return r7
        L7d:
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.String r1 = r13.numberString()
            r0.<init>(r1)
            throw r0
        L87:
            long r0 = -r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.longValue():long");
    }

    public boolean matchField(char[] cArr) {
        if (!charArrayCompare(cArr)) {
            return false;
        }
        int length = this.f57605e + cArr.length;
        this.f57605e = length;
        if (length >= this.f57616p) {
            throw new jh8("unclosed str, " + info());
        }
        char cCharAt = this.f57615o.charAt(length);
        this.f57604d = cCharAt;
        char cCharAt2 = f57593s;
        if (cCharAt == '{') {
            int i = this.f57605e + 1;
            this.f57605e = i;
            if (i < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i);
            }
            this.f57604d = cCharAt2;
            this.f57601a = 12;
        } else if (cCharAt == '[') {
            int i2 = this.f57605e + 1;
            this.f57605e = i2;
            if (i2 < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i2);
            }
            this.f57604d = cCharAt2;
            this.f57601a = 14;
        } else {
            nextToken();
        }
        return true;
    }

    public char next() {
        int i = this.f57605e + 1;
        this.f57605e = i;
        char cCharAt = i >= this.f57616p ? f57593s : this.f57615o.charAt(i);
        this.f57604d = cCharAt;
        return cCharAt;
    }

    public final void nextIdent() {
        char c;
        while (true) {
            c = this.f57604d;
            if (c > ' ' || !(c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == '\f' || c == '\b')) {
                break;
            } else {
                next();
            }
        }
        if (c == '_' || Character.isLetter(c)) {
            scanIdent();
        } else {
            nextToken();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0025, code lost:
    
        scanNumber();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0028, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0099, code lost:
    
        if (r7.f57601a == 20) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x009b, code lost:
    
        r7.f57601a = 20;
        r0 = r7.f57606f;
        r7.f57605e = r0;
        r7.f57602b = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00a3, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ab, code lost:
    
        throw new p000.jh8("EOF error");
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x00d5, code lost:
    
        scanIdent();
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00d8, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nextToken() {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.nextToken():void");
    }

    public final void nextTokenWithChar(char c) {
        this.f57608h = 0;
        while (true) {
            char c2 = this.f57604d;
            if (c2 == c) {
                int i = this.f57605e + 1;
                this.f57605e = i;
                this.f57604d = i >= this.f57616p ? f57593s : this.f57615o.charAt(i);
                nextToken();
                return;
            }
            if (c2 != ' ' && c2 != '\n' && c2 != '\r' && c2 != '\t' && c2 != '\f' && c2 != '\b') {
                throw new jh8("not match " + c + " - " + this.f57604d);
            }
            next();
        }
    }

    public final String numberString() {
        char cCharAt = this.f57615o.charAt((this.f57609i + this.f57608h) - 1);
        int i = this.f57608h;
        if (cCharAt == 'L' || cCharAt == 'S' || cCharAt == 'B' || cCharAt == 'F' || cCharAt == 'D') {
            i--;
        }
        return subString(this.f57609i, i);
    }

    public boolean scanBoolean() {
        int i;
        boolean z = false;
        if (this.f57615o.startsWith("false", this.f57605e)) {
            i = 5;
        } else if (this.f57615o.startsWith("true", this.f57605e)) {
            i = 4;
            z = true;
        } else {
            char c = this.f57604d;
            if (c == '1') {
                i = 1;
                z = true;
            } else {
                if (c != '0') {
                    this.f57614n = -1;
                    return false;
                }
                i = 1;
            }
        }
        int i2 = this.f57605e + i;
        this.f57605e = i2;
        this.f57604d = m16138a(i2);
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean scanFieldBoolean(char[] r12) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.scanFieldBoolean(char[]):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007b A[ADDED_TO_REGION] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x007d -> B:34:0x006e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final double scanFieldDouble(char[] r10) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.scanFieldDouble(char[]):double");
    }

    public final float scanFieldFloat(char[] cArr) {
        int i;
        char cM16138a;
        this.f57614n = 0;
        if (!charArrayCompare(cArr)) {
            this.f57614n = -2;
            return 0.0f;
        }
        int length = cArr.length;
        int i2 = length + 1;
        char cM16138a2 = m16138a(this.f57605e + length);
        if (cM16138a2 < '0' || cM16138a2 > '9') {
            this.f57614n = -1;
            return 0.0f;
        }
        while (true) {
            i = i2 + 1;
            cM16138a = m16138a(this.f57605e + i2);
            if (cM16138a < '0' || cM16138a > '9') {
                break;
            }
            i2 = i;
        }
        if (cM16138a == '.') {
            int i3 = i2 + 2;
            char cM16138a3 = m16138a(this.f57605e + i);
            if (cM16138a3 < '0' || cM16138a3 > '9') {
                this.f57614n = -1;
                return 0.0f;
            }
            while (true) {
                i = i3 + 1;
                cM16138a = m16138a(this.f57605e + i3);
                if (cM16138a < '0' || cM16138a > '9') {
                    break;
                }
                i3 = i;
            }
        }
        float f = Float.parseFloat(subString(cArr.length + this.f57605e, ((r3 + i) - r9) - 1));
        if (cM16138a == ',') {
            this.f57605e += i - 1;
            next();
            this.f57614n = 3;
            this.f57601a = 16;
            return f;
        }
        if (cM16138a != '}') {
            this.f57614n = -1;
            return 0.0f;
        }
        char cM16138a4 = m16138a(this.f57605e + i);
        if (cM16138a4 == ',') {
            this.f57601a = 16;
            this.f57605e += i;
            next();
        } else if (cM16138a4 == ']') {
            this.f57601a = 15;
            this.f57605e += i;
            next();
        } else if (cM16138a4 == '}') {
            this.f57601a = 13;
            this.f57605e += i;
            next();
        } else {
            if (cM16138a4 != 26) {
                this.f57614n = -1;
                return 0.0f;
            }
            this.f57605e += i;
            this.f57601a = 20;
            this.f57604d = f57593s;
        }
        this.f57614n = 4;
        return f;
    }

    public int scanFieldInt(char[] cArr) {
        boolean z;
        int i;
        char cM16138a;
        this.f57614n = 0;
        if (!charArrayCompare(cArr)) {
            this.f57614n = -2;
            return 0;
        }
        int length = cArr.length;
        int i2 = length + 1;
        char cM16138a2 = m16138a(this.f57605e + length);
        char cCharAt = f57593s;
        if (cM16138a2 == '\"') {
            int i3 = length + 2;
            int i4 = this.f57605e + i2;
            cM16138a2 = i4 >= this.f57616p ? (char) 26 : this.f57615o.charAt(i4);
            i2 = i3;
            z = true;
        } else {
            z = false;
        }
        if (cM16138a2 < '0' || cM16138a2 > '9') {
            this.f57614n = -1;
            return 0;
        }
        int i5 = cM16138a2 - '0';
        while (true) {
            i = i2 + 1;
            cM16138a = m16138a(this.f57605e + i2);
            if (cM16138a < '0' || cM16138a > '9') {
                break;
            }
            i5 = (i5 * 10) + (cM16138a - '0');
            i2 = i;
        }
        if (cM16138a == '.') {
            this.f57614n = -1;
            return 0;
        }
        if (cM16138a == '\"') {
            if (!z) {
                this.f57614n = -1;
                return 0;
            }
            int i6 = i2 + 2;
            int i7 = this.f57605e + i;
            cM16138a = i7 >= this.f57616p ? (char) 26 : this.f57615o.charAt(i7);
            i = i6;
        }
        if (i5 < 0) {
            this.f57614n = -1;
            return 0;
        }
        if (cM16138a == ',') {
            int i8 = this.f57605e + (i - 1) + 1;
            this.f57605e = i8;
            if (i8 < this.f57616p) {
                cCharAt = this.f57615o.charAt(i8);
            }
            this.f57604d = cCharAt;
            this.f57614n = 3;
            this.f57601a = 16;
            return i5;
        }
        if (cM16138a != '}') {
            this.f57614n = -1;
            return 0;
        }
        char cM16138a3 = m16138a(this.f57605e + i);
        if (cM16138a3 == ',') {
            this.f57601a = 16;
            int i9 = this.f57605e + i + 1;
            this.f57605e = i9;
            if (i9 < this.f57616p) {
                cCharAt = this.f57615o.charAt(i9);
            }
            this.f57604d = cCharAt;
        } else if (cM16138a3 == ']') {
            this.f57601a = 15;
            int i10 = this.f57605e + i + 1;
            this.f57605e = i10;
            if (i10 < this.f57616p) {
                cCharAt = this.f57615o.charAt(i10);
            }
            this.f57604d = cCharAt;
        } else if (cM16138a3 == '}') {
            this.f57601a = 13;
            int i11 = this.f57605e + i + 1;
            this.f57605e = i11;
            if (i11 < this.f57616p) {
                cCharAt = this.f57615o.charAt(i11);
            }
            this.f57604d = cCharAt;
        } else {
            if (cM16138a3 != 26) {
                this.f57614n = -1;
                return 0;
            }
            this.f57601a = 20;
            this.f57605e += i;
            this.f57604d = f57593s;
        }
        this.f57614n = 4;
        return i5;
    }

    public long scanFieldLong(char[] cArr) {
        int i;
        char cCharAt;
        boolean z = false;
        this.f57614n = 0;
        if (!charArrayCompare(cArr)) {
            this.f57614n = -2;
            return 0L;
        }
        int length = cArr.length;
        int i2 = length + 1;
        int i3 = this.f57605e + length;
        int i4 = this.f57616p;
        char cCharAt2 = f57593s;
        char cCharAt3 = i3 >= i4 ? (char) 26 : this.f57615o.charAt(i3);
        if (cCharAt3 == '\"') {
            int i5 = length + 2;
            int i6 = this.f57605e + i2;
            cCharAt3 = i6 >= this.f57616p ? (char) 26 : this.f57615o.charAt(i6);
            i2 = i5;
            z = true;
        }
        if (cCharAt3 < '0' || cCharAt3 > '9') {
            this.f57614n = -1;
            return 0L;
        }
        long j = cCharAt3 - '0';
        while (true) {
            i = i2 + 1;
            int i7 = this.f57605e + i2;
            cCharAt = i7 >= this.f57616p ? (char) 26 : this.f57615o.charAt(i7);
            if (cCharAt < '0' || cCharAt > '9') {
                break;
            }
            j = (j * 10) + ((long) (cCharAt - '0'));
            i2 = i;
        }
        if (cCharAt == '.') {
            this.f57614n = -1;
            return 0L;
        }
        if (cCharAt == '\"') {
            if (!z) {
                this.f57614n = -1;
                return 0L;
            }
            int i8 = i2 + 2;
            int i9 = this.f57605e + i;
            cCharAt = i9 >= this.f57616p ? (char) 26 : this.f57615o.charAt(i9);
            i = i8;
        }
        if (j < 0) {
            this.f57614n = -1;
            return 0L;
        }
        if (cCharAt == ',') {
            int i10 = this.f57605e + (i - 1) + 1;
            this.f57605e = i10;
            if (i10 < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i10);
            }
            this.f57604d = cCharAt2;
            this.f57614n = 3;
            this.f57601a = 16;
            return j;
        }
        if (cCharAt != '}') {
            this.f57614n = -1;
            return 0L;
        }
        char cM16138a = m16138a(this.f57605e + i);
        if (cM16138a == ',') {
            this.f57601a = 16;
            int i11 = this.f57605e + i + 1;
            this.f57605e = i11;
            if (i11 < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i11);
            }
            this.f57604d = cCharAt2;
        } else if (cM16138a == ']') {
            this.f57601a = 15;
            int i12 = this.f57605e + i + 1;
            this.f57605e = i12;
            if (i12 < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i12);
            }
            this.f57604d = cCharAt2;
        } else if (cM16138a == '}') {
            this.f57601a = 13;
            int i13 = this.f57605e + i + 1;
            this.f57605e = i13;
            if (i13 < this.f57616p) {
                cCharAt2 = this.f57615o.charAt(i13);
            }
            this.f57604d = cCharAt2;
        } else {
            if (cM16138a != 26) {
                this.f57614n = -1;
                return 0L;
            }
            this.f57601a = 20;
            this.f57605e += i;
            this.f57604d = f57593s;
        }
        this.f57614n = 4;
        return j;
    }

    public String scanFieldString(char[] cArr) {
        String str;
        this.f57614n = 0;
        if (!charArrayCompare(cArr)) {
            this.f57614n = -2;
            return this.f57617q;
        }
        int length = cArr.length;
        int i = length + 1;
        int i2 = this.f57605e + length;
        if (i2 >= this.f57616p) {
            throw new jh8("unclosed str, " + info());
        }
        if (this.f57615o.charAt(i2) != '\"') {
            this.f57614n = -1;
            return this.f57617q;
        }
        int i3 = this.f57605e + i;
        int iIndexOf = this.f57615o.indexOf(34, i3);
        if (iIndexOf == -1) {
            throw new jh8("unclosed str, " + info());
        }
        if (f57599y) {
            str = this.f57615o.substring(i3, iIndexOf);
        } else {
            int i4 = iIndexOf - i3;
            str = new String(m16141f(this.f57605e + i, i4), 0, i4);
        }
        if (str.indexOf(92) != -1) {
            boolean z = false;
            while (true) {
                int i5 = iIndexOf - 1;
                int i6 = 0;
                while (i5 >= 0 && this.f57615o.charAt(i5) == '\\') {
                    i6++;
                    i5--;
                    z = true;
                }
                if (i6 % 2 == 0) {
                    break;
                }
                iIndexOf = this.f57615o.indexOf(34, iIndexOf + 1);
            }
            int i7 = iIndexOf - i3;
            char[] cArrM16141f = m16141f(this.f57605e + i, i7);
            if (z) {
                str = readString(cArrM16141f, i7);
            } else {
                str = new String(cArrM16141f, 0, i7);
                if (str.indexOf(92) != -1) {
                    str = readString(cArrM16141f, i7);
                }
            }
        }
        int i8 = iIndexOf + 1;
        int i9 = this.f57616p;
        char cCharAt = f57593s;
        char cCharAt2 = i8 >= i9 ? (char) 26 : this.f57615o.charAt(i8);
        if (cCharAt2 == ',') {
            int i10 = iIndexOf + 2;
            this.f57605e = i10;
            if (i10 < this.f57616p) {
                cCharAt = this.f57615o.charAt(i10);
            }
            this.f57604d = cCharAt;
            this.f57614n = 3;
            this.f57601a = 16;
            return str;
        }
        if (cCharAt2 != '}') {
            this.f57614n = -1;
            return this.f57617q;
        }
        int i11 = iIndexOf + 2;
        char cM16138a = m16138a(i11);
        if (cM16138a == ',') {
            this.f57601a = 16;
            this.f57605e = i11;
            next();
        } else if (cM16138a == ']') {
            this.f57601a = 15;
            this.f57605e = i11;
            next();
        } else if (cM16138a == '}') {
            this.f57601a = 13;
            this.f57605e = i11;
            next();
        } else {
            if (cM16138a != 26) {
                this.f57614n = -1;
                return this.f57617q;
            }
            this.f57601a = 20;
            this.f57605e = i11;
            this.f57604d = f57593s;
        }
        this.f57614n = 4;
        return str;
    }

    public String scanFieldSymbol(char[] cArr, rhg rhgVar) {
        int i = 0;
        this.f57614n = 0;
        if (!charArrayCompare(cArr)) {
            this.f57614n = -2;
            return null;
        }
        int length = cArr.length;
        int i2 = length + 1;
        if (m16138a(this.f57605e + length) != '\"') {
            this.f57614n = -1;
            return null;
        }
        while (true) {
            int i3 = i2 + 1;
            char cM16138a = m16138a(this.f57605e + i2);
            if (cM16138a == '\"') {
                String strAddSymbol = rhgVar.addSymbol(this.f57615o, cArr.length + this.f57605e + 1, ((r1 + i3) - r8) - 1, i);
                int i4 = i2 + 2;
                char cM16138a2 = m16138a(this.f57605e + i3);
                char cCharAt = f57593s;
                if (cM16138a2 == ',') {
                    int i5 = this.f57605e + i2 + 1 + 1;
                    this.f57605e = i5;
                    if (i5 < this.f57616p) {
                        cCharAt = this.f57615o.charAt(i5);
                    }
                    this.f57604d = cCharAt;
                    this.f57614n = 3;
                    return strAddSymbol;
                }
                if (cM16138a2 != '}') {
                    this.f57614n = -1;
                    return null;
                }
                char cM16138a3 = m16138a(this.f57605e + i4);
                if (cM16138a3 == ',') {
                    this.f57601a = 16;
                    this.f57605e += i2 + 2;
                    next();
                } else if (cM16138a3 == ']') {
                    this.f57601a = 15;
                    this.f57605e += i2 + 2;
                    next();
                } else if (cM16138a3 == '}') {
                    this.f57601a = 13;
                    this.f57605e += i2 + 2;
                    next();
                } else {
                    if (cM16138a3 != 26) {
                        this.f57614n = -1;
                        return null;
                    }
                    this.f57601a = 20;
                    this.f57605e += i2 + 2;
                    this.f57604d = f57593s;
                }
                this.f57614n = 4;
                return strAddSymbol;
            }
            i = (i * 31) + cM16138a;
            if (cM16138a == '\\') {
                this.f57614n = -1;
                return null;
            }
            i2 = i3;
        }
    }

    public boolean scanISO8601DateIfMatch(boolean z) {
        int i;
        int i2;
        int i3;
        char c;
        int i4;
        char cM16138a;
        int i5;
        char cM16138a2;
        int i6;
        int i7;
        char cM16138a3;
        int length = this.f57615o.length();
        int i8 = this.f57605e;
        int i9 = length - i8;
        if (!z && i9 > 13 && this.f57615o.startsWith("/Date(", i8) && m16138a((this.f57605e + i9) - 1) == '/' && m16138a((this.f57605e + i9) - 2) == ')') {
            int i10 = -1;
            for (int i11 = 6; i11 < i9; i11++) {
                char cM16138a4 = m16138a(this.f57605e + i11);
                if (cM16138a4 != '+') {
                    if (cM16138a4 < '0' || cM16138a4 > '9') {
                        break;
                    }
                } else {
                    i10 = i11;
                }
            }
            if (i10 == -1) {
                return false;
            }
            int i12 = this.f57605e + 6;
            long j = Long.parseLong(subString(i12, i10 - i12));
            Calendar calendar = Calendar.getInstance(this.f57611k, this.f57612l);
            this.f57613m = calendar;
            calendar.setTimeInMillis(j);
            this.f57601a = 5;
            return true;
        }
        if (i9 == 8 || i9 == 14 || i9 == 17) {
            int i13 = 0;
            if (z) {
                return false;
            }
            char cM16138a5 = m16138a(this.f57605e);
            char cM16138a6 = m16138a(this.f57605e + 1);
            char cM16138a7 = m16138a(this.f57605e + 2);
            char cM16138a8 = m16138a(this.f57605e + 3);
            char cM16138a9 = m16138a(this.f57605e + 4);
            char cM16138a10 = m16138a(this.f57605e + 5);
            char cM16138a11 = m16138a(this.f57605e + 6);
            char cM16138a12 = m16138a(this.f57605e + 7);
            if (!m16136b(cM16138a5, cM16138a6, cM16138a7, cM16138a8, cM16138a9, cM16138a10, cM16138a11, cM16138a12)) {
                return false;
            }
            setCalendar(cM16138a5, cM16138a6, cM16138a7, cM16138a8, cM16138a9, cM16138a10, cM16138a11, cM16138a12);
            if (i9 != 8) {
                char cM16138a13 = m16138a(this.f57605e + 8);
                char cM16138a14 = m16138a(this.f57605e + 9);
                char cM16138a15 = m16138a(this.f57605e + 10);
                char cM16138a16 = m16138a(this.f57605e + 11);
                char cM16138a17 = m16138a(this.f57605e + 12);
                char cM16138a18 = m16138a(this.f57605e + 13);
                if (!m16137c(cM16138a13, cM16138a14, cM16138a15, cM16138a16, cM16138a17, cM16138a18)) {
                    return false;
                }
                if (i9 == 17) {
                    char cM16138a19 = m16138a(this.f57605e + 14);
                    char cM16138a20 = m16138a(this.f57605e + 15);
                    char cM16138a21 = m16138a(this.f57605e + 16);
                    c = '0';
                    if (cM16138a19 < '0' || cM16138a19 > '9' || cM16138a20 < '0' || cM16138a20 > '9' || cM16138a21 < '0' || cM16138a21 > '9') {
                        return false;
                    }
                    i4 = ((cM16138a19 - '0') * 100) + ((cM16138a20 - '0') * 10) + (cM16138a21 - '0');
                } else {
                    c = '0';
                    i4 = 0;
                }
                i2 = ((cM16138a17 - '0') * 10) + (cM16138a18 - '0');
                i13 = ((cM16138a15 - c) * 10) + (cM16138a16 - c);
                int i14 = i4;
                i3 = ((cM16138a13 - c) * 10) + (cM16138a14 - c);
                i = i14;
            } else {
                i = 0;
                i2 = 0;
                i3 = 0;
            }
            this.f57613m.set(11, i3);
            this.f57613m.set(12, i13);
            this.f57613m.set(13, i2);
            this.f57613m.set(14, i);
            this.f57601a = 5;
            return true;
        }
        if (i9 < 10 || m16138a(this.f57605e + 4) != '-' || m16138a(this.f57605e + 7) != '-') {
            return false;
        }
        char cM16138a22 = m16138a(this.f57605e);
        char cM16138a23 = m16138a(this.f57605e + 1);
        char cM16138a24 = m16138a(this.f57605e + 2);
        char cM16138a25 = m16138a(this.f57605e + 3);
        char cM16138a26 = m16138a(this.f57605e + 5);
        char cM16138a27 = m16138a(this.f57605e + 6);
        char cM16138a28 = m16138a(this.f57605e + 8);
        char cM16138a29 = m16138a(this.f57605e + 9);
        if (!m16136b(cM16138a22, cM16138a23, cM16138a24, cM16138a25, cM16138a26, cM16138a27, cM16138a28, cM16138a29)) {
            return false;
        }
        setCalendar(cM16138a22, cM16138a23, cM16138a24, cM16138a25, cM16138a26, cM16138a27, cM16138a28, cM16138a29);
        char cM16138a30 = m16138a(this.f57605e + 10);
        if (cM16138a30 != 'T' && (cM16138a30 != ' ' || z)) {
            if (cM16138a30 != '\"' && cM16138a30 != 26) {
                return false;
            }
            this.f57613m.set(11, 0);
            this.f57613m.set(12, 0);
            this.f57613m.set(13, 0);
            this.f57613m.set(14, 0);
            int i15 = this.f57605e + 10;
            this.f57605e = i15;
            this.f57604d = m16138a(i15);
            this.f57601a = 5;
            return true;
        }
        if (i9 < 19 || m16138a(this.f57605e + 13) != ':' || m16138a(this.f57605e + 16) != ':') {
            return false;
        }
        char cM16138a31 = m16138a(this.f57605e + 11);
        char cM16138a32 = m16138a(this.f57605e + 12);
        char cM16138a33 = m16138a(this.f57605e + 14);
        char cM16138a34 = m16138a(this.f57605e + 15);
        char cM16138a35 = m16138a(this.f57605e + 17);
        char cM16138a36 = m16138a(this.f57605e + 18);
        if (!m16137c(cM16138a31, cM16138a32, cM16138a33, cM16138a34, cM16138a35, cM16138a36)) {
            return false;
        }
        this.f57613m.set(11, ((cM16138a31 - '0') * 10) + (cM16138a32 - '0'));
        this.f57613m.set(12, ((cM16138a33 - '0') * 10) + (cM16138a34 - '0'));
        this.f57613m.set(13, ((cM16138a35 - '0') * 10) + (cM16138a36 - '0'));
        char cM16138a37 = m16138a(this.f57605e + 19);
        if (cM16138a37 != '.') {
            this.f57613m.set(14, 0);
            int i16 = this.f57605e + 19;
            this.f57605e = i16;
            this.f57604d = m16138a(i16);
            this.f57601a = 5;
            if (cM16138a37 == 'Z' && this.f57613m.getTimeZone().getRawOffset() != 0) {
                String[] availableIDs = TimeZone.getAvailableIDs(0);
                if (availableIDs.length > 0) {
                    this.f57613m.setTimeZone(TimeZone.getTimeZone(availableIDs[0]));
                }
            }
            return true;
        }
        if (i9 >= 23 && (cM16138a = m16138a(this.f57605e + 20)) >= '0' && cM16138a <= '9') {
            int[] iArr = f57588A;
            int i17 = iArr[cM16138a];
            char cM16138a38 = m16138a(this.f57605e + 21);
            if (cM16138a38 < '0' || cM16138a38 > '9') {
                i5 = 1;
            } else {
                i17 = (i17 * 10) + iArr[cM16138a38];
                i5 = 2;
            }
            if (i5 == 2 && (cM16138a3 = m16138a(this.f57605e + 22)) >= '0' && cM16138a3 <= '9') {
                i17 = (i17 * 10) + iArr[cM16138a3];
                i5 = 3;
            }
            this.f57613m.set(14, i17);
            char cM16138a39 = m16138a(this.f57605e + 20 + i5);
            if (cM16138a39 == '+' || cM16138a39 == '-') {
                char cM16138a40 = m16138a(this.f57605e + 20 + i5 + 1);
                if (cM16138a40 >= '0' && cM16138a40 <= '1' && (cM16138a2 = m16138a(this.f57605e + 20 + i5 + 2)) >= '0' && cM16138a2 <= '9') {
                    char cM16138a41 = m16138a(this.f57605e + 20 + i5 + 3);
                    if (cM16138a41 == ':') {
                        if (m16138a(this.f57605e + 20 + i5 + 4) != '0' || m16138a(this.f57605e + 20 + i5 + 5) != '0') {
                            return false;
                        }
                        i6 = 6;
                    } else if (cM16138a41 != '0') {
                        i6 = 3;
                    } else {
                        if (m16138a(this.f57605e + 20 + i5 + 4) != '0') {
                            return false;
                        }
                        i6 = 5;
                    }
                    int i18 = ((iArr[cM16138a40] * 10) + iArr[cM16138a2]) * 3600000;
                    if (cM16138a39 == '-') {
                        i18 = -i18;
                    }
                    if (this.f57613m.getTimeZone().getRawOffset() != i18) {
                        String[] availableIDs2 = TimeZone.getAvailableIDs(i18);
                        if (availableIDs2.length > 0) {
                            this.f57613m.setTimeZone(TimeZone.getTimeZone(availableIDs2[0]));
                        }
                    }
                    i7 = i6;
                }
            } else if (cM16138a39 == 'Z') {
                if (this.f57613m.getTimeZone().getRawOffset() != 0) {
                    String[] availableIDs3 = TimeZone.getAvailableIDs(0);
                    if (availableIDs3.length > 0) {
                        this.f57613m.setTimeZone(TimeZone.getTimeZone(availableIDs3[0]));
                    }
                }
                i7 = 1;
            } else {
                i7 = 0;
            }
            int i19 = i5 + 20 + i7;
            char cM16138a42 = m16138a(this.f57605e + i19);
            if (cM16138a42 != 26 && cM16138a42 != '\"') {
                return false;
            }
            int i20 = this.f57605e + i19;
            this.f57605e = i20;
            this.f57604d = m16138a(i20);
            this.f57601a = 5;
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c0, code lost:
    
        if (r0 != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c3, code lost:
    
        return -r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:?, code lost:
    
        return r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long scanLongValue() {
        /*
            r12 = this;
            r0 = 0
            r12.f57609i = r0
            char r1 = r12.f57604d
            r2 = 45
            r3 = 1
            if (r1 != r2) goto L3d
            r12.f57609i = r3
            int r0 = r12.f57605e
            int r0 = r0 + r3
            r12.f57605e = r0
            int r1 = r12.f57616p
            if (r0 >= r1) goto L22
            java.lang.String r1 = r12.f57615o
            char r0 = r1.charAt(r0)
            r12.f57604d = r0
            r0 = -9223372036854775808
            r1 = r0
            r0 = r3
            goto L42
        L22:
            jh8 r0 = new jh8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "syntax error, "
            r1.append(r2)
            java.lang.String r2 = r12.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L42:
            r4 = 0
        L44:
            char r6 = r12.f57604d
            r7 = 48
            if (r6 < r7) goto Lc0
            r7 = 57
            if (r6 > r7) goto Lc0
            int r6 = r6 + (-48)
            r7 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r7 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            java.lang.String r8 = ", "
            java.lang.String r9 = "error long value, "
            if (r7 < 0) goto La1
            r10 = 10
            long r4 = r4 * r10
            long r6 = (long) r6
            long r10 = r1 + r6
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r10 < 0) goto L82
            long r4 = r4 - r6
            int r6 = r12.f57609i
            int r6 = r6 + r3
            r12.f57609i = r6
            int r6 = r12.f57605e
            int r6 = r6 + r3
            r12.f57605e = r6
            int r7 = r12.f57616p
            if (r6 < r7) goto L79
            r6 = 26
            goto L7f
        L79:
            java.lang.String r7 = r12.f57615o
            char r6 = r7.charAt(r6)
        L7f:
            r12.f57604d = r6
            goto L44
        L82:
            jh8 r0 = new jh8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r4)
            r1.append(r8)
            java.lang.String r2 = r12.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        La1:
            jh8 r0 = new jh8
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            r1.append(r4)
            r1.append(r8)
            java.lang.String r2 = r12.info()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Lc0:
            if (r0 != 0) goto Lc3
            long r4 = -r4
        Lc3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.scanLongValue():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void scanNumber() {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.scanNumber():void");
    }

    public final Number scanNumberValue() {
        long j;
        boolean z;
        char c;
        Number numberValueOf;
        boolean z2;
        char c2;
        int i = this.f57605e;
        this.f57609i = 0;
        boolean z3 = true;
        if (this.f57604d == '-') {
            this.f57609i = 1;
            int i2 = i + 1;
            this.f57605e = i2;
            this.f57604d = i2 >= this.f57616p ? f57593s : this.f57615o.charAt(i2);
            j = Long.MIN_VALUE;
            z = true;
        } else {
            j = -9223372036854775807L;
            z = false;
        }
        long j2 = 0;
        boolean z4 = false;
        while (true) {
            c = this.f57604d;
            if (c < '0' || c > '9') {
                break;
            }
            int i3 = c - '0';
            if (j2 < -922337203685477580L) {
                z4 = true;
            }
            long j3 = j2 * 10;
            long j4 = i3;
            if (j3 < j + j4) {
                z4 = true;
            }
            j2 = j3 - j4;
            this.f57609i++;
            int i4 = this.f57605e + 1;
            this.f57605e = i4;
            this.f57604d = i4 >= this.f57616p ? f57593s : this.f57615o.charAt(i4);
        }
        if (!z) {
            j2 = -j2;
        }
        if (c == 'L') {
            this.f57609i++;
            next();
            numberValueOf = Long.valueOf(j2);
        } else if (c == 'S') {
            this.f57609i++;
            next();
            numberValueOf = Short.valueOf((short) j2);
        } else if (c == 'B') {
            this.f57609i++;
            next();
            numberValueOf = Byte.valueOf((byte) j2);
        } else if (c == 'F') {
            this.f57609i++;
            next();
            numberValueOf = Float.valueOf(j2);
        } else if (c == 'D') {
            this.f57609i++;
            next();
            numberValueOf = Double.valueOf(j2);
        } else {
            numberValueOf = null;
        }
        if (this.f57604d == '.') {
            this.f57609i++;
            int i5 = this.f57605e + 1;
            this.f57605e = i5;
            this.f57604d = i5 >= this.f57616p ? f57593s : this.f57615o.charAt(i5);
            while (true) {
                char c3 = this.f57604d;
                if (c3 < '0' || c3 > '9') {
                    break;
                }
                this.f57609i++;
                int i6 = this.f57605e + 1;
                this.f57605e = i6;
                this.f57604d = i6 >= this.f57616p ? f57593s : this.f57615o.charAt(i6);
            }
            z2 = true;
        } else {
            z2 = false;
        }
        char c4 = this.f57604d;
        if (c4 == 'e' || c4 == 'E') {
            this.f57609i++;
            int i7 = this.f57605e + 1;
            this.f57605e = i7;
            char cCharAt = i7 >= this.f57616p ? f57593s : this.f57615o.charAt(i7);
            this.f57604d = cCharAt;
            if (cCharAt == '+' || cCharAt == '-') {
                this.f57609i++;
                int i8 = this.f57605e + 1;
                this.f57605e = i8;
                this.f57604d = i8 >= this.f57616p ? f57593s : this.f57615o.charAt(i8);
            }
            while (true) {
                c2 = this.f57604d;
                if (c2 < '0' || c2 > '9') {
                    break;
                }
                this.f57609i++;
                int i9 = this.f57605e + 1;
                this.f57605e = i9;
                this.f57604d = i9 >= this.f57616p ? f57593s : this.f57615o.charAt(i9);
            }
            if (c2 == 'D' || c2 == 'F') {
                this.f57609i++;
                next();
            } else {
                c2 = 0;
            }
        } else {
            c2 = 0;
            z3 = false;
        }
        if (!z2 && !z3) {
            if (z4) {
                int i10 = this.f57605e;
                char[] cArr = new char[i10 - i];
                this.f57615o.getChars(i, i10, cArr, 0);
                numberValueOf = new BigInteger(new String(cArr));
            }
            return numberValueOf == null ? (j2 <= -2147483648L || j2 >= 2147483647L) ? Long.valueOf(j2) : Integer.valueOf((int) j2) : numberValueOf;
        }
        int i11 = this.f57605e - i;
        if (c2 != 0) {
            i11--;
        }
        char[] cArr2 = new char[i11];
        this.f57615o.getChars(i, i11 + i, cArr2, 0);
        if (!z3 && (this.f57603c & rp5.UseBigDecimal.f78973a) != 0) {
            return new BigDecimal(cArr2);
        }
        String str = new String(cArr2);
        try {
            return c2 == 'F' ? Float.valueOf(str) : Double.valueOf(Double.parseDouble(str));
        } catch (NumberFormatException e) {
            throw new jh8(e.getMessage() + ", " + info(), e);
        }
    }

    public final void scanString() {
        char c = this.f57604d;
        int i = this.f57605e + 1;
        int iIndexOf = this.f57615o.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new jh8("unclosed str, " + info());
        }
        int i2 = iIndexOf - i;
        char[] cArrM16141f = m16141f(this.f57605e + 1, i2);
        boolean z = false;
        while (i2 > 0 && cArrM16141f[i2 - 1] == '\\') {
            int i3 = 1;
            for (int i4 = i2 - 2; i4 >= 0 && cArrM16141f[i4] == '\\'; i4--) {
                i3++;
            }
            if (i3 % 2 == 0) {
                break;
            }
            int iIndexOf2 = this.f57615o.indexOf(c, iIndexOf + 1);
            int i5 = (iIndexOf2 - iIndexOf) + i2;
            if (i5 >= cArrM16141f.length) {
                int length = (cArrM16141f.length * 3) / 2;
                if (length < i5) {
                    length = i5;
                }
                char[] cArr = new char[length];
                System.arraycopy(cArrM16141f, 0, cArr, 0, cArrM16141f.length);
                cArrM16141f = cArr;
            }
            this.f57615o.getChars(iIndexOf, iIndexOf2, cArrM16141f, i2);
            iIndexOf = iIndexOf2;
            i2 = i5;
            z = true;
        }
        if (!z) {
            for (int i6 = 0; i6 < i2; i6++) {
                if (cArrM16141f[i6] == '\\') {
                    z = true;
                }
            }
        }
        this.f57607g = cArrM16141f;
        this.f57608h = i2;
        this.f57609i = this.f57605e;
        this.f57610j = z;
        int i7 = iIndexOf + 1;
        this.f57605e = i7;
        this.f57604d = i7 >= this.f57616p ? f57593s : this.f57615o.charAt(i7);
        this.f57601a = 4;
    }

    public String scanStringValue(char c) {
        String str;
        int i = this.f57605e + 1;
        int iIndexOf = this.f57615o.indexOf(c, i);
        if (iIndexOf == -1) {
            throw new jh8("unclosed str, " + info());
        }
        if (f57599y) {
            str = this.f57615o.substring(i, iIndexOf);
        } else {
            int i2 = iIndexOf - i;
            str = new String(m16141f(this.f57605e + 1, i2), 0, i2);
        }
        if (str.indexOf(92) != -1) {
            while (true) {
                int i3 = 0;
                for (int i4 = iIndexOf - 1; i4 >= 0 && this.f57615o.charAt(i4) == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                iIndexOf = this.f57615o.indexOf(c, iIndexOf + 1);
            }
            int i5 = iIndexOf - i;
            str = readString(m16141f(this.f57605e + 1, i5), i5);
        }
        int i6 = iIndexOf + 1;
        this.f57605e = i6;
        this.f57604d = i6 >= this.f57616p ? f57593s : this.f57615o.charAt(i6);
        return str;
    }

    public final String scanSymbol(rhg rhgVar) {
        char c;
        while (true) {
            c = this.f57604d;
            if (c != ' ' && c != '\n' && c != '\r' && c != '\t' && c != '\f' && c != '\b') {
                break;
            }
            next();
        }
        if (c == '\"') {
            return scanSymbol(rhgVar, '\"');
        }
        if (c == '\'') {
            if ((this.f57603c & rp5.AllowSingleQuotes.f78973a) != 0) {
                return scanSymbol(rhgVar, '\'');
            }
            throw new jh8("syntax error");
        }
        if (c == '}') {
            next();
            this.f57601a = 13;
            return null;
        }
        if (c == ',') {
            next();
            this.f57601a = 16;
            return null;
        }
        if (c == 26) {
            this.f57601a = 20;
            return null;
        }
        if ((this.f57603c & rp5.AllowUnQuotedFieldNames.f78973a) != 0) {
            return scanSymbolUnQuoted(rhgVar);
        }
        throw new jh8("syntax error");
    }

    public final String scanSymbolUnQuoted(rhg rhgVar) {
        int i = this.f57604d;
        boolean[] zArr = f57591D;
        if (i < zArr.length && !zArr[i]) {
            throw new jh8("illegal identifier : " + this.f57604d + ", " + info());
        }
        this.f57609i = this.f57605e;
        this.f57608h = 1;
        while (true) {
            char next = next();
            boolean[] zArr2 = f57592E;
            if (next < zArr2.length && !zArr2[next]) {
                break;
            }
            i = (i * 31) + next;
            this.f57608h++;
        }
        this.f57604d = m16138a(this.f57605e);
        this.f57601a = 18;
        if (this.f57608h == 4 && this.f57615o.startsWith("null", this.f57609i)) {
            return null;
        }
        return rhgVar.addSymbol(this.f57615o, this.f57609i, this.f57608h, i);
    }

    public final String stringVal() {
        return this.f57610j ? readString(this.f57607g, this.f57608h) : subString(this.f57609i + 1, this.f57608h);
    }

    public final int token() {
        return this.f57601a;
    }

    public final String tokenName() {
        return sh8.name(this.f57601a);
    }

    public lh8(char[] cArr, int i) {
        this(cArr, i, fh8.f36585d);
    }

    public lh8(char[] cArr, int i, int i2) {
        this(new String(cArr, 0, i), i2);
    }

    public lh8(String str, int i) {
        this.f57603c = fh8.f36585d;
        this.f57611k = fh8.f36582a;
        this.f57612l = fh8.f36583b;
        this.f57613m = null;
        this.f57614n = 0;
        char[] cArr = f57600z.get();
        this.f57607g = cArr;
        if (cArr == null) {
            this.f57607g = new char[512];
        }
        this.f57603c = i;
        this.f57615o = str;
        int length = str.length();
        this.f57616p = length;
        int i2 = (-1) + 1;
        this.f57605e = i2;
        char cCharAt = i2 >= length ? f57593s : str.charAt(i2);
        this.f57604d = cCharAt;
        if (cCharAt == 65279) {
            next();
        }
        this.f57617q = (rp5.InitStringFieldAsEmpty.f78973a & i) != 0 ? "" : null;
        this.f57618r = (rp5.DisableCircularReferenceDetect.f78973a & i) != 0;
    }

    public final BigDecimal decimalValue() {
        return new BigDecimal(numberString());
    }

    public static final byte[] decodeFast(String str, int i, int i2) {
        int i3;
        if (i2 == 0) {
            return new byte[0];
        }
        int i4 = (i + i2) - 1;
        int i5 = i;
        while (i5 < i4 && f57590C[str.charAt(i5)] < 0) {
            i5++;
        }
        while (i4 > 0 && f57590C[str.charAt(i4)] < 0) {
            i4--;
        }
        int i6 = str.charAt(i4) == '=' ? str.charAt(i4 + (-1)) == '=' ? 2 : 1 : 0;
        int i7 = (i4 - i5) + 1;
        if (i2 > 76) {
            i3 = (str.charAt(76) == '\r' ? i7 / 78 : 0) << 1;
        } else {
            i3 = 0;
        }
        int i8 = (((i7 - i3) * 6) >> 3) - i6;
        byte[] bArr = new byte[i8];
        int i9 = (i8 / 3) * 3;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i9) {
            int[] iArr = f57590C;
            int i12 = i5 + 4;
            int i13 = iArr[str.charAt(i5 + 3)] | (iArr[str.charAt(i5 + 1)] << 12) | (iArr[str.charAt(i5)] << 18) | (iArr[str.charAt(i5 + 2)] << 6);
            bArr[i10] = (byte) (i13 >> 16);
            int i14 = i10 + 2;
            bArr[i10 + 1] = (byte) (i13 >> 8);
            i10 += 3;
            bArr[i14] = (byte) i13;
            if (i3 <= 0 || (i11 = i11 + 1) != 19) {
                i5 = i12;
            } else {
                i5 += 6;
                i11 = 0;
            }
        }
        if (i10 < i8) {
            int i15 = 0;
            int i16 = 0;
            while (i5 <= i4 - i6) {
                i15 |= f57590C[str.charAt(i5)] << (18 - (i16 * 6));
                i16++;
                i5++;
            }
            int i17 = 16;
            while (i10 < i8) {
                bArr[i10] = (byte) (i15 >> i17);
                i17 -= 8;
                i10++;
            }
        }
        return bArr;
    }

    public String scanSymbol(rhg rhgVar, char c) {
        String string;
        int i = this.f57605e + 1;
        int iIndexOf = this.f57615o.indexOf(c, i);
        if (iIndexOf != -1) {
            int i2 = iIndexOf - i;
            char[] cArrM16141f = m16141f(this.f57605e + 1, i2);
            boolean z = false;
            while (i2 > 0 && cArrM16141f[i2 - 1] == '\\') {
                int i3 = 1;
                for (int i4 = i2 - 2; i4 >= 0 && cArrM16141f[i4] == '\\'; i4--) {
                    i3++;
                }
                if (i3 % 2 == 0) {
                    break;
                }
                int iIndexOf2 = this.f57615o.indexOf(c, iIndexOf + 1);
                int i5 = (iIndexOf2 - iIndexOf) + i2;
                if (i5 >= cArrM16141f.length) {
                    int length = (cArrM16141f.length * 3) / 2;
                    if (length < i5) {
                        length = i5;
                    }
                    char[] cArr = new char[length];
                    System.arraycopy(cArrM16141f, 0, cArr, 0, cArrM16141f.length);
                    cArrM16141f = cArr;
                }
                this.f57615o.getChars(iIndexOf, iIndexOf2, cArrM16141f, i2);
                iIndexOf = iIndexOf2;
                i2 = i5;
                z = true;
            }
            if (z) {
                string = readString(cArrM16141f, i2);
            } else {
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    char c2 = cArrM16141f[i7];
                    i6 = (i6 * 31) + c2;
                    if (c2 == '\\') {
                        z = true;
                    }
                }
                if (z) {
                    string = readString(cArrM16141f, i2);
                } else {
                    string = i2 < 20 ? rhgVar.addSymbol(cArrM16141f, 0, i2, i6) : new String(cArrM16141f, 0, i2);
                }
            }
            int i8 = iIndexOf + 1;
            this.f57605e = i8;
            this.f57604d = i8 >= this.f57616p ? f57593s : this.f57615o.charAt(i8);
            return string;
        }
        throw new jh8("unclosed str, " + info());
    }

    public static final byte[] decodeFast(String str) {
        int i;
        int length = str.length();
        if (length == 0) {
            return new byte[0];
        }
        int i2 = length - 1;
        int i3 = 0;
        while (i3 < i2 && f57590C[str.charAt(i3) & 255] < 0) {
            i3++;
        }
        while (i2 > 0 && f57590C[str.charAt(i2) & 255] < 0) {
            i2--;
        }
        int i4 = str.charAt(i2) == '=' ? str.charAt(i2 + (-1)) == '=' ? 2 : 1 : 0;
        int i5 = (i2 - i3) + 1;
        if (length > 76) {
            i = (str.charAt(76) == '\r' ? i5 / 78 : 0) << 1;
        } else {
            i = 0;
        }
        int i6 = (((i5 - i) * 6) >> 3) - i4;
        byte[] bArr = new byte[i6];
        int i7 = (i6 / 3) * 3;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i7) {
            int[] iArr = f57590C;
            int i10 = i3 + 4;
            int i11 = iArr[str.charAt(i3 + 3)] | (iArr[str.charAt(i3 + 1)] << 12) | (iArr[str.charAt(i3)] << 18) | (iArr[str.charAt(i3 + 2)] << 6);
            bArr[i8] = (byte) (i11 >> 16);
            int i12 = i8 + 2;
            bArr[i8 + 1] = (byte) (i11 >> 8);
            i8 += 3;
            bArr[i12] = (byte) i11;
            if (i <= 0 || (i9 = i9 + 1) != 19) {
                i3 = i10;
            } else {
                i3 += 6;
                i9 = 0;
            }
        }
        if (i8 < i6) {
            int i13 = 0;
            int i14 = 0;
            while (i3 <= i2 - i4) {
                i13 |= f57590C[str.charAt(i3)] << (18 - (i14 * 6));
                i14++;
                i3++;
            }
            int i15 = 16;
            while (i8 < i6) {
                bArr[i8] = (byte) (i13 >> i15);
                i15 -= 8;
                i8++;
            }
        }
        return bArr;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00a3 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void nextToken(int r11) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.lh8.nextToken(int):void");
    }
}
