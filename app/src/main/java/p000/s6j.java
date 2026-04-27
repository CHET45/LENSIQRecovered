package p000;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.internal.p024firebaseauthapi.zzaao;
import com.google.android.gms.internal.p024firebaseauthapi.zzt;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class s6j {

    /* JADX INFO: renamed from: a */
    public static final Logger f80863a = new Logger("JSONParser", new String[0]);

    @fdi
    private static List<Object> zza(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object objZza = jSONArray.get(i);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            arrayList.add(objZza);
        }
        return arrayList;
    }

    @hib
    public static Map<String, Object> zzb(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return zza(jSONObject);
            }
            return null;
        } catch (Exception e) {
            throw new zzaao(e);
        }
    }

    @efb
    public static Map<String, Object> zza(String str) {
        Preconditions.checkNotEmpty(str);
        List<String> listZza = zzt.zza(a18.f100c).zza((CharSequence) str);
        if (listZza.size() < 2) {
            f80863a.m5796e("Invalid idToken " + str, new Object[0]);
            return new HashMap();
        }
        try {
            Map<String, Object> mapZzb = zzb(new String(Base64Utils.decodeUrlSafeNoPadding(listZza.get(1)), "UTF-8"));
            return mapZzb == null ? new HashMap() : mapZzb;
        } catch (UnsupportedEncodingException e) {
            f80863a.m5795e("Unable to decode token", e, new Object[0]);
            return new HashMap();
        }
    }

    @fdi
    private static Map<String, Object> zza(JSONObject jSONObject) throws JSONException {
        x60 x60Var = new x60();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objZza = jSONObject.get(next);
            if (objZza instanceof JSONArray) {
                objZza = zza((JSONArray) objZza);
            } else if (objZza instanceof JSONObject) {
                objZza = zza((JSONObject) objZza);
            }
            x60Var.put(next, objZza);
        }
        return x60Var;
    }
}
