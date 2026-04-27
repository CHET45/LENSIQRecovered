package p000;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.Context;
import android.os.ParcelUuid;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public class v91 {

    /* JADX INFO: renamed from: a */
    public static final String f90358a = "BluetoothUtil";

    /* JADX INFO: renamed from: b */
    public static final char[] f90359b = "0123456789ABCDEF".toCharArray();

    public static byte[] addressCovertToByteArray(String str) {
        if (!TextUtils.isEmpty(str) && str.contains(g1i.f38277c)) {
            String strReplace = str.replace(g1i.f38277c, "");
            int length = strReplace.length() / 2;
            byte[] bArr = new byte[length];
            if (length == 6) {
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
        }
        return null;
    }

    @igg({"MissingPermission"})
    public static boolean connectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice bluetoothDevice) {
        if (bluetoothA2dp != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Object objInvoke = bluetoothA2dp.getClass().getMethod("connect", BluetoothDevice.class).invoke(bluetoothA2dp, bluetoothDevice);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean connectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (bluetoothHeadset != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Method method = bluetoothHeadset.getClass().getMethod("connect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothHeadset, bluetoothDevice);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean createBond(Context context, BluetoothDevice bluetoothDevice, int i) {
        if (!kc2.checkHasConnectPermission(context)) {
            return false;
        }
        try {
            Method declaredMethod = BluetoothDevice.class.getDeclaredMethod("createBond", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(bluetoothDevice, Integer.valueOf(i));
            if (objInvoke instanceof Boolean) {
                return ((Boolean) objInvoke).booleanValue();
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean deviceEquals(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
        return (bluetoothDevice == null || bluetoothDevice2 == null || !bluetoothDevice.getAddress().equals(bluetoothDevice2.getAddress())) ? false : true;
    }

    public static boolean deviceHasProfile(BluetoothDevice bluetoothDevice, UUID uuid) {
        return deviceHasProfile(kc2.getMainContext(), bluetoothDevice, uuid);
    }

    @igg({"MissingPermission"})
    public static boolean disconnectDeviceA2dp(Context context, BluetoothA2dp bluetoothA2dp, BluetoothDevice bluetoothDevice) {
        if (bluetoothA2dp != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Method method = bluetoothA2dp.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothA2dp, bluetoothDevice);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                dh8.m9154e(f90358a, "-disconnectDeviceA2dp- have an exception : " + e);
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean disconnectDeviceHfp(Context context, BluetoothHeadset bluetoothHeadset, BluetoothDevice bluetoothDevice) {
        if (bluetoothHeadset != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Method method = bluetoothHeadset.getClass().getMethod("disconnect", BluetoothDevice.class);
                method.setAccessible(true);
                Object objInvoke = method.invoke(bluetoothHeadset, bluetoothDevice);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                dh8.m9154e(f90358a, "-disconnectFromHfp- have an exception : " + e);
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"DiscouragedPrivateApi", "MissingPermission"})
    public static int getBtAdapterConnectionState(Context context, BluetoothAdapter bluetoothAdapter) {
        if (kc2.checkHasConnectPermission(context) && bluetoothAdapter != null) {
            try {
                Method declaredMethod = bluetoothAdapter.getClass().getDeclaredMethod("getConnectionState", null);
                declaredMethod.setAccessible(true);
                Object objInvoke = declaredMethod.invoke(bluetoothAdapter, null);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                return -1;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return -1;
    }

    public static Method getDeclaredMethod() throws Exception {
        return Class.class.getDeclaredMethod("getDeclaredMethod", String.class, Class[].class);
    }

    @igg({"MissingPermission"})
    public static int getPriority(Context context, BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice) {
        if (bluetoothProfile != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(bluetoothProfile.getClass(), "getPriority", new Class[]{BluetoothDevice.class});
                if (method == null) {
                    return 0;
                }
                Object objInvoke = method.invoke(bluetoothProfile, bluetoothDevice);
                if (objInvoke instanceof Integer) {
                    return ((Integer) objInvoke).intValue();
                }
                return 0;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    public static BluetoothDevice getRemoteDevice(String str) {
        BluetoothAdapter defaultAdapter;
        if (!BluetoothAdapter.checkBluetoothAddress(str) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return null;
        }
        try {
            return defaultAdapter.getRemoteDevice(str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @igg({"MissingPermission"})
    public static List<BluetoothDevice> getSystemConnectedBtDeviceList(Context context) {
        if (!kc2.checkHasConnectPermission(context)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        try {
            int btAdapterConnectionState = getBtAdapterConnectionState(context, defaultAdapter);
            if (btAdapterConnectionState == 2 || btAdapterConnectionState == 0) {
                for (BluetoothDevice bluetoothDevice : defaultAdapter.getBondedDevices()) {
                    if (isBTConnected(context, bluetoothDevice)) {
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }

    public static boolean hasBle(Context context) {
        return context != null && context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
    }

    public static String hexDataCovetToAddress(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null && bArr.length == 6) {
            for (int i = 0; i < bArr.length; i++) {
                char[] cArr = f90359b;
                sb.append(cArr[(bArr[i] & 255) >> 4]);
                sb.append(cArr[bArr[i] & 15]);
                if (i != bArr.length - 1) {
                    sb.append(g1i.f38277c);
                }
            }
        }
        return sb.toString();
    }

    public static byte[] hexStringCovertToByteArray(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int i3 = i2 + 2;
            if (i3 <= str.length()) {
                try {
                    bArr[i] = (byte) Integer.valueOf(str.substring(i2, i3), 16).intValue();
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return bArr;
    }

    @igg({"MissingPermission"})
    public static boolean isBTConnected(Context context, BluetoothDevice bluetoothDevice) {
        if (kc2.checkHasConnectPermission(context) && bluetoothDevice != null) {
            try {
                Object objInvoke = bluetoothDevice.getClass().getDeclaredMethod("isConnected", null).invoke(bluetoothDevice, null);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean isBluetoothEnable() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        return defaultAdapter != null && defaultAdapter.isEnabled();
    }

    public static boolean isHeadSetType(int i) {
        return i == 2 || i == 4;
    }

    @Deprecated
    public static String printBtDeviceInfo(BluetoothDevice bluetoothDevice) {
        return printBtDeviceInfo(kc2.getMainContext(), bluetoothDevice);
    }

    @igg({"MissingPermission"})
    public static boolean removeBond(Context context, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Object objInvoke = bluetoothDevice.getClass().getMethod("removeBond", null).invoke(bluetoothDevice, null);
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                dh8.m9154e(f90358a, "Invoke removeBond : " + e.getMessage());
            }
        }
        return false;
    }

    public static String reverseAddressString(String str) {
        if (!BluetoothAdapter.checkBluetoothAddress(str)) {
            return str;
        }
        if (str.contains(g1i.f38277c)) {
            str = str.replaceAll(g1i.f38277c, "");
        }
        byte[] bArrHexStringCovertToByteArray = hexStringCovertToByteArray(str);
        if (bArrHexStringCovertToByteArray == null) {
            return str;
        }
        byte[] bArr = new byte[6];
        int length = bArrHexStringCovertToByteArray.length - 1;
        int i = 0;
        while (true) {
            if (!(i < bArrHexStringCovertToByteArray.length) || !(length >= 0)) {
                return hexDataCovetToAddress(bArr);
            }
            bArr[i] = bArrHexStringCovertToByteArray[length];
            i++;
            length--;
        }
    }

    @igg({"MissingPermission"})
    public static boolean setPriority(Context context, BluetoothProfile bluetoothProfile, BluetoothDevice bluetoothDevice, int i) {
        if (bluetoothProfile != null && bluetoothDevice != null && kc2.checkHasConnectPermission(context)) {
            try {
                Method method = (Method) getDeclaredMethod().invoke(bluetoothProfile.getClass(), "setPriority", new Class[]{BluetoothDevice.class, Integer.TYPE});
                if (method == null) {
                    return false;
                }
                Object objInvoke = method.invoke(bluetoothProfile, bluetoothDevice, Integer.valueOf(i));
                if (objInvoke instanceof Boolean) {
                    return ((Boolean) objInvoke).booleanValue();
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean deviceHasProfile(Context context, BluetoothDevice bluetoothDevice, UUID uuid) {
        ParcelUuid[] uuids;
        if (!isBluetoothEnable() || bluetoothDevice == null || uuid == null || TextUtils.isEmpty(uuid.toString()) || !kc2.checkHasConnectPermission(context) || (uuids = bluetoothDevice.getUuids()) == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if (parcelUuid != null && uuid.toString().equalsIgnoreCase(parcelUuid.toString())) {
                return true;
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static String printBtDeviceInfo(Context context, BluetoothDevice bluetoothDevice) {
        if (!kc2.checkHasConnectPermission(context) || bluetoothDevice == null) {
            return "null";
        }
        return "name : " + bluetoothDevice.getName() + " ,type : " + bluetoothDevice.getType() + " ,address : " + bluetoothDevice.getAddress();
    }

    public static boolean createBond(BluetoothDevice bluetoothDevice) {
        return createBond(kc2.getMainContext(), bluetoothDevice);
    }

    @igg({"MissingPermission"})
    public static boolean createBond(Context context, BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || !kc2.checkHasConnectPermission(context)) {
            return false;
        }
        return bluetoothDevice.createBond();
    }
}
