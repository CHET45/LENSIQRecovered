package p000;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes4.dex */
public final class si9 {

    /* JADX INFO: renamed from: a */
    public static final double f81927a = 1.0d / Math.pow(10.0d, 6.0d);

    private si9() {
    }

    public static double getElapsedMillis(long j) {
        return (getLogTime() - j) * f81927a;
    }

    @omg(17)
    public static long getLogTime() {
        return SystemClock.elapsedRealtimeNanos();
    }
}
