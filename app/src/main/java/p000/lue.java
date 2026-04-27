package p000;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class lue {

    /* JADX INFO: renamed from: c */
    public static final lue f58832c = new lue(0, 0);

    /* JADX INFO: renamed from: a */
    public final long f58833a;

    /* JADX INFO: renamed from: b */
    public final long f58834b;

    public lue(long j, long j2) {
        this.f58833a = j;
        this.f58834b = j2;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || lue.class != obj.getClass()) {
            return false;
        }
        lue lueVar = (lue) obj;
        return this.f58833a == lueVar.f58833a && this.f58834b == lueVar.f58834b;
    }

    public int hashCode() {
        return (((int) this.f58833a) * 31) + ((int) this.f58834b);
    }

    public String toString() {
        return "[timeUs=" + this.f58833a + ", position=" + this.f58834b + "]";
    }
}
