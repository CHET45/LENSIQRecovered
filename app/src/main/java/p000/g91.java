package p000;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class g91 {

    /* JADX INFO: renamed from: a */
    public final BluetoothManager f39027a;

    @b28
    public g91(BluetoothManager bluetoothManager) {
        this.f39027a = bluetoothManager;
    }

    public List<BluetoothDevice> getConnectedPeripherals() {
        return this.f39027a.getConnectedDevices(8);
    }
}
