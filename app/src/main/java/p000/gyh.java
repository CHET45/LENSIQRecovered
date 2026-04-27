package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class gyh extends cr7 {

    /* JADX INFO: renamed from: b */
    @hib
    public final String f41840b;

    /* JADX INFO: renamed from: c */
    public final String f41841c;

    public gyh(String str, @hib String str2, String str3) {
        super(str);
        this.f41840b = str2;
        this.f41841c = str3;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || gyh.class != obj.getClass()) {
            return false;
        }
        gyh gyhVar = (gyh) obj;
        return this.f27130a.equals(gyhVar.f27130a) && Objects.equals(this.f41840b, gyhVar.f41840b) && Objects.equals(this.f41841c, gyhVar.f41841c);
    }

    public int hashCode() {
        int iHashCode = (527 + this.f27130a.hashCode()) * 31;
        String str = this.f41840b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f41841c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": url=" + this.f41841c;
    }
}
