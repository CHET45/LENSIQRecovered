package p000;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g22 {

    /* JADX INFO: renamed from: a */
    public static final String f38292a = "ClearKeyUtil";

    private g22() {
    }

    public static byte[] adjustRequestData(byte[] bArr) {
        return x0i.f95978a >= 27 ? bArr : x0i.getUtf8Bytes(base64ToBase64Url(x0i.fromUtf8Bytes(bArr)));
    }

    public static byte[] adjustResponseData(byte[] bArr) {
        if (x0i.f95978a >= 27) {
            return bArr;
        }
        try {
            JSONObject jSONObject = new JSONObject(x0i.fromUtf8Bytes(bArr));
            StringBuilder sb = new StringBuilder("{\"keys\":[");
            JSONArray jSONArray = jSONObject.getJSONArray("keys");
            for (int i = 0; i < jSONArray.length(); i++) {
                if (i != 0) {
                    sb.append(",");
                }
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                sb.append("{\"k\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("k")));
                sb.append("\",\"kid\":\"");
                sb.append(base64UrlToBase64(jSONObject2.getString("kid")));
                sb.append("\",\"kty\":\"");
                sb.append(jSONObject2.getString("kty"));
                sb.append("\"}");
            }
            sb.append("]}");
            return x0i.getUtf8Bytes(sb.toString());
        } catch (JSONException e) {
            yh9.m25916e("ClearKeyUtil", "Failed to adjust response data: " + x0i.fromUtf8Bytes(bArr), e);
            return bArr;
        }
    }

    private static String base64ToBase64Url(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    private static String base64UrlToBase64(String str) {
        return str.replace('-', '+').replace('_', '/');
    }
}
