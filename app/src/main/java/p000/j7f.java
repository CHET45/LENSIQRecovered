package p000;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class j7f {

    /* JADX INFO: renamed from: a */
    public final fa3 f49718a;

    public j7f(fa3 fa3Var) {
        this.f49718a = fa3Var;
    }

    private static k7f getJsonTransformForVersion(int i) {
        if (i == 3) {
            return new t7f();
        }
        ej9.getLogger().m10063e("Could not determine SettingsJsonTransform for settings version " + i + ". Using default settings values.");
        return new kz3();
    }

    public a7f parseSettingsJson(JSONObject jSONObject) throws JSONException {
        return getJsonTransformForVersion(jSONObject.getInt(i7f.f45938c)).buildFromJson(this.f49718a, jSONObject);
    }
}
