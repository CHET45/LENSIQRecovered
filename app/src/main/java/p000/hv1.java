package p000;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class hv1 extends cr7 {

    /* JADX INFO: renamed from: h */
    public static final String f44918h = "CHAP";

    /* JADX INFO: renamed from: b */
    public final String f44919b;

    /* JADX INFO: renamed from: c */
    public final int f44920c;

    /* JADX INFO: renamed from: d */
    public final int f44921d;

    /* JADX INFO: renamed from: e */
    public final long f44922e;

    /* JADX INFO: renamed from: f */
    public final long f44923f;

    /* JADX INFO: renamed from: g */
    public final cr7[] f44924g;

    public hv1(String str, int i, int i2, long j, long j2, cr7[] cr7VarArr) {
        super("CHAP");
        this.f44919b = str;
        this.f44920c = i;
        this.f44921d = i2;
        this.f44922e = j;
        this.f44923f = j2;
        this.f44924g = cr7VarArr;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || hv1.class != obj.getClass()) {
            return false;
        }
        hv1 hv1Var = (hv1) obj;
        return this.f44920c == hv1Var.f44920c && this.f44921d == hv1Var.f44921d && this.f44922e == hv1Var.f44922e && this.f44923f == hv1Var.f44923f && Objects.equals(this.f44919b, hv1Var.f44919b) && Arrays.equals(this.f44924g, hv1Var.f44924g);
    }

    public cr7 getSubFrame(int i) {
        return this.f44924g[i];
    }

    public int getSubFrameCount() {
        return this.f44924g.length;
    }

    public int hashCode() {
        int i = (((((((527 + this.f44920c) * 31) + this.f44921d) * 31) + ((int) this.f44922e)) * 31) + ((int) this.f44923f)) * 31;
        String str = this.f44919b;
        return i + (str != null ? str.hashCode() : 0);
    }
}
