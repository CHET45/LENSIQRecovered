package com.eyevue.glassapp.utils;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelUuid;
import android.text.TextUtils;
import com.eyevue.glassapp.bluetooth.ota.OtaConstant;
import com.watchfun.base.BaseApplication;
import java.io.File;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import p000.dh8;
import p000.igg;
import p000.lx2;
import p000.pj4;
import p000.pk1;
import p000.v91;
import p000.xnc;

/* JADX INFO: loaded from: classes4.dex */
public class AppUtil {
    private static final long DOUBLE_CLICK_INTERVAL = 2000;
    private static int clickCount;
    private static long lastClickTime;
    private static int theClickCount;
    private static long theLastClickTime;

    public static int changeConnectStatus(int status) {
        if (status != 1) {
            return status != 2 ? 0 : 1;
        }
        return 3;
    }

    public static boolean checkHasConnectPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return isHasPermission(context, xnc.f98625v);
        }
        return true;
    }

    public static boolean checkHasScanPermission(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return isHasPermission(context, xnc.f98624u);
        }
        return true;
    }

    public static String createDownloadFolderFilePath(Context context, String... dirNames) {
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        StringBuilder sb = new StringBuilder();
        sb.append(externalStorageDirectory.getAbsolutePath());
        String str = File.separator;
        sb.append(str);
        sb.append(Environment.DIRECTORY_DOWNLOADS);
        sb.append(str);
        sb.append(OtaConstant.DIR_ROOT);
        sb.append(str);
        sb.append(OtaConstant.DIR_UPGRADE);
        String string = sb.toString();
        File file = new File(string);
        if (!file.exists() && !file.mkdirs()) {
            dh8.m9160w("jieli", "create dir failed. filePath = " + string);
        }
        return string.toString();
    }

    public static String createFilePath(Context context, String... dirNames) {
        File externalFilesDir;
        if (context == null || dirNames == null || dirNames.length == 0 || (externalFilesDir = context.getExternalFilesDir(null)) == null || !externalFilesDir.exists()) {
            return null;
        }
        StringBuilder sb = new StringBuilder(externalFilesDir.getPath());
        int i = 0;
        if (sb.toString().endsWith(pj4.f71071b)) {
            sb = new StringBuilder(sb.substring(0, sb.lastIndexOf(pj4.f71071b)));
        }
        int length = dirNames.length;
        while (true) {
            if (i >= length) {
                break;
            }
            String str = dirNames[i];
            sb.append(pj4.f71071b);
            sb.append(str);
            File file = new File(sb.toString());
            if ((!file.exists() || file.isFile()) && !file.mkdir()) {
                dh8.m9160w("jieli", "create dir failed. filePath = " + ((Object) sb));
                break;
            }
            i++;
        }
        return sb.toString();
    }

    @igg({"MissingPermission"})
    public static boolean deviceHasProfile(Context context, BluetoothDevice device, UUID uuid) {
        ParcelUuid[] uuids;
        if (!v91.isBluetoothEnable() || device == null || uuid == null || TextUtils.isEmpty(uuid.toString()) || !checkHasConnectPermission(context) || (uuids = device.getUuids()) == null) {
            return false;
        }
        for (ParcelUuid parcelUuid : uuids) {
            if (uuid.toString().toLowerCase(Locale.getDefault()).equalsIgnoreCase(parcelUuid.toString())) {
                return true;
            }
        }
        return false;
    }

    @igg({"MissingPermission"})
    public static boolean enableBluetooth(Context context) {
        BluetoothAdapter defaultAdapter;
        if (!checkHasConnectPermission(context) || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
            return false;
        }
        boolean zIsEnabled = defaultAdapter.isEnabled();
        return !zIsEnabled ? defaultAdapter.enable() : zIsEnabled;
    }

    @igg({"MissingPermission"})
    public static String getDeviceName(Context context, BluetoothDevice device) {
        if (device == null || !checkHasConnectPermission(context)) {
            return "N/A";
        }
        String name = device.getName();
        return TextUtils.isEmpty(name) ? "N/A" : name;
    }

    @igg({"MissingPermission"})
    public static int getDeviceType(Context context, BluetoothDevice device) {
        if (device == null || !checkHasConnectPermission(context)) {
            return 0;
        }
        return device.getType();
    }

    public static String getFileNameByPath(String filePath) {
        return (!TextUtils.isEmpty(filePath) && filePath.contains(pj4.f71071b)) ? filePath.substring(filePath.lastIndexOf(pj4.f71071b) + 1) : filePath;
    }

    public static int isFastContinuousClick() {
        return isFastContinuousClick(2000L);
    }

    public static boolean isFastDoubleClick() {
        return isFastDoubleClick(2000L);
    }

    public static boolean isHasLocationPermission(Context context) {
        return isHasPermission(context, xnc.f98584I) || isHasPermission(context, xnc.f98583H);
    }

    public static boolean isHasPermission(Context context, String permission) {
        return context != null && lx2.checkSelfPermission(context, permission) == 0;
    }

    public static boolean isHasStoragePermission(Context context) {
        return Build.VERSION.SDK_INT >= 28 ? isHasPermission(context, xnc.f98579D) : isHasPermission(context, xnc.f98580E) && isHasPermission(context, xnc.f98579D);
    }

    @igg({"MissingPermission"})
    public static void printBleGattServices(Context context, BluetoothDevice device, BluetoothGatt gatt, int status) {
        if (device == null || gatt == null || !checkHasConnectPermission(context) || !dh8.isIsLog()) {
            return;
        }
        dh8.m9151d("ble", String.format(Locale.getDefault(), "[[============================Bluetooth[%s], Discovery Services status[%d]=================================]]\n", v91.printBtDeviceInfo(context, device), Integer.valueOf(status)));
        List<BluetoothGattService> services = gatt.getServices();
        if (services != null) {
            dh8.m9151d("ble", "[[======Service Size:" + services.size() + "======================\n");
            for (BluetoothGattService bluetoothGattService : services) {
                if (bluetoothGattService != null) {
                    dh8.m9151d("ble", "[[======Service:" + bluetoothGattService.getUuid() + "======================\n");
                    List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
                    if (characteristics != null) {
                        dh8.m9151d("ble", "[[[[=============characteristics Size:" + characteristics.size() + "======================\n");
                        for (BluetoothGattCharacteristic bluetoothGattCharacteristic : characteristics) {
                            if (bluetoothGattCharacteristic != null) {
                                dh8.m9151d("ble", "[[[[=============characteristic:" + bluetoothGattCharacteristic.getUuid() + ",write type : " + bluetoothGattCharacteristic.getWriteType() + "======================\n");
                                List<BluetoothGattDescriptor> descriptors = bluetoothGattCharacteristic.getDescriptors();
                                if (descriptors != null) {
                                    dh8.m9151d("ble", "[[[[[[=============descriptors Size:" + descriptors.size() + "======================\n");
                                    for (BluetoothGattDescriptor bluetoothGattDescriptor : descriptors) {
                                        if (bluetoothGattDescriptor != null) {
                                            dh8.m9151d("ble", "[[[[[[=============descriptor:" + bluetoothGattDescriptor.getUuid() + ",permission:" + bluetoothGattDescriptor.getPermissions() + "\nvalue : " + pk1.byte2HexStr(bluetoothGattDescriptor.getValue()) + "======================\n");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        dh8.m9151d("ble", "[[============================Bluetooth[" + v91.printBtDeviceInfo(context, device) + "] Services show End=================================]]\n");
    }

    public static String printBtDeviceInfo(BluetoothDevice device) {
        return v91.printBtDeviceInfo(BaseApplication.getInstance(), device);
    }

    @igg({"MissingPermission"})
    public static boolean refreshBleDeviceCache(Context context, BluetoothGatt bluetoothGatt) {
        if (bluetoothGatt != null && checkHasConnectPermission(context)) {
            try {
                return bluetoothGatt.getClass().getMethod("refresh", null).invoke(bluetoothGatt, null) == Boolean.TRUE;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

    public static int isFastContinuousClick(long interval) {
        long time = new Date().getTime();
        if (time - lastClickTime <= interval) {
            clickCount++;
        } else {
            clickCount = 1;
        }
        lastClickTime = time;
        return clickCount;
    }

    public static boolean isFastDoubleClick(long interval) {
        long time = new Date().getTime();
        boolean z = time - lastClickTime <= interval;
        lastClickTime = time;
        return z;
    }

    public static boolean isFastContinuousClick(long interval, int times) {
        long time = new Date().getTime();
        if (time - theLastClickTime <= interval) {
            theClickCount++;
        } else {
            theClickCount = 1;
        }
        theLastClickTime = time;
        boolean z = theClickCount == times;
        if (z) {
            theLastClickTime = 0L;
            theClickCount = 0;
        }
        return z;
    }
}
