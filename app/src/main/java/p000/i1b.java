package p000;

import p000.eta;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class i1b implements eta.InterfaceC5464a {

    /* JADX INFO: renamed from: d */
    public static final int f45428d = -1;

    /* JADX INFO: renamed from: e */
    public static final int f45429e = 2082844800;

    /* JADX INFO: renamed from: a */
    public final long f45430a;

    /* JADX INFO: renamed from: b */
    public final long f45431b;

    /* JADX INFO: renamed from: c */
    public final long f45432c;

    public i1b(long j, long j2) {
        this.f45430a = j;
        this.f45431b = j2;
        this.f45432c = -1L;
    }

    public static long unixTimeToMp4TimeSeconds(long j) {
        return (j / 1000) + 2082844800;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i1b)) {
            return false;
        }
        i1b i1bVar = (i1b) obj;
        return this.f45430a == i1bVar.f45430a && this.f45431b == i1bVar.f45431b && this.f45432c == i1bVar.f45432c;
    }

    public int hashCode() {
        return ((((527 + im9.hashCode(this.f45430a)) * 31) + im9.hashCode(this.f45431b)) * 31) + im9.hashCode(this.f45432c);
    }

    public String toString() {
        return "Mp4Timestamp: creation time=" + this.f45430a + ", modification time=" + this.f45431b + ", timescale=" + this.f45432c;
    }

    public i1b(long j, long j2, long j3) {
        this.f45430a = j;
        this.f45431b = j2;
        this.f45432c = j3;
    }
}
