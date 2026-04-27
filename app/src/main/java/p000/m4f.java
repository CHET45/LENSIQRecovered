package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class m4f implements jo5<l4f> {

    /* JADX INFO: renamed from: a */
    public final hid<bs2> f59889a;

    /* JADX INFO: renamed from: b */
    public final hid<BluetoothGatt> f59890b;

    /* JADX INFO: renamed from: c */
    public final hid<m6c> f59891c;

    public m4f(hid<bs2> hidVar, hid<BluetoothGatt> hidVar2, hid<m6c> hidVar3) {
        this.f59889a = hidVar;
        this.f59890b = hidVar2;
        this.f59891c = hidVar3;
    }

    public static m4f create(hid<bs2> hidVar, hid<BluetoothGatt> hidVar2, hid<m6c> hidVar3) {
        return new m4f(hidVar, hidVar2, hidVar3);
    }

    public static l4f newInstance(bs2 bs2Var, BluetoothGatt bluetoothGatt, m6c m6cVar) {
        return new l4f(bs2Var, bluetoothGatt, m6cVar);
    }

    @Override // p000.hid
    public l4f get() {
        return newInstance(this.f59889a.get(), this.f59890b.get(), this.f59891c.get());
    }
}
