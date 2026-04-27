package p000;

/* JADX INFO: loaded from: classes5.dex */
public final class tmg {

    /* JADX INFO: renamed from: a */
    public final vj1 f85332a;

    /* JADX INFO: renamed from: b */
    public final boolean f85333b;

    /* JADX INFO: renamed from: c */
    public final qy7<ci4> f85334c;

    /* JADX INFO: renamed from: d */
    public final qy7<ci4> f85335d;

    /* JADX INFO: renamed from: e */
    public final qy7<ci4> f85336e;

    public tmg(vj1 vj1Var, boolean z, qy7<ci4> qy7Var, qy7<ci4> qy7Var2, qy7<ci4> qy7Var3) {
        this.f85332a = vj1Var;
        this.f85333b = z;
        this.f85334c = qy7Var;
        this.f85335d = qy7Var2;
        this.f85336e = qy7Var3;
    }

    public static tmg createSynthesizedTargetChangeForCurrentChange(boolean z, vj1 vj1Var) {
        return new tmg(vj1Var, z, ci4.emptyKeySet(), ci4.emptyKeySet(), ci4.emptyKeySet());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tmg.class != obj.getClass()) {
            return false;
        }
        tmg tmgVar = (tmg) obj;
        if (this.f85333b == tmgVar.f85333b && this.f85332a.equals(tmgVar.f85332a) && this.f85334c.equals(tmgVar.f85334c) && this.f85335d.equals(tmgVar.f85335d)) {
            return this.f85336e.equals(tmgVar.f85336e);
        }
        return false;
    }

    public qy7<ci4> getAddedDocuments() {
        return this.f85334c;
    }

    public qy7<ci4> getModifiedDocuments() {
        return this.f85335d;
    }

    public qy7<ci4> getRemovedDocuments() {
        return this.f85336e;
    }

    public vj1 getResumeToken() {
        return this.f85332a;
    }

    public int hashCode() {
        return (((((((this.f85332a.hashCode() * 31) + (this.f85333b ? 1 : 0)) * 31) + this.f85334c.hashCode()) * 31) + this.f85335d.hashCode()) * 31) + this.f85336e.hashCode();
    }

    public boolean isCurrent() {
        return this.f85333b;
    }
}
