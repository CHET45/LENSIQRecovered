package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes6.dex */
public class n74 extends ynf<qi1<BluetoothGattDescriptor>> {

    /* JADX INFO: renamed from: e */
    public final BluetoothGattDescriptor f63434e;

    @b28
    public n74(gfe gfeVar, BluetoothGatt bluetoothGatt, @w8b("operation-timeout") y1h y1hVar, BluetoothGattDescriptor bluetoothGattDescriptor) {
        super(bluetoothGatt, gfeVar, i51.f45765h, y1hVar);
        this.f63434e = bluetoothGattDescriptor;
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: c */
    public kjf<qi1<BluetoothGattDescriptor>> mo11830c(gfe gfeVar) {
        return gfeVar.getOnDescriptorRead().filter(ri1.descriptorPredicate(this.f63434e)).firstOrError();
    }

    @Override // p000.ynf
    /* JADX INFO: renamed from: d */
    public boolean mo11831d(BluetoothGatt bluetoothGatt) {
        return bluetoothGatt.readDescriptor(this.f63434e);
    }

    @Override // p000.ynf
    public String toString() {
        return "DescriptorReadOperation{" + super.toString() + ", descriptor=" + pj9.wrap(this.f63434e, false) + '}';
    }
}
