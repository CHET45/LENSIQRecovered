package p000;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class d4e {

    /* JADX INFO: renamed from: d */
    public static final long f28399d = TimeUnit.HOURS.toMillis(24);

    /* JADX INFO: renamed from: e */
    public static final long f28400e = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: a */
    public final g1i f28401a;

    /* JADX INFO: renamed from: b */
    @xc7("this")
    public long f28402b;

    /* JADX INFO: renamed from: c */
    @xc7("this")
    public int f28403c;

    public d4e(g1i g1iVar) {
        this.f28401a = g1iVar;
    }

    private synchronized long getBackoffDuration(int i) {
        if (isRetryableError(i)) {
            return (long) Math.min(Math.pow(2.0d, this.f28403c) + this.f28401a.getRandomDelayForSyncPrevention(), f28400e);
        }
        return f28399d;
    }

    private static boolean isRetryableError(int i) {
        return i == 429 || (i >= 500 && i < 600);
    }

    private static boolean isSuccessfulOrRequiresNewFidCreation(int i) {
        return (i >= 200 && i < 300) || i == 401 || i == 404;
    }

    private synchronized void resetBackoffStrategy() {
        this.f28403c = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isRequestAllowed() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.f28403c     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L16
            g1i r0 = r4.f28401a     // Catch: java.lang.Throwable -> L14
            long r0 = r0.currentTimeInMillis()     // Catch: java.lang.Throwable -> L14
            long r2 = r4.f28402b     // Catch: java.lang.Throwable -> L14
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L12
            goto L16
        L12:
            r0 = 0
            goto L17
        L14:
            r0 = move-exception
            goto L19
        L16:
            r0 = 1
        L17:
            monitor-exit(r4)
            return r0
        L19:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L14
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.d4e.isRequestAllowed():boolean");
    }

    public synchronized void setNextRequestTime(int i) {
        if (isSuccessfulOrRequiresNewFidCreation(i)) {
            resetBackoffStrategy();
            return;
        }
        this.f28403c++;
        this.f28402b = this.f28401a.currentTimeInMillis() + getBackoffDuration(i);
    }

    public d4e() {
        this.f28401a = g1i.getInstance();
    }
}
