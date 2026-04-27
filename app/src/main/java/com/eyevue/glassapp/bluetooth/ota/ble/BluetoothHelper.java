package com.eyevue.glassapp.bluetooth.ota.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import com.eyevue.glassapp.bluetooth.ota.BTEventCbHelper;
import com.eyevue.glassapp.bluetooth.ota.ConfigHelper;
import com.eyevue.glassapp.bluetooth.ota.OnBTEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnWriteDataCallback;
import com.eyevue.glassapp.bluetooth.ota.ble.model.BleScanInfo;
import com.eyevue.glassapp.bluetooth.ota.spp.SppManager;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.OnWriteSppDataCallback;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback;
import com.eyevue.glassapp.utils.AppUtil;
import java.util.UUID;
import p000.C4584d2;
import p000.dh8;
import p000.dwf;
import p000.e0g;
import p000.gib;
import p000.jt3;
import p000.md8;
import p000.pk1;
import p000.v91;
import p000.yfb;

/* JADX INFO: loaded from: classes4.dex */
@e0g(parameters = 0)
public final class BluetoothHelper {

    @yfb
    public static final String TAG = "BluetoothHelper";

    @gib
    private static volatile BluetoothHelper instance;

    @yfb
    private final BluetoothHelper$bleEventCallback$1 bleEventCallback;

    @yfb
    private final BleManager bleManager;

    @yfb
    private final BTEventCbHelper btEventCbHelper;

    @yfb
    private final ConfigHelper configHelper = ConfigHelper.Companion.getInstance();

    @yfb
    private final BluetoothHelper$sppEventCallback$1 sppEventCallback;

    @yfb
    private final SppManager sppManager;

    @yfb
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @dwf({"SMAP\nBluetoothHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BluetoothHelper.kt\ncom/eyevue/glassapp/bluetooth/ota/ble/BluetoothHelper$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,270:1\n1#2:271\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(jt3 jt3Var) {
            this();
        }

        @yfb
        public final BluetoothHelper getInstance() {
            BluetoothHelper bluetoothHelper = BluetoothHelper.instance;
            if (bluetoothHelper == null) {
                synchronized (this) {
                    bluetoothHelper = BluetoothHelper.instance;
                    if (bluetoothHelper == null) {
                        bluetoothHelper = new BluetoothHelper();
                        Companion companion = BluetoothHelper.Companion;
                        BluetoothHelper.instance = bluetoothHelper;
                    }
                }
            }
            return bluetoothHelper;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper$bleEventCallback$1, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper$sppEventCallback$1, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback] */
    public BluetoothHelper() {
        BleManager bleManager = BleManager.getInstance();
        md8.checkNotNull(bleManager);
        this.bleManager = bleManager;
        SppManager sppManager = SppManager.getInstance();
        md8.checkNotNull(sppManager);
        this.sppManager = sppManager;
        this.btEventCbHelper = new BTEventCbHelper();
        ?? r2 = new BleEventCallback() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper$bleEventCallback$1
            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onAdapterChange(boolean z) {
                this.this$0.btEventCbHelper.onAdapterChange(z);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onBleConnection(BluetoothDevice bluetoothDevice, int i) {
                this.this$0.btEventCbHelper.onDeviceConnection(bluetoothDevice, 0, i);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onBleDataBlockChanged(BluetoothDevice bluetoothDevice, int i, int i2) {
                this.this$0.btEventCbHelper.onBleMtuChange(bluetoothDevice, i, i2);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onBleDataNotification(BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, byte[] bArr) {
                this.this$0.btEventCbHelper.onReceiveData(bluetoothDevice, 0, uuid2, bArr);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onDiscoveryBle(BluetoothDevice bluetoothDevice, BleScanInfo bleScanInfo) {
                this.this$0.btEventCbHelper.onDiscovery(bluetoothDevice, bleScanInfo);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.BleEventCallback, com.eyevue.glassapp.bluetooth.ota.ble.interfaces.IBleEventCallback
            public void onDiscoveryBleChange(boolean z) {
                this.this$0.btEventCbHelper.onDiscoveryChange(z, 0);
            }
        };
        this.bleEventCallback = r2;
        ?? r3 = new SppEventCallback() { // from class: com.eyevue.glassapp.bluetooth.ota.ble.BluetoothHelper$sppEventCallback$1
            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
            public void onAdapterChange(boolean z) {
                this.this$0.btEventCbHelper.onAdapterChange(z);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
            public void onDiscoveryDevice(BluetoothDevice bluetoothDevice, int i) {
                this.this$0.btEventCbHelper.onDiscovery(bluetoothDevice, new BleScanInfo().setRssi(i));
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
            public void onDiscoveryDeviceChange(boolean z) {
                this.this$0.btEventCbHelper.onDiscoveryChange(z, 1);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
            public void onReceiveSppData(BluetoothDevice bluetoothDevice, UUID uuid, byte[] bArr) {
                this.this$0.btEventCbHelper.onReceiveData(bluetoothDevice, 1, uuid, bArr);
            }

            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback, com.eyevue.glassapp.bluetooth.ota.spp.interfaces.ISppEventCallback
            public void onSppConnection(BluetoothDevice bluetoothDevice, UUID uuid, int i) {
                if (i == 2 && this.this$0.configHelper.isUseMultiSppChannel() && !md8.areEqual(UUID.fromString(this.this$0.configHelper.getCustomSppChannel()), uuid)) {
                    dh8.m9157i(BluetoothHelper.TAG, "onSppConnection", "skip custom uuid = " + uuid);
                    return;
                }
                dh8.m9152d(BluetoothHelper.TAG, "onSppConnection", "device : " + this.this$0.printDeviceInfo(bluetoothDevice) + ", uuid = " + uuid + ", status = " + i);
                this.this$0.btEventCbHelper.onDeviceConnection(bluetoothDevice, 1, i);
            }
        };
        this.sppEventCallback = r3;
        bleManager.registerBleEventCallback(r2);
        sppManager.registerSppEventCallback(r3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String printDeviceInfo(BluetoothDevice bluetoothDevice) {
        return AppUtil.printBtDeviceInfo(bluetoothDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeDataToDevice$lambda$0(BluetoothHelper bluetoothHelper, BluetoothDevice bluetoothDevice, UUID uuid, UUID uuid2, boolean z, byte[] bArr) {
        dh8.m9152d(TAG, "writeDataByBleAsync", "device : " + bluetoothHelper.printDeviceInfo(bluetoothDevice) + ", result : " + z + ",\ndata : [" + pk1.byte2HexStr(bArr) + C4584d2.f28243l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void writeDataToDevice$lambda$1(BluetoothHelper bluetoothHelper, BluetoothDevice bluetoothDevice, UUID uuid, boolean z, byte[] bArr) {
        dh8.m9152d(TAG, "writeDataToSppAsync", "device : " + bluetoothHelper.printDeviceInfo(bluetoothDevice) + ", uuid : " + uuid + ", result : " + z + ",\ndata : " + pk1.byte2HexStr(bArr));
    }

    public final boolean connectBleDevice(@gib BluetoothDevice bluetoothDevice) {
        return this.bleManager.connectBleDevice(bluetoothDevice);
    }

    public final boolean connectDevice(@gib BluetoothDevice bluetoothDevice) {
        return this.configHelper.isBleWay() ? this.bleManager.connectBleDevice(bluetoothDevice) : this.sppManager.connectSpp(bluetoothDevice);
    }

    public final void destroy() {
        this.bleManager.unregisterBleEventCallback(this.bleEventCallback);
        this.bleManager.destroy();
        this.sppManager.unregisterSppEventCallback(this.sppEventCallback);
        this.sppManager.release();
        this.btEventCbHelper.release();
        instance = null;
    }

    public final void disconnectDevice(@gib BluetoothDevice bluetoothDevice) {
        if (this.configHelper.isBleWay()) {
            this.bleManager.disconnectBleDevice(bluetoothDevice);
        } else {
            this.sppManager.disconnectSpp(bluetoothDevice, null);
        }
    }

    public final int getBleMtu() {
        if (this.configHelper.isBleWay()) {
            return this.bleManager.getBleMtu(getConnectedDevice());
        }
        return 20;
    }

    @gib
    public final BluetoothDevice getConnectedDevice() {
        return this.configHelper.isBleWay() ? this.bleManager.getConnectedBtDevice() : this.sppManager.getConnectedSppDevice();
    }

    @gib
    public final BluetoothGatt getConnectedGatt() {
        if (this.configHelper.isBleWay()) {
            return this.bleManager.getConnectedBtGatt(getConnectedDevice());
        }
        return null;
    }

    @gib
    public final BluetoothDevice getConnectingDevice() {
        return this.configHelper.isBleWay() ? this.bleManager.getConnectingDevice() : this.sppManager.getConnectingSppDevice();
    }

    public final boolean isConnected() {
        return getConnectedDevice() != null;
    }

    public final boolean isConnecting() {
        return this.configHelper.isBleWay() ? this.bleManager.isBleScanning() : this.sppManager.isSppConnecting();
    }

    public final boolean isDeviceConnected(@gib BluetoothDevice bluetoothDevice) {
        return v91.deviceEquals(getConnectedDevice(), bluetoothDevice);
    }

    public final boolean isScanning() {
        return this.configHelper.isBleWay() ? this.bleManager.isBleScanning() : this.sppManager.isScanning();
    }

    public final void reconnectDevice(@gib String str, boolean z) {
        if (this.configHelper.isBleWay()) {
            this.bleManager.reconnectDevice(str, z);
        }
    }

    public final void registerCallback(@yfb OnBTEventCallback onBTEventCallback) {
        md8.checkNotNullParameter(onBTEventCallback, "callback");
        this.btEventCbHelper.registerCallback(onBTEventCallback);
    }

    public final boolean startScan(long j) {
        return this.configHelper.isBleWay() ? this.bleManager.startLeScan(j) : this.sppManager.startDeviceScan(j);
    }

    public final void stopScan() {
        if (this.configHelper.isBleWay()) {
            this.bleManager.stopLeScan();
        } else {
            this.sppManager.stopDeviceScan();
        }
    }

    public final void unregisterCallback(@yfb OnBTEventCallback onBTEventCallback) {
        md8.checkNotNullParameter(onBTEventCallback, "callback");
        this.btEventCbHelper.unregisterCallback(onBTEventCallback);
    }

    public final boolean writeDataToDevice(@gib BluetoothDevice bluetoothDevice, @gib byte[] bArr) {
        if (bluetoothDevice == null || bArr == null || bArr.length == 0) {
            return false;
        }
        if (this.bleManager.getConnectedBtDevice() != null) {
            this.bleManager.writeDataByBleAsync(bluetoothDevice, BleManager.BLE_UUID_SERVICE, BleManager.BLE_UUID_WRITE, bArr, new OnWriteDataCallback() { // from class: e91
                @Override // com.eyevue.glassapp.bluetooth.ota.ble.interfaces.OnWriteDataCallback
                public final void onBleResult(BluetoothDevice bluetoothDevice2, UUID uuid, UUID uuid2, boolean z, byte[] bArr2) {
                    BluetoothHelper.writeDataToDevice$lambda$0(this.f32164a, bluetoothDevice2, uuid, uuid2, z, bArr2);
                }
            });
            return true;
        }
        if (this.sppManager.getConnectedSppDevice() == null) {
            return true;
        }
        this.sppManager.writeDataToSppAsync(bluetoothDevice, SppManager.UUID_SPP, bArr, new OnWriteSppDataCallback() { // from class: f91
            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.OnWriteSppDataCallback
            public final void onSppResult(BluetoothDevice bluetoothDevice2, UUID uuid, boolean z, byte[] bArr2) {
                BluetoothHelper.writeDataToDevice$lambda$1(this.f35729a, bluetoothDevice2, uuid, z, bArr2);
            }
        });
        return true;
    }
}
