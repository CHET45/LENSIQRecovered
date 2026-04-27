package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import p000.pj9;

/* JADX INFO: loaded from: classes6.dex */
public class q74 extends ynf<byte[]> {

    /* JADX INFO: renamed from: e */
    public final BluetoothGattDescriptor f73371e;

    /* JADX INFO: renamed from: f */
    public final byte[] f73372f;

    /* JADX INFO: renamed from: m */
    public final int f73373m;

    public q74(gfe gfeVar, BluetoothGatt bluetoothGatt, @w8b("operation-timeout") y1h y1hVar, int i, BluetoothGattDescriptor bluetoothGattDescriptor, byte[] bArr) {
        super(bluetoothGatt, gfeVar, i51.f45766i, y1hVar);
        this.f73373m = i;
        this.f73371e = bluetoothGattDescriptor;
        this.f73372f = bArr;
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<byte[]> mo11830c(gfe gfeVar) {
        return gfeVar.getOnDescriptorWrite().filter(ri1.descriptorPredicate(this.f73371e)).firstOrError().map(ri1.getBytesFromAssociation());
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        this.f73371e.setValue(this.f73372f);
        BluetoothGattCharacteristic characteristic = this.f73371e.getCharacteristic();
        int writeType = characteristic.getWriteType();
        characteristic.setWriteType(this.f73373m);
        boolean zWriteDescriptor = bluetoothGatt.writeDescriptor(this.f73371e);
        characteristic.setWriteType(writeType);
        return zWriteDescriptor;
    }

    @Override // p000.ynf
    public String toString() {
        return "DescriptorWriteOperation{" + super.toString() + ", descriptor=" + new pj9.C10988a(this.f73371e.getUuid(), this.f73372f, true) + '}';
    }
}
