package p000;

/* JADX INFO: loaded from: classes7.dex */
@dwf({"SMAP\nURandom.kt\nKotlin\n*S Kotlin\n*F\n+ 1 URandom.kt\nkotlin/random/URandomKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,155:1\n1#2:156\n*E\n"})
public final class dqh {
    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m28678checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (Integer.compareUnsigned(i2, i) <= 0) {
            throw new IllegalArgumentException(vod.boundsErrorMessage(woh.m32998boximpl(i), woh.m32998boximpl(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m28679checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (Long.compareUnsigned(j2, j) <= 0) {
            throw new IllegalArgumentException(vod.boundsErrorMessage(oph.m31527boximpl(j), oph.m31527boximpl(j2)).toString());
        }
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    public static final byte[] nextUBytes(@yfb tod todVar, int i) {
        md8.checkNotNullParameter(todVar, "<this>");
        return hoh.m30083constructorimpl(todVar.nextBytes(i));
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m28680nextUBytesEVgfTAA(@yfb tod todVar, @yfb byte[] bArr) {
        md8.checkNotNullParameter(todVar, "$this$nextUBytes");
        md8.checkNotNullParameter(bArr, "array");
        todVar.nextBytes(bArr);
        return bArr;
    }

    @jjf(version = "1.3")
    @yfb
    @yh5
    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m28681nextUBytesWvrt4B4(@yfb tod todVar, @yfb byte[] bArr, int i, int i2) {
        md8.checkNotNullParameter(todVar, "$this$nextUBytes");
        md8.checkNotNullParameter(bArr, "array");
        todVar.nextBytes(bArr, i, i2);
        return bArr;
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m28682nextUBytesWvrt4B4$default(tod todVar, byte[] bArr, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = hoh.m30089getSizeimpl(bArr);
        }
        return m28681nextUBytesWvrt4B4(todVar, bArr, i, i2);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final int nextUInt(@yfb tod todVar) {
        md8.checkNotNullParameter(todVar, "<this>");
        return woh.m33004constructorimpl(todVar.nextInt());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m28683nextUInta8DCA5k(@yfb tod todVar, int i, int i2) {
        md8.checkNotNullParameter(todVar, "$this$nextUInt");
        m28678checkUIntRangeBoundsJ1ME1BU(i, i2);
        return woh.m33004constructorimpl(todVar.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m28684nextUIntqCasIEU(@yfb tod todVar, int i) {
        md8.checkNotNullParameter(todVar, "$this$nextUInt");
        return m28683nextUInta8DCA5k(todVar, 0, i);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final long nextULong(@yfb tod todVar) {
        md8.checkNotNullParameter(todVar, "<this>");
        return oph.m31533constructorimpl(todVar.nextLong());
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m28685nextULongV1Xi4fY(@yfb tod todVar, long j) {
        md8.checkNotNullParameter(todVar, "$this$nextULong");
        return m28686nextULongjmpaWc(todVar, 0L, j);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m28686nextULongjmpaWc(@yfb tod todVar, long j, long j2) {
        md8.checkNotNullParameter(todVar, "$this$nextULong");
        m28679checkULongRangeBoundseb3DHEI(j, j2);
        return oph.m31533constructorimpl(todVar.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final int nextUInt(@yfb tod todVar, @yfb mph mphVar) {
        md8.checkNotNullParameter(todVar, "<this>");
        md8.checkNotNullParameter(mphVar, "range");
        if (!mphVar.isEmpty()) {
            return Integer.compareUnsigned(mphVar.m30733getLastpVg5ArA(), -1) < 0 ? m28683nextUInta8DCA5k(todVar, mphVar.m30732getFirstpVg5ArA(), woh.m33004constructorimpl(mphVar.m30733getLastpVg5ArA() + 1)) : Integer.compareUnsigned(mphVar.m30732getFirstpVg5ArA(), 0) > 0 ? woh.m33004constructorimpl(m28683nextUInta8DCA5k(todVar, woh.m33004constructorimpl(mphVar.m30732getFirstpVg5ArA() - 1), mphVar.m30733getLastpVg5ArA()) + 1) : nextUInt(todVar);
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + mphVar);
    }

    @ihi(markerClass = {yh5.class})
    @jjf(version = "1.5")
    public static final long nextULong(@yfb tod todVar, @yfb wph wphVar) {
        md8.checkNotNullParameter(todVar, "<this>");
        md8.checkNotNullParameter(wphVar, "range");
        if (wphVar.isEmpty()) {
            throw new IllegalArgumentException("Cannot get random in empty range: " + wphVar);
        }
        if (Long.compareUnsigned(wphVar.m32643getLastsVKNKU(), -1L) < 0) {
            return m28686nextULongjmpaWc(todVar, wphVar.m32642getFirstsVKNKU(), oph.m31533constructorimpl(wphVar.m32643getLastsVKNKU() + oph.m31533constructorimpl(((long) 1) & 4294967295L)));
        }
        if (Long.compareUnsigned(wphVar.m32642getFirstsVKNKU(), 0L) <= 0) {
            return nextULong(todVar);
        }
        long j = ((long) 1) & 4294967295L;
        return oph.m31533constructorimpl(m28686nextULongjmpaWc(todVar, oph.m31533constructorimpl(wphVar.m32642getFirstsVKNKU() - oph.m31533constructorimpl(j)), wphVar.m32643getLastsVKNKU()) + oph.m31533constructorimpl(j));
    }
}
