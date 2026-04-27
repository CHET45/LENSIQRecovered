package p000;

import android.adservices.adselection.GetAdSelectionDataOutcome;
import java.util.Arrays;
import p000.e5e;
import p000.p7e;
import p000.yg5;

/* JADX INFO: loaded from: classes3.dex */
@yg5.InterfaceC15648a
public final class k37 {

    /* JADX INFO: renamed from: a */
    public final long f52521a;

    /* JADX INFO: renamed from: b */
    @gib
    public final byte[] f52522b;

    @yn8
    public k37(long j) {
        this(j, null, 2, null);
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k37)) {
            return false;
        }
        k37 k37Var = (k37) obj;
        return this.f52521a == k37Var.f52521a && Arrays.equals(this.f52522b, k37Var.f52522b);
    }

    @gib
    public final byte[] getAdSelectionData() {
        return this.f52522b;
    }

    public final long getAdSelectionId() {
        return this.f52521a;
    }

    public int hashCode() {
        int iHashCode = Long.hashCode(this.f52521a) * 31;
        byte[] bArr = this.f52522b;
        return iHashCode + (bArr != null ? bArr.hashCode() : 0);
    }

    @yfb
    public String toString() {
        return "GetAdSelectionDataOutcome: adSelectionId=" + this.f52521a + ", adSelectionData=" + this.f52522b;
    }

    @yn8
    public k37(long j, @gib byte[] bArr) {
        this.f52521a = j;
        this.f52522b = bArr;
    }

    public /* synthetic */ k37(long j, byte[] bArr, int i, jt3 jt3Var) {
        this(j, (i & 2) != 0 ? null : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 10), @e5e(extension = 31, version = 10)})
    @p7e({p7e.EnumC10826a.f69934a})
    public k37(@yfb GetAdSelectionDataOutcome getAdSelectionDataOutcome) {
        this(getAdSelectionDataOutcome.getAdSelectionId(), getAdSelectionDataOutcome.getAdSelectionData());
        md8.checkNotNullParameter(getAdSelectionDataOutcome, "response");
    }
}
