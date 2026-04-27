package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class il8 {
    @yfb
    public static final qk8 InvalidFloatingPointDecoded(@yfb Number number, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(number, "value");
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "output");
        return JsonDecodingException(-1, unexpectedFpErrorMessage(number, str, str2));
    }

    @yfb
    public static final fl8 InvalidFloatingPointEncoded(@yfb Number number, @yfb String str) {
        md8.checkNotNullParameter(number, "value");
        md8.checkNotNullParameter(str, "output");
        return new fl8("Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(str, 0, 1, null)));
    }

    @yfb
    public static final fl8 InvalidKeyKindException(@yfb f0f f0fVar) {
        md8.checkNotNullParameter(f0fVar, "keyDescriptor");
        return new fl8("Value of type '" + f0fVar.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + f0fVar.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
    }

    @yfb
    public static final qk8 JsonDecodingException(int i, @yfb String str) {
        md8.checkNotNullParameter(str, g55.f38799h);
        if (i >= 0) {
            str = "Unexpected JSON token at offset " + i + ": " + str;
        }
        return new qk8(str);
    }

    @yfb
    public static final qk8 UnknownKeyException(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "input");
        return JsonDecodingException(-1, "Encountered an unknown key '" + str + "'.\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.\nCurrent input: " + ((Object) minify$default(str2, 0, 1, null)));
    }

    @yfb
    public static final Void invalidTrailingComma(@yfb AbstractC2163c2 abstractC2163c2, @yfb String str) {
        md8.checkNotNullParameter(abstractC2163c2, "<this>");
        md8.checkNotNullParameter(str, "entity");
        abstractC2163c2.fail("Trailing comma before the end of JSON " + str, abstractC2163c2.f15565a - 1, "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingCommas = true' in 'Json {}' builder to support them.");
        throw new us8();
    }

    public static /* synthetic */ Void invalidTrailingComma$default(AbstractC2163c2 abstractC2163c2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "object";
        }
        return invalidTrailingComma(abstractC2163c2, str);
    }

    @yfb
    public static final CharSequence minify(@yfb CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() < 200) {
            return charSequence;
        }
        if (i == -1) {
            int length = charSequence.length() - 60;
            if (length <= 0) {
                return charSequence;
            }
            return "....." + charSequence.subSequence(length, charSequence.length()).toString();
        }
        int i2 = i - 30;
        int i3 = i + 30;
        return (i2 <= 0 ? "" : ".....") + charSequence.subSequence(kpd.coerceAtLeast(i2, 0), kpd.coerceAtMost(i3, charSequence.length())).toString() + (i3 >= charSequence.length() ? "" : ".....");
    }

    public static /* synthetic */ CharSequence minify$default(CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        return minify(charSequence, i);
    }

    @yfb
    public static final Void throwInvalidFloatingPointDecoded(@yfb AbstractC2163c2 abstractC2163c2, @yfb Number number) {
        md8.checkNotNullParameter(abstractC2163c2, "<this>");
        md8.checkNotNullParameter(number, "result");
        AbstractC2163c2.fail$default(abstractC2163c2, "Unexpected special floating-point value " + number + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, C4584d2.f28234c, 2, null);
        throw new us8();
    }

    private static final String unexpectedFpErrorMessage(Number number, String str, String str2) {
        return "Unexpected special floating-point value " + number + " with key " + str + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + ((Object) minify$default(str2, 0, 1, null));
    }

    @yfb
    public static final qk8 JsonDecodingException(int i, @yfb String str, @yfb CharSequence charSequence) {
        md8.checkNotNullParameter(str, g55.f38799h);
        md8.checkNotNullParameter(charSequence, "input");
        return JsonDecodingException(i, str + "\nJSON input: " + ((Object) minify(charSequence, i)));
    }

    @yfb
    public static final fl8 InvalidFloatingPointEncoded(@yfb Number number, @yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(number, "value");
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "output");
        return new fl8(unexpectedFpErrorMessage(number, str, str2));
    }
}
