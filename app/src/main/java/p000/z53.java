package p000;

import android.os.Bundle;
import p000.p53;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nCreatePasswordRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CreatePasswordRequest.kt\nandroidx/credentials/CreatePasswordRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,199:1\n1#2:200\n*E\n"})
public final class z53 extends p53 {

    /* JADX INFO: renamed from: n */
    @yfb
    public static final C16010a f104218n = new C16010a(null);

    /* JADX INFO: renamed from: o */
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f104219o = "androidx.credentials.BUNDLE_KEY_ID";

    /* JADX INFO: renamed from: p */
    @yfb
    @p7e({p7e.EnumC10826a.f69934a})
    public static final String f104220p = "androidx.credentials.BUNDLE_KEY_PASSWORD";

    /* JADX INFO: renamed from: l */
    @yfb
    public final String f104221l;

    /* JADX INFO: renamed from: m */
    @yfb
    public final String f104222m;

    /* JADX INFO: renamed from: z53$a */
    public static final class C16010a {
        public /* synthetic */ C16010a(jt3 jt3Var) {
            this();
        }

        @c5e(23)
        @do8
        @yfb
        public final z53 createFrom$credentials_release(@yfb Bundle bundle, @gib String str, @yfb Bundle bundle2) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(bundle2, "candidateQueryData");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_ID");
                md8.checkNotNull(string);
                String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD");
                md8.checkNotNull(string2);
                p53.C10798b fromCredentialDataBundle = p53.C10798b.f69714e.parseFromCredentialDataBundle(bundle);
                if (fromCredentialDataBundle == null) {
                    fromCredentialDataBundle = new p53.C10798b(string, null);
                }
                boolean z = bundle.getBoolean("androidx.credentials.BUNDLE_KEY_PREFER_IMMEDIATELY_AVAILABLE_CREDENTIALS", false);
                return new z53(string, string2, bundle.getBoolean("androidx.credentials.BUNDLE_KEY_IS_AUTO_SELECT_ALLOWED", false), fromCredentialDataBundle, str, z, bundle, bundle2, null);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final Bundle toCandidateDataBundle$credentials_release() {
            return new Bundle();
        }

        @do8
        @yfb
        public final Bundle toCredentialDataBundle$credentials_release(@yfb String str, @yfb String str2) {
            md8.checkNotNullParameter(str, "id");
            md8.checkNotNullParameter(str2, "password");
            Bundle bundle = new Bundle();
            bundle.putString("androidx.credentials.BUNDLE_KEY_ID", str);
            bundle.putString("androidx.credentials.BUNDLE_KEY_PASSWORD", str2);
            return bundle;
        }

        private C16010a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z53(@yfb String str, @yfb String str2) {
        this(str, str2, null, false, false, 28, null);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }

    @yfb
    public final String getId() {
        return this.f104221l;
    }

    @yfb
    public final String getPassword() {
        return this.f104222m;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z53(@yfb String str, @yfb String str2, @gib String str3) {
        this(str, str2, str3, false, false, 24, null);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z53(@yfb String str, @yfb String str2, @gib String str3, boolean z) {
        this(str, str2, str3, z, false, 16, null);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }

    public /* synthetic */ z53(String str, String str2, boolean z, p53.C10798b c10798b, String str3, boolean z2, Bundle bundle, Bundle bundle2, jt3 jt3Var) {
        this(str, str2, z, c10798b, str3, z2, bundle, bundle2);
    }

    public /* synthetic */ z53(String str, String str2, boolean z, p53.C10798b c10798b, String str3, boolean z2, Bundle bundle, Bundle bundle2, int i, jt3 jt3Var) {
        this(str, str2, z, c10798b, (i & 16) != 0 ? null : str3, z2, (i & 64) != 0 ? f104218n.toCredentialDataBundle$credentials_release(str, str2) : bundle, (i & 128) != 0 ? f104218n.toCandidateDataBundle$credentials_release() : bundle2);
    }

    private z53(String str, String str2, boolean z, p53.C10798b c10798b, String str3, boolean z2, Bundle bundle, Bundle bundle2) {
        super(oic.f67748g, bundle, bundle2, false, z, c10798b, str3, z2);
        this.f104221l = str;
        this.f104222m = str2;
        if (str2.length() <= 0) {
            throw new IllegalArgumentException("password should not be empty");
        }
    }

    public /* synthetic */ z53(String str, String str2, String str3, boolean z, boolean z2, int i, jt3 jt3Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? false : z, (i & 16) != 0 ? false : z2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public z53(@yfb String str, @yfb String str2, @gib String str3, boolean z, boolean z2) {
        this(str, str2, z2, new p53.C10798b(str, null), str3, z, null, null, 192, null);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public z53(@yfb String str, @yfb String str2, @gib String str3, @gib String str4, boolean z, boolean z2) {
        this(str, str2, z2, new p53.C10798b(str, null, str4), str3, z, null, null, 192, null);
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "password");
    }
}
