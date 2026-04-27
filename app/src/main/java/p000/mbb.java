package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;

/* JADX INFO: loaded from: classes7.dex */
public class mbb {

    /* JADX INFO: renamed from: a */
    public final ConnectivityManager f60476a;

    /* JADX INFO: renamed from: b */
    public final C9257b f60477b = new C9257b();

    /* JADX INFO: renamed from: c */
    public InterfaceC9258c f60478c;

    /* JADX INFO: renamed from: mbb$b */
    public class C9257b extends ConnectivityManager.NetworkCallback {
        private C9257b() {
        }

        private String getNetworkType(NetworkCapabilities networkCapabilities) {
            if (networkCapabilities == null) {
                return "Bilinmeyen ağ";
            }
            if (networkCapabilities.hasTransport(1)) {
                return "WiFi";
            }
            if (!networkCapabilities.hasTransport(0)) {
                return networkCapabilities.hasTransport(3) ? "Ethernet" : "Diğer ağlar";
            }
            String str = (Build.VERSION.SDK_INT < 29 || !networkCapabilities.hasCapability(18)) ? "Mobil veri" : "5G";
            if ("Mobil veri".equals(str) && networkCapabilities.hasCapability(9)) {
                str = "4G";
            }
            return ("Mobil veri".equals(str) && networkCapabilities.hasCapability(3)) ? "3G" : str;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            if (mbb.this.f60478c != null) {
                mbb.this.f60478c.onNetworkAvailable(getNetworkType(mbb.this.f60476a.getNetworkCapabilities(network)));
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            if (mbb.this.f60478c != null) {
                mbb.this.f60478c.onNetworkLost();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            if (mbb.this.f60478c != null) {
                mbb.this.f60478c.onNetworkLost();
            }
        }
    }

    /* JADX INFO: renamed from: mbb$c */
    public interface InterfaceC9258c {
        void onNetworkAvailable(String str);

        void onNetworkLost();
    }

    public mbb(Context context) {
        this.f60476a = (ConnectivityManager) context.getSystemService("connectivity");
    }

    public void setNetworkChangeListener(InterfaceC9258c interfaceC9258c) {
        this.f60478c = interfaceC9258c;
    }

    public void startMonitoring() {
        this.f60476a.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).addTransportType(1).addTransportType(0).addTransportType(3).build(), this.f60477b);
    }

    public void stopMonitoring() {
        this.f60476a.unregisterNetworkCallback(this.f60477b);
    }
}
