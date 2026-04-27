package p000;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public class ps2 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: c */
    public static final String f71787c = "com.woke.transapp.net.change.action";

    /* JADX INFO: renamed from: a */
    public final String f71788a;

    /* JADX INFO: renamed from: b */
    public NetworkRequest f71789b;

    /* JADX INFO: renamed from: ps2$b */
    public static class C11088b {

        /* JADX INFO: renamed from: a */
        public static final ps2 f71790a = new ps2();

        private C11088b() {
        }
    }

    public static ps2 get() {
        return C11088b.f71790a;
    }

    public void disEnable(Context context) {
        ((ConnectivityManager) context.getSystemService("connectivity")).unregisterNetworkCallback(this);
        Log.i("ConnectionStateMonitor", "disEnable:call..");
    }

    public void enable(Context context) {
        try {
            ((ConnectivityManager) context.getSystemService("connectivity")).registerNetworkCallback(this.f71789b, this);
            Log.i("ConnectionStateMonitor", "enable:register ok");
        } catch (Exception e) {
            Log.e("ConnectionStateMonitor", "enable:register error:" + e.getMessage());
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        super.onAvailable(network);
        Log.i("ConnectionStateMonitor", "onAvailable:network connection!");
        o8e.getAppContext().sendBroadcast(new Intent(f71787c));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        super.onCapabilitiesChanged(network, networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        super.onLost(network);
        Log.i("ConnectionStateMonitor", "onLost:Network disconnection!");
    }

    private ps2() {
        this.f71788a = "ConnectionStateMonitor";
        this.f71789b = null;
        try {
            this.f71789b = new NetworkRequest.Builder().addCapability(13).addTransportType(0).addTransportType(1).build();
            Log.i("ConnectionStateMonitor", "ConnectionStateMonitor:build ok!");
        } catch (Exception e) {
            Log.e("ConnectionStateMonitor", "ConnectionStateMonitor:error:" + e.getMessage());
        }
    }
}
