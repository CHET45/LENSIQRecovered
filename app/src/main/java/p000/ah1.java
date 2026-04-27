package p000;

/* JADX INFO: loaded from: classes5.dex */
public class ah1 implements sg1 {

    /* JADX INFO: renamed from: a */
    public final String f1602a;

    /* JADX INFO: renamed from: b */
    public final int f1603b;

    /* JADX INFO: renamed from: c */
    public final euf f1604c;

    /* JADX INFO: renamed from: d */
    public final int f1605d;

    /* JADX INFO: renamed from: e */
    public final long f1606e;

    public ah1(String str, int i, euf eufVar, int i2, long j) {
        this.f1602a = str;
        this.f1603b = i;
        this.f1604c = eufVar;
        this.f1605d = i2;
        this.f1606e = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ah1 ah1Var = (ah1) obj;
        if (this.f1603b == ah1Var.f1603b && this.f1605d == ah1Var.f1605d && this.f1606e == ah1Var.f1606e && this.f1602a.equals(ah1Var.f1602a)) {
            return this.f1604c.equals(ah1Var.f1604c);
        }
        return false;
    }

    public String getBundleId() {
        return this.f1602a;
    }

    public euf getCreateTime() {
        return this.f1604c;
    }

    public int getSchemaVersion() {
        return this.f1603b;
    }

    public long getTotalBytes() {
        return this.f1606e;
    }

    public int getTotalDocuments() {
        return this.f1605d;
    }

    public int hashCode() {
        int iHashCode = ((((this.f1602a.hashCode() * 31) + this.f1603b) * 31) + this.f1605d) * 31;
        long j = this.f1606e;
        return ((iHashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.f1604c.hashCode();
    }
}
