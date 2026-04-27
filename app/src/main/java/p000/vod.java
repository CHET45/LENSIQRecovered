package p000;

import p000.ymh;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nRandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Random.kt\nkotlin/random/RandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,383:1\n1#2:384\n*E\n"})
public final class vod {
    @jjf(version = "1.3")
    @yfb
    public static final tod Random(int i) {
        return new hti(i, i >> 31);
    }

    @yfb
    public static final String boundsErrorMessage(@yfb Object obj, @yfb Object obj2) {
        md8.checkNotNullParameter(obj, ymh.InterfaceC15729h.f102263c);
        md8.checkNotNullParameter(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void checkRangeBounds(int i, int i2) {
        if (i2 <= i) {
            throw new IllegalArgumentException(boundsErrorMessage(Integer.valueOf(i), Integer.valueOf(i2)).toString());
        }
    }

    public static final int fastLog2(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    @jjf(version = "1.3")
    public static final int nextInt(@yfb tod todVar, @yfb f78 f78Var) {
        md8.checkNotNullParameter(todVar, "<this>");
        md8.checkNotNullParameter(f78Var, "range");
        if (!f78Var.isEmpty()) {
            return f78Var.getLast() < Integer.MAX_VALUE ? todVar.nextInt(f78Var.getFirst(), f78Var.getLast() + 1) : f78Var.getFirst() > Integer.MIN_VALUE ? todVar.nextInt(f78Var.getFirst() - 1, f78Var.getLast()) + 1 : todVar.nextInt();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + f78Var);
    }

    @jjf(version = "1.3")
    public static final long nextLong(@yfb tod todVar, @yfb ul9 ul9Var) {
        md8.checkNotNullParameter(todVar, "<this>");
        md8.checkNotNullParameter(ul9Var, "range");
        if (!ul9Var.isEmpty()) {
            return ul9Var.getLast() < Long.MAX_VALUE ? todVar.nextLong(ul9Var.getFirst(), ul9Var.getLast() + 1) : ul9Var.getFirst() > Long.MIN_VALUE ? todVar.nextLong(ul9Var.getFirst() - 1, ul9Var.getLast()) + 1 : todVar.nextLong();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + ul9Var);
    }

    public static final int takeUpperBits(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }

    @jjf(version = "1.3")
    @yfb
    public static final tod Random(long j) {
        return new hti((int) j, (int) (j >> 32));
    }

    public static final void checkRangeBounds(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(boundsErrorMessage(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final void checkRangeBounds(double d, double d2) {
        if (d2 <= d) {
            throw new IllegalArgumentException(boundsErrorMessage(Double.valueOf(d), Double.valueOf(d2)).toString());
        }
    }
}
