package p000;

import android.util.Log;
import androidx.core.content.FileProvider;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000.a32;
import p000.gii;
import p000.p7e;

/* JADX INFO: loaded from: classes3.dex */
@p7e({p7e.EnumC10826a.f69934a})
public final class kjd {

    /* JADX INFO: renamed from: a */
    @yfb
    public final JSONObject f54302a;

    /* JADX INFO: renamed from: b */
    @yfb
    public final pjd f54303b;

    /* JADX INFO: renamed from: c */
    @yfb
    public final qjd f54304c;

    /* JADX INFO: renamed from: d */
    @yfb
    public final byte[] f54305d;

    /* JADX INFO: renamed from: e */
    @yfb
    public final List<njd> f54306e;

    /* JADX INFO: renamed from: f */
    public long f54307f;

    /* JADX INFO: renamed from: g */
    @yfb
    public List<ljd> f54308g;

    /* JADX INFO: renamed from: h */
    @yfb
    public ki0 f54309h;

    /* JADX INFO: renamed from: i */
    @yfb
    public String f54310i;

    public kjd(@yfb String str) throws JSONException {
        md8.checkNotNullParameter(str, "requestJson");
        JSONObject jSONObject = new JSONObject(str);
        this.f54302a = jSONObject;
        String string = jSONObject.getString(ClientData.KEY_CHALLENGE);
        gii.C6332a c6332a = gii.f39918a;
        md8.checkNotNullExpressionValue(string, "challengeString");
        this.f54305d = c6332a.b64Decode(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String string2 = jSONObject2.getString("name");
        md8.checkNotNullExpressionValue(string2, "rpJson.getString(\"name\")");
        String string3 = jSONObject2.getString("id");
        md8.checkNotNullExpressionValue(string3, "rpJson.getString(\"id\")");
        this.f54303b = new pjd(string2, string3);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        String string4 = jSONObject3.getString("id");
        md8.checkNotNullExpressionValue(string4, "rpUser.getString(\"id\")");
        byte[] bArrB64Decode = c6332a.b64Decode(string4);
        String string5 = jSONObject3.getString("name");
        md8.checkNotNullExpressionValue(string5, "rpUser.getString(\"name\")");
        String string6 = jSONObject3.getString(FileProvider.f7405Y);
        md8.checkNotNullExpressionValue(string6, "rpUser.getString(\"displayName\")");
        this.f54304c = new qjd(string5, bArrB64Decode, string6);
        JSONArray jSONArray = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject4 = jSONArray.getJSONObject(i);
            String string7 = jSONObject4.getString("type");
            md8.checkNotNullExpressionValue(string7, "e.getString(\"type\")");
            arrayList.add(new njd(string7, jSONObject4.getLong("alg")));
        }
        List<njd> list = v82.toList(arrayList);
        this.f54306e = list;
        this.f54307f = this.f54302a.optLong(a32.C0034g.f248b, 0L);
        this.f54308g = l82.emptyList();
        this.f54309h = new ki0("platform", "required", false, null, 12, null);
        String strOptString = this.f54302a.optString("attestation", "none");
        md8.checkNotNullExpressionValue(strOptString, "json.optString(\"attestation\", \"none\")");
        this.f54310i = strOptString;
        Log.i("WebAuthn", "Challenge " + this.f54305d + "()");
        StringBuilder sb = new StringBuilder();
        sb.append("rp ");
        sb.append(this.f54303b);
        Log.i("WebAuthn", sb.toString());
        Log.i("WebAuthn", "user " + this.f54304c);
        Log.i("WebAuthn", "pubKeyCredParams " + list);
        Log.i("WebAuthn", "timeout " + this.f54307f);
        Log.i("WebAuthn", "excludeCredentials " + this.f54308g);
        Log.i("WebAuthn", "authenticatorSelection " + this.f54309h);
        Log.i("WebAuthn", "attestation " + this.f54310i);
    }

    @yfb
    public final String getAttestation() {
        return this.f54310i;
    }

    @yfb
    public final ki0 getAuthenticatorSelection() {
        return this.f54309h;
    }

    @yfb
    public final byte[] getChallenge() {
        return this.f54305d;
    }

    @yfb
    public final List<ljd> getExcludeCredentials() {
        return this.f54308g;
    }

    @yfb
    public final JSONObject getJson() {
        return this.f54302a;
    }

    @yfb
    public final List<njd> getPubKeyCredParams() {
        return this.f54306e;
    }

    @yfb
    public final pjd getRp() {
        return this.f54303b;
    }

    public final long getTimeout() {
        return this.f54307f;
    }

    @yfb
    public final qjd getUser() {
        return this.f54304c;
    }

    public final void setAttestation(@yfb String str) {
        md8.checkNotNullParameter(str, "<set-?>");
        this.f54310i = str;
    }

    public final void setAuthenticatorSelection(@yfb ki0 ki0Var) {
        md8.checkNotNullParameter(ki0Var, "<set-?>");
        this.f54309h = ki0Var;
    }

    public final void setExcludeCredentials(@yfb List<ljd> list) {
        md8.checkNotNullParameter(list, "<set-?>");
        this.f54308g = list;
    }

    public final void setTimeout(long j) {
        this.f54307f = j;
    }
}
