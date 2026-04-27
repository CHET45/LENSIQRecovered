package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nBeginCreatePublicKeyCredentialRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginCreatePublicKeyCredentialRequest.kt\nandroidx/credentials/provider/BeginCreatePublicKeyCredentialRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,101:1\n1#2:102\n*E\n"})
public final class oy0 extends nx0 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C10715a f69193g = new C10715a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f69194e;

    /* JADX INFO: renamed from: f */
    @gib
    public final byte[] f69195f;

    /* JADX INFO: renamed from: oy0$a */
    public static final class C10715a {
        public /* synthetic */ C10715a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        @fdi
        public final oy0 createForTest(@yfb Bundle bundle, @gib so1 so1Var) {
            md8.checkNotNullParameter(bundle, "data");
            return createFrom$credentials_release(bundle, so1Var);
        }

        @yfb
        public final oy0 createFrom$credentials_release(@yfb Bundle bundle, @gib so1 so1Var) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                md8.checkNotNull(string);
                return new oy0(string, so1Var, bundle, byteArray);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        private C10715a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public oy0(@yfb String str, @gib so1 so1Var, @yfb Bundle bundle) {
        this(str, so1Var, bundle, null, 8, null);
        md8.checkNotNullParameter(str, "requestJson");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
    }

    @do8
    @yfb
    @fdi
    public static final oy0 createForTest(@yfb Bundle bundle, @gib so1 so1Var) {
        return f69193g.createForTest(bundle, so1Var);
    }

    private final void initiateBundle(Bundle bundle, String str) {
        bundle.putString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON", str);
    }

    @gib
    public final byte[] getClientDataHash() {
        return this.f69195f;
    }

    @yfb
    public final String getRequestJson() {
        return this.f69194e;
    }

    public /* synthetic */ oy0(String str, so1 so1Var, Bundle bundle, byte[] bArr, int i, jt3 jt3Var) {
        this(str, so1Var, bundle, (i & 8) != 0 ? null : bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public oy0(@yfb String str, @gib so1 so1Var, @yfb Bundle bundle, @gib byte[] bArr) {
        super(jjd.f50722f, bundle, so1Var);
        md8.checkNotNullParameter(str, "requestJson");
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        this.f69194e = str;
        this.f69195f = bArr;
        if (q4e.f73193a.isValidJSON(str)) {
            initiateBundle(bundle, str);
            return;
        }
        throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
    }
}
