package com.eyevue.glassapp.bluetooth.ota.spp;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.ParcelUuid;
import android.os.Parcelable;
import android.os.SystemClock;
import com.eyevue.glassapp.bluetooth.ota.ConfigHelper;
import com.eyevue.glassapp.bluetooth.ota.spp.ConnectionSppThread;
import com.eyevue.glassapp.bluetooth.ota.spp.ReceiveSppDataThread;
import com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.OnWriteSppDataCallback;
import com.eyevue.glassapp.bluetooth.ota.spp.interfaces.SppEventCallback;
import com.eyevue.glassapp.utils.AppUtil;
import com.jieli.jl_bt_ota.impl.RcspAuth;
import com.watchfun.base.BaseApplication;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import p000.dh8;
import p000.h9d;
import p000.igg;
import p000.kc2;
import p000.p43;
import p000.pk1;
import p000.v91;

/* JADX INFO: loaded from: classes4.dex */
public class SppManager implements SendSppDataThread.ISppOp {
    private static final int BOND_DEV_TIMEOUT = 30000;
    private static final int CONNECT_DEV_TIMEOUT = 40000;
    private static final String KEY_SPP_UUID = "spp_uuid";
    private static final int MSG_CONNECT_SPP_TIMEOUT = 1024;
    private static final int MSG_CREATE_BOND_TIMEOUT = 1023;
    private static final int MSG_DISCOVERY_EDR_TIMEOUT = 1022;
    private static final String TAG = "SppManager";

    @igg({"StaticFieldLeak"})
    private static volatile SppManager instance;
    public final UUID customSppUUID;
    private volatile boolean isDeviceAuth;
    private final boolean isNeedAuth;
    private BluetoothReceiver mBluetoothReceiver;
    private volatile BluetoothDevice mBondingDevice;
    private final BluetoothAdapter mBtAdapter;
    private ConnectionSppThread mConnectSppThread;
    private volatile BluetoothDevice mConnectedSppDevice;
    private final Map<String, ReceiveSppDataThread> mConnectedSppMap;
    private volatile BluetoothDevice mConnectingSppDevice;
    private final Context mContext;
    private final List<BluetoothDevice> mDiscoveredEdrDevices;
    private DiscoveryReceiver mDiscoveryReceiver;
    private final Handler mHandler;
    private final RcspAuth.InterfaceC3830d mOnRcspAuthListener;
    private final RcspAuth mRcspAuth;
    private long mScanTimeout;
    private SendSppDataThread mSendSppDataThread;
    private final SppEventCallbackManager mSppEventCallbackManager;
    private UUID mSppUUID;
    private final boolean useSppPrivateChannel;
    public static final UUID UUID_SPP = UUID.fromString("00001101-0000-1000-8000-00805f9b34fb");
    public static final UUID UUID_DEFAULT_CUSTOM = UUID.fromString("fe010000-1234-5678-abcd-00805f9b34fb");

    public class BluetoothReceiver extends BroadcastReceiver {
        private BluetoothReceiver() {
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
                    if (SppManager.this.mBtAdapter != null && intExtra == -1) {
                        intExtra = SppManager.this.mBtAdapter.getState();
                    }
                    if (intExtra != 10) {
                        if (intExtra == 12) {
                            SppManager.this.mSppEventCallbackManager.onAdapterChange(true);
                        }
                        break;
                    } else {
                        SppManager.this.mDiscoveredEdrDevices.clear();
                        SppManager.this.mSppEventCallbackManager.onDiscoveryDeviceChange(false);
                        SppManager sppManager = SppManager.this;
                        sppManager.disconnectSpp(sppManager.getConnectedSppDevice(), null);
                        SppManager.this.mSppEventCallbackManager.onAdapterChange(false);
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.UUID":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice != null) {
                        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.bluetooth.device.extra.UUID");
                        if (parcelableArrayExtra == null) {
                            dh8.m9154e(SppManager.TAG, "recv action : ACTION_UUID >>> no uuids");
                        } else {
                            ParcelUuid[] parcelUuidArr = new ParcelUuid[parcelableArrayExtra.length];
                            for (int i = 0; i < parcelableArrayExtra.length; i++) {
                                parcelUuidArr[i] = ParcelUuid.fromString(parcelableArrayExtra[i].toString());
                                dh8.m9156i(SppManager.TAG, "recv action : ACTION_UUID >>> index = " + i + " uuid = " + parcelUuidArr[i]);
                            }
                        }
                        StringBuilder sb = new StringBuilder();
                        sb.append("recv action : ACTION_UUID >>> mConnectingSppDevice = ");
                        SppManager sppManager2 = SppManager.this;
                        sb.append(sppManager2.printDeviceInfo(sppManager2.mConnectingSppDevice));
                        sb.append(", device = ");
                        sb.append(SppManager.this.printDeviceInfo(bluetoothDevice));
                        dh8.m9151d(SppManager.TAG, sb.toString());
                        if (v91.deviceEquals(SppManager.this.mConnectingSppDevice, bluetoothDevice)) {
                            SppManager sppManager3 = SppManager.this;
                            sppManager3.startConnectSppThread(bluetoothDevice, sppManager3.mSppUUID);
                        }
                        break;
                    }
                    break;
                case "android.bluetooth.device.action.BOND_STATE_CHANGED":
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    if (bluetoothDevice2 != null && AppUtil.checkHasConnectPermission(context)) {
                        int bondState = bluetoothDevice2.getBondState();
                        boolean zIsValidDevice = SppManager.this.isValidDevice(bluetoothDevice2);
                        dh8.m9156i(SppManager.TAG, "recv action : ACTION_BOND_STATE_CHANGED >>> device = " + SppManager.this.printDeviceInfo(bluetoothDevice2) + ", bond = " + bondState + ", isValidDevice = " + zIsValidDevice);
                        if ((bondState == 10 || bondState == 12) && zIsValidDevice) {
                            SppManager.this.stopPairTimeoutTask(bluetoothDevice2);
                            if (bondState == 12) {
                                SppManager sppManager4 = SppManager.this;
                                sppManager4.startConnectSppThread(bluetoothDevice2, sppManager4.mSppUUID);
                            } else {
                                SppManager sppManager5 = SppManager.this;
                                sppManager5.handleSppConnection(bluetoothDevice2, sppManager5.mSppUUID, 0);
                            }
                        }
                        break;
                    }
                    break;
            }
        }
    }

    public class DiscoveryReceiver extends BroadcastReceiver {
        private DiscoveryReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            if (intent == null || (action = intent.getAction()) == null) {
                return;
            }
            switch (action) {
                case "android.bluetooth.adapter.action.DISCOVERY_FINISHED":
                    dh8.m9151d(SppManager.TAG, "recv action : ACTION_DISCOVERY_FINISHED");
                    SppManager.this.stopScanTimeoutTask();
                    SppManager.this.unregisterDiscoveryReceiver();
                    SppManager.this.mSppEventCallbackManager.onDiscoveryDeviceChange(false);
                    break;
                case "android.bluetooth.adapter.action.DISCOVERY_STARTED":
                    dh8.m9151d(SppManager.TAG, "recv action : ACTION_DISCOVERY_STARTED");
                    break;
                case "android.bluetooth.device.action.FOUND":
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    short shortExtra = intent.getShortExtra("android.bluetooth.device.extra.RSSI", (short) -1);
                    if (SppManager.this.isSppDevice(bluetoothDevice) && v91.isBluetoothEnable() && !SppManager.this.mDiscoveredEdrDevices.contains(bluetoothDevice)) {
                        SppManager.this.mDiscoveredEdrDevices.add(bluetoothDevice);
                        SppManager.this.mSppEventCallbackManager.onDiscoveryDevice(bluetoothDevice, shortExtra);
                        break;
                    }
                    break;
            }
        }
    }

    private SppManager(Context context) {
        this(context, false);
    }

    private void addRecvSppDataThread(String socketUUID, ReceiveSppDataThread thread) {
        if (socketUUID == null || thread == null) {
            return;
        }
        this.mConnectedSppMap.put(socketUUID, thread);
    }

    private void addSendTask(BluetoothDevice device, UUID sppUUID, byte[] data, OnWriteSppDataCallback callback) {
        SendSppDataThread sendSppDataThread = this.mSendSppDataThread;
        if (sendSppDataThread != null) {
            sendSppDataThread.addSendTask(new SendSppDataThread.SppSendTask(device, sppUUID, data, callback));
        }
    }

    private void clearConnectedSppMap() {
        if (this.mConnectedSppMap.isEmpty()) {
            return;
        }
        Iterator<String> it = this.mConnectedSppMap.keySet().iterator();
        while (it.hasNext()) {
            ReceiveSppDataThread receiveSppDataThread = this.mConnectedSppMap.get(it.next());
            if (receiveSppDataThread != null) {
                receiveSppDataThread.stopThread();
            }
        }
        this.mConnectedSppMap.clear();
    }

    public static SppManager getInstance() {
        if (instance == null) {
            synchronized (SppManager.class) {
                try {
                    if (instance == null) {
                        instance = new SppManager(BaseApplication.getInstance());
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    private ReceiveSppDataThread getRecvSppDataThread(BluetoothDevice device, UUID sppUUID) {
        if (getSocketUUID(device, sppUUID) == null) {
            return null;
        }
        return this.mConnectedSppMap.get(getSocketUUID(device, sppUUID));
    }

    private String getSocketUUID(BluetoothDevice device, UUID sppUUID) {
        if (device == null || sppUUID == null) {
            return null;
        }
        return device.getAddress() + p43.f69617m + sppUUID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleSppConnection(BluetoothDevice device, UUID sppUUID, int status) {
        boolean zIsValidDevice = isValidDevice(device);
        dh8.m9156i(TAG, "-handleSppConnection- device = " + printDeviceInfo(device) + ", isValidDevice = " + zIsValidDevice + ", sppUUID = " + sppUUID + ", status = " + status);
        if (zIsValidDevice) {
            if (status == 0 || status == 2) {
                if (v91.deviceEquals(device, this.mConnectingSppDevice)) {
                    setConnectingSppDevice(null);
                }
                stopConnectTimeoutTask();
                if (status == 0) {
                    if (v91.deviceEquals(device, this.mConnectedSppDevice)) {
                        stopReceiveSppDataThread(device, sppUUID);
                        if (isConnectedSocketMapEmpty(device)) {
                            stopSendSppDataThread();
                            setConnectedSppDevice(null);
                        }
                    }
                } else if (this.mConnectedSppDevice == null) {
                    setConnectedSppDevice(device);
                }
            }
            this.mSppEventCallbackManager.onSppConnection(device, sppUUID, status);
            if (this.useSppPrivateChannel) {
                if (status == 2) {
                    if (this.customSppUUID.equals(sppUUID)) {
                        return;
                    }
                    connectSpp(device, this.customSppUUID);
                } else if (status == 0 && v91.deviceEquals(this.mConnectedSppDevice, device)) {
                    disconnectSpp(this.mConnectedSppDevice, null);
                }
            }
        }
    }

    private boolean isConnectedSocketMapEmpty(BluetoothDevice device) {
        if (device == null || this.mConnectedSppMap.isEmpty()) {
            return true;
        }
        String address = device.getAddress();
        Iterator<String> it = this.mConnectedSppMap.keySet().iterator();
        while (it.hasNext()) {
            String[] strArrSplit = it.next().split(p43.f69617m);
            if (strArrSplit.length == 2 && address.equals(strArrSplit[0])) {
                return false;
            }
        }
        return true;
    }

    private boolean isDevAuth(UUID sppUUID) {
        if (UUID_SPP.equals(sppUUID)) {
            return this.isDeviceAuth;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @igg({"MissingPermission"})
    public boolean isSppDevice(BluetoothDevice device) {
        return (!AppUtil.checkHasConnectPermission(this.mContext) || device == null || device.getType() == 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidDevice(BluetoothDevice device) {
        return v91.deviceEquals(this.mConnectingSppDevice, device) || v91.deviceEquals(device, this.mBondingDevice) || v91.deviceEquals(device, this.mConnectedSppDevice);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$0(Message message) {
        switch (message.what) {
            case 1022:
                boolean zIsScanning = isScanning();
                dh8.m9160w(TAG, "call MSG_DISCOVERY_EDR_TIMEOUT >> isScanning = " + zIsScanning);
                if (zIsScanning) {
                    stopDeviceScan();
                }
                break;
            case 1023:
                Object obj = message.obj;
                if (obj instanceof BluetoothDevice) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice) obj;
                    Bundle data = message.getData();
                    UUID uuid = UUID_SPP;
                    if (data != null) {
                        uuid = (UUID) data.getSerializable(KEY_SPP_UUID);
                    }
                    dh8.m9160w(TAG, "call MSG_CREATE_BOND_TIMEOUT >> device = " + printDeviceInfo(bluetoothDevice) + ", sppUUID = " + uuid);
                    if (!isPaired(bluetoothDevice)) {
                        handleSppConnection(bluetoothDevice, uuid, 0);
                    } else {
                        startConnectSppThread(bluetoothDevice, uuid);
                    }
                }
                break;
            case 1024:
                Object obj2 = message.obj;
                if (obj2 instanceof BluetoothDevice) {
                    BluetoothDevice bluetoothDevice2 = (BluetoothDevice) obj2;
                    Bundle data2 = message.getData();
                    UUID uuid2 = UUID_SPP;
                    if (data2 != null) {
                        uuid2 = (UUID) data2.getSerializable(KEY_SPP_UUID);
                    }
                    dh8.m9160w(TAG, "call MSG_CONNECT_SPP_TIMEOUT >> device = " + printDeviceInfo(bluetoothDevice2) + ", sppUUID = " + uuid2);
                    if (!isSppSocketConnected(bluetoothDevice2, uuid2)) {
                        handleSppConnection(bluetoothDevice2, uuid2, 0);
                    }
                }
                break;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$new$1(BluetoothDevice bluetoothDevice, UUID uuid, boolean z, byte[] bArr) {
        dh8.m9156i(TAG, "-sendAuthDataToDevice- device = " + printDeviceInfo(bluetoothDevice) + ", result = " + z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$new$2(BluetoothDevice bluetoothDevice, byte[] bArr) {
        writeDataToSppAsync(bluetoothDevice, UUID_SPP, bArr, new OnWriteSppDataCallback() { // from class: czf
            @Override // com.eyevue.glassapp.bluetooth.ota.spp.interfaces.OnWriteSppDataCallback
            public final void onSppResult(BluetoothDevice bluetoothDevice2, UUID uuid, boolean z, byte[] bArr2) {
                this.f28121a.lambda$new$1(bluetoothDevice2, uuid, z, bArr2);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String printDeviceInfo(BluetoothDevice device) {
        return v91.printBtDeviceInfo(this.mContext, device);
    }

    private void registerBluetoothReceiver() {
        if (this.mBluetoothReceiver == null) {
            this.mBluetoothReceiver = new BluetoothReceiver();
            IntentFilter intentFilter = new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.BOND_STATE_CHANGED");
            intentFilter.addAction("android.bluetooth.device.action.UUID");
            this.mContext.registerReceiver(this.mBluetoothReceiver, intentFilter);
        }
    }

    private void registerDiscoverReceiver() {
        if (this.mDiscoveryReceiver == null) {
            this.mDiscoveryReceiver = new DiscoveryReceiver();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_STARTED");
            intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
            intentFilter.addAction("android.bluetooth.device.action.FOUND");
            this.mContext.registerReceiver(this.mDiscoveryReceiver, intentFilter);
        }
    }

    private ReceiveSppDataThread removeRecvSppDataThread(BluetoothDevice device, UUID sppUUID) {
        if (getSocketUUID(device, sppUUID) == null) {
            return null;
        }
        return this.mConnectedSppMap.remove(getSocketUUID(device, sppUUID));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConnectedSppDevice(BluetoothDevice mConnectedSppDevice) {
        this.mConnectedSppDevice = mConnectedSppDevice;
        if (mConnectedSppDevice != null) {
            setConnectingSppDevice(null);
        } else {
            this.isDeviceAuth = false;
        }
    }

    private void setConnectingSppDevice(BluetoothDevice mConnectingSppDevice) {
        this.mConnectingSppDevice = mConnectingSppDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSppUUID(UUID mSppUUID) {
        this.mSppUUID = mSppUUID;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startConnectSppThread(BluetoothDevice device, UUID sppUUID) {
        dh8.m9151d(TAG, "-startConnectSppThread- device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
        if (this.mConnectSppThread == null) {
            ConnectionSppThread connectionSppThread = new ConnectionSppThread(this.mContext, device, sppUUID, new ConnectionSppThread.OnConnectSppListener() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppManager.1
                @Override // com.eyevue.glassapp.bluetooth.ota.spp.ConnectionSppThread.OnConnectSppListener
                public void onThreadStart(long threadID) {
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.spp.ConnectionSppThread.OnConnectSppListener
                public void onThreadStop(long threadID, boolean result, BluetoothDevice device2, UUID sppUUID2, BluetoothSocket socket) {
                    if (SppManager.this.mConnectSppThread != null && SppManager.this.mConnectSppThread.getId() == threadID) {
                        SppManager.this.mConnectSppThread = null;
                    }
                    if (!result) {
                        SppManager.this.handleSppConnection(device2, sppUUID2, 0);
                        return;
                    }
                    SppManager.this.setConnectedSppDevice(device2);
                    SppManager.this.startReceiveSppDataThread(device2, sppUUID2, socket);
                    SppManager.this.startSendSppDataThread();
                    if (!SppManager.this.isNeedAuth || SppManager.this.checkDeviceIsAuth(device2, sppUUID2)) {
                        SppManager.this.handleSppConnection(device2, sppUUID2, 2);
                        return;
                    }
                    SppManager.this.mRcspAuth.stopAuth(device2, false);
                    if (SppManager.this.mRcspAuth.startAuth(device2)) {
                        SppManager.this.setSppUUID(sppUUID2);
                    } else {
                        SppManager.this.disconnectSpp(device2, sppUUID2);
                    }
                }
            });
            this.mConnectSppThread = connectionSppThread;
            connectionSppThread.start();
        }
    }

    private void startConnectTimeoutTask(BluetoothDevice device, UUID sppUUID) {
        dh8.m9156i(TAG, "-startConnectTimeoutTask- device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
        this.mHandler.removeMessages(1024);
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_SPP_UUID, sppUUID);
        Message messageObtainMessage = this.mHandler.obtainMessage(1024, device);
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessageDelayed(messageObtainMessage, 40000L);
    }

    private void startPairTimeoutTask(BluetoothDevice device, UUID sppUUID) {
        dh8.m9151d(TAG, "-startPairTimeoutTask- device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
        this.mHandler.removeMessages(1023);
        this.mBondingDevice = device;
        Bundle bundle = new Bundle();
        bundle.putSerializable(KEY_SPP_UUID, sppUUID);
        Message messageObtainMessage = this.mHandler.obtainMessage(1023, device);
        messageObtainMessage.setData(bundle);
        this.mHandler.sendMessageDelayed(messageObtainMessage, 30000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startReceiveSppDataThread(BluetoothDevice device, UUID sppUUID, BluetoothSocket socket) {
        if (getRecvSppDataThread(device, sppUUID) == null) {
            ReceiveSppDataThread receiveSppDataThread = new ReceiveSppDataThread(this.mContext, device, sppUUID, socket, new ReceiveSppDataThread.OnRecvSppDataListener() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppManager.2
                @Override // com.eyevue.glassapp.bluetooth.ota.spp.ReceiveSppDataThread.OnRecvSppDataListener
                public void onRecvSppData(long threadID, BluetoothDevice device2, UUID sppUUID2, byte[] data) {
                    dh8.m9151d(SppManager.TAG, "-onRecvSppData- device = " + SppManager.this.printDeviceInfo(device2) + ", sppUUID = " + sppUUID2 + ", \n raw data = " + pk1.byte2HexStr(data));
                    SppManager.this.mSppEventCallbackManager.onReceiveSppData(device2, sppUUID2, data);
                    if (SppManager.this.checkDeviceIsAuth(device2, sppUUID2)) {
                        return;
                    }
                    SppManager.this.mRcspAuth.handleAuthData(device2, data);
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.spp.ReceiveSppDataThread.OnRecvSppDataListener
                public void onThreadStart(long threadID) {
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.spp.ReceiveSppDataThread.OnRecvSppDataListener
                public void onThreadStop(long threadID, int reason, BluetoothDevice device2, UUID sppUUID2) {
                    if (reason == 2) {
                        SppManager.this.disconnectSpp(device2, sppUUID2);
                    }
                }
            });
            addRecvSppDataThread(getSocketUUID(device, sppUUID), receiveSppDataThread);
            receiveSppDataThread.start();
        }
    }

    private void startScanTimeoutTask() {
        if (this.mScanTimeout == 0) {
            return;
        }
        dh8.m9151d(TAG, "-startScanTimeoutTask- mScanTimeout = " + this.mScanTimeout);
        this.mHandler.removeMessages(1022);
        this.mHandler.sendEmptyMessageDelayed(1022, this.mScanTimeout);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSendSppDataThread() {
        if (this.mSendSppDataThread == null) {
            SendSppDataThread sendSppDataThread = new SendSppDataThread(this.mContext, this, new SendSppDataThread.OnSendDataListener() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppManager.3
                @Override // com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread.OnSendDataListener
                public void onThreadStart(long threadID) {
                }

                @Override // com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread.OnSendDataListener
                public void onThreadStop(long threadID) {
                    if (SppManager.this.mSendSppDataThread == null || SppManager.this.mSendSppDataThread.getId() != threadID) {
                        return;
                    }
                    SppManager.this.mSendSppDataThread = null;
                }
            });
            this.mSendSppDataThread = sendSppDataThread;
            sendSppDataThread.start();
        }
    }

    private void stopConnectSppThread() {
        ConnectionSppThread connectionSppThread = this.mConnectSppThread;
        if (connectionSppThread != null) {
            if (connectionSppThread.isAlive()) {
                this.mConnectSppThread.interrupt();
            }
            this.mConnectSppThread = null;
        }
    }

    private void stopConnectTimeoutTask() {
        dh8.m9160w(TAG, "-stopConnectTimeoutTask-");
        this.mHandler.removeMessages(1024);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopPairTimeoutTask(BluetoothDevice device) {
        dh8.m9151d(TAG, "-stopPairTimeoutTask- device = " + printDeviceInfo(device));
        if (v91.deviceEquals(device, this.mBondingDevice)) {
            this.mHandler.removeMessages(1023);
            this.mBondingDevice = null;
        }
    }

    private void stopReceiveSppDataThread(BluetoothDevice device, UUID sppUUID) {
        ReceiveSppDataThread receiveSppDataThreadRemoveRecvSppDataThread = removeRecvSppDataThread(device, sppUUID);
        if (receiveSppDataThreadRemoveRecvSppDataThread != null) {
            receiveSppDataThreadRemoveRecvSppDataThread.stopThread();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void stopScanTimeoutTask() {
        dh8.m9151d(TAG, "-stopScanTimeoutTask-");
        this.mHandler.removeMessages(1022);
    }

    private void stopSendSppDataThread() {
        SendSppDataThread sendSppDataThread = this.mSendSppDataThread;
        if (sendSppDataThread != null) {
            sendSppDataThread.stopThread();
        }
    }

    private void syncSystemConnectedDevice() {
        List<BluetoothDevice> systemConnectedBtDeviceList;
        if (!AppUtil.checkHasConnectPermission(this.mContext) || (systemConnectedBtDeviceList = v91.getSystemConnectedBtDeviceList(this.mContext)) == null || systemConnectedBtDeviceList.isEmpty()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : systemConnectedBtDeviceList) {
            if (isSppDevice(bluetoothDevice) && !v91.deviceEquals(this.mConnectedSppDevice, bluetoothDevice) && !this.mDiscoveredEdrDevices.contains(bluetoothDevice)) {
                this.mDiscoveredEdrDevices.add(bluetoothDevice);
                this.mSppEventCallbackManager.onDiscoveryDevice(bluetoothDevice, 0);
            }
        }
    }

    private void unregisterBluetoothReceiver() {
        BluetoothReceiver bluetoothReceiver = this.mBluetoothReceiver;
        if (bluetoothReceiver != null) {
            this.mContext.unregisterReceiver(bluetoothReceiver);
            this.mBluetoothReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void unregisterDiscoveryReceiver() {
        DiscoveryReceiver discoveryReceiver = this.mDiscoveryReceiver;
        if (discoveryReceiver != null) {
            this.mContext.unregisterReceiver(discoveryReceiver);
            this.mDiscoveryReceiver = null;
        }
    }

    public boolean checkDeviceIsAuth(BluetoothDevice device, UUID sppUUID) {
        return v91.deviceEquals(device, this.mConnectedSppDevice) && (!this.isNeedAuth || isDevAuth(sppUUID));
    }

    public boolean connectSpp(String address) {
        return connectSpp(v91.getRemoteDevice(address));
    }

    @igg({"MissingPermission"})
    public boolean disconnectSpp(BluetoothDevice device, UUID sppUUID) {
        if (!AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9160w(TAG, "-disconnectSpp- miss bluetooth permission.");
            return false;
        }
        if (!v91.deviceEquals(device, this.mConnectedSppDevice)) {
            dh8.m9154e(TAG, "-disconnectSpp- >> device is not connected. device = " + printDeviceInfo(device) + ",\n ConnectedSppDevice = " + printDeviceInfo(this.mConnectedSppDevice));
            return false;
        }
        dh8.m9156i(TAG, "-disconnectSpp- device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
        if (sppUUID != null) {
            ReceiveSppDataThread receiveSppDataThreadRemoveRecvSppDataThread = removeRecvSppDataThread(device, sppUUID);
            if (receiveSppDataThreadRemoveRecvSppDataThread != null) {
                BluetoothSocket bluetoothSocket = receiveSppDataThreadRemoveRecvSppDataThread.getBluetoothSocket();
                if (bluetoothSocket != null) {
                    try {
                        bluetoothSocket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                receiveSppDataThreadRemoveRecvSppDataThread.stopThread();
            }
            handleSppConnection(device, sppUUID, 0);
        } else if (!isConnectedSocketMapEmpty(device)) {
            Set<String> setKeySet = this.mConnectedSppMap.keySet();
            ArrayList arrayList = new ArrayList();
            String address = device.getAddress();
            Iterator<String> it = setKeySet.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(p43.f69617m);
                if (strArrSplit.length == 2 && address.equals(strArrSplit[0])) {
                    arrayList.add(UUID.fromString(strArrSplit[1]));
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                disconnectSpp(device, (UUID) it2.next());
            }
        }
        return true;
    }

    public BluetoothDevice getConnectedSppDevice() {
        return this.mConnectedSppDevice;
    }

    public BluetoothDevice getConnectingSppDevice() {
        return this.mConnectingSppDevice;
    }

    @igg({"MissingPermission"})
    public boolean isPaired(BluetoothDevice device) {
        return AppUtil.checkHasConnectPermission(this.mContext) && device != null && 12 == device.getBondState();
    }

    @igg({"MissingPermission"})
    public boolean isScanning() {
        BluetoothAdapter bluetoothAdapter;
        return AppUtil.checkHasScanPermission(this.mContext) && (bluetoothAdapter = this.mBtAdapter) != null && bluetoothAdapter.isDiscovering();
    }

    public boolean isSppConnected() {
        return this.mConnectedSppDevice != null;
    }

    public boolean isSppConnecting() {
        return this.mConnectingSppDevice != null;
    }

    @igg({"MissingPermission"})
    public boolean isSppSocketConnected(BluetoothDevice device, UUID sppUUID) {
        BluetoothSocket bluetoothSocket;
        if (AppUtil.checkHasConnectPermission(this.mContext)) {
            ReceiveSppDataThread recvSppDataThread = getRecvSppDataThread(device, sppUUID);
            return (recvSppDataThread == null || (bluetoothSocket = recvSppDataThread.getBluetoothSocket()) == null || !bluetoothSocket.isConnected()) ? false : true;
        }
        dh8.m9160w(TAG, "-isSppSocketConnected- miss bluetooth permission.");
        return false;
    }

    public void registerSppEventCallback(SppEventCallback callback) {
        this.mSppEventCallbackManager.registerSppEventCallback(callback);
    }

    public void release() {
        unregisterDiscoveryReceiver();
        unregisterBluetoothReceiver();
        this.mDiscoveredEdrDevices.clear();
        stopConnectSppThread();
        if (this.mConnectedSppDevice != null) {
            disconnectSpp(this.mConnectedSppDevice, null);
        }
        clearConnectedSppMap();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mSppEventCallbackManager.release();
        this.mRcspAuth.removeListener(this.mOnRcspAuthListener);
        this.mRcspAuth.destroy();
        instance = null;
    }

    @igg({"MissingPermission"})
    public boolean startDeviceScan(long timeout) {
        if (this.mBtAdapter == null || !AppUtil.checkHasScanPermission(this.mContext)) {
            dh8.m9154e(TAG, "this device is not supported bluetooth.");
            return false;
        }
        if (!v91.isBluetoothEnable()) {
            dh8.m9154e(TAG, "Bluetooth is not enable.");
            return false;
        }
        if (isScanning()) {
            if (!this.mBtAdapter.cancelDiscovery()) {
                return false;
            }
            unregisterDiscoveryReceiver();
            int i = 0;
            while (this.mBtAdapter.isDiscovering()) {
                SystemClock.sleep(100L);
                i += 100;
                if (i > 2000) {
                    break;
                }
            }
            this.mDiscoveredEdrDevices.clear();
        }
        boolean zStartDiscovery = this.mBtAdapter.startDiscovery();
        dh8.m9156i(TAG, "-startDiscovery- >>>>>> ret : " + zStartDiscovery);
        if (!zStartDiscovery) {
            return false;
        }
        if (timeout < 3000) {
            this.mScanTimeout = 3000L;
        } else {
            this.mScanTimeout = timeout;
        }
        registerDiscoverReceiver();
        this.mDiscoveredEdrDevices.clear();
        startScanTimeoutTask();
        this.mSppEventCallbackManager.onDiscoveryDeviceChange(true);
        syncSystemConnectedDevice();
        return true;
    }

    @igg({"MissingPermission"})
    public boolean stopDeviceScan() {
        if (this.mBtAdapter == null || !AppUtil.checkHasScanPermission(this.mContext)) {
            dh8.m9154e(TAG, "-stopDeviceScan- :: this device is not supported bluetooth.");
            return false;
        }
        if (!v91.isBluetoothEnable()) {
            dh8.m9154e(TAG, "-stopDeviceScan- :: Bluetooth is not enable.");
            unregisterDiscoveryReceiver();
            return true;
        }
        if (!this.mBtAdapter.isDiscovering()) {
            return true;
        }
        if (!this.mBtAdapter.cancelDiscovery()) {
            return false;
        }
        stopScanTimeoutTask();
        return true;
    }

    public void unregisterSppEventCallback(SppEventCallback callback) {
        this.mSppEventCallbackManager.unregisterSppEventCallback(callback);
    }

    public void writeDataToSppAsync(BluetoothDevice device, UUID sppUUID, byte[] data, OnWriteSppDataCallback callback) {
        addSendTask(device, sppUUID, data, callback);
    }

    @Override // com.eyevue.glassapp.bluetooth.ota.spp.SendSppDataThread.ISppOp
    @igg({"MissingPermission"})
    public synchronized boolean writeDataToSppDevice(BluetoothDevice device, UUID sppUUID, byte[] data) throws IOException {
        if (!AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9160w(TAG, "-writeDataToSppDevice- miss bluetooth permission.");
            return false;
        }
        if (device == null || data == null) {
            dh8.m9154e(TAG, "-writeDataToSppDevice- param is error.");
            return false;
        }
        if (!v91.deviceEquals(device, this.mConnectedSppDevice)) {
            dh8.m9154e(TAG, "-writeDataToSppDevice- device is error. device = " + printDeviceInfo(device));
            return false;
        }
        ReceiveSppDataThread recvSppDataThread = getRecvSppDataThread(device, sppUUID);
        if (recvSppDataThread == null) {
            dh8.m9154e(TAG, "-writeDataToSppDevice- receiveSppDataThread is null. device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
            return false;
        }
        BluetoothSocket bluetoothSocket = recvSppDataThread.getBluetoothSocket();
        if (bluetoothSocket != null && bluetoothSocket.isConnected() && bluetoothSocket.getOutputStream() != null) {
            bluetoothSocket.getOutputStream().write(data);
            dh8.m9151d(TAG, "-writeDataToSppDevice- device = " + printDeviceInfo(device) + ", sppUUID = " + sppUUID + "\n send ret = true, raw data = " + pk1.byte2HexStr(data));
            return true;
        }
        dh8.m9154e(TAG, "-writeDataToSppDevice- spp socket is close.");
        return false;
    }

    private SppManager(Context context, boolean isNeedAuth) {
        this.mDiscoveredEdrDevices = new ArrayList();
        this.mConnectedSppMap = new HashMap();
        this.useSppPrivateChannel = ConfigHelper.Companion.getInstance().isUseMultiSppChannel();
        this.mHandler = new Handler(new Handler.Callback() { // from class: dzf
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f31391a.lambda$new$0(message);
            }
        });
        RcspAuth.InterfaceC3830d interfaceC3830d = new RcspAuth.InterfaceC3830d() { // from class: com.eyevue.glassapp.bluetooth.ota.spp.SppManager.4
            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.InterfaceC3830d
            public void onAuthFailed(BluetoothDevice device, int code, String message) {
                dh8.m9160w(SppManager.TAG, String.format(Locale.getDefault(), "-onAuthFailed- device : %s, code : %d, message : %s", SppManager.this.printDeviceInfo(device), Integer.valueOf(code), message));
                SppManager.this.isDeviceAuth = false;
                SppManager sppManager = SppManager.this;
                sppManager.disconnectSpp(device, sppManager.mSppUUID);
            }

            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.InterfaceC3830d
            public void onAuthSuccess(BluetoothDevice device) {
                dh8.m9160w(SppManager.TAG, "-onAuthSuccess- >>> auth ok, handleSppConnection : " + SppManager.this.printDeviceInfo(device));
                SppManager.this.isDeviceAuth = true;
                SppManager sppManager = SppManager.this;
                sppManager.handleSppConnection(device, sppManager.mSppUUID, 2);
            }

            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.InterfaceC3830d
            public void onInitResult(boolean result) {
                dh8.m9154e(SppManager.TAG, "-onInitResult- " + result);
            }
        };
        this.mOnRcspAuthListener = interfaceC3830d;
        this.mContext = context;
        if (kc2.getMainContext() == null) {
            kc2.setMainContext(context);
        }
        this.customSppUUID = UUID.fromString(h9d.getSharedPreferences(context).getString(KEY_SPP_UUID, UUID_DEFAULT_CUSTOM.toString()));
        this.isNeedAuth = isNeedAuth;
        this.isDeviceAuth = !isNeedAuth;
        this.mBtAdapter = BluetoothAdapter.getDefaultAdapter();
        this.mSppEventCallbackManager = new SppEventCallbackManager();
        this.mRcspAuth = new RcspAuth(context, new RcspAuth.InterfaceC3829c() { // from class: ezf
            @Override // com.jieli.jl_bt_ota.impl.RcspAuth.InterfaceC3829c
            public final boolean sendAuthDataToDevice(BluetoothDevice bluetoothDevice, byte[] bArr) {
                return this.f34616a.lambda$new$2(bluetoothDevice, bArr);
            }
        }, interfaceC3830d);
        registerBluetoothReceiver();
    }

    public boolean connectSpp(BluetoothDevice device) {
        return connectSpp(device, UUID_SPP);
    }

    @igg({"MissingPermission"})
    public boolean connectSpp(BluetoothDevice device, UUID sppUUID) {
        if (!AppUtil.checkHasConnectPermission(this.mContext)) {
            dh8.m9160w(TAG, "-connectSpp- miss bluetooth permission.");
            return false;
        }
        if (device != null && device.getType() != 2) {
            dh8.m9156i(TAG, "-connectSpp- >> device : " + printDeviceInfo(device) + ", sppUUID = " + sppUUID);
            if (this.mConnectingSppDevice != null) {
                dh8.m9156i(TAG, "-connectSpp- >>  device is connecting. device :" + printDeviceInfo(this.mConnectedSppDevice));
                return false;
            }
            if (this.mConnectedSppDevice != null) {
                if (v91.deviceEquals(this.mConnectedSppDevice, device)) {
                    if (isSppSocketConnected(device, sppUUID)) {
                        if (this.isNeedAuth && !isDevAuth(sppUUID)) {
                            dh8.m9156i(TAG, "-connectSpp- >>  device in process of certification. device :" + printDeviceInfo(device));
                            return false;
                        }
                        handleSppConnection(device, sppUUID, 2);
                        return true;
                    }
                } else if (disconnectSpp(this.mConnectedSppDevice, null)) {
                    SystemClock.sleep(500L);
                }
            }
            setConnectingSppDevice(device);
            setSppUUID(sppUUID);
            boolean zIsPaired = isPaired(device);
            dh8.m9156i(TAG, "-connectSpp- >> isPaired = " + zIsPaired);
            if (!zIsPaired) {
                boolean zCreateBond = v91.createBond(device);
                dh8.m9156i(TAG, "-connectSpp- >> createBond = " + zCreateBond);
                if (!zCreateBond) {
                    handleSppConnection(device, sppUUID, 0);
                    return false;
                }
                startPairTimeoutTask(device, sppUUID);
            } else if (device.getUuids() != null && v91.deviceHasProfile(device, sppUUID)) {
                startConnectSppThread(device, sppUUID);
            } else {
                boolean zFetchUuidsWithSdp = device.fetchUuidsWithSdp();
                dh8.m9156i(TAG, "-connectSpp- >> fetchUuidsWithSdp = " + zFetchUuidsWithSdp);
                if (!zFetchUuidsWithSdp) {
                    handleSppConnection(device, sppUUID, 0);
                    return false;
                }
            }
            handleSppConnection(device, sppUUID, 1);
            startConnectTimeoutTask(device, sppUUID);
            return true;
        }
        dh8.m9160w(TAG, "-connectSpp-  device is bad object. ");
        return false;
    }
}
