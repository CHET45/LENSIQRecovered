package p000;

import java.util.Locale;

/* JADX INFO: renamed from: gv */
/* JADX INFO: loaded from: classes.dex */
@dwf({"SMAP\nAndroidStringDelegate.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidStringDelegate.android.kt\nandroidx/compose/ui/text/platform/AndroidStringDelegate\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
@e0g(parameters = 1)
public final class C6550gv implements rxc {

    /* JADX INFO: renamed from: a */
    public static final int f41236a = 0;

    @Override // p000.rxc
    @yfb
    public String capitalize(@yfb String str, @yfb Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? tw1.titlecase(cCharAt, locale) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // p000.rxc
    @yfb
    public String decapitalize(@yfb String str, @yfb Locale locale) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) tw1.lowercase(str.charAt(0), locale));
        String strSubstring = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
        sb.append(strSubstring);
        return sb.toString();
    }

    @Override // p000.rxc
    @yfb
    public String toLowerCase(@yfb String str, @yfb Locale locale) {
        String lowerCase = str.toLowerCase(locale);
        md8.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // p000.rxc
    @yfb
    public String toUpperCase(@yfb String str, @yfb Locale locale) {
        String upperCase = str.toUpperCase(locale);
        md8.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(locale)");
        return upperCase;
    }
}
