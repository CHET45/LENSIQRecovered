package p000;

/* JADX INFO: loaded from: classes.dex */
@ug5
@vw7
public final class ak7 {

    /* JADX INFO: renamed from: d */
    public static final int f1803d = 0;

    /* JADX INFO: renamed from: a */
    public final long f1804a;

    /* JADX INFO: renamed from: b */
    public final long f1805b;

    /* JADX INFO: renamed from: c */
    public long f1806c;

    public /* synthetic */ ak7(long j, long j2, long j3, jt3 jt3Var) {
        this(j, j2, j3);
    }

    /* JADX INFO: renamed from: getOriginalEventPosition-F1C5BW0$ui_release, reason: not valid java name */
    public final long m27223getOriginalEventPositionF1C5BW0$ui_release() {
        return this.f1806c;
    }

    /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m27224getPositionF1C5BW0() {
        return this.f1805b;
    }

    public final long getUptimeMillis() {
        return this.f1804a;
    }

    @yfb
    public String toString() {
        return "HistoricalChange(uptimeMillis=" + this.f1804a + ", position=" + ((Object) izb.m30437toStringimpl(this.f1805b)) + ')';
    }

    public /* synthetic */ ak7(long j, long j2, jt3 jt3Var) {
        this(j, j2);
    }

    private ak7(long j, long j2) {
        this.f1804a = j;
        this.f1805b = j2;
        this.f1806c = izb.f49009b.m30445getZeroF1C5BW0();
    }

    private ak7(long j, long j2, long j3) {
        this(j, j2, (jt3) null);
        this.f1806c = j3;
    }
}
