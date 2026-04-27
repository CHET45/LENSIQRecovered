package p000;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes7.dex */
public class ejb {
    @jjf(version = "1.2")
    @t28
    private static final BigDecimal dec(BigDecimal bigDecimal) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(BigDecimal.ONE);
        md8.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @t28
    private static final BigDecimal div(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        md8.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal bigDecimalDivide = bigDecimal.divide(bigDecimal2, RoundingMode.HALF_EVEN);
        md8.checkNotNullExpressionValue(bigDecimalDivide, "divide(...)");
        return bigDecimalDivide;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal inc(BigDecimal bigDecimal) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalAdd = bigDecimal.add(BigDecimal.ONE);
        md8.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @t28
    private static final BigDecimal minus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        md8.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal bigDecimalSubtract = bigDecimal.subtract(bigDecimal2);
        md8.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
        return bigDecimalSubtract;
    }

    @t28
    private static final BigDecimal plus(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        md8.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal bigDecimalAdd = bigDecimal.add(bigDecimal2);
        md8.checkNotNullExpressionValue(bigDecimalAdd, "add(...)");
        return bigDecimalAdd;
    }

    @t28
    private static final BigDecimal rem(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        md8.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal bigDecimalRemainder = bigDecimal.remainder(bigDecimal2);
        md8.checkNotNullExpressionValue(bigDecimalRemainder, "remainder(...)");
        return bigDecimalRemainder;
    }

    @t28
    private static final BigDecimal times(BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        md8.checkNotNullParameter(bigDecimal2, "other");
        BigDecimal bigDecimalMultiply = bigDecimal.multiply(bigDecimal2);
        md8.checkNotNullExpressionValue(bigDecimalMultiply, "multiply(...)");
        return bigDecimalMultiply;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(int i) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(i);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @t28
    private static final BigDecimal unaryMinus(BigDecimal bigDecimal) {
        md8.checkNotNullParameter(bigDecimal, "<this>");
        BigDecimal bigDecimalNegate = bigDecimal.negate();
        md8.checkNotNullExpressionValue(bigDecimalNegate, "negate(...)");
        return bigDecimalNegate;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(int i, MathContext mathContext) {
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(i, mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(long j) {
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(j);
        md8.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        return bigDecimalValueOf;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(long j, MathContext mathContext) {
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(j, mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(float f) {
        return new BigDecimal(String.valueOf(f));
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(float f, MathContext mathContext) {
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(f), mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(double d) {
        return new BigDecimal(String.valueOf(d));
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(double d, MathContext mathContext) {
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(String.valueOf(d), mathContext);
    }
}
