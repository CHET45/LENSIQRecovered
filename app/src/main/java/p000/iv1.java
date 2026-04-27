package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class iv1 extends cr7 {

    /* JADX INFO: renamed from: g */
    public static final String f48539g = "CTOC";

    /* JADX INFO: renamed from: b */
    public final String f48540b;

    /* JADX INFO: renamed from: c */
    public final boolean f48541c;

    /* JADX INFO: renamed from: d */
    public final boolean f48542d;

    /* JADX INFO: renamed from: e */
    public final String[] f48543e;

    /* JADX INFO: renamed from: f */
    public final cr7[] f48544f;

    public iv1(String str, boolean z, boolean z2, String[] strArr, cr7[] cr7VarArr) {
        super("CTOC");
        this.f48540b = str;
        this.f48541c = z;
        this.f48542d = z2;
        this.f48543e = strArr;
        this.f48544f = cr7VarArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iv1.class != obj.getClass()) {
            return false;
        }
        iv1 iv1Var = (iv1) obj;
        return this.f48541c == iv1Var.f48541c && this.f48542d == iv1Var.f48542d && Objects.equals(this.f48540b, iv1Var.f48540b) && Arrays.equals(this.f48543e, iv1Var.f48543e) && Arrays.equals(this.f48544f, iv1Var.f48544f);
    }

    public cr7 getSubFrame(int i) {
        return this.f48544f[i];
    }

    public int getSubFrameCount() {
        return this.f48544f.length;
    }

    public int hashCode() {
        int i = (((527 + (this.f48541c ? 1 : 0)) * 31) + (this.f48542d ? 1 : 0)) * 31;
        String str = this.f48540b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
