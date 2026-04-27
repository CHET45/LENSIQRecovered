package p000;

import java.util.Objects;
import p000.C9343mf;
import p000.q1h;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class v3f {
    private v3f() {
    }

    @yx1
    public static C9343mf addAdGroupToAdPlaybackState(C9343mf c9343mf, long j, long j2, long... jArr) {
        long mediaPeriodPositionUsForContent = getMediaPeriodPositionUsForContent(j, -1, c9343mf);
        int i = c9343mf.f60846e;
        while (i < c9343mf.f60843b && c9343mf.getAdGroup(i).f60859a != Long.MIN_VALUE && c9343mf.getAdGroup(i).f60859a <= mediaPeriodPositionUsForContent) {
            i++;
        }
        C9343mf c9343mfWithContentResumeOffsetUs = c9343mf.withNewAdGroup(i, mediaPeriodPositionUsForContent).withIsServerSideInserted(i, true).withAdCount(i, jArr.length).withAdDurationsUs(i, jArr).withContentResumeOffsetUs(i, j2);
        C9343mf c9343mfWithSkippedAd = c9343mfWithContentResumeOffsetUs;
        for (int i2 = 0; i2 < jArr.length && jArr[i2] == 0; i2++) {
            c9343mfWithSkippedAd = c9343mfWithSkippedAd.withSkippedAd(i, i2);
        }
        return correctFollowingAdGroupTimes(c9343mfWithSkippedAd, i, t0i.sum(jArr), j2);
    }

    private static C9343mf correctFollowingAdGroupTimes(C9343mf c9343mf, int i, long j, long j2) {
        long j3 = (-j) + j2;
        while (true) {
            i++;
            if (i >= c9343mf.f60843b) {
                return c9343mf;
            }
            long j4 = c9343mf.getAdGroup(i).f60859a;
            if (j4 != Long.MIN_VALUE) {
                c9343mf = c9343mf.withAdGroupTimeUs(i, j4 + j3);
            }
        }
    }

    public static int getAdCountInGroup(C9343mf c9343mf, int i) {
        int i2 = c9343mf.getAdGroup(i).f60860b;
        if (i2 == -1) {
            return 0;
        }
        return i2;
    }

    public static long getMediaPeriodPositionUs(long j, una.C13612b c13612b, C9343mf c9343mf) {
        return c13612b.isAd() ? getMediaPeriodPositionUsForAd(j, c13612b.f88604b, c13612b.f88605c, c9343mf) : getMediaPeriodPositionUsForContent(j, c13612b.f88607e, c9343mf);
    }

    public static long getMediaPeriodPositionUsForAd(long j, int i, int i2, C9343mf c9343mf) {
        int i3;
        C9343mf.b adGroup = c9343mf.getAdGroup(i);
        long j2 = j - adGroup.f60859a;
        int i4 = c9343mf.f60846e;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            C9343mf.b adGroup2 = c9343mf.getAdGroup(i4);
            while (i3 < getAdCountInGroup(c9343mf, i4)) {
                j2 -= adGroup2.f60865g[i3];
                i3++;
            }
            j2 += adGroup2.f60867i;
            i4++;
        }
        if (i2 < getAdCountInGroup(c9343mf, i)) {
            while (i3 < i2) {
                j2 -= adGroup.f60865g[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long getMediaPeriodPositionUsForContent(long j, int i, C9343mf c9343mf) {
        if (i == -1) {
            i = c9343mf.f60843b;
        }
        long j2 = 0;
        for (int i2 = c9343mf.f60846e; i2 < i; i2++) {
            C9343mf.b adGroup = c9343mf.getAdGroup(i2);
            long j3 = adGroup.f60859a;
            if (j3 == Long.MIN_VALUE || j3 > j - j2) {
                break;
            }
            for (int i3 = 0; i3 < getAdCountInGroup(c9343mf, i2); i3++) {
                j2 += adGroup.f60865g[i3];
            }
            long j4 = adGroup.f60867i;
            j2 -= j4;
            long j5 = adGroup.f60859a;
            long j6 = j - j2;
            if (j4 + j5 > j6) {
                return Math.max(j5, j6);
            }
        }
        return j - j2;
    }

    public static long getStreamPositionUs(izc izcVar, Object obj) {
        q1h currentTimeline = izcVar.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return -9223372036854775807L;
        }
        q1h.C11270b period = currentTimeline.getPeriod(izcVar.getCurrentPeriodIndex(), new q1h.C11270b());
        if (!Objects.equals(period.getAdsId(), obj)) {
            return -9223372036854775807L;
        }
        if (!izcVar.isPlayingAd()) {
            return getStreamPositionUsForContent(t0i.msToUs(izcVar.getCurrentPosition()) - period.getPositionInWindowUs(), -1, period.f72950g);
        }
        return getStreamPositionUsForAd(t0i.msToUs(izcVar.getCurrentPosition()), izcVar.getCurrentAdGroupIndex(), izcVar.getCurrentAdIndexInAdGroup(), period.f72950g);
    }

    public static long getStreamPositionUsForAd(long j, int i, int i2, C9343mf c9343mf) {
        int i3;
        C9343mf.b adGroup = c9343mf.getAdGroup(i);
        long j2 = j + adGroup.f60859a;
        int i4 = c9343mf.f60846e;
        while (true) {
            i3 = 0;
            if (i4 >= i) {
                break;
            }
            C9343mf.b adGroup2 = c9343mf.getAdGroup(i4);
            while (i3 < getAdCountInGroup(c9343mf, i4)) {
                j2 += adGroup2.f60865g[i3];
                i3++;
            }
            j2 -= adGroup2.f60867i;
            i4++;
        }
        if (i2 < getAdCountInGroup(c9343mf, i)) {
            while (i3 < i2) {
                j2 += adGroup.f60865g[i3];
                i3++;
            }
        }
        return j2;
    }

    public static long getStreamPositionUsForContent(long j, int i, C9343mf c9343mf) {
        if (i == -1) {
            i = c9343mf.f60843b;
        }
        long j2 = 0;
        for (int i2 = c9343mf.f60846e; i2 < i; i2++) {
            C9343mf.b adGroup = c9343mf.getAdGroup(i2);
            long j3 = adGroup.f60859a;
            if (j3 == Long.MIN_VALUE || j3 > j) {
                break;
            }
            long j4 = j3 + j2;
            for (int i3 = 0; i3 < getAdCountInGroup(c9343mf, i2); i3++) {
                j2 += adGroup.f60865g[i3];
            }
            long j5 = adGroup.f60867i;
            j2 -= j5;
            if (adGroup.f60859a + j5 > j) {
                return Math.max(j4, j + j2);
            }
        }
        return j + j2;
    }

    public static long getStreamPositionUs(long j, una.C13612b c13612b, C9343mf c9343mf) {
        if (c13612b.isAd()) {
            return getStreamPositionUsForAd(j, c13612b.f88604b, c13612b.f88605c, c9343mf);
        }
        return getStreamPositionUsForContent(j, c13612b.f88607e, c9343mf);
    }
}
