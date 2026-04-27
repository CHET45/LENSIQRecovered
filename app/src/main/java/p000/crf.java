package p000;

import java.util.ArrayDeque;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public class crf implements xp0 {

    /* JADX INFO: renamed from: g */
    public static final int f27144g = 10;

    /* JADX INFO: renamed from: h */
    public static final double f27145h = 0.5d;

    /* JADX INFO: renamed from: a */
    public final int f27146a;

    /* JADX INFO: renamed from: b */
    public final double f27147b;

    /* JADX INFO: renamed from: c */
    public final ArrayDeque<C4471a> f27148c;

    /* JADX INFO: renamed from: d */
    public final TreeSet<C4471a> f27149d;

    /* JADX INFO: renamed from: e */
    public double f27150e;

    /* JADX INFO: renamed from: f */
    public long f27151f;

    /* JADX INFO: renamed from: crf$a */
    public static class C4471a implements Comparable<C4471a> {

        /* JADX INFO: renamed from: a */
        public final long f27152a;

        /* JADX INFO: renamed from: b */
        public final double f27153b;

        public C4471a(long j, double d) {
            this.f27152a = j;
            this.f27153b = d;
        }

        @Override // java.lang.Comparable
        public int compareTo(C4471a c4471a) {
            return Long.compare(this.f27152a, c4471a.f27152a);
        }
    }

    public crf() {
        this(10, 0.5d);
    }

    private long calculateBitrateEstimate() {
        if (this.f27148c.isEmpty()) {
            return Long.MIN_VALUE;
        }
        double d = this.f27150e * this.f27147b;
        double d2 = 0.0d;
        long j = 0;
        double d3 = 0.0d;
        for (C4471a c4471a : this.f27149d) {
            double d4 = d2 + (c4471a.f27153b / 2.0d);
            if (d4 >= d) {
                return j == 0 ? c4471a.f27152a : j + ((long) (((c4471a.f27152a - j) * (d - d3)) / (d4 - d3)));
            }
            j = c4471a.f27152a;
            d2 = (c4471a.f27153b / 2.0d) + d4;
            d3 = d4;
        }
        return j;
    }

    @Override // p000.xp0
    public void addSample(long j, long j2) {
        while (this.f27148c.size() >= this.f27146a) {
            C4471a c4471aRemove = this.f27148c.remove();
            this.f27149d.remove(c4471aRemove);
            this.f27150e -= c4471aRemove.f27153b;
        }
        double dSqrt = Math.sqrt(j);
        C4471a c4471a = new C4471a((j * 8000000) / j2, dSqrt);
        this.f27148c.add(c4471a);
        this.f27149d.add(c4471a);
        this.f27150e += dSqrt;
        this.f27151f = calculateBitrateEstimate();
    }

    @Override // p000.xp0
    public long getBandwidthEstimate() {
        return this.f27151f;
    }

    @Override // p000.xp0
    public void reset() {
        this.f27148c.clear();
        this.f27149d.clear();
        this.f27150e = 0.0d;
        this.f27151f = Long.MIN_VALUE;
    }

    public crf(int i, double d) {
        v80.checkArgument(d >= 0.0d && d <= 1.0d);
        this.f27146a = i;
        this.f27147b = d;
        this.f27148c = new ArrayDeque<>();
        this.f27149d = new TreeSet<>();
        this.f27151f = Long.MIN_VALUE;
    }
}
