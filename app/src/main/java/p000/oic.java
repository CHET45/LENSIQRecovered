package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nPasswordCredential.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PasswordCredential.kt\nandroidx/credentials/PasswordCredential\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class oic extends l63 {

    /* JADX INFO: renamed from: f */
    @yfb
    public static final C10387a f67747f = new C10387a(null);

    /* JADX INFO: renamed from: g */
    @yfb
    public static final String f67748g = "android.credentials.TYPE_PASSWORD_CREDENTIAL";

    /* JADX INFO: renamed from: h */
    @yfb
    public static final String f67749h = "androidx.credentials.BUNDLE_KEY_ID";

    /* JADX INFO: renamed from: i */
    @yfb
    public static final String f67750i = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f67751d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f67752e;

    /* JADX INFO: renamed from: oic$a */
    public static final class C10387a {
        public /* synthetic */ C10387a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final oic createFrom$credentials_release(@yfb Bundle bundle) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                md8.checkNotNull(string);
                md8.checkNotNull(string2);
                return new oic(string, string2, bundle, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final Bundle toBundle$credentials_release(@yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(str, "id");
            md8.checkNotNullParameter(str2, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
            return bundle;
        }

        private C10387a() {
        }
    }

    public /* synthetic */ oic(String str, String str2, Bundle bundle, jt3 jt3Var) {
        this(str, str2, bundle);
    }

    @yfb
    public final String getId() {
        return this.f67751d;
    }

    @yfb
    public final String getPassword() {
        return this.f67752e;
    }

    private oic(String str, String str2, Bundle bundle) {
        super(f67748g, bundle);
        this.f67751d = str;
        this.f67752e = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public oic(@yfb String str, @yfb String str2) {
        this(str, str2, f67747f.toBundle$credentials_release(str, str2));
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }
}
