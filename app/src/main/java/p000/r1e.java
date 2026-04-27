package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class r1e {

    /* JADX INFO: renamed from: b */
    public static final r1e f76782b = new r1e(false);

    /* JADX INFO: renamed from: a */
    public final boolean f76783a;

    public r1e(boolean z) {
        this.f76783a = z;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && r1e.class == obj.getClass() && this.f76783a == ((r1e) obj).f76783a;
    }

    public int hashCode() {
        return !this.f76783a ? 1 : 0;
    }
}
