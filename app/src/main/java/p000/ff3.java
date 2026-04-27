package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public interface ff3 {

    /* JADX INFO: renamed from: a */
    public static final int f36351a = -1;

    long getAvailableSegmentCount(long j, long j2);

    long getDurationUs(long j, long j2);

    long getFirstAvailableSegmentNum(long j, long j2);

    long getFirstSegmentNum();

    long getNextSegmentAvailableTimeUs(long j, long j2);

    long getSegmentCount(long j);

    long getSegmentNum(long j, long j2);

    hpd getSegmentUrl(long j);

    long getTimeUs(long j);

    boolean isExplicit();
}
