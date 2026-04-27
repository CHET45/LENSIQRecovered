package p000;

import okhttp3.internal.p017ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n1#1,348:1\n338#1,4:349\n330#1,4:353\n338#1,4:357\n330#1,4:361\n*S KotlinDebug\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonElementKt\n*L\n259#1:349,4\n269#1:353,4\n278#1:357,4\n285#1:361,4\n*E\n"})
public final class uk8 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final f0f f88235a = e28.InlinePrimitiveDescriptor("kotlinx.serialization.json.JsonUnquotedLiteral", hg1.serializer(l7g.f56714a));

    @yfb
    public static final fm8 JsonPrimitive(@gib Boolean bool) {
        return bool == null ? xl8.INSTANCE : new ql8(bool, false, null, 4, null);
    }

    @ph5
    @yfb
    /* JADX INFO: renamed from: JsonPrimitive-7apg3OU, reason: not valid java name */
    public static final fm8 m32612JsonPrimitive7apg3OU(byte b) {
        return m32613JsonPrimitiveVKZWuLQ(oph.m31533constructorimpl(((long) b) & 255));
    }

    @ph5
    @yfb
    @ggg
    /* JADX INFO: renamed from: JsonPrimitive-VKZWuLQ, reason: not valid java name */
    public static final fm8 m32613JsonPrimitiveVKZWuLQ(long j) {
        return JsonUnquotedLiteral(Long.toUnsignedString(j));
    }

    @ph5
    @yfb
    /* JADX INFO: renamed from: JsonPrimitive-WZ4Q5Ns, reason: not valid java name */
    public static final fm8 m32614JsonPrimitiveWZ4Q5Ns(int i) {
        return m32613JsonPrimitiveVKZWuLQ(oph.m31533constructorimpl(((long) i) & 4294967295L));
    }

    @ph5
    @yfb
    /* JADX INFO: renamed from: JsonPrimitive-xj2QHRw, reason: not valid java name */
    public static final fm8 m32615JsonPrimitivexj2QHRw(short s) {
        return m32613JsonPrimitiveVKZWuLQ(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @ph5
    @yfb
    public static final fm8 JsonUnquotedLiteral(@gib String str) {
        if (str == null) {
            return xl8.INSTANCE;
        }
        if (md8.areEqual(str, xl8.INSTANCE.getContent())) {
            throw new fl8("Creating a literal unquoted value of 'null' is forbidden. If you want to create JSON null literal, use JsonNull object, otherwise, use JsonPrimitive");
        }
        return new ql8(str, false, f88235a);
    }

    private static final Void error(sk8 sk8Var, String str) {
        throw new IllegalArgumentException("Element " + vvd.getOrCreateKotlinClass(sk8Var.getClass()) + " is not a " + str);
    }

    public static final boolean getBoolean(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        Boolean booleanStrictOrNull = e8g.toBooleanStrictOrNull(fm8Var.getContent());
        if (booleanStrictOrNull != null) {
            return booleanStrictOrNull.booleanValue();
        }
        throw new IllegalStateException(fm8Var + " does not represent a Boolean");
    }

    @gib
    public static final Boolean getBooleanOrNull(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        return e8g.toBooleanStrictOrNull(fm8Var.getContent());
    }

    @gib
    public static final String getContentOrNull(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        if (fm8Var instanceof xl8) {
            return null;
        }
        return fm8Var.getContent();
    }

    public static final double getDouble(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        return Double.parseDouble(fm8Var.getContent());
    }

    @gib
    public static final Double getDoubleOrNull(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        return f9g.toDoubleOrNull(fm8Var.getContent());
    }

    public static final float getFloat(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        return Float.parseFloat(fm8Var.getContent());
    }

    @gib
    public static final Float getFloatOrNull(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        return f9g.toFloatOrNull(fm8Var.getContent());
    }

    public static final int getInt(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        try {
            long jConsumeNumericLiteral = new w7g(fm8Var.getContent()).consumeNumericLiteral();
            if (-2147483648L <= jConsumeNumericLiteral && jConsumeNumericLiteral <= 2147483647L) {
                return (int) jConsumeNumericLiteral;
            }
            throw new NumberFormatException(fm8Var.getContent() + " is not an Int");
        } catch (qk8 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @gib
    public static final Integer getIntOrNull(@yfb fm8 fm8Var) {
        Long lValueOf;
        md8.checkNotNullParameter(fm8Var, "<this>");
        try {
            lValueOf = Long.valueOf(new w7g(fm8Var.getContent()).consumeNumericLiteral());
        } catch (qk8 unused) {
            lValueOf = null;
        }
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            if (-2147483648L <= jLongValue && jLongValue <= 2147483647L) {
                return Integer.valueOf((int) jLongValue);
            }
        }
        return null;
    }

    @yfb
    public static final ck8 getJsonArray(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "<this>");
        ck8 ck8Var = sk8Var instanceof ck8 ? (ck8) sk8Var : null;
        if (ck8Var != null) {
            return ck8Var;
        }
        error(sk8Var, "JsonArray");
        throw new us8();
    }

    @yfb
    public static final xl8 getJsonNull(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "<this>");
        xl8 xl8Var = sk8Var instanceof xl8 ? (xl8) sk8Var : null;
        if (xl8Var != null) {
            return xl8Var;
        }
        error(sk8Var, "JsonNull");
        throw new us8();
    }

    @yfb
    public static final am8 getJsonObject(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "<this>");
        am8 am8Var = sk8Var instanceof am8 ? (am8) sk8Var : null;
        if (am8Var != null) {
            return am8Var;
        }
        error(sk8Var, "JsonObject");
        throw new us8();
    }

    @yfb
    public static final fm8 getJsonPrimitive(@yfb sk8 sk8Var) {
        md8.checkNotNullParameter(sk8Var, "<this>");
        fm8 fm8Var = sk8Var instanceof fm8 ? (fm8) sk8Var : null;
        if (fm8Var != null) {
            return fm8Var;
        }
        error(sk8Var, "JsonPrimitive");
        throw new us8();
    }

    @yfb
    public static final f0f getJsonUnquotedLiteralDescriptor() {
        return f88235a;
    }

    public static final long getLong(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        try {
            return new w7g(fm8Var.getContent()).consumeNumericLiteral();
        } catch (qk8 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    @gib
    public static final Long getLongOrNull(@yfb fm8 fm8Var) {
        md8.checkNotNullParameter(fm8Var, "<this>");
        try {
            return Long.valueOf(new w7g(fm8Var.getContent()).consumeNumericLiteral());
        } catch (qk8 unused) {
            return null;
        }
    }

    private static final <T> T mapExceptions(ny6<? extends T> ny6Var) {
        try {
            return ny6Var.invoke();
        } catch (qk8 e) {
            throw new NumberFormatException(e.getMessage());
        }
    }

    private static final <T> T mapExceptionsToNull(ny6<? extends T> ny6Var) {
        try {
            return ny6Var.invoke();
        } catch (qk8 unused) {
            return null;
        }
    }

    @yfb
    @yjd
    public static final Void unexpectedJson(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "key");
        md8.checkNotNullParameter(str2, "expected");
        throw new IllegalArgumentException("Element " + str + " is not a " + str2);
    }

    @yfb
    public static final fm8 JsonPrimitive(@gib Number number) {
        if (number == null) {
            return xl8.INSTANCE;
        }
        return new ql8(number, false, null, 4, null);
    }

    @yfb
    public static final fm8 JsonPrimitive(@gib String str) {
        if (str == null) {
            return xl8.INSTANCE;
        }
        return new ql8(str, true, null, 4, null);
    }

    @ph5
    @yfb
    public static final xl8 JsonPrimitive(@gib Void r0) {
        return xl8.INSTANCE;
    }
}
