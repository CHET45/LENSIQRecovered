package p000;

import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.text.TextUtils;
import p000.p7e;
import p000.ymh;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p53 {

    /* JADX INFO: renamed from: i */
    @yfb
    public static final C10797a f69703i = new C10797a(null);

    /* JADX INFO: renamed from: j */
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f69704j = "androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS";

    /* JADX INFO: renamed from: k */
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f69705k = "androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED";

    /* JADX INFO: renamed from: a */
    @yfb
    public final String f69706a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final Bundle f69707b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final Bundle f69708c;

    /* JADX INFO: renamed from: d */
    public final boolean f69709d;

    /* JADX INFO: renamed from: e */
    public final boolean f69710e;

    /* JADX INFO: renamed from: f */
    @yfb
    public final C10798b f69711f;

    /* JADX INFO: renamed from: g */
    @gib
    public final String f69712g;

    /* JADX INFO: renamed from: h */
    public final boolean f69713h;

    /* JADX INFO: renamed from: p53$a */
    public static final class C10797a {
        public /* synthetic */ C10797a(jt3 jt3Var) {
            this();
        }

        public static /* synthetic */ p53 createFrom$default(C10797a c10797a, String str, Bundle bundle, Bundle bundle2, boolean z, String str2, int i, Object obj) {
            if ((i & 16) != 0) {
                str2 = null;
            }
            return c10797a.createFrom(str, bundle, bundle2, z, str2);
        }

        @c5e(23)
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        public final p53 createFrom(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @gib String str2) {
            md8.checkNotNullParameter(str, "type");
            md8.checkNotNullParameter(bundle, "credentialData");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            try {
                if (md8.areEqual(str, oic.f67748g)) {
                    return z53.f104218n.createFrom$credentials_release(bundle, str2, bundle2);
                }
                if (!md8.areEqual(str, jjd.f50722f)) {
                    throw new qv6();
                }
                String string = bundle.getString(jjd.f50723g);
                if (string != null && string.hashCode() == 589054771 && string.equals(d63.f28508q)) {
                    return d63.f28505n.createFrom$credentials_release(bundle, str2, bundle2);
                }
                throw new qv6();
            } catch (qv6 unused) {
                C10798b fromCredentialDataBundle = C10798b.f69714e.parseFromCredentialDataBundle(bundle);
                if (fromCredentialDataBundle == null) {
                    return null;
                }
                return new t53(str, bundle, bundle2, z, fromCredentialDataBundle, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), str2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false));
            }
        }

        private C10797a() {
        }
    }

    /* JADX INFO: renamed from: p53$b */
    @dwf({"SMAP\nCreateCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreateCredentialRequest.kt\nandroidx/credentials/CreateCredentialRequest$DisplayInfo\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1#2:262\n*E\n"})
    public static final class C10798b {

        /* JADX INFO: renamed from: e */
        @yfb
        public static final a f69714e = new a(null);

        /* JADX INFO: renamed from: f */
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final String f69715f = "androidx.credentials.BUNDLE_KEY_REQUEST_DISPLAY_INFO";

        /* JADX INFO: renamed from: g */
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final String f69716g = "androidx.credentials.BUNDLE_KEY_USER_ID";

        /* JADX INFO: renamed from: h */
        @yfb
        public static final String f69717h = "androidx.credentials.BUNDLE_KEY_USER_DISPLAY_NAME";

        /* JADX INFO: renamed from: i */
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public static final String f69718i = "androidx.credentials.BUNDLE_KEY_CREDENTIAL_TYPE_ICON";

        /* JADX INFO: renamed from: j */
        @yfb
        public static final String f69719j = "androidx.credentials.BUNDLE_KEY_DEFAULT_PROVIDER";

        /* JADX INFO: renamed from: a */
        @yfb
        public final CharSequence f69720a;

        /* JADX INFO: renamed from: b */
        @gib
        public final CharSequence f69721b;

        /* JADX INFO: renamed from: c */
        @gib
        public final Icon f69722c;

        /* JADX INFO: renamed from: d */
        @gib
        public final String f69723d;

        /* JADX INFO: renamed from: p53$b$a */
        public static final class a {
            public /* synthetic */ a(jt3 jt3Var) {
                this();
            }

            @c5e(23)
            @gib
            @p7e({p7e.EnumC10826a.f69934a})
            @do8
            public final C10798b parseFromCredentialDataBundle(@yfb Bundle bundle) {
                md8.checkNotNullParameter(bundle, ymh.InterfaceC15729h.f102263c);
                try {
                    Bundle bundle2 = bundle.getBundle(C10798b.f69715f);
                    md8.checkNotNull(bundle2);
                    CharSequence charSequence = bundle2.getCharSequence(C10798b.f69716g);
                    CharSequence charSequence2 = bundle2.getCharSequence(C10798b.f69717h);
                    Icon icon = (Icon) bundle2.getParcelable(C10798b.f69718i);
                    String string = bundle2.getString(C10798b.f69719j);
                    md8.checkNotNull(charSequence);
                    return new C10798b(charSequence, charSequence2, icon, string);
                } catch (Exception unused) {
                    return null;
                }
            }

            private a() {
            }
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @yn8
        public C10798b(@yfb CharSequence charSequence) {
            this(charSequence, (CharSequence) null, 2, (jt3) (0 == true ? 1 : 0));
            md8.checkNotNullParameter(charSequence, "userId");
        }

        @c5e(23)
        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        @do8
        public static final C10798b parseFromCredentialDataBundle(@yfb Bundle bundle) {
            return f69714e.parseFromCredentialDataBundle(bundle);
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final Icon getCredentialTypeIcon() {
            return this.f69722c;
        }

        @gib
        @p7e({p7e.EnumC10826a.f69934a})
        public final String getPreferDefaultProvider() {
            return this.f69723d;
        }

        @gib
        public final CharSequence getUserDisplayName() {
            return this.f69721b;
        }

        @yfb
        public final CharSequence getUserId() {
            return this.f69720a;
        }

        @c5e(23)
        @yfb
        @p7e({p7e.EnumC10826a.f69934a})
        public final Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putCharSequence(f69716g, this.f69720a);
            if (!TextUtils.isEmpty(this.f69721b)) {
                bundle.putCharSequence(f69717h, this.f69721b);
            }
            if (!TextUtils.isEmpty(this.f69723d)) {
                bundle.putString(f69719j, this.f69723d);
            }
            return bundle;
        }

        public C10798b(@yfb CharSequence charSequence, @gib CharSequence charSequence2, @gib Icon icon, @gib String str) {
            md8.checkNotNullParameter(charSequence, "userId");
            this.f69720a = charSequence;
            this.f69721b = charSequence2;
            this.f69722c = icon;
            this.f69723d = str;
            if (charSequence.length() <= 0) {
                throw new IllegalArgumentException("userId should not be empty");
            }
        }

        public /* synthetic */ C10798b(CharSequence charSequence, CharSequence charSequence2, int i, jt3 jt3Var) {
            this(charSequence, (i & 2) != 0 ? null : charSequence2);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        @yn8
        public C10798b(@yfb CharSequence charSequence, @gib CharSequence charSequence2) {
            this(charSequence, charSequence2, (Icon) null, (String) null);
            md8.checkNotNullParameter(charSequence, "userId");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public C10798b(@yfb CharSequence charSequence, @gib CharSequence charSequence2, @gib String str) {
            this(charSequence, charSequence2, (Icon) null, str);
            md8.checkNotNullParameter(charSequence, "userId");
        }
    }

    public p53(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, boolean z2, @yfb C10798b c10798b, @gib String str2, boolean z3) {
        md8.checkNotNullParameter(str, "type");
        md8.checkNotNullParameter(bundle, "credentialData");
        md8.checkNotNullParameter(bundle2, "candidateQueryData");
        md8.checkNotNullParameter(c10798b, "displayInfo");
        this.f69706a = str;
        this.f69707b = bundle;
        this.f69708c = bundle2;
        this.f69709d = z;
        this.f69710e = z2;
        this.f69711f = c10798b;
        this.f69712g = str2;
        this.f69713h = z3;
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
        bundle.putBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", z3);
        bundle2.putBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", z2);
    }

    @c5e(23)
    @gib
    @p7e({p7e.EnumC10826a.f69934a})
    @do8
    public static final p53 createFrom(@yfb String str, @yfb Bundle bundle, @yfb Bundle bundle2, boolean z, @gib String str2) {
        return f69703i.createFrom(str, bundle, bundle2, z, str2);
    }

    @yfb
    public final Bundle getCandidateQueryData() {
        return this.f69708c;
    }

    @yfb
    public final Bundle getCredentialData() {
        return this.f69707b;
    }

    @yfb
    public final C10798b getDisplayInfo() {
        return this.f69711f;
    }

    @gib
    public final String getOrigin() {
        return this.f69712g;
    }

    @yfb
    public final String getType() {
        return this.f69706a;
    }

    public final boolean isAutoSelectAllowed() {
        return this.f69710e;
    }

    public final boolean isSystemProviderRequired() {
        return this.f69709d;
    }

    @xn8(name = "preferImmediatelyAvailableCredentials")
    public final boolean preferImmediatelyAvailableCredentials() {
        return this.f69713h;
    }
}
