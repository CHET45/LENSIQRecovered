package p000;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,190:1\n1#2:191\n*E\n"})
public final class wa8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final wa8 f93811a = new wa8();

    /* JADX INFO: renamed from: b */
    @yfb
    public static final String f93812b = "0123456789ABCDEF";

    private wa8() {
    }

    private final int hexToInt(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('A' <= c && c < 'G') {
            return c - '7';
        }
        if ('a' > c || c >= 'g') {
            return -1;
        }
        return c - 'W';
    }

    public static /* synthetic */ String printHexBinary$default(wa8 wa8Var, byte[] bArr, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return wa8Var.printHexBinary(bArr, z);
    }

    @yfb
    public final byte[] parseHexBinary(@yfb String str) {
        md8.checkNotNullParameter(str, "s");
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] bArr = new byte[length / 2];
        for (int i = 0; i < length; i += 2) {
            int iHexToInt = hexToInt(str.charAt(i));
            int i2 = i + 1;
            int iHexToInt2 = hexToInt(str.charAt(i2));
            if (iHexToInt == -1 || iHexToInt2 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + str.charAt(i) + str.charAt(i2)).toString());
            }
            bArr[i / 2] = (byte) ((iHexToInt << 4) + iHexToInt2);
        }
        return bArr;
    }

    @yfb
    public final String printHexBinary(@yfb byte[] bArr, boolean z) {
        md8.checkNotNullParameter(bArr, "data");
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append("0123456789ABCDEF".charAt((b >> 4) & 15));
            sb.append("0123456789ABCDEF".charAt(b & 15));
        }
        if (!z) {
            String string = sb.toString();
            md8.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        String string2 = sb.toString();
        md8.checkNotNullExpressionValue(string2, "toString(...)");
        String lowerCase = string2.toLowerCase(Locale.ROOT);
        md8.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @yfb
    public final String toHexString(int i) {
        byte[] bArr = new byte[4];
        for (int i2 = 0; i2 < 4; i2++) {
            bArr[i2] = (byte) (i >> (24 - (i2 * 8)));
        }
        String strTrimStart = m9g.trimStart(printHexBinary(bArr, true), '0');
        if (strTrimStart.length() <= 0) {
            strTrimStart = null;
        }
        return strTrimStart == null ? a43.f347l : strTrimStart;
    }
}
