package p000;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@kyg
public final class lb0 {

    /* JADX INFO: renamed from: c */
    public static final Logger f57023c = Logger.getLogger(lb0.class.getName());

    /* JADX INFO: renamed from: a */
    public final String f57024a;

    /* JADX INFO: renamed from: b */
    public final AtomicLong f57025b;

    /* JADX INFO: renamed from: lb0$b */
    @kyg
    public final class C8752b {

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ boolean f57026c = false;

        /* JADX INFO: renamed from: a */
        public final long f57027a;

        public void backoff() {
            long j = this.f57027a;
            long jMax = Math.max(2 * j, j);
            if (lb0.this.f57025b.compareAndSet(this.f57027a, jMax)) {
                lb0.f57023c.log(Level.WARNING, "Increased {0} to {1}", new Object[]{lb0.this.f57024a, Long.valueOf(jMax)});
            }
        }

        public long get() {
            return this.f57027a;
        }

        private C8752b(long j) {
            this.f57027a = j;
        }
    }

    public lb0(String str, long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.f57025b = atomicLong;
        v7d.checkArgument(j > 0, "value must be positive");
        this.f57024a = str;
        atomicLong.set(j);
    }

    public C8752b getState() {
        return new C8752b(this.f57025b.get());
    }
}
