package p000;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collection;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class ii0 implements ji0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final kjd f47056a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final byte[] f47057b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final byte[] f47058c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f47059d;

    /* JADX INFO: renamed from: e */
    public final boolean f47060e;

    /* JADX INFO: renamed from: f */
    public final boolean f47061f;

    /* JADX INFO: renamed from: g */
    public final boolean f47062g;

    /* JADX INFO: renamed from: h */
    public final boolean f47063h;

    /* JADX INFO: renamed from: i */
    @gib
    public final String f47064i;

    /* JADX INFO: renamed from: j */
    @gib
    public final byte[] f47065j;

    /* JADX INFO: renamed from: k */
    @yfb
    public JSONObject f47066k;

    /* JADX INFO: renamed from: l */
    @yfb
    public byte[] f47067l;

    public ii0(@yfb kjd kjdVar, @yfb byte[] bArr, @yfb byte[] bArr2, @yfb String str, boolean z, boolean z2, boolean z3, boolean z4, @gib String str2, @gib byte[] bArr3) throws JSONException {
        md8.checkNotNullParameter(kjdVar, "requestOptions");
        md8.checkNotNullParameter(bArr, "credentialId");
        md8.checkNotNullParameter(bArr2, "credentialPublicKey");
        md8.checkNotNullParameter(str, "origin");
        this.f47056a = kjdVar;
        this.f47057b = bArr;
        this.f47058c = bArr2;
        this.f47059d = str;
        this.f47060e = z;
        this.f47061f = z2;
        this.f47062g = z3;
        this.f47063h = z4;
        this.f47064i = str2;
        this.f47065j = bArr3;
        this.f47066k = new JSONObject();
        getClientJson().put("type", "webauthn.create");
        getClientJson().put(ClientData.KEY_CHALLENGE, gii.f39918a.b64Encode(kjdVar.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.f47067l = defaultAttestationObject$credentials_release();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    private final byte[] authData() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.f47056a.getRp().getId().getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        boolean z = this.f47060e;
        ?? r5 = z;
        if (this.f47061f) {
            r5 = (z ? 1 : 0) | 4;
        }
        ?? r52 = r5;
        if (this.f47062g) {
            r52 = (r5 == true ? 1 : 0) | 8;
        }
        ?? r53 = r52;
        if (this.f47063h) {
            r53 = (r52 == true ? 1 : 0) | 16;
        }
        int i = r53 | 64;
        byte[] bArr = new byte[16];
        for (int i2 = 0; i2 < 16; i2++) {
            bArr[i2] = 0;
        }
        byte[] bArr2 = this.f47057b;
        byte[] bArr3 = {(byte) (bArr2.length >> 8), (byte) bArr2.length};
        md8.checkNotNullExpressionValue(bArrDigest, "rpHash");
        return u70.plus(u70.plus(u70.plus(u70.plus(u70.plus(u70.plus(bArrDigest, new byte[]{(byte) i}), new byte[]{0, 0, 0, 0}), bArr), bArr3), this.f47057b), this.f47058c);
    }

    @yfb
    public final byte[] defaultAttestationObject$credentials_release() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("fmt", "none");
        linkedHashMap.put("attStmt", xt9.emptyMap());
        linkedHashMap.put("authData", authData());
        return new us1().encode(linkedHashMap);
    }

    @yfb
    public final byte[] getAttestationObject() {
        return this.f47067l;
    }

    @Override // p000.ji0
    @yfb
    public JSONObject getClientJson() {
        return this.f47066k;
    }

    @Override // p000.ji0
    @yfb
    public JSONObject json() throws JSONException {
        String string = getClientJson().toString();
        md8.checkNotNullExpressionValue(string, "clientJson.toString()");
        byte[] bytes = string.getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        JSONObject jSONObject = new JSONObject();
        if (this.f47065j == null) {
            jSONObject.put("clientDataJSON", gii.f39918a.b64Encode(bytes));
        }
        jSONObject.put("attestationObject", gii.f39918a.b64Encode(this.f47067l));
        jSONObject.put("transports", new JSONArray((Collection) l82.listOf((Object[]) new String[]{"internal", "hybrid"})));
        return jSONObject;
    }

    public final void setAttestationObject(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<set-?>");
        this.f47067l = bArr;
    }

    @Override // p000.ji0
    public void setClientJson(@yfb JSONObject jSONObject) {
        md8.checkNotNullParameter(jSONObject, "<set-?>");
        this.f47066k = jSONObject;
    }

    public /* synthetic */ ii0(kjd kjdVar, byte[] bArr, byte[] bArr2, String str, boolean z, boolean z2, boolean z3, boolean z4, String str2, byte[] bArr3, int i, jt3 jt3Var) {
        this(kjdVar, bArr, bArr2, str, z, z2, z3, z4, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }
}
