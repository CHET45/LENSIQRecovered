package p000;

import android.bluetooth.BluetoothManager;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class h91 implements jo5<g91> {

    /* JADX INFO: renamed from: a */
    public final hid<BluetoothManager> f42940a;

    public h91(hid<BluetoothManager> hidVar) {
        this.f42940a = hidVar;
    }

    public static h91 create(hid<BluetoothManager> hidVar) {
        return new h91(hidVar);
    }

    public static g91 newInstance(BluetoothManager bluetoothManager) {
        return new g91(bluetoothManager);
    }

    @Override // p000.hid
    public g91 get() {
        return newInstance(this.f42940a.get());
    }
}
