package p000;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ijh {

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f47216a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final List<String> f47217b;

    public ijh(@yfb Uri uri, @yfb List<String> list) {
        md8.checkNotNullParameter(uri, "trustedBiddingUri");
        md8.checkNotNullParameter(list, "trustedBiddingKeys");
        this.f47216a = uri;
        this.f47217b = list;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ijh)) {
            return false;
        }
        ijh ijhVar = (ijh) obj;
        return md8.areEqual(this.f47216a, ijhVar.f47216a) && md8.areEqual(this.f47217b, ijhVar.f47217b);
    }

    @yfb
    public final List<String> getTrustedBiddingKeys() {
        return this.f47217b;
    }

    @yfb
    public final Uri getTrustedBiddingUri() {
        return this.f47216a;
    }

    public int hashCode() {
        return (this.f47216a.hashCode() * 31) + this.f47217b.hashCode();
    }

    @yfb
    public String toString() {
        return "TrustedBiddingData: trustedBiddingUri=" + this.f47216a + " trustedBiddingKeys=" + this.f47217b;
    }
}
