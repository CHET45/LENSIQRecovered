package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes6.dex */
public class ezg extends is7 {
    @b28
    public ezg(js7 js7Var) {
        super(js7Var);
    }

    @Override // p000.is7
    public j51 handleMismatchData(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        return new j51(this.f48122a.createMismatchMessage(bluetoothGattCharacteristic, i), bluetoothGattCharacteristic.getUuid(), bluetoothGattCharacteristic.getProperties(), i);
    }
}
