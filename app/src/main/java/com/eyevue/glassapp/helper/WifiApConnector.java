package com.eyevue.glassapp.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.PatternMatcher;
import android.util.Log;
import com.blankj.utilcode.util.C2478k;
import com.eyevue.glassapp.EyevueApplication;
import java.util.List;
import p000.ali;
import p000.c5e;
import p000.efb;
import p000.zi9;

/* JADX INFO: loaded from: classes4.dex */
public class WifiApConnector {
    private ConnectivityManager connectivityManager;
    private boolean isRegisterNetwork;
    private boolean isRegisterPost;
    private long lastApWifiSuccessTime;
    private final Context mContext;
    private NetworkRequest networkRequest;
    private String pendingPassword;
    private String pendingSsid;
    private WifiApCallback wifiApCallback;
    private WifiManager wifiManager;
    public final String TAG = "WifiApConnector";
    private int connectTimes = 0;
    private final int MAX_CONNECT_TIME = 3;
    private final long CONNECT_TIME_OUT = 60000;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final ConnectivityManager.NetworkCallback networkCallback = new C26491();
    private final BroadcastReceiver postConnectionReceiver = new BroadcastReceiver() { // from class: com.eyevue.glassapp.helper.WifiApConnector.2
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION".equals(intent.getAction())) {
                zi9.m26852e("WifiApConnector", "ApWifi 连接成功 (Suggestion)");
                WifiApConnector.this.handler.removeCallbacks(WifiApConnector.this.timeoutRunnable);
                if (WifiApConnector.this.wifiApCallback != null) {
                    WifiApConnector.this.wifiApCallback.onApWifiConnected();
                }
            }
        }
    };
    private final Runnable timeoutRunnable = new RunnableC26513();

    /* JADX INFO: renamed from: com.eyevue.glassapp.helper.WifiApConnector$1 */
    public class C26491 extends ConnectivityManager.NetworkCallback {
        public C26491() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onAvailable$0() {
            if (WifiApConnector.this.wifiApCallback != null) {
                WifiApConnector.this.wifiApCallback.onApWifiConnected();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onLost$3() {
            if (WifiApConnector.this.wifiApCallback != null) {
                WifiApConnector.this.wifiApCallback.onError("WiFi 连接已断开");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUnavailable$1() {
            if (Build.VERSION.SDK_INT >= 29) {
                WifiApConnector wifiApConnector = WifiApConnector.this;
                wifiApConnector.connectWithSpecifier(wifiApConnector.pendingSsid, WifiApConnector.this.pendingPassword);
            }
            WifiApConnector.this.handler.removeCallbacks(WifiApConnector.this.timeoutRunnable);
            WifiApConnector.this.handler.postDelayed(WifiApConnector.this.timeoutRunnable, 60000L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onUnavailable$2() {
            if (WifiApConnector.this.wifiApCallback != null) {
                WifiApConnector.this.wifiApCallback.onError("连接失败，已达最大重试次数");
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@efb Network network) {
            super.onAvailable(network);
            WifiApConnector.this.handler.removeCallbacks(WifiApConnector.this.timeoutRunnable);
            WifiApConnector.this.connectivityManager.bindProcessToNetwork(network);
            zi9.m26852e("WifiApConnector", "WiFi 连接成功: " + WifiApConnector.this.pendingSsid);
            if (System.currentTimeMillis() - WifiApConnector.this.lastApWifiSuccessTime < 1000) {
                return;
            }
            WifiApConnector.this.lastApWifiSuccessTime = System.currentTimeMillis();
            WifiApConnector.this.runOnUi(new Runnable() { // from class: com.eyevue.glassapp.helper.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18292a.lambda$onAvailable$0();
                }
            });
            WifiApConnector.this.checkNetworkCapabilities(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(@efb Network network, @efb NetworkCapabilities caps) {
            super.onCapabilitiesChanged(network, caps);
            WifiApConnector.this.checkNetworkCapabilities(network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@efb Network network) {
            super.onLost(network);
            zi9.m26852e("WifiApConnector", "WiFi 连接丢失");
            WifiApConnector.this.runOnUi(new Runnable() { // from class: com.eyevue.glassapp.helper.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18293a.lambda$onLost$3();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            zi9.m26852e("WifiApConnector", "网络不可用, 重试次数: " + WifiApConnector.this.connectTimes);
            if (WifiApConnector.this.connectTimes >= 3) {
                WifiApConnector.this.runOnUi(new Runnable() { // from class: com.eyevue.glassapp.helper.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18291a.lambda$onUnavailable$2();
                    }
                });
            } else {
                WifiApConnector.access$708(WifiApConnector.this);
                WifiApConnector.this.handler.postDelayed(new Runnable() { // from class: com.eyevue.glassapp.helper.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18290a.lambda$onUnavailable$1();
                    }
                }, 2000L);
            }
        }
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.helper.WifiApConnector$3 */
    public class RunnableC26513 implements Runnable {
        public RunnableC26513() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            if (WifiApConnector.this.wifiApCallback != null) {
                WifiApConnector.this.wifiApCallback.onError("连接超时");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            zi9.m26852e("WifiApConnector", "连接超时");
            WifiApConnector.this.runOnUi(new Runnable() { // from class: com.eyevue.glassapp.helper.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18294a.lambda$run$0();
                }
            });
        }
    }

    public interface WifiApCallback {
        void onApWifiConnected();

        void onError(String message);
    }

    public WifiApConnector(Context context) {
        this.mContext = context;
    }

    public static /* synthetic */ int access$708(WifiApConnector wifiApConnector) {
        int i = wifiApConnector.connectTimes;
        wifiApConnector.connectTimes = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkNetworkCapabilities(Network network) {
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager == null) {
            return;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
        if (networkCapabilities != null) {
            Log.e("WifiApConnector", networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16) ? "网络验证：具备互联网访问权限" : "网络验证：局域网连接（AP 热点预期行为）");
        } else {
            Log.e("WifiApConnector", "网络验证：无法获取网络能力");
        }
    }

    private void connectLegacy(String ssid, String password) {
        if (!this.wifiManager.isWifiEnabled()) {
            this.wifiManager.setWifiEnabled(true);
        }
        List<WifiConfiguration> configuredNetworks = this.wifiManager.getConfiguredNetworks();
        if (configuredNetworks != null) {
            for (WifiConfiguration wifiConfiguration : configuredNetworks) {
                String str = wifiConfiguration.SSID;
                if (str != null) {
                    if (str.equals("\"" + ssid + "\"")) {
                        this.wifiManager.removeNetwork(wifiConfiguration.networkId);
                    }
                }
            }
        }
        WifiConfiguration wifiConfiguration2 = new WifiConfiguration();
        wifiConfiguration2.SSID = "\"" + ssid + "\"";
        wifiConfiguration2.preSharedKey = "\"" + password + "\"";
        wifiConfiguration2.allowedKeyManagement.set(1);
        wifiConfiguration2.allowedAuthAlgorithms.set(0);
        wifiConfiguration2.allowedGroupCiphers.set(3);
        wifiConfiguration2.allowedGroupCiphers.set(2);
        wifiConfiguration2.allowedPairwiseCiphers.set(2);
        wifiConfiguration2.allowedPairwiseCiphers.set(1);
        wifiConfiguration2.allowedProtocols.set(1);
        wifiConfiguration2.allowedProtocols.set(0);
        int iAddNetwork = this.wifiManager.addNetwork(wifiConfiguration2);
        if (iAddNetwork == -1) {
            zi9.m26852e("WifiApConnector", "添加网络配置失败");
            runOnUi(new Runnable() { // from class: bli
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14077a.lambda$connectLegacy$0();
                }
            });
            return;
        }
        this.wifiManager.disconnect();
        boolean zEnableNetwork = this.wifiManager.enableNetwork(iAddNetwork, true);
        this.wifiManager.reconnect();
        zi9.m26852e("WifiApConnector", "enableNetwork: " + zEnableNetwork + ", ssid: " + ssid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @c5e(api = 29)
    public void connectWithSpecifier(String ssid, String password) {
        unregisterNetworkCallback();
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(1).removeCapability(12).setNetworkSpecifier(ali.m886a().setSsidPattern(new PatternMatcher(ssid, 0)).setWpa2Passphrase(password).build()).build();
        this.networkRequest = networkRequestBuild;
        this.isRegisterNetwork = true;
        this.connectivityManager.requestNetwork(networkRequestBuild, this.networkCallback);
        zi9.m26852e("WifiApConnector", "已发起网络连接请求: " + ssid);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connectLegacy$0() {
        WifiApCallback wifiApCallback = this.wifiApCallback;
        if (wifiApCallback != null) {
            wifiApCallback.onError("配置网络失败");
        }
    }

    private void registerPostConnectionReceiver() {
        this.isRegisterPost = true;
        this.mContext.registerReceiver(this.postConnectionReceiver, new IntentFilter("android.net.wifi.action.WIFI_NETWORK_SUGGESTION_POST_CONNECTION"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void runOnUi(Runnable r) {
        C2478k.runOnUiThread(r);
    }

    private void unregisterNetworkCallback() {
        ConnectivityManager connectivityManager;
        if (!this.isRegisterNetwork || (connectivityManager = this.connectivityManager) == null) {
            return;
        }
        this.isRegisterNetwork = false;
        try {
            connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (Exception e) {
            zi9.m26852e("WifiApConnector", "注销 networkCallback 失败: " + e.getMessage());
        }
    }

    public void connectApwifi(String ssid, String password, WifiApCallback callback) {
        this.wifiApCallback = callback;
        this.pendingSsid = ssid;
        this.pendingPassword = password;
        this.connectTimes = 0;
        this.handler.removeCallbacks(this.timeoutRunnable);
        this.handler.postDelayed(this.timeoutRunnable, 60000L);
        if (Build.VERSION.SDK_INT < 29) {
            zi9.m26852e("WifiApConnector", "connectToWifi: Android Q 以下");
            connectLegacy(ssid, password);
        } else {
            zi9.m26852e("WifiApConnector", "connectToWifi: Android Q+");
            this.wifiManager.startScan();
            connectWithSpecifier(ssid, password);
        }
    }

    public void disconnectAp() {
        this.connectTimes = 3;
        this.handler.removeCallbacksAndMessages(null);
        unregisterNetworkCallback();
        ConnectivityManager connectivityManager = this.connectivityManager;
        if (connectivityManager != null) {
            connectivityManager.bindProcessToNetwork(null);
            this.connectivityManager = null;
        }
        this.wifiManager = null;
        if (this.isRegisterPost) {
            this.isRegisterPost = false;
            try {
                this.mContext.unregisterReceiver(this.postConnectionReceiver);
            } catch (Exception e) {
                zi9.m26852e("WifiApConnector", "注销 postConnectionReceiver 失败: " + e.getMessage());
            }
        }
    }

    public void init() {
        this.wifiManager = (WifiManager) this.mContext.getSystemService("wifi");
        this.connectivityManager = (ConnectivityManager) EyevueApplication.getEyevueApplication().getSystemService("connectivity");
        this.connectTimes = 0;
        registerPostConnectionReceiver();
    }
}
