package p000;

import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes7.dex */
public final class yg4 {

    /* JADX INFO: renamed from: a */
    public final String f101424a;

    /* JADX INFO: renamed from: b */
    public final int f101425b;

    /* JADX INFO: renamed from: c */
    public int f101426c;

    /* JADX INFO: renamed from: d */
    public int f101427d;

    /* JADX INFO: renamed from: e */
    public int f101428e;

    /* JADX INFO: renamed from: f */
    public int f101429f;

    /* JADX INFO: renamed from: g */
    public char[] f101430g;

    public yg4(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f101424a = name;
        this.f101425b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
    
        r2 = r8.f101427d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        return new java.lang.String(r1, r2, r8.f101428e - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String escapedAV() {
        /*
            r8 = this;
            int r0 = r8.f101426c
            r8.f101427d = r0
            r8.f101428e = r0
        L6:
            int r0 = r8.f101426c
            int r1 = r8.f101425b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f101430g
            int r2 = r8.f101427d
            int r3 = r8.f101428e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f101430g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L51
            r5 = 92
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L51
            if (r2 == r3) goto L51
            int r3 = r8.f101428e
            int r4 = r3 + 1
            r8.f101428e = r4
            r1[r3] = r2
            int r0 = r0 + 1
            r8.f101426c = r0
            goto L6
        L3e:
            int r0 = r8.f101428e
            int r2 = r0 + 1
            r8.f101428e = r2
            char r2 = r8.getEscaped()
            r1[r0] = r2
            int r0 = r8.f101426c
            int r0 = r0 + 1
            r8.f101426c = r0
            goto L6
        L51:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f101427d
            int r3 = r8.f101428e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5c:
            int r2 = r8.f101428e
            r8.f101429f = r2
            int r0 = r0 + 1
            r8.f101426c = r0
            int r0 = r2 + 1
            r8.f101428e = r0
            r1[r2] = r6
        L6a:
            int r0 = r8.f101426c
            int r1 = r8.f101425b
            if (r0 >= r1) goto L83
            char[] r2 = r8.f101430g
            char r7 = r2[r0]
            if (r7 != r6) goto L83
            int r1 = r8.f101428e
            int r7 = r1 + 1
            r8.f101428e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f101426c = r0
            goto L6a
        L83:
            if (r0 == r1) goto L8f
            char[] r1 = r8.f101430g
            char r0 = r1[r0]
            if (r0 == r3) goto L8f
            if (r0 == r4) goto L8f
            if (r0 != r5) goto L6
        L8f:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f101430g
            int r2 = r8.f101427d
            int r3 = r8.f101429f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yg4.escapedAV():java.lang.String");
    }

    private int getByte(int i) {
        int i2;
        int i3;
        int i4 = i + 1;
        if (i4 >= this.f101425b) {
            throw new IllegalStateException("Malformed DN: " + this.f101424a);
        }
        char[] cArr = this.f101430g;
        char c = cArr[i];
        if (c >= '0' && c <= '9') {
            i2 = c - '0';
        } else if (c >= 'a' && c <= 'f') {
            i2 = c - 'W';
        } else {
            if (c < 'A' || c > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f101424a);
            }
            i2 = c - '7';
        }
        char c2 = cArr[i4];
        if (c2 >= '0' && c2 <= '9') {
            i3 = c2 - '0';
        } else if (c2 >= 'a' && c2 <= 'f') {
            i3 = c2 - 'W';
        } else {
            if (c2 < 'A' || c2 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f101424a);
            }
            i3 = c2 - '7';
        }
        return (i2 << 4) + i3;
    }

    private char getEscaped() {
        int i = this.f101426c + 1;
        this.f101426c = i;
        if (i == this.f101425b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f101424a);
        }
        char c = this.f101430g[i];
        if (c == ' ' || c == '%' || c == '\\' || c == '_' || c == '\"' || c == '#') {
            return c;
        }
        switch (c) {
            case '*':
            case '+':
            case ',':
                return c;
            default:
                switch (c) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c;
                    default:
                        return getUTF8();
                }
        }
    }

    private char getUTF8() {
        int i;
        int i2;
        int i3 = getByte(this.f101426c);
        this.f101426c++;
        if (i3 < 128) {
            return (char) i3;
        }
        if (i3 < 192 || i3 > 247) {
            return '?';
        }
        if (i3 <= 223) {
            i = i3 & 31;
            i2 = 1;
        } else if (i3 <= 239) {
            i = i3 & 15;
            i2 = 2;
        } else {
            i = i3 & 7;
            i2 = 3;
        }
        for (int i4 = 0; i4 < i2; i4++) {
            int i5 = this.f101426c;
            int i6 = i5 + 1;
            this.f101426c = i6;
            if (i6 == this.f101425b || this.f101430g[i6] != '\\') {
                return '?';
            }
            int i7 = i5 + 2;
            this.f101426c = i7;
            int i8 = getByte(i7);
            this.f101426c++;
            if ((i8 & 192) != 128) {
                return '?';
            }
            i = (i << 6) + (i8 & 63);
        }
        return (char) i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        r6.f101428e = r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String hexAV() {
        /*
            r6 = this;
            int r0 = r6.f101426c
            int r1 = r0 + 4
            int r2 = r6.f101425b
            java.lang.String r3 = "Unexpected end of DN: "
            if (r1 >= r2) goto L98
            r6.f101427d = r0
            int r0 = r0 + 1
            r6.f101426c = r0
        L10:
            int r0 = r6.f101426c
            int r1 = r6.f101425b
            if (r0 == r1) goto L54
            char[] r1 = r6.f101430g
            char r2 = r1[r0]
            r4 = 43
            if (r2 == r4) goto L54
            r4 = 44
            if (r2 == r4) goto L54
            r4 = 59
            if (r2 != r4) goto L27
            goto L54
        L27:
            r4 = 32
            if (r2 != r4) goto L42
            r6.f101428e = r0
            int r0 = r0 + 1
            r6.f101426c = r0
        L31:
            int r0 = r6.f101426c
            int r1 = r6.f101425b
            if (r0 >= r1) goto L56
            char[] r1 = r6.f101430g
            char r1 = r1[r0]
            if (r1 != r4) goto L56
            int r0 = r0 + 1
            r6.f101426c = r0
            goto L31
        L42:
            r4 = 65
            if (r2 < r4) goto L4f
            r4 = 70
            if (r2 > r4) goto L4f
            int r2 = r2 + 32
            char r2 = (char) r2
            r1[r0] = r2
        L4f:
            int r0 = r0 + 1
            r6.f101426c = r0
            goto L10
        L54:
            r6.f101428e = r0
        L56:
            int r0 = r6.f101428e
            int r1 = r6.f101427d
            int r0 = r0 - r1
            r2 = 5
            if (r0 < r2) goto L81
            r2 = r0 & 1
            if (r2 == 0) goto L81
            int r2 = r0 / 2
            byte[] r3 = new byte[r2]
            int r1 = r1 + 1
            r4 = 0
        L69:
            if (r4 >= r2) goto L77
            int r5 = r6.getByte(r1)
            byte r5 = (byte) r5
            r3[r4] = r5
            int r1 = r1 + 2
            int r4 = r4 + 1
            goto L69
        L77:
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f101430g
            int r3 = r6.f101427d
            r1.<init>(r2, r3, r0)
            return r1
        L81:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f101424a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r2 = r6.f101424a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.yg4.hexAV():java.lang.String");
    }

    private String nextAT() {
        int i;
        int i2;
        int i3;
        int i4;
        char c;
        int i5;
        int i6;
        char c2;
        char c3;
        while (true) {
            i = this.f101426c;
            i2 = this.f101425b;
            if (i >= i2 || this.f101430g[i] != ' ') {
                break;
            }
            this.f101426c = i + 1;
        }
        if (i == i2) {
            return null;
        }
        this.f101427d = i;
        this.f101426c = i + 1;
        while (true) {
            i3 = this.f101426c;
            i4 = this.f101425b;
            if (i3 >= i4 || (c3 = this.f101430g[i3]) == '=' || c3 == ' ') {
                break;
            }
            this.f101426c = i3 + 1;
        }
        if (i3 >= i4) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f101424a);
        }
        this.f101428e = i3;
        if (this.f101430g[i3] == ' ') {
            while (true) {
                i5 = this.f101426c;
                i6 = this.f101425b;
                if (i5 >= i6 || (c2 = this.f101430g[i5]) == '=' || c2 != ' ') {
                    break;
                }
                this.f101426c = i5 + 1;
            }
            if (this.f101430g[i5] != '=' || i5 == i6) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f101424a);
            }
        }
        this.f101426c++;
        while (true) {
            int i7 = this.f101426c;
            if (i7 >= this.f101425b || this.f101430g[i7] != ' ') {
                break;
            }
            this.f101426c = i7 + 1;
        }
        int i8 = this.f101428e;
        int i9 = this.f101427d;
        if (i8 - i9 > 4) {
            char[] cArr = this.f101430g;
            if (cArr[i9 + 3] == '.' && (((c = cArr[i9]) == 'O' || c == 'o') && ((cArr[i9 + 1] == 'I' || cArr[i9 + 1] == 'i') && (cArr[i9 + 2] == 'D' || cArr[i9 + 2] == 'd')))) {
                this.f101427d = i9 + 4;
            }
        }
        char[] cArr2 = this.f101430g;
        int i10 = this.f101427d;
        return new String(cArr2, i10, i8 - i10);
    }

    private String quotedAV() {
        int i = this.f101426c + 1;
        this.f101426c = i;
        this.f101427d = i;
        this.f101428e = i;
        while (true) {
            int i2 = this.f101426c;
            if (i2 == this.f101425b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f101424a);
            }
            char[] cArr = this.f101430g;
            char c = cArr[i2];
            if (c == '\"') {
                this.f101426c = i2 + 1;
                while (true) {
                    int i3 = this.f101426c;
                    if (i3 >= this.f101425b || this.f101430g[i3] != ' ') {
                        break;
                    }
                    this.f101426c = i3 + 1;
                }
                char[] cArr2 = this.f101430g;
                int i4 = this.f101427d;
                return new String(cArr2, i4, this.f101428e - i4);
            }
            if (c == '\\') {
                cArr[this.f101428e] = getEscaped();
            } else {
                cArr[this.f101428e] = c;
            }
            this.f101426c++;
            this.f101428e++;
        }
    }

    public String findMostSpecific(String str) {
        this.f101426c = 0;
        this.f101427d = 0;
        this.f101428e = 0;
        this.f101429f = 0;
        this.f101430g = this.f101424a.toCharArray();
        String strNextAT = nextAT();
        if (strNextAT == null) {
            return null;
        }
        do {
            int i = this.f101426c;
            if (i == this.f101425b) {
                return null;
            }
            char c = this.f101430g[i];
            String strEscapedAV = c != '\"' ? c != '#' ? (c == '+' || c == ',' || c == ';') ? "" : escapedAV() : hexAV() : quotedAV();
            if (str.equalsIgnoreCase(strNextAT)) {
                return strEscapedAV;
            }
            int i2 = this.f101426c;
            if (i2 >= this.f101425b) {
                return null;
            }
            char c2 = this.f101430g[i2];
            if (c2 != ',' && c2 != ';' && c2 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f101424a);
            }
            this.f101426c = i2 + 1;
            strNextAT = nextAT();
        } while (strNextAT != null);
        throw new IllegalStateException("Malformed DN: " + this.f101424a);
    }
}
