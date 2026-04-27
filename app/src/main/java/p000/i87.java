package p000;

import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class i87 extends tc3 {

    /* JADX INFO: renamed from: k */
    @yfb
    public static final C7182b f46022k = new C7182b(null);

    /* JADX INFO: renamed from: l */
    @yfb
    public static final String f46023l = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL";

    /* JADX INFO: renamed from: m */
    @yfb
    public static final String f46024m = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL";

    /* JADX INFO: renamed from: n */
    @yfb
    public static final String f46025n = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE";

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f46026d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f46027e;

    /* JADX INFO: renamed from: f */
    @gib
    public final String f46028f;

    /* JADX INFO: renamed from: g */
    @gib
    public final String f46029g;

    /* JADX INFO: renamed from: h */
    @gib
    public final String f46030h;

    /* JADX INFO: renamed from: i */
    @gib
    public final Uri f46031i;

    /* JADX INFO: renamed from: j */
    @gib
    public final String f46032j;

    /* JADX INFO: renamed from: i87$a */
    public static final class C7181a {

        /* JADX INFO: renamed from: a */
        @yfb
        public String f46033a = "";

        /* JADX INFO: renamed from: b */
        @yfb
        public String f46034b = "";

        /* JADX INFO: renamed from: c */
        @gib
        public String f46035c;

        /* JADX INFO: renamed from: d */
        @gib
        public String f46036d;

        /* JADX INFO: renamed from: e */
        @gib
        public String f46037e;

        /* JADX INFO: renamed from: f */
        @gib
        public Uri f46038f;

        /* JADX INFO: renamed from: g */
        @gib
        public String f46039g;

        @yfb
        public final i87 build() {
            return new i87(this.f46033a, this.f46034b, this.f46035c, this.f46036d, this.f46037e, this.f46038f, this.f46039g);
        }

        @yfb
        public final C7181a setDisplayName(@gib String str) {
            this.f46035c = str;
            return this;
        }

        @yfb
        public final C7181a setFamilyName(@gib String str) {
            this.f46036d = str;
            return this;
        }

        @yfb
        public final C7181a setGivenName(@gib String str) {
            this.f46037e = str;
            return this;
        }

        @yfb
        public final C7181a setId(@efb String str) {
            md8.checkNotNullParameter(str, "id");
            this.f46033a = str;
            return this;
        }

        @yfb
        public final C7181a setIdToken(@efb String str) {
            md8.checkNotNullParameter(str, "idToken");
            this.f46034b = str;
            return this;
        }

        @yfb
        public final C7181a setPhoneNumber(@gib String str) {
            this.f46039g = str;
            return this;
        }

        @yfb
        public final C7181a setProfilePictureUri(@gib Uri uri) {
            this.f46038f = uri;
            return this;
        }
    }

    /* JADX INFO: renamed from: i87$b */
    public static final class C7182b {
        private C7182b() {
        }

        @do8
        @yfb
        public final i87 createFrom(@efb Bundle bundle) throws k87 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
                String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
                String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
                String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
                String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
                Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
                String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
                md8.checkNotNull(string);
                md8.checkNotNull(string2);
                return new i87(string, string2, string3, string4, string5, uri, string6);
            } catch (Exception e) {
                throw new k87(e);
            }
        }

        public /* synthetic */ C7182b(@efb jt3 jt3Var) {
        }
    }

    public i87(@efb String str, @efb String str2, @gib String str3, @gib String str4, @gib String str5, @gib Uri uri, @gib String str6) {
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "idToken");
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "idToken");
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID", str);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN", str2);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME", str3);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME", str4);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME", str5);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER", str6);
        bundle.putParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", uri);
        super(f46023l, bundle);
        this.f46026d = str;
        this.f46027e = str2;
        this.f46028f = str3;
        this.f46029g = str4;
        this.f46030h = str5;
        this.f46031i = uri;
        this.f46032j = str6;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("id should not be empty");
        }
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("idToken should not be empty");
        }
    }

    @do8
    @yfb
    public static final i87 createFrom(@efb Bundle bundle) {
        return f46022k.createFrom(bundle);
    }

    @hib
    public final String getDisplayName() {
        return this.f46028f;
    }

    @hib
    public final String getFamilyName() {
        return this.f46029g;
    }

    @hib
    public final String getGivenName() {
        return this.f46030h;
    }

    @yfb
    public final String getId() {
        return this.f46026d;
    }

    @yfb
    public final String getIdToken() {
        return this.f46027e;
    }

    @hib
    public final String getPhoneNumber() {
        return this.f46032j;
    }

    @hib
    public final Uri getProfilePictureUri() {
        return this.f46031i;
    }
}
