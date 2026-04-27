package p000;

import android.bluetooth.BluetoothDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* JADX INFO: loaded from: classes6.dex */
public class esf implements sp7 {

    /* JADX INFO: renamed from: b */
    public final Map<String, Integer> f33981b = new HashMap();

    /* JADX INFO: renamed from: a */
    public int f33980a = (new Random().nextInt(255) + 1) % 256;

    public synchronized int autoIncSN(BluetoothDevice bluetoothDevice) {
        int cmdSequence = getCmdSequence(bluetoothDevice);
        if (bluetoothDevice == null) {
            int i = cmdSequence + 1;
            this.f33980a = i < 256 ? i : 0;
            return cmdSequence;
        }
        int i2 = cmdSequence + 1;
        if (i2 < 256) {
            i = i2;
        }
        this.f33981b.put(bluetoothDevice.getAddress(), Integer.valueOf(i));
        return cmdSequence;
    }

    public void destroy() {
        this.f33981b.clear();
    }

    public int getCmdSequence(BluetoothDevice bluetoothDevice) {
        Integer num;
        if (bluetoothDevice != null && (num = this.f33981b.get(bluetoothDevice.getAddress())) != null) {
            return num.intValue();
        }
        return this.f33980a;
    }

    @Override // p000.sp7
    public int getRcspCmdSeq(BluetoothDevice bluetoothDevice) {
        return autoIncSN(bluetoothDevice);
    }

    public void removeCmdSequence(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice == null || this.f33981b.isEmpty()) {
            return;
        }
        this.f33981b.remove(bluetoothDevice.getAddress());
    }
}
