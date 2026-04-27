package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class wt2 implements j2h {

    /* JADX INFO: renamed from: a */
    public final float f95470a;

    /* JADX INFO: renamed from: b */
    public final double f95471b;

    /* JADX INFO: renamed from: c */
    public final int f95472c;

    /* JADX INFO: renamed from: d */
    public final long f95473d;

    /* JADX INFO: renamed from: e */
    public final long f95474e;

    /* JADX INFO: renamed from: f */
    public int f95475f;

    public wt2(@h78(from = 1) long j, @y46(from = 0.0d, fromInclusive = false) float f) {
        this(0L, j, f);
    }

    private long getTimestampUsAfter(int i) {
        long jRound = this.f95473d + Math.round(this.f95471b * ((double) i));
        v80.checkState(jRound >= 0);
        return jRound;
    }

    @Override // p000.j2h
    public long getLastTimestampUs() {
        int i = this.f95472c;
        if (i == 0) {
            return -9223372036854775807L;
        }
        return getTimestampUsAfter(i - 1);
    }

    @Override // p000.j2h
    public boolean hasNext() {
        return this.f95475f < this.f95472c;
    }

    @Override // p000.j2h
    public long next() {
        v80.checkState(hasNext());
        int i = this.f95475f;
        this.f95475f = i + 1;
        return getTimestampUsAfter(i);
    }

    public wt2(@h78(from = 0) long j, @h78(from = 1) long j2, @y46(from = 0.0d, fromInclusive = false) float f) {
        boolean z = false;
        v80.checkArgument(j2 > 0);
        v80.checkArgument(f > 0.0f);
        if (0 <= j && j < j2) {
            z = true;
        }
        v80.checkArgument(z);
        this.f95473d = j;
        this.f95474e = j2;
        this.f95470a = f;
        this.f95472c = Math.max(Math.round(((j2 - j) / 1000000.0f) * f), 1);
        this.f95471b = 1000000.0f / f;
    }

    @Override // p000.j2h
    public wt2 copyOf() {
        return new wt2(this.f95473d, this.f95474e, this.f95470a);
    }
}
