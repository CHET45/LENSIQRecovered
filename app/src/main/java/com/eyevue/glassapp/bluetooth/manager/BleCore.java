package com.eyevue.glassapp.bluetooth.manager;

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
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import com.blankj.utilcode.util.C2478k;
import com.blankj.utilcode.util.ToastUtils;
import com.eyevue.common.C2531R;
import com.eyevue.glassapp.bluetooth.BlueConstant;
import com.eyevue.glassapp.bluetooth.BluetoothUtil;
import com.eyevue.glassapp.bluetooth.CommonUtil;
import com.eyevue.glassapp.bluetooth.HexConvert;
import com.eyevue.glassapp.bluetooth.manager.BleCore;
import com.eyevue.glassapp.bluetooth.manager.BluetoothCore;
import com.eyevue.glassapp.bluetooth.protocol.Datagram;
import com.eyevue.glassapp.bluetooth.protocol.FileDatagram;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.efb;
import p000.i91;
import p000.igg;
import p000.zgb;

/* JADX INFO: loaded from: classes4.dex */
public class BleCore extends BluetoothCore {
    private static final long CONNECT_TIMEOUT = 60000;
    private static final String TAG = BleCore.class.toString();
    private BluetoothGatt bluetoothGatt;
    public BluetoothDevice curBluetoothDevice;
    private boolean isCmdNotify;
    private boolean isPhotoNotify;
    private BluetoothLeScanner leScanner;
    private BluetoothGattCharacteristic mCmdWriteChar;
    private Context mContext;
    private int mMtu;
    private BluetoothCore.ScanDeviceCallback scanDeviceCallback;
    private final Handler handler = new Handler(Looper.getMainLooper());
    public boolean isConnected = false;
    private String deviceName = "";
    private boolean hasSendMtuOperation = false;
    private final BluetoothGattCallback gattCallback = new C25681();
    private final Runnable timeoutRunnable = new Runnable() { // from class: y41
        @Override // java.lang.Runnable
        public final void run() {
            this.f100317a.lambda$new$0();
        }
    };
    private final ScanCallback scanCallback = new ScanCallback() { // from class: com.eyevue.glassapp.bluetooth.manager.BleCore.2
        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int errorCode) {
            super.onScanFailed(errorCode);
            C2473f.m4167d(BleCore.TAG, "onScanFailed: " + errorCode);
            BleCore.this.scanDeviceCallback.onScanTimeout();
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int callbackType, ScanResult result) {
            super.onScanResult(callbackType, result);
            BleCore.this.scanDeviceCallback.onDeviceFound(result.getDevice(), result.getScanRecord());
        }
    };
    private final Runnable connectTimeOutRun = new Runnable() { // from class: com.eyevue.glassapp.bluetooth.manager.BleCore.3
        @Override // java.lang.Runnable
        public void run() {
            if (BleCore.this.isConnected()) {
                C2473f.m4168e(BleCore.TAG, "连接超时，已连接");
            } else {
                C2473f.m4168e(BleCore.TAG, "连接超时，断开");
                BleCore.this.disconnect();
            }
        }
    };
    private BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

    public BleCore(Context context) {
        this.mContext = context;
        C2473f.m4168e(TAG, "设备是否支持2m::::" + this.bluetoothAdapter.isLe2MPhySupported());
    }

    private String bytesToHex(byte[] bytes) {
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            sb.append(String.format("%02X ", Byte.valueOf(b)));
        }
        return sb.toString().trim();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public void closeGatt() {
        try {
            C2473f.m4168e(TAG, "调用closeGatt，移除connectTimeOutRun");
            BluetoothGatt bluetoothGatt = this.bluetoothGatt;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
                this.bluetoothGatt = null;
            }
            this.handler.removeCallbacks(this.connectTimeOutRun);
            this.curBluetoothDevice = null;
            this.isConnected = false;
            this.isCmdNotify = false;
            this.isPhotoNotify = false;
            this.hasSendMtuOperation = false;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean deviceEquals(BluetoothDevice device1, BluetoothDevice device2) {
        return (device1 == null || device2 == null || !device1.getAddress().equals(device2.getAddress())) ? false : true;
    }

    public static List<BluetoothDevice> getConnectedBleDeviceList(Context context) {
        BluetoothManager bluetoothManager;
        if (context == null || !CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            return null;
        }
        return bluetoothManager.getConnectedDevices(7);
    }

    public static boolean isBleConnected(Context context, BluetoothDevice device) {
        List<BluetoothDevice> connectedBleDeviceList;
        if (context == null || device == null || (connectedBleDeviceList = getConnectedBleDeviceList(context)) == null) {
            return false;
        }
        Iterator<BluetoothDevice> it = connectedBleDeviceList.iterator();
        while (it.hasNext()) {
            if (deviceEquals(device, it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$0() {
        stopScan();
        BluetoothCore.ScanDeviceCallback scanDeviceCallback = this.scanDeviceCallback;
        if (scanDeviceCallback != null) {
            scanDeviceCallback.onScanTimeout();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$setupCharacteristics$1(BluetoothGattService bluetoothGattService, BluetoothGatt bluetoothGatt) {
        BluetoothGattCharacteristic characteristic = bluetoothGattService.getCharacteristic(BlueConstant.UUID_PHOTO_NOTIFY);
        bluetoothGatt.setCharacteristicNotification(characteristic, true);
        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(BlueConstant.UUID_2902);
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        bluetoothGatt.writeDescriptor(descriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public void setupCharacteristics(final BluetoothGatt gatt) {
        final BluetoothGattService service = gatt.getService(BlueConstant.UUID_SERVICE);
        if (service != null) {
            this.mCmdWriteChar = service.getCharacteristic(BlueConstant.UUID_CMD_WRITE);
            BluetoothGattCharacteristic characteristic = service.getCharacteristic(BlueConstant.UUID_CMD_NOTIFY);
            gatt.setCharacteristicNotification(characteristic, true);
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(BlueConstant.UUID_2902);
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            gatt.writeDescriptor(descriptor);
            C2478k.runOnUiThreadDelayed(new Runnable() { // from class: z41
                @Override // java.lang.Runnable
                public final void run() {
                    BleCore.lambda$setupCharacteristics$1(service, gatt);
                }
            }, 500L);
        }
    }

    @igg({"MissingPermission"})
    public boolean checkBluetoothReady() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return true;
        }
        ToastUtils.showShort(this.mContext.getString(C2531R.string.eyevue_bluetooth_is_close));
        return false;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void connect(String deviceAddress) {
        BluetoothDevice bluetoothDevice = this.curBluetoothDevice;
        if (bluetoothDevice != null && bluetoothDevice.getAddress().equals(deviceAddress)) {
            C2473f.m4168e(TAG, "已连接，不可重复连接");
            return;
        }
        C2473f.m4168e(TAG, "开始连接:" + deviceAddress);
        BluetoothDevice remoteDevice = this.bluetoothAdapter.getRemoteDevice(deviceAddress);
        this.curBluetoothDevice = remoteDevice;
        this.bluetoothGatt = remoteDevice.connectGatt(this.mContext, false, this.gattCallback, 2);
        this.handler.removeCallbacks(this.connectTimeOutRun);
        this.handler.postDelayed(this.connectTimeOutRun, 60000L);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public boolean createBond(BluetoothDevice device) {
        return device.createBond();
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void disconnect() {
        try {
            C2473f.m4168e(TAG, "调用disconnect，移除connectTimeOutRun ");
            BluetoothGatt bluetoothGatt = this.bluetoothGatt;
            if (bluetoothGatt != null) {
                bluetoothGatt.disconnect();
                this.bluetoothGatt.close();
                this.bluetoothGatt = null;
                this.isConnected = false;
            }
            this.handler.removeCallbacks(this.connectTimeOutRun);
            this.curBluetoothDevice = null;
            this.isCmdNotify = false;
            this.isPhotoNotify = false;
            this.hasSendMtuOperation = false;
            i91 i91Var = new i91();
            i91Var.f46089a = i91.f46088f;
            zgb.defaultCenter().publish(i91Var);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public BluetoothGatt getBluetoothGatt() {
        return this.bluetoothGatt;
    }

    public BluetoothDevice getCurBluetoothDevice() {
        return this.curBluetoothDevice;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public List<BluetoothDevice> getSystemConnectedDeviceList() {
        return getConnectedBleDeviceList(this.mContext);
    }

    public int getmMtu() {
        return this.mMtu;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public boolean isConnected() {
        return this.isConnected;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public boolean removeBond(BluetoothDevice device) {
        return false;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void sendData(byte[] data) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        if (this.bluetoothGatt == null || (bluetoothGattCharacteristic = this.mCmdWriteChar) == null) {
            return;
        }
        bluetoothGattCharacteristic.setValue(data);
        boolean zWriteCharacteristic = this.bluetoothGatt.writeCharacteristic(this.mCmdWriteChar);
        C2473f.m4168e(TAG, "sendData: " + bytesToHex(data), "发送状态：" + zWriteCharacteristic);
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void startScan(BluetoothCore.ScanDeviceCallback callback, long timeout) {
        if (checkBluetoothReady()) {
            this.scanDeviceCallback = callback;
            this.leScanner = this.bluetoothAdapter.getBluetoothLeScanner();
            ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
            ArrayList arrayList = new ArrayList();
            this.leScanner.stopScan(this.scanCallback);
            this.leScanner.startScan(arrayList, scanSettingsBuild, this.scanCallback);
            this.handler.postDelayed(this.timeoutRunnable, timeout);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void stopScan() {
        if (BluetoothUtil.isBluetoothEnable()) {
            BluetoothLeScanner bluetoothLeScanner = this.leScanner;
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.stopScan(this.scanCallback);
            }
        } else {
            ToastUtils.showShort(this.mContext.getString(C2531R.string.eyevue_bluetooth_is_close));
        }
        this.handler.removeCallbacks(this.timeoutRunnable);
    }

    @igg({"MissingPermission"})
    public boolean writeData(byte[] data) {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        if (this.bluetoothGatt == null || (bluetoothGattCharacteristic = this.mCmdWriteChar) == null) {
            return false;
        }
        bluetoothGattCharacteristic.setValue(data);
        boolean zWriteCharacteristic = this.bluetoothGatt.writeCharacteristic(this.mCmdWriteChar);
        C2473f.m4168e(TAG, "sendData: " + bytesToHex(data), "发送状态：" + zWriteCharacteristic);
        return zWriteCharacteristic;
    }

    /* JADX INFO: renamed from: com.eyevue.glassapp.bluetooth.manager.BleCore$1 */
    public class C25681 extends BluetoothGattCallback {
        public C25681() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onServicesDiscovered$0(BluetoothGatt bluetoothGatt) {
            BleCore.this.setupCharacteristics(bluetoothGatt);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onServicesDiscovered$1(BluetoothGatt bluetoothGatt) {
            bluetoothGatt.requestMtu(512);
            BleCore.this.hasSendMtuOperation = true;
            bluetoothGatt.setPreferredPhy(2, 2, 0);
            bluetoothGatt.requestConnectionPriority(1);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
            BluetoothCore.DataCallback dataCallback = BleCore.this.dataCallback;
            if (dataCallback != null) {
                dataCallback.onDataReceived(characteristic.getValue());
                BleCore.this.dataCallback.onDataReceived(gatt.getDevice(), characteristic.getValue());
            }
            if (!characteristic.getUuid().equals(BlueConstant.UUID_CMD_NOTIFY)) {
                if (characteristic.getUuid().equals(BlueConstant.UUID_PHOTO_NOTIFY)) {
                    ModUtils.modBleResponse().onRequestSyncFileResponse(new FileDatagram().recoverBytesToDatagram(HexConvert.convertArray2List(characteristic.getValue())), characteristic.getValue());
                    return;
                }
                return;
            }
            if (characteristic.getValue().length < 5) {
                C2473f.m4173i(BleCore.TAG, "onCharacteristicChanged: 指令数据长度小于5");
            } else {
                ModUtils.modBleResponse().onRequestSyncDataResponse(new Datagram().recoverBytesToDatagram(HexConvert.convertArray2List(characteristic.getValue())), characteristic.getValue());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
            super.onCharacteristicWrite(gatt, characteristic, status);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
            if (newState == 2) {
                gatt.discoverServices();
                return;
            }
            if (newState == 0) {
                BluetoothCore.ConnectionCallback connectionCallback = BleCore.this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onDisconnected();
                }
                i91 i91Var = new i91();
                i91Var.f46089a = i91.f46088f;
                zgb.defaultCenter().publish(i91Var);
                BleCore.this.closeGatt();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(@efb BluetoothGatt gatt, @efb BluetoothGattDescriptor descriptor, int status, @efb byte[] value) {
            super.onDescriptorRead(gatt, descriptor, status, value);
            C2473f.m4168e(BleCore.TAG, "onDescriptorRead: " + descriptor.getCharacteristic().getUuid() + ", status=" + status + "::::" + value.length);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
            super.onDescriptorWrite(gatt, descriptor, status);
            if (status == 0) {
                if (descriptor.getCharacteristic().getUuid().equals(BlueConstant.UUID_CMD_NOTIFY)) {
                    BleCore.this.isCmdNotify = true;
                } else if (descriptor.getCharacteristic().getUuid().equals(BlueConstant.UUID_PHOTO_NOTIFY)) {
                    BleCore.this.isPhotoNotify = true;
                }
            }
            C2473f.m4168e(BleCore.TAG, "onDescriptorWrite: " + descriptor.getCharacteristic().getUuid() + ", status=" + status);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
            super.onMtuChanged(gatt, mtu, status);
            if (status == 0 && BleCore.this.hasSendMtuOperation) {
                C2473f.m4168e(BleCore.TAG, BleCore.this.isCmdNotify + "::::" + BleCore.this.isPhotoNotify);
                if (BleCore.this.isCmdNotify && BleCore.this.isPhotoNotify) {
                    BluetoothCore.ConnectionCallback connectionCallback = BleCore.this.connectionCallback;
                    if (connectionCallback != null) {
                        connectionCallback.onConnected(gatt.getDevice());
                    }
                    BleCore.this.isConnected = true;
                    i91 i91Var = new i91();
                    i91Var.f46089a = i91.f46087e;
                    i91Var.f46090b = gatt.getDevice().getAddress();
                    i91Var.f46091c = BleCore.this.deviceName;
                    i91Var.f46092d = gatt.getDevice();
                    zgb.defaultCenter().publish(i91Var);
                    boolean zCreateBond = BluetoothUtil.createBond(gatt.getDevice(), 1);
                    C2473f.m4168e(BleCore.TAG, "创建配对：：：" + zCreateBond);
                    BleCore.this.mMtu = mtu;
                } else {
                    BluetoothCore.ConnectionCallback connectionCallback2 = BleCore.this.connectionCallback;
                    if (connectionCallback2 != null) {
                        connectionCallback2.onDisconnected();
                    }
                    BleCore.this.disconnect();
                }
            }
            C2473f.m4168e(BleCore.TAG, "onMtuChanged: mtu=" + mtu + ", status=" + status + "::::" + gatt.getDevice().getName() + ":::" + gatt.getDevice().getAddress());
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onPhyUpdate(BluetoothGatt gatt, int txPhy, int rxPhy, int status) {
            super.onPhyUpdate(gatt, txPhy, rxPhy, status);
            if (status != 0) {
                C2473f.m4168e(BleCore.TAG, "PHY更新失败，状态码: " + status);
                return;
            }
            if (txPhy == 2 && rxPhy == 2) {
                C2473f.m4168e(BleCore.TAG, "成功切换到 2M PHY");
                return;
            }
            C2473f.m4168e(BleCore.TAG, "PHY更新成功，但未使用2M。Tx PHY: " + txPhy + ", Rx PHY: " + rxPhy);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        @igg({"MissingPermission"})
        public void onServicesDiscovered(final BluetoothGatt gatt, int status) {
            C2473f.m4168e(BleCore.TAG, "onServicesDiscovered：" + status);
            if (status == 0) {
                C2473f.m4168e(BleCore.TAG, "onServicesDiscovered: 发现服务成功，移除connectTimeOutRun");
                BleCore.this.handler.removeCallbacks(BleCore.this.connectTimeOutRun);
                C2478k.runOnUiThreadDelayed(new Runnable() { // from class: com.eyevue.glassapp.bluetooth.manager.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18242a.lambda$onServicesDiscovered$0(gatt);
                    }
                }, 1000L);
                C2478k.runOnUiThreadDelayed(new Runnable() { // from class: com.eyevue.glassapp.bluetooth.manager.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18244a.lambda$onServicesDiscovered$1(gatt);
                    }
                }, 3000L);
                BleCore.this.deviceName = TextUtils.isEmpty(gatt.getDevice().getName()) ? "" : gatt.getDevice().getName();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorRead(BluetoothGatt gatt, BluetoothGattDescriptor descriptor, int status) {
            super.onDescriptorRead(gatt, descriptor, status);
            C2473f.m4168e(BleCore.TAG, "onDescriptorRead: " + descriptor.getCharacteristic().getUuid() + ", status=" + status);
        }
    }
}
