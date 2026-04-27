package p000;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
@dwf({"SMAP\nBeginGetPublicKeyCredentialOption.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BeginGetPublicKeyCredentialOption.kt\nandroidx/credentials/provider/BeginGetPublicKeyCredentialOption\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1#2:81\n*E\n"})
public final class j01 extends py0 {

    /* JADX INFO: renamed from: g */
    @yfb
    public static final C7700a f49203g = new C7700a(null);

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f49204e;

    /* JADX INFO: renamed from: f */
    @gib
    public final byte[] f49205f;

    /* JADX INFO: renamed from: j01$a */
    public static final class C7700a {
        public /* synthetic */ C7700a(jt3 jt3Var) {
            this();
        }

        @do8
        @yfb
        public final j01 createFrom$credentials_release(@yfb Bundle bundle, @yfb String str) throws qv6 {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            try {
                String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                byte[] byteArray = bundle.getByteArray("androidx.credentials.BUNDLE_KEY_CLIENT_DATA_HASH");
                md8.checkNotNull(string);
                return new j01(bundle, str, string, byteArray);
            } catch (Exception unused) {
                throw new qv6();
            }
        }

        @do8
        @yfb
        public final j01 createFromEntrySlice$credentials_release(@yfb Bundle bundle, @yfb String str) {
            md8.checkNotNullParameter(bundle, "data");
            md8.checkNotNullParameter(str, "id");
            return new j01(bundle, str, "{\"dummy_key\":\"dummy_value\"}", null, 8, null);
        }

        private C7700a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @yn8
    public j01(@yfb Bundle bundle, @yfb String str, @yfb String str2) {
        this(bundle, str, str2, null, 8, null);
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "requestJson");
    }

    @gib
    public final byte[] getClientDataHash() {
        return this.f49205f;
    }

    @yfb
    public final String getRequestJson() {
        return this.f49204e;
    }

    public /* synthetic */ j01(Bundle bundle, String str, String str2, byte[] bArr, int i, jt3 jt3Var) {
        this(bundle, str, str2, (i & 8) != 0 ? null : bArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @yn8
    public j01(@yfb Bundle bundle, @yfb String str, @yfb String str2, @gib byte[] bArr) {
        super(str, jjd.f50722f, bundle);
        md8.checkNotNullParameter(bundle, "candidateQueryData");
        md8.checkNotNullParameter(str, "id");
        md8.checkNotNullParameter(str2, "requestJson");
        this.f49204e = str2;
        this.f49205f = bArr;
        if (!q4e.f73193a.isValidJSON(str2)) {
            throw new IllegalArgumentException("requestJson must not be empty, and must be a valid JSON");
        }
    }
}
