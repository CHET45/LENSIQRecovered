package p000;

import android.content.Context;
import android.net.wifi.WifiManager;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class wl7 {
    public static boolean isApWifiEnabled(Context context) {
        try {
            WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
            if (wifiManager == null) {
                return false;
            }
            Method declaredMethod = wifiManager.getClass().getDeclaredMethod("getWifiApState", null);
            declaredMethod.setAccessible(true);
            int iIntValue = ((Integer) declaredMethod.invoke(wifiManager, null)).intValue();
            Field declaredField = wifiManager.getClass().getDeclaredField("WIFI_AP_STATE_ENABLED");
            declaredField.setAccessible(true);
            return iIntValue == ((Integer) declaredField.get(wifiManager)).intValue();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchFieldException e2) {
            e2.printStackTrace();
            return false;
        } catch (NoSuchMethodException e3) {
            e3.printStackTrace();
            return false;
        } catch (InvocationTargetException e4) {
            e4.printStackTrace();
            return false;
        }
    }
}
