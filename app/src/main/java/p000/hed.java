package p000;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class hed {

    /* JADX INFO: renamed from: a */
    @hib
    public final String f43321a;

    /* JADX INFO: renamed from: b */
    @hib
    public final String f43322b;

    /* JADX INFO: renamed from: c */
    @hib
    public final String f43323c;

    /* JADX INFO: renamed from: d */
    @hib
    public final String f43324d;

    /* JADX INFO: renamed from: e */
    @hib
    public final String f43325e;

    public hed(@hib String str, @hib String str2, @hib String str3, @hib String str4, @hib String str5) {
        this.f43321a = str;
        this.f43322b = str2;
        this.f43323c = str3;
        this.f43324d = str4;
        this.f43325e = str5;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hed)) {
            return false;
        }
        hed hedVar = (hed) obj;
        return x0i.areEqual(this.f43321a, hedVar.f43321a) && x0i.areEqual(this.f43322b, hedVar.f43322b) && x0i.areEqual(this.f43323c, hedVar.f43323c) && x0i.areEqual(this.f43324d, hedVar.f43324d) && x0i.areEqual(this.f43325e, hedVar.f43325e);
    }

    public int hashCode() {
        String str = this.f43321a;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f43322b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f43323c;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f43324d;
        int iHashCode4 = (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f43325e;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }
}
