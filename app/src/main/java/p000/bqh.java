package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class bqh {
    /* JADX INFO: renamed from: differenceModulo-WZ9TVnA, reason: not valid java name */
    private static final int m28048differenceModuloWZ9TVnA(int i, int i2, int i3) {
        int iRemainderUnsigned = Integer.remainderUnsigned(i, i3);
        int iRemainderUnsigned2 = Integer.remainderUnsigned(i2, i3);
        int iCompareUnsigned = Integer.compareUnsigned(iRemainderUnsigned, iRemainderUnsigned2);
        int iM33004constructorimpl = woh.m33004constructorimpl(iRemainderUnsigned - iRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? iM33004constructorimpl : woh.m33004constructorimpl(iM33004constructorimpl + i3);
    }

    /* JADX INFO: renamed from: differenceModulo-sambcqE, reason: not valid java name */
    private static final long m28049differenceModulosambcqE(long j, long j2, long j3) {
        long jRemainderUnsigned = Long.remainderUnsigned(j, j3);
        long jRemainderUnsigned2 = Long.remainderUnsigned(j2, j3);
        int iCompareUnsigned = Long.compareUnsigned(jRemainderUnsigned, jRemainderUnsigned2);
        long jM31533constructorimpl = oph.m31533constructorimpl(jRemainderUnsigned - jRemainderUnsigned2);
        return iCompareUnsigned >= 0 ? jM31533constructorimpl : oph.m31533constructorimpl(jM31533constructorimpl + j3);
    }

    @jjf(version = "1.3")
    @yjd
    /* JADX INFO: renamed from: getProgressionLastElement-7ftBX0g, reason: not valid java name */
    public static final long m28050getProgressionLastElement7ftBX0g(long j, long j2, long j3) {
        if (j3 > 0) {
            return Long.compareUnsigned(j, j2) >= 0 ? j2 : oph.m31533constructorimpl(j2 - m28049differenceModulosambcqE(j2, j, oph.m31533constructorimpl(j3)));
        }
        if (j3 < 0) {
            return Long.compareUnsigned(j, j2) <= 0 ? j2 : oph.m31533constructorimpl(j2 + m28049differenceModulosambcqE(j, j2, oph.m31533constructorimpl(-j3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }

    @jjf(version = "1.3")
    @yjd
    /* JADX INFO: renamed from: getProgressionLastElement-Nkh28Cs, reason: not valid java name */
    public static final int m28051getProgressionLastElementNkh28Cs(int i, int i2, int i3) {
        if (i3 > 0) {
            return Integer.compareUnsigned(i, i2) >= 0 ? i2 : woh.m33004constructorimpl(i2 - m28048differenceModuloWZ9TVnA(i2, i, woh.m33004constructorimpl(i3)));
        }
        if (i3 < 0) {
            return Integer.compareUnsigned(i, i2) <= 0 ? i2 : woh.m33004constructorimpl(i2 + m28048differenceModuloWZ9TVnA(i, i2, woh.m33004constructorimpl(-i3)));
        }
        throw new IllegalArgumentException("Step is zero.");
    }
}
