package p000;

/* JADX INFO: loaded from: classes7.dex */
public class nd2 extends md2 {
    @jjf(version = "1.1")
    @yfb
    public static <T extends Comparable<? super T>> T maxOf(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(t2, "b");
        return t.compareTo(t2) >= 0 ? t : t2;
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T extends Comparable<? super T>> T minOf(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(t2, "b");
        return t.compareTo(t2) <= 0 ? t : t2;
    }

    @jjf(version = "1.1")
    @t28
    private static final byte maxOf(byte b, byte b2) {
        return (byte) Math.max((int) b, (int) b2);
    }

    @jjf(version = "1.1")
    @t28
    private static final byte minOf(byte b, byte b2) {
        return (byte) Math.min((int) b, (int) b2);
    }

    @jjf(version = "1.1")
    @t28
    private static final short maxOf(short s, short s2) {
        return (short) Math.max((int) s, (int) s2);
    }

    @jjf(version = "1.1")
    @t28
    private static final short minOf(short s, short s2) {
        return (short) Math.min((int) s, (int) s2);
    }

    @jjf(version = "1.1")
    @t28
    private static final int maxOf(int i, int i2) {
        return Math.max(i, i2);
    }

    @jjf(version = "1.1")
    @t28
    private static final int minOf(int i, int i2) {
        return Math.min(i, i2);
    }

    @jjf(version = "1.1")
    @t28
    private static final long maxOf(long j, long j2) {
        return Math.max(j, j2);
    }

    @jjf(version = "1.1")
    @t28
    private static final long minOf(long j, long j2) {
        return Math.min(j, j2);
    }

    @jjf(version = "1.1")
    @t28
    private static final float maxOf(float f, float f2) {
        return Math.max(f, f2);
    }

    @jjf(version = "1.1")
    @t28
    private static final float minOf(float f, float f2) {
        return Math.min(f, f2);
    }

    @jjf(version = "1.1")
    @t28
    private static final double maxOf(double d, double d2) {
        return Math.max(d, d2);
    }

    @jjf(version = "1.1")
    @t28
    private static final double minOf(double d, double d2) {
        return Math.min(d, d2);
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T extends Comparable<? super T>> T maxOf(@yfb T t, @yfb T t2, @yfb T t3) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(t2, "b");
        md8.checkNotNullParameter(t3, "c");
        return (T) maxOf(t, maxOf(t2, t3));
    }

    @jjf(version = "1.1")
    @yfb
    public static final <T extends Comparable<? super T>> T minOf(@yfb T t, @yfb T t2, @yfb T t3) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(t2, "b");
        md8.checkNotNullParameter(t3, "c");
        return (T) minOf(t, minOf(t2, t3));
    }

    @jjf(version = "1.1")
    @t28
    private static final byte maxOf(byte b, byte b2, byte b3) {
        return (byte) Math.max((int) b, Math.max((int) b2, (int) b3));
    }

    @jjf(version = "1.1")
    @t28
    private static final byte minOf(byte b, byte b2, byte b3) {
        return (byte) Math.min((int) b, Math.min((int) b2, (int) b3));
    }

    @jjf(version = "1.1")
    @t28
    private static final short maxOf(short s, short s2, short s3) {
        return (short) Math.max((int) s, Math.max((int) s2, (int) s3));
    }

    @jjf(version = "1.1")
    @t28
    private static final short minOf(short s, short s2, short s3) {
        return (short) Math.min((int) s, Math.min((int) s2, (int) s3));
    }

    @jjf(version = "1.1")
    @t28
    private static final int maxOf(int i, int i2, int i3) {
        return Math.max(i, Math.max(i2, i3));
    }

    @jjf(version = "1.1")
    @t28
    private static final int minOf(int i, int i2, int i3) {
        return Math.min(i, Math.min(i2, i3));
    }

    @jjf(version = "1.1")
    @t28
    private static final long maxOf(long j, long j2, long j3) {
        return Math.max(j, Math.max(j2, j3));
    }

    @jjf(version = "1.1")
    @t28
    private static final long minOf(long j, long j2, long j3) {
        return Math.min(j, Math.min(j2, j3));
    }

    @jjf(version = "1.1")
    @t28
    private static final float maxOf(float f, float f2, float f3) {
        return Math.max(f, Math.max(f2, f3));
    }

    @jjf(version = "1.1")
    @t28
    private static final float minOf(float f, float f2, float f3) {
        return Math.min(f, Math.min(f2, f3));
    }

    @jjf(version = "1.1")
    @t28
    private static final double maxOf(double d, double d2, double d3) {
        return Math.max(d, Math.max(d2, d3));
    }

    @jjf(version = "1.1")
    @t28
    private static final double minOf(double d, double d2, double d3) {
        return Math.min(d, Math.min(d2, d3));
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T extends Comparable<? super T>> T maxOf(@yfb T t, @yfb T... tArr) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(tArr, "other");
        for (T t2 : tArr) {
            t = (T) maxOf(t, t2);
        }
        return t;
    }

    @jjf(version = "1.4")
    @yfb
    public static final <T extends Comparable<? super T>> T minOf(@yfb T t, @yfb T... tArr) {
        md8.checkNotNullParameter(t, "a");
        md8.checkNotNullParameter(tArr, "other");
        for (T t2 : tArr) {
            t = (T) minOf(t, t2);
        }
        return t;
    }

    @jjf(version = "1.4")
    public static final byte maxOf(byte b, @yfb byte... bArr) {
        md8.checkNotNullParameter(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.max((int) b, (int) b2);
        }
        return b;
    }

    @jjf(version = "1.4")
    public static final byte minOf(byte b, @yfb byte... bArr) {
        md8.checkNotNullParameter(bArr, "other");
        for (byte b2 : bArr) {
            b = (byte) Math.min((int) b, (int) b2);
        }
        return b;
    }

    @jjf(version = "1.4")
    public static final short maxOf(short s, @yfb short... sArr) {
        md8.checkNotNullParameter(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.max((int) s, (int) s2);
        }
        return s;
    }

    @jjf(version = "1.4")
    public static final short minOf(short s, @yfb short... sArr) {
        md8.checkNotNullParameter(sArr, "other");
        for (short s2 : sArr) {
            s = (short) Math.min((int) s, (int) s2);
        }
        return s;
    }

    @jjf(version = "1.4")
    public static final int maxOf(int i, @yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "other");
        for (int i2 : iArr) {
            i = Math.max(i, i2);
        }
        return i;
    }

    @jjf(version = "1.4")
    public static final int minOf(int i, @yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "other");
        for (int i2 : iArr) {
            i = Math.min(i, i2);
        }
        return i;
    }

    @jjf(version = "1.4")
    public static final long maxOf(long j, @yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "other");
        for (long j2 : jArr) {
            j = Math.max(j, j2);
        }
        return j;
    }

    @jjf(version = "1.4")
    public static final long minOf(long j, @yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "other");
        for (long j2 : jArr) {
            j = Math.min(j, j2);
        }
        return j;
    }

    @jjf(version = "1.4")
    public static float maxOf(float f, @yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "other");
        for (float f2 : fArr) {
            f = Math.max(f, f2);
        }
        return f;
    }

    @jjf(version = "1.4")
    public static float minOf(float f, @yfb float... fArr) {
        md8.checkNotNullParameter(fArr, "other");
        for (float f2 : fArr) {
            f = Math.min(f, f2);
        }
        return f;
    }

    @jjf(version = "1.4")
    public static final double maxOf(double d, @yfb double... dArr) {
        md8.checkNotNullParameter(dArr, "other");
        for (double d2 : dArr) {
            d = Math.max(d, d2);
        }
        return d;
    }

    @jjf(version = "1.4")
    public static final double minOf(double d, @yfb double... dArr) {
        md8.checkNotNullParameter(dArr, "other");
        for (double d2 : dArr) {
            d = Math.min(d, d2);
        }
        return d;
    }
}
