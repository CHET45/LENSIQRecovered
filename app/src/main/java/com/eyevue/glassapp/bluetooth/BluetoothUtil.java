package com.eyevue.glassapp.bluetooth;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothManager;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.blankj.utilcode.util.C2473f;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import p000.g1i;
import p000.igg;

/* JADX INFO: loaded from: classes4.dex */
public class BluetoothUtil {
    private static final String TAG = "BluetoothUtil";
    private static final char[] mChars = "0123456789ABCDEF".toCharArray();

    public static byte[] addressCovertToByteArray(String address) {
        if (TextUtils.isEmpty(address) || !address.contains(g1i.f38277c)) {
            return null;
        }
        String strReplace = address.replace(g1i.f38277c, "");
        int length = strReplace.length() / 2;
        byte[] bArr = new byte[length];
        if (length != 6) {
            return null;
        }
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 2;
            if (i3 <= strReplace.length()) {
                try {
                    bArr[i] = (byte) Integer.valueOf(strReplace.substring(i2, i3), 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return bArr;
    }

    public static boolean cancelPairingUserInput(BluetoothDevice device) {
        if (device != null) {
            try {
                Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("cancelPairingUserInput", null);
                declaredMethod.setAccessible(true);
                return ((Boolean) declaredMethod.invoke(device, null)).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static int changeConnectionStatus(int btProfileStatus) {
        if (btProfileStatus == 0) {
            return 0;
        }
        if (btProfileStatus != 1) {
            return btProfileStatus != 2 ? 0 : 1;
        }
        return 3;
    }

    public static boolean connectDeviceA2dp(BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null || device == null) {
            return false;
        }
        try {
            return ((Boolean) bluetoothA2dp.getClass().getMethod("connect", BluetoothDevice.class).invoke(bluetoothA2dp, device)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean connectDeviceHfp(BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset == null || device == null) {
            return false;
        }
        try {
            Method method = bluetoothHeadset.getClass().getMethod("connect", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(bluetoothHeadset, device)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean createBond(BluetoothDevice device, int transport) {
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("createBond", Integer.TYPE);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(device, Integer.valueOf(transport))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deviceEquals(BluetoothDevice device1, BluetoothDevice device2) {
        return (device1 == null || device2 == null || !device1.getAddress().equals(device2.getAddress())) ? false : true;
    }

    public static boolean deviceHasA2dp(BluetoothDevice device) {
        return deviceHasProfile(device, BlueConstant.UUID_A2DP);
    }

    public static boolean deviceHasHfp(BluetoothDevice device) {
        return deviceHasProfile(device, BlueConstant.UUID_HFP);
    }

    public static boolean deviceHasProfile(BluetoothDevice device, UUID profileUuid) {
        ParcelUuid[] uuids;
        if (!CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || !isBluetoothEnable() || profileUuid == null || TextUtils.isEmpty(profileUuid.toString()) || device == null || (uuids = device.getUuids()) == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if (parcelUuid != null && profileUuid.toString().toLowerCase().equals(parcelUuid.toString())) {
                return true;
            }
        }
        return false;
    }

    public static boolean disableBluetooth() {
        BluetoothAdapter defaultAdapter;
        if (!CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return defaultAdapter.disable();
        }
        return true;
    }

    public static boolean disconnectDeviceA2dp(BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null || device == null) {
            return false;
        }
        try {
            Method method = bluetoothA2dp.getClass().getMethod("disconnect", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(bluetoothA2dp, device)).booleanValue();
        } catch (Exception e) {
            C2473f.m4176w(TAG, "disconnectDeviceA2dp", "Exception : " + e);
            e.printStackTrace();
            return false;
        }
    }

    public static boolean disconnectDeviceHfp(BluetoothHeadset bluetoothHeadset, BluetoothDevice device) {
        if (bluetoothHeadset == null || device == null) {
            return false;
        }
        try {
            Method method = bluetoothHeadset.getClass().getMethod("disconnect", BluetoothDevice.class);
            method.setAccessible(true);
            return ((Boolean) method.invoke(bluetoothHeadset, device)).booleanValue();
        } catch (Exception e) {
            C2473f.m4176w(TAG, "disconnectFromHfp", "Exception : " + e);
            e.printStackTrace();
            return false;
        }
    }

    public static boolean enableBluetooth() {
        BluetoothAdapter defaultAdapter;
        if (!CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return false;
        }
        if (defaultAdapter.isEnabled()) {
            return true;
        }
        return defaultAdapter.enable();
    }

    public static int formatBleMtu(int mtu) {
        if (mtu < 20) {
            mtu = 20;
        }
        if (mtu > 509) {
            return 509;
        }
        return mtu;
    }

    @igg({"DiscouragedPrivateApi"})
    public static BluetoothDevice getActivityDevice(BluetoothA2dp bluetoothA2dp) {
        if (bluetoothA2dp == null) {
            return null;
        }
        try {
            Method declaredMethod = bluetoothA2dp.getClass().getDeclaredMethod("getActiveDevice", null);
            declaredMethod.setAccessible(true);
            return (BluetoothDevice) declaredMethod.invoke(bluetoothA2dp, null);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @igg({"HardwareIds"})
    public static String getBluetoothMacAddress() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return "";
        }
        try {
            Field declaredField = defaultAdapter.getClass().getDeclaredField("mService");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(defaultAdapter);
            return obj != null ? (String) obj.getClass().getMethod("getAddress", null).invoke(obj, null) : "";
        } catch (Exception unused) {
            return "";
        }
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

    public static Method getDeclaredMethod() throws Exception {
        return Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
    }

    public static List<BluetoothDevice> getPairedBLEDevices() {
        List<BluetoothDevice> pairedDevices;
        if (!CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext()) || (pairedDevices = getPairedDevices()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (BluetoothDevice bluetoothDevice : pairedDevices) {
            int type = bluetoothDevice.getType();
            if (type == 2 || type == 3) {
                arrayList.add(bluetoothDevice);
            }
        }
        return arrayList;
    }

    public static List<BluetoothDevice> getPairedDevices(Context context) {
        BluetoothAdapter defaultAdapter;
        if (!CommonUtil.checkHasConnectPermission(context) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null || !defaultAdapter.isEnabled()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (defaultAdapter.getBondedDevices() != null) {
            arrayList.addAll(defaultAdapter.getBondedDevices());
        }
        return arrayList;
    }

    public static int getPriority(BluetoothProfile profile, BluetoothDevice device) {
        if (profile != null && device != null) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(profile.getClass(), "getPriority", new Class[]{BluetoothDevice.class});
                if (method == null) {
                    return 0;
                }
                return ((Integer) method.invoke(profile, device)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static BluetoothDevice getRemoteDevice(String address) {
        BluetoothAdapter defaultAdapter;
        if (!BluetoothAdapter.checkBluetoothAddress(address) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(address);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<BluetoothDevice> getSystemConnectedBtDeviceList() {
        return getSystemConnectedBtDeviceList(CommonUtil.getMainContext());
    }

    public static byte[] getVirtualAddress() {
        byte[] bArrAddressCovertToByteArray;
        byte[] bArr = new byte[4];
        String bluetoothMacAddress = getBluetoothMacAddress();
        if (TextUtils.isEmpty(bluetoothMacAddress) || bluetoothMacAddress.equals("02:00:00:00:00:00") || (bArrAddressCovertToByteArray = addressCovertToByteArray(bluetoothMacAddress)) == null || bArrAddressCovertToByteArray.length != 6) {
            Random random = new Random();
            for (int i = 0; i < 4; i++) {
                bArr[i] = (byte) random.nextInt(Integer.MAX_VALUE);
            }
        } else {
            System.arraycopy(bArrAddressCovertToByteArray, 2, bArr, 0, 4);
        }
        return bArr;
    }

    public static boolean hasBle(Context context) {
        return context != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static String hexDataConvertToAddress(byte[] data) {
        StringBuilder sb = new StringBuilder();
        if (data != null && data.length == 6) {
            for (int i = 0; i < data.length; i++) {
                char[] cArr = mChars;
                sb.append(cArr[(data[i] & 255) >> 4]);
                sb.append(cArr[data[i] & 15]);
                if (i != data.length - 1) {
                    sb.append(g1i.f38277c);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] hexStringCovertToByteArray(String hexString) {
        if (TextUtils.isEmpty(hexString)) {
            return null;
        }
        int length = hexString.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 2;
            if (i3 <= hexString.length()) {
                try {
                    bArr[i] = (byte) Integer.valueOf(hexString.substring(i2, i3), 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return bArr;
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

    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isValidBluetoothAddress(String address) {
        return (!address.matches("^([0-9A-Fa-f]{2}[:-]){5}([0-9A-Fa-f]{2})$") || address.equalsIgnoreCase("00:00:00:00:00:00") || address.equalsIgnoreCase("FF:FF:FF:FF:FF:FF")) ? false : true;
    }

    public static String printBoundState(int state) {
        switch (state) {
            case 10:
                return "BOND_NONE(10)";
            case 11:
                return "BOND_BONDING(11)";
            case 12:
                return "BOND_BONDED(12)";
            default:
                return CommonUtil.formatString("UNKNOWN_BOUND_STATE(%d)", Integer.valueOf(state));
        }
    }

    public static String printBtConnection(int state) {
        return state != 0 ? state != 1 ? state != 2 ? state != 3 ? CommonUtil.formatString("UNKNOWN_STATE(%d)", Integer.valueOf(state)) : "STATE_DISCONNECTING(3)" : "STATE_CONNECTED(2)" : "STATE_CONNECTING(1)" : "STATE_DISCONNECTED(0)";
    }

    public static String printBtDeviceInfo(BluetoothDevice device) {
        return printBtDeviceInfo(CommonUtil.getMainContext(), device);
    }

    public static String printConnectionState(int state) {
        return state != 0 ? state != 1 ? state != 2 ? state != 3 ? state != 4 ? CommonUtil.formatString("UNKNOWN_CONNECTION(%d)", Integer.valueOf(state)) : "CONNECTION_CONNECTED(4)" : "CONNECTION_CONNECTING(3)" : "CONNECTION_FAILED(2)" : "CONNECTION_OK(1)" : "CONNECTION_DISCONNECT(0)";
    }

    public static String printResponseStatus(int status) {
        switch (status) {
            case 0:
                return "OPERATION_SUCCESS(0)";
            case 1:
                return "OPERATION_FAILED(1)";
            case 2:
                return "UNKNOWN_COMMAND(2)";
            case 3:
                return "DEVICE_BUSY(3)";
            case 4:
                return "NO_RESOURCE(4)";
            case 5:
                return "CRC_VERIFICATION_ERROR(5)";
            case 6:
                return "ALL_DATA_CRC_ERROR(6)";
            case 7:
                return "INVALID_PARAMETER(7)";
            case 8:
                return "REPLY_DATA_OUT_OF_BOUNDS(8)";
            default:
                return CommonUtil.formatString("UNKNOWN_STATUS(%d)", Integer.valueOf(status));
        }
    }

    public static boolean refreshBleDeviceCache(BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt == null) {
            return false;
        }
        try {
            return ((Boolean) bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean removeBond(BluetoothDevice device) {
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

    public static boolean requestLeConnectionUpdate(BluetoothGatt bluetoothGatt, int minConnectionInterval, int maxConnectionInterval, int slaveLatency, int supervisionTimeout, int minConnectionEventLen, int maxConnectionEventLen) {
        if (bluetoothGatt == null) {
            return false;
        }
        try {
            Class<?> cls = bluetoothGatt.getClass();
            Class cls2 = Integer.TYPE;
            return ((Boolean) cls.getDeclaredMethod("requestLeConnectionUpdate", cls2, cls2, cls2, cls2, cls2, cls2).invoke(bluetoothGatt, Integer.valueOf(minConnectionInterval), Integer.valueOf(maxConnectionInterval), Integer.valueOf(slaveLatency), Integer.valueOf(supervisionTimeout), Integer.valueOf(minConnectionEventLen), Integer.valueOf(maxConnectionEventLen))).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String reverseAddressString(String srcAddr) {
        if (!BluetoothAdapter.checkBluetoothAddress(srcAddr)) {
            return srcAddr;
        }
        if (srcAddr.contains(g1i.f38277c)) {
            srcAddr = srcAddr.replaceAll(g1i.f38277c, "");
        }
        byte[] bArrHexStringCovertToByteArray = hexStringCovertToByteArray(srcAddr);
        if (bArrHexStringCovertToByteArray == null) {
            return srcAddr;
        }
        byte[] bArr = new byte[6];
        int length = bArrHexStringCovertToByteArray.length - 1;
        int i = 0;
        while (true) {
            if (!(i < bArrHexStringCovertToByteArray.length) || !(length >= 0)) {
                return hexDataConvertToAddress(bArr);
            }
            bArr[i] = bArrHexStringCovertToByteArray[length];
            i++;
            length--;
        }
    }

    @igg({"DiscouragedPrivateApi"})
    public static boolean setActivityDevice(BluetoothA2dp bluetoothA2dp, BluetoothDevice device) {
        if (bluetoothA2dp == null || device == null) {
            return false;
        }
        try {
            Method declaredMethod = bluetoothA2dp.getClass().getDeclaredMethod("setActiveDevice", device.getClass());
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(bluetoothA2dp, device)).booleanValue();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean setPriority(BluetoothProfile profile, BluetoothDevice device, int priority) {
        if (profile != null && device != null) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(profile.getClass(), "setPriority", new Class[]{BluetoothDevice.class, Integer.TYPE});
                if (method == null) {
                    return false;
                }
                return ((Boolean) method.invoke(profile, device, Integer.valueOf(priority))).booleanValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
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

    public static String printBtDeviceInfo(Context context, BluetoothDevice device) {
        return printBtDeviceInfo(context, device, true);
    }

    @igg({"MissingPermission"})
    public static String printBtDeviceInfo(Context context, BluetoothDevice device, boolean isDetail) {
        if (device == null || !CommonUtil.checkHasConnectPermission(context)) {
            return "null";
        }
        if (!isDetail) {
            return device.getAddress();
        }
        return "name : " + device.getName() + ", type : " + device.getType() + ", address : " + device.getAddress();
    }

    public static boolean createBond(BluetoothDevice device) {
        if (device == null || !CommonUtil.checkHasConnectPermission(CommonUtil.getMainContext())) {
            return false;
        }
        return device.createBond();
    }

    public static List<BluetoothDevice> getPairedDevices() {
        return getPairedDevices(CommonUtil.getMainContext());
    }
}
