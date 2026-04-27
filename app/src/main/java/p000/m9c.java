package p000;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes5.dex */
@qx4
@yg8
public final class m9c {

    /* JADX INFO: renamed from: a */
    public static final long f60292a = 2147483647999999999L;

    private m9c() {
    }

    /* JADX INFO: renamed from: a */
    public static void m17166a(@wx1 Object blocker, long nanos) {
        LockSupport.parkNanos(blocker, Math.min(nanos, f60292a));
    }
}
