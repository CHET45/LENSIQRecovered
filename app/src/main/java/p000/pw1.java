package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes6.dex */
public class pw1 extends ynf<byte[]> {

    /* JADX INFO: renamed from: e */
    public final BluetoothGattCharacteristic f72251e;

    public pw1(gfe gfeVar, BluetoothGatt bluetoothGatt, @w8b("operation-timeout") y1h y1hVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(bluetoothGatt, gfeVar, i51.f45761d, y1hVar);
        this.f72251e = bluetoothGattCharacteristic;
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<byte[]> mo11830c(gfe gfeVar) {
        return gfeVar.getOnCharacteristicRead().filter(ri1.characteristicUUIDPredicate(this.f72251e.getUuid())).firstOrError().map(ri1.getBytesFromAssociation());
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readCharacteristic(this.f72251e);
    }

    @Override // p000.ynf
    public String toString() {
        return "CharacteristicReadOperation{" + super.toString() + ", characteristic=" + pj9.wrap(this.f72251e, false) + '}';
    }
}
