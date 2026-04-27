package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class jue {

    /* JADX INFO: renamed from: c */
    public static final jue f51977c;

    /* JADX INFO: renamed from: d */
    public static final jue f51978d;

    /* JADX INFO: renamed from: e */
    public static final jue f51979e;

    /* JADX INFO: renamed from: f */
    public static final jue f51980f;

    /* JADX INFO: renamed from: g */
    public static final jue f51981g;

    /* JADX INFO: renamed from: a */
    public final long f51982a;

    /* JADX INFO: renamed from: b */
    public final long f51983b;

    static {
        jue jueVar = new jue(0L, 0L);
        f51977c = jueVar;
        f51978d = new jue(Long.MAX_VALUE, Long.MAX_VALUE);
        f51979e = new jue(Long.MAX_VALUE, 0L);
        f51980f = new jue(0L, Long.MAX_VALUE);
        f51981g = jueVar;
    }

    public jue(long j, long j2) {
        v80.checkArgument(j >= 0);
        v80.checkArgument(j2 >= 0);
        this.f51982a = j;
        this.f51983b = j2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || jue.class != obj.getClass()) {
            return false;
        }
        jue jueVar = (jue) obj;
        return this.f51982a == jueVar.f51982a && this.f51983b == jueVar.f51983b;
    }

    public int hashCode() {
        return (((int) this.f51982a) * 31) + ((int) this.f51983b);
    }

    public long resolveSeekPositionUs(long j, long j2, long j3) {
        long j4 = this.f51982a;
        if (j4 == 0 && this.f51983b == 0) {
            return j;
        }
        long jSubtractWithOverflowDefault = t0i.subtractWithOverflowDefault(j, j4, Long.MIN_VALUE);
        long jAddWithOverflowDefault = t0i.addWithOverflowDefault(j, this.f51983b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jSubtractWithOverflowDefault <= j2 && j2 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j3 && j3 <= jAddWithOverflowDefault) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : jSubtractWithOverflowDefault;
    }
}
