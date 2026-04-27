package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class s1e {

    /* JADX INFO: renamed from: c */
    public static final s1e f80388c = new s1e(0, false);

    /* JADX INFO: renamed from: a */
    public final int f80389a;

    /* JADX INFO: renamed from: b */
    public final boolean f80390b;

    public s1e(boolean z) {
        this.f80389a = 0;
        this.f80390b = z;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || s1e.class != obj.getClass()) {
            return false;
        }
        s1e s1eVar = (s1e) obj;
        return this.f80389a == s1eVar.f80389a && this.f80390b == s1eVar.f80390b;
    }

    public int hashCode() {
        return (this.f80389a << 1) + (this.f80390b ? 1 : 0);
    }

    public s1e(int i, boolean z) {
        this.f80389a = i;
        this.f80390b = z;
    }
}
