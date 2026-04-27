package p000;

/* JADX INFO: loaded from: classes7.dex */
public class qoh {
    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m31960maxOf5PvTz6A(short s, short s2) {
        return md8.compare(s & iqh.f48007d, 65535 & s2) >= 0 ? s : s2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static int m31961maxOfJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) >= 0 ? i : i2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m31962maxOfKr8caGY(byte b, byte b2) {
        return md8.compare(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m31963maxOfMd2H83M(int i, @yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "other");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i2 = 0; i2 < iM29591getSizeimpl; i2++) {
            i = m31961maxOfJ1ME1BU(i, fph.m29590getpVg5ArA(iArr, i2));
        }
        return i;
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m31964maxOfR03FKyM(long j, @yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "other");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            j = m31969maxOfeb3DHEI(j, pph.m31843getsVKNKU(jArr, i));
        }
        return j;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m31965maxOfVKSA0NQ(short s, short s2, short s3) {
        return m31960maxOf5PvTz6A(s, m31960maxOf5PvTz6A(s2, s3));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m31966maxOfWZ9TVnA(int i, int i2, int i3) {
        return m31961maxOfJ1ME1BU(i, m31961maxOfJ1ME1BU(i2, i3));
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m31967maxOfWr6uiD8(byte b, @yfb byte... bArr) {
        md8.checkNotNullParameter(bArr, "other");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            b = m31962maxOfKr8caGY(b, hoh.m30088getw2LRezQ(bArr, i));
        }
        return b;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m31968maxOfb33U2AM(byte b, byte b2, byte b3) {
        return m31962maxOfKr8caGY(b, m31962maxOfKr8caGY(b2, b3));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static long m31969maxOfeb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) >= 0 ? j : j2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m31970maxOfsambcqE(long j, long j2, long j3) {
        return m31969maxOfeb3DHEI(j, m31969maxOfeb3DHEI(j2, j3));
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m31971maxOft1qELG4(short s, @yfb short... sArr) {
        md8.checkNotNullParameter(sArr, "other");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            s = m31960maxOf5PvTz6A(s, jqh.m30551getMh2AYeg(sArr, i));
        }
        return s;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m31972minOf5PvTz6A(short s, short s2) {
        return md8.compare(s & iqh.f48007d, 65535 & s2) <= 0 ? s : s2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static int m31973minOfJ1ME1BU(int i, int i2) {
        return Integer.compareUnsigned(i, i2) <= 0 ? i : i2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m31974minOfKr8caGY(byte b, byte b2) {
        return md8.compare(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m31975minOfMd2H83M(int i, @yfb int... iArr) {
        md8.checkNotNullParameter(iArr, "other");
        int iM29591getSizeimpl = fph.m29591getSizeimpl(iArr);
        for (int i2 = 0; i2 < iM29591getSizeimpl; i2++) {
            i = m31973minOfJ1ME1BU(i, fph.m29590getpVg5ArA(iArr, i2));
        }
        return i;
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m31976minOfR03FKyM(long j, @yfb long... jArr) {
        md8.checkNotNullParameter(jArr, "other");
        int iM31844getSizeimpl = pph.m31844getSizeimpl(jArr);
        for (int i = 0; i < iM31844getSizeimpl; i++) {
            j = m31981minOfeb3DHEI(j, pph.m31843getsVKNKU(jArr, i));
        }
        return j;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m31977minOfVKSA0NQ(short s, short s2, short s3) {
        return m31972minOf5PvTz6A(s, m31972minOf5PvTz6A(s2, s3));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m31978minOfWZ9TVnA(int i, int i2, int i3) {
        return m31973minOfJ1ME1BU(i, m31973minOfJ1ME1BU(i2, i3));
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m31979minOfWr6uiD8(byte b, @yfb byte... bArr) {
        md8.checkNotNullParameter(bArr, "other");
        int iM30089getSizeimpl = hoh.m30089getSizeimpl(bArr);
        for (int i = 0; i < iM30089getSizeimpl; i++) {
            b = m31974minOfKr8caGY(b, hoh.m30088getw2LRezQ(bArr, i));
        }
        return b;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m31980minOfb33U2AM(byte b, byte b2, byte b3) {
        return m31974minOfKr8caGY(b, m31974minOfKr8caGY(b2, b3));
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static long m31981minOfeb3DHEI(long j, long j2) {
        return Long.compareUnsigned(j, j2) <= 0 ? j : j2;
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    @t28
    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m31982minOfsambcqE(long j, long j2, long j3) {
        return m31981minOfeb3DHEI(j, m31981minOfeb3DHEI(j2, j3));
    }

    @jjf(version = "1.4")
    @yh5
    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m31983minOft1qELG4(short s, @yfb short... sArr) {
        md8.checkNotNullParameter(sArr, "other");
        int iM30552getSizeimpl = jqh.m30552getSizeimpl(sArr);
        for (int i = 0; i < iM30552getSizeimpl; i++) {
            s = m31972minOf5PvTz6A(s, jqh.m30551getMh2AYeg(sArr, i));
        }
        return s;
    }
}
