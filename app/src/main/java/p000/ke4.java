package p000;

import java.io.Serializable;
import java.lang.Comparable;
import java.math.BigInteger;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@gd7
@tx4
public abstract class ke4<C extends Comparable> {

    /* JADX INFO: renamed from: a */
    public final boolean f53700a;

    /* JADX INFO: renamed from: ke4$b */
    public static final class C8295b extends ke4<BigInteger> implements Serializable {

        /* JADX INFO: renamed from: b */
        public static final C8295b f53701b = new C8295b();

        /* JADX INFO: renamed from: c */
        public static final BigInteger f53702c = BigInteger.valueOf(Long.MIN_VALUE);

        /* JADX INFO: renamed from: d */
        public static final BigInteger f53703d = BigInteger.valueOf(Long.MAX_VALUE);
        private static final long serialVersionUID = 0;

        public C8295b() {
            super(true);
        }

        private Object readResolve() {
            return f53701b;
        }

        @Override // p000.ke4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public BigInteger mo14670a(BigInteger origin, long distance) {
            s72.m21766c(distance, "distance");
            return origin.add(BigInteger.valueOf(distance));
        }

        public String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        @Override // p000.ke4
        public long distance(BigInteger start, BigInteger end) {
            return end.subtract(start).max(f53702c).min(f53703d).longValue();
        }

        @Override // p000.ke4
        public BigInteger next(BigInteger value) {
            return value.add(BigInteger.ONE);
        }

        @Override // p000.ke4
        public BigInteger previous(BigInteger value) {
            return value.subtract(BigInteger.ONE);
        }
    }

    /* JADX INFO: renamed from: ke4$c */
    public static final class C8296c extends ke4<Integer> implements Serializable {

        /* JADX INFO: renamed from: b */
        public static final C8296c f53704b = new C8296c();
        private static final long serialVersionUID = 0;

        public C8296c() {
            super(true);
        }

        private Object readResolve() {
            return f53704b;
        }

        @Override // p000.ke4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Integer mo14670a(Integer origin, long distance) {
            s72.m21766c(distance, "distance");
            return Integer.valueOf(rd8.checkedCast(origin.longValue() + distance));
        }

        public String toString() {
            return "DiscreteDomain.integers()";
        }

        @Override // p000.ke4
        public long distance(Integer start, Integer end) {
            return ((long) end.intValue()) - ((long) start.intValue());
        }

        @Override // p000.ke4
        public Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        @Override // p000.ke4
        public Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // p000.ke4
        @wx1
        public Integer next(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue + 1);
        }

        @Override // p000.ke4
        @wx1
        public Integer previous(Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return Integer.valueOf(iIntValue - 1);
        }
    }

    /* JADX INFO: renamed from: ke4$d */
    public static final class C8297d extends ke4<Long> implements Serializable {

        /* JADX INFO: renamed from: b */
        public static final C8297d f53705b = new C8297d();
        private static final long serialVersionUID = 0;

        public C8297d() {
            super(true);
        }

        private Object readResolve() {
            return f53705b;
        }

        @Override // p000.ke4
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Long mo14670a(Long origin, long distance) {
            s72.m21766c(distance, "distance");
            long jLongValue = origin.longValue() + distance;
            if (jLongValue < 0) {
                v7d.checkArgument(origin.longValue() < 0, "overflow");
            }
            return Long.valueOf(jLongValue);
        }

        public String toString() {
            return "DiscreteDomain.longs()";
        }

        @Override // p000.ke4
        public long distance(Long start, Long end) {
            long jLongValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // p000.ke4
        public Long maxValue() {
            return Long.MAX_VALUE;
        }

        @Override // p000.ke4
        public Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // p000.ke4
        @wx1
        public Long next(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue + 1);
        }

        @Override // p000.ke4
        @wx1
        public Long previous(Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return Long.valueOf(jLongValue - 1);
        }
    }

    public static ke4<BigInteger> bigIntegers() {
        return C8295b.f53701b;
    }

    public static ke4<Integer> integers() {
        return C8296c.f53704b;
    }

    public static ke4<Long> longs() {
        return C8297d.f53705b;
    }

    /* JADX INFO: renamed from: a */
    public C mo14670a(C c, long j) {
        s72.m21766c(j, "distance");
        C c2 = c;
        for (long j2 = 0; j2 < j; j2++) {
            c2 = (C) next(c2);
            if (c2 == null) {
                throw new IllegalArgumentException("overflowed computing offset(" + c + ", " + j + c0b.f15434d);
            }
        }
        return c2;
    }

    public abstract long distance(C start, C end);

    @op1
    public C maxValue() {
        throw new NoSuchElementException();
    }

    @op1
    public C minValue() {
        throw new NoSuchElementException();
    }

    @wx1
    public abstract C next(C value);

    @wx1
    public abstract C previous(C value);

    public ke4() {
        this(false);
    }

    private ke4(boolean supportsFastOffset) {
        this.f53700a = supportsFastOffset;
    }
}
