package p000;

import java.util.Date;
import p000.ga0;

/* JADX INFO: loaded from: classes5.dex */
public class hi5 {

    /* JADX INFO: renamed from: j */
    public static final long f43714j = 1000;

    /* JADX INFO: renamed from: k */
    public static final double f43715k = 1.5d;

    /* JADX INFO: renamed from: l */
    public static final long f43716l = 60000;

    /* JADX INFO: renamed from: a */
    public final ga0 f43717a;

    /* JADX INFO: renamed from: b */
    public final ga0.EnumC6181d f43718b;

    /* JADX INFO: renamed from: c */
    public final long f43719c;

    /* JADX INFO: renamed from: d */
    public final double f43720d;

    /* JADX INFO: renamed from: e */
    public final long f43721e;

    /* JADX INFO: renamed from: f */
    public long f43722f;

    /* JADX INFO: renamed from: g */
    public long f43723g;

    /* JADX INFO: renamed from: h */
    public long f43724h;

    /* JADX INFO: renamed from: i */
    public ga0.C6179b f43725i;

    public hi5(ga0 ga0Var, ga0.EnumC6181d enumC6181d, long j, double d, long j2) {
        this.f43717a = ga0Var;
        this.f43718b = enumC6181d;
        this.f43719c = j;
        this.f43720d = d;
        this.f43721e = j2;
        this.f43722f = j2;
        this.f43724h = new Date().getTime();
        reset();
    }

    private long jitterDelayMs() {
        return (long) ((Math.random() - 0.5d) * this.f43723g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$backoffAndRun$0(Runnable runnable) {
        this.f43724h = new Date().getTime();
        runnable.run();
    }

    public void backoffAndRun(final Runnable runnable) {
        cancel();
        long jJitterDelayMs = this.f43723g + jitterDelayMs();
        long jMax = Math.max(0L, new Date().getTime() - this.f43724h);
        long jMax2 = Math.max(0L, jJitterDelayMs - jMax);
        if (this.f43723g > 0) {
            fj9.debug(getClass().getSimpleName(), "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)", Long.valueOf(jMax2), Long.valueOf(this.f43723g), Long.valueOf(jJitterDelayMs), Long.valueOf(jMax));
        }
        this.f43725i = this.f43717a.enqueueAfterDelay(this.f43718b, jMax2, new Runnable() { // from class: gi5
            @Override // java.lang.Runnable
            public final void run() {
                this.f39862a.lambda$backoffAndRun$0(runnable);
            }
        });
        long j = (long) (this.f43723g * this.f43720d);
        this.f43723g = j;
        long j2 = this.f43719c;
        if (j < j2) {
            this.f43723g = j2;
        } else {
            long j3 = this.f43722f;
            if (j > j3) {
                this.f43723g = j3;
            }
        }
        this.f43722f = this.f43721e;
    }

    public void cancel() {
        ga0.C6179b c6179b = this.f43725i;
        if (c6179b != null) {
            c6179b.cancel();
            this.f43725i = null;
        }
    }

    public void reset() {
        this.f43723g = 0L;
    }

    public void resetToMax() {
        this.f43723g = this.f43722f;
    }

    public void setTemporaryMaxDelay(long j) {
        this.f43722f = j;
    }

    public hi5(ga0 ga0Var, ga0.EnumC6181d enumC6181d) {
        this(ga0Var, enumC6181d, 1000L, 1.5d, 60000L);
    }
}
