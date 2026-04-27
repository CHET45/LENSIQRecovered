package p000;

import com.google.android.gms.fido.u2f.api.common.ClientData;
import org.json.JSONException;
import org.json.JSONObject;
import p000.a32;
import p000.gii;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class ojd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final JSONObject f67835a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final byte[] f67836b;

    /* JADX INFO: renamed from: c */
    public final long f67837c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final String f67838d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final String f67839e;

    public ojd(@yfb String str) throws JSONException {
        md8.checkNotNullParameter(str, "requestJson");
        JSONObject jSONObject = new JSONObject(str);
        this.f67835a = jSONObject;
        String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
        gii.C6332a c6332a = gii.f39918a;
        md8.checkNotNullExpressionValue(string, "challengeString");
        this.f67836b = c6332a.b64Decode(string);
        this.f67837c = jSONObject.optLong(a32.C0034g.f248b, 0L);
        String strOptString = jSONObject.optString("rpId", "");
        md8.checkNotNullExpressionValue(strOptString, "json.optString(\"rpId\", \"\")");
        this.f67838d = strOptString;
        String strOptString2 = jSONObject.optString("userVerification", "preferred");
        md8.checkNotNullExpressionValue(strOptString2, "json.optString(\"userVerification\", \"preferred\")");
        this.f67839e = strOptString2;
    }

    @yfb
    public final byte[] getChallenge() {
        return this.f67836b;
    }

    @yfb
    public final JSONObject getJson() {
        return this.f67835a;
    }

    @yfb
    public final String getRpId() {
        return this.f67838d;
    }

    public final long getTimeout() {
        return this.f67837c;
    }

    @yfb
    public final String getUserVerification() {
        return this.f67839e;
    }
}
