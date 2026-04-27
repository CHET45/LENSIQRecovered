package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes5.dex */
public final class vmg {

    /* JADX INFO: renamed from: a */
    public final kmg f91753a;

    /* JADX INFO: renamed from: b */
    public final int f91754b;

    /* JADX INFO: renamed from: c */
    public final long f91755c;

    /* JADX INFO: renamed from: d */
    public final pmd f91756d;

    /* JADX INFO: renamed from: e */
    public final euf f91757e;

    /* JADX INFO: renamed from: f */
    public final euf f91758f;

    /* JADX INFO: renamed from: g */
    public final vj1 f91759g;

    /* JADX INFO: renamed from: h */
    @hib
    public final Integer f91760h;

    public vmg(kmg kmgVar, int i, long j, pmd pmdVar, euf eufVar, euf eufVar2, vj1 vj1Var, @hib Integer num) {
        this.f91753a = (kmg) x7d.checkNotNull(kmgVar);
        this.f91754b = i;
        this.f91755c = j;
        this.f91758f = eufVar2;
        this.f91756d = pmdVar;
        this.f91757e = (euf) x7d.checkNotNull(eufVar);
        this.f91759g = (vj1) x7d.checkNotNull(vj1Var);
        this.f91760h = num;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vmg.class != obj.getClass()) {
            return false;
        }
        vmg vmgVar = (vmg) obj;
        return this.f91753a.equals(vmgVar.f91753a) && this.f91754b == vmgVar.f91754b && this.f91755c == vmgVar.f91755c && this.f91756d.equals(vmgVar.f91756d) && this.f91757e.equals(vmgVar.f91757e) && this.f91758f.equals(vmgVar.f91758f) && this.f91759g.equals(vmgVar.f91759g) && Objects.equals(this.f91760h, vmgVar.f91760h);
    }

    @hib
    public Integer getExpectedCount() {
        return this.f91760h;
    }

    public euf getLastLimboFreeSnapshotVersion() {
        return this.f91758f;
    }

    public pmd getPurpose() {
        return this.f91756d;
    }

    public vj1 getResumeToken() {
        return this.f91759g;
    }

    public long getSequenceNumber() {
        return this.f91755c;
    }

    public euf getSnapshotVersion() {
        return this.f91757e;
    }

    public kmg getTarget() {
        return this.f91753a;
    }

    public int getTargetId() {
        return this.f91754b;
    }

    public int hashCode() {
        return (((((((((((((this.f91753a.hashCode() * 31) + this.f91754b) * 31) + ((int) this.f91755c)) * 31) + this.f91756d.hashCode()) * 31) + this.f91757e.hashCode()) * 31) + this.f91758f.hashCode()) * 31) + this.f91759g.hashCode()) * 31) + Objects.hashCode(this.f91760h);
    }

    public String toString() {
        return "TargetData{target=" + this.f91753a + ", targetId=" + this.f91754b + ", sequenceNumber=" + this.f91755c + ", purpose=" + this.f91756d + ", snapshotVersion=" + this.f91757e + ", lastLimboFreeSnapshotVersion=" + this.f91758f + ", resumeToken=" + this.f91759g + ", expectedCount=" + this.f91760h + '}';
    }

    public vmg withExpectedCount(@hib Integer num) {
        return new vmg(this.f91753a, this.f91754b, this.f91755c, this.f91756d, this.f91757e, this.f91758f, this.f91759g, num);
    }

    public vmg withLastLimboFreeSnapshotVersion(euf eufVar) {
        return new vmg(this.f91753a, this.f91754b, this.f91755c, this.f91756d, this.f91757e, eufVar, this.f91759g, this.f91760h);
    }

    public vmg withResumeToken(vj1 vj1Var, euf eufVar) {
        return new vmg(this.f91753a, this.f91754b, this.f91755c, this.f91756d, eufVar, this.f91758f, vj1Var, null);
    }

    public vmg withSequenceNumber(long j) {
        return new vmg(this.f91753a, this.f91754b, j, this.f91756d, this.f91757e, this.f91758f, this.f91759g, this.f91760h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vmg(kmg kmgVar, int i, long j, pmd pmdVar) {
        euf eufVar = euf.f34067b;
        this(kmgVar, i, j, pmdVar, eufVar, eufVar, lhi.f57653u, null);
    }
}
