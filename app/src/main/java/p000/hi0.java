package p000;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;
import p000.gii;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class hi0 implements ji0 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final ojd f43669a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final byte[] f43670b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f43671c;

    /* JADX INFO: renamed from: d */
    public final boolean f43672d;

    /* JADX INFO: renamed from: e */
    public final boolean f43673e;

    /* JADX INFO: renamed from: f */
    public final boolean f43674f;

    /* JADX INFO: renamed from: g */
    public final boolean f43675g;

    /* JADX INFO: renamed from: h */
    @yfb
    public byte[] f43676h;

    /* JADX INFO: renamed from: i */
    @gib
    public final String f43677i;

    /* JADX INFO: renamed from: j */
    @gib
    public final byte[] f43678j;

    /* JADX INFO: renamed from: k */
    @yfb
    public JSONObject f43679k;

    /* JADX INFO: renamed from: l */
    @yfb
    public byte[] f43680l;

    /* JADX INFO: renamed from: m */
    @yfb
    public byte[] f43681m;

    public hi0(@yfb ojd ojdVar, @yfb byte[] bArr, @yfb String str, boolean z, boolean z2, boolean z3, boolean z4, @yfb byte[] bArr2, @gib String str2, @gib byte[] bArr3) throws JSONException {
        md8.checkNotNullParameter(ojdVar, "requestOptions");
        md8.checkNotNullParameter(bArr, "credentialId");
        md8.checkNotNullParameter(str, "origin");
        md8.checkNotNullParameter(bArr2, "userHandle");
        this.f43669a = ojdVar;
        this.f43670b = bArr;
        this.f43671c = str;
        this.f43672d = z;
        this.f43673e = z2;
        this.f43674f = z3;
        this.f43675g = z4;
        this.f43676h = bArr2;
        this.f43677i = str2;
        this.f43678j = bArr3;
        this.f43679k = new JSONObject();
        this.f43681m = new byte[0];
        getClientJson().put("type", "webauthn.get");
        getClientJson().put(ClientData.KEY_CHALLENGE, gii.f39918a.b64Encode(ojdVar.getChallenge()));
        getClientJson().put("origin", str);
        if (str2 != null) {
            getClientJson().put("androidPackageName", str2);
        }
        this.f43680l = defaultAuthenticatorData();
    }

    @yfb
    public final byte[] dataToSign() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bArrDigest = this.f43678j;
        if (bArrDigest == null) {
            String string = getClientJson().toString();
            md8.checkNotNullExpressionValue(string, "clientJson.toString()");
            byte[] bytes = string.getBytes(xw1.f99524b);
            md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            bArrDigest = messageDigest.digest(bytes);
            md8.checkNotNullExpressionValue(bArrDigest, "md.digest(clientJson.toString().toByteArray())");
        }
        return u70.plus(this.f43680l, bArrDigest);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @yfb
    public final byte[] defaultAuthenticatorData() throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        byte[] bytes = this.f43669a.getRpId().getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        byte[] bArrDigest = messageDigest.digest(bytes);
        boolean z = this.f43672d;
        ?? r3 = z;
        if (this.f43673e) {
            r3 = (z ? 1 : 0) | 4;
        }
        ?? r32 = r3;
        if (this.f43674f) {
            r32 = (r3 == true ? 1 : 0) | 8;
        }
        int i = r32;
        if (this.f43675g) {
            i = (r32 == true ? 1 : 0) | 16;
        }
        md8.checkNotNullExpressionValue(bArrDigest, "rpHash");
        return u70.plus(u70.plus(bArrDigest, new byte[]{(byte) i}), new byte[]{0, 0, 0, 0});
    }

    @yfb
    public final byte[] getAuthenticatorData() {
        return this.f43680l;
    }

    @Override // p000.ji0
    @yfb
    public JSONObject getClientJson() {
        return this.f43679k;
    }

    @yfb
    public final byte[] getSignature() {
        return this.f43681m;
    }

    @Override // p000.ji0
    @yfb
    public JSONObject json() throws JSONException {
        String string = getClientJson().toString();
        md8.checkNotNullExpressionValue(string, "clientJson.toString()");
        byte[] bytes = string.getBytes(xw1.f99524b);
        md8.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        JSONObject jSONObject = new JSONObject();
        if (this.f43678j == null) {
            jSONObject.put("clientDataJSON", gii.f39918a.b64Encode(bytes));
        }
        gii.C6332a c6332a = gii.f39918a;
        jSONObject.put("authenticatorData", c6332a.b64Encode(this.f43680l));
        jSONObject.put("signature", c6332a.b64Encode(this.f43681m));
        jSONObject.put("userHandle", c6332a.b64Encode(this.f43676h));
        return jSONObject;
    }

    public final void setAuthenticatorData(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<set-?>");
        this.f43680l = bArr;
    }

    @Override // p000.ji0
    public void setClientJson(@yfb JSONObject jSONObject) {
        md8.checkNotNullParameter(jSONObject, "<set-?>");
        this.f43679k = jSONObject;
    }

    public final void setSignature(@yfb byte[] bArr) {
        md8.checkNotNullParameter(bArr, "<set-?>");
        this.f43681m = bArr;
    }

    public /* synthetic */ hi0(ojd ojdVar, byte[] bArr, String str, boolean z, boolean z2, boolean z3, boolean z4, byte[] bArr2, String str2, byte[] bArr3, int i, jt3 jt3Var) {
        this(ojdVar, bArr, str, z, z2, z3, z4, bArr2, (i & 256) != 0 ? null : str2, (i & 512) != 0 ? null : bArr3);
    }
}
