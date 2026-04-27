package p000;

import android.adservices.common.AdSelectionSignals;
import p000.e5e;
import p000.p7e;

/* JADX INFO: renamed from: bh */
/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class C1886bh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f13708a;

    public C1886bh(@yfb String str) {
        md8.checkNotNullParameter(str, "signals");
        this.f13708a = str;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdSelectionSignals convertToAdServices$ads_adservices_release() {
        AdSelectionSignals adSelectionSignalsFromString = AdSelectionSignals.fromString(this.f13708a);
        md8.checkNotNullExpressionValue(adSelectionSignalsFromString, "fromString(signals)");
        return adSelectionSignalsFromString;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1886bh) {
            return md8.areEqual(this.f13708a, ((C1886bh) obj).f13708a);
        }
        return false;
    }

    @yfb
    public final String getSignals() {
        return this.f13708a;
    }

    public int hashCode() {
        return this.f13708a.hashCode();
    }

    @yfb
    public String toString() {
        return "AdSelectionSignals: " + this.f13708a;
    }
}
