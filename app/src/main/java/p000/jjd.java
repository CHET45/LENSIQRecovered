package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class jjd extends l63 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C7918a f50721e = new C7918a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f50722f = "androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL";

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f50723g = "androidx.credentials.BUNDLE_KEY_SUBTYPE";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f50724h = "androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON";

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f50725d;

    /* JADX INFO: renamed from: jjd$a */
    public static final class C7918a {
        public /* synthetic */ C7918a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final jjd createFrom$credentials_release(@yfb Bundle bundle) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString(jjd.f50724h);
                md8.checkNotNull(string);
                return new jjd(string, bundle, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final Bundle toBundle$credentials_release(@yfb String str) {
            md8.checkNotNullParameter(str, "authenticationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString(jjd.f50724h, str);
            return bundle;
        }

        private C7918a() {
        }
    }

    public /* synthetic */ jjd(String str, Bundle bundle, jt3 jt3Var) {
        this(str, bundle);
    }

    @yfb
    public final String getAuthenticationResponseJson() {
        return this.f50725d;
    }

    private jjd(String str, Bundle bundle) {
        super(f50722f, bundle);
        this.f50725d = str;
        if (!p4e.f69642a.isValidJSON(str)) {
            throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jjd(@yfb String str) {
        this(str, f50721e.toBundle$credentials_release(str));
        md8.checkNotNullParameter(str, "authenticationResponseJson");
    }
}
