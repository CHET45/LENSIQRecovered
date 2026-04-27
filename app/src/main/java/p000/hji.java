package p000;

import android.adservices.measurement.WebTriggerParams;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;
import p000.e5e;

/* JADX INFO: loaded from: classes3.dex */
public final class hji {

    /* JADX INFO: renamed from: c */
    @yfb
    public static final C6874a f43835c = new C6874a(null);

    /* JADX INFO: renamed from: a */
    @yfb
    public final Uri f43836a;

    /* JADX INFO: renamed from: b */
    public final boolean f43837b;

    /* JADX INFO: renamed from: hji$a */
    public static final class C6874a {
        public /* synthetic */ C6874a(jt3 jt3Var) {
            this();
        }

        @e5e.InterfaceC5127a({@e5e(extension = 1000000, version = 4), @e5e(extension = 31, version = 9)})
        @yfb
        @igg({"ClassVerificationFailure", "NewApi"})
        public final List<WebTriggerParams> convertWebTriggerParams$ads_adservices_release(@yfb List<hji> list) {
            md8.checkNotNullParameter(list, "request");
            ArrayList arrayList = new ArrayList();
            for (hji hjiVar : list) {
                gji.m11712a();
                WebTriggerParams webTriggerParamsBuild = fji.m10956a(hjiVar.getRegistrationUri()).setDebugKeyAllowed(hjiVar.getDebugKeyAllowed()).build();
                md8.checkNotNullExpressionValue(webTriggerParamsBuild, "Builder(param.registrati…                 .build()");
                arrayList.add(webTriggerParamsBuild);
            }
            return arrayList;
        }

        private C6874a() {
        }
    }

    public hji(@yfb Uri uri, boolean z) {
        md8.checkNotNullParameter(uri, "registrationUri");
        this.f43836a = uri;
        this.f43837b = z;
    }

    public boolean equals(@gib Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hji)) {
            return false;
        }
        hji hjiVar = (hji) obj;
        return md8.areEqual(this.f43836a, hjiVar.f43836a) && this.f43837b == hjiVar.f43837b;
    }

    public final boolean getDebugKeyAllowed() {
        return this.f43837b;
    }

    @yfb
    public final Uri getRegistrationUri() {
        return this.f43836a;
    }

    public int hashCode() {
        return (this.f43836a.hashCode() * 31) + Boolean.hashCode(this.f43837b);
    }

    @yfb
    public String toString() {
        return "WebTriggerParams { RegistrationUri=" + this.f43836a + ", DebugKeyAllowed=" + this.f43837b + " }";
    }
}
