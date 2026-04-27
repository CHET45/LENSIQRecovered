package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.iflytek.aikit.core.AiHelper;
import java.io.IOException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.8")
@xg5
public class bq0 {

    /* JADX INFO: renamed from: e */
    public static final int f14454e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f14455f = 6;

    /* JADX INFO: renamed from: g */
    public static final int f14456g = 3;

    /* JADX INFO: renamed from: h */
    public static final int f14457h = 4;

    /* JADX INFO: renamed from: i */
    public static final byte f14458i = 61;

    /* JADX INFO: renamed from: j */
    public static final int f14459j = 76;

    /* JADX INFO: renamed from: k */
    public static final int f14460k = 19;

    /* JADX INFO: renamed from: m */
    @yfb
    public static final bq0 f14462m;

    /* JADX INFO: renamed from: n */
    @yfb
    public static final bq0 f14463n;

    /* JADX INFO: renamed from: a */
    public final boolean f14464a;

    /* JADX INFO: renamed from: b */
    public final boolean f14465b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final EnumC1997b f14466c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final C1996a f14453d = new C1996a(null);

    /* JADX INFO: renamed from: l */
    @yfb
    public static final byte[] f14461l = {13, 10};

    /* JADX INFO: renamed from: bq0$a */
    public static final class C1996a extends bq0 {
        public /* synthetic */ C1996a(jt3 jt3Var) {
            this();
        }

        @yfb
        public final bq0 getMime() {
            return bq0.f14463n;
        }

        @yfb
        public final byte[] getMimeLineSeparatorSymbols$kotlin_stdlib() {
            return bq0.f14461l;
        }

        @yfb
        public final bq0 getUrlSafe() {
            return bq0.f14462m;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        private C1996a() {
            boolean z = false;
            super(z, z, EnumC1997b.f14467a, null);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: bq0$b */
    @jjf(version = AiHelper.f24011i)
    public static final class EnumC1997b {

        /* JADX INFO: renamed from: a */
        public static final EnumC1997b f14467a = new EnumC1997b("PRESENT", 0);

        /* JADX INFO: renamed from: b */
        public static final EnumC1997b f14468b = new EnumC1997b("ABSENT", 1);

        /* JADX INFO: renamed from: c */
        public static final EnumC1997b f14469c = new EnumC1997b("PRESENT_OPTIONAL", 2);

        /* JADX INFO: renamed from: d */
        public static final EnumC1997b f14470d = new EnumC1997b("ABSENT_OPTIONAL", 3);

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ EnumC1997b[] f14471e;

        /* JADX INFO: renamed from: f */
        public static final /* synthetic */ v35 f14472f;

        private static final /* synthetic */ EnumC1997b[] $values() {
            return new EnumC1997b[]{f14467a, f14468b, f14469c, f14470d};
        }

        static {
            EnumC1997b[] enumC1997bArr$values = $values();
            f14471e = enumC1997bArr$values;
            f14472f = x35.enumEntries(enumC1997bArr$values);
        }

        private EnumC1997b(String str, int i) {
        }

        @yfb
        public static v35<EnumC1997b> getEntries() {
            return f14472f;
        }

        public static EnumC1997b valueOf(String str) {
            return (EnumC1997b) Enum.valueOf(EnumC1997b.class, str);
        }

        public static EnumC1997b[] values() {
            return (EnumC1997b[]) f14471e.clone();
        }
    }

    static {
        EnumC1997b enumC1997b = EnumC1997b.f14467a;
        f14462m = new bq0(true, false, enumC1997b);
        f14463n = new bq0(false, true, enumC1997b);
    }

    public /* synthetic */ bq0(boolean z, boolean z2, EnumC1997b enumC1997b, jt3 jt3Var) {
        this(z, z2, enumC1997b);
    }

    private final void checkDestinationBounds(int i, int i2, int i3) {
        if (i2 < 0 || i2 > i) {
            throw new IndexOutOfBoundsException("destination offset: " + i2 + ", destination size: " + i);
        }
        int i4 = i2 + i3;
        if (i4 < 0 || i4 > i) {
            throw new IndexOutOfBoundsException("The destination array does not have enough capacity, destination offset: " + i2 + ", destination size: " + i + ", capacity needed: " + i3);
        }
    }

    private final void checkPaddingIsAllowed(int i) {
        if (this.f14466c != EnumC1997b.f14468b) {
            return;
        }
        throw new IllegalArgumentException("The padding option is set to ABSENT, but the input has a pad character at index " + i);
    }

    public static /* synthetic */ byte[] decode$default(bq0 bq0Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return bq0Var.decode(bArr, i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d0, code lost:
    
        if (r7 == (-2)) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
    
        if (r7 == (-8)) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d5, code lost:
    
        if (r4 != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00db, code lost:
    
        if (r18.f14466c == p000.bq0.EnumC1997b.f14467a) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e5, code lost:
    
        throw new java.lang.IllegalArgumentException("The padding option is set to PRESENT, but the input is not properly padded");
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00e6, code lost:
    
        if (r8 != 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e8, code lost:
    
        r3 = skipIllegalSymbolsIfMime(r19, r6, r23);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ec, code lost:
    
        if (r3 < r23) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f0, code lost:
    
        return r9 - r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f1, code lost:
    
        r1 = r19[r3] & 255;
        r4 = new java.lang.StringBuilder();
        r4.append("Symbol '");
        r4.append((char) r1);
        r4.append("'(");
        r1 = java.lang.Integer.toString(r1, p000.tw1.checkRadix(8));
        p000.md8.checkNotNullExpressionValue(r1, "toString(...)");
        r4.append(r1);
        r4.append(") at index ");
        r4.append(r3 - 1);
        r4.append(" is prohibited after the pad character");
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x012c, code lost:
    
        throw new java.lang.IllegalArgumentException(r4.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0134, code lost:
    
        throw new java.lang.IllegalArgumentException("The pad bits must be zeros");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x013c, code lost:
    
        throw new java.lang.IllegalArgumentException("The last unit of input does not have enough bits");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final int decodeImpl(byte[] r19, byte[] r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bq0.decodeImpl(byte[], byte[], int, int, int):int");
    }

    public static /* synthetic */ int decodeIntoByteArray$default(bq0 bq0Var, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return bq0Var.decodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public static /* synthetic */ String encode$default(bq0 bq0Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return bq0Var.encode(bArr, i, i2);
    }

    public static /* synthetic */ int encodeIntoByteArray$default(bq0 bq0Var, byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = bArr.length;
        }
        return bq0Var.encodeIntoByteArray(bArr, bArr2, i5, i6, i3);
    }

    public static /* synthetic */ Appendable encodeToAppendable$default(bq0 bq0Var, byte[] bArr, Appendable appendable, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToAppendable");
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            i2 = bArr.length;
        }
        return bq0Var.encodeToAppendable(bArr, appendable, i, i2);
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(bq0 bq0Var, byte[] bArr, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: encodeToByteArray");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return bq0Var.encodeToByteArray(bArr, i, i2);
    }

    private final int handlePaddingSymbol(byte[] bArr, int i, int i2, int i3) {
        if (i3 == -8) {
            throw new IllegalArgumentException("Redundant pad character at index " + i);
        }
        if (i3 == -6) {
            checkPaddingIsAllowed(i);
        } else if (i3 == -4) {
            checkPaddingIsAllowed(i);
            i = skipIllegalSymbolsIfMime(bArr, i + 1, i2);
            if (i == i2 || bArr[i] != 61) {
                throw new IllegalArgumentException("Missing one pad character at index " + i);
            }
        } else if (i3 != -2) {
            throw new IllegalStateException("Unreachable");
        }
        return i + 1;
    }

    private final boolean shouldPadOnEncode() {
        EnumC1997b enumC1997b = this.f14466c;
        return enumC1997b == EnumC1997b.f14467a || enumC1997b == EnumC1997b.f14469c;
    }

    private final int skipIllegalSymbolsIfMime(byte[] bArr, int i, int i2) {
        if (!this.f14465b) {
            return i;
        }
        while (i < i2) {
            if (eq0.f33828b[bArr[i] & 255] != -1) {
                return i;
            }
            i++;
        }
        return i;
    }

    @yfb
    public final String bytesToStringImpl$kotlin_stdlib(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "source");
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            sb.append((char) b);
        }
        return sb.toString();
    }

    @yfb
    public final byte[] charsToBytesImpl$kotlin_stdlib(@yfb CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(charSequence, "source");
        checkSourceBounds$kotlin_stdlib(charSequence.length(), i, i2);
        byte[] bArr = new byte[i2 - i];
        int i3 = 0;
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt <= 255) {
                bArr[i3] = (byte) cCharAt;
                i3++;
            } else {
                bArr[i3] = 63;
                i3++;
            }
            i++;
        }
        return bArr;
    }

    public final void checkSourceBounds$kotlin_stdlib(int i, int i2, int i3) {
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i2, i3, i);
    }

    @yfb
    public final byte[] decode(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "source");
        checkSourceBounds$kotlin_stdlib(bArr.length, i, i2);
        int iDecodeSize$kotlin_stdlib = decodeSize$kotlin_stdlib(bArr, i, i2);
        byte[] bArr2 = new byte[iDecodeSize$kotlin_stdlib];
        if (decodeImpl(bArr, bArr2, 0, i, i2) == iDecodeSize$kotlin_stdlib) {
            return bArr2;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int decodeIntoByteArray(@yfb byte[] bArr, @yfb byte[] bArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(bArr, "source");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        checkSourceBounds$kotlin_stdlib(bArr.length, i2, i3);
        checkDestinationBounds(bArr2.length, i, decodeSize$kotlin_stdlib(bArr, i2, i3));
        return decodeImpl(bArr, bArr2, i, i2, i3);
    }

    public final int decodeSize$kotlin_stdlib(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "source");
        int i3 = i2 - i;
        if (i3 == 0) {
            return 0;
        }
        if (i3 == 1) {
            throw new IllegalArgumentException("Input should have at least 2 symbols for Base64 decoding, startIndex: " + i + ", endIndex: " + i2);
        }
        if (this.f14465b) {
            while (true) {
                if (i >= i2) {
                    break;
                }
                int i4 = eq0.f33828b[bArr[i] & 255];
                if (i4 < 0) {
                    if (i4 == -2) {
                        i3 -= i2 - i;
                        break;
                    }
                    i3--;
                }
                i++;
            }
        } else if (bArr[i2 - 1] == 61) {
            i3 = bArr[i2 + (-2)] == 61 ? i3 - 2 : i3 - 1;
        }
        return (int) ((((long) i3) * ((long) 6)) / ((long) 8));
    }

    @yfb
    public final String encode(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "source");
        return new String(encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2), xw1.f99529g);
    }

    public final int encodeIntoByteArray(@yfb byte[] bArr, @yfb byte[] bArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(bArr, "source");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        return encodeIntoByteArrayImpl$kotlin_stdlib(bArr, bArr2, i, i2, i3);
    }

    public final int encodeIntoByteArrayImpl$kotlin_stdlib(@yfb byte[] bArr, @yfb byte[] bArr2, int i, int i2, int i3) {
        int i4 = i2;
        md8.checkNotNullParameter(bArr, "source");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        checkSourceBounds$kotlin_stdlib(bArr.length, i4, i3);
        checkDestinationBounds(bArr2.length, i, encodeSize$kotlin_stdlib(i3 - i4));
        byte[] bArr3 = this.f14464a ? eq0.f33829c : eq0.f33827a;
        int i5 = this.f14465b ? 19 : Integer.MAX_VALUE;
        int i6 = i;
        while (i4 + 2 < i3) {
            int iMin = Math.min((i3 - i4) / 3, i5);
            for (int i7 = 0; i7 < iMin; i7++) {
                int i8 = bArr[i4] & 255;
                int i9 = i4 + 2;
                int i10 = bArr[i4 + 1] & 255;
                i4 += 3;
                int i11 = (i10 << 8) | (i8 << 16) | (bArr[i9] & 255);
                bArr2[i6] = bArr3[i11 >>> 18];
                bArr2[i6 + 1] = bArr3[(i11 >>> 12) & 63];
                int i12 = i6 + 3;
                bArr2[i6 + 2] = bArr3[(i11 >>> 6) & 63];
                i6 += 4;
                bArr2[i12] = bArr3[i11 & 63];
            }
            if (iMin == i5 && i4 != i3) {
                int i13 = i6 + 1;
                byte[] bArr4 = f14461l;
                bArr2[i6] = bArr4[0];
                i6 += 2;
                bArr2[i13] = bArr4[1];
            }
        }
        int i14 = i3 - i4;
        if (i14 == 1) {
            int i15 = i4 + 1;
            int i16 = (bArr[i4] & 255) << 4;
            bArr2[i6] = bArr3[i16 >>> 6];
            int i17 = i6 + 2;
            bArr2[i6 + 1] = bArr3[i16 & 63];
            if (shouldPadOnEncode()) {
                int i18 = i6 + 3;
                bArr2[i17] = 61;
                i6 += 4;
                bArr2[i18] = 61;
                i4 = i15;
            } else {
                i4 = i15;
                i6 = i17;
            }
        } else if (i14 == 2) {
            int i19 = i4 + 1;
            int i20 = bArr[i4] & 255;
            i4 += 2;
            int i21 = ((bArr[i19] & 255) << 2) | (i20 << 10);
            bArr2[i6] = bArr3[i21 >>> 12];
            bArr2[i6 + 1] = bArr3[(i21 >>> 6) & 63];
            int i22 = i6 + 3;
            bArr2[i6 + 2] = bArr3[i21 & 63];
            if (shouldPadOnEncode()) {
                i6 += 4;
                bArr2[i22] = 61;
            } else {
                i6 = i22;
            }
        }
        if (i4 == i3) {
            return i6 - i;
        }
        throw new IllegalStateException("Check failed.");
    }

    public final int encodeSize$kotlin_stdlib(int i) {
        int i2 = i / 3;
        int i3 = i % 3;
        int i4 = i2 * 4;
        if (i3 != 0) {
            i4 += shouldPadOnEncode() ? 4 : i3 + 1;
        }
        if (this.f14465b) {
            i4 += ((i4 - 1) / 76) * 2;
        }
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException("Input is too big");
    }

    @yfb
    public final <A extends Appendable> A encodeToAppendable(@yfb byte[] bArr, @yfb A a, int i, int i2) throws IOException {
        md8.checkNotNullParameter(bArr, "source");
        md8.checkNotNullParameter(a, FirebaseAnalytics.C3552d.f23234z);
        a.append(new String(encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2), xw1.f99529g));
        return a;
    }

    @yfb
    public final byte[] encodeToByteArray(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "source");
        return encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2);
    }

    @yfb
    public final byte[] encodeToByteArrayImpl$kotlin_stdlib(@yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bArr, "source");
        checkSourceBounds$kotlin_stdlib(bArr.length, i, i2);
        byte[] bArr2 = new byte[encodeSize$kotlin_stdlib(i2 - i)];
        encodeIntoByteArrayImpl$kotlin_stdlib(bArr, bArr2, 0, i, i2);
        return bArr2;
    }

    @yfb
    public final EnumC1997b getPaddingOption$kotlin_stdlib() {
        return this.f14466c;
    }

    public final boolean isMimeScheme$kotlin_stdlib() {
        return this.f14465b;
    }

    public final boolean isUrlSafe$kotlin_stdlib() {
        return this.f14464a;
    }

    @jjf(version = AiHelper.f24011i)
    @yfb
    public final bq0 withPadding(@yfb EnumC1997b enumC1997b) {
        md8.checkNotNullParameter(enumC1997b, "option");
        return this.f14466c == enumC1997b ? this : new bq0(this.f14464a, this.f14465b, enumC1997b);
    }

    private bq0(boolean z, boolean z2, EnumC1997b enumC1997b) {
        this.f14464a = z;
        this.f14465b = z2;
        this.f14466c = enumC1997b;
        if (z && z2) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }

    public static /* synthetic */ byte[] decode$default(bq0 bq0Var, CharSequence charSequence, int i, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decode");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = charSequence.length();
        }
        return bq0Var.decode(charSequence, i, i2);
    }

    public static /* synthetic */ int decodeIntoByteArray$default(bq0 bq0Var, CharSequence charSequence, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeIntoByteArray");
        }
        int i5 = (i4 & 4) != 0 ? 0 : i;
        int i6 = (i4 & 8) != 0 ? 0 : i2;
        if ((i4 & 16) != 0) {
            i3 = charSequence.length();
        }
        return bq0Var.decodeIntoByteArray(charSequence, bArr, i5, i6, i3);
    }

    public final int decodeIntoByteArray(@yfb CharSequence charSequence, @yfb byte[] bArr, int i, int i2, int i3) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        md8.checkNotNullParameter(charSequence, "source");
        md8.checkNotNullParameter(bArr, FirebaseAnalytics.C3552d.f23234z);
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            checkSourceBounds$kotlin_stdlib(str.length(), i2, i3);
            String strSubstring = str.substring(i2, i3);
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = xw1.f99529g;
            md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            md8.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(charSequence, i2, i3);
        }
        return decodeIntoByteArray$default(this, bArrCharsToBytesImpl$kotlin_stdlib, bArr, i, 0, 0, 24, (Object) null);
    }

    @yfb
    public final byte[] decode(@yfb CharSequence charSequence, int i, int i2) {
        byte[] bArrCharsToBytesImpl$kotlin_stdlib;
        md8.checkNotNullParameter(charSequence, "source");
        if (charSequence instanceof String) {
            String str = (String) charSequence;
            checkSourceBounds$kotlin_stdlib(str.length(), i, i2);
            String strSubstring = str.substring(i, i2);
            md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
            Charset charset = xw1.f99529g;
            md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            bArrCharsToBytesImpl$kotlin_stdlib = strSubstring.getBytes(charset);
            md8.checkNotNullExpressionValue(bArrCharsToBytesImpl$kotlin_stdlib, "getBytes(...)");
        } else {
            bArrCharsToBytesImpl$kotlin_stdlib = charsToBytesImpl$kotlin_stdlib(charSequence, i, i2);
        }
        return decode$default(this, bArrCharsToBytesImpl$kotlin_stdlib, 0, 0, 6, (Object) null);
    }
}
