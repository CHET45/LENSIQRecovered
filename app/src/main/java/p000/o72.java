package p000;

import p000.n72;

/* JADX INFO: loaded from: classes.dex */
public final class o72 {
    @f0g
    @yfb
    public static final n72 mask(@yfb n72.C9719a c9719a, char c) {
        return new fv9(c);
    }

    @yfb
    public static final CharSequence toVisualText(@yfb jrg jrgVar, @yfb n72 n72Var, @yfb ozb ozbVar) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        while (i < jrgVar.length()) {
            int iCodePointAt = m72.codePointAt(jrgVar, i);
            int iTransform = n72Var.transform(i2, iCodePointAt);
            int iCharCount = m72.charCount(iCodePointAt);
            if (iTransform != iCodePointAt) {
                ozbVar.recordEditOperation(sb.length(), sb.length() + iCharCount, m72.charCount(iTransform));
                z = true;
            }
            v7g.appendCodePointX(sb, iTransform);
            i += iCharCount;
            i2++;
        }
        String string = sb.toString();
        md8.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return z ? string : jrgVar;
    }
}
