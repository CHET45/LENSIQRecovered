package p000;

import android.bluetooth.BluetoothGatt;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
@is2
public class c91 {

    /* JADX INFO: renamed from: a */
    public final AtomicReference<BluetoothGatt> f16002a = new AtomicReference<>();

    @b28
    public c91() {
    }

    public BluetoothGatt getBluetoothGatt() {
        return this.f16002a.get();
    }

    public void updateBluetoothGatt(@efb BluetoothGatt bluetoothGatt) {
        v7b.m23844a(this.f16002a, null, bluetoothGatt);
    }
}
