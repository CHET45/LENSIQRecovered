package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class e63 extends q53 {

    /* JADX INFO: renamed from: e */
    @yfb
    public static final C5136a f31893e = new C5136a(null);

    /* JADX INFO: renamed from: f */
    @yfb
    public static final String f31894f = "androidx.credentials.BUNDLE_KEY_REGISTRATION_RESPONSE_JSON";

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f31895d;

    /* JADX INFO: renamed from: e63$a */
    public static final class C5136a {
        public /* synthetic */ C5136a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final e63 createFrom$credentials_release(@yfb Bundle bundle) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString(e63.f31894f);
                md8.checkNotNull(string);
                return new e63(string, bundle, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final Bundle toBundle$credentials_release(@yfb String str) {
            md8.checkNotNullParameter(str, "registrationResponseJson");
            Bundle bundle = new Bundle();
            bundle.putString(e63.f31894f, str);
            return bundle;
        }

        private C5136a() {
        }
    }

    public /* synthetic */ e63(String str, Bundle bundle, jt3 jt3Var) {
        this(str, bundle);
    }

    @yfb
    public final String getRegistrationResponseJson() {
        return this.f31895d;
    }

    private e63(String str, Bundle bundle) {
        super(jjd.f50722f, bundle);
        this.f31895d = str;
        if (!p4e.f69642a.isValidJSON(str)) {
            throw new IllegalArgumentException("registrationResponseJson must not be empty, and must be a valid JSON");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e63(@yfb String str) {
        this(str, f31893e.toBundle$credentials_release(str));
        md8.checkNotNullParameter(str, "registrationResponseJson");
    }
}
