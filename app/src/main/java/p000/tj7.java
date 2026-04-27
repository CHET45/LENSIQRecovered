package p000;

import com.arthenica.ffmpegkit.MediaInformation;
import p000.uj7;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nHexExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,1249:1\n1198#1,7:1251\n1198#1,7:1258\n1198#1,7:1265\n1198#1,7:1272\n1198#1,7:1279\n1198#1,7:1286\n1198#1,7:1293\n1198#1,7:1300\n1209#1,5:1307\n1209#1,5:1312\n1198#1,7:1317\n1198#1,7:1324\n1209#1,5:1331\n1218#1,5:1336\n1#2:1250\n1188#3,3:1341\n1188#3,3:1344\n1188#3,3:1347\n1188#3,3:1350\n*S KotlinDebug\n*F\n+ 1 HexExtensions.kt\nkotlin/text/HexExtensionsKt\n*L\n457#1:1251,7\n490#1:1258,7\n494#1:1265,7\n497#1:1272,7\n538#1:1279,7\n541#1:1286,7\n546#1:1293,7\n551#1:1300,7\n558#1:1307,5\n559#1:1312,5\n1153#1:1317,7\n1155#1:1324,7\n1183#1:1331,5\n1191#1:1336,5\n43#1:1341,3\n44#1:1344,3\n55#1:1347,3\n56#1:1350,3\n*E\n"})
public final class tj7 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String f85043a = "0123456789abcdef";

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f85044b = "0123456789ABCDEF";

    /* JADX INFO: renamed from: c */
    @yfb
    public static final int[] f85045c;

    /* JADX INFO: renamed from: d */
    @yfb
    public static final int[] f85046d;

    /* JADX INFO: renamed from: e */
    @yfb
    public static final int[] f85047e;

    /* JADX INFO: renamed from: f */
    @yfb
    public static final long[] f85048f;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = f85043a.charAt(i2 & 15) | (f85043a.charAt(i2 >> 4) << '\b');
        }
        f85045c = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        f85046d = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < f85043a.length()) {
            iArr3[f85043a.charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        f85047e = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < f85043a.length()) {
            jArr[f85043a.charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f85048f = jArr;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ byte m22688a(String str, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToByte(str, i, i2, uj7Var);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ byte[] m22689b(String str, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToByteArray(str, i, i2, uj7Var);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ int m22690c(String str, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToInt(str, i, i2, uj7Var);
    }

    private static final long charsPerSet(long j, int i, int i2) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j2 = i;
        return (j * j2) + (((long) i2) * (j2 - 1));
    }

    private static final int checkContainsAt(String str, int i, int i2, String str2, boolean z, String str3) {
        if (str2.length() == 0) {
            return i;
        }
        int length = str2.length();
        for (int i3 = 0; i3 < length; i3++) {
            if (!uw1.equals(str2.charAt(i3), str.charAt(i + i3), z)) {
                throwNotContainedAt(str, i, i2, str2, str3);
            }
        }
        return i + str2.length();
    }

    private static final int checkFormatLength(long j) {
        if (0 <= j && j <= 2147483647L) {
            return (int) j;
        }
        throw new IllegalArgumentException("The resulting string length is too big: " + ((Object) oph.m31579toStringimpl(oph.m31533constructorimpl(j))));
    }

    private static final int checkNewLineAt(String str, int i, int i2) {
        if (str.charAt(i) == '\r') {
            int i3 = i + 1;
            return (i3 >= i2 || str.charAt(i3) != '\n') ? i3 : i + 2;
        }
        if (str.charAt(i) == '\n') {
            return i + 1;
        }
        throw new NumberFormatException("Expected a new line at index " + i + ", but was " + str.charAt(i));
    }

    private static final void checkNumberOfDigits(String str, int i, int i2, int i3) {
        int i4 = i2 - i;
        if (i4 < 1) {
            throwInvalidNumberOfDigits(str, i, i2, "at least", 1);
        } else if (i4 > i3) {
            checkZeroDigits(str, i, (i4 + i) - i3);
        }
    }

    private static final void checkPrefixSuffixNumberOfDigits(String str, int i, int i2, String str2, String str3, boolean z, int i3) {
        if ((i2 - i) - str2.length() <= str3.length()) {
            throwInvalidPrefixSuffix(str, i, i2, str2, str3);
        }
        if (str2.length() != 0) {
            int length = str2.length();
            for (int i4 = 0; i4 < length; i4++) {
                if (!uw1.equals(str2.charAt(i4), str.charAt(i + i4), z)) {
                    throwNotContainedAt(str, i, i2, str2, "prefix");
                }
            }
            i += str2.length();
        }
        int length2 = i2 - str3.length();
        if (str3.length() != 0) {
            int length3 = str3.length();
            for (int i5 = 0; i5 < length3; i5++) {
                if (!uw1.equals(str3.charAt(i5), str.charAt(length2 + i5), z)) {
                    throwNotContainedAt(str, length2, i2, str3, "suffix");
                }
            }
        }
        checkNumberOfDigits(str, i, length2, i3);
    }

    private static final void checkZeroDigits(String str, int i, int i2) {
        while (i < i2) {
            if (str.charAt(i) != '0') {
                throw new NumberFormatException("Expected the hexadecimal digit '0' at index " + i + ", but was '" + str.charAt(i) + "'.\nThe result won't fit the type being parsed.");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ short m22691d(String str, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToShort(str, i, i2, uj7Var);
    }

    private static final int decimalFromHexDigitAt(String str, int i) {
        int i2;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') == 0 && (i2 = f85047e[cCharAt]) >= 0) {
            return i2;
        }
        throwInvalidDigitAt(str, i);
        throw new us8();
    }

    private static final int formatByteAt(byte[] bArr, int i, String str, String str2, int[] iArr, char[] cArr, int i2) {
        return toCharArrayIfNotEmpty(str2, cArr, formatByteAt(bArr, i, iArr, cArr, toCharArrayIfNotEmpty(str, cArr, i2)));
    }

    private static final int formattedStringLength(int i, int i2, int i3, int i4) {
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j = i2;
        return checkFormatLength((((long) i) * (((((long) i3) + 2) + ((long) i4)) + j)) - j);
    }

    @yfb
    public static final int[] getBYTE_TO_LOWER_CASE_HEX_DIGITS() {
        return f85045c;
    }

    @rh5
    public static /* synthetic */ void getBYTE_TO_LOWER_CASE_HEX_DIGITS$annotations() {
    }

    @rh5
    @jjf(version = "1.9")
    public static final byte hexToByte(@yfb String str, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToByte(str, 0, str.length(), uj7Var);
    }

    public static /* synthetic */ byte hexToByte$default(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToByte(str, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final byte[] hexToByteArray(@yfb String str, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToByteArray(str, 0, str.length(), uj7Var);
    }

    public static /* synthetic */ byte[] hexToByteArray$default(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToByteArray(str, uj7Var);
    }

    @rh5
    private static final byte[] hexToByteArrayNoLineAndGroupSeparator(String str, int i, int i2, uj7.C13553b c13553b) {
        return c13553b.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(str, i, i2, c13553b) : hexToByteArrayNoLineAndGroupSeparatorSlowPath(str, i, i2, c13553b);
    }

    @rh5
    private static final byte[] hexToByteArrayNoLineAndGroupSeparatorSlowPath(String str, int i, int i2, uj7.C13553b c13553b) {
        String bytePrefix = c13553b.getBytePrefix();
        String byteSuffix = c13553b.getByteSuffix();
        String byteSeparator = c13553b.getByteSeparator();
        long length = byteSeparator.length();
        long length2 = ((long) bytePrefix.length()) + 2 + ((long) byteSuffix.length()) + length;
        long j = i2 - i;
        int i3 = (int) ((j + length) / length2);
        if ((((long) i3) * length2) - length != j) {
            return null;
        }
        boolean ignoreCase$kotlin_stdlib = c13553b.getIgnoreCase$kotlin_stdlib();
        byte[] bArr = new byte[i3];
        if (bytePrefix.length() != 0) {
            int length3 = bytePrefix.length();
            for (int i4 = 0; i4 < length3; i4++) {
                if (!uw1.equals(bytePrefix.charAt(i4), str.charAt(i + i4), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i, i2, bytePrefix, "byte prefix");
                }
            }
            i += bytePrefix.length();
        }
        String str2 = byteSuffix + byteSeparator + bytePrefix;
        int i5 = i3 - 1;
        for (int i6 = 0; i6 < i5; i6++) {
            bArr[i6] = parseByteAt(str, i);
            i += 2;
            if (str2.length() != 0) {
                int length4 = str2.length();
                for (int i7 = 0; i7 < length4; i7++) {
                    if (!uw1.equals(str2.charAt(i7), str.charAt(i + i7), ignoreCase$kotlin_stdlib)) {
                        throwNotContainedAt(str, i, i2, str2, "byte suffix + byte separator + byte prefix");
                    }
                }
                i += str2.length();
            }
        }
        bArr[i5] = parseByteAt(str, i);
        int i8 = i + 2;
        if (byteSuffix.length() != 0) {
            int length5 = byteSuffix.length();
            for (int i9 = 0; i9 < length5; i9++) {
                if (!uw1.equals(byteSuffix.charAt(i9), str.charAt(i8 + i9), ignoreCase$kotlin_stdlib)) {
                    throwNotContainedAt(str, i8, i2, byteSuffix, "byte suffix");
                }
            }
        }
        return bArr;
    }

    @rh5
    private static final byte[] hexToByteArrayShortByteSeparatorNoPrefixAndSuffix(String str, int i, int i2, uj7.C13553b c13553b) {
        int length = c13553b.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = i2 - i;
        int i4 = 2;
        if (length == 0) {
            if ((i3 & 1) != 0) {
                return null;
            }
            int i5 = i3 >> 1;
            byte[] bArr = new byte[i5];
            int i6 = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                bArr[i7] = parseByteAt(str, i6);
                i6 += 2;
            }
            return bArr;
        }
        if (i3 % 3 != 2) {
            return null;
        }
        int i8 = (i3 / 3) + 1;
        byte[] bArr2 = new byte[i8];
        char cCharAt = c13553b.getByteSeparator().charAt(0);
        bArr2[0] = parseByteAt(str, 0);
        for (int i9 = 1; i9 < i8; i9++) {
            if (str.charAt(i4) != cCharAt) {
                String byteSeparator = c13553b.getByteSeparator();
                boolean ignoreCase$kotlin_stdlib = c13553b.getIgnoreCase$kotlin_stdlib();
                if (byteSeparator.length() != 0) {
                    int length2 = byteSeparator.length();
                    for (int i10 = 0; i10 < length2; i10++) {
                        if (!uw1.equals(byteSeparator.charAt(i10), str.charAt(i4 + i10), ignoreCase$kotlin_stdlib)) {
                            throwNotContainedAt(str, i4, i2, byteSeparator, "byte separator");
                        }
                    }
                    byteSeparator.length();
                }
            }
            bArr2[i9] = parseByteAt(str, i4 + 1);
            i4 += 3;
        }
        return bArr2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0127  */
    @p000.rh5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final byte[] hexToByteArraySlowPath(java.lang.String r18, int r19, int r20, p000.uj7.C13553b r21) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.tj7.hexToByteArraySlowPath(java.lang.String, int, int, uj7$b):byte[]");
    }

    @rh5
    @jjf(version = "1.9")
    public static final int hexToInt(@yfb String str, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToInt(str, 0, str.length(), uj7Var);
    }

    public static /* synthetic */ int hexToInt$default(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToInt(str, uj7Var);
    }

    @rh5
    private static final int hexToIntImpl(String str, int i, int i2, uj7 uj7Var, int i3) {
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseInt(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i3);
        return parseInt(str, i + prefix.length(), i2 - suffix.length());
    }

    @rh5
    @jjf(version = "1.9")
    public static final long hexToLong(@yfb String str, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToLong(str, 0, str.length(), uj7Var);
    }

    public static /* synthetic */ long hexToLong$default(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToLong(str, uj7Var);
    }

    @rh5
    private static final long hexToLongImpl(String str, int i, int i2, uj7 uj7Var, int i3) {
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnly$kotlin_stdlib()) {
            checkNumberOfDigits(str, i, i2, i3);
            return parseLong(str, i, i2);
        }
        String prefix = number.getPrefix();
        String suffix = number.getSuffix();
        checkPrefixSuffixNumberOfDigits(str, i, i2, prefix, suffix, number.getIgnoreCase$kotlin_stdlib(), i3);
        return parseLong(str, i + prefix.length(), i2 - suffix.length());
    }

    @rh5
    @jjf(version = "1.9")
    public static final short hexToShort(@yfb String str, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToShort(str, 0, str.length(), uj7Var);
    }

    public static /* synthetic */ short hexToShort$default(String str, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToShort(str, uj7Var);
    }

    private static final long longDecimalFromHexDigitAt(String str, int i) {
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') == 0) {
            long j = f85048f[cCharAt];
            if (j >= 0) {
                return j;
            }
        }
        throwInvalidDigitAt(str, i);
        throw new us8();
    }

    private static final byte parseByteAt(String str, int i) {
        int[] iArr;
        int i2;
        int i3;
        char cCharAt = str.charAt(i);
        if ((cCharAt >>> '\b') != 0 || (i2 = (iArr = f85047e)[cCharAt]) < 0) {
            throwInvalidDigitAt(str, i);
            throw new us8();
        }
        int i4 = i + 1;
        char cCharAt2 = str.charAt(i4);
        if ((cCharAt2 >>> '\b') == 0 && (i3 = iArr[cCharAt2]) >= 0) {
            return (byte) ((i2 << 4) | i3);
        }
        throwInvalidDigitAt(str, i4);
        throw new us8();
    }

    private static final int parseInt(String str, int i, int i2) {
        int i3;
        int i4 = 0;
        while (i < i2) {
            int i5 = i4 << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') != 0 || (i3 = f85047e[cCharAt]) < 0) {
                throwInvalidDigitAt(str, i);
                throw new us8();
            }
            i4 = i5 | i3;
            i++;
        }
        return i4;
    }

    private static final long parseLong(String str, int i, int i2) {
        long j = 0;
        while (i < i2) {
            long j2 = j << 4;
            char cCharAt = str.charAt(i);
            if ((cCharAt >>> '\b') == 0) {
                long j3 = f85048f[cCharAt];
                if (j3 >= 0) {
                    j = j2 | j3;
                    i++;
                }
            }
            throwInvalidDigitAt(str, i);
            throw new us8();
        }
        return j;
    }

    public static final int parsedByteArrayMaxSize(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        long jCharsPerSet;
        int i8;
        int i9;
        if (i <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        long j = ((long) i6) + 2 + ((long) i7);
        long jCharsPerSet2 = charsPerSet(j, i3, i5);
        if (i2 <= i3) {
            jCharsPerSet = charsPerSet(j, i2, i5);
        } else {
            jCharsPerSet = charsPerSet(jCharsPerSet2, i2 / i3, i4);
            int i10 = i2 % i3;
            if (i10 != 0) {
                jCharsPerSet = jCharsPerSet + ((long) i4) + charsPerSet(j, i10, i5);
            }
        }
        long j2 = i;
        long jWholeElementsPerSet = wholeElementsPerSet(j2, jCharsPerSet, 1);
        long j3 = j2 - ((jCharsPerSet + 1) * jWholeElementsPerSet);
        long jWholeElementsPerSet2 = wholeElementsPerSet(j3, jCharsPerSet2, i4);
        long j4 = j3 - ((jCharsPerSet2 + ((long) i4)) * jWholeElementsPerSet2);
        long jWholeElementsPerSet3 = wholeElementsPerSet(j4, j, i5);
        if (j4 - ((j + ((long) i5)) * jWholeElementsPerSet3) > 0) {
            i9 = i2;
            i8 = 1;
        } else {
            i8 = 0;
            i9 = i2;
        }
        return (int) ((jWholeElementsPerSet * ((long) i9)) + (jWholeElementsPerSet2 * ((long) i3)) + jWholeElementsPerSet3 + ((long) i8));
    }

    private static final Void throwInvalidDigitAt(String str, int i) {
        throw new NumberFormatException("Expected a hexadecimal digit at index " + i + ", but was " + str.charAt(i));
    }

    private static final void throwInvalidNumberOfDigits(String str, int i, int i2, String str2, int i3) {
        md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str2 + ' ' + i3 + " hexadecimal digits at index " + i + ", but was \"" + strSubstring + "\" of length " + (i2 - i));
    }

    private static final void throwInvalidPrefixSuffix(String str, int i, int i2, String str2, String str3) {
        md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, i2);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected a hexadecimal number with prefix \"" + str2 + "\" and suffix \"" + str3 + "\", but was " + strSubstring);
    }

    private static final void throwNotContainedAt(String str, int i, int i2, String str2, String str3) {
        int iCoerceAtMost = kpd.coerceAtMost(str2.length() + i, i2);
        md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
        String strSubstring = str.substring(i, iCoerceAtMost);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        throw new NumberFormatException("Expected " + str3 + " \"" + str2 + "\" at index " + i + ", but was " + strSubstring);
    }

    private static final int toCharArrayIfNotEmpty(String str, char[] cArr, int i) {
        int length = str.length();
        if (length != 0) {
            if (length != 1) {
                int length2 = str.length();
                md8.checkNotNull(str, "null cannot be cast to non-null type java.lang.String");
                str.getChars(0, length2, cArr, i);
            } else {
                cArr[i] = str.charAt(0);
            }
        }
        return i + str.length();
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(@yfb byte[] bArr, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return toHexString(bArr, 0, bArr.length, uj7Var);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(bArr, uj7Var);
    }

    @rh5
    private static final String toHexStringImpl(long j, uj7.C13555d c13555d, String str, int i) {
        if ((i & 3) != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i2 = i >> 2;
        int minLength = c13555d.getMinLength();
        int iCoerceAtLeast = kpd.coerceAtLeast(minLength - i2, 0);
        String prefix = c13555d.getPrefix();
        String suffix = c13555d.getSuffix();
        boolean removeLeadingZeros = c13555d.getRemoveLeadingZeros();
        int iCheckFormatLength = checkFormatLength(((long) prefix.length()) + ((long) iCoerceAtLeast) + ((long) i2) + ((long) suffix.length()));
        char[] cArr = new char[iCheckFormatLength];
        int charArrayIfNotEmpty = toCharArrayIfNotEmpty(prefix, cArr, 0);
        if (iCoerceAtLeast > 0) {
            int i3 = iCoerceAtLeast + charArrayIfNotEmpty;
            u70.fill(cArr, str.charAt(0), charArrayIfNotEmpty, i3);
            charArrayIfNotEmpty = i3;
        }
        int i4 = i;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 -= 4;
            int i6 = (int) ((j >> i4) & 15);
            removeLeadingZeros = removeLeadingZeros && i6 == 0 && (i4 >> 2) >= minLength;
            if (!removeLeadingZeros) {
                cArr[charArrayIfNotEmpty] = str.charAt(i6);
                charArrayIfNotEmpty++;
            }
        }
        int charArrayIfNotEmpty2 = toCharArrayIfNotEmpty(suffix, cArr, charArrayIfNotEmpty);
        return charArrayIfNotEmpty2 == iCheckFormatLength ? h9g.concatToString(cArr) : h9g.concatToString$default(cArr, 0, charArrayIfNotEmpty2, 1, null);
    }

    @rh5
    private static final String toHexStringNoLineAndGroupSeparator(byte[] bArr, int i, int i2, uj7.C13553b c13553b, int[] iArr) {
        return c13553b.getShortByteSeparatorNoPrefixAndSuffix$kotlin_stdlib() ? toHexStringShortByteSeparatorNoPrefixAndSuffix(bArr, i, i2, c13553b, iArr) : toHexStringNoLineAndGroupSeparatorSlowPath(bArr, i, i2, c13553b, iArr);
    }

    @rh5
    private static final String toHexStringNoLineAndGroupSeparatorSlowPath(byte[] bArr, int i, int i2, uj7.C13553b c13553b, int[] iArr) {
        String bytePrefix = c13553b.getBytePrefix();
        String byteSuffix = c13553b.getByteSuffix();
        String byteSeparator = c13553b.getByteSeparator();
        char[] cArr = new char[formattedStringLength(i2 - i, byteSeparator.length(), bytePrefix.length(), byteSuffix.length())];
        int byteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, 0);
        while (true) {
            i++;
            if (i >= i2) {
                return h9g.concatToString(cArr);
            }
            byteAt = formatByteAt(bArr, i, bytePrefix, byteSuffix, iArr, cArr, toCharArrayIfNotEmpty(byteSeparator, cArr, byteAt));
        }
    }

    @rh5
    private static final String toHexStringShortByteSeparatorNoPrefixAndSuffix(byte[] bArr, int i, int i2, uj7.C13553b c13553b, int[] iArr) {
        int length = c13553b.getByteSeparator().length();
        if (length > 1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = i2 - i;
        int byteAt = 0;
        if (length == 0) {
            char[] cArr = new char[checkFormatLength(((long) i3) * 2)];
            while (i < i2) {
                byteAt = formatByteAt(bArr, i, iArr, cArr, byteAt);
                i++;
            }
            return h9g.concatToString(cArr);
        }
        char[] cArr2 = new char[checkFormatLength((((long) i3) * 3) - 1)];
        char cCharAt = c13553b.getByteSeparator().charAt(0);
        int byteAt2 = formatByteAt(bArr, i, iArr, cArr2, 0);
        for (int i4 = i + 1; i4 < i2; i4++) {
            cArr2[byteAt2] = cCharAt;
            byteAt2 = formatByteAt(bArr, i4, iArr, cArr2, byteAt2 + 1);
        }
        return h9g.concatToString(cArr2);
    }

    @rh5
    private static final String toHexStringSlowPath(byte[] bArr, int i, int i2, uj7.C13553b c13553b, int[] iArr) {
        int i3;
        int i4;
        int bytesPerLine = c13553b.getBytesPerLine();
        int bytesPerGroup = c13553b.getBytesPerGroup();
        String bytePrefix = c13553b.getBytePrefix();
        String byteSuffix = c13553b.getByteSuffix();
        String byteSeparator = c13553b.getByteSeparator();
        String groupSeparator = c13553b.getGroupSeparator();
        int i5 = formattedStringLength(i2 - i, bytesPerLine, bytesPerGroup, groupSeparator.length(), byteSeparator.length(), bytePrefix.length(), byteSuffix.length());
        char[] cArr = new char[i5];
        int charArrayIfNotEmpty = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = i; i8 < i2; i8++) {
            if (i6 == bytesPerLine) {
                cArr[charArrayIfNotEmpty] = '\n';
                charArrayIfNotEmpty++;
                i3 = 0;
                i4 = 0;
            } else if (i7 == bytesPerGroup) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(groupSeparator, cArr, charArrayIfNotEmpty);
                i3 = i6;
                i4 = 0;
            } else {
                i3 = i6;
                i4 = i7;
            }
            if (i4 != 0) {
                charArrayIfNotEmpty = toCharArrayIfNotEmpty(byteSeparator, cArr, charArrayIfNotEmpty);
            }
            charArrayIfNotEmpty = formatByteAt(bArr, i8, bytePrefix, byteSuffix, iArr, cArr, charArrayIfNotEmpty);
            i7 = i4 + 1;
            i6 = i3 + 1;
        }
        if (charArrayIfNotEmpty == i5) {
            return h9g.concatToString(cArr);
        }
        throw new IllegalStateException("Check failed.");
    }

    private static final long wholeElementsPerSet(long j, long j2, int i) {
        if (j <= 0 || j2 <= 0) {
            return 0L;
        }
        long j3 = i;
        return (j + j3) / (j2 + j3);
    }

    @rh5
    private static final byte hexToByte(String str, int i, int i2, uj7 uj7Var) {
        return (byte) hexToIntImpl(str, i, i2, uj7Var, 2);
    }

    @rh5
    private static final byte[] hexToByteArray(String str, int i, int i2, uj7 uj7Var) {
        byte[] bArrHexToByteArrayNoLineAndGroupSeparator;
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (i == i2) {
            return new byte[0];
        }
        uj7.C13553b bytes = uj7Var.getBytes();
        return (!bytes.getNoLineAndGroupSeparator$kotlin_stdlib() || (bArrHexToByteArrayNoLineAndGroupSeparator = hexToByteArrayNoLineAndGroupSeparator(str, i, i2, bytes)) == null) ? hexToByteArraySlowPath(str, i, i2, bytes) : bArrHexToByteArrayNoLineAndGroupSeparator;
    }

    @rh5
    private static final int hexToInt(String str, int i, int i2, uj7 uj7Var) {
        return hexToIntImpl(str, i, i2, uj7Var, 8);
    }

    @rh5
    public static final long hexToLong(@yfb String str, int i, int i2, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        return hexToLongImpl(str, i, i2, uj7Var, 16);
    }

    @rh5
    private static final short hexToShort(String str, int i, int i2, uj7 uj7Var) {
        return (short) hexToIntImpl(str, i, i2, uj7Var, 4);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(@yfb byte[] bArr, int i, int i2, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(bArr, "<this>");
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        AbstractC7110i2.Companion.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (i == i2) {
            return "";
        }
        int[] iArr = uj7Var.getUpperCase() ? f85046d : f85045c;
        uj7.C13553b bytes = uj7Var.getBytes();
        return bytes.getNoLineAndGroupSeparator$kotlin_stdlib() ? toHexStringNoLineAndGroupSeparator(bArr, i, i2, bytes, iArr) : toHexStringSlowPath(bArr, i, i2, bytes, iArr);
    }

    public static final int formattedStringLength(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        if (i > 0) {
            int i8 = i - 1;
            int i9 = i8 / i2;
            int i10 = (i2 - 1) / i3;
            int i11 = i % i2;
            if (i11 != 0) {
                i2 = i11;
            }
            int i12 = (i10 * i9) + ((i2 - 1) / i3);
            return checkFormatLength(((long) i9) + (((long) i12) * ((long) i4)) + (((long) ((i8 - i9) - i12)) * ((long) i5)) + (((long) i) * (((long) i6) + 2 + ((long) i7))));
        }
        throw new IllegalArgumentException("Failed requirement.");
    }

    public static /* synthetic */ long hexToLong$default(String str, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return hexToLong(str, i, i2, uj7Var);
    }

    public static /* synthetic */ String toHexString$default(byte[] bArr, int i, int i2, uj7 uj7Var, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(bArr, i, i2, uj7Var);
    }

    private static final int formatByteAt(byte[] bArr, int i, int[] iArr, char[] cArr, int i2) {
        int i3 = iArr[bArr[i] & 255];
        cArr[i2] = (char) (i3 >> 8);
        cArr[i2 + 1] = (char) (i3 & 255);
        return i2 + 2;
    }

    public static /* synthetic */ String toHexString$default(byte b, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(b, uj7Var);
    }

    public static /* synthetic */ String toHexString$default(short s, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(s, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(byte b, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        String str = uj7Var.getUpperCase() ? "0123456789ABCDEF" : f85043a;
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((b >> 4) & 15), str.charAt(b & 15)};
            if (number.getRemoveLeadingZeros()) {
                return h9g.concatToString$default(cArr, kpd.coerceAtMost((Integer.numberOfLeadingZeros(b & 255) - 24) >> 2, 1), 0, 2, null);
            }
            return h9g.concatToString(cArr);
        }
        return toHexStringImpl(b, number, str, 8);
    }

    public static /* synthetic */ String toHexString$default(int i, uj7 uj7Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(i, uj7Var);
    }

    public static /* synthetic */ String toHexString$default(long j, uj7 uj7Var, int i, Object obj) {
        if ((i & 1) != 0) {
            uj7Var = uj7.f88110d.getDefault();
        }
        return toHexString(j, uj7Var);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(short s, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        String str = uj7Var.getUpperCase() ? "0123456789ABCDEF" : f85043a;
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((s >> 12) & 15), str.charAt((s >> 8) & 15), str.charAt((s >> 4) & 15), str.charAt(s & 15)};
            if (number.getRemoveLeadingZeros()) {
                return h9g.concatToString$default(cArr, kpd.coerceAtMost((Integer.numberOfLeadingZeros(s & iqh.f48007d) - 16) >> 2, 3), 0, 2, null);
            }
            return h9g.concatToString(cArr);
        }
        return toHexStringImpl(s, number, str, 16);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(int i, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        String str = uj7Var.getUpperCase() ? "0123456789ABCDEF" : f85043a;
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((i >> 28) & 15), str.charAt((i >> 24) & 15), str.charAt((i >> 20) & 15), str.charAt((i >> 16) & 15), str.charAt((i >> 12) & 15), str.charAt((i >> 8) & 15), str.charAt((i >> 4) & 15), str.charAt(i & 15)};
            if (number.getRemoveLeadingZeros()) {
                return h9g.concatToString$default(cArr, kpd.coerceAtMost(Integer.numberOfLeadingZeros(i) >> 2, 7), 0, 2, null);
            }
            return h9g.concatToString(cArr);
        }
        return toHexStringImpl(i, number, str, 32);
    }

    @rh5
    @jjf(version = "1.9")
    @yfb
    public static final String toHexString(long j, @yfb uj7 uj7Var) {
        md8.checkNotNullParameter(uj7Var, MediaInformation.KEY_FORMAT_PROPERTIES);
        String str = uj7Var.getUpperCase() ? "0123456789ABCDEF" : f85043a;
        uj7.C13555d number = uj7Var.getNumber();
        if (number.isDigitsOnlyAndNoPadding$kotlin_stdlib()) {
            char[] cArr = {str.charAt((int) ((j >> 60) & 15)), str.charAt((int) ((j >> 56) & 15)), str.charAt((int) ((j >> 52) & 15)), str.charAt((int) ((j >> 48) & 15)), str.charAt((int) ((j >> 44) & 15)), str.charAt((int) ((j >> 40) & 15)), str.charAt((int) ((j >> 36) & 15)), str.charAt((int) ((j >> 32) & 15)), str.charAt((int) ((j >> 28) & 15)), str.charAt((int) ((j >> 24) & 15)), str.charAt((int) ((j >> 20) & 15)), str.charAt((int) ((j >> 16) & 15)), str.charAt((int) ((j >> 12) & 15)), str.charAt((int) ((j >> 8) & 15)), str.charAt((int) ((j >> 4) & 15)), str.charAt((int) (15 & j))};
            if (number.getRemoveLeadingZeros()) {
                return h9g.concatToString$default(cArr, kpd.coerceAtMost(Long.numberOfLeadingZeros(j) >> 2, 15), 0, 2, null);
            }
            return h9g.concatToString(cArr);
        }
        return toHexStringImpl(j, number, str, 64);
    }
}
