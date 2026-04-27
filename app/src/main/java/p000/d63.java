package p000;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import androidx.core.content.FileProvider;
import org.json.JSONObject;
import p000.p53;

/* JADX INFO: loaded from: classes3.dex */
public final class d63 extends p53 {

    /* JADX INFO: renamed from: n */
    @yfb
    public static final C4629a f28505n = new C4629a(null);

    /* JADX INFO: renamed from: o */
    @yfb
    public static final String f28506o = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    /* JADX INFO: renamed from: p */
    @yfb
    public static final String f28507p = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* JADX INFO: renamed from: q */
    @yfb
    public static final String f28508q = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_CREATE_PUBLIC_KEY_CREDENTIAL_REQUEST";

    /* JADX INFO: renamed from: l */
    @yfb
    public final String f28509l;

    /* JADX INFO: renamed from: m */
    @gib
    public final byte[] f28510m;

    /* JADX INFO: renamed from: d63$a */
    public static final class C4629a {
        public /* synthetic */ C4629a(jt3 jt3Var) {
            this();
        }

        public static /* synthetic */ p53.C10798b getRequestDisplayInfo$credentials_release$default(C4629a c4629a, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            return c4629a.getRequestDisplayInfo$credentials_release(str, str2);
        }

        public static /* synthetic */ Bundle toCredentialDataBundle$credentials_release$default(C4629a c4629a, String str, byte[] bArr, int i, Object obj) {
            if ((i & 2) != 0) {
                bArr = null;
            }
            return c4629a.toCredentialDataBundle$credentials_release(str, bArr);
        }

        @c5e(23)
        @do8
        @yfb
        public final d63 createFrom$credentials_release(@yfb Bundle bundle, @gib String str, @yfb Bundle bundle2) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                md8.checkNotNull(string);
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                boolean z = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                p53.C10798b fromCredentialDataBundle = p53.C10798b.f69714e.parseFromCredentialDataBundle(bundle);
                if (fromCredentialDataBundle == null) {
                    fromCredentialDataBundle = getRequestDisplayInfo$credentials_release$default(this, string, null, 2, null);
                }
                return new d63(string, byteArray, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), z, fromCredentialDataBundle, str, bundle, bundle2, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final p53.C10798b getRequestDisplayInfo$credentials_release(@yfb String str, @gib String str2) {
            md8.checkNotNullParameter(str, "requestJson");
            try {
                JSONObject jSONObject = new JSONObject(str).getJSONObject("user");
                String string = jSONObject.getString("name");
                String string2 = jSONObject.isNull(FileProvider.f7405Y) ? null : jSONObject.getString(FileProvider.f7405Y);
                md8.checkNotNullExpressionValue(string, "userName");
                return new p53.C10798b(string, string2, (Icon) null, str2);
            } catch (Exception unused) {
                throw new IllegalArgumentException("user.name must be defined in requestJson");
            }
        }

        @do8
        @yfb
        public final Bundle toCandidateDataBundle$credentials_release(@yfb String str, @gib byte[] bArr) {
            md8.checkNotNullParameter(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(jjd.f50723g, d63.f28508q);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        @do8
        @yfb
        public final Bundle toCredentialDataBundle$credentials_release(@yfb String str, @gib byte[] bArr) {
            md8.checkNotNullParameter(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(jjd.f50723g, d63.f28508q);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        private C4629a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d63(@yfb String str) {
        this(str, null, false, null, false, 30, null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    @gib
    public final byte[] getClientDataHash() {
        return this.f28510m;
    }

    @yfb
    public final String getRequestJson() {
        return this.f28509l;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d63(@yfb String str, @gib byte[] bArr) {
        this(str, bArr, false, null, false, 28, null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d63(@yfb String str, @gib byte[] bArr, boolean z) {
        this(str, bArr, z, null, false, 24, null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d63(@yfb String str, @gib byte[] bArr, boolean z, @gib String str2) {
        this(str, bArr, z, str2, false, 16, null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    public /* synthetic */ d63(String str, byte[] bArr, boolean z, boolean z2, p53.C10798b c10798b, String str2, Bundle bundle, Bundle bundle2, jt3 jt3Var) {
        this(str, bArr, z, z2, c10798b, str2, bundle, bundle2);
    }

    public /* synthetic */ d63(String str, byte[] bArr, boolean z, boolean z2, p53.C10798b c10798b, String str2, Bundle bundle, Bundle bundle2, int i, jt3 jt3Var) {
        this(str, bArr, z, z2, c10798b, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? f28505n.toCredentialDataBundle$credentials_release(str, bArr) : bundle, (i & 128) != 0 ? f28505n.toCandidateDataBundle$credentials_release(str, bArr) : bundle2);
    }

    private d63(String str, byte[] bArr, boolean z, boolean z2, p53.C10798b c10798b, String str2, Bundle bundle, Bundle bundle2) {
        super(jjd.f50722f, bundle, bundle2, false, z, c10798b, str2, z2);
        this.f28509l = str;
        this.f28510m = bArr;
        if (!p4e.f69642a.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public /* synthetic */ d63(String str, byte[] bArr, boolean z, String str2, boolean z2, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public d63(@yfb String str, @gib byte[] bArr, boolean z, @gib String str2, boolean z2) {
        this(str, bArr, z2, z, C4629a.getRequestDisplayInfo$credentials_release$default(f28505n, str, null, 2, null), str2, null, null, 192, null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d63(@yfb String str, @gib byte[] bArr, boolean z, @gib String str2, @gib String str3, boolean z2) {
        this(str, bArr, z2, z, f28505n.getRequestDisplayInfo$credentials_release(str, str3), str2, null, null, 192, null);
        md8.checkNotNullParameter(str, "requestJson");
    }
}
