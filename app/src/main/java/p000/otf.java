package p000;

/* JADX INFO: loaded from: classes5.dex */
public class otf {

    /* JADX INFO: renamed from: a */
    public final boolean f68736a;

    /* JADX INFO: renamed from: b */
    public final boolean f68737b;

    public otf(boolean z, boolean z2) {
        this.f68736a = z;
        this.f68737b = z2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof otf)) {
            return false;
        }
        otf otfVar = (otf) obj;
        return this.f68736a == otfVar.f68736a && this.f68737b == otfVar.f68737b;
    }

    public boolean hasPendingWrites() {
        return this.f68736a;
    }

    public int hashCode() {
        return ((this.f68736a ? 1 : 0) * 31) + (this.f68737b ? 1 : 0);
    }

    public boolean isFromCache() {
        return this.f68737b;
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f68736a + ", isFromCache=" + this.f68737b + '}';
    }
}
