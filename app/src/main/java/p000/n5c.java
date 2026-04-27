package p000;

/* JADX INFO: loaded from: classes.dex */
@e0g(parameters = 1)
public final class n5c {

    /* JADX INFO: renamed from: b */
    public static final int f63347b = 0;

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f63348a;

    public n5c(@yfb String str) {
        this.f63348a = str;
    }

    public static /* synthetic */ n5c copy$default(n5c n5cVar, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = n5cVar.f63348a;
        }
        return n5cVar.copy(str);
    }

    @yfb
    public final String component1() {
        return this.f63348a;
    }

    @yfb
    public final n5c copy(@yfb String str) {
        return new n5c(str);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n5c) && md8.areEqual(this.f63348a, ((n5c) obj).f63348a);
    }

    @yfb
    public final String getKey() {
        return this.f63348a;
    }

    public int hashCode() {
        return this.f63348a.hashCode();
    }

    @yfb
    public String toString() {
        return "OpaqueKey(key=" + this.f63348a + ')';
    }
}
