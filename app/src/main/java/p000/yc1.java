package p000;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class yc1 implements InterfaceC1524ao, ad1 {

    /* JADX INFO: renamed from: b */
    public static final String f101082b = "name";

    /* JADX INFO: renamed from: c */
    public static final String f101083c = "parameters";

    /* JADX INFO: renamed from: d */
    public static final String f101084d = "$A$:";

    /* JADX INFO: renamed from: a */
    @hib
    public zc1 f101085a;

    @efb
    private static String serializeEvent(@efb String str, @efb Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put(f101083c, jSONObject2);
        return jSONObject.toString();
    }

    @Override // p000.InterfaceC1524ao
    public void onEvent(@efb String str, @efb Bundle bundle) {
        zc1 zc1Var = this.f101085a;
        if (zc1Var != null) {
            try {
                zc1Var.handleBreadcrumb(f101084d + serializeEvent(str, bundle));
            } catch (JSONException unused) {
                ej9.getLogger().m10069w("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // p000.ad1
    public void registerBreadcrumbHandler(@hib zc1 zc1Var) {
        this.f101085a = zc1Var;
        ej9.getLogger().m10061d("Registered Firebase Analytics event receiver for breadcrumbs");
    }
}
