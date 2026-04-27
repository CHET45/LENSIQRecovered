package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: loaded from: classes6.dex */
public class bbb {

    /* JADX INFO: renamed from: a */
    public static final int f13250a = -1;

    /* JADX INFO: renamed from: b */
    public static final int f13251b = 0;

    /* JADX INFO: renamed from: c */
    public static final int f13252c = 1;

    public static int getNetWorkState(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            if (activeNetworkInfo.getType() == 1) {
                return 1;
            }
            if (activeNetworkInfo.getType() == 0) {
                return 0;
            }
        }
        return -1;
    }
}
