package p000;

import android.bluetooth.BluetoothDevice;
import p000.uee;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe("com.polidea.rxandroidble3.internal.DeviceScope")
public final class cfe implements jo5<bfe> {

    /* JADX INFO: renamed from: a */
    public final hid<BluetoothDevice> f16424a;

    /* JADX INFO: renamed from: b */
    public final hid<at2> f16425b;

    /* JADX INFO: renamed from: c */
    public final hid<q01<uee.EnumC13520d>> f16426c;

    /* JADX INFO: renamed from: d */
    public final hid<jy1> f16427d;

    public cfe(hid<BluetoothDevice> hidVar, hid<at2> hidVar2, hid<q01<uee.EnumC13520d>> hidVar3, hid<jy1> hidVar4) {
        this.f16424a = hidVar;
        this.f16425b = hidVar2;
        this.f16426c = hidVar3;
        this.f16427d = hidVar4;
    }

    public static cfe create(hid<BluetoothDevice> hidVar, hid<at2> hidVar2, hid<q01<uee.EnumC13520d>> hidVar3, hid<jy1> hidVar4) {
        return new cfe(hidVar, hidVar2, hidVar3, hidVar4);
    }

    public static bfe newInstance(BluetoothDevice bluetoothDevice, at2 at2Var, q01<uee.EnumC13520d> q01Var, jy1 jy1Var) {
        return new bfe(bluetoothDevice, at2Var, q01Var, jy1Var);
    }

    @Override // p000.hid
    public bfe get() {
        return newInstance(this.f16424a.get(), this.f16425b.get(), this.f16426c.get(), this.f16427d.get());
    }
}
