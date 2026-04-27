package p000;

import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class ki0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f54169a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final String f54170b;

    /* JADX INFO: renamed from: c */
    public final boolean f54171c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f54172d;

    public ki0(@yfb String str, @yfb String str2, boolean z, @yfb String str3) {
        md8.checkNotNullParameter(str, "authenticatorAttachment");
        md8.checkNotNullParameter(str2, "residentKey");
        md8.checkNotNullParameter(str3, "userVerification");
        this.f54169a = str;
        this.f54170b = str2;
        this.f54171c = z;
        this.f54172d = str3;
    }

    public static /* synthetic */ ki0 copy$default(ki0 ki0Var, String str, String str2, boolean z, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ki0Var.f54169a;
        }
        if ((i & 2) != 0) {
            str2 = ki0Var.f54170b;
        }
        if ((i & 4) != 0) {
            z = ki0Var.f54171c;
        }
        if ((i & 8) != 0) {
            str3 = ki0Var.f54172d;
        }
        return ki0Var.copy(str, str2, z, str3);
    }

    @yfb
    public final String component1() {
        return this.f54169a;
    }

    @yfb
    public final String component2() {
        return this.f54170b;
    }

    public final boolean component3() {
        return this.f54171c;
    }

    @yfb
    public final String component4() {
        return this.f54172d;
    }

    @yfb
    public final ki0 copy(@yfb String str, @yfb String str2, boolean z, @yfb String str3) {
        md8.checkNotNullParameter(str, "authenticatorAttachment");
        md8.checkNotNullParameter(str2, "residentKey");
        md8.checkNotNullParameter(str3, "userVerification");
        return new ki0(str, str2, z, str3);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ki0)) {
            return false;
        }
        ki0 ki0Var = (ki0) obj;
        return md8.areEqual(this.f54169a, ki0Var.f54169a) && md8.areEqual(this.f54170b, ki0Var.f54170b) && this.f54171c == ki0Var.f54171c && md8.areEqual(this.f54172d, ki0Var.f54172d);
    }

    @yfb
    public final String getAuthenticatorAttachment() {
        return this.f54169a;
    }

    public final boolean getRequireResidentKey() {
        return this.f54171c;
    }

    @yfb
    public final String getResidentKey() {
        return this.f54170b;
    }

    @yfb
    public final String getUserVerification() {
        return this.f54172d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((this.f54169a.hashCode() * 31) + this.f54170b.hashCode()) * 31;
        boolean z = this.f54171c;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return ((iHashCode + r1) * 31) + this.f54172d.hashCode();
    }

    @yfb
    public String toString() {
        return "AuthenticatorSelectionCriteria(authenticatorAttachment=" + this.f54169a + ", residentKey=" + this.f54170b + ", requireResidentKey=" + this.f54171c + ", userVerification=" + this.f54172d + ')';
    }

    public /* synthetic */ ki0(String str, String str2, boolean z, String str3, int i, jt3 jt3Var) {
        this(str, str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "preferred" : str3);
    }
}
