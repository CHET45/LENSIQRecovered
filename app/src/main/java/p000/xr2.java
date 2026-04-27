package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class xr2 implements jo5<BluetoothGatt> {

    /* JADX INFO: renamed from: a */
    public final hid<c91> f99014a;

    public xr2(hid<c91> hidVar) {
        this.f99014a = hidVar;
    }

    public static xr2 create(hid<c91> hidVar) {
        return new xr2(hidVar);
    }

    public static BluetoothGatt provideBluetoothGatt(c91 c91Var) {
        return (BluetoothGatt) s7d.checkNotNullFromProvides(ur2.m23514m(c91Var));
    }

    @Override // p000.hid
    public BluetoothGatt get() {
        return provideBluetoothGatt(this.f99014a.get());
    }
}
