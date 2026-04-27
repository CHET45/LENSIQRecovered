package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class e37 extends cr7 {

    /* JADX INFO: renamed from: f */
    public static final String f31655f = "GEOB";

    /* JADX INFO: renamed from: b */
    public final String f31656b;

    /* JADX INFO: renamed from: c */
    public final String f31657c;

    /* JADX INFO: renamed from: d */
    public final String f31658d;

    /* JADX INFO: renamed from: e */
    public final byte[] f31659e;

    public e37(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f31656b = str;
        this.f31657c = str2;
        this.f31658d = str3;
        this.f31659e = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e37.class != obj.getClass()) {
            return false;
        }
        e37 e37Var = (e37) obj;
        return Objects.equals(this.f31656b, e37Var.f31656b) && Objects.equals(this.f31657c, e37Var.f31657c) && Objects.equals(this.f31658d, e37Var.f31658d) && Arrays.equals(this.f31659e, e37Var.f31659e);
    }

    public int hashCode() {
        String str = this.f31656b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f31657c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f31658d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f31659e);
    }

    @Override // p000.cr7
    public String toString() {
        return this.f27130a + ": mimeType=" + this.f31656b + ", filename=" + this.f31657c + ", description=" + this.f31658d;
    }
}
