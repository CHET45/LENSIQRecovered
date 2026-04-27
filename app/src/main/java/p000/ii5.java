package p000;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import p000.no0;

/* JADX INFO: loaded from: classes7.dex */
public final class ii5 implements no0 {

    /* JADX INFO: renamed from: a */
    public Random f47073a = new Random();

    /* JADX INFO: renamed from: b */
    public long f47074b = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: c */
    public long f47075c = TimeUnit.MINUTES.toNanos(2);

    /* JADX INFO: renamed from: d */
    public double f47076d = 1.6d;

    /* JADX INFO: renamed from: e */
    public double f47077e = 0.2d;

    /* JADX INFO: renamed from: f */
    public long f47078f = this.f47074b;

    /* JADX INFO: renamed from: ii5$a */
    public static final class C7298a implements no0.InterfaceC9959a {
        @Override // p000.no0.InterfaceC9959a
        public no0 get() {
            return new ii5();
        }
    }

    private long uniformRandom(double d, double d2) {
        v7d.checkArgument(d2 >= d);
        return (long) ((this.f47073a.nextDouble() * (d2 - d)) + d);
    }

    @gdi
    /* JADX INFO: renamed from: a */
    public ii5 m13112a(long j) {
        this.f47074b = j;
        return this;
    }

    @gdi
    /* JADX INFO: renamed from: b */
    public ii5 m13113b(double d) {
        this.f47077e = d;
        return this;
    }

    @gdi
    /* JADX INFO: renamed from: c */
    public ii5 m13114c(long j) {
        this.f47075c = j;
        return this;
    }

    @gdi
    /* JADX INFO: renamed from: d */
    public ii5 m13115d(double d) {
        this.f47076d = d;
        return this;
    }

    @gdi
    /* JADX INFO: renamed from: e */
    public ii5 m13116e(Random random) {
        this.f47073a = random;
        return this;
    }

    @Override // p000.no0
    public long nextBackoffNanos() {
        long j = this.f47078f;
        double d = j;
        this.f47078f = Math.min((long) (this.f47076d * d), this.f47075c);
        double d2 = this.f47077e;
        return j + uniformRandom((-d2) * d, d2 * d);
    }
}
