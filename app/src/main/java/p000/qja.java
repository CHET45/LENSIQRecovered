package p000;

import p000.vna;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class qja {

    /* JADX INFO: renamed from: a */
    public final vna.C14175b f74599a;

    /* JADX INFO: renamed from: b */
    public final long f74600b;

    /* JADX INFO: renamed from: c */
    public final long f74601c;

    /* JADX INFO: renamed from: d */
    public final long f74602d;

    /* JADX INFO: renamed from: e */
    public final long f74603e;

    /* JADX INFO: renamed from: f */
    public final boolean f74604f;

    /* JADX INFO: renamed from: g */
    public final boolean f74605g;

    /* JADX INFO: renamed from: h */
    public final boolean f74606h;

    /* JADX INFO: renamed from: i */
    public final boolean f74607i;

    public qja(vna.C14175b c14175b, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        u80.checkArgument(!z4 || z2);
        u80.checkArgument(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        u80.checkArgument(z5);
        this.f74599a = c14175b;
        this.f74600b = j;
        this.f74601c = j2;
        this.f74602d = j3;
        this.f74603e = j4;
        this.f74604f = z;
        this.f74605g = z2;
        this.f74606h = z3;
        this.f74607i = z4;
    }

    public qja copyWithRequestedContentPositionUs(long j) {
        return j == this.f74601c ? this : new qja(this.f74599a, this.f74600b, j, this.f74602d, this.f74603e, this.f74604f, this.f74605g, this.f74606h, this.f74607i);
    }

    public qja copyWithStartPositionUs(long j) {
        return j == this.f74600b ? this : new qja(this.f74599a, j, this.f74601c, this.f74602d, this.f74603e, this.f74604f, this.f74605g, this.f74606h, this.f74607i);
    }

    public boolean equals(@hib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || qja.class != obj.getClass()) {
            return false;
        }
        qja qjaVar = (qja) obj;
        return this.f74600b == qjaVar.f74600b && this.f74601c == qjaVar.f74601c && this.f74602d == qjaVar.f74602d && this.f74603e == qjaVar.f74603e && this.f74604f == qjaVar.f74604f && this.f74605g == qjaVar.f74605g && this.f74606h == qjaVar.f74606h && this.f74607i == qjaVar.f74607i && x0i.areEqual(this.f74599a, qjaVar.f74599a);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f74599a.hashCode()) * 31) + ((int) this.f74600b)) * 31) + ((int) this.f74601c)) * 31) + ((int) this.f74602d)) * 31) + ((int) this.f74603e)) * 31) + (this.f74604f ? 1 : 0)) * 31) + (this.f74605g ? 1 : 0)) * 31) + (this.f74606h ? 1 : 0)) * 31) + (this.f74607i ? 1 : 0);
    }
}
