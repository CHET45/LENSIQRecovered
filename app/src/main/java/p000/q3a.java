package p000;

import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@ay4
public final class q3a {
    private q3a() {
    }

    /* JADX INFO: renamed from: a */
    public static void m20053a(boolean condition, double input, RoundingMode mode) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("rounded value is out of range for input " + input + " and rounding mode " + mode);
    }

    /* JADX INFO: renamed from: b */
    public static void m20054b(boolean condition, String methodName, int a, int b) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + c0b.f15433c + a + ", " + b + c0b.f15434d);
    }

    /* JADX INFO: renamed from: c */
    public static void m20055c(boolean condition, String methodName, long a, long b) {
        if (condition) {
            return;
        }
        throw new ArithmeticException("overflow: " + methodName + c0b.f15433c + a + ", " + b + c0b.f15434d);
    }

    @op1
    /* JADX INFO: renamed from: d */
    public static double m20056d(String role, double x) {
        if (x >= 0.0d) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @op1
    /* JADX INFO: renamed from: e */
    public static int m20057e(String role, int x) {
        if (x >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @op1
    /* JADX INFO: renamed from: f */
    public static long m20058f(String role, long x) {
        if (x >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @op1
    /* JADX INFO: renamed from: g */
    public static BigInteger m20059g(String role, BigInteger x) {
        if (x.signum() >= 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be >= 0");
    }

    @op1
    /* JADX INFO: renamed from: h */
    public static int m20060h(String role, int x) {
        if (x > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    @op1
    /* JADX INFO: renamed from: i */
    public static long m20061i(String role, long x) {
        if (x > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    @op1
    /* JADX INFO: renamed from: j */
    public static BigInteger m20062j(String role, BigInteger x) {
        if (x.signum() > 0) {
            return x;
        }
        throw new IllegalArgumentException(role + " (" + x + ") must be > 0");
    }

    /* JADX INFO: renamed from: k */
    public static void m20063k(boolean condition) {
        if (!condition) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }
}
