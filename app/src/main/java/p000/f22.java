package p000;

import android.content.pm.SigningInfo;
import android.service.credentials.ClearCredentialStateRequest;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@c5e(34)
@p7e({p7e.EnumC10826a.f69935b})
public final class f22 {

    /* JADX INFO: renamed from: a */
    @yfb
    public static final C5545a f34732a = new C5545a(null);

    /* JADX INFO: renamed from: f22$a */
    public static final class C5545a {
        public /* synthetic */ C5545a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final iid convertToJetpackRequest$credentials_release(@yfb ClearCredentialStateRequest clearCredentialStateRequest) {
            md8.checkNotNullParameter(clearCredentialStateRequest, "request");
            String packageName = clearCredentialStateRequest.getCallingAppInfo().getPackageName();
            md8.checkNotNullExpressionValue(packageName, "request.callingAppInfo.packageName");
            SigningInfo signingInfo = clearCredentialStateRequest.getCallingAppInfo().getSigningInfo();
            md8.checkNotNullExpressionValue(signingInfo, "request.callingAppInfo.signingInfo");
            return new iid(new so1(packageName, signingInfo, clearCredentialStateRequest.getCallingAppInfo().getOrigin()));
        }

        private C5545a() {
        }
    }
}
