package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class z6g {
    @jl8
    @yfb
    public static final <T> sk8 decodeStringToJsonTree(@yfb bk8 bk8Var, @yfb t74<? extends T> t74Var, @yfb String str) {
        md8.checkNotNullParameter(bk8Var, "json");
        md8.checkNotNullParameter(t74Var, "deserializer");
        md8.checkNotNullParameter(str, "source");
        w7g w7gVarStringJsonLexer = x7g.StringJsonLexer(bk8Var, str);
        sk8 sk8VarDecodeJsonElement = new y6g(bk8Var, csi.f27316c, w7gVarStringJsonLexer, t74Var.getDescriptor(), null).decodeJsonElement();
        w7gVarStringJsonLexer.expectEof();
        return sk8VarDecodeJsonElement;
    }

    private static final <T> T parseString(AbstractC2163c2 abstractC2163c2, String str, qy6<? super String, ? extends T> qy6Var) {
        String strConsumeStringLenient = abstractC2163c2.consumeStringLenient();
        try {
            return qy6Var.invoke(strConsumeStringLenient);
        } catch (IllegalArgumentException unused) {
            AbstractC2163c2.fail$default(abstractC2163c2, "Failed to parse type '" + str + "' for input '" + strConsumeStringLenient + '\'', 0, null, 6, null);
            throw new us8();
        }
    }
}
