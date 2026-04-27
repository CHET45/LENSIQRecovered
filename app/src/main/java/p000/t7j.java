package p000;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class t7j {

    /* JADX INFO: renamed from: a */
    @fdi
    public static final Map<String, String> f83960a;

    static {
        HashMap map = new HashMap();
        f83960a = map;
        map.put("auth/invalid-provider-id", "INVALID_PROVIDER_ID");
        map.put("auth/invalid-cert-hash", "INVALID_CERT_HASH");
        map.put("auth/network-request-failed", "WEB_NETWORK_REQUEST_FAILED");
        map.put("auth/web-storage-unsupported", "WEB_STORAGE_UNSUPPORTED");
        map.put("auth/operation-not-allowed", "OPERATION_NOT_ALLOWED");
    }

    public static Status zza(Intent intent) {
        Preconditions.checkNotNull(intent);
        Preconditions.checkArgument(zzb(intent));
        return (Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR);
    }

    public static boolean zzb(Intent intent) {
        Preconditions.checkNotNull(intent);
        return intent.hasExtra("com.google.firebase.auth.internal.STATUS");
    }

    public static Status zza(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString(g55.f38796e);
            String string2 = jSONObject.getString(g55.f38799h);
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                Map<String, String> map = f83960a;
                if (map.containsKey(string)) {
                    return m5j.zza(map.get(string) + g1i.f38277c + string2);
                }
            }
            return m5j.zza("WEB_INTERNAL_ERROR:" + str);
        } catch (JSONException e) {
            return m5j.zza("WEB_INTERNAL_ERROR:" + str + "[ " + e.getLocalizedMessage() + " ]");
        }
    }

    public static void zza(Intent intent, Status status) {
        SafeParcelableSerializer.serializeToIntentExtra(status, intent, "com.google.firebase.auth.internal.STATUS");
    }
}
