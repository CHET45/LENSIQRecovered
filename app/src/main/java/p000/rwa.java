package p000;

import android.util.Pair;
import p000.gue;

/* JADX INFO: loaded from: classes3.dex */
public final class rwa implements nue {

    /* JADX INFO: renamed from: d */
    public final long[] f79946d;

    /* JADX INFO: renamed from: e */
    public final long[] f79947e;

    /* JADX INFO: renamed from: f */
    public final long f79948f;

    private rwa(long[] jArr, long[] jArr2, long j) {
        this.f79946d = jArr;
        this.f79947e = jArr2;
        this.f79948f = j == -9223372036854775807L ? t0i.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    public static rwa create(long j, pwa pwaVar, long j2) {
        int length = pwaVar.f72373e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (pwaVar.f72371c + pwaVar.f72373e[i3]);
            j3 += (long) (pwaVar.f72372d + pwaVar.f72374f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new rwa(jArr, jArr2, j2);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = t0i.binarySearchFloor(jArr, j, true, true);
        long j2 = jArr[iBinarySearchFloor];
        long j3 = jArr2[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p000.nue
    public int getAverageBitrate() {
        return -2147483647;
    }

    @Override // p000.nue
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // p000.nue
    public long getDataStartPosition() {
        return 0L;
    }

    @Override // p000.gue
    public long getDurationUs() {
        return this.f79948f;
    }

    @Override // p000.gue
    public gue.C6548a getSeekPoints(long j) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(t0i.usToMs(t0i.constrainValue(j, 0L, this.f79948f)), this.f79947e, this.f79946d);
        return new gue.C6548a(new lue(t0i.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // p000.nue
    public long getTimeUs(long j) {
        return t0i.msToUs(((Long) linearlyInterpolate(j, this.f79946d, this.f79947e).second).longValue());
    }

    @Override // p000.gue
    public boolean isSeekable() {
        return true;
    }
}
