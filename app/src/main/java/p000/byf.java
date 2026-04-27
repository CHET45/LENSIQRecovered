package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class byf {
    private byf() {
    }

    public static long getDurationAfterSpeedProviderApplied(ayf ayfVar, long j) {
        long j2 = 0;
        double dMin = 0.0d;
        while (j2 < j) {
            long nextSpeedChangeTimeUs = ayfVar.getNextSpeedChangeTimeUs(j2);
            if (nextSpeedChangeTimeUs == -9223372036854775807L) {
                nextSpeedChangeTimeUs = Long.MAX_VALUE;
            }
            dMin += (Math.min(nextSpeedChangeTimeUs, j) - j2) / ((double) ayfVar.getSpeed(j2));
            j2 = nextSpeedChangeTimeUs;
        }
        return (long) Math.floor(dMin);
    }

    public static long getNextSpeedChangeSamplePosition(ayf ayfVar, long j, int i) {
        v80.checkArgument(j >= 0);
        v80.checkArgument(i > 0);
        long nextSpeedChangeTimeUs = ayfVar.getNextSpeedChangeTimeUs(t0i.sampleCountToDurationUs(j, i));
        if (nextSpeedChangeTimeUs == -9223372036854775807L) {
            return -1L;
        }
        return t0i.durationUsToSampleCount(nextSpeedChangeTimeUs, i);
    }

    public static float getSampleAlignedSpeed(ayf ayfVar, long j, int i) {
        v80.checkArgument(j >= 0);
        v80.checkArgument(i > 0);
        return ayfVar.getSpeed(t0i.sampleCountToDurationUs(j, i));
    }
}
