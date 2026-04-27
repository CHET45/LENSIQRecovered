package p000;

/* JADX INFO: renamed from: we */
/* JADX INFO: loaded from: classes3.dex */
public final class C14563we {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f94014a;

    /* JADX INFO: renamed from: b */
    public final boolean f94015b;

    public C14563we(@yfb String str, boolean z) {
        md8.checkNotNullParameter(str, "adId");
        this.f94014a = str;
        this.f94015b = z;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14563we)) {
            return false;
        }
        C14563we c14563we = (C14563we) obj;
        return md8.areEqual(this.f94014a, c14563we.f94014a) && this.f94015b == c14563we.f94015b;
    }

    @yfb
    public final String getAdId() {
        return this.f94014a;
    }

    public int hashCode() {
        return (this.f94014a.hashCode() * 31) + Boolean.hashCode(this.f94015b);
    }

    public final boolean isLimitAdTrackingEnabled() {
        return this.f94015b;
    }

    @yfb
    public String toString() {
        return "AdId: adId=" + this.f94014a + ", isLimitAdTrackingEnabled=" + this.f94015b;
    }

    public /* synthetic */ C14563we(String str, boolean z, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
