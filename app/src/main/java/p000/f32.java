package p000;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import p000.a32;

/* JADX INFO: loaded from: classes6.dex */
@ue3
@wkd
@zqe
public final class f32 implements jo5<BluetoothManager> {

    /* JADX INFO: renamed from: a */
    public final hid<Context> f34944a;

    public f32(hid<Context> hidVar) {
        this.f34944a = hidVar;
    }

    public static f32 create(hid<Context> hidVar) {
        return new f32(hidVar);
    }

    public static BluetoothManager provideBluetoothManager(Context context) {
        return (BluetoothManager) s7d.checkNotNullFromProvides(a32.AbstractC0031d.m98j(context));
    }

    @Override // p000.hid
    public BluetoothManager get() {
        return provideBluetoothManager(this.f34944a.get());
    }
}
