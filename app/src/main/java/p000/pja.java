package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class pja {

    /* JADX INFO: renamed from: a */
    public final Object f71106a;

    /* JADX INFO: renamed from: b */
    public final int f71107b;

    /* JADX INFO: renamed from: c */
    public final int f71108c;

    /* JADX INFO: renamed from: d */
    public final long f71109d;

    /* JADX INFO: renamed from: e */
    public final int f71110e;

    public pja(Object obj) {
        this(obj, -1L);
    }

    public pja copyWithPeriodUid(Object obj) {
        return this.f71106a.equals(obj) ? this : new pja(obj, this.f71107b, this.f71108c, this.f71109d, this.f71110e);
    }

    public pja copyWithWindowSequenceNumber(long j) {
        return this.f71109d == j ? this : new pja(this.f71106a, this.f71107b, this.f71108c, j, this.f71110e);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pja)) {
            return false;
        }
        pja pjaVar = (pja) obj;
        return this.f71106a.equals(pjaVar.f71106a) && this.f71107b == pjaVar.f71107b && this.f71108c == pjaVar.f71108c && this.f71109d == pjaVar.f71109d && this.f71110e == pjaVar.f71110e;
    }

    public int hashCode() {
        return ((((((((527 + this.f71106a.hashCode()) * 31) + this.f71107b) * 31) + this.f71108c) * 31) + ((int) this.f71109d)) * 31) + this.f71110e;
    }

    public boolean isAd() {
        return this.f71107b != -1;
    }

    public pja(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public pja(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public pja(Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    public pja(pja pjaVar) {
        this.f71106a = pjaVar.f71106a;
        this.f71107b = pjaVar.f71107b;
        this.f71108c = pjaVar.f71108c;
        this.f71109d = pjaVar.f71109d;
        this.f71110e = pjaVar.f71110e;
    }

    private pja(Object obj, int i, int i2, long j, int i3) {
        this.f71106a = obj;
        this.f71107b = i;
        this.f71108c = i2;
        this.f71109d = j;
        this.f71110e = i3;
    }
}
