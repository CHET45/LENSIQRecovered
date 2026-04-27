package com.eyevue.glassapp.bluetooth.ota.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.eyevue.glassapp.bluetooth.ReConnectHelper;
import com.eyevue.glassapp.bluetooth.ota.ConfigHelper;
import com.eyevue.glassapp.bluetooth.ota.ble.BleManager;
import com.eyevue.glassapp.bluetooth.ota.ble.SendBleDataThread;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnWriteDataCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleDevice;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import com.eyevue.glassapp.utils.AppUtil;
import com.jieli.jl_bt_ota.impl.AbstractC3831a;
import com.watchfun.base.BaseApplication;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import p000.dh8;
import p000.efb;
import p000.igg;
import p000.kc2;
import p000.pk1;
import p000.v91;
import p000.x81;

/* JADX INFO: loaded from: classes4.dex */
public class BleManager {
    private static final int CALLBACK_TIMEOUT = 6000;
    private static final int CONNECT_BLE_TIMEOUT = 40000;
    private static final int MIN_CONNECT_TIME = 8000;
    private static final int MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT = 4117;
    private static final int MSG_CHANGE_BLE_MTU_TIMEOUT = 4116;
    private static final int MSG_CONNECT_BLE_TIMEOUT = 4113;
    private static final int MSG_DISCONNECT_BLE_TIMEOUT = 4118;
    private static final int MSG_NOTIFY_BLE_TIMEOUT = 4115;
    private static final int MSG_SCAN_BLE_TIMEOUT = 4112;
    private static final int MSG_SCAN_HID_DEVICE = 4114;
    private static final int RECONNECT_BLE_DELAY = 2000;
    private static final int SCAN_BLE_TIMEOUT = 12000;
    public static final int SEND_DATA_MAX_TIMEOUT = 8000;
    private static final String TAG = "BleManager";

    @igg({"StaticFieldLeak"})
    private static volatile BleManager instance;
    private volatile boolean isBleScanning;
    private BaseBtAdapterReceiver mAdapterReceiver;
    private final BluetoothAdapter mBluetoothAdapter;
    private BluetoothLeScanner mBluetoothLeScanner;
    private final Context mContext;
    private NotifyCharacteristicRunnable mNotifyCharacteristicRunnable;
    private final ReConnectHelper mReConnectHelper;
    private volatile BluetoothDevice mUsingDevice;
    public static final UUID BLE_UUID_SERVICE = x81.f97146m;
    public static final UUID BLE_UUID_WRITE = x81.f97147n;
    public static final UUID BLE_UUID_NOTIFICATION = x81.f97148o;
    public static final UUID BLE_UUID_NOTIFICATION_DESCRIPTOR = UUID.fromString("00002902-0000-1000-8000-00805F9B34FB");
    private final ConfigHelper configHelper = ConfigHelper.Companion.getInstance();
    private final Map<String, BleDevice> mBleDeviceMap = new HashMap();
    private final List<BluetoothDevice> mDiscoveredBleDevices = new ArrayList();
    private final BleEventCallbackManager mCallbackManager = new BleEventCallbackManager();
    private final Handler mHandler = new Handler(Looper.getMainLooper(), new Handler.Callback() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleManager.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // android.os.Handler.Callback
        public boolean handleMessage(@efb Message msg) {
            List<BluetoothGattService> services;
            switch (msg.what) {
                case BleManager.MSG_SCAN_BLE_TIMEOUT /* 4112 */:
                    dh8.m9157i(BleManager.TAG, "MSG_SCAN_BLE_TIMEOUT", "");
                    BleManager.this.stopLeScan();
                    return true;
                case 4113:
                    Object obj = msg.obj;
                    if (!(obj instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                    dh8.m9157i(BleManager.TAG, "MSG_CONNECT_BLE_TIMEOUT", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice));
                    BleManager.this.disconnectBleDevice(bluetoothDevice);
                    return true;
                case 4114:
                    List<BluetoothDevice> systemConnectedBtDeviceList = v91.getSystemConnectedBtDeviceList(BleManager.this.mContext);
                    if (systemConnectedBtDeviceList != null && AppUtil.checkHasConnectPermission(BleManager.this.mContext)) {
                        for (BluetoothDevice bluetoothDevice2 : systemConnectedBtDeviceList) {
                            if (bluetoothDevice2.getType() != 1 && bluetoothDevice2.getBondState() == 12) {
                                BleManager.this.handleDiscoveryBle(bluetoothDevice2, new BleScanInfo().setEnableConnect(true));
                            }
                        }
                    }
                    BleManager.this.mHandler.sendEmptyMessageDelayed(4114, 1000L);
                    return true;
                case 4115:
                    Object obj2 = msg.obj;
                    if (!(obj2 instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) obj2;
                    dh8.m9157i(BleManager.TAG, "MSG_NOTIFY_BLE_TIMEOUT", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice3));
                    BleManager.this.disconnectBleDevice(bluetoothDevice3);
                    return true;
                case BleManager.MSG_CHANGE_BLE_MTU_TIMEOUT /* 4116 */:
                    Object obj3 = msg.obj;
                    if (!(obj3 instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice4 = (BluetoothDevice) obj3;
                    BleDevice bleDevice = BleManager.this.getBleDevice(bluetoothDevice4);
                    dh8.m9157i(BleManager.TAG, "MSG_CHANGE_BLE_MTU_TIMEOUT", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice4) + ", " + bleDevice);
                    if (bleDevice == null) {
                        return false;
                    }
                    BleManager.this.handleBleConnection(bluetoothDevice4, 2);
                    return true;
                case BleManager.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT /* 4117 */:
                    Object obj4 = msg.obj;
                    if (!(obj4 instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice5 = (BluetoothDevice) obj4;
                    BleDevice bleDevice2 = BleManager.this.getBleDevice(bluetoothDevice5);
                    dh8.m9157i(BleManager.TAG, "MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice5) + ", " + bleDevice2);
                    if (bleDevice2 == null) {
                        return false;
                    }
                    BluetoothGatt gatt = bleDevice2.getGatt();
                    if (gatt == null || (services = gatt.getServices()) == null || services.isEmpty()) {
                        dh8.m9157i(BleManager.TAG, "MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT", "disconnectBleDevice");
                        bleDevice2.setNeedReconnect(true);
                        BleManager.this.disconnectBleDevice(bluetoothDevice5);
                    } else {
                        BleManager.this.mBluetoothGattCallback.onServicesDiscovered(gatt, 0);
                    }
                    return true;
                case BleManager.MSG_DISCONNECT_BLE_TIMEOUT /* 4118 */:
                    Object obj5 = msg.obj;
                    if (!(obj5 instanceof BluetoothDevice)) {
                        return false;
                    }
                    BluetoothDevice bluetoothDevice6 = (BluetoothDevice) obj5;
                    BluetoothGatt connectedBtGatt = BleManager.this.getConnectedBtGatt(bluetoothDevice6);
                    dh8.m9152d(BleManager.TAG, "MSG_DISCONNECT_BLE_TIMEOUT", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice6) + ", gatt : " + connectedBtGatt);
                    if (connectedBtGatt == null) {
                        return false;
                    }
                    BleManager.this.closeGatt(connectedBtGatt);
                    BleManager.this.handleBleConnection(bluetoothDevice6, 0);
                    return true;
                default:
                    return true;
            }
        }
    });
    private final BluetoothAdapter.LeScanCallback mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: l51
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public final void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
            this.f56173a.lambda$new$1(bluetoothDevice, i, bArr);
        }
    };
    private final ScanCallback mScanCallback = new ScanCallback() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleManager.2
        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> results) {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int errorCode) {
            dh8.m9152d(BleManager.TAG, "onScanFailed", "code : " + errorCode);
            BleManager.this.stopLeScan();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, ScanResult result) {
            if (result == null || result.getScanRecord() == null) {
                return;
            }
            BleManager.this.filterDevice(result.getDevice(), result.getRssi(), result.getScanRecord().getBytes(), result.isConnectable());
        }
    };
    private final BluetoothGattCallback mBluetoothGattCallback = new BluetoothGattCallback() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BleManager.3
        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
            BluetoothDevice device;
            if (gatt == null || (device = gatt.getDevice()) == null || characteristic == null) {
                return;
            }
            UUID uuid = characteristic.getUuid();
            byte[] value = characteristic.getValue();
            BluetoothGattService service = characteristic.getService();
            UUID uuid2 = service != null ? service.getUuid() : null;
            dh8.m9151d(BleManager.TAG, kc2.formatString("[onCharacteristicChanged] <<< deice : %s, serviceUuid = %s, characteristicUuid = %s, \ndata : [%s]", BleManager.this.printDeviceInfo(device), uuid2, uuid, pk1.byte2HexStr(value)));
            BleManager.this.mCallbackManager.onBleDataNotification(device, uuid2, uuid, value);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
            if (gatt == null || gatt.getDevice() == null || characteristic == null) {
                return;
            }
            BluetoothDevice device = gatt.getDevice();
            UUID uuid = characteristic.getUuid();
            BluetoothGattService service = characteristic.getService();
            UUID uuid2 = service != null ? service.getUuid() : null;
            byte[] value = characteristic.getValue();
            dh8.m9152d(BleManager.TAG, "onCharacteristicWrite", kc2.formatString("device : %s, serviceUuid = %s, characteristicUuid = %s, status = %d, \ndata : [%s]", BleManager.this.printDeviceInfo(device), uuid2, uuid, Integer.valueOf(status), pk1.byte2HexStr(value)));
            BleManager.this.wakeupSendThread(gatt, uuid2, uuid, status, value);
            BleManager.this.mCallbackManager.onBleWriteStatus(device, uuid2, uuid, value, status);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
            BluetoothDevice device;
            if (gatt == null || (device = gatt.getDevice()) == null) {
                return;
            }
            BleDevice bleDevice = BleManager.this.getBleDevice(device);
            dh8.m9157i(BleManager.TAG, "onConnectionStateChange", kc2.formatString("device : %s, status = %d, newState = %d.\n%s", BleManager.this.printDeviceInfo(device), Integer.valueOf(status), Integer.valueOf(newState), bleDevice));
            if (newState == 0 || newState == 3 || newState == 2) {
                BleManager.this.stopConnectTimeout();
                if (newState == 2) {
                    bleDevice.setGatt(gatt);
                    boolean zDiscoverServices = gatt.discoverServices();
                    dh8.m9152d(BleManager.TAG, "onConnectionStateChange", "discoverServices : " + zDiscoverServices);
                    if (!zDiscoverServices) {
                        BleManager.this.disconnectBleDevice(device);
                        return;
                    } else {
                        BleManager.this.mHandler.removeMessages(BleManager.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
                        BleManager.this.mHandler.sendMessageDelayed(BleManager.this.mHandler.obtainMessage(BleManager.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT, device), AbstractC3831a.f24122V);
                        return;
                    }
                }
                BleManager.this.mHandler.removeMessages(BleManager.MSG_DISCONNECT_BLE_TIMEOUT);
                BleManager.this.closeGatt(gatt);
                if (bleDevice.getConnection() != 2) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - bleDevice.getConnectedTime();
                    boolean z = bleDevice.isNeedReconnect() || (status != 19 && jCurrentTimeMillis > 0 && jCurrentTimeMillis < 8000);
                    dh8.m9152d(BleManager.TAG, "onConnectionStateChange", "usedConnectTime = " + jCurrentTimeMillis + ", limit time = 8000, isNeedReconnect : " + z);
                    if (z && !bleDevice.isOverReconnectLimit()) {
                        dh8.m9157i(BleManager.TAG, "onConnectionStateChange", "Ready to reconnect device.");
                        bleDevice.setConnection(0).setMtu(20).setConnectedTime(0L);
                        SystemClock.sleep(1000L);
                        if (BleManager.this.connectBleDevice(device)) {
                            return;
                        }
                        bleDevice.setConnection(1);
                        BleManager.this.handleBleConnection(device, 0);
                        return;
                    }
                }
            }
            BleManager.this.handleBleConnection(device, newState);
        }

        public void onConnectionUpdated(BluetoothGatt gatt, int interval, int latency, int timeout, int status) {
            BluetoothDevice device;
            if (gatt == null || !AppUtil.checkHasConnectPermission(BleManager.this.mContext) || (device = gatt.getDevice()) == null) {
                return;
            }
            dh8.m9155e(BleManager.TAG, "onConnectionUpdated", "device : " + BleManager.this.printDeviceInfo(device) + ", interval : " + interval + ", latency : " + latency + ", timeout : " + timeout + ", status : " + status);
            BleManager.this.mCallbackManager.onConnectionUpdated(device, interval, latency, timeout, status);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
            BluetoothDevice device;
            UUID uuid;
            UUID uuid2;
            if (gatt == null || (device = gatt.getDevice()) == null || descriptor == null) {
                return;
            }
            BluetoothGattCharacteristic characteristic = descriptor.getCharacteristic();
            if (characteristic != null) {
                uuid2 = characteristic.getUuid();
                BluetoothGattService service = characteristic.getService();
                uuid = service != null ? service.getUuid() : null;
            } else {
                uuid = null;
                uuid2 = null;
            }
            dh8.m9157i(BleManager.TAG, "onDescriptorWrite", kc2.formatString("device : %s, serviceUuid = %s, characteristicUuid = %s, descriptor = %s, status = %d", BleManager.this.printDeviceInfo(device), uuid, uuid2, descriptor.getUuid(), Integer.valueOf(status)));
            BleManager.this.mCallbackManager.onBleNotificationStatus(device, uuid, uuid2, status);
            if (BleManager.this.mNotifyCharacteristicRunnable == null || !v91.deviceEquals(device, BleManager.this.mNotifyCharacteristicRunnable.getBleDevice()) || uuid == null || !uuid.equals(BleManager.this.mNotifyCharacteristicRunnable.getServiceUUID()) || uuid2 == null || !uuid2.equals(BleManager.this.mNotifyCharacteristicRunnable.getCharacteristicUUID()) || descriptor.getUuid() == null || !descriptor.getUuid().equals(BleManager.this.mNotifyCharacteristicRunnable.mDescriptorUUID)) {
                return;
            }
            if (status == 0) {
                BleManager.this.mNotifyCharacteristicRunnable = null;
                int bleRequestMtu = BleManager.this.configHelper.getBleRequestMtu();
                if (bleRequestMtu > 509) {
                    bleRequestMtu = 509;
                }
                BleManager.this.startChangeMtu(gatt, bleRequestMtu);
                return;
            }
            int retryNum = BleManager.this.mNotifyCharacteristicRunnable.getRetryNum();
            if (retryNum >= 3) {
                BleManager.this.disconnectBleDevice(device);
            } else {
                BleManager.this.mNotifyCharacteristicRunnable.setRetryNum(retryNum + 1);
                BleManager.this.mHandler.postDelayed(BleManager.this.mNotifyCharacteristicRunnable, 100L);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
            BluetoothDevice device;
            if (gatt == null || (device = gatt.getDevice()) == null) {
                return;
            }
            dh8.m9152d(BleManager.TAG, "onMtuChanged", kc2.formatString("device : %s, mtu = %d, status = %d", BleManager.this.printDeviceInfo(device), Integer.valueOf(mtu), Integer.valueOf(status)));
            BleManager.this.mCallbackManager.onBleDataBlockChanged(device, mtu, status);
            BleDevice bleDevice = BleManager.this.getBleDevice(device);
            if (bleDevice != null && BleManager.this.mHandler.hasMessages(BleManager.MSG_CHANGE_BLE_MTU_TIMEOUT)) {
                int i = status == 0 ? mtu - 3 : 20;
                BleManager.this.stopChangeMtu();
                bleDevice.setMtu(i);
                dh8.m9157i(BleManager.TAG, "onMtuChanged", "MTU modified successfully");
                BleManager.this.handleBleConnection(device, 2);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onServicesDiscovered(BluetoothGatt gatt, int status) {
            BluetoothDevice device;
            boolean z;
            if (gatt == null || (device = gatt.getDevice()) == null || BleManager.this.getBleDevice(device) == null) {
                return;
            }
            BleManager.this.mHandler.removeMessages(BleManager.MSG_BLE_DISCOVER_SERVICES_CALLBACK_TIMEOUT);
            BleManager.this.mCallbackManager.onBleServiceDiscovery(device, status, gatt.getServices());
            if (status == 0) {
                AppUtil.printBleGattServices(BleManager.this.mContext, device, gatt, status);
                for (BluetoothGattService bluetoothGattService : gatt.getServices()) {
                    UUID uuid = BleManager.BLE_UUID_SERVICE;
                    if (uuid.equals(bluetoothGattService.getUuid()) && bluetoothGattService.getCharacteristic(BleManager.BLE_UUID_WRITE) != null) {
                        UUID uuid2 = BleManager.BLE_UUID_NOTIFICATION;
                        if (bluetoothGattService.getCharacteristic(uuid2) != null) {
                            dh8.m9157i(BleManager.TAG, "onServicesDiscovered", "start NotifyCharacteristicRunnable...");
                            BleManager bleManager = BleManager.this;
                            bleManager.mNotifyCharacteristicRunnable = new NotifyCharacteristicRunnable(gatt, uuid, uuid2);
                            BleManager.this.mHandler.post(BleManager.this.mNotifyCharacteristicRunnable);
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
            } else {
                z = false;
            }
            dh8.m9157i(BleManager.TAG, "onServicesDiscovered", "" + z);
            if (z) {
                return;
            }
            BleManager.this.disconnectBleDevice(device);
        }
    };

    public class BaseBtAdapterReceiver extends BroadcastReceiver {
        private BaseBtAdapterReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            switch (action) {
                case "android.bluetooth.adapter.action.STATE_CHANGED":
                    int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
                    int intExtra2 = intent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_STATE", -1);
                    if (BleManager.this.mBluetoothAdapter != null && intExtra == -1) {
                        intExtra = BleManager.this.mBluetoothAdapter.getState();
                    }
                    if (intExtra != intExtra2) {
                        if (intExtra == 10) {
                            BleManager.this.isBleScanning(false);
                            BleManager.this.mDiscoveredBleDevices.clear();
                            BleManager.this.clearConnectedBleDevices();
                            BleManager.this.mCallbackManager.onAdapterChange(false);
                        } else if (intExtra == 12) {
                            BleManager.this.mCallbackManager.onAdapterChange(true);
                        }
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.ACL_CONNECTED":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    dh8.m9157i(BleManager.TAG, "ACTION_ACL_CONNECTED", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice));
                    break;
                case "android.bluetooth.device.action.ACL_DISCONNECTED":
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    dh8.m9157i(BleManager.TAG, "ACTION_ACL_DISCONNECTED", "device : " + BleManager.this.printDeviceInfo(bluetoothDevice2));
                    break;
            }
        }
    }

    public class NotifyCharacteristicRunnable implements Runnable {
        private final UUID mCharacteristicUUID;
        public final UUID mDescriptorUUID;
        private final BluetoothGatt mGatt;
        private final UUID mServiceUUID;
        private int retryNum;

        /* JADX INFO: Access modifiers changed from: private */
        public BluetoothDevice getBleDevice() {
            BluetoothGatt bluetoothGatt = this.mGatt;
            if (bluetoothGatt == null) {
                return null;
            }
            return bluetoothGatt.getDevice();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UUID getCharacteristicUUID() {
            return this.mCharacteristicUUID;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int getRetryNum() {
            return this.retryNum;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public UUID getServiceUUID() {
            return this.mServiceUUID;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRetryNum(int retryNum) {
            this.retryNum = retryNum;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean zEnableBLEDeviceNotification = BleManager.this.enableBLEDeviceNotification(this.mGatt, this.mServiceUUID, this.mCharacteristicUUID);
            dh8.m9161w(BleManager.TAG, "enableBLEDeviceNotification", kc2.formatString("%s, service uuid = %s, characteristic uuid = %s", Boolean.valueOf(zEnableBLEDeviceNotification), this.mServiceUUID, this.mCharacteristicUUID));
            if (zEnableBLEDeviceNotification) {
                BleManager.this.mHandler.removeMessages(4115);
                BleManager.this.mHandler.sendMessageDelayed(BleManager.this.mHandler.obtainMessage(4115, this.mGatt.getDevice()), AbstractC3831a.f24122V);
            } else {
                BluetoothGatt bluetoothGatt = this.mGatt;
                if (bluetoothGatt != null) {
                    BleManager.this.disconnectBleDevice(bluetoothGatt.getDevice());
                }
            }
        }

        private NotifyCharacteristicRunnable(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID) {
            this.mDescriptorUUID = BleManager.BLE_UUID_NOTIFICATION_DESCRIPTOR;
            this.retryNum = 0;
            this.mGatt = gatt;
            this.mServiceUUID = serviceUUID;
            this.mCharacteristicUUID = characteristicUUID;
        }
    }

    private BleManager(Context context) {
        this.mContext = (Context) kc2.checkNotNull(context);
        if (kc2.getMainContext() == null) {
            kc2.setMainContext(context);
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mBluetoothAdapter = defaultAdapter;
        if (defaultAdapter != null) {
            this.mBluetoothLeScanner = defaultAdapter.getBluetoothLeScanner();
        }
        this.mReConnectHelper = new ReConnectHelper(context, this);
        registerReceiver();
    }

    private BleDevice addBleDevice(@efb BluetoothDevice device) {
        BleDevice bleDevice = getBleDevice(device);
        if (bleDevice != null) {
            return bleDevice;
        }
        BleDevice bleDevice2 = new BleDevice(this.mContext, device);
        this.mBleDeviceMap.put(device.getAddress(), bleDevice2);
        return bleDevice2;
    }

    private void addSendTask(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        BleDevice bleDevice = getBleDevice(device);
        if ((bleDevice != null ? bleDevice.addSendTask(serviceUUID, characteristicUUID, data, callback) : false) || callback == null) {
            return;
        }
        callback.onBleResult(device, serviceUUID, characteristicUUID, false, data);
    }

    private boolean checkConnectEnv(String method, BluetoothDevice device) {
        if (!kc2.checkHasConnectPermission(this.mContext)) {
            dh8.m9161w(TAG, method, "Missing permission to search Bluetooth.");
            return false;
        }
        if (device != null) {
            return true;
        }
        dh8.m9161w(TAG, method, "Device is null.");
        return false;
    }

    private boolean checkScanEnv(String method) {
        if (this.mBluetoothAdapter == null) {
            dh8.m9161w(TAG, method, "No support for Bluetooth function.");
            return false;
        }
        if (!kc2.checkHasScanPermission(this.mContext)) {
            dh8.m9161w(TAG, method, "Missing permission to search Bluetooth.");
            return false;
        }
        if (isBluetoothEnable()) {
            return true;
        }
        dh8.m9161w(TAG, method, "Bluetooth is close.");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConnectedBleDevices() {
        if (this.mBleDeviceMap.isEmpty()) {
            return;
        }
        HashMap map = new HashMap(this.mBleDeviceMap);
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            BleDevice bleDevice = (BleDevice) map.get((String) it.next());
            if (bleDevice != null) {
                disconnectBleDevice(bleDevice.getDevice());
            }
        }
        this.mBleDeviceMap.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public void closeGatt(BluetoothGatt gatt) {
        if (gatt == null) {
            return;
        }
        dh8.m9157i(TAG, "closeGatt", "gatt : " + gatt);
        gatt.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public boolean enableBLEDeviceNotification(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID) {
        if (gatt == null || !AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9161w(TAG, "enableBLEDeviceNotification", "Missing permission to connect Bluetooth.");
            return false;
        }
        if (!isBluetoothEnable()) {
            dh8.m9161w(TAG, "enableBLEDeviceNotification", "Bluetooth is close.");
            return false;
        }
        BluetoothGattService service = gatt.getService(serviceUUID);
        if (service == null) {
            dh8.m9161w(TAG, "enableBLEDeviceNotification", "BluetoothGattService is null. uuid = " + serviceUUID);
            return false;
        }
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(characteristicUUID);
        if (characteristic == null) {
            dh8.m9161w(TAG, "enableBLEDeviceNotification", "BluetoothGattCharacteristic is null. uuid = " + characteristicUUID);
            return false;
        }
        boolean characteristicNotification = gatt.setCharacteristicNotification(characteristic, true);
        if (characteristicNotification) {
            characteristicNotification = false;
            for (BluetoothGattDescriptor bluetoothGattDescriptor : characteristic.getDescriptors()) {
                if (BLE_UUID_NOTIFICATION_DESCRIPTOR.equals(bluetoothGattDescriptor.getUuid())) {
                    characteristicNotification = tryToWriteDescriptor(gatt, bluetoothGattDescriptor, 0, false);
                    if (characteristicNotification) {
                        break;
                    }
                    dh8.m9161w(TAG, "enableBLEDeviceNotification", "(tryToWriteDescriptor) ---> failed");
                }
            }
        } else {
            dh8.m9161w(TAG, "enableBLEDeviceNotification", "(setCharacteristicNotification) ---> failed.");
        }
        dh8.m9161w(TAG, "enableBLEDeviceNotification", characteristicNotification + ", serviceUUID : " + serviceUUID + ", characteristicUUID : " + characteristicUUID);
        return characteristicNotification;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public void filterDevice(BluetoothDevice device, int rssi, byte[] scanRecord, boolean isBleEnableConnect) {
        if (!AppUtil.checkHasConnectPermission(this.mContext) || !isBluetoothEnable() || TextUtils.isEmpty(device.getName()) || this.mDiscoveredBleDevices.contains(device)) {
            return;
        }
        dh8.m9151d(TAG, "notify device : " + printDeviceInfo(device));
        this.mDiscoveredBleDevices.add(device);
        handleDiscoveryBle(device, new BleScanInfo().setRawData(scanRecord).setRssi(rssi).setEnableConnect(isBleEnableConnect));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BleDevice getBleDevice(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        return this.mBleDeviceMap.get(device.getAddress());
    }

    @igg({"MissingPermission"})
    public static List<BluetoothDevice> getConnectedBleDeviceList(Context context) {
        BluetoothManager bluetoothManager;
        if (context == null || !AppUtil.checkHasConnectPermission(context) || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            return null;
        }
        return bluetoothManager.getConnectedDevices(7);
    }

    public static BleManager getInstance() {
        if (instance == null) {
            synchronized (BleManager.class) {
                try {
                    if (instance == null) {
                        instance = new BleManager(BaseApplication.getInstance());
                        dh8.m9161w(TAG, "init", "instance : " + instance);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    @efb
    private List<BleDevice> getSortList() {
        if (this.mBleDeviceMap.isEmpty()) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.mBleDeviceMap.values());
        Collections.sort(arrayList, new Comparator() { // from class: k51
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return BleManager.lambda$getSortList$0((BleDevice) obj, (BleDevice) obj2);
            }
        });
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleBleConnection(BluetoothDevice device, int status) {
        BleDevice bleDevice = getBleDevice(device);
        if (bleDevice == null) {
            return;
        }
        int connection = bleDevice.getConnection();
        dh8.m9157i(TAG, "handleBleConnection", kc2.formatString("device : " + printDeviceInfo(device) + ", prevState : " + connection + ", status : " + status, new Object[0]));
        if (connection == status) {
            return;
        }
        bleDevice.setConnection(status);
        if (status == 0) {
            this.mHandler.removeMessages(4115);
            bleDevice.setConnectedTime(0L);
            removeConnectedBle(device);
        } else if (status == 1) {
            bleDevice.setConnectedTime(System.currentTimeMillis());
        } else if (status == 2) {
            this.mHandler.removeMessages(4115);
            bleDevice.setConnectedTime(System.currentTimeMillis());
            bleDevice.startSendDataThread();
            if (getConnectedBtDevice() == null) {
                setConnectedBtDevice(device);
            }
        }
        this.mCallbackManager.onBleConnection(device, status);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleDiscoveryBle(BluetoothDevice device, BleScanInfo bleScanInfo) {
        this.mCallbackManager.onDiscoveryBle(device, bleScanInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$getSortList$0(BleDevice bleDevice, BleDevice bleDevice2) {
        if (bleDevice == null && bleDevice2 == null) {
            return 0;
        }
        if (bleDevice == null) {
            return 1;
        }
        if (bleDevice2 == null) {
            return -1;
        }
        return Long.compare(bleDevice2.getConnectedTime(), bleDevice.getConnectedTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        filterDevice(bluetoothDevice, i, bArr, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printDeviceInfo(BluetoothDevice device) {
        return v91.printBtDeviceInfo(this.mContext, device);
    }

    private void registerReceiver() {
        if (this.mAdapterReceiver == null) {
            this.mAdapterReceiver = new BaseBtAdapterReceiver();
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_CONNECTED");
            intentFilter.addAction("android.bluetooth.device.action.ACL_DISCONNECTED");
            this.mContext.registerReceiver(this.mAdapterReceiver, intentFilter);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public void startChangeMtu(BluetoothGatt gatt, int mtu) {
        if (gatt == null || !AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9161w(TAG, "startChangeMtu", "-- param is error.");
            return;
        }
        if (this.mHandler.hasMessages(MSG_CHANGE_BLE_MTU_TIMEOUT)) {
            dh8.m9161w(TAG, "startChangeMtu", "Adjusting the MTU for BLE");
            return;
        }
        BluetoothDevice device = gatt.getDevice();
        if (device == null) {
            dh8.m9161w(TAG, "startChangeMtu", "-startChangeMtu- device is null.");
            return;
        }
        boolean zRequestMtu = mtu > 20 ? gatt.requestMtu(mtu + 3) : false;
        dh8.m9152d(TAG, "startChangeMtu", "requestMtu : " + zRequestMtu + ", mtu : " + mtu);
        if (!zRequestMtu) {
            handleBleConnection(device, 2);
        } else {
            Handler handler = this.mHandler;
            handler.sendMessageDelayed(handler.obtainMessage(MSG_CHANGE_BLE_MTU_TIMEOUT, device), AbstractC3831a.f24122V);
        }
    }

    private void startConnectTimeout(BluetoothDevice device) {
        if (this.mHandler.hasMessages(4113)) {
            return;
        }
        Handler handler = this.mHandler;
        handler.sendMessageDelayed(handler.obtainMessage(4113, device), 40000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopChangeMtu() {
        this.mHandler.removeMessages(MSG_CHANGE_BLE_MTU_TIMEOUT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopConnectTimeout() {
        if (this.mHandler.hasMessages(4113)) {
            this.mHandler.removeMessages(4113);
        }
    }

    private void syncSystemBleDevice() {
        List<BluetoothDevice> connectedBleDeviceList = getConnectedBleDeviceList(this.mContext);
        if (connectedBleDeviceList == null || connectedBleDeviceList.isEmpty()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : connectedBleDeviceList) {
            if (!v91.deviceEquals(bluetoothDevice, this.mUsingDevice) && !this.mDiscoveredBleDevices.contains(bluetoothDevice)) {
                this.mDiscoveredBleDevices.add(bluetoothDevice);
                handleDiscoveryBle(bluetoothDevice, new BleScanInfo().setEnableConnect(true));
            }
        }
    }

    @igg({"MissingPermission"})
    private boolean tryToWriteDescriptor(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor descriptor, int retryCount, boolean isSkipSetValue) {
        if (!AppUtil.checkHasConnectPermission(this.mContext)) {
            return false;
        }
        if (!isSkipSetValue) {
            isSkipSetValue = descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            String str = TAG;
            dh8.m9157i(str, "tryToWriteDescriptor", "setValue : " + isSkipSetValue);
            if (isSkipSetValue) {
                retryCount = 0;
            } else {
                retryCount++;
                if (retryCount >= 3) {
                    return false;
                }
                dh8.m9157i(str, "tryToWriteDescriptor", "setValue failed. retryCount : " + retryCount);
                SystemClock.sleep(50L);
                tryToWriteDescriptor(bluetoothGatt, descriptor, retryCount, false);
            }
        }
        if (isSkipSetValue) {
            isSkipSetValue = bluetoothGatt.writeDescriptor(descriptor);
            String str2 = TAG;
            dh8.m9157i(str2, "tryToWriteDescriptor", "writeDescriptor : " + isSkipSetValue);
            if (!isSkipSetValue) {
                int i = retryCount + 1;
                if (i >= 3) {
                    return false;
                }
                dh8.m9157i(str2, "tryToWriteDescriptor", "writeDescriptor failed. retryCount : " + i);
                SystemClock.sleep(50L);
                tryToWriteDescriptor(bluetoothGatt, descriptor, i, true);
            }
        }
        return isSkipSetValue;
    }

    private void unregisterReceiver() {
        BaseBtAdapterReceiver baseBtAdapterReceiver = this.mAdapterReceiver;
        if (baseBtAdapterReceiver != null) {
            this.mContext.unregisterReceiver(baseBtAdapterReceiver);
            this.mAdapterReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void wakeupSendThread(BluetoothGatt gatt, UUID serviceUUID, UUID characteristicUUID, int status, byte[] data) {
        BleDevice bleDevice = getBleDevice(gatt.getDevice());
        if (bleDevice != null) {
            SendBleDataThread.BleSendTask bleSendTask = new SendBleDataThread.BleSendTask(gatt, serviceUUID, characteristicUUID, data, null);
            bleSendTask.setStatus(status);
            bleDevice.wakeupSendThread(bleSendTask);
        }
    }

    @igg({"MissingPermission"})
    public boolean connectBleDevice(BluetoothDevice device) {
        BluetoothGatt bluetoothGattConnectGatt;
        if (!checkConnectEnv("connectBleDevice", device) || !isBluetoothEnable()) {
            return false;
        }
        if (isConnectedDevice(device)) {
            this.mCallbackManager.onBleConnection(device, 2);
            return true;
        }
        BluetoothDevice connectingDevice = getConnectingDevice();
        if (connectingDevice != null) {
            dh8.m9155e(TAG, "connectBleDevice", kc2.formatString("Device(%s) is connecting, please wait.", printDeviceInfo(connectingDevice)));
            return isConnectingDevice(device);
        }
        if (isBleScanning()) {
            stopLeScan();
        }
        BleDevice bleDeviceAddBleDevice = addBleDevice(device);
        startConnectTimeout(device);
        handleBleConnection(device, 1);
        try {
            bluetoothGattConnectGatt = device.connectGatt(this.mContext, false, this.mBluetoothGattCallback, 2);
        } catch (Exception e) {
            e.printStackTrace();
            bluetoothGattConnectGatt = null;
        }
        boolean z = bluetoothGattConnectGatt != null;
        bleDeviceAddBleDevice.setGatt(bluetoothGattConnectGatt);
        dh8.m9152d(TAG, "connectBleDevice", z ? kc2.formatString("Prepare to connect to BLE(%s)", printDeviceInfo(device)) : kc2.formatString("Failed to connect to BLE(%s)", printDeviceInfo(device)));
        if (!z) {
            handleBleConnection(device, 0);
        }
        return z;
    }

    public void destroy() {
        dh8.m9161w(TAG, "destroy", "instance : " + instance);
        unregisterReceiver();
        stopConnectTimeout();
        clearConnectedBleDevices();
        if (isBleScanning()) {
            stopLeScan();
        }
        isBleScanning(false);
        this.mDiscoveredBleDevices.clear();
        this.mReConnectHelper.release();
        this.mCallbackManager.release();
        this.mHandler.removeCallbacksAndMessages(null);
        instance = null;
    }

    @igg({"MissingPermission"})
    public void disconnectBleDevice(BluetoothDevice device) {
        if (checkConnectEnv("disconnectBleDevice", device)) {
            BleDevice bleDevice = getBleDevice(device);
            String str = TAG;
            dh8.m9152d(str, "disconnectBleDevice", "device: " + printDeviceInfo(device) + ", " + bleDevice);
            if (bleDevice == null) {
                return;
            }
            BluetoothGatt gatt = bleDevice.getGatt();
            if (!isBluetoothEnable()) {
                bleDevice.setConnection(0);
            }
            int connection = bleDevice.getConnection();
            if (connection == 1) {
                if (gatt != null) {
                    gatt.disconnect();
                    closeGatt(gatt);
                }
                handleBleConnection(device, 0);
                return;
            }
            if (connection != 2) {
                removeConnectedBle(device);
                this.mCallbackManager.onBleConnection(device, 0);
            } else if (gatt != null) {
                dh8.m9152d(str, "disconnectBleDevice", "Gatt#disconnect");
                this.mHandler.removeMessages(MSG_DISCONNECT_BLE_TIMEOUT);
                Handler handler = this.mHandler;
                handler.sendMessageDelayed(handler.obtainMessage(MSG_DISCONNECT_BLE_TIMEOUT, device), AbstractC3831a.f24122V);
                gatt.disconnect();
            }
        }
    }

    public int getBleMtu(BluetoothDevice device) {
        BleDevice bleDevice = getBleDevice(device);
        if (bleDevice == null) {
            return 0;
        }
        return bleDevice.getMtu();
    }

    public BluetoothDevice getConnectedBLEDevice(String address) {
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            return null;
        }
        List<BluetoothDevice> connectedDeviceList = getConnectedDeviceList();
        if (connectedDeviceList.isEmpty()) {
            return null;
        }
        for (BluetoothDevice bluetoothDevice : connectedDeviceList) {
            if (bluetoothDevice.getAddress().equals(address)) {
                return bluetoothDevice;
            }
        }
        return null;
    }

    public BluetoothDevice getConnectedBtDevice() {
        return this.mUsingDevice;
    }

    public BluetoothGatt getConnectedBtGatt(BluetoothDevice device) {
        BleDevice bleDevice = getBleDevice(device);
        if (bleDevice == null) {
            return null;
        }
        return bleDevice.getGatt();
    }

    public List<BluetoothDevice> getConnectedDeviceList() {
        BluetoothDevice device;
        if (this.mBleDeviceMap.isEmpty()) {
            return new ArrayList();
        }
        List<BleDevice> sortList = getSortList();
        ArrayList arrayList = new ArrayList();
        for (BleDevice bleDevice : sortList) {
            if (bleDevice != null && bleDevice.getGatt() != null && bleDevice.getConnection() == 2 && (device = bleDevice.getGatt().getDevice()) != null) {
                arrayList.add(device);
            }
        }
        return arrayList;
    }

    public BluetoothDevice getConnectingDevice() {
        if (this.mBleDeviceMap.isEmpty()) {
            return null;
        }
        for (BleDevice bleDevice : this.mBleDeviceMap.values()) {
            if (bleDevice.getConnection() == 1) {
                return bleDevice.getDevice();
            }
        }
        return null;
    }

    public boolean isBleScanning() {
        return this.isBleScanning;
    }

    public boolean isBluetoothEnable() {
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    public boolean isConnectedDevice(BluetoothDevice device) {
        if (device == null) {
            return false;
        }
        return isConnectedDevice(device.getAddress());
    }

    public boolean isConnecting() {
        return getConnectingDevice() != null;
    }

    public boolean isConnectingDevice(BluetoothDevice device) {
        return v91.deviceEquals(getConnectingDevice(), device);
    }

    public boolean isMatchReConnectDevice(String address, String matchAddress) {
        return this.mReConnectHelper.isMatchAddress(address, matchAddress);
    }

    public void reconnectDevice(String address, boolean isUseAdv) {
        String str = TAG;
        dh8.m9152d(str, "reconnectDevice", "address = " + address + ", isUseAdv = " + isUseAdv);
        boolean zPutParam = this.mReConnectHelper.putParam(new ReConnectHelper.ReconnectParam(address, isUseAdv));
        StringBuilder sb = new StringBuilder();
        sb.append("");
        sb.append(zPutParam);
        dh8.m9152d(str, "reconnectDevice", sb.toString());
    }

    public void registerBleEventCallback(BleEventCallback callback) {
        this.mCallbackManager.registerBleEventCallback(callback);
    }

    public BleDevice removeConnectedBle(BluetoothDevice device) {
        if (device == null) {
            return null;
        }
        return removeConnectedBle(device.getAddress());
    }

    public void setConnectedBtDevice(BluetoothDevice mConnectedBtDevice) {
        this.mUsingDevice = mConnectedBtDevice;
    }

    @igg({"MissingPermission"})
    public boolean startLeScan(long timeout) {
        if (!checkScanEnv("startLeScan")) {
            return false;
        }
        if (!AppUtil.isHasLocationPermission(this.mContext)) {
            dh8.m9161w(TAG, "startLeScan", "Missing location permissions.");
            return false;
        }
        if (timeout <= 0) {
            timeout = 12000;
        }
        boolean zStartLeScan = true;
        if (isBleScanning()) {
            dh8.m9157i(TAG, "startLeScan", "BLE is searching.");
            BluetoothLeScanner bluetoothLeScanner = this.mBluetoothLeScanner;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.flushPendingScanResults(this.mScanCallback);
            }
            this.mDiscoveredBleDevices.clear();
            this.mHandler.removeMessages(MSG_SCAN_BLE_TIMEOUT);
            this.mHandler.sendEmptyMessageDelayed(MSG_SCAN_BLE_TIMEOUT, timeout);
            isBleScanning(true);
            syncSystemBleDevice();
            return true;
        }
        if (this.mBluetoothLeScanner != null) {
            ScanSettings.Builder numOfMatches = new ScanSettings.Builder().setScanMode(2).setMatchMode(1).setNumOfMatches(3);
            numOfMatches.setPhy(255);
            ScanSettings scanSettingsBuild = numOfMatches.build();
            this.mBluetoothLeScanner.startScan(new ArrayList(), scanSettingsBuild, this.mScanCallback);
        } else {
            zStartLeScan = this.mBluetoothAdapter.startLeScan(this.mLeScanCallback);
        }
        dh8.m9157i(TAG, "startLeScan", kc2.formatString("%s. timeout : %d.", Boolean.valueOf(zStartLeScan), Long.valueOf(timeout)));
        isBleScanning(zStartLeScan);
        if (zStartLeScan) {
            this.mDiscoveredBleDevices.clear();
            this.mHandler.removeMessages(MSG_SCAN_BLE_TIMEOUT);
            this.mHandler.sendEmptyMessageDelayed(MSG_SCAN_BLE_TIMEOUT, timeout);
            syncSystemBleDevice();
        }
        return zStartLeScan;
    }

    @igg({"MissingPermission"})
    public boolean stopLeScan() {
        if (!checkScanEnv("stopLeScan") || !isBleScanning()) {
            return false;
        }
        try {
            BluetoothLeScanner bluetoothLeScanner = this.mBluetoothLeScanner;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.mScanCallback);
            } else {
                this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mHandler.removeMessages(MSG_SCAN_BLE_TIMEOUT);
        this.mHandler.removeMessages(4114);
        isBleScanning(false);
        return true;
    }

    public void unregisterBleEventCallback(BleEventCallback callback) {
        this.mCallbackManager.unregisterBleEventCallback(callback);
    }

    public void writeDataByBleAsync(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, byte[] data, OnWriteDataCallback callback) {
        addSendTask(device, serviceUUID, characteristicUUID, data, callback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void isBleScanning(boolean isScanning) {
        this.isBleScanning = isScanning;
        this.mCallbackManager.onDiscoveryBleChange(isScanning);
        if (this.isBleScanning && this.configHelper.isHidDevice()) {
            this.mHandler.sendEmptyMessage(4114);
        }
    }

    private BleDevice removeConnectedBle(String address) {
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            return null;
        }
        BleDevice bleDeviceRemove = this.mBleDeviceMap.remove(address);
        String str = TAG;
        dh8.m9157i(str, "removeConnectedBle", "address : " + address + ", " + bleDeviceRemove);
        if (bleDeviceRemove == null) {
            return null;
        }
        bleDeviceRemove.stopSendDataThread();
        List<BluetoothDevice> connectedDeviceList = getConnectedDeviceList();
        dh8.m9152d(str, "removeConnectedBle", "connectedDeviceList size : " + connectedDeviceList.size());
        if (connectedDeviceList.isEmpty()) {
            setConnectedBtDevice(null);
        } else if (v91.deviceEquals(bleDeviceRemove.getDevice(), getConnectedBtDevice())) {
            setConnectedBtDevice(connectedDeviceList.get(0));
        }
        return bleDeviceRemove;
    }

    public boolean isConnectedDevice(String address) {
        if (!BluetoothAdapter.checkBluetoothAddress(address)) {
            return false;
        }
        List<BluetoothDevice> connectedDeviceList = getConnectedDeviceList();
        if (connectedDeviceList.isEmpty()) {
            return false;
        }
        Iterator<BluetoothDevice> it = connectedDeviceList.iterator();
        while (it.hasNext()) {
            if (it.next().getAddress().equals(address)) {
                return true;
            }
        }
        return false;
    }
}
