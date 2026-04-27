package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.5")
@vn8
@ihi(markerClass = {yh5.class})
public final class woh implements Comparable<woh> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C14731a f94997b = new C14731a(null);

    /* JADX INFO: renamed from: c */
    public static final int f94998c = 0;

    /* JADX INFO: renamed from: d */
    public static final int f94999d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f95000e = 4;

    /* JADX INFO: renamed from: f */
    public static final int f95001f = 32;

    /* JADX INFO: renamed from: a */
    public final int f95002a;

    /* JADX INFO: renamed from: woh$a */
    public static final class C14731a {
        public /* synthetic */ C14731a(jt3 jt3Var) {
            this();
        }

        private C14731a() {
        }
    }

    @cd8
    @yjd
    private /* synthetic */ woh(int i) {
        this.f95002a = i;
    }

    @t28
    /* JADX INFO: renamed from: and-WZ4Q5Ns, reason: not valid java name */
    private static final int m32997andWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i & i2);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ woh m32998boximpl(int i) {
        return new woh(i);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m32999compareTo7apg3OU(int i, byte b) {
        return Integer.compareUnsigned(i, m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m33000compareToVKZWuLQ(int i, long j) {
        return Long.compareUnsigned(oph.m31533constructorimpl(((long) i) & 4294967295L), j);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private int m33001compareToWZ4Q5Ns(int i) {
        return kvh.uintCompare(m33056unboximpl(), i);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m33003compareToxj2QHRw(int i, short s) {
        return Integer.compareUnsigned(i, m33004constructorimpl(s & iqh.f48007d));
    }

    @cd8
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static int m33004constructorimpl(int i) {
        return i;
    }

    @t28
    /* JADX INFO: renamed from: dec-pVg5ArA, reason: not valid java name */
    private static final int m33005decpVg5ArA(int i) {
        return m33004constructorimpl(i - 1);
    }

    @t28
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m33006div7apg3OU(int i, byte b) {
        return Integer.divideUnsigned(i, m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m33007divVKZWuLQ(int i, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) i) & 4294967295L), j);
    }

    @t28
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m33008divWZ4Q5Ns(int i, int i2) {
        return kvh.m30780uintDivideJ1ME1BU(i, i2);
    }

    @t28
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m33009divxj2QHRw(int i, short s) {
        return Integer.divideUnsigned(i, m33004constructorimpl(s & iqh.f48007d));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m33010equalsimpl(int i, Object obj) {
        return (obj instanceof woh) && i == ((woh) obj).m33056unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m33011equalsimpl0(int i, int i2) {
        return i == i2;
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m33012floorDiv7apg3OU(int i, byte b) {
        return Integer.divideUnsigned(i, m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m33013floorDivVKZWuLQ(int i, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) i) & 4294967295L), j);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m33014floorDivWZ4Q5Ns(int i, int i2) {
        return Integer.divideUnsigned(i, i2);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m33015floorDivxj2QHRw(int i, short s) {
        return Integer.divideUnsigned(i, m33004constructorimpl(s & iqh.f48007d));
    }

    @yjd
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m33016hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    @t28
    /* JADX INFO: renamed from: inc-pVg5ArA, reason: not valid java name */
    private static final int m33017incpVg5ArA(int i) {
        return m33004constructorimpl(i + 1);
    }

    @t28
    /* JADX INFO: renamed from: inv-pVg5ArA, reason: not valid java name */
    private static final int m33018invpVg5ArA(int i) {
        return m33004constructorimpl(~i);
    }

    @t28
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m33019minus7apg3OU(int i, byte b) {
        return m33004constructorimpl(i - m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m33020minusVKZWuLQ(int i, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) i) & 4294967295L) - j);
    }

    @t28
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m33021minusWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i - i2);
    }

    @t28
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m33022minusxj2QHRw(int i, short s) {
        return m33004constructorimpl(i - m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m33023mod7apg3OU(int i, byte b) {
        return goh.m29786constructorimpl((byte) Integer.remainderUnsigned(i, m33004constructorimpl(b & 255)));
    }

    @t28
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m33024modVKZWuLQ(int i, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) i) & 4294967295L), j);
    }

    @t28
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m33025modWZ4Q5Ns(int i, int i2) {
        return Integer.remainderUnsigned(i, i2);
    }

    @t28
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m33026modxj2QHRw(int i, short s) {
        return iqh.m30324constructorimpl((short) Integer.remainderUnsigned(i, m33004constructorimpl(s & iqh.f48007d)));
    }

    @t28
    /* JADX INFO: renamed from: or-WZ4Q5Ns, reason: not valid java name */
    private static final int m33027orWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i | i2);
    }

    @t28
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m33028plus7apg3OU(int i, byte b) {
        return m33004constructorimpl(i + m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m33029plusVKZWuLQ(int i, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) i) & 4294967295L) + j);
    }

    @t28
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m33030plusWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i + i2);
    }

    @t28
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m33031plusxj2QHRw(int i, short s) {
        return m33004constructorimpl(i + m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: rangeTo-WZ4Q5Ns, reason: not valid java name */
    private static final mph m33032rangeToWZ4Q5Ns(int i, int i2) {
        return new mph(i, i2, null);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: rangeUntil-WZ4Q5Ns, reason: not valid java name */
    private static final mph m33033rangeUntilWZ4Q5Ns(int i, int i2) {
        return fqh.m29637untilJ1ME1BU(i, i2);
    }

    @t28
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m33034rem7apg3OU(int i, byte b) {
        return Integer.remainderUnsigned(i, m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m33035remVKZWuLQ(int i, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) i) & 4294967295L), j);
    }

    @t28
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m33036remWZ4Q5Ns(int i, int i2) {
        return kvh.m30781uintRemainderJ1ME1BU(i, i2);
    }

    @t28
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m33037remxj2QHRw(int i, short s) {
        return Integer.remainderUnsigned(i, m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: shl-pVg5ArA, reason: not valid java name */
    private static final int m33038shlpVg5ArA(int i, int i2) {
        return m33004constructorimpl(i << i2);
    }

    @t28
    /* JADX INFO: renamed from: shr-pVg5ArA, reason: not valid java name */
    private static final int m33039shrpVg5ArA(int i, int i2) {
        return m33004constructorimpl(i >>> i2);
    }

    @t28
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m33040times7apg3OU(int i, byte b) {
        return m33004constructorimpl(i * m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m33041timesVKZWuLQ(int i, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) i) & 4294967295L) * j);
    }

    @t28
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m33042timesWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i * i2);
    }

    @t28
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m33043timesxj2QHRw(int i, short s) {
        return m33004constructorimpl(i * m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m33044toByteimpl(int i) {
        return (byte) i;
    }

    @t28
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m33045toDoubleimpl(int i) {
        return kvh.uintToDouble(i);
    }

    @t28
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m33046toFloatimpl(int i) {
        return (float) kvh.uintToDouble(i);
    }

    @t28
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m33047toIntimpl(int i) {
        return i;
    }

    @t28
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m33048toLongimpl(int i) {
        return ((long) i) & 4294967295L;
    }

    @t28
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m33049toShortimpl(int i) {
        return (short) i;
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m33050toStringimpl(int i) {
        return String.valueOf(((long) i) & 4294967295L);
    }

    @t28
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m33051toUBytew2LRezQ(int i) {
        return goh.m29786constructorimpl((byte) i);
    }

    @t28
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m33052toUIntpVg5ArA(int i) {
        return i;
    }

    @t28
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m33053toULongsVKNKU(int i) {
        return oph.m31533constructorimpl(((long) i) & 4294967295L);
    }

    @t28
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m33054toUShortMh2AYeg(int i) {
        return iqh.m30324constructorimpl((short) i);
    }

    @t28
    /* JADX INFO: renamed from: xor-WZ4Q5Ns, reason: not valid java name */
    private static final int m33055xorWZ4Q5Ns(int i, int i2) {
        return m33004constructorimpl(i ^ i2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(woh wohVar) {
        return kvh.uintCompare(m33056unboximpl(), wohVar.m33056unboximpl());
    }

    public boolean equals(Object obj) {
        return m33010equalsimpl(this.f95002a, obj);
    }

    public int hashCode() {
        return m33016hashCodeimpl(this.f95002a);
    }

    @yfb
    public String toString() {
        return m33050toStringimpl(this.f95002a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m33056unboximpl() {
        return this.f95002a;
    }

    @t28
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static int m33002compareToWZ4Q5Ns(int i, int i2) {
        return kvh.uintCompare(i, i2);
    }
}
