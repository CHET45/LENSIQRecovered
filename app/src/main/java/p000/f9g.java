package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nStringNumberConversionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n1#1,274:1\n265#1,7:275\n265#1,7:282\n265#1,7:289\n265#1,7:296\n*S KotlinDebug\n*F\n+ 1 StringNumberConversionsJVM.kt\nkotlin/text/StringsKt__StringNumberConversionsJVMKt\n*L\n142#1:275,7\n149#1:282,7\n229#1:289,7\n240#1:296,7\n*E\n"})
public class f9g extends e9g {
    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(String str, qy6<? super String, ? extends T> qy6Var) {
        try {
            if (dre.f30494b.matches(str)) {
                return qy6Var.invoke(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return new BigDecimal(str);
    }

    @gib
    @jjf(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        try {
            if (dre.f30494b.matches(str)) {
                return new BigDecimal(str);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger toBigInteger(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return new BigInteger(str);
    }

    @gib
    @jjf(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        return toBigIntegerOrNull(str, 10);
    }

    @jjf(version = "1.4")
    @t28
    private static final boolean toBoolean(String str) {
        return Boolean.parseBoolean(str);
    }

    @t28
    private static final byte toByte(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str);
    }

    @t28
    private static final double toDouble(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Double.parseDouble(str);
    }

    @gib
    @jjf(version = "1.1")
    public static Double toDoubleOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        try {
            if (dre.f30494b.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @t28
    private static final float toFloat(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Float.parseFloat(str);
    }

    @gib
    @jjf(version = "1.1")
    public static Float toFloatOrNull(@yfb String str) {
        md8.checkNotNullParameter(str, "<this>");
        try {
            if (dre.f30494b.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @t28
    private static final int toInt(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str);
    }

    @t28
    private static final long toLong(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str);
    }

    @t28
    private static final short toShort(String str) {
        md8.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str);
    }

    @jjf(version = "1.1")
    @t28
    private static final String toString(byte b, int i) {
        String string = Integer.toString(b, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(String str, MathContext mathContext) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(str, mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger toBigInteger(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return new BigInteger(str, tw1.checkRadix(i));
    }

    @gib
    @jjf(version = "1.2")
    public static final BigInteger toBigIntegerOrNull(@yfb String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        tw1.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length != 1) {
            for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                if (tw1.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        } else if (tw1.digitOf(str.charAt(0), i) < 0) {
            return null;
        }
        return new BigInteger(str, tw1.checkRadix(i));
    }

    @jjf(version = "1.1")
    @t28
    private static final byte toByte(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return Byte.parseByte(str, tw1.checkRadix(i));
    }

    @jjf(version = "1.1")
    @t28
    private static final int toInt(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return Integer.parseInt(str, tw1.checkRadix(i));
    }

    @jjf(version = "1.1")
    @t28
    private static final long toLong(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return Long.parseLong(str, tw1.checkRadix(i));
    }

    @jjf(version = "1.1")
    @t28
    private static final short toShort(String str, int i) {
        md8.checkNotNullParameter(str, "<this>");
        return Short.parseShort(str, tw1.checkRadix(i));
    }

    @jjf(version = "1.1")
    @t28
    private static final String toString(short s, int i) {
        String string = Integer.toString(s, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @jjf(version = "1.1")
    @t28
    private static final String toString(int i, int i2) {
        String string = Integer.toString(i, tw1.checkRadix(i2));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @gib
    @jjf(version = "1.2")
    public static final BigDecimal toBigDecimalOrNull(@yfb String str, @yfb MathContext mathContext) {
        md8.checkNotNullParameter(str, "<this>");
        md8.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (dre.f30494b.matches(str)) {
                return new BigDecimal(str, mathContext);
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @jjf(version = "1.1")
    @t28
    private static final String toString(long j, int i) {
        String string = Long.toString(j, tw1.checkRadix(i));
        md8.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
