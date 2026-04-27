package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class njd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f64765a;

    /* JADX INFO: renamed from: b */
    public final long f64766b;

    public njd(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "type");
        this.f64765a = str;
        this.f64766b = j;
    }

    public static /* synthetic */ njd copy$default(njd njdVar, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = njdVar.f64765a;
        }
        if ((i & 2) != 0) {
            j = njdVar.f64766b;
        }
        return njdVar.copy(str, j);
    }

    @yfb
    public final String component1() {
        return this.f64765a;
    }

    public final long component2() {
        return this.f64766b;
    }

    @yfb
    public final njd copy(@yfb String str, long j) {
        md8.checkNotNullParameter(str, "type");
        return new njd(str, j);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof njd)) {
            return false;
        }
        njd njdVar = (njd) obj;
        return md8.areEqual(this.f64765a, njdVar.f64765a) && this.f64766b == njdVar.f64766b;
    }

    public final long getAlg() {
        return this.f64766b;
    }

    @yfb
    public final String getType() {
        return this.f64765a;
    }

    public int hashCode() {
        return (this.f64765a.hashCode() * 31) + Long.hashCode(this.f64766b);
    }

    @yfb
    public String toString() {
        return "PublicKeyCredentialParameters(type=" + this.f64765a + ", alg=" + this.f64766b + ')';
    }
}
