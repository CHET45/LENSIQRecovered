package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_StringsJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,108:1\n1244#2,14:109\n1526#2,14:123\n*S KotlinDebug\n*F\n+ 1 _StringsJvm.kt\nkotlin/text/StringsKt___StringsJvmKt\n*L\n45#1:109,14\n66#1:123,14\n*E\n"})
public class n9g extends m9g {
    @t28
    private static final char elementAt(CharSequence charSequence, int i) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return charSequence.charAt(i);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxOrNull instead.", replaceWith = @i2e(expression = "this.maxOrNull()", imports = {}))
    public static final /* synthetic */ Character max(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return t9g.maxOrNull(charSequence);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxByOrNull instead.", replaceWith = @i2e(expression = "this.maxByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character maxBy(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use maxWithOrNull instead.", replaceWith = @i2e(expression = "this.maxWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character maxWith(CharSequence charSequence, Comparator comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return t9g.maxWithOrNull(charSequence, comparator);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minOrNull instead.", replaceWith = @i2e(expression = "this.minOrNull()", imports = {}))
    public static final /* synthetic */ Character min(CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return t9g.minOrNull(charSequence);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minByOrNull instead.", replaceWith = @i2e(expression = "this.minByOrNull(selector)", imports = {}))
    public static final /* synthetic */ <R extends Comparable<? super R>> Character minBy(CharSequence charSequence, qy6<? super Character, ? extends R> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        if (charSequence.length() == 0) {
            return null;
        }
        char cCharAt = charSequence.charAt(0);
        int lastIndex = m9g.getLastIndex(charSequence);
        if (lastIndex == 0) {
            return Character.valueOf(cCharAt);
        }
        R rInvoke = qy6Var.invoke(Character.valueOf(cCharAt));
        int i = 1;
        if (1 <= lastIndex) {
            while (true) {
                char cCharAt2 = charSequence.charAt(i);
                R rInvoke2 = qy6Var.invoke(Character.valueOf(cCharAt2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    cCharAt = cCharAt2;
                    rInvoke = rInvoke2;
                }
                if (i == lastIndex) {
                    break;
                }
                i++;
            }
        }
        return Character.valueOf(cCharAt);
    }

    @t64(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    @q64(message = "Use minWithOrNull instead.", replaceWith = @i2e(expression = "this.minWithOrNull(comparator)", imports = {}))
    public static final /* synthetic */ Character minWith(CharSequence charSequence, Comparator comparator) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(comparator, "comparator");
        return t9g.minWithOrNull(charSequence, comparator);
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigDecimal")
    private static final BigDecimal sumOfBigDecimal(CharSequence charSequence, qy6<? super Character, ? extends BigDecimal> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
            md8.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    @r9c
    @jjf(version = "1.4")
    @t28
    @xn8(name = "sumOfBigInteger")
    private static final BigInteger sumOfBigInteger(CharSequence charSequence, qy6<? super Character, ? extends BigInteger> qy6Var) {
        md8.checkNotNullParameter(charSequence, "<this>");
        md8.checkNotNullParameter(qy6Var, "selector");
        BigInteger bigIntegerValueOf = BigInteger.valueOf(0L);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        for (int i = 0; i < charSequence.length(); i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(qy6Var.invoke(Character.valueOf(charSequence.charAt(i))));
            md8.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    @yfb
    public static final SortedSet<Character> toSortedSet(@yfb CharSequence charSequence) {
        md8.checkNotNullParameter(charSequence, "<this>");
        return (SortedSet) t9g.toCollection(charSequence, new TreeSet());
    }
}
