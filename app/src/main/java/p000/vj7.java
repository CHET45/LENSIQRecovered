package p000;

import p000.uj7;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nHexFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,844:1\n1088#2,2:845\n*S KotlinDebug\n*F\n+ 1 HexFormat.kt\nkotlin/text/HexFormatKt\n*L\n843#1:845,2\n*E\n"})
public final class vj7 {
    @rh5
    @jjf(version = "1.9")
    @t28
    private static final uj7 HexFormat(qy6<? super uj7.C13552a, bth> qy6Var) {
        md8.checkNotNullParameter(qy6Var, "builderAction");
        uj7.C13552a c13552a = new uj7.C13552a();
        qy6Var.invoke(c13552a);
        return c13552a.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isCaseSensitive(String str) {
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (md8.compare((int) cCharAt, 128) >= 0 || Character.isLetter(cCharAt)) {
                return true;
            }
        }
        return false;
    }
}
