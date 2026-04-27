package p000;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class vb2 extends cr7 {

    /* JADX INFO: renamed from: e */
    public static final String f90537e = "COMM";

    /* JADX INFO: renamed from: b */
    public final String f90538b;

    /* JADX INFO: renamed from: c */
    public final String f90539c;

    /* JADX INFO: renamed from: d */
    public final String f90540d;

    public vb2(String str, String str2, String str3) {
        super("COMM");
        this.f90538b = str;
        this.f90539c = str2;
        this.f90540d = str3;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vb2.class != obj.getClass()) {
            return false;
        }
        vb2 vb2Var = (vb2) obj;
        return Objects.equals(this.f90539c, vb2Var.f90539c) && Objects.equals(this.f90538b, vb2Var.f90538b) && Objects.equals(this.f90540d, vb2Var.f90540d);
    }

    public int hashCode() {
        String str = this.f90538b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f90539c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f90540d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": language=" + this.f90538b + ", description=" + this.f90539c + ", text=" + this.f90540d;
    }
}
