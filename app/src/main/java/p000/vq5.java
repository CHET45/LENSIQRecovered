package p000;

import org.json.JSONException;
import org.json.JSONObject;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class vq5 {

    /* JADX INFO: renamed from: a */
    @yfb
    public final byte[] f91970a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final ji0 f91971b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final String f91972c;

    public vq5(@yfb byte[] bArr, @yfb ji0 ji0Var, @yfb String str) {
        md8.checkNotNullParameter(bArr, "rawId");
        md8.checkNotNullParameter(ji0Var, "response");
        md8.checkNotNullParameter(str, "authenticatorAttachment");
        this.f91970a = bArr;
        this.f91971b = ji0Var;
        this.f91972c = str;
    }

    @yfb
    public final String getAuthenticatorAttachment() {
        return this.f91972c;
    }

    @yfb
    public final byte[] getRawId() {
        return this.f91970a;
    }

    @yfb
    public final ji0 getResponse() {
        return this.f91971b;
    }

    @yfb
    public final String json() throws JSONException {
        String strB64Encode = gii.f39918a.b64Encode(this.f91970a);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", strB64Encode);
        jSONObject.put("rawId", strB64Encode);
        jSONObject.put("type", "public-key");
        jSONObject.put("authenticatorAttachment", this.f91972c);
        jSONObject.put("response", this.f91971b.json());
        jSONObject.put("clientExtensionResults", new JSONObject());
        String string = jSONObject.toString();
        md8.checkNotNullExpressionValue(string, "ret.toString()");
        return string;
    }
}
