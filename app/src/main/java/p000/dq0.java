package p000;

import com.google.firebase.analytics.FirebaseAnalytics;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
public final class dq0 {
    @jjf(version = "1.8")
    @t28
    @xg5
    private static final byte[] platformCharsToBytes(bq0 bq0Var, CharSequence charSequence, int i, int i2) {
        md8.checkNotNullParameter(bq0Var, "<this>");
        md8.checkNotNullParameter(charSequence, "source");
        if (!(charSequence instanceof String)) {
            return bq0Var.charsToBytesImpl$kotlin_stdlib(charSequence, i, i2);
        }
        String str = (String) charSequence;
        bq0Var.checkSourceBounds$kotlin_stdlib(str.length(), i, i2);
        String strSubstring = str.substring(i, i2);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        Charset charset = xw1.f99529g;
        md8.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        byte[] bytes = strSubstring.getBytes(charset);
        md8.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    @jjf(version = "1.8")
    @t28
    @xg5
    private static final int platformEncodeIntoByteArray(bq0 bq0Var, byte[] bArr, byte[] bArr2, int i, int i2, int i3) {
        md8.checkNotNullParameter(bq0Var, "<this>");
        md8.checkNotNullParameter(bArr, "source");
        md8.checkNotNullParameter(bArr2, FirebaseAnalytics.C3552d.f23234z);
        return bq0Var.encodeIntoByteArrayImpl$kotlin_stdlib(bArr, bArr2, i, i2, i3);
    }

    @jjf(version = "1.8")
    @t28
    @xg5
    private static final byte[] platformEncodeToByteArray(bq0 bq0Var, byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bq0Var, "<this>");
        md8.checkNotNullParameter(bArr, "source");
        return bq0Var.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2);
    }

    @jjf(version = "1.8")
    @t28
    @xg5
    private static final String platformEncodeToString(bq0 bq0Var, byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(bq0Var, "<this>");
        md8.checkNotNullParameter(bArr, "source");
        return new String(bq0Var.encodeToByteArrayImpl$kotlin_stdlib(bArr, i, i2), xw1.f99529g);
    }
}
