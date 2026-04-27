package p000;

import android.content.ComponentName;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class w47 extends t63 {

    /* JADX INFO: renamed from: k */
    @yfb
    public static final C14376a f93217k = new C14376a(null);

    /* JADX INFO: renamed from: l */
    @yfb
    public static final String f93218l = "androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH";

    /* JADX INFO: renamed from: m */
    @yfb
    public static final String f93219m = "androidx.credentials.BUNDLE_KEY_REQUEST_JSON";

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f93220n = "androidx.credentials.BUNDLE_VALUE_SUBTYPE_GET_PUBLIC_KEY_CREDENTIAL_OPTION";

    /* JADX INFO: renamed from: i */
    @yfb
    public final String f93221i;

    /* JADX INFO: renamed from: j */
    @gib
    public final byte[] f93222j;

    /* JADX INFO: renamed from: w47$a */
    public static final class C14376a {
        public /* synthetic */ C14376a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final w47 createFrom$credentials_release(@yfb Bundle bundle, @yfb Set<ComponentName> set, @yfb Bundle bundle2) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(set, "allowedProviders");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                md8.checkNotNull(string);
                return new w47(string, byteArray, set, bundle, bundle2, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final Bundle toRequestDataBundle$credentials_release(@yfb String str, @gib byte[] bArr) {
            md8.checkNotNullParameter(str, "requestJson");
            Bundle bundle = new Bundle();
            bundle.putString(jjd.f50723g, w47.f93220n);
            bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
            bundle.putByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH", bArr);
            return bundle;
        }

        private C14376a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w47(@yfb String str) {
        this(str, (byte[]) null, (Set) null, 6, (jt3) null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    @gib
    public final byte[] getClientDataHash() {
        return this.f93222j;
    }

    @yfb
    public final String getRequestJson() {
        return this.f93221i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public w47(@yfb String str, @gib byte[] bArr) {
        this(str, bArr, (Set) null, 4, (jt3) null);
        md8.checkNotNullParameter(str, "requestJson");
    }

    public /* synthetic */ w47(String str, byte[] bArr, Set set, Bundle bundle, Bundle bundle2, jt3 jt3Var) {
        this(str, bArr, (Set<ComponentName>) set, bundle, bundle2);
    }

    private w47(String str, byte[] bArr, Set<ComponentName> set, Bundle bundle, Bundle bundle2) {
        super(jjd.f50722f, bundle, bundle2, false, true, set);
        this.f93221i = str;
        this.f93222j = bArr;
        if (!p4e.f69642a.isValidJSON(str)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }

    public /* synthetic */ w47(String str, byte[] bArr, Set set, int i, jt3 jt3Var) {
        this(str, (i & 2) != 0 ? null : bArr, (i & 4) != 0 ? w6f.emptySet() : set);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @yn8
    public w47(@yfb String str, @gib byte[] bArr, @yfb Set<ComponentName> set) {
        md8.checkNotNullParameter(str, "requestJson");
        md8.checkNotNullParameter(set, "allowedProviders");
        C14376a c14376a = f93217k;
        this(str, bArr, set, c14376a.toRequestDataBundle$credentials_release(str, bArr), c14376a.toRequestDataBundle$credentials_release(str, bArr));
    }
}
