package p000;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.5")
@vn8
@ihi(markerClass = {yh5.class})
public final class goh implements Comparable<goh> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C6451a f40684b = new C6451a(null);

    /* JADX INFO: renamed from: c */
    public static final byte f40685c = 0;

    /* JADX INFO: renamed from: d */
    public static final byte f40686d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f40687e = 1;

    /* JADX INFO: renamed from: f */
    public static final int f40688f = 8;

    /* JADX INFO: renamed from: a */
    public final byte f40689a;

    /* JADX INFO: renamed from: goh$a */
    public static final class C6451a {
        public /* synthetic */ C6451a(jt3 jt3Var) {
            this();
        }

        private C6451a() {
        }
    }

    @cd8
    @yjd
    private /* synthetic */ goh(byte b) {
        this.f40689a = b;
    }

    @t28
    /* JADX INFO: renamed from: and-7apg3OU, reason: not valid java name */
    private static final byte m29779and7apg3OU(byte b, byte b2) {
        return m29786constructorimpl((byte) (b & b2));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ goh m29780boximpl(byte b) {
        return new goh(b);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private int m29781compareTo7apg3OU(byte b) {
        return md8.compare(m29836unboximpl() & 255, b & 255);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m29783compareToVKZWuLQ(byte b, long j) {
        return Long.compareUnsigned(oph.m31533constructorimpl(((long) b) & 255), j);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m29784compareToWZ4Q5Ns(byte b, int i) {
        return Integer.compareUnsigned(woh.m33004constructorimpl(b & 255), i);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m29785compareToxj2QHRw(byte b, short s) {
        return md8.compare(b & 255, s & iqh.f48007d);
    }

    @cd8
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static byte m29786constructorimpl(byte b) {
        return b;
    }

    @t28
    /* JADX INFO: renamed from: dec-w2LRezQ, reason: not valid java name */
    private static final byte m29787decw2LRezQ(byte b) {
        return m29786constructorimpl((byte) (b - 1));
    }

    @t28
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m29788div7apg3OU(byte b, byte b2) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m29789divVKZWuLQ(byte b, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) b) & 255), j);
    }

    @t28
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m29790divWZ4Q5Ns(byte b, int i) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), i);
    }

    @t28
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m29791divxj2QHRw(byte b, short s) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(s & iqh.f48007d));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m29792equalsimpl(byte b, Object obj) {
        return (obj instanceof goh) && b == ((goh) obj).m29836unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m29793equalsimpl0(byte b, byte b2) {
        return b == b2;
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m29794floorDiv7apg3OU(byte b, byte b2) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m29795floorDivVKZWuLQ(byte b, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) b) & 255), j);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m29796floorDivWZ4Q5Ns(byte b, int i) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), i);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m29797floorDivxj2QHRw(byte b, short s) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @yjd
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m29798hashCodeimpl(byte b) {
        return Byte.hashCode(b);
    }

    @t28
    /* JADX INFO: renamed from: inc-w2LRezQ, reason: not valid java name */
    private static final byte m29799incw2LRezQ(byte b) {
        return m29786constructorimpl((byte) (b + 1));
    }

    @t28
    /* JADX INFO: renamed from: inv-w2LRezQ, reason: not valid java name */
    private static final byte m29800invw2LRezQ(byte b) {
        return m29786constructorimpl((byte) (~b));
    }

    @t28
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m29801minus7apg3OU(byte b, byte b2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) - woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m29802minusVKZWuLQ(byte b, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) b) & 255) - j);
    }

    @t28
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m29803minusWZ4Q5Ns(byte b, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) - i);
    }

    @t28
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m29804minusxj2QHRw(byte b, short s) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) - woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m29805mod7apg3OU(byte b, byte b2) {
        return m29786constructorimpl((byte) Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255)));
    }

    @t28
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m29806modVKZWuLQ(byte b, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) b) & 255), j);
    }

    @t28
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m29807modWZ4Q5Ns(byte b, int i) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), i);
    }

    @t28
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m29808modxj2QHRw(byte b, short s) {
        return iqh.m30324constructorimpl((short) Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(s & iqh.f48007d)));
    }

    @t28
    /* JADX INFO: renamed from: or-7apg3OU, reason: not valid java name */
    private static final byte m29809or7apg3OU(byte b, byte b2) {
        return m29786constructorimpl((byte) (b | b2));
    }

    @t28
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m29810plus7apg3OU(byte b, byte b2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) + woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m29811plusVKZWuLQ(byte b, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) b) & 255) + j);
    }

    @t28
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m29812plusWZ4Q5Ns(byte b, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) + i);
    }

    @t28
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m29813plusxj2QHRw(byte b, short s) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) + woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: rangeTo-7apg3OU, reason: not valid java name */
    private static final mph m29814rangeTo7apg3OU(byte b, byte b2) {
        return new mph(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255), null);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: rangeUntil-7apg3OU, reason: not valid java name */
    private static final mph m29815rangeUntil7apg3OU(byte b, byte b2) {
        return fqh.m29637untilJ1ME1BU(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m29816rem7apg3OU(byte b, byte b2) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m29817remVKZWuLQ(byte b, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) b) & 255), j);
    }

    @t28
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m29818remWZ4Q5Ns(byte b, int i) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), i);
    }

    @t28
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m29819remxj2QHRw(byte b, short s) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(b & 255), woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m29820times7apg3OU(byte b, byte b2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) * woh.m33004constructorimpl(b2 & 255));
    }

    @t28
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m29821timesVKZWuLQ(byte b, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) b) & 255) * j);
    }

    @t28
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m29822timesWZ4Q5Ns(byte b, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) * i);
    }

    @t28
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m29823timesxj2QHRw(byte b, short s) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(b & 255) * woh.m33004constructorimpl(s & iqh.f48007d));
    }

    @t28
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m29824toByteimpl(byte b) {
        return b;
    }

    @t28
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m29825toDoubleimpl(byte b) {
        return kvh.uintToDouble(b & 255);
    }

    @t28
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m29826toFloatimpl(byte b) {
        return (float) kvh.uintToDouble(b & 255);
    }

    @t28
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m29827toIntimpl(byte b) {
        return b & 255;
    }

    @t28
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m29828toLongimpl(byte b) {
        return ((long) b) & 255;
    }

    @t28
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m29829toShortimpl(byte b) {
        return (short) (b & 255);
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m29830toStringimpl(byte b) {
        return String.valueOf(b & 255);
    }

    @t28
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m29831toUBytew2LRezQ(byte b) {
        return b;
    }

    @t28
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m29832toUIntpVg5ArA(byte b) {
        return woh.m33004constructorimpl(b & 255);
    }

    @t28
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m29833toULongsVKNKU(byte b) {
        return oph.m31533constructorimpl(((long) b) & 255);
    }

    @t28
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m29834toUShortMh2AYeg(byte b) {
        return iqh.m30324constructorimpl((short) (b & 255));
    }

    @t28
    /* JADX INFO: renamed from: xor-7apg3OU, reason: not valid java name */
    private static final byte m29835xor7apg3OU(byte b, byte b2) {
        return m29786constructorimpl((byte) (b ^ b2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(goh gohVar) {
        return md8.compare(m29836unboximpl() & 255, gohVar.m29836unboximpl() & 255);
    }

    public boolean equals(Object obj) {
        return m29792equalsimpl(this.f40689a, obj);
    }

    public int hashCode() {
        return m29798hashCodeimpl(this.f40689a);
    }

    @yfb
    public String toString() {
        return m29830toStringimpl(this.f40689a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ byte m29836unboximpl() {
        return this.f40689a;
    }

    @t28
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static int m29782compareTo7apg3OU(byte b, byte b2) {
        return md8.compare(b & 255, b2 & 255);
    }
}
