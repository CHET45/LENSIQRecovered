package p000;

import org.json.JSONException;
import org.json.JSONObject;
import p000.a7f;

/* JADX INFO: loaded from: classes5.dex */
public class t7f implements k7f {
    private static a7f.C0083a buildFeatureFlagDataFrom(JSONObject jSONObject) {
        return new a7f.C0083a(jSONObject.optBoolean(i7f.f45945j, true), jSONObject.optBoolean(i7f.f45946k, false), jSONObject.optBoolean(i7f.f45947l, false));
    }

    private static a7f.C0084b buildSessionDataFrom(JSONObject jSONObject) {
        return new a7f.C0084b(jSONObject.optInt(i7f.f45952q, 8), 4);
    }

    private static long getExpiresAtFrom(fa3 fa3Var, long j, JSONObject jSONObject) {
        return jSONObject.has(i7f.f45936a) ? jSONObject.optLong(i7f.f45936a) : fa3Var.getCurrentTimeMillis() + (j * 1000);
    }

    @Override // p000.k7f
    public a7f buildFromJson(fa3 fa3Var, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt(i7f.f45938c, 0);
        int iOptInt2 = jSONObject.optInt(i7f.f45940e, 3600);
        return new a7f(getExpiresAtFrom(fa3Var, iOptInt2, jSONObject), jSONObject.has(i7f.f45937b) ? buildSessionDataFrom(jSONObject.getJSONObject(i7f.f45937b)) : buildSessionDataFrom(new JSONObject()), buildFeatureFlagDataFrom(jSONObject.getJSONObject(i7f.f45939d)), iOptInt, iOptInt2, jSONObject.optDouble(i7f.f45941f, 10.0d), jSONObject.optDouble(i7f.f45942g, 1.2d), jSONObject.optInt(i7f.f45943h, 60));
    }
}
