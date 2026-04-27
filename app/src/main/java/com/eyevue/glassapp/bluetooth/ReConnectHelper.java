package com.eyevue.glassapp.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.core.app.NotificationCompat;
import com.eyevue.glassapp.bluetooth.ReConnectHelper;
import com.eyevue.glassapp.bluetooth.ota.ble.BleManager;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import com.jieli.jl_bt_ota.util.ParseDataUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p000.ch8;
import p000.dh8;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.k94;
import p000.md8;
import p000.n51;
import p000.v91;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class ReConnectHelper {
    private static final long FAILED_DELAY = 3000;
    private static final int MSG_PROCESS_TASK = 2;
    private static final int MSG_RECONNECT_TIMEOUT = 1;
    private static final long SCAN_TIMEOUT = 20000;

    @yfb
    private final BleEventCallback bleEventCallback;

    @yfb
    private final Map<String, n51> mBleAdvCache;

    @yfb
    private final BleManager mBtManager;

    @yfb
    private final Context mContext;

    @yfb
    private final List<ReconnectParam> mParams;

    @yfb
    private final Handler mUIHandler;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final String TAG = ReConnectHelper.class.getSimpleName();
    private static final long RECONNECT_TIMEOUT = k94.f52848m;

    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        private Companion() {
        }
    }

    @e0g(parameters = 0)
    public static final class ReconnectParam {
        public static final int $stable = 8;

        @gib
        private String connectAddress;

        @yfb
        private final String deviceAddress;
        private final boolean isUseNewADV;

        public ReconnectParam(@yfb String str, boolean z) {
            md8.checkNotNullParameter(str, "deviceAddress");
            this.deviceAddress = str;
            this.isUseNewADV = z;
        }

        public boolean equals(@gib Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !md8.areEqual(ReconnectParam.class, obj.getClass())) {
                return false;
            }
            ReconnectParam reconnectParam = (ReconnectParam) obj;
            return this.isUseNewADV == reconnectParam.isUseNewADV && md8.areEqual(this.deviceAddress, reconnectParam.deviceAddress);
        }

        @gib
        public final String getConnectAddress() {
            return this.connectAddress;
        }

        @yfb
        public final String getDeviceAddress() {
            return this.deviceAddress;
        }

        public int hashCode() {
            return Objects.hash(this.deviceAddress, Boolean.valueOf(this.isUseNewADV));
        }

        public final boolean isUseNewADV() {
            return this.isUseNewADV;
        }

        public final void setConnectAddress(@gib String str) {
            this.connectAddress = str;
        }

        @yfb
        public String toString() {
            return "ReconnectParam{deviceAddress='" + this.deviceAddress + "', isUseNewADV=" + this.isUseNewADV + ", connectAddress='" + this.connectAddress + "'}";
        }
    }

    public ReConnectHelper(@yfb Context context, @yfb BleManager bleManager) {
        md8.checkNotNullParameter(context, "mContext");
        md8.checkNotNullParameter(bleManager, "mBtManager");
        this.mContext = context;
        this.mBtManager = bleManager;
        this.mParams = new ArrayList();
        this.mBleAdvCache = new HashMap();
        this.mUIHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: mqd
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return ReConnectHelper.mUIHandler$lambda$0(this.f61771a, message);
            }
        });
        BleEventCallback bleEventCallback = new BleEventCallback() { // from class: com.eyevue.glassapp.bluetooth.ReConnectHelper$bleEventCallback$1
            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onAdapterChange(boolean z) {
                if (this.this$0.isReconnecting() && z) {
                    dh8.m9156i(ReConnectHelper.TAG, "onAdapterChange : bluetooth is on, try to start le scan.");
                    this.this$0.mUIHandler.sendEmptyMessage(2);
                }
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onBleConnection(BluetoothDevice bluetoothDevice, int i) {
                if (!this.this$0.isReconnecting() || bluetoothDevice == null) {
                    return;
                }
                n51 n51Var = (n51) this.this$0.mBleAdvCache.get(bluetoothDevice.getAddress());
                if (this.this$0.isReconnectDevice(bluetoothDevice, n51Var)) {
                    dh8.m9156i(ReConnectHelper.TAG, "onBleConnection : " + bluetoothDevice + ", status = " + i + ", " + n51Var);
                    if (i == 0) {
                        dh8.m9156i(ReConnectHelper.TAG, "-onConnection- resume reconnect task.");
                        this.this$0.mUIHandler.sendEmptyMessage(2);
                        return;
                    }
                    if (i != 2) {
                        return;
                    }
                    dh8.m9160w(ReConnectHelper.TAG, "onBleConnection : removeParam >>> " + bluetoothDevice.getAddress());
                    ReConnectHelper reConnectHelper = this.this$0;
                    String address = bluetoothDevice.getAddress();
                    md8.checkNotNullExpressionValue(address, "getAddress(...)");
                    reConnectHelper.removeParam(address);
                }
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onDiscoveryBle(BluetoothDevice bluetoothDevice, BleScanInfo bleScanInfo) {
                md8.checkNotNullParameter(bleScanInfo, "bleScanMessage");
                if (!this.this$0.isReconnecting() || bluetoothDevice == null) {
                    return;
                }
                n51 oTAFlagFilterWithBroad = ParseDataUtil.parseOTAFlagFilterWithBroad(bleScanInfo.getRawData(), ch8.f16534E);
                if (oTAFlagFilterWithBroad != null) {
                    this.this$0.mBleAdvCache.put(bluetoothDevice.getAddress(), oTAFlagFilterWithBroad);
                    dh8.m9151d(ReConnectHelper.TAG, "onDiscoveryBle : put data in map.");
                }
                boolean zIsReconnectDevice = this.this$0.isReconnectDevice(bluetoothDevice, oTAFlagFilterWithBroad);
                dh8.m9151d(ReConnectHelper.TAG, "onDiscoveryBle : " + bluetoothDevice + ", isReconnectDevice = " + zIsReconnectDevice + ", " + oTAFlagFilterWithBroad);
                if (zIsReconnectDevice) {
                    this.this$0.stopBtScan();
                    ReConnectHelper reConnectHelper = this.this$0;
                    String address = bluetoothDevice.getAddress();
                    md8.checkNotNullExpressionValue(address, "getAddress(...)");
                    ReConnectHelper.ReconnectParam cacheParam = reConnectHelper.getCacheParam(address);
                    if (cacheParam != null) {
                        cacheParam.setConnectAddress(bluetoothDevice.getAddress());
                    }
                    dh8.m9151d(ReConnectHelper.TAG, "onDiscoveryBle : " + bluetoothDevice + ", param = " + cacheParam);
                    this.this$0.mBtManager.connectBleDevice(bluetoothDevice);
                }
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onDiscoveryBleChange(boolean z) {
                if (this.this$0.isReconnecting()) {
                    boolean zIsConnecting = this.this$0.mBtManager.isConnecting();
                    dh8.m9156i(ReConnectHelper.TAG, "onDiscoveryBleChange : " + z + ", isConnecting = " + zIsConnecting);
                    if (z || zIsConnecting) {
                        return;
                    }
                    this.this$0.mUIHandler.sendEmptyMessage(2);
                }
            }
        };
        this.bleEventCallback = bleEventCallback;
        bleManager.registerBleEventCallback(bleEventCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ReconnectParam getCacheParam(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return null;
        }
        n51 n51Var = this.mBleAdvCache.get(str);
        Iterator it = new ArrayList(this.mParams).iterator();
        md8.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            ReconnectParam reconnectParam = (ReconnectParam) it.next();
            if (md8.areEqual(str, reconnectParam.getDeviceAddress()) || (n51Var != null && md8.areEqual(reconnectParam.getDeviceAddress(), n51Var.getOldBleAddress()))) {
                return reconnectParam;
            }
        }
        return null;
    }

    private final BluetoothDevice getSystemConnectedDevice() {
        List<BluetoothDevice> systemConnectedBtDeviceList = v91.getSystemConnectedBtDeviceList(this.mContext);
        if (systemConnectedBtDeviceList != null && !systemConnectedBtDeviceList.isEmpty()) {
            for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
                if (isReconnectDevice(bluetoothDevice, null)) {
                    return bluetoothDevice;
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isReconnectDevice(BluetoothDevice bluetoothDevice, n51 n51Var) {
        boolean zAreEqual = false;
        if (bluetoothDevice != null && !this.mParams.isEmpty()) {
            Iterator it = new ArrayList(this.mParams).iterator();
            md8.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                ReconnectParam reconnectParam = (ReconnectParam) it.next();
                zAreEqual = (reconnectParam.isUseNewADV() && n51Var != null && n51Var.isOTA()) ? md8.areEqual(reconnectParam.getDeviceAddress(), n51Var.getOldBleAddress()) : md8.areEqual(reconnectParam.getDeviceAddress(), bluetoothDevice.getAddress());
                if (zAreEqual) {
                    break;
                }
            }
        }
        return zAreEqual;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean mUIHandler$lambda$0(ReConnectHelper reConnectHelper, Message message) {
        md8.checkNotNullParameter(message, NotificationCompat.CATEGORY_MESSAGE);
        int i = message.what;
        if (i == 1) {
            reConnectHelper.stopBtScan();
            reConnectHelper.mParams.clear();
        } else if (i != 2) {
            Object obj = message.obj;
            if (obj instanceof String) {
                md8.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                reConnectHelper.removeParam((String) obj);
            }
        } else {
            reConnectHelper.processReconnectTask();
        }
        return true;
    }

    private final void processReconnectTask() {
        if (this.mBtManager.isBleScanning()) {
            this.mUIHandler.sendEmptyMessageDelayed(2, 3000L);
            return;
        }
        BluetoothDevice systemConnectedDevice = getSystemConnectedDevice();
        if (systemConnectedDevice == null) {
            if (this.mBtManager.startLeScan(20000L)) {
                return;
            }
            dh8.m9156i(TAG, "processReconnectTask : start Le scan failed.");
            this.mUIHandler.sendEmptyMessageDelayed(2, 3000L);
            return;
        }
        String address = systemConnectedDevice.getAddress();
        md8.checkNotNullExpressionValue(address, "getAddress(...)");
        ReconnectParam cacheParam = getCacheParam(address);
        if (cacheParam != null) {
            cacheParam.setConnectAddress(systemConnectedDevice.getAddress());
        }
        this.mBtManager.connectBleDevice(systemConnectedDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void removeParam(String str) {
        ReconnectParam cacheParam = getCacheParam(str);
        if (cacheParam == null) {
            return;
        }
        if (this.mParams.remove(cacheParam)) {
            this.mUIHandler.removeMessages(cacheParam.hashCode());
            if (this.mParams.isEmpty()) {
                this.mUIHandler.removeMessages(1);
                return;
            }
        }
        this.mUIHandler.sendEmptyMessage(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void stopBtScan() {
        this.mBtManager.stopLeScan();
    }

    public final boolean isMatchAddress(@yfb String str, @yfb String str2) {
        md8.checkNotNullParameter(str, "srcAddress");
        md8.checkNotNullParameter(str2, "checkAddress");
        ReconnectParam cacheParam = getCacheParam(str);
        if (cacheParam == null || !BluetoothAdapter.checkBluetoothAddress(str2)) {
            return false;
        }
        return md8.areEqual(str2, cacheParam.getDeviceAddress()) || md8.areEqual(str2, cacheParam.getConnectAddress());
    }

    public final boolean isReconnecting() {
        return this.mUIHandler.hasMessages(1);
    }

    public final boolean putParam(@gib ReconnectParam reconnectParam) {
        if (reconnectParam == null) {
            return false;
        }
        if (this.mParams.contains(reconnectParam)) {
            return true;
        }
        if (!this.mParams.add(reconnectParam)) {
            return false;
        }
        Handler handler = this.mUIHandler;
        int iHashCode = this.mParams.hashCode();
        long j = RECONNECT_TIMEOUT;
        handler.sendEmptyMessageDelayed(iHashCode, j);
        if (!isReconnecting()) {
            Handler handler2 = this.mUIHandler;
            handler2.sendMessageDelayed(handler2.obtainMessage(1, reconnectParam.getDeviceAddress()), j + ((long) 10000));
            this.mUIHandler.sendEmptyMessage(2);
        }
        return true;
    }

    public final void release() {
        this.mParams.clear();
        this.mBleAdvCache.clear();
        this.mUIHandler.removeCallbacksAndMessages(null);
        this.mBtManager.unregisterBleEventCallback(this.bleEventCallback);
    }
}
