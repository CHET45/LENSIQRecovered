package p000;

import android.util.Pair;
import com.google.android.exoplayer2.metadata.id3.MlltFrame;
import p000.hue;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qwa implements oue {

    /* JADX INFO: renamed from: d */
    public final long[] f76180d;

    /* JADX INFO: renamed from: e */
    public final long[] f76181e;

    /* JADX INFO: renamed from: f */
    public final long f76182f;

    private qwa(long[] jArr, long[] jArr2, long j) {
        this.f76180d = jArr;
        this.f76181e = jArr2;
        this.f76182f = j == -9223372036854775807L ? x0i.msToUs(jArr2[jArr2.length - 1]) : j;
    }

    public static qwa create(long j, MlltFrame mlltFrame, long j2) {
        int length = mlltFrame.f19649e.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (mlltFrame.f19647c + mlltFrame.f19649e[i3]);
            j3 += (long) (mlltFrame.f19648d + mlltFrame.f19650f[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new qwa(jArr, jArr2, j2);
    }

    private static Pair<Long, Long> linearlyInterpolate(long j, long[] jArr, long[] jArr2) {
        int iBinarySearchFloor = x0i.binarySearchFloor(jArr, j, true, true);
        long j2 = jArr[iBinarySearchFloor];
        long j3 = jArr2[iBinarySearchFloor];
        int i = iBinarySearchFloor + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((jArr[i] == j2 ? 0.0d : (j - j2) / (r6 - j2)) * (jArr2[i] - j3))) + j3));
    }

    @Override // p000.oue
    public long getDataEndPosition() {
        return -1L;
    }

    @Override // p000.hue
    public long getDurationUs() {
        return this.f76182f;
    }

    @Override // p000.hue
    public hue.C7023a getSeekPoints(long j) {
        Pair<Long, Long> pairLinearlyInterpolate = linearlyInterpolate(x0i.usToMs(x0i.constrainValue(j, 0L, this.f76182f)), this.f76181e, this.f76180d);
        return new hue.C7023a(new kue(x0i.msToUs(((Long) pairLinearlyInterpolate.first).longValue()), ((Long) pairLinearlyInterpolate.second).longValue()));
    }

    @Override // p000.oue
    public long getTimeUs(long j) {
        return x0i.msToUs(((Long) linearlyInterpolate(j, this.f76180d, this.f76181e).second).longValue());
    }

    @Override // p000.hue
    public boolean isSeekable() {
        return true;
    }
}
