package p000;

import android.adservices.measurement.WebTriggerRegistrationRequest;
import android.net.Uri;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import p000.e5e;

/* JADX INFO: loaded from: classes3.dex */
public final class lji {

    /* JADX INFO: renamed from: a */
    @yfb
    public final List<hji> f57746a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Uri f57747b;

    public lji(@yfb List<hji> list, @yfb Uri uri) {
        md8.checkNotNullParameter(list, "webTriggerParams");
        md8.checkNotNullParameter(uri, FirebaseAnalytics.C3552d.f23234z);
        this.f57746a = list;
        this.f57747b = uri;
    }

    @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
    @yfb
    @igg({"ClassVerificationFailure", "NewApi"})
    public final WebTriggerRegistrationRequest convertToAdServices$ads_adservices_release() {
        kji.m14802a();
        WebTriggerRegistrationRequest webTriggerRegistrationRequestBuild = jji.m14146a(hji.f43835c.convertWebTriggerParams$ads_adservices_release(this.f57746a), this.f57747b).build();
        md8.checkNotNullExpressionValue(webTriggerRegistrationRequestBuild, "Builder(\n               …   )\n            .build()");
        return webTriggerRegistrationRequestBuild;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lji)) {
            return false;
        }
        lji ljiVar = (lji) obj;
        return md8.areEqual(this.f57746a, ljiVar.f57746a) && md8.areEqual(this.f57747b, ljiVar.f57747b);
    }

    @yfb
    public final Uri getDestination() {
        return this.f57747b;
    }

    @yfb
    public final List<hji> getWebTriggerParams() {
        return this.f57746a;
    }

    public int hashCode() {
        return (this.f57746a.hashCode() * 31) + this.f57747b.hashCode();
    }

    @yfb
    public String toString() {
        return "WebTriggerRegistrationRequest { WebTriggerParams=" + this.f57746a + ", Destination=" + this.f57747b;
    }
}
