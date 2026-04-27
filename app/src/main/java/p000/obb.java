package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class obb {

    /* JADX INFO: renamed from: b */
    public static final String f67060b = "NetworkParser";

    /* JADX INFO: renamed from: c */
    public static final String f67061c = "wifi";

    /* JADX INFO: renamed from: d */
    public static final String f67062d = "2g";

    /* JADX INFO: renamed from: e */
    public static final String f67063e = "3g";

    /* JADX INFO: renamed from: f */
    public static final String f67064f = "4g";

    /* JADX INFO: renamed from: g */
    public static final String f67065g = "5g";

    /* JADX INFO: renamed from: h */
    public static final String f67066h = "unknown";

    /* JADX INFO: renamed from: i */
    public static final String f67067i = "wifi";

    /* JADX INFO: renamed from: j */
    public static final String f67068j = "moblie";

    /* JADX INFO: renamed from: k */
    public static final String f67069k = "no_network";

    /* JADX INFO: renamed from: l */
    @igg({"StaticFieldLeak"})
    public static obb f67070l;

    /* JADX INFO: renamed from: a */
    public final Context f67071a = C9389ml.getInstance().getAppContext();

    private obb() {
    }

    private NetworkInfo getCurNetworkInfo() {
        return ((ConnectivityManager) this.f67071a.getSystemService("connectivity")).getActiveNetworkInfo();
    }

    public static obb getInstance() {
        if (f67070l == null) {
            f67070l = new obb();
        }
        return f67070l;
    }

    private String getNetworkName(int i) {
        zi9.m26850d("NetworkParser", "getNetworkName networkType " + i);
        if (i == 0) {
            i = getNetworkTypeOnQualcomm();
        }
        if (i == 20) {
            return "5g";
        }
        switch (i) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return "2g";
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return "3g";
            case 13:
                return "4g";
            default:
                return "unknown";
        }
    }

    private int getNetworkTypeOnQualcomm() {
        try {
            Class<?> cls = Class.forName("android.telephony.MSimTelephonyManager");
            Object systemService = this.f67071a.getSystemService("phone_msim");
            Integer num = (Integer) cls.getMethod("getPreferredDataSubscription", null).invoke(systemService, null);
            num.intValue();
            return ((Integer) cls.getMethod("getNetworkType", Integer.TYPE).invoke(systemService, num)).intValue();
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException | Exception unused) {
            return 0;
        }
    }

    private String getOperator() {
        try {
            String subscriberId = getTelephonyManager().getSubscriberId();
            if (subscriberId == null) {
                return "";
            }
            if (!subscriberId.startsWith("46000") && !subscriberId.startsWith("46002")) {
                return subscriberId.startsWith("46001") ? "un" : !subscriberId.startsWith("46003") ? subscriberId.startsWith("46011") ? "net" : "" : "net";
            }
            return "cm";
        } catch (Exception e) {
            zi9.m26852e("NetworkParser", "[CP_DL]DownloadReceiver.onReceive Exception:" + e.getMessage());
            return "";
        }
    }

    private String getSubType(NetworkInfo networkInfo) {
        if (networkInfo == null) {
            return null;
        }
        try {
            if (networkInfo.getType() == 0) {
                return getNetworkName(getTelephonyManager().getNetworkType());
            }
            if (networkInfo.getType() == 1) {
                return "wifi";
            }
            return null;
        } catch (Exception e) {
            zi9.m26853e("NetworkParser", "getSubType ", e);
            return null;
        }
    }

    private TelephonyManager getTelephonyManager() {
        return (TelephonyManager) this.f67071a.getSystemService("phone");
    }

    public static boolean hasNetworkButWifi() {
        String networkType = getInstance().getNetworkType();
        return (networkType == null || networkType.equals("wifi")) ? false : true;
    }

    public String getNetwork() {
        return getSubType(getCurNetworkInfo());
    }

    public String getNetworkType() {
        String network = getNetwork();
        if (network == null) {
            return null;
        }
        if (!c1i.isNetworkOnline(this.f67071a)) {
            zi9.m26850d("NetworkParser", "can't connect to the internet");
            return null;
        }
        if (network.equals("wifi")) {
            return "wifi";
        }
        return getOperator() + network;
    }

    public boolean isNetworkConnected() {
        NetworkInfo curNetworkInfo = getCurNetworkInfo();
        if (curNetworkInfo != null) {
            return curNetworkInfo.isConnected();
        }
        return false;
    }

    public String networkType() {
        try {
            NetworkInfo curNetworkInfo = getCurNetworkInfo();
            zi9.m26850d("NetworkParser", "network type is " + curNetworkInfo);
            return curNetworkInfo != null ? curNetworkInfo.getType() == 0 ? "moblie" : curNetworkInfo.getType() == 1 ? "wifi" : "no_network" : "no_network";
        } catch (Exception e) {
            zi9.m26853e("NetworkParser", "networkType ", e);
            return "no_network";
        }
    }
}
