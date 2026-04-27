package p000;

import android.bluetooth.BluetoothAdapter;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class iee implements jo5<hee> {

    /* JADX INFO: renamed from: a */
    public final hid<BluetoothAdapter> f46701a;

    public iee(hid<BluetoothAdapter> hidVar) {
        this.f46701a = hidVar;
    }

    public static iee create(hid<BluetoothAdapter> hidVar) {
        return new iee(hidVar);
    }

    public static hee newInstance(BluetoothAdapter bluetoothAdapter) {
        return new hee(bluetoothAdapter);
    }

    @Override // p000.hid
    public hee get() {
        return newInstance(this.f46701a.get());
    }
}
