package p000;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class w6h {

    /* JADX INFO: renamed from: a */
    public final int f93434a;

    /* JADX INFO: renamed from: b */
    public final v6h[] f93435b;

    /* JADX INFO: renamed from: c */
    public int f93436c;

    public w6h(v6h... v6hVarArr) {
        this.f93435b = v6hVarArr;
        this.f93434a = v6hVarArr.length;
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w6h.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f93435b, ((w6h) obj).f93435b);
    }

    @hib
    public v6h get(int i) {
        return this.f93435b[i];
    }

    public v6h[] getAll() {
        return (v6h[]) this.f93435b.clone();
    }

    public int hashCode() {
        if (this.f93436c == 0) {
            this.f93436c = 527 + Arrays.hashCode(this.f93435b);
        }
        return this.f93436c;
    }
}
