package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k74 {

    /* JADX INFO: renamed from: a */
    public final String f52718a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f52719b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f52720c;

    public k74(String str, @hib String str2, @hib String str3) {
        this.f52718a = str;
        this.f52719b = str2;
        this.f52720c = str3;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || k74.class != obj.getClass()) {
            return false;
        }
        k74 k74Var = (k74) obj;
        return x0i.areEqual(this.f52718a, k74Var.f52718a) && x0i.areEqual(this.f52719b, k74Var.f52719b) && x0i.areEqual(this.f52720c, k74Var.f52720c);
    }

    public int hashCode() {
        int iHashCode = this.f52718a.hashCode() * 31;
        String str = this.f52719b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f52720c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }
}
