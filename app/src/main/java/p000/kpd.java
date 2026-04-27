package p000;

import android.support.v4.media.session.PlaybackStateCompat;
import java.util.NoSuchElementException;
import p000.d78;
import p000.sl9;
import p000.zv1;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\n_Ranges.kt\nKotlin\n*S Kotlin\n*F\n+ 1 _Ranges.kt\nkotlin/ranges/RangesKt___RangesKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1538:1\n1#2:1539\n*E\n"})
public class kpd extends jpd {
    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "byteRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean byteRangeContains(a62 a62Var, double d) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(d);
        if (byteExactOrNull != null) {
            return a62Var.contains(byteExactOrNull);
        }
        return false;
    }

    @yfb
    public static final <T extends Comparable<? super T>> T coerceAtLeast(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(t2, "minimumValue");
        return t.compareTo(t2) < 0 ? t2 : t;
    }

    @yfb
    public static final <T extends Comparable<? super T>> T coerceAtMost(@yfb T t, @yfb T t2) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(t2, "maximumValue");
        return t.compareTo(t2) > 0 ? t2 : t;
    }

    @yfb
    public static final <T extends Comparable<? super T>> T coerceIn(@yfb T t, @gib T t2, @gib T t3) {
        md8.checkNotNullParameter(t, "<this>");
        if (t2 == null || t3 == null) {
            if (t2 != null && t.compareTo(t2) < 0) {
                return t2;
            }
            if (t3 != null && t.compareTo(t3) > 0) {
                return t3;
            }
        } else {
            if (t2.compareTo(t3) > 0) {
                throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + t3 + " is less than minimum " + t2 + a18.f100c);
            }
            if (t.compareTo(t2) < 0) {
                return t2;
            }
            if (t.compareTo(t3) > 0) {
                return t3;
            }
        }
        return t;
    }

    @jjf(version = "1.3")
    @t28
    private static final boolean contains(f78 f78Var, Integer num) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return num != null && f78Var.contains(num.intValue());
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "doubleRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean doubleRangeContains(a62 a62Var, byte b) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Double.valueOf(b));
    }

    @yfb
    public static final d78 downTo(int i, byte b) {
        return d78.f28697d.fromClosedRange(i, b, -1);
    }

    @jjf(version = "1.7")
    public static final int first(@yfb d78 d78Var) {
        md8.checkNotNullParameter(d78Var, "<this>");
        if (!d78Var.isEmpty()) {
            return d78Var.getFirst();
        }
        throw new NoSuchElementException("Progression " + d78Var + " is empty.");
    }

    @gib
    @jjf(version = "1.7")
    public static final Integer firstOrNull(@yfb d78 d78Var) {
        md8.checkNotNullParameter(d78Var, "<this>");
        if (d78Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(d78Var.getFirst());
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "floatRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean floatRangeContains(a62 a62Var, byte b) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Float.valueOf(b));
    }

    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb a62<Integer> a62Var, byte b) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Integer.valueOf(b));
    }

    @jjf(version = "1.7")
    public static final int last(@yfb d78 d78Var) {
        md8.checkNotNullParameter(d78Var, "<this>");
        if (!d78Var.isEmpty()) {
            return d78Var.getLast();
        }
        throw new NoSuchElementException("Progression " + d78Var + " is empty.");
    }

    @gib
    @jjf(version = "1.7")
    public static final Integer lastOrNull(@yfb d78 d78Var) {
        md8.checkNotNullParameter(d78Var, "<this>");
        if (d78Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(d78Var.getLast());
    }

    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb a62<Long> a62Var, byte b) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Long.valueOf(b));
    }

    @jjf(version = "1.3")
    @t28
    private static final int random(f78 f78Var) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return random(f78Var, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Integer randomOrNull(f78 f78Var) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return randomOrNull(f78Var, tod.f85517a);
    }

    @yfb
    public static d78 reversed(@yfb d78 d78Var) {
        md8.checkNotNullParameter(d78Var, "<this>");
        return d78.f28697d.fromClosedRange(d78Var.getLast(), d78Var.getFirst(), -d78Var.getStep());
    }

    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb a62<Short> a62Var, byte b) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Short.valueOf(b));
    }

    @yfb
    public static d78 step(@yfb d78 d78Var, int i) {
        md8.checkNotNullParameter(d78Var, "<this>");
        jpd.checkStepIsPositive(i > 0, Integer.valueOf(i));
        d78.C4656a c4656a = d78.f28697d;
        int first = d78Var.getFirst();
        int last = d78Var.getLast();
        if (d78Var.getStep() <= 0) {
            i = -i;
        }
        return c4656a.fromClosedRange(first, last, i);
    }

    @gib
    public static final Byte toByteExactOrNull(int i) {
        if (-128 > i || i >= 128) {
            return null;
        }
        return Byte.valueOf((byte) i);
    }

    @gib
    public static final Integer toIntExactOrNull(long j) {
        if (-2147483648L > j || j >= 2147483648L) {
            return null;
        }
        return Integer.valueOf((int) j);
    }

    @gib
    public static final Long toLongExactOrNull(double d) {
        if (-9.223372036854776E18d > d || d > 9.223372036854776E18d) {
            return null;
        }
        return Long.valueOf((long) d);
    }

    @gib
    public static final Short toShortExactOrNull(int i) {
        if (-32768 > i || i >= 32768) {
            return null;
        }
        return Short.valueOf((short) i);
    }

    @yfb
    public static final f78 until(int i, byte b) {
        return new f78(i, b - 1);
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "byteRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean byteRangeContains(a62 a62Var, float f) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(f);
        if (byteExactOrNull != null) {
            return a62Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static final byte coerceAtLeast(byte b, byte b2) {
        return b < b2 ? b2 : b;
    }

    public static final byte coerceAtMost(byte b, byte b2) {
        return b > b2 ? b2 : b;
    }

    @jjf(version = "1.3")
    @t28
    private static final boolean contains(ul9 ul9Var, Long l) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return l != null && ul9Var.contains(l.longValue());
    }

    @xn8(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@yfb a62<Double> a62Var, float f) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Double.valueOf(f));
    }

    @yfb
    public static final sl9 downTo(long j, byte b) {
        return sl9.f82177d.fromClosedRange(j, b, -1L);
    }

    @gib
    @jjf(version = "1.7")
    public static final Long firstOrNull(@yfb sl9 sl9Var) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        if (sl9Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(sl9Var.getFirst());
    }

    @xn8(name = "floatRangeContains")
    public static final boolean floatRangeContains(@yfb a62<Float> a62Var, double d) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Float.valueOf((float) d));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb r5c<Integer> r5cVar, byte b) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Integer.valueOf(b));
    }

    @gib
    @jjf(version = "1.7")
    public static final Long lastOrNull(@yfb sl9 sl9Var) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        if (sl9Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(sl9Var.getLast());
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb r5c<Long> r5cVar, byte b) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Long.valueOf(b));
    }

    @jjf(version = "1.3")
    @t28
    private static final long random(ul9 ul9Var) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return random(ul9Var, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Long randomOrNull(ul9 ul9Var) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return randomOrNull(ul9Var, tod.f85517a);
    }

    @yfb
    public static final sl9 reversed(@yfb sl9 sl9Var) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        return sl9.f82177d.fromClosedRange(sl9Var.getLast(), sl9Var.getFirst(), -sl9Var.getStep());
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb r5c<Short> r5cVar, byte b) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Short.valueOf(b));
    }

    @gib
    public static final Byte toByteExactOrNull(long j) {
        if (-128 > j || j >= 128) {
            return null;
        }
        return Byte.valueOf((byte) j);
    }

    @gib
    public static final Integer toIntExactOrNull(double d) {
        if (-2.147483648E9d > d || d > 2.147483647E9d) {
            return null;
        }
        return Integer.valueOf((int) d);
    }

    @gib
    public static final Long toLongExactOrNull(float f) {
        if (-9.223372E18f > f || f > 9.223372E18f) {
            return null;
        }
        return Long.valueOf((long) f);
    }

    @gib
    public static final Short toShortExactOrNull(long j) {
        if (-32768 > j || j >= PlaybackStateCompat.ACTION_PREPARE_FROM_MEDIA_ID) {
            return null;
        }
        return Short.valueOf((short) j);
    }

    @yfb
    public static final ul9 until(long j, byte b) {
        return new ul9(j, ((long) b) - 1);
    }

    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb a62<Byte> a62Var, int i) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return a62Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceAtLeast(short s, short s2) {
        return s < s2 ? s2 : s;
    }

    public static final short coerceAtMost(short s, short s2) {
        return s > s2 ? s2 : s;
    }

    @jjf(version = "1.3")
    @t28
    private static final boolean contains(bw1 bw1Var, Character ch) {
        md8.checkNotNullParameter(bw1Var, "<this>");
        return ch != null && bw1Var.contains(ch.charValue());
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "doubleRangeContains")
    public static final boolean doubleRangeContains(@yfb r5c<Double> r5cVar, float f) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Double.valueOf(f));
    }

    @yfb
    public static final d78 downTo(byte b, byte b2) {
        return d78.f28697d.fromClosedRange(b, b2, -1);
    }

    @gib
    @jjf(version = "1.7")
    public static final Character firstOrNull(@yfb zv1 zv1Var) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        if (zv1Var.isEmpty()) {
            return null;
        }
        return Character.valueOf(zv1Var.getFirst());
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "floatRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean floatRangeContains(a62 a62Var, int i) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Float.valueOf(i));
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "intRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean intRangeContains(a62 a62Var, double d) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Integer intExactOrNull = toIntExactOrNull(d);
        if (intExactOrNull != null) {
            return a62Var.contains(intExactOrNull);
        }
        return false;
    }

    @gib
    @jjf(version = "1.7")
    public static final Character lastOrNull(@yfb zv1 zv1Var) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        if (zv1Var.isEmpty()) {
            return null;
        }
        return Character.valueOf(zv1Var.getLast());
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "longRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean longRangeContains(a62 a62Var, double d) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Long longExactOrNull = toLongExactOrNull(d);
        if (longExactOrNull != null) {
            return a62Var.contains(longExactOrNull);
        }
        return false;
    }

    @jjf(version = "1.3")
    @t28
    private static final char random(bw1 bw1Var) {
        md8.checkNotNullParameter(bw1Var, "<this>");
        return random(bw1Var, tod.f85517a);
    }

    @jjf(version = "1.4")
    @t28
    private static final Character randomOrNull(bw1 bw1Var) {
        md8.checkNotNullParameter(bw1Var, "<this>");
        return randomOrNull(bw1Var, tod.f85517a);
    }

    @yfb
    public static final zv1 reversed(@yfb zv1 zv1Var) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        return zv1.f106137d.fromClosedRange(zv1Var.getLast(), zv1Var.getFirst(), -zv1Var.getStep());
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "shortRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean shortRangeContains(a62 a62Var, double d) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Short shortExactOrNull = toShortExactOrNull(d);
        if (shortExactOrNull != null) {
            return a62Var.contains(shortExactOrNull);
        }
        return false;
    }

    @yfb
    public static final sl9 step(@yfb sl9 sl9Var, long j) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        jpd.checkStepIsPositive(j > 0, Long.valueOf(j));
        sl9.C12648a c12648a = sl9.f82177d;
        long first = sl9Var.getFirst();
        long last = sl9Var.getLast();
        if (sl9Var.getStep() <= 0) {
            j = -j;
        }
        return c12648a.fromClosedRange(first, last, j);
    }

    @gib
    public static final Byte toByteExactOrNull(short s) {
        if (-128 > s || s >= 128) {
            return null;
        }
        return Byte.valueOf((byte) s);
    }

    @gib
    public static final Integer toIntExactOrNull(float f) {
        if (-2.1474836E9f > f || f > 2.1474836E9f) {
            return null;
        }
        return Integer.valueOf((int) f);
    }

    @gib
    public static final Short toShortExactOrNull(double d) {
        if (-32768.0d > d || d > 32767.0d) {
            return null;
        }
        return Short.valueOf((short) d);
    }

    @yfb
    public static final f78 until(byte b, byte b2) {
        return new f78(b, b2 - 1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb r5c<Byte> r5cVar, int i) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(i);
        if (byteExactOrNull != null) {
            return r5cVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static int coerceAtLeast(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static int coerceAtMost(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    @t28
    private static final boolean contains(f78 f78Var, byte b) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return intRangeContains((a62<Integer>) f78Var, b);
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "doubleRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean doubleRangeContains(a62 a62Var, int i) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Double.valueOf(i));
    }

    @yfb
    public static final d78 downTo(short s, byte b) {
        return d78.f28697d.fromClosedRange(s, b, -1);
    }

    @jjf(version = "1.7")
    public static final long first(@yfb sl9 sl9Var) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        if (!sl9Var.isEmpty()) {
            return sl9Var.getFirst();
        }
        throw new NoSuchElementException("Progression " + sl9Var + " is empty.");
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "floatRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean floatRangeContains(a62 a62Var, long j) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Float.valueOf(j));
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "intRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean intRangeContains(a62 a62Var, float f) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Integer intExactOrNull = toIntExactOrNull(f);
        if (intExactOrNull != null) {
            return a62Var.contains(intExactOrNull);
        }
        return false;
    }

    @jjf(version = "1.7")
    public static final long last(@yfb sl9 sl9Var) {
        md8.checkNotNullParameter(sl9Var, "<this>");
        if (!sl9Var.isEmpty()) {
            return sl9Var.getLast();
        }
        throw new NoSuchElementException("Progression " + sl9Var + " is empty.");
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "longRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean longRangeContains(a62 a62Var, float f) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Long longExactOrNull = toLongExactOrNull(f);
        if (longExactOrNull != null) {
            return a62Var.contains(longExactOrNull);
        }
        return false;
    }

    @jjf(version = "1.3")
    public static final int random(@yfb f78 f78Var, @yfb tod todVar) {
        md8.checkNotNullParameter(f78Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        try {
            return vod.nextInt(todVar, f78Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gib
    @jjf(version = "1.4")
    public static final Integer randomOrNull(@yfb f78 f78Var, @yfb tod todVar) {
        md8.checkNotNullParameter(f78Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (f78Var.isEmpty()) {
            return null;
        }
        return Integer.valueOf(vod.nextInt(todVar, f78Var));
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "shortRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean shortRangeContains(a62 a62Var, float f) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Short shortExactOrNull = toShortExactOrNull(f);
        if (shortExactOrNull != null) {
            return a62Var.contains(shortExactOrNull);
        }
        return false;
    }

    @gib
    public static final Byte toByteExactOrNull(double d) {
        if (-128.0d > d || d > 127.0d) {
            return null;
        }
        return Byte.valueOf((byte) d);
    }

    @gib
    public static final Short toShortExactOrNull(float f) {
        if (-32768.0f > f || f > 32767.0f) {
            return null;
        }
        return Short.valueOf((short) f);
    }

    @yfb
    public static final f78 until(short s, byte b) {
        return new f78(s, b - 1);
    }

    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb a62<Byte> a62Var, long j) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return a62Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static long coerceAtLeast(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static long coerceAtMost(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    @t28
    private static final boolean contains(ul9 ul9Var, byte b) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return longRangeContains((a62<Long>) ul9Var, b);
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "doubleRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean doubleRangeContains(a62 a62Var, long j) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Double.valueOf(j));
    }

    @yfb
    public static final zv1 downTo(char c, char c2) {
        return zv1.f106137d.fromClosedRange(c, c2, -1);
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "floatRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean floatRangeContains(a62 a62Var, short s) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Float.valueOf(s));
    }

    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb a62<Integer> a62Var, long j) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return a62Var.contains(intExactOrNull);
        }
        return false;
    }

    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb a62<Long> a62Var, int i) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Long.valueOf(i));
    }

    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb a62<Short> a62Var, int i) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return a62Var.contains(shortExactOrNull);
        }
        return false;
    }

    @yfb
    public static final zv1 step(@yfb zv1 zv1Var, int i) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        jpd.checkStepIsPositive(i > 0, Integer.valueOf(i));
        zv1.C16261a c16261a = zv1.f106137d;
        char first = zv1Var.getFirst();
        char last = zv1Var.getLast();
        if (zv1Var.getStep() <= 0) {
            i = -i;
        }
        return c16261a.fromClosedRange(first, last, i);
    }

    @gib
    public static final Byte toByteExactOrNull(float f) {
        if (-128.0f > f || f > 127.0f) {
            return null;
        }
        return Byte.valueOf((byte) f);
    }

    @yfb
    public static final bw1 until(char c, char c2) {
        return md8.compare((int) c2, 0) <= 0 ? bw1.f14983e.getEMPTY() : new bw1(c, (char) (c2 - 1));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb r5c<Byte> r5cVar, long j) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(j);
        if (byteExactOrNull != null) {
            return r5cVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static float coerceAtLeast(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static float coerceAtMost(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    @t28
    private static final boolean contains(ul9 ul9Var, int i) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return longRangeContains((a62<Long>) ul9Var, i);
    }

    @t64(errorSince = "1.4", hiddenSince = "1.5", warningSince = "1.3")
    @xn8(name = "doubleRangeContains")
    @q64(message = "This `contains` operation mixing integer and floating point arguments has ambiguous semantics and is going to be removed.")
    public static final /* synthetic */ boolean doubleRangeContains(a62 a62Var, short s) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Double.valueOf(s));
    }

    @yfb
    public static d78 downTo(int i, int i2) {
        return d78.f28697d.fromClosedRange(i, i2, -1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb r5c<Integer> r5cVar, long j) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Integer intExactOrNull = toIntExactOrNull(j);
        if (intExactOrNull != null) {
            return r5cVar.contains(intExactOrNull);
        }
        return false;
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb r5c<Long> r5cVar, int i) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Long.valueOf(i));
    }

    @jjf(version = "1.3")
    public static final long random(@yfb ul9 ul9Var, @yfb tod todVar) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        try {
            return vod.nextLong(todVar, ul9Var);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gib
    @jjf(version = "1.4")
    public static final Long randomOrNull(@yfb ul9 ul9Var, @yfb tod todVar) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (ul9Var.isEmpty()) {
            return null;
        }
        return Long.valueOf(vod.nextLong(todVar, ul9Var));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb r5c<Short> r5cVar, int i) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(i);
        if (shortExactOrNull != null) {
            return r5cVar.contains(shortExactOrNull);
        }
        return false;
    }

    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb a62<Byte> a62Var, short s) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return a62Var.contains(byteExactOrNull);
        }
        return false;
    }

    public static final double coerceAtLeast(double d, double d2) {
        return d < d2 ? d2 : d;
    }

    public static final double coerceAtMost(double d, double d2) {
        return d > d2 ? d2 : d;
    }

    public static final byte coerceIn(byte b, byte b2, byte b3) {
        if (b2 <= b3) {
            return b < b2 ? b2 : b > b3 ? b3 : b;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) b3) + " is less than minimum " + ((int) b2) + a18.f100c);
    }

    @t28
    private static final boolean contains(f78 f78Var, long j) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return intRangeContains((a62<Integer>) f78Var, j);
    }

    @yfb
    public static final sl9 downTo(long j, int i) {
        return sl9.f82177d.fromClosedRange(j, i, -1L);
    }

    @jjf(version = "1.7")
    public static final char first(@yfb zv1 zv1Var) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        if (!zv1Var.isEmpty()) {
            return zv1Var.getFirst();
        }
        throw new NoSuchElementException("Progression " + zv1Var + " is empty.");
    }

    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb a62<Integer> a62Var, short s) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Integer.valueOf(s));
    }

    @jjf(version = "1.7")
    public static final char last(@yfb zv1 zv1Var) {
        md8.checkNotNullParameter(zv1Var, "<this>");
        if (!zv1Var.isEmpty()) {
            return zv1Var.getLast();
        }
        throw new NoSuchElementException("Progression " + zv1Var + " is empty.");
    }

    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb a62<Long> a62Var, short s) {
        md8.checkNotNullParameter(a62Var, "<this>");
        return a62Var.contains(Long.valueOf(s));
    }

    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb a62<Short> a62Var, long j) {
        md8.checkNotNullParameter(a62Var, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return a62Var.contains(shortExactOrNull);
        }
        return false;
    }

    @yfb
    public static f78 until(int i, int i2) {
        if (i2 <= Integer.MIN_VALUE) {
            return f78.f35619e.getEMPTY();
        }
        return new f78(i, i2 - 1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "byteRangeContains")
    public static final boolean byteRangeContains(@yfb r5c<Byte> r5cVar, short s) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Byte byteExactOrNull = toByteExactOrNull(s);
        if (byteExactOrNull != null) {
            return r5cVar.contains(byteExactOrNull);
        }
        return false;
    }

    public static final short coerceIn(short s, short s2, short s3) {
        if (s2 <= s3) {
            return s < s2 ? s2 : s > s3 ? s3 : s;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + ((int) s3) + " is less than minimum " + ((int) s2) + a18.f100c);
    }

    @t28
    private static final boolean contains(f78 f78Var, short s) {
        md8.checkNotNullParameter(f78Var, "<this>");
        return intRangeContains((a62<Integer>) f78Var, s);
    }

    @yfb
    public static final d78 downTo(byte b, int i) {
        return d78.f28697d.fromClosedRange(b, i, -1);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "intRangeContains")
    public static final boolean intRangeContains(@yfb r5c<Integer> r5cVar, short s) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Integer.valueOf(s));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "longRangeContains")
    public static final boolean longRangeContains(@yfb r5c<Long> r5cVar, short s) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        return r5cVar.contains(Long.valueOf(s));
    }

    @jjf(version = "1.3")
    public static final char random(@yfb bw1 bw1Var, @yfb tod todVar) {
        md8.checkNotNullParameter(bw1Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        try {
            return (char) todVar.nextInt(bw1Var.getFirst(), bw1Var.getLast() + 1);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    @gib
    @jjf(version = "1.4")
    public static final Character randomOrNull(@yfb bw1 bw1Var, @yfb tod todVar) {
        md8.checkNotNullParameter(bw1Var, "<this>");
        md8.checkNotNullParameter(todVar, "random");
        if (bw1Var.isEmpty()) {
            return null;
        }
        return Character.valueOf((char) todVar.nextInt(bw1Var.getFirst(), bw1Var.getLast() + 1));
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @xn8(name = "shortRangeContains")
    public static final boolean shortRangeContains(@yfb r5c<Short> r5cVar, long j) {
        md8.checkNotNullParameter(r5cVar, "<this>");
        Short shortExactOrNull = toShortExactOrNull(j);
        if (shortExactOrNull != null) {
            return r5cVar.contains(shortExactOrNull);
        }
        return false;
    }

    public static int coerceIn(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + a18.f100c);
    }

    @t28
    private static final boolean contains(ul9 ul9Var, short s) {
        md8.checkNotNullParameter(ul9Var, "<this>");
        return longRangeContains((a62<Long>) ul9Var, s);
    }

    @yfb
    public static final d78 downTo(short s, int i) {
        return d78.f28697d.fromClosedRange(s, i, -1);
    }

    @yfb
    public static final ul9 until(long j, int i) {
        return new ul9(j, ((long) i) - 1);
    }

    public static long coerceIn(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + a18.f100c);
    }

    @yfb
    public static final sl9 downTo(int i, long j) {
        return sl9.f82177d.fromClosedRange(i, j, -1L);
    }

    @yfb
    public static final f78 until(byte b, int i) {
        if (i <= Integer.MIN_VALUE) {
            return f78.f35619e.getEMPTY();
        }
        return new f78(b, i - 1);
    }

    public static float coerceIn(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + a18.f100c);
    }

    @yfb
    public static final sl9 downTo(long j, long j2) {
        return sl9.f82177d.fromClosedRange(j, j2, -1L);
    }

    public static double coerceIn(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + a18.f100c);
    }

    @yfb
    public static final sl9 downTo(byte b, long j) {
        return sl9.f82177d.fromClosedRange(b, j, -1L);
    }

    @yfb
    public static final f78 until(short s, int i) {
        if (i <= Integer.MIN_VALUE) {
            return f78.f35619e.getEMPTY();
        }
        return new f78(s, i - 1);
    }

    @jjf(version = "1.1")
    @yfb
    public static <T extends Comparable<? super T>> T coerceIn(@yfb T t, @yfb z52<T> z52Var) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(z52Var, "range");
        if (!z52Var.isEmpty()) {
            return (!z52Var.lessThanOrEquals(t, z52Var.getStart()) || z52Var.lessThanOrEquals(z52Var.getStart(), t)) ? (!z52Var.lessThanOrEquals(z52Var.getEndInclusive(), t) || z52Var.lessThanOrEquals(t, z52Var.getEndInclusive())) ? t : z52Var.getEndInclusive() : z52Var.getStart();
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + z52Var + a18.f100c);
    }

    @yfb
    public static final sl9 downTo(short s, long j) {
        return sl9.f82177d.fromClosedRange(s, j, -1L);
    }

    @yfb
    public static final d78 downTo(int i, short s) {
        return d78.f28697d.fromClosedRange(i, s, -1);
    }

    @yfb
    public static final ul9 until(int i, long j) {
        if (j <= Long.MIN_VALUE) {
            return ul9.f88362e.getEMPTY();
        }
        return new ul9(i, j - 1);
    }

    @yfb
    public static final sl9 downTo(long j, short s) {
        return sl9.f82177d.fromClosedRange(j, s, -1L);
    }

    @yfb
    public static final d78 downTo(byte b, short s) {
        return d78.f28697d.fromClosedRange(b, s, -1);
    }

    @yfb
    public static final ul9 until(long j, long j2) {
        if (j2 <= Long.MIN_VALUE) {
            return ul9.f88362e.getEMPTY();
        }
        return new ul9(j, j2 - 1);
    }

    @yfb
    public static final <T extends Comparable<? super T>> T coerceIn(@yfb T t, @yfb a62<T> a62Var) {
        md8.checkNotNullParameter(t, "<this>");
        md8.checkNotNullParameter(a62Var, "range");
        if (a62Var instanceof z52) {
            return (T) coerceIn((Comparable) t, (z52) a62Var);
        }
        if (!a62Var.isEmpty()) {
            return t.compareTo(a62Var.getStart()) < 0 ? (T) a62Var.getStart() : t.compareTo(a62Var.getEndInclusive()) > 0 ? (T) a62Var.getEndInclusive() : t;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + a62Var + a18.f100c);
    }

    @yfb
    public static final d78 downTo(short s, short s2) {
        return d78.f28697d.fromClosedRange(s, s2, -1);
    }

    @yfb
    public static final ul9 until(byte b, long j) {
        if (j <= Long.MIN_VALUE) {
            return ul9.f88362e.getEMPTY();
        }
        return new ul9(b, j - 1);
    }

    @yfb
    public static final ul9 until(short s, long j) {
        if (j <= Long.MIN_VALUE) {
            return ul9.f88362e.getEMPTY();
        }
        return new ul9(s, j - 1);
    }

    @yfb
    public static final f78 until(int i, short s) {
        return new f78(i, s - 1);
    }

    public static int coerceIn(int i, @yfb a62<Integer> a62Var) {
        md8.checkNotNullParameter(a62Var, "range");
        if (a62Var instanceof z52) {
            return ((Number) coerceIn(Integer.valueOf(i), (z52<Integer>) a62Var)).intValue();
        }
        if (!a62Var.isEmpty()) {
            return i < ((Number) a62Var.getStart()).intValue() ? ((Number) a62Var.getStart()).intValue() : i > ((Number) a62Var.getEndInclusive()).intValue() ? ((Number) a62Var.getEndInclusive()).intValue() : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + a62Var + a18.f100c);
    }

    @yfb
    public static final ul9 until(long j, short s) {
        return new ul9(j, ((long) s) - 1);
    }

    @yfb
    public static final f78 until(byte b, short s) {
        return new f78(b, s - 1);
    }

    @yfb
    public static final f78 until(short s, short s2) {
        return new f78(s, s2 - 1);
    }

    public static long coerceIn(long j, @yfb a62<Long> a62Var) {
        md8.checkNotNullParameter(a62Var, "range");
        if (a62Var instanceof z52) {
            return ((Number) coerceIn(Long.valueOf(j), (z52<Long>) a62Var)).longValue();
        }
        if (!a62Var.isEmpty()) {
            return j < ((Number) a62Var.getStart()).longValue() ? ((Number) a62Var.getStart()).longValue() : j > ((Number) a62Var.getEndInclusive()).longValue() ? ((Number) a62Var.getEndInclusive()).longValue() : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: " + a62Var + a18.f100c);
    }
}
