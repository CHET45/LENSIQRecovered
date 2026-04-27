package p000;

import okhttp3.internal.p017ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes7.dex */
@jjf(version = "1.5")
@vn8
@ihi(markerClass = {yh5.class})
public final class oph implements Comparable<oph> {

    /* JADX INFO: renamed from: b */
    @yfb
    public static final C10496a f68284b = new C10496a(null);

    /* JADX INFO: renamed from: c */
    public static final long f68285c = 0;

    /* JADX INFO: renamed from: d */
    public static final long f68286d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f68287e = 8;

    /* JADX INFO: renamed from: f */
    public static final int f68288f = 64;

    /* JADX INFO: renamed from: a */
    public final long f68289a;

    /* JADX INFO: renamed from: oph$a */
    public static final class C10496a {
        public /* synthetic */ C10496a(jt3 jt3Var) {
            this();
        }

        private C10496a() {
        }
    }

    @cd8
    @yjd
    private /* synthetic */ oph(long j) {
        this.f68289a = j;
    }

    @t28
    /* JADX INFO: renamed from: and-VKZWuLQ, reason: not valid java name */
    private static final long m31526andVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j & j2);
    }

    /* JADX INFO: renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ oph m31527boximpl(long j) {
        return new oph(j);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-7apg3OU, reason: not valid java name */
    private static final int m31528compareTo7apg3OU(long j, byte b) {
        return Long.compareUnsigned(j, m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private int m31529compareToVKZWuLQ(long j) {
        return kvh.ulongCompare(m31585unboximpl(), j);
    }

    @t28
    /* JADX INFO: renamed from: compareTo-WZ4Q5Ns, reason: not valid java name */
    private static final int m31531compareToWZ4Q5Ns(long j, int i) {
        return Long.compareUnsigned(j, m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: compareTo-xj2QHRw, reason: not valid java name */
    private static final int m31532compareToxj2QHRw(long j, short s) {
        return Long.compareUnsigned(j, m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @cd8
    @yjd
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static long m31533constructorimpl(long j) {
        return j;
    }

    @t28
    /* JADX INFO: renamed from: dec-s-VKNKU, reason: not valid java name */
    private static final long m31534decsVKNKU(long j) {
        return m31533constructorimpl(j - 1);
    }

    @t28
    /* JADX INFO: renamed from: div-7apg3OU, reason: not valid java name */
    private static final long m31535div7apg3OU(long j, byte b) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: div-VKZWuLQ, reason: not valid java name */
    private static final long m31536divVKZWuLQ(long j, long j2) {
        return kvh.m30782ulongDivideeb3DHEI(j, j2);
    }

    @t28
    /* JADX INFO: renamed from: div-WZ4Q5Ns, reason: not valid java name */
    private static final long m31537divWZ4Q5Ns(long j, int i) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: div-xj2QHRw, reason: not valid java name */
    private static final long m31538divxj2QHRw(long j, short s) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
    public static boolean m31539equalsimpl(long j, Object obj) {
        return (obj instanceof oph) && j == ((oph) obj).m31585unboximpl();
    }

    /* JADX INFO: renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m31540equalsimpl0(long j, long j2) {
        return j == j2;
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-7apg3OU, reason: not valid java name */
    private static final long m31541floorDiv7apg3OU(long j, byte b) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-VKZWuLQ, reason: not valid java name */
    private static final long m31542floorDivVKZWuLQ(long j, long j2) {
        return Long.divideUnsigned(j, j2);
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-WZ4Q5Ns, reason: not valid java name */
    private static final long m31543floorDivWZ4Q5Ns(long j, int i) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: floorDiv-xj2QHRw, reason: not valid java name */
    private static final long m31544floorDivxj2QHRw(long j, short s) {
        return Long.divideUnsigned(j, m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @yjd
    public static /* synthetic */ void getData$annotations() {
    }

    /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
    public static int m31545hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    @t28
    /* JADX INFO: renamed from: inc-s-VKNKU, reason: not valid java name */
    private static final long m31546incsVKNKU(long j) {
        return m31533constructorimpl(j + 1);
    }

    @t28
    /* JADX INFO: renamed from: inv-s-VKNKU, reason: not valid java name */
    private static final long m31547invsVKNKU(long j) {
        return m31533constructorimpl(~j);
    }

    @t28
    /* JADX INFO: renamed from: minus-7apg3OU, reason: not valid java name */
    private static final long m31548minus7apg3OU(long j, byte b) {
        return m31533constructorimpl(j - m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: minus-VKZWuLQ, reason: not valid java name */
    private static final long m31549minusVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j - j2);
    }

    @t28
    /* JADX INFO: renamed from: minus-WZ4Q5Ns, reason: not valid java name */
    private static final long m31550minusWZ4Q5Ns(long j, int i) {
        return m31533constructorimpl(j - m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: minus-xj2QHRw, reason: not valid java name */
    private static final long m31551minusxj2QHRw(long j, short s) {
        return m31533constructorimpl(j - m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @t28
    /* JADX INFO: renamed from: mod-7apg3OU, reason: not valid java name */
    private static final byte m31552mod7apg3OU(long j, byte b) {
        return goh.m29786constructorimpl((byte) Long.remainderUnsigned(j, m31533constructorimpl(((long) b) & 255)));
    }

    @t28
    /* JADX INFO: renamed from: mod-VKZWuLQ, reason: not valid java name */
    private static final long m31553modVKZWuLQ(long j, long j2) {
        return Long.remainderUnsigned(j, j2);
    }

    @t28
    /* JADX INFO: renamed from: mod-WZ4Q5Ns, reason: not valid java name */
    private static final int m31554modWZ4Q5Ns(long j, int i) {
        return woh.m33004constructorimpl((int) Long.remainderUnsigned(j, m31533constructorimpl(((long) i) & 4294967295L)));
    }

    @t28
    /* JADX INFO: renamed from: mod-xj2QHRw, reason: not valid java name */
    private static final short m31555modxj2QHRw(long j, short s) {
        return iqh.m30324constructorimpl((short) Long.remainderUnsigned(j, m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX)));
    }

    @t28
    /* JADX INFO: renamed from: or-VKZWuLQ, reason: not valid java name */
    private static final long m31556orVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j | j2);
    }

    @t28
    /* JADX INFO: renamed from: plus-7apg3OU, reason: not valid java name */
    private static final long m31557plus7apg3OU(long j, byte b) {
        return m31533constructorimpl(j + m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: plus-VKZWuLQ, reason: not valid java name */
    private static final long m31558plusVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j + j2);
    }

    @t28
    /* JADX INFO: renamed from: plus-WZ4Q5Ns, reason: not valid java name */
    private static final long m31559plusWZ4Q5Ns(long j, int i) {
        return m31533constructorimpl(j + m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: plus-xj2QHRw, reason: not valid java name */
    private static final long m31560plusxj2QHRw(long j, short s) {
        return m31533constructorimpl(j + m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @t28
    /* JADX INFO: renamed from: rangeTo-VKZWuLQ, reason: not valid java name */
    private static final wph m31561rangeToVKZWuLQ(long j, long j2) {
        return new wph(j, j2, null);
    }

    @ihi(markerClass = {rh5.class})
    @jjf(version = "1.9")
    @t28
    /* JADX INFO: renamed from: rangeUntil-VKZWuLQ, reason: not valid java name */
    private static final wph m31562rangeUntilVKZWuLQ(long j, long j2) {
        return fqh.m29639untileb3DHEI(j, j2);
    }

    @t28
    /* JADX INFO: renamed from: rem-7apg3OU, reason: not valid java name */
    private static final long m31563rem7apg3OU(long j, byte b) {
        return Long.remainderUnsigned(j, m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: rem-VKZWuLQ, reason: not valid java name */
    private static final long m31564remVKZWuLQ(long j, long j2) {
        return kvh.m30783ulongRemaindereb3DHEI(j, j2);
    }

    @t28
    /* JADX INFO: renamed from: rem-WZ4Q5Ns, reason: not valid java name */
    private static final long m31565remWZ4Q5Ns(long j, int i) {
        return Long.remainderUnsigned(j, m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: rem-xj2QHRw, reason: not valid java name */
    private static final long m31566remxj2QHRw(long j, short s) {
        return Long.remainderUnsigned(j, m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @t28
    /* JADX INFO: renamed from: shl-s-VKNKU, reason: not valid java name */
    private static final long m31567shlsVKNKU(long j, int i) {
        return m31533constructorimpl(j << i);
    }

    @t28
    /* JADX INFO: renamed from: shr-s-VKNKU, reason: not valid java name */
    private static final long m31568shrsVKNKU(long j, int i) {
        return m31533constructorimpl(j >>> i);
    }

    @t28
    /* JADX INFO: renamed from: times-7apg3OU, reason: not valid java name */
    private static final long m31569times7apg3OU(long j, byte b) {
        return m31533constructorimpl(j * m31533constructorimpl(((long) b) & 255));
    }

    @t28
    /* JADX INFO: renamed from: times-VKZWuLQ, reason: not valid java name */
    private static final long m31570timesVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j * j2);
    }

    @t28
    /* JADX INFO: renamed from: times-WZ4Q5Ns, reason: not valid java name */
    private static final long m31571timesWZ4Q5Ns(long j, int i) {
        return m31533constructorimpl(j * m31533constructorimpl(((long) i) & 4294967295L));
    }

    @t28
    /* JADX INFO: renamed from: times-xj2QHRw, reason: not valid java name */
    private static final long m31572timesxj2QHRw(long j, short s) {
        return m31533constructorimpl(j * m31533constructorimpl(((long) s) & WebSocketProtocol.PAYLOAD_SHORT_MAX));
    }

    @t28
    /* JADX INFO: renamed from: toByte-impl, reason: not valid java name */
    private static final byte m31573toByteimpl(long j) {
        return (byte) j;
    }

    @t28
    /* JADX INFO: renamed from: toDouble-impl, reason: not valid java name */
    private static final double m31574toDoubleimpl(long j) {
        return kvh.ulongToDouble(j);
    }

    @t28
    /* JADX INFO: renamed from: toFloat-impl, reason: not valid java name */
    private static final float m31575toFloatimpl(long j) {
        return (float) kvh.ulongToDouble(j);
    }

    @t28
    /* JADX INFO: renamed from: toInt-impl, reason: not valid java name */
    private static final int m31576toIntimpl(long j) {
        return (int) j;
    }

    @t28
    /* JADX INFO: renamed from: toLong-impl, reason: not valid java name */
    private static final long m31577toLongimpl(long j) {
        return j;
    }

    @t28
    /* JADX INFO: renamed from: toShort-impl, reason: not valid java name */
    private static final short m31578toShortimpl(long j) {
        return (short) j;
    }

    @yfb
    /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
    public static String m31579toStringimpl(long j) {
        return kvh.ulongToString(j, 10);
    }

    @t28
    /* JADX INFO: renamed from: toUByte-w2LRezQ, reason: not valid java name */
    private static final byte m31580toUBytew2LRezQ(long j) {
        return goh.m29786constructorimpl((byte) j);
    }

    @t28
    /* JADX INFO: renamed from: toUInt-pVg5ArA, reason: not valid java name */
    private static final int m31581toUIntpVg5ArA(long j) {
        return woh.m33004constructorimpl((int) j);
    }

    @t28
    /* JADX INFO: renamed from: toULong-s-VKNKU, reason: not valid java name */
    private static final long m31582toULongsVKNKU(long j) {
        return j;
    }

    @t28
    /* JADX INFO: renamed from: toUShort-Mh2AYeg, reason: not valid java name */
    private static final short m31583toUShortMh2AYeg(long j) {
        return iqh.m30324constructorimpl((short) j);
    }

    @t28
    /* JADX INFO: renamed from: xor-VKZWuLQ, reason: not valid java name */
    private static final long m31584xorVKZWuLQ(long j, long j2) {
        return m31533constructorimpl(j ^ j2);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(oph ophVar) {
        return kvh.ulongCompare(m31585unboximpl(), ophVar.m31585unboximpl());
    }

    public boolean equals(Object obj) {
        return m31539equalsimpl(this.f68289a, obj);
    }

    public int hashCode() {
        return m31545hashCodeimpl(this.f68289a);
    }

    @yfb
    public String toString() {
        return m31579toStringimpl(this.f68289a);
    }

    /* JADX INFO: renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ long m31585unboximpl() {
        return this.f68289a;
    }

    @t28
    /* JADX INFO: renamed from: compareTo-VKZWuLQ, reason: not valid java name */
    private static int m31530compareToVKZWuLQ(long j, long j2) {
        return kvh.ulongCompare(j, j2);
    }
}
