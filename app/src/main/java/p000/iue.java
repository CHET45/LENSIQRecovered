package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class iue {

    /* JADX INFO: renamed from: c */
    public static final iue f48520c;

    /* JADX INFO: renamed from: d */
    public static final iue f48521d;

    /* JADX INFO: renamed from: e */
    public static final iue f48522e;

    /* JADX INFO: renamed from: f */
    public static final iue f48523f;

    /* JADX INFO: renamed from: g */
    public static final iue f48524g;

    /* JADX INFO: renamed from: a */
    public final long f48525a;

    /* JADX INFO: renamed from: b */
    public final long f48526b;

    static {
        iue iueVar = new iue(0L, 0L);
        f48520c = iueVar;
        f48521d = new iue(Long.MAX_VALUE, Long.MAX_VALUE);
        f48522e = new iue(Long.MAX_VALUE, 0L);
        f48523f = new iue(0L, Long.MAX_VALUE);
        f48524g = iueVar;
    }

    public iue(long j, long j2) {
        u80.checkArgument(j >= 0);
        u80.checkArgument(j2 >= 0);
        this.f48525a = j;
        this.f48526b = j2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iue.class != obj.getClass()) {
            return false;
        }
        iue iueVar = (iue) obj;
        return this.f48525a == iueVar.f48525a && this.f48526b == iueVar.f48526b;
    }

    public int hashCode() {
        return (((int) this.f48525a) * 31) + ((int) this.f48526b);
    }

    public long resolveSeekPositionUs(long j, long j2, long j3) {
        long j4 = this.f48525a;
        if (j4 == 0 && this.f48526b == 0) {
            return j;
        }
        long jSubtractWithOverflowDefault = x0i.subtractWithOverflowDefault(j, j4, Long.MIN_VALUE);
        long jAddWithOverflowDefault = x0i.addWithOverflowDefault(j, this.f48526b, Long.MAX_VALUE);
        boolean z = false;
        boolean z2 = jSubtractWithOverflowDefault <= j2 && j2 <= jAddWithOverflowDefault;
        if (jSubtractWithOverflowDefault <= j3 && j3 <= jAddWithOverflowDefault) {
            z = true;
        }
        return (z2 && z) ? Math.abs(j2 - j) <= Math.abs(j3 - j) ? j2 : j3 : z2 ? j2 : z ? j3 : jSubtractWithOverflowDefault;
    }
}
