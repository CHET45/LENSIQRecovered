package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 0)
public final class yg3 {

    /* JADX INFO: renamed from: c */
    public static final int f101421c = 8;

    /* JADX INFO: renamed from: a */
    public long f101422a;

    /* JADX INFO: renamed from: b */
    public float f101423b;

    public yg3(long j, float f) {
        this.f101422a = j;
        this.f101423b = f;
    }

    public static /* synthetic */ yg3 copy$default(yg3 yg3Var, long j, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            j = yg3Var.f101422a;
        }
        if ((i & 2) != 0) {
            f = yg3Var.f101423b;
        }
        return yg3Var.copy(j, f);
    }

    public final long component1() {
        return this.f101422a;
    }

    public final float component2() {
        return this.f101423b;
    }

    @yfb
    public final yg3 copy(long j, float f) {
        return new yg3(j, f);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yg3)) {
            return false;
        }
        yg3 yg3Var = (yg3) obj;
        return this.f101422a == yg3Var.f101422a && Float.compare(this.f101423b, yg3Var.f101423b) == 0;
    }

    public final float getDataPoint() {
        return this.f101423b;
    }

    public final long getTime() {
        return this.f101422a;
    }

    public int hashCode() {
        return (Long.hashCode(this.f101422a) * 31) + Float.hashCode(this.f101423b);
    }

    public final void setDataPoint(float f) {
        this.f101423b = f;
    }

    public final void setTime(long j) {
        this.f101422a = j;
    }

    @yfb
    public String toString() {
        return "DataPointAtTime(time=" + this.f101422a + ", dataPoint=" + this.f101423b + ')';
    }
}
