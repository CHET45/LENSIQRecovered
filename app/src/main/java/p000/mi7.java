package p000;

import com.watchfun.callvideo.base.BaseCallActivity;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import okhttp3.Request;

/* JADX INFO: loaded from: classes6.dex */
public class mi7 {

    /* JADX INFO: renamed from: a */
    public static yp7 f61073a;

    public static void buildWebsocketHeader(Request.Builder builder) {
        yp7 yp7Var = f61073a;
        if (yp7Var == null) {
            throw new IllegalStateException("未初始化 IHeaderProvider！请先调用 HeadersUtils.init()");
        }
        builder.addHeader("phoneBrand", yp7Var.getPhoneBrand());
        builder.addHeader("phoneModel", f61073a.getPhoneModel());
        builder.addHeader("appVersion", f61073a.getAppVersion());
        builder.addHeader("osVersion", f61073a.getOsVersion());
        builder.addHeader("osType", f61073a.getOsType());
        builder.addHeader(d4g.f28412f, f61073a.getProject());
        builder.addHeader("mac", f61073a.getMacAddress());
        builder.addHeader("deviceName", getValueEncoded(f61073a.getDeviceName()));
        builder.addHeader("uid", f61073a.getUid());
        builder.addHeader("appType", f61073a.getAppType());
        builder.addHeader("customerId", f61073a.getCustomerId());
        builder.addHeader(es7.f33959h, f61073a.getToken());
        builder.addHeader("userId", f61073a.getUserId());
        builder.addHeader(BaseCallActivity.f25142j2, f61073a.getLanguage());
        builder.addHeader("latitude", f61073a.getLatitude());
        builder.addHeader("longitude", f61073a.getLongitude());
        builder.addHeader("isInChina", f61073a.getIsInChina());
    }

    public static String getValueEncoded(String str) {
        if (str == null) {
            return "null";
        }
        String strReplace = str.replace("\n", "");
        int length = strReplace.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = strReplace.charAt(i);
            if (cCharAt <= 31 || cCharAt >= 127) {
                try {
                    return URLEncoder.encode(strReplace, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return strReplace;
    }

    public static void init(yp7 yp7Var) {
        f61073a = yp7Var;
    }
}
