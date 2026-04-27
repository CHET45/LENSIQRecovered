package p000;

import android.adservices.adselection.PersistAdSelectionResultRequest;
import java.util.Arrays;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15648a
public final class cqc {

    /* JADX INFO: renamed from: a */
    public final long f27101a;

    /* JADX INFO: renamed from: b */
    @gib
    public final C5297eh f27102b;

    /* JADX INFO: renamed from: c */
    @gib
    public final byte[] f27103c;

    @yn8
    public cqc(long j) {
        this(j, null, null, 6, null);
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final PersistAdSelectionResultRequest convertToAdServices$ads_adservices_release() {
        PersistAdSelectionResultRequest.Builder adSelectionId = bqc.m3346a().setAdSelectionId(this.f27101a);
        C5297eh c5297eh = this.f27102b;
        PersistAdSelectionResultRequest persistAdSelectionResultRequestBuild = adSelectionId.setSeller(c5297eh != null ? c5297eh.convertToAdServices$ads_adservices_release() : null).setAdSelectionResult(this.f27103c).build();
        md8.checkNotNullExpressionValue(persistAdSelectionResultRequestBuild, "Builder()\n            .s…ult)\n            .build()");
        return persistAdSelectionResultRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cqc)) {
            return false;
        }
        cqc cqcVar = (cqc) obj;
        return this.f27101a == cqcVar.f27101a && md8.areEqual(this.f27102b, cqcVar.f27102b) && Arrays.equals(this.f27103c, cqcVar.f27103c);
    }

    public final long getAdSelectionId() {
        return this.f27101a;
    }

    @gib
    public final byte[] getAdSelectionResult() {
        return this.f27103c;
    }

    @gib
    public final C5297eh getSeller() {
        return this.f27102b;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f27101a) * 31;
        C5297eh c5297eh = this.f27102b;
        int iHashCode2 = (iHashCode + (c5297eh != null ? c5297eh.hashCode() : 0)) * 31;
        byte[] bArr = this.f27103c;
        return iHashCode2 + (bArr != null ? bArr.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "PersistAdSelectionResultRequest: adSelectionId=" + this.f27101a + ", seller=" + this.f27102b + ", adSelectionResult=" + this.f27103c;
    }

    @yn8
    public cqc(long j, @gib C5297eh c5297eh) {
        this(j, c5297eh, null, 4, null);
    }

    @yn8
    public cqc(long j, @gib C5297eh c5297eh, @gib byte[] bArr) {
        this.f27101a = j;
        this.f27102b = c5297eh;
        this.f27103c = bArr;
    }

    public /* synthetic */ cqc(long j, C5297eh c5297eh, byte[] bArr, int i, jt3 jt3Var) {
        this(j, (i & 2) != 0 ? null : c5297eh, (i & 4) != 0 ? null : bArr);
    }
}
