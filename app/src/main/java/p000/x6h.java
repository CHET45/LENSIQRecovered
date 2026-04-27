package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
@ovh
public final class x6h {

    /* JADX INFO: renamed from: a */
    public final int f96899a;

    /* JADX INFO: renamed from: b */
    public final u6h[] f96900b;

    /* JADX INFO: renamed from: c */
    public int f96901c;

    public x6h(u6h... u6hVarArr) {
        this.f96900b = u6hVarArr;
        this.f96899a = u6hVarArr.length;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x6h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f96900b, ((x6h) obj).f96900b);
    }

    @hib
    public u6h get(int i) {
        return this.f96900b[i];
    }

    public u6h[] getAll() {
        return (u6h[]) this.f96900b.clone();
    }

    public int hashCode() {
        if (this.f96901c == 0) {
            this.f96901c = 527 + Arrays.hashCode(this.f96900b);
        }
        return this.f96901c;
    }
}
