package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class t4h {

    /* JADX INFO: renamed from: a */
    public final long f83718a;

    /* JADX INFO: renamed from: b */
    public final long f83719b;

    /* JADX INFO: renamed from: c */
    public final int f83720c;

    public t4h(long j, long j2, int i) {
        this.f83718a = j;
        this.f83719b = j2;
        this.f83720c = i;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4h)) {
            return false;
        }
        t4h t4hVar = (t4h) obj;
        return this.f83718a == t4hVar.f83718a && this.f83719b == t4hVar.f83719b && this.f83720c == t4hVar.f83720c;
    }

    public final long getModelVersion() {
        return this.f83719b;
    }

    public final long getTaxonomyVersion() {
        return this.f83718a;
    }

    public final int getTopicId() {
        return this.f83720c;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f83718a) * 31) + Long.hashCode(this.f83719b)) * 31) + Integer.hashCode(this.f83720c);
    }

    @yfb
    public String toString() {
        return "Topic { " + ("TaxonomyVersion=" + this.f83718a + ", ModelVersion=" + this.f83719b + ", TopicCode=" + this.f83720c + " }");
    }
}
