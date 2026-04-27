package com.eyevue.glassapp.bluetooth;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.efb;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class DeviceAddrManager {
    private static final String TAG = "DeviceAddrManager";

    @igg({"StaticFieldLeak"})
    private static volatile DeviceAddrManager instance;

    @igg({"StaticFieldLeak"})
    private static Context mContext;
    private final Map<String, Integer> recordDeviceConnectWayMap = new ConcurrentHashMap();

    public static class SaveAddrResult {
        public static final int RESULT_OP_CHANGE_BLE = 2;
        public static final int RESULT_OP_FAILED = 0;
        public static final int RESULT_OP_SUCCESS = 1;
        private String replaceBleAddr;
        private int result;

        public String getReplaceBleAddr() {
            return this.replaceBleAddr;
        }

        public int getResult() {
            return this.result;
        }

        public void setReplaceBleAddr(String replaceBleAddr) {
            this.replaceBleAddr = replaceBleAddr;
        }

        public void setResult(int result) {
            this.result = result;
        }

        @efb
        public String toString() {
            return "SaveAddrResult{result=" + this.result + ", replaceBleAddr='" + this.replaceBleAddr + "'}";
        }
    }

    private DeviceAddrManager(Context context) {
        mContext = (Context) CommonUtil.checkNotNull(context);
    }

    public static DeviceAddrManager getInstance() {
        if (instance == null) {
            synchronized (DeviceAddrManager.class) {
                try {
                    if (instance == null) {
                        if (mContext == null) {
                            mContext = CommonUtil.getMainContext();
                        }
                        instance = new DeviceAddrManager(mContext);
                    }
                } finally {
                }
            }
        }
        return instance;
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static boolean isInit() {
        return mContext != null;
    }

    public void finalize() throws Throwable {
        release();
        super.finalize();
    }

    public boolean isMatchDevice(BluetoothDevice device1, BluetoothDevice device2) {
        return (device1 == null || device2 == null || !isMatchDevice(device1.getAddress(), device2.getAddress())) ? false : true;
    }

    public void release() {
        this.recordDeviceConnectWayMap.clear();
        mContext = null;
        instance = null;
    }

    public void saveDeviceConnectWay(BluetoothDevice device, int connectWay) {
        if (device != null) {
            saveDeviceConnectWay(device.getAddress(), connectWay);
        }
    }

    public boolean isMatchDevice(String addr1, String addr2) {
        return BluetoothAdapter.checkBluetoothAddress(addr1) && BluetoothAdapter.checkBluetoothAddress(addr2) && addr1.equals(addr2);
    }

    public void saveDeviceConnectWay(String address, int connectWay) {
        if (BluetoothAdapter.checkBluetoothAddress(address)) {
            this.recordDeviceConnectWayMap.put(address, Integer.valueOf(connectWay));
        }
    }
}
