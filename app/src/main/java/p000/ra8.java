package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class ra8 extends cr7 {

    /* JADX INFO: renamed from: e */
    public static final String f77580e = "----";

    /* JADX INFO: renamed from: b */
    public final String f77581b;

    /* JADX INFO: renamed from: c */
    public final String f77582c;

    /* JADX INFO: renamed from: d */
    public final String f77583d;

    public ra8(String str, String str2, String str3) {
        super("----");
        this.f77581b = str;
        this.f77582c = str2;
        this.f77583d = str3;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ra8.class != obj.getClass()) {
            return false;
        }
        ra8 ra8Var = (ra8) obj;
        return Objects.equals(this.f77582c, ra8Var.f77582c) && Objects.equals(this.f77581b, ra8Var.f77581b) && Objects.equals(this.f77583d, ra8Var.f77583d);
    }

    public int hashCode() {
        String str = this.f77581b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f77582c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f77583d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": domain=" + this.f77581b + ", description=" + this.f77582c;
    }
}
