package p000;

import okhttp3.internal.p017ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.5")
@vn8
@ihi(markerClass = {yh5.class})
public final class iqh implements Comparable<iqh> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C7568a f48005b = new C7568a(null);

    /* JADX INFO: renamed from: c */
    public static final short f48006c = 0;

    /* JADX INFO: renamed from: d */
    public static final short f48007d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f48008e = 2;

    /* JADX INFO: renamed from: f */
    public static final int f48009f = 16;

    /* JADX INFO: renamed from: a */
    public final short f48010a;

    /* JADX INFO: renamed from: iqh$a */
    public static final class C7568a {
        public /* synthetic */ C7568a(jt3 jt3Var) {
            this();
        }

        private C7568a() {
        }
    }

    @cd8
    @yjd
    private /* synthetic */ iqh(short s) {
        this.f48010a = s;
    }

    @t28
    /* JADX INFO: renamed from: and-xj2QHRw, reason: not valid java name */
    private static final short m30317andxj2QHRw(short s, short s2) {
        return m30324constructorimpl((short) (s & s2));
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ iqh m30318boximpl(short s) {
        return new iqh(s);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m30319compareTo7apg3OU(short s, byte b) {
        return md8.compare(s & f48007d, b & 255);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static final int m30320compareToVKZWuLQ(short s, long j) {
        return Long.compareUnsigned(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m30321compareToWZ4Q5Ns(short s, int i) {
        return Integer.compareUnsigned(woh.m33004constructorimpl(s & f48007d), i);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private int m30322compareToxj2QHRw(short s) {
        return md8.compare(m30374unboximpl() & f48007d, s & f48007d);
    }

    @cd8
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static short m30324constructorimpl(short s) {
        return s;
    }

    @t28
    /* JADX INFO: renamed from: dec-Mh2AYeg, reason: not valid java name */
    private static final short m30325decMh2AYeg(short s) {
        return m30324constructorimpl((short) (s - 1));
    }

    @t28
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final int m30326div7apg3OU(short s, byte b) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m30327divVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @t28
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final int m30328divWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), i);
    }

    @t28
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final int m30329divxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m30330equalsimpl(short s, Object obj) {
        return (obj instanceof iqh) && s == ((iqh) obj).m30374unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m30331equalsimpl0(short s, short s2) {
        return s == s2;
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final int m30332floorDiv7apg3OU(short s, byte b) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m30333floorDivVKZWuLQ(short s, long j) {
        return Long.divideUnsigned(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final int m30334floorDivWZ4Q5Ns(short s, int i) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), i);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final int m30335floorDivxj2QHRw(short s, short s2) {
        return Integer.divideUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d));
    }

    @yjd
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m30336hashCodeimpl(short s) {
        return Short.hashCode(s);
    }

    @t28
    /* JADX INFO: renamed from: inc-Mh2AYeg, reason: not valid java name */
    private static final short m30337incMh2AYeg(short s) {
        return m30324constructorimpl((short) (s + 1));
    }

    @t28
    /* JADX INFO: renamed from: inv-Mh2AYeg, reason: not valid java name */
    private static final short m30338invMh2AYeg(short s) {
        return m30324constructorimpl((short) (~s));
    }

    @t28
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final int m30339minus7apg3OU(short s, byte b) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) - woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m30340minusVKZWuLQ(short s, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) - j);
    }

    @t28
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final int m30341minusWZ4Q5Ns(short s, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) - i);
    }

    @t28
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final int m30342minusxj2QHRw(short s, short s2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) - woh.m33004constructorimpl(s2 & f48007d));
    }

    @t28
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m30343mod7apg3OU(short s, byte b) {
        return goh.m29786constructorimpl((byte) Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(b & 255)));
    }

    @t28
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m30344modVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @t28
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m30345modWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), i);
    }

    @t28
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m30346modxj2QHRw(short s, short s2) {
        return m30324constructorimpl((short) Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d)));
    }

    @t28
    /* JADX INFO: renamed from: or-xj2QHRw, reason: not valid java name */
    private static final short m30347orxj2QHRw(short s, short s2) {
        return m30324constructorimpl((short) (s | s2));
    }

    @t28
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final int m30348plus7apg3OU(short s, byte b) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) + woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m30349plusVKZWuLQ(short s, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) + j);
    }

    @t28
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final int m30350plusWZ4Q5Ns(short s, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) + i);
    }

    @t28
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final int m30351plusxj2QHRw(short s, short s2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) + woh.m33004constructorimpl(s2 & f48007d));
    }

    @t28
    /* JADX INFO: renamed from: rangeTo-xj2QHRw, reason: not valid java name */
    private static final mph m30352rangeToxj2QHRw(short s, short s2) {
        return new mph(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d), null);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: rangeUntil-xj2QHRw, reason: not valid java name */
    private static final mph m30353rangeUntilxj2QHRw(short s, short s2) {
        return fqh.m29637untilJ1ME1BU(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d));
    }

    @t28
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final int m30354rem7apg3OU(short s, byte b) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m30355remVKZWuLQ(short s, long j) {
        return Long.remainderUnsigned(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX), j);
    }

    @t28
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final int m30356remWZ4Q5Ns(short s, int i) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), i);
    }

    @t28
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final int m30357remxj2QHRw(short s, short s2) {
        return Integer.remainderUnsigned(woh.m33004constructorimpl(s & f48007d), woh.m33004constructorimpl(s2 & f48007d));
    }

    @t28
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final int m30358times7apg3OU(short s, byte b) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) * woh.m33004constructorimpl(b & 255));
    }

    @t28
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m30359timesVKZWuLQ(short s, long j) {
        return oph.m31533constructorimpl(oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX) * j);
    }

    @t28
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final int m30360timesWZ4Q5Ns(short s, int i) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) * i);
    }

    @t28
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final int m30361timesxj2QHRw(short s, short s2) {
        return woh.m33004constructorimpl(woh.m33004constructorimpl(s & f48007d) * woh.m33004constructorimpl(s2 & f48007d));
    }

    @t28
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m30362toByteimpl(short s) {
        return (byte) s;
    }

    @t28
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m30363toDoubleimpl(short s) {
        return kvh.uintToDouble(s & f48007d);
    }

    @t28
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m30364toFloatimpl(short s) {
        return (float) kvh.uintToDouble(s & f48007d);
    }

    @t28
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m30365toIntimpl(short s) {
        return s & f48007d;
    }

    @t28
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m30366toLongimpl(short s) {
        return ((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX;
    }

    @t28
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m30367toShortimpl(short s) {
        return s;
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m30368toStringimpl(short s) {
        return String.valueOf(s & f48007d);
    }

    @t28
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m30369toUBytew2LRezQ(short s) {
        return goh.m29786constructorimpl((byte) s);
    }

    @t28
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m30370toUIntpVg5ArA(short s) {
        return woh.m33004constructorimpl(s & f48007d);
    }

    @t28
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m30371toULongsVKNKU(short s) {
        return oph.m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX);
    }

    @t28
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m30372toUShortMh2AYeg(short s) {
        return s;
    }

    @t28
    /* JADX INFO: renamed from: xor-xj2QHRw, reason: not valid java name */
    private static final short m30373xorxj2QHRw(short s, short s2) {
        return m30324constructorimpl((short) (s ^ s2));
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(iqh iqhVar) {
        return md8.compare(m30374unboximpl() & f48007d, iqhVar.m30374unboximpl() & f48007d);
    }

    public boolean equals(Object obj) {
        return m30330equalsimpl(this.f48010a, obj);
    }

    public int hashCode() {
        return m30336hashCodeimpl(this.f48010a);
    }

    @yfb
    public String toString() {
        return m30368toStringimpl(this.f48010a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ short m30374unboximpl() {
        return this.f48010a;
    }

    @t28
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static int m30323compareToxj2QHRw(short s, short s2) {
        return md8.compare(s & f48007d, s2 & f48007d);
    }
}
