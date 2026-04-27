package p000;

import com.google.firebase.Timestamp;

/* JADX INFO: loaded from: classes5.dex */
public final class euf implements Comparable<euf> {

    /* JADX INFO: renamed from: b */
    public static final euf f34067b = new euf(new Timestamp(0, 0));

    /* JADX INFO: renamed from: a */
    public final Timestamp f34068a;

    public euf(Timestamp timestamp) {
        this.f34068a = timestamp;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof euf) && compareTo((euf) obj) == 0;
    }

    public Timestamp getTimestamp() {
        return this.f34068a;
    }

    public int hashCode() {
        return getTimestamp().hashCode();
    }

    public String toString() {
        return "SnapshotVersion(seconds=" + this.f34068a.getSeconds() + ", nanos=" + this.f34068a.getNanoseconds() + c0b.f15434d;
    }

    @Override // java.lang.Comparable
    public int compareTo(euf eufVar) {
        return this.f34068a.compareTo(eufVar.f34068a);
    }
}
