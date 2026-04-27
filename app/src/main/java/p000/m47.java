package p000;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class m47 extends d47 {

    /* JADX INFO: renamed from: p */
    @yfb
    public static final C9137b f59872p = new C9137b(null);

    /* JADX INFO: renamed from: i */
    @yfb
    public final String f59873i;

    /* JADX INFO: renamed from: j */
    @gib
    public final String f59874j;

    /* JADX INFO: renamed from: k */
    public final boolean f59875k;

    /* JADX INFO: renamed from: l */
    @gib
    public final String f59876l;

    /* JADX INFO: renamed from: m */
    @gib
    public final List f59877m;

    /* JADX INFO: renamed from: n */
    public final boolean f59878n;

    /* JADX INFO: renamed from: o */
    public final boolean f59879o;

    /* JADX INFO: renamed from: m47$a */
    public static final class C9136a {

        /* JADX INFO: renamed from: b */
        @gib
        public String f59881b;

        /* JADX INFO: renamed from: c */
        @gib
        public String f59882c;

        /* JADX INFO: renamed from: e */
        public boolean f59884e;

        /* JADX INFO: renamed from: f */
        public boolean f59885f;

        /* JADX INFO: renamed from: g */
        @gib
        public List f59886g;

        /* JADX INFO: renamed from: a */
        @yfb
        public String f59880a = "";

        /* JADX INFO: renamed from: d */
        public boolean f59883d = true;

        @yfb
        public final C9136a associateLinkedAccounts(@efb String str, @gib List<String> list) {
            md8.checkNotNullParameter(str, "linkedServiceId");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("linkedServiceId must be provided if you want to associate linked accounts.");
            }
            this.f59881b = str;
            this.f59886g = list != null ? v82.toList(list) : null;
            return this;
        }

        @yfb
        public final m47 build() {
            return new m47(this.f59880a, this.f59882c, this.f59883d, this.f59881b, this.f59886g, this.f59884e, this.f59885f);
        }

        @yfb
        public final C9136a setAutoSelectEnabled(boolean z) {
            this.f59885f = z;
            return this;
        }

        @yfb
        public final C9136a setFilterByAuthorizedAccounts(boolean z) {
            this.f59883d = z;
            return this;
        }

        @yfb
        public final C9136a setNonce(@gib String str) {
            this.f59882c = str;
            return this;
        }

        @yfb
        public final C9136a setRequestVerifiedPhoneNumber(boolean z) {
            this.f59884e = z;
            return this;
        }

        @yfb
        public final C9136a setServerClientId(@efb String str) {
            md8.checkNotNullParameter(str, "serverClientId");
            if (str.length() <= 0) {
                throw new IllegalArgumentException("serverClientId should not be empty");
            }
            this.f59880a = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: m47$b */
    public static final class C9137b {
        private C9137b() {
        }

        @do8
        @yfb
        public static final Bundle zza(@efb String str, @gib String str2, boolean z, @gib String str3, @gib List list, boolean z2, boolean z3) {
            md8.checkNotNullParameter(str, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", z);
            bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", str3);
            bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", list == null ? null : new ArrayList<>(list));
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", z2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", z3);
            return bundle;
        }

        @do8
        @yfb
        public final m47 createFrom(@efb Bundle bundle) throws k87 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID");
                md8.checkNotNull(string);
                return new m47(string, bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE"), bundle.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", true), bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID"), bundle.getStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES"), bundle.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false), bundle.getBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", false));
            } catch (Exception e) {
                throw new k87(e);
            }
        }

        public /* synthetic */ C9137b(@efb jt3 jt3Var) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m47(@efb String str, @gib String str2, boolean z, @gib String str3, @gib List<String> list, boolean z2, boolean z3) {
        super(i87.f46023l, C9137b.zza(str, str2, z, str3, list, z2, z3), C9137b.zza(str, str2, z, str3, list, z2, z3), true, z3, null, 32, null);
        md8.checkNotNullParameter(str, "serverClientId");
        this.f59873i = str;
        this.f59874j = str2;
        this.f59875k = z;
        this.f59876l = str3;
        this.f59877m = list;
        this.f59878n = z2;
        this.f59879o = z3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
        if (z && z2) {
            throw new IllegalArgumentException("filterByAuthorizedAccounts and requestVerifiedPhoneNumber must not both be true;  the Verified Phone Number feature only works in sign-ups.");
        }
    }

    @do8
    @yfb
    public static final m47 createFrom(@efb Bundle bundle) {
        return f59872p.createFrom(bundle);
    }

    public final boolean getAutoSelectEnabled() {
        return this.f59879o;
    }

    public final boolean getFilterByAuthorizedAccounts() {
        return this.f59875k;
    }

    @hib
    public final List<String> getIdTokenDepositionScopes() {
        return this.f59877m;
    }

    @hib
    public final String getLinkedServiceId() {
        return this.f59876l;
    }

    @hib
    public final String getNonce() {
        return this.f59874j;
    }

    public final boolean getRequestVerifiedPhoneNumber() {
        return this.f59878n;
    }

    @yfb
    public final String getServerClientId() {
        return this.f59873i;
    }
}
