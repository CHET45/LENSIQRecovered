package p000;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe("com.polidea.rxandroidble3.internal.connection.ConnectionScope")
public final class wgb implements jo5<vgb> {

    /* JADX INFO: renamed from: a */
    public final hid<byte[]> f94204a;

    /* JADX INFO: renamed from: b */
    public final hid<byte[]> f94205b;

    /* JADX INFO: renamed from: c */
    public final hid<byte[]> f94206c;

    /* JADX INFO: renamed from: d */
    public final hid<BluetoothGatt> f94207d;

    /* JADX INFO: renamed from: e */
    public final hid<gfe> f94208e;

    /* JADX INFO: renamed from: f */
    public final hid<r74> f94209f;

    public wgb(hid<byte[]> hidVar, hid<byte[]> hidVar2, hid<byte[]> hidVar3, hid<BluetoothGatt> hidVar4, hid<gfe> hidVar5, hid<r74> hidVar6) {
        this.f94204a = hidVar;
        this.f94205b = hidVar2;
        this.f94206c = hidVar3;
        this.f94207d = hidVar4;
        this.f94208e = hidVar5;
        this.f94209f = hidVar6;
    }

    public static wgb create(hid<byte[]> hidVar, hid<byte[]> hidVar2, hid<byte[]> hidVar3, hid<BluetoothGatt> hidVar4, hid<gfe> hidVar5, hid<r74> hidVar6) {
        return new wgb(hidVar, hidVar2, hidVar3, hidVar4, hidVar5, hidVar6);
    }

    public static vgb newInstance(byte[] bArr, byte[] bArr2, byte[] bArr3, BluetoothGatt bluetoothGatt, gfe gfeVar, Object obj) {
        return new vgb(bArr, bArr2, bArr3, bluetoothGatt, gfeVar, (r74) obj);
    }

    @Override // p000.hid
    public vgb get() {
        return newInstance(this.f94204a.get(), this.f94205b.get(), this.f94206c.get(), this.f94207d.get(), this.f94208e.get(), this.f94209f.get());
    }
}
