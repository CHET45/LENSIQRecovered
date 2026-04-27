package p000;

import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nPrimitives.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Primitives.kt\nkotlinx/serialization/internal/PrimitivesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
public final class ubd {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final Map<oo8<?>, lp8<?>> f87447a = exc.initBuiltins();

    @yfb
    public static final f0f PrimitiveDescriptorSafe(@yfb String str, @yfb jbd jbdVar) {
        md8.checkNotNullParameter(str, "serialName");
        md8.checkNotNullParameter(jbdVar, "kind");
        checkName(str);
        return new nbd(str, jbdVar);
    }

    @gib
    public static final <T> lp8<T> builtinSerializerOrNull(@yfb oo8<T> oo8Var) {
        md8.checkNotNullParameter(oo8Var, "<this>");
        return (lp8) f87447a.get(oo8Var);
    }

    private static final String capitalize(String str) {
        if (str.length() <= 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        char cCharAt = str.charAt(0);
        sb.append((Object) (Character.isLowerCase(cCharAt) ? uw1.titlecase(cCharAt) : String.valueOf(cCharAt)));
        String strSubstring = str.substring(1);
        md8.checkNotNullExpressionValue(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }

    private static final void checkName(String str) {
        for (lp8<?> lp8Var : f87447a.values()) {
            if (md8.areEqual(str, lp8Var.getDescriptor().getSerialName())) {
                throw new IllegalArgumentException(a9g.trimIndent("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name " + str + " there already exists " + vvd.getOrCreateKotlinClass(lp8Var.getClass()).getSimpleName() + ".\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
            }
        }
    }
}
