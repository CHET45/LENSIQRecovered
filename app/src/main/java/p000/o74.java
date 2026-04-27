package p000;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattDescriptor;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class o74 implements jo5<n74> {

    /* JADX INFO: renamed from: a */
    public final hid<gfe> f66592a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f66593b;

    /* JADX INFO: renamed from: c */
    public final hid<y1h> f66594c;

    /* JADX INFO: renamed from: d */
    public final hid<BluetoothGattDescriptor> f66595d;

    public o74(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<BluetoothGattDescriptor> hidVar4) {
        this.f66592a = hidVar;
        this.f66593b = hidVar2;
        this.f66594c = hidVar3;
        this.f66595d = hidVar4;
    }

    public static o74 create(hid<gfe> hidVar, hid<BluetoothGatt> hidVar2, hid<y1h> hidVar3, hid<BluetoothGattDescriptor> hidVar4) {
        return new o74(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static n74 newInstance(gfe gfeVar, BluetoothGatt bluetoothGatt, y1h y1hVar, BluetoothGattDescriptor bluetoothGattDescriptor) {
        return new n74(gfeVar, bluetoothGatt, y1hVar, bluetoothGattDescriptor);
    }

    @Override // p000.hid
    public n74 get() {
        return newInstance(this.f66592a.get(), this.f66593b.get(), this.f66594c.get(), this.f66595d.get());
    }
}
