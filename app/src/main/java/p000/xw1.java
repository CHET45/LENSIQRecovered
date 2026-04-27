package p000;

import java.nio.charset.Charset;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes7.dex */
public final class xw1 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final xw1 f99523a = new xw1();

    /* JADX INFO: renamed from: b */
    @un8
    @yfb
    public static final Charset f99524b;

    /* JADX INFO: renamed from: c */
    @un8
    @yfb
    public static final Charset f99525c;

    /* JADX INFO: renamed from: d */
    @un8
    @yfb
    public static final Charset f99526d;

    /* JADX INFO: renamed from: e */
    @un8
    @yfb
    public static final Charset f99527e;

    /* JADX INFO: renamed from: f */
    @un8
    @yfb
    public static final Charset f99528f;

    /* JADX INFO: renamed from: g */
    @un8
    @yfb
    public static final Charset f99529g;

    /* JADX INFO: renamed from: h */
    @gib
    public static volatile Charset f99530h;

    /* JADX INFO: renamed from: i */
    @gib
    public static volatile Charset f99531i;

    /* JADX INFO: renamed from: j */
    @gib
    public static volatile Charset f99532j;

    static {
        Charset charsetForName = Charset.forName("UTF-8");
        md8.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f99524b = charsetForName;
        Charset charsetForName2 = Charset.forName(CharsetNames.UTF_16);
        md8.checkNotNullExpressionValue(charsetForName2, "forName(...)");
        f99525c = charsetForName2;
        Charset charsetForName3 = Charset.forName(CharsetNames.UTF_16BE);
        md8.checkNotNullExpressionValue(charsetForName3, "forName(...)");
        f99526d = charsetForName3;
        Charset charsetForName4 = Charset.forName(CharsetNames.UTF_16LE);
        md8.checkNotNullExpressionValue(charsetForName4, "forName(...)");
        f99527e = charsetForName4;
        Charset charsetForName5 = Charset.forName("US-ASCII");
        md8.checkNotNullExpressionValue(charsetForName5, "forName(...)");
        f99528f = charsetForName5;
        Charset charsetForName6 = Charset.forName(CharsetNames.ISO_8859_1);
        md8.checkNotNullExpressionValue(charsetForName6, "forName(...)");
        f99529g = charsetForName6;
    }

    private xw1() {
    }

    @yfb
    @xn8(name = "UTF32")
    public final Charset UTF32() {
        Charset charset = f99530h;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32");
        md8.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f99530h = charsetForName;
        return charsetForName;
    }

    @yfb
    @xn8(name = "UTF32_BE")
    public final Charset UTF32_BE() {
        Charset charset = f99532j;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32BE");
        md8.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f99532j = charsetForName;
        return charsetForName;
    }

    @yfb
    @xn8(name = "UTF32_LE")
    public final Charset UTF32_LE() {
        Charset charset = f99531i;
        if (charset != null) {
            return charset;
        }
        Charset charsetForName = Charset.forName("UTF-32LE");
        md8.checkNotNullExpressionValue(charsetForName, "forName(...)");
        f99531i = charsetForName;
        return charsetForName;
    }
}
