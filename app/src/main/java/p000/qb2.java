package p000;

import android.bluetooth.BluetoothDevice;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class qb2 {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, ob2> f73799a = new HashMap<>();

    public static String getCacheCommandKey(BluetoothDevice bluetoothDevice, int i, int i2) {
        return getCacheCommandKey(bluetoothDevice == null ? "00:00:00:00:00:00" : bluetoothDevice.getAddress(), i, i2);
    }

    public ob2 getCommand(BluetoothDevice bluetoothDevice, int i, int i2) {
        return this.f73799a.get(getCacheCommandKey(bluetoothDevice, i, i2));
    }

    public void putCommandBase(BluetoothDevice bluetoothDevice, ob2 ob2Var) {
        if (ob2Var != null) {
            if (ob2Var.getType() == 2 || ob2Var.getType() == 3) {
                this.f73799a.put(getCacheCommandKey(bluetoothDevice, ob2Var.getId(), ob2Var.getOpCodeSn()), ob2Var);
            }
        }
    }

    public void release() {
        this.f73799a.clear();
    }

    public void removeCommandBase(BluetoothDevice bluetoothDevice, xs0 xs0Var) {
        if (xs0Var != null) {
            removeCommandBase(bluetoothDevice, xs0Var.getOpCode(), xs0Var.getOpCodeSn());
        }
    }

    public void removeCommandBase(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.f73799a.remove(getCacheCommandKey(bluetoothDevice, i, i2));
    }

    public static String getCacheCommandKey(String str, int i, int i2) {
        return kc2.formatString("%s-%s-%s", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
