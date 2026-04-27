package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class c21 extends cr7 {

    /* JADX INFO: renamed from: b */
    public final byte[] f15570b;

    public c21(String str, byte[] bArr) {
        super(str);
        this.f15570b = bArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c21.class != obj.getClass()) {
            return false;
        }
        c21 c21Var = (c21) obj;
        return this.f27130a.equals(c21Var.f27130a) && Arrays.equals(this.f15570b, c21Var.f15570b);
    }

    public int hashCode() {
        return ((527 + this.f27130a.hashCode()) * 31) + Arrays.hashCode(this.f15570b);
    }
}
