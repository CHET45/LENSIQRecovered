package com.watchfun.transcommon.utils;

import android.os.Build;
import com.watchfun.transcommon.HttpData;
import java.util.HashMap;
import java.util.Map;
import p000.a43;
import p000.d4g;
import p000.es7;
import p000.vfe;

/* JADX INFO: loaded from: classes6.dex */
public class HeaderUtils {
    public static Map<String, String> buildWebsocketHeader(int i) {
        HashMap map = new HashMap();
        map.put("businessMode", Integer.toString(i));
        map.put("phoneBrand", Build.BRAND);
        map.put("phoneModel", Build.MODEL);
        map.put("appVersion", HttpData.version);
        map.put("osVersion", Build.VERSION.RELEASE);
        map.put("osType", "android");
        map.put(d4g.f28412f, "");
        map.put("mac", HttpData.deviceAddress);
        map.put("deviceName", HttpData.deviceName);
        map.put("uid", vfe.getInstance().getString("KEY_UID"));
        map.put(es7.f33959h, vfe.getInstance().getString("KEY_TOKEN"));
        map.put("userId", vfe.getInstance().getString("SP_USER_ID"));
        String string = vfe.getInstance().getString("SP_KEY_LOCATION_LATITUDE");
        String string2 = vfe.getInstance().getString("SP_KEY_LOCATION_LONGITUDE");
        map.put("latitude", string);
        map.put("longitude", string2);
        map.put("isInChina", a43.f347l);
        return map;
    }
}
