package p000;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

/* JADX INFO: loaded from: classes7.dex */
public class fjb extends ejb {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ BigDecimal m10949a(BigInteger bigInteger, int i, MathContext mathContext, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = MathContext.UNLIMITED;
        }
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger and(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerAnd = bigInteger.and(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger dec(BigInteger bigInteger) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerSubtract = bigInteger.subtract(BigInteger.ONE);
        md8.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @t28
    private static final BigInteger div(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerDivide = bigInteger.divide(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger inc(BigInteger bigInteger) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerAdd = bigInteger.add(BigInteger.ONE);
        md8.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger inv(BigInteger bigInteger) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNot = bigInteger.not();
        md8.checkNotNullExpressionValue(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    @t28
    private static final BigInteger minus(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerSubtract = bigInteger.subtract(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    @jjf(version = "1.2")
    @t28
    /* JADX INFO: renamed from: or */
    private static final BigInteger m10950or(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerOr = bigInteger.or(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    @t28
    private static final BigInteger plus(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerAdd = bigInteger.add(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    @jjf(version = "1.1")
    @t28
    private static final BigInteger rem(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerRemainder = bigInteger.remainder(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger shl(BigInteger bigInteger, int i) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i);
        md8.checkNotNullExpressionValue(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger shr(BigInteger bigInteger, int i) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i);
        md8.checkNotNullExpressionValue(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    @t28
    private static final BigInteger times(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerMultiply = bigInteger.multiply(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(BigInteger bigInteger) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        return new BigDecimal(bigInteger);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger toBigInteger(int i) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(i);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    @t28
    private static final BigInteger unaryMinus(BigInteger bigInteger) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        BigInteger bigIntegerNegate = bigInteger.negate();
        md8.checkNotNullExpressionValue(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger xor(BigInteger bigInteger, BigInteger bigInteger2) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(bigInteger2, "other");
        BigInteger bigIntegerXor = bigInteger.xor(bigInteger2);
        md8.checkNotNullExpressionValue(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }

    @jjf(version = "1.2")
    @t28
    private static final BigDecimal toBigDecimal(BigInteger bigInteger, int i, MathContext mathContext) {
        md8.checkNotNullParameter(bigInteger, "<this>");
        md8.checkNotNullParameter(mathContext, "mathContext");
        return new BigDecimal(bigInteger, i, mathContext);
    }

    @jjf(version = "1.2")
    @t28
    private static final BigInteger toBigInteger(long j) {
        BigInteger bigIntegerValueOf = BigInteger.valueOf(j);
        md8.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }
}
