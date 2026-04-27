package p000;

import android.os.SystemClock;
import com.google.auto.value.AutoValue;

/* JADX INFO: loaded from: classes5.dex */
@AutoValue
public abstract class e2g {
    @efb
    public static e2g create(long j, long j2, long j3) {
        return new vl0(j, j2, j3);
    }

    @efb
    public static e2g now() {
        return create(System.currentTimeMillis(), SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public abstract long getElapsedRealtime();

    public abstract long getEpochMillis();

    public abstract long getUptimeMillis();
}
