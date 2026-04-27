package p000;

import org.tensorflow.lite.schema.BuiltinOptions;

/* JADX INFO: loaded from: classes7.dex */
public final class e8g {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final String[] f32139a;

    /* JADX INFO: renamed from: b */
    @yfb
    public static final byte[] f32140b;

    static {
        String[] strArr = new String[93];
        for (int i = 0; i < 32; i++) {
            strArr[i] = "\\u" + toHexChar(i >> 12) + toHexChar(i >> 8) + toHexChar(i >> 4) + toHexChar(i);
        }
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        f32139a = strArr;
        byte[] bArr = new byte[93];
        for (int i2 = 0; i2 < 32; i2++) {
            bArr[i2] = 1;
        }
        bArr[34] = BuiltinOptions.TopKV2Options;
        bArr[92] = BuiltinOptions.IfOptions;
        bArr[9] = BuiltinOptions.GeluOptions;
        bArr[8] = BuiltinOptions.SelectV2Options;
        bArr[10] = BuiltinOptions.HashtableSizeOptions;
        bArr[13] = BuiltinOptions.RandomOptions;
        bArr[12] = BuiltinOptions.CumsumOptions;
        f32140b = bArr;
    }

    @yfb
    public static final byte[] getESCAPE_MARKERS() {
        return f32140b;
    }

    @yfb
    public static final String[] getESCAPE_STRINGS() {
        return f32139a;
    }

    @yjd
    public static /* synthetic */ void getESCAPE_STRINGS$annotations() {
    }

    public static final void printQuoted(@yfb StringBuilder sb, @yfb String str) {
        md8.checkNotNullParameter(sb, "<this>");
        md8.checkNotNullParameter(str, "value");
        sb.append('\"');
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            String[] strArr = f32139a;
            if (cCharAt < strArr.length && strArr[cCharAt] != null) {
                sb.append((CharSequence) str, i, i2);
                sb.append(strArr[cCharAt]);
                i = i2 + 1;
            }
        }
        if (i != 0) {
            sb.append((CharSequence) str, i, str.length());
        } else {
            sb.append(str);
        }
        sb.append('\"');
    }

    @gib
    public static final Boolean toBooleanStrictOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        if (h9g.equals(str, "true", true)) {
            return Boolean.TRUE;
        }
        if (h9g.equals(str, "false", true)) {
            return Boolean.FALSE;
        }
        return null;
    }

    private static final char toHexChar(int i) {
        int i2 = i & 15;
        return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
    }
}
