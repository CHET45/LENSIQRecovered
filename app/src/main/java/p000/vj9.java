package p000;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes6.dex */
public class vj9 extends is7 {
    @b28
    public vj9(js7 js7Var) {
        super(js7Var);
    }

    @Override // p000.is7
    public j51 handleMismatchData(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i) {
        kfe.m14730w(this.f48122a.createMismatchMessage(bluetoothGattCharacteristic, i), new Object[0]);
        return null;
    }
}
