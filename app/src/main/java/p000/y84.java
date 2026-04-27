package p000;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd({"bleshadow.javax.inject.Named"})
@zqe
public final class y84 implements jo5<BluetoothDevice> {

    /* JADX INFO: renamed from: a */
    public final hid<String> f100744a;

    /* JADX INFO: renamed from: b */
    public final hid<hee> f100745b;

    public y84(hid<String> hidVar, hid<hee> hidVar2) {
        this.f100744a = hidVar;
        this.f100745b = hidVar2;
    }

    public static y84 create(hid<String> hidVar, hid<hee> hidVar2) {
        return new y84(hidVar, hidVar2);
    }

    public static BluetoothDevice provideBluetoothDevice(String str, hee heeVar) {
        return (BluetoothDevice) s7d.checkNotNullFromProvides(x84.m25035c(str, heeVar));
    }

    @Override // p000.hid
    public BluetoothDevice get() {
        return provideBluetoothDevice(this.f100744a.get(), this.f100745b.get());
    }
}
