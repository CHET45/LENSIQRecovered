package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import p000.pj9;

/* JADX INFO: loaded from: classes6.dex */
public class qw1 extends ynf<byte[]> {

    /* JADX INFO: renamed from: e */
    public final BluetoothGattCharacteristic f75967e;

    /* JADX INFO: renamed from: f */
    public final byte[] f75968f;

    public qw1(gfe gfeVar, BluetoothGatt bluetoothGatt, @w8b("operation-timeout") y1h y1hVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        super(bluetoothGatt, gfeVar, i51.f45762e, y1hVar);
        this.f75967e = bluetoothGattCharacteristic;
        this.f75968f = bArr;
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<byte[]> mo11830c(gfe gfeVar) {
        return gfeVar.getOnCharacteristicWrite().filter(ri1.characteristicUUIDPredicate(this.f75967e.getUuid())).firstOrError().map(ri1.getBytesFromAssociation());
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        this.f75967e.setValue(this.f75968f);
        return bluetoothGatt.writeCharacteristic(this.f75967e);
    }

    @Override // p000.ynf
    public String toString() {
        return "CharacteristicWriteOperation{" + super.toString() + ", characteristic=" + new pj9.C10988a(this.f75967e.getUuid(), this.f75968f, true) + '}';
    }
}
