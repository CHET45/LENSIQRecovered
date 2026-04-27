package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class kue {

    /* JADX INFO: renamed from: c */
    public static final kue f55383c = new kue(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f55384a;

    /* JADX INFO: renamed from: b */
    public final long f55385b;

    public kue(long j, long j2) {
        this.f55384a = j;
        this.f55385b = j2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || kue.class != obj.getClass()) {
            return false;
        }
        kue kueVar = (kue) obj;
        return this.f55384a == kueVar.f55384a && this.f55385b == kueVar.f55385b;
    }

    public int hashCode() {
        return (((int) this.f55384a) * 31) + ((int) this.f55385b);
    }

    public String toString() {
        return "[timeUs=" + this.f55384a + ", position=" + this.f55385b + "]";
    }
}
