package p000;

import android.adservices.measurement.WebSourceParams;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import p000.e5e;

/* JADX INFO: loaded from: classes3.dex */
public final class uii {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C13545a f88059c = new C13545a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f88060a;

    /* JADX INFO: renamed from: b */
    public final boolean f88061b;

    /* JADX INFO: renamed from: uii$a */
    public static final class C13545a {
        public /* synthetic */ C13545a(jt3 jt3Var) {
            this();
        }

        @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
        @yfb
        @igg({"ClassVerificationFailure", "NewApi"})
        public final List<WebSourceParams> convertWebSourceParams$ads_adservices_release(@yfb List<uii> list) {
            md8.checkNotNullParameter(list, "request");
            ArrayList arrayList = new ArrayList();
            for (uii uiiVar : list) {
                tii.m22679a();
                WebSourceParams webSourceParamsBuild = sii.m22022a(uiiVar.getRegistrationUri()).setDebugKeyAllowed(uiiVar.getDebugKeyAllowed()).build();
                md8.checkNotNullExpressionValue(webSourceParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webSourceParamsBuild);
            }
            return arrayList;
        }

        private C13545a() {
        }
    }

    public uii(@yfb Uri uri, boolean z) {
        md8.checkNotNullParameter(uri, "registrationUri");
        this.f88060a = uri;
        this.f88061b = z;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uii)) {
            return false;
        }
        uii uiiVar = (uii) obj;
        return md8.areEqual(this.f88060a, uiiVar.f88060a) && this.f88061b == uiiVar.f88061b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f88061b;
    }

    @yfb
    public final Uri getRegistrationUri() {
        return this.f88060a;
    }

    public int hashCode() {
        return (this.f88060a.hashCode() * 31) + Boolean.hashCode(this.f88061b);
    }

    @yfb
    public String toString() {
        return "WebSourceParams { RegistrationUri=" + this.f88060a + ", DebugKeyAllowed=" + this.f88061b + " }";
    }
}
