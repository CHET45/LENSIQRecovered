package p000;

/* JADX INFO: loaded from: classes7.dex */
public final class i65 {

    /* JADX INFO: renamed from: b */
    public static final int f45826b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f45827c = 1;

    /* JADX INFO: renamed from: d */
    public static final int f45828d = 2;

    /* JADX INFO: renamed from: e */
    public static final long f45829e = 1000000;

    /* JADX INFO: renamed from: f */
    public static final long f45830f = 9223372036854L;

    /* JADX INFO: renamed from: g */
    public static final long f45831g = 4611686018427387903L;

    /* JADX INFO: renamed from: a */
    @yfb
    public static final qhg f45825a = new qhg("REMOVED_TASK");

    /* JADX INFO: renamed from: h */
    @yfb
    public static final qhg f45832h = new qhg("CLOSED_EMPTY");

    public static final long delayNanosToMillis(long j) {
        return j / 1000000;
    }

    public static final long delayToNanos(long j) {
        if (j <= 0) {
            return 0L;
        }
        if (j >= 9223372036854L) {
            return Long.MAX_VALUE;
        }
        return 1000000 * j;
    }
}
