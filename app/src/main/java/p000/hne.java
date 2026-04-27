package p000;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
public class hne implements ene {

    /* JADX INFO: renamed from: d */
    public static final int f44239d = 5;

    /* JADX INFO: renamed from: e */
    public static final long f44240e = TimeUnit.SECONDS.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final long[] f44241a = new long[5];

    /* JADX INFO: renamed from: b */
    public final fne f44242b;

    /* JADX INFO: renamed from: c */
    public final woe f44243c;

    @b28
    public hne(fne fneVar, @w8b(a32.C0034g.f247a) woe woeVar) {
        this.f44242b = fneVar;
        this.f44243c = woeVar;
    }

    private int getOldestCheckTimestampIndex() {
        long j = Long.MAX_VALUE;
        int i = -1;
        for (int i2 = 0; i2 < 5; i2++) {
            long j2 = this.f44241a[i2];
            if (j2 < j) {
                i = i2;
                j = j2;
            }
        }
        return i;
    }

    @Override // p000.ene
    public void verify(boolean z) {
        this.f44242b.verify(z);
        int oldestCheckTimestampIndex = getOldestCheckTimestampIndex();
        long j = this.f44241a[oldestCheckTimestampIndex];
        long jNow = this.f44243c.now(TimeUnit.MILLISECONDS);
        long j2 = jNow - j;
        long j3 = f44240e;
        if (j2 < j3) {
            throw new m51(m51.f59908N, new Date(j + j3));
        }
        this.f44241a[oldestCheckTimestampIndex] = jNow;
    }
}
