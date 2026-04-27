package com.eyevue.glassapp.helper;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.net.wifi.p2p.WifiP2pConfig;
import android.net.wifi.p2p.WifiP2pDevice;
import android.net.wifi.p2p.WifiP2pDeviceList;
import android.net.wifi.p2p.WifiP2pInfo;
import android.net.wifi.p2p.WifiP2pManager;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import java.util.Optional;
import java.util.function.Predicate;
import p000.c5e;
import p000.wl7;

/* JADX INFO: loaded from: classes4.dex */
public class WifiP2pConnector {
    public static final String HOTSPOT_OPEN = "hotspot_open";
    private static final String TAG = "WifiDirectConnector";
    private WifiP2pManager.Channel channel;
    private boolean isConnected;
    private boolean isRegisterReceiver;
    private long lastConnectTime;
    private WifiDirectCallback mCallback;
    private Context mContext;
    private String mSsid;
    private WifiP2pManager manager;
    private WifiDirectBroadcastReceiver receiver;
    private int connectTimes = 0;
    private int connectingTime = 0;
    private final int MAX_CONNECT_TIME = 8;
    private final int CONNECT_TIMEOUT = 60000;
    private Handler handler = new Handler(Looper.getMainLooper());
    private final WifiP2pManager.PeerListListener peerListListener = new C26565();
    private Runnable timeoutRunnable = new Runnable() { // from class: com.eyevue.glassapp.helper.WifiP2pConnector.6
        @Override // java.lang.Runnable
        public void run() {
            if (WifiP2pConnector.this.mCallback != null) {
                WifiP2pConnector.this.mCallback.onError("连接超时");
            }
        }
    };

    /* JADX INFO: renamed from: com.eyevue.glassapp.helper.WifiP2pConnector$5 */
    public class C26565 implements WifiP2pManager.PeerListListener {
        public C26565() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ boolean lambda$onPeersAvailable$0(WifiP2pDevice wifiP2pDevice) {
            return wifiP2pDevice.deviceName.contains(WifiP2pConnector.this.mSsid);
        }

        @Override // android.net.wifi.p2p.WifiP2pManager.PeerListListener
        public void onPeersAvailable(WifiP2pDeviceList peerList) {
            WifiP2pDevice wifiP2pDevice;
            if (TextUtils.isEmpty(WifiP2pConnector.this.mSsid) || WifiP2pConnector.this.isConnected) {
                return;
            }
            Optional<WifiP2pDevice> optionalFindFirst = peerList.getDeviceList().stream().filter(new Predicate() { // from class: com.eyevue.glassapp.helper.j
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return this.f18295a.lambda$onPeersAvailable$0((WifiP2pDevice) obj);
                }
            }).findFirst();
            if (optionalFindFirst.isPresent() && (wifiP2pDevice = optionalFindFirst.get()) != null && !TextUtils.isEmpty(wifiP2pDevice.deviceAddress)) {
                WifiP2pConnector.this.connectP2p(wifiP2pDevice);
            }
            Log.i(WifiP2pConnector.TAG, "onPeersAvailable: 发现设备:::::!!!" + peerList.getDeviceList().size());
        }
    }

    public class WifiDirectBroadcastReceiver extends BroadcastReceiver {
        private WifiDirectBroadcastReceiver() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onReceive$0(WifiP2pInfo wifiP2pInfo) {
            C2473f.m4168e(WifiP2pConnector.TAG, "已连接p2p设备::" + wifiP2pInfo.groupFormed + "::::" + wifiP2pInfo.isGroupOwner);
            if (!wifiP2pInfo.groupFormed || wifiP2pInfo.isGroupOwner) {
                return;
            }
            WifiP2pConnector.this.isConnected = true;
            WifiP2pConnector.this.manager.stopPeerDiscovery(WifiP2pConnector.this.channel, null);
            WifiP2pConnector.this.handler.removeCallbacks(WifiP2pConnector.this.timeoutRunnable);
            if (WifiP2pConnector.this.mCallback != null) {
                WifiP2pConnector.this.mCallback.onDirectWifiConnected();
            }
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.net.wifi.p2p.STATE_CHANGED".equals(action)) {
                if (intent.getIntExtra("wifi_p2p_state", -1) == 2) {
                    C2473f.m4168e(WifiP2pConnector.TAG, "Wifi Direct enabled");
                    return;
                } else {
                    C2473f.m4168e(WifiP2pConnector.TAG, "Wifi Direct not enabled");
                    return;
                }
            }
            if ("android.net.wifi.p2p.PEERS_CHANGED".equals(action)) {
                WifiP2pConnector.this.manager.requestPeers(WifiP2pConnector.this.channel, WifiP2pConnector.this.peerListListener);
                return;
            }
            if ("android.net.wifi.p2p.CONNECTION_STATE_CHANGE".equals(action)) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                C2473f.m4168e(WifiP2pConnector.TAG, "Direct Mode connected successfully::" + networkInfo.isConnected());
                if (networkInfo.isConnected()) {
                    WifiP2pConnector.this.manager.requestConnectionInfo(WifiP2pConnector.this.channel, new WifiP2pManager.ConnectionInfoListener() { // from class: com.eyevue.glassapp.helper.k
                        @Override // android.net.wifi.p2p.WifiP2pManager.ConnectionInfoListener
                        public final void onConnectionInfoAvailable(WifiP2pInfo wifiP2pInfo) {
                            this.f18296a.lambda$onReceive$0(wifiP2pInfo);
                        }
                    });
                    return;
                }
                C2473f.m4168e(WifiP2pConnector.TAG, "连接次数::" + WifiP2pConnector.this.connectTimes);
                if (WifiP2pConnector.this.connectTimes < 8 || WifiP2pConnector.this.mCallback == null) {
                    return;
                }
                WifiP2pConnector.this.mCallback.onError("Connection failed: 重连次数：" + WifiP2pConnector.this.connectTimes);
                return;
            }
            if ("android.net.wifi.p2p.THIS_DEVICE_CHANGED".equals(action)) {
                WifiP2pDevice wifiP2pDevice = (WifiP2pDevice) intent.getParcelableExtra("wifiP2pDevice");
                Log.e(WifiP2pConnector.TAG, "WIFI_P2P_THIS_DEVICE_CHANGED_ACTION");
                if (wifiP2pDevice != null) {
                    C2473f.m4168e(WifiP2pConnector.TAG, "WIFI_P2P_THIS_DEVICE_CHANGED_ACTION ： " + wifiP2pDevice.status + "  重连次数：" + WifiP2pConnector.this.connectTimes);
                    if (wifiP2pDevice.status == 3 && WifiP2pConnector.this.connectTimes >= 8 && WifiP2pConnector.this.mCallback != null) {
                        WifiP2pConnector.this.mCallback.onError("fail:3");
                    } else if (wifiP2pDevice.status == 3 && WifiP2pConnector.this.isConnected) {
                        if (WifiP2pConnector.this.mCallback != null) {
                            WifiP2pConnector.this.mCallback.onError("disconnect:3");
                        }
                        WifiP2pConnector.this.isConnected = false;
                    }
                }
            }
        }
    }

    public interface WifiDirectCallback {
        void onDirectWifiConnected();

        void onError(String message);
    }

    public WifiP2pConnector(Context context) {
        this.mContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @c5e(api = 30)
    public void connectP2p(WifiP2pDevice wifiP2pDevice) {
        int i = wifiP2pDevice.status;
        if ((i == 0 || i == 1) && this.connectingTime < 3) {
            C2473f.m4168e(TAG, "正在连接中 不给连接:::" + wifiP2pDevice.status);
            this.connectingTime = this.connectingTime + 1;
            return;
        }
        if (System.currentTimeMillis() - this.lastConnectTime < 500) {
            return;
        }
        WifiP2pConfig wifiP2pConfig = new WifiP2pConfig();
        wifiP2pConfig.deviceAddress = wifiP2pDevice.deviceAddress;
        wifiP2pConfig.wps.setup = 0;
        C2473f.m4168e(TAG, "连接p2p wifi: " + wifiP2pDevice.deviceName + C2473f.f17566z + wifiP2pDevice.deviceAddress + ":::" + wifiP2pDevice.status);
        this.connectingTime = 0;
        this.connectTimes = this.connectTimes + 1;
        this.lastConnectTime = System.currentTimeMillis();
        this.handler.removeCallbacks(this.timeoutRunnable);
        this.handler.postDelayed(this.timeoutRunnable, 60000L);
        this.manager.connect(this.channel, wifiP2pConfig, new WifiP2pManager.ActionListener() { // from class: com.eyevue.glassapp.helper.WifiP2pConnector.2
            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onFailure(int reason) {
                WifiP2pConnector.this.isConnected = false;
                C2473f.m4168e(WifiP2pConnector.TAG, "Connection failed: " + reason);
            }

            @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
            public void onSuccess() {
                C2473f.m4168e(WifiP2pConnector.TAG, "Connection initiated");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$connectToDirectWifi$0() {
        this.mCallback.onError(HOTSPOT_OPEN);
    }

    private void registerWifiDirectReceiver() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.wifi.p2p.STATE_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.PEERS_CHANGED");
        intentFilter.addAction("android.net.wifi.p2p.CONNECTION_STATE_CHANGE");
        intentFilter.addAction("android.net.wifi.p2p.THIS_DEVICE_CHANGED");
        WifiDirectBroadcastReceiver wifiDirectBroadcastReceiver = new WifiDirectBroadcastReceiver();
        this.receiver = wifiDirectBroadcastReceiver;
        this.mContext.registerReceiver(wifiDirectBroadcastReceiver, intentFilter);
        this.isRegisterReceiver = true;
    }

    private void searchWifiP2p(String ssid, String password) {
        try {
            this.mSsid = ssid;
            this.handler.removeCallbacks(this.timeoutRunnable);
            this.handler.postDelayed(this.timeoutRunnable, 60000L);
            this.manager.discoverPeers(this.channel, new WifiP2pManager.ActionListener() { // from class: com.eyevue.glassapp.helper.WifiP2pConnector.1
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int reason) {
                    Log.e(WifiP2pConnector.TAG, "Peer discovery failed: " + reason);
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    Log.e(WifiP2pConnector.TAG, "Peer discovery started");
                }
            });
        } catch (Exception e) {
            Log.e(TAG, "WifiP2pManager error", e);
            WifiDirectCallback wifiDirectCallback = this.mCallback;
            if (wifiDirectCallback != null) {
                wifiDirectCallback.onError(e.getMessage());
            }
        }
    }

    public void connectToDirectWifi(String ssid, String password, WifiDirectCallback callback) {
        this.mCallback = callback;
        if (wl7.isApWifiEnabled(this.mContext)) {
            C2478k.runOnUiThread(new Runnable() { // from class: hli
                @Override // java.lang.Runnable
                public final void run() {
                    this.f44097a.lambda$connectToDirectWifi$0();
                }
            });
        } else {
            searchWifiP2p(ssid, password);
        }
    }

    public void disconnectP2p() {
        WifiP2pManager.Channel channel;
        WifiP2pManager wifiP2pManager = this.manager;
        if (wifiP2pManager != null && (channel = this.channel) != null) {
            wifiP2pManager.stopPeerDiscovery(channel, null);
            this.manager.cancelConnect(this.channel, new WifiP2pManager.ActionListener() { // from class: com.eyevue.glassapp.helper.WifiP2pConnector.3
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int reason) {
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    C2473f.m4168e(WifiP2pConnector.TAG, "Cancel connect success");
                }
            });
            this.manager.removeGroup(this.channel, new WifiP2pManager.ActionListener() { // from class: com.eyevue.glassapp.helper.WifiP2pConnector.4
                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onFailure(int reason) {
                }

                @Override // android.net.wifi.p2p.WifiP2pManager.ActionListener
                public void onSuccess() {
                    C2473f.m4168e(WifiP2pConnector.TAG, " remove group success");
                }
            });
        }
        if (this.isRegisterReceiver) {
            this.mContext.unregisterReceiver(this.receiver);
            this.isRegisterReceiver = false;
        }
        this.handler.removeCallbacksAndMessages(null);
        this.mSsid = "";
        this.connectTimes = 0;
        this.isConnected = false;
    }

    public void init() {
        WifiP2pManager wifiP2pManager = (WifiP2pManager) this.mContext.getSystemService("wifip2p");
        this.manager = wifiP2pManager;
        this.channel = wifiP2pManager.initialize(this.mContext, Looper.getMainLooper(), null);
        registerWifiDirectReceiver();
        this.handler.removeCallbacks(this.timeoutRunnable);
        this.handler.postDelayed(this.timeoutRunnable, 60000L);
    }

    public void setmCallback(WifiDirectCallback mCallback) {
        this.mCallback = mCallback;
    }
}
