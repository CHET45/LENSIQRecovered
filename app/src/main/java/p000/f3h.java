package p000;

import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes5.dex */
@jd7
@yg8
@ay4
public abstract class f3h<X extends Number & Comparable<X>> {

    /* JADX INFO: renamed from: f3h$a */
    public static /* synthetic */ class C5584a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35008a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f35008a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35008a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35008a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35008a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35008a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35008a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35008a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35008a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract X mo10496a(X a, X b);

    /* JADX INFO: renamed from: b */
    public final double m10497b(X x, RoundingMode mode) {
        Number numberMo10500e;
        double dNextUp;
        v7d.checkNotNull(x, "x");
        v7d.checkNotNull(mode, "mode");
        double dMo10498c = mo10498c(x);
        if (Double.isInfinite(dMo10498c)) {
            switch (C5584a.f35008a[mode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return ((double) mo10499d(x)) * Double.MAX_VALUE;
                case 5:
                    return dMo10498c == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return dMo10498c == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    return dMo10498c;
                case 8:
                    throw new ArithmeticException(x + " cannot be represented precisely as a double");
            }
        }
        Number numberMo10500e2 = mo10500e(dMo10498c, RoundingMode.UNNECESSARY);
        int iCompareTo = ((Comparable) x).compareTo(numberMo10500e2);
        int[] iArr = C5584a.f35008a;
        switch (iArr[mode.ordinal()]) {
            case 1:
                return mo10499d(x) >= 0 ? iCompareTo >= 0 ? dMo10498c : ik4.m13154f(dMo10498c) : iCompareTo <= 0 ? dMo10498c : Math.nextUp(dMo10498c);
            case 2:
            case 3:
            case 4:
                if (iCompareTo >= 0) {
                    dNextUp = Math.nextUp(dMo10498c);
                    if (dNextUp == Double.POSITIVE_INFINITY) {
                        return dMo10498c;
                    }
                    numberMo10500e = mo10500e(dNextUp, RoundingMode.CEILING);
                } else {
                    double dM13154f = ik4.m13154f(dMo10498c);
                    if (dM13154f == Double.NEGATIVE_INFINITY) {
                        return dMo10498c;
                    }
                    Number numberMo10500e3 = mo10500e(dM13154f, RoundingMode.FLOOR);
                    numberMo10500e = numberMo10500e2;
                    numberMo10500e2 = numberMo10500e3;
                    dNextUp = dMo10498c;
                    dMo10498c = dM13154f;
                }
                int iCompareTo2 = ((Comparable) mo10496a(x, numberMo10500e2)).compareTo(mo10496a(numberMo10500e, x));
                if (iCompareTo2 < 0) {
                    return dMo10498c;
                }
                if (iCompareTo2 > 0) {
                    return dNextUp;
                }
                int i = iArr[mode.ordinal()];
                if (i == 2) {
                    return (Double.doubleToRawLongBits(dMo10498c) & 1) == 0 ? dMo10498c : dNextUp;
                }
                if (i == 3) {
                    return mo10499d(x) >= 0 ? dMo10498c : dNextUp;
                }
                if (i == 4) {
                    return mo10499d(x) >= 0 ? dNextUp : dMo10498c;
                }
                throw new AssertionError("impossible");
            case 5:
                return iCompareTo >= 0 ? dMo10498c : ik4.m13154f(dMo10498c);
            case 6:
                return iCompareTo <= 0 ? dMo10498c : Math.nextUp(dMo10498c);
            case 7:
                return mo10499d(x) >= 0 ? iCompareTo <= 0 ? dMo10498c : Math.nextUp(dMo10498c) : iCompareTo >= 0 ? dMo10498c : ik4.m13154f(dMo10498c);
            case 8:
                q3a.m20063k(iCompareTo == 0);
                return dMo10498c;
            default:
                throw new AssertionError("impossible");
        }
    }

    /* JADX INFO: renamed from: c */
    public abstract double mo10498c(X x);

    /* JADX INFO: renamed from: d */
    public abstract int mo10499d(X x);

    /* JADX INFO: renamed from: e */
    public abstract X mo10500e(double d, RoundingMode mode);
}
