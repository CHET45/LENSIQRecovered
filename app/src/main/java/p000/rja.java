package p000;

import java.util.Objects;
import p000.una;

/* JADX INFO: loaded from: classes3.dex */
public final class rja {

    /* JADX INFO: renamed from: a */
    public final una.C13612b f78457a;

    /* JADX INFO: renamed from: b */
    public final long f78458b;

    /* JADX INFO: renamed from: c */
    public final long f78459c;

    /* JADX INFO: renamed from: d */
    public final long f78460d;

    /* JADX INFO: renamed from: e */
    public final long f78461e;

    /* JADX INFO: renamed from: f */
    public final boolean f78462f;

    /* JADX INFO: renamed from: g */
    public final boolean f78463g;

    /* JADX INFO: renamed from: h */
    public final boolean f78464h;

    /* JADX INFO: renamed from: i */
    public final boolean f78465i;

    /* JADX INFO: renamed from: j */
    public final boolean f78466j;

    public rja(una.C13612b c13612b, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        v80.checkArgument(!z5 || z3);
        v80.checkArgument(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        v80.checkArgument(z6);
        this.f78457a = c13612b;
        this.f78458b = j;
        this.f78459c = j2;
        this.f78460d = j3;
        this.f78461e = j4;
        this.f78462f = z;
        this.f78463g = z2;
        this.f78464h = z3;
        this.f78465i = z4;
        this.f78466j = z5;
    }

    public rja copyWithRequestedContentPositionUs(long j) {
        return j == this.f78459c ? this : new rja(this.f78457a, this.f78458b, j, this.f78460d, this.f78461e, this.f78462f, this.f78463g, this.f78464h, this.f78465i, this.f78466j);
    }

    public rja copyWithStartPositionUs(long j) {
        return j == this.f78458b ? this : new rja(this.f78457a, j, this.f78459c, this.f78460d, this.f78461e, this.f78462f, this.f78463g, this.f78464h, this.f78465i, this.f78466j);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rja.class != obj.getClass()) {
            return false;
        }
        rja rjaVar = (rja) obj;
        return this.f78458b == rjaVar.f78458b && this.f78459c == rjaVar.f78459c && this.f78460d == rjaVar.f78460d && this.f78461e == rjaVar.f78461e && this.f78462f == rjaVar.f78462f && this.f78463g == rjaVar.f78463g && this.f78464h == rjaVar.f78464h && this.f78465i == rjaVar.f78465i && this.f78466j == rjaVar.f78466j && Objects.equals(this.f78457a, rjaVar.f78457a);
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f78457a.hashCode()) * 31) + ((int) this.f78458b)) * 31) + ((int) this.f78459c)) * 31) + ((int) this.f78460d)) * 31) + ((int) this.f78461e)) * 31) + (this.f78462f ? 1 : 0)) * 31) + (this.f78463g ? 1 : 0)) * 31) + (this.f78464h ? 1 : 0)) * 31) + (this.f78465i ? 1 : 0)) * 31) + (this.f78466j ? 1 : 0);
    }
}
