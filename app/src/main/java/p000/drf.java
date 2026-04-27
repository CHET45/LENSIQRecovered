package p000;

import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class drf implements wp0 {

    /* JADX INFO: renamed from: g */
    public static final int f30495g = 10;

    /* JADX INFO: renamed from: h */
    public static final double f30496h = 0.5d;

    /* JADX INFO: renamed from: a */
    public final int f30497a;

    /* JADX INFO: renamed from: b */
    public final double f30498b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<C4926a> f30499c;

    /* JADX INFO: renamed from: d */
    public final TreeSet<C4926a> f30500d;

    /* JADX INFO: renamed from: e */
    public double f30501e;

    /* JADX INFO: renamed from: f */
    public long f30502f;

    /* JADX INFO: renamed from: drf$a */
    public static class C4926a implements Comparable<C4926a> {

        /* JADX INFO: renamed from: a */
        public final long f30503a;

        /* JADX INFO: renamed from: b */
        public final double f30504b;

        public C4926a(long j, double d) {
            this.f30503a = j;
            this.f30504b = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(C4926a c4926a) {
            return x0i.compareLong(this.f30503a, c4926a.f30503a);
        }
    }

    public drf() {
        this(10, 0.5d);
    }

    private long calculateBitrateEstimate() {
        if (this.f30499c.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.f30501e * this.f30498b;
        double d2 = 0.0d;
        long j = 0;
        double d3 = 0.0d;
        for (C4926a c4926a : this.f30500d) {
            double d4 = d2 + (c4926a.f30504b / 2.0d);
            if (d4 >= d) {
                return j == 0 ? c4926a.f30503a : j + ((long) (((c4926a.f30503a - j) * (d - d3)) / (d4 - d3)));
            }
            j = c4926a.f30503a;
            d2 = (c4926a.f30504b / 2.0d) + d4;
            d3 = d4;
        }
        return j;
    }

    @Override // p000.wp0
    public void addSample(long j, long j2) {
        while (this.f30499c.size() >= this.f30497a) {
            C4926a c4926aRemove = this.f30499c.remove();
            this.f30500d.remove(c4926aRemove);
            this.f30501e -= c4926aRemove.f30504b;
        }
        double dSqrt = Math.sqrt(j);
        C4926a c4926a = new C4926a((j * 8000000) / j2, dSqrt);
        this.f30499c.add(c4926a);
        this.f30500d.add(c4926a);
        this.f30501e += dSqrt;
        this.f30502f = calculateBitrateEstimate();
    }

    @Override // p000.wp0
    public long getBandwidthEstimate() {
        return this.f30502f;
    }

    @Override // p000.wp0
    public void reset() {
        this.f30499c.clear();
        this.f30500d.clear();
        this.f30501e = 0.0d;
        this.f30502f = Long.MIN_VALUE;
    }

    public drf(int i, double d) {
        u80.checkArgument(d >= 0.0d && d <= 1.0d);
        this.f30497a = i;
        this.f30498b = d;
        this.f30499c = new ArrayDeque<>();
        this.f30500d = new TreeSet<>();
        this.f30502f = Long.MIN_VALUE;
    }
}
