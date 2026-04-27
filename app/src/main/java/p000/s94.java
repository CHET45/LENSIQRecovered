package p000;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class s94 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, r94> f80975a = new HashMap<>();

    public void clear() {
        this.f80975a.clear();
    }

    public String getDevMD5(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.getDevMD5();
        }
        return null;
    }

    public int getDeviceConnectStatus(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.getStatus();
        }
        return 0;
    }

    public cng getDeviceInfo(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.getTargetInfo();
        }
        return null;
    }

    public r94 getDeviceStatus(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return getDeviceStatus(bluetoothDevice.getAddress());
    }

    public int getMaxCommunicationMtu(BluetoothDevice bluetoothDevice) {
        cng deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null || deviceInfo.getCommunicationMtu() <= 0) {
            return 530;
        }
        return deviceInfo.getCommunicationMtu();
    }

    public int getMaxReceiveMtu(BluetoothDevice bluetoothDevice) {
        cng deviceInfo = getDeviceInfo(bluetoothDevice);
        if (deviceInfo == null || deviceInfo.getReceiveMtu() <= 0) {
            return 530;
        }
        return deviceInfo.getReceiveMtu();
    }

    public boolean isAuthBtDevice(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.isAuthDevice();
        }
        return false;
    }

    public boolean isDoubleBackupUpgrade(BluetoothDevice bluetoothDevice) {
        cng deviceInfo = getDeviceInfo(bluetoothDevice);
        return deviceInfo != null && deviceInfo.isSupportDoubleBackup();
    }

    public boolean isEnterLowPowerMode(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.isEnterLowPowerMode();
        }
        return false;
    }

    public boolean isMandatoryUpgrade(BluetoothDevice bluetoothDevice) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus != null) {
            return deviceStatus.isMandatoryUpgrade();
        }
        return false;
    }

    public r94 removeDeviceStatus(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null) {
            return null;
        }
        return removeDeviceStatus(bluetoothDevice.getAddress());
    }

    public void updateDeviceConnectStatus(BluetoothDevice bluetoothDevice, int i) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus == null) {
            deviceStatus = new r94();
        }
        deviceStatus.setStatus(i);
        updateDeviceStatus(bluetoothDevice, deviceStatus);
    }

    public void updateDeviceIsAuth(BluetoothDevice bluetoothDevice, boolean z) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus == null) {
            deviceStatus = new r94();
        }
        deviceStatus.setAuthDevice(z);
        updateDeviceStatus(bluetoothDevice, deviceStatus);
    }

    public void updateDeviceIsEnterLowPowerMode(BluetoothDevice bluetoothDevice, boolean z) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus == null) {
            deviceStatus = new r94();
        }
        deviceStatus.setEnterLowPowerMode(z);
        updateDeviceStatus(bluetoothDevice, deviceStatus);
    }

    public void updateDeviceMD5(BluetoothDevice bluetoothDevice, String str) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        if (deviceStatus == null) {
            deviceStatus = new r94();
        }
        deviceStatus.setDevMD5(str);
        updateDeviceStatus(bluetoothDevice, deviceStatus);
    }

    public void updateDeviceMaxCommunicationMtu(BluetoothDevice bluetoothDevice, int i) {
        cng deviceInfo;
        if (i > 0 && (deviceInfo = getDeviceInfo(bluetoothDevice)) != null) {
            deviceInfo.setCommunicationMtu(i);
            updateDeviceTargetInfo(bluetoothDevice, deviceInfo);
        }
    }

    public void updateDeviceMaxReceiveMtu(BluetoothDevice bluetoothDevice, int i) {
        cng deviceInfo;
        if (i > 0 && (deviceInfo = getDeviceInfo(bluetoothDevice)) != null) {
            deviceInfo.setReceiveMtu(i);
            updateDeviceTargetInfo(bluetoothDevice, deviceInfo);
        }
    }

    public void updateDeviceStatus(BluetoothDevice bluetoothDevice, r94 r94Var) {
        if (bluetoothDevice != null) {
            updateDeviceStatus(bluetoothDevice.getAddress(), r94Var);
        }
    }

    public void updateDeviceTargetInfo(BluetoothDevice bluetoothDevice, cng cngVar) {
        r94 deviceStatus = getDeviceStatus(bluetoothDevice);
        boolean z = cngVar != null && cngVar.isMandatoryUpgrade();
        if (deviceStatus == null) {
            deviceStatus = new r94();
        }
        deviceStatus.setTargetInfo(cngVar);
        deviceStatus.setMandatoryUpgrade(z);
        updateDeviceStatus(bluetoothDevice, deviceStatus);
    }

    public r94 getDeviceStatus(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f80975a.get(str);
    }

    public r94 removeDeviceStatus(String str) {
        if (BluetoothAdapter.checkBluetoothAddress(str)) {
            return this.f80975a.remove(str);
        }
        return null;
    }

    public void updateDeviceStatus(String str, r94 r94Var) {
        if (!BluetoothAdapter.checkBluetoothAddress(str) || r94Var == null) {
            return;
        }
        this.f80975a.put(str, r94Var);
    }
}
