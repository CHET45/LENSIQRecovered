package p000;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes7.dex */
@xn8(name = "CharsetsKt")
public final class zw1 {
    @t28
    private static final Charset charset(String str) {
        md8.checkNotNullParameter(str, "charsetName");
        Charset charsetForName = Charset.forName(str);
        md8.checkNotNullExpressionValue(charsetForName, "forName(...)");
        return charsetForName;
    }
}
