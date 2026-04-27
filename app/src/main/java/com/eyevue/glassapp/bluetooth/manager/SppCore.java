package com.eyevue.glassapp.bluetooth.manager;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.blankj.utilcode.util.C2473f;
import com.eyevue.glassapp.bluetooth.BlueConstant;
import com.eyevue.glassapp.bluetooth.CommonUtil;
import com.eyevue.glassapp.bluetooth.manager.BluetoothCore;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class SppCore extends BluetoothCore {
    private static final String TAG = SppCore.class.toString();
    private BluetoothAdapter bluetoothAdapter;
    private ConnectedThread connectedThread;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private Context mContext;
    private BluetoothSocket socket;

    public class ConnectThread extends Thread {
        private final BluetoothSocket mmSocket;

        @igg({"MissingPermission"})
        public ConnectThread(BluetoothDevice device) {
            BluetoothSocket bluetoothSocketCreateRfcommSocketToServiceRecord;
            try {
                bluetoothSocketCreateRfcommSocketToServiceRecord = device.createRfcommSocketToServiceRecord(BlueConstant.UUID_SPP);
            } catch (IOException e) {
                C2473f.m4168e("SPP", "Socket创建失败", e.getMessage());
                bluetoothSocketCreateRfcommSocketToServiceRecord = null;
            }
            this.mmSocket = bluetoothSocketCreateRfcommSocketToServiceRecord;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        @igg({"MissingPermission"})
        public void run() {
            SppCore.this.bluetoothAdapter.cancelDiscovery();
            try {
                this.mmSocket.connect();
                SppCore sppCore = SppCore.this;
                sppCore.connectedThread = sppCore.new ConnectedThread(this.mmSocket);
                SppCore.this.connectedThread.start();
                BluetoothCore.ConnectionCallback connectionCallback = SppCore.this.connectionCallback;
                if (connectionCallback != null) {
                    connectionCallback.onConnected(this.mmSocket.getRemoteDevice());
                }
            } catch (IOException e) {
                BluetoothCore.ConnectionCallback connectionCallback2 = SppCore.this.connectionCallback;
                if (connectionCallback2 != null) {
                    connectionCallback2.onError("连接失败: " + e.getMessage());
                }
                try {
                    this.mmSocket.close();
                } catch (IOException e2) {
                    C2473f.m4168e("SPP", "关闭socket失败", e2.getMessage());
                }
            }
        }
    }

    public class ConnectedThread extends Thread {
        private final InputStream mmInStream;
        private final OutputStream mmOutStream;
        private final BluetoothSocket mmSocket;

        public ConnectedThread(BluetoothSocket socket) {
            InputStream inputStream;
            this.mmSocket = socket;
            OutputStream outputStream = null;
            try {
                inputStream = socket.getInputStream();
                try {
                    outputStream = socket.getOutputStream();
                } catch (IOException e) {
                    e = e;
                    C2473f.m4168e("SPP", "流获取失败", e.getMessage());
                }
            } catch (IOException e2) {
                e = e2;
                inputStream = null;
            }
            this.mmInStream = inputStream;
            this.mmOutStream = outputStream;
        }

        public void cancel() {
            try {
                this.mmSocket.close();
            } catch (IOException e) {
                C2473f.m4168e("SPP", "关闭socket失败", e.getMessage());
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            byte[] bArr = new byte[1024];
            while (true) {
                try {
                    int i = this.mmInStream.read(bArr);
                    BluetoothCore.DataCallback dataCallback = SppCore.this.dataCallback;
                    if (dataCallback != null) {
                        dataCallback.onDataReceived(Arrays.copyOf(bArr, i));
                    }
                } catch (IOException unused) {
                    BluetoothCore.ConnectionCallback connectionCallback = SppCore.this.connectionCallback;
                    if (connectionCallback != null) {
                        connectionCallback.onDisconnected();
                        return;
                    }
                    return;
                }
            }
        }

        public void write(byte[] bytes) {
            try {
                this.mmOutStream.write(bytes);
            } catch (IOException e) {
                C2473f.m4168e("SPP", "写入失败", e.getMessage());
            }
        }
    }

    public SppCore(Context context) {
        this.mContext = context;
    }

    public static int getBtAdapterConnectionState(BluetoothAdapter bluetoothAdapter) {
        if (bluetoothAdapter != null) {
            try {
                Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod("getConnectionState", null);
                declaredMethod.setAccessible(true);
                return ((Integer) declaredMethod.invoke(bluetoothAdapter, null)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static List<BluetoothDevice> getConnectedBleDeviceList(Context context) {
        BluetoothManager bluetoothManager;
        if (context == null || !CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || (bluetoothManager = (BluetoothManager) context.getSystemService("bluetooth")) == null) {
            return null;
        }
        return bluetoothManager.getConnectedDevices(7);
    }

    public static List<BluetoothDevice> getSystemConnectedBtDeviceList(Context context) {
        if (!CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext())) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            int btAdapterConnectionState = getBtAdapterConnectionState(defaultAdapter);
            if (btAdapterConnectionState == 2 || btAdapterConnectionState == 0) {
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (isBTConnected(bluetoothDevice)) {
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
            List<BluetoothDevice> connectedBleDeviceList = getConnectedBleDeviceList(context);
            if (connectedBleDeviceList != null) {
                for (BluetoothDevice bluetoothDevice2 : connectedBleDeviceList) {
                    if (!arrayList.contains(bluetoothDevice2)) {
                        arrayList.add(bluetoothDevice2);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return arrayList;
    }

    public static boolean isBTConnected(BluetoothDevice device) {
        if (device != null) {
            try {
                Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("isConnected", null);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(device, null)).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startScan$0(BroadcastReceiver broadcastReceiver, BluetoothCore.ScanDeviceCallback scanDeviceCallback) {
        this.bluetoothAdapter.cancelDiscovery();
        this.mContext.unregisterReceiver(broadcastReceiver);
        scanDeviceCallback.onScanTimeout();
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
        this.mContext.startActivity(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        return false;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public void connect(String deviceAddress) {
        new ConnectThread(this.bluetoothAdapter.getRemoteDevice(deviceAddress)).start();
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public boolean createBond(BluetoothDevice device) {
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("createBond", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(device, 1)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public void disconnect() {
        ConnectedThread connectedThread = this.connectedThread;
        if (connectedThread != null) {
            connectedThread.cancel();
            this.connectedThread = null;
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public List<BluetoothDevice> getSystemConnectedDeviceList() {
        return getSystemConnectedBtDeviceList(CommonUtil.getMainContext());
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public boolean isConnected() {
        return false;
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public boolean removeBond(BluetoothDevice device) {
        if (device == null) {
            return false;
        }
        try {
            return ((Boolean) device.getClass().getMethod("removeBond", null).invoke(device, null)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            C2473f.m4168e(TAG, "removeBond", "Invoke removeBond : " + e.getMessage());
            return false;
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    public void sendData(byte[] data) {
        ConnectedThread connectedThread = this.connectedThread;
        if (connectedThread != null) {
            connectedThread.write(data);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void startScan(final BluetoothCore.ScanDeviceCallback callback, long timeout) {
        if (checkBluetoothReady()) {
            final BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.eyevue.glassapp.bluetooth.manager.SppCore.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    if ("android.bluetooth.device.action.FOUND".equals(intent.getAction())) {
                        BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                        if (bluetoothDevice.getBluetoothClass().getMajorDeviceClass() == 512) {
                            callback.onDeviceFound(bluetoothDevice, null);
                        }
                    }
                }
            };
            this.mContext.registerReceiver(broadcastReceiver, new IntentFilter("android.bluetooth.device.action.FOUND"));
            this.bluetoothAdapter.startDiscovery();
            this.handler.postDelayed(new Runnable() { // from class: bzf
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15383a.lambda$startScan$0(broadcastReceiver, callback);
                }
            }, timeout);
        }
    }

    @Override // com.eyevue.glassapp.bluetooth.manager.BluetoothCore
    @igg({"MissingPermission"})
    public void stopScan() {
        this.bluetoothAdapter.cancelDiscovery();
    }
}
