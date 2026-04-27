package p000;

import android.adservices.common.AdTechIdentifier;
import p000.e5e;
import p000.p7e;

/* JADX INFO: renamed from: eh */
/* JADX INFO: loaded from: classes3.dex */
@igg({"ClassVerificationFailure"})
public final class C5297eh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f32956a;

    public C5297eh(@yfb String str) {
        md8.checkNotNullParameter(str, "identifier");
        this.f32956a = str;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public final AdTechIdentifier convertToAdServices$ads_adservices_release() {
        AdTechIdentifier adTechIdentifierFromString = AdTechIdentifier.fromString(this.f32956a);
        md8.checkNotNullExpressionValue(adTechIdentifierFromString, "fromString(identifier)");
        return adTechIdentifierFromString;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5297eh) {
            return md8.areEqual(this.f32956a, ((C5297eh) obj).f32956a);
        }
        return false;
    }

    @yfb
    public final String getIdentifier() {
        return this.f32956a;
    }

    public int hashCode() {
        return this.f32956a.hashCode();
    }

    @yfb
    public String toString() {
        return String.valueOf(this.f32956a);
    }
}
