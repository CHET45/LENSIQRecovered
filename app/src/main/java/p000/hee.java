package p000;

import android.app.PendingIntent;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanSettings;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class hee {

    /* JADX INFO: renamed from: b */
    public static c51 f43326b = new c51("bluetoothAdapter is null");

    /* JADX INFO: renamed from: a */
    public final BluetoothAdapter f43327a;

    @b28
    public hee(@hib BluetoothAdapter bluetoothAdapter) {
        this.f43327a = bluetoothAdapter;
    }

    public Set<BluetoothDevice> getBondedDevices() {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBondedDevices();
        }
        throw f43326b;
    }

    public BluetoothDevice getRemoteDevice(String str) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getRemoteDevice(str);
        }
        throw f43326b;
    }

    public boolean hasBluetoothAdapter() {
        return this.f43327a != null;
    }

    public boolean isBluetoothEnabled() {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        return bluetoothAdapter != null && bluetoothAdapter.isEnabled();
    }

    @omg(21)
    public void startLeScan(List<ScanFilter> list, ScanSettings scanSettings, ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter == null) {
            throw f43326b;
        }
        bluetoothAdapter.getBluetoothLeScanner().startScan(list, scanSettings, scanCallback);
    }

    public boolean startLegacyLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(leScanCallback);
        }
        throw f43326b;
    }

    @c5e(26)
    public void stopLeScan(PendingIntent pendingIntent) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter == null) {
            throw f43326b;
        }
        bluetoothAdapter.getBluetoothLeScanner().stopScan(pendingIntent);
    }

    public void stopLegacyLeScan(BluetoothAdapter.LeScanCallback leScanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter == null) {
            throw f43326b;
        }
        bluetoothAdapter.stopLeScan(leScanCallback);
    }

    @c5e(26)
    public int startLeScan(List<ScanFilter> list, ScanSettings scanSettings, PendingIntent pendingIntent) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getBluetoothLeScanner().startScan(list, scanSettings, pendingIntent);
        }
        throw f43326b;
    }

    @omg(21)
    public void stopLeScan(ScanCallback scanCallback) {
        BluetoothAdapter bluetoothAdapter = this.f43327a;
        if (bluetoothAdapter != null) {
            if (!bluetoothAdapter.isEnabled()) {
                kfe.m14728v("BluetoothAdapter is disabled, calling BluetoothLeScanner.stopScan(ScanCallback) may cause IllegalStateException", new Object[0]);
                return;
            }
            BluetoothLeScanner bluetoothLeScanner = this.f43327a.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                kfe.m14730w("Cannot call BluetoothLeScanner.stopScan(ScanCallback) on 'null' reference; BluetoothAdapter.isEnabled() == %b", Boolean.valueOf(this.f43327a.isEnabled()));
                return;
            } else {
                bluetoothLeScanner.stopScan(scanCallback);
                return;
            }
        }
        throw f43326b;
    }
}
