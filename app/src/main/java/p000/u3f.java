package p000;

import p000.C10354of;
import p000.t1h;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class u3f {
    private u3f() {
    }

    @yx1
    public static C10354of addAdGroupToAdPlaybackState(C10354of c10354of, long j, long j2, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j, -1, c10354of);
        int i = c10354of.f67462e;
        while (i < c10354of.f67459b && c10354of.getAdGroup(i).f67474a != Long.MIN_VALUE && c10354of.getAdGroup(i).f67474a <= mediaPeriodPositionUsForContent) {
            i++;
        }
        C10354of c10354ofWithContentResumeOffsetUs = c10354of.withNewAdGroup(i, mediaPeriodPositionUsForContent).withIsServerSideInserted(i, true).withAdCount(i, jArr.length).withAdDurationsUs(i, jArr).withContentResumeOffsetUs(i, j2);
        C10354of c10354ofWithSkippedAd = c10354ofWithContentResumeOffsetUs;
        for (int i2 = 0; i2 < jArr.length && jArr[i2] == 0; i2++) {
            c10354ofWithSkippedAd = c10354ofWithSkippedAd.withSkippedAd(i, i2);
        }
        return correctFollowingAdGroupTimes(c10354ofWithSkippedAd, i, x0i.sum(jArr), j2);
    }

    private static C10354of correctFollowingAdGroupTimes(C10354of c10354of, int i, long j, long j2) {
        long j3 = (-j) + j2;
        while (true) {
            i++;
            if (i >= c10354of.f67459b) {
                return c10354of;
            }
            long j4 = c10354of.getAdGroup(i).f67474a;
            if (j4 != Long.MIN_VALUE) {
                c10354of = c10354of.withAdGroupTimeUs(i, j4 + j3);
            }
        }
    }

    public static int getAdCountInGroup(C10354of c10354of, int i) {
        int i2 = c10354of.getAdGroup(i).f67475b;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static long getMediaPeriodPositionUs(long j, pja pjaVar, C10354of c10354of) {
        return pjaVar.isAd() ? getMediaPeriodPositionUsForAd(j, pjaVar.f71107b, pjaVar.f71108c, c10354of) : getMediaPeriodPositionUsForContent(j, pjaVar.f71110e, c10354of);
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i, int i2, C10354of c10354of) {
        int i3;
        C10354of.b adGroup = c10354of.getAdGroup(i);
        long j2 = j - adGroup.f67474a;
        int i4 = c10354of.f67462e;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            C10354of.b adGroup2 = c10354of.getAdGroup(i4);
            while (i3 < getAdCountInGroup(c10354of, i4)) {
                j2 -= adGroup2.f67479f[i3];
                i3++;
            }
            j2 += adGroup2.f67480m;
            i4++;
        }
        if (i2 < getAdCountInGroup(c10354of, i)) {
            while (i3 < i2) {
                j2 -= adGroup.f67479f[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i, C10354of c10354of) {
        if (i == -1) {
            i = c10354of.f67459b;
        }
        long j2 = 0;
        for (int i2 = c10354of.f67462e; i2 < i; i2++) {
            C10354of.b adGroup = c10354of.getAdGroup(i2);
            long j3 = adGroup.f67474a;
            if (j3 == Long.MIN_VALUE || j3 > j - j2) {
                break;
            }
            for (int i3 = 0; i3 < getAdCountInGroup(c10354of, i2); i3++) {
                j2 += adGroup.f67479f[i3];
            }
            long j4 = adGroup.f67480m;
            j2 -= j4;
            long j5 = adGroup.f67474a;
            long j6 = j - j2;
            if (j4 + j5 > j6) {
                return Math.max(j5, j6);
            }
        }
        return j - j2;
    }

    public static long getStreamPositionUs(lzc lzcVar, C10354of c10354of) {
        t1h currentTimeline = lzcVar.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        t1h.C12849b period = currentTimeline.getPeriod(lzcVar.getCurrentPeriodIndex(), new t1h.C12849b());
        if (!x0i.areEqual(period.getAdsId(), c10354of.f67458a)) {
            return -9223372036854775807L;
        }
        if (!lzcVar.isPlayingAd()) {
            return getStreamPositionUsForContent(x0i.msToUs(lzcVar.getCurrentPosition()) - period.getPositionInWindowUs(), -1, c10354of);
        }
        return getStreamPositionUsForAd(x0i.msToUs(lzcVar.getCurrentPosition()), lzcVar.getCurrentAdGroupIndex(), lzcVar.getCurrentAdIndexInAdGroup(), c10354of);
    }

    public static long getStreamPositionUsForAd(long j, int i, int i2, C10354of c10354of) {
        int i3;
        C10354of.b adGroup = c10354of.getAdGroup(i);
        long j2 = j + adGroup.f67474a;
        int i4 = c10354of.f67462e;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            C10354of.b adGroup2 = c10354of.getAdGroup(i4);
            while (i3 < getAdCountInGroup(c10354of, i4)) {
                j2 += adGroup2.f67479f[i3];
                i3++;
            }
            j2 -= adGroup2.f67480m;
            i4++;
        }
        if (i2 < getAdCountInGroup(c10354of, i)) {
            while (i3 < i2) {
                j2 += adGroup.f67479f[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long getStreamPositionUsForContent(long j, int i, C10354of c10354of) {
        if (i == -1) {
            i = c10354of.f67459b;
        }
        long j2 = 0;
        for (int i2 = c10354of.f67462e; i2 < i; i2++) {
            C10354of.b adGroup = c10354of.getAdGroup(i2);
            long j3 = adGroup.f67474a;
            if (j3 == Long.MIN_VALUE || j3 > j) {
                break;
            }
            long j4 = j3 + j2;
            for (int i3 = 0; i3 < getAdCountInGroup(c10354of, i2); i3++) {
                j2 += adGroup.f67479f[i3];
            }
            long j5 = adGroup.f67480m;
            j2 -= j5;
            if (adGroup.f67474a + j5 > j) {
                return Math.max(j4, j + j2);
            }
        }
        return j + j2;
    }

    public static long getStreamPositionUs(long j, pja pjaVar, C10354of c10354of) {
        if (pjaVar.isAd()) {
            return getStreamPositionUsForAd(j, pjaVar.f71107b, pjaVar.f71108c, c10354of);
        }
        return getStreamPositionUsForContent(j, pjaVar.f71110e, c10354of);
    }
}
