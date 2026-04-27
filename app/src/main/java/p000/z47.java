package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public final class z47 extends d47 {

    /* JADX INFO: renamed from: l */
    @yfb
    public static final C15985b f104045l = new C15985b(null);

    /* JADX INFO: renamed from: i */
    @yfb
    public final String f104046i;

    /* JADX INFO: renamed from: j */
    @gib
    public final String f104047j;

    /* JADX INFO: renamed from: k */
    @gib
    public final String f104048k;

    /* JADX INFO: renamed from: z47$a */
    public static final class C15984a {

        /* JADX INFO: renamed from: a */
        @yfb
        public final String f104049a;

        /* JADX INFO: renamed from: b */
        @gib
        public String f104050b;

        /* JADX INFO: renamed from: c */
        @gib
        public String f104051c;

        public C15984a(@efb String str) {
            md8.checkNotNullParameter(str, "serverClientId");
            this.f104049a = str;
        }

        @yfb
        public final z47 build() {
            return new z47(this.f104049a, this.f104050b, this.f104051c);
        }

        @yfb
        public final C15984a setHostedDomainFilter(@efb String str) {
            md8.checkNotNullParameter(str, "hostedDomainFilter");
            this.f104050b = str;
            return this;
        }

        @yfb
        public final C15984a setNonce(@gib String str) {
            this.f104051c = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: z47$b */
    public static final class C15985b {
        private C15985b() {
        }

        @do8
        @yfb
        public static final Bundle zza(@efb String str, @gib String str2, @gib String str3, boolean z) {
            md8.checkNotNullParameter(str, "serverClientId");
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID", str);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE", str3);
            bundle.putString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", str2);
            bundle.putBoolean("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
            bundle.putString(i87.f46025n, i87.f46024m);
            return bundle;
        }

        @do8
        @yfb
        public final z47 createFrom(@efb Bundle bundle) throws k87 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_SERVER_CLIENT_ID");
                md8.checkNotNull(string);
                return new z47(string, bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_HOSTED_DOMAIN_FILTER"), bundle.getString("com.google.android.libraries.identity.googleid.siwg.BUNDLE_KEY_NONCE"));
            } catch (Exception e) {
                throw new k87(e);
            }
        }

        public /* synthetic */ C15985b(@efb jt3 jt3Var) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z47(@efb String str, @gib String str2, @gib String str3) {
        super(i87.f46023l, C15985b.zza(str, str2, str3, true), C15985b.zza(str, str2, str3, true), true, true, null, 32, null);
        md8.checkNotNullParameter(str, "serverClientId");
        this.f104046i = str;
        this.f104047j = str2;
        this.f104048k = str3;
        if (str.length() <= 0) {
            throw new IllegalArgumentException("serverClientId should not be empty");
        }
    }

    @do8
    @yfb
    public static final z47 createFrom(@efb Bundle bundle) {
        return f104045l.createFrom(bundle);
    }

    @hib
    public final String getHostedDomainFilter() {
        return this.f104047j;
    }

    @hib
    public final String getNonce() {
        return this.f104048k;
    }

    @yfb
    public final String getServerClientId() {
        return this.f104046i;
    }
}
